package typings.carbonComponents.componentsMod

import typings.carbonComponents.headerNavMod.default
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "HeaderNav")
@js.native
class HeaderNav protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}
object HeaderNav {
  
  @JSImport("carbon-components/globals/js/components", "HeaderNav")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  object NAVIGATE {
    
    @JSImport("carbon-components/globals/js/components", "HeaderNav.NAVIGATE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/globals/js/components", "HeaderNav.NAVIGATE.BACKWARD")
    @js.native
    def BACKWARD: Double = js.native
    @scala.inline
    def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "HeaderNav.NAVIGATE.FORWARD")
    @js.native
    def FORWARD: Double = js.native
    @scala.inline
    def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "HeaderNav.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
