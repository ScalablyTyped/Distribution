package typings.braintreeWeb.anon

import typings.braintreeWeb.coreMod.BraintreeError
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFrame extends js.Object {
  var amount: Double = js.native
  var nonce: String = js.native
  def addFrame(): Unit = js.native
  def addFrame(err: js.UndefOr[scala.Nothing], iframe: HTMLIFrameElement): Unit = js.native
  def addFrame(err: BraintreeError): Unit = js.native
  def addFrame(err: BraintreeError, iframe: HTMLIFrameElement): Unit = js.native
  def removeFrame(): Unit = js.native
}

