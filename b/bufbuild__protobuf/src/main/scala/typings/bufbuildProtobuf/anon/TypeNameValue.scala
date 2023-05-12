package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotDoubleValue
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeNameValue
  extends StObject
     with DescWkt {
  
  var typeName: googleDotprotobufDotDoubleValue
  
  var value: DescField & `9`
}
object TypeNameValue {
  
  inline def apply(value: DescField & `9`): TypeNameValue = {
    val __obj = js.Dynamic.literal(typeName = "google.protobuf.DoubleValue", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeNameValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeNameValue] (val x: Self) extends AnyVal {
    
    inline def setTypeName(value: googleDotprotobufDotDoubleValue): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DescField & `9`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
