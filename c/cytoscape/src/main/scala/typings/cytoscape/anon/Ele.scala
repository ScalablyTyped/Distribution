package typings.cytoscape.anon

import typings.cytoscape.mod.SingularElementReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ele[T] extends js.Object {
  /**
    * The element that corresponds to the minimum value.
    */
  var ele: SingularElementReturnValue
  /**
    * The minimum value found.
    */
  var value: T
}

object Ele {
  @scala.inline
  def apply[T](ele: SingularElementReturnValue, value: T): Ele[T] = {
    val __obj = js.Dynamic.literal(ele = ele.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ele[T]]
  }
}

