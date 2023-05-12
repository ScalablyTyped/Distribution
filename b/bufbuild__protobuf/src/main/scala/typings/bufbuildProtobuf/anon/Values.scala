package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotListValue
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Values
  extends StObject
     with DescWkt {
  
  var typeName: googleDotprotobufDotListValue
  
  var values: DescField & `8`
}
object Values {
  
  inline def apply(values: DescField & `8`): Values = {
    val __obj = js.Dynamic.literal(typeName = "google.protobuf.ListValue", values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Values] (val x: Self) extends AnyVal {
    
    inline def setTypeName(value: googleDotprotobufDotListValue): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setValues(value: DescField & `8`): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
