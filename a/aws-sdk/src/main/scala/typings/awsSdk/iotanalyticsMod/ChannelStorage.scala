package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelStorage extends StObject {
  
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
  implicit class ChannelStorageMutableBuilder[Self <: ChannelStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerManagedS3(value: CustomerManagedChannelS3Storage): Self = StObject.set(x, "customerManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerManagedS3Undefined: Self = StObject.set(x, "customerManagedS3", js.undefined)
    
    @scala.inline
    def setServiceManagedS3(value: ServiceManagedChannelS3Storage): Self = StObject.set(x, "serviceManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceManagedS3Undefined: Self = StObject.set(x, "serviceManagedS3", js.undefined)
  }
}
