package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorModelDefinition extends js.Object {
  /**
    * The state that is entered at the creation of each detector (instance).
    */
  var initialStateName: StateName = js.native
  /**
    * Information about the states of the detector.
    */
  var states: States = js.native
}

object DetectorModelDefinition {
  @scala.inline
  def apply(initialStateName: StateName, states: States): DetectorModelDefinition = {
    val __obj = js.Dynamic.literal(initialStateName = initialStateName.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetectorModelDefinition]
  }
}

