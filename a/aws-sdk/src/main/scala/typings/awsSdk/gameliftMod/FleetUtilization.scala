package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetUtilization extends js.Object {
  /**
    * Number of active game sessions currently being hosted on all instances in the fleet.
    */
  var ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * Number of server processes in an ACTIVE status currently running across all instances in the fleet
    */
  var ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.native
  /**
    * Number of active player sessions currently being hosted on all instances in the fleet.
    */
  var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
  /**
    * A unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * The maximum number of players allowed across all game sessions currently being hosted on all instances in the fleet.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.native
}

object FleetUtilization {
  @scala.inline
  def apply(): FleetUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetUtilization]
  }
  @scala.inline
  implicit class FleetUtilizationOps[Self <: FleetUtilization] (val x: Self) extends AnyVal {
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
    def setActiveGameSessionCount(value: WholeNumber): Self = this.set("ActiveGameSessionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveGameSessionCount: Self = this.set("ActiveGameSessionCount", js.undefined)
    @scala.inline
    def setActiveServerProcessCount(value: WholeNumber): Self = this.set("ActiveServerProcessCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveServerProcessCount: Self = this.set("ActiveServerProcessCount", js.undefined)
    @scala.inline
    def setCurrentPlayerSessionCount(value: WholeNumber): Self = this.set("CurrentPlayerSessionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPlayerSessionCount: Self = this.set("CurrentPlayerSessionCount", js.undefined)
    @scala.inline
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    @scala.inline
    def setMaximumPlayerSessionCount(value: WholeNumber): Self = this.set("MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumPlayerSessionCount: Self = this.set("MaximumPlayerSessionCount", js.undefined)
  }
  
}

