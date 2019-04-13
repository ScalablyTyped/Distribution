package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CreditDisplay")
@js.native
class CreditDisplay protected () extends js.Object {
  def this(container: stdLib.HTMLElement) = this()
  def this(container: stdLib.HTMLElement, delimiter: java.lang.String) = this()
  def this(container: stdLib.HTMLElement, delimiter: java.lang.String, viewport: stdLib.HTMLElement) = this()
  var container: stdLib.HTMLElement = js.native
  def addCredit(credit: Credit): scala.Unit = js.native
  def addDefaultCredit(credit: Credit): scala.Unit = js.native
  def beginFrame(credit: Credit): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def endFrame(credit: Credit): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def removeDefaultCredit(credit: Credit): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

/* static members */
@JSImport("cesium", "CreditDisplay")
@js.native
object CreditDisplay extends js.Object {
  var cesiumCredit: cesiumLib.cesiumMod.Credit = js.native
}

