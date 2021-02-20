package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateNotebookInstanceInput extends StObject {
  
  /**
    * A list of the Elastic Inference (EI) instance types to associate with this notebook instance. Currently only one EI instance type can be associated with a notebook instance. For more information, see Using Elastic Inference in Amazon SageMaker.
    */
  var AcceleratorTypes: js.UndefOr[NotebookInstanceAcceleratorTypes] = js.native
  
  /**
    * An array of up to three Git repositories to associate with the notebook instance. These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in AWS CodeCommit or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var AdditionalCodeRepositories: js.UndefOr[AdditionalCodeRepositoryNamesOrUrls] = js.native
  
  /**
    * The Git repository to associate with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in AWS CodeCommit or in any other Git repository. When you open a notebook instance, it opens in the directory that contains this repository. For more information, see Associating Git Repositories with Amazon SageMaker Notebook Instances.
    */
  var DefaultCodeRepository: js.UndefOr[CodeRepositoryNameOrUrl] = js.native
  
  /**
    * A list of the Elastic Inference (EI) instance types to remove from this notebook instance. This operation is idempotent. If you specify an accelerator type that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateAcceleratorTypes: js.UndefOr[DisassociateNotebookInstanceAcceleratorTypes] = js.native
  
  /**
    * A list of names or URLs of the default Git repositories to remove from this notebook instance. This operation is idempotent. If you specify a Git repository that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateAdditionalCodeRepositories: js.UndefOr[typings.awsSdk.sagemakerMod.DisassociateAdditionalCodeRepositories] = js.native
  
  /**
    * The name or URL of the default Git repository to remove from this notebook instance. This operation is idempotent. If you specify a Git repository that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateDefaultCodeRepository: js.UndefOr[typings.awsSdk.sagemakerMod.DisassociateDefaultCodeRepository] = js.native
  
  /**
    * Set to true to remove the notebook instance lifecycle configuration currently associated with the notebook instance. This operation is idempotent. If you specify a lifecycle configuration that is not associated with the notebook instance when you call this method, it does not throw an error.
    */
  var DisassociateLifecycleConfig: js.UndefOr[DisassociateNotebookInstanceLifecycleConfig] = js.native
  
  /**
    * The Amazon ML compute instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.sagemakerMod.InstanceType] = js.native
  
  /**
    * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see Step 2.1: (Optional) Customize a Notebook Instance.
    */
  var LifecycleConfigName: js.UndefOr[NotebookInstanceLifecycleConfigName] = js.native
  
  /**
    * The name of the notebook instance to update.
    */
  var NotebookInstanceName: typings.awsSdk.sagemakerMod.NotebookInstanceName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var RoleArn: js.UndefOr[typings.awsSdk.sagemakerMod.RoleArn] = js.native
  
  /**
    * Whether root access is enabled or disabled for users of the notebook instance. The default value is Enabled.  If you set this to Disabled, users don't have root access on the notebook instance, but lifecycle configuration scripts still run with root permissions. 
    */
  var RootAccess: js.UndefOr[typings.awsSdk.sagemakerMod.RootAccess] = js.native
  
  /**
    * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB. ML storage volumes are encrypted, so Amazon SageMaker can't determine the amount of available free space on the volume. Because of this, you can increase the volume size when you update a notebook instance, but you can't decrease the volume size. If you want to decrease the size of the ML storage volume in use, create a new notebook instance with the desired size.
    */
  var VolumeSizeInGB: js.UndefOr[NotebookInstanceVolumeSizeInGB] = js.native
}
object UpdateNotebookInstanceInput {
  
  @scala.inline
  def apply(NotebookInstanceName: NotebookInstanceName): UpdateNotebookInstanceInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotebookInstanceInput]
  }
  
  @scala.inline
  implicit class UpdateNotebookInstanceInputMutableBuilder[Self <: UpdateNotebookInstanceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorTypes(value: NotebookInstanceAcceleratorTypes): Self = StObject.set(x, "AcceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypesUndefined: Self = StObject.set(x, "AcceleratorTypes", js.undefined)
    
    @scala.inline
    def setAcceleratorTypesVarargs(value: NotebookInstanceAcceleratorType*): Self = StObject.set(x, "AcceleratorTypes", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalCodeRepositories(value: AdditionalCodeRepositoryNamesOrUrls): Self = StObject.set(x, "AdditionalCodeRepositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalCodeRepositoriesUndefined: Self = StObject.set(x, "AdditionalCodeRepositories", js.undefined)
    
    @scala.inline
    def setAdditionalCodeRepositoriesVarargs(value: CodeRepositoryNameOrUrl*): Self = StObject.set(x, "AdditionalCodeRepositories", js.Array(value :_*))
    
    @scala.inline
    def setDefaultCodeRepository(value: CodeRepositoryNameOrUrl): Self = StObject.set(x, "DefaultCodeRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCodeRepositoryUndefined: Self = StObject.set(x, "DefaultCodeRepository", js.undefined)
    
    @scala.inline
    def setDisassociateAcceleratorTypes(value: DisassociateNotebookInstanceAcceleratorTypes): Self = StObject.set(x, "DisassociateAcceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisassociateAcceleratorTypesUndefined: Self = StObject.set(x, "DisassociateAcceleratorTypes", js.undefined)
    
    @scala.inline
    def setDisassociateAdditionalCodeRepositories(value: DisassociateAdditionalCodeRepositories): Self = StObject.set(x, "DisassociateAdditionalCodeRepositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisassociateAdditionalCodeRepositoriesUndefined: Self = StObject.set(x, "DisassociateAdditionalCodeRepositories", js.undefined)
    
    @scala.inline
    def setDisassociateDefaultCodeRepository(value: DisassociateDefaultCodeRepository): Self = StObject.set(x, "DisassociateDefaultCodeRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisassociateDefaultCodeRepositoryUndefined: Self = StObject.set(x, "DisassociateDefaultCodeRepository", js.undefined)
    
    @scala.inline
    def setDisassociateLifecycleConfig(value: DisassociateNotebookInstanceLifecycleConfig): Self = StObject.set(x, "DisassociateLifecycleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisassociateLifecycleConfigUndefined: Self = StObject.set(x, "DisassociateLifecycleConfig", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setLifecycleConfigName(value: NotebookInstanceLifecycleConfigName): Self = StObject.set(x, "LifecycleConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleConfigNameUndefined: Self = StObject.set(x, "LifecycleConfigName", js.undefined)
    
    @scala.inline
    def setNotebookInstanceName(value: NotebookInstanceName): Self = StObject.set(x, "NotebookInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setRootAccess(value: RootAccess): Self = StObject.set(x, "RootAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootAccessUndefined: Self = StObject.set(x, "RootAccess", js.undefined)
    
    @scala.inline
    def setVolumeSizeInGB(value: NotebookInstanceVolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeInGBUndefined: Self = StObject.set(x, "VolumeSizeInGB", js.undefined)
  }
}
