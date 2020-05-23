package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.htmlParser.basicWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait htmlWriter extends basicWriter {
  var indentationChars: String
  var lineBreakChars: String
  var selfClosingEnd: String
  def indentation(): Unit
  def lineBreak(): Unit
  def setRules(tagName: String, rules: StringDictionary[js.Any]): Unit
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
}

