package typings.carbonComponents

import typings.carbonComponents.anon.Left
import typings.carbonComponents.anon.PartialOverflowMenuOption
import typings.std.Element
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsOverflowMenuOverflowMenuMod {
  
  @JSImport("carbon-components/components/overflow-menu/overflow-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components/components/overflow-menu/overflow-menu", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with OverflowMenu {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialOverflowMenuOption) = this()
    
    /* CompleteClass */
    override def _handleDocumentClick(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def _handleKeyPress(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def changeState(state: String, detail: js.Object, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getCurrentNavigation(): Null | Element = js.native
    
    /* CompleteClass */
    override def navigate(direction: Double): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/overflow-menu/overflow-menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/overflow-menu/overflow-menu", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  inline def getMenuOffset(menuBody: Element, direction: String, trigger: Element): js.UndefOr[Left] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuOffset")(menuBody.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], trigger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Left]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait OverflowMenu extends StObject {
    
    def _handleDocumentClick(event: MouseEvent): Unit
    
    def _handleKeyPress(event: KeyboardEvent): Unit
    
    def changeState(state: String, detail: js.Object, callback: js.Function0[Unit]): Unit
    
    def getCurrentNavigation(): Null | Element
    
    def navigate(direction: Double): Unit
  }
  object OverflowMenu {
    
    inline def apply(
      _handleDocumentClick: MouseEvent => Unit,
      _handleKeyPress: KeyboardEvent => Unit,
      changeState: (String, js.Object, js.Function0[Unit]) => Unit,
      getCurrentNavigation: () => Null | Element,
      navigate: Double => Unit
    ): OverflowMenu = {
      val __obj = js.Dynamic.literal(_handleDocumentClick = js.Any.fromFunction1(_handleDocumentClick), _handleKeyPress = js.Any.fromFunction1(_handleKeyPress), changeState = js.Any.fromFunction3(changeState), getCurrentNavigation = js.Any.fromFunction0(getCurrentNavigation), navigate = js.Any.fromFunction1(navigate))
      __obj.asInstanceOf[OverflowMenu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverflowMenu] (val x: Self) extends AnyVal {
      
      inline def setChangeState(value: (String, js.Object, js.Function0[Unit]) => Unit): Self = StObject.set(x, "changeState", js.Any.fromFunction3(value))
      
      inline def setGetCurrentNavigation(value: () => Null | Element): Self = StObject.set(x, "getCurrentNavigation", js.Any.fromFunction0(value))
      
      inline def setNavigate(value: Double => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def set_handleDocumentClick(value: MouseEvent => Unit): Self = StObject.set(x, "_handleDocumentClick", js.Any.fromFunction1(value))
      
      inline def set_handleKeyPress(value: KeyboardEvent => Unit): Self = StObject.set(x, "_handleKeyPress", js.Any.fromFunction1(value))
    }
  }
  
  trait OverflowMenuOptions extends StObject {
    
    var classMenuFlip: String
    
    var classMenuShown: String
    
    var classShown: String
    
    def objMenuOffset(menuBody: Element, direction: String, trigger: Element): js.UndefOr[Left]
    
    def objMenuOffsetFlip(menuBody: Element, direction: String, trigger: Element): js.UndefOr[Left]
    @JSName("objMenuOffsetFlip")
    var objMenuOffsetFlip_Original: js.Function3[
        /* menuBody */ Element, 
        /* direction */ String, 
        /* trigger */ Element, 
        js.UndefOr[Left]
      ]
    
    @JSName("objMenuOffset")
    var objMenuOffset_Original: js.Function3[
        /* menuBody */ Element, 
        /* direction */ String, 
        /* trigger */ Element, 
        js.UndefOr[Left]
      ]
    
    var selectorContent: String
    
    var selectorInit: String
    
    var selectorItem: String
    
    var selectorOptionMenu: String
    
    var selectorTrigger: String
  }
  object OverflowMenuOptions {
    
    inline def apply(
      classMenuFlip: String,
      classMenuShown: String,
      classShown: String,
      objMenuOffset: (/* menuBody */ Element, /* direction */ String, /* trigger */ Element) => js.UndefOr[Left],
      objMenuOffsetFlip: (/* menuBody */ Element, /* direction */ String, /* trigger */ Element) => js.UndefOr[Left],
      selectorContent: String,
      selectorInit: String,
      selectorItem: String,
      selectorOptionMenu: String,
      selectorTrigger: String
    ): OverflowMenuOptions = {
      val __obj = js.Dynamic.literal(classMenuFlip = classMenuFlip.asInstanceOf[js.Any], classMenuShown = classMenuShown.asInstanceOf[js.Any], classShown = classShown.asInstanceOf[js.Any], objMenuOffset = js.Any.fromFunction3(objMenuOffset), objMenuOffsetFlip = js.Any.fromFunction3(objMenuOffsetFlip), selectorContent = selectorContent.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorItem = selectorItem.asInstanceOf[js.Any], selectorOptionMenu = selectorOptionMenu.asInstanceOf[js.Any], selectorTrigger = selectorTrigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverflowMenuOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverflowMenuOptions] (val x: Self) extends AnyVal {
      
      inline def setClassMenuFlip(value: String): Self = StObject.set(x, "classMenuFlip", value.asInstanceOf[js.Any])
      
      inline def setClassMenuShown(value: String): Self = StObject.set(x, "classMenuShown", value.asInstanceOf[js.Any])
      
      inline def setClassShown(value: String): Self = StObject.set(x, "classShown", value.asInstanceOf[js.Any])
      
      inline def setObjMenuOffset(value: (/* menuBody */ Element, /* direction */ String, /* trigger */ Element) => js.UndefOr[Left]): Self = StObject.set(x, "objMenuOffset", js.Any.fromFunction3(value))
      
      inline def setObjMenuOffsetFlip(value: (/* menuBody */ Element, /* direction */ String, /* trigger */ Element) => js.UndefOr[Left]): Self = StObject.set(x, "objMenuOffsetFlip", js.Any.fromFunction3(value))
      
      inline def setSelectorContent(value: String): Self = StObject.set(x, "selectorContent", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorItem(value: String): Self = StObject.set(x, "selectorItem", value.asInstanceOf[js.Any])
      
      inline def setSelectorOptionMenu(value: String): Self = StObject.set(x, "selectorOptionMenu", value.asInstanceOf[js.Any])
      
      inline def setSelectorTrigger(value: String): Self = StObject.set(x, "selectorTrigger", value.asInstanceOf[js.Any])
    }
  }
}
