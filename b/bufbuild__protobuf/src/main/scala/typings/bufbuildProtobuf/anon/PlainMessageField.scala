package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Field
import typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldCardinality
import typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Option
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/type_pb.Field> */
trait PlainMessageField extends StObject {
  
  var cardinality: PlainField[FieldCardinality]
  
  @JSName("clone")
  var clone_FPlainMessageField: PlainField[js.Function0[Field]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessage[Field]], Any]]
  
  var defaultValue: PlainField[String]
  
  @JSName("equals")
  var equals_FPlainMessageField: PlainField[
    js.Function1[/* other */ js.UndefOr[Field | PlainMessage[Field] | Null], Boolean]
  ]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      Field
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions], Field]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions], Field]
  ]
  
  var getType: PlainField[js.Function0[MessageType[Field]]]
  
  var jsonName: PlainField[String]
  
  var kind: PlainField[typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind]
  
  var name: PlainField[String]
  
  var number: PlainField[Double]
  
  var oneofIndex: PlainField[Double]
  
  var options: PlainField[js.Array[Option]]
  
  var packed: PlainField[Boolean]
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var typeName: PlainField[js.UndefOr[Any]]
  
  var typeUrl: PlainField[String]
}
object PlainMessageField {
  
  inline def apply(
    cardinality: PlainField[FieldCardinality],
    clone_ : () => Field,
    constructor: /* data */ js.UndefOr[PartialMessage[Field]] => Any,
    defaultValue: PlainField[String],
    equals_ : /* other */ js.UndefOr[Field | PlainMessage[Field] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => Field,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => Field,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => Field,
    getType: () => MessageType[Field],
    jsonName: PlainField[String],
    kind: PlainField[typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind],
    name: PlainField[String],
    number: PlainField[Double],
    oneofIndex: PlainField[Double],
    options: PlainField[js.Array[Option]],
    packed: PlainField[Boolean],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String,
    typeUrl: PlainField[String]
  ): PlainMessageField = {
    val __obj = js.Dynamic.literal(cardinality = cardinality.asInstanceOf[js.Any], constructor = js.Any.fromFunction1(constructor), defaultValue = defaultValue.asInstanceOf[js.Any], fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), jsonName = jsonName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], oneofIndex = oneofIndex.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString), typeUrl = typeUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageField] (val x: Self) extends AnyVal {
    
    inline def setCardinality(value: PlainField[FieldCardinality]): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    inline def setClone_(value: () => Field): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[Field]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setDefaultValue(value: PlainField[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: /* other */ js.UndefOr[Field | PlainMessage[Field] | Null] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => Field
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => Field): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => Field): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[Field]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setJsonName(value: PlainField[String]): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setKind(value: PlainField[typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: PlainField[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: PlainField[Double]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOneofIndex(value: PlainField[Double]): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PlainField[js.Array[Option]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPacked(value: PlainField[Boolean]): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setTypeUrl(value: PlainField[String]): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
  }
}
