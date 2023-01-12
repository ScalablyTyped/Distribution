package typings.complexviewer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  var category: js.UndefOr[String] = js.undefined
  
  var detmethod: js.UndefOr[Detmethod] = js.undefined
  
  var id: String
  
  var linkedFeatures: js.Array[String]
  
  var name: js.UndefOr[String] = js.undefined
  
  var sequenceData: js.Array[SequenceData]
  
  var `type`: Type
}
object Feature {
  
  inline def apply(id: String, linkedFeatures: js.Array[String], sequenceData: js.Array[SequenceData], `type`: Type): Feature = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], linkedFeatures = linkedFeatures.asInstanceOf[js.Any], sequenceData = sequenceData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDetmethod(value: Detmethod): Self = StObject.set(x, "detmethod", value.asInstanceOf[js.Any])
    
    inline def setDetmethodUndefined: Self = StObject.set(x, "detmethod", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLinkedFeatures(value: js.Array[String]): Self = StObject.set(x, "linkedFeatures", value.asInstanceOf[js.Any])
    
    inline def setLinkedFeaturesVarargs(value: String*): Self = StObject.set(x, "linkedFeatures", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSequenceData(value: js.Array[SequenceData]): Self = StObject.set(x, "sequenceData", value.asInstanceOf[js.Any])
    
    inline def setSequenceDataVarargs(value: SequenceData*): Self = StObject.set(x, "sequenceData", js.Array(value*))
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
