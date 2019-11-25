package typings.csstype

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object csstypeMod {
  import typings.csstype.csstypeStrings.auto
  import typings.csstype.csstypeStrings.normal

  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.ContentDistribution
    - typings.csstype.csstypeMod.ContentPosition
    - typings.csstype.csstypeStrings.baseline
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type AlignContentProperty = _AlignContentProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.SelfPosition
    - typings.csstype.csstypeStrings.baseline
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.stretch
    - java.lang.String
  */
  type AlignItemsProperty = _AlignItemsProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.SelfPosition
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.baseline
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.stretch
    - java.lang.String
  */
  type AlignSelfProperty = _AlignSelfProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.contents
    - typings.csstype.csstypeStrings.`scroll-position`
    - java.lang.String
  */
  type AnimateableFeature = _AnimateableFeature | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.SingleAnimationDirection
    - java.lang.String
  */
  type AnimationDirectionProperty = _AnimationDirectionProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.SingleAnimationFillMode
    - java.lang.String
  */
  type AnimationFillModeProperty = _AnimationFillModeProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.infinite
    - java.lang.String
    - scala.Double
  */
  type AnimationIterationCountProperty = _AnimationIterationCountProperty | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type AnimationNameProperty = _AnimationNameProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.paused
    - typings.csstype.csstypeStrings.running
    - java.lang.String
  */
  type AnimationPlayStateProperty = _AnimationPlayStateProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.SingleAnimation
    - java.lang.String
  */
  type AnimationProperty = _AnimationProperty | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.TimingFunction
    - java.lang.String
  */
  type AnimationTimingFunctionProperty = _AnimationTimingFunctionProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type BackdropFilterProperty = _BackdropFilterProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Attachment
    - java.lang.String
  */
  type BackgroundAttachmentProperty = _BackgroundAttachmentProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.BlendMode
    - java.lang.String
  */
  type BackgroundBlendModeProperty = _BackgroundBlendModeProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Box
    - java.lang.String
  */
  type BackgroundClipProperty = _BackgroundClipProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type BackgroundColorProperty = _BackgroundColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type BackgroundImageProperty = _BackgroundImageProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Box
    - java.lang.String
  */
  type BackgroundOriginProperty = _BackgroundOriginProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.BgPosition[TLength]
    - java.lang.String
  */
  type BackgroundPositionProperty[TLength] = _BackgroundPositionProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.center
    - typings.csstype.csstypeStrings.left
    - typings.csstype.csstypeStrings.right
    - typings.csstype.csstypeStrings.`x-end`
    - typings.csstype.csstypeStrings.`x-start`
    - java.lang.String
  */
  type BackgroundPositionXProperty[TLength] = _BackgroundPositionXProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.bottom
    - typings.csstype.csstypeStrings.center
    - typings.csstype.csstypeStrings.top
    - typings.csstype.csstypeStrings.`y-end`
    - typings.csstype.csstypeStrings.`y-start`
    - java.lang.String
  */
  type BackgroundPositionYProperty[TLength] = _BackgroundPositionYProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.FinalBgLayer[TLength]
    - java.lang.String
  */
  type BackgroundProperty[TLength] = _BackgroundProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.RepeatStyle
    - java.lang.String
  */
  type BackgroundRepeatProperty = _BackgroundRepeatProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.BgSize[TLength]
    - java.lang.String
  */
  type BackgroundSizeProperty[TLength] = _BackgroundSizeProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.baseline
    - typings.csstype.csstypeStrings.sub
    - typings.csstype.csstypeStrings.`super`
    - java.lang.String
  */
  type BaselineShiftProperty[TLength] = _BaselineShiftProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - TLength
    - typings.csstype.csstypeStrings.bottom
    - typings.csstype.csstypeStrings.center
    - typings.csstype.csstypeStrings.left
    - typings.csstype.csstypeStrings.right
    - typings.csstype.csstypeStrings.top
    - java.lang.String
  */
  type BgPosition[TLength] = _BgPosition[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - TLength
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.contain
    - typings.csstype.csstypeStrings.cover
    - java.lang.String
  */
  type BgSize[TLength] = _BgSize[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.clip
    - typings.csstype.csstypeStrings.ellipsis
    - java.lang.String
  */
  type BlockOverflowProperty = _BlockOverflowProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-fit-content`
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-fill-available`
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.available
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - java.lang.String
  */
  type BlockSizeProperty[TLength] = _BlockSizeProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderBlockColorProperty = _BorderBlockColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type BorderBlockEndColorProperty = _BorderBlockEndColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderBlockEndProperty[TLength] = _BorderBlockEndProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
  */
  type BorderBlockEndWidthProperty[TLength] = _BorderBlockEndWidthProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderBlockProperty[TLength] = _BorderBlockProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type BorderBlockStartColorProperty = _BorderBlockStartColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderBlockStartProperty[TLength] = _BorderBlockStartProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
  */
  type BorderBlockStartWidthProperty[TLength] = _BorderBlockStartWidthProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
  */
  type BorderBlockWidthProperty[TLength] = _BorderBlockWidthProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type BorderBottomColorProperty = _BorderBottomColorProperty | String
  type BorderBottomLeftRadiusProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderBottomProperty[TLength] = _BorderBottomProperty[TLength] | String | TLength
  type BorderBottomRightRadiusProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
  */
  type BorderBottomWidthProperty[TLength] = _BorderBottomWidthProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderColorProperty = _BorderColorProperty | String
  type BorderEndEndRadiusProperty[TLength] = Globals | TLength | String
  type BorderEndStartRadiusProperty[TLength] = Globals | TLength | String
  type BorderImageOutsetProperty[TLength] = Globals | TLength | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.repeat
    - typings.csstype.csstypeStrings.round
    - typings.csstype.csstypeStrings.space
    - typings.csstype.csstypeStrings.stretch
    - java.lang.String
    - scala.Double
  */
  type BorderImageProperty = _BorderImageProperty | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.repeat
    - typings.csstype.csstypeStrings.round
    - typings.csstype.csstypeStrings.space
    - typings.csstype.csstypeStrings.stretch
    - java.lang.String
  */
  type BorderImageRepeatProperty = _BorderImageRepeatProperty | String
  type BorderImageSliceProperty = Globals | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type BorderImageSourceProperty = _BorderImageSourceProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
    - scala.Double
  */
  type BorderImageWidthProperty[TLength] = _BorderImageWidthProperty[TLength] | TLength | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderInlineColorProperty = _BorderInlineColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type BorderInlineEndColorProperty = _BorderInlineEndColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderInlineEndProperty[TLength] = _BorderInlineEndProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
  */
  type BorderInlineEndWidthProperty[TLength] = _BorderInlineEndWidthProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderInlineProperty[TLength] = _BorderInlineProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type BorderInlineStartColorProperty = _BorderInlineStartColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderInlineStartProperty[TLength] = _BorderInlineStartProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
  */
  type BorderInlineStartWidthProperty[TLength] = _BorderInlineStartWidthProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
  */
  type BorderInlineWidthProperty[TLength] = _BorderInlineWidthProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type BorderLeftColorProperty = _BorderLeftColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderLeftProperty[TLength] = _BorderLeftProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
  */
  type BorderLeftWidthProperty[TLength] = _BorderLeftWidthProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderProperty[TLength] = _BorderProperty[TLength] | String | TLength
  type BorderRadiusProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type BorderRightColorProperty = _BorderRightColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderRightProperty[TLength] = _BorderRightProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
  */
  type BorderRightWidthProperty[TLength] = _BorderRightWidthProperty[TLength] | TLength
  type BorderSpacingProperty[TLength] = Globals | TLength | String
  type BorderStartEndRadiusProperty[TLength] = Globals | TLength | String
  type BorderStartStartRadiusProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineStyle
    - java.lang.String
  */
  type BorderStyleProperty = _BorderStyleProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type BorderTopColorProperty = _BorderTopColorProperty | String
  type BorderTopLeftRadiusProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type BorderTopProperty[TLength] = _BorderTopProperty[TLength] | String | TLength
  type BorderTopRightRadiusProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
  */
  type BorderTopWidthProperty[TLength] = _BorderTopWidthProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - java.lang.String
  */
  type BorderWidthProperty[TLength] = _BorderWidthProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type BottomProperty[TLength] = _BottomProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type BoxShadowProperty = _BoxShadowProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.auto
  */
  type CaretColorProperty = _CaretColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.GeometryBox
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type ClipPathProperty = _ClipPathProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ClipProperty = _ClipProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.NamedColor
    - typings.csstype.csstypeMod.DeprecatedSystemColor
    - typings.csstype.csstypeStrings.currentcolor_
    - java.lang.String
  */
  type Color = _Color | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type ColorProperty = _ColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.auto
    - scala.Double
  */
  type ColumnCountProperty = _ColumnCountProperty | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type ColumnGapProperty[TLength] = _ColumnGapProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type ColumnRuleColorProperty = _ColumnRuleColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type ColumnRuleProperty[TLength] = _ColumnRuleProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineStyle
    - java.lang.String
  */
  type ColumnRuleStyleProperty = _ColumnRuleStyleProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - java.lang.String
  */
  type ColumnRuleWidthProperty[TLength] = _ColumnRuleWidthProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
  */
  type ColumnWidthProperty[TLength] = _ColumnWidthProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
    - scala.Double
  */
  type ColumnsProperty[TLength] = _ColumnsProperty[TLength] | TLength | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.content
    - typings.csstype.csstypeStrings.layout
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.paint
    - typings.csstype.csstypeStrings.size
    - typings.csstype.csstypeStrings.strict
    - typings.csstype.csstypeStrings.style
    - java.lang.String
  */
  type ContainProperty = _ContainProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Quote
    - typings.csstype.csstypeStrings.contents
    - java.lang.String
  */
  type ContentList = _ContentList | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.ContentList
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type ContentProperty = _ContentProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type CounterIncrementProperty = _CounterIncrementProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type CounterResetProperty = _CounterResetProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type CounterSetProperty = _CounterSetProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.infinite
    - java.lang.String
    - scala.Double
  */
  type CounterStyleRangeProperty = _CounterStyleRangeProperty | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.bullets
    - typings.csstype.csstypeStrings.numbers
    - typings.csstype.csstypeStrings.`spell-out`
    - typings.csstype.csstypeStrings.words
    - java.lang.String
  */
  type CounterStyleSpeakAsProperty = _CounterStyleSpeakAsProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.additive
    - typings.csstype.csstypeStrings.alphabetic
    - typings.csstype.csstypeStrings.cyclic
    - typings.csstype.csstypeStrings.fixed
    - typings.csstype.csstypeStrings.numeric
    - typings.csstype.csstypeStrings.symbolic
    - java.lang.String
  */
  type CounterStyleSystemProperty = _CounterStyleSystemProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.ease
    - typings.csstype.csstypeStrings.`ease-in`
    - typings.csstype.csstypeStrings.`ease-in-out`
    - typings.csstype.csstypeStrings.`ease-out`
    - java.lang.String
  */
  type CubicBezierTimingFunction = _CubicBezierTimingFunction | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.`-moz-grab`
    - typings.csstype.csstypeStrings.`-webkit-grab`
    - typings.csstype.csstypeStrings.alias
    - typings.csstype.csstypeStrings.`all-scroll`
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.cell
    - typings.csstype.csstypeStrings.`col-resize`
    - typings.csstype.csstypeStrings.`context-menu`
    - typings.csstype.csstypeStrings.copy
    - typings.csstype.csstypeStrings.crosshair
    - typings.csstype.csstypeStrings.default
    - typings.csstype.csstypeStrings.`e-resize`
    - typings.csstype.csstypeStrings.`ew-resize`
    - typings.csstype.csstypeStrings.grab
    - typings.csstype.csstypeStrings.grabbing
    - typings.csstype.csstypeStrings.help
    - typings.csstype.csstypeStrings.move
    - typings.csstype.csstypeStrings.`n-resize`
    - typings.csstype.csstypeStrings.`ne-resize`
    - typings.csstype.csstypeStrings.`nesw-resize`
    - typings.csstype.csstypeStrings.`no-drop`
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.`not-allowed`
    - typings.csstype.csstypeStrings.`ns-resize`
    - typings.csstype.csstypeStrings.`nw-resize`
    - typings.csstype.csstypeStrings.`nwse-resize`
    - typings.csstype.csstypeStrings.pointer
    - typings.csstype.csstypeStrings.progress
    - typings.csstype.csstypeStrings.`row-resize`
    - typings.csstype.csstypeStrings.`s-resize`
    - typings.csstype.csstypeStrings.`se-resize`
    - typings.csstype.csstypeStrings.`sw-resize`
    - typings.csstype.csstypeStrings.text
    - typings.csstype.csstypeStrings.`vertical-text`
    - typings.csstype.csstypeStrings.`w-resize`
    - typings.csstype.csstypeStrings.wait
    - typings.csstype.csstypeStrings.`zoom-in`
    - typings.csstype.csstypeStrings.`zoom-out`
    - java.lang.String
  */
  type CursorProperty = _CursorProperty | String
  type Dasharray[TLength] = TLength | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.DisplayOutside
    - typings.csstype.csstypeMod.DisplayInside
    - typings.csstype.csstypeMod.DisplayInternal
    - typings.csstype.csstypeMod.DisplayLegacy
    - typings.csstype.csstypeStrings.contents
    - typings.csstype.csstypeStrings.`list-item`
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type DisplayProperty = _DisplayProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Paint
  */
  type FillProperty = _FillProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type FilterProperty = _FilterProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeMod.BgPosition[TLength]
    - typings.csstype.csstypeMod.RepeatStyle
    - typings.csstype.csstypeMod.Attachment
    - typings.csstype.csstypeMod.Box
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type FinalBgLayer[TLength] = _FinalBgLayer[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-auto`
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.available
    - typings.csstype.csstypeStrings.content
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - java.lang.String
  */
  type FlexBasisProperty[TLength] = _FlexBasisProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.column
    - typings.csstype.csstypeStrings.`column-reverse`
    - typings.csstype.csstypeStrings.nowrap
    - typings.csstype.csstypeStrings.row
    - typings.csstype.csstypeStrings.`row-reverse`
    - typings.csstype.csstypeStrings.wrap
    - typings.csstype.csstypeStrings.`wrap-reverse`
    - java.lang.String
  */
  type FlexFlowProperty = _FlexFlowProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.available
    - typings.csstype.csstypeStrings.content
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - typings.csstype.csstypeStrings.none
    - java.lang.String
    - scala.Double
  */
  type FlexProperty[TLength] = _FlexProperty[TLength] | TLength | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.currentColor
  */
  type FloodColorProperty = _FloodColorProperty | String
  type FontFaceFontFeatureSettingsProperty = normal | String
  type FontFaceFontStretchProperty = FontStretchAbsolute | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.italic
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.oblique
    - java.lang.String
  */
  type FontFaceFontStyleProperty = _FontFaceFontStyleProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.EastAsianVariantValues
    - typings.csstype.csstypeStrings.`all-petite-caps`
    - typings.csstype.csstypeStrings.`all-small-caps`
    - typings.csstype.csstypeStrings.`common-ligatures`
    - typings.csstype.csstypeStrings.contextual
    - typings.csstype.csstypeStrings.`diagonal-fractions`
    - typings.csstype.csstypeStrings.`discretionary-ligatures`
    - typings.csstype.csstypeStrings.`full-width`
    - typings.csstype.csstypeStrings.`historical-forms`
    - typings.csstype.csstypeStrings.`historical-ligatures`
    - typings.csstype.csstypeStrings.`lining-nums`
    - typings.csstype.csstypeStrings.`no-common-ligatures`
    - typings.csstype.csstypeStrings.`no-contextual`
    - typings.csstype.csstypeStrings.`no-discretionary-ligatures`
    - typings.csstype.csstypeStrings.`no-historical-ligatures`
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.`oldstyle-nums`
    - typings.csstype.csstypeStrings.ordinal
    - typings.csstype.csstypeStrings.`petite-caps`
    - typings.csstype.csstypeStrings.`proportional-nums`
    - typings.csstype.csstypeStrings.`proportional-width`
    - typings.csstype.csstypeStrings.ruby
    - typings.csstype.csstypeStrings.`slashed-zero`
    - typings.csstype.csstypeStrings.`small-caps`
    - typings.csstype.csstypeStrings.`stacked-fractions`
    - typings.csstype.csstypeStrings.`tabular-nums`
    - typings.csstype.csstypeStrings.`titling-caps`
    - typings.csstype.csstypeStrings.unicase
    - java.lang.String
  */
  type FontFaceFontVariantProperty = _FontFaceFontVariantProperty | String
  type FontFaceFontVariationSettingsProperty = normal | String
  type FontFaceFontWeightProperty = FontWeightAbsolute | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.GenericFamily
    - java.lang.String
  */
  type FontFamilyProperty = _FontFamilyProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type FontFeatureSettingsProperty = _FontFeatureSettingsProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type FontLanguageOverrideProperty = _FontLanguageOverrideProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.caption
    - typings.csstype.csstypeStrings.icon
    - typings.csstype.csstypeStrings.menu_
    - typings.csstype.csstypeStrings.`message-box`
    - typings.csstype.csstypeStrings.`small-caption`
    - typings.csstype.csstypeStrings.`status-bar`
    - java.lang.String
  */
  type FontProperty = _FontProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - scala.Double
  */
  type FontSizeAdjustProperty = _FontSizeAdjustProperty | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.AbsoluteSize
    - TLength
    - typings.csstype.csstypeStrings.larger
    - typings.csstype.csstypeStrings.smaller
    - java.lang.String
  */
  type FontSizeProperty[TLength] = _FontSizeProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.condensed
    - typings.csstype.csstypeStrings.expanded
    - typings.csstype.csstypeStrings.`extra-condensed`
    - typings.csstype.csstypeStrings.`extra-expanded`
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.`semi-condensed`
    - typings.csstype.csstypeStrings.`semi-expanded`
    - typings.csstype.csstypeStrings.`ultra-condensed`
    - typings.csstype.csstypeStrings.`ultra-expanded`
    - java.lang.String
  */
  type FontStretchAbsolute = _FontStretchAbsolute | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.FontStretchAbsolute
  */
  type FontStretchProperty = _FontStretchProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.italic
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.oblique
    - java.lang.String
  */
  type FontStyleProperty = _FontStyleProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.style
    - typings.csstype.csstypeStrings.weight
    - java.lang.String
  */
  type FontSynthesisProperty = _FontSynthesisProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.`historical-forms`
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type FontVariantAlternatesProperty = _FontVariantAlternatesProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.EastAsianVariantValues
    - typings.csstype.csstypeStrings.`full-width`
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.`proportional-width`
    - typings.csstype.csstypeStrings.ruby
    - java.lang.String
  */
  type FontVariantEastAsianProperty = _FontVariantEastAsianProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.`common-ligatures`
    - typings.csstype.csstypeStrings.contextual
    - typings.csstype.csstypeStrings.`discretionary-ligatures`
    - typings.csstype.csstypeStrings.`historical-ligatures`
    - typings.csstype.csstypeStrings.`no-common-ligatures`
    - typings.csstype.csstypeStrings.`no-contextual`
    - typings.csstype.csstypeStrings.`no-discretionary-ligatures`
    - typings.csstype.csstypeStrings.`no-historical-ligatures`
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type FontVariantLigaturesProperty = _FontVariantLigaturesProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.`diagonal-fractions`
    - typings.csstype.csstypeStrings.`lining-nums`
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.`oldstyle-nums`
    - typings.csstype.csstypeStrings.ordinal
    - typings.csstype.csstypeStrings.`proportional-nums`
    - typings.csstype.csstypeStrings.`slashed-zero`
    - typings.csstype.csstypeStrings.`stacked-fractions`
    - typings.csstype.csstypeStrings.`tabular-nums`
    - java.lang.String
  */
  type FontVariantNumericProperty = _FontVariantNumericProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.EastAsianVariantValues
    - typings.csstype.csstypeStrings.`all-petite-caps`
    - typings.csstype.csstypeStrings.`all-small-caps`
    - typings.csstype.csstypeStrings.`common-ligatures`
    - typings.csstype.csstypeStrings.contextual
    - typings.csstype.csstypeStrings.`diagonal-fractions`
    - typings.csstype.csstypeStrings.`discretionary-ligatures`
    - typings.csstype.csstypeStrings.`full-width`
    - typings.csstype.csstypeStrings.`historical-forms`
    - typings.csstype.csstypeStrings.`historical-ligatures`
    - typings.csstype.csstypeStrings.`lining-nums`
    - typings.csstype.csstypeStrings.`no-common-ligatures`
    - typings.csstype.csstypeStrings.`no-contextual`
    - typings.csstype.csstypeStrings.`no-discretionary-ligatures`
    - typings.csstype.csstypeStrings.`no-historical-ligatures`
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.`oldstyle-nums`
    - typings.csstype.csstypeStrings.ordinal
    - typings.csstype.csstypeStrings.`petite-caps`
    - typings.csstype.csstypeStrings.`proportional-nums`
    - typings.csstype.csstypeStrings.`proportional-width`
    - typings.csstype.csstypeStrings.ruby
    - typings.csstype.csstypeStrings.`slashed-zero`
    - typings.csstype.csstypeStrings.`small-caps`
    - typings.csstype.csstypeStrings.`stacked-fractions`
    - typings.csstype.csstypeStrings.`tabular-nums`
    - typings.csstype.csstypeStrings.`titling-caps`
    - typings.csstype.csstypeStrings.unicase
    - java.lang.String
  */
  type FontVariantProperty = _FontVariantProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type FontVariationSettingsProperty = _FontVariationSettingsProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.bold
    - typings.csstype.csstypeStrings.normal
    - scala.Double
  */
  type FontWeightAbsolute = _FontWeightAbsolute | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.FontWeightAbsolute
    - typings.csstype.csstypeStrings.bolder
    - typings.csstype.csstypeStrings.lighter
  */
  type FontWeightProperty = _FontWeightProperty | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type GapProperty[TLength] = _GapProperty[TLength] | TLength | String
  type GlobalsNumber = Globals | Double
  type GlobalsString = Globals | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
    - scala.Double
  */
  type GlyphOrientationVerticalProperty = _GlyphOrientationVerticalProperty | String | Double
  type GridAreaProperty = Globals | GridLine | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.TrackBreadth[TLength]
    - java.lang.String
  */
  type GridAutoColumnsProperty[TLength] = _GridAutoColumnsProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.column
    - typings.csstype.csstypeStrings.dense
    - typings.csstype.csstypeStrings.row
    - java.lang.String
  */
  type GridAutoFlowProperty = _GridAutoFlowProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.TrackBreadth[TLength]
    - java.lang.String
  */
  type GridAutoRowsProperty[TLength] = _GridAutoRowsProperty[TLength] | String | TLength
  type GridColumnEndProperty = Globals | GridLine
  type GridColumnGapProperty[TLength] = Globals | TLength | String
  type GridColumnProperty = Globals | GridLine | String
  type GridColumnStartProperty = Globals | GridLine
  type GridGapProperty[TLength] = Globals | TLength | String
  type GridLine = auto | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type GridProperty = _GridProperty | String
  type GridRowEndProperty = Globals | GridLine
  type GridRowGapProperty[TLength] = Globals | TLength | String
  type GridRowProperty = Globals | GridLine | String
  type GridRowStartProperty = Globals | GridLine
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type GridTemplateAreasProperty = _GridTemplateAreasProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.TrackBreadth[TLength]
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type GridTemplateColumnsProperty[TLength] = _GridTemplateColumnsProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type GridTemplateProperty = _GridTemplateProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.TrackBreadth[TLength]
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type GridTemplateRowsProperty[TLength] = _GridTemplateRowsProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.`allow-end`
    - typings.csstype.csstypeStrings.first
    - typings.csstype.csstypeStrings.`force-end`
    - typings.csstype.csstypeStrings.last
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type HangingPunctuationProperty = _HangingPunctuationProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.available
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - java.lang.String
  */
  type HeightProperty[TLength] = _HeightProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.flip
    - typings.csstype.csstypeStrings.`from-image`
    - java.lang.String
  */
  type ImageOrientationProperty = _ImageOrientationProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.`from-image`
    - java.lang.String
  */
  type ImageResolutionProperty = _ImageResolutionProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
    - scala.Double
  */
  type InitialLetterProperty = _InitialLetterProperty | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-fit-content`
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-fill-available`
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.available
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - java.lang.String
  */
  type InlineSizeProperty[TLength] = _InlineSizeProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type InsetBlockEndProperty[TLength] = _InsetBlockEndProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type InsetBlockProperty[TLength] = _InsetBlockProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type InsetBlockStartProperty[TLength] = _InsetBlockStartProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type InsetInlineEndProperty[TLength] = _InsetInlineEndProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type InsetInlineProperty[TLength] = _InsetInlineProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type InsetInlineStartProperty[TLength] = _InsetInlineStartProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type InsetProperty[TLength] = _InsetProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.ContentDistribution
    - typings.csstype.csstypeMod.ContentPosition
    - typings.csstype.csstypeStrings.left
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.right
    - java.lang.String
  */
  type JustifyContentProperty = _JustifyContentProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.SelfPosition
    - typings.csstype.csstypeStrings.baseline
    - typings.csstype.csstypeStrings.left
    - typings.csstype.csstypeStrings.legacy
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.right
    - typings.csstype.csstypeStrings.stretch
    - java.lang.String
  */
  type JustifyItemsProperty = _JustifyItemsProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.SelfPosition
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.baseline
    - typings.csstype.csstypeStrings.left
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.right
    - typings.csstype.csstypeStrings.stretch
    - java.lang.String
  */
  type JustifySelfProperty = _JustifySelfProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type LeftProperty[TLength] = _LeftProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.normal
  */
  type LetterSpacingProperty[TLength] = _LetterSpacingProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.currentColor
  */
  type LightingColorProperty = _LightingColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - scala.Double
  */
  type LineClampProperty = _LineClampProperty | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
    - scala.Double
  */
  type LineHeightProperty[TLength] = _LineHeightProperty[TLength] | TLength | String | Double
  type LineHeightStepProperty[TLength] = Globals | TLength
  /* Rewritten from type alias, can be one of: 
    - TLength
    - typings.csstype.csstypeStrings.medium
    - typings.csstype.csstypeStrings.thick
    - typings.csstype.csstypeStrings.thin
  */
  type LineWidth[TLength] = _LineWidth[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type ListStyleImageProperty = _ListStyleImageProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.inside
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.outside
    - java.lang.String
  */
  type ListStyleProperty = _ListStyleProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type ListStyleTypeProperty = _ListStyleTypeProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MarginBlockEndProperty[TLength] = _MarginBlockEndProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MarginBlockProperty[TLength] = _MarginBlockProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MarginBlockStartProperty[TLength] = _MarginBlockStartProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MarginBottomProperty[TLength] = _MarginBottomProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MarginInlineEndProperty[TLength] = _MarginInlineEndProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MarginInlineProperty[TLength] = _MarginInlineProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MarginInlineStartProperty[TLength] = _MarginInlineStartProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MarginLeftProperty[TLength] = _MarginLeftProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MarginProperty[TLength] = _MarginProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MarginRightProperty[TLength] = _MarginRightProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MarginTopProperty[TLength] = _MarginTopProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MarkerEndProperty = _MarkerEndProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MarkerMidProperty = _MarkerMidProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MarkerProperty = _MarkerProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MarkerStartProperty = _MarkerStartProperty | String
  type MaskBorderOutsetProperty[TLength] = Globals | TLength | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.alpha
    - typings.csstype.csstypeStrings.luminance
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.repeat
    - typings.csstype.csstypeStrings.round
    - typings.csstype.csstypeStrings.space
    - typings.csstype.csstypeStrings.stretch
    - java.lang.String
    - scala.Double
  */
  type MaskBorderProperty = _MaskBorderProperty | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.repeat
    - typings.csstype.csstypeStrings.round
    - typings.csstype.csstypeStrings.space
    - typings.csstype.csstypeStrings.stretch
    - java.lang.String
  */
  type MaskBorderRepeatProperty = _MaskBorderRepeatProperty | String
  type MaskBorderSliceProperty = Globals | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MaskBorderSourceProperty = _MaskBorderSourceProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
    - scala.Double
  */
  type MaskBorderWidthProperty[TLength] = _MaskBorderWidthProperty[TLength] | TLength | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.GeometryBox
    - typings.csstype.csstypeStrings.`no-clip`
    - java.lang.String
  */
  type MaskClipProperty = _MaskClipProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.CompositingOperator
    - java.lang.String
  */
  type MaskCompositeProperty = _MaskCompositeProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MaskImageProperty = _MaskImageProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Position[TLength]
    - typings.csstype.csstypeMod.RepeatStyle
    - typings.csstype.csstypeMod.GeometryBox
    - typings.csstype.csstypeMod.CompositingOperator
    - typings.csstype.csstypeMod.MaskingMode
    - typings.csstype.csstypeStrings.`no-clip`
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MaskLayer[TLength] = _MaskLayer[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.MaskingMode
    - java.lang.String
  */
  type MaskModeProperty = _MaskModeProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.GeometryBox
    - java.lang.String
  */
  type MaskOriginProperty = _MaskOriginProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Position[TLength]
    - java.lang.String
  */
  type MaskPositionProperty[TLength] = _MaskPositionProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.MaskLayer[TLength]
    - java.lang.String
  */
  type MaskProperty[TLength] = _MaskProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.RepeatStyle
    - java.lang.String
  */
  type MaskRepeatProperty = _MaskRepeatProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.BgSize[TLength]
    - java.lang.String
  */
  type MaskSizeProperty[TLength] = _MaskSizeProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-fill-available`
    - typings.csstype.csstypeStrings.`fill-available`
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MaxBlockSizeProperty[TLength] = _MaxBlockSizeProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-fit-content`
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-fit-content`
    - typings.csstype.csstypeStrings.`fill-available`
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.intrinsic
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MaxHeightProperty[TLength] = _MaxHeightProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-fit-content`
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-fill-available`
    - typings.csstype.csstypeStrings.`fill-available`
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MaxInlineSizeProperty[TLength] = _MaxInlineSizeProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - scala.Double
  */
  type MaxLinesProperty = _MaxLinesProperty | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-fit-content`
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-fit-content`
    - typings.csstype.csstypeStrings.`-webkit-max-content`
    - typings.csstype.csstypeStrings.`-webkit-min-content`
    - typings.csstype.csstypeStrings.`fill-available`
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.intrinsic
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MaxWidthProperty[TLength] = _MaxWidthProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-fill-available`
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.`fill-available`
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - java.lang.String
  */
  type MinBlockSizeProperty[TLength] = _MinBlockSizeProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-fit-content`
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-fit-content`
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.`fill-available`
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.intrinsic
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - java.lang.String
  */
  type MinHeightProperty[TLength] = _MinHeightProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-fit-content`
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-fill-available`
    - typings.csstype.csstypeStrings.`-webkit-max-content`
    - typings.csstype.csstypeStrings.`-webkit-min-content`
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.`fill-available`
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - java.lang.String
  */
  type MinInlineSizeProperty[TLength] = _MinInlineSizeProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-fit-content`
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-fill-available`
    - typings.csstype.csstypeStrings.`-webkit-fit-content`
    - typings.csstype.csstypeStrings.`-webkit-max-content`
    - typings.csstype.csstypeStrings.`-webkit-min-content`
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.`fill-available`
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.intrinsic
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - typings.csstype.csstypeStrings.`min-intrinsic`
    - java.lang.String
  */
  type MinWidthProperty[TLength] = _MinWidthProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MozBindingProperty = _MozBindingProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MozBorderBottomColorsProperty = _MozBorderBottomColorsProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MozBorderLeftColorsProperty = _MozBorderLeftColorsProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MozBorderRightColorsProperty = _MozBorderRightColorsProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MozBorderTopColorsProperty = _MozBorderTopColorsProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.fill
    - typings.csstype.csstypeStrings.`fill-opacity`
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.stroke
    - typings.csstype.csstypeStrings.`stroke-opacity`
    - java.lang.String
  */
  type MozContextPropertiesProperty = _MozContextPropertiesProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type MozImageRegionProperty = _MozImageRegionProperty | String
  type MozOutlineRadiusBottomleftProperty[TLength] = Globals | TLength | String
  type MozOutlineRadiusBottomrightProperty[TLength] = Globals | TLength | String
  type MozOutlineRadiusProperty[TLength] = Globals | TLength | String
  type MozOutlineRadiusTopleftProperty[TLength] = Globals | TLength | String
  type MozOutlineRadiusToprightProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.mandatory
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.proximity
    - java.lang.String
  */
  type MsContentZoomSnapProperty = _MsContentZoomSnapProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MsFlowFromProperty = _MsFlowFromProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type MsFlowIntoProperty = _MsFlowIntoProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
    - scala.Double
  */
  type MsHyphenateLimitCharsProperty = _MsHyphenateLimitCharsProperty | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.`no-limit`
    - scala.Double
  */
  type MsHyphenateLimitLinesProperty = _MsHyphenateLimitLinesProperty | Double
  type MsHyphenateLimitZoneProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
  */
  type MsScrollLimitXMaxProperty[TLength] = _MsScrollLimitXMaxProperty[TLength] | TLength
  type MsScrollLimitXMinProperty[TLength] = Globals | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
  */
  type MsScrollLimitYMaxProperty[TLength] = _MsScrollLimitYMaxProperty[TLength] | TLength
  type MsScrollLimitYMinProperty[TLength] = Globals | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type MsScrollbar3dlightColorProperty = _MsScrollbar3dlightColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type MsScrollbarArrowColorProperty = _MsScrollbarArrowColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type MsScrollbarBaseColorProperty = _MsScrollbarBaseColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type MsScrollbarDarkshadowColorProperty = _MsScrollbarDarkshadowColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type MsScrollbarFaceColorProperty = _MsScrollbarFaceColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type MsScrollbarHighlightColorProperty = _MsScrollbarHighlightColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type MsScrollbarShadowColorProperty = _MsScrollbarShadowColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type MsScrollbarTrackColorProperty = _MsScrollbarTrackColorProperty | String
  type MsWrapMarginProperty[TLength] = Globals | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Position[TLength]
  */
  type ObjectPositionProperty[TLength] = _ObjectPositionProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Position[TLength]
    - typings.csstype.csstypeStrings.auto
  */
  type OffsetAnchorProperty[TLength] = _OffsetAnchorProperty[TLength] | TLength | String
  type OffsetDistanceProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.GeometryBox
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type OffsetPathProperty = _OffsetPathProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Position[TLength]
    - typings.csstype.csstypeStrings.auto
  */
  type OffsetPositionProperty[TLength] = _OffsetPositionProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Position[TLength]
    - typings.csstype.csstypeMod.GeometryBox
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type OffsetProperty[TLength] = _OffsetProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.reverse
    - java.lang.String
  */
  type OffsetRotateProperty = _OffsetRotateProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.invert
  */
  type OutlineColorProperty = _OutlineColorProperty | String
  type OutlineOffsetProperty[TLength] = Globals | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.invert
    - java.lang.String
  */
  type OutlineProperty[TLength] = _OutlineProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type OutlineStyleProperty = _OutlineStyleProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
  */
  type OutlineWidthProperty[TLength] = _OutlineWidthProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.clip
    - typings.csstype.csstypeStrings.hidden
    - typings.csstype.csstypeStrings.scroll
    - typings.csstype.csstypeStrings.visible
    - java.lang.String
  */
  type OverflowProperty = _OverflowProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.contain
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type OverscrollBehaviorProperty = _OverscrollBehaviorProperty | String
  type PaddingBlockEndProperty[TLength] = Globals | TLength | String
  type PaddingBlockProperty[TLength] = Globals | TLength | String
  type PaddingBlockStartProperty[TLength] = Globals | TLength | String
  type PaddingBottomProperty[TLength] = Globals | TLength | String
  type PaddingInlineEndProperty[TLength] = Globals | TLength | String
  type PaddingInlineProperty[TLength] = Globals | TLength | String
  type PaddingInlineStartProperty[TLength] = Globals | TLength | String
  type PaddingLeftProperty[TLength] = Globals | TLength | String
  type PaddingProperty[TLength] = Globals | TLength | String
  type PaddingRightProperty[TLength] = Globals | TLength | String
  type PaddingTopProperty[TLength] = Globals | TLength | String
  type PageBleedProperty[TLength] = TLength | auto
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.crop
    - typings.csstype.csstypeStrings.cross
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type PageMarksProperty = _PageMarksProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.child
    - typings.csstype.csstypeStrings.`context-fill`
    - typings.csstype.csstypeStrings.`context-stroke`
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type Paint = _Paint | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.fill
    - typings.csstype.csstypeStrings.markers
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.stroke
    - java.lang.String
  */
  type PaintOrderProperty = _PaintOrderProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Position[TLength]
  */
  type PerspectiveOriginProperty[TLength] = _PerspectiveOriginProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.none
  */
  type PerspectiveProperty[TLength] = _PerspectiveProperty[TLength] | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.ContentDistribution
    - typings.csstype.csstypeMod.ContentPosition
    - typings.csstype.csstypeStrings.baseline
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type PlaceContentProperty = _PlaceContentProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.SelfPosition
    - typings.csstype.csstypeStrings.baseline
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.stretch
    - java.lang.String
  */
  type PlaceItemsProperty = _PlaceItemsProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.SelfPosition
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.baseline
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.stretch
    - java.lang.String
  */
  type PlaceSelfProperty = _PlaceSelfProperty | String
  /* Rewritten from type alias, can be one of: 
    - TLength
    - typings.csstype.csstypeStrings.bottom
    - typings.csstype.csstypeStrings.center
    - typings.csstype.csstypeStrings.left
    - typings.csstype.csstypeStrings.right
    - typings.csstype.csstypeStrings.top
    - java.lang.String
  */
  type Position[TLength] = _Position[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type QuotesProperty = _QuotesProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.`no-repeat`
    - typings.csstype.csstypeStrings.repeat
    - typings.csstype.csstypeStrings.`repeat-x`
    - typings.csstype.csstypeStrings.`repeat-y`
    - typings.csstype.csstypeStrings.round
    - typings.csstype.csstypeStrings.space
    - java.lang.String
  */
  type RepeatStyle = _RepeatStyle | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type RightProperty[TLength] = _RightProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type RotateProperty = _RotateProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type RowGapProperty[TLength] = _RowGapProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
    - scala.Double
  */
  type ScaleProperty = _ScaleProperty | String | Double
  type ScrollMarginBlockEndProperty[TLength] = Globals | TLength
  type ScrollMarginBlockProperty[TLength] = Globals | TLength | String
  type ScrollMarginBlockStartProperty[TLength] = Globals | TLength
  type ScrollMarginBottomProperty[TLength] = Globals | TLength
  type ScrollMarginInlineEndProperty[TLength] = Globals | TLength
  type ScrollMarginInlineProperty[TLength] = Globals | TLength | String
  type ScrollMarginInlineStartProperty[TLength] = Globals | TLength
  type ScrollMarginLeftProperty[TLength] = Globals | TLength
  type ScrollMarginProperty[TLength] = Globals | TLength | String
  type ScrollMarginRightProperty[TLength] = Globals | TLength
  type ScrollMarginTopProperty[TLength] = Globals | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ScrollPaddingBlockEndProperty[TLength] = _ScrollPaddingBlockEndProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ScrollPaddingBlockProperty[TLength] = _ScrollPaddingBlockProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ScrollPaddingBlockStartProperty[TLength] = _ScrollPaddingBlockStartProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ScrollPaddingBottomProperty[TLength] = _ScrollPaddingBottomProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ScrollPaddingInlineEndProperty[TLength] = _ScrollPaddingInlineEndProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ScrollPaddingInlineProperty[TLength] = _ScrollPaddingInlineProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ScrollPaddingInlineStartProperty[TLength] = _ScrollPaddingInlineStartProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ScrollPaddingLeftProperty[TLength] = _ScrollPaddingLeftProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ScrollPaddingProperty[TLength] = _ScrollPaddingProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ScrollPaddingRightProperty[TLength] = _ScrollPaddingRightProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type ScrollPaddingTopProperty[TLength] = _ScrollPaddingTopProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.center
    - typings.csstype.csstypeStrings.end
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.start
    - java.lang.String
  */
  type ScrollSnapAlignProperty = _ScrollSnapAlignProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Position[TLength]
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type ScrollSnapCoordinateProperty[TLength] = _ScrollSnapCoordinateProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Position[TLength]
  */
  type ScrollSnapDestinationProperty[TLength] = _ScrollSnapDestinationProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type ScrollSnapPointsXProperty = _ScrollSnapPointsXProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type ScrollSnapPointsYProperty = _ScrollSnapPointsYProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.block
    - typings.csstype.csstypeStrings.both
    - typings.csstype.csstypeStrings.`inline`
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.x
    - typings.csstype.csstypeStrings.y
    - java.lang.String
  */
  type ScrollSnapTypeProperty = _ScrollSnapTypeProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.dark
    - typings.csstype.csstypeStrings.light
  */
  type ScrollbarColorProperty = _ScrollbarColorProperty | String
  type ShapeMarginProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Box
    - typings.csstype.csstypeStrings.`margin-box`
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type ShapeOutsideProperty = _ShapeOutsideProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.TimingFunction
    - typings.csstype.csstypeMod.SingleAnimationDirection
    - typings.csstype.csstypeMod.SingleAnimationFillMode
    - typings.csstype.csstypeStrings.infinite
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.paused
    - typings.csstype.csstypeStrings.running
    - java.lang.String
    - scala.Double
  */
  type SingleAnimation = _SingleAnimation | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.TimingFunction
    - typings.csstype.csstypeStrings.all
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type SingleTransition = _SingleTransition | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.`step-end`
    - typings.csstype.csstypeStrings.`step-start`
    - java.lang.String
  */
  type StepTimingFunction = _StepTimingFunction | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.currentColor
  */
  type StopColorProperty = _StopColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Dasharray[TLength]
    - typings.csstype.csstypeStrings.none
  */
  type StrokeDasharrayProperty[TLength] = _StrokeDasharrayProperty[TLength] | Dasharray[TLength]
  type StrokeDashoffsetProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Paint
  */
  type StrokeProperty = _StrokeProperty | String
  type StrokeWidthProperty[TLength] = Globals | TLength | String
  type TabSizeProperty[TLength] = Globals | TLength | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.all
    - typings.csstype.csstypeStrings.digits
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type TextCombineUprightProperty = _TextCombineUprightProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type TextDecorationColorProperty = _TextDecorationColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.blink
    - typings.csstype.csstypeStrings.`line-through`
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.overline
    - typings.csstype.csstypeStrings.underline
    - java.lang.String
  */
  type TextDecorationLineProperty = _TextDecorationLineProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.blink
    - typings.csstype.csstypeStrings.dashed
    - typings.csstype.csstypeStrings.dotted
    - typings.csstype.csstypeStrings.double
    - typings.csstype.csstypeStrings.`line-through`
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.overline
    - typings.csstype.csstypeStrings.solid
    - typings.csstype.csstypeStrings.underline
    - typings.csstype.csstypeStrings.wavy
    - java.lang.String
  */
  type TextDecorationProperty = _TextDecorationProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.`box-decoration`
    - typings.csstype.csstypeStrings.edges
    - typings.csstype.csstypeStrings.`leading-spaces`
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.objects
    - typings.csstype.csstypeStrings.spaces
    - typings.csstype.csstypeStrings.`trailing-spaces`
    - java.lang.String
  */
  type TextDecorationSkipProperty = _TextDecorationSkipProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type TextEmphasisColorProperty = _TextEmphasisColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - typings.csstype.csstypeStrings.circle
    - typings.csstype.csstypeStrings.dot
    - typings.csstype.csstypeStrings.`double-circle`
    - typings.csstype.csstypeStrings.filled
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.open
    - typings.csstype.csstypeStrings.sesame
    - typings.csstype.csstypeStrings.triangle
    - java.lang.String
  */
  type TextEmphasisProperty = _TextEmphasisProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.circle
    - typings.csstype.csstypeStrings.dot
    - typings.csstype.csstypeStrings.`double-circle`
    - typings.csstype.csstypeStrings.filled
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.open
    - typings.csstype.csstypeStrings.sesame
    - typings.csstype.csstypeStrings.triangle
    - java.lang.String
  */
  type TextEmphasisStyleProperty = _TextEmphasisStyleProperty | String
  type TextIndentProperty[TLength] = Globals | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.clip
    - typings.csstype.csstypeStrings.ellipsis
    - java.lang.String
  */
  type TextOverflowProperty = _TextOverflowProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type TextShadowProperty = _TextShadowProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type TextSizeAdjustProperty = _TextSizeAdjustProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.left
    - typings.csstype.csstypeStrings.right
    - typings.csstype.csstypeStrings.under
    - java.lang.String
  */
  type TextUnderlinePositionProperty = _TextUnderlinePositionProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.CubicBezierTimingFunction
    - typings.csstype.csstypeMod.StepTimingFunction
    - typings.csstype.csstypeStrings.linear
  */
  type TimingFunction = _TimingFunction | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type TopProperty[TLength] = _TopProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.`-ms-manipulation`
    - typings.csstype.csstypeStrings.`-ms-none`
    - typings.csstype.csstypeStrings.`-ms-pinch-zoom`
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.manipulation
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.`pan-down`
    - typings.csstype.csstypeStrings.`pan-left`
    - typings.csstype.csstypeStrings.`pan-right`
    - typings.csstype.csstypeStrings.`pan-up`
    - typings.csstype.csstypeStrings.`pan-x`
    - typings.csstype.csstypeStrings.`pan-y`
    - typings.csstype.csstypeStrings.`pinch-zoom`
    - java.lang.String
  */
  type TouchActionProperty = _TouchActionProperty | String
  /* Rewritten from type alias, can be one of: 
    - TLength
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - java.lang.String
  */
  type TrackBreadth[TLength] = _TrackBreadth[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.bottom
    - typings.csstype.csstypeStrings.center
    - typings.csstype.csstypeStrings.left
    - typings.csstype.csstypeStrings.right
    - typings.csstype.csstypeStrings.top
    - java.lang.String
  */
  type TransformOriginProperty[TLength] = _TransformOriginProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type TransformProperty = _TransformProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.SingleTransition
    - java.lang.String
  */
  type TransitionProperty = _TransitionProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.all
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type TransitionPropertyProperty = _TransitionPropertyProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.TimingFunction
    - java.lang.String
  */
  type TransitionTimingFunctionProperty = _TransitionTimingFunctionProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type TranslateProperty[TLength] = _TranslateProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.baseline
    - typings.csstype.csstypeStrings.bottom
    - typings.csstype.csstypeStrings.middle
    - typings.csstype.csstypeStrings.sub
    - typings.csstype.csstypeStrings.`super`
    - typings.csstype.csstypeStrings.`text-bottom`
    - typings.csstype.csstypeStrings.`text-top`
    - typings.csstype.csstypeStrings.top
    - java.lang.String
  */
  type VerticalAlignProperty[TLength] = _VerticalAlignProperty[TLength] | TLength | String
  type ViewportHeightProperty[TLength] = ViewportLength[TLength] | String
  type ViewportLength[TLength] = TLength | auto | String
  type ViewportMaxHeightProperty[TLength] = ViewportLength[TLength]
  type ViewportMaxWidthProperty[TLength] = ViewportLength[TLength]
  type ViewportMaxZoomProperty = auto | String | Double
  type ViewportMinHeightProperty[TLength] = ViewportLength[TLength]
  type ViewportMinWidthProperty[TLength] = ViewportLength[TLength]
  type ViewportMinZoomProperty = auto | String | Double
  type ViewportWidthProperty[TLength] = ViewportLength[TLength] | String
  type ViewportZoomProperty = auto | String | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type WebkitBorderBeforeColorProperty = _WebkitBorderBeforeColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - typings.csstype.csstypeMod.LineStyle
    - typings.csstype.csstypeMod.Color
    - java.lang.String
  */
  type WebkitBorderBeforeProperty[TLength] = _WebkitBorderBeforeProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineStyle
    - java.lang.String
  */
  type WebkitBorderBeforeStyleProperty = _WebkitBorderBeforeStyleProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.LineWidth[TLength]
    - java.lang.String
  */
  type WebkitBorderBeforeWidthProperty[TLength] = _WebkitBorderBeforeWidthProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.above
    - typings.csstype.csstypeStrings.below
    - typings.csstype.csstypeStrings.left
    - typings.csstype.csstypeStrings.right
    - java.lang.String
  */
  type WebkitBoxReflectProperty[TLength] = _WebkitBoxReflectProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - scala.Double
  */
  type WebkitLineClampProperty = _WebkitLineClampProperty | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Attachment
    - java.lang.String
  */
  type WebkitMaskAttachmentProperty = _WebkitMaskAttachmentProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Box
    - typings.csstype.csstypeStrings.border
    - typings.csstype.csstypeStrings.content
    - typings.csstype.csstypeStrings.padding
    - typings.csstype.csstypeStrings.text
    - java.lang.String
  */
  type WebkitMaskClipProperty = _WebkitMaskClipProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.CompositeStyle
    - java.lang.String
  */
  type WebkitMaskCompositeProperty = _WebkitMaskCompositeProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.none
    - java.lang.String
  */
  type WebkitMaskImageProperty = _WebkitMaskImageProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Box
    - typings.csstype.csstypeStrings.border
    - typings.csstype.csstypeStrings.content
    - typings.csstype.csstypeStrings.padding
    - java.lang.String
  */
  type WebkitMaskOriginProperty = _WebkitMaskOriginProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Position[TLength]
    - java.lang.String
  */
  type WebkitMaskPositionProperty[TLength] = _WebkitMaskPositionProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.center
    - typings.csstype.csstypeStrings.left
    - typings.csstype.csstypeStrings.right
    - java.lang.String
  */
  type WebkitMaskPositionXProperty[TLength] = _WebkitMaskPositionXProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.bottom
    - typings.csstype.csstypeStrings.center
    - typings.csstype.csstypeStrings.top
    - java.lang.String
  */
  type WebkitMaskPositionYProperty[TLength] = _WebkitMaskPositionYProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Position[TLength]
    - typings.csstype.csstypeMod.RepeatStyle
    - typings.csstype.csstypeMod.Box
    - typings.csstype.csstypeStrings.border
    - typings.csstype.csstypeStrings.content
    - typings.csstype.csstypeStrings.none
    - typings.csstype.csstypeStrings.padding
    - typings.csstype.csstypeStrings.text
    - java.lang.String
  */
  type WebkitMaskProperty[TLength] = _WebkitMaskProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.RepeatStyle
    - java.lang.String
  */
  type WebkitMaskRepeatProperty = _WebkitMaskRepeatProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.BgSize[TLength]
    - java.lang.String
  */
  type WebkitMaskSizeProperty[TLength] = _WebkitMaskSizeProperty[TLength] | String | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type WebkitTapHighlightColorProperty = _WebkitTapHighlightColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type WebkitTextFillColorProperty = _WebkitTextFillColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
  */
  type WebkitTextStrokeColorProperty = _WebkitTextStrokeColorProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.Color
    - TLength
    - java.lang.String
  */
  type WebkitTextStrokeProperty[TLength] = _WebkitTextStrokeProperty[TLength] | TLength | String
  type WebkitTextStrokeWidthProperty[TLength] = Globals | TLength
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.`-moz-fit-content`
    - typings.csstype.csstypeStrings.`-moz-max-content`
    - typings.csstype.csstypeStrings.`-moz-min-content`
    - typings.csstype.csstypeStrings.`-webkit-fill-available`
    - typings.csstype.csstypeStrings.`-webkit-fit-content`
    - typings.csstype.csstypeStrings.`-webkit-max-content`
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.available
    - typings.csstype.csstypeStrings.`fit-content`
    - typings.csstype.csstypeStrings.intrinsic
    - typings.csstype.csstypeStrings.`max-content`
    - typings.csstype.csstypeStrings.`min-content`
    - typings.csstype.csstypeStrings.`min-intrinsic`
    - java.lang.String
  */
  type WidthProperty[TLength] = _WidthProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeMod.AnimateableFeature
    - typings.csstype.csstypeStrings.auto
    - java.lang.String
  */
  type WillChangeProperty = _WillChangeProperty | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - TLength
    - typings.csstype.csstypeStrings.normal
    - java.lang.String
  */
  type WordSpacingProperty[TLength] = _WordSpacingProperty[TLength] | TLength | String
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.auto
    - scala.Double
  */
  type ZIndexProperty = _ZIndexProperty | Double
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeMod.Globals
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.reset
    - java.lang.String
    - scala.Double
  */
  type ZoomProperty = _ZoomProperty | String | Double
}
