package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelStorage extends js.Object {
  
  /**
    * Use this to store channel data in an S3 bucket that you manage. If customer managed storage is selected, the retentionPeriod parameter is ignored. You cannot change the choice of service-managed or customer-managed S3 storage after the channel is created.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedChannelS3Storage] = js.native
  
  /**
    * Use this to store channel data in an S3 bucket managed by AWS IoT Analytics. You cannot change the choice of service-managed or customer-managed S3 storage after the channel is created.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedChannelS3Storage] = js.native
}
object ChannelStorage {
  
  @scala.inline
  def apply(): ChannelStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStorage]
  }
  
  @scala.inline
  implicit class ChannelStorageOps[Self <: ChannelStorage] (val x: Self) extends AnyVal {
    
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
    def setCustomerManagedS3(value: CustomerManagedChannelS3Storage): Self = this.set("customerManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerManagedS3: Self = this.set("customerManagedS3", js.undefined)
    
    @scala.inline
    def setServiceManagedS3(value: ServiceManagedChannelS3Storage): Self = this.set("serviceManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceManagedS3: Self = this.set("serviceManagedS3", js.undefined)
  }
}
