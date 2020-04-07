package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGround extends js.Object {
  /**
    * Should the ground be removed (default false)
    */
  var ground: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the skybox be removed (default false)
    */
  var skyBox: js.UndefOr[Boolean] = js.undefined
}

object AnonGround {
  @scala.inline
  def apply(ground: js.UndefOr[Boolean] = js.undefined, skyBox: js.UndefOr[Boolean] = js.undefined): AnonGround = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ground)) __obj.updateDynamic("ground")(ground.asInstanceOf[js.Any])
    if (!js.isUndefined(skyBox)) __obj.updateDynamic("skyBox")(skyBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGround]
  }
}

