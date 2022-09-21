package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fleet extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the last fleet deployment.
    */
  var lastDeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined
  
  /**
    * The time of the last deployment.
    */
  var lastDeploymentTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the fleet.
    */
  var name: js.UndefOr[Name] = js.undefined
}
object Fleet {
  
  inline def apply(): Fleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fleet]
  }
  
  extension [Self <: Fleet](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setLastDeploymentJob(value: Arn): Self = StObject.set(x, "lastDeploymentJob", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentJobUndefined: Self = StObject.set(x, "lastDeploymentJob", js.undefined)
    
    inline def setLastDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "lastDeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentStatusUndefined: Self = StObject.set(x, "lastDeploymentStatus", js.undefined)
    
    inline def setLastDeploymentTime(value: js.Date): Self = StObject.set(x, "lastDeploymentTime", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentTimeUndefined: Self = StObject.set(x, "lastDeploymentTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
