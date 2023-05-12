package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.DescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.DescriptorProtoExtensionRange
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.DescriptorProtoReservedRange
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.MessageOptions
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.OneofDescriptorProto
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.DescriptorProto> */
trait PlainMessageDescriptorProClone extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageDescriptorProClone: PlainField[js.Function0[this.type]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessageDescriptorPClone], Any]]
  
  var enumType: PlainField[js.Array[EnumDescriptorProto]]
  
  @JSName("equals")
  var equals_FPlainMessageDescriptorProClone: PlainField[
    js.Function1[/* other */ js.UndefOr[this.type | PlainMessage[this.type] | Null], Boolean]
  ]
  
  var `extension`: PlainField[js.Array[FieldDescriptorProto]]
  
  var extensionRange: PlainField[js.Array[DescriptorProtoExtensionRange]]
  
  var field: PlainField[js.Array[FieldDescriptorProto]]
  
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
  
  var name: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var nestedType: PlainField[js.Array[DescriptorProto]]
  
  var oneofDecl: PlainField[js.Array[OneofDescriptorProto]]
  
  var options: js.UndefOr[PlainField[js.UndefOr[MessageOptions]]] = js.undefined
  
  var reservedName: PlainField[js.Array[String]]
  
  var reservedRange: PlainField[js.Array[DescriptorProtoReservedRange]]
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
}
object PlainMessageDescriptorProClone {
  
  inline def apply(
    clone_ : () => PlainMessageDescriptorProClone,
    constructor: /* data */ js.UndefOr[PartialMessageDescriptorPClone] => Any,
    enumType: PlainField[js.Array[EnumDescriptorProto]],
    equals_ : /* other */ js.UndefOr[
      PlainMessageDescriptorProClone | PlainMessage[PlainMessageDescriptorProClone] | Null
    ] => Boolean,
    `extension`: PlainField[js.Array[FieldDescriptorProto]],
    extensionRange: PlainField[js.Array[DescriptorProtoExtensionRange]],
    field: PlainField[js.Array[FieldDescriptorProto]],
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageDescriptorProClone,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageDescriptorProClone,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageDescriptorProClone,
    getType: () => MessageType[PlainMessageDescriptorProClone],
    nestedType: PlainField[js.Array[DescriptorProto]],
    oneofDecl: PlainField[js.Array[OneofDescriptorProto]],
    reservedName: PlainField[js.Array[String]],
    reservedRange: PlainField[js.Array[DescriptorProtoReservedRange]],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String
  ): PlainMessageDescriptorProClone = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), enumType = enumType.asInstanceOf[js.Any], extensionRange = extensionRange.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), nestedType = nestedType.asInstanceOf[js.Any], oneofDecl = oneofDecl.asInstanceOf[js.Any], reservedName = reservedName.asInstanceOf[js.Any], reservedRange = reservedRange.asInstanceOf[js.Any], toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString))
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlainMessageDescriptorProClone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageDescriptorProClone] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => PlainMessageDescriptorProClone): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessageDescriptorPClone] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setEnumType(value: PlainField[js.Array[EnumDescriptorProto]]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeVarargs(value: EnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value*))
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[
          PlainMessageDescriptorProClone | PlainMessage[PlainMessageDescriptorProClone] | Null
        ] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setExtension(value: PlainField[js.Array[FieldDescriptorProto]]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionRange(value: PlainField[js.Array[DescriptorProtoExtensionRange]]): Self = StObject.set(x, "extensionRange", value.asInstanceOf[js.Any])
    
    inline def setExtensionRangeVarargs(value: DescriptorProtoExtensionRange*): Self = StObject.set(x, "extensionRange", js.Array(value*))
    
    inline def setExtensionVarargs(value: FieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value*))
    
    inline def setField(value: PlainField[js.Array[FieldDescriptorProto]]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldVarargs(value: FieldDescriptorProto*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageDescriptorProClone
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageDescriptorProClone
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageDescriptorProClone
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[PlainMessageDescriptorProClone]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setName(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNestedType(value: PlainField[js.Array[DescriptorProto]]): Self = StObject.set(x, "nestedType", value.asInstanceOf[js.Any])
    
    inline def setNestedTypeVarargs(value: DescriptorProto*): Self = StObject.set(x, "nestedType", js.Array(value*))
    
    inline def setOneofDecl(value: PlainField[js.Array[OneofDescriptorProto]]): Self = StObject.set(x, "oneofDecl", value.asInstanceOf[js.Any])
    
    inline def setOneofDeclVarargs(value: OneofDescriptorProto*): Self = StObject.set(x, "oneofDecl", js.Array(value*))
    
    inline def setOptions(value: PlainField[js.UndefOr[MessageOptions]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setReservedName(value: PlainField[js.Array[String]]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    inline def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value*))
    
    inline def setReservedRange(value: PlainField[js.Array[DescriptorProtoReservedRange]]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    inline def setReservedRangeVarargs(value: DescriptorProtoReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value*))
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
