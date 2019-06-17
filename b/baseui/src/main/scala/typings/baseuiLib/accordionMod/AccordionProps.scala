package typings
package baseuiLib.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends js.Object {
  var accordion: js.UndefOr[scala.Boolean] = js.undefined
  var children: reactLib.reactMod.ReactNode
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var initialState: js.UndefOr[AccordionState] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_Expanded, _]] = js.undefined
  var overrides: js.UndefOr[AccordionOverrides[SharedProps with baseuiLib.Anon_ExpandedNever]] = js.undefined
  var stateReducer: js.UndefOr[StateReducer[AccordionState]] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    accordion: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    initialState: AccordionState = null,
    onChange: /* args */ baseuiLib.Anon_Expanded => _ = null,
    overrides: AccordionOverrides[SharedProps with baseuiLib.Anon_ExpandedNever] = null,
    stateReducer: StateReducer[AccordionState] = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[AccordionProps]
  }
}

