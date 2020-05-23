package typings.baseui.accordionMod

import typings.baseui.anon.SharedPropsexpandednever
import typings.react.mod.Key
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatelessAccordionProps extends js.Object {
  var accordion: js.UndefOr[Boolean] = js.undefined
  var children: ReactNode
  var disabled: js.UndefOr[Boolean] = js.undefined
  var expanded: js.Array[Key]
  var onChange: js.UndefOr[js.Function1[/* args */ typings.baseui.anon.Key, _]] = js.undefined
  var overrides: js.UndefOr[AccordionOverrides[SharedPropsexpandednever] with PanelOverrides[SharedProps]] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var renderPanelContent: js.UndefOr[Boolean] = js.undefined
}

object StatelessAccordionProps {
  @scala.inline
  def apply(
    expanded: js.Array[Key],
    accordion: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* args */ typings.baseui.anon.Key => _ = null,
    overrides: AccordionOverrides[SharedPropsexpandednever] with PanelOverrides[SharedProps] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    renderPanelContent: js.UndefOr[Boolean] = js.undefined
  ): StatelessAccordionProps = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPanelContent)) __obj.updateDynamic("renderPanelContent")(renderPanelContent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessAccordionProps]
  }
}

