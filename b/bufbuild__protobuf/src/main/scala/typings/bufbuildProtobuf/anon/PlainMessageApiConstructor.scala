package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Api
import typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Method
import typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin
import typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext
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

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/api_pb.Api> */
trait PlainMessageApiConstructor extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageApiConstructor: PlainField[js.Function0[Api]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessage[Api]], Any]]
  
  @JSName("equals")
  var equals_FPlainMessageApiConstructor: PlainField[js.Function1[/* other */ js.UndefOr[Api | PlainMessage[Api] | Null], Boolean]]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      typings.bufbuildProtobuf.mod.Api
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* jsonValue */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.Api
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[
      /* jsonString */ String, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.Api
    ]
  ]
  
  var getType: PlainField[js.Function0[MessageType[Api]]]
  
  var methods: PlainField[js.Array[Method]]
  
  var mixins: PlainField[js.Array[Mixin]]
  
  var name: PlainField[String]
  
  var options: PlainField[js.Array[Option]]
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var sourceContext: js.UndefOr[PlainField[js.UndefOr[SourceContext]]] = js.undefined
  
  var syntax: PlainField[Syntax]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
  
  var version: PlainField[String]
}
object PlainMessageApiConstructor {
  
  inline def apply(
    clone_ : () => Api,
    constructor: /* data */ js.UndefOr[PartialMessage[Api]] => Any,
    equals_ : /* other */ js.UndefOr[Api | PlainMessage[Api] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.Api,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.Api,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.Api,
    getType: () => MessageType[Api],
    methods: PlainField[js.Array[Method]],
    mixins: PlainField[js.Array[Mixin]],
    name: PlainField[String],
    options: PlainField[js.Array[Option]],
    syntax: PlainField[Syntax],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String,
    version: PlainField[String]
  ): PlainMessageApiConstructor = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), methods = methods.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any], toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString), version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageApiConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageApiConstructor] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => Api): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[Api]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: /* other */ js.UndefOr[Api | PlainMessage[Api] | Null] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.Api
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.Api
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.Api
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[Api]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setMethods(value: PlainField[js.Array[Method]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsVarargs(value: Method*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setMixins(value: PlainField[js.Array[Mixin]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    inline def setMixinsVarargs(value: Mixin*): Self = StObject.set(x, "mixins", js.Array(value*))
    
    inline def setName(value: PlainField[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PlainField[js.Array[Option]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSourceContext(value: PlainField[js.UndefOr[SourceContext]]): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
    
    inline def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
    
    inline def setSyntax(value: PlainField[Syntax]): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setVersion(value: PlainField[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
