package typings.chance.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  var code: String
  var name: String
}

object Currency {
  @scala.inline
  def apply(code: String, name: String): Currency = {
    val __obj = js.Dynamic.literal(code = code, name = name)
  
    __obj.asInstanceOf[Currency]
  }
}

