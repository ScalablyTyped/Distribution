package typings
package busboyLib.busboyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var headers: js.Any
}

object Options {
  @scala.inline
  def apply(headers: js.Any): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Options]
  }
}

