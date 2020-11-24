package typings.ckeditorCkeditor5Engine.mod.dataprocessor

import typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/dataprocessor/htmlwriter
@js.native
trait HtmlWriter extends js.Object {
  
  def getHtml(fragment: DocumentFragment): String = js.native
}
object HtmlWriter {
  
  @scala.inline
  def apply(getHtml: DocumentFragment => String): HtmlWriter = {
    val __obj = js.Dynamic.literal(getHtml = js.Any.fromFunction1(getHtml))
    __obj.asInstanceOf[HtmlWriter]
  }
  
  @scala.inline
  implicit class HtmlWriterOps[Self <: HtmlWriter] (val x: Self) extends AnyVal {
    
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
    def setGetHtml(value: DocumentFragment => String): Self = this.set("getHtml", js.Any.fromFunction1(value))
  }
}
