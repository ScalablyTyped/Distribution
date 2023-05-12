package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileOptions
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileOptionsOptimizeMode
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.UninterpretedOption
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialField
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.FileOptions> */
trait PartialMessageFileOptions extends StObject {
  
  var ccEnableArenas: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var ccGenericServices: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  @JSName("clone")
  var clone_FPartialMessageFileOptions: js.UndefOr[PartialField[js.Function0[FileOptions]]] = js.undefined
  
  var constructor: js.UndefOr[
    PartialField[js.Function1[/* data */ js.UndefOr[PartialMessage[FileOptions]], Any]]
  ] = js.undefined
  
  var csharpNamespace: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var deprecated: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  @JSName("equals")
  var equals_FPartialMessageFileOptions: js.UndefOr[
    PartialField[
      js.Function1[/* other */ js.UndefOr[FileOptions | PlainMessageFileOptions | Null], Boolean]
    ]
  ] = js.undefined
  
  var fields: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var fromBinary: js.UndefOr[
    PartialField[
      js.Function2[
        /* bytes */ js.typedarray.Uint8Array, 
        /* options */ js.UndefOr[PartialBinaryReadOptions], 
        FileOptions
      ]
    ]
  ] = js.undefined
  
  var fromJson: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonValue */ JsonValue, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        FileOptions
      ]
    ]
  ] = js.undefined
  
  var fromJsonString: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonString */ String, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        FileOptions
      ]
    ]
  ] = js.undefined
  
  var getType: js.UndefOr[PartialField[js.Function0[MessageType[FileOptions]]]] = js.undefined
  
  var goPackage: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var javaGenerateEqualsAndHash: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var javaGenericServices: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var javaMultipleFiles: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var javaOuterClassname: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var javaPackage: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var javaStringCheckUtf8: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var objcClassPrefix: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var optimizeFor: js.UndefOr[PartialField[js.UndefOr[FileOptionsOptimizeMode]]] = js.undefined
  
  var phpClassPrefix: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var phpGenericServices: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var phpMetadataNamespace: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var phpNamespace: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var pyGenericServices: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var rubyPackage: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var runtime: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var swiftPrefix: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
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
  
  var uninterpretedOption: js.UndefOr[PartialField[js.Array[UninterpretedOption]]] = js.undefined
}
object PartialMessageFileOptions {
  
