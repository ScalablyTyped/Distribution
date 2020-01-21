package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypedLinkFacetNamesResponse extends js.Object {
  /**
    * The names of typed link facets that exist within the schema.
    */
  var FacetNames: js.UndefOr[TypedLinkNameList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object ListTypedLinkFacetNamesResponse {
  @scala.inline
  def apply(FacetNames: TypedLinkNameList = null, NextToken: NextToken = null): ListTypedLinkFacetNamesResponse = {
    val __obj = js.Dynamic.literal()
    if (FacetNames != null) __obj.updateDynamic("FacetNames")(FacetNames.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypedLinkFacetNamesResponse]
  }
}

