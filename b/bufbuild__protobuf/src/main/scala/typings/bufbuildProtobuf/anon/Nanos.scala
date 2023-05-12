package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.googleDotprotobufDotTimestamp
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesPrivateReifyWktMod.DescWkt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nanos
  extends StObject
     with DescWkt {
  
  var nanos: DescField
  
  var seconds: DescField
  
  var typeName: googleDotprotobufDotTimestamp
}
object Nanos {
  
  inline def apply(nanos: DescField, seconds: DescField): Nanos = {
    val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], typeName = "google.protobuf.Timestamp")
    __obj.asInstanceOf[Nanos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nanos] (val x: Self) extends AnyVal {
    
    inline def setNanos(value: DescField): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: DescField): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: googleDotprotobufDotTimestamp): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
