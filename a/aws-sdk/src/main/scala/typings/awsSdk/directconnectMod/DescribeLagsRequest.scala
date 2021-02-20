package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLagsRequest extends StObject {
  
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.native
}
object DescribeLagsRequest {
  
  @scala.inline
  def apply(): DescribeLagsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLagsRequest]
  }
  
  @scala.inline
  implicit class DescribeLagsRequestMutableBuilder[Self <: DescribeLagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagIdUndefined: Self = StObject.set(x, "lagId", js.undefined)
  }
}
