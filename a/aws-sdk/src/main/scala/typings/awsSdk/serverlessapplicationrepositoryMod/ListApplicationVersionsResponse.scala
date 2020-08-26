package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationVersionsResponse extends js.Object {
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * An array of version summaries for the application.
    */
  var Versions: js.UndefOr[listOfVersionSummary] = js.native
}

object ListApplicationVersionsResponse {
  @scala.inline
  def apply(): ListApplicationVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationVersionsResponse]
  }
  @scala.inline
  implicit class ListApplicationVersionsResponseOps[Self <: ListApplicationVersionsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: VersionSummary*): Self = this.set("Versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: listOfVersionSummary): Self = this.set("Versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("Versions", js.undefined)
  }
  
}

