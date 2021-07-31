package typings.carbonComponents.componentsMod

import typings.carbonComponents.inlineLoadingMod.default
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "InlineLoading")
@js.native
class InlineLoading protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}
object InlineLoading {
  
  @JSImport("carbon-components/globals/js/components", "InlineLoading")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "InlineLoading.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  object states {
    
    @JSImport("carbon-components/globals/js/components", "InlineLoading.states")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/globals/js/components", "InlineLoading.states.ACTIVE")
    @js.native
    def ACTIVE: String = js.native
    @scala.inline
    def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "InlineLoading.states.ERROR")
    @js.native
    def ERROR: String = js.native
    @scala.inline
    def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "InlineLoading.states.FINISHED")
    @js.native
    def FINISHED: String = js.native
    @scala.inline
    def FINISHED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINISHED")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "InlineLoading.states.INACTIVE")
    @js.native
    def INACTIVE: String = js.native
    @scala.inline
    def INACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INACTIVE")(x.asInstanceOf[js.Any])
  }
}
