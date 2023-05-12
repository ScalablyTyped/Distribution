package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncentiveUri
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The description of the incentive
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the incentive
    */
  var displayName: String
  
  /**
    * Optional list of features of the incentive
    */
  var features: js.UndefOr[js.Array[DescriptionDisplayName] | Null] = js.undefined
  
  /**
    * The URI of the incentive
    */
  var incentiveUri: js.UndefOr[String | Null] = js.undefined
}
object IncentiveUri {
  
  inline def apply(displayName: String): IncentiveUri = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncentiveUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncentiveUri] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: js.Array[DescriptionDisplayName]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesNull: Self = StObject.set(x, "features", null)
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: DescriptionDisplayName*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setIncentiveUri(value: String): Self = StObject.set(x, "incentiveUri", value.asInstanceOf[js.Any])
    
    inline def setIncentiveUriNull: Self = StObject.set(x, "incentiveUri", null)
    
    inline def setIncentiveUriUndefined: Self = StObject.set(x, "incentiveUri", js.undefined)
  }
}
