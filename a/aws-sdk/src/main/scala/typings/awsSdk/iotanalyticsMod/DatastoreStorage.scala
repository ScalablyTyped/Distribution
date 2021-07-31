package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreStorage extends StObject {
  
  /**
    * Use this to store data store data in an S3 bucket that you manage. When customer managed storage is selected, the retentionPeriod parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
    */
  var customerManagedS3: js.UndefOr[CustomerManagedDatastoreS3Storage] = js.undefined
  
  /**
    * Use this to store data store data in an S3 bucket managed by AWS IoT Analytics. You cannot change the choice of service-managed or customer-managed S3 storage after the data store is created.
    */
  var serviceManagedS3: js.UndefOr[ServiceManagedDatastoreS3Storage] = js.undefined
}
object DatastoreStorage {
  
  @scala.inline
  def apply(): DatastoreStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreStorage]
  }
  
  @scala.inline
  implicit class DatastoreStorageMutableBuilder[Self <: DatastoreStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerManagedS3(value: CustomerManagedDatastoreS3Storage): Self = StObject.set(x, "customerManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerManagedS3Undefined: Self = StObject.set(x, "customerManagedS3", js.undefined)
    
    @scala.inline
    def setServiceManagedS3(value: ServiceManagedDatastoreS3Storage): Self = StObject.set(x, "serviceManagedS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceManagedS3Undefined: Self = StObject.set(x, "serviceManagedS3", js.undefined)
  }
}
