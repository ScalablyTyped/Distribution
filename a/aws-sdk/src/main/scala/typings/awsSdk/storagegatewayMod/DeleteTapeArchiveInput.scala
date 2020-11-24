package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTapeArchiveInput extends js.Object {
  
  /**
    * Set to TRUE to delete an archived tape that belongs to a custom pool with tape retention lock. Only archived tapes with tape retention lock set to governance can be deleted. Archived tapes with tape retention lock set to compliance can't be deleted.
    */
  var BypassGovernanceRetention: js.UndefOr[scala.Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
    */
  var TapeARN: typings.awsSdk.storagegatewayMod.TapeARN = js.native
}
object DeleteTapeArchiveInput {
  
  @scala.inline
  def apply(TapeARN: TapeARN): DeleteTapeArchiveInput = {
    val __obj = js.Dynamic.literal(TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTapeArchiveInput]
  }
  
  @scala.inline
  implicit class DeleteTapeArchiveInputOps[Self <: DeleteTapeArchiveInput] (val x: Self) extends AnyVal {
    
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
    def setTapeARN(value: TapeARN): Self = this.set("TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassGovernanceRetention(value: scala.Boolean): Self = this.set("BypassGovernanceRetention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassGovernanceRetention: Self = this.set("BypassGovernanceRetention", js.undefined)
  }
}
