package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebootInstanceRequest extends StObject {
  
  /**
    * The name of the instance to reboot.
    */
  var instanceName: ResourceName = js.native
}
object RebootInstanceRequest {
  
  @scala.inline
  def apply(instanceName: ResourceName): RebootInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootInstanceRequest]
  }
  
  @scala.inline
  implicit class RebootInstanceRequestMutableBuilder[Self <: RebootInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
