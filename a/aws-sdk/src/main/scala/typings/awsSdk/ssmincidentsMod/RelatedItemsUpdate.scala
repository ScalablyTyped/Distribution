package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedItemsUpdate extends StObject {
  
  /**
    * Details about the related item you're adding.
    */
  var itemToAdd: js.UndefOr[RelatedItem] = js.undefined
  
  /**
    * Details about the related item you're deleting.
    */
  var itemToRemove: js.UndefOr[ItemIdentifier] = js.undefined
}
object RelatedItemsUpdate {
  
  inline def apply(): RelatedItemsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedItemsUpdate]
  }
  
  extension [Self <: RelatedItemsUpdate](x: Self) {
    
    inline def setItemToAdd(value: RelatedItem): Self = StObject.set(x, "itemToAdd", value.asInstanceOf[js.Any])
    
    inline def setItemToAddUndefined: Self = StObject.set(x, "itemToAdd", js.undefined)
    
    inline def setItemToRemove(value: ItemIdentifier): Self = StObject.set(x, "itemToRemove", value.asInstanceOf[js.Any])
    
    inline def setItemToRemoveUndefined: Self = StObject.set(x, "itemToRemove", js.undefined)
  }
}
