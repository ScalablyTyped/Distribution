package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectVpcPeeringConnectionResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object RejectVpcPeeringConnectionResult {
  
  @scala.inline
  def apply(): RejectVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectVpcPeeringConnectionResult]
  }
  
  @scala.inline
  implicit class RejectVpcPeeringConnectionResultMutableBuilder[Self <: RejectVpcPeeringConnectionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
