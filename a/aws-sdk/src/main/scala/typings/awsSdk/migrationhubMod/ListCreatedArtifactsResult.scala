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
  def apply(CreatedArtifactList: CreatedArtifactList = null, NextToken: Token = null): ListCreatedArtifactsResult = {
    val __obj = js.Dynamic.literal()
    if (CreatedArtifactList != null) __obj.updateDynamic("CreatedArtifactList")(CreatedArtifactList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCreatedArtifactsResult]
  }
}

