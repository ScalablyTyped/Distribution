package typings.cyclonedx.mod

import typings.cyclonedx.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentV13
  extends StObject
     with ComponentBase {
  
  var components: js.UndefOr[js.Array[ComponentV13]] = js.undefined
  
  var evidence: js.UndefOr[Evidence] = js.undefined
  
  var pedigree: js.UndefOr[Pedigree[ComponentV13]] = js.undefined
  
  var properties: js.UndefOr[Properties] = js.undefined
  
  var version: String
}
object ComponentV13 {
  
  inline def apply(name: String, `type`: ComponentType, version: String): ComponentV13 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentV13]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentV13] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: js.Array[ComponentV13]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: ComponentV13*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setEvidence(value: Evidence): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
    
    inline def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    
    inline def setPedigree(value: Pedigree[ComponentV13]): Self = StObject.set(x, "pedigree", value.asInstanceOf[js.Any])
    
    inline def setPedigreeUndefined: Self = StObject.set(x, "pedigree", js.undefined)
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: Name*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
