package typings.ckeditor.CKEDITOR.plugins.pastefromword.lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait numbering extends js.Object {
  
  def getStyle(marker: String): String = js.native
  
  def toNumber(marker: String, markerType: String): Double = js.native
}
object numbering {
  
  @scala.inline
  def apply(getStyle: String => String, toNumber: (String, String) => Double): numbering = {
    val __obj = js.Dynamic.literal(getStyle = js.Any.fromFunction1(getStyle), toNumber = js.Any.fromFunction2(toNumber))
    __obj.asInstanceOf[numbering]
  }
  
  @scala.inline
  implicit class numberingOps[Self <: numbering] (val x: Self) extends AnyVal {
    
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
    def setGetStyle(value: String => String): Self = this.set("getStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToNumber(value: (String, String) => Double): Self = this.set("toNumber", js.Any.fromFunction2(value))
  }
}
