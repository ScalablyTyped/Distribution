package typings.bluebirdLst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWForgottenReturn extends js.Object {
  /** Enables all warnings except forgotten return statements. */
  var wForgottenReturn: Boolean
}

object AnonWForgottenReturn {
  @scala.inline
  def apply(wForgottenReturn: Boolean): AnonWForgottenReturn = {
    val __obj = js.Dynamic.literal(wForgottenReturn = wForgottenReturn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWForgottenReturn]
  }
}

