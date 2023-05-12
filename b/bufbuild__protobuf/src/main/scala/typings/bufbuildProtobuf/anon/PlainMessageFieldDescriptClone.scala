package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoLabel
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptions
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.FieldDescriptorProto> */
trait PlainMessageFieldDescriptClone extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageFieldDescriptClone: PlainField[js.Function0[this.type]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessageFieldDescriClone], Any]]
  
  var defaultValue: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  @JSName("equals")
  var equals_FPlainMessageFieldDescriptClone: PlainField[
    js.Function1[/* other */ js.UndefOr[this.type | PlainMessage[this.type] | Null], Boolean]
  ]
  
  var extendee: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      this.type
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* jsonValue */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      this.type
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions], this.type]
  ]
  
  var getType: PlainField[js.Function0[MessageType[this.type]]]
  
  var jsonName: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var label: js.UndefOr[PlainField[js.UndefOr[FieldDescriptorProtoLabel]]] = js.undefined
  
  var name: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var number: js.UndefOr[PlainField[js.UndefOr[Double]]] = js.undefined
  
  var oneofIndex: js.UndefOr[PlainField[js.UndefOr[Double]]] = js.undefined
  
  var options: js.UndefOr[PlainField[js.UndefOr[FieldOptions]]] = js.undefined
  
  var proto3Optional: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var `type`: js.UndefOr[PlainField[js.UndefOr[FieldDescriptorProtoType]]] = js.undefined
  
  var typeName: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
}
object PlainMessageFieldDescriptClone {
  
  inline def apply(
    clone_ : () => PlainMessageFieldDescriptClone,
    constructor: /* data */ js.UndefOr[PartialMessageFieldDescriClone] => Any,
    equals_ : /* other */ js.UndefOr[
      PlainMessageFieldDescriptClone | PlainMessage[PlainMessageFieldDescriptClone] | Null
    ] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageFieldDescriptClone,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageFieldDescriptClone,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageFieldDescriptClone,
    getType: () => MessageType[PlainMessageFieldDescriptClone],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String
  ): PlainMessageFieldDescriptClone = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString))
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageFieldDescriptClone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageFieldDescriptClone] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => PlainMessageFieldDescriptClone): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessageFieldDescriClone] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setDefaultValue(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[
          PlainMessageFieldDescriptClone | PlainMessage[PlainMessageFieldDescriptClone] | Null
        ] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setExtendee(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "extendee", value.asInstanceOf[js.Any])
    
    inline def setExtendeeUndefined: Self = StObject.set(x, "extendee", js.undefined)
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageFieldDescriptClone
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageFieldDescriptClone
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageFieldDescriptClone
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[PlainMessageFieldDescriptClone]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setJsonName(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setLabel(value: PlainField[js.UndefOr[FieldDescriptorProtoLabel]]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: PlainField[js.UndefOr[Double]]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOneofIndex(value: PlainField[js.UndefOr[Double]]): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
    
    inline def setOneofIndexUndefined: Self = StObject.set(x, "oneofIndex", js.undefined)
    
    inline def setOptions(value: PlainField[js.UndefOr[FieldOptions]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProto3Optional(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "proto3Optional", value.asInstanceOf[js.Any])
    
    inline def setProto3OptionalUndefined: Self = StObject.set(x, "proto3Optional", js.undefined)
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setType(value: PlainField[js.UndefOr[FieldDescriptorProtoType]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
