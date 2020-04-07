package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVRPresentationAttributes extends js.Object {
  /**
    * Enables foveation in VR to improve perf. 0 none, 1 low, 2 medium, 3 high (Default is 1)
    */
  var foveationLevel: Double
  /**
    * Defines a boolean indicating that we want to get 72hz mode on Oculus Browser (default is off eg. 60hz)
    */
  var highRefreshRate: Boolean
}

object IVRPresentationAttributes {
  @scala.inline
  def apply(foveationLevel: Double, highRefreshRate: Boolean): IVRPresentationAttributes = {
    val __obj = js.Dynamic.literal(foveationLevel = foveationLevel.asInstanceOf[js.Any], highRefreshRate = highRefreshRate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IVRPresentationAttributes]
  }
}

