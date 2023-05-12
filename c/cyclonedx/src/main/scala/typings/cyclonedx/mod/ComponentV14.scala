package typings.cyclonedx.mod

import typings.cyclonedx.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentV14
  extends StObject
     with ComponentBase {
  
  var components: js.UndefOr[js.Array[ComponentV14]] = js.undefined
  
  var evidence: js.UndefOr[Evidence] = js.undefined
  
  var pedigree: js.UndefOr[Pedigree[ComponentV14]] = js.undefined
  
  var properties: js.UndefOr[Properties] = js.undefined
  
  var releaseNotes: js.UndefOr[ReleaseNotes] = js.undefined
  
  var signature: js.UndefOr[Signature] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object ComponentV14 {
  
  inline def apply(name: String, `type`: ComponentType): ComponentV14 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentV14]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentV14] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: js.Array[ComponentV14]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: ComponentV14*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setEvidence(value: Evidence): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setPedigree(value: Pedigree[ComponentV14]): Self = StObject.set(x, "pedigree", value.asInstanceOf[js.Any])
    
    inline def setPedigreeUndefined: Self = StObject.set(x, "pedigree", js.undefined)
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: Name*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setReleaseNotes(value: ReleaseNotes): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesUndefined: Self = StObject.set(x, "releaseNotes", js.undefined)
    
    inline def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
