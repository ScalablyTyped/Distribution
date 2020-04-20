package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorState extends js.Object {
  /**
    * The name of the state.
    */
  var stateName: StateName = js.native
  /**
    * The current state of the detector's timers.
    */
  var timers: Timers = js.native
  /**
    * The current values of the detector's variables.
    */
  var variables: Variables = js.native
}

object DetectorState {
  @scala.inline
  def apply(stateName: StateName, timers: Timers, variables: Variables): DetectorState = {
    val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorState]
  }
}

