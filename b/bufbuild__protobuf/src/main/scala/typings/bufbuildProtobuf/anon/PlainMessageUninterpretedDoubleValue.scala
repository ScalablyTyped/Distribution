package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.UninterpretedOption
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.UninterpretedOptionNamePart
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.UninterpretedOption> */
trait PlainMessageUninterpretedDoubleValue extends StObject {
  
  var aggregateValue: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  @JSName("clone")
  var clone_FPlainMessageUninterpretedDoubleValue: PlainField[js.Function0[UninterpretedOption]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessage[UninterpretedOption]], Any]]
  
  var doubleValue: js.UndefOr[PlainField[js.UndefOr[Double]]] = js.undefined
  
  @JSName("equals")
  var equals_FPlainMessageUninterpretedDoubleValue: PlainField[
    js.Function1[
      /* other */ js.UndefOr[UninterpretedOption | PlainMessage[UninterpretedOption] | Null], 
      Boolean
    ]
  ]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      typings.bufbuildProtobuf.mod.UninterpretedOption
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* jsonValue */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.UninterpretedOption
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[
      /* jsonString */ String, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.UninterpretedOption
    ]
  ]
  
  var getType: PlainField[js.Function0[MessageType[UninterpretedOption]]]
  
  var identifierValue: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var name: PlainField[js.Array[UninterpretedOptionNamePart]]
  
  var negativeIntValue: js.UndefOr[PlainField[js.UndefOr[js.BigInt]]] = js.undefined
  
  var positiveIntValue: js.UndefOr[PlainField[js.UndefOr[js.BigInt]]] = js.undefined
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var stringValue: js.UndefOr[PlainField[js.UndefOr[js.typedarray.Uint8Array]]] = js.undefined
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
}
object PlainMessageUninterpretedDoubleValue {
  
  inline def apply(
    clone_ : () => UninterpretedOption,
    constructor: /* data */ js.UndefOr[PartialMessage[UninterpretedOption]] => Any,
    equals_ : /* other */ js.UndefOr[UninterpretedOption | PlainMessage[UninterpretedOption] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.UninterpretedOption,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.UninterpretedOption,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.UninterpretedOption,
    getType: () => MessageType[UninterpretedOption],
    name: PlainField[js.Array[UninterpretedOptionNamePart]],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String
  ): PlainMessageUninterpretedDoubleValue = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), name = name.asInstanceOf[js.Any], toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString))
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageUninterpretedDoubleValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageUninterpretedDoubleValue] (val x: Self) extends AnyVal {
    
    inline def setAggregateValue(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "aggregateValue", value.asInstanceOf[js.Any])
    
    inline def setAggregateValueUndefined: Self = StObject.set(x, "aggregateValue", js.undefined)
    
    inline def setClone_(value: () => UninterpretedOption): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[UninterpretedOption]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setDoubleValue(value: PlainField[js.UndefOr[Double]]): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[UninterpretedOption | PlainMessage[UninterpretedOption] | Null] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.UninterpretedOption
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.UninterpretedOption
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.UninterpretedOption
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[UninterpretedOption]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setIdentifierValue(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "identifierValue", value.asInstanceOf[js.Any])
    
    inline def setIdentifierValueUndefined: Self = StObject.set(x, "identifierValue", js.undefined)
    
    inline def setName(value: PlainField[js.Array[UninterpretedOptionNamePart]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: UninterpretedOptionNamePart*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setNegativeIntValue(value: PlainField[js.UndefOr[js.BigInt]]): Self = StObject.set(x, "negativeIntValue", value.asInstanceOf[js.Any])
    
    inline def setNegativeIntValueUndefined: Self = StObject.set(x, "negativeIntValue", js.undefined)
    
    inline def setPositiveIntValue(value: PlainField[js.UndefOr[js.BigInt]]): Self = StObject.set(x, "positiveIntValue", value.asInstanceOf[js.Any])
    
    inline def setPositiveIntValueUndefined: Self = StObject.set(x, "positiveIntValue", js.undefined)
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setStringValue(value: PlainField[js.UndefOr[js.typedarray.Uint8Array]]): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
