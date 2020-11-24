package typings.blueprintjsCore.htmlSelectMod

import typings.blueprintjsCore.anon.PartialIIconProps
import typings.blueprintjsCore.propsMod.IElementRefProps
import typings.blueprintjsCore.propsMod.IOptionProps
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.SelectHTMLAttributes
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IHTMLSelectPropsOps[Self <: IHTMLSelectProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setIconProps(value: PartialIIconProps): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconProps: Self = this.set("iconProps", js.undefined)
    
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setMinimal(value: Boolean): Self = this.set("minimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimal: Self = this.set("minimal", js.undefined)
    
    @scala.inline
    def setOnChange(value: ChangeEvent[HTMLSelectElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: (String | Double | IOptionProps)*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String | Double | IOptionProps]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
