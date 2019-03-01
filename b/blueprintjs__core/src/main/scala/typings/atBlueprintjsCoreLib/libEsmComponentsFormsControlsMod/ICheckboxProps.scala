package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsControlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxProps extends IControlProps {
  /** Whether this checkbox is initially indeterminate (uncontrolled mode). */
  var defaultIndeterminate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether this checkbox is indeterminate, or "partially checked."
    * The checkbox will appear with a small dash instead of a tick to indicate that the value
    * is not exactly true or false.
    *
    * Note that this prop takes precendence over `checked`: if a checkbox is marked both
    * `checked` and `indeterminate` via props, it will appear as indeterminate in the DOM.
    */
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
}

object ICheckboxProps {
  @scala.inline
  def apply(
    IControlProps: IControlProps = null,
    defaultIndeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    indeterminate: js.UndefOr[scala.Boolean] = js.undefined
  ): ICheckboxProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IControlProps)
    if (!js.isUndefined(defaultIndeterminate)) __obj.updateDynamic("defaultIndeterminate")(defaultIndeterminate)
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    __obj.asInstanceOf[ICheckboxProps]
  }
}

