package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDynamicThingGroupRequest extends js.Object {
  /**
    * The expected version of the dynamic thing group to update.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  /**
    * The dynamic thing group index to update.  Currently one index is supported: 'AWS_Things'. 
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The dynamic thing group search query string to update.
    */
  var queryString: js.UndefOr[QueryString] = js.native
  /**
    * The dynamic thing group query version to update.  Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this value. 
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
  /**
    * The name of the dynamic thing group to update.
    */
  var thingGroupName: ThingGroupName = js.native
  /**
    * The dynamic thing group properties to update.
    */
  var thingGroupProperties: ThingGroupProperties = js.native
}

object UpdateDynamicThingGroupRequest {
  @scala.inline
  def apply(
    thingGroupName: ThingGroupName,
    thingGroupProperties: ThingGroupProperties,
    expectedVersion: js.UndefOr[OptionalVersion] = js.undefined,
    indexName: IndexName = null,
    queryString: QueryString = null,
    queryVersion: QueryVersion = null
  ): UpdateDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any], thingGroupProperties = thingGroupProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(expectedVersion)) __obj.updateDynamic("expectedVersion")(expectedVersion.get.asInstanceOf[js.Any])
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDynamicThingGroupRequest]
  }
}

