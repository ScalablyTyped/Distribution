package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAliasInput extends js.Object {
  /**
    * A unique identifier for the alias that you want to update. You can use either the alias ID or ARN value.
    */
  var AliasId: AliasIdOrArn = js.native
  /**
    * A human-readable description of the alias.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.native
  /**
    * The routing configuration, including routing type and fleet target, for the alias.
    */
  var RoutingStrategy: js.UndefOr[typings.awsSdk.gameliftMod.RoutingStrategy] = js.native
}

object UpdateAliasInput {
  @scala.inline
  def apply(AliasId: AliasIdOrArn): UpdateAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAliasInput]
  }
  @scala.inline
  implicit class UpdateAliasInputOps[Self <: UpdateAliasInput] (val x: Self) extends AnyVal {
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
    def setAliasId(value: AliasIdOrArn): Self = this.set("AliasId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: NonZeroAndMaxString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
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

