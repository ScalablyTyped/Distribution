package typings.baseui.accordionMod

import typings.baseui.anon.Expanded
import typings.baseui.baseuiStrings.expand
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionProps extends js.Object {
  var accordion: js.UndefOr[Boolean] = js.native
  var children: ReactNode = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var initialState: js.UndefOr[AccordionState] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ Expanded, _]] = js.native
  var overrides: js.UndefOr[AccordionOverrides[SharedProps]] = js.native
  var renderAll: js.UndefOr[Boolean] = js.native
  var renderPanelContent: js.UndefOr[Boolean] = js.native
  var stateReducer: js.UndefOr[StateReducer[AccordionState]] = js.native
}

object AccordionProps {
  @scala.inline
  def apply(): AccordionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionProps]
  }
  @scala.inline
  implicit class AccordionPropsOps[Self <: AccordionProps] (val x: Self) extends AnyVal {
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
    def setAccordion(value: Boolean): Self = this.set("accordion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccordion: Self = this.set("accordion", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInitialState(value: AccordionState): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setOnChange(value: /* args */ Expanded => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOverrides(value: AccordionOverrides[SharedProps]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setRenderAll(value: Boolean): Self = this.set("renderAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAll: Self = this.set("renderAll", js.undefined)
    @scala.inline
    def setRenderPanelContent(value: Boolean): Self = this.set("renderPanelContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderPanelContent: Self = this.set("renderPanelContent", js.undefined)
    @scala.inline
    def setStateReducer(value: (expand, AccordionState, AccordionState) => AccordionState): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
  
}

