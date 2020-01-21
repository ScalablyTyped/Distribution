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
  def apply(JobTemplates: listOfJobTemplate = null, NextToken: string = null): ListJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (JobTemplates != null) __obj.updateDynamic("JobTemplates")(JobTemplates.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobTemplatesResponse]
  }
}

