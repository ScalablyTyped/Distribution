package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanUri
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The display name of the product plan
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the product plan
    */
  var displayName: String
  
  /**
    * Optional list of features of the plan
    */
  var features: js.UndefOr[js.Array[DescriptionDisplayName] | Null] = js.undefined
  
  /**
    * The URI of the product plan
    */
  var planUri: js.UndefOr[String | Null] = js.undefined
}
object PlanUri {
  
  inline def apply(displayName: String): PlanUri = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlanUri] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: js.Array[DescriptionDisplayName]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesNull: Self = StObject.set(x, "features", null)
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: DescriptionDisplayName*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setPlanUri(value: String): Self = StObject.set(x, "planUri", value.asInstanceOf[js.Any])
    
    inline def setPlanUriNull: Self = StObject.set(x, "planUri", null)
    
    inline def setPlanUriUndefined: Self = StObject.set(x, "planUri", js.undefined)
  }
}
