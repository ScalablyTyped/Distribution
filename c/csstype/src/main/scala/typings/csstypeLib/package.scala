package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object csstypeLib {
  type AnimateableFeature = _AnimateableFeature | java.lang.String
  type BgPosition[TLength] = _BgPosition[TLength] | TLength | java.lang.String
  type BgSize[TLength] = _BgSize[TLength] | TLength | java.lang.String
  type Color = _Color | java.lang.String
  type ContentList = _ContentList | java.lang.String
  type CounterStyleRangeProperty = _CounterStyleRangeProperty | java.lang.String | scala.Double
  type CounterStyleSpeakAsProperty = _CounterStyleSpeakAsProperty | java.lang.String
  type CounterStyleSystemProperty = _CounterStyleSystemProperty | java.lang.String
  type CubicBezierTimingFunction = _CubicBezierTimingFunction | java.lang.String
  type Dasharray[TLength] = TLength | java.lang.String | scala.Double
  type FinalBgLayer[TLength] = _FinalBgLayer[TLength] | java.lang.String
  type FontFaceFontFeatureSettingsProperty = csstypeLib.csstypeLibStrings.normal | java.lang.String
  type FontFaceFontStretchProperty = FontStretchAbsolute | java.lang.String
  type FontFaceFontStyleProperty = _FontFaceFontStyleProperty | java.lang.String
  type FontFaceFontVariantProperty = _FontFaceFontVariantProperty | java.lang.String
  type FontFaceFontVariationSettingsProperty = csstypeLib.csstypeLibStrings.normal | java.lang.String
  type FontFaceFontWeightProperty = FontWeightAbsolute | java.lang.String
  type FontStretchAbsolute = _FontStretchAbsolute | java.lang.String
  type FontWeightAbsolute = _FontWeightAbsolute | scala.Double
  type GlobalsNumber = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Globals */ js.Any) | scala.Double
  type GlobalsString = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Globals */ js.Any) | java.lang.String
  type GridLine = csstypeLib.csstypeLibStrings.auto | java.lang.String | scala.Double
  type LineWidth[TLength] = _LineWidth[TLength] | TLength
  type MaskLayer[TLength] = _MaskLayer[TLength] | java.lang.String
  type PageBleedProperty[TLength] = TLength | csstypeLib.csstypeLibStrings.auto
  type PageMarksProperty = _PageMarksProperty | java.lang.String
  type Paint = _Paint | java.lang.String
  type Position[TLength] = _Position[TLength] | TLength | java.lang.String
  type RepeatStyle = _RepeatStyle | java.lang.String
  type SingleAnimation = _SingleAnimation | java.lang.String | scala.Double
  type SingleTimingFunction = _SingleTimingFunction | java.lang.String
  type SingleTransition = _SingleTransition | java.lang.String
  type StepTimingFunction = _StepTimingFunction | java.lang.String
  type TrackBreadth[TLength] = _TrackBreadth[TLength] | TLength | java.lang.String
  type ViewportHeightProperty[TLength] = ViewportLength[TLength] | java.lang.String
  type ViewportLength[TLength] = TLength | csstypeLib.csstypeLibStrings.auto | java.lang.String
  type ViewportMaxHeightProperty[TLength] = ViewportLength[TLength]
  type ViewportMaxWidthProperty[TLength] = ViewportLength[TLength]
  type ViewportMaxZoomProperty = csstypeLib.csstypeLibStrings.auto | java.lang.String | scala.Double
  type ViewportMinHeightProperty[TLength] = ViewportLength[TLength]
  type ViewportMinWidthProperty[TLength] = ViewportLength[TLength]
  type ViewportMinZoomProperty = csstypeLib.csstypeLibStrings.auto | java.lang.String | scala.Double
  type ViewportWidthProperty[TLength] = ViewportLength[TLength] | java.lang.String
  type ViewportZoomProperty = csstypeLib.csstypeLibStrings.auto | java.lang.String | scala.Double
}
