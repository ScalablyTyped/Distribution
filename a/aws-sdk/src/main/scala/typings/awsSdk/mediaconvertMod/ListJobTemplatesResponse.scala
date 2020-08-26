package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobTemplatesResponse extends js.Object {
  /**
    * List of Job templates.
    */
  var JobTemplates: js.UndefOr[listOfJobTemplate] = js.native
  /**
    * Use this string to request the next batch of job templates.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListJobTemplatesResponse {
  @scala.inline
  def apply(): ListJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobTemplatesResponse]
  }
  @scala.inline
  implicit class ListJobTemplatesResponseOps[Self <: ListJobTemplatesResponse] (val x: Self) extends AnyVal {
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
    def setJobTemplatesVarargs(value: JobTemplate*): Self = this.set("JobTemplates", js.Array(value :_*))
    @scala.inline
    def setJobTemplates(value: listOfJobTemplate): Self = this.set("JobTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobTemplates: Self = this.set("JobTemplates", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

