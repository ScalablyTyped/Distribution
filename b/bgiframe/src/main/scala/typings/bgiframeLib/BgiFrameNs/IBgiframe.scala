package typings
package bgiframeLib.BgiFrameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBgiframe extends js.Object {
  var s: ISettings
  def createIframe(): stdLib.HTMLElement
  def fire(element: stdLib.HTMLElement): scala.Unit
  def getIframe(element: stdLib.HTMLElement): stdLib.HTMLElement
  def prop(n: js.Any): java.lang.String
}

object IBgiframe {
  @scala.inline
  def apply(
    createIframe: () => stdLib.HTMLElement,
    fire: stdLib.HTMLElement => scala.Unit,
    getIframe: stdLib.HTMLElement => stdLib.HTMLElement,
    prop: js.Any => java.lang.String,
    s: ISettings
  ): IBgiframe = {
    val __obj = js.Dynamic.literal(createIframe = js.Any.fromFunction0(createIframe), fire = js.Any.fromFunction1(fire), getIframe = js.Any.fromFunction1(getIframe), prop = js.Any.fromFunction1(prop), s = s)
  
    __obj.asInstanceOf[IBgiframe]
  }
}

