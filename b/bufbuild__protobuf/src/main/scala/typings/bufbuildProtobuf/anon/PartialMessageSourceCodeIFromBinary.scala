package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.SourceCodeInfoLocation
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.PartialField
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb.SourceCodeInfo_Location> */
trait PartialMessageSourceCodeIFromBinary extends StObject {
  
  @JSName("clone")
  var clone_FPartialMessageSourceCodeIFromBinary: js.UndefOr[PartialField[js.Function0[SourceCodeInfoLocation]]] = js.undefined
  
  var constructor: js.UndefOr[
    PartialField[js.Function1[/* data */ js.UndefOr[PartialMessage[SourceCodeInfoLocation]], Any]]
  ] = js.undefined
  
  @JSName("equals")
  var equals_FPartialMessageSourceCodeIFromBinary: js.UndefOr[
    PartialField[
      js.Function1[
        /* other */ js.UndefOr[SourceCodeInfoLocation | PlainMessageSourceCodeInfFromBinary | Null], 
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
        typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
      ]
    ]
  ] = js.undefined
  
  var fromJson: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonValue */ JsonValue, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
      ]
    ]
  ] = js.undefined
  
  var fromJsonString: js.UndefOr[
    PartialField[
      js.Function2[
        /* jsonString */ String, 
        /* options */ js.UndefOr[PartialJsonReadOptions], 
        typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
      ]
    ]
  ] = js.undefined
  
  var getType: js.UndefOr[PartialField[js.Function0[MessageType[SourceCodeInfoLocation]]]] = js.undefined
  
  var leadingComments: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var leadingDetachedComments: js.UndefOr[PartialField[js.Array[String]]] = js.undefined
  
  var path: js.UndefOr[PartialField[js.Array[Double]]] = js.undefined
  
  var runtime: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
  
  var span: js.UndefOr[PartialField[js.Array[Double]]] = js.undefined
  
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
  
  var trailingComments: js.UndefOr[PartialField[js.UndefOr[String]]] = js.undefined
  
  var typeName: js.UndefOr[PartialField[js.UndefOr[Any]]] = js.undefined
}
object PartialMessageSourceCodeIFromBinary {
  
  inline def apply(): PartialMessageSourceCodeIFromBinary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMessageSourceCodeIFromBinary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMessageSourceCodeIFromBinary] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: () => SourceCodeInfoLocation): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    inline def setConstructor(value: /* data */ js.UndefOr[PartialMessage[SourceCodeInfoLocation]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setEquals_(
      value: /* other */ js.UndefOr[SourceCodeInfoLocation | PlainMessageSourceCodeInfFromBinary | Null] => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setFields(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFromBinary(
      value: (/* bytes */ js.typedarray.Uint8Array, /* options */ js.UndefOr[PartialBinaryReadOptions]) => typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
    ): Self = StObject.set(x, "fromBinary", js.Any.fromFunction2(value))
    
    inline def setFromBinaryUndefined: Self = StObject.set(x, "fromBinary", js.undefined)
    
    inline def setFromJson(
      value: (/* jsonValue */ JsonValue, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
    ): Self = StObject.set(x, "fromJson", js.Any.fromFunction2(value))
    
    inline def setFromJsonString(
      value: (/* jsonString */ String, /* options */ js.UndefOr[PartialJsonReadOptions]) => typings.bufbuildProtobuf.mod.SourceCodeInfoLocation
    ): Self = StObject.set(x, "fromJsonString", js.Any.fromFunction2(value))
    
    inline def setFromJsonStringUndefined: Self = StObject.set(x, "fromJsonString", js.undefined)
    
    inline def setFromJsonUndefined: Self = StObject.set(x, "fromJson", js.undefined)
    
    inline def setGetType(value: () => MessageType[SourceCodeInfoLocation]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setLeadingComments(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingCommentsUndefined: Self = StObject.set(x, "leadingComments", js.undefined)
    
    inline def setLeadingDetachedComments(value: PartialField[js.Array[String]]): Self = StObject.set(x, "leadingDetachedComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingDetachedCommentsUndefined: Self = StObject.set(x, "leadingDetachedComments", js.undefined)
    
    inline def setLeadingDetachedCommentsVarargs(value: String*): Self = StObject.set(x, "leadingDetachedComments", js.Array(value*))
    
    inline def setPath(value: PartialField[js.Array[Double]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRuntime(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSpan(value: PartialField[js.Array[Double]]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setSpanVarargs(value: Double*): Self = StObject.set(x, "span", js.Array(value*))
    
    inline def setToBinary(value: /* options */ js.UndefOr[PartialBinaryWriteOptions] => js.typedarray.Uint8Array): Self = StObject.set(x, "toBinary", js.Any.fromFunction1(value))
    
    inline def setToBinaryUndefined: Self = StObject.set(x, "toBinary", js.undefined)
    
    inline def setToJSON(value: () => JsonValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
    
    inline def setToJsonString(value: /* options */ js.UndefOr[PartialJsonWriteStringOpt] => String): Self = StObject.set(x, "toJsonString", js.Any.fromFunction1(value))
    
    inline def setToJsonStringUndefined: Self = StObject.set(x, "toJsonString", js.undefined)
    
    inline def setTrailingComments(value: PartialField[js.UndefOr[String]]): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
    
    inline def setTrailingCommentsUndefined: Self = StObject.set(x, "trailingComments", js.undefined)
    
    inline def setTypeName(value: PartialField[js.UndefOr[Any]]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
  }
}
