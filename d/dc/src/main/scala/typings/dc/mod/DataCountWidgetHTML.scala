package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCountWidgetHTML extends js.Object {
  
  var all: String = js.native
  
  var some: String = js.native
}
object DataCountWidgetHTML {
  
  @scala.inline
  def apply(all: String, some: String): DataCountWidgetHTML = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCountWidgetHTML]
  }
  
  @scala.inline
  implicit class DataCountWidgetHTMLOps[Self <: DataCountWidgetHTML] (val x: Self) extends AnyVal {
    
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
    def setAll(value: String): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSome(value: String): Self = this.set("some", value.asInstanceOf[js.Any])
  }
}
