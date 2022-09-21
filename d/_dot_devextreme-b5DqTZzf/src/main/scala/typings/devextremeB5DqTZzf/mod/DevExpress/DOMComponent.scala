package typings.devextremeB5DqTZzf.mod.DevExpress

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.FunctionTemplate
import typings.devextremeB5DqTZzf.mod.DevExpress.core.TemplateManager
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMComponent[TProperties]
  extends StObject
     with Component[TProperties] {
  
  @JSName("$element")
  def $element(): UserDefinedElement[Element] = js.native
  
  var _cancelOptionChange: js.UndefOr[String] = js.native
  
  def _createElement(element: HTMLElement): Unit = js.native
  
  def _getTemplate(template: Any): FunctionTemplate = js.native
  
  def _invalidate(): Unit = js.native
  
  def _notifyOptionChanged(fullName: String, value: Any, previousValue: Any): Unit = js.native
  
  def _refresh(): Unit = js.native
  
  var _templateManager: TemplateManager = js.native
  
  /**
    * Disposes of all the resources allocated to the widget instance.
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets the root UI component element.
    */
  def element(): DxElement_[HTMLElement] = js.native
}
object DOMComponent {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  type DOMComponentInstance = DOMComponent[Properties]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  trait OptionChangedEventInfo[TComponent]
    extends StObject
       with EventInfo[TComponent]
       with ChangedOptionInfo
  object OptionChangedEventInfo {
    
    inline def apply[TComponent](component: TComponent, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEventInfo[TComponent] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEventInfo[TComponent]]
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  trait Properties
    extends StObject
       with DOMComponentOptions[DOMComponentInstance]
  object Properties {
    
    inline def apply(): Properties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Properties]
    }
  }
}
