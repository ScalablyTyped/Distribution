package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLagRequest extends StObject {
  
  /**
    * The ID of the LAG.
    */
  var lagId: LagId = js.native
}
object DeleteLagRequest {
  
  @scala.inline
  def apply(lagId: LagId): DeleteLagRequest = {
    val __obj = js.Dynamic.literal(lagId = lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLagRequest]
  }
  
  @scala.inline
  implicit class DeleteLagRequestMutableBuilder[Self <: DeleteLagRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
  }
}
