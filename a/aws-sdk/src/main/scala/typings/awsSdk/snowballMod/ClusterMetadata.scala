package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterMetadata extends StObject {
  
  /**
    * The automatically generated ID for a specific address.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.undefined
  
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the cluster.
    */
  var ClusterState: js.UndefOr[typings.awsSdk.snowballMod.ClusterState] = js.undefined
  
  /**
    * The creation date for this cluster.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The optional description of the cluster.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the address that you want a cluster shipped to, after it will be shipped to its primary address. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
  
  /**
    * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE.
    */
  var JobType: js.UndefOr[typings.awsSdk.snowballMod.JobType] = js.undefined
  
  /**
    * The KmsKeyARN Amazon Resource Name (ARN) associated with this cluster. This ARN was created using the CreateKey API action in AWS Key Management Service (AWS KMS).
    */
  var KmsKeyARN: js.UndefOr[typings.awsSdk.snowballMod.KmsKeyARN] = js.undefined
  
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.undefined
  
  /**
    * The arrays of JobResource objects that can include updated S3Resource objects or LambdaResource objects.
    */
  var Resources: js.UndefOr[JobResource] = js.undefined
  
  /**
    * The role ARN associated with this cluster. This ARN was created using the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[typings.awsSdk.snowballMod.RoleARN] = js.undefined
  
  /**
    * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snow devices are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typings.awsSdk.snowballMod.ShippingOption] = js.undefined
  
  /**
    * The type of AWS Snow device to use for this cluster.   For cluster jobs, AWS Snow Family currently supports only the EDGE device type. 
    */
  var SnowballType: js.UndefOr[typings.awsSdk.snowballMod.SnowballType] = js.undefined
  
  /**
    * The tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typings.awsSdk.snowballMod.TaxDocuments] = js.undefined
}
object ClusterMetadata {
  
  inline def apply(): ClusterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMetadata]
  }
  
  extension [Self <: ClusterMetadata](x: Self) {
    
    inline def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    inline def setAddressIdUndefined: Self = StObject.set(x, "AddressId", js.undefined)
    
    inline def setClusterId(value: String): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    inline def setClusterState(value: ClusterState): Self = StObject.set(x, "ClusterState", value.asInstanceOf[js.Any])
    
    inline def setClusterStateUndefined: Self = StObject.set(x, "ClusterState", js.undefined)
    
    inline def setCreationDate(value: Timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setForwardingAddressId(value: AddressId): Self = StObject.set(x, "ForwardingAddressId", value.asInstanceOf[js.Any])
    
    inline def setForwardingAddressIdUndefined: Self = StObject.set(x, "ForwardingAddressId", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    inline def setKmsKeyARN(value: KmsKeyARN): Self = StObject.set(x, "KmsKeyARN", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyARNUndefined: Self = StObject.set(x, "KmsKeyARN", js.undefined)
    
    inline def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
    
    inline def setResources(value: JobResource): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setShippingOption(value: ShippingOption): Self = StObject.set(x, "ShippingOption", value.asInstanceOf[js.Any])
    
    inline def setShippingOptionUndefined: Self = StObject.set(x, "ShippingOption", js.undefined)
    
    inline def setSnowballType(value: SnowballType): Self = StObject.set(x, "SnowballType", value.asInstanceOf[js.Any])
    
    inline def setSnowballTypeUndefined: Self = StObject.set(x, "SnowballType", js.undefined)
    
    inline def setTaxDocuments(value: TaxDocuments): Self = StObject.set(x, "TaxDocuments", value.asInstanceOf[js.Any])
    
    inline def setTaxDocumentsUndefined: Self = StObject.set(x, "TaxDocuments", js.undefined)
  }
}
