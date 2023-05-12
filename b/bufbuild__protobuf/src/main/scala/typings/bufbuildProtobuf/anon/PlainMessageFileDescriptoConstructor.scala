package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.DescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileOptions
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.ServiceDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.SourceCodeInfo
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.FileDescriptorProto> */
trait PlainMessageFileDescriptoConstructor extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  @JSName("clone")
  var clone_FPlainMessageFileDescriptoConstructor: PlainField[js.Function0[FileDescriptorProto]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessage[FileDescriptorProto]], Any]]
  
  var dependency: PlainField[js.Array[String]]
  
  var edition: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var enumType: PlainField[js.Array[EnumDescriptorProto]]
  
  @JSName("equals")
  var equals_FPlainMessageFileDescriptoConstructor: PlainField[
    js.Function1[
      /* other */ js.UndefOr[FileDescriptorProto | PlainMessage[FileDescriptorProto] | Null], 
      Boolean
    ]
  ]
  
  var `extension`: PlainField[js.Array[FieldDescriptorProto]]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      FileDescriptorProto
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* jsonValue */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      FileDescriptorProto
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[
      /* jsonString */ String, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      FileDescriptorProto
    ]
  ]
  
  var getType: PlainField[js.Function0[MessageType[FileDescriptorProto]]]
  
  var messageType: PlainField[js.Array[DescriptorProto]]
  
  var name: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var options: js.UndefOr[PlainField[js.UndefOr[FileOptions]]] = js.undefined
  
  var publicDependency: PlainField[js.Array[Double]]
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var service: PlainField[js.Array[ServiceDescriptorProto]]
  
  var sourceCodeInfo: js.UndefOr[PlainField[js.UndefOr[SourceCodeInfo]]] = js.undefined
  
  var syntax: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
  
  var weakDependency: PlainField[js.Array[Double]]
}
object PlainMessageFileDescriptoConstructor {
  
  inline def apply(
    clone_ : () => FileDescriptorProto,
    constructor: /* data */ js.UndefOr[PartialMessage[FileDescriptorProto]] => Any,
    dependency: PlainField[js.Array[String]],
    enumType: PlainField[js.Array[EnumDescriptorProto]],
    equals_ : /* other */ js.UndefOr[FileDescriptorProto | PlainMessage[FileDescriptorProto] | Null] => Boolean,
    `extension`: PlainField[js.Array[FieldDescriptorProto]],
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => FileDescriptorProto,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => FileDescriptorProto,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => FileDescriptorProto,
    getType: () => MessageType[FileDescriptorProto],
    messageType: PlainField[js.Array[DescriptorProto]],
    publicDependency: PlainField[js.Array[Double]],
    service: PlainField[js.Array[ServiceDescriptorProto]],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String,
    weakDependency: PlainField[js.Array[Double]]
  ): PlainMessageFileDescriptoConstructor = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), dependency = dependency.asInstanceOf[js.Any], enumType = enumType.asInstanceOf[js.Any], fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), messageType = messageType.asInstanceOf[js.Any], publicDependency = publicDependency.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString), weakDependency = weakDependency.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlainMessageFileDescriptoConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageFileDescriptoConstructor] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => FileDescriptorProto): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[FileDescriptorProto]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setDependency(value: PlainField[js.Array[String]]): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyVarargs(value: String*): Self = StObject.set(x, "dependency", js.Array(value*))
    
    inline def setEdition(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "edition", value.asInstanceOf[js.Any])
    
    inline def setEditionUndefined: Self = StObject.set(x, "edition", js.undefined)
    
    inline def setEnumType(value: PlainField[js.Array[EnumDescriptorProto]]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeVarargs(value: EnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value*))
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[FileDescriptorProto | PlainMessage[FileDescriptorProto] | Null] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setExtension(value: PlainField[js.Array[FieldDescriptorProto]]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionVarargs(value: FieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value*))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => FileDescriptorProto
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => FileDescriptorProto
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => FileDescriptorProto
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[FileDescriptorProto]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setMessageType(value: PlainField[js.Array[DescriptorProto]]): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeVarargs(value: DescriptorProto*): Self = StObject.set(x, "messageType", js.Array(value*))
    
    inline def setName(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: PlainField[js.UndefOr[FileOptions]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPublicDependency(value: PlainField[js.Array[Double]]): Self = StObject.set(x, "publicDependency", value.asInstanceOf[js.Any])
    
    inline def setPublicDependencyVarargs(value: Double*): Self = StObject.set(x, "publicDependency", js.Array(value*))
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setService(value: PlainField[js.Array[ServiceDescriptorProto]]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceVarargs(value: ServiceDescriptorProto*): Self = StObject.set(x, "service", js.Array(value*))
    
    inline def setSourceCodeInfo(value: PlainField[js.UndefOr[SourceCodeInfo]]): Self = StObject.set(x, "sourceCodeInfo", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeInfoUndefined: Self = StObject.set(x, "sourceCodeInfo", js.undefined)
    
    inline def setSyntax(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setWeakDependency(value: PlainField[js.Array[Double]]): Self = StObject.set(x, "weakDependency", value.asInstanceOf[js.Any])
    
    inline def setWeakDependencyVarargs(value: Double*): Self = StObject.set(x, "weakDependency", js.Array(value*))
    
    inline def set_package(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
