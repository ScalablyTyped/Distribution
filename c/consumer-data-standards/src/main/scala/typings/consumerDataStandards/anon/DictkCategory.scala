package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.DATA
import typings.consumerDataStandards.consumerDataStandardsStrings.DEVICE
import typings.consumerDataStandards.consumerDataStandardsStrings.ENTERTAINMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.HANDSET
import typings.consumerDataStandards.consumerDataStandardsStrings.MESSAGING
import typings.consumerDataStandards.consumerDataStandardsStrings.NETWORK
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.SOFTWARE
import typings.consumerDataStandards.consumerDataStandardsStrings.SUBSCRIPTION
import typings.consumerDataStandards.consumerDataStandardsStrings.VOICE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkCategory
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The type of the feature
    */
  var category: js.UndefOr[
    DATA | VOICE | MESSAGING | HANDSET | DEVICE | NETWORK | ENTERTAINMENT | SUBSCRIPTION | SOFTWARE | OTHER | Null
  ] = js.undefined
  
  /**
    * The description of the feature
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the feature
    */
  var displayName: String
}
object DictkCategory {
  
  inline def apply(displayName: String): DictkCategory = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkCategory] (val x: Self) extends AnyVal {
    
    inline def setCategory(
      value: DATA | VOICE | MESSAGING | HANDSET | DEVICE | NETWORK | ENTERTAINMENT | SUBSCRIPTION | SOFTWARE | OTHER
    ): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
