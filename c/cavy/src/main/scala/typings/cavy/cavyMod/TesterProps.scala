package typings.cavy.cavyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TesterProps extends js.Object {
  var sendReport: js.UndefOr[Boolean] = js.undefined
  var specs: js.Array[js.Function1[/* spec */ TestScope, Unit]]
  var waitTime: Double
}

object TesterProps {
  @scala.inline
  def apply(
    specs: js.Array[js.Function1[/* spec */ TestScope, Unit]],
    waitTime: Double,
    sendReport: js.UndefOr[Boolean] = js.undefined
  ): TesterProps = {
    val __obj = js.Dynamic.literal(specs = specs, waitTime = waitTime)
    if (!js.isUndefined(sendReport)) __obj.updateDynamic("sendReport")(sendReport)
    __obj.asInstanceOf[TesterProps]
  }
}

