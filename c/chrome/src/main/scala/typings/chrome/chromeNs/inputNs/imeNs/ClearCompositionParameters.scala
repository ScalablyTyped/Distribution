package typings.chrome.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearCompositionParameters extends js.Object {
  /** ID of the context where the composition will be cleared */
  var contextID: Double
}

object ClearCompositionParameters {
  @scala.inline
  def apply(contextID: Double): ClearCompositionParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID)
  
    __obj.asInstanceOf[ClearCompositionParameters]
  }
}

