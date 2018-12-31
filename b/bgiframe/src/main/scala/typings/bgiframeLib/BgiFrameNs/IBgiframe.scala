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

