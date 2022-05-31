package typings.cesium.global.Cesium

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.CreditDisplay")
@js.native
class CreditDisplay protected ()
  extends typings.cesium.mod.CreditDisplay {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, delimiter: String) = this()
  def this(container: HTMLElement, delimiter: String, viewport: HTMLElement) = this()
  def this(container: HTMLElement, delimiter: Unit, viewport: HTMLElement) = this()
}
object CreditDisplay {
  
  @JSGlobal("Cesium.CreditDisplay")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.CreditDisplay.cesiumCredit")
  @js.native
  def cesiumCredit: typings.cesium.mod.Credit = js.native
  inline def cesiumCredit_=(x: typings.cesium.mod.Credit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cesiumCredit")(x.asInstanceOf[js.Any])
}
