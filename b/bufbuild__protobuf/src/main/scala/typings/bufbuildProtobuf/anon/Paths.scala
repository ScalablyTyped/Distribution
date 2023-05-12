package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotFieldMask
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paths
  extends StObject
     with DescWkt {
  
  var paths: DescField
  
  var typeName: googleDotprotobufDotFieldMask
}
object Paths {
  
  inline def apply(paths: DescField): Paths = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], typeName = "google.protobuf.FieldMask")
    __obj.asInstanceOf[Paths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paths] (val x: Self) extends AnyVal {
    
    inline def setPaths(value: DescField): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: googleDotprotobufDotFieldMask): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
