package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginRequestPolicyList extends js.Object {
  
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
  implicit class OriginRequestPolicyListOps[Self <: OriginRequestPolicyList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxItems(value: integer): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: OriginRequestPolicySummary*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: OriginRequestPolicySummaryList): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    
    @scala.inline
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
}
