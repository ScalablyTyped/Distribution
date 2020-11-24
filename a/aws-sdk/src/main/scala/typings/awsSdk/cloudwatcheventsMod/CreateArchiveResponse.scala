package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateArchiveResponse extends js.Object {
  
  /**
    * The ARN of the archive that was created.
    */
  var ArchiveArn: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ArchiveArn] = js.native
  
  /**
    * The time at which the archive was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The state of the archive that was created.
    */
  var State: js.UndefOr[ArchiveState] = js.native
  
  /**
    * The reason that the archive is in the state.
    */
  var StateReason: js.UndefOr[ArchiveStateReason] = js.native
}
object CreateArchiveResponse {
  
  @scala.inline
  def apply(): CreateArchiveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateArchiveResponse]
  }
  
  @scala.inline
  implicit class CreateArchiveResponseOps[Self <: CreateArchiveResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArchiveArn(value: ArchiveArn): Self = this.set("ArchiveArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveArn: Self = this.set("ArchiveArn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setState(value: ArchiveState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateReason(value: ArchiveStateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
  }
}
