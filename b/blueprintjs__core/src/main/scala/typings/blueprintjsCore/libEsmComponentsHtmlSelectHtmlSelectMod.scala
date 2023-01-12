package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialIconProps
import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IElementRefProps
import typings.blueprintjsCore.libEsmCommonPropsMod.OptionProps
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.SelectHTMLAttributes
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsHtmlSelectHtmlSelectMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/html-select/htmlSelect", "HTMLSelect")
  @js.native
  open class HTMLSelect protected ()
    extends AbstractPureComponent2[HTMLSelectProps, js.Object, js.Object] {
    def this(props: HTMLSelectProps) = this()
    def this(props: HTMLSelectProps, context: Any) = this()
  }
  
  type HTMLSelectProps = IHTMLSelectProps
  
  trait IHTMLSelectProps
    extends StObject
       with IElementRefProps[HTMLSelectElement]
       with SelectHTMLAttributes[HTMLSelectElement] {
    
    /** Whether this element should fill its container. */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /** Props to spread to the `<Icon>` element. */
    var iconProps: js.UndefOr[PartialIconProps] = js.undefined
    
    /** Whether to use large styles. */
    var large: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to use minimal styles. */
    var minimal: js.UndefOr[Boolean] = js.undefined
    
    /** Multiple select is not supported. */
    @JSName("multiple")
    var multiple_IHTMLSelectProps: js.UndefOr[scala.Nothing] = js.undefined
    
    /** Change event handler. Use `event.currentTarget.value` to access the new value. */
    @JSName("onChange")
    var onChange_IHTMLSelectProps: js.UndefOr[ChangeEventHandler[HTMLSelectElement]] = js.undefined
    
    /**
      * Shorthand for supplying options: an array of basic types or
      * `{ label?, value }` objects. If no `label` is supplied, `value`
      * will be used as the label.
      */
    var options: js.UndefOr[js.Array[String | Double | OptionProps]] = js.undefined
    
    /** Controlled value of this component. */
    @JSName("value")
    var value_IHTMLSelectProps: js.UndefOr[String | Double] = js.undefined
  }
  object IHTMLSelectProps {
    
    inline def apply(): IHTMLSelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHTMLSelectProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IHTMLSelectProps] (val x: Self) extends AnyVal {
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setIconProps(value: PartialIconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      inline def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptions(value: js.Array[String | Double | OptionProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: (String | Double | OptionProps)*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
