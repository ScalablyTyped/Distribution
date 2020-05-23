package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAfterEnteringVRObservableEvent extends js.Object {
  /**
    * If entering vr was successful
    */
  var success: Boolean
}

object OnAfterEnteringVRObservableEvent {
  @scala.inline
  def apply(success: Boolean): OnAfterEnteringVRObservableEvent = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAfterEnteringVRObservableEvent]
  }
}

