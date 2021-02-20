package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelStorageSummary extends StObject {
  
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
  implicit class ChannelStorageSummaryMutableBuilder[Self <: ChannelStorageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerManagedS3(value: CustomerManagedChannelS3StorageSummary): Self = StObject.set(x, "customerManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerManagedS3Undefined: Self = StObject.set(x, "customerManagedS3", js.undefined)
    
    @scala.inline
    def setServiceManagedS3(value: ServiceManagedChannelS3StorageSummary): Self = StObject.set(x, "serviceManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceManagedS3Undefined: Self = StObject.set(x, "serviceManagedS3", js.undefined)
  }
}
