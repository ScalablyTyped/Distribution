package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fleet extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.native
  
  /**
    * The status of the last fleet deployment.
    */
  var lastDeploymentStatus: js.UndefOr[DeploymentStatus] = js.native
  
  /**
    * The time of the last deployment.
    */
  var lastDeploymentTime: js.UndefOr[CreatedAt] = js.native
  
  /**
    * The name of the fleet.
    */
  var name: js.UndefOr[Name] = js.native
}
object Fleet {
  
  @scala.inline
  def apply(): Fleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fleet]
  }
  
  @scala.inline
  implicit class FleetMutableBuilder[Self <: Fleet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setLastDeploymentJob(value: Arn): Self = StObject.set(x, "lastDeploymentJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDeploymentJobUndefined: Self = StObject.set(x, "lastDeploymentJob", js.undefined)
    
    @scala.inline
    def setLastDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "lastDeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDeploymentStatusUndefined: Self = StObject.set(x, "lastDeploymentStatus", js.undefined)
    
    @scala.inline
    def setLastDeploymentTime(value: CreatedAt): Self = StObject.set(x, "lastDeploymentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDeploymentTimeUndefined: Self = StObject.set(x, "lastDeploymentTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
