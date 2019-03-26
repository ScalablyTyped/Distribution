package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object csstypeLib {
  /* Rewritten from type alias, can be one of: 
    - csstypeLib.csstypeLibStrings.contents
    - csstypeLib.csstypeLibStrings.`scroll-position`
    - java.lang.String
  */
  type AnimateableFeature = _AnimateableFeature | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - TLength
    - csstypeLib.csstypeLibStrings.bottom
    - csstypeLib.csstypeLibStrings.center
    - csstypeLib.csstypeLibStrings.left
    - csstypeLib.csstypeLibStrings.right
    - csstypeLib.csstypeLibStrings.top
    - java.lang.String
  */
  type BgPosition[TLength] = _BgPosition[TLength] | TLength | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - TLength
    - csstypeLib.csstypeLibStrings.auto
    - csstypeLib.csstypeLibStrings.contain
    - csstypeLib.csstypeLibStrings.cover
    - java.lang.String
  */
  type BgSize[TLength] = _BgSize[TLength] | TLength | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - NamedColor
    - DeprecatedSystemColor
    - csstypeLib.csstypeLibStrings.currentcolor
    - java.lang.String
  */
  type Color = _Color | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - Quote
    - csstypeLib.csstypeLibStrings.contents
    - java.lang.String
  */
  type ContentList = _ContentList | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - csstypeLib.csstypeLibStrings.auto
    - csstypeLib.csstypeLibStrings.infinite
    - java.lang.String
    - scala.Double
  */
  type CounterStyleRangeProperty = _CounterStyleRangeProperty | java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - csstypeLib.csstypeLibStrings.auto
    - csstypeLib.csstypeLibStrings.bullets
    - csstypeLib.csstypeLibStrings.numbers
    - csstypeLib.csstypeLibStrings.`spell-out`
    - csstypeLib.csstypeLibStrings.words
    - java.lang.String
  */
  type CounterStyleSpeakAsProperty = _CounterStyleSpeakAsProperty | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - csstypeLib.csstypeLibStrings.additive
    - csstypeLib.csstypeLibStrings.alphabetic
    - csstypeLib.csstypeLibStrings.cyclic
    - csstypeLib.csstypeLibStrings.fixed
    - csstypeLib.csstypeLibStrings.numeric
    - csstypeLib.csstypeLibStrings.symbolic
    - java.lang.String
  */
  type CounterStyleSystemProperty = _CounterStyleSystemProperty | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - csstypeLib.csstypeLibStrings.ease
    - csstypeLib.csstypeLibStrings.`ease-in`
    - csstypeLib.csstypeLibStrings.`ease-in-out`
    - csstypeLib.csstypeLibStrings.`ease-out`
    - java.lang.String
  */
  type CubicBezierTimingFunction = _CubicBezierTimingFunction | java.lang.String
  type Dasharray[TLength] = TLength | java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - Color
    - BgPosition[TLength]
    - RepeatStyle
    - Attachment
    - Box
    - csstypeLib.csstypeLibStrings.none
    - java.lang.String
  */
  type FinalBgLayer[TLength] = _FinalBgLayer[TLength] | java.lang.String | TLength
  type FontFaceFontFeatureSettingsProperty = csstypeLib.csstypeLibStrings.normal | java.lang.String
  type FontFaceFontStretchProperty = FontStretchAbsolute | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - csstypeLib.csstypeLibStrings.italic
    - csstypeLib.csstypeLibStrings.normal
    - csstypeLib.csstypeLibStrings.oblique
    - java.lang.String
  */
  type FontFaceFontStyleProperty = _FontFaceFontStyleProperty | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - EastAsianVariantValues
    - csstypeLib.csstypeLibStrings.`all-petite-caps`
    - csstypeLib.csstypeLibStrings.`all-small-caps`
    - csstypeLib.csstypeLibStrings.`common-ligatures`
    - csstypeLib.csstypeLibStrings.contextual
    - csstypeLib.csstypeLibStrings.`diagonal-fractions`
    - csstypeLib.csstypeLibStrings.`discretionary-ligatures`
    - csstypeLib.csstypeLibStrings.`full-width`
    - csstypeLib.csstypeLibStrings.`historical-forms`
    - csstypeLib.csstypeLibStrings.`historical-ligatures`
    - csstypeLib.csstypeLibStrings.`lining-nums`
    - csstypeLib.csstypeLibStrings.`no-common-ligatures`
    - csstypeLib.csstypeLibStrings.`no-contextual`
    - csstypeLib.csstypeLibStrings.`no-discretionary-ligatures`
    - csstypeLib.csstypeLibStrings.`no-historical-ligatures`
    - csstypeLib.csstypeLibStrings.none
    - csstypeLib.csstypeLibStrings.normal
    - csstypeLib.csstypeLibStrings.`oldstyle-nums`
    - csstypeLib.csstypeLibStrings.ordinal
    - csstypeLib.csstypeLibStrings.`petite-caps`
    - csstypeLib.csstypeLibStrings.`proportional-nums`
    - csstypeLib.csstypeLibStrings.`proportional-width`
    - csstypeLib.csstypeLibStrings.ruby
    - csstypeLib.csstypeLibStrings.`slashed-zero`
    - csstypeLib.csstypeLibStrings.`small-caps`
    - csstypeLib.csstypeLibStrings.`stacked-fractions`
    - csstypeLib.csstypeLibStrings.`tabular-nums`
    - csstypeLib.csstypeLibStrings.`titling-caps`
    - csstypeLib.csstypeLibStrings.unicase
    - java.lang.String
  */
  type FontFaceFontVariantProperty = _FontFaceFontVariantProperty | java.lang.String
  type FontFaceFontVariationSettingsProperty = csstypeLib.csstypeLibStrings.normal | java.lang.String
  type FontFaceFontWeightProperty = FontWeightAbsolute | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - csstypeLib.csstypeLibStrings.condensed
    - csstypeLib.csstypeLibStrings.expanded
    - csstypeLib.csstypeLibStrings.`extra-condensed`
    - csstypeLib.csstypeLibStrings.`extra-expanded`
    - csstypeLib.csstypeLibStrings.normal
    - csstypeLib.csstypeLibStrings.`semi-condensed`
    - csstypeLib.csstypeLibStrings.`semi-expanded`
    - csstypeLib.csstypeLibStrings.`ultra-condensed`
    - csstypeLib.csstypeLibStrings.`ultra-expanded`
    - java.lang.String
  */
  type FontStretchAbsolute = _FontStretchAbsolute | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - csstypeLib.csstypeLibStrings.bold
    - csstypeLib.csstypeLibStrings.normal
    - scala.Double
  */
  type FontWeightAbsolute = _FontWeightAbsolute | scala.Double
  type GlobalsNumber = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Globals */ js.Any) | scala.Double
  type GlobalsString = (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Globals */ js.Any) | java.lang.String
  type GridLine = csstypeLib.csstypeLibStrings.auto | java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - TLength
    - csstypeLib.csstypeLibStrings.medium
    - csstypeLib.csstypeLibStrings.thick
    - csstypeLib.csstypeLibStrings.thin
  */
  type LineWidth[TLength] = _LineWidth[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - Position[TLength]
    - RepeatStyle
    - GeometryBox
    - CompositingOperator
    - MaskingMode
    - csstypeLib.csstypeLibStrings.`no-clip`
    - csstypeLib.csstypeLibStrings.none
    - java.lang.String
  */
  type MaskLayer[TLength] = _MaskLayer[TLength] | java.lang.String | TLength
  type PageBleedProperty[TLength] = TLength | csstypeLib.csstypeLibStrings.auto
  /* Rewritten from type alias, can be one of: 
    - csstypeLib.csstypeLibStrings.crop
    - csstypeLib.csstypeLibStrings.cross
    - csstypeLib.csstypeLibStrings.none
    - java.lang.String
  */
  type PageMarksProperty = _PageMarksProperty | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - Color
    - csstypeLib.csstypeLibStrings.child
    - csstypeLib.csstypeLibStrings.`context-fill`
    - csstypeLib.csstypeLibStrings.`context-stroke`
    - csstypeLib.csstypeLibStrings.none
    - java.lang.String
  */
  type Paint = _Paint | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - TLength
    - csstypeLib.csstypeLibStrings.bottom
    - csstypeLib.csstypeLibStrings.center
    - csstypeLib.csstypeLibStrings.left
    - csstypeLib.csstypeLibStrings.right
    - csstypeLib.csstypeLibStrings.top
    - java.lang.String
  */
  type Position[TLength] = _Position[TLength] | TLength | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - csstypeLib.csstypeLibStrings.`no-repeat`
    - csstypeLib.csstypeLibStrings.repeat
    - csstypeLib.csstypeLibStrings.`repeat-x`
    - csstypeLib.csstypeLibStrings.`repeat-y`
    - csstypeLib.csstypeLibStrings.round
    - csstypeLib.csstypeLibStrings.space
    - java.lang.String
  */
  type RepeatStyle = _RepeatStyle | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - SingleTimingFunction
    - SingleAnimationDirection
    - SingleAnimationFillMode
    - csstypeLib.csstypeLibStrings.infinite
    - csstypeLib.csstypeLibStrings.none
    - csstypeLib.csstypeLibStrings.paused
    - csstypeLib.csstypeLibStrings.running
    - java.lang.String
    - scala.Double
  */
  type SingleAnimation = _SingleAnimation | java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - CubicBezierTimingFunction
    - StepTimingFunction
    - csstypeLib.csstypeLibStrings.linear
    - java.lang.String
  */
  type SingleTimingFunction = _SingleTimingFunction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - SingleTimingFunction
    - csstypeLib.csstypeLibStrings.all
    - csstypeLib.csstypeLibStrings.none
    - java.lang.String
  */
  type SingleTransition = _SingleTransition | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - csstypeLib.csstypeLibStrings.`step-end`
    - csstypeLib.csstypeLibStrings.`step-start`
    - java.lang.String
  */
  type StepTimingFunction = _StepTimingFunction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - TLength
    - csstypeLib.csstypeLibStrings.auto
    - csstypeLib.csstypeLibStrings.`max-content`
    - csstypeLib.csstypeLibStrings.`min-content`
    - java.lang.String
  */
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
