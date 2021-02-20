package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyInstancePlacementResult extends StObject {
  
  /**
    * Is true if the request succeeds, and an error otherwise.
    */
  var Return: js.UndefOr[Boolean] = js.native
}
object ModifyInstancePlacementResult {
  
  @scala.inline
  def apply(): ModifyInstancePlacementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstancePlacementResult]
  }
  
  @scala.inline
  implicit class ModifyInstancePlacementResultMutableBuilder[Self <: ModifyInstancePlacementResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
