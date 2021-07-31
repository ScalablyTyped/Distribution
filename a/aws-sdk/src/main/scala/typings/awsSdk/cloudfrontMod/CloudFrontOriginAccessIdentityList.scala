package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFrontOriginAccessIdentityList extends StObject {
  
  /**
    * A flag that indicates whether more origin access identities remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more items in the list.
    */
  var IsTruncated: Boolean
  
  /**
    * A complex type that contains one CloudFrontOriginAccessIdentitySummary element for each origin access identity that was created by the current AWS account.
    */
  var Items: js.UndefOr[CloudFrontOriginAccessIdentitySummaryList] = js.undefined
  
  /**
    * Use this when paginating results to indicate where to begin in your list of origin access identities. The results include identities in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last identity on that page). 
    */
  var Marker: String
  
  /**
    * The maximum number of origin access identities you want in the response body. 
    */
  var MaxItems: integer
  
  /**
    * If IsTruncated is true, this element is present and contains the value you can use for the Marker request parameter to continue listing your origin access identities where they left off. 
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The number of CloudFront origin access identities that were created by the current AWS account. 
    */
  var Quantity: integer
}
object CloudFrontOriginAccessIdentityList {
  
  @scala.inline
  def apply(IsTruncated: Boolean, Marker: String, MaxItems: integer, Quantity: integer): CloudFrontOriginAccessIdentityList = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontOriginAccessIdentityList]
  }
  
  @scala.inline
  implicit class CloudFrontOriginAccessIdentityListMutableBuilder[Self <: CloudFrontOriginAccessIdentityList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: CloudFrontOriginAccessIdentitySummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CloudFrontOriginAccessIdentitySummary*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
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
