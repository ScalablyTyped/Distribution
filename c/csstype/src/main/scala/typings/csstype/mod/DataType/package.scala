package typings.csstype.mod.DataType

import typings.csstype.csstypeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.contents
  - typings.csstype.csstypeStrings.`scroll-position`
  - java.lang.String
*/
type AnimateableFeature = _AnimateableFeature | String

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
  - typings.csstype.mod.DataType.NamedColor
  - typings.csstype.mod.DataType.DeprecatedSystemColor
  - typings.csstype.csstypeStrings.currentcolor_
  - java.lang.String
*/
type Color = _Color | String

/* Rewritten from type alias, can be one of: 
  - typings.csstype.mod.DataType.Quote
  - typings.csstype.csstypeStrings.contents
  - java.lang.String
*/
type ContentList = _ContentList | String

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.ease
  - typings.csstype.csstypeStrings.`ease-in`
  - typings.csstype.csstypeStrings.`ease-in-out`
  - typings.csstype.csstypeStrings.`ease-out`
  - java.lang.String
*/
type CubicBezierTimingFunction = _CubicBezierTimingFunction | String

type Dasharray[TLength] = TLength | String | Double

/* Rewritten from type alias, can be one of: 
  - typings.csstype.mod.DataType.CubicBezierTimingFunction
  - typings.csstype.mod.DataType.StepTimingFunction
  - typings.csstype.csstypeStrings.linear
*/
type EasingFunction = _EasingFunction | String

/* Rewritten from type alias, can be one of: 
  - typings.csstype.mod.DataType.Color
  - typings.csstype.mod.DataType.BgPosition[TLength]
  - typings.csstype.mod.DataType.RepeatStyle
  - typings.csstype.mod.DataType.Attachment
  - typings.csstype.mod.DataType.Box
  - typings.csstype.csstypeStrings.none
  - java.lang.String
*/
type FinalBgLayer[TLength] = _FinalBgLayer[TLength] | String | TLength

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
  - typings.csstype.csstypeStrings.bold
  - typings.csstype.csstypeStrings.normal
  - scala.Double
  - java.lang.String
*/
type FontWeightAbsolute = _FontWeightAbsolute | Double | String

type GridLine = auto | String | Double

/* Rewritten from type alias, can be one of: 
  - TLength
  - typings.csstype.csstypeStrings.medium
  - typings.csstype.csstypeStrings.thick
  - typings.csstype.csstypeStrings.thin
*/
type LineWidth[TLength] = _LineWidth[TLength] | TLength

/* Rewritten from type alias, can be one of: 
  - typings.csstype.mod.DataType.Position[TLength]
  - typings.csstype.mod.DataType.RepeatStyle
  - typings.csstype.mod.DataType.GeometryBox
  - typings.csstype.mod.DataType.CompositingOperator
  - typings.csstype.mod.DataType.MaskingMode
  - typings.csstype.csstypeStrings.`no-clip`
  - typings.csstype.csstypeStrings.none
  - java.lang.String
*/
type MaskLayer[TLength] = _MaskLayer[TLength] | String | TLength

/* Rewritten from type alias, can be one of: 
  - typings.csstype.mod.DataType.Color
  - typings.csstype.csstypeStrings.child
  - typings.csstype.csstypeStrings.`context-fill`
  - typings.csstype.csstypeStrings.`context-stroke`
  - typings.csstype.csstypeStrings.none
  - java.lang.String
*/
type Paint = _Paint | String

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
  - typings.csstype.mod.DataType.EasingFunction
  - typings.csstype.mod.DataType.SingleAnimationDirection
  - typings.csstype.mod.DataType.SingleAnimationFillMode
  - TTime
  - typings.csstype.csstypeStrings.infinite
  - typings.csstype.csstypeStrings.none
  - typings.csstype.csstypeStrings.paused
  - typings.csstype.csstypeStrings.running
  - java.lang.String
  - scala.Double
*/
type SingleAnimation[TTime] = _SingleAnimation[TTime] | TTime | String | Double

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.auto
  - typings.csstype.csstypeStrings.none
  - java.lang.String
*/
type SingleAnimationTimeline = _SingleAnimationTimeline | String

/* Rewritten from type alias, can be one of: 
  - typings.csstype.mod.DataType.EasingFunction
  - TTime
  - typings.csstype.csstypeStrings.all
  - typings.csstype.csstypeStrings.none
  - java.lang.String
*/
type SingleTransition[TTime] = _SingleTransition[TTime] | TTime | String

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.`step-end`
  - typings.csstype.csstypeStrings.`step-start`
  - java.lang.String
*/
type StepTimingFunction = _StepTimingFunction | String

/* Rewritten from type alias, can be one of: 
  - TLength
  - typings.csstype.csstypeStrings.auto
  - typings.csstype.csstypeStrings.`max-content`
  - typings.csstype.csstypeStrings.`min-content`
  - java.lang.String
*/
type TrackBreadth[TLength] = _TrackBreadth[TLength] | TLength | String

type ViewportLength[TLength] = TLength | auto | String
