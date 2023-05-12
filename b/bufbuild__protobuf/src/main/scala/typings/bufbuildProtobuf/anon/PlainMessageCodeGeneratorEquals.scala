package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb.CodeGeneratorResponse> */
trait PlainMessageCodeGeneratorEquals extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageCodeGeneratorEquals: PlainField[js.Function0[this.type]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessageCodeGeneratEquals], Any]]
  
  @JSName("equals")
  var equals_FPlainMessageCodeGeneratorEquals: PlainField[
    js.Function1[/* other */ js.UndefOr[this.type | PlainMessage[this.type] | Null], Boolean]
  ]
  
  var error: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var file: PlainField[js.Array[CodeGeneratorResponseFile]]
  
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
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var supportedFeatures: js.UndefOr[PlainField[js.UndefOr[js.BigInt]]] = js.undefined
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
}
object PlainMessageCodeGeneratorEquals {
  
  inline def apply(
    clone_ : () => PlainMessageCodeGeneratorEquals,
    constructor: /* data */ js.UndefOr[PartialMessageCodeGeneratEquals] => Any,
    equals_ : /* other */ js.UndefOr[
      PlainMessageCodeGeneratorEquals | PlainMessage[PlainMessageCodeGeneratorEquals] | Null
    ] => Boolean,
    file: PlainField[js.Array[CodeGeneratorResponseFile]],
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageCodeGeneratorEquals,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageCodeGeneratorEquals,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageCodeGeneratorEquals,
    getType: () => MessageType[PlainMessageCodeGeneratorEquals],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String
  ): PlainMessageCodeGeneratorEquals = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), file = file.asInstanceOf[js.Any], fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString))
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageCodeGeneratorEquals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageCodeGeneratorEquals] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => PlainMessageCodeGeneratorEquals): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessageCodeGeneratEquals] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[
          PlainMessageCodeGeneratorEquals | PlainMessage[PlainMessageCodeGeneratorEquals] | Null
        ] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setError(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFile(value: PlainField[js.Array[CodeGeneratorResponseFile]]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileVarargs(value: CodeGeneratorResponseFile*): Self = StObject.set(x, "file", js.Array(value*))
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageCodeGeneratorEquals
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageCodeGeneratorEquals
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageCodeGeneratorEquals
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[PlainMessageCodeGeneratorEquals]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSupportedFeatures(value: PlainField[js.UndefOr[js.BigInt]]): Self = StObject.set(x, "supportedFeatures", value.asInstanceOf[js.Any])
    
    inline def setSupportedFeaturesUndefined: Self = StObject.set(x, "supportedFeatures", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
