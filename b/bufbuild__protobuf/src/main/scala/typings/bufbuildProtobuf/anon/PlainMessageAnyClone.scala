package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IMessageTypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/any_pb.Any> */
trait PlainMessageAnyClone extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageAnyClone: PlainField[js.Function0[this.type]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessageAnyClone], Any]]
  
  @JSName("equals")
  var equals_FPlainMessageAnyClone: PlainField[
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
    js.Function2[/* json */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions], this.type]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions], this.type]
  ]
  
  var getType: PlainField[js.Function0[MessageType[this.type]]]
  
  var is: PlainField[js.Function1[/* type */ MessageType[AnyMessage] | String, Boolean]]
  
  var pack: PlainField[js.UndefOr[Any]]
  
  var packFrom: PlainField[js.Function1[/* message */ Message[AnyMessage], Unit]]
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
  
  var typeNameToUrl: PlainField[Any]
  
  var typeUrl: PlainField[String]
  
  var typeUrlToName: PlainField[Any]
  
  var unpack: PlainField[
    js.Function1[/* registry */ IMessageTypeRegistry, js.UndefOr[Message[AnyMessage]]]
  ]
  
  var unpackTo: PlainField[js.Function1[/* target */ Message[AnyMessage], Boolean]]
  
  var value: PlainField[js.typedarray.Uint8Array]
}
object PlainMessageAnyClone {
  
  inline def apply(
    clone_ : () => PlainMessageAnyClone,
    constructor: /* data */ js.UndefOr[PartialMessageAnyClone] => Any,
    equals_ : /* other */ js.UndefOr[PlainMessageAnyClone | PlainMessage[PlainMessageAnyClone] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageAnyClone,
    fromJson: (/* json */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageAnyClone,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageAnyClone,
    getType: () => MessageType[PlainMessageAnyClone],
    is: /* type */ MessageType[AnyMessage] | String => Boolean,
    packFrom: /* message */ Message[AnyMessage] => Unit,
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String,
    typeNameToUrl: PlainField[Any],
    typeUrl: PlainField[String],
    typeUrlToName: PlainField[Any],
    unpack: /* registry */ IMessageTypeRegistry => js.UndefOr[Message[AnyMessage]],
    unpackTo: /* target */ Message[AnyMessage] => Boolean,
    value: PlainField[js.typedarray.Uint8Array]
  ): PlainMessageAnyClone = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), is = js.Any.fromFunction1(is), packFrom = js.Any.fromFunction1(packFrom), toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString), typeNameToUrl = typeNameToUrl.asInstanceOf[js.Any], typeUrl = typeUrl.asInstanceOf[js.Any], typeUrlToName = typeUrlToName.asInstanceOf[js.Any], unpack = js.Any.fromFunction1(unpack), unpackTo = js.Any.fromFunction1(unpackTo), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageAnyClone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageAnyClone] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => PlainMessageAnyClone): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessageAnyClone] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[PlainMessageAnyClone | PlainMessage[PlainMessageAnyClone] | Null] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageAnyClone
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* json */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageAnyClone
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageAnyClone
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[PlainMessageAnyClone]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setIs(value: /* type */ MessageType[AnyMessage] | String => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setPack(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
    
    inline def setPackFrom(value: /* message */ Message[AnyMessage] => Unit): Self = StObject.set(x, "packFrom", js.Any.fromFunction1(value))
    
    inline def setPackUndefined: Self = StObject.set(x, "pack", js.undefined)
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameToUrl(value: PlainField[Any]): Self = StObject.set(x, "typeNameToUrl", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setTypeUrl(value: PlainField[String]): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    inline def setTypeUrlToName(value: PlainField[Any]): Self = StObject.set(x, "typeUrlToName", value.asInstanceOf[js.Any])
    
    inline def setUnpack(value: /* registry */ IMessageTypeRegistry => js.UndefOr[Message[AnyMessage]]): Self = StObject.set(x, "unpack", js.Any.fromFunction1(value))
    
    inline def setUnpackTo(value: /* target */ Message[AnyMessage] => Boolean): Self = StObject.set(x, "unpackTo", js.Any.fromFunction1(value))
    
    inline def setValue(value: PlainField[js.typedarray.Uint8Array]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
