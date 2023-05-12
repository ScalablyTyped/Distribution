package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotBoolValue
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15`
  extends StObject
     with DescWkt {
  
  var typeName: googleDotprotobufDotBoolValue
  
  var value: DescField & `9`
}
object `15` {
  
  inline def apply(value: DescField & `9`): `15` = {
    val __obj = js.Dynamic.literal(typeName = "google.protobuf.BoolValue", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `15`] (val x: Self) extends AnyVal {
    
    inline def setTypeName(value: googleDotprotobufDotBoolValue): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DescField & `9`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
