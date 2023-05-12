package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotBytesValue
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17`
  extends StObject
     with DescWkt {
  
  var typeName: googleDotprotobufDotBytesValue
  
  var value: DescField & `9`
}
object `17` {
  
  inline def apply(value: DescField & `9`): `17` = {
    val __obj = js.Dynamic.literal(typeName = "google.protobuf.BytesValue", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `17`] (val x: Self) extends AnyVal {
    
    inline def setTypeName(value: googleDotprotobufDotBytesValue): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DescField & `9`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
