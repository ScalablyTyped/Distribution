package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConnectorDefinitionVersionsResponse extends js.Object {
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Information about a version.
    */
  var Versions: js.UndefOr[listOfVersionInformation] = js.native
}

object ListConnectorDefinitionVersionsResponse {
  @scala.inline
  def apply(): ListConnectorDefinitionVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectorDefinitionVersionsResponse]
  }
  @scala.inline
  implicit class ListConnectorDefinitionVersionsResponseOps[Self <: ListConnectorDefinitionVersionsResponse] (val x: Self) extends AnyVal {
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
    def setVersionsVarargs(value: VersionInformation*): Self = this.set("Versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: listOfVersionInformation): Self = this.set("Versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("Versions", js.undefined)
  }
  
}