  inline def apply(): PartialMessageFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageFileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessageFileOptions] (val x: Self) extends AnyVal {
    
    inline def setCcEnableArenas(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "ccEnableArenas", value.asInstanceOf[js.Any])
    
    inline def setCcEnableArenasUndefined: Self = StObject.set(x, "ccEnableArenas", js.undefined)
    
    inline def setCcGenericServices(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "ccGenericServices", value.asInstanceOf[js.Any])
    
    inline def setCcGenericServicesUndefined: Self = StObject.set(x, "ccGenericServices", js.undefined)
    
    inline def setClone_(value: () => FileOptions): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[FileOptions]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setCsharpNamespace(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "csharpNamespace", value.asInstanceOf[js.Any])
    
    inline def setCsharpNamespaceUndefined: Self = StObject.set(x, "csharpNamespace", js.undefined)
    
    inline def setDeprecated(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setEquals_(value: /* other */ js.UndefOr[FileOptions | PlainMessageFileOptions | Null] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setFields(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => FileOptions
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromBinaryUndefined: Self = StObject.set(x, "fromBinary", js.undefined)
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => FileOptions
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => FileOptions): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setFromJsonStringUndefined: Self = StObject.set(x, "fromJsonString", js.undefined)
    
    inline def setFromJsonUndefined: Self = StObject.set(x, "fromJson", js.undefined)
    
    inline def setGetType(value: () => MessageType[FileOptions]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setGoPackage(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "goPackage", value.asInstanceOf[js.Any])
    
    inline def setGoPackageUndefined: Self = StObject.set(x, "goPackage", js.undefined)
    
    inline def setJavaGenerateEqualsAndHash(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "javaGenerateEqualsAndHash", value.asInstanceOf[js.Any])
    
    inline def setJavaGenerateEqualsAndHashUndefined: Self = StObject.set(x, "javaGenerateEqualsAndHash", js.undefined)
    
    inline def setJavaGenericServices(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "javaGenericServices", value.asInstanceOf[js.Any])
    
    inline def setJavaGenericServicesUndefined: Self = StObject.set(x, "javaGenericServices", js.undefined)
    
    inline def setJavaMultipleFiles(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "javaMultipleFiles", value.asInstanceOf[js.Any])
    
    inline def setJavaMultipleFilesUndefined: Self = StObject.set(x, "javaMultipleFiles", js.undefined)
    
    inline def setJavaOuterClassname(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "javaOuterClassname", value.asInstanceOf[js.Any])
    
    inline def setJavaOuterClassnameUndefined: Self = StObject.set(x, "javaOuterClassname", js.undefined)
    
    inline def setJavaPackage(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "javaPackage", value.asInstanceOf[js.Any])
    
    inline def setJavaPackageUndefined: Self = StObject.set(x, "javaPackage", js.undefined)
    
    inline def setJavaStringCheckUtf8(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "javaStringCheckUtf8", value.asInstanceOf[js.Any])
    
    inline def setJavaStringCheckUtf8Undefined: Self = StObject.set(x, "javaStringCheckUtf8", js.undefined)
    
    inline def setObjcClassPrefix(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "objcClassPrefix", value.asInstanceOf[js.Any])
    
    inline def setObjcClassPrefixUndefined: Self = StObject.set(x, "objcClassPrefix", js.undefined)
    
    inline def setOptimizeFor(value: PartialField[js.UndefOr[FileOptionsOptimizeMode]]): Self = StObject.set(x, "optimizeFor", value.asInstanceOf[js.Any])
    
    inline def setOptimizeForUndefined: Self = StObject.set(x, "optimizeFor", js.undefined)
    
    inline def setPhpClassPrefix(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "phpClassPrefix", value.asInstanceOf[js.Any])
    
    inline def setPhpClassPrefixUndefined: Self = StObject.set(x, "phpClassPrefix", js.undefined)
    
    inline def setPhpGenericServices(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "phpGenericServices", value.asInstanceOf[js.Any])
    
    inline def setPhpGenericServicesUndefined: Self = StObject.set(x, "phpGenericServices", js.undefined)
    
    inline def setPhpMetadataNamespace(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "phpMetadataNamespace", value.asInstanceOf[js.Any])
    
    inline def setPhpMetadataNamespaceUndefined: Self = StObject.set(x, "phpMetadataNamespace", js.undefined)
    
    inline def setPhpNamespace(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "phpNamespace", value.asInstanceOf[js.Any])
    
    inline def setPhpNamespaceUndefined: Self = StObject.set(x, "phpNamespace", js.undefined)
    
    inline def setPyGenericServices(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "pyGenericServices", value.asInstanceOf[js.Any])
    
    inline def setPyGenericServicesUndefined: Self = StObject.set(x, "pyGenericServices", js.undefined)
    
    inline def setRubyPackage(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "rubyPackage", value.asInstanceOf[js.Any])
    
    inline def setRubyPackageUndefined: Self = StObject.set(x, "rubyPackage", js.undefined)
    
    inline def setRuntime(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSwiftPrefix(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "swiftPrefix", value.asInstanceOf[js.Any])
    
    inline def setSwiftPrefixUndefined: Self = StObject.set(x, "swiftPrefix", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToBinaryUndefined: Self = StObject.set(x, "toBinary", js.undefined)
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setToJsonStringUndefined: Self = StObject.set(x, "toJsonString", js.undefined)
    
    inline def setTypeName(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setUninterpretedOption(value: PartialField[js.Array[UninterpretedOption]]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    inline def setUninterpretedOptionVarargs(value: UninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
