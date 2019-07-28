package typings.braintreeDashWeb

import typings.braintreeDashWeb.braintreeDashWebMod.BraintreeError
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddFrame extends js.Object {
  var amount: Double = js.native
  var nonce: String = js.native
  var removeFrame: js.UndefOr[js.Function0[Unit]] = js.native
  def addFrame(): Unit = js.native
  def addFrame(err: BraintreeError): Unit = js.native
  def addFrame(err: BraintreeError, iframe: HTMLIFrameElement): Unit = js.native
}

