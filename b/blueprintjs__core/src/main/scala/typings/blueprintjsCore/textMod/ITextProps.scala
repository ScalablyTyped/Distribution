package typings.blueprintjsCore.textMod

import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextProps extends IProps {
  
  /**
    * Indicates that this component should be truncated with an ellipsis if it overflows its container.
    * The `title` attribute will also be added when content overflows to show the full text of the children on hover.
    * @default false
    */
  var ellipsize: js.UndefOr[Boolean] = js.native
  
  /**
    * HTML tag name to use for rendered element.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  
  /**
    * HTML title of the element
    */
  var title: js.UndefOr[String] = js.native
}
object ITextProps {
  
  @scala.inline
  def apply(): ITextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextProps]
  }
  
  @scala.inline
  implicit class ITextPropsOps[Self <: ITextProps] (val x: Self) extends AnyVal {
    
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
    def setEllipsize(value: Boolean): Self = this.set("ellipsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsize: Self = this.set("ellipsize", js.undefined)
    
    @scala.inline
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
