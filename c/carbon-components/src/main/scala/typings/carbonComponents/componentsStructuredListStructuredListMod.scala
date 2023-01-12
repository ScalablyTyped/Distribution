package typings.carbonComponents

import typings.carbonComponents.anon.PartialStructuredListOpti
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsStructuredListStructuredListMod {
  
  @JSImport("carbon-components/components/structured-list/structured-list", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with StructuredList {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialStructuredListOpti) = this()
    
    /* CompleteClass */
    override def _direction(evt: Event): Double = js.native
    
    /* CompleteClass */
    override def _getInput(index: Double): HTMLElement = js.native
    
    /* CompleteClass */
    override def _handleClick(evt: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def _handleInputChecked(index: Double): Unit = js.native
    
    /* CompleteClass */
    override def _handleKeydownArrow(evt: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def _handleKeydownChecked(evt: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def _nextIndex(array: js.Array[Element], arrayItem: Element, direction: Double): Double = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/structured-list/structured-list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/structured-list/structured-list", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait StructuredList extends StObject {
    
    def _direction(evt: Event): Double
    
    def _getInput(index: Double): HTMLElement
    
    def _handleClick(evt: MouseEvent): Unit
    
    def _handleInputChecked(index: Double): Unit
    
    def _handleKeydownArrow(evt: KeyboardEvent): Unit
    
    def _handleKeydownChecked(evt: KeyboardEvent): Unit
    
    def _nextIndex(array: js.Array[Element], arrayItem: Element, direction: Double): Double
  }
  object StructuredList {
    
    inline def apply(
      _direction: Event => Double,
      _getInput: Double => HTMLElement,
      _handleClick: MouseEvent => Unit,
      _handleInputChecked: Double => Unit,
      _handleKeydownArrow: KeyboardEvent => Unit,
      _handleKeydownChecked: KeyboardEvent => Unit,
      _nextIndex: (js.Array[Element], Element, Double) => Double
    ): StructuredList = {
      val __obj = js.Dynamic.literal(_direction = js.Any.fromFunction1(_direction), _getInput = js.Any.fromFunction1(_getInput), _handleClick = js.Any.fromFunction1(_handleClick), _handleInputChecked = js.Any.fromFunction1(_handleInputChecked), _handleKeydownArrow = js.Any.fromFunction1(_handleKeydownArrow), _handleKeydownChecked = js.Any.fromFunction1(_handleKeydownChecked), _nextIndex = js.Any.fromFunction3(_nextIndex))
      __obj.asInstanceOf[StructuredList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StructuredList] (val x: Self) extends AnyVal {
      
      inline def set_direction(value: Event => Double): Self = StObject.set(x, "_direction", js.Any.fromFunction1(value))
      
      inline def set_getInput(value: Double => HTMLElement): Self = StObject.set(x, "_getInput", js.Any.fromFunction1(value))
      
      inline def set_handleClick(value: MouseEvent => Unit): Self = StObject.set(x, "_handleClick", js.Any.fromFunction1(value))
      
      inline def set_handleInputChecked(value: Double => Unit): Self = StObject.set(x, "_handleInputChecked", js.Any.fromFunction1(value))
      
      inline def set_handleKeydownArrow(value: KeyboardEvent => Unit): Self = StObject.set(x, "_handleKeydownArrow", js.Any.fromFunction1(value))
      
      inline def set_handleKeydownChecked(value: KeyboardEvent => Unit): Self = StObject.set(x, "_handleKeydownChecked", js.Any.fromFunction1(value))
      
      inline def set_nextIndex(value: (js.Array[Element], Element, Double) => Double): Self = StObject.set(x, "_nextIndex", js.Any.fromFunction3(value))
    }
  }
  
  trait StructuredListOptions extends StObject {
    
    var classActive: String
    
    var selectorInit: String
    
    def selectorListInput(id: String): String
    
    var selectorRow: String
  }
  object StructuredListOptions {
    
    inline def apply(
      classActive: String,
      selectorInit: String,
      selectorListInput: String => String,
      selectorRow: String
    ): StructuredListOptions = {
      val __obj = js.Dynamic.literal(classActive = classActive.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorListInput = js.Any.fromFunction1(selectorListInput), selectorRow = selectorRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[StructuredListOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StructuredListOptions] (val x: Self) extends AnyVal {
      
      inline def setClassActive(value: String): Self = StObject.set(x, "classActive", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorListInput(value: String => String): Self = StObject.set(x, "selectorListInput", js.Any.fromFunction1(value))
      
      inline def setSelectorRow(value: String): Self = StObject.set(x, "selectorRow", value.asInstanceOf[js.Any])
    }
  }
}
