package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.MethodOptions
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.MethodDescriptorProto> */
trait PlainMessageMethodDescripClientStreaming extends StObject {
  
  var clientStreaming: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  @JSName("clone")
  var clone_FPlainMessageMethodDescripClientStreaming: PlainField[js.Function0[this.type]]
  
  var constructor: PlainField[
    js.Function1[/* data */ js.UndefOr[PartialMessageMethodDescrClientStreaming], Any]
  ]
  
  @JSName("equals")
  var equals_FPlainMessageMethodDescripClientStreaming: PlainField[
    js.Function1[/* other */ js.UndefOr[this.type | PlainMessage[this.type] | Null], Boolean]
  ]
  
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
  
  var inputType: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var name: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var options: js.UndefOr[PlainField[js.UndefOr[MethodOptions]]] = js.undefined
  
  var outputType: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var serverStreaming: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
}
object PlainMessageMethodDescripClientStreaming {
  
  inline def apply(
    clone_ : () => PlainMessageMethodDescripClientStreaming,
    constructor: /* data */ js.UndefOr[PartialMessageMethodDescrClientStreaming] => Any,
    equals_ : /* other */ js.UndefOr[
      PlainMessageMethodDescripClientStreaming | PlainMessage[PlainMessageMethodDescripClientStreaming] | Null
    ] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageMethodDescripClientStreaming,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageMethodDescripClientStreaming,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageMethodDescripClientStreaming,
    getType: () => MessageType[PlainMessageMethodDescripClientStreaming],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String
  ): PlainMessageMethodDescripClientStreaming = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString))
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageMethodDescripClientStreaming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageMethodDescripClientStreaming] (val x: Self) extends AnyVal {
    
    inline def setClientStreaming(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "clientStreaming", value.asInstanceOf[js.Any])
    
    inline def setClientStreamingUndefined: Self = StObject.set(x, "clientStreaming", js.undefined)
    
    inline def setClone_(value: () => PlainMessageMethodDescripClientStreaming): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessageMethodDescrClientStreaming] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[
          PlainMessageMethodDescripClientStreaming | PlainMessage[PlainMessageMethodDescripClientStreaming] | Null
        ] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageMethodDescripClientStreaming
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageMethodDescripClientStreaming
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageMethodDescripClientStreaming
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[PlainMessageMethodDescripClientStreaming]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setInputType(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setName(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: PlainField[js.UndefOr[MethodOptions]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOutputType(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
    
    inline def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setServerStreaming(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "serverStreaming", value.asInstanceOf[js.Any])
    
    inline def setServerStreamingUndefined: Self = StObject.set(x, "serverStreaming", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
