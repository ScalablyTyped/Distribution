package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThingResponse extends js.Object {
  /**
    * The thing attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * The name of the billing group the thing belongs to.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  /**
    * The default client ID.
    */
  var defaultClientId: js.UndefOr[ClientId] = js.native
  /**
    * The ARN of the thing to describe.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The ID of the thing to describe.
    */
  var thingId: js.UndefOr[ThingId] = js.native
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.native
  /**
    * The thing type name.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
  /**
    * The current version of the thing record in the registry.  To avoid unintentional changes to the information in the registry, you can pass the version information in the expectedVersion parameter of the UpdateThing and DeleteThing calls. 
    */
  var version: js.UndefOr[Version] = js.native
}

object DescribeThingResponse {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    billingGroupName: BillingGroupName = null,
    defaultClientId: ClientId = null,
    thingArn: ThingArn = null,
    thingId: ThingId = null,
    thingName: ThingName = null,
    thingTypeName: ThingTypeName = null,
    version: Int | Double = null
  ): DescribeThingResponse = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (billingGroupName != null) __obj.updateDynamic("billingGroupName")(billingGroupName.asInstanceOf[js.Any])
    if (defaultClientId != null) __obj.updateDynamic("defaultClientId")(defaultClientId.asInstanceOf[js.Any])
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn.asInstanceOf[js.Any])
    if (thingId != null) __obj.updateDynamic("thingId")(thingId.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingResponse]
  }
}

