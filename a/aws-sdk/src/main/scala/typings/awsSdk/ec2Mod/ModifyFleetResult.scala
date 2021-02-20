package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyFleetResult extends StObject {
  
  /**
    * Is true if the request succeeds, and an error otherwise.
    */
  var Return: js.UndefOr[Boolean] = js.native
}
object ModifyFleetResult {
  
  @scala.inline
  def apply(): ModifyFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyFleetResult]
  }
  
  @scala.inline
  implicit class ModifyFleetResultMutableBuilder[Self <: ModifyFleetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
