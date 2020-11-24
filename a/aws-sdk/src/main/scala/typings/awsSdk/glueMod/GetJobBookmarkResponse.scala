package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobBookmarkResponse extends js.Object {
  
  /**
    * A structure that defines a point that a job can resume processing.
    */
  var JobBookmarkEntry: js.UndefOr[typings.awsSdk.glueMod.JobBookmarkEntry] = js.native
}
object GetJobBookmarkResponse {
  
  @scala.inline
  def apply(): GetJobBookmarkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobBookmarkResponse]
  }
  
  @scala.inline
  implicit class GetJobBookmarkResponseOps[Self <: GetJobBookmarkResponse] (val x: Self) extends AnyVal {
    
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
