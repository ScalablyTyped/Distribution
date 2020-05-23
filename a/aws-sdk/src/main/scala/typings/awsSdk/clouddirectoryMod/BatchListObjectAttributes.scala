package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchListObjectAttributes extends js.Object {
  /**
    * Used to filter the list of object attributes that are associated with a certain facet.
    */
  var FacetFilter: js.UndefOr[SchemaFacet] = js.native
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Reference of the object whose attributes need to be listed.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
}

object BatchListObjectAttributes {
  @scala.inline
  def apply(
    ObjectReference: ObjectReference,
    FacetFilter: SchemaFacet = null,
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null
  ): BatchListObjectAttributes = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
    if (FacetFilter != null) __obj.updateDynamic("FacetFilter")(FacetFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListObjectAttributes]
  }
}

