package typings.atAwsDashSdkTypes.buildProtocolMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blob
  extends Shape
     with SerializationModel {
  var streaming: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("type")
  var type_Blob: blob
}

object Blob {
  @scala.inline
  def apply(
    `type`: blob,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    streaming: js.UndefOr[scala.Boolean] = js.undefined
  ): Blob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming)
    __obj.asInstanceOf[Blob]
  }
}

