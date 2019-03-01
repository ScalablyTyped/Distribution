package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearCompositionParameters extends js.Object {
  /** ID of the context where the composition will be cleared */
  var contextID: scala.Double
}

object ClearCompositionParameters {
  @scala.inline
  def apply(contextID: scala.Double): ClearCompositionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contextID")(contextID)
    __obj.asInstanceOf[ClearCompositionParameters]
  }
}

