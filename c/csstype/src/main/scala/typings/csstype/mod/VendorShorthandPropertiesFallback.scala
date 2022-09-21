package typings.csstype.mod

import typings.csstype.mod.Property.Animation
import typings.csstype.mod.Property.BorderImage
import typings.csstype.mod.Property.BorderRadius
import typings.csstype.mod.Property.ColumnRule
import typings.csstype.mod.Property.Columns
import typings.csstype.mod.Property.Flex
import typings.csstype.mod.Property.FlexFlow
import typings.csstype.mod.Property.MaskBorder
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
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined csstype.csstype.Fallback<csstype.csstype.VendorShorthandProperties<TLength, TTime>> */
trait VendorShorthandPropertiesFallback[TLength, TTime] extends StObject {
  
  var MozAnimation: js.UndefOr[Animation[TTime] | js.Array[NonNullable[js.UndefOr[Animation[TTime]]]]] = js.undefined
  
  var MozBorderImage: js.UndefOr[BorderImage | js.Array[NonNullable[js.UndefOr[BorderImage]]]] = js.undefined
  
  var MozColumnRule: js.UndefOr[ColumnRule[TLength] | js.Array[NonNullable[js.UndefOr[ColumnRule[TLength]]]]] = js.undefined
  
  var MozColumns: js.UndefOr[Columns[TLength] | js.Array[NonNullable[js.UndefOr[Columns[TLength]]]]] = js.undefined
  
  var MozTransition: js.UndefOr[Transition[TTime] | js.Array[NonNullable[js.UndefOr[Transition[TTime]]]]] = js.undefined
  
  var WebkitAnimation: js.UndefOr[Animation[TTime] | js.Array[NonNullable[js.UndefOr[Animation[TTime]]]]] = js.undefined
  
  var WebkitBorderBefore: js.UndefOr[
    typings.csstype.mod.Property.WebkitBorderBefore[TLength] | (js.Array[
      NonNullable[js.UndefOr[typings.csstype.mod.Property.WebkitBorderBefore[TLength]]]
    ])
  ] = js.undefined
  
  var WebkitBorderImage: js.UndefOr[BorderImage | js.Array[NonNullable[js.UndefOr[BorderImage]]]] = js.undefined
  
  var WebkitBorderRadius: js.UndefOr[BorderRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderRadius[TLength]]]]] = js.undefined
  
  var WebkitColumnRule: js.UndefOr[ColumnRule[TLength] | js.Array[NonNullable[js.UndefOr[ColumnRule[TLength]]]]] = js.undefined
  
  var WebkitColumns: js.UndefOr[Columns[TLength] | js.Array[NonNullable[js.UndefOr[Columns[TLength]]]]] = js.undefined
  
  var WebkitFlex: js.UndefOr[Flex[TLength] | js.Array[NonNullable[js.UndefOr[Flex[TLength]]]]] = js.undefined
  
  var WebkitFlexFlow: js.UndefOr[FlexFlow | js.Array[NonNullable[js.UndefOr[FlexFlow]]]] = js.undefined
  
  var WebkitMask: js.UndefOr[
    typings.csstype.mod.Property.WebkitMask[TLength] | js.Array[NonNullable[js.UndefOr[typings.csstype.mod.Property.WebkitMask[TLength]]]]
  ] = js.undefined
  
  var WebkitMaskBoxImage: js.UndefOr[MaskBorder | js.Array[NonNullable[js.UndefOr[MaskBorder]]]] = js.undefined
  
  var WebkitTextEmphasis: js.UndefOr[TextEmphasis | js.Array[NonNullable[js.UndefOr[TextEmphasis]]]] = js.undefined
  
  var WebkitTextStroke: js.UndefOr[
    typings.csstype.mod.Property.WebkitTextStroke[TLength] | js.Array[NonNullable[js.UndefOr[typings.csstype.mod.Property.WebkitTextStroke[TLength]]]]
  ] = js.undefined
  
  var WebkitTransition: js.UndefOr[Transition[TTime] | js.Array[NonNullable[js.UndefOr[Transition[TTime]]]]] = js.undefined
  
  var msContentZoomLimit: js.UndefOr[MsContentZoomLimit | js.Array[NonNullable[js.UndefOr[MsContentZoomLimit]]]] = js.undefined
  
  var msContentZoomSnap: js.UndefOr[MsContentZoomSnap | js.Array[NonNullable[js.UndefOr[MsContentZoomSnap]]]] = js.undefined
  
  var msFlex: js.UndefOr[Flex[TLength] | js.Array[NonNullable[js.UndefOr[Flex[TLength]]]]] = js.undefined
  
  var msScrollLimit: js.UndefOr[MsScrollLimit | js.Array[NonNullable[js.UndefOr[MsScrollLimit]]]] = js.undefined
  
  var msScrollSnapX: js.UndefOr[MsScrollSnapX | js.Array[NonNullable[js.UndefOr[MsScrollSnapX]]]] = js.undefined
  
  var msScrollSnapY: js.UndefOr[MsScrollSnapY | js.Array[NonNullable[js.UndefOr[MsScrollSnapY]]]] = js.undefined
  
  var msTransition: js.UndefOr[Transition[TTime] | js.Array[NonNullable[js.UndefOr[Transition[TTime]]]]] = js.undefined
}
object VendorShorthandPropertiesFallback {
  
