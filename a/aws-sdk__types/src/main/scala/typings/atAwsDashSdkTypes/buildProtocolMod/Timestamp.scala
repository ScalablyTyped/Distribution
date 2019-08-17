package typings.atAwsDashSdkTypes.buildProtocolMod

import typings.atAwsDashSdkTypes.atAwsDashSdkTypesStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp
  extends Shape
     with SerializationModel {
  var timestampFormat: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_Timestamp: timestamp
}

object Timestamp {
  @scala.inline
  def apply(
    `type`: timestamp,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    timestampFormat: java.lang.String = null
  ): Timestamp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    if (timestampFormat != null) __obj.updateDynamic("timestampFormat")(timestampFormat)
    __obj.asInstanceOf[Timestamp]
  }
}

