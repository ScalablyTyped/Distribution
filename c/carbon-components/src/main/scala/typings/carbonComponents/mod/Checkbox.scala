package typings.carbonComponents.mod

import typings.carbonComponents.anon.PartialCheckboxOptions
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "Checkbox")
@js.native
open class Checkbox protected ()
  extends typings.carbonComponents.globalsJsComponentsMod.Checkbox {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialCheckboxOptions) = this()
}
object Checkbox {
  
  @JSImport("carbon-components", "Checkbox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "Checkbox.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  object stateChangeTypes {
    
    @JSImport("carbon-components", "Checkbox.stateChangeTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components", "Checkbox.stateChangeTypes.false")
    @js.native
    val `false`: String = js.native
    
    @JSImport("carbon-components", "Checkbox.stateChangeTypes.mixed")
    @js.native
    def mixed: String = js.native
    inline def mixed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mixed")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Checkbox.stateChangeTypes.true")
    @js.native
    val `true`: String = js.native
  }
}
