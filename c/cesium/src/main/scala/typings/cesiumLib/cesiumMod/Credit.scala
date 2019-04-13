package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Credit")
@js.native
class Credit protected () extends js.Object {
  def this(html: java.lang.String) = this()
  def this(html: java.lang.String, showOnScreen: scala.Boolean) = this()
  val element: stdLib.HTMLElement = js.native
  val html: java.lang.String = js.native
  val imageUrl: java.lang.String = js.native
  val link: java.lang.String = js.native
  val showOnScreen: scala.Boolean = js.native
  val text: java.lang.String = js.native
  def equals(credits: Credit): scala.Boolean = js.native
  def hasImage(): scala.Boolean = js.native
  def hasLink(): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Credit")
@js.native
object Credit extends js.Object {
  def equals(left: cesiumLib.cesiumMod.Credit, right: cesiumLib.cesiumMod.Credit): scala.Boolean = js.native
}

