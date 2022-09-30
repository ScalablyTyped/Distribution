package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSettings extends StObject {
  
  /**
    * The linked repository for pipeline provisioning. Required if you have environments configured for self-managed provisioning with services that include pipelines. A linked repository is a repository that has been registered with Proton. For more information, see CreateRepository.
    */
  var pipelineProvisioningRepository: js.UndefOr[RepositoryBranch] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Assumed by Proton for Amazon Web Services-managed provisioning, and by customer-owned automation for self-managed provisioning.
    */
  var pipelineServiceRoleArn: js.UndefOr[PipelineRoleArn] = js.undefined
}
object AccountSettings {
  
  inline def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  
  extension [Self <: AccountSettings](x: Self) {
    
    inline def setPipelineProvisioningRepository(value: RepositoryBranch): Self = StObject.set(x, "pipelineProvisioningRepository", value.asInstanceOf[js.Any])
    
    inline def setPipelineProvisioningRepositoryUndefined: Self = StObject.set(x, "pipelineProvisioningRepository", js.undefined)
    
    inline def setPipelineServiceRoleArn(value: PipelineRoleArn): Self = StObject.set(x, "pipelineServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineServiceRoleArnUndefined: Self = StObject.set(x, "pipelineServiceRoleArn", js.undefined)
  }
}
