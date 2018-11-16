package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreditDisplay extends js.Object {
  var container: stdLib.HTMLElement
  def addCredit(credit: Credit): scala.Unit
  def addDefaultCredit(credit: Credit): scala.Unit
  def beginFrame(credit: Credit): scala.Unit
  def destroy(): scala.Unit
  def endFrame(credit: Credit): scala.Unit
  def isDestroyed(): scala.Boolean
  def removeDefaultCredit(credit: Credit): scala.Unit
  def update(): scala.Unit
}

