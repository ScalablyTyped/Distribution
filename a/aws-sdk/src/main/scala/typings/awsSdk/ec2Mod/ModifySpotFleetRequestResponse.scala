package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifySpotFleetRequestResponse extends StObject {
  
  /**
    * Is true if the request succeeds, and an error otherwise.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object ModifySpotFleetRequestResponse {
  
  @scala.inline
  def apply(): ModifySpotFleetRequestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifySpotFleetRequestResponse]
  }
  
  @scala.inline
  implicit class ModifySpotFleetRequestResponseMutableBuilder[Self <: ModifySpotFleetRequestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
