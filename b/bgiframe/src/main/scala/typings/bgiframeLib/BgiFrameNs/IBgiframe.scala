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
    createIframe: js.Function0[stdLib.HTMLElement],
    fire: js.Function1[stdLib.HTMLElement, scala.Unit],
    getIframe: js.Function1[stdLib.HTMLElement, stdLib.HTMLElement],
    prop: js.Function1[js.Any, java.lang.String],
    s: ISettings
  ): IBgiframe = {
    val __obj = js.Dynamic.literal(createIframe = createIframe, fire = fire, getIframe = getIframe, prop = prop, s = s)
  
    __obj.asInstanceOf[IBgiframe]
  }
}

