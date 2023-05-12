package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.DescriptorProtoExtensionRange
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.DescriptorProtoReservedRange
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.MessageOptions
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.OneofDescriptorProto
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialField
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.DescriptorProto> */
trait PartialMessageDescriptorPClone extends StObject {
  
  @JSName("clone")
  var clone_FPartialMessageDescriptorPClone: js.UndefOr[PartialField[js.Function0[this.type]]] = js.undefined
  
  var constructor: js.UndefOr[
    PartialField[js.Function1[/* data */ js.UndefOr[PartialMessage[this.type]], Any]]
  ] = js.undefined
  
  var enumType: js.UndefOr[PartialField[js.Array[EnumDescriptorProto]]] = js.undefined
  
  @JSName("equals")
  var equals_FPartialMessageDescriptorPClone: js.UndefOr[
    PartialField[
      js.Function1[/* other */ js.UndefOr[this.type | PlainMessage[this.type] | Null], Boolean]
    ]
  ] = js.undefined
  
  var `extension`: js.UndefOr[PartialField[js.Array[FieldDescriptorProto]]] = js.undefined
  
  var extensionRange: js.UndefOr[PartialField[js.Array[DescriptorProtoExtensionRange]]] = js.undefined
  
  var field: js.UndefOr[PartialField[js.Array[FieldDescriptorProto]]] = js.undefined
  
  var fields: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var fromBinary: js.UndefOr[
    PartialField[
      js.Function2[
        /* bytes */ js.typedarray.Uint8Array, 
        /* options */ js.UndefOr[PartialBinaryReadOptions], 
        this.type
      ]
    ]
  ] = js.undefined
  
  var fromJson: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonValue */ JsonValue, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        this.type
      ]
    ]
  ] = js.undefined
  
  var fromJsonString: js.UndefOr[
    PartialField[
      js.Function2[/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions], this.type]
    ]
  ] = js.undefined
  
  var getType: js.UndefOr[PartialField[js.Function0[MessageType[this.type]]]] = js.undefined
  
  var name: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var nestedType: js.UndefOr[PartialField[js.Array[this.type]]] = js.undefined
  
  var oneofDecl: js.UndefOr[PartialField[js.Array[OneofDescriptorProto]]] = js.undefined
  
  var options: js.UndefOr[PartialField[js.UndefOr[MessageOptions]]] = js.undefined
  
  var reservedName: js.UndefOr[PartialField[js.Array[String]]] = js.undefined
  
  var reservedRange: js.UndefOr[PartialField[js.Array[DescriptorProtoReservedRange]]] = js.undefined
  
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
}
object PartialMessageDescriptorPClone {
  
  inline def apply(): PartialMessageDescriptorPClone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageDescriptorPClone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessageDescriptorPClone] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => PartialMessageDescriptorPClone): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[PartialMessageDescriptorPClone]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setEnumType(value: PartialField[js.Array[EnumDescriptorProto]]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setEnumTypeVarargs(value: EnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value*))
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[
          PartialMessageDescriptorPClone | PlainMessage[PartialMessageDescriptorPClone] | Null
        ] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setExtension(value: PartialField[js.Array[FieldDescriptorProto]]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionRange(value: PartialField[js.Array[DescriptorProtoExtensionRange]]): Self = StObject.set(x, "extensionRange", value.asInstanceOf[js.Any])
    
    inline def setExtensionRangeUndefined: Self = StObject.set(x, "extensionRange", js.undefined)
    
    inline def setExtensionRangeVarargs(value: DescriptorProtoExtensionRange*): Self = StObject.set(x, "extensionRange", js.Array(value*))
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setExtensionVarargs(value: FieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value*))
    
    inline def setField(value: PartialField[js.Array[FieldDescriptorProto]]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFieldVarargs(value: FieldDescriptorProto*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setFields(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PartialMessageDescriptorPClone
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromBinaryUndefined: Self = StObject.set(x, "fromBinary", js.undefined)
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PartialMessageDescriptorPClone
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PartialMessageDescriptorPClone
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setFromJsonStringUndefined: Self = StObject.set(x, "fromJsonString", js.undefined)
    
    inline def setFromJsonUndefined: Self = StObject.set(x, "fromJson", js.undefined)
    
    inline def setGetType(value: () => MessageType[PartialMessageDescriptorPClone]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setName(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNestedType(value: PartialField[js.Array[PartialMessageDescriptorPClone]]): Self = StObject.set(x, "nestedType", value.asInstanceOf[js.Any])
    
    inline def setNestedTypeUndefined: Self = StObject.set(x, "nestedType", js.undefined)
    
    inline def setNestedTypeVarargs(value: PartialMessageDescriptorPClone*): Self = StObject.set(x, "nestedType", js.Array(value*))
    
    inline def setOneofDecl(value: PartialField[js.Array[OneofDescriptorProto]]): Self = StObject.set(x, "oneofDecl", value.asInstanceOf[js.Any])
    
    inline def setOneofDeclUndefined: Self = StObject.set(x, "oneofDecl", js.undefined)
    
    inline def setOneofDeclVarargs(value: OneofDescriptorProto*): Self = StObject.set(x, "oneofDecl", js.Array(value*))
    
    inline def setOptions(value: PartialField[js.UndefOr[MessageOptions]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setReservedName(value: PartialField[js.Array[String]]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    inline def setReservedNameUndefined: Self = StObject.set(x, "reservedName", js.undefined)
    
    inline def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value*))
    
    inline def setReservedRange(value: PartialField[js.Array[DescriptorProtoReservedRange]]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    inline def setReservedRangeUndefined: Self = StObject.set(x, "reservedRange", js.undefined)
    
    inline def setReservedRangeVarargs(value: DescriptorProtoReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value*))
    
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
  }
}
