package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTrustResult extends js.Object {
  
  var RequestId: js.UndefOr[typings.awsSdk.directoryserviceMod.RequestId] = js.native
  
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.native
}
object UpdateTrustResult {
  
  @scala.inline
  def apply(): UpdateTrustResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTrustResult]
  }
  
  @scala.inline
  implicit class UpdateTrustResultOps[Self <: UpdateTrustResult] (val x: Self) extends AnyVal {
    
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
    def setRequestId(value: RequestId): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setTrustId(value: TrustId): Self = this.set("TrustId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrustId: Self = this.set("TrustId", js.undefined)
  }
}
