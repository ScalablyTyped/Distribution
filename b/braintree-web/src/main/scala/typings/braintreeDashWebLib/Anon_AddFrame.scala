package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddFrame extends js.Object {
  var amount: scala.Double = js.native
  var nonce: java.lang.String = js.native
  var removeFrame: js.UndefOr[js.Function0[scala.Unit]] = js.native
  def addFrame(): scala.Unit = js.native
  def addFrame(err: braintreeDashWebLib.braintreeDashWebMod.BraintreeError): scala.Unit = js.native
  def addFrame(err: braintreeDashWebLib.braintreeDashWebMod.BraintreeError, iframe: stdLib.HTMLIFrameElement): scala.Unit = js.native
}

