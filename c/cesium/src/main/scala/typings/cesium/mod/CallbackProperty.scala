package typings.cesium.mod

import typings.cesium.mod.CallbackProperty.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CallbackProperty")
@js.native
class CallbackProperty protected () extends Property {
  def this(callback: Callback, isConstant: Boolean) = this()
  
  def setCallback(callback: Callback, isConstant: Boolean): Unit = js.native
}
object CallbackProperty {
  
  type Callback = js.Function2[/* time */ js.UndefOr[JulianDate], /* result */ js.UndefOr[js.Any], js.Any]
}
