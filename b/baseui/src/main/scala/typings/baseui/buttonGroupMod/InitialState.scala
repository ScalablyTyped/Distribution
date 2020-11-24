package typings.baseui.buttonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialState extends js.Object {
  
  var selected: Double | js.Array[Double] = js.native
}
object InitialState {
  
  @scala.inline
  def apply(selected: Double | js.Array[Double]): InitialState = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialState]
  }
  
  @scala.inline
  implicit class InitialStateOps[Self <: InitialState] (val x: Self) extends AnyVal {
    
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
    def setSelectedVarargs(value: Double*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: Double | js.Array[Double]): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
