package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreStorageSummary extends StObject {
  
  /**
    * Used to store data store data in an S3 bucket that you manage.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3StorageSummary] = js.undefined
  
  /**
    * Used to store data store data in an S3 bucket managed by AWS IoT Analytics.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3StorageSummary] = js.undefined
}
object DatastoreStorageSummary {
  
  @scala.inline
  def apply(): DatastoreStorageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreStorageSummary]
  }
  
  @scala.inline
  implicit class DatastoreStorageSummaryMutableBuilder[Self <: DatastoreStorageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerManagedS3(value: CustomerManagedDatastoreS3StorageSummary): Self = StObject.set(x, "customerManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerManagedS3Undefined: Self = StObject.set(x, "customerManagedS3", js.undefined)
    
    @scala.inline
    def setServiceManagedS3(value: ServiceManagedDatastoreS3StorageSummary): Self = StObject.set(x, "serviceManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceManagedS3Undefined: Self = StObject.set(x, "serviceManagedS3", js.undefined)
  }
}
