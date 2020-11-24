package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudFrontDistributionOriginGroupFailoverStatusCodes extends js.Object {
  
  /**
    * The list of status code values that can cause a failover to the next origin.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionOriginGroupFailoverStatusCodesItemList] = js.native
  
  /**
    * The number of status codes that can cause a failover.
    */
  var Quantity: js.UndefOr[Integer] = js.native
}
object AwsCloudFrontDistributionOriginGroupFailoverStatusCodes {
  
  @scala.inline
  def apply(): AwsCloudFrontDistributionOriginGroupFailoverStatusCodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroupFailoverStatusCodes]
  }
  
  @scala.inline
  implicit class AwsCloudFrontDistributionOriginGroupFailoverStatusCodesOps[Self <: AwsCloudFrontDistributionOriginGroupFailoverStatusCodes] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: Integer*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: AwsCloudFrontDistributionOriginGroupFailoverStatusCodesItemList): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    
    @scala.inline
    def setQuantity(value: Integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("Quantity", js.undefined)
  }
}
