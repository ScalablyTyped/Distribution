package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignTapePoolInput extends js.Object {
  
  /**
    * Set permissions to bypass governance retention. If the lock type of the archived tape is Governance, the tape's archived age is not older than RetentionLockInDays, and the user does not already have BypassGovernanceRetention, setting this to TRUE enables the user to bypass the retention lock. This parameter is set to true by default for calls from the console. Valid values: TRUE | FALSE 
    */
  var BypassGovernanceRetention: js.UndefOr[scala.Boolean] = js.native
  
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool. Valid Values: GLACIER | DEEP_ARCHIVE 
    */
  var PoolId: typings.awsSdk.storagegatewayMod.PoolId = js.native
  
  /**
    * The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
    */
  var TapeARN: typings.awsSdk.storagegatewayMod.TapeARN = js.native
}
object AssignTapePoolInput {
  
  @scala.inline
  def apply(PoolId: PoolId, TapeARN: TapeARN): AssignTapePoolInput = {
    val __obj = js.Dynamic.literal(PoolId = PoolId.asInstanceOf[js.Any], TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignTapePoolInput]
  }
  
  @scala.inline
  implicit class AssignTapePoolInputOps[Self <: AssignTapePoolInput] (val x: Self) extends AnyVal {
    
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
    def setPoolId(value: PoolId): Self = this.set("PoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = this.set("TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassGovernanceRetention(value: scala.Boolean): Self = this.set("BypassGovernanceRetention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassGovernanceRetention: Self = this.set("BypassGovernanceRetention", js.undefined)
  }
}