  inline def apply[TLength, TTime](): VendorShorthandPropertiesFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorShorthandPropertiesFallback[TLength, TTime]]
  }
  
  extension [Self <: VendorShorthandPropertiesFallback[?, ?], TLength, TTime](x: Self & (VendorShorthandPropertiesFallback[TLength, TTime])) {
    
    inline def setMozAnimation(value: Animation[TTime] | js.Array[NonNullable[js.UndefOr[Animation[TTime]]]]): Self = StObject.set(x, "MozAnimation", value.asInstanceOf[js.Any])
    
    inline def setMozAnimationUndefined: Self = StObject.set(x, "MozAnimation", js.undefined)
    
    inline def setMozAnimationVarargs(value: NonNullable[js.UndefOr[Animation[TTime]]]*): Self = StObject.set(x, "MozAnimation", js.Array(value*))
    
    inline def setMozBorderImage(value: BorderImage | js.Array[NonNullable[js.UndefOr[BorderImage]]]): Self = StObject.set(x, "MozBorderImage", value.asInstanceOf[js.Any])
    
    inline def setMozBorderImageUndefined: Self = StObject.set(x, "MozBorderImage", js.undefined)
    
    inline def setMozBorderImageVarargs(value: NonNullable[js.UndefOr[BorderImage]]*): Self = StObject.set(x, "MozBorderImage", js.Array(value*))
    
    inline def setMozColumnRule(value: ColumnRule[TLength] | js.Array[NonNullable[js.UndefOr[ColumnRule[TLength]]]]): Self = StObject.set(x, "MozColumnRule", value.asInstanceOf[js.Any])
    
    inline def setMozColumnRuleUndefined: Self = StObject.set(x, "MozColumnRule", js.undefined)
    
    inline def setMozColumnRuleVarargs(value: NonNullable[js.UndefOr[ColumnRule[TLength]]]*): Self = StObject.set(x, "MozColumnRule", js.Array(value*))
    
    inline def setMozColumns(value: Columns[TLength] | js.Array[NonNullable[js.UndefOr[Columns[TLength]]]]): Self = StObject.set(x, "MozColumns", value.asInstanceOf[js.Any])
    
    inline def setMozColumnsUndefined: Self = StObject.set(x, "MozColumns", js.undefined)
    
    inline def setMozColumnsVarargs(value: NonNullable[js.UndefOr[Columns[TLength]]]*): Self = StObject.set(x, "MozColumns", js.Array(value*))
    
    inline def setMozTransition(value: Transition[TTime] | js.Array[NonNullable[js.UndefOr[Transition[TTime]]]]): Self = StObject.set(x, "MozTransition", value.asInstanceOf[js.Any])
    
    inline def setMozTransitionUndefined: Self = StObject.set(x, "MozTransition", js.undefined)
    
    inline def setMozTransitionVarargs(value: NonNullable[js.UndefOr[Transition[TTime]]]*): Self = StObject.set(x, "MozTransition", js.Array(value*))
    
    inline def setMsContentZoomLimit(value: MsContentZoomLimit | js.Array[NonNullable[js.UndefOr[MsContentZoomLimit]]]): Self = StObject.set(x, "msContentZoomLimit", value.asInstanceOf[js.Any])
    
    inline def setMsContentZoomLimitUndefined: Self = StObject.set(x, "msContentZoomLimit", js.undefined)
    
    inline def setMsContentZoomLimitVarargs(value: NonNullable[js.UndefOr[MsContentZoomLimit]]*): Self = StObject.set(x, "msContentZoomLimit", js.Array(value*))
    
    inline def setMsContentZoomSnap(value: MsContentZoomSnap | js.Array[NonNullable[js.UndefOr[MsContentZoomSnap]]]): Self = StObject.set(x, "msContentZoomSnap", value.asInstanceOf[js.Any])
    
    inline def setMsContentZoomSnapUndefined: Self = StObject.set(x, "msContentZoomSnap", js.undefined)
    
    inline def setMsContentZoomSnapVarargs(value: NonNullable[js.UndefOr[MsContentZoomSnap]]*): Self = StObject.set(x, "msContentZoomSnap", js.Array(value*))
    
    inline def setMsFlex(value: Flex[TLength] | js.Array[NonNullable[js.UndefOr[Flex[TLength]]]]): Self = StObject.set(x, "msFlex", value.asInstanceOf[js.Any])
    
    inline def setMsFlexUndefined: Self = StObject.set(x, "msFlex", js.undefined)
    
    inline def setMsFlexVarargs(value: NonNullable[js.UndefOr[Flex[TLength]]]*): Self = StObject.set(x, "msFlex", js.Array(value*))
    
    inline def setMsScrollLimit(value: MsScrollLimit | js.Array[NonNullable[js.UndefOr[MsScrollLimit]]]): Self = StObject.set(x, "msScrollLimit", value.asInstanceOf[js.Any])
    
    inline def setMsScrollLimitUndefined: Self = StObject.set(x, "msScrollLimit", js.undefined)
    
    inline def setMsScrollLimitVarargs(value: NonNullable[js.UndefOr[MsScrollLimit]]*): Self = StObject.set(x, "msScrollLimit", js.Array(value*))
    
    inline def setMsScrollSnapX(value: MsScrollSnapX | js.Array[NonNullable[js.UndefOr[MsScrollSnapX]]]): Self = StObject.set(x, "msScrollSnapX", value.asInstanceOf[js.Any])
    
    inline def setMsScrollSnapXUndefined: Self = StObject.set(x, "msScrollSnapX", js.undefined)
    
    inline def setMsScrollSnapXVarargs(value: NonNullable[js.UndefOr[MsScrollSnapX]]*): Self = StObject.set(x, "msScrollSnapX", js.Array(value*))
    
    inline def setMsScrollSnapY(value: MsScrollSnapY | js.Array[NonNullable[js.UndefOr[MsScrollSnapY]]]): Self = StObject.set(x, "msScrollSnapY", value.asInstanceOf[js.Any])
    
    inline def setMsScrollSnapYUndefined: Self = StObject.set(x, "msScrollSnapY", js.undefined)
    
    inline def setMsScrollSnapYVarargs(value: NonNullable[js.UndefOr[MsScrollSnapY]]*): Self = StObject.set(x, "msScrollSnapY", js.Array(value*))
    
    inline def setMsTransition(value: Transition[TTime] | js.Array[NonNullable[js.UndefOr[Transition[TTime]]]]): Self = StObject.set(x, "msTransition", value.asInstanceOf[js.Any])
    
    inline def setMsTransitionUndefined: Self = StObject.set(x, "msTransition", js.undefined)
    
    inline def setMsTransitionVarargs(value: NonNullable[js.UndefOr[Transition[TTime]]]*): Self = StObject.set(x, "msTransition", js.Array(value*))
    
    inline def setWebkitAnimation(value: Animation[TTime] | js.Array[NonNullable[js.UndefOr[Animation[TTime]]]]): Self = StObject.set(x, "WebkitAnimation", value.asInstanceOf[js.Any])
    
    inline def setWebkitAnimationUndefined: Self = StObject.set(x, "WebkitAnimation", js.undefined)
    
    inline def setWebkitAnimationVarargs(value: NonNullable[js.UndefOr[Animation[TTime]]]*): Self = StObject.set(x, "WebkitAnimation", js.Array(value*))
    
    inline def setWebkitBorderBefore(
      value: WebkitBorderBefore[TLength] | js.Array[NonNullable[js.UndefOr[WebkitBorderBefore[TLength]]]]
    ): Self = StObject.set(x, "WebkitBorderBefore", value.asInstanceOf[js.Any])
    
    inline def setWebkitBorderBeforeUndefined: Self = StObject.set(x, "WebkitBorderBefore", js.undefined)
    
    inline def setWebkitBorderBeforeVarargs(value: NonNullable[js.UndefOr[WebkitBorderBefore[TLength]]]*): Self = StObject.set(x, "WebkitBorderBefore", js.Array(value*))
    
    inline def setWebkitBorderImage(value: BorderImage | js.Array[NonNullable[js.UndefOr[BorderImage]]]): Self = StObject.set(x, "WebkitBorderImage", value.asInstanceOf[js.Any])
    
    inline def setWebkitBorderImageUndefined: Self = StObject.set(x, "WebkitBorderImage", js.undefined)
    
    inline def setWebkitBorderImageVarargs(value: NonNullable[js.UndefOr[BorderImage]]*): Self = StObject.set(x, "WebkitBorderImage", js.Array(value*))
    
    inline def setWebkitBorderRadius(value: BorderRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderRadius[TLength]]]]): Self = StObject.set(x, "WebkitBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setWebkitBorderRadiusUndefined: Self = StObject.set(x, "WebkitBorderRadius", js.undefined)
    
    inline def setWebkitBorderRadiusVarargs(value: NonNullable[js.UndefOr[BorderRadius[TLength]]]*): Self = StObject.set(x, "WebkitBorderRadius", js.Array(value*))
    
    inline def setWebkitColumnRule(value: ColumnRule[TLength] | js.Array[NonNullable[js.UndefOr[ColumnRule[TLength]]]]): Self = StObject.set(x, "WebkitColumnRule", value.asInstanceOf[js.Any])
    
    inline def setWebkitColumnRuleUndefined: Self = StObject.set(x, "WebkitColumnRule", js.undefined)
    
    inline def setWebkitColumnRuleVarargs(value: NonNullable[js.UndefOr[ColumnRule[TLength]]]*): Self = StObject.set(x, "WebkitColumnRule", js.Array(value*))
    
    inline def setWebkitColumns(value: Columns[TLength] | js.Array[NonNullable[js.UndefOr[Columns[TLength]]]]): Self = StObject.set(x, "WebkitColumns", value.asInstanceOf[js.Any])
    
    inline def setWebkitColumnsUndefined: Self = StObject.set(x, "WebkitColumns", js.undefined)
    
    inline def setWebkitColumnsVarargs(value: NonNullable[js.UndefOr[Columns[TLength]]]*): Self = StObject.set(x, "WebkitColumns", js.Array(value*))
    
    inline def setWebkitFlex(value: Flex[TLength] | js.Array[NonNullable[js.UndefOr[Flex[TLength]]]]): Self = StObject.set(x, "WebkitFlex", value.asInstanceOf[js.Any])
    
    inline def setWebkitFlexFlow(value: FlexFlow | js.Array[NonNullable[js.UndefOr[FlexFlow]]]): Self = StObject.set(x, "WebkitFlexFlow", value.asInstanceOf[js.Any])
    
    inline def setWebkitFlexFlowUndefined: Self = StObject.set(x, "WebkitFlexFlow", js.undefined)
    
    inline def setWebkitFlexFlowVarargs(value: NonNullable[js.UndefOr[FlexFlow]]*): Self = StObject.set(x, "WebkitFlexFlow", js.Array(value*))
    
    inline def setWebkitFlexUndefined: Self = StObject.set(x, "WebkitFlex", js.undefined)
    
    inline def setWebkitFlexVarargs(value: NonNullable[js.UndefOr[Flex[TLength]]]*): Self = StObject.set(x, "WebkitFlex", js.Array(value*))
    
    inline def setWebkitMask(value: WebkitMask[TLength] | js.Array[NonNullable[js.UndefOr[WebkitMask[TLength]]]]): Self = StObject.set(x, "WebkitMask", value.asInstanceOf[js.Any])
    
    inline def setWebkitMaskBoxImage(value: MaskBorder | js.Array[NonNullable[js.UndefOr[MaskBorder]]]): Self = StObject.set(x, "WebkitMaskBoxImage", value.asInstanceOf[js.Any])
    
    inline def setWebkitMaskBoxImageUndefined: Self = StObject.set(x, "WebkitMaskBoxImage", js.undefined)
    
    inline def setWebkitMaskBoxImageVarargs(value: NonNullable[js.UndefOr[MaskBorder]]*): Self = StObject.set(x, "WebkitMaskBoxImage", js.Array(value*))
    
    inline def setWebkitMaskUndefined: Self = StObject.set(x, "WebkitMask", js.undefined)
    
    inline def setWebkitMaskVarargs(value: NonNullable[js.UndefOr[WebkitMask[TLength]]]*): Self = StObject.set(x, "WebkitMask", js.Array(value*))
    
    inline def setWebkitTextEmphasis(value: TextEmphasis | js.Array[NonNullable[js.UndefOr[TextEmphasis]]]): Self = StObject.set(x, "WebkitTextEmphasis", value.asInstanceOf[js.Any])
    
    inline def setWebkitTextEmphasisUndefined: Self = StObject.set(x, "WebkitTextEmphasis", js.undefined)
    
    inline def setWebkitTextEmphasisVarargs(value: NonNullable[js.UndefOr[TextEmphasis]]*): Self = StObject.set(x, "WebkitTextEmphasis", js.Array(value*))
    
    inline def setWebkitTextStroke(value: WebkitTextStroke[TLength] | js.Array[NonNullable[js.UndefOr[WebkitTextStroke[TLength]]]]): Self = StObject.set(x, "WebkitTextStroke", value.asInstanceOf[js.Any])
    
    inline def setWebkitTextStrokeUndefined: Self = StObject.set(x, "WebkitTextStroke", js.undefined)
    
    inline def setWebkitTextStrokeVarargs(value: NonNullable[js.UndefOr[WebkitTextStroke[TLength]]]*): Self = StObject.set(x, "WebkitTextStroke", js.Array(value*))
    
    inline def setWebkitTransition(value: Transition[TTime] | js.Array[NonNullable[js.UndefOr[Transition[TTime]]]]): Self = StObject.set(x, "WebkitTransition", value.asInstanceOf[js.Any])
    
    inline def setWebkitTransitionUndefined: Self = StObject.set(x, "WebkitTransition", js.undefined)
    
    inline def setWebkitTransitionVarargs(value: NonNullable[js.UndefOr[Transition[TTime]]]*): Self = StObject.set(x, "WebkitTransition", js.Array(value*))
  }
}
