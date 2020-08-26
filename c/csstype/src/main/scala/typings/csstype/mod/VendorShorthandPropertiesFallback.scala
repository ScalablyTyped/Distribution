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

/* Inlined {[ P in keyof csstype.csstype.VendorShorthandProperties<TLength, TTime> ]: csstype.csstype.VendorShorthandProperties<TLength, TTime>[P] | std.Array<csstype.csstype.VendorShorthandProperties<TLength, TTime>[P]>} */
@js.native
trait VendorShorthandPropertiesFallback[TLength, TTime] extends js.Object {
  var MozAnimation: js.UndefOr[Animation[TTime] | js.Array[js.UndefOr[Animation[TTime]]]] = js.native
  var MozBorderImage: js.UndefOr[BorderImage | js.Array[js.UndefOr[BorderImage]]] = js.native
  var MozColumnRule: js.UndefOr[ColumnRule[TLength] | js.Array[js.UndefOr[ColumnRule[TLength]]]] = js.native
  var MozColumns: js.UndefOr[Columns[TLength] | js.Array[js.UndefOr[Columns[TLength]]]] = js.native
  var MozTransition: js.UndefOr[Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]] = js.native
  var WebkitAnimation: js.UndefOr[Animation[TTime] | js.Array[js.UndefOr[Animation[TTime]]]] = js.native
  var WebkitBorderBefore: js.UndefOr[
    typings.csstype.mod.Property.WebkitBorderBefore[TLength] | js.Array[js.UndefOr[typings.csstype.mod.Property.WebkitBorderBefore[TLength]]]
  ] = js.native
  var WebkitBorderImage: js.UndefOr[BorderImage | js.Array[js.UndefOr[BorderImage]]] = js.native
  var WebkitBorderRadius: js.UndefOr[BorderRadius[TLength] | js.Array[js.UndefOr[BorderRadius[TLength]]]] = js.native
  var WebkitColumnRule: js.UndefOr[ColumnRule[TLength] | js.Array[js.UndefOr[ColumnRule[TLength]]]] = js.native
  var WebkitColumns: js.UndefOr[Columns[TLength] | js.Array[js.UndefOr[Columns[TLength]]]] = js.native
  var WebkitFlex: js.UndefOr[Flex[TLength] | js.Array[js.UndefOr[Flex[TLength]]]] = js.native
  var WebkitFlexFlow: js.UndefOr[FlexFlow | js.Array[js.UndefOr[FlexFlow]]] = js.native
  var WebkitMask: js.UndefOr[
    typings.csstype.mod.Property.WebkitMask[TLength] | js.Array[js.UndefOr[typings.csstype.mod.Property.WebkitMask[TLength]]]
  ] = js.native
  var WebkitTextEmphasis: js.UndefOr[TextEmphasis | js.Array[js.UndefOr[TextEmphasis]]] = js.native
  var WebkitTextStroke: js.UndefOr[
    typings.csstype.mod.Property.WebkitTextStroke[TLength] | js.Array[js.UndefOr[typings.csstype.mod.Property.WebkitTextStroke[TLength]]]
  ] = js.native
  var WebkitTransition: js.UndefOr[Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]] = js.native
  var msContentZoomLimit: js.UndefOr[MsContentZoomLimit | js.Array[js.UndefOr[MsContentZoomLimit]]] = js.native
  var msContentZoomSnap: js.UndefOr[MsContentZoomSnap | js.Array[js.UndefOr[MsContentZoomSnap]]] = js.native
  var msFlex: js.UndefOr[Flex[TLength] | js.Array[js.UndefOr[Flex[TLength]]]] = js.native
  var msScrollLimit: js.UndefOr[MsScrollLimit | js.Array[js.UndefOr[MsScrollLimit]]] = js.native
  var msScrollSnapX: js.UndefOr[MsScrollSnapX | js.Array[js.UndefOr[MsScrollSnapX]]] = js.native
  var msScrollSnapY: js.UndefOr[MsScrollSnapY | js.Array[js.UndefOr[MsScrollSnapY]]] = js.native
  var msTransition: js.UndefOr[Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]] = js.native
}

