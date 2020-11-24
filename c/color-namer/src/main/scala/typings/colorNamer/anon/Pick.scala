package typings.colorNamer.anon

import typings.colorNamer.mod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pick[T /* <: Palette */] extends js.Object {
  
  var pick: js.Array[T] = js.native
}
object Pick {
  
  @scala.inline
  def apply[T /* <: Palette */](pick: js.Array[T]): Pick[T] = {
    val __obj = js.Dynamic.literal(pick = pick.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pick[T]]
  }
  
  @scala.inline
  implicit class PickOps[Self <: Pick[_], T /* <: Palette */] (val x: Self with Pick[T]) extends AnyVal {
    
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
    def setPickVarargs(value: T*): Self = this.set("pick", js.Array(value :_*))
    
    @scala.inline
    def setPick(value: js.Array[T]): Self = this.set("pick", value.asInstanceOf[js.Any])
  }
}
