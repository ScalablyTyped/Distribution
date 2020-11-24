package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateLagRequest extends js.Object {
  
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
  implicit class UpdateLagRequestOps[Self <: UpdateLagRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLagId(value: LagId): Self = this.set("lagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLagName(value: LagName): Self = this.set("lagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLagName: Self = this.set("lagName", js.undefined)
    
    @scala.inline
    def setMinimumLinks(value: Count): Self = this.set("minimumLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumLinks: Self = this.set("minimumLinks", js.undefined)
  }
}
