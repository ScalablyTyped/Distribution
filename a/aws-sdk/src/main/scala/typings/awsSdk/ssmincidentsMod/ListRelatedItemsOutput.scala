package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRelatedItemsOutput extends StObject {
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Details about each related item.
    */
  var relatedItems: RelatedItemList
}
object ListRelatedItemsOutput {
  
  inline def apply(relatedItems: RelatedItemList): ListRelatedItemsOutput = {
    val __obj = js.Dynamic.literal(relatedItems = relatedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRelatedItemsOutput]
  }
  
  extension [Self <: ListRelatedItemsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRelatedItems(value: RelatedItemList): Self = StObject.set(x, "relatedItems", value.asInstanceOf[js.Any])
    
    inline def setRelatedItemsVarargs(value: RelatedItem*): Self = StObject.set(x, "relatedItems", js.Array(value*))
  }
}
