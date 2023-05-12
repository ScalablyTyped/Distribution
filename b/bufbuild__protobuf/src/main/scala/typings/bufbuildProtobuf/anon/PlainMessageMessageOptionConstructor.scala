package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.MessageOptions
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.UninterpretedOption
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.MessageOptions> */
trait PlainMessageMessageOptionConstructor extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageMessageOptionConstructor: PlainField[js.Function0[MessageOptions]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessage[MessageOptions]], Any]]
  
  var deprecated: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  var deprecatedLegacyJsonFieldConflicts: js.UndefOr[PlainField[js.UndefOr[Boolean]]] = js.undefined
  
  @JSName("equals")
  var equals_FPlainMessageMessageOptionConstructor: PlainField[
    js.Function1[
      /* other */ js.UndefOr[MessageOptions | PlainMessage[MessageOptions] | Null], 
      Boolean
    ]
  ]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      typings.bufbuildProtobuf.mod.MessageOptions
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* jsonValue */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.MessageOptions
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[
      /* jsonString */ String, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.MessageOptions
    ]
  ]
  
  var getType: PlainField[js.Function0[MessageType[MessageOptions]]]
  
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
object PlainMessageMessageOptionConstructor {
  
  inline def apply(
    clone_ : () => MessageOptions,
    constructor: /* data */ js.UndefOr[PartialMessage[MessageOptions]] => Any,
    equals_ : /* other */ js.UndefOr[MessageOptions | PlainMessage[MessageOptions] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.MessageOptions,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.MessageOptions,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.MessageOptions,
    getType: () => MessageType[MessageOptions],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String,
    uninterpretedOption: PlainField[js.Array[UninterpretedOption]]
  ): PlainMessageMessageOptionConstructor = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString), uninterpretedOption = uninterpretedOption.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageMessageOptionConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageMessageOptionConstructor] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => MessageOptions): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[MessageOptions]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setDeprecated(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedLegacyJsonFieldConflicts(value: PlainField[js.UndefOr[Boolean]]): Self = StObject.set(x, "deprecatedLegacyJsonFieldConflicts", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedLegacyJsonFieldConflictsUndefined: Self = StObject.set(x, "deprecatedLegacyJsonFieldConflicts", js.undefined)
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setEquals_(value: /* other */ js.UndefOr[MessageOptions | PlainMessage[MessageOptions] | Null] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.MessageOptions
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.MessageOptions
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.MessageOptions
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[MessageOptions]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
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
