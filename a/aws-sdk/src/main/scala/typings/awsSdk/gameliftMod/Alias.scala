package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alias extends js.Object {
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift alias resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift alias ARN, the resource ID matches the alias ID value.
    */
  var AliasArn: js.UndefOr[typings.awsSdk.gameliftMod.AliasArn] = js.native
  /**
    * A unique identifier for an alias. Alias IDs are unique within a Region.
    */
  var AliasId: js.UndefOr[typings.awsSdk.gameliftMod.AliasId] = js.native
  /**
    * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * A human-readable description of an alias.
    */
  var Description: js.UndefOr[FreeText] = js.native
  /**
    * The time that this data object was last modified. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * A descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.native
  /**
    * The routing configuration, including routing type and fleet target, for the alias. 
    */
  var RoutingStrategy: js.UndefOr[typings.awsSdk.gameliftMod.RoutingStrategy] = js.native
}

object Alias {
  @scala.inline
  def apply(
    AliasArn: AliasArn = null,
    AliasId: AliasId = null,
    CreationTime: Timestamp = null,
    Description: FreeText = null,
    LastUpdatedTime: Timestamp = null,
    Name: NonBlankAndLengthConstraintString = null,
    RoutingStrategy: RoutingStrategy = null
  ): Alias = {
    val __obj = js.Dynamic.literal()
    if (AliasArn != null) __obj.updateDynamic("AliasArn")(AliasArn.asInstanceOf[js.Any])
    if (AliasId != null) __obj.updateDynamic("AliasId")(AliasId.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoutingStrategy != null) __obj.updateDynamic("RoutingStrategy")(RoutingStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
}

