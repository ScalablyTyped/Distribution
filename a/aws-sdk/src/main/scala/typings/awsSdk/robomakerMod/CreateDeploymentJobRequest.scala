package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentJobRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: ClientRequestToken = js.native
  
  /**
    * The deployment application configuration.
    */
  var deploymentApplicationConfigs: DeploymentApplicationConfigs = js.native
  
  /**
    * The requested deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the fleet to deploy.
    */
  var fleet: Arn = js.native
  
  /**
    * A map that contains tag keys and tag values that are attached to the deployment job.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateDeploymentJobRequest {
  
  @scala.inline
  def apply(
    clientRequestToken: ClientRequestToken,
    deploymentApplicationConfigs: DeploymentApplicationConfigs,
    fleet: Arn
  ): CreateDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], deploymentApplicationConfigs = deploymentApplicationConfigs.asInstanceOf[js.Any], fleet = fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentJobRequest]
  }
  
  @scala.inline
  implicit class CreateDeploymentJobRequestMutableBuilder[Self <: CreateDeploymentJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentApplicationConfigs(value: DeploymentApplicationConfigs): Self = StObject.set(x, "deploymentApplicationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentApplicationConfigsVarargs(value: DeploymentApplicationConfig*): Self = StObject.set(x, "deploymentApplicationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setDeploymentConfig(value: DeploymentConfig): Self = StObject.set(x, "deploymentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigUndefined: Self = StObject.set(x, "deploymentConfig", js.undefined)
    
    @scala.inline
    def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
