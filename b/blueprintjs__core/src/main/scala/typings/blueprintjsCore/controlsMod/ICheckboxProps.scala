package typings.blueprintjsCore.controlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxProps extends IControlProps {
  /** Whether this checkbox is initially indeterminate (uncontrolled mode). */
  var defaultIndeterminate: js.UndefOr[Boolean] = js.native
  /**
    * Whether this checkbox is indeterminate, or "partially checked."
    * The checkbox will appear with a small dash instead of a tick to indicate that the value
    * is not exactly true or false.
    *
    * Note that this prop takes precendence over `checked`: if a checkbox is marked both
    * `checked` and `indeterminate` via props, it will appear as indeterminate in the DOM.
    */
  var indeterminate: js.UndefOr[Boolean] = js.native
}

object ICheckboxProps {
  @scala.inline
  def apply(): ICheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxProps]
  }
  @scala.inline
  implicit class ICheckboxPropsOps[Self <: ICheckboxProps] (val x: Self) extends AnyVal {
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
    def setDefaultIndeterminate(value: Boolean): Self = this.set("defaultIndeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultIndeterminate: Self = this.set("defaultIndeterminate", js.undefined)
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
  }
  
}

