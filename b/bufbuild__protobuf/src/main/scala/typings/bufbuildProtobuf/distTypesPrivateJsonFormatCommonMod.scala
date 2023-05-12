package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.distTypesEnumMod.EnumType
import typings.bufbuildProtobuf.distTypesFieldMod.FieldInfo
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonFormat
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonWriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateJsonFormatCommonMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/json-format-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeJsonFormatCommon(
    makeWriteField: js.Function2[
      /* writeEnumFn */ js.Function4[
        /* type */ EnumType, 
        /* value */ js.UndefOr[Double], 
        /* emitIntrinsicDefault */ Boolean, 
        /* enumAsInteger */ Boolean, 
        js.UndefOr[JsonValue]
      ], 
      /* writeScalarFn */ js.Function3[
        /* type */ ScalarType, 
        /* value */ Any, 
        /* emitIntrinsicDefault */ Boolean, 
        js.UndefOr[JsonValue]
      ], 
      JsonFormatWriteFieldFn
    ]
  ): JsonFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("makeJsonFormatCommon")(makeWriteField.asInstanceOf[js.Any]).asInstanceOf[JsonFormat]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonFormatWriteFieldFn = (field : @bufbuild/protobuf.@bufbuild/protobuf/dist/types/field.FieldInfo, value : any, options : @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonWriteOptions): @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonValue | undefined
  }}}
  to avoid circular code involving: 
  - @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonObject
  - @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonValue
  - @bufbuild/protobuf.@bufbuild/protobuf/dist/types/private/json-format-common.JsonFormatWriteFieldFn
  */
  @js.native
  trait JsonFormatWriteFieldFn extends StObject {
    
    def apply(field: FieldInfo, value: Any, options: JsonWriteOptions): js.UndefOr[JsonValue] = js.native
  }
}
