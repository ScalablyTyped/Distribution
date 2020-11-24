package typings.ckeditor.CKEDITOR.htmlParser

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait basicWriter extends js.Object {
  
  def attribute(attName: String, attValue: String): Unit = js.native
  
  def closeTag(tagName: String): Unit = js.native
  
  def comment(comment: String): Unit = js.native
  
  def getHtml(reset: Boolean): String = js.native
  
  def openTag(tagName: String, attributes: StringDictionary[String]): Unit = js.native
  
  def openTagClose(tagName: String, isSelfClose: Boolean): Unit = js.native
  
  def reset(): Unit = js.native
  
  def text(text: String): Unit = js.native
  
  def write(data: String): Unit = js.native
}
object basicWriter {
  
  @scala.inline
  def apply(
    attribute: (String, String) => Unit,
    closeTag: String => Unit,
    comment: String => Unit,
    getHtml: Boolean => String,
    openTag: (String, StringDictionary[String]) => Unit,
    openTagClose: (String, Boolean) => Unit,
    reset: () => Unit,
    text: String => Unit,
    write: String => Unit
  ): basicWriter = {
    val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2(attribute), closeTag = js.Any.fromFunction1(closeTag), comment = js.Any.fromFunction1(comment), getHtml = js.Any.fromFunction1(getHtml), openTag = js.Any.fromFunction2(openTag), openTagClose = js.Any.fromFunction2(openTagClose), reset = js.Any.fromFunction0(reset), text = js.Any.fromFunction1(text), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[basicWriter]
  }
  
  @scala.inline
  implicit class basicWriterOps[Self <: basicWriter] (val x: Self) extends AnyVal {
    
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
    def setAttribute(value: (String, String) => Unit): Self = this.set("attribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCloseTag(value: String => Unit): Self = this.set("closeTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComment(value: String => Unit): Self = this.set("comment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHtml(value: Boolean => String): Self = this.set("getHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenTag(value: (String, StringDictionary[String]) => Unit): Self = this.set("openTag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpenTagClose(value: (String, Boolean) => Unit): Self = this.set("openTagClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: String => Unit): Self = this.set("text", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: String => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
