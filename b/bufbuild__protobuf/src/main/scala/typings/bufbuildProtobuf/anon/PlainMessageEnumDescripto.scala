package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumDescriptorProtoEnumReservedRange
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumOptions
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumValueDescriptorProto
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.EnumDescriptorProto> */
trait PlainMessageEnumDescripto extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageEnumDescripto: PlainField[js.Function0[EnumDescriptorProto]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessage[EnumDescriptorProto]], Any]]
  
  @JSName("equals")
  var equals_FPlainMessageEnumDescripto: PlainField[
    js.Function1[
      /* other */ js.UndefOr[EnumDescriptorProto | PlainMessage[EnumDescriptorProto] | Null], 
      Boolean
    ]
  ]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      EnumDescriptorProto
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* jsonValue */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      EnumDescriptorProto
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[
      /* jsonString */ String, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      EnumDescriptorProto
    ]
  ]
  
  var getType: PlainField[js.Function0[MessageType[EnumDescriptorProto]]]
  
  var name: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var options: js.UndefOr[PlainField[js.UndefOr[EnumOptions]]] = js.undefined
  
  var reservedName: PlainField[js.Array[String]]
  
  var reservedRange: PlainField[js.Array[EnumDescriptorProtoEnumReservedRange]]
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
  
  var value: PlainField[js.Array[EnumValueDescriptorProto]]
}
object PlainMessageEnumDescripto {
  
  inline def apply(
    clone_ : () => EnumDescriptorProto,
    constructor: /* data */ js.UndefOr[PartialMessage[EnumDescriptorProto]] => Any,
    equals_ : /* other */ js.UndefOr[EnumDescriptorProto | PlainMessage[EnumDescriptorProto] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => EnumDescriptorProto,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => EnumDescriptorProto,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => EnumDescriptorProto,
    getType: () => MessageType[EnumDescriptorProto],
    reservedName: PlainField[js.Array[String]],
    reservedRange: PlainField[js.Array[EnumDescriptorProtoEnumReservedRange]],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String,
    value: PlainField[js.Array[EnumValueDescriptorProto]]
  ): PlainMessageEnumDescripto = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), reservedName = reservedName.asInstanceOf[js.Any], reservedRange = reservedRange.asInstanceOf[js.Any], toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageEnumDescripto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageEnumDescripto] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => EnumDescriptorProto): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[EnumDescriptorProto]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[EnumDescriptorProto | PlainMessage[EnumDescriptorProto] | Null] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => EnumDescriptorProto
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => EnumDescriptorProto
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => EnumDescriptorProto
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[EnumDescriptorProto]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setName(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: PlainField[js.UndefOr[EnumOptions]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setReservedName(value: PlainField[js.Array[String]]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    inline def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value*))
    
    inline def setReservedRange(value: PlainField[js.Array[EnumDescriptorProtoEnumReservedRange]]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    inline def setReservedRangeVarargs(value: EnumDescriptorProtoEnumReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value*))
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setValue(value: PlainField[js.Array[EnumValueDescriptorProto]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: EnumValueDescriptorProto*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
