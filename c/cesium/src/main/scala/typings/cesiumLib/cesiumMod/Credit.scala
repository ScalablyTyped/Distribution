package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Credit")
@js.native
class Credit protected ()
  extends cesiumLib.cesiumMod.CesiumNs.Credit {
  def this(html: java.lang.String) = this()
  def this(html: java.lang.String, showOnScreen: scala.Boolean) = this()
  /* CompleteClass */
  override val element: stdLib.HTMLElement = js.native
  /* CompleteClass */
  override val html: java.lang.String = js.native
  /* CompleteClass */
  override val imageUrl: java.lang.String = js.native
  /* CompleteClass */
  override val link: java.lang.String = js.native
  /* CompleteClass */
  override val showOnScreen: scala.Boolean = js.native
  /* CompleteClass */
  override val text: java.lang.String = js.native
  /* CompleteClass */
  override def equals(credits: cesiumLib.cesiumMod.CesiumNs.Credit): scala.Boolean = js.native
  /* CompleteClass */
  override def hasImage(): scala.Boolean = js.native
  /* CompleteClass */
  override def hasLink(): scala.Boolean = js.native
}

/* static members */
@JSImport("cesium", "Credit")
@js.native
object Credit extends js.Object {
  def equals(left: cesiumLib.cesiumMod.CesiumNs.Credit, right: cesiumLib.cesiumMod.CesiumNs.Credit): scala.Boolean = js.native
}

