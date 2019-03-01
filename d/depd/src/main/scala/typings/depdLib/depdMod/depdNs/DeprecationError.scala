package typings
package depdLib.depdMod.depdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecationError
  extends nodeLib.Error {
  val name: depdLib.depdLibStrings.DeprecationError
  var namespace: java.lang.String
  @JSName("stack")
  var stack_DeprecationError: java.lang.String
}

object DeprecationError {
  @scala.inline
  def apply(
    name: depdLib.depdLibStrings.DeprecationError,
    namespace: java.lang.String,
    stack: java.lang.String
  ): DeprecationError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[DeprecationError]
  }
}

