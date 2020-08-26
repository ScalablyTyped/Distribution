package typings.baconjs.updatebarrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable extends js.Object {
  var id: Double = js.native
  def internalDeps(): js.Array[Observable] = js.native
}

object Observable {
  @scala.inline
  def apply(id: Double, internalDeps: () => js.Array[Observable]): Observable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], internalDeps = js.Any.fromFunction0(internalDeps))
    __obj.asInstanceOf[Observable]
  }
  @scala.inline
  implicit class ObservableOps[Self <: Observable] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalDeps(value: () => js.Array[Observable]): Self = this.set("internalDeps", js.Any.fromFunction0(value))
  }
  
}

