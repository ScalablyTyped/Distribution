package typings.ckeditorCkeditor5Core.mod.editor.utils

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementApi extends js.Object {
  val sourceElement: HTMLElement
  def updateSourceElement(): Unit
}

object ElementApi {
  @scala.inline
  def apply(sourceElement: HTMLElement, updateSourceElement: () => Unit): ElementApi = {
    val __obj = js.Dynamic.literal(sourceElement = sourceElement.asInstanceOf[js.Any], updateSourceElement = js.Any.fromFunction0(updateSourceElement))
  
    __obj.asInstanceOf[ElementApi]
  }
}

