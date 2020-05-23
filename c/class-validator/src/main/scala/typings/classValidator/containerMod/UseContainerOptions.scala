package typings.classValidator.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseContainerOptions extends js.Object {
  /**
    * If set to true, then default container will be used in the case if given container haven't returned anything.
    */
  var fallback: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, then default container will be used in the case if given container thrown an exception.
    */
  var fallbackOnErrors: js.UndefOr[Boolean] = js.undefined
}

object UseContainerOptions {
  @scala.inline
  def apply(fallback: js.UndefOr[Boolean] = js.undefined, fallbackOnErrors: js.UndefOr[Boolean] = js.undefined): UseContainerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fallback)) __obj.updateDynamic("fallback")(fallback.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackOnErrors)) __obj.updateDynamic("fallbackOnErrors")(fallbackOnErrors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseContainerOptions]
  }
}

