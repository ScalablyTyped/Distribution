package typings.bgiframe.BgiFrame

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBgiframe extends js.Object {
  var s: ISettings
  def createIframe(): HTMLElement
  def fire(element: HTMLElement): Unit
  def getIframe(element: HTMLElement): HTMLElement
  def prop(n: js.Any): String
}

object IBgiframe {
  @scala.inline
  def apply(
    createIframe: () => HTMLElement,
    fire: HTMLElement => Unit,
    getIframe: HTMLElement => HTMLElement,
    prop: js.Any => String,
    s: ISettings
  ): IBgiframe = {
    val __obj = js.Dynamic.literal(createIframe = js.Any.fromFunction0(createIframe), fire = js.Any.fromFunction1(fire), getIframe = js.Any.fromFunction1(getIframe), prop = js.Any.fromFunction1(prop), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBgiframe]
  }
}

