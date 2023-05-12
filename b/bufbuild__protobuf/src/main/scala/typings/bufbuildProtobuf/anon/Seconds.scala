package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotDuration
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Seconds
  extends StObject
     with DescWkt {
  
  var nanos: DescField
  
  var seconds: DescField
  
  var typeName: googleDotprotobufDotDuration
}
object Seconds {
  
  inline def apply(nanos: DescField, seconds: DescField): Seconds = {
    val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], typeName = "google.protobuf.Duration")
    __obj.asInstanceOf[Seconds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Seconds] (val x: Self) extends AnyVal {
    
    inline def setNanos(value: DescField): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: DescField): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: googleDotprotobufDotDuration): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
