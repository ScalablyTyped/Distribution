package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingConfigurationInfo extends js.Object {
  /**
    * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in serverless DB engine mode. When the value is set to false for an Aurora Serverless DB cluster, the DB cluster automatically resumes.
    */
  var AutoPause: js.UndefOr[BooleanOptional] = js.native
  /**
    * The maximum capacity for an Aurora DB cluster in serverless DB engine mode.
    */
  var MaxCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The maximum capacity for the Aurora DB cluster in serverless DB engine mode.
    */
  var MinCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The remaining amount of time, in seconds, before the Aurora DB cluster in serverless mode is paused. A DB cluster can be paused only when it's idle (it has no connections).
    */
  var SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.native
  /**
    * The timeout action of a call to ModifyCurrentDBClusterCapacity, either ForceApplyCapacityChange or RollbackCapacityChange.
    */
  var TimeoutAction: js.UndefOr[String] = js.native
}

object ScalingConfigurationInfo {
  @scala.inline
  def apply(): ScalingConfigurationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingConfigurationInfo]
  }
  @scala.inline
  implicit class ScalingConfigurationInfoOps[Self <: ScalingConfigurationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoPause(value: BooleanOptional): Self = this.set("AutoPause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPause: Self = this.set("AutoPause", js.undefined)
    @scala.inline
    def setMaxCapacity(value: IntegerOptional): Self = this.set("MaxCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCapacity: Self = this.set("MaxCapacity", js.undefined)
    @scala.inline
    def setMinCapacity(value: IntegerOptional): Self = this.set("MinCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCapacity: Self = this.set("MinCapacity", js.undefined)
    @scala.inline
    def setSecondsUntilAutoPause(value: IntegerOptional): Self = this.set("SecondsUntilAutoPause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondsUntilAutoPause: Self = this.set("SecondsUntilAutoPause", js.undefined)
    @scala.inline
    def setTimeoutAction(value: String): Self = this.set("TimeoutAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutAction: Self = this.set("TimeoutAction", js.undefined)
  }
  
}

