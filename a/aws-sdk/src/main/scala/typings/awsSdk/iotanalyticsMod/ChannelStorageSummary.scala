package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelStorageSummary extends js.Object {
  
  /**
    * Used to store channel data in an S3 bucket that you manage.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedChannelS3StorageSummary] = js.native
  
  /**
    * Used to store channel data in an S3 bucket managed by AWS IoT Analytics.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3StorageSummary] = js.native
}
object ChannelStorageSummary {
  
  @scala.inline
  def apply(): ChannelStorageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStorageSummary]
  }
  
  @scala.inline
  implicit class ChannelStorageSummaryOps[Self <: ChannelStorageSummary] (val x: Self) extends AnyVal {
    
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
    def setCustomerManagedS3(value: CustomerManagedChannelS3StorageSummary): Self = this.set("customerManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerManagedS3: Self = this.set("customerManagedS3", js.undefined)
    
    @scala.inline
    def setServiceManagedS3(value: ServiceManagedChannelS3StorageSummary): Self = this.set("serviceManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceManagedS3: Self = this.set("serviceManagedS3", js.undefined)
  }
}
