package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThingGroupResponse extends js.Object {
  /**
    * The dynamic thing group index name.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The dynamic thing group search query string.
    */
  var queryString: js.UndefOr[QueryString] = js.native
  /**
    * The dynamic thing group query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
  /**
    * The dynamic thing group status.
    */
  var status: js.UndefOr[DynamicGroupStatus] = js.native
  /**
    * The thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * Thing group metadata.
    */
  var thingGroupMetadata: js.UndefOr[ThingGroupMetadata] = js.native
  /**
    * The name of the thing group.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
  /**
    * The thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.native
  /**
    * The version of the thing group.
    */
  var version: js.UndefOr[Version] = js.native
}

object DescribeThingGroupResponse {
  @scala.inline
  def apply(
    indexName: IndexName = null,
    queryString: QueryString = null,
    queryVersion: QueryVersion = null,
    status: DynamicGroupStatus = null,
    thingGroupArn: ThingGroupArn = null,
    thingGroupId: ThingGroupId = null,
    thingGroupMetadata: ThingGroupMetadata = null,
    thingGroupName: ThingGroupName = null,
    thingGroupProperties: ThingGroupProperties = null,
    version: js.UndefOr[Version] = js.undefined
  ): DescribeThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (thingGroupArn != null) __obj.updateDynamic("thingGroupArn")(thingGroupArn.asInstanceOf[js.Any])
    if (thingGroupId != null) __obj.updateDynamic("thingGroupId")(thingGroupId.asInstanceOf[js.Any])
    if (thingGroupMetadata != null) __obj.updateDynamic("thingGroupMetadata")(thingGroupMetadata.asInstanceOf[js.Any])
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName.asInstanceOf[js.Any])
    if (thingGroupProperties != null) __obj.updateDynamic("thingGroupProperties")(thingGroupProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingGroupResponse]
  }
}

