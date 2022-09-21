package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreIotSiteWiseMultiLayerStorage extends StObject {
  
  /**
    *  Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage. 
    */
  var customerManagedS3Storage: IotSiteWiseCustomerManagedDatastoreS3Storage
}
object DatastoreIotSiteWiseMultiLayerStorage {
  
  inline def apply(customerManagedS3Storage: IotSiteWiseCustomerManagedDatastoreS3Storage): DatastoreIotSiteWiseMultiLayerStorage = {
    val __obj = js.Dynamic.literal(customerManagedS3Storage = customerManagedS3Storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreIotSiteWiseMultiLayerStorage]
  }
  
  extension [Self <: DatastoreIotSiteWiseMultiLayerStorage](x: Self) {
    
    inline def setCustomerManagedS3Storage(value: IotSiteWiseCustomerManagedDatastoreS3Storage): Self = StObject.set(x, "customerManagedS3Storage", value.asInstanceOf[js.Any])
  }
}
