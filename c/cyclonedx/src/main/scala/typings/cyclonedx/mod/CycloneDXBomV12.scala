package typings.cyclonedx.mod

import typings.cyclonedx.cyclonedxStrings.`1Dot2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CycloneDXBomV12
  extends StObject
     with CycloneDXBase[ComponentV12]
     with CycloneDXBom {
  
  var metadata: js.UndefOr[MetadataBase[ToolV12, ComponentV12]] = js.undefined
  
  var services: js.UndefOr[js.Array[ServiceV12]] = js.undefined
  
  var specVersion: `1Dot2`
}
object CycloneDXBomV12 {
  
  inline def apply(version: Integer): CycloneDXBomV12 = {
    val __obj = js.Dynamic.literal(bomFormat = "CycloneDX", specVersion = "1.2", version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CycloneDXBomV12]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CycloneDXBomV12] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: MetadataBase[ToolV12, ComponentV12]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setServices(value: js.Array[ServiceV12]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: ServiceV12*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setSpecVersion(value: `1Dot2`): Self = StObject.set(x, "specVersion", value.asInstanceOf[js.Any])
  }
}
