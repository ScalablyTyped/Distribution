package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEtc1 extends js.Object {
  /**
    * etc1 compression format
    */
  var etc1: js.UndefOr[Boolean] = js.undefined
  /**
    * etc2 compression format
    */
  var etc2: js.UndefOr[Boolean] = js.undefined
  /**
    * pvrtc compression format
    */
  var pvrtc: js.UndefOr[Boolean] = js.undefined
  /**
    * s3tc compression format
    */
  var s3tc: js.UndefOr[Boolean] = js.undefined
}

object AnonEtc1 {
  @scala.inline
  def apply(
    etc1: js.UndefOr[Boolean] = js.undefined,
    etc2: js.UndefOr[Boolean] = js.undefined,
    pvrtc: js.UndefOr[Boolean] = js.undefined,
    s3tc: js.UndefOr[Boolean] = js.undefined
  ): AnonEtc1 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(etc1)) __obj.updateDynamic("etc1")(etc1.asInstanceOf[js.Any])
    if (!js.isUndefined(etc2)) __obj.updateDynamic("etc2")(etc2.asInstanceOf[js.Any])
    if (!js.isUndefined(pvrtc)) __obj.updateDynamic("pvrtc")(pvrtc.asInstanceOf[js.Any])
    if (!js.isUndefined(s3tc)) __obj.updateDynamic("s3tc")(s3tc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEtc1]
  }
}

