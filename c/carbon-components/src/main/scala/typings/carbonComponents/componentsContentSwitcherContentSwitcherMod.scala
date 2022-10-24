package typings.carbonComponents

import typings.carbonComponents.anon.Item
import typings.carbonComponents.anon.PartialContentSwitcherOpt
import typings.std.Event
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsContentSwitcherContentSwitcherMod {
  
  @JSImport("carbon-components/components/content-switcher/content-switcher", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ContentSwitcher {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialContentSwitcherOpt) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/content-switcher/content-switcher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/content-switcher/content-switcher", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait ContentSwitcher extends StObject {
    
    def _changeState(param0: Item): Unit = js.native
    def _changeState(param0: Item, callback: js.Function0[Unit]): Unit = js.native
    
    def _handleClick(event: Event): Unit = js.native
    
    def setActive(item: HTMLElement): Unit = js.native
    def setActive(item: HTMLElement, callback: js.Function0[Unit]): Unit = js.native
  }
  
  trait ContentSwitcherOptions extends StObject {
    
    var classActive: String
    
    var eventAfterSelected: String
    
    var eventBeforeSelected: String
    
    var selectorButton: String
    
    var selectorInit: String
  }
  object ContentSwitcherOptions {
    
    inline def apply(
      classActive: String,
      eventAfterSelected: String,
      eventBeforeSelected: String,
      selectorButton: String,
      selectorInit: String
    ): ContentSwitcherOptions = {
      val __obj = js.Dynamic.literal(classActive = classActive.asInstanceOf[js.Any], eventAfterSelected = eventAfterSelected.asInstanceOf[js.Any], eventBeforeSelected = eventBeforeSelected.asInstanceOf[js.Any], selectorButton = selectorButton.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentSwitcherOptions]
    }
    
    extension [Self <: ContentSwitcherOptions](x: Self) {
      
      inline def setClassActive(value: String): Self = StObject.set(x, "classActive", value.asInstanceOf[js.Any])
      
      inline def setEventAfterSelected(value: String): Self = StObject.set(x, "eventAfterSelected", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeSelected(value: String): Self = StObject.set(x, "eventBeforeSelected", value.asInstanceOf[js.Any])
      
      inline def setSelectorButton(value: String): Self = StObject.set(x, "selectorButton", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    }
  }
}
