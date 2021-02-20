package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginRequestPolicyList extends StObject {
  
  /**
    * Contains the origin request policies in the list.
    */
  var Items: js.UndefOr[OriginRequestPolicySummaryList] = js.native
  
  /**
    * The maximum number of origin request policies requested.
    */
  var MaxItems: integer = js.native
  
  /**
    * If there are more items in the list than are in this response, this element is present. It contains the value that you should use in the Marker field of a subsequent request to continue listing origin request policies where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.native
  
  /**
    * The total number of origin request policies returned in the response.
    */
  var Quantity: integer = js.native
}
object OriginRequestPolicyList {
  
  @scala.inline
  def apply(MaxItems: integer, Quantity: integer): OriginRequestPolicyList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicyList]
  }
  
  @scala.inline
  implicit class OriginRequestPolicyListMutableBuilder[Self <: OriginRequestPolicyList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: OriginRequestPolicySummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: OriginRequestPolicySummary*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
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
