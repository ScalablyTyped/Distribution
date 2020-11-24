package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewBillingResponse extends js.Object {
  
  /**
    * A summary of billing records.
    */
  var BillingRecords: js.UndefOr[typings.awsSdk.route53domainsMod.BillingRecords] = js.native
  
  /**
    * If there are more billing records than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.native
}
object ViewBillingResponse {
  
  @scala.inline
  def apply(): ViewBillingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewBillingResponse]
  }
  
  @scala.inline
  implicit class ViewBillingResponseOps[Self <: ViewBillingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBillingRecordsVarargs(value: BillingRecord*): Self = this.set("BillingRecords", js.Array(value :_*))
    
    @scala.inline
    def setBillingRecords(value: BillingRecords): Self = this.set("BillingRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingRecords: Self = this.set("BillingRecords", js.undefined)
    
    @scala.inline
    def setNextPageMarker(value: PageMarker): Self = this.set("NextPageMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageMarker: Self = this.set("NextPageMarker", js.undefined)
  }
}
