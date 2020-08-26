package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationRevisionsOutput extends js.Object {
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list application revisions call to return the next set of application revisions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of locations that contain the matching revisions.
    */
  var revisions: js.UndefOr[RevisionLocationList] = js.native
}

object ListApplicationRevisionsOutput {
  @scala.inline
  def apply(): ListApplicationRevisionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationRevisionsOutput]
  }
  @scala.inline
  implicit class ListApplicationRevisionsOutputOps[Self <: ListApplicationRevisionsOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRevisionsVarargs(value: RevisionLocation*): Self = this.set("revisions", js.Array(value :_*))
    @scala.inline
    def setRevisions(value: RevisionLocationList): Self = this.set("revisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisions: Self = this.set("revisions", js.undefined)
  }
  
}

