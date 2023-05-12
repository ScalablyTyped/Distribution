package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoLabel
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProtoType
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptions
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialField
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.FieldDescriptorProto> */
trait PartialMessageFieldDescriConstructor extends StObject {
  
  @JSName("clone")
  var clone_FPartialMessageFieldDescriConstructor: js.UndefOr[PartialField[js.Function0[FieldDescriptorProto]]] = js.undefined
  
  var constructor: js.UndefOr[
    PartialField[js.Function1[/* data */ js.UndefOr[PartialMessage[FieldDescriptorProto]], Any]]
  ] = js.undefined
  
  var defaultValue: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  @JSName("equals")
  var equals_FPartialMessageFieldDescriConstructor: js.UndefOr[
    PartialField[
      js.Function1[
        /* other */ js.UndefOr[FieldDescriptorProto | PlainMessageFieldDescriptConstructor | Null], 
        Boolean
      ]
    ]
  ] = js.undefined
  
  var extendee: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var fields: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var fromBinary: js.UndefOr[
    PartialField[
      js.Function2[
        /* bytes */ js.typedarray.Uint8Array, 
        /* options */ js.UndefOr[PartialBinaryReadOptions], 
        typings.bufbuildProtobuf.mod.FieldDescriptorProto
      ]
    ]
  ] = js.undefined
  
  var fromJson: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonValue */ JsonValue, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.mod.FieldDescriptorProto
      ]
    ]
  ] = js.undefined
  
  var fromJsonString: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonString */ String, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.mod.FieldDescriptorProto
      ]
    ]
  ] = js.undefined
  
  var getType: js.UndefOr[PartialField[js.Function0[MessageType[FieldDescriptorProto]]]] = js.undefined
  
  var jsonName: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var label: js.UndefOr[PartialField[js.UndefOr[FieldDescriptorProtoLabel]]] = js.undefined
  
  var name: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var number: js.UndefOr[PartialField[js.UndefOr[Double]]] = js.undefined
  
  var oneofIndex: js.UndefOr[PartialField[js.UndefOr[Double]]] = js.undefined
  
  var options: js.UndefOr[PartialField[js.UndefOr[FieldOptions]]] = js.undefined
  
  var proto3Optional: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var runtime: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var toBinary: js.UndefOr[
    PartialField[
      js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
    ]
  ] = js.undefined
  
  var toJSON: js.UndefOr[PartialField[js.Function0[JsonValue]]] = js.undefined
  
  var toJson: js.UndefOr[
    PartialField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  ] = js.undefined
  
  var toJsonString: js.UndefOr[
    PartialField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  ] = js.undefined
  
  var `type`: js.UndefOr[PartialField[js.UndefOr[FieldDescriptorProtoType]]] = js.undefined
  
  var typeName: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
}
object PartialMessageFieldDescriConstructor {
  
  inline def apply(): PartialMessageFieldDescriConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageFieldDescriConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessageFieldDescriConstructor] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => FieldDescriptorProto): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[FieldDescriptorProto]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setDefaultValue(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[FieldDescriptorProto | PlainMessageFieldDescriptConstructor | Null] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setExtendee(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "extendee", value.asInstanceOf[js.Any])
    
    inline def setExtendeeUndefined: Self = StObject.set(x, "extendee", js.undefined)
    
    inline def setFields(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.FieldDescriptorProto
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromBinaryUndefined: Self = StObject.set(x, "fromBinary", js.undefined)
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.FieldDescriptorProto
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.FieldDescriptorProto
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setFromJsonStringUndefined: Self = StObject.set(x, "fromJsonString", js.undefined)
    
    inline def setFromJsonUndefined: Self = StObject.set(x, "fromJson", js.undefined)
    
    inline def setGetType(value: () => MessageType[FieldDescriptorProto]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setJsonName(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setLabel(value: PartialField[js.UndefOr[FieldDescriptorProtoLabel]]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: PartialField[js.UndefOr[Double]]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOneofIndex(value: PartialField[js.UndefOr[Double]]): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
    
    inline def setOneofIndexUndefined: Self = StObject.set(x, "oneofIndex", js.undefined)
    
    inline def setOptions(value: PartialField[js.UndefOr[FieldOptions]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProto3Optional(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "proto3Optional", value.asInstanceOf[js.Any])
    
    inline def setProto3OptionalUndefined: Self = StObject.set(x, "proto3Optional", js.undefined)
    
    inline def setRuntime(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToBinaryUndefined: Self = StObject.set(x, "toBinary", js.undefined)
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setToJsonStringUndefined: Self = StObject.set(x, "toJsonString", js.undefined)
    
    inline def setType(value: PartialField[js.UndefOr[FieldDescriptorProtoType]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
