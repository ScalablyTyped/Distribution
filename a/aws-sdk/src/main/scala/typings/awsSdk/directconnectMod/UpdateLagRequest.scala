package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLagRequest extends StObject {
  
  /**
    * The ID of the LAG.
    */
  var lagId: LagId = js.native
  
  /**
    * The name of the LAG.
    */
  var lagName: js.UndefOr[LagName] = js.native
  
  /**
    * The minimum number of physical connections that must be operational for the LAG itself to be operational.
    */
  var minimumLinks: js.UndefOr[Count] = js.native
}
object UpdateLagRequest {
  
  @scala.inline
  def apply(lagId: LagId): UpdateLagRequest = {
    val __obj = js.Dynamic.literal(lagId = lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLagRequest]
  }
  
  @scala.inline
  implicit class UpdateLagRequestMutableBuilder[Self <: UpdateLagRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagName(value: LagName): Self = StObject.set(x, "lagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagNameUndefined: Self = StObject.set(x, "lagName", js.undefined)
    
    @scala.inline
    def setMinimumLinks(value: Count): Self = StObject.set(x, "minimumLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLinksUndefined: Self = StObject.set(x, "minimumLinks", js.undefined)
  }
}
