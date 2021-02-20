package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartInstanceRequest extends StObject {
  
  /**
    * The name of the instance (a virtual private server) to start.
    */
  var instanceName: ResourceName = js.native
}
object StartInstanceRequest {
  
  @scala.inline
  def apply(instanceName: ResourceName): StartInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstanceRequest]
  }
  
  @scala.inline
  implicit class StartInstanceRequestMutableBuilder[Self <: StartInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
