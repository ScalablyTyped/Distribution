package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedItem extends StObject {
  
  /**
    * Details about the related item.
    */
  var identifier: ItemIdentifier
  
  /**
    * The title of the related item.
    */
  var title: js.UndefOr[RelatedItemTitleString] = js.undefined
}
object RelatedItem {
  
  inline def apply(identifier: ItemIdentifier): RelatedItem = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedItem]
  }
  
  extension [Self <: RelatedItem](x: Self) {
    
    inline def setIdentifier(value: ItemIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: RelatedItemTitleString): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
