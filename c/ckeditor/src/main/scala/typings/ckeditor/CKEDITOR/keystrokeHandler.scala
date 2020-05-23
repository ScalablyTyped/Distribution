package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.NumberDictionary
import typings.ckeditor.CKEDITOR.dom.domObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait keystrokeHandler extends js.Object {
  var blockedKeystrokes: NumberDictionary[String | Boolean]
  var keystrokes: NumberDictionary[String | Boolean]
  def attach(domObject: domObject): Unit
}

object keystrokeHandler {
  @scala.inline
  def apply(
    attach: domObject => Unit,
    blockedKeystrokes: NumberDictionary[String | Boolean],
    keystrokes: NumberDictionary[String | Boolean]
  ): keystrokeHandler = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), blockedKeystrokes = blockedKeystrokes.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[keystrokeHandler]
  }
}

