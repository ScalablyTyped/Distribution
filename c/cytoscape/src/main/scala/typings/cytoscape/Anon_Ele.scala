package typings.cytoscape

import typings.cytoscape.cytoscapeMod.SingularElementReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ele[T] extends js.Object {
  /**
    * The element that corresponds to the minimum value.
    */
  var ele: SingularElementReturnValue
  /**
    * The minimum value found.
    */
  var value: T
}

object Anon_Ele {
  @scala.inline
  def apply[T](ele: SingularElementReturnValue, value: T): Anon_Ele[T] = {
    val __obj = js.Dynamic.literal(ele = ele, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ele[T]]
  }
}

