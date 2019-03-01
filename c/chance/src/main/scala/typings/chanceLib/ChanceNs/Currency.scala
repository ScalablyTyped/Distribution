package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  var code: java.lang.String
  var name: java.lang.String
}

object Currency {
  @scala.inline
  def apply(code: java.lang.String, name: java.lang.String): Currency = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Currency]
  }
}

