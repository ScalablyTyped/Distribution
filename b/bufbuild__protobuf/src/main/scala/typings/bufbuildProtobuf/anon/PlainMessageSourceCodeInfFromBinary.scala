package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.SourceCodeInfoLocation
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainField
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.SourceCodeInfo_Location> */
trait PlainMessageSourceCodeInfFromBinary extends StObject {
  
  @JSName("clone")
  var clone_FPlainMessageSourceCodeInfFromBinary: PlainField[js.Function0[SourceCodeInfoLocation]]
  
  var constructor: PlainField[js.Function1[/* data */ js.UndefOr[PartialMessage[SourceCodeInfoLocation]], Any]]
  
  @JSName("equals")
  var equals_FPlainMessageSourceCodeInfFromBinary: PlainField[
    js.Function1[
      /* other */ js.UndefOr[SourceCodeInfoLocation | PlainMessage[SourceCodeInfoLocation] | Null], 
      Boolean
    ]
  ]
  
  var fields: PlainField[js.UndefOr[Any]]
  
  var fromBinary: PlainField[
    js.Function2[
      /* bytes */ js.typedarray.Uint8Array, 
      /* options */ js.UndefOr[PartialBinaryReadOptions], 
      typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
    ]
  ]
  
  var fromJson: PlainField[
    js.Function2[
      /* jsonValue */ JsonValue, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
    ]
  ]
  
  var fromJsonString: PlainField[
    js.Function2[
      /* jsonString */ String, 
      /* options */ js.UndefOr[PartialJsonReadOptions], 
      typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
    ]
  ]
  
  var getType: PlainField[js.Function0[MessageType[SourceCodeInfoLocation]]]
  
  var leadingComments: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var leadingDetachedComments: PlainField[js.Array[String]]
  
  var path: PlainField[js.Array[Double]]
  
  var runtime: PlainField[js.UndefOr[Any]]
  
  var span: PlainField[js.Array[Double]]
  
  var toBinary: PlainField[
    js.Function1[/* options */ js.UndefOr[PartialBinaryWriteOptions], js.typedarray.Uint8Array]
  ]
  
  var toJSON: PlainField[js.Function0[JsonValue]]
  
  var toJson: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteOptions], JsonValue]]
  
  var toJsonString: PlainField[js.Function1[/* options */ js.UndefOr[PartialJsonWriteStringOpt], String]]
  
  var trailingComments: js.UndefOr[PlainField[js.UndefOr[String]]] = js.undefined
  
  var typeName: PlainField[js.UndefOr[Any]]
}
object PlainMessageSourceCodeInfFromBinary {
  
  inline def apply(
    clone_ : () => SourceCodeInfoLocation,
    constructor: /* data */ js.UndefOr[PartialMessage[SourceCodeInfoLocation]] => Any,
    equals_ : /* other */ js.UndefOr[SourceCodeInfoLocation | PlainMessage[SourceCodeInfoLocation] | Null] => Boolean,
    fromBinary: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.SourceCodeInfoLocation,
    fromJson: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.SourceCodeInfoLocation,
    fromJsonString: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.SourceCodeInfoLocation,
    getType: () => MessageType[SourceCodeInfoLocation],
    leadingDetachedComments: PlainField[js.Array[String]],
    path: PlainField[js.Array[Double]],
    span: PlainField[js.Array[Double]],
    toBinary: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array,
    toJSON: () => JsonValue,
    toJson: /* options */ js.UndefOr[PartialJsonWriteOptions] => JsonValue,
    toJsonString: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String
  ): PlainMessageSourceCodeInfFromBinary = {
    val __obj = js.Dynamic.literal(constructor = js.Any.fromFunction1(constructor), fromBinary = js.Any.fromFunction2(fromBinary), fromJson = js.Any.fromFunction2(fromJson), fromJsonString = js.Any.fromFunction2(fromJsonString), getType = js.Any.fromFunction0(getType), leadingDetachedComments = leadingDetachedComments.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], toBinary = js.Any.fromFunction1(toBinary), toJSON = js.Any.fromFunction0(toJSON), toJson = js.Any.fromFunction1(toJson), toJsonString = js.Any.fromFunction1(toJsonString))
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PlainMessageSourceCodeInfFromBinary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainMessageSourceCodeInfFromBinary] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => SourceCodeInfoLocation): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[SourceCodeInfoLocation]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[SourceCodeInfoLocation | PlainMessage[SourceCodeInfoLocation] | Null] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setGetType(value: () => MessageType[SourceCodeInfoLocation]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setLeadingComments(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
    
    inline def setLeadingDetachedComments(value: PlainField[js.Array[String]]): Self = StObject.set(x, "leadingDetachedComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingDetachedCommentsVarargs(value: String*): Self = StObject.set(x, "leadingDetachedComments", js.Array(value*))
    
    inline def setPath(value: PlainField[js.Array[Double]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRuntime(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSpan(value: PlainField[js.Array[Double]]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanVarargs(value: Double*): Self = StObject.set(x, "span", js.Array(value*))
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setTrailingComments(value: PlainField[js.UndefOr[String]]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
    
    inline def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
    
    inline def setTypeName(value: PlainField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
