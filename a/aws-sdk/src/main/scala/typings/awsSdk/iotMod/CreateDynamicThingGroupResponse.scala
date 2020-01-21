package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDynamicThingGroupResponse extends js.Object {
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
    * The dynamic thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The dynamic thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * The dynamic thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
}

object CreateDynamicThingGroupResponse {
  @scala.inline
  def apply(
    indexName: IndexName = null,
    queryString: QueryString = null,
    queryVersion: QueryVersion = null,
    thingGroupArn: ThingGroupArn = null,
    thingGroupId: ThingGroupId = null,
    thingGroupName: ThingGroupName = null
  ): CreateDynamicThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion.asInstanceOf[js.Any])
    if (thingGroupArn != null) __obj.updateDynamic("thingGroupArn")(thingGroupArn.asInstanceOf[js.Any])
    if (thingGroupId != null) __obj.updateDynamic("thingGroupId")(thingGroupId.asInstanceOf[js.Any])
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDynamicThingGroupResponse]
  }
}

