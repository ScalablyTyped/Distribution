package typings
package cavyLib.cavyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TesterProps extends js.Object {
  var sendReport: js.UndefOr[scala.Boolean] = js.undefined
  var specs: js.Array[js.Function1[/* spec */ TestScope, scala.Unit]]
  var waitTime: scala.Double
}

object TesterProps {
  @scala.inline
  def apply(
    specs: js.Array[js.Function1[/* spec */ TestScope, scala.Unit]],
    waitTime: scala.Double,
    sendReport: js.UndefOr[scala.Boolean] = js.undefined
  ): TesterProps = {
    val __obj = js.Dynamic.literal(specs = specs, waitTime = waitTime)
    if (!js.isUndefined(sendReport)) __obj.updateDynamic("sendReport")(sendReport)
    __obj.asInstanceOf[TesterProps]
  }
}

