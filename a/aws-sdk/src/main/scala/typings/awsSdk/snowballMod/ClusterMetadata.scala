package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterMetadata extends js.Object {
  /**
    * The automatically generated ID for a specific address.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.native
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: js.UndefOr[String] = js.native
  /**
    * The current status of the cluster.
    */
  var ClusterState: js.UndefOr[typings.awsSdk.snowballMod.ClusterState] = js.native
  /**
    * The creation date for this cluster.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The optional description of the cluster.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the address that you want a cluster shipped to, after it will be shipped to its primary address. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * The type of job for this cluster. Currently, the only job type supported for clusters is LOCAL_USE.
    */
  var JobType: js.UndefOr[typings.awsSdk.snowballMod.JobType] = js.native
  /**
    * The KmsKeyARN Amazon Resource Name (ARN) associated with this cluster. This ARN was created using the CreateKey API action in AWS Key Management Service (AWS KMS).
    */
  var KmsKeyARN: js.UndefOr[typings.awsSdk.snowballMod.KmsKeyARN] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) notification settings for this cluster.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.native
  /**
    * The arrays of JobResource objects that can include updated S3Resource objects or LambdaResource objects.
    */
  var Resources: js.UndefOr[JobResource] = js.native
  /**
    * The role ARN associated with this cluster. This ARN was created using the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[typings.awsSdk.snowballMod.RoleARN] = js.native
  /**
    * The shipping speed for each node in this cluster. This speed doesn't dictate how soon you'll get each Snowball Edge device, rather it represents how quickly each device moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snowball Edges shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snowball Edges are delivered in one to seven days.   In the US, you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typings.awsSdk.snowballMod.ShippingOption] = js.native
  /**
    * The type of AWS Snowball device to use for this cluster.   For cluster jobs, AWS Snowball currently supports only the EDGE device type. 
    */
  var SnowballType: js.UndefOr[typings.awsSdk.snowballMod.SnowballType] = js.native
  /**
    * The tax documents required in your AWS Region.
    */
  var TaxDocuments: js.UndefOr[typings.awsSdk.snowballMod.TaxDocuments] = js.native
}

object ClusterMetadata {
  @scala.inline
  def apply(
    AddressId: AddressId = null,
    ClusterId: String = null,
    ClusterState: ClusterState = null,
    CreationDate: Timestamp = null,
    Description: String = null,
    ForwardingAddressId: AddressId = null,
    JobType: JobType = null,
    KmsKeyARN: KmsKeyARN = null,
    Notification: Notification = null,
    Resources: JobResource = null,
    RoleARN: RoleARN = null,
    ShippingOption: ShippingOption = null,
    SnowballType: SnowballType = null,
    TaxDocuments: TaxDocuments = null
  ): ClusterMetadata = {
    val __obj = js.Dynamic.literal()
    if (AddressId != null) __obj.updateDynamic("AddressId")(AddressId.asInstanceOf[js.Any])
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId.asInstanceOf[js.Any])
    if (ClusterState != null) __obj.updateDynamic("ClusterState")(ClusterState.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ForwardingAddressId != null) __obj.updateDynamic("ForwardingAddressId")(ForwardingAddressId.asInstanceOf[js.Any])
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    if (KmsKeyARN != null) __obj.updateDynamic("KmsKeyARN")(KmsKeyARN.asInstanceOf[js.Any])
    if (Notification != null) __obj.updateDynamic("Notification")(Notification.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (ShippingOption != null) __obj.updateDynamic("ShippingOption")(ShippingOption.asInstanceOf[js.Any])
    if (SnowballType != null) __obj.updateDynamic("SnowballType")(SnowballType.asInstanceOf[js.Any])
    if (TaxDocuments != null) __obj.updateDynamic("TaxDocuments")(TaxDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterMetadata]
  }
}

