package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreatedArtifactsResult extends js.Object {
  /**
    * List of created artifacts up to the maximum number of results specified in the request.
    */
  var CreatedArtifactList: js.UndefOr[typings.awsSdk.migrationhubMod.CreatedArtifactList] = js.native
  /**
    * If there are more created artifacts than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object ListCreatedArtifactsResult {
  @scala.inline
  def apply(): ListCreatedArtifactsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreatedArtifactsResult]
  }
  @scala.inline
  implicit class ListCreatedArtifactsResultOps[Self <: ListCreatedArtifactsResult] (val x: Self) extends AnyVal {
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
    def setCreatedArtifactListVarargs(value: CreatedArtifact*): Self = this.set("CreatedArtifactList", js.Array(value :_*))
    @scala.inline
    def setCreatedArtifactList(value: CreatedArtifactList): Self = this.set("CreatedArtifactList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedArtifactList: Self = this.set("CreatedArtifactList", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

