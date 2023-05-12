package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotUInt32Value
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14`
  extends StObject
     with DescWkt {
  
  var typeName: googleDotprotobufDotUInt32Value
  
  var value: DescField & `9`
}
object `14` {
  
  inline def apply(value: DescField & `9`): `14` = {
    val __obj = js.Dynamic.literal(typeName = "google.protobuf.UInt32Value", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `14`] (val x: Self) extends AnyVal {
    
    inline def setTypeName(value: googleDotprotobufDotUInt32Value): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DescField & `9`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
