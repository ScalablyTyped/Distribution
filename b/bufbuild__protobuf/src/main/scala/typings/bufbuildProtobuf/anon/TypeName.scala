package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotAny
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeName
  extends StObject
     with DescWkt {
  
  var typeName: googleDotprotobufDotAny
  
  var typeUrl: DescField
  
  var value: DescField
}
object TypeName {
  
  inline def apply(typeUrl: DescField, value: DescField): TypeName = {
    val __obj = js.Dynamic.literal(typeName = "google.protobuf.Any", typeUrl = typeUrl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeName] (val x: Self) extends AnyVal {
    
    inline def setTypeName(value: googleDotprotobufDotAny): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeUrl(value: DescField): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DescField): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
