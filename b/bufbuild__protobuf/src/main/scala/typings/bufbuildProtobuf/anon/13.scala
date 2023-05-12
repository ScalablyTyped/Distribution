package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotInt32Value
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13`
  extends StObject
     with DescWkt {
  
  var typeName: googleDotprotobufDotInt32Value
  
  var value: DescField & `9`
}
object `13` {
  
  inline def apply(value: DescField & `9`): `13` = {
    val __obj = js.Dynamic.literal(typeName = "google.protobuf.Int32Value", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `13`] (val x: Self) extends AnyVal {
    
    inline def setTypeName(value: googleDotprotobufDotInt32Value): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DescField & `9`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
