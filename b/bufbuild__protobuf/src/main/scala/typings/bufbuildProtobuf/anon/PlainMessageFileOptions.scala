package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileOptions
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileOptionsOptimizeMode
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.UninterpretedOption
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.FileOptions> */
trait PlainMessageFileOptions extends StObject {
  
  var ccEnableArenas: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var ccGenericServices: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  @JSName("clone")
  var clone_FPlainMessageFileOptions: PlainField[js.Function0[FileOptions]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessage[FileOptions]], Any]]
  
  var csharpNamespace: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var deprecated: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  @JSName("equals")
  var equals_FPlainMessageFileOptions: PlainField[
    js.Function1[/* other */ js.UndefOr[FileOptions | PlainMessage[FileOptions] | Null], Boolean]
  ]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      FileOptions
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* jsonValue */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      FileOptions
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[
      /* jsonString */ String, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      FileOptions
    ]
  ]
  
  var getType: PlainField[js.Function0[MessageType[FileOptions]]]
  
  var goPackage: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var javaGenerateEqualsAndHash: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var javaGenericServices: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var javaMultipleFiles: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var javaOuterClassname: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var javaPackage: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var javaStringCheckUtf8: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var objcClassPrefix: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var optimizeFor: js.UndefOr[PlainField[js.UndefOr[FileOptionsOptimizeMode]]] = js.undefined
  
  var phpClassPrefix: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var phpGenericServices: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var phpMetadataNamespace: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var phpNamespace: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var pyGenericServices: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var rubyPackage: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var swiftPrefix: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
  
  var uninterpretedOption: PlainField[js.Array[UninterpretedOption]]
}
object PlainMessageFileOptions {
  
  inline def apply(
    clone_ : () => FileOptions,
    constructor: /* data */ js.UndefOr[PartialMessage[FileOptions]] => Any,
    equals_ : /* other */ js.UndefOr[FileOptions | PlainMessage[FileOptions] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => FileOptions,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => FileOptions,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => FileOptions,
    getType: () => MessageType[FileOptions],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String,
    uninterpretedOption: PlainField[js.Array[UninterpretedOption]]
  ): PlainMessageFileOptions = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString), uninterpretedOption = uninterpretedOption.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageFileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageFileOptions] (val x: Self) extends AnyVal {
    
    inline def setCcEnableArenas(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "ccEnableArenas", value.asInstanceOf[js.Any])
    
    inline def setCcEnableArenasUndefined: Self = StObject.set(x, "ccEnableArenas", js.undefined)
    
    inline def setCcGenericServices(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "ccGenericServices", value.asInstanceOf[js.Any])
    
    inline def setCcGenericServicesUndefined: Self = StObject.set(x, "ccGenericServices", js.undefined)
    
    inline def setClone_(value: () => FileOptions): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[FileOptions]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setCsharpNamespace(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "csharpNamespace", value.asInstanceOf[js.Any])
    
    inline def setCsharpNamespaceUndefined: Self = StObject.set(x, "csharpNamespace", js.undefined)
    
    inline def setDeprecated(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setEquals_(value: /* other */ js.UndefOr[FileOptions | PlainMessage[FileOptions] | Null] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => FileOptions
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => FileOptions
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => FileOptions): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[FileOptions]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGoPackage(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "goPackage", value.asInstanceOf[js.Any])
    
    inline def setGoPackageUndefined: Self = StObject.set(x, "goPackage", js.undefined)
    
    inline def setJavaGenerateEqualsAndHash(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "javaGenerateEqualsAndHash", value.asInstanceOf[js.Any])
    
    inline def setJavaGenerateEqualsAndHashUndefined: Self = StObject.set(x, "javaGenerateEqualsAndHash", js.undefined)
    
    inline def setJavaGenericServices(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "javaGenericServices", value.asInstanceOf[js.Any])
    
    inline def setJavaGenericServicesUndefined: Self = StObject.set(x, "javaGenericServices", js.undefined)
    
    inline def setJavaMultipleFiles(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "javaMultipleFiles", value.asInstanceOf[js.Any])
    
    inline def setJavaMultipleFilesUndefined: Self = StObject.set(x, "javaMultipleFiles", js.undefined)
    
    inline def setJavaOuterClassname(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "javaOuterClassname", value.asInstanceOf[js.Any])
    
    inline def setJavaOuterClassnameUndefined: Self = StObject.set(x, "javaOuterClassname", js.undefined)
    
    inline def setJavaPackage(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "javaPackage", value.asInstanceOf[js.Any])
    
    inline def setJavaPackageUndefined: Self = StObject.set(x, "javaPackage", js.undefined)
    
    inline def setJavaStringCheckUtf8(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "javaStringCheckUtf8", value.asInstanceOf[js.Any])
    
    inline def setJavaStringCheckUtf8Undefined: Self = StObject.set(x, "javaStringCheckUtf8", js.undefined)
    
    inline def setObjcClassPrefix(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "objcClassPrefix", value.asInstanceOf[js.Any])
    
    inline def setObjcClassPrefixUndefined: Self = StObject.set(x, "objcClassPrefix", js.undefined)
    
    inline def setOptimizeFor(value: PlainField[js.UndefOr[FileOptionsOptimizeMode]]): Self = StObject.set(x, "optimizeFor", value.asInstanceOf[js.Any])
    
    inline def setOptimizeForUndefined: Self = StObject.set(x, "optimizeFor", js.undefined)
    
    inline def setPhpClassPrefix(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "phpClassPrefix", value.asInstanceOf[js.Any])
    
    inline def setPhpClassPrefixUndefined: Self = StObject.set(x, "phpClassPrefix", js.undefined)
    
    inline def setPhpGenericServices(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "phpGenericServices", value.asInstanceOf[js.Any])
    
    inline def setPhpGenericServicesUndefined: Self = StObject.set(x, "phpGenericServices", js.undefined)
    
    inline def setPhpMetadataNamespace(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "phpMetadataNamespace", value.asInstanceOf[js.Any])
    
    inline def setPhpMetadataNamespaceUndefined: Self = StObject.set(x, "phpMetadataNamespace", js.undefined)
    
    inline def setPhpNamespace(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "phpNamespace", value.asInstanceOf[js.Any])
    
    inline def setPhpNamespaceUndefined: Self = StObject.set(x, "phpNamespace", js.undefined)
    
    inline def setPyGenericServices(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "pyGenericServices", value.asInstanceOf[js.Any])
    
    inline def setPyGenericServicesUndefined: Self = StObject.set(x, "pyGenericServices", js.undefined)
    
    inline def setRubyPackage(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "rubyPackage", value.asInstanceOf[js.Any])
    
    inline def setRubyPackageUndefined: Self = StObject.set(x, "rubyPackage", js.undefined)
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSwiftPrefix(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "swiftPrefix", value.asInstanceOf[js.Any])
    
    inline def setSwiftPrefixUndefined: Self = StObject.set(x, "swiftPrefix", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setUninterpretedOption(value: PlainField[js.Array[UninterpretedOption]]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionVarargs(value: UninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
