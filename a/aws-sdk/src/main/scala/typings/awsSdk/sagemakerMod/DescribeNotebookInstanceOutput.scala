package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotebookInstanceOutput extends js.Object {
  /**
    * A list of the Elastic Inference (EI) instance types associated with this notebook instance. Currently only one EI instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.native
  /**
    * An array of up to three Git repositories associated with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in AWS CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.native
  /**
    * A timestamp. Use this parameter to return the time when the notebook instance was created
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.native
  /**
    * The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in AWS CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.native
  /**
    * Describes whether Amazon SageMaker provides internet access to the notebook instance. If this value is set to Disabled, the notebook instance does not have internet access, and cannot connect to Amazon SageMaker training and endpoint services. For more information, see Notebook Instances Are Internet-Enabled by Default.
    */
  var DirectInternetAccess: js.UndefOr[typings.awsSdk.sagemakerMod.DirectInternetAccess] = js.native
  /**
    * If status is Failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The type of ML compute instance running on the notebook instance.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.sagemakerMod.InstanceType] = js.native
  /**
    * The AWS KMS key ID Amazon SageMaker uses to encrypt data when storing it on the ML storage volume attached to the instance. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * A timestamp. Use this parameter to retrieve the time when the notebook instance was last modified. 
    */
  var LastModifiedTime: js.UndefOr[typings.awsSdk.sagemakerMod.LastModifiedTime] = js.native
  /**
    * The network interface IDs that Amazon SageMaker created at the time of creating the instance. 
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.sagemakerMod.NetworkInterfaceId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the notebook instance.
    */
  var NotebookInstanceArn: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookInstanceArn] = js.native
  /**
    * Returns the name of a notebook instance lifecycle configuration. For information about notebook instance lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance 
    */
  var NotebookInstanceLifecycleConfigName: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookInstanceLifecycleConfigName] = js.native
  /**
    * The name of the Amazon SageMaker notebook instance. 
    */
  var NotebookInstanceName: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookInstanceName] = js.native
  /**
    * The status of the notebook instance.
    */
  var NotebookInstanceStatus: js.UndefOr[typings.awsSdk.sagemakerMod.NotebookInstanceStatus] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the instance. 
    */
  var RoleArn: js.UndefOr[typings.awsSdk.sagemakerMod.RoleArn] = js.native
  /**
    * Whether root access is enabled or disabled for users of the notebook instance.  Lifecycle configurations need root access to be able to set up a notebook instance. Because of this, lifecycle configurations associated with a notebook instance always run with root access even if you disable root access for users. 
    */
  var RootAccess: js.UndefOr[typings.awsSdk.sagemakerMod.RootAccess] = js.native
  /**
    * The IDs of the VPC security groups.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupIds] = js.native
  /**
    * The ID of the VPC subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.sagemakerMod.SubnetId] = js.native
  /**
    * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance. 
    */
  var Url: js.UndefOr[NotebookInstanceUrl] = js.native
  /**
    * The size, in GB, of the ML storage volume attached to the notebook instance.
    */
  var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.native
}

object DescribeNotebookInstanceOutput {
  @scala.inline
  def apply(
    AcceleratorTypes: NotebookInstanceAcceleratorTypes = null,
    AdditionalCodeRepositories: AdditionalCodeRepositoryNamesOrUrls = null,
    CreationTime: CreationTime = null,
    DefaultCodeRepository: CodeRepositoryNameOrUrl = null,
    DirectInternetAccess: DirectInternetAccess = null,
    FailureReason: FailureReason = null,
    InstanceType: InstanceType = null,
    KmsKeyId: KmsKeyId = null,
    LastModifiedTime: LastModifiedTime = null,
    NetworkInterfaceId: NetworkInterfaceId = null,
    NotebookInstanceArn: NotebookInstanceArn = null,
    NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName = null,
    NotebookInstanceName: NotebookInstanceName = null,
    NotebookInstanceStatus: NotebookInstanceStatus = null,
    RoleArn: RoleArn = null,
    RootAccess: RootAccess = null,
    SecurityGroups: SecurityGroupIds = null,
    SubnetId: SubnetId = null,
    Url: NotebookInstanceUrl = null,
    VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.undefined
  ): DescribeNotebookInstanceOutput = {
    val __obj = js.Dynamic.literal()
    if (AcceleratorTypes != null) __obj.updateDynamic("AcceleratorTypes")(AcceleratorTypes.asInstanceOf[js.Any])
    if (AdditionalCodeRepositories != null) __obj.updateDynamic("AdditionalCodeRepositories")(AdditionalCodeRepositories.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DefaultCodeRepository != null) __obj.updateDynamic("DefaultCodeRepository")(DefaultCodeRepository.asInstanceOf[js.Any])
    if (DirectInternetAccess != null) __obj.updateDynamic("DirectInternetAccess")(DirectInternetAccess.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (NotebookInstanceArn != null) __obj.updateDynamic("NotebookInstanceArn")(NotebookInstanceArn.asInstanceOf[js.Any])
    if (NotebookInstanceLifecycleConfigName != null) __obj.updateDynamic("NotebookInstanceLifecycleConfigName")(NotebookInstanceLifecycleConfigName.asInstanceOf[js.Any])
    if (NotebookInstanceName != null) __obj.updateDynamic("NotebookInstanceName")(NotebookInstanceName.asInstanceOf[js.Any])
    if (NotebookInstanceStatus != null) __obj.updateDynamic("NotebookInstanceStatus")(NotebookInstanceStatus.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (RootAccess != null) __obj.updateDynamic("RootAccess")(RootAccess.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (!js.isUndefined(VolumeSizeInGB)) __obj.updateDynamic("VolumeSizeInGB")(VolumeSizeInGB.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotebookInstanceOutput]
  }
}

