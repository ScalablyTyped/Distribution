package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterOnPremisesInstanceInput extends StObject {
  
  /**
    * The name of the on-premises instance to deregister.
    */
  var instanceName: InstanceName = js.native
}
object DeregisterOnPremisesInstanceInput {
  
  @scala.inline
  def apply(instanceName: InstanceName): DeregisterOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterOnPremisesInstanceInput]
  }
  
  @scala.inline
  implicit class DeregisterOnPremisesInstanceInputMutableBuilder[Self <: DeregisterOnPremisesInstanceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceName(value: InstanceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
