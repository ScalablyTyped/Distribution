package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufAnyPbMod.Any
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesMessageMod.PartialField
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IMessageTypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/any_pb.Any> */
trait PartialMessageAnyConstructor extends StObject {
  
  @JSName("clone")
  var clone_FPartialMessageAnyConstructor: js.UndefOr[PartialField[js.Function0[Any]]] = js.undefined
  
  var constructor: js.UndefOr[
    PartialField[js.Function1[/* data */ js.UndefOr[PartialMessage[Any]], scala.Any]]
  ] = js.undefined
  
  @JSName("equals")
  var equals_FPartialMessageAnyConstructor: js.UndefOr[
    PartialField[
      js.Function1[/* other */ js.UndefOr[Any | PlainMessageAnyConstructor | Null], Boolean]
    ]
  ] = js.undefined
  
  var fields: js.UndefOr[PartialField[js.UndefOr[scala.Any]]] = js.undefined
  
  var fromBinary: js.UndefOr[
    PartialField[
      js.Function2[
        /* bytes */ js.typedarray.Uint8Array, 
        /* options */ js.UndefOr[PartialBinaryReadOptions], 
        typings.bufbuildProtobuf.mod.Any
      ]
    ]
  ] = js.undefined
  
  var fromJson: js.UndefOr[
    PartialField[
      js.Function2[
        /* json */ JsonValue, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.mod.Any
      ]
    ]
  ] = js.undefined
  
  var fromJsonString: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonString */ String, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.mod.Any
      ]
    ]
  ] = js.undefined
  
  var getType: js.UndefOr[PartialField[js.Function0[MessageType[Any]]]] = js.undefined
  
  var is: js.UndefOr[PartialField[js.Function1[/* type */ MessageType[AnyMessage] | String, Boolean]]] = js.undefined
  
  var pack: js.UndefOr[PartialField[js.UndefOr[scala.Any]]] = js.undefined
  
  var packFrom: js.UndefOr[PartialField[js.Function1[/* message */ Message[AnyMessage], Unit]]] = js.undefined
  
  var runtime: js.UndefOr[PartialField[js.UndefOr[scala.Any]]] = js.undefined
  
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
  
  var typeName: js.UndefOr[PartialField[js.UndefOr[scala.Any]]] = js.undefined
  
  var typeNameToUrl: js.UndefOr[PartialField[scala.Any]] = js.undefined
  
  var typeUrl: js.UndefOr[PartialField[String]] = js.undefined
  
  var typeUrlToName: js.UndefOr[PartialField[scala.Any]] = js.undefined
  
  var unpack: js.UndefOr[
    PartialField[
      js.Function1[/* registry */ IMessageTypeRegistry, js.UndefOr[Message[AnyMessage]]]
    ]
  ] = js.undefined
  
  var unpackTo: js.UndefOr[PartialField[js.Function1[/* target */ Message[AnyMessage], Boolean]]] = js.undefined
  
  var value: js.UndefOr[PartialField[js.typedarray.Uint8Array]] = js.undefined
}
object PartialMessageAnyConstructor {
  
  inline def apply(): PartialMessageAnyConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageAnyConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessageAnyConstructor] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => Any): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[Any]] => scala.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setEquals_(value: /* other */ js.UndefOr[Any | PlainMessageAnyConstructor | Null] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setFields(value: PartialField[js.UndefOr[scala.Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.Any
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromBinaryUndefined: Self = StObject.set(x, "fromBinary", js.undefined)
    
    inline def setFromJson(
      value: (/* json */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.Any
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.Any
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setFromJsonStringUndefined: Self = StObject.set(x, "fromJsonString", js.undefined)
    
    inline def setFromJsonUndefined: Self = StObject.set(x, "fromJson", js.undefined)
    
    inline def setGetType(value: () => MessageType[Any]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setIs(value: /* type */ MessageType[AnyMessage] | String => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setPack(value: PartialField[js.UndefOr[scala.Any]]): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
    
    inline def setPackFrom(value: /* message */ Message[AnyMessage] => Unit): Self = StObject.set(x, "packFrom", js.Any.fromFunction1(value))
    
    inline def setPackFromUndefined: Self = StObject.set(x, "packFrom", js.undefined)
    
    inline def setPackUndefined: Self = StObject.set(x, "pack", js.undefined)
    
    inline def setRuntime(value: PartialField[js.UndefOr[scala.Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToBinaryUndefined: Self = StObject.set(x, "toBinary", js.undefined)
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setToJsonStringUndefined: Self = StObject.set(x, "toJsonString", js.undefined)
    
    inline def setTypeName(value: PartialField[js.UndefOr[scala.Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameToUrl(value: PartialField[scala.Any]): Self = StObject.set(x, "typeNameToUrl", value.asInstanceOf[js.Any])
    
    inline def setTypeNameToUrlUndefined: Self = StObject.set(x, "typeNameToUrl", js.undefined)
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setTypeUrl(value: PartialField[String]): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    inline def setTypeUrlToName(value: PartialField[scala.Any]): Self = StObject.set(x, "typeUrlToName", value.asInstanceOf[js.Any])
    
    inline def setTypeUrlToNameUndefined: Self = StObject.set(x, "typeUrlToName", js.undefined)
    
    inline def setTypeUrlUndefined: Self = StObject.set(x, "typeUrl", js.undefined)
    
    inline def setUnpack(value: /* registry */ IMessageTypeRegistry => js.UndefOr[Message[AnyMessage]]): Self = StObject.set(x, "unpack", js.Any.fromFunction1(value))
    
    inline def setUnpackTo(value: /* target */ Message[AnyMessage] => Boolean): Self = StObject.set(x, "unpackTo", js.Any.fromFunction1(value))
    
    inline def setUnpackToUndefined: Self = StObject.set(x, "unpackTo", js.undefined)
    
    inline def setUnpackUndefined: Self = StObject.set(x, "unpack", js.undefined)
    
    inline def setValue(value: PartialField[js.typedarray.Uint8Array]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
