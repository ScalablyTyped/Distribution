package typings.chrome.chrome.input.ime

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
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClearCompositionParameters]
  }
}

