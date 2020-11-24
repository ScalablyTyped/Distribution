package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DescribeNotebookInstanceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotebookInstanceOutput]
  }
  
  @scala.inline
  implicit class DescribeNotebookInstanceOutputOps[Self <: DescribeNotebookInstanceOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceleratorTypesVarargs(value: NotebookInstanceAcceleratorType*): Self = this.set("AcceleratorTypes", js.Array(value :_*))
    
    @scala.inline
    def setAcceleratorTypes(value: NotebookInstanceAcceleratorTypes): Self = this.set("AcceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorTypes: Self = this.set("AcceleratorTypes", js.undefined)
    
    @scala.inline
    def setAdditionalCodeRepositoriesVarargs(value: CodeRepositoryNameOrUrl*): Self = this.set("AdditionalCodeRepositories", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalCodeRepositories(value: AdditionalCodeRepositoryNamesOrUrls): Self = this.set("AdditionalCodeRepositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalCodeRepositories: Self = this.set("AdditionalCodeRepositories", js.undefined)
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDefaultCodeRepository(value: CodeRepositoryNameOrUrl): Self = this.set("DefaultCodeRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCodeRepository: Self = this.set("DefaultCodeRepository", js.undefined)
    
    @scala.inline
    def setDirectInternetAccess(value: DirectInternetAccess): Self = this.set("DirectInternetAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectInternetAccess: Self = this.set("DirectInternetAccess", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setNotebookInstanceArn(value: NotebookInstanceArn): Self = this.set("NotebookInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookInstanceArn: Self = this.set("NotebookInstanceArn", js.undefined)
    
    @scala.inline
    def setNotebookInstanceLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = this.set("NotebookInstanceLifecycleConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookInstanceLifecycleConfigName: Self = this.set("NotebookInstanceLifecycleConfigName", js.undefined)
    
    @scala.inline
    def setNotebookInstanceName(value: NotebookInstanceName): Self = this.set("NotebookInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookInstanceName: Self = this.set("NotebookInstanceName", js.undefined)
    
    @scala.inline
    def setNotebookInstanceStatus(value: NotebookInstanceStatus): Self = this.set("NotebookInstanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookInstanceStatus: Self = this.set("NotebookInstanceStatus", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setRootAccess(value: RootAccess): Self = this.set("RootAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootAccess: Self = this.set("RootAccess", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroupIds): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    
    @scala.inline
    def setUrl(value: NotebookInstanceUrl): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
    
    @scala.inline
    def setVolumeSizeInGB(value: NotebookInstanceVolumeSizeInGB): Self = this.set("VolumeSizeInGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeSizeInGB: Self = this.set("VolumeSizeInGB", js.undefined)
  }
}
