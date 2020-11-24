package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoSelectorProgramId extends js.Object {
  
  /**
    * Selects a specific program from within a multi-program transport stream. If the program doesn't exist, the first program within the transport stream will be selected by default.
    */
  var ProgramId: js.UndefOr[integerMin0Max65536] = js.native
}
object VideoSelectorProgramId {
  
  @scala.inline
  def apply(): VideoSelectorProgramId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorProgramId]
  }
  
  @scala.inline
  implicit class VideoSelectorProgramIdOps[Self <: VideoSelectorProgramId] (val x: Self) extends AnyVal {
    
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
    def setProgramId(value: integerMin0Max65536): Self = this.set("ProgramId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgramId: Self = this.set("ProgramId", js.undefined)
  }
}
