package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotInt64Value
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11`
  extends StObject
     with DescWkt {
  
  var typeName: googleDotprotobufDotInt64Value
  
  var value: DescField & `9`
}
object `11` {
  
  inline def apply(value: DescField & `9`): `11` = {
    val __obj = js.Dynamic.literal(typeName = "google.protobuf.Int64Value", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `11`] (val x: Self) extends AnyVal {
    
    inline def setTypeName(value: googleDotprotobufDotInt64Value): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DescField & `9`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