object VendorShorthandPropertiesFallback {
  @scala.inline
  def apply[TLength, TTime](): VendorShorthandPropertiesFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorShorthandPropertiesFallback[TLength, TTime]]
  }
  @scala.inline
  implicit class VendorShorthandPropertiesFallbackOps[Self <: VendorShorthandPropertiesFallback[_, _], TLength, TTime] (val x: Self with (VendorShorthandPropertiesFallback[TLength, TTime])) extends AnyVal {
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
    def setMozAnimationVarargs(value: js.UndefOr[Animation[TTime]]*): Self = this.set("MozAnimation", js.Array(value :_*))
    @scala.inline
    def setMozAnimation(value: Animation[TTime] | js.Array[js.UndefOr[Animation[TTime]]]): Self = this.set("MozAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozAnimation: Self = this.set("MozAnimation", js.undefined)
    @scala.inline
    def setMozBorderImageVarargs(value: js.UndefOr[BorderImage]*): Self = this.set("MozBorderImage", js.Array(value :_*))
    @scala.inline
    def setMozBorderImage(value: BorderImage | js.Array[js.UndefOr[BorderImage]]): Self = this.set("MozBorderImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBorderImage: Self = this.set("MozBorderImage", js.undefined)
    @scala.inline
    def setMozColumnRuleVarargs(value: js.UndefOr[ColumnRule[TLength]]*): Self = this.set("MozColumnRule", js.Array(value :_*))
    @scala.inline
    def setMozColumnRule(value: ColumnRule[TLength] | js.Array[js.UndefOr[ColumnRule[TLength]]]): Self = this.set("MozColumnRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozColumnRule: Self = this.set("MozColumnRule", js.undefined)
    @scala.inline
    def setMozColumnsVarargs(value: js.UndefOr[Columns[TLength]]*): Self = this.set("MozColumns", js.Array(value :_*))
    @scala.inline
    def setMozColumns(value: Columns[TLength] | js.Array[js.UndefOr[Columns[TLength]]]): Self = this.set("MozColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozColumns: Self = this.set("MozColumns", js.undefined)
    @scala.inline
    def setMozTransitionVarargs(value: js.UndefOr[Transition[TTime]]*): Self = this.set("MozTransition", js.Array(value :_*))
    @scala.inline
    def setMozTransition(value: Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]): Self = this.set("MozTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozTransition: Self = this.set("MozTransition", js.undefined)
    @scala.inline
    def setWebkitAnimationVarargs(value: js.UndefOr[Animation[TTime]]*): Self = this.set("WebkitAnimation", js.Array(value :_*))
    @scala.inline
    def setWebkitAnimation(value: Animation[TTime] | js.Array[js.UndefOr[Animation[TTime]]]): Self = this.set("WebkitAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitAnimation: Self = this.set("WebkitAnimation", js.undefined)
    @scala.inline
    def setWebkitBorderBeforeVarargs(value: js.UndefOr[WebkitBorderBefore[TLength]]*): Self = this.set("WebkitBorderBefore", js.Array(value :_*))
    @scala.inline
    def setWebkitBorderBefore(value: WebkitBorderBefore[TLength] | js.Array[js.UndefOr[WebkitBorderBefore[TLength]]]): Self = this.set("WebkitBorderBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBorderBefore: Self = this.set("WebkitBorderBefore", js.undefined)
    @scala.inline
    def setWebkitBorderImageVarargs(value: js.UndefOr[BorderImage]*): Self = this.set("WebkitBorderImage", js.Array(value :_*))
    @scala.inline
    def setWebkitBorderImage(value: BorderImage | js.Array[js.UndefOr[BorderImage]]): Self = this.set("WebkitBorderImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBorderImage: Self = this.set("WebkitBorderImage", js.undefined)
    @scala.inline
    def setWebkitBorderRadiusVarargs(value: js.UndefOr[BorderRadius[TLength]]*): Self = this.set("WebkitBorderRadius", js.Array(value :_*))
    @scala.inline
    def setWebkitBorderRadius(value: BorderRadius[TLength] | js.Array[js.UndefOr[BorderRadius[TLength]]]): Self = this.set("WebkitBorderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBorderRadius: Self = this.set("WebkitBorderRadius", js.undefined)
    @scala.inline
    def setWebkitColumnRuleVarargs(value: js.UndefOr[ColumnRule[TLength]]*): Self = this.set("WebkitColumnRule", js.Array(value :_*))
    @scala.inline
    def setWebkitColumnRule(value: ColumnRule[TLength] | js.Array[js.UndefOr[ColumnRule[TLength]]]): Self = this.set("WebkitColumnRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitColumnRule: Self = this.set("WebkitColumnRule", js.undefined)
    @scala.inline
    def setWebkitColumnsVarargs(value: js.UndefOr[Columns[TLength]]*): Self = this.set("WebkitColumns", js.Array(value :_*))
    @scala.inline
    def setWebkitColumns(value: Columns[TLength] | js.Array[js.UndefOr[Columns[TLength]]]): Self = this.set("WebkitColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitColumns: Self = this.set("WebkitColumns", js.undefined)
    @scala.inline
    def setWebkitFlexVarargs(value: js.UndefOr[Flex[TLength]]*): Self = this.set("WebkitFlex", js.Array(value :_*))
    @scala.inline
    def setWebkitFlex(value: Flex[TLength] | js.Array[js.UndefOr[Flex[TLength]]]): Self = this.set("WebkitFlex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitFlex: Self = this.set("WebkitFlex", js.undefined)
    @scala.inline
    def setWebkitFlexFlowVarargs(value: js.UndefOr[FlexFlow]*): Self = this.set("WebkitFlexFlow", js.Array(value :_*))
    @scala.inline
    def setWebkitFlexFlow(value: FlexFlow | js.Array[js.UndefOr[FlexFlow]]): Self = this.set("WebkitFlexFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitFlexFlow: Self = this.set("WebkitFlexFlow", js.undefined)
    @scala.inline
    def setWebkitMaskVarargs(value: js.UndefOr[WebkitMask[TLength]]*): Self = this.set("WebkitMask", js.Array(value :_*))
    @scala.inline
    def setWebkitMask(value: WebkitMask[TLength] | js.Array[js.UndefOr[WebkitMask[TLength]]]): Self = this.set("WebkitMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitMask: Self = this.set("WebkitMask", js.undefined)
    @scala.inline
    def setWebkitTextEmphasisVarargs(value: js.UndefOr[TextEmphasis]*): Self = this.set("WebkitTextEmphasis", js.Array(value :_*))
    @scala.inline
    def setWebkitTextEmphasis(value: TextEmphasis | js.Array[js.UndefOr[TextEmphasis]]): Self = this.set("WebkitTextEmphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitTextEmphasis: Self = this.set("WebkitTextEmphasis", js.undefined)
    @scala.inline
    def setWebkitTextStrokeVarargs(value: js.UndefOr[WebkitTextStroke[TLength]]*): Self = this.set("WebkitTextStroke", js.Array(value :_*))
    @scala.inline
    def setWebkitTextStroke(value: WebkitTextStroke[TLength] | js.Array[js.UndefOr[WebkitTextStroke[TLength]]]): Self = this.set("WebkitTextStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitTextStroke: Self = this.set("WebkitTextStroke", js.undefined)
    @scala.inline
    def setWebkitTransitionVarargs(value: js.UndefOr[Transition[TTime]]*): Self = this.set("WebkitTransition", js.Array(value :_*))
    @scala.inline
    def setWebkitTransition(value: Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]): Self = this.set("WebkitTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitTransition: Self = this.set("WebkitTransition", js.undefined)
    @scala.inline
    def setMsContentZoomLimitVarargs(value: js.UndefOr[MsContentZoomLimit]*): Self = this.set("msContentZoomLimit", js.Array(value :_*))
    @scala.inline
    def setMsContentZoomLimit(value: MsContentZoomLimit | js.Array[js.UndefOr[MsContentZoomLimit]]): Self = this.set("msContentZoomLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsContentZoomLimit: Self = this.set("msContentZoomLimit", js.undefined)
    @scala.inline
    def setMsContentZoomSnapVarargs(value: js.UndefOr[MsContentZoomSnap]*): Self = this.set("msContentZoomSnap", js.Array(value :_*))
    @scala.inline
    def setMsContentZoomSnap(value: MsContentZoomSnap | js.Array[js.UndefOr[MsContentZoomSnap]]): Self = this.set("msContentZoomSnap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsContentZoomSnap: Self = this.set("msContentZoomSnap", js.undefined)
    @scala.inline
    def setMsFlexVarargs(value: js.UndefOr[Flex[TLength]]*): Self = this.set("msFlex", js.Array(value :_*))
    @scala.inline
    def setMsFlex(value: Flex[TLength] | js.Array[js.UndefOr[Flex[TLength]]]): Self = this.set("msFlex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsFlex: Self = this.set("msFlex", js.undefined)
    @scala.inline
    def setMsScrollLimitVarargs(value: js.UndefOr[MsScrollLimit]*): Self = this.set("msScrollLimit", js.Array(value :_*))
    @scala.inline
    def setMsScrollLimit(value: MsScrollLimit | js.Array[js.UndefOr[MsScrollLimit]]): Self = this.set("msScrollLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsScrollLimit: Self = this.set("msScrollLimit", js.undefined)
    @scala.inline
    def setMsScrollSnapXVarargs(value: js.UndefOr[MsScrollSnapX]*): Self = this.set("msScrollSnapX", js.Array(value :_*))
    @scala.inline
    def setMsScrollSnapX(value: MsScrollSnapX | js.Array[js.UndefOr[MsScrollSnapX]]): Self = this.set("msScrollSnapX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsScrollSnapX: Self = this.set("msScrollSnapX", js.undefined)
    @scala.inline
    def setMsScrollSnapYVarargs(value: js.UndefOr[MsScrollSnapY]*): Self = this.set("msScrollSnapY", js.Array(value :_*))
    @scala.inline
    def setMsScrollSnapY(value: MsScrollSnapY | js.Array[js.UndefOr[MsScrollSnapY]]): Self = this.set("msScrollSnapY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsScrollSnapY: Self = this.set("msScrollSnapY", js.undefined)
    @scala.inline
    def setMsTransitionVarargs(value: js.UndefOr[Transition[TTime]]*): Self = this.set("msTransition", js.Array(value :_*))
    @scala.inline
    def setMsTransition(value: Transition[TTime] | js.Array[js.UndefOr[Transition[TTime]]]): Self = this.set("msTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsTransition: Self = this.set("msTransition", js.undefined)
  }
  
}

