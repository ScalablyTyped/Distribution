package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.htmlParser.basicWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait htmlWriter extends basicWriter {
  var indentationChars: String = js.native
  var lineBreakChars: String = js.native
  var selfClosingEnd: String = js.native
  def indentation(): Unit = js.native
  def lineBreak(): Unit = js.native
  def setRules(tagName: String, rules: StringDictionary[js.Any]): Unit = js.native
}

object htmlWriter {
  @scala.inline
  def apply(
    attribute: (String, String) => Unit,
    closeTag: String => Unit,
    comment: String => Unit,
    getHtml: Boolean => String,
    indentation: () => Unit,
    indentationChars: String,
    lineBreak: () => Unit,
    lineBreakChars: String,
    openTag: (String, StringDictionary[String]) => Unit,
    openTagClose: (String, Boolean) => Unit,
    reset: () => Unit,
    selfClosingEnd: String,
    setRules: (String, StringDictionary[js.Any]) => Unit,
    text: String => Unit,
    write: String => Unit
  ): htmlWriter = {
    val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2(attribute), closeTag = js.Any.fromFunction1(closeTag), comment = js.Any.fromFunction1(comment), getHtml = js.Any.fromFunction1(getHtml), indentation = js.Any.fromFunction0(indentation), indentationChars = indentationChars.asInstanceOf[js.Any], lineBreak = js.Any.fromFunction0(lineBreak), lineBreakChars = lineBreakChars.asInstanceOf[js.Any], openTag = js.Any.fromFunction2(openTag), openTagClose = js.Any.fromFunction2(openTagClose), reset = js.Any.fromFunction0(reset), selfClosingEnd = selfClosingEnd.asInstanceOf[js.Any], setRules = js.Any.fromFunction2(setRules), text = js.Any.fromFunction1(text), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[htmlWriter]
  }
  @scala.inline
  implicit class htmlWriterOps[Self <: htmlWriter] (val x: Self) extends AnyVal {
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
    def setIndentation(value: () => Unit): Self = this.set("indentation", js.Any.fromFunction0(value))
    @scala.inline
    def setIndentationChars(value: String): Self = this.set("indentationChars", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineBreak(value: () => Unit): Self = this.set("lineBreak", js.Any.fromFunction0(value))
    @scala.inline
    def setLineBreakChars(value: String): Self = this.set("lineBreakChars", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelfClosingEnd(value: String): Self = this.set("selfClosingEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetRules(value: (String, StringDictionary[js.Any]) => Unit): Self = this.set("setRules", js.Any.fromFunction2(value))
  }
  
}

