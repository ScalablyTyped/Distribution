package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionList extends StObject {
  
  /**
    * A flag that indicates whether more distributions remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more distributions in the list.
    */
  var IsTruncated: Boolean
  
  /**
    * A complex type that contains one DistributionSummary element for each distribution that was created by the current AWS account.
    */
  var Items: js.UndefOr[DistributionSummaryList] = js.undefined
  
  /**
    * The value you provided for the Marker request parameter.
    */
  var Marker: String
  
  /**
    * The value you provided for the MaxItems request parameter.
    */
  var MaxItems: integer
  
  /**
    * If IsTruncated is true, this element is present and contains the value you can use for the Marker request parameter to continue listing your distributions where they left off. 
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The number of distributions that were created by the current AWS account. 
    */
  var Quantity: integer
}
object DistributionList {
  
  @scala.inline
  def apply(IsTruncated: Boolean, Marker: String, MaxItems: integer, Quantity: integer): DistributionList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionList]
  }
  
  @scala.inline
  implicit class DistributionListMutableBuilder[Self <: DistributionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: DistributionSummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DistributionSummary*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
