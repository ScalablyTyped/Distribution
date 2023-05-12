package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.DescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileOptions
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.ServiceDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.SourceCodeInfo
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialField
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.FileDescriptorProto> */
trait PartialMessageFileDescripDependency extends StObject {
  
  @JSName("package")
  var _package: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  @JSName("clone")
  var clone_FPartialMessageFileDescripDependency: js.UndefOr[PartialField[js.Function0[this.type]]] = js.undefined
  
  var constructor: js.UndefOr[
    PartialField[js.Function1[/* data */ js.UndefOr[PartialMessage[this.type]], Any]]
  ] = js.undefined
  
  var dependency: js.UndefOr[PartialField[js.Array[String]]] = js.undefined
  
  var edition: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var enumType: js.UndefOr[PartialField[js.Array[EnumDescriptorProto]]] = js.undefined
  
  @JSName("equals")
  var equals_FPartialMessageFileDescripDependency: js.UndefOr[
    PartialField[
      js.Function1[/* other */ js.UndefOr[this.type | PlainMessage[this.type] | Null], Boolean]
    ]
  ] = js.undefined
  
  var `extension`: js.UndefOr[PartialField[js.Array[FieldDescriptorProto]]] = js.undefined
  
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
  
  var messageType: js.UndefOr[PartialField[js.Array[DescriptorProto]]] = js.undefined
  
  var name: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var options: js.UndefOr[PartialField[js.UndefOr[FileOptions]]] = js.undefined
  
  var publicDependency: js.UndefOr[PartialField[js.Array[Double]]] = js.undefined
  
  var runtime: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var service: js.UndefOr[PartialField[js.Array[ServiceDescriptorProto]]] = js.undefined
  
  var sourceCodeInfo: js.UndefOr[PartialField[js.UndefOr[SourceCodeInfo]]] = js.undefined
  
  var syntax: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
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
  
  var weakDependency: js.UndefOr[PartialField[js.Array[Double]]] = js.undefined
}
object PartialMessageFileDescripDependency {
  
  inline def apply(): PartialMessageFileDescripDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageFileDescripDependency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessageFileDescripDependency] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => PartialMessageFileDescripDependency): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[PartialMessageFileDescripDependency]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setDependency(value: PartialField[js.Array[String]]): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    inline def setDependencyVarargs(value: String*): Self = StObject.set(x, "dependency", js.Array(value*))
    
    inline def setEdition(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "edition", value.asInstanceOf[js.Any])
    
    inline def setEditionUndefined: Self = StObject.set(x, "edition", js.undefined)
    
    inline def setEnumType(value: PartialField[js.Array[EnumDescriptorProto]]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setEnumTypeVarargs(value: EnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value*))
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[
          PartialMessageFileDescripDependency | PlainMessage[PartialMessageFileDescripDependency] | Null
        ] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setExtension(value: PartialField[js.Array[FieldDescriptorProto]]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setExtensionVarargs(value: FieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value*))
    
    inline def setFields(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PartialMessageFileDescripDependency
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromBinaryUndefined: Self = StObject.set(x, "fromBinary", js.undefined)
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PartialMessageFileDescripDependency
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PartialMessageFileDescripDependency
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setFromJsonStringUndefined: Self = StObject.set(x, "fromJsonString", js.undefined)
    
    inline def setFromJsonUndefined: Self = StObject.set(x, "fromJson", js.undefined)
    
    inline def setGetType(value: () => MessageType[PartialMessageFileDescripDependency]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setMessageType(value: PartialField[js.Array[DescriptorProto]]): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setMessageTypeVarargs(value: DescriptorProto*): Self = StObject.set(x, "messageType", js.Array(value*))
    
    inline def setName(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: PartialField[js.UndefOr[FileOptions]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPublicDependency(value: PartialField[js.Array[Double]]): Self = StObject.set(x, "publicDependency", value.asInstanceOf[js.Any])
    
    inline def setPublicDependencyUndefined: Self = StObject.set(x, "publicDependency", js.undefined)
    
    inline def setPublicDependencyVarargs(value: Double*): Self = StObject.set(x, "publicDependency", js.Array(value*))
    
    inline def setRuntime(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setService(value: PartialField[js.Array[ServiceDescriptorProto]]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setServiceVarargs(value: ServiceDescriptorProto*): Self = StObject.set(x, "service", js.Array(value*))
    
    inline def setSourceCodeInfo(value: PartialField[js.UndefOr[SourceCodeInfo]]): Self = StObject.set(x, "sourceCodeInfo", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeInfoUndefined: Self = StObject.set(x, "sourceCodeInfo", js.undefined)
    
    inline def setSyntax(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToBinaryUndefined: Self = StObject.set(x, "toBinary", js.undefined)
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setToJsonStringUndefined: Self = StObject.set(x, "toJsonString", js.undefined)
    
    inline def setTypeName(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setWeakDependency(value: PartialField[js.Array[Double]]): Self = StObject.set(x, "weakDependency", value.asInstanceOf[js.Any])
    
    inline def setWeakDependencyUndefined: Self = StObject.set(x, "weakDependency", js.undefined)
    
    inline def setWeakDependencyVarargs(value: Double*): Self = StObject.set(x, "weakDependency", js.Array(value*))
    
    inline def set_package(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
