package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetJobBookmarkResponse extends js.Object {
  
  /**
    * The reset bookmark entry.
    */
  var JobBookmarkEntry: js.UndefOr[typings.awsSdk.glueMod.JobBookmarkEntry] = js.native
}
object ResetJobBookmarkResponse {
  
  @scala.inline
  def apply(): ResetJobBookmarkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetJobBookmarkResponse]
  }
  
  @scala.inline
  implicit class ResetJobBookmarkResponseOps[Self <: ResetJobBookmarkResponse] (val x: Self) extends AnyVal {
    
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
    def setJobBookmarkEntry(value: JobBookmarkEntry): Self = this.set("JobBookmarkEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobBookmarkEntry: Self = this.set("JobBookmarkEntry", js.undefined)
  }
}
