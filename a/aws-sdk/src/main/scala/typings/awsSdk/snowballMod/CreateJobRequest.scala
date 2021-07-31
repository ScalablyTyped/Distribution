package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobRequest extends StObject {
  
  /**
    * The ID for the address that you want the Snow device shipped to.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.undefined
  
  /**
    * The ID of a cluster. If you're creating a job for a node in a cluster, you need to provide only this clusterId value. The other job attributes are inherited from the cluster.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.snowballMod.ClusterId] = js.undefined
  
  /**
    * Defines an optional description of this specific job, for example Important Photos 2016-08-11.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the device configuration for an AWS Snowcone job.
    */
  var DeviceConfiguration: js.UndefOr[typings.awsSdk.snowballMod.DeviceConfiguration] = js.undefined
  
  /**
    * The forwarding address ID for a job. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.undefined
  
  /**
    * Defines the type of job that you're creating. 
    */
  var JobType: js.UndefOr[typings.awsSdk.snowballMod.JobType] = js.undefined
  
  /**
    * The KmsKeyARN that you want to associate with this job. KmsKeyARNs are created using the CreateKey AWS Key Management Service (KMS) API action.
    */
  var KmsKeyARN: js.UndefOr[typings.awsSdk.snowballMod.KmsKeyARN] = js.undefined
  
  /**
    * Defines the Amazon Simple Notification Service (Amazon SNS) notification settings for this job.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.undefined
  
  /**
    * Defines the Amazon S3 buckets associated with this job. With IMPORT jobs, you specify the bucket or buckets that your transferred data will be imported into. With EXPORT jobs, you specify the bucket or buckets that your transferred data will be exported from. Optionally, you can also specify a KeyRange value. If you choose to export a range, you define the length of the range by providing either an inclusive BeginMarker value, an inclusive EndMarker value, or both. Ranges are UTF-8 binary sorted.
    */
  var Resources: js.UndefOr[JobResource] = js.undefined
  
  /**
    * The RoleARN that you want to associate with this job. RoleArns are created using the CreateRole AWS Identity and Access Management (IAM) API action.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.snowballMod.RoleARN] = js.undefined
  
  /**
    * The shipping speed for this job. This speed doesn't dictate how soon you'll get the Snow device, rather it represents how quickly the Snow device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snow devices are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typings.awsSdk.snowballMod.ShippingOption] = js.undefined
  
  /**
    * If your job is being created in one of the US regions, you have the option of specifying what size Snow device you'd like for this job. In all other regions, Snowballs come with 80 TB in storage capacity.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.undefined
  
  /**
    * The type of AWS Snow Family device to use for this job.   For cluster jobs, AWS Snow Family currently supports only the EDGE device type.  The type of AWS Snow device to use for this job. Currently, the only supported device type for cluster jobs is EDGE. For more information, see Snowball Edge Device Options in the Snowball Edge Developer Guide.
    */
  var SnowballType: js.UndefOr[typings.awsSdk.snowballMod.SnowballType] = js.undefined
  
  /**
    * The tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typings.awsSdk.snowballMod.TaxDocuments] = js.undefined
}
object CreateJobRequest {
  
  @scala.inline
  def apply(): CreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobRequest]
  }
  
  @scala.inline
  implicit class CreateJobRequestMutableBuilder[Self <: CreateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressId(value: AddressId): Self = StObject.set(x, "AddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressIdUndefined: Self = StObject.set(x, "AddressId", js.undefined)
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDeviceConfiguration(value: DeviceConfiguration): Self = StObject.set(x, "DeviceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceConfigurationUndefined: Self = StObject.set(x, "DeviceConfiguration", js.undefined)
    
    @scala.inline
    def setForwardingAddressId(value: AddressId): Self = StObject.set(x, "ForwardingAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingAddressIdUndefined: Self = StObject.set(x, "ForwardingAddressId", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    @scala.inline
    def setKmsKeyARN(value: KmsKeyARN): Self = StObject.set(x, "KmsKeyARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyARNUndefined: Self = StObject.set(x, "KmsKeyARN", js.undefined)
    
    @scala.inline
    def setNotification(value: Notification): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "Notification", js.undefined)
    
    @scala.inline
    def setResources(value: JobResource): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    @scala.inline
    def setShippingOption(value: ShippingOption): Self = StObject.set(x, "ShippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingOptionUndefined: Self = StObject.set(x, "ShippingOption", js.undefined)
    
    @scala.inline
    def setSnowballCapacityPreference(value: SnowballCapacity): Self = StObject.set(x, "SnowballCapacityPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballCapacityPreferenceUndefined: Self = StObject.set(x, "SnowballCapacityPreference", js.undefined)
    
    @scala.inline
    def setSnowballType(value: SnowballType): Self = StObject.set(x, "SnowballType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowballTypeUndefined: Self = StObject.set(x, "SnowballType", js.undefined)
    
    @scala.inline
    def setTaxDocuments(value: TaxDocuments): Self = StObject.set(x, "TaxDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxDocumentsUndefined: Self = StObject.set(x, "TaxDocuments", js.undefined)
  }
}
