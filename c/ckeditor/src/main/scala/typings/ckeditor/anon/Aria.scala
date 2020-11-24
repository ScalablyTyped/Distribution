package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aria extends js.Object {
  
  var aria: js.Array[String] = js.native
  
  var display: js.Array[String] = js.native
}
object Aria {
  
  @scala.inline
  def apply(aria: js.Array[String], display: js.Array[String]): Aria = {
    val __obj = js.Dynamic.literal(aria = aria.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aria]
  }
  
  @scala.inline
  implicit class AriaOps[Self <: Aria] (val x: Self) extends AnyVal {
    
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
    def setAriaVarargs(value: String*): Self = this.set("aria", js.Array(value :_*))
    
    @scala.inline
    def setAria(value: js.Array[String]): Self = this.set("aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayVarargs(value: String*): Self = this.set("display", js.Array(value :_*))
    
    @scala.inline
    def setDisplay(value: js.Array[String]): Self = this.set("display", value.asInstanceOf[js.Any])
  }
}
