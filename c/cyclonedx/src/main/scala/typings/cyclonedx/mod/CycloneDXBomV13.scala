package typings.cyclonedx.mod

import typings.cyclonedx.anon.MetadataBaseToolV13Compon
import typings.cyclonedx.cyclonedxStrings.`1Dot3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CycloneDXBomV13
  extends StObject
     with CycloneDXBase[ComponentV13]
     with CycloneDXBom {
  
  var compositions: js.UndefOr[js.Array[CompositionBase]] = js.undefined
  
  var metadata: js.UndefOr[MetadataBaseToolV13Compon] = js.undefined
  
  var services: js.UndefOr[js.Array[ServiceV13]] = js.undefined
  
  var specVersion: `1Dot3`
}
object CycloneDXBomV13 {
  
  inline def apply(version: Integer): CycloneDXBomV13 = {
    val __obj = js.Dynamic.literal(bomFormat = "CycloneDX", specVersion = "1.3", version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CycloneDXBomV13]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CycloneDXBomV13] (val x: Self) extends AnyVal {
    
    inline def setCompositions(value: js.Array[CompositionBase]): Self = StObject.set(x, "compositions", value.asInstanceOf[js.Any])
    
    inline def setCompositionsUndefined: Self = StObject.set(x, "compositions", js.undefined)
    
    inline def setCompositionsVarargs(value: CompositionBase*): Self = StObject.set(x, "compositions", js.Array(value*))
    
    inline def setMetadata(value: MetadataBaseToolV13Compon): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setServices(value: js.Array[ServiceV13]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: ServiceV13*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setSpecVersion(value: `1Dot3`): Self = StObject.set(x, "specVersion", value.asInstanceOf[js.Any])
  }
}
