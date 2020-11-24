package typings.chrome.anon

import typings.chrome.chrome.pageCapture.SaveDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpageCapture extends js.Object {
  
  def saveAsMHTML(details: SaveDetails, callback: js.Function1[/* mhtmlData */ js.Any, Unit]): Unit = js.native
}
object TypeofpageCapture {
  
  @scala.inline
  def apply(saveAsMHTML: (SaveDetails, js.Function1[/* mhtmlData */ js.Any, Unit]) => Unit): TypeofpageCapture = {
    val __obj = js.Dynamic.literal(saveAsMHTML = js.Any.fromFunction2(saveAsMHTML))
    __obj.asInstanceOf[TypeofpageCapture]
  }
  
  @scala.inline
  implicit class TypeofpageCaptureOps[Self <: TypeofpageCapture] (val x: Self) extends AnyVal {
    
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
    def setSaveAsMHTML(value: (SaveDetails, js.Function1[/* mhtmlData */ js.Any, Unit]) => Unit): Self = this.set("saveAsMHTML", js.Any.fromFunction2(value))
  }
}
