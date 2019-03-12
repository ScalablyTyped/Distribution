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

object CreditDisplay {
  @scala.inline
  def apply(
    addCredit: Credit => scala.Unit,
    addDefaultCredit: Credit => scala.Unit,
    beginFrame: Credit => scala.Unit,
    container: stdLib.HTMLElement,
    destroy: () => scala.Unit,
    endFrame: Credit => scala.Unit,
    isDestroyed: () => scala.Boolean,
    removeDefaultCredit: Credit => scala.Unit,
    update: () => scala.Unit
  ): CreditDisplay = {
    val __obj = js.Dynamic.literal(addCredit = js.Any.fromFunction1(addCredit), addDefaultCredit = js.Any.fromFunction1(addDefaultCredit), beginFrame = js.Any.fromFunction1(beginFrame), container = container, destroy = js.Any.fromFunction0(destroy), endFrame = js.Any.fromFunction1(endFrame), isDestroyed = js.Any.fromFunction0(isDestroyed), removeDefaultCredit = js.Any.fromFunction1(removeDefaultCredit), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[CreditDisplay]
  }
}

