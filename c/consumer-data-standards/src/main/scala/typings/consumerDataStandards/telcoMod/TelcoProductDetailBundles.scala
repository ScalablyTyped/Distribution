package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoProductDetailBundles
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The URI of the product bundle
    */
  var bundleUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of the product bundle
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the product bundle
    */
  var displayName: String
  
  /**
    * Optional list of features of the bundle
    */
  var features: js.UndefOr[js.Array[DictkCategory] | Null] = js.undefined
}
object TelcoProductDetailBundles {
  
  inline def apply(displayName: String): TelcoProductDetailBundles = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoProductDetailBundles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoProductDetailBundles] (val x: Self) extends AnyVal {
    
    inline def setBundleUri(value: String): Self = StObject.set(x, "bundleUri", value.asInstanceOf[js.Any])
    
    inline def setBundleUriNull: Self = StObject.set(x, "bundleUri", null)
    
    inline def setBundleUriUndefined: Self = StObject.set(x, "bundleUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: js.Array[DictkCategory]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesNull: Self = StObject.set(x, "features", null)
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: DictkCategory*): Self = StObject.set(x, "features", js.Array(value*))
  }
}
