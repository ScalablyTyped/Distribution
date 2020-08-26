package typings.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redo extends js.Object {
  var redo: Double = js.native
  var undo: Double = js.native
}

object Redo {
  @scala.inline
  def apply(redo: Double, undo: Double): Redo = {
    val __obj = js.Dynamic.literal(redo = redo.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redo]
  }
  @scala.inline
  implicit class RedoOps[Self <: Redo] (val x: Self) extends AnyVal {
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
    def setRedo(value: Double): Self = this.set("redo", value.asInstanceOf[js.Any])
    @scala.inline
    def setUndo(value: Double): Self = this.set("undo", value.asInstanceOf[js.Any])
  }
  
}

