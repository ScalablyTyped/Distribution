package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobBookmarkEntry extends js.Object {
  
  /**
    * The attempt ID number.
    */
  var Attempt: js.UndefOr[IntegerValue] = js.native
  
  /**
    * The bookmark itself.
    */
  var JobBookmark: js.UndefOr[JsonValue] = js.native
  
  /**
    * The name of the job in question.
    */
  var JobName: js.UndefOr[typings.awsSdk.glueMod.JobName] = js.native
  
  /**
    * The unique run identifier associated with the previous job run.
    */
  var PreviousRunId: js.UndefOr[RunId] = js.native
  
  /**
    * The run ID number.
    */
  var Run: js.UndefOr[IntegerValue] = js.native
  
  /**
    * The run ID number.
    */
  var RunId: js.UndefOr[typings.awsSdk.glueMod.RunId] = js.native
  
  /**
    * The version of the job.
    */
  var Version: js.UndefOr[IntegerValue] = js.native
}
object JobBookmarkEntry {
  
  @scala.inline
  def apply(): JobBookmarkEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobBookmarkEntry]
  }
  
  @scala.inline
  implicit class JobBookmarkEntryOps[Self <: JobBookmarkEntry] (val x: Self) extends AnyVal {
    
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
    def setAttempt(value: IntegerValue): Self = this.set("Attempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttempt: Self = this.set("Attempt", js.undefined)
    
    @scala.inline
    def setJobBookmark(value: JsonValue): Self = this.set("JobBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobBookmark: Self = this.set("JobBookmark", js.undefined)
    
    @scala.inline
    def setJobName(value: JobName): Self = this.set("JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    
    @scala.inline
    def setPreviousRunId(value: RunId): Self = this.set("PreviousRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousRunId: Self = this.set("PreviousRunId", js.undefined)
    
    @scala.inline
    def setRun(value: IntegerValue): Self = this.set("Run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRun: Self = this.set("Run", js.undefined)
    
    @scala.inline
    def setRunId(value: RunId): Self = this.set("RunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunId: Self = this.set("RunId", js.undefined)
    
    @scala.inline
    def setVersion(value: IntegerValue): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
