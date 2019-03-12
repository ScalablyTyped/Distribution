package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credit extends js.Object {
  val element: stdLib.HTMLElement
  val html: java.lang.String
  val imageUrl: java.lang.String
  val link: java.lang.String
  val showOnScreen: scala.Boolean
  val text: java.lang.String
  def equals(credits: Credit): scala.Boolean
  def hasImage(): scala.Boolean
  def hasLink(): scala.Boolean
}

object Credit {
  @scala.inline
  def apply(
    element: stdLib.HTMLElement,
    equals: Credit => scala.Boolean,
    hasImage: () => scala.Boolean,
    hasLink: () => scala.Boolean,
    html: java.lang.String,
    imageUrl: java.lang.String,
    link: java.lang.String,
    showOnScreen: scala.Boolean,
    text: java.lang.String
  ): Credit = {
    val __obj = js.Dynamic.literal(element = element, equals = js.Any.fromFunction1(equals), hasImage = js.Any.fromFunction0(hasImage), hasLink = js.Any.fromFunction0(hasLink), html = html, imageUrl = imageUrl, link = link, showOnScreen = showOnScreen, text = text)
  
    __obj.asInstanceOf[Credit]
  }
}

