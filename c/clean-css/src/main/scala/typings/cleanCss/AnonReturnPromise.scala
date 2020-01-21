package typings.cleanCss

import typings.cleanCss.cleanCssBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReturnPromise extends js.Object {
  /**
    * If you prefer clean-css to return a Promise object then you need to explicitly ask for it; defaults to `false`
    */
  var returnPromise: `true`
}

object AnonReturnPromise {
  @scala.inline
  def apply(returnPromise: `true`): AnonReturnPromise = {
    val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReturnPromise]
  }
}

