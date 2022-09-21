package typings.carbonComponents

import typings.carbonComponents.anon.Item
import typings.carbonComponents.anon.PartialTabOptions
import typings.carbonComponents.contentSwitcherMod.ContentSwitcherOptions
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("carbon-components/components/tabs/tabs", JSImport.Default)
  @js.native
  open class default protected () extends Tab {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialTabOptions) = this()
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
      inline def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/tabs/tabs", "default.NAVIGATE.FORWARD")
      @js.native
      def FORWARD: Double = js.native
      inline def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("carbon-components/components/tabs/tabs", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tab
    extends typings.carbonComponents.contentSwitcherMod.default {
    
    def _changeState(detail: Item, callback: js.Function1[/* params */ Any, Unit]): Unit = js.native
    
    def _handleClick(event: MouseEvent): Unit = js.native
    
    def _handleDocumentClick(event: MouseEvent): Unit = js.native
    
    def _handleKeyDown(event: KeyboardEvent): Unit = js.native
    
    def _updateMenuState(): Unit = js.native
    def _updateMenuState(force: Boolean): Unit = js.native
    
    def _updateTriggerText(target: HTMLElement): Unit = js.native
  }
  
  trait TabOptions
    extends StObject
       with ContentSwitcherOptions {
    
    var classButtonDisabled: String
    
    var classHidden: String
    
    var classOpen: String
    
    var selectorButtonEnabled: String
    
    var selectorButtonSelected: String
    
    var selectorLink: String
    
    var selectorMenu: String
    
    var selectorTrigger: String
    
    var selectorTriggerText: String
  }
  object TabOptions {
    
    inline def apply(
      classActive: String,
      classButtonDisabled: String,
      classHidden: String,
      classOpen: String,
      eventAfterSelected: String,
      eventBeforeSelected: String,
      selectorButton: String,
      selectorButtonEnabled: String,
      selectorButtonSelected: String,
      selectorInit: String,
      selectorLink: String,
      selectorMenu: String,
      selectorTrigger: String,
      selectorTriggerText: String
    ): TabOptions = {
      val __obj = js.Dynamic.literal(classActive = classActive.asInstanceOf[js.Any], classButtonDisabled = classButtonDisabled.asInstanceOf[js.Any], classHidden = classHidden.asInstanceOf[js.Any], classOpen = classOpen.asInstanceOf[js.Any], eventAfterSelected = eventAfterSelected.asInstanceOf[js.Any], eventBeforeSelected = eventBeforeSelected.asInstanceOf[js.Any], selectorButton = selectorButton.asInstanceOf[js.Any], selectorButtonEnabled = selectorButtonEnabled.asInstanceOf[js.Any], selectorButtonSelected = selectorButtonSelected.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorLink = selectorLink.asInstanceOf[js.Any], selectorMenu = selectorMenu.asInstanceOf[js.Any], selectorTrigger = selectorTrigger.asInstanceOf[js.Any], selectorTriggerText = selectorTriggerText.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabOptions]
    }
    
    extension [Self <: TabOptions](x: Self) {
      
      inline def setClassButtonDisabled(value: String): Self = StObject.set(x, "classButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setClassHidden(value: String): Self = StObject.set(x, "classHidden", value.asInstanceOf[js.Any])
      
      inline def setClassOpen(value: String): Self = StObject.set(x, "classOpen", value.asInstanceOf[js.Any])
      
      inline def setSelectorButtonEnabled(value: String): Self = StObject.set(x, "selectorButtonEnabled", value.asInstanceOf[js.Any])
      
      inline def setSelectorButtonSelected(value: String): Self = StObject.set(x, "selectorButtonSelected", value.asInstanceOf[js.Any])
      
      inline def setSelectorLink(value: String): Self = StObject.set(x, "selectorLink", value.asInstanceOf[js.Any])
      
      inline def setSelectorMenu(value: String): Self = StObject.set(x, "selectorMenu", value.asInstanceOf[js.Any])
      
      inline def setSelectorTrigger(value: String): Self = StObject.set(x, "selectorTrigger", value.asInstanceOf[js.Any])
      
      inline def setSelectorTriggerText(value: String): Self = StObject.set(x, "selectorTriggerText", value.asInstanceOf[js.Any])
    }
  }
}
