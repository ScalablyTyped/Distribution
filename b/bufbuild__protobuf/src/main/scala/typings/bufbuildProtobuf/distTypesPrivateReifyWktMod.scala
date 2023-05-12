package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.FieldKind
import typings.bufbuildProtobuf.anon.`7`
import typings.bufbuildProtobuf.anon.`8`
import typings.bufbuildProtobuf.anon.`9`
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMessage
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescOneof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateReifyWktMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/reify-wkt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reifyWkt(message: DescMessage): js.UndefOr[DescWkt] = ^.asInstanceOf[js.Dynamic].applyDynamic("reifyWkt")(message.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DescWkt]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.bufbuildProtobuf.anon.TypeName
    - typings.bufbuildProtobuf.anon.Nanos
    - typings.bufbuildProtobuf.anon.Seconds
    - typings.bufbuildProtobuf.anon.Fields
    - typings.bufbuildProtobuf.anon.BoolValue
    - typings.bufbuildProtobuf.anon.Values
    - typings.bufbuildProtobuf.anon.Paths
    - typings.bufbuildProtobuf.anon.TypeNameValue
    - typings.bufbuildProtobuf.anon.`10`
    - typings.bufbuildProtobuf.anon.`11`
    - typings.bufbuildProtobuf.anon.`12`
    - typings.bufbuildProtobuf.anon.`13`
    - typings.bufbuildProtobuf.anon.`14`
    - typings.bufbuildProtobuf.anon.`15`
    - typings.bufbuildProtobuf.anon.`16`
    - typings.bufbuildProtobuf.anon.`17`
  */
  trait DescWkt extends StObject
  object DescWkt {
    
    inline def `10`(value: DescField & `9`): typings.bufbuildProtobuf.anon.`10` = {
      val __obj = js.Dynamic.literal(typeName = "google.protobuf.FloatValue", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.`10`]
    }
    
    inline def `11`(value: DescField & `9`): typings.bufbuildProtobuf.anon.`11` = {
      val __obj = js.Dynamic.literal(typeName = "google.protobuf.Int64Value", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.`11`]
    }
    
    inline def `12`(value: DescField & `9`): typings.bufbuildProtobuf.anon.`12` = {
      val __obj = js.Dynamic.literal(typeName = "google.protobuf.UInt64Value", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.`12`]
    }
    
    inline def `13`(value: DescField & `9`): typings.bufbuildProtobuf.anon.`13` = {
      val __obj = js.Dynamic.literal(typeName = "google.protobuf.Int32Value", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.`13`]
    }
    
    inline def `14`(value: DescField & `9`): typings.bufbuildProtobuf.anon.`14` = {
      val __obj = js.Dynamic.literal(typeName = "google.protobuf.UInt32Value", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.`14`]
    }
    
    inline def `15`(value: DescField & `9`): typings.bufbuildProtobuf.anon.`15` = {
      val __obj = js.Dynamic.literal(typeName = "google.protobuf.BoolValue", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.`15`]
    }
    
    inline def `16`(value: DescField & `9`): typings.bufbuildProtobuf.anon.`16` = {
      val __obj = js.Dynamic.literal(typeName = "google.protobuf.StringValue", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.`16`]
    }
    
    inline def `17`(value: DescField & `9`): typings.bufbuildProtobuf.anon.`17` = {
      val __obj = js.Dynamic.literal(typeName = "google.protobuf.BytesValue", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.`17`]
    }
    
    inline def BoolValue(
      boolValue: DescField,
      kind: DescOneof,
      listValue: DescField & `8`,
      nullValue: DescField & `7`,
      numberValue: DescField,
      stringValue: DescField,
      structValue: DescField & `8`
    ): typings.bufbuildProtobuf.anon.BoolValue = {
      val __obj = js.Dynamic.literal(boolValue = boolValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], listValue = listValue.asInstanceOf[js.Any], nullValue = nullValue.asInstanceOf[js.Any], numberValue = numberValue.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any], structValue = structValue.asInstanceOf[js.Any], typeName = "google.protobuf.Value")
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.BoolValue]
    }
    
    inline def Fields(fields: DescField & FieldKind): typings.bufbuildProtobuf.anon.Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], typeName = "google.protobuf.Struct")
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.Fields]
    }
    
    inline def Nanos(nanos: DescField, seconds: DescField): typings.bufbuildProtobuf.anon.Nanos = {
      val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], typeName = "google.protobuf.Timestamp")
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.Nanos]
    }
    
    inline def Paths(paths: DescField): typings.bufbuildProtobuf.anon.Paths = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], typeName = "google.protobuf.FieldMask")
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.Paths]
    }
    
    inline def Seconds(nanos: DescField, seconds: DescField): typings.bufbuildProtobuf.anon.Seconds = {
      val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], typeName = "google.protobuf.Duration")
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.Seconds]
    }
    
    inline def TypeName(typeUrl: DescField, value: DescField): typings.bufbuildProtobuf.anon.TypeName = {
      val __obj = js.Dynamic.literal(typeName = "google.protobuf.Any", typeUrl = typeUrl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.TypeName]
    }
    
    inline def TypeNameValue(value: DescField & `9`): typings.bufbuildProtobuf.anon.TypeNameValue = {
      val __obj = js.Dynamic.literal(typeName = "google.protobuf.DoubleValue", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.TypeNameValue]
    }
    
    inline def Values(values: DescField & `8`): typings.bufbuildProtobuf.anon.Values = {
      val __obj = js.Dynamic.literal(typeName = "google.protobuf.ListValue", values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bufbuildProtobuf.anon.Values]
    }
  }
}
