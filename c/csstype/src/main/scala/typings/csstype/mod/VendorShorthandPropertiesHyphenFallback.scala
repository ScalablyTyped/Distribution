package typings.csstype.mod

import typings.csstype.mod.Property.Animation
import typings.csstype.mod.Property.BorderImage
import typings.csstype.mod.Property.BorderRadius
import typings.csstype.mod.Property.ColumnRule
import typings.csstype.mod.Property.Columns
import typings.csstype.mod.Property.Flex
import typings.csstype.mod.Property.FlexFlow
import typings.csstype.mod.Property.MsContentZoomLimit
import typings.csstype.mod.Property.MsContentZoomSnap
import typings.csstype.mod.Property.MsScrollLimit
import typings.csstype.mod.Property.MsScrollSnapX
import typings.csstype.mod.Property.MsScrollSnapY
import typings.csstype.mod.Property.TextEmphasis
import typings.csstype.mod.Property.Transition
import typings.csstype.mod.Property.WebkitBorderBefore
import typings.csstype.mod.Property.WebkitMask
import typings.csstype.mod.Property.WebkitTextStroke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof csstype.csstype.VendorShorthandPropertiesHyphen<TLength, TTime> ]: csstype.csstype.VendorShorthandPropertiesHyphen<TLength, TTime>[P] | std.Array<csstype.csstype.VendorShorthandPropertiesHyphen<TLength, TTime>[P]>} */
@js.native
trait VendorShorthandPropertiesHyphenFallback[TLength, TTime] extends js.Object {
  var `-moz-animation`: js.UndefOr[Animation[TTime] | js.Array[js.UndefOr[Animation[TTime]]]] = js.native
  var `-moz-border-image`: js.UndefOr[BorderImage | js.Array[js.UndefOr[BorderImage]]] = js.native
  var `-moz-column-rule`: js.UndefOr[ColumnRule[TLength] | js.Array[js.UndefOr[ColumnRule[TLength]]]] = js.native
  var `-moz-columns`: js.UndefOr[Columns[TLength] | js.Array[js.UndefOr[Columns[TLength]]]] = js.native
  var `-moz-transition`: js.UndefOr[Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]] = js.native
  var `-ms-content-zoom-limit`: js.UndefOr[MsContentZoomLimit | js.Array[js.UndefOr[MsContentZoomLimit]]] = js.native
  var `-ms-content-zoom-snap`: js.UndefOr[MsContentZoomSnap | js.Array[js.UndefOr[MsContentZoomSnap]]] = js.native
  var `-ms-flex`: js.UndefOr[Flex[TLength] | js.Array[js.UndefOr[Flex[TLength]]]] = js.native
  var `-ms-scroll-limit`: js.UndefOr[MsScrollLimit | js.Array[js.UndefOr[MsScrollLimit]]] = js.native
  var `-ms-scroll-snap-x`: js.UndefOr[MsScrollSnapX | js.Array[js.UndefOr[MsScrollSnapX]]] = js.native
  var `-ms-scroll-snap-y`: js.UndefOr[MsScrollSnapY | js.Array[js.UndefOr[MsScrollSnapY]]] = js.native
  var `-ms-transition`: js.UndefOr[Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]] = js.native
  var `-webkit-animation`: js.UndefOr[Animation[TTime] | js.Array[js.UndefOr[Animation[TTime]]]] = js.native
  var `-webkit-border-before`: js.UndefOr[WebkitBorderBefore[TLength] | js.Array[js.UndefOr[WebkitBorderBefore[TLength]]]] = js.native
  var `-webkit-border-image`: js.UndefOr[BorderImage | js.Array[js.UndefOr[BorderImage]]] = js.native
  var `-webkit-border-radius`: js.UndefOr[BorderRadius[TLength] | js.Array[js.UndefOr[BorderRadius[TLength]]]] = js.native
  var `-webkit-column-rule`: js.UndefOr[ColumnRule[TLength] | js.Array[js.UndefOr[ColumnRule[TLength]]]] = js.native
  var `-webkit-columns`: js.UndefOr[Columns[TLength] | js.Array[js.UndefOr[Columns[TLength]]]] = js.native
  var `-webkit-flex`: js.UndefOr[Flex[TLength] | js.Array[js.UndefOr[Flex[TLength]]]] = js.native
  var `-webkit-flex-flow`: js.UndefOr[FlexFlow | js.Array[js.UndefOr[FlexFlow]]] = js.native
  var `-webkit-mask`: js.UndefOr[WebkitMask[TLength] | js.Array[js.UndefOr[WebkitMask[TLength]]]] = js.native
  var `-webkit-text-emphasis`: js.UndefOr[TextEmphasis | js.Array[js.UndefOr[TextEmphasis]]] = js.native
  var `-webkit-text-stroke`: js.UndefOr[WebkitTextStroke[TLength] | js.Array[js.UndefOr[WebkitTextStroke[TLength]]]] = js.native
  var `-webkit-transition`: js.UndefOr[Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]] = js.native
}

