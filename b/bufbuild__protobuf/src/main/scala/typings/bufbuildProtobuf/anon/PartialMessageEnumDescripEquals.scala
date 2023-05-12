package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumDescriptorProtoEnumReservedRange
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumOptions
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumValueDescriptorProto
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialField
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.EnumDescriptorProto> */
trait PartialMessageEnumDescripEquals extends StObject {
  
  @JSName("clone")
  var clone_FPartialMessageEnumDescripEquals: js.UndefOr[PartialField[js.Function0[EnumDescriptorProto]]] = js.undefined
  
  var constructor: js.UndefOr[
    PartialField[js.Function1[/* data */ js.UndefOr[PartialMessage[EnumDescriptorProto]], Any]]
  ] = js.undefined
  
  @JSName("equals")
  var equals_FPartialMessageEnumDescripEquals: js.UndefOr[
    PartialField[
      js.Function1[
        /* other */ js.UndefOr[EnumDescriptorProto | PlainMessageEnumDescriptoEquals | Null], 
        Boolean
      ]
    ]
  ] = js.undefined
  
  var fields: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var fromBinary: js.UndefOr[
    PartialField[
      js.Function2[
        /* bytes */ js.typedarray.Uint8Array, 
        /* options */ js.UndefOr[PartialBinaryReadOptions], 
        typings.bufbuildProtobuf.mod.EnumDescriptorProto
      ]
    ]
  ] = js.undefined
  
  var fromJson: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonValue */ JsonValue, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.mod.EnumDescriptorProto
      ]
    ]
  ] = js.undefined
  
  var fromJsonString: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonString */ String, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.mod.EnumDescriptorProto
      ]
    ]
  ] = js.undefined
  
  var getType: js.UndefOr[PartialField[js.Function0[MessageType[EnumDescriptorProto]]]] = js.undefined
  
  var name: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var options: js.UndefOr[PartialField[js.UndefOr[EnumOptions]]] = js.undefined
  
  var reservedName: js.UndefOr[PartialField[js.Array[String]]] = js.undefined
  
  var reservedRange: js.UndefOr[PartialField[js.Array[EnumDescriptorProtoEnumReservedRange]]] = js.undefined
  
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
  
  var typeName: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var value: js.UndefOr[PartialField[js.Array[EnumValueDescriptorProto]]] = js.undefined
}
object PartialMessageEnumDescripEquals {
  
  inline def apply(): PartialMessageEnumDescripEquals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageEnumDescripEquals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessageEnumDescripEquals] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => EnumDescriptorProto): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[EnumDescriptorProto]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[EnumDescriptorProto | PlainMessageEnumDescriptoEquals | Null] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setFields(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.EnumDescriptorProto
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromBinaryUndefined: Self = StObject.set(x, "fromBinary", js.undefined)
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.EnumDescriptorProto
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.EnumDescriptorProto
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setFromJsonStringUndefined: Self = StObject.set(x, "fromJsonString", js.undefined)
    
    inline def setFromJsonUndefined: Self = StObject.set(x, "fromJson", js.undefined)
    
    inline def setGetType(value: () => MessageType[EnumDescriptorProto]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setName(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: PartialField[js.UndefOr[EnumOptions]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setReservedName(value: PartialField[js.Array[String]]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    inline def setReservedNameUndefined: Self = StObject.set(x, "reservedName", js.undefined)
    
    inline def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value*))
    
    inline def setReservedRange(value: PartialField[js.Array[EnumDescriptorProtoEnumReservedRange]]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    inline def setReservedRangeUndefined: Self = StObject.set(x, "reservedRange", js.undefined)
    
    inline def setReservedRangeVarargs(value: EnumDescriptorProtoEnumReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value*))
    
    inline def setRuntime(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToBinaryUndefined: Self = StObject.set(x, "toBinary", js.undefined)
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setToJsonStringUndefined: Self = StObject.set(x, "toJsonString", js.undefined)
    
    inline def setTypeName(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setValue(value: PartialField[js.Array[EnumValueDescriptorProto]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: EnumValueDescriptorProto*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
