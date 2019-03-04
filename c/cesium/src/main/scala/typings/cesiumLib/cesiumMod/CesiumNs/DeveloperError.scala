package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperError extends js.Object {
  var message: java.lang.String
  var name: java.lang.String
  var stack: java.lang.String
}

object DeveloperError {
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String, stack: java.lang.String): DeveloperError = {
    val __obj = js.Dynamic.literal(message = message, name = name, stack = stack)
  
    __obj.asInstanceOf[DeveloperError]
  }
}

