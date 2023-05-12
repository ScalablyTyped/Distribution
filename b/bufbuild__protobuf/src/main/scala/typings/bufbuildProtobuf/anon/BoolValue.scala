package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotValue
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescOneof
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoolValue
  extends StObject
     with DescWkt {
  
  var boolValue: DescField
  
  var kind: DescOneof
  
  var listValue: DescField & `8`
  
  var nullValue: DescField & `7`
  
  var numberValue: DescField
  
  var stringValue: DescField
  
  var structValue: DescField & `8`
  
  var typeName: googleDotprotobufDotValue
}
object BoolValue {
  
  inline def apply(
    boolValue: DescField,
    kind: DescOneof,
    listValue: DescField & `8`,
    nullValue: DescField & `7`,
    numberValue: DescField,
    stringValue: DescField,
    structValue: DescField & `8`
  ): BoolValue = {
    val __obj = js.Dynamic.literal(boolValue = boolValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], listValue = listValue.asInstanceOf[js.Any], nullValue = nullValue.asInstanceOf[js.Any], numberValue = numberValue.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any], structValue = structValue.asInstanceOf[js.Any], typeName = "google.protobuf.Value")
    __obj.asInstanceOf[BoolValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoolValue] (val x: Self) extends AnyVal {
    
    inline def setBoolValue(value: DescField): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setKind(value: DescOneof): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setListValue(value: DescField & `8`): Self = StObject.set(x, "listValue", value.asInstanceOf[js.Any])
    
    inline def setNullValue(value: DescField & `7`): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValue(value: DescField): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    inline def setStringValue(value: DescField): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStructValue(value: DescField & `8`): Self = StObject.set(x, "structValue", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: googleDotprotobufDotValue): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
