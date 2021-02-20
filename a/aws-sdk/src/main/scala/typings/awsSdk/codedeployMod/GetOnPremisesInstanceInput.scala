package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOnPremisesInstanceInput extends StObject {
  
  /**
    *  The name of the on-premises instance about which to get information. 
    */
  var instanceName: InstanceName = js.native
}
object GetOnPremisesInstanceInput {
  
  @scala.inline
  def apply(instanceName: InstanceName): GetOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOnPremisesInstanceInput]
  }
  
  @scala.inline
  implicit class GetOnPremisesInstanceInputMutableBuilder[Self <: GetOnPremisesInstanceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceName(value: InstanceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
