package typings.braintreeWeb.anon

import typings.braintreeWeb.coreMod.BraintreeError
import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveFrame extends StObject {
  
  def addFrame(): Unit = js.native
  def addFrame(err: js.UndefOr[scala.Nothing], iframe: HTMLIFrameElement): Unit = js.native
  def addFrame(err: BraintreeError): Unit = js.native
  def addFrame(err: BraintreeError, iframe: HTMLIFrameElement): Unit = js.native
  
  var amount: Double = js.native
  
  var nonce: String = js.native
  
  def removeFrame(): Unit = js.native
}
