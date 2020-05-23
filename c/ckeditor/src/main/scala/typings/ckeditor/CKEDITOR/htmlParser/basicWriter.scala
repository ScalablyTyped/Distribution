package typings.ckeditor.CKEDITOR.htmlParser

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait basicWriter extends js.Object {
  def attribute(attName: String, attValue: String): Unit
  def closeTag(tagName: String): Unit
  def comment(comment: String): Unit
  def getHtml(reset: Boolean): String
  def openTag(tagName: String, attributes: StringDictionary[String]): Unit
  def openTagClose(tagName: String, isSelfClose: Boolean): Unit
  def reset(): Unit
  def text(text: String): Unit
  def write(data: String): Unit
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
}

