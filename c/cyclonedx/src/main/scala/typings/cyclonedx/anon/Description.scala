package typings.cyclonedx.anon

import typings.cyclonedx.cyclonedxStrings.defect
import typings.cyclonedx.cyclonedxStrings.enhancement
import typings.cyclonedx.cyclonedxStrings.security
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var references: js.Array[String]
  
  var source: js.UndefOr[typings.cyclonedx.mod.Source] = js.undefined
  
  var `type`: defect | enhancement | security
}
object Description {
  
  inline def apply(references: js.Array[String], `type`: defect | enhancement | security): Description = {
    val __obj = js.Dynamic.literal(references = references.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setSource(value: typings.cyclonedx.mod.Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: defect | enhancement | security): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
