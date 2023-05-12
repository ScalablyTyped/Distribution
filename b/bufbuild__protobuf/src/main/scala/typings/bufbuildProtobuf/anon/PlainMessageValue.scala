package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/struct_pb.Value> */
trait PlainMessageValue extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageValue: PlainField[js.Function0[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value]]
  
  var constructor: PlainField[
    js.Function1[
      /* data */ js.UndefOr[
        PartialMessage[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value]
      ], 
      Any
    ]
  ]
  
  @JSName("equals")
  var equals_FPlainMessageValue: PlainField[
    js.Function1[
      /* other */ js.UndefOr[
        typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value | PlainMessage[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value] | Null
      ], 
      Boolean
    ]
  ]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* json */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[
      /* jsonString */ String, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value
    ]
  ]
  
  var getType: PlainField[
    js.Function0[MessageType[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value]]
  ]
  
  var kind: PlainField[
    Case | Value | CaseValue | ValueBoolean | ValueStruct | ValueListValue | CaseUndefined
  ]
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
}
object PlainMessageValue {
  
  inline def apply(
    clone_ : () => typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value,
    constructor: /* data */ js.UndefOr[
      PartialMessage[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value]
    ] => Any,
    equals_ : /* other */ js.UndefOr[
      typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value | PlainMessage[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value] | Null
    ] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value,
    fromJson: (/* json */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value,
    getType: () => MessageType[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value],
    kind: PlainField[
      Case | Value | CaseValue | ValueBoolean | ValueStruct | ValueListValue | CaseUndefined
    ],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String
  ): PlainMessageValue = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), kind = kind.asInstanceOf[js.Any], toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString))
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageValue] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(
      value: /* data */ js.UndefOr[
          PartialMessage[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value]
        ] => Any
    ): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[
          typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value | PlainMessage[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value] | Null
        ] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* json */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Value]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setKind(
      value: PlainField[
          Case | Value | CaseValue | ValueBoolean | ValueStruct | ValueListValue | CaseUndefined
        ]
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
