package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTrustRequest extends js.Object {
  
  /**
    * Updates selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsSdk.directoryserviceMod.SelectiveAuth] = js.native
  
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: typings.awsSdk.directoryserviceMod.TrustId = js.native
}
object UpdateTrustRequest {
  
  @scala.inline
  def apply(TrustId: TrustId): UpdateTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrustRequest]
  }
  
  @scala.inline
  implicit class UpdateTrustRequestOps[Self <: UpdateTrustRequest] (val x: Self) extends AnyVal {
    
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
    def setTrustId(value: TrustId): Self = this.set("TrustId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectiveAuth(value: SelectiveAuth): Self = this.set("SelectiveAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectiveAuth: Self = this.set("SelectiveAuth", js.undefined)
  }
}
