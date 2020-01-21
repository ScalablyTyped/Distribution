package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListObjectParentPathsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Returns the path to the ObjectIdentifiers that are associated with the directory.
    */
  var PathToObjectIdentifiersList: js.UndefOr[typings.awsSdk.clouddirectoryMod.PathToObjectIdentifiersList] = js.native
}

object BatchListObjectParentPathsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, PathToObjectIdentifiersList: PathToObjectIdentifiersList = null): BatchListObjectParentPathsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PathToObjectIdentifiersList != null) __obj.updateDynamic("PathToObjectIdentifiersList")(PathToObjectIdentifiersList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectParentPathsResponse]
  }
}

