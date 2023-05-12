package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptions
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsCType
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsJSType
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsOptionRetention
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsOptionTargetType
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.UninterpretedOption
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.FieldOptions> */
trait PlainMessageFieldOptions extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageFieldOptions: PlainField[js.Function0[FieldOptions]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessage[FieldOptions]], Any]]
  
  var ctype: js.UndefOr[PlainField[js.UndefOr[FieldOptionsCType]]] = js.undefined
  
  var debugRedact: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var deprecated: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  @JSName("equals")
  var equals_FPlainMessageFieldOptions: PlainField[
    js.Function1[/* other */ js.UndefOr[FieldOptions | PlainMessage[FieldOptions] | Null], Boolean]
  ]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      FieldOptions
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* jsonValue */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      FieldOptions
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[
      /* jsonString */ String, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      FieldOptions
    ]
  ]
  
  var getType: PlainField[js.Function0[MessageType[FieldOptions]]]
  
  var jstype: js.UndefOr[PlainField[js.UndefOr[FieldOptionsJSType]]] = js.undefined
  
  var `lazy`: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var packed: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var retention: js.UndefOr[PlainField[js.UndefOr[FieldOptionsOptionRetention]]] = js.undefined
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var target: js.UndefOr[PlainField[js.UndefOr[FieldOptionsOptionTargetType]]] = js.undefined
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
  
  var uninterpretedOption: PlainField[js.Array[UninterpretedOption]]
  
  var unverifiedLazy: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var weak: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
}
object PlainMessageFieldOptions {
  
  inline def apply(
    clone_ : () => FieldOptions,
    constructor: /* data */ js.UndefOr[PartialMessage[FieldOptions]] => Any,
    equals_ : /* other */ js.UndefOr[FieldOptions | PlainMessage[FieldOptions] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => FieldOptions,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => FieldOptions,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => FieldOptions,
    getType: () => MessageType[FieldOptions],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String,
    uninterpretedOption: PlainField[js.Array[UninterpretedOption]]
  ): PlainMessageFieldOptions = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString), uninterpretedOption = uninterpretedOption.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageFieldOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageFieldOptions] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => FieldOptions): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[FieldOptions]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setCtype(value: PlainField[js.UndefOr[FieldOptionsCType]]): Self = StObject.set(x, "ctype", value.asInstanceOf[js.Any])
    
    inline def setCtypeUndefined: Self = StObject.set(x, "ctype", js.undefined)
    
    inline def setDebugRedact(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "debugRedact", value.asInstanceOf[js.Any])
    
    inline def setDebugRedactUndefined: Self = StObject.set(x, "debugRedact", js.undefined)
    
    inline def setDeprecated(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setEquals_(value: /* other */ js.UndefOr[FieldOptions | PlainMessage[FieldOptions] | Null] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => FieldOptions
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => FieldOptions
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => FieldOptions): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[FieldOptions]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setJstype(value: PlainField[js.UndefOr[FieldOptionsJSType]]): Self = StObject.set(x, "jstype", value.asInstanceOf[js.Any])
    
    inline def setJstypeUndefined: Self = StObject.set(x, "jstype", js.undefined)
    
    inline def setLazy(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setPacked(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
    
    inline def setRetention(value: PlainField[js.UndefOr[FieldOptionsOptionRetention]]): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
    
    inline def setRetentionUndefined: Self = StObject.set(x, "retention", js.undefined)
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setTarget(value: PlainField[js.UndefOr[FieldOptionsOptionTargetType]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setUninterpretedOption(value: PlainField[js.Array[UninterpretedOption]]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionVarargs(value: UninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
    
    inline def setUnverifiedLazy(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "unverifiedLazy", value.asInstanceOf[js.Any])
    
    inline def setUnverifiedLazyUndefined: Self = StObject.set(x, "unverifiedLazy", js.undefined)
    
    inline def setWeak(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
