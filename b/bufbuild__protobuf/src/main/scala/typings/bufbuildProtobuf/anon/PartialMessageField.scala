package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Field
import typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldCardinality
import typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Option
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialField
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/type_pb.Field> */
trait PartialMessageField extends StObject {
  
  var cardinality: js.UndefOr[PartialField[FieldCardinality]] = js.undefined
  
  @JSName("clone")
  var clone_FPartialMessageField: js.UndefOr[PartialField[js.Function0[Field]]] = js.undefined
  
  var constructor: js.UndefOr[PartialField[js.Function1[/* data */ js.UndefOr[PartialMessage[Field]], Any]]] = js.undefined
  
  var defaultValue: js.UndefOr[PartialField[String]] = js.undefined
  
  @JSName("equals")
  var equals_FPartialMessageField: js.UndefOr[
    PartialField[js.Function1[/* other */ js.UndefOr[Field | PlainMessageField | Null], Boolean]]
  ] = js.undefined
  
  var fields: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var fromBinary: js.UndefOr[
    PartialField[
      js.Function2[
        /* bytes */ js.typedarray.Uint8Array, 
        /* options */ js.UndefOr[PartialBinaryReadOptions], 
        Field
      ]
    ]
  ] = js.undefined
  
  var fromJson: js.UndefOr[
    PartialField[
      js.Function2[/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions], Field]
    ]
  ] = js.undefined
  
  var fromJsonString: js.UndefOr[
    PartialField[
      js.Function2[/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions], Field]
    ]
  ] = js.undefined
  
  var getType: js.UndefOr[PartialField[js.Function0[MessageType[Field]]]] = js.undefined
  
  var jsonName: js.UndefOr[PartialField[String]] = js.undefined
  
  var kind: js.UndefOr[
    PartialField[typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind]
  ] = js.undefined
  
  var name: js.UndefOr[PartialField[String]] = js.undefined
  
  var number: js.UndefOr[PartialField[Double]] = js.undefined
  
  var oneofIndex: js.UndefOr[PartialField[Double]] = js.undefined
  
  var options: js.UndefOr[PartialField[js.Array[Option]]] = js.undefined
  
  var packed: js.UndefOr[PartialField[Boolean]] = js.undefined
  
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
  
  var typeUrl: js.UndefOr[PartialField[String]] = js.undefined
}
object PartialMessageField {
  
  inline def apply(): PartialMessageField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessageField] (val x: Self) extends AnyVal {
    
    inline def setCardinality(value: PartialField[FieldCardinality]): Self = StObject.set(x, "cardinality", value.asInstanceOf[js.Any])
    
    inline def setCardinalityUndefined: Self = StObject.set(x, "cardinality", js.undefined)
    
    inline def setClone_(value: () => Field): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[Field]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setDefaultValue(value: PartialField[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setEquals_(value: /* other */ js.UndefOr[Field | PlainMessageField | Null] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setFields(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => Field
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromBinaryUndefined: Self = StObject.set(x, "fromBinary", js.undefined)
    
    inline def setFromJson(value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => Field): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => Field): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setFromJsonStringUndefined: Self = StObject.set(x, "fromJsonString", js.undefined)
    
    inline def setFromJsonUndefined: Self = StObject.set(x, "fromJson", js.undefined)
    
    inline def setGetType(value: () => MessageType[Field]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setJsonName(value: PartialField[String]): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setKind(value: PartialField[typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.FieldKind]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: PartialField[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: PartialField[Double]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOneofIndex(value: PartialField[Double]): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
    
    inline def setOneofIndexUndefined: Self = StObject.set(x, "oneofIndex", js.undefined)
    
    inline def setOptions(value: PartialField[js.Array[Option]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPacked(value: PartialField[Boolean]): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
    
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
    
    inline def setTypeUrl(value: PartialField[String]): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    inline def setTypeUrlUndefined: Self = StObject.set(x, "typeUrl", js.undefined)
  }
}
