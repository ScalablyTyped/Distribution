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
  def apply(): Alias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alias]
  }
  @scala.inline
  implicit class AliasOps[Self <: Alias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAliasArn(value: AliasArn): Self = this.set("AliasArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliasArn: Self = this.set("AliasArn", js.undefined)
    @scala.inline
    def setAliasId(value: AliasId): Self = this.set("AliasId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliasId: Self = this.set("AliasId", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDescription(value: FreeText): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: Timestamp): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    @scala.inline
    def setName(value: NonBlankAndLengthConstraintString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRoutingStrategy(value: RoutingStrategy): Self = this.set("RoutingStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutingStrategy: Self = this.set("RoutingStrategy", js.undefined)
  }
  
}

