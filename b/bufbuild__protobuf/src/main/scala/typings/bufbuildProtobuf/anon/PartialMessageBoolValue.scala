package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialField
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb.BoolValue> */
trait PartialMessageBoolValue extends StObject {
  
  @JSName("clone")
  var clone_FPartialMessageBoolValue: js.UndefOr[
    PartialField[
      js.Function0[typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue]
    ]
  ] = js.undefined
  
  var constructor: js.UndefOr[
    PartialField[
      js.Function1[
        /* data */ js.UndefOr[
          PartialMessage[typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue]
        ], 
        Any
      ]
    ]
  ] = js.undefined
  
  @JSName("equals")
  var equals_FPartialMessageBoolValue: js.UndefOr[
    PartialField[
      js.Function1[
        /* other */ js.UndefOr[
          typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue | PlainMessageBoolValue | Null
        ], 
        Boolean
      ]
    ]
  ] = js.undefined
  
  var fieldWrapper: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var fields: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var fromBinary: js.UndefOr[
    PartialField[
      js.Function2[
        /* bytes */ js.typedarray.Uint8Array, 
        /* options */ js.UndefOr[PartialBinaryReadOptions], 
        typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue
      ]
    ]
  ] = js.undefined
  
  var fromJson: js.UndefOr[
    PartialField[
      js.Function2[
        /* json */ JsonValue, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue
      ]
    ]
  ] = js.undefined
  
  var fromJsonString: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonString */ String, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue
      ]
    ]
  ] = js.undefined
  
  var getType: js.UndefOr[
    PartialField[
      js.Function0[
        MessageType[typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue]
      ]
    ]
  ] = js.undefined
  
  var runtime: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
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
  
  var value: js.UndefOr[PartialField[Boolean]] = js.undefined
}
object PartialMessageBoolValue {
  
  inline def apply(): PartialMessageBoolValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageBoolValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessageBoolValue] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setConstructor(
      value: /* data */ js.UndefOr[
          PartialMessage[typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue]
        ] => Any
    ): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[
          typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue | PlainMessageBoolValue | Null
        ] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setFieldWrapper(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "fieldWrapper", value.asInstanceOf[js.Any])
    
    inline def setFieldWrapperUndefined: Self = StObject.set(x, "fieldWrapper", js.undefined)
    
    inline def setFields(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromBinaryUndefined: Self = StObject.set(x, "fromBinary", js.undefined)
    
    inline def setFromJson(
      value: (/* json */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setFromJsonStringUndefined: Self = StObject.set(x, "fromJsonString", js.undefined)
    
    inline def setFromJsonUndefined: Self = StObject.set(x, "fromJson", js.undefined)
    
    inline def setGetType(value: () => MessageType[typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setRuntime(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToBinaryUndefined: Self = StObject.set(x, "toBinary", js.undefined)
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setToJsonStringUndefined: Self = StObject.set(x, "toJsonString", js.undefined)
    
    inline def setTypeName(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setValue(value: PartialField[Boolean]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
