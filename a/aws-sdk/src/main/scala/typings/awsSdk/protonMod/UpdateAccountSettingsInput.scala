package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountSettingsInput extends StObject {
  
  /**
    * A repository for pipeline provisioning. Specify it if you have environments configured for self-managed provisioning with services that include pipelines.
    */
  var pipelineProvisioningRepository: js.UndefOr[RepositoryBranchInput] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service role you want to use for provisioning pipelines. Assumed by Proton for Amazon Web Services-managed provisioning, and by customer-owned automation for self-managed provisioning.
    */
  var pipelineServiceRoleArn: js.UndefOr[PipelineRoleArn] = js.undefined
}
object UpdateAccountSettingsInput {
  
  inline def apply(): UpdateAccountSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountSettingsInput]
  }
  
  extension [Self <: UpdateAccountSettingsInput](x: Self) {
    
    inline def setPipelineProvisioningRepository(value: RepositoryBranchInput): Self = StObject.set(x, "pipelineProvisioningRepository", value.asInstanceOf[js.Any])
    
    inline def setPipelineProvisioningRepositoryUndefined: Self = StObject.set(x, "pipelineProvisioningRepository", js.undefined)
    
    inline def setPipelineServiceRoleArn(value: PipelineRoleArn): Self = StObject.set(x, "pipelineServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineServiceRoleArnUndefined: Self = StObject.set(x, "pipelineServiceRoleArn", js.undefined)
  }
}
