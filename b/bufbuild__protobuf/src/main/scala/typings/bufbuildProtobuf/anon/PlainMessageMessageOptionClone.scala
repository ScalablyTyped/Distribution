package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.UninterpretedOption
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.MessageOptions> */
trait PlainMessageMessageOptionClone extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageMessageOptionClone: PlainField[js.Function0[this.type]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessageMessageOptiClone], Any]]
  
  var deprecated: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var deprecatedLegacyJsonFieldConflicts: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  @JSName("equals")
  var equals_FPlainMessageMessageOptionClone: PlainField[
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
  
  var mapEntry: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var messageSetWireFormat: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var noStandardDescriptorAccessor: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
  
  var uninterpretedOption: PlainField[js.Array[UninterpretedOption]]
}
object PlainMessageMessageOptionClone {
  
  inline def apply(
    clone_ : () => PlainMessageMessageOptionClone,
    constructor: /* data */ js.UndefOr[PartialMessageMessageOptiClone] => Any,
    equals_ : /* other */ js.UndefOr[
      PlainMessageMessageOptionClone | PlainMessage[PlainMessageMessageOptionClone] | Null
    ] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageMessageOptionClone,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageMessageOptionClone,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageMessageOptionClone,
    getType: () => MessageType[PlainMessageMessageOptionClone],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String,
    uninterpretedOption: PlainField[js.Array[UninterpretedOption]]
  ): PlainMessageMessageOptionClone = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString), uninterpretedOption = uninterpretedOption.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageMessageOptionClone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageMessageOptionClone] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => PlainMessageMessageOptionClone): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessageMessageOptiClone] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setDeprecated(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedLegacyJsonFieldConflicts(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "deprecatedLegacyJsonFieldConflicts", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedLegacyJsonFieldConflictsUndefined: Self = StObject.set(x, "deprecatedLegacyJsonFieldConflicts", js.undefined)
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[
          PlainMessageMessageOptionClone | PlainMessage[PlainMessageMessageOptionClone] | Null
        ] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => PlainMessageMessageOptionClone
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageMessageOptionClone
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => PlainMessageMessageOptionClone
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[PlainMessageMessageOptionClone]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setMapEntry(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "mapEntry", value.asInstanceOf[js.Any])
    
    inline def setMapEntryUndefined: Self = StObject.set(x, "mapEntry", js.undefined)
    
    inline def setMessageSetWireFormat(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "messageSetWireFormat", value.asInstanceOf[js.Any])
    
    inline def setMessageSetWireFormatUndefined: Self = StObject.set(x, "messageSetWireFormat", js.undefined)
    
    inline def setNoStandardDescriptorAccessor(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "noStandardDescriptorAccessor", value.asInstanceOf[js.Any])
    
    inline def setNoStandardDescriptorAccessorUndefined: Self = StObject.set(x, "noStandardDescriptorAccessor", js.undefined)
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setUninterpretedOption(value: PlainField[js.Array[UninterpretedOption]]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionVarargs(value: UninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
