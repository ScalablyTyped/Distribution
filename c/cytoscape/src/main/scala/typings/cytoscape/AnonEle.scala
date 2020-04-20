package typings.cytoscape

import typings.cytoscape.mod.SingularElementReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEle[T] extends js.Object {
  /**
    * The element that corresponds to the minimum value.
    */
  var ele: SingularElementReturnValue
  /**
    * The minimum value found.
    */
  var value: T
}

object AnonEle {
  @scala.inline
  def apply[T](ele: SingularElementReturnValue, value: T): AnonEle[T] = {
    val __obj = js.Dynamic.literal(ele = ele.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEle[T]]
  }
}

