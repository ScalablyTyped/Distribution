package typings
package cssDashModulesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stringifyable extends js.Object

object Stringifyable {
  @scala.inline
  def apply(toString: () => java.lang.String): Stringifyable = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Stringifyable]
  }
}

