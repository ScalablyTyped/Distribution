package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterRequest extends js.Object {
  /**
    * The ID for the address that you want the cluster shipped to.
    */
  var AddressId: typings.awsSdk.snowballMod.AddressId = js.native
  /**
    * An optional description of this specific cluster, for example Environmental Data Cluster-01.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The forwarding address ID for a cluster. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE.
    */
  var JobType: typings.awsSdk.snowballMod.JobType = js.native
  /**
    * The KmsKeyARN value that you want to associate with this cluster. KmsKeyARN values are created by using the CreateKey API action in AWS Key Management Service (AWS KMS). 
    */
  var KmsKeyARN: js.UndefOr[typings.awsSdk.snowballMod.KmsKeyARN] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.native
  /**
    * The resources associated with the cluster job. These resources include Amazon S3 buckets and optional AWS Lambda functions written in the Python language. 
    */
  var Resources: JobResource = js.native
  /**
    * The RoleARN that you want to associate with this cluster. RoleArn values are created by using the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: typings.awsSdk.snowballMod.RoleARN = js.native
  /**
    * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowball Edges are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: typings.awsSdk.snowballMod.ShippingOption = js.native
  /**
    * The type of AWS Snowball device to use for this cluster. Currently, the only supported device type for cluster jobs is EDGE. For more information, see Snowball Edge Device Options in the Snowball Edge Developer Guide.
    */
  var SnowballType: js.UndefOr[typings.awsSdk.snowballMod.SnowballType] = js.native
  /**
    * The tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typings.awsSdk.snowballMod.TaxDocuments] = js.native
}

object CreateClusterRequest {
  @scala.inline
  def apply(
    AddressId: AddressId,
    JobType: JobType,
    Resources: JobResource,
    RoleARN: RoleARN,
    ShippingOption: ShippingOption,
    Description: String = null,
    ForwardingAddressId: AddressId = null,
    KmsKeyARN: KmsKeyARN = null,
    Notification: Notification = null,
    SnowballType: SnowballType = null,
    TaxDocuments: TaxDocuments = null
  ): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(AddressId = AddressId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], Resources = Resources.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], ShippingOption = ShippingOption.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ForwardingAddressId != null) __obj.updateDynamic("ForwardingAddressId")(ForwardingAddressId.asInstanceOf[js.Any])
    if (KmsKeyARN != null) __obj.updateDynamic("KmsKeyARN")(KmsKeyARN.asInstanceOf[js.Any])
    if (Notification != null) __obj.updateDynamic("Notification")(Notification.asInstanceOf[js.Any])
    if (SnowballType != null) __obj.updateDynamic("SnowballType")(SnowballType.asInstanceOf[js.Any])
    if (TaxDocuments != null) __obj.updateDynamic("TaxDocuments")(TaxDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
}

