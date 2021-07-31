package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopInstanceRequest extends StObject {
  
  /**
    * When set to True, forces a Lightsail instance that is stuck in a stopping state to stop.  Only use the force parameter if your instance is stuck in the stopping state. In any other state, your instance should stop normally without adding this parameter to your API request. 
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the instance (a virtual private server) to stop.
    */
  var instanceName: ResourceName
}
object StopInstanceRequest {
  
  @scala.inline
  def apply(instanceName: ResourceName): StopInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInstanceRequest]
  }
  
  @scala.inline
  implicit class StopInstanceRequestMutableBuilder[Self <: StopInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
