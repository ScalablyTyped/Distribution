package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInventorySchemaRequest extends js.Object {
  /**
    * Returns inventory schemas that support aggregation. For example, this call returns the AWS:InstanceInformation type, because it supports aggregation based on the PlatformName, PlatformType, and PlatformVersion attributes.
    */
  var Aggregator: js.UndefOr[AggregatorSchemaOnly] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[GetInventorySchemaMaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Returns the sub-type schema for a specified inventory type.
    */
  var SubType: js.UndefOr[IsSubTypeSchema] = js.native
  /**
    * The type of inventory item to return.
    */
  var TypeName: js.UndefOr[InventoryItemTypeNameFilter] = js.native
}

object GetInventorySchemaRequest {
  @scala.inline
  def apply(
    Aggregator: js.UndefOr[AggregatorSchemaOnly] = js.undefined,
    MaxResults: js.UndefOr[GetInventorySchemaMaxResults] = js.undefined,
    NextToken: NextToken = null,
    SubType: js.UndefOr[IsSubTypeSchema] = js.undefined,
    TypeName: InventoryItemTypeNameFilter = null
  ): GetInventorySchemaRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Aggregator)) __obj.updateDynamic("Aggregator")(Aggregator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(SubType)) __obj.updateDynamic("SubType")(SubType.get.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInventorySchemaRequest]
  }
}

