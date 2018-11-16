package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CreditDisplay")
@js.native
class CreditDisplay protected ()
  extends cesiumLib.cesiumMod.CesiumNs.CreditDisplay {
  def this(container: stdLib.HTMLElement) = this()
  def this(container: stdLib.HTMLElement, delimiter: java.lang.String) = this()
  def this(container: stdLib.HTMLElement, delimiter: java.lang.String, viewport: stdLib.HTMLElement) = this()
  /* CompleteClass */
  override var container: stdLib.HTMLElement = js.native
  /* CompleteClass */
  override def addCredit(credit: cesiumLib.cesiumMod.CesiumNs.Credit): scala.Unit = js.native
  /* CompleteClass */
  override def addDefaultCredit(credit: cesiumLib.cesiumMod.CesiumNs.Credit): scala.Unit = js.native
  /* CompleteClass */
  override def beginFrame(credit: cesiumLib.cesiumMod.CesiumNs.Credit): scala.Unit = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def endFrame(credit: cesiumLib.cesiumMod.CesiumNs.Credit): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def removeDefaultCredit(credit: cesiumLib.cesiumMod.CesiumNs.Credit): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

@JSImport("cesium", "CreditDisplay")
@js.native
object CreditDisplay extends js.Object {
  var cesiumCredit: cesiumLib.cesiumMod.CesiumNs.Credit = js.native
}

