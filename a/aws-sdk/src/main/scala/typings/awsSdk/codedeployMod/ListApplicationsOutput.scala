package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationsOutput extends js.Object {
  /**
    * A list of application names.
    */
  var applications: js.UndefOr[ApplicationsList] = js.native
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list applications call to return the next set of applications in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListApplicationsOutput {
  @scala.inline
  def apply(): ListApplicationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsOutput]
  }
  @scala.inline
  implicit class ListApplicationsOutputOps[Self <: ListApplicationsOutput] (val x: Self) extends AnyVal {
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
    def setApplicationsVarargs(value: ApplicationName*): Self = this.set("applications", js.Array(value :_*))
    @scala.inline
    def setApplications(value: ApplicationsList): Self = this.set("applications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplications: Self = this.set("applications", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

