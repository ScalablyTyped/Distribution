package typings.cyclonedx.mod

import typings.cyclonedx.anon.CompositionBasesignatureS
import typings.cyclonedx.anon.MetadataBaseToolV13ComponAuthors
import typings.cyclonedx.cyclonedxStrings.`1Dot4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CycloneDXBomV14
  extends StObject
     with CycloneDXBase[ComponentV14]
     with CycloneDXBom {
  
  var compositions: js.UndefOr[js.Array[CompositionBasesignatureS]] = js.undefined
  
  var metadata: js.UndefOr[MetadataBaseToolV13ComponAuthors] = js.undefined
  
  var services: js.UndefOr[js.Array[ServiceV14]] = js.undefined
  
  var signature: js.UndefOr[Signature] = js.undefined
  
  var specVersion: `1Dot4`
  
  var vulnerabilities: js.UndefOr[js.Array[Vulnerability]] = js.undefined
}
object CycloneDXBomV14 {
  
  inline def apply(version: Integer): CycloneDXBomV14 = {
    val __obj = js.Dynamic.literal(bomFormat = "CycloneDX", specVersion = "1.4", version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CycloneDXBomV14]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CycloneDXBomV14] (val x: Self) extends AnyVal {
    
    inline def setCompositions(value: js.Array[CompositionBasesignatureS]): Self = StObject.set(x, "compositions", value.asInstanceOf[js.Any])
    
    inline def setCompositionsUndefined: Self = StObject.set(x, "compositions", js.undefined)
    
    inline def setCompositionsVarargs(value: CompositionBasesignatureS*): Self = StObject.set(x, "compositions", js.Array(value*))
    
    inline def setMetadata(value: MetadataBaseToolV13ComponAuthors): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setServices(value: js.Array[ServiceV14]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: ServiceV14*): Self = StObject.set(x, "services", js.Array(value*))
    
    inline def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSpecVersion(value: `1Dot4`): Self = StObject.set(x, "specVersion", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilities(value: js.Array[Vulnerability]): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesUndefined: Self = StObject.set(x, "vulnerabilities", js.undefined)
    
    inline def setVulnerabilitiesVarargs(value: Vulnerability*): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
  }
}
