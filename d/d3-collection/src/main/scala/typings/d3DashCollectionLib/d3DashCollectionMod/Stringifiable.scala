package typings
package d3DashCollectionLib.d3DashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stringifiable extends js.Object

object Stringifiable {
  @scala.inline
  def apply(toString: () => java.lang.String): Stringifiable = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Stringifiable]
  }
}

