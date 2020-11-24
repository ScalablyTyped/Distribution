package typings.blueprintjsCore.spinnerMod

import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpinnerProps
  extends IProps
     with IIntentProps {
  
  /**
    * Width and height of the spinner in pixels. The size cannot be less than
    * 10px.
    *
    * Constants are available for common sizes:
    * - `Spinner.SIZE_SMALL = 20px`
    * - `Spinner.SIZE_STANDARD = 50px`
    * - `Spinner.SIZE_LARGE = 100px`
    *
    * @default Spinner.SIZE_STANDARD = 50
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * HTML tag for the two wrapper elements. If rendering a `<Spinner>` inside
    * an `<svg>`, change this to an SVG element like `"g"`.
    * @default "div"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  
  /**
    * A value between 0 and 1 (inclusive) representing how far along the operation is.
    * Values below 0 or above 1 will be interpreted as 0 or 1 respectively.
    * Omitting this prop will result in an "indeterminate" spinner where the head spins indefinitely.
    */
  var value: js.UndefOr[Double] = js.native
}
object ISpinnerProps {
  
  @scala.inline
  def apply(): ISpinnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinnerProps]
  }
  
  @scala.inline
  implicit class ISpinnerPropsOps[Self <: ISpinnerProps] (val x: Self) extends AnyVal {
    
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
