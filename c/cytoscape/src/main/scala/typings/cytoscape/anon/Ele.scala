package typings.cytoscape.anon

import typings.cytoscape.mod.SingularElementReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ele[T] extends js.Object {
  /**
    * The element that corresponds to the minimum value.
    */
  var ele: SingularElementReturnValue = js.native
  /**
    * The minimum value found.
    */
  var value: T = js.native
}

object Ele {
  @scala.inline
  def apply[T](ele: SingularElementReturnValue, value: T): Ele[T] = {
    val __obj = js.Dynamic.literal(ele = ele.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ele[T]]
  }
  @scala.inline
  implicit class EleOps[Self <: Ele[_], T] (val x: Self with Ele[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEle(value: SingularElementReturnValue): Self = this.set("ele", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

