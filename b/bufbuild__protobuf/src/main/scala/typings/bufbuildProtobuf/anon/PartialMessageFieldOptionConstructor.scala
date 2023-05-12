package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptions
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsCType
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsJSType
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsOptionRetention
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldOptionsOptionTargetType
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.UninterpretedOption
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialField
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.FieldOptions> */
trait PartialMessageFieldOptionConstructor extends StObject {
  
  @JSName("clone")
  var clone_FPartialMessageFieldOptionConstructor: js.UndefOr[PartialField[js.Function0[FieldOptions]]] = js.undefined
  
  var constructor: js.UndefOr[
    PartialField[js.Function1[/* data */ js.UndefOr[PartialMessage[FieldOptions]], Any]]
  ] = js.undefined
  
  var ctype: js.UndefOr[PartialField[js.UndefOr[FieldOptionsCType]]] = js.undefined
  
  var debugRedact: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var deprecated: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  @JSName("equals")
  var equals_FPartialMessageFieldOptionConstructor: js.UndefOr[
    PartialField[
      js.Function1[
        /* other */ js.UndefOr[FieldOptions | PlainMessageFieldOptionsConstructor | Null], 
        Boolean
      ]
    ]
  ] = js.undefined
  
  var fields: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var fromBinary: js.UndefOr[
    PartialField[
      js.Function2[
        /* bytes */ js.typedarray.Uint8Array, 
        /* options */ js.UndefOr[PartialBinaryReadOptions], 
        typings.bufbuildProtobuf.mod.FieldOptions
      ]
    ]
  ] = js.undefined
  
  var fromJson: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonValue */ JsonValue, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.mod.FieldOptions
      ]
    ]
  ] = js.undefined
  
  var fromJsonString: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonString */ String, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.mod.FieldOptions
      ]
    ]
  ] = js.undefined
  
  var getType: js.UndefOr[PartialField[js.Function0[MessageType[FieldOptions]]]] = js.undefined
  
  var jstype: js.UndefOr[PartialField[js.UndefOr[FieldOptionsJSType]]] = js.undefined
  
  var `lazy`: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var packed: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var retention: js.UndefOr[PartialField[js.UndefOr[FieldOptionsOptionRetention]]] = js.undefined
  
  var runtime: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var target: js.UndefOr[PartialField[js.UndefOr[FieldOptionsOptionTargetType]]] = js.undefined
  
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
  
  var unverifiedLazy: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
  
  var weak: js.UndefOr[PartialField[js.UndefOr[Boolean]]] = js.undefined
}
object PartialMessageFieldOptionConstructor {
  
  inline def apply(): PartialMessageFieldOptionConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageFieldOptionConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessageFieldOptionConstructor] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => FieldOptions): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[FieldOptions]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setCtype(value: PartialField[js.UndefOr[FieldOptionsCType]]): Self = StObject.set(x, "ctype", value.asInstanceOf[js.Any])
    
    inline def setCtypeUndefined: Self = StObject.set(x, "ctype", js.undefined)
    
    inline def setDebugRedact(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "debugRedact", value.asInstanceOf[js.Any])
    
    inline def setDebugRedactUndefined: Self = StObject.set(x, "debugRedact", js.undefined)
    
    inline def setDeprecated(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[FieldOptions | PlainMessageFieldOptionsConstructor | Null] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setFields(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.FieldOptions
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromBinaryUndefined: Self = StObject.set(x, "fromBinary", js.undefined)
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.FieldOptions
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.FieldOptions
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setFromJsonStringUndefined: Self = StObject.set(x, "fromJsonString", js.undefined)
    
    inline def setFromJsonUndefined: Self = StObject.set(x, "fromJson", js.undefined)
    
    inline def setGetType(value: () => MessageType[FieldOptions]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setJstype(value: PartialField[js.UndefOr[FieldOptionsJSType]]): Self = StObject.set(x, "jstype", value.asInstanceOf[js.Any])
    
    inline def setJstypeUndefined: Self = StObject.set(x, "jstype", js.undefined)
    
    inline def setLazy(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setPacked(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
    
    inline def setRetention(value: PartialField[js.UndefOr[FieldOptionsOptionRetention]]): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
    
    inline def setRetentionUndefined: Self = StObject.set(x, "retention", js.undefined)
    
    inline def setRuntime(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setTarget(value: PartialField[js.UndefOr[FieldOptionsOptionTargetType]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
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
    
    inline def setUnverifiedLazy(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "unverifiedLazy", value.asInstanceOf[js.Any])
    
    inline def setUnverifiedLazyUndefined: Self = StObject.set(x, "unverifiedLazy", js.undefined)
    
    inline def setWeak(value: PartialField[js.UndefOr[Boolean]]): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
