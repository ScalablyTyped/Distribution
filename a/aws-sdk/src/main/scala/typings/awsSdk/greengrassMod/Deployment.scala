package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  /**
    * The time, in milliseconds since the epoch, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[string] = js.undefined
  
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[typings.awsSdk.greengrassMod.DeploymentType] = js.undefined
  
  /**
    * The ARN of the group for this deployment.
    */
  var GroupArn: js.UndefOr[string] = js.undefined
}
object Deployment {
  
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: string): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDeploymentArn(value: string): Self = StObject.set(x, "DeploymentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentArnUndefined: Self = StObject.set(x, "DeploymentArn", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: string): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
    
    @scala.inline
    def setDeploymentType(value: DeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    @scala.inline
    def setGroupArn(value: string): Self = StObject.set(x, "GroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupArnUndefined: Self = StObject.set(x, "GroupArn", js.undefined)
  }
}
