package typings.bootstrap.mod

import typings.bootstrap.baseComponentMod.ComponentOptions
import typings.bootstrap.baseComponentMod.GetInstanceFactory
import typings.bootstrap.baseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.buttonMod.Button.jQueryInterface
import typings.bootstrap.buttonMod.default
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
  def getInstance: GetInstanceFactory[typings.bootstrap.buttonMod.Button] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typings.bootstrap.buttonMod.Button]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Button.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typings.bootstrap.buttonMod.Button, ComponentOptions] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.buttonMod.Button, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Button.jQueryInterface")
  @js.native
  def jQueryInterface: typings.bootstrap.buttonMod.Button.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
