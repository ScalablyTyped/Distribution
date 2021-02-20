package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("carbon-components/components/tabs/tabs", JSImport.Default)
  @js.native
  class default protected () extends Tab {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/tabs/tabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object NAVIGATE {
      
      @JSImport("carbon-components/components/tabs/tabs", "default.NAVIGATE")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/tabs/tabs", "default.NAVIGATE.BACKWARD")
      @js.native
      def BACKWARD: Double = js.native
      @scala.inline
      def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/tabs/tabs", "default.NAVIGATE.FORWARD")
      @js.native
      def FORWARD: Double = js.native
      @scala.inline
      def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("carbon-components/components/tabs/tabs", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tab
    extends typings.carbonComponents.contentSwitcherMod.default {
    
    def _handleDocumentClick(event: js.Any): Unit = js.native
    
    def _handleKeyDown(event: js.Any): Unit = js.native
    
    def _updateMenuState(force: js.Any): Unit = js.native
    
    def _updateTriggerText(target: js.Any): Unit = js.native
  }
}
