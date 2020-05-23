package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ground extends js.Object {
  /**
    * Should the ground be removed (default false)
    */
  var ground: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the skybox be removed (default false)
    */
  var skyBox: js.UndefOr[Boolean] = js.undefined
}

object Ground {
  @scala.inline
  def apply(ground: js.UndefOr[Boolean] = js.undefined, skyBox: js.UndefOr[Boolean] = js.undefined): Ground = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ground)) __obj.updateDynamic("ground")(ground.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skyBox)) __obj.updateDynamic("skyBox")(skyBox.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ground]
  }
}

