package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialIIconProps
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IElementRefProps
import typings.blueprintjsCore.propsMod.IOptionProps
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.SelectHTMLAttributes
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlSelectMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/html-select/htmlSelect", "HTMLSelect")
  @js.native
  class HTMLSelect protected ()
    extends AbstractPureComponent2[IHTMLSelectProps, js.Object, js.Object] {
    def this(props: IHTMLSelectProps) = this()
    def this(props: IHTMLSelectProps, context: js.Any) = this()
  }
  
  @js.native
  trait IHTMLSelectProps
    extends SelectHTMLAttributes[HTMLSelectElement]
       with IElementRefProps[HTMLSelectElement] {
    
    /** Whether this element should fill its container. */
    var fill: js.UndefOr[Boolean] = js.native
    
    /** Props to spread to the `<Icon>` element. */
    var iconProps: js.UndefOr[PartialIIconProps] = js.native
    
    /** Whether to use large styles. */
    var large: js.UndefOr[Boolean] = js.native
    
    /** Whether to use minimal styles. */
    var minimal: js.UndefOr[Boolean] = js.native
    
    /** Multiple select is not supported. */
    @JSName("multiple")
    var multiple_IHTMLSelectProps: js.UndefOr[scala.Nothing] = js.native
    
    /** Change event handler. Use `event.currentTarget.value` to access the new value. */
    @JSName("onChange")
    var onChange_IHTMLSelectProps: js.UndefOr[ChangeEventHandler[HTMLSelectElement]] = js.native
    
    /**
      * Shorthand for supplying options: an array of basic types or
      * `{ label?, value }` objects. If no `label` is supplied, `value`
      * will be used as the label.
      */
    var options: js.UndefOr[js.Array[String | Double | IOptionProps]] = js.native
    
    /** Controlled value of this component. */
    @JSName("value")
    var value_IHTMLSelectProps: js.UndefOr[String | Double] = js.native
  }
  object IHTMLSelectProps {
    
    @scala.inline
    def apply(): IHTMLSelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHTMLSelectProps]
    }
    
    @scala.inline
    implicit class IHTMLSelectPropsMutableBuilder[Self <: IHTMLSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setIconProps(value: PartialIIconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[String | Double | IOptionProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: (String | Double | IOptionProps)*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
