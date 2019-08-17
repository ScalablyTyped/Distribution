package typings.atAwsDashSdkTypes.buildProtocolMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.float
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Float
  extends Shape
     with SerializationModel {
  var min: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_Float: float
}

object Float {
  @scala.inline
  def apply(`type`: float, min: Int | Double = null, sensitive: js.UndefOr[scala.Boolean] = js.undefined): Float = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    __obj.asInstanceOf[Float]
  }
}

