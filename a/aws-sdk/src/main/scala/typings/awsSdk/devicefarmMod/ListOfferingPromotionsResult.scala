package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOfferingPromotionsResult extends StObject {
  
  /**
    * An identifier to be used in the next call to this operation, to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the offering promotions.
    */
  var offeringPromotions: js.UndefOr[OfferingPromotions] = js.undefined
}
object ListOfferingPromotionsResult {
  
  @scala.inline
  def apply(): ListOfferingPromotionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingPromotionsResult]
  }
  
  @scala.inline
  implicit class ListOfferingPromotionsResultMutableBuilder[Self <: ListOfferingPromotionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setOfferingPromotions(value: OfferingPromotions): Self = StObject.set(x, "offeringPromotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingPromotionsUndefined: Self = StObject.set(x, "offeringPromotions", js.undefined)
    
    @scala.inline
    def setOfferingPromotionsVarargs(value: OfferingPromotion*): Self = StObject.set(x, "offeringPromotions", js.Array(value :_*))
  }
}
