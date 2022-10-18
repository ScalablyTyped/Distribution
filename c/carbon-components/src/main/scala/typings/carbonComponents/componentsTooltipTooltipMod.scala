package typings.carbonComponents

import typings.carbonComponents.anon.Details
import typings.carbonComponents.anon.Dictx
import typings.carbonComponents.anon.PartialTooltipOptions
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTooltipTooltipMod {
  
  @JSImport("carbon-components/components/tooltip/tooltip", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Tooltip {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialTooltipOptions) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/tooltip/tooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/tooltip/tooltip", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait Tooltip extends StObject {
    
    def _handleClick(hasRelatedTargetTypeHadContextMenuDetails: Details): Unit = js.native
    
    var _hasContextMenu: Boolean = js.native
    
    def _hookOn(element: HTMLElement): Unit = js.native
    
    def changeState(state: String, detail: js.Object): Unit = js.native
    def changeState(state: String, detail: js.Object, callback: js.Function0[Unit]): Unit = js.native
    
    def createdByEvent(event: Event): Unit = js.native
  }
  
  trait TooltipOptions extends StObject {
    
    var attribTooltipTarget: String
    
    var classShown: String
    
    var initEventNames: js.Array[String]
    
    def objMenuOffset(menuBody: Element, menuDirection: String): js.UndefOr[Dictx]
    
    var selectorContent: String
    
    var selectorInit: String
  }
  object TooltipOptions {
    
    inline def apply(
      attribTooltipTarget: String,
      classShown: String,
      initEventNames: js.Array[String],
      objMenuOffset: (Element, String) => js.UndefOr[Dictx],
      selectorContent: String,
      selectorInit: String
    ): TooltipOptions = {
      val __obj = js.Dynamic.literal(attribTooltipTarget = attribTooltipTarget.asInstanceOf[js.Any], classShown = classShown.asInstanceOf[js.Any], initEventNames = initEventNames.asInstanceOf[js.Any], objMenuOffset = js.Any.fromFunction2(objMenuOffset), selectorContent = selectorContent.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipOptions]
    }
    
    extension [Self <: TooltipOptions](x: Self) {
      
      inline def setAttribTooltipTarget(value: String): Self = StObject.set(x, "attribTooltipTarget", value.asInstanceOf[js.Any])
      
      inline def setClassShown(value: String): Self = StObject.set(x, "classShown", value.asInstanceOf[js.Any])
      
      inline def setInitEventNames(value: js.Array[String]): Self = StObject.set(x, "initEventNames", value.asInstanceOf[js.Any])
      
      inline def setInitEventNamesVarargs(value: String*): Self = StObject.set(x, "initEventNames", js.Array(value*))
      
      inline def setObjMenuOffset(value: (Element, String) => js.UndefOr[Dictx]): Self = StObject.set(x, "objMenuOffset", js.Any.fromFunction2(value))
      
      inline def setSelectorContent(value: String): Self = StObject.set(x, "selectorContent", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    }
  }
}
