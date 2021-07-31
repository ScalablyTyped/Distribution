package typings.cesium.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CreditDisplay")
@js.native
class CreditDisplay protected () extends StObject {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, delimiter: String) = this()
  def this(container: HTMLElement, delimiter: String, viewport: HTMLElement) = this()
  def this(container: HTMLElement, delimiter: Unit, viewport: HTMLElement) = this()
  
  def addCredit(credit: Credit): Unit = js.native
  
  def addDefaultCredit(credit: Credit): Unit = js.native
  
  def beginFrame(credit: Credit): Unit = js.native
  
  var container: HTMLElement = js.native
  
  def destroy(): Unit = js.native
  
  def endFrame(credit: Credit): Unit = js.native
  
  def isDestroyed(): Boolean = js.native
  
  def removeDefaultCredit(credit: Credit): Unit = js.native
  
  def update(): Unit = js.native
}
object CreditDisplay {
  
  @JSImport("cesium", "CreditDisplay")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "CreditDisplay.cesiumCredit")
  @js.native
  def cesiumCredit: Credit = js.native
  @scala.inline
  def cesiumCredit_=(x: Credit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cesiumCredit")(x.asInstanceOf[js.Any])
}
