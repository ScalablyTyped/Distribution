package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Method
import typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Option
import typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Syntax
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/api_pb.Method> */
trait PlainMessageMethod extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageMethod: PlainField[js.Function0[Method]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessage[Method]], Any]]
  
  @JSName("equals")
  var equals_FPlainMessageMethod: PlainField[
    js.Function1[/* other */ js.UndefOr[Method | PlainMessage[Method] | Null], Boolean]
  ]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      Method
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions], Method]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions], Method]
  ]
  
  var getType: PlainField[js.Function0[MessageType[Method]]]
  
  var name: PlainField[String]
  
  var options: PlainField[js.Array[Option]]
  
  var requestStreaming: PlainField[Boolean]
  
  var requestTypeUrl: PlainField[String]
  
  var responseStreaming: PlainField[Boolean]
  
  var responseTypeUrl: PlainField[String]
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var syntax: PlainField[Syntax]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
}
object PlainMessageMethod {
  
  inline def apply(
    clone_ : () => Method,
    constructor: /* data */ js.UndefOr[PartialMessage[Method]] => Any,
    equals_ : /* other */ js.UndefOr[Method | PlainMessage[Method] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => Method,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => Method,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => Method,
    getType: () => MessageType[Method],
    name: PlainField[String],
    options: PlainField[js.Array[Option]],
    requestStreaming: PlainField[Boolean],
    requestTypeUrl: PlainField[String],
    responseStreaming: PlainField[Boolean],
    responseTypeUrl: PlainField[String],
    syntax: PlainField[Syntax],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String
  ): PlainMessageMethod = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], requestStreaming = requestStreaming.asInstanceOf[js.Any], requestTypeUrl = requestTypeUrl.asInstanceOf[js.Any], responseStreaming = responseStreaming.asInstanceOf[js.Any], responseTypeUrl = responseTypeUrl.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any], toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString))
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageMethod] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => Method): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[Method]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: /* other */ js.UndefOr[Method | PlainMessage[Method] | Null] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => Method
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => Method): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => Method): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[Method]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setName(value: PlainField[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PlainField[js.Array[Option]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setRequestStreaming(value: PlainField[Boolean]): Self = StObject.set(x, "requestStreaming", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeUrl(value: PlainField[String]): Self = StObject.set(x, "requestTypeUrl", value.asInstanceOf[js.Any])
    
    inline def setResponseStreaming(value: PlainField[Boolean]): Self = StObject.set(x, "responseStreaming", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUrl(value: PlainField[String]): Self = StObject.set(x, "responseTypeUrl", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSyntax(value: PlainField[Syntax]): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
