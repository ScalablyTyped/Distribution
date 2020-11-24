package typings.cliBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marks extends js.Object {
  
  var marks: typings.cliBox.mod.Marks = js.native
}
object Marks {
  
  @scala.inline
  def apply(marks: typings.cliBox.mod.Marks): Marks = {
    val __obj = js.Dynamic.literal(marks = marks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marks]
  }
  
  @scala.inline
  implicit class MarksOps[Self <: Marks] (val x: Self) extends AnyVal {
    
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
    def setMarks(value: typings.cliBox.mod.Marks): Self = this.set("marks", value.asInstanceOf[js.Any])
  }
}
