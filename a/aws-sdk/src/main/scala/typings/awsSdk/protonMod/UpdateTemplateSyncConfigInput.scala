package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTemplateSyncConfigInput extends StObject {
  
  /**
    * The repository branch.
    */
  var branch: GitBranchName
  
  /**
    * The name of the repository (for example, myrepos/myrepo).
    */
  var repositoryName: RepositoryName
  
  /**
    * The repository provider.
    */
  var repositoryProvider: RepositoryProvider
  
  /**
    * A subdirectory path to your template bundle version. When included, limits the template bundle search to this repository directory.
    */
  var subdirectory: js.UndefOr[Subdirectory] = js.undefined
  
  /**
    * The synced template name.
    */
  var templateName: ResourceName
  
  /**
    * The synced template type.
    */
  var templateType: TemplateType
}
object UpdateTemplateSyncConfigInput {
  
  inline def apply(
    branch: GitBranchName,
    repositoryName: RepositoryName,
    repositoryProvider: RepositoryProvider,
    templateName: ResourceName,
    templateType: TemplateType
  ): UpdateTemplateSyncConfigInput = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], repositoryProvider = repositoryProvider.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTemplateSyncConfigInput]
  }
  
  extension [Self <: UpdateTemplateSyncConfigInput](x: Self) {
    
    inline def setBranch(value: GitBranchName): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryProvider(value: RepositoryProvider): Self = StObject.set(x, "repositoryProvider", value.asInstanceOf[js.Any])
    
    inline def setSubdirectory(value: Subdirectory): Self = StObject.set(x, "subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "subdirectory", js.undefined)
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: TemplateType): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
  }
}
