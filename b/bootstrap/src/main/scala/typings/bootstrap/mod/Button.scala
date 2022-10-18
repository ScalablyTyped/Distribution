package typings.bootstrap.mod

import typings.bootstrap.jsDistBaseComponentMod.ComponentOptions
import typings.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typings.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.jsDistButtonMod.Button.jQueryInterface
import typings.bootstrap.jsDistButtonMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Button")
@js.native
open class Button () extends default
object Button {
  
  @JSImport("bootstrap", "Button")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("bootstrap", "Button.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typings.bootstrap.jsDistButtonMod.Button] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typings.bootstrap.jsDistButtonMod.Button]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Button.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typings.bootstrap.jsDistButtonMod.Button, ComponentOptions] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.jsDistButtonMod.Button, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Button.jQueryInterface")
  @js.native
  def jQueryInterface: typings.bootstrap.jsDistButtonMod.Button.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