object VendorShorthandPropertiesHyphenFallback {
  @scala.inline
  def apply[TLength, TTime](): VendorShorthandPropertiesHyphenFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorShorthandPropertiesHyphenFallback[TLength, TTime]]
  }
  @scala.inline
  implicit class VendorShorthandPropertiesHyphenFallbackOps[Self <: VendorShorthandPropertiesHyphenFallback[_, _], TLength, TTime] (val x: Self with (VendorShorthandPropertiesHyphenFallback[TLength, TTime])) extends AnyVal {
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
    def `set-moz-animationVarargs`(value: js.UndefOr[Animation[TTime]]*): Self = this.set("-moz-animation", js.Array(value :_*))
    @scala.inline
    def `set-moz-animation`(value: Animation[TTime] | js.Array[js.UndefOr[Animation[TTime]]]): Self = this.set("-moz-animation", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-animation`: Self = this.set("-moz-animation", js.undefined)
    @scala.inline
    def `set-moz-border-imageVarargs`(value: js.UndefOr[BorderImage]*): Self = this.set("-moz-border-image", js.Array(value :_*))
    @scala.inline
    def `set-moz-border-image`(value: BorderImage | js.Array[js.UndefOr[BorderImage]]): Self = this.set("-moz-border-image", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-border-image`: Self = this.set("-moz-border-image", js.undefined)
    @scala.inline
    def `set-moz-column-ruleVarargs`(value: js.UndefOr[ColumnRule[TLength]]*): Self = this.set("-moz-column-rule", js.Array(value :_*))
    @scala.inline
    def `set-moz-column-rule`(value: ColumnRule[TLength] | js.Array[js.UndefOr[ColumnRule[TLength]]]): Self = this.set("-moz-column-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-column-rule`: Self = this.set("-moz-column-rule", js.undefined)
    @scala.inline
    def `set-moz-columnsVarargs`(value: js.UndefOr[Columns[TLength]]*): Self = this.set("-moz-columns", js.Array(value :_*))
    @scala.inline
    def `set-moz-columns`(value: Columns[TLength] | js.Array[js.UndefOr[Columns[TLength]]]): Self = this.set("-moz-columns", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-columns`: Self = this.set("-moz-columns", js.undefined)
    @scala.inline
    def `set-moz-transitionVarargs`(value: js.UndefOr[Transition[TTime]]*): Self = this.set("-moz-transition", js.Array(value :_*))
    @scala.inline
    def `set-moz-transition`(value: Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]): Self = this.set("-moz-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-transition`: Self = this.set("-moz-transition", js.undefined)
    @scala.inline
    def `set-ms-content-zoom-limitVarargs`(value: js.UndefOr[MsContentZoomLimit]*): Self = this.set("-ms-content-zoom-limit", js.Array(value :_*))
    @scala.inline
    def `set-ms-content-zoom-limit`(value: MsContentZoomLimit | js.Array[js.UndefOr[MsContentZoomLimit]]): Self = this.set("-ms-content-zoom-limit", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-content-zoom-limit`: Self = this.set("-ms-content-zoom-limit", js.undefined)
    @scala.inline
    def `set-ms-content-zoom-snapVarargs`(value: js.UndefOr[MsContentZoomSnap]*): Self = this.set("-ms-content-zoom-snap", js.Array(value :_*))
    @scala.inline
    def `set-ms-content-zoom-snap`(value: MsContentZoomSnap | js.Array[js.UndefOr[MsContentZoomSnap]]): Self = this.set("-ms-content-zoom-snap", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-content-zoom-snap`: Self = this.set("-ms-content-zoom-snap", js.undefined)
    @scala.inline
    def `set-ms-flexVarargs`(value: js.UndefOr[Flex[TLength]]*): Self = this.set("-ms-flex", js.Array(value :_*))
    @scala.inline
    def `set-ms-flex`(value: Flex[TLength] | js.Array[js.UndefOr[Flex[TLength]]]): Self = this.set("-ms-flex", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-flex`: Self = this.set("-ms-flex", js.undefined)
    @scala.inline
    def `set-ms-scroll-limitVarargs`(value: js.UndefOr[MsScrollLimit]*): Self = this.set("-ms-scroll-limit", js.Array(value :_*))
    @scala.inline
    def `set-ms-scroll-limit`(value: MsScrollLimit | js.Array[js.UndefOr[MsScrollLimit]]): Self = this.set("-ms-scroll-limit", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-scroll-limit`: Self = this.set("-ms-scroll-limit", js.undefined)
    @scala.inline
    def `set-ms-scroll-snap-xVarargs`(value: js.UndefOr[MsScrollSnapX]*): Self = this.set("-ms-scroll-snap-x", js.Array(value :_*))
    @scala.inline
    def `set-ms-scroll-snap-x`(value: MsScrollSnapX | js.Array[js.UndefOr[MsScrollSnapX]]): Self = this.set("-ms-scroll-snap-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-scroll-snap-x`: Self = this.set("-ms-scroll-snap-x", js.undefined)
    @scala.inline
    def `set-ms-scroll-snap-yVarargs`(value: js.UndefOr[MsScrollSnapY]*): Self = this.set("-ms-scroll-snap-y", js.Array(value :_*))
    @scala.inline
    def `set-ms-scroll-snap-y`(value: MsScrollSnapY | js.Array[js.UndefOr[MsScrollSnapY]]): Self = this.set("-ms-scroll-snap-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-scroll-snap-y`: Self = this.set("-ms-scroll-snap-y", js.undefined)
    @scala.inline
    def `set-ms-transitionVarargs`(value: js.UndefOr[Transition[TTime]]*): Self = this.set("-ms-transition", js.Array(value :_*))
    @scala.inline
    def `set-ms-transition`(value: Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]): Self = this.set("-ms-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-transition`: Self = this.set("-ms-transition", js.undefined)
    @scala.inline
    def `set-webkit-animationVarargs`(value: js.UndefOr[Animation[TTime]]*): Self = this.set("-webkit-animation", js.Array(value :_*))
    @scala.inline
    def `set-webkit-animation`(value: Animation[TTime] | js.Array[js.UndefOr[Animation[TTime]]]): Self = this.set("-webkit-animation", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-animation`: Self = this.set("-webkit-animation", js.undefined)
    @scala.inline
    def `set-webkit-border-beforeVarargs`(value: js.UndefOr[WebkitBorderBefore[TLength]]*): Self = this.set("-webkit-border-before", js.Array(value :_*))
    @scala.inline
    def `set-webkit-border-before`(value: WebkitBorderBefore[TLength] | js.Array[js.UndefOr[WebkitBorderBefore[TLength]]]): Self = this.set("-webkit-border-before", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-border-before`: Self = this.set("-webkit-border-before", js.undefined)
    @scala.inline
    def `set-webkit-border-imageVarargs`(value: js.UndefOr[BorderImage]*): Self = this.set("-webkit-border-image", js.Array(value :_*))
    @scala.inline
    def `set-webkit-border-image`(value: BorderImage | js.Array[js.UndefOr[BorderImage]]): Self = this.set("-webkit-border-image", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-border-image`: Self = this.set("-webkit-border-image", js.undefined)
    @scala.inline
    def `set-webkit-border-radiusVarargs`(value: js.UndefOr[BorderRadius[TLength]]*): Self = this.set("-webkit-border-radius", js.Array(value :_*))
    @scala.inline
    def `set-webkit-border-radius`(value: BorderRadius[TLength] | js.Array[js.UndefOr[BorderRadius[TLength]]]): Self = this.set("-webkit-border-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-border-radius`: Self = this.set("-webkit-border-radius", js.undefined)
    @scala.inline
    def `set-webkit-column-ruleVarargs`(value: js.UndefOr[ColumnRule[TLength]]*): Self = this.set("-webkit-column-rule", js.Array(value :_*))
    @scala.inline
    def `set-webkit-column-rule`(value: ColumnRule[TLength] | js.Array[js.UndefOr[ColumnRule[TLength]]]): Self = this.set("-webkit-column-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-column-rule`: Self = this.set("-webkit-column-rule", js.undefined)
    @scala.inline
    def `set-webkit-columnsVarargs`(value: js.UndefOr[Columns[TLength]]*): Self = this.set("-webkit-columns", js.Array(value :_*))
    @scala.inline
    def `set-webkit-columns`(value: Columns[TLength] | js.Array[js.UndefOr[Columns[TLength]]]): Self = this.set("-webkit-columns", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-columns`: Self = this.set("-webkit-columns", js.undefined)
    @scala.inline
    def `set-webkit-flexVarargs`(value: js.UndefOr[Flex[TLength]]*): Self = this.set("-webkit-flex", js.Array(value :_*))
    @scala.inline
    def `set-webkit-flex`(value: Flex[TLength] | js.Array[js.UndefOr[Flex[TLength]]]): Self = this.set("-webkit-flex", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-flex`: Self = this.set("-webkit-flex", js.undefined)
    @scala.inline
    def `set-webkit-flex-flowVarargs`(value: js.UndefOr[FlexFlow]*): Self = this.set("-webkit-flex-flow", js.Array(value :_*))
    @scala.inline
    def `set-webkit-flex-flow`(value: FlexFlow | js.Array[js.UndefOr[FlexFlow]]): Self = this.set("-webkit-flex-flow", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-flex-flow`: Self = this.set("-webkit-flex-flow", js.undefined)
    @scala.inline
    def `set-webkit-maskVarargs`(value: js.UndefOr[WebkitMask[TLength]]*): Self = this.set("-webkit-mask", js.Array(value :_*))
    @scala.inline
    def `set-webkit-mask`(value: WebkitMask[TLength] | js.Array[js.UndefOr[WebkitMask[TLength]]]): Self = this.set("-webkit-mask", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-mask`: Self = this.set("-webkit-mask", js.undefined)
    @scala.inline
    def `set-webkit-text-emphasisVarargs`(value: js.UndefOr[TextEmphasis]*): Self = this.set("-webkit-text-emphasis", js.Array(value :_*))
    @scala.inline
    def `set-webkit-text-emphasis`(value: TextEmphasis | js.Array[js.UndefOr[TextEmphasis]]): Self = this.set("-webkit-text-emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-text-emphasis`: Self = this.set("-webkit-text-emphasis", js.undefined)
    @scala.inline
    def `set-webkit-text-strokeVarargs`(value: js.UndefOr[WebkitTextStroke[TLength]]*): Self = this.set("-webkit-text-stroke", js.Array(value :_*))
    @scala.inline
    def `set-webkit-text-stroke`(value: WebkitTextStroke[TLength] | js.Array[js.UndefOr[WebkitTextStroke[TLength]]]): Self = this.set("-webkit-text-stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-text-stroke`: Self = this.set("-webkit-text-stroke", js.undefined)
    @scala.inline
    def `set-webkit-transitionVarargs`(value: js.UndefOr[Transition[TTime]]*): Self = this.set("-webkit-transition", js.Array(value :_*))
    @scala.inline
    def `set-webkit-transition`(value: Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]): Self = this.set("-webkit-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-transition`: Self = this.set("-webkit-transition", js.undefined)
  }
  
}

