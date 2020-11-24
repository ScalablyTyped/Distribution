package typings.blueprintjsCore.textAreaMod

import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.refsMod.IRef
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait ITextAreaProps
  extends TextareaHTMLAttributes[HTMLTextAreaElement]
     with IIntentProps {
  
  /**
    * Whether the text area should take up the full width of its container.
    */
  var fill: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the text area should automatically grow vertically to accomodate content.
    */
  var growVertically: js.UndefOr[Boolean] = js.native
  
  /**
    * Ref handler that receives HTML `<textarea>` element backing this component.
    */
  var inputRef: js.UndefOr[IRef[HTMLTextAreaElement]] = js.native
  
  /**
    * Whether the text area should appear with large styling.
    */
  var large: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the text area should appear with small styling.
    */
  var small: js.UndefOr[Boolean] = js.native
}
object ITextAreaProps {
  
  @scala.inline
  def apply(): ITextAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextAreaProps]
  }
  
  @scala.inline
  implicit class ITextAreaPropsOps[Self <: ITextAreaProps] (val x: Self) extends AnyVal {
    
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
    def setGrowVertically(value: Boolean): Self = this.set("growVertically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrowVertically: Self = this.set("growVertically", js.undefined)
    
    @scala.inline
    def setInputRefFunction1(value: /* ref */ HTMLTextAreaElement | Null => js.Any): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputRef(value: IRef[HTMLTextAreaElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
  }
}
