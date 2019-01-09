package typings
package braintreeDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddFrameAmount extends js.Object {
  var amount: scala.Double = js.native
  var nonce: java.lang.String = js.native
  def addFrame(): scala.Unit = js.native
  def addFrame(err: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.BraintreeError): scala.Unit = js.native
  def addFrame(
    err: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.BraintreeError,
    iframe: stdLib.HTMLIFrameElement
  ): scala.Unit = js.native
  def removeFrame(): scala.Unit = js.native
}

