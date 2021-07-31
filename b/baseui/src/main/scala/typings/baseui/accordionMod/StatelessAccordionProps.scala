package typings.baseui.accordionMod

import typings.react.mod.Key
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatelessAccordionProps extends StObject {
  
  var accordion: js.UndefOr[Boolean] = js.undefined
  
  var children: ReactNode
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var expanded: js.Array[Key]
  
  var onChange: js.UndefOr[js.Function1[/* args */ typings.baseui.anon.Key, js.Any]] = js.undefined
  
  var overrides: js.UndefOr[AccordionOverrides[SharedProps] & PanelOverrides[SharedProps]] = js.undefined
  
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  var renderPanelContent: js.UndefOr[Boolean] = js.undefined
}
object StatelessAccordionProps {
  
  @scala.inline
  def apply(expanded: js.Array[Key]): StatelessAccordionProps = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessAccordionProps]
  }
  
  @scala.inline
  implicit class StatelessAccordionPropsMutableBuilder[Self <: StatelessAccordionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setExpanded(value: js.Array[Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedVarargs(value: Key*): Self = StObject.set(x, "expanded", js.Array(value :_*))
    
    @scala.inline
    def setOnChange(value: /* args */ typings.baseui.anon.Key => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOverrides(value: AccordionOverrides[SharedProps] & PanelOverrides[SharedProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    @scala.inline
    def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
  }
}
