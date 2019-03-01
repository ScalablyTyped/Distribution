package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeError extends js.Object {
  var message: java.lang.String
  var name: java.lang.String
  var stack: java.lang.String
}

object RuntimeError {
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String, stack: java.lang.String): RuntimeError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RuntimeError]
  }
}

