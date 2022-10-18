package typings.csstype

import typings.csstype.mod.AtRule.FontDisplay
import typings.csstype.mod.AtRule.Inherits
import typings.csstype.mod.AtRule.Orientation
import typings.csstype.mod.AtRule.UserZoom
import typings.csstype.mod.AtRule.ViewportFit
import typings.csstype.mod.AtRule._Marks
import typings.csstype.mod.AtRule._Size
import typings.csstype.mod.AtRule._SpeakAs
import typings.csstype.mod.AtRule._System
import typings.csstype.mod.AtRules
import typings.csstype.mod.DataType.AbsoluteSize
import typings.csstype.mod.DataType.Attachment
import typings.csstype.mod.DataType.BlendMode
import typings.csstype.mod.DataType.Box
import typings.csstype.mod.DataType.CompatAuto
import typings.csstype.mod.DataType.CompositeStyle
import typings.csstype.mod.DataType.CompositingOperator
import typings.csstype.mod.DataType.ContentDistribution
import typings.csstype.mod.DataType.ContentPosition
import typings.csstype.mod.DataType.DeprecatedSystemColor
import typings.csstype.mod.DataType.DisplayInside
import typings.csstype.mod.DataType.DisplayInternal
import typings.csstype.mod.DataType.DisplayLegacy
import typings.csstype.mod.DataType.DisplayOutside
import typings.csstype.mod.DataType.EastAsianVariantValues
import typings.csstype.mod.DataType.GenericFamily
import typings.csstype.mod.DataType.GeometryBox
import typings.csstype.mod.DataType.LineStyle
import typings.csstype.mod.DataType.MaskingMode
import typings.csstype.mod.DataType.NamedColor
import typings.csstype.mod.DataType.PageSize
import typings.csstype.mod.DataType.Quote
import typings.csstype.mod.DataType.SelfPosition
import typings.csstype.mod.DataType.SingleAnimationDirection
import typings.csstype.mod.DataType.SingleAnimationFillMode
import typings.csstype.mod.DataType.VisualBox
import typings.csstype.mod.DataType._AnimateableFeature
import typings.csstype.mod.DataType._BgPosition
import typings.csstype.mod.DataType._BgSize
import typings.csstype.mod.DataType._Color
import typings.csstype.mod.DataType._ContentList
import typings.csstype.mod.DataType._CubicBezierTimingFunction
import typings.csstype.mod.DataType._EasingFunction
import typings.csstype.mod.DataType._FinalBgLayer
import typings.csstype.mod.DataType._FontStretchAbsolute
import typings.csstype.mod.DataType._FontWeightAbsolute
import typings.csstype.mod.DataType._LineWidth
import typings.csstype.mod.DataType._MaskLayer
import typings.csstype.mod.DataType._Paint
import typings.csstype.mod.DataType._Position
import typings.csstype.mod.DataType._RepeatStyle
import typings.csstype.mod.DataType._SingleAnimation
import typings.csstype.mod.DataType._SingleAnimationTimeline
import typings.csstype.mod.DataType._SingleTransition
import typings.csstype.mod.DataType._StepTimingFunction
import typings.csstype.mod.DataType._TrackBreadth
import typings.csstype.mod.Globals
import typings.csstype.mod.HtmlAttributes
import typings.csstype.mod.Property.AlignmentBaseline
import typings.csstype.mod.Property.Appearance
import typings.csstype.mod.Property.BackfaceVisibility
import typings.csstype.mod.Property.BorderBlockEndStyle
import typings.csstype.mod.Property.BorderBlockStartStyle
import typings.csstype.mod.Property.BorderBlockStyle
import typings.csstype.mod.Property.BorderBottomStyle
import typings.csstype.mod.Property.BorderCollapse
import typings.csstype.mod.Property.BorderInlineEndStyle
import typings.csstype.mod.Property.BorderInlineStartStyle
import typings.csstype.mod.Property.BorderInlineStyle
import typings.csstype.mod.Property.BorderLeftStyle
import typings.csstype.mod.Property.BorderRightStyle
import typings.csstype.mod.Property.BorderTopStyle
import typings.csstype.mod.Property.BoxAlign
import typings.csstype.mod.Property.BoxDecorationBreak
import typings.csstype.mod.Property.BoxDirection
import typings.csstype.mod.Property.BoxLines
import typings.csstype.mod.Property.BoxOrient
import typings.csstype.mod.Property.BoxPack
import typings.csstype.mod.Property.BoxSizing
import typings.csstype.mod.Property.BreakAfter
import typings.csstype.mod.Property.BreakBefore
import typings.csstype.mod.Property.BreakInside
import typings.csstype.mod.Property.CaptionSide
import typings.csstype.mod.Property.Clear
import typings.csstype.mod.Property.ClipRule
import typings.csstype.mod.Property.ColorInterpolation
import typings.csstype.mod.Property.ColorRendering
import typings.csstype.mod.Property.ColumnFill
import typings.csstype.mod.Property.ColumnSpan
import typings.csstype.mod.Property.ContentVisibility
import typings.csstype.mod.Property.Direction
import typings.csstype.mod.Property.DominantBaseline
import typings.csstype.mod.Property.EmptyCells
import typings.csstype.mod.Property.FillRule
import typings.csstype.mod.Property.FlexDirection
import typings.csstype.mod.Property.FlexWrap
import typings.csstype.mod.Property.Float
import typings.csstype.mod.Property.FontKerning
import typings.csstype.mod.Property.FontOpticalSizing
import typings.csstype.mod.Property.FontVariantCaps
import typings.csstype.mod.Property.FontVariantPosition
import typings.csstype.mod.Property.ForcedColorAdjust
import typings.csstype.mod.Property.Hyphens
import typings.csstype.mod.Property.ImageRendering
import typings.csstype.mod.Property.ImeMode
import typings.csstype.mod.Property.InputSecurity
import typings.csstype.mod.Property.Isolation
import typings.csstype.mod.Property.LineBreak
import typings.csstype.mod.Property.ListStylePosition
import typings.csstype.mod.Property.MaskBorderMode
import typings.csstype.mod.Property.MaskType
import typings.csstype.mod.Property.MathShift
import typings.csstype.mod.Property.MathStyle
import typings.csstype.mod.Property.MixBlendMode
import typings.csstype.mod.Property.MozAppearance
import typings.csstype.mod.Property.MozFloatEdge
import typings.csstype.mod.Property.MozOrient
import typings.csstype.mod.Property.MozStackSizing
import typings.csstype.mod.Property.MozTextBlink
import typings.csstype.mod.Property.MozUserFocus
import typings.csstype.mod.Property.MozUserInput
import typings.csstype.mod.Property.MozUserModify
import typings.csstype.mod.Property.MozWindowDragging
import typings.csstype.mod.Property.MozWindowShadow
import typings.csstype.mod.Property.MsAccelerator
import typings.csstype.mod.Property.MsBlockProgression
import typings.csstype.mod.Property.MsContentZoomChaining
import typings.csstype.mod.Property.MsContentZoomSnapType
import typings.csstype.mod.Property.MsContentZooming
import typings.csstype.mod.Property.MsHighContrastAdjust
import typings.csstype.mod.Property.MsImeAlign
import typings.csstype.mod.Property.MsOverflowStyle
import typings.csstype.mod.Property.MsScrollChaining
import typings.csstype.mod.Property.MsScrollRails
import typings.csstype.mod.Property.MsScrollSnapType
import typings.csstype.mod.Property.MsScrollTranslation
import typings.csstype.mod.Property.MsTextAutospace
import typings.csstype.mod.Property.MsTouchSelect
import typings.csstype.mod.Property.MsUserSelect
import typings.csstype.mod.Property.MsWrapFlow
import typings.csstype.mod.Property.MsWrapThrough
import typings.csstype.mod.Property.ObjectFit
import typings.csstype.mod.Property.OverflowAnchor
import typings.csstype.mod.Property.OverflowBlock
import typings.csstype.mod.Property.OverflowClipBox
import typings.csstype.mod.Property.OverflowInline
import typings.csstype.mod.Property.OverflowWrap
import typings.csstype.mod.Property.OverflowX
import typings.csstype.mod.Property.OverflowY
import typings.csstype.mod.Property.OverscrollBehaviorBlock
import typings.csstype.mod.Property.OverscrollBehaviorInline
import typings.csstype.mod.Property.OverscrollBehaviorX
import typings.csstype.mod.Property.OverscrollBehaviorY
import typings.csstype.mod.Property.PageBreakAfter
import typings.csstype.mod.Property.PageBreakBefore
import typings.csstype.mod.Property.PageBreakInside
import typings.csstype.mod.Property.PointerEvents
import typings.csstype.mod.Property.Position
import typings.csstype.mod.Property.PrintColorAdjust
import typings.csstype.mod.Property.Resize
import typings.csstype.mod.Property.RubyAlign
import typings.csstype.mod.Property.RubyMerge
import typings.csstype.mod.Property.ScrollBehavior
import typings.csstype.mod.Property.ScrollSnapStop
import typings.csstype.mod.Property.ScrollSnapTypeX
import typings.csstype.mod.Property.ScrollSnapTypeY
import typings.csstype.mod.Property.ScrollbarWidth
import typings.csstype.mod.Property.ShapeRendering
import typings.csstype.mod.Property.StrokeLinecap
import typings.csstype.mod.Property.StrokeLinejoin
import typings.csstype.mod.Property.TableLayout
import typings.csstype.mod.Property.TextAlign
import typings.csstype.mod.Property.TextAlignLast
import typings.csstype.mod.Property.TextAnchor
import typings.csstype.mod.Property.TextDecorationSkipInk
import typings.csstype.mod.Property.TextDecorationStyle
import typings.csstype.mod.Property.TextJustify
import typings.csstype.mod.Property.TextOrientation
import typings.csstype.mod.Property.TextRendering
import typings.csstype.mod.Property.TextTransform
import typings.csstype.mod.Property.TransformBox
import typings.csstype.mod.Property.TransformStyle
import typings.csstype.mod.Property.UnicodeBidi
import typings.csstype.mod.Property.UserSelect
import typings.csstype.mod.Property.VectorEffect
import typings.csstype.mod.Property.Visibility
import typings.csstype.mod.Property.WebkitAppearance
import typings.csstype.mod.Property.WebkitMaskRepeatX
import typings.csstype.mod.Property.WebkitMaskRepeatY
import typings.csstype.mod.Property.WebkitOverflowScrolling
import typings.csstype.mod.Property.WebkitTouchCallout
import typings.csstype.mod.Property.WebkitUserModify
import typings.csstype.mod.Property.WhiteSpace
import typings.csstype.mod.Property.WordBreak
import typings.csstype.mod.Property.WordWrap
import typings.csstype.mod.Property.WritingMode
import typings.csstype.mod.Property._AccentColor
import typings.csstype.mod.Property._AlignContent
import typings.csstype.mod.Property._AlignItems
import typings.csstype.mod.Property._AlignSelf
import typings.csstype.mod.Property._AlignTracks
import typings.csstype.mod.Property._AnimationIterationCount
import typings.csstype.mod.Property._AnimationName
import typings.csstype.mod.Property._AnimationPlayState
import typings.csstype.mod.Property._AspectRatio
import typings.csstype.mod.Property._Azimuth
import typings.csstype.mod.Property._BackdropFilter
import typings.csstype.mod.Property._BackgroundImage
import typings.csstype.mod.Property._BackgroundPositionX
import typings.csstype.mod.Property._BackgroundPositionY
import typings.csstype.mod.Property._BaselineShift
import typings.csstype.mod.Property._BlockOverflow
import typings.csstype.mod.Property._BlockSize
import typings.csstype.mod.Property._BorderImage
import typings.csstype.mod.Property._BorderImageRepeat
import typings.csstype.mod.Property._BorderImageSource
import typings.csstype.mod.Property._BorderImageWidth
import typings.csstype.mod.Property._Bottom
import typings.csstype.mod.Property._BoxShadow
import typings.csstype.mod.Property._CaretColor
import typings.csstype.mod.Property._Clip
import typings.csstype.mod.Property._ClipPath
import typings.csstype.mod.Property._ColorScheme
import typings.csstype.mod.Property._ColumnCount
import typings.csstype.mod.Property._ColumnGap
import typings.csstype.mod.Property._ColumnWidth
import typings.csstype.mod.Property._Columns
import typings.csstype.mod.Property._Contain
import typings.csstype.mod.Property._Content
import typings.csstype.mod.Property._CounterIncrement
import typings.csstype.mod.Property._CounterReset
import typings.csstype.mod.Property._CounterSet
import typings.csstype.mod.Property._Cursor
import typings.csstype.mod.Property._Display
import typings.csstype.mod.Property._Filter
import typings.csstype.mod.Property._Flex
import typings.csstype.mod.Property._FlexBasis
import typings.csstype.mod.Property._FlexFlow
import typings.csstype.mod.Property._FloodColor
import typings.csstype.mod.Property._Font
import typings.csstype.mod.Property._FontFeatureSettings
import typings.csstype.mod.Property._FontLanguageOverride
import typings.csstype.mod.Property._FontSize
import typings.csstype.mod.Property._FontSizeAdjust
import typings.csstype.mod.Property._FontSmooth
import typings.csstype.mod.Property._FontStyle
import typings.csstype.mod.Property._FontSynthesis
import typings.csstype.mod.Property._FontVariant
import typings.csstype.mod.Property._FontVariantAlternates
import typings.csstype.mod.Property._FontVariantEastAsian
import typings.csstype.mod.Property._FontVariantLigatures
import typings.csstype.mod.Property._FontVariantNumeric
import typings.csstype.mod.Property._FontVariationSettings
import typings.csstype.mod.Property._FontWeight
import typings.csstype.mod.Property._Gap
import typings.csstype.mod.Property._GlyphOrientationVertical
import typings.csstype.mod.Property._Grid
import typings.csstype.mod.Property._GridAutoFlow
import typings.csstype.mod.Property._GridTemplate
import typings.csstype.mod.Property._GridTemplateAreas
import typings.csstype.mod.Property._GridTemplateColumns
import typings.csstype.mod.Property._GridTemplateRows
import typings.csstype.mod.Property._HangingPunctuation
import typings.csstype.mod.Property._Height
import typings.csstype.mod.Property._HyphenateCharacter
import typings.csstype.mod.Property._ImageOrientation
import typings.csstype.mod.Property._ImageResolution
import typings.csstype.mod.Property._InitialLetter
import typings.csstype.mod.Property._InlineSize
import typings.csstype.mod.Property._Inset
import typings.csstype.mod.Property._InsetBlock
import typings.csstype.mod.Property._InsetBlockEnd
import typings.csstype.mod.Property._InsetBlockStart
import typings.csstype.mod.Property._InsetInline
import typings.csstype.mod.Property._InsetInlineEnd
import typings.csstype.mod.Property._InsetInlineStart
import typings.csstype.mod.Property._JustifyContent
import typings.csstype.mod.Property._JustifyItems
import typings.csstype.mod.Property._JustifySelf
import typings.csstype.mod.Property._JustifyTracks
import typings.csstype.mod.Property._Left
import typings.csstype.mod.Property._LetterSpacing
import typings.csstype.mod.Property._LightingColor
import typings.csstype.mod.Property._LineClamp
import typings.csstype.mod.Property._LineHeight
import typings.csstype.mod.Property._ListStyle
import typings.csstype.mod.Property._ListStyleImage
import typings.csstype.mod.Property._ListStyleType
import typings.csstype.mod.Property._Margin
import typings.csstype.mod.Property._MarginBlock
import typings.csstype.mod.Property._MarginBlockEnd
import typings.csstype.mod.Property._MarginBlockStart
import typings.csstype.mod.Property._MarginBottom
import typings.csstype.mod.Property._MarginInline
import typings.csstype.mod.Property._MarginInlineEnd
import typings.csstype.mod.Property._MarginInlineStart
import typings.csstype.mod.Property._MarginLeft
import typings.csstype.mod.Property._MarginRight
import typings.csstype.mod.Property._MarginTop
import typings.csstype.mod.Property._Marker
import typings.csstype.mod.Property._MarkerEnd
import typings.csstype.mod.Property._MarkerMid
import typings.csstype.mod.Property._MarkerStart
import typings.csstype.mod.Property._MaskBorder
import typings.csstype.mod.Property._MaskBorderRepeat
import typings.csstype.mod.Property._MaskBorderSource
import typings.csstype.mod.Property._MaskBorderWidth
import typings.csstype.mod.Property._MaskClip
import typings.csstype.mod.Property._MaskImage
import typings.csstype.mod.Property._MathDepth
import typings.csstype.mod.Property._MaxBlockSize
import typings.csstype.mod.Property._MaxHeight
import typings.csstype.mod.Property._MaxInlineSize
import typings.csstype.mod.Property._MaxLines
import typings.csstype.mod.Property._MaxWidth
import typings.csstype.mod.Property._MinBlockSize
import typings.csstype.mod.Property._MinHeight
import typings.csstype.mod.Property._MinInlineSize
import typings.csstype.mod.Property._MinWidth
import typings.csstype.mod.Property._MozBinding
import typings.csstype.mod.Property._MozBorderBottomColors
import typings.csstype.mod.Property._MozBorderLeftColors
import typings.csstype.mod.Property._MozBorderRightColors
import typings.csstype.mod.Property._MozBorderTopColors
import typings.csstype.mod.Property._MozContextProperties
import typings.csstype.mod.Property._MozImageRegion
import typings.csstype.mod.Property._MsContentZoomSnap
import typings.csstype.mod.Property._MsFlowFrom
import typings.csstype.mod.Property._MsFlowInto
import typings.csstype.mod.Property._MsGridColumns
import typings.csstype.mod.Property._MsGridRows
import typings.csstype.mod.Property._MsHyphenateLimitChars
import typings.csstype.mod.Property._MsHyphenateLimitLines
import typings.csstype.mod.Property._MsScrollLimitXMax
import typings.csstype.mod.Property._MsScrollLimitYMax
import typings.csstype.mod.Property._Offset
import typings.csstype.mod.Property._OffsetAnchor
import typings.csstype.mod.Property._OffsetPath
import typings.csstype.mod.Property._OffsetRotate
import typings.csstype.mod.Property._Outline
import typings.csstype.mod.Property._OutlineColor
import typings.csstype.mod.Property._OutlineStyle
import typings.csstype.mod.Property._Overflow
import typings.csstype.mod.Property._OverscrollBehavior
import typings.csstype.mod.Property._PaintOrder
import typings.csstype.mod.Property._Perspective
import typings.csstype.mod.Property._PlaceContent
import typings.csstype.mod.Property._PlaceItems
import typings.csstype.mod.Property._PlaceSelf
import typings.csstype.mod.Property._Quotes
import typings.csstype.mod.Property._Right
import typings.csstype.mod.Property._Rotate
import typings.csstype.mod.Property._RowGap
import typings.csstype.mod.Property._RubyPosition
import typings.csstype.mod.Property._Scale
import typings.csstype.mod.Property._ScrollPadding
import typings.csstype.mod.Property._ScrollPaddingBlock
import typings.csstype.mod.Property._ScrollPaddingBlockEnd
import typings.csstype.mod.Property._ScrollPaddingBlockStart
import typings.csstype.mod.Property._ScrollPaddingBottom
import typings.csstype.mod.Property._ScrollPaddingInline
import typings.csstype.mod.Property._ScrollPaddingInlineEnd
import typings.csstype.mod.Property._ScrollPaddingInlineStart
import typings.csstype.mod.Property._ScrollPaddingLeft
import typings.csstype.mod.Property._ScrollPaddingRight
import typings.csstype.mod.Property._ScrollPaddingTop
import typings.csstype.mod.Property._ScrollSnapAlign
import typings.csstype.mod.Property._ScrollSnapCoordinate
import typings.csstype.mod.Property._ScrollSnapPointsX
import typings.csstype.mod.Property._ScrollSnapPointsY
import typings.csstype.mod.Property._ScrollSnapType
import typings.csstype.mod.Property._ScrollbarColor
import typings.csstype.mod.Property._ScrollbarGutter
import typings.csstype.mod.Property._ShapeOutside
import typings.csstype.mod.Property._StopColor
import typings.csstype.mod.Property._StrokeDasharray
import typings.csstype.mod.Property._TextCombineUpright
import typings.csstype.mod.Property._TextDecoration
import typings.csstype.mod.Property._TextDecorationLine
import typings.csstype.mod.Property._TextDecorationSkip
import typings.csstype.mod.Property._TextDecorationThickness
import typings.csstype.mod.Property._TextEmphasis
import typings.csstype.mod.Property._TextEmphasisStyle
import typings.csstype.mod.Property._TextOverflow
import typings.csstype.mod.Property._TextShadow
import typings.csstype.mod.Property._TextSizeAdjust
import typings.csstype.mod.Property._TextUnderlineOffset
import typings.csstype.mod.Property._TextUnderlinePosition
import typings.csstype.mod.Property._Top
import typings.csstype.mod.Property._TouchAction
import typings.csstype.mod.Property._Transform
import typings.csstype.mod.Property._TransformOrigin
import typings.csstype.mod.Property._TransitionProperty
import typings.csstype.mod.Property._Translate
import typings.csstype.mod.Property._VerticalAlign
import typings.csstype.mod.Property._WebkitBoxReflect
import typings.csstype.mod.Property._WebkitLineClamp
import typings.csstype.mod.Property._WebkitMask
import typings.csstype.mod.Property._WebkitMaskClip
import typings.csstype.mod.Property._WebkitMaskImage
import typings.csstype.mod.Property._WebkitMaskOrigin
import typings.csstype.mod.Property._WebkitMaskPositionX
import typings.csstype.mod.Property._WebkitMaskPositionY
import typings.csstype.mod.Property._Width
import typings.csstype.mod.Property._WillChange
import typings.csstype.mod.Property._WordSpacing
import typings.csstype.mod.Property._ZIndex
import typings.csstype.mod.Property._Zoom
import typings.csstype.mod.SimplePseudos
import typings.csstype.mod.SvgAttributes
import typings.csstype.mod._AdvancedPseudos
import typings.csstype.mod._Pseudos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csstypeStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with MozWindowShadow
       with WebkitTouchCallout
       with _Cursor
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `-apple-pay-button`
    extends StObject
       with WebkitAppearance
  inline def `-apple-pay-button`: `-apple-pay-button` = "-apple-pay-button".asInstanceOf[`-apple-pay-button`]
  
  @js.native
  sealed trait `-moz-crisp-edges`
    extends StObject
       with ImageRendering
  inline def `-moz-crisp-edges`: `-moz-crisp-edges` = "-moz-crisp-edges".asInstanceOf[`-moz-crisp-edges`]
  
  @js.native
  sealed trait `-moz-fit-content`
    extends StObject
       with _BlockSize[Any]
       with _FlexBasis[Any]
       with _InlineSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _Width[Any]
  inline def `-moz-fit-content`: `-moz-fit-content` = "-moz-fit-content".asInstanceOf[`-moz-fit-content`]
  
  @js.native
  sealed trait `-moz-grab`
    extends StObject
       with _Cursor
  inline def `-moz-grab`: `-moz-grab` = "-moz-grab".asInstanceOf[`-moz-grab`]
  
  @js.native
  sealed trait `-moz-hidden-unscrollable`
    extends StObject
       with OverflowX
       with OverflowY
       with _Overflow
  inline def `-moz-hidden-unscrollable`: `-moz-hidden-unscrollable` = "-moz-hidden-unscrollable".asInstanceOf[`-moz-hidden-unscrollable`]
  
  @js.native
  sealed trait `-moz-initial`
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderCollapse
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with BoxAlign
       with BoxDecorationBreak
       with BoxDirection
       with BoxLines
       with BoxOrient
       with BoxPack
       with BoxSizing
       with BreakAfter
       with BreakBefore
       with BreakInside
       with CaptionSide
       with Clear
       with ClipRule
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
       with ContentVisibility
       with Direction
       with DominantBaseline
       with EmptyCells
       with FillRule
       with FlexDirection
       with FlexWrap
       with Float
       with FontKerning
       with FontOpticalSizing
       with FontVariantCaps
       with FontVariantPosition
       with ForcedColorAdjust
       with Globals
       with Hyphens
       with ImageRendering
       with ImeMode
       with InputSecurity
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
       with MathShift
       with MathStyle
       with MixBlendMode
       with MozAppearance
       with MozFloatEdge
       with MozOrient
       with MozStackSizing
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozUserModify
       with MozWindowDragging
       with MozWindowShadow
       with MsAccelerator
       with MsBlockProgression
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapFlow
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverflowBlock
       with OverflowClipBox
       with OverflowInline
       with OverflowWrap
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with Position
       with PrintColorAdjust
       with Resize
       with RubyAlign
       with RubyMerge
       with ScrollBehavior
       with ScrollSnapStop
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with ShapeRendering
       with StrokeLinecap
       with StrokeLinejoin
       with TableLayout
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with TextDecorationSkipInk
       with TextDecorationStyle
       with TextJustify
       with TextOrientation
       with TextRendering
       with TextTransform
       with TransformBox
       with TransformStyle
       with UnicodeBidi
       with UserSelect
       with VectorEffect
       with Visibility
       with WebkitAppearance
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with WebkitOverflowScrolling
       with WebkitTouchCallout
       with WebkitUserModify
       with WhiteSpace
       with WordBreak
       with WordWrap
       with WritingMode
  inline def `-moz-initial`: `-moz-initial` = "-moz-initial".asInstanceOf[`-moz-initial`]
  
  @js.native
  sealed trait `-moz-isolate`
    extends StObject
       with UnicodeBidi
  inline def `-moz-isolate`: `-moz-isolate` = "-moz-isolate".asInstanceOf[`-moz-isolate`]
  
  @js.native
  sealed trait `-moz-isolate-override`
    extends StObject
       with UnicodeBidi
  inline def `-moz-isolate-override`: `-moz-isolate-override` = "-moz-isolate-override".asInstanceOf[`-moz-isolate-override`]
  
  @js.native
  sealed trait `-moz-mac-unified-toolbar`
    extends StObject
       with MozAppearance
  inline def `-moz-mac-unified-toolbar`: `-moz-mac-unified-toolbar` = "-moz-mac-unified-toolbar".asInstanceOf[`-moz-mac-unified-toolbar`]
  
  @js.native
  sealed trait `-moz-max-content`
    extends StObject
       with _BlockSize[Any]
       with _FlexBasis[Any]
       with _Height[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _Width[Any]
  inline def `-moz-max-content`: `-moz-max-content` = "-moz-max-content".asInstanceOf[`-moz-max-content`]
  
  @js.native
  sealed trait `-moz-min-content`
    extends StObject
       with _BlockSize[Any]
       with _FlexBasis[Any]
       with _Height[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _Width[Any]
  inline def `-moz-min-content`: `-moz-min-content` = "-moz-min-content".asInstanceOf[`-moz-min-content`]
  
  @js.native
  sealed trait `-moz-none`
    extends StObject
       with UserSelect
  inline def `-moz-none`: `-moz-none` = "-moz-none".asInstanceOf[`-moz-none`]
  
  @js.native
  sealed trait `-moz-plaintext`
    extends StObject
       with UnicodeBidi
  inline def `-moz-plaintext`: `-moz-plaintext` = "-moz-plaintext".asInstanceOf[`-moz-plaintext`]
  
  @js.native
  sealed trait `-moz-pre-wrap`
    extends StObject
       with WhiteSpace
  inline def `-moz-pre-wrap`: `-moz-pre-wrap` = "-moz-pre-wrap".asInstanceOf[`-moz-pre-wrap`]
  
  @js.native
  sealed trait `-moz-win-borderless-glass`
    extends StObject
       with MozAppearance
  inline def `-moz-win-borderless-glass`: `-moz-win-borderless-glass` = "-moz-win-borderless-glass".asInstanceOf[`-moz-win-borderless-glass`]
  
  @js.native
  sealed trait `-moz-win-browsertabbar-toolbox`
    extends StObject
       with MozAppearance
  inline def `-moz-win-browsertabbar-toolbox`: `-moz-win-browsertabbar-toolbox` = "-moz-win-browsertabbar-toolbox".asInstanceOf[`-moz-win-browsertabbar-toolbox`]
  
  @js.native
  sealed trait `-moz-win-communications-toolbox`
    extends StObject
       with MozAppearance
  inline def `-moz-win-communications-toolbox`: `-moz-win-communications-toolbox` = "-moz-win-communications-toolbox".asInstanceOf[`-moz-win-communications-toolbox`]
  
  @js.native
  sealed trait `-moz-win-communicationstext`
    extends StObject
       with MozAppearance
  inline def `-moz-win-communicationstext`: `-moz-win-communicationstext` = "-moz-win-communicationstext".asInstanceOf[`-moz-win-communicationstext`]
  
  @js.native
  sealed trait `-moz-win-exclude-glass`
    extends StObject
       with MozAppearance
  inline def `-moz-win-exclude-glass`: `-moz-win-exclude-glass` = "-moz-win-exclude-glass".asInstanceOf[`-moz-win-exclude-glass`]
  
  @js.native
  sealed trait `-moz-win-glass`
    extends StObject
       with MozAppearance
  inline def `-moz-win-glass`: `-moz-win-glass` = "-moz-win-glass".asInstanceOf[`-moz-win-glass`]
  
  @js.native
  sealed trait `-moz-win-media-toolbox`
    extends StObject
       with MozAppearance
  inline def `-moz-win-media-toolbox`: `-moz-win-media-toolbox` = "-moz-win-media-toolbox".asInstanceOf[`-moz-win-media-toolbox`]
  
  @js.native
  sealed trait `-moz-win-mediatext`
    extends StObject
       with MozAppearance
  inline def `-moz-win-mediatext`: `-moz-win-mediatext` = "-moz-win-mediatext".asInstanceOf[`-moz-win-mediatext`]
  
  @js.native
  sealed trait `-moz-window-button-box`
    extends StObject
       with MozAppearance
  inline def `-moz-window-button-box`: `-moz-window-button-box` = "-moz-window-button-box".asInstanceOf[`-moz-window-button-box`]
  
  @js.native
  sealed trait `-moz-window-button-box-maximized`
    extends StObject
       with MozAppearance
  inline def `-moz-window-button-box-maximized`: `-moz-window-button-box-maximized` = "-moz-window-button-box-maximized".asInstanceOf[`-moz-window-button-box-maximized`]
  
  @js.native
  sealed trait `-moz-window-button-close`
    extends StObject
       with MozAppearance
  inline def `-moz-window-button-close`: `-moz-window-button-close` = "-moz-window-button-close".asInstanceOf[`-moz-window-button-close`]
  
  @js.native
  sealed trait `-moz-window-button-maximize`
    extends StObject
       with MozAppearance
  inline def `-moz-window-button-maximize`: `-moz-window-button-maximize` = "-moz-window-button-maximize".asInstanceOf[`-moz-window-button-maximize`]
  
  @js.native
  sealed trait `-moz-window-button-minimize`
    extends StObject
       with MozAppearance
  inline def `-moz-window-button-minimize`: `-moz-window-button-minimize` = "-moz-window-button-minimize".asInstanceOf[`-moz-window-button-minimize`]
  
  @js.native
  sealed trait `-moz-window-button-restore`
    extends StObject
       with MozAppearance
  inline def `-moz-window-button-restore`: `-moz-window-button-restore` = "-moz-window-button-restore".asInstanceOf[`-moz-window-button-restore`]
  
  @js.native
  sealed trait `-moz-window-frame-bottom`
    extends StObject
       with MozAppearance
  inline def `-moz-window-frame-bottom`: `-moz-window-frame-bottom` = "-moz-window-frame-bottom".asInstanceOf[`-moz-window-frame-bottom`]
  
  @js.native
  sealed trait `-moz-window-frame-left`
    extends StObject
       with MozAppearance
  inline def `-moz-window-frame-left`: `-moz-window-frame-left` = "-moz-window-frame-left".asInstanceOf[`-moz-window-frame-left`]
  
  @js.native
  sealed trait `-moz-window-frame-right`
    extends StObject
       with MozAppearance
  inline def `-moz-window-frame-right`: `-moz-window-frame-right` = "-moz-window-frame-right".asInstanceOf[`-moz-window-frame-right`]
  
  @js.native
  sealed trait `-moz-window-titlebar`
    extends StObject
       with MozAppearance
  inline def `-moz-window-titlebar`: `-moz-window-titlebar` = "-moz-window-titlebar".asInstanceOf[`-moz-window-titlebar`]
  
  @js.native
  sealed trait `-moz-window-titlebar-maximized`
    extends StObject
       with MozAppearance
  inline def `-moz-window-titlebar-maximized`: `-moz-window-titlebar-maximized` = "-moz-window-titlebar-maximized".asInstanceOf[`-moz-window-titlebar-maximized`]
  
  @js.native
  sealed trait `-ms-autohiding-scrollbar`
    extends StObject
       with MsOverflowStyle
  inline def `-ms-autohiding-scrollbar`: `-ms-autohiding-scrollbar` = "-ms-autohiding-scrollbar".asInstanceOf[`-ms-autohiding-scrollbar`]
  
  @js.native
  sealed trait `-ms-flexbox`
    extends StObject
       with DisplayInside
  inline def `-ms-flexbox`: `-ms-flexbox` = "-ms-flexbox".asInstanceOf[`-ms-flexbox`]
  
  @js.native
  sealed trait `-ms-grid`
    extends StObject
       with DisplayInside
  inline def `-ms-grid`: `-ms-grid` = "-ms-grid".asInstanceOf[`-ms-grid`]
  
  @js.native
  sealed trait `-ms-inline-flexbox`
    extends StObject
       with DisplayLegacy
  inline def `-ms-inline-flexbox`: `-ms-inline-flexbox` = "-ms-inline-flexbox".asInstanceOf[`-ms-inline-flexbox`]
  
  @js.native
  sealed trait `-ms-inline-grid`
    extends StObject
       with DisplayLegacy
  inline def `-ms-inline-grid`: `-ms-inline-grid` = "-ms-inline-grid".asInstanceOf[`-ms-inline-grid`]
  
  @js.native
  sealed trait `-ms-manipulation`
    extends StObject
       with _TouchAction
  inline def `-ms-manipulation`: `-ms-manipulation` = "-ms-manipulation".asInstanceOf[`-ms-manipulation`]
  
  @js.native
  sealed trait `-ms-none`
    extends StObject
       with _TouchAction
  inline def `-ms-none`: `-ms-none` = "-ms-none".asInstanceOf[`-ms-none`]
  
  @js.native
  sealed trait `-ms-pinch-zoom`
    extends StObject
       with _TouchAction
  inline def `-ms-pinch-zoom`: `-ms-pinch-zoom` = "-ms-pinch-zoom".asInstanceOf[`-ms-pinch-zoom`]
  
  @js.native
  sealed trait `-webkit-auto`
    extends StObject
       with _FlexBasis[Any]
  inline def `-webkit-auto`: `-webkit-auto` = "-webkit-auto".asInstanceOf[`-webkit-auto`]
  
  @js.native
  sealed trait `-webkit-fill-available`
    extends StObject
       with _BlockSize[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxInlineSize[Any]
       with _MinBlockSize[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
  inline def `-webkit-fill-available`: `-webkit-fill-available` = "-webkit-fill-available".asInstanceOf[`-webkit-fill-available`]
  
  @js.native
  sealed trait `-webkit-fit-content`
    extends StObject
       with _Height[Any]
       with _MaxHeight[Any]
       with _MaxWidth[Any]
       with _MinHeight[Any]
       with _MinWidth[Any]
       with _Width[Any]
  inline def `-webkit-fit-content`: `-webkit-fit-content` = "-webkit-fit-content".asInstanceOf[`-webkit-fit-content`]
  
  @js.native
  sealed trait `-webkit-flex`
    extends StObject
       with DisplayInside
  inline def `-webkit-flex`: `-webkit-flex` = "-webkit-flex".asInstanceOf[`-webkit-flex`]
  
  @js.native
  sealed trait `-webkit-grab`
    extends StObject
       with _Cursor
  inline def `-webkit-grab`: `-webkit-grab` = "-webkit-grab".asInstanceOf[`-webkit-grab`]
  
  @js.native
  sealed trait `-webkit-inline-flex`
    extends StObject
       with DisplayLegacy
  inline def `-webkit-inline-flex`: `-webkit-inline-flex` = "-webkit-inline-flex".asInstanceOf[`-webkit-inline-flex`]
  
  @js.native
  sealed trait `-webkit-isolate`
    extends StObject
       with UnicodeBidi
  inline def `-webkit-isolate`: `-webkit-isolate` = "-webkit-isolate".asInstanceOf[`-webkit-isolate`]
  
  @js.native
  sealed trait `-webkit-isolate-override`
    extends StObject
       with UnicodeBidi
  inline def `-webkit-isolate-override`: `-webkit-isolate-override` = "-webkit-isolate-override".asInstanceOf[`-webkit-isolate-override`]
  
  @js.native
  sealed trait `-webkit-max-content`
    extends StObject
       with _MaxHeight[Any]
       with _MaxWidth[Any]
       with _MinHeight[Any]
       with _MinWidth[Any]
       with _Width[Any]
  inline def `-webkit-max-content`: `-webkit-max-content` = "-webkit-max-content".asInstanceOf[`-webkit-max-content`]
  
  @js.native
  sealed trait `-webkit-min-content`
    extends StObject
       with _MaxHeight[Any]
       with _MaxWidth[Any]
       with _MinHeight[Any]
       with _MinWidth[Any]
  inline def `-webkit-min-content`: `-webkit-min-content` = "-webkit-min-content".asInstanceOf[`-webkit-min-content`]
  
  @js.native
  sealed trait `-webkit-optimize-contrast`
    extends StObject
       with ImageRendering
  inline def `-webkit-optimize-contrast`: `-webkit-optimize-contrast` = "-webkit-optimize-contrast".asInstanceOf[`-webkit-optimize-contrast`]
  
  @js.native
  sealed trait `-webkit-plaintext`
    extends StObject
       with UnicodeBidi
  inline def `-webkit-plaintext`: `-webkit-plaintext` = "-webkit-plaintext".asInstanceOf[`-webkit-plaintext`]
  
  @js.native
  sealed trait `-webkit-sticky`
    extends StObject
       with Position
  inline def `-webkit-sticky`: `-webkit-sticky` = "-webkit-sticky".asInstanceOf[`-webkit-sticky`]
  
  @js.native
  sealed trait `@charset`
    extends StObject
       with AtRules
  inline def `@charset`: `@charset` = "@charset".asInstanceOf[`@charset`]
  
  @js.native
  sealed trait `@counter-style`
    extends StObject
       with AtRules
  inline def `@counter-style`: `@counter-style` = "@counter-style".asInstanceOf[`@counter-style`]
  
  @js.native
  sealed trait `@document`
    extends StObject
       with AtRules
  inline def `@document`: `@document` = "@document".asInstanceOf[`@document`]
  
  @js.native
  sealed trait `@font-face`
    extends StObject
       with AtRules
  inline def `@font-face`: `@font-face` = "@font-face".asInstanceOf[`@font-face`]
  
  @js.native
  sealed trait `@font-feature-values`
    extends StObject
       with AtRules
  inline def `@font-feature-values`: `@font-feature-values` = "@font-feature-values".asInstanceOf[`@font-feature-values`]
  
  @js.native
  sealed trait `@import`
    extends StObject
       with AtRules
  inline def `@import`: `@import` = "@import".asInstanceOf[`@import`]
  
  @js.native
  sealed trait `@keyframes`
    extends StObject
       with AtRules
  inline def `@keyframes`: `@keyframes` = "@keyframes".asInstanceOf[`@keyframes`]
  
  @js.native
  sealed trait `@layer`
    extends StObject
       with AtRules
  inline def `@layer`: `@layer` = "@layer".asInstanceOf[`@layer`]
  
  @js.native
  sealed trait `@media`
    extends StObject
       with AtRules
  inline def `@media`: `@media` = "@media".asInstanceOf[`@media`]
  
  @js.native
  sealed trait `@namespace`
    extends StObject
       with AtRules
  inline def `@namespace`: `@namespace` = "@namespace".asInstanceOf[`@namespace`]
  
  @js.native
  sealed trait `@page`
    extends StObject
       with AtRules
  inline def `@page`: `@page` = "@page".asInstanceOf[`@page`]
  
  @js.native
  sealed trait `@property`
    extends StObject
       with AtRules
  inline def `@property`: `@property` = "@property".asInstanceOf[`@property`]
  
  @js.native
  sealed trait `@scroll-timeline`
    extends StObject
       with AtRules
  inline def `@scroll-timeline`: `@scroll-timeline` = "@scroll-timeline".asInstanceOf[`@scroll-timeline`]
  
  @js.native
  sealed trait `@supports`
    extends StObject
       with AtRules
  inline def `@supports`: `@supports` = "@supports".asInstanceOf[`@supports`]
  
  @js.native
  sealed trait `@viewport`
    extends StObject
       with AtRules
  inline def `@viewport`: `@viewport` = "@viewport".asInstanceOf[`@viewport`]
  
  @js.native
  sealed trait A3
    extends StObject
       with PageSize
  inline def A3: A3 = "A3".asInstanceOf[A3]
  
  @js.native
  sealed trait A4
    extends StObject
       with PageSize
  inline def A4: A4 = "A4".asInstanceOf[A4]
  
  @js.native
  sealed trait A5
    extends StObject
       with PageSize
  inline def A5: A5 = "A5".asInstanceOf[A5]
  
  @js.native
  sealed trait ActiveBorder
    extends StObject
       with DeprecatedSystemColor
  inline def ActiveBorder: ActiveBorder = "ActiveBorder".asInstanceOf[ActiveBorder]
  
  @js.native
  sealed trait ActiveCaption
    extends StObject
       with DeprecatedSystemColor
  inline def ActiveCaption: ActiveCaption = "ActiveCaption".asInstanceOf[ActiveCaption]
  
  @js.native
  sealed trait AppWorkspace
    extends StObject
       with DeprecatedSystemColor
  inline def AppWorkspace: AppWorkspace = "AppWorkspace".asInstanceOf[AppWorkspace]
  
  @js.native
  sealed trait B4
    extends StObject
       with PageSize
  inline def B4: B4 = "B4".asInstanceOf[B4]
  
  @js.native
  sealed trait B5
    extends StObject
       with PageSize
  inline def B5: B5 = "B5".asInstanceOf[B5]
  
  @js.native
  sealed trait Background
    extends StObject
       with DeprecatedSystemColor
  inline def Background: Background = "Background".asInstanceOf[Background]
  
  @js.native
  sealed trait ButtonFace
    extends StObject
       with DeprecatedSystemColor
  inline def ButtonFace: ButtonFace = "ButtonFace".asInstanceOf[ButtonFace]
  
  @js.native
  sealed trait ButtonHighlight
    extends StObject
       with DeprecatedSystemColor
  inline def ButtonHighlight: ButtonHighlight = "ButtonHighlight".asInstanceOf[ButtonHighlight]
  
  @js.native
  sealed trait ButtonShadow
    extends StObject
       with DeprecatedSystemColor
  inline def ButtonShadow: ButtonShadow = "ButtonShadow".asInstanceOf[ButtonShadow]
  
  @js.native
  sealed trait ButtonText
    extends StObject
       with DeprecatedSystemColor
  inline def ButtonText: ButtonText = "ButtonText".asInstanceOf[ButtonText]
  
  @js.native
  sealed trait CaptionText
    extends StObject
       with DeprecatedSystemColor
  inline def CaptionText: CaptionText = "CaptionText".asInstanceOf[CaptionText]
  
  @js.native
  sealed trait `Colon-khtml-any-link`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-khtml-any-link`: `Colon-khtml-any-link` = ":-khtml-any-link".asInstanceOf[`Colon-khtml-any-link`]
  
  @js.native
  sealed trait `Colon-moz-any-link`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-moz-any-link`: `Colon-moz-any-link` = ":-moz-any-link".asInstanceOf[`Colon-moz-any-link`]
  
  @js.native
  sealed trait `Colon-moz-dir`
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def `Colon-moz-dir`: `Colon-moz-dir` = ":-moz-dir".asInstanceOf[`Colon-moz-dir`]
  
  @js.native
  sealed trait `Colon-moz-focusring`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-moz-focusring`: `Colon-moz-focusring` = ":-moz-focusring".asInstanceOf[`Colon-moz-focusring`]
  
  @js.native
  sealed trait `Colon-moz-full-screen`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-moz-full-screen`: `Colon-moz-full-screen` = ":-moz-full-screen".asInstanceOf[`Colon-moz-full-screen`]
  
  @js.native
  sealed trait `Colon-moz-placeholder`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-moz-placeholder`: `Colon-moz-placeholder` = ":-moz-placeholder".asInstanceOf[`Colon-moz-placeholder`]
  
  @js.native
  sealed trait `Colon-moz-read-only`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-moz-read-only`: `Colon-moz-read-only` = ":-moz-read-only".asInstanceOf[`Colon-moz-read-only`]
  
  @js.native
  sealed trait `Colon-moz-read-write`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-moz-read-write`: `Colon-moz-read-write` = ":-moz-read-write".asInstanceOf[`Colon-moz-read-write`]
  
  @js.native
  sealed trait `Colon-moz-ui-invalid`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-moz-ui-invalid`: `Colon-moz-ui-invalid` = ":-moz-ui-invalid".asInstanceOf[`Colon-moz-ui-invalid`]
  
  @js.native
  sealed trait `Colon-moz-ui-valid`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-moz-ui-valid`: `Colon-moz-ui-valid` = ":-moz-ui-valid".asInstanceOf[`Colon-moz-ui-valid`]
  
  @js.native
  sealed trait `Colon-ms-fullscreen`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-ms-fullscreen`: `Colon-ms-fullscreen` = ":-ms-fullscreen".asInstanceOf[`Colon-ms-fullscreen`]
  
  @js.native
  sealed trait `Colon-ms-input-placeholder`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-ms-input-placeholder`: `Colon-ms-input-placeholder` = ":-ms-input-placeholder".asInstanceOf[`Colon-ms-input-placeholder`]
  
  @js.native
  sealed trait `Colon-webkit-any-link`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-webkit-any-link`: `Colon-webkit-any-link` = ":-webkit-any-link".asInstanceOf[`Colon-webkit-any-link`]
  
  @js.native
  sealed trait `Colon-webkit-full-screen`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colon-webkit-full-screen`: `Colon-webkit-full-screen` = ":-webkit-full-screen".asInstanceOf[`Colon-webkit-full-screen`]
  
  @js.native
  sealed trait `ColonColon-moz-placeholder`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-moz-placeholder`: `ColonColon-moz-placeholder` = "::-moz-placeholder".asInstanceOf[`ColonColon-moz-placeholder`]
  
  @js.native
  sealed trait `ColonColon-moz-progress-bar`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-moz-progress-bar`: `ColonColon-moz-progress-bar` = "::-moz-progress-bar".asInstanceOf[`ColonColon-moz-progress-bar`]
  
  @js.native
  sealed trait `ColonColon-moz-range-progress`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-moz-range-progress`: `ColonColon-moz-range-progress` = "::-moz-range-progress".asInstanceOf[`ColonColon-moz-range-progress`]
  
  @js.native
  sealed trait `ColonColon-moz-range-thumb`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-moz-range-thumb`: `ColonColon-moz-range-thumb` = "::-moz-range-thumb".asInstanceOf[`ColonColon-moz-range-thumb`]
  
  @js.native
  sealed trait `ColonColon-moz-range-track`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-moz-range-track`: `ColonColon-moz-range-track` = "::-moz-range-track".asInstanceOf[`ColonColon-moz-range-track`]
  
  @js.native
  sealed trait `ColonColon-moz-selection`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-moz-selection`: `ColonColon-moz-selection` = "::-moz-selection".asInstanceOf[`ColonColon-moz-selection`]
  
  @js.native
  sealed trait `ColonColon-ms-backdrop`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-backdrop`: `ColonColon-ms-backdrop` = "::-ms-backdrop".asInstanceOf[`ColonColon-ms-backdrop`]
  
  @js.native
  sealed trait `ColonColon-ms-browse`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-browse`: `ColonColon-ms-browse` = "::-ms-browse".asInstanceOf[`ColonColon-ms-browse`]
  
  @js.native
  sealed trait `ColonColon-ms-check`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-check`: `ColonColon-ms-check` = "::-ms-check".asInstanceOf[`ColonColon-ms-check`]
  
  @js.native
  sealed trait `ColonColon-ms-clear`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-clear`: `ColonColon-ms-clear` = "::-ms-clear".asInstanceOf[`ColonColon-ms-clear`]
  
  @js.native
  sealed trait `ColonColon-ms-expand`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-expand`: `ColonColon-ms-expand` = "::-ms-expand".asInstanceOf[`ColonColon-ms-expand`]
  
  @js.native
  sealed trait `ColonColon-ms-fill`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-fill`: `ColonColon-ms-fill` = "::-ms-fill".asInstanceOf[`ColonColon-ms-fill`]
  
  @js.native
  sealed trait `ColonColon-ms-fill-lower`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-fill-lower`: `ColonColon-ms-fill-lower` = "::-ms-fill-lower".asInstanceOf[`ColonColon-ms-fill-lower`]
  
  @js.native
  sealed trait `ColonColon-ms-fill-upper`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-fill-upper`: `ColonColon-ms-fill-upper` = "::-ms-fill-upper".asInstanceOf[`ColonColon-ms-fill-upper`]
  
  @js.native
  sealed trait `ColonColon-ms-input-placeholder`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-input-placeholder`: `ColonColon-ms-input-placeholder` = "::-ms-input-placeholder".asInstanceOf[`ColonColon-ms-input-placeholder`]
  
  @js.native
  sealed trait `ColonColon-ms-reveal`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-reveal`: `ColonColon-ms-reveal` = "::-ms-reveal".asInstanceOf[`ColonColon-ms-reveal`]
  
  @js.native
  sealed trait `ColonColon-ms-thumb`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-thumb`: `ColonColon-ms-thumb` = "::-ms-thumb".asInstanceOf[`ColonColon-ms-thumb`]
  
  @js.native
  sealed trait `ColonColon-ms-ticks-after`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-ticks-after`: `ColonColon-ms-ticks-after` = "::-ms-ticks-after".asInstanceOf[`ColonColon-ms-ticks-after`]
  
  @js.native
  sealed trait `ColonColon-ms-ticks-before`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-ticks-before`: `ColonColon-ms-ticks-before` = "::-ms-ticks-before".asInstanceOf[`ColonColon-ms-ticks-before`]
  
  @js.native
  sealed trait `ColonColon-ms-tooltip`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-tooltip`: `ColonColon-ms-tooltip` = "::-ms-tooltip".asInstanceOf[`ColonColon-ms-tooltip`]
  
  @js.native
  sealed trait `ColonColon-ms-track`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-track`: `ColonColon-ms-track` = "::-ms-track".asInstanceOf[`ColonColon-ms-track`]
  
  @js.native
  sealed trait `ColonColon-ms-value`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-ms-value`: `ColonColon-ms-value` = "::-ms-value".asInstanceOf[`ColonColon-ms-value`]
  
  @js.native
  sealed trait `ColonColon-webkit-backdrop`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-webkit-backdrop`: `ColonColon-webkit-backdrop` = "::-webkit-backdrop".asInstanceOf[`ColonColon-webkit-backdrop`]
  
  @js.native
  sealed trait `ColonColon-webkit-input-placeholder`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-webkit-input-placeholder`: `ColonColon-webkit-input-placeholder` = "::-webkit-input-placeholder".asInstanceOf[`ColonColon-webkit-input-placeholder`]
  
  @js.native
  sealed trait `ColonColon-webkit-progress-bar`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-webkit-progress-bar`: `ColonColon-webkit-progress-bar` = "::-webkit-progress-bar".asInstanceOf[`ColonColon-webkit-progress-bar`]
  
  @js.native
  sealed trait `ColonColon-webkit-progress-inner-value`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-webkit-progress-inner-value`: `ColonColon-webkit-progress-inner-value` = "::-webkit-progress-inner-value".asInstanceOf[`ColonColon-webkit-progress-inner-value`]
  
  @js.native
  sealed trait `ColonColon-webkit-progress-value`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-webkit-progress-value`: `ColonColon-webkit-progress-value` = "::-webkit-progress-value".asInstanceOf[`ColonColon-webkit-progress-value`]
  
  @js.native
  sealed trait `ColonColon-webkit-slider-runnable-track`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-webkit-slider-runnable-track`: `ColonColon-webkit-slider-runnable-track` = "::-webkit-slider-runnable-track".asInstanceOf[`ColonColon-webkit-slider-runnable-track`]
  
  @js.native
  sealed trait `ColonColon-webkit-slider-thumb`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColon-webkit-slider-thumb`: `ColonColon-webkit-slider-thumb` = "::-webkit-slider-thumb".asInstanceOf[`ColonColon-webkit-slider-thumb`]
  
  @js.native
  sealed trait ColonColonafter
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def ColonColonafter: ColonColonafter = "::after".asInstanceOf[ColonColonafter]
  
  @js.native
  sealed trait ColonColonbackdrop
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def ColonColonbackdrop: ColonColonbackdrop = "::backdrop".asInstanceOf[ColonColonbackdrop]
  
  @js.native
  sealed trait ColonColonbefore
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def ColonColonbefore: ColonColonbefore = "::before".asInstanceOf[ColonColonbefore]
  
  @js.native
  sealed trait ColonColoncue
    extends StObject
       with SimplePseudos
       with _AdvancedPseudos
       with _Pseudos
  inline def ColonColoncue: ColonColoncue = "::cue".asInstanceOf[ColonColoncue]
  
  @js.native
  sealed trait `ColonColoncue-region`
    extends StObject
       with SimplePseudos
       with _AdvancedPseudos
       with _Pseudos
  inline def `ColonColoncue-region`: `ColonColoncue-region` = "::cue-region".asInstanceOf[`ColonColoncue-region`]
  
  @js.native
  sealed trait `ColonColonfirst-letter`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColonfirst-letter`: `ColonColonfirst-letter` = "::first-letter".asInstanceOf[`ColonColonfirst-letter`]
  
  @js.native
  sealed trait `ColonColonfirst-line`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColonfirst-line`: `ColonColonfirst-line` = "::first-line".asInstanceOf[`ColonColonfirst-line`]
  
  @js.native
  sealed trait `ColonColongrammar-error`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColongrammar-error`: `ColonColongrammar-error` = "::grammar-error".asInstanceOf[`ColonColongrammar-error`]
  
  @js.native
  sealed trait ColonColonmarker
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def ColonColonmarker: ColonColonmarker = "::marker".asInstanceOf[ColonColonmarker]
  
  @js.native
  sealed trait ColonColonpart
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def ColonColonpart: ColonColonpart = "::part".asInstanceOf[ColonColonpart]
  
  @js.native
  sealed trait ColonColonplaceholder
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def ColonColonplaceholder: ColonColonplaceholder = "::placeholder".asInstanceOf[ColonColonplaceholder]
  
  @js.native
  sealed trait ColonColonselection
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def ColonColonselection: ColonColonselection = "::selection".asInstanceOf[ColonColonselection]
  
  @js.native
  sealed trait ColonColonslotted
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def ColonColonslotted: ColonColonslotted = "::slotted".asInstanceOf[ColonColonslotted]
  
  @js.native
  sealed trait `ColonColonspelling-error`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColonspelling-error`: `ColonColonspelling-error` = "::spelling-error".asInstanceOf[`ColonColonspelling-error`]
  
  @js.native
  sealed trait `ColonColontarget-text`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `ColonColontarget-text`: `ColonColontarget-text` = "::target-text".asInstanceOf[`ColonColontarget-text`]
  
  @js.native
  sealed trait Colonactive
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonactive: Colonactive = ":active".asInstanceOf[Colonactive]
  
  @js.native
  sealed trait Colonafter
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonafter: Colonafter = ":after".asInstanceOf[Colonafter]
  
  @js.native
  sealed trait `Colonany-link`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonany-link`: `Colonany-link` = ":any-link".asInstanceOf[`Colonany-link`]
  
  @js.native
  sealed trait Colonbefore
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonbefore: Colonbefore = ":before".asInstanceOf[Colonbefore]
  
  @js.native
  sealed trait Colonblank
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonblank: Colonblank = ":blank".asInstanceOf[Colonblank]
  
  @js.native
  sealed trait Colonchecked
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonchecked: Colonchecked = ":checked".asInstanceOf[Colonchecked]
  
  @js.native
  sealed trait Coloncurrent
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Coloncurrent: Coloncurrent = ":current".asInstanceOf[Coloncurrent]
  
  @js.native
  sealed trait Colondefault
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colondefault: Colondefault = ":default".asInstanceOf[Colondefault]
  
  @js.native
  sealed trait Colondefined
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colondefined: Colondefined = ":defined".asInstanceOf[Colondefined]
  
  @js.native
  sealed trait Colondir
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def Colondir: Colondir = ":dir".asInstanceOf[Colondir]
  
  @js.native
  sealed trait Colondisabled
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colondisabled: Colondisabled = ":disabled".asInstanceOf[Colondisabled]
  
  @js.native
  sealed trait Colonempty
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonempty: Colonempty = ":empty".asInstanceOf[Colonempty]
  
  @js.native
  sealed trait Colonenabled
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonenabled: Colonenabled = ":enabled".asInstanceOf[Colonenabled]
  
  @js.native
  sealed trait Colonfirst
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonfirst: Colonfirst = ":first".asInstanceOf[Colonfirst]
  
  @js.native
  sealed trait `Colonfirst-child`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonfirst-child`: `Colonfirst-child` = ":first-child".asInstanceOf[`Colonfirst-child`]
  
  @js.native
  sealed trait `Colonfirst-letter`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonfirst-letter`: `Colonfirst-letter` = ":first-letter".asInstanceOf[`Colonfirst-letter`]
  
  @js.native
  sealed trait `Colonfirst-line`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonfirst-line`: `Colonfirst-line` = ":first-line".asInstanceOf[`Colonfirst-line`]
  
  @js.native
  sealed trait `Colonfirst-of-type`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonfirst-of-type`: `Colonfirst-of-type` = ":first-of-type".asInstanceOf[`Colonfirst-of-type`]
  
  @js.native
  sealed trait Colonfocus
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonfocus: Colonfocus = ":focus".asInstanceOf[Colonfocus]
  
  @js.native
  sealed trait `Colonfocus-visible`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonfocus-visible`: `Colonfocus-visible` = ":focus-visible".asInstanceOf[`Colonfocus-visible`]
  
  @js.native
  sealed trait `Colonfocus-within`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonfocus-within`: `Colonfocus-within` = ":focus-within".asInstanceOf[`Colonfocus-within`]
  
  @js.native
  sealed trait Colonfullscreen
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonfullscreen: Colonfullscreen = ":fullscreen".asInstanceOf[Colonfullscreen]
  
  @js.native
  sealed trait Colonfuture
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonfuture: Colonfuture = ":future".asInstanceOf[Colonfuture]
  
  @js.native
  sealed trait Colonhas
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def Colonhas: Colonhas = ":has".asInstanceOf[Colonhas]
  
  @js.native
  sealed trait Colonhost
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def Colonhost: Colonhost = ":host".asInstanceOf[Colonhost]
  
  @js.native
  sealed trait `Colonhost-context`
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def `Colonhost-context`: `Colonhost-context` = ":host-context".asInstanceOf[`Colonhost-context`]
  
  @js.native
  sealed trait Colonhover
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonhover: Colonhover = ":hover".asInstanceOf[Colonhover]
  
  @js.native
  sealed trait `Colonin-range`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonin-range`: `Colonin-range` = ":in-range".asInstanceOf[`Colonin-range`]
  
  @js.native
  sealed trait Colonindeterminate
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonindeterminate: Colonindeterminate = ":indeterminate".asInstanceOf[Colonindeterminate]
  
  @js.native
  sealed trait Coloninvalid
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Coloninvalid: Coloninvalid = ":invalid".asInstanceOf[Coloninvalid]
  
  @js.native
  sealed trait Colonis
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def Colonis: Colonis = ":is".asInstanceOf[Colonis]
  
  @js.native
  sealed trait Colonlang
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def Colonlang: Colonlang = ":lang".asInstanceOf[Colonlang]
  
  @js.native
  sealed trait `Colonlast-child`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonlast-child`: `Colonlast-child` = ":last-child".asInstanceOf[`Colonlast-child`]
  
  @js.native
  sealed trait `Colonlast-of-type`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonlast-of-type`: `Colonlast-of-type` = ":last-of-type".asInstanceOf[`Colonlast-of-type`]
  
  @js.native
  sealed trait Colonleft
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonleft: Colonleft = ":left".asInstanceOf[Colonleft]
  
  @js.native
  sealed trait Colonlink
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonlink: Colonlink = ":link".asInstanceOf[Colonlink]
  
  @js.native
  sealed trait `Colonlocal-link`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonlocal-link`: `Colonlocal-link` = ":local-link".asInstanceOf[`Colonlocal-link`]
  
  @js.native
  sealed trait Colonnot
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def Colonnot: Colonnot = ":not".asInstanceOf[Colonnot]
  
  @js.native
  sealed trait `Colonnth-child`
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def `Colonnth-child`: `Colonnth-child` = ":nth-child".asInstanceOf[`Colonnth-child`]
  
  @js.native
  sealed trait `Colonnth-col`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonnth-col`: `Colonnth-col` = ":nth-col".asInstanceOf[`Colonnth-col`]
  
  @js.native
  sealed trait `Colonnth-last-child`
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def `Colonnth-last-child`: `Colonnth-last-child` = ":nth-last-child".asInstanceOf[`Colonnth-last-child`]
  
  @js.native
  sealed trait `Colonnth-last-col`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonnth-last-col`: `Colonnth-last-col` = ":nth-last-col".asInstanceOf[`Colonnth-last-col`]
  
  @js.native
  sealed trait `Colonnth-last-of-type`
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def `Colonnth-last-of-type`: `Colonnth-last-of-type` = ":nth-last-of-type".asInstanceOf[`Colonnth-last-of-type`]
  
  @js.native
  sealed trait `Colonnth-of-type`
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def `Colonnth-of-type`: `Colonnth-of-type` = ":nth-of-type".asInstanceOf[`Colonnth-of-type`]
  
  @js.native
  sealed trait `Colononly-child`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colononly-child`: `Colononly-child` = ":only-child".asInstanceOf[`Colononly-child`]
  
  @js.native
  sealed trait `Colononly-of-type`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colononly-of-type`: `Colononly-of-type` = ":only-of-type".asInstanceOf[`Colononly-of-type`]
  
  @js.native
  sealed trait Colonoptional
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonoptional: Colonoptional = ":optional".asInstanceOf[Colonoptional]
  
  @js.native
  sealed trait `Colonout-of-range`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonout-of-range`: `Colonout-of-range` = ":out-of-range".asInstanceOf[`Colonout-of-range`]
  
  @js.native
  sealed trait Colonpast
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonpast: Colonpast = ":past".asInstanceOf[Colonpast]
  
  @js.native
  sealed trait Colonpaused
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonpaused: Colonpaused = ":paused".asInstanceOf[Colonpaused]
  
  @js.native
  sealed trait `Colonpicture-in-picture`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonpicture-in-picture`: `Colonpicture-in-picture` = ":picture-in-picture".asInstanceOf[`Colonpicture-in-picture`]
  
  @js.native
  sealed trait `Colonplaceholder-shown`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonplaceholder-shown`: `Colonplaceholder-shown` = ":placeholder-shown".asInstanceOf[`Colonplaceholder-shown`]
  
  @js.native
  sealed trait Colonplaying
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonplaying: Colonplaying = ":playing".asInstanceOf[Colonplaying]
  
  @js.native
  sealed trait `Colonread-only`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonread-only`: `Colonread-only` = ":read-only".asInstanceOf[`Colonread-only`]
  
  @js.native
  sealed trait `Colonread-write`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonread-write`: `Colonread-write` = ":read-write".asInstanceOf[`Colonread-write`]
  
  @js.native
  sealed trait Colonrequired
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonrequired: Colonrequired = ":required".asInstanceOf[Colonrequired]
  
  @js.native
  sealed trait Colonright
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonright: Colonright = ":right".asInstanceOf[Colonright]
  
  @js.native
  sealed trait Colonroot
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonroot: Colonroot = ":root".asInstanceOf[Colonroot]
  
  @js.native
  sealed trait Colonscope
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonscope: Colonscope = ":scope".asInstanceOf[Colonscope]
  
  @js.native
  sealed trait Colontarget
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colontarget: Colontarget = ":target".asInstanceOf[Colontarget]
  
  @js.native
  sealed trait `Colontarget-within`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colontarget-within`: `Colontarget-within` = ":target-within".asInstanceOf[`Colontarget-within`]
  
  @js.native
  sealed trait `Colonuser-invalid`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonuser-invalid`: `Colonuser-invalid` = ":user-invalid".asInstanceOf[`Colonuser-invalid`]
  
  @js.native
  sealed trait `Colonuser-valid`
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def `Colonuser-valid`: `Colonuser-valid` = ":user-valid".asInstanceOf[`Colonuser-valid`]
  
  @js.native
  sealed trait Colonvalid
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonvalid: Colonvalid = ":valid".asInstanceOf[Colonvalid]
  
  @js.native
  sealed trait Colonvisited
    extends StObject
       with SimplePseudos
       with _Pseudos
  inline def Colonvisited: Colonvisited = ":visited".asInstanceOf[Colonvisited]
  
  @js.native
  sealed trait Colonwhere
    extends StObject
       with _AdvancedPseudos
       with _Pseudos
  inline def Colonwhere: Colonwhere = ":where".asInstanceOf[Colonwhere]
  
  @js.native
  sealed trait GrayText
    extends StObject
       with DeprecatedSystemColor
  inline def GrayText: GrayText = "GrayText".asInstanceOf[GrayText]
  
  @js.native
  sealed trait Highlight
    extends StObject
       with DeprecatedSystemColor
  inline def Highlight: Highlight = "Highlight".asInstanceOf[Highlight]
  
  @js.native
  sealed trait HighlightText
    extends StObject
       with DeprecatedSystemColor
  inline def HighlightText: HighlightText = "HighlightText".asInstanceOf[HighlightText]
  
  @js.native
  sealed trait InactiveBorder
    extends StObject
       with DeprecatedSystemColor
  inline def InactiveBorder: InactiveBorder = "InactiveBorder".asInstanceOf[InactiveBorder]
  
  @js.native
  sealed trait InactiveCaption
    extends StObject
       with DeprecatedSystemColor
  inline def InactiveCaption: InactiveCaption = "InactiveCaption".asInstanceOf[InactiveCaption]
  
  @js.native
  sealed trait InactiveCaptionText
    extends StObject
       with DeprecatedSystemColor
  inline def InactiveCaptionText: InactiveCaptionText = "InactiveCaptionText".asInstanceOf[InactiveCaptionText]
  
  @js.native
  sealed trait InfoBackground
    extends StObject
       with DeprecatedSystemColor
  inline def InfoBackground: InfoBackground = "InfoBackground".asInstanceOf[InfoBackground]
  
  @js.native
  sealed trait InfoText
    extends StObject
       with DeprecatedSystemColor
  inline def InfoText: InfoText = "InfoText".asInstanceOf[InfoText]
  
  @js.native
  sealed trait `JIS-B4`
    extends StObject
       with PageSize
  inline def `JIS-B4`: `JIS-B4` = "JIS-B4".asInstanceOf[`JIS-B4`]
  
  @js.native
  sealed trait `JIS-B5`
    extends StObject
       with PageSize
  inline def `JIS-B5`: `JIS-B5` = "JIS-B5".asInstanceOf[`JIS-B5`]
  
  @js.native
  sealed trait Menu
    extends StObject
       with DeprecatedSystemColor
  inline def Menu: Menu = "Menu".asInstanceOf[Menu]
  
  @js.native
  sealed trait MenuText
    extends StObject
       with DeprecatedSystemColor
  inline def MenuText: MenuText = "MenuText".asInstanceOf[MenuText]
  
  @js.native
  sealed trait Scrollbar
    extends StObject
       with DeprecatedSystemColor
  inline def Scrollbar: Scrollbar = "Scrollbar".asInstanceOf[Scrollbar]
  
  @js.native
  sealed trait ThreeDDarkShadow
    extends StObject
       with DeprecatedSystemColor
  inline def ThreeDDarkShadow: ThreeDDarkShadow = "ThreeDDarkShadow".asInstanceOf[ThreeDDarkShadow]
  
  @js.native
  sealed trait ThreeDFace
    extends StObject
       with DeprecatedSystemColor
  inline def ThreeDFace: ThreeDFace = "ThreeDFace".asInstanceOf[ThreeDFace]
  
  @js.native
  sealed trait ThreeDHighlight
    extends StObject
       with DeprecatedSystemColor
  inline def ThreeDHighlight: ThreeDHighlight = "ThreeDHighlight".asInstanceOf[ThreeDHighlight]
  
  @js.native
  sealed trait ThreeDLightShadow
    extends StObject
       with DeprecatedSystemColor
  inline def ThreeDLightShadow: ThreeDLightShadow = "ThreeDLightShadow".asInstanceOf[ThreeDLightShadow]
  
  @js.native
  sealed trait ThreeDShadow
    extends StObject
       with DeprecatedSystemColor
  inline def ThreeDShadow: ThreeDShadow = "ThreeDShadow".asInstanceOf[ThreeDShadow]
  
  @js.native
  sealed trait Window
    extends StObject
       with DeprecatedSystemColor
  inline def Window: Window = "Window".asInstanceOf[Window]
  
  @js.native
  sealed trait WindowFrame
    extends StObject
       with DeprecatedSystemColor
  inline def WindowFrame: WindowFrame = "WindowFrame".asInstanceOf[WindowFrame]
  
  @js.native
  sealed trait WindowText
    extends StObject
       with DeprecatedSystemColor
  inline def WindowText: WindowText = "WindowText".asInstanceOf[WindowText]
  
  @js.native
  sealed trait `[abbr]`
    extends StObject
       with HtmlAttributes
  inline def `[abbr]`: `[abbr]` = "[abbr]".asInstanceOf[`[abbr]`]
  
  @js.native
  sealed trait `[accent-height]`
    extends StObject
       with SvgAttributes
  inline def `[accent-height]`: `[accent-height]` = "[accent-height]".asInstanceOf[`[accent-height]`]
  
  @js.native
  sealed trait `[accept-charset]`
    extends StObject
       with HtmlAttributes
  inline def `[accept-charset]`: `[accept-charset]` = "[accept-charset]".asInstanceOf[`[accept-charset]`]
  
  @js.native
  sealed trait `[accept]`
    extends StObject
       with HtmlAttributes
  inline def `[accept]`: `[accept]` = "[accept]".asInstanceOf[`[accept]`]
  
  @js.native
  sealed trait `[accesskey]`
    extends StObject
       with HtmlAttributes
  inline def `[accesskey]`: `[accesskey]` = "[accesskey]".asInstanceOf[`[accesskey]`]
  
  @js.native
  sealed trait `[action]`
    extends StObject
       with HtmlAttributes
  inline def `[action]`: `[action]` = "[action]".asInstanceOf[`[action]`]
  
  @js.native
  sealed trait `[align]`
    extends StObject
       with HtmlAttributes
  inline def `[align]`: `[align]` = "[align]".asInstanceOf[`[align]`]
  
  @js.native
  sealed trait `[alignment-baseline]`
    extends StObject
       with SvgAttributes
  inline def `[alignment-baseline]`: `[alignment-baseline]` = "[alignment-baseline]".asInstanceOf[`[alignment-baseline]`]
  
  @js.native
  sealed trait `[alink]`
    extends StObject
       with HtmlAttributes
  inline def `[alink]`: `[alink]` = "[alink]".asInstanceOf[`[alink]`]
  
  @js.native
  sealed trait `[allowReorder]`
    extends StObject
       with SvgAttributes
  inline def `[allowReorder]`: `[allowReorder]` = "[allowReorder]".asInstanceOf[`[allowReorder]`]
  
  @js.native
  sealed trait `[allow]`
    extends StObject
       with HtmlAttributes
  inline def `[allow]`: `[allow]` = "[allow]".asInstanceOf[`[allow]`]
  
  @js.native
  sealed trait `[allowfullscreen]`
    extends StObject
       with HtmlAttributes
  inline def `[allowfullscreen]`: `[allowfullscreen]` = "[allowfullscreen]".asInstanceOf[`[allowfullscreen]`]
  
  @js.native
  sealed trait `[allowpaymentrequest]`
    extends StObject
       with HtmlAttributes
  inline def `[allowpaymentrequest]`: `[allowpaymentrequest]` = "[allowpaymentrequest]".asInstanceOf[`[allowpaymentrequest]`]
  
  @js.native
  sealed trait `[alphabetic]`
    extends StObject
       with SvgAttributes
  inline def `[alphabetic]`: `[alphabetic]` = "[alphabetic]".asInstanceOf[`[alphabetic]`]
  
  @js.native
  sealed trait `[alt]`
    extends StObject
       with HtmlAttributes
  inline def `[alt]`: `[alt]` = "[alt]".asInstanceOf[`[alt]`]
  
  @js.native
  sealed trait `[animation]`
    extends StObject
       with SvgAttributes
  inline def `[animation]`: `[animation]` = "[animation]".asInstanceOf[`[animation]`]
  
  @js.native
  sealed trait `[arabic-form]`
    extends StObject
       with SvgAttributes
  inline def `[arabic-form]`: `[arabic-form]` = "[arabic-form]".asInstanceOf[`[arabic-form]`]
  
  @js.native
  sealed trait `[archive]`
    extends StObject
       with HtmlAttributes
  inline def `[archive]`: `[archive]` = "[archive]".asInstanceOf[`[archive]`]
  
  @js.native
  sealed trait `[ascent]`
    extends StObject
       with SvgAttributes
  inline def `[ascent]`: `[ascent]` = "[ascent]".asInstanceOf[`[ascent]`]
  
  @js.native
  sealed trait `[async]`
    extends StObject
       with HtmlAttributes
  inline def `[async]`: `[async]` = "[async]".asInstanceOf[`[async]`]
  
  @js.native
  sealed trait `[attributeName]`
    extends StObject
       with SvgAttributes
  inline def `[attributeName]`: `[attributeName]` = "[attributeName]".asInstanceOf[`[attributeName]`]
  
  @js.native
  sealed trait `[attributeType]`
    extends StObject
       with SvgAttributes
  inline def `[attributeType]`: `[attributeType]` = "[attributeType]".asInstanceOf[`[attributeType]`]
  
  @js.native
  sealed trait `[autobuffer]`
    extends StObject
       with HtmlAttributes
  inline def `[autobuffer]`: `[autobuffer]` = "[autobuffer]".asInstanceOf[`[autobuffer]`]
  
  @js.native
  sealed trait `[autocapitalize]`
    extends StObject
       with HtmlAttributes
  inline def `[autocapitalize]`: `[autocapitalize]` = "[autocapitalize]".asInstanceOf[`[autocapitalize]`]
  
  @js.native
  sealed trait `[autocomplete]`
    extends StObject
       with HtmlAttributes
  inline def `[autocomplete]`: `[autocomplete]` = "[autocomplete]".asInstanceOf[`[autocomplete]`]
  
  @js.native
  sealed trait `[autofocus]`
    extends StObject
       with HtmlAttributes
  inline def `[autofocus]`: `[autofocus]` = "[autofocus]".asInstanceOf[`[autofocus]`]
  
  @js.native
  sealed trait `[autoplay]`
    extends StObject
       with HtmlAttributes
  inline def `[autoplay]`: `[autoplay]` = "[autoplay]".asInstanceOf[`[autoplay]`]
  
  @js.native
  sealed trait `[axis]`
    extends StObject
       with HtmlAttributes
  inline def `[axis]`: `[axis]` = "[axis]".asInstanceOf[`[axis]`]
  
  @js.native
  sealed trait `[azimuth]`
    extends StObject
       with SvgAttributes
  inline def `[azimuth]`: `[azimuth]` = "[azimuth]".asInstanceOf[`[azimuth]`]
  
  @js.native
  sealed trait `[background]`
    extends StObject
       with HtmlAttributes
  inline def `[background]`: `[background]` = "[background]".asInstanceOf[`[background]`]
  
  @js.native
  sealed trait `[baseFrequency]`
    extends StObject
       with SvgAttributes
  inline def `[baseFrequency]`: `[baseFrequency]` = "[baseFrequency]".asInstanceOf[`[baseFrequency]`]
  
  @js.native
  sealed trait `[baseProfile]`
    extends StObject
       with SvgAttributes
  inline def `[baseProfile]`: `[baseProfile]` = "[baseProfile]".asInstanceOf[`[baseProfile]`]
  
  @js.native
  sealed trait `[baseline-shift]`
    extends StObject
       with SvgAttributes
  inline def `[baseline-shift]`: `[baseline-shift]` = "[baseline-shift]".asInstanceOf[`[baseline-shift]`]
  
  @js.native
  sealed trait `[bbox]`
    extends StObject
       with SvgAttributes
  inline def `[bbox]`: `[bbox]` = "[bbox]".asInstanceOf[`[bbox]`]
  
  @js.native
  sealed trait `[behavior]`
    extends StObject
       with HtmlAttributes
  inline def `[behavior]`: `[behavior]` = "[behavior]".asInstanceOf[`[behavior]`]
  
  @js.native
  sealed trait `[bgcolor]`
    extends StObject
       with HtmlAttributes
  inline def `[bgcolor]`: `[bgcolor]` = "[bgcolor]".asInstanceOf[`[bgcolor]`]
  
  @js.native
  sealed trait `[bias]`
    extends StObject
       with SvgAttributes
  inline def `[bias]`: `[bias]` = "[bias]".asInstanceOf[`[bias]`]
  
  @js.native
  sealed trait `[border]`
    extends StObject
       with HtmlAttributes
  inline def `[border]`: `[border]` = "[border]".asInstanceOf[`[border]`]
  
  @js.native
  sealed trait `[bottommargin]`
    extends StObject
       with HtmlAttributes
  inline def `[bottommargin]`: `[bottommargin]` = "[bottommargin]".asInstanceOf[`[bottommargin]`]
  
  @js.native
  sealed trait `[by]`
    extends StObject
       with SvgAttributes
  inline def `[by]`: `[by]` = "[by]".asInstanceOf[`[by]`]
  
  @js.native
  sealed trait `[calcMode]`
    extends StObject
       with SvgAttributes
  inline def `[calcMode]`: `[calcMode]` = "[calcMode]".asInstanceOf[`[calcMode]`]
  
  @js.native
  sealed trait `[cap-height]`
    extends StObject
       with SvgAttributes
  inline def `[cap-height]`: `[cap-height]` = "[cap-height]".asInstanceOf[`[cap-height]`]
  
  @js.native
  sealed trait `[capture]`
    extends StObject
       with HtmlAttributes
  inline def `[capture]`: `[capture]` = "[capture]".asInstanceOf[`[capture]`]
  
  @js.native
  sealed trait `[cellpadding]`
    extends StObject
       with HtmlAttributes
  inline def `[cellpadding]`: `[cellpadding]` = "[cellpadding]".asInstanceOf[`[cellpadding]`]
  
  @js.native
  sealed trait `[cellspacing]`
    extends StObject
       with HtmlAttributes
  inline def `[cellspacing]`: `[cellspacing]` = "[cellspacing]".asInstanceOf[`[cellspacing]`]
  
  @js.native
  sealed trait `[char]`
    extends StObject
       with HtmlAttributes
  inline def `[char]`: `[char]` = "[char]".asInstanceOf[`[char]`]
  
  @js.native
  sealed trait `[charoff]`
    extends StObject
       with HtmlAttributes
  inline def `[charoff]`: `[charoff]` = "[charoff]".asInstanceOf[`[charoff]`]
  
  @js.native
  sealed trait `[charset]`
    extends StObject
       with HtmlAttributes
  inline def `[charset]`: `[charset]` = "[charset]".asInstanceOf[`[charset]`]
  
  @js.native
  sealed trait `[checked]`
    extends StObject
       with HtmlAttributes
  inline def `[checked]`: `[checked]` = "[checked]".asInstanceOf[`[checked]`]
  
  @js.native
  sealed trait `[cite]`
    extends StObject
       with HtmlAttributes
  inline def `[cite]`: `[cite]` = "[cite]".asInstanceOf[`[cite]`]
  
  @js.native
  sealed trait `[class]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[class]`: `[class]` = "[class]".asInstanceOf[`[class]`]
  
  @js.native
  sealed trait `[classid]`
    extends StObject
       with HtmlAttributes
  inline def `[classid]`: `[classid]` = "[classid]".asInstanceOf[`[classid]`]
  
  @js.native
  sealed trait `[clear]`
    extends StObject
       with HtmlAttributes
  inline def `[clear]`: `[clear]` = "[clear]".asInstanceOf[`[clear]`]
  
  @js.native
  sealed trait `[clip-path]`
    extends StObject
       with SvgAttributes
  inline def `[clip-path]`: `[clip-path]` = "[clip-path]".asInstanceOf[`[clip-path]`]
  
  @js.native
  sealed trait `[clip-rule]`
    extends StObject
       with SvgAttributes
  inline def `[clip-rule]`: `[clip-rule]` = "[clip-rule]".asInstanceOf[`[clip-rule]`]
  
  @js.native
  sealed trait `[clipPathUnits]`
    extends StObject
       with SvgAttributes
  inline def `[clipPathUnits]`: `[clipPathUnits]` = "[clipPathUnits]".asInstanceOf[`[clipPathUnits]`]
  
  @js.native
  sealed trait `[clip]`
    extends StObject
       with SvgAttributes
  inline def `[clip]`: `[clip]` = "[clip]".asInstanceOf[`[clip]`]
  
  @js.native
  sealed trait `[code]`
    extends StObject
       with HtmlAttributes
  inline def `[code]`: `[code]` = "[code]".asInstanceOf[`[code]`]
  
  @js.native
  sealed trait `[codebase]`
    extends StObject
       with HtmlAttributes
  inline def `[codebase]`: `[codebase]` = "[codebase]".asInstanceOf[`[codebase]`]
  
  @js.native
  sealed trait `[codetype]`
    extends StObject
       with HtmlAttributes
  inline def `[codetype]`: `[codetype]` = "[codetype]".asInstanceOf[`[codetype]`]
  
  @js.native
  sealed trait `[color-interpolation-filters]`
    extends StObject
       with SvgAttributes
  inline def `[color-interpolation-filters]`: `[color-interpolation-filters]` = "[color-interpolation-filters]".asInstanceOf[`[color-interpolation-filters]`]
  
  @js.native
  sealed trait `[color-interpolation]`
    extends StObject
       with SvgAttributes
  inline def `[color-interpolation]`: `[color-interpolation]` = "[color-interpolation]".asInstanceOf[`[color-interpolation]`]
  
  @js.native
  sealed trait `[color-profile]`
    extends StObject
       with SvgAttributes
  inline def `[color-profile]`: `[color-profile]` = "[color-profile]".asInstanceOf[`[color-profile]`]
  
  @js.native
  sealed trait `[color]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[color]`: `[color]` = "[color]".asInstanceOf[`[color]`]
  
  @js.native
  sealed trait `[cols]`
    extends StObject
       with HtmlAttributes
  inline def `[cols]`: `[cols]` = "[cols]".asInstanceOf[`[cols]`]
  
  @js.native
  sealed trait `[colspan]`
    extends StObject
       with HtmlAttributes
  inline def `[colspan]`: `[colspan]` = "[colspan]".asInstanceOf[`[colspan]`]
  
  @js.native
  sealed trait `[command]`
    extends StObject
       with HtmlAttributes
  inline def `[command]`: `[command]` = "[command]".asInstanceOf[`[command]`]
  
  @js.native
  sealed trait `[compact]`
    extends StObject
       with HtmlAttributes
  inline def `[compact]`: `[compact]` = "[compact]".asInstanceOf[`[compact]`]
  
  @js.native
  sealed trait `[contentScriptType]`
    extends StObject
       with SvgAttributes
  inline def `[contentScriptType]`: `[contentScriptType]` = "[contentScriptType]".asInstanceOf[`[contentScriptType]`]
  
  @js.native
  sealed trait `[contentStyleType]`
    extends StObject
       with SvgAttributes
  inline def `[contentStyleType]`: `[contentStyleType]` = "[contentStyleType]".asInstanceOf[`[contentStyleType]`]
  
  @js.native
  sealed trait `[content]`
    extends StObject
       with HtmlAttributes
  inline def `[content]`: `[content]` = "[content]".asInstanceOf[`[content]`]
  
  @js.native
  sealed trait `[contenteditable]`
    extends StObject
       with HtmlAttributes
  inline def `[contenteditable]`: `[contenteditable]` = "[contenteditable]".asInstanceOf[`[contenteditable]`]
  
  @js.native
  sealed trait `[contextmenu]`
    extends StObject
       with HtmlAttributes
  inline def `[contextmenu]`: `[contextmenu]` = "[contextmenu]".asInstanceOf[`[contextmenu]`]
  
  @js.native
  sealed trait `[controls]`
    extends StObject
       with HtmlAttributes
  inline def `[controls]`: `[controls]` = "[controls]".asInstanceOf[`[controls]`]
  
  @js.native
  sealed trait `[coords]`
    extends StObject
       with HtmlAttributes
  inline def `[coords]`: `[coords]` = "[coords]".asInstanceOf[`[coords]`]
  
  @js.native
  sealed trait `[crossorigin]`
    extends StObject
       with HtmlAttributes
  inline def `[crossorigin]`: `[crossorigin]` = "[crossorigin]".asInstanceOf[`[crossorigin]`]
  
  @js.native
  sealed trait `[cursor]`
    extends StObject
       with SvgAttributes
  inline def `[cursor]`: `[cursor]` = "[cursor]".asInstanceOf[`[cursor]`]
  
  @js.native
  sealed trait `[cx]`
    extends StObject
       with SvgAttributes
  inline def `[cx]`: `[cx]` = "[cx]".asInstanceOf[`[cx]`]
  
  @js.native
  sealed trait `[cy]`
    extends StObject
       with SvgAttributes
  inline def `[cy]`: `[cy]` = "[cy]".asInstanceOf[`[cy]`]
  
  @js.native
  sealed trait `[d]`
    extends StObject
       with SvgAttributes
  inline def `[d]`: `[d]` = "[d]".asInstanceOf[`[d]`]
  
  @js.native
  sealed trait `[data]`
    extends StObject
       with HtmlAttributes
  inline def `[data]`: `[data]` = "[data]".asInstanceOf[`[data]`]
  
  @js.native
  sealed trait `[datafld]`
    extends StObject
       with HtmlAttributes
  inline def `[datafld]`: `[datafld]` = "[datafld]".asInstanceOf[`[datafld]`]
  
  @js.native
  sealed trait `[datasrc]`
    extends StObject
       with HtmlAttributes
  inline def `[datasrc]`: `[datasrc]` = "[datasrc]".asInstanceOf[`[datasrc]`]
  
  @js.native
  sealed trait `[datetime]`
    extends StObject
       with HtmlAttributes
  inline def `[datetime]`: `[datetime]` = "[datetime]".asInstanceOf[`[datetime]`]
  
  @js.native
  sealed trait `[declare]`
    extends StObject
       with HtmlAttributes
  inline def `[declare]`: `[declare]` = "[declare]".asInstanceOf[`[declare]`]
  
  @js.native
  sealed trait `[decoding]`
    extends StObject
       with HtmlAttributes
  inline def `[decoding]`: `[decoding]` = "[decoding]".asInstanceOf[`[decoding]`]
  
  @js.native
  sealed trait `[default]`
    extends StObject
       with HtmlAttributes
  inline def `[default]`: `[default]` = "[default]".asInstanceOf[`[default]`]
  
  @js.native
  sealed trait `[defer]`
    extends StObject
       with HtmlAttributes
  inline def `[defer]`: `[defer]` = "[defer]".asInstanceOf[`[defer]`]
  
  @js.native
  sealed trait `[descent]`
    extends StObject
       with SvgAttributes
  inline def `[descent]`: `[descent]` = "[descent]".asInstanceOf[`[descent]`]
  
  @js.native
  sealed trait `[diffuseConstant]`
    extends StObject
       with SvgAttributes
  inline def `[diffuseConstant]`: `[diffuseConstant]` = "[diffuseConstant]".asInstanceOf[`[diffuseConstant]`]
  
  @js.native
  sealed trait `[dir]`
    extends StObject
       with HtmlAttributes
  inline def `[dir]`: `[dir]` = "[dir]".asInstanceOf[`[dir]`]
  
  @js.native
  sealed trait `[direction]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[direction]`: `[direction]` = "[direction]".asInstanceOf[`[direction]`]
  
  @js.native
  sealed trait `[dirname]`
    extends StObject
       with HtmlAttributes
  inline def `[dirname]`: `[dirname]` = "[dirname]".asInstanceOf[`[dirname]`]
  
  @js.native
  sealed trait `[disabled]`
    extends StObject
       with HtmlAttributes
  inline def `[disabled]`: `[disabled]` = "[disabled]".asInstanceOf[`[disabled]`]
  
  @js.native
  sealed trait `[display]`
    extends StObject
       with SvgAttributes
  inline def `[display]`: `[display]` = "[display]".asInstanceOf[`[display]`]
  
  @js.native
  sealed trait `[divisor]`
    extends StObject
       with SvgAttributes
  inline def `[divisor]`: `[divisor]` = "[divisor]".asInstanceOf[`[divisor]`]
  
  @js.native
  sealed trait `[document]`
    extends StObject
       with SvgAttributes
  inline def `[document]`: `[document]` = "[document]".asInstanceOf[`[document]`]
  
  @js.native
  sealed trait `[dominant-baseline]`
    extends StObject
       with SvgAttributes
  inline def `[dominant-baseline]`: `[dominant-baseline]` = "[dominant-baseline]".asInstanceOf[`[dominant-baseline]`]
  
  @js.native
  sealed trait `[download]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[download]`: `[download]` = "[download]".asInstanceOf[`[download]`]
  
  @js.native
  sealed trait `[draggable]`
    extends StObject
       with HtmlAttributes
  inline def `[draggable]`: `[draggable]` = "[draggable]".asInstanceOf[`[draggable]`]
  
  @js.native
  sealed trait `[dur]`
    extends StObject
       with SvgAttributes
  inline def `[dur]`: `[dur]` = "[dur]".asInstanceOf[`[dur]`]
  
  @js.native
  sealed trait `[dx]`
    extends StObject
       with SvgAttributes
  inline def `[dx]`: `[dx]` = "[dx]".asInstanceOf[`[dx]`]
  
  @js.native
  sealed trait `[dy]`
    extends StObject
       with SvgAttributes
  inline def `[dy]`: `[dy]` = "[dy]".asInstanceOf[`[dy]`]
  
  @js.native
  sealed trait `[edgeMode]`
    extends StObject
       with SvgAttributes
  inline def `[edgeMode]`: `[edgeMode]` = "[edgeMode]".asInstanceOf[`[edgeMode]`]
  
  @js.native
  sealed trait `[elevation]`
    extends StObject
       with SvgAttributes
  inline def `[elevation]`: `[elevation]` = "[elevation]".asInstanceOf[`[elevation]`]
  
  @js.native
  sealed trait `[enable-background]`
    extends StObject
       with SvgAttributes
  inline def `[enable-background]`: `[enable-background]` = "[enable-background]".asInstanceOf[`[enable-background]`]
  
  @js.native
  sealed trait `[enctype]`
    extends StObject
       with HtmlAttributes
  inline def `[enctype]`: `[enctype]` = "[enctype]".asInstanceOf[`[enctype]`]
  
  @js.native
  sealed trait `[enterkeyhint]`
    extends StObject
       with HtmlAttributes
  inline def `[enterkeyhint]`: `[enterkeyhint]` = "[enterkeyhint]".asInstanceOf[`[enterkeyhint]`]
  
  @js.native
  sealed trait `[exportparts]`
    extends StObject
       with HtmlAttributes
  inline def `[exportparts]`: `[exportparts]` = "[exportparts]".asInstanceOf[`[exportparts]`]
  
  @js.native
  sealed trait `[face]`
    extends StObject
       with HtmlAttributes
  inline def `[face]`: `[face]` = "[face]".asInstanceOf[`[face]`]
  
  @js.native
  sealed trait `[fetchpriority]`
    extends StObject
       with HtmlAttributes
  inline def `[fetchpriority]`: `[fetchpriority]` = "[fetchpriority]".asInstanceOf[`[fetchpriority]`]
  
  @js.native
  sealed trait `[fill-opacity]`
    extends StObject
       with SvgAttributes
  inline def `[fill-opacity]`: `[fill-opacity]` = "[fill-opacity]".asInstanceOf[`[fill-opacity]`]
  
  @js.native
  sealed trait `[fill-rule]`
    extends StObject
       with SvgAttributes
  inline def `[fill-rule]`: `[fill-rule]` = "[fill-rule]".asInstanceOf[`[fill-rule]`]
  
  @js.native
  sealed trait `[fill]`
    extends StObject
       with SvgAttributes
  inline def `[fill]`: `[fill]` = "[fill]".asInstanceOf[`[fill]`]
  
  @js.native
  sealed trait `[filterRes]`
    extends StObject
       with SvgAttributes
  inline def `[filterRes]`: `[filterRes]` = "[filterRes]".asInstanceOf[`[filterRes]`]
  
  @js.native
  sealed trait `[filterUnits]`
    extends StObject
       with SvgAttributes
  inline def `[filterUnits]`: `[filterUnits]` = "[filterUnits]".asInstanceOf[`[filterUnits]`]
  
  @js.native
  sealed trait `[filter]`
    extends StObject
       with SvgAttributes
  inline def `[filter]`: `[filter]` = "[filter]".asInstanceOf[`[filter]`]
  
  @js.native
  sealed trait `[flood-color]`
    extends StObject
       with SvgAttributes
  inline def `[flood-color]`: `[flood-color]` = "[flood-color]".asInstanceOf[`[flood-color]`]
  
  @js.native
  sealed trait `[flood-opacity]`
    extends StObject
       with SvgAttributes
  inline def `[flood-opacity]`: `[flood-opacity]` = "[flood-opacity]".asInstanceOf[`[flood-opacity]`]
  
  @js.native
  sealed trait `[font-family]`
    extends StObject
       with SvgAttributes
  inline def `[font-family]`: `[font-family]` = "[font-family]".asInstanceOf[`[font-family]`]
  
  @js.native
  sealed trait `[font-size-adjust]`
    extends StObject
       with SvgAttributes
  inline def `[font-size-adjust]`: `[font-size-adjust]` = "[font-size-adjust]".asInstanceOf[`[font-size-adjust]`]
  
  @js.native
  sealed trait `[font-size]`
    extends StObject
       with SvgAttributes
  inline def `[font-size]`: `[font-size]` = "[font-size]".asInstanceOf[`[font-size]`]
  
  @js.native
  sealed trait `[font-stretch]`
    extends StObject
       with SvgAttributes
  inline def `[font-stretch]`: `[font-stretch]` = "[font-stretch]".asInstanceOf[`[font-stretch]`]
  
  @js.native
  sealed trait `[font-style]`
    extends StObject
       with SvgAttributes
  inline def `[font-style]`: `[font-style]` = "[font-style]".asInstanceOf[`[font-style]`]
  
  @js.native
  sealed trait `[font-variant]`
    extends StObject
       with SvgAttributes
  inline def `[font-variant]`: `[font-variant]` = "[font-variant]".asInstanceOf[`[font-variant]`]
  
  @js.native
  sealed trait `[font-weight]`
    extends StObject
       with SvgAttributes
  inline def `[font-weight]`: `[font-weight]` = "[font-weight]".asInstanceOf[`[font-weight]`]
  
  @js.native
  sealed trait `[for]`
    extends StObject
       with HtmlAttributes
  inline def `[for]`: `[for]` = "[for]".asInstanceOf[`[for]`]
  
  @js.native
  sealed trait `[form]`
    extends StObject
       with HtmlAttributes
  inline def `[form]`: `[form]` = "[form]".asInstanceOf[`[form]`]
  
  @js.native
  sealed trait `[formaction]`
    extends StObject
       with HtmlAttributes
  inline def `[formaction]`: `[formaction]` = "[formaction]".asInstanceOf[`[formaction]`]
  
  @js.native
  sealed trait `[format]`
    extends StObject
       with SvgAttributes
  inline def `[format]`: `[format]` = "[format]".asInstanceOf[`[format]`]
  
  @js.native
  sealed trait `[formenctype]`
    extends StObject
       with HtmlAttributes
  inline def `[formenctype]`: `[formenctype]` = "[formenctype]".asInstanceOf[`[formenctype]`]
  
  @js.native
  sealed trait `[formmethod]`
    extends StObject
       with HtmlAttributes
  inline def `[formmethod]`: `[formmethod]` = "[formmethod]".asInstanceOf[`[formmethod]`]
  
  @js.native
  sealed trait `[formnovalidate]`
    extends StObject
       with HtmlAttributes
  inline def `[formnovalidate]`: `[formnovalidate]` = "[formnovalidate]".asInstanceOf[`[formnovalidate]`]
  
  @js.native
  sealed trait `[formtarget]`
    extends StObject
       with HtmlAttributes
  inline def `[formtarget]`: `[formtarget]` = "[formtarget]".asInstanceOf[`[formtarget]`]
  
  @js.native
  sealed trait `[fr]`
    extends StObject
       with SvgAttributes
  inline def `[fr]`: `[fr]` = "[fr]".asInstanceOf[`[fr]`]
  
  @js.native
  sealed trait `[frame]`
    extends StObject
       with HtmlAttributes
  inline def `[frame]`: `[frame]` = "[frame]".asInstanceOf[`[frame]`]
  
  @js.native
  sealed trait `[frameborder]`
    extends StObject
       with HtmlAttributes
  inline def `[frameborder]`: `[frameborder]` = "[frameborder]".asInstanceOf[`[frameborder]`]
  
  @js.native
  sealed trait `[from]`
    extends StObject
       with SvgAttributes
  inline def `[from]`: `[from]` = "[from]".asInstanceOf[`[from]`]
  
  @js.native
  sealed trait `[fx]`
    extends StObject
       with SvgAttributes
  inline def `[fx]`: `[fx]` = "[fx]".asInstanceOf[`[fx]`]
  
  @js.native
  sealed trait `[fy]`
    extends StObject
       with SvgAttributes
  inline def `[fy]`: `[fy]` = "[fy]".asInstanceOf[`[fy]`]
  
  @js.native
  sealed trait `[g1]`
    extends StObject
       with SvgAttributes
  inline def `[g1]`: `[g1]` = "[g1]".asInstanceOf[`[g1]`]
  
  @js.native
  sealed trait `[g2]`
    extends StObject
       with SvgAttributes
  inline def `[g2]`: `[g2]` = "[g2]".asInstanceOf[`[g2]`]
  
  @js.native
  sealed trait `[global]`
    extends StObject
       with SvgAttributes
  inline def `[global]`: `[global]` = "[global]".asInstanceOf[`[global]`]
  
  @js.native
  sealed trait `[glyph-name]`
    extends StObject
       with SvgAttributes
  inline def `[glyph-name]`: `[glyph-name]` = "[glyph-name]".asInstanceOf[`[glyph-name]`]
  
  @js.native
  sealed trait `[glyph-orientation-horizontal]`
    extends StObject
       with SvgAttributes
  inline def `[glyph-orientation-horizontal]`: `[glyph-orientation-horizontal]` = "[glyph-orientation-horizontal]".asInstanceOf[`[glyph-orientation-horizontal]`]
  
  @js.native
  sealed trait `[glyph-orientation-vertical]`
    extends StObject
       with SvgAttributes
  inline def `[glyph-orientation-vertical]`: `[glyph-orientation-vertical]` = "[glyph-orientation-vertical]".asInstanceOf[`[glyph-orientation-vertical]`]
  
  @js.native
  sealed trait `[glyphRef]`
    extends StObject
       with SvgAttributes
  inline def `[glyphRef]`: `[glyphRef]` = "[glyphRef]".asInstanceOf[`[glyphRef]`]
  
  @js.native
  sealed trait `[gradientTransform]`
    extends StObject
       with SvgAttributes
  inline def `[gradientTransform]`: `[gradientTransform]` = "[gradientTransform]".asInstanceOf[`[gradientTransform]`]
  
  @js.native
  sealed trait `[gradientUnits]`
    extends StObject
       with SvgAttributes
  inline def `[gradientUnits]`: `[gradientUnits]` = "[gradientUnits]".asInstanceOf[`[gradientUnits]`]
  
  @js.native
  sealed trait `[graphical]`
    extends StObject
       with SvgAttributes
  inline def `[graphical]`: `[graphical]` = "[graphical]".asInstanceOf[`[graphical]`]
  
  @js.native
  sealed trait `[hanging]`
    extends StObject
       with SvgAttributes
  inline def `[hanging]`: `[hanging]` = "[hanging]".asInstanceOf[`[hanging]`]
  
  @js.native
  sealed trait `[headers]`
    extends StObject
       with HtmlAttributes
  inline def `[headers]`: `[headers]` = "[headers]".asInstanceOf[`[headers]`]
  
  @js.native
  sealed trait `[height]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[height]`: `[height]` = "[height]".asInstanceOf[`[height]`]
  
  @js.native
  sealed trait `[hidden]`
    extends StObject
       with HtmlAttributes
  inline def `[hidden]`: `[hidden]` = "[hidden]".asInstanceOf[`[hidden]`]
  
  @js.native
  sealed trait `[high]`
    extends StObject
       with HtmlAttributes
  inline def `[high]`: `[high]` = "[high]".asInstanceOf[`[high]`]
  
  @js.native
  sealed trait `[horiz-adv-x]`
    extends StObject
       with SvgAttributes
  inline def `[horiz-adv-x]`: `[horiz-adv-x]` = "[horiz-adv-x]".asInstanceOf[`[horiz-adv-x]`]
  
  @js.native
  sealed trait `[horiz-origin-x]`
    extends StObject
       with SvgAttributes
  inline def `[horiz-origin-x]`: `[horiz-origin-x]` = "[horiz-origin-x]".asInstanceOf[`[horiz-origin-x]`]
  
  @js.native
  sealed trait `[horiz-origin-y]`
    extends StObject
       with SvgAttributes
  inline def `[horiz-origin-y]`: `[horiz-origin-y]` = "[horiz-origin-y]".asInstanceOf[`[horiz-origin-y]`]
  
  @js.native
  sealed trait `[href]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[href]`: `[href]` = "[href]".asInstanceOf[`[href]`]
  
  @js.native
  sealed trait `[hreflang]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[hreflang]`: `[hreflang]` = "[hreflang]".asInstanceOf[`[hreflang]`]
  
  @js.native
  sealed trait `[hspace]`
    extends StObject
       with HtmlAttributes
  inline def `[hspace]`: `[hspace]` = "[hspace]".asInstanceOf[`[hspace]`]
  
  @js.native
  sealed trait `[http-equiv]`
    extends StObject
       with HtmlAttributes
  inline def `[http-equiv]`: `[http-equiv]` = "[http-equiv]".asInstanceOf[`[http-equiv]`]
  
  @js.native
  sealed trait `[icon]`
    extends StObject
       with HtmlAttributes
  inline def `[icon]`: `[icon]` = "[icon]".asInstanceOf[`[icon]`]
  
  @js.native
  sealed trait `[id]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[id]`: `[id]` = "[id]".asInstanceOf[`[id]`]
  
  @js.native
  sealed trait `[ideographic]`
    extends StObject
       with SvgAttributes
  inline def `[ideographic]`: `[ideographic]` = "[ideographic]".asInstanceOf[`[ideographic]`]
  
  @js.native
  sealed trait `[image-rendering]`
    extends StObject
       with SvgAttributes
  inline def `[image-rendering]`: `[image-rendering]` = "[image-rendering]".asInstanceOf[`[image-rendering]`]
  
  @js.native
  sealed trait `[imagesizes]`
    extends StObject
       with HtmlAttributes
  inline def `[imagesizes]`: `[imagesizes]` = "[imagesizes]".asInstanceOf[`[imagesizes]`]
  
  @js.native
  sealed trait `[imagesrcset]`
    extends StObject
       with HtmlAttributes
  inline def `[imagesrcset]`: `[imagesrcset]` = "[imagesrcset]".asInstanceOf[`[imagesrcset]`]
  
  @js.native
  sealed trait `[in2]`
    extends StObject
       with SvgAttributes
  inline def `[in2]`: `[in2]` = "[in2]".asInstanceOf[`[in2]`]
  
  @js.native
  sealed trait `[in]`
    extends StObject
       with SvgAttributes
  inline def `[in]`: `[in]` = "[in]".asInstanceOf[`[in]`]
  
  @js.native
  sealed trait `[inert]`
    extends StObject
       with HtmlAttributes
  inline def `[inert]`: `[inert]` = "[inert]".asInstanceOf[`[inert]`]
  
  @js.native
  sealed trait `[inputmode]`
    extends StObject
       with HtmlAttributes
  inline def `[inputmode]`: `[inputmode]` = "[inputmode]".asInstanceOf[`[inputmode]`]
  
  @js.native
  sealed trait `[integrity]`
    extends StObject
       with HtmlAttributes
  inline def `[integrity]`: `[integrity]` = "[integrity]".asInstanceOf[`[integrity]`]
  
  @js.native
  sealed trait `[is]`
    extends StObject
       with HtmlAttributes
  inline def `[is]`: `[is]` = "[is]".asInstanceOf[`[is]`]
  
  @js.native
  sealed trait `[ismap]`
    extends StObject
       with HtmlAttributes
  inline def `[ismap]`: `[ismap]` = "[ismap]".asInstanceOf[`[ismap]`]
  
  @js.native
  sealed trait `[itemid]`
    extends StObject
       with HtmlAttributes
  inline def `[itemid]`: `[itemid]` = "[itemid]".asInstanceOf[`[itemid]`]
  
  @js.native
  sealed trait `[itemprop]`
    extends StObject
       with HtmlAttributes
  inline def `[itemprop]`: `[itemprop]` = "[itemprop]".asInstanceOf[`[itemprop]`]
  
  @js.native
  sealed trait `[itemref]`
    extends StObject
       with HtmlAttributes
  inline def `[itemref]`: `[itemref]` = "[itemref]".asInstanceOf[`[itemref]`]
  
  @js.native
  sealed trait `[itemscope]`
    extends StObject
       with HtmlAttributes
  inline def `[itemscope]`: `[itemscope]` = "[itemscope]".asInstanceOf[`[itemscope]`]
  
  @js.native
  sealed trait `[itemtype]`
    extends StObject
       with HtmlAttributes
  inline def `[itemtype]`: `[itemtype]` = "[itemtype]".asInstanceOf[`[itemtype]`]
  
  @js.native
  sealed trait `[k1]`
    extends StObject
       with SvgAttributes
  inline def `[k1]`: `[k1]` = "[k1]".asInstanceOf[`[k1]`]
  
  @js.native
  sealed trait `[k2]`
    extends StObject
       with SvgAttributes
  inline def `[k2]`: `[k2]` = "[k2]".asInstanceOf[`[k2]`]
  
  @js.native
  sealed trait `[k3]`
    extends StObject
       with SvgAttributes
  inline def `[k3]`: `[k3]` = "[k3]".asInstanceOf[`[k3]`]
  
  @js.native
  sealed trait `[k4]`
    extends StObject
       with SvgAttributes
  inline def `[k4]`: `[k4]` = "[k4]".asInstanceOf[`[k4]`]
  
  @js.native
  sealed trait `[k]`
    extends StObject
       with SvgAttributes
  inline def `[k]`: `[k]` = "[k]".asInstanceOf[`[k]`]
  
  @js.native
  sealed trait `[kernelMatrix]`
    extends StObject
       with SvgAttributes
  inline def `[kernelMatrix]`: `[kernelMatrix]` = "[kernelMatrix]".asInstanceOf[`[kernelMatrix]`]
  
  @js.native
  sealed trait `[kernelUnitLength]`
    extends StObject
       with SvgAttributes
  inline def `[kernelUnitLength]`: `[kernelUnitLength]` = "[kernelUnitLength]".asInstanceOf[`[kernelUnitLength]`]
  
  @js.native
  sealed trait `[kerning]`
    extends StObject
       with SvgAttributes
  inline def `[kerning]`: `[kerning]` = "[kerning]".asInstanceOf[`[kerning]`]
  
  @js.native
  sealed trait `[keyPoints]`
    extends StObject
       with SvgAttributes
  inline def `[keyPoints]`: `[keyPoints]` = "[keyPoints]".asInstanceOf[`[keyPoints]`]
  
  @js.native
  sealed trait `[kind]`
    extends StObject
       with HtmlAttributes
  inline def `[kind]`: `[kind]` = "[kind]".asInstanceOf[`[kind]`]
  
  @js.native
  sealed trait `[label]`
    extends StObject
       with HtmlAttributes
  inline def `[label]`: `[label]` = "[label]".asInstanceOf[`[label]`]
  
  @js.native
  sealed trait `[lang]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[lang]`: `[lang]` = "[lang]".asInstanceOf[`[lang]`]
  
  @js.native
  sealed trait `[language]`
    extends StObject
       with HtmlAttributes
  inline def `[language]`: `[language]` = "[language]".asInstanceOf[`[language]`]
  
  @js.native
  sealed trait `[leftmargin]`
    extends StObject
       with HtmlAttributes
  inline def `[leftmargin]`: `[leftmargin]` = "[leftmargin]".asInstanceOf[`[leftmargin]`]
  
  @js.native
  sealed trait `[lengthAdjust]`
    extends StObject
       with SvgAttributes
  inline def `[lengthAdjust]`: `[lengthAdjust]` = "[lengthAdjust]".asInstanceOf[`[lengthAdjust]`]
  
  @js.native
  sealed trait `[letter-spacing]`
    extends StObject
       with SvgAttributes
  inline def `[letter-spacing]`: `[letter-spacing]` = "[letter-spacing]".asInstanceOf[`[letter-spacing]`]
  
  @js.native
  sealed trait `[lighting-color]`
    extends StObject
       with SvgAttributes
  inline def `[lighting-color]`: `[lighting-color]` = "[lighting-color]".asInstanceOf[`[lighting-color]`]
  
  @js.native
  sealed trait `[limitingConeAngle]`
    extends StObject
       with SvgAttributes
  inline def `[limitingConeAngle]`: `[limitingConeAngle]` = "[limitingConeAngle]".asInstanceOf[`[limitingConeAngle]`]
  
  @js.native
  sealed trait `[link]`
    extends StObject
       with HtmlAttributes
  inline def `[link]`: `[link]` = "[link]".asInstanceOf[`[link]`]
  
  @js.native
  sealed trait `[list]`
    extends StObject
       with HtmlAttributes
  inline def `[list]`: `[list]` = "[list]".asInstanceOf[`[list]`]
  
  @js.native
  sealed trait `[loading]`
    extends StObject
       with HtmlAttributes
  inline def `[loading]`: `[loading]` = "[loading]".asInstanceOf[`[loading]`]
  
  @js.native
  sealed trait `[longdesc]`
    extends StObject
       with HtmlAttributes
  inline def `[longdesc]`: `[longdesc]` = "[longdesc]".asInstanceOf[`[longdesc]`]
  
  @js.native
  sealed trait `[loop]`
    extends StObject
       with HtmlAttributes
  inline def `[loop]`: `[loop]` = "[loop]".asInstanceOf[`[loop]`]
  
  @js.native
  sealed trait `[low]`
    extends StObject
       with HtmlAttributes
  inline def `[low]`: `[low]` = "[low]".asInstanceOf[`[low]`]
  
  @js.native
  sealed trait `[manifest]`
    extends StObject
       with HtmlAttributes
  inline def `[manifest]`: `[manifest]` = "[manifest]".asInstanceOf[`[manifest]`]
  
  @js.native
  sealed trait `[marginheight]`
    extends StObject
       with HtmlAttributes
  inline def `[marginheight]`: `[marginheight]` = "[marginheight]".asInstanceOf[`[marginheight]`]
  
  @js.native
  sealed trait `[marginwidth]`
    extends StObject
       with HtmlAttributes
  inline def `[marginwidth]`: `[marginwidth]` = "[marginwidth]".asInstanceOf[`[marginwidth]`]
  
  @js.native
  sealed trait `[marker-end]`
    extends StObject
       with SvgAttributes
  inline def `[marker-end]`: `[marker-end]` = "[marker-end]".asInstanceOf[`[marker-end]`]
  
  @js.native
  sealed trait `[marker-mid]`
    extends StObject
       with SvgAttributes
  inline def `[marker-mid]`: `[marker-mid]` = "[marker-mid]".asInstanceOf[`[marker-mid]`]
  
  @js.native
  sealed trait `[marker-start]`
    extends StObject
       with SvgAttributes
  inline def `[marker-start]`: `[marker-start]` = "[marker-start]".asInstanceOf[`[marker-start]`]
  
  @js.native
  sealed trait `[markerHeight]`
    extends StObject
       with SvgAttributes
  inline def `[markerHeight]`: `[markerHeight]` = "[markerHeight]".asInstanceOf[`[markerHeight]`]
  
  @js.native
  sealed trait `[markerUnits]`
    extends StObject
       with SvgAttributes
  inline def `[markerUnits]`: `[markerUnits]` = "[markerUnits]".asInstanceOf[`[markerUnits]`]
  
  @js.native
  sealed trait `[markerWidth]`
    extends StObject
       with SvgAttributes
  inline def `[markerWidth]`: `[markerWidth]` = "[markerWidth]".asInstanceOf[`[markerWidth]`]
  
  @js.native
  sealed trait `[maskContentUnits]`
    extends StObject
       with SvgAttributes
  inline def `[maskContentUnits]`: `[maskContentUnits]` = "[maskContentUnits]".asInstanceOf[`[maskContentUnits]`]
  
  @js.native
  sealed trait `[maskUnits]`
    extends StObject
       with SvgAttributes
  inline def `[maskUnits]`: `[maskUnits]` = "[maskUnits]".asInstanceOf[`[maskUnits]`]
  
  @js.native
  sealed trait `[mask]`
    extends StObject
       with SvgAttributes
  inline def `[mask]`: `[mask]` = "[mask]".asInstanceOf[`[mask]`]
  
  @js.native
  sealed trait `[mathematical]`
    extends StObject
       with SvgAttributes
  inline def `[mathematical]`: `[mathematical]` = "[mathematical]".asInstanceOf[`[mathematical]`]
  
  @js.native
  sealed trait `[max]`
    extends StObject
       with HtmlAttributes
  inline def `[max]`: `[max]` = "[max]".asInstanceOf[`[max]`]
  
  @js.native
  sealed trait `[maxlength]`
    extends StObject
       with HtmlAttributes
  inline def `[maxlength]`: `[maxlength]` = "[maxlength]".asInstanceOf[`[maxlength]`]
  
  @js.native
  sealed trait `[mayscript]`
    extends StObject
       with HtmlAttributes
  inline def `[mayscript]`: `[mayscript]` = "[mayscript]".asInstanceOf[`[mayscript]`]
  
  @js.native
  sealed trait `[media]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[media]`: `[media]` = "[media]".asInstanceOf[`[media]`]
  
  @js.native
  sealed trait `[method]`
    extends StObject
       with HtmlAttributes
  inline def `[method]`: `[method]` = "[method]".asInstanceOf[`[method]`]
  
  @js.native
  sealed trait `[methods]`
    extends StObject
       with HtmlAttributes
  inline def `[methods]`: `[methods]` = "[methods]".asInstanceOf[`[methods]`]
  
  @js.native
  sealed trait `[min]`
    extends StObject
       with HtmlAttributes
  inline def `[min]`: `[min]` = "[min]".asInstanceOf[`[min]`]
  
  @js.native
  sealed trait `[minlength]`
    extends StObject
       with HtmlAttributes
  inline def `[minlength]`: `[minlength]` = "[minlength]".asInstanceOf[`[minlength]`]
  
  @js.native
  sealed trait `[mode]`
    extends StObject
       with SvgAttributes
  inline def `[mode]`: `[mode]` = "[mode]".asInstanceOf[`[mode]`]
  
  @js.native
  sealed trait `[moz-opaque]`
    extends StObject
       with HtmlAttributes
  inline def `[moz-opaque]`: `[moz-opaque]` = "[moz-opaque]".asInstanceOf[`[moz-opaque]`]
  
  @js.native
  sealed trait `[mozallowfullscreen]`
    extends StObject
       with HtmlAttributes
  inline def `[mozallowfullscreen]`: `[mozallowfullscreen]` = "[mozallowfullscreen]".asInstanceOf[`[mozallowfullscreen]`]
  
  @js.native
  sealed trait `[msallowfullscreen]`
    extends StObject
       with HtmlAttributes
  inline def `[msallowfullscreen]`: `[msallowfullscreen]` = "[msallowfullscreen]".asInstanceOf[`[msallowfullscreen]`]
  
  @js.native
  sealed trait `[multiple]`
    extends StObject
       with HtmlAttributes
  inline def `[multiple]`: `[multiple]` = "[multiple]".asInstanceOf[`[multiple]`]
  
  @js.native
  sealed trait `[muted]`
    extends StObject
       with HtmlAttributes
  inline def `[muted]`: `[muted]` = "[muted]".asInstanceOf[`[muted]`]
  
  @js.native
  sealed trait `[name]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[name]`: `[name]` = "[name]".asInstanceOf[`[name]`]
  
  @js.native
  sealed trait `[nohref]`
    extends StObject
       with HtmlAttributes
  inline def `[nohref]`: `[nohref]` = "[nohref]".asInstanceOf[`[nohref]`]
  
  @js.native
  sealed trait `[nomodule]`
    extends StObject
       with HtmlAttributes
  inline def `[nomodule]`: `[nomodule]` = "[nomodule]".asInstanceOf[`[nomodule]`]
  
  @js.native
  sealed trait `[nonce]`
    extends StObject
       with HtmlAttributes
  inline def `[nonce]`: `[nonce]` = "[nonce]".asInstanceOf[`[nonce]`]
  
  @js.native
  sealed trait `[noresize]`
    extends StObject
       with HtmlAttributes
  inline def `[noresize]`: `[noresize]` = "[noresize]".asInstanceOf[`[noresize]`]
  
  @js.native
  sealed trait `[noshade]`
    extends StObject
       with HtmlAttributes
  inline def `[noshade]`: `[noshade]` = "[noshade]".asInstanceOf[`[noshade]`]
  
  @js.native
  sealed trait `[novalidate]`
    extends StObject
       with HtmlAttributes
  inline def `[novalidate]`: `[novalidate]` = "[novalidate]".asInstanceOf[`[novalidate]`]
  
  @js.native
  sealed trait `[nowrap]`
    extends StObject
       with HtmlAttributes
  inline def `[nowrap]`: `[nowrap]` = "[nowrap]".asInstanceOf[`[nowrap]`]
  
  @js.native
  sealed trait `[numOctaves]`
    extends StObject
       with SvgAttributes
  inline def `[numOctaves]`: `[numOctaves]` = "[numOctaves]".asInstanceOf[`[numOctaves]`]
  
  @js.native
  sealed trait `[object]`
    extends StObject
       with HtmlAttributes
  inline def `[object]`: `[object]` = "[object]".asInstanceOf[`[object]`]
  
  @js.native
  sealed trait `[offset]`
    extends StObject
       with SvgAttributes
  inline def `[offset]`: `[offset]` = "[offset]".asInstanceOf[`[offset]`]
  
  @js.native
  sealed trait `[onerror]`
    extends StObject
       with HtmlAttributes
  inline def `[onerror]`: `[onerror]` = "[onerror]".asInstanceOf[`[onerror]`]
  
  @js.native
  sealed trait `[opacity]`
    extends StObject
       with SvgAttributes
  inline def `[opacity]`: `[opacity]` = "[opacity]".asInstanceOf[`[opacity]`]
  
  @js.native
  sealed trait `[open]`
    extends StObject
       with HtmlAttributes
  inline def `[open]`: `[open]` = "[open]".asInstanceOf[`[open]`]
  
  @js.native
  sealed trait `[operator]`
    extends StObject
       with SvgAttributes
  inline def `[operator]`: `[operator]` = "[operator]".asInstanceOf[`[operator]`]
  
  @js.native
  sealed trait `[optimum]`
    extends StObject
       with HtmlAttributes
  inline def `[optimum]`: `[optimum]` = "[optimum]".asInstanceOf[`[optimum]`]
  
  @js.native
  sealed trait `[order]`
    extends StObject
       with SvgAttributes
  inline def `[order]`: `[order]` = "[order]".asInstanceOf[`[order]`]
  
  @js.native
  sealed trait `[orient]`
    extends StObject
       with SvgAttributes
  inline def `[orient]`: `[orient]` = "[orient]".asInstanceOf[`[orient]`]
  
  @js.native
  sealed trait `[orientation]`
    extends StObject
       with SvgAttributes
  inline def `[orientation]`: `[orientation]` = "[orientation]".asInstanceOf[`[orientation]`]
  
  @js.native
  sealed trait `[origin]`
    extends StObject
       with SvgAttributes
  inline def `[origin]`: `[origin]` = "[origin]".asInstanceOf[`[origin]`]
  
  @js.native
  sealed trait `[overflow]`
    extends StObject
       with SvgAttributes
  inline def `[overflow]`: `[overflow]` = "[overflow]".asInstanceOf[`[overflow]`]
  
  @js.native
  sealed trait `[overline-position]`
    extends StObject
       with SvgAttributes
  inline def `[overline-position]`: `[overline-position]` = "[overline-position]".asInstanceOf[`[overline-position]`]
  
  @js.native
  sealed trait `[overline-thickness]`
    extends StObject
       with SvgAttributes
  inline def `[overline-thickness]`: `[overline-thickness]` = "[overline-thickness]".asInstanceOf[`[overline-thickness]`]
  
  @js.native
  sealed trait `[paint-order]`
    extends StObject
       with SvgAttributes
  inline def `[paint-order]`: `[paint-order]` = "[paint-order]".asInstanceOf[`[paint-order]`]
  
  @js.native
  sealed trait `[panose-1]`
    extends StObject
       with SvgAttributes
  inline def `[panose-1]`: `[panose-1]` = "[panose-1]".asInstanceOf[`[panose-1]`]
  
  @js.native
  sealed trait `[part]`
    extends StObject
       with HtmlAttributes
  inline def `[part]`: `[part]` = "[part]".asInstanceOf[`[part]`]
  
  @js.native
  sealed trait `[path]`
    extends StObject
       with SvgAttributes
  inline def `[path]`: `[path]` = "[path]".asInstanceOf[`[path]`]
  
  @js.native
  sealed trait `[patternContentUnits]`
    extends StObject
       with SvgAttributes
  inline def `[patternContentUnits]`: `[patternContentUnits]` = "[patternContentUnits]".asInstanceOf[`[patternContentUnits]`]
  
  @js.native
  sealed trait `[patternTransform]`
    extends StObject
       with SvgAttributes
  inline def `[patternTransform]`: `[patternTransform]` = "[patternTransform]".asInstanceOf[`[patternTransform]`]
  
  @js.native
  sealed trait `[patternUnits]`
    extends StObject
       with SvgAttributes
  inline def `[patternUnits]`: `[patternUnits]` = "[patternUnits]".asInstanceOf[`[patternUnits]`]
  
  @js.native
  sealed trait `[pattern]`
    extends StObject
       with HtmlAttributes
  inline def `[pattern]`: `[pattern]` = "[pattern]".asInstanceOf[`[pattern]`]
  
  @js.native
  sealed trait `[ping]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[ping]`: `[ping]` = "[ping]".asInstanceOf[`[ping]`]
  
  @js.native
  sealed trait `[placeholder]`
    extends StObject
       with HtmlAttributes
  inline def `[placeholder]`: `[placeholder]` = "[placeholder]".asInstanceOf[`[placeholder]`]
  
  @js.native
  sealed trait `[pointer-events]`
    extends StObject
       with SvgAttributes
  inline def `[pointer-events]`: `[pointer-events]` = "[pointer-events]".asInstanceOf[`[pointer-events]`]
  
  @js.native
  sealed trait `[pointsAtX]`
    extends StObject
       with SvgAttributes
  inline def `[pointsAtX]`: `[pointsAtX]` = "[pointsAtX]".asInstanceOf[`[pointsAtX]`]
  
  @js.native
  sealed trait `[pointsAtY]`
    extends StObject
       with SvgAttributes
  inline def `[pointsAtY]`: `[pointsAtY]` = "[pointsAtY]".asInstanceOf[`[pointsAtY]`]
  
  @js.native
  sealed trait `[pointsAtZ]`
    extends StObject
       with SvgAttributes
  inline def `[pointsAtZ]`: `[pointsAtZ]` = "[pointsAtZ]".asInstanceOf[`[pointsAtZ]`]
  
  @js.native
  sealed trait `[points]`
    extends StObject
       with SvgAttributes
  inline def `[points]`: `[points]` = "[points]".asInstanceOf[`[points]`]
  
  @js.native
  sealed trait `[poster]`
    extends StObject
       with HtmlAttributes
  inline def `[poster]`: `[poster]` = "[poster]".asInstanceOf[`[poster]`]
  
  @js.native
  sealed trait `[prefetch]`
    extends StObject
       with HtmlAttributes
  inline def `[prefetch]`: `[prefetch]` = "[prefetch]".asInstanceOf[`[prefetch]`]
  
  @js.native
  sealed trait `[preload]`
    extends StObject
       with HtmlAttributes
  inline def `[preload]`: `[preload]` = "[preload]".asInstanceOf[`[preload]`]
  
  @js.native
  sealed trait `[preserveAlpha]`
    extends StObject
       with SvgAttributes
  inline def `[preserveAlpha]`: `[preserveAlpha]` = "[preserveAlpha]".asInstanceOf[`[preserveAlpha]`]
  
  @js.native
  sealed trait `[preserveAspectRatio]`
    extends StObject
       with SvgAttributes
  inline def `[preserveAspectRatio]`: `[preserveAspectRatio]` = "[preserveAspectRatio]".asInstanceOf[`[preserveAspectRatio]`]
  
  @js.native
  sealed trait `[primitiveUnits]`
    extends StObject
       with SvgAttributes
  inline def `[primitiveUnits]`: `[primitiveUnits]` = "[primitiveUnits]".asInstanceOf[`[primitiveUnits]`]
  
  @js.native
  sealed trait `[profile]`
    extends StObject
       with HtmlAttributes
  inline def `[profile]`: `[profile]` = "[profile]".asInstanceOf[`[profile]`]
  
  @js.native
  sealed trait `[r]`
    extends StObject
       with SvgAttributes
  inline def `[r]`: `[r]` = "[r]".asInstanceOf[`[r]`]
  
  @js.native
  sealed trait `[radiogroup]`
    extends StObject
       with HtmlAttributes
  inline def `[radiogroup]`: `[radiogroup]` = "[radiogroup]".asInstanceOf[`[radiogroup]`]
  
  @js.native
  sealed trait `[radius]`
    extends StObject
       with SvgAttributes
  inline def `[radius]`: `[radius]` = "[radius]".asInstanceOf[`[radius]`]
  
  @js.native
  sealed trait `[readonly]`
    extends StObject
       with HtmlAttributes
  inline def `[readonly]`: `[readonly]` = "[readonly]".asInstanceOf[`[readonly]`]
  
  @js.native
  sealed trait `[refX]`
    extends StObject
       with SvgAttributes
  inline def `[refX]`: `[refX]` = "[refX]".asInstanceOf[`[refX]`]
  
  @js.native
  sealed trait `[refY]`
    extends StObject
       with SvgAttributes
  inline def `[refY]`: `[refY]` = "[refY]".asInstanceOf[`[refY]`]
  
  @js.native
  sealed trait `[referrerpolicy]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[referrerpolicy]`: `[referrerpolicy]` = "[referrerpolicy]".asInstanceOf[`[referrerpolicy]`]
  
  @js.native
  sealed trait `[rel]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[rel]`: `[rel]` = "[rel]".asInstanceOf[`[rel]`]
  
  @js.native
  sealed trait `[repeatCount]`
    extends StObject
       with SvgAttributes
  inline def `[repeatCount]`: `[repeatCount]` = "[repeatCount]".asInstanceOf[`[repeatCount]`]
  
  @js.native
  sealed trait `[requiredExtensions]`
    extends StObject
       with SvgAttributes
  inline def `[requiredExtensions]`: `[requiredExtensions]` = "[requiredExtensions]".asInstanceOf[`[requiredExtensions]`]
  
  @js.native
  sealed trait `[requiredFeatures]`
    extends StObject
       with SvgAttributes
  inline def `[requiredFeatures]`: `[requiredFeatures]` = "[requiredFeatures]".asInstanceOf[`[requiredFeatures]`]
  
  @js.native
  sealed trait `[required]`
    extends StObject
       with HtmlAttributes
  inline def `[required]`: `[required]` = "[required]".asInstanceOf[`[required]`]
  
  @js.native
  sealed trait `[rev]`
    extends StObject
       with HtmlAttributes
  inline def `[rev]`: `[rev]` = "[rev]".asInstanceOf[`[rev]`]
  
  @js.native
  sealed trait `[reversed]`
    extends StObject
       with HtmlAttributes
  inline def `[reversed]`: `[reversed]` = "[reversed]".asInstanceOf[`[reversed]`]
  
  @js.native
  sealed trait `[rightmargin]`
    extends StObject
       with HtmlAttributes
  inline def `[rightmargin]`: `[rightmargin]` = "[rightmargin]".asInstanceOf[`[rightmargin]`]
  
  @js.native
  sealed trait `[rotate]`
    extends StObject
       with SvgAttributes
  inline def `[rotate]`: `[rotate]` = "[rotate]".asInstanceOf[`[rotate]`]
  
  @js.native
  sealed trait `[rows]`
    extends StObject
       with HtmlAttributes
  inline def `[rows]`: `[rows]` = "[rows]".asInstanceOf[`[rows]`]
  
  @js.native
  sealed trait `[rowspan]`
    extends StObject
       with HtmlAttributes
  inline def `[rowspan]`: `[rowspan]` = "[rowspan]".asInstanceOf[`[rowspan]`]
  
  @js.native
  sealed trait `[rules]`
    extends StObject
       with HtmlAttributes
  inline def `[rules]`: `[rules]` = "[rules]".asInstanceOf[`[rules]`]
  
  @js.native
  sealed trait `[rx]`
    extends StObject
       with SvgAttributes
  inline def `[rx]`: `[rx]` = "[rx]".asInstanceOf[`[rx]`]
  
  @js.native
  sealed trait `[ry]`
    extends StObject
       with SvgAttributes
  inline def `[ry]`: `[ry]` = "[ry]".asInstanceOf[`[ry]`]
  
  @js.native
  sealed trait `[sandbox-allow-downloads]`
    extends StObject
       with HtmlAttributes
  inline def `[sandbox-allow-downloads]`: `[sandbox-allow-downloads]` = "[sandbox-allow-downloads]".asInstanceOf[`[sandbox-allow-downloads]`]
  
  @js.native
  sealed trait `[sandbox-allow-modals]`
    extends StObject
       with HtmlAttributes
  inline def `[sandbox-allow-modals]`: `[sandbox-allow-modals]` = "[sandbox-allow-modals]".asInstanceOf[`[sandbox-allow-modals]`]
  
  @js.native
  sealed trait `[sandbox-allow-popups-to-escape-sandbox]`
    extends StObject
       with HtmlAttributes
  inline def `[sandbox-allow-popups-to-escape-sandbox]`: `[sandbox-allow-popups-to-escape-sandbox]` = "[sandbox-allow-popups-to-escape-sandbox]".asInstanceOf[`[sandbox-allow-popups-to-escape-sandbox]`]
  
  @js.native
  sealed trait `[sandbox-allow-popups]`
    extends StObject
       with HtmlAttributes
  inline def `[sandbox-allow-popups]`: `[sandbox-allow-popups]` = "[sandbox-allow-popups]".asInstanceOf[`[sandbox-allow-popups]`]
  
  @js.native
  sealed trait `[sandbox-allow-presentation]`
    extends StObject
       with HtmlAttributes
  inline def `[sandbox-allow-presentation]`: `[sandbox-allow-presentation]` = "[sandbox-allow-presentation]".asInstanceOf[`[sandbox-allow-presentation]`]
  
  @js.native
  sealed trait `[sandbox-allow-same-origin]`
    extends StObject
       with HtmlAttributes
  inline def `[sandbox-allow-same-origin]`: `[sandbox-allow-same-origin]` = "[sandbox-allow-same-origin]".asInstanceOf[`[sandbox-allow-same-origin]`]
  
  @js.native
  sealed trait `[sandbox-allow-storage-access-by-user-activation]`
    extends StObject
       with HtmlAttributes
  inline def `[sandbox-allow-storage-access-by-user-activation]`: `[sandbox-allow-storage-access-by-user-activation]` = "[sandbox-allow-storage-access-by-user-activation]".asInstanceOf[`[sandbox-allow-storage-access-by-user-activation]`]
  
  @js.native
  sealed trait `[sandbox-allow-top-navigation-by-user-activation]`
    extends StObject
       with HtmlAttributes
  inline def `[sandbox-allow-top-navigation-by-user-activation]`: `[sandbox-allow-top-navigation-by-user-activation]` = "[sandbox-allow-top-navigation-by-user-activation]".asInstanceOf[`[sandbox-allow-top-navigation-by-user-activation]`]
  
  @js.native
  sealed trait `[sandbox]`
    extends StObject
       with HtmlAttributes
  inline def `[sandbox]`: `[sandbox]` = "[sandbox]".asInstanceOf[`[sandbox]`]
  
  @js.native
  sealed trait `[scale]`
    extends StObject
       with SvgAttributes
  inline def `[scale]`: `[scale]` = "[scale]".asInstanceOf[`[scale]`]
  
  @js.native
  sealed trait `[scope]`
    extends StObject
       with HtmlAttributes
  inline def `[scope]`: `[scope]` = "[scope]".asInstanceOf[`[scope]`]
  
  @js.native
  sealed trait `[scrollamount]`
    extends StObject
       with HtmlAttributes
  inline def `[scrollamount]`: `[scrollamount]` = "[scrollamount]".asInstanceOf[`[scrollamount]`]
  
  @js.native
  sealed trait `[scrolldelay]`
    extends StObject
       with HtmlAttributes
  inline def `[scrolldelay]`: `[scrolldelay]` = "[scrolldelay]".asInstanceOf[`[scrolldelay]`]
  
  @js.native
  sealed trait `[scrolling]`
    extends StObject
       with HtmlAttributes
  inline def `[scrolling]`: `[scrolling]` = "[scrolling]".asInstanceOf[`[scrolling]`]
  
  @js.native
  sealed trait `[seed]`
    extends StObject
       with SvgAttributes
  inline def `[seed]`: `[seed]` = "[seed]".asInstanceOf[`[seed]`]
  
  @js.native
  sealed trait `[selected]`
    extends StObject
       with HtmlAttributes
  inline def `[selected]`: `[selected]` = "[selected]".asInstanceOf[`[selected]`]
  
  @js.native
  sealed trait `[shadowroot]`
    extends StObject
       with HtmlAttributes
  inline def `[shadowroot]`: `[shadowroot]` = "[shadowroot]".asInstanceOf[`[shadowroot]`]
  
  @js.native
  sealed trait `[shape-rendering]`
    extends StObject
       with SvgAttributes
  inline def `[shape-rendering]`: `[shape-rendering]` = "[shape-rendering]".asInstanceOf[`[shape-rendering]`]
  
  @js.native
  sealed trait `[shape]`
    extends StObject
       with HtmlAttributes
  inline def `[shape]`: `[shape]` = "[shape]".asInstanceOf[`[shape]`]
  
  @js.native
  sealed trait `[side]`
    extends StObject
       with SvgAttributes
  inline def `[side]`: `[side]` = "[side]".asInstanceOf[`[side]`]
  
  @js.native
  sealed trait `[size]`
    extends StObject
       with HtmlAttributes
  inline def `[size]`: `[size]` = "[size]".asInstanceOf[`[size]`]
  
  @js.native
  sealed trait `[sizes]`
    extends StObject
       with HtmlAttributes
  inline def `[sizes]`: `[sizes]` = "[sizes]".asInstanceOf[`[sizes]`]
  
  @js.native
  sealed trait `[slope]`
    extends StObject
       with SvgAttributes
  inline def `[slope]`: `[slope]` = "[slope]".asInstanceOf[`[slope]`]
  
  @js.native
  sealed trait `[slot]`
    extends StObject
       with HtmlAttributes
  inline def `[slot]`: `[slot]` = "[slot]".asInstanceOf[`[slot]`]
  
  @js.native
  sealed trait `[solid-color]`
    extends StObject
       with SvgAttributes
  inline def `[solid-color]`: `[solid-color]` = "[solid-color]".asInstanceOf[`[solid-color]`]
  
  @js.native
  sealed trait `[solid-opacity]`
    extends StObject
       with SvgAttributes
  inline def `[solid-opacity]`: `[solid-opacity]` = "[solid-opacity]".asInstanceOf[`[solid-opacity]`]
  
  @js.native
  sealed trait `[spacing]`
    extends StObject
       with SvgAttributes
  inline def `[spacing]`: `[spacing]` = "[spacing]".asInstanceOf[`[spacing]`]
  
  @js.native
  sealed trait `[span]`
    extends StObject
       with HtmlAttributes
  inline def `[span]`: `[span]` = "[span]".asInstanceOf[`[span]`]
  
  @js.native
  sealed trait `[specularConstant]`
    extends StObject
       with SvgAttributes
  inline def `[specularConstant]`: `[specularConstant]` = "[specularConstant]".asInstanceOf[`[specularConstant]`]
  
  @js.native
  sealed trait `[specularExponent]`
    extends StObject
       with SvgAttributes
  inline def `[specularExponent]`: `[specularExponent]` = "[specularExponent]".asInstanceOf[`[specularExponent]`]
  
  @js.native
  sealed trait `[spellcheck]`
    extends StObject
       with HtmlAttributes
  inline def `[spellcheck]`: `[spellcheck]` = "[spellcheck]".asInstanceOf[`[spellcheck]`]
  
  @js.native
  sealed trait `[spreadMethod]`
    extends StObject
       with SvgAttributes
  inline def `[spreadMethod]`: `[spreadMethod]` = "[spreadMethod]".asInstanceOf[`[spreadMethod]`]
  
  @js.native
  sealed trait `[src]`
    extends StObject
       with HtmlAttributes
  inline def `[src]`: `[src]` = "[src]".asInstanceOf[`[src]`]
  
  @js.native
  sealed trait `[srcdoc]`
    extends StObject
       with HtmlAttributes
  inline def `[srcdoc]`: `[srcdoc]` = "[srcdoc]".asInstanceOf[`[srcdoc]`]
  
  @js.native
  sealed trait `[srclang]`
    extends StObject
       with HtmlAttributes
  inline def `[srclang]`: `[srclang]` = "[srclang]".asInstanceOf[`[srclang]`]
  
  @js.native
  sealed trait `[srcset]`
    extends StObject
       with HtmlAttributes
  inline def `[srcset]`: `[srcset]` = "[srcset]".asInstanceOf[`[srcset]`]
  
  @js.native
  sealed trait `[standby]`
    extends StObject
       with HtmlAttributes
  inline def `[standby]`: `[standby]` = "[standby]".asInstanceOf[`[standby]`]
  
  @js.native
  sealed trait `[startOffset]`
    extends StObject
       with SvgAttributes
  inline def `[startOffset]`: `[startOffset]` = "[startOffset]".asInstanceOf[`[startOffset]`]
  
  @js.native
  sealed trait `[start]`
    extends StObject
       with HtmlAttributes
  inline def `[start]`: `[start]` = "[start]".asInstanceOf[`[start]`]
  
  @js.native
  sealed trait `[stdDeviation]`
    extends StObject
       with SvgAttributes
  inline def `[stdDeviation]`: `[stdDeviation]` = "[stdDeviation]".asInstanceOf[`[stdDeviation]`]
  
  @js.native
  sealed trait `[stemh]`
    extends StObject
       with SvgAttributes
  inline def `[stemh]`: `[stemh]` = "[stemh]".asInstanceOf[`[stemh]`]
  
  @js.native
  sealed trait `[stemv]`
    extends StObject
       with SvgAttributes
  inline def `[stemv]`: `[stemv]` = "[stemv]".asInstanceOf[`[stemv]`]
  
  @js.native
  sealed trait `[step]`
    extends StObject
       with HtmlAttributes
  inline def `[step]`: `[step]` = "[step]".asInstanceOf[`[step]`]
  
  @js.native
  sealed trait `[stitchTiles]`
    extends StObject
       with SvgAttributes
  inline def `[stitchTiles]`: `[stitchTiles]` = "[stitchTiles]".asInstanceOf[`[stitchTiles]`]
  
  @js.native
  sealed trait `[stop-color]`
    extends StObject
       with SvgAttributes
  inline def `[stop-color]`: `[stop-color]` = "[stop-color]".asInstanceOf[`[stop-color]`]
  
  @js.native
  sealed trait `[stop-opacity]`
    extends StObject
       with SvgAttributes
  inline def `[stop-opacity]`: `[stop-opacity]` = "[stop-opacity]".asInstanceOf[`[stop-opacity]`]
  
  @js.native
  sealed trait `[strikethrough-position]`
    extends StObject
       with SvgAttributes
  inline def `[strikethrough-position]`: `[strikethrough-position]` = "[strikethrough-position]".asInstanceOf[`[strikethrough-position]`]
  
  @js.native
  sealed trait `[strikethrough-thickness]`
    extends StObject
       with SvgAttributes
  inline def `[strikethrough-thickness]`: `[strikethrough-thickness]` = "[strikethrough-thickness]".asInstanceOf[`[strikethrough-thickness]`]
  
  @js.native
  sealed trait `[string]`
    extends StObject
       with SvgAttributes
  inline def `[string]`: `[string]` = "[string]".asInstanceOf[`[string]`]
  
  @js.native
  sealed trait `[stroke-dasharray]`
    extends StObject
       with SvgAttributes
  inline def `[stroke-dasharray]`: `[stroke-dasharray]` = "[stroke-dasharray]".asInstanceOf[`[stroke-dasharray]`]
  
  @js.native
  sealed trait `[stroke-dashoffset]`
    extends StObject
       with SvgAttributes
  inline def `[stroke-dashoffset]`: `[stroke-dashoffset]` = "[stroke-dashoffset]".asInstanceOf[`[stroke-dashoffset]`]
  
  @js.native
  sealed trait `[stroke-linecap]`
    extends StObject
       with SvgAttributes
  inline def `[stroke-linecap]`: `[stroke-linecap]` = "[stroke-linecap]".asInstanceOf[`[stroke-linecap]`]
  
  @js.native
  sealed trait `[stroke-linejoin]`
    extends StObject
       with SvgAttributes
  inline def `[stroke-linejoin]`: `[stroke-linejoin]` = "[stroke-linejoin]".asInstanceOf[`[stroke-linejoin]`]
  
  @js.native
  sealed trait `[stroke-miterlimit]`
    extends StObject
       with SvgAttributes
  inline def `[stroke-miterlimit]`: `[stroke-miterlimit]` = "[stroke-miterlimit]".asInstanceOf[`[stroke-miterlimit]`]
  
  @js.native
  sealed trait `[stroke-opacity]`
    extends StObject
       with SvgAttributes
  inline def `[stroke-opacity]`: `[stroke-opacity]` = "[stroke-opacity]".asInstanceOf[`[stroke-opacity]`]
  
  @js.native
  sealed trait `[stroke-width]`
    extends StObject
       with SvgAttributes
  inline def `[stroke-width]`: `[stroke-width]` = "[stroke-width]".asInstanceOf[`[stroke-width]`]
  
  @js.native
  sealed trait `[stroke]`
    extends StObject
       with SvgAttributes
  inline def `[stroke]`: `[stroke]` = "[stroke]".asInstanceOf[`[stroke]`]
  
  @js.native
  sealed trait `[style]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[style]`: `[style]` = "[style]".asInstanceOf[`[style]`]
  
  @js.native
  sealed trait `[summary]`
    extends StObject
       with HtmlAttributes
  inline def `[summary]`: `[summary]` = "[summary]".asInstanceOf[`[summary]`]
  
  @js.native
  sealed trait `[surfaceScale]`
    extends StObject
       with SvgAttributes
  inline def `[surfaceScale]`: `[surfaceScale]` = "[surfaceScale]".asInstanceOf[`[surfaceScale]`]
  
  @js.native
  sealed trait `[systemLanguage]`
    extends StObject
       with SvgAttributes
  inline def `[systemLanguage]`: `[systemLanguage]` = "[systemLanguage]".asInstanceOf[`[systemLanguage]`]
  
  @js.native
  sealed trait `[tabindex]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[tabindex]`: `[tabindex]` = "[tabindex]".asInstanceOf[`[tabindex]`]
  
  @js.native
  sealed trait `[targetX]`
    extends StObject
       with SvgAttributes
  inline def `[targetX]`: `[targetX]` = "[targetX]".asInstanceOf[`[targetX]`]
  
  @js.native
  sealed trait `[targetY]`
    extends StObject
       with SvgAttributes
  inline def `[targetY]`: `[targetY]` = "[targetY]".asInstanceOf[`[targetY]`]
  
  @js.native
  sealed trait `[target]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[target]`: `[target]` = "[target]".asInstanceOf[`[target]`]
  
  @js.native
  sealed trait `[text-anchor]`
    extends StObject
       with SvgAttributes
  inline def `[text-anchor]`: `[text-anchor]` = "[text-anchor]".asInstanceOf[`[text-anchor]`]
  
  @js.native
  sealed trait `[text-decoration]`
    extends StObject
       with SvgAttributes
  inline def `[text-decoration]`: `[text-decoration]` = "[text-decoration]".asInstanceOf[`[text-decoration]`]
  
  @js.native
  sealed trait `[text-overflow]`
    extends StObject
       with SvgAttributes
  inline def `[text-overflow]`: `[text-overflow]` = "[text-overflow]".asInstanceOf[`[text-overflow]`]
  
  @js.native
  sealed trait `[text-rendering]`
    extends StObject
       with SvgAttributes
  inline def `[text-rendering]`: `[text-rendering]` = "[text-rendering]".asInstanceOf[`[text-rendering]`]
  
  @js.native
  sealed trait `[textLength]`
    extends StObject
       with SvgAttributes
  inline def `[textLength]`: `[textLength]` = "[textLength]".asInstanceOf[`[textLength]`]
  
  @js.native
  sealed trait `[text]`
    extends StObject
       with HtmlAttributes
  inline def `[text]`: `[text]` = "[text]".asInstanceOf[`[text]`]
  
  @js.native
  sealed trait `[title]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[title]`: `[title]` = "[title]".asInstanceOf[`[title]`]
  
  @js.native
  sealed trait `[to]`
    extends StObject
       with SvgAttributes
  inline def `[to]`: `[to]` = "[to]".asInstanceOf[`[to]`]
  
  @js.native
  sealed trait `[topmargin]`
    extends StObject
       with HtmlAttributes
  inline def `[topmargin]`: `[topmargin]` = "[topmargin]".asInstanceOf[`[topmargin]`]
  
  @js.native
  sealed trait `[transform-origin]`
    extends StObject
       with SvgAttributes
  inline def `[transform-origin]`: `[transform-origin]` = "[transform-origin]".asInstanceOf[`[transform-origin]`]
  
  @js.native
  sealed trait `[transform]`
    extends StObject
       with SvgAttributes
  inline def `[transform]`: `[transform]` = "[transform]".asInstanceOf[`[transform]`]
  
  @js.native
  sealed trait `[translate]`
    extends StObject
       with HtmlAttributes
  inline def `[translate]`: `[translate]` = "[translate]".asInstanceOf[`[translate]`]
  
  @js.native
  sealed trait `[truespeed]`
    extends StObject
       with HtmlAttributes
  inline def `[truespeed]`: `[truespeed]` = "[truespeed]".asInstanceOf[`[truespeed]`]
  
  @js.native
  sealed trait `[type]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[type]`: `[type]` = "[type]".asInstanceOf[`[type]`]
  
  @js.native
  sealed trait `[u1]`
    extends StObject
       with SvgAttributes
  inline def `[u1]`: `[u1]` = "[u1]".asInstanceOf[`[u1]`]
  
  @js.native
  sealed trait `[u2]`
    extends StObject
       with SvgAttributes
  inline def `[u2]`: `[u2]` = "[u2]".asInstanceOf[`[u2]`]
  
  @js.native
  sealed trait `[underline-position]`
    extends StObject
       with SvgAttributes
  inline def `[underline-position]`: `[underline-position]` = "[underline-position]".asInstanceOf[`[underline-position]`]
  
  @js.native
  sealed trait `[underline-thickness]`
    extends StObject
       with SvgAttributes
  inline def `[underline-thickness]`: `[underline-thickness]` = "[underline-thickness]".asInstanceOf[`[underline-thickness]`]
  
  @js.native
  sealed trait `[unicode-bidi]`
    extends StObject
       with SvgAttributes
  inline def `[unicode-bidi]`: `[unicode-bidi]` = "[unicode-bidi]".asInstanceOf[`[unicode-bidi]`]
  
  @js.native
  sealed trait `[unicode-range]`
    extends StObject
       with SvgAttributes
  inline def `[unicode-range]`: `[unicode-range]` = "[unicode-range]".asInstanceOf[`[unicode-range]`]
  
  @js.native
  sealed trait `[unicode]`
    extends StObject
       with SvgAttributes
  inline def `[unicode]`: `[unicode]` = "[unicode]".asInstanceOf[`[unicode]`]
  
  @js.native
  sealed trait `[units-per-em]`
    extends StObject
       with SvgAttributes
  inline def `[units-per-em]`: `[units-per-em]` = "[units-per-em]".asInstanceOf[`[units-per-em]`]
  
  @js.native
  sealed trait `[usemap]`
    extends StObject
       with HtmlAttributes
  inline def `[usemap]`: `[usemap]` = "[usemap]".asInstanceOf[`[usemap]`]
  
  @js.native
  sealed trait `[v-alphabetic]`
    extends StObject
       with SvgAttributes
  inline def `[v-alphabetic]`: `[v-alphabetic]` = "[v-alphabetic]".asInstanceOf[`[v-alphabetic]`]
  
  @js.native
  sealed trait `[v-hanging]`
    extends StObject
       with SvgAttributes
  inline def `[v-hanging]`: `[v-hanging]` = "[v-hanging]".asInstanceOf[`[v-hanging]`]
  
  @js.native
  sealed trait `[v-ideographic]`
    extends StObject
       with SvgAttributes
  inline def `[v-ideographic]`: `[v-ideographic]` = "[v-ideographic]".asInstanceOf[`[v-ideographic]`]
  
  @js.native
  sealed trait `[v-mathematical]`
    extends StObject
       with SvgAttributes
  inline def `[v-mathematical]`: `[v-mathematical]` = "[v-mathematical]".asInstanceOf[`[v-mathematical]`]
  
  @js.native
  sealed trait `[valign]`
    extends StObject
       with HtmlAttributes
  inline def `[valign]`: `[valign]` = "[valign]".asInstanceOf[`[valign]`]
  
  @js.native
  sealed trait `[value]`
    extends StObject
       with HtmlAttributes
  inline def `[value]`: `[value]` = "[value]".asInstanceOf[`[value]`]
  
  @js.native
  sealed trait `[values]`
    extends StObject
       with SvgAttributes
  inline def `[values]`: `[values]` = "[values]".asInstanceOf[`[values]`]
  
  @js.native
  sealed trait `[valuetype]`
    extends StObject
       with HtmlAttributes
  inline def `[valuetype]`: `[valuetype]` = "[valuetype]".asInstanceOf[`[valuetype]`]
  
  @js.native
  sealed trait `[vector-effect]`
    extends StObject
       with SvgAttributes
  inline def `[vector-effect]`: `[vector-effect]` = "[vector-effect]".asInstanceOf[`[vector-effect]`]
  
  @js.native
  sealed trait `[version]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[version]`: `[version]` = "[version]".asInstanceOf[`[version]`]
  
  @js.native
  sealed trait `[vert-adv-y]`
    extends StObject
       with SvgAttributes
  inline def `[vert-adv-y]`: `[vert-adv-y]` = "[vert-adv-y]".asInstanceOf[`[vert-adv-y]`]
  
  @js.native
  sealed trait `[vert-origin-x]`
    extends StObject
       with SvgAttributes
  inline def `[vert-origin-x]`: `[vert-origin-x]` = "[vert-origin-x]".asInstanceOf[`[vert-origin-x]`]
  
  @js.native
  sealed trait `[vert-origin-y]`
    extends StObject
       with SvgAttributes
  inline def `[vert-origin-y]`: `[vert-origin-y]` = "[vert-origin-y]".asInstanceOf[`[vert-origin-y]`]
  
  @js.native
  sealed trait `[viewBox]`
    extends StObject
       with SvgAttributes
  inline def `[viewBox]`: `[viewBox]` = "[viewBox]".asInstanceOf[`[viewBox]`]
  
  @js.native
  sealed trait `[viewTarget]`
    extends StObject
       with SvgAttributes
  inline def `[viewTarget]`: `[viewTarget]` = "[viewTarget]".asInstanceOf[`[viewTarget]`]
  
  @js.native
  sealed trait `[visibility]`
    extends StObject
       with SvgAttributes
  inline def `[visibility]`: `[visibility]` = "[visibility]".asInstanceOf[`[visibility]`]
  
  @js.native
  sealed trait `[vlink]`
    extends StObject
       with HtmlAttributes
  inline def `[vlink]`: `[vlink]` = "[vlink]".asInstanceOf[`[vlink]`]
  
  @js.native
  sealed trait `[vspace]`
    extends StObject
       with HtmlAttributes
  inline def `[vspace]`: `[vspace]` = "[vspace]".asInstanceOf[`[vspace]`]
  
  @js.native
  sealed trait `[webkitallowfullscreen]`
    extends StObject
       with HtmlAttributes
  inline def `[webkitallowfullscreen]`: `[webkitallowfullscreen]` = "[webkitallowfullscreen]".asInstanceOf[`[webkitallowfullscreen]`]
  
  @js.native
  sealed trait `[white-space]`
    extends StObject
       with SvgAttributes
  inline def `[white-space]`: `[white-space]` = "[white-space]".asInstanceOf[`[white-space]`]
  
  @js.native
  sealed trait `[width]`
    extends StObject
       with HtmlAttributes
       with SvgAttributes
  inline def `[width]`: `[width]` = "[width]".asInstanceOf[`[width]`]
  
  @js.native
  sealed trait `[widths]`
    extends StObject
       with SvgAttributes
  inline def `[widths]`: `[widths]` = "[widths]".asInstanceOf[`[widths]`]
  
  @js.native
  sealed trait `[word-spacing]`
    extends StObject
       with SvgAttributes
  inline def `[word-spacing]`: `[word-spacing]` = "[word-spacing]".asInstanceOf[`[word-spacing]`]
  
  @js.native
  sealed trait `[wrap]`
    extends StObject
       with HtmlAttributes
  inline def `[wrap]`: `[wrap]` = "[wrap]".asInstanceOf[`[wrap]`]
  
  @js.native
  sealed trait `[writing-mode]`
    extends StObject
       with SvgAttributes
  inline def `[writing-mode]`: `[writing-mode]` = "[writing-mode]".asInstanceOf[`[writing-mode]`]
  
  @js.native
  sealed trait `[x-height]`
    extends StObject
       with SvgAttributes
  inline def `[x-height]`: `[x-height]` = "[x-height]".asInstanceOf[`[x-height]`]
  
  @js.native
  sealed trait `[x-moz-errormessage]`
    extends StObject
       with HtmlAttributes
  inline def `[x-moz-errormessage]`: `[x-moz-errormessage]` = "[x-moz-errormessage]".asInstanceOf[`[x-moz-errormessage]`]
  
  @js.native
  sealed trait `[x1]`
    extends StObject
       with SvgAttributes
  inline def `[x1]`: `[x1]` = "[x1]".asInstanceOf[`[x1]`]
  
  @js.native
  sealed trait `[x2]`
    extends StObject
       with SvgAttributes
  inline def `[x2]`: `[x2]` = "[x2]".asInstanceOf[`[x2]`]
  
  @js.native
  sealed trait `[xChannelSelector]`
    extends StObject
       with SvgAttributes
  inline def `[xChannelSelector]`: `[xChannelSelector]` = "[xChannelSelector]".asInstanceOf[`[xChannelSelector]`]
  
  @js.native
  sealed trait `[x]`
    extends StObject
       with SvgAttributes
  inline def `[x]`: `[x]` = "[x]".asInstanceOf[`[x]`]
  
  @js.native
  sealed trait `[xmlns]`
    extends StObject
       with HtmlAttributes
  inline def `[xmlns]`: `[xmlns]` = "[xmlns]".asInstanceOf[`[xmlns]`]
  
  @js.native
  sealed trait `[y1]`
    extends StObject
       with SvgAttributes
  inline def `[y1]`: `[y1]` = "[y1]".asInstanceOf[`[y1]`]
  
  @js.native
  sealed trait `[y2]`
    extends StObject
       with SvgAttributes
  inline def `[y2]`: `[y2]` = "[y2]".asInstanceOf[`[y2]`]
  
  @js.native
  sealed trait `[yChannelSelector]`
    extends StObject
       with SvgAttributes
  inline def `[yChannelSelector]`: `[yChannelSelector]` = "[yChannelSelector]".asInstanceOf[`[yChannelSelector]`]
  
  @js.native
  sealed trait `[y]`
    extends StObject
       with SvgAttributes
  inline def `[y]`: `[y]` = "[y]".asInstanceOf[`[y]`]
  
  @js.native
  sealed trait `[z]`
    extends StObject
       with SvgAttributes
  inline def `[z]`: `[z]` = "[z]".asInstanceOf[`[z]`]
  
  @js.native
  sealed trait `[zoomAndPan]`
    extends StObject
       with SvgAttributes
  inline def `[zoomAndPan]`: `[zoomAndPan]` = "[zoomAndPan]".asInstanceOf[`[zoomAndPan]`]
  
  @js.native
  sealed trait above
    extends StObject
       with _WebkitBoxReflect[Any]
  inline def above: above = "above".asInstanceOf[above]
  
  @js.native
  sealed trait absolute
    extends StObject
       with Position
  inline def absolute: absolute = "absolute".asInstanceOf[absolute]
  
  @js.native
  sealed trait active
    extends StObject
       with ImeMode
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait add
    extends StObject
       with CompositingOperator
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait additive
    extends StObject
       with _System
  inline def additive: additive = "additive".asInstanceOf[additive]
  
  @js.native
  sealed trait after
    extends StObject
       with MsImeAlign
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait `after-edge`
    extends StObject
       with AlignmentBaseline
  inline def `after-edge`: `after-edge` = "after-edge".asInstanceOf[`after-edge`]
  
  @js.native
  sealed trait alias
    extends StObject
       with _Cursor
  inline def alias: alias = "alias".asInstanceOf[alias]
  
  @js.native
  sealed trait aliceblue
    extends StObject
       with NamedColor
  inline def aliceblue: aliceblue = "aliceblue".asInstanceOf[aliceblue]
  
  @js.native
  sealed trait all
    extends StObject
       with BreakAfter
       with BreakBefore
       with ColumnSpan
       with PointerEvents
       with TextDecorationSkipInk
       with UserSelect
       with _SingleTransition[Any]
       with _TextCombineUpright
       with _TransitionProperty
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait `all-petite-caps`
    extends StObject
       with FontVariantCaps
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  inline def `all-petite-caps`: `all-petite-caps` = "all-petite-caps".asInstanceOf[`all-petite-caps`]
  
  @js.native
  sealed trait `all-scroll`
    extends StObject
       with _Cursor
  inline def `all-scroll`: `all-scroll` = "all-scroll".asInstanceOf[`all-scroll`]
  
  @js.native
  sealed trait `all-small-caps`
    extends StObject
       with FontVariantCaps
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  inline def `all-small-caps`: `all-small-caps` = "all-small-caps".asInstanceOf[`all-small-caps`]
  
  @js.native
  sealed trait `allow-end`
    extends StObject
       with _HangingPunctuation
  inline def `allow-end`: `allow-end` = "allow-end".asInstanceOf[`allow-end`]
  
  @js.native
  sealed trait alpha
    extends StObject
       with MaskBorderMode
       with MaskType
       with MaskingMode
       with _MaskBorder
  inline def alpha: alpha = "alpha".asInstanceOf[alpha]
  
  @js.native
  sealed trait alphabetic
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
       with _System
  inline def alphabetic: alphabetic = "alphabetic".asInstanceOf[alphabetic]
  
  @js.native
  sealed trait alternate
    extends StObject
       with SingleAnimationDirection
       with _RubyPosition
  inline def alternate: alternate = "alternate".asInstanceOf[alternate]
  
  @js.native
  sealed trait `alternate-reverse`
    extends StObject
       with SingleAnimationDirection
  inline def `alternate-reverse`: `alternate-reverse` = "alternate-reverse".asInstanceOf[`alternate-reverse`]
  
  @js.native
  sealed trait always
    extends StObject
       with BreakAfter
       with BreakBefore
       with PageBreakAfter
       with PageBreakBefore
       with ScrollSnapStop
       with _FontSmooth[Any]
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait antiquewhite
    extends StObject
       with NamedColor
  inline def antiquewhite: antiquewhite = "antiquewhite".asInstanceOf[antiquewhite]
  
  @js.native
  sealed trait anywhere
    extends StObject
       with LineBreak
       with OverflowWrap
  inline def anywhere: anywhere = "anywhere".asInstanceOf[anywhere]
  
  @js.native
  sealed trait aqua
    extends StObject
       with NamedColor
  inline def aqua: aqua = "aqua".asInstanceOf[aqua]
  
  @js.native
  sealed trait aquamarine
    extends StObject
       with NamedColor
  inline def aquamarine: aquamarine = "aquamarine".asInstanceOf[aquamarine]
  
  @js.native
  sealed trait auto
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BreakAfter
       with BreakBefore
       with BreakInside
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ContentVisibility
       with DominantBaseline
       with FontDisplay
       with FontKerning
       with FontOpticalSizing
       with ForcedColorAdjust
       with Hyphens
       with ImageRendering
       with ImeMode
       with InputSecurity
       with Isolation
       with LineBreak
       with MozUserInput
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsWrapFlow
       with Orientation
       with OverflowAnchor
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with RubyMerge
       with ScrollBehavior
       with ScrollbarWidth
       with ShapeRendering
       with TableLayout
       with TextAlignLast
       with TextDecorationSkipInk
       with TextJustify
       with TextRendering
       with UserSelect
       with ViewportFit
       with WebkitOverflowScrolling
       with _AccentColor
       with _AlignSelf
       with _AspectRatio
       with _BgSize[Any]
       with _BlockSize[Any]
       with _BorderImageWidth[Any]
       with _Bottom[Any]
       with _CaretColor
       with _Clip
       with _ColumnCount
       with _ColumnWidth[Any]
       with _Columns[Any]
       with _Cursor
       with _Flex[Any]
       with _FlexBasis[Any]
       with _FontSmooth[Any]
       with _GlyphOrientationVertical
       with _Height[Any]
       with _HyphenateCharacter
       with _InlineSize[Any]
       with _Inset[Any]
       with _InsetBlock[Any]
       with _InsetBlockEnd[Any]
       with _InsetBlockStart[Any]
       with _InsetInline[Any]
       with _InsetInlineEnd[Any]
       with _InsetInlineStart[Any]
       with _JustifySelf
       with _Left[Any]
       with _Margin[Any]
       with _MarginBlock[Any]
       with _MarginBlockEnd[Any]
       with _MarginBlockStart[Any]
       with _MarginBottom[Any]
       with _MarginInline[Any]
       with _MarginInlineEnd[Any]
       with _MarginInlineStart[Any]
       with _MarginLeft[Any]
       with _MarginRight[Any]
       with _MarginTop[Any]
       with _MaskBorderWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _MozImageRegion
       with _MsHyphenateLimitChars
       with _MsScrollLimitXMax[Any]
       with _MsScrollLimitYMax[Any]
       with _Offset[Any]
       with _OffsetAnchor[Any]
       with _OffsetRotate
       with _Outline[Any]
       with _OutlineStyle
       with _Overflow
       with _OverscrollBehavior
       with _PlaceSelf
       with _Quotes
       with _Right[Any]
       with _ScrollPadding[Any]
       with _ScrollPaddingBlock[Any]
       with _ScrollPaddingBlockEnd[Any]
       with _ScrollPaddingBlockStart[Any]
       with _ScrollPaddingBottom[Any]
       with _ScrollPaddingInline[Any]
       with _ScrollPaddingInlineEnd[Any]
       with _ScrollPaddingInlineStart[Any]
       with _ScrollPaddingLeft[Any]
       with _ScrollPaddingRight[Any]
       with _ScrollPaddingTop[Any]
       with _ScrollbarColor
       with _ScrollbarGutter
       with _SingleAnimationTimeline
       with _Size[Any]
       with _SpeakAs
       with _TextDecoration[Any]
       with _TextDecorationThickness[Any]
       with _TextSizeAdjust
       with _TextUnderlineOffset[Any]
       with _TextUnderlinePosition
       with _Top[Any]
       with _TouchAction
       with _TrackBreadth[Any]
       with _Width[Any]
       with _WillChange
       with _ZIndex
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait `auto-add`
    extends StObject
       with _MathDepth
  inline def `auto-add`: `auto-add` = "auto-add".asInstanceOf[`auto-add`]
  
  @js.native
  sealed trait avoid
    extends StObject
       with BreakAfter
       with BreakBefore
       with BreakInside
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
  inline def avoid: avoid = "avoid".asInstanceOf[avoid]
  
  @js.native
  sealed trait `avoid-column`
    extends StObject
       with BreakAfter
       with BreakBefore
       with BreakInside
  inline def `avoid-column`: `avoid-column` = "avoid-column".asInstanceOf[`avoid-column`]
  
  @js.native
  sealed trait `avoid-page`
    extends StObject
       with BreakAfter
       with BreakBefore
       with BreakInside
  inline def `avoid-page`: `avoid-page` = "avoid-page".asInstanceOf[`avoid-page`]
  
  @js.native
  sealed trait `avoid-region`
    extends StObject
       with BreakAfter
       with BreakBefore
       with BreakInside
  inline def `avoid-region`: `avoid-region` = "avoid-region".asInstanceOf[`avoid-region`]
  
  @js.native
  sealed trait azure
    extends StObject
       with NamedColor
  inline def azure: azure = "azure".asInstanceOf[azure]
  
  @js.native
  sealed trait backwards
    extends StObject
       with SingleAnimationFillMode
  inline def backwards: backwards = "backwards".asInstanceOf[backwards]
  
  @js.native
  sealed trait balance
    extends StObject
       with ColumnFill
  inline def balance: balance = "balance".asInstanceOf[balance]
  
  @js.native
  sealed trait `balance-all`
    extends StObject
       with ColumnFill
  inline def `balance-all`: `balance-all` = "balance-all".asInstanceOf[`balance-all`]
  
  @js.native
  sealed trait baseline
    extends StObject
       with AlignmentBaseline
       with BoxAlign
       with _AlignContent
       with _AlignItems
       with _AlignSelf
       with _AlignTracks
       with _BaselineShift[Any]
       with _JustifyItems
       with _JustifySelf
       with _PlaceContent
       with _PlaceItems
       with _PlaceSelf
       with _VerticalAlign[Any]
  inline def baseline: baseline = "baseline".asInstanceOf[baseline]
  
  @js.native
  sealed trait `before-edge`
    extends StObject
       with AlignmentBaseline
  inline def `before-edge`: `before-edge` = "before-edge".asInstanceOf[`before-edge`]
  
  @js.native
  sealed trait behind
    extends StObject
       with _Azimuth
  inline def behind: behind = "behind".asInstanceOf[behind]
  
  @js.native
  sealed trait beige
    extends StObject
       with NamedColor
  inline def beige: beige = "beige".asInstanceOf[beige]
  
  @js.native
  sealed trait below
    extends StObject
       with _WebkitBoxReflect[Any]
  inline def below: below = "below".asInstanceOf[below]
  
  @js.native
  sealed trait bevel
    extends StObject
       with StrokeLinejoin
  inline def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @js.native
  sealed trait `bidi-override`
    extends StObject
       with UnicodeBidi
  inline def `bidi-override`: `bidi-override` = "bidi-override".asInstanceOf[`bidi-override`]
  
  @js.native
  sealed trait bisque
    extends StObject
       with NamedColor
  inline def bisque: bisque = "bisque".asInstanceOf[bisque]
  
  @js.native
  sealed trait black
    extends StObject
       with NamedColor
  inline def black: black = "black".asInstanceOf[black]
  
  @js.native
  sealed trait blanchedalmond
    extends StObject
       with NamedColor
  inline def blanchedalmond: blanchedalmond = "blanchedalmond".asInstanceOf[blanchedalmond]
  
  @js.native
  sealed trait blink
    extends StObject
       with MozTextBlink
       with _TextDecoration[Any]
       with _TextDecorationLine
  inline def blink: blink = "blink".asInstanceOf[blink]
  
  @js.native
  sealed trait block
    extends StObject
       with DisplayOutside
       with FontDisplay
       with MozOrient
       with Resize
       with _ScrollSnapType
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait `block-axis`
    extends StObject
       with BoxOrient
  inline def `block-axis`: `block-axis` = "block-axis".asInstanceOf[`block-axis`]
  
  @js.native
  sealed trait `block-end`
    extends StObject
       with CaptionSide
  inline def `block-end`: `block-end` = "block-end".asInstanceOf[`block-end`]
  
  @js.native
  sealed trait `block-start`
    extends StObject
       with CaptionSide
  inline def `block-start`: `block-start` = "block-start".asInstanceOf[`block-start`]
  
  @js.native
  sealed trait blue
    extends StObject
       with NamedColor
  inline def blue: blue = "blue".asInstanceOf[blue]
  
  @js.native
  sealed trait blueviolet
    extends StObject
       with NamedColor
  inline def blueviolet: blueviolet = "blueviolet".asInstanceOf[blueviolet]
  
  @js.native
  sealed trait bold
    extends StObject
       with _FontWeightAbsolute
  inline def bold: bold = "bold".asInstanceOf[bold]
  
  @js.native
  sealed trait bolder
    extends StObject
       with _FontWeight
  inline def bolder: bolder = "bolder".asInstanceOf[bolder]
  
  @js.native
  sealed trait border
    extends StObject
       with _WebkitMask[Any]
       with _WebkitMaskClip
       with _WebkitMaskOrigin
  inline def border: border = "border".asInstanceOf[border]
  
  @js.native
  sealed trait `border-box`
    extends StObject
       with Box
       with BoxSizing
       with GeometryBox
       with MozFloatEdge
       with TransformBox
       with VisualBox
  inline def `border-box`: `border-box` = "border-box".asInstanceOf[`border-box`]
  
  @js.native
  sealed trait both
    extends StObject
       with Clear
       with MsWrapFlow
       with Resize
       with SingleAnimationFillMode
       with _ScrollSnapType
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait bottom
    extends StObject
       with CaptionSide
       with _BackgroundPositionY[Any]
       with _BgPosition[Any]
       with _Position[Any]
       with _TransformOrigin[Any]
       with _VerticalAlign[Any]
       with _WebkitMaskPositionY[Any]
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait `box-decoration`
    extends StObject
       with _TextDecorationSkip
  inline def `box-decoration`: `box-decoration` = "box-decoration".asInstanceOf[`box-decoration`]
  
  @js.native
  sealed trait `break-all`
    extends StObject
       with WordBreak
  inline def `break-all`: `break-all` = "break-all".asInstanceOf[`break-all`]
  
  @js.native
  sealed trait `break-spaces`
    extends StObject
       with WhiteSpace
  inline def `break-spaces`: `break-spaces` = "break-spaces".asInstanceOf[`break-spaces`]
  
  @js.native
  sealed trait `break-word`
    extends StObject
       with OverflowWrap
       with WordBreak
       with WordWrap
  inline def `break-word`: `break-word` = "break-word".asInstanceOf[`break-word`]
  
  @js.native
  sealed trait brown
    extends StObject
       with NamedColor
  inline def brown: brown = "brown".asInstanceOf[brown]
  
  @js.native
  sealed trait bt
    extends StObject
       with MsBlockProgression
  inline def bt: bt = "bt".asInstanceOf[bt]
  
  @js.native
  sealed trait bullets
    extends StObject
       with _SpeakAs
  inline def bullets: bullets = "bullets".asInstanceOf[bullets]
  
  @js.native
  sealed trait burlywood
    extends StObject
       with NamedColor
  inline def burlywood: burlywood = "burlywood".asInstanceOf[burlywood]
  
  @js.native
  sealed trait butt
    extends StObject
       with StrokeLinecap
  inline def butt: butt = "butt".asInstanceOf[butt]
  
  @js.native
  sealed trait button
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  inline def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait `button-arrow-down`
    extends StObject
       with MozAppearance
  inline def `button-arrow-down`: `button-arrow-down` = "button-arrow-down".asInstanceOf[`button-arrow-down`]
  
  @js.native
  sealed trait `button-arrow-next`
    extends StObject
       with MozAppearance
  inline def `button-arrow-next`: `button-arrow-next` = "button-arrow-next".asInstanceOf[`button-arrow-next`]
  
  @js.native
  sealed trait `button-arrow-previous`
    extends StObject
       with MozAppearance
  inline def `button-arrow-previous`: `button-arrow-previous` = "button-arrow-previous".asInstanceOf[`button-arrow-previous`]
  
  @js.native
  sealed trait `button-arrow-up`
    extends StObject
       with MozAppearance
  inline def `button-arrow-up`: `button-arrow-up` = "button-arrow-up".asInstanceOf[`button-arrow-up`]
  
  @js.native
  sealed trait `button-bevel`
    extends StObject
       with MozAppearance
       with WebkitAppearance
  inline def `button-bevel`: `button-bevel` = "button-bevel".asInstanceOf[`button-bevel`]
  
  @js.native
  sealed trait `button-focus`
    extends StObject
       with MozAppearance
  inline def `button-focus`: `button-focus` = "button-focus".asInstanceOf[`button-focus`]
  
  @js.native
  sealed trait cadetblue
    extends StObject
       with NamedColor
  inline def cadetblue: cadetblue = "cadetblue".asInstanceOf[cadetblue]
  
  @js.native
  sealed trait capitalize
    extends StObject
       with TextTransform
  inline def capitalize: capitalize = "capitalize".asInstanceOf[capitalize]
  
  @js.native
  sealed trait caption
    extends StObject
       with _Font
  inline def caption: caption = "caption".asInstanceOf[caption]
  
  @js.native
  sealed trait caret
    extends StObject
       with MozAppearance
       with WebkitAppearance
  inline def caret: caret = "caret".asInstanceOf[caret]
  
  @js.native
  sealed trait cell
    extends StObject
       with _Cursor
  inline def cell: cell = "cell".asInstanceOf[cell]
  
  @js.native
  sealed trait center
    extends StObject
       with BoxAlign
       with BoxPack
       with ContentPosition
       with RubyAlign
       with SelfPosition
       with TextAlign
       with TextAlignLast
       with _Azimuth
       with _BackgroundPositionX[Any]
       with _BackgroundPositionY[Any]
       with _BgPosition[Any]
       with _Position[Any]
       with _ScrollSnapAlign
       with _TransformOrigin[Any]
       with _WebkitMaskPositionX[Any]
       with _WebkitMaskPositionY[Any]
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait `center-left`
    extends StObject
       with _Azimuth
  inline def `center-left`: `center-left` = "center-left".asInstanceOf[`center-left`]
  
  @js.native
  sealed trait `center-right`
    extends StObject
       with _Azimuth
  inline def `center-right`: `center-right` = "center-right".asInstanceOf[`center-right`]
  
  @js.native
  sealed trait central
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  inline def central: central = "central".asInstanceOf[central]
  
  @js.native
  sealed trait chained
    extends StObject
       with MsContentZoomChaining
       with MsScrollChaining
  inline def chained: chained = "chained".asInstanceOf[chained]
  
  @js.native
  sealed trait chartreuse
    extends StObject
       with NamedColor
  inline def chartreuse: chartreuse = "chartreuse".asInstanceOf[chartreuse]
  
  @js.native
  sealed trait checkbox
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  inline def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait `checkbox-container`
    extends StObject
       with MozAppearance
  inline def `checkbox-container`: `checkbox-container` = "checkbox-container".asInstanceOf[`checkbox-container`]
  
  @js.native
  sealed trait `checkbox-label`
    extends StObject
       with MozAppearance
  inline def `checkbox-label`: `checkbox-label` = "checkbox-label".asInstanceOf[`checkbox-label`]
  
  @js.native
  sealed trait checkmenuitem
    extends StObject
       with MozAppearance
  inline def checkmenuitem: checkmenuitem = "checkmenuitem".asInstanceOf[checkmenuitem]
  
  @js.native
  sealed trait child
    extends StObject
       with _Paint
  inline def child: child = "child".asInstanceOf[child]
  
  @js.native
  sealed trait chocolate
    extends StObject
       with NamedColor
  inline def chocolate: chocolate = "chocolate".asInstanceOf[chocolate]
  
  @js.native
  sealed trait circle
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  inline def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait clear
    extends StObject
       with CompositeStyle
       with MsWrapFlow
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait clip
    extends StObject
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with _BlockOverflow
       with _Overflow
       with _TextOverflow
  inline def clip: clip = "clip".asInstanceOf[clip]
  
  @js.native
  sealed trait clone
    extends StObject
       with BoxDecorationBreak
  
  @js.native
  sealed trait `close-quote`
    extends StObject
       with Quote
  inline def `close-quote`: `close-quote` = "close-quote".asInstanceOf[`close-quote`]
  
  @js.native
  sealed trait `col-resize`
    extends StObject
       with _Cursor
  inline def `col-resize`: `col-resize` = "col-resize".asInstanceOf[`col-resize`]
  
  @js.native
  sealed trait collapse
    extends StObject
       with BorderCollapse
       with RubyMerge
       with Visibility
  inline def collapse: collapse = "collapse".asInstanceOf[collapse]
  
  @js.native
  sealed trait color
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait `color-burn`
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def `color-burn`: `color-burn` = "color-burn".asInstanceOf[`color-burn`]
  
  @js.native
  sealed trait `color-dodge`
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def `color-dodge`: `color-dodge` = "color-dodge".asInstanceOf[`color-dodge`]
  
  @js.native
  sealed trait column
    extends StObject
       with BreakAfter
       with BreakBefore
       with FlexDirection
       with _FlexFlow
       with _GridAutoFlow
  inline def column: column = "column".asInstanceOf[column]
  
  @js.native
  sealed trait `column-reverse`
    extends StObject
       with FlexDirection
       with _FlexFlow
  inline def `column-reverse`: `column-reverse` = "column-reverse".asInstanceOf[`column-reverse`]
  
  @js.native
  sealed trait `common-ligatures`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  inline def `common-ligatures`: `common-ligatures` = "common-ligatures".asInstanceOf[`common-ligatures`]
  
  @js.native
  sealed trait compact
    extends StObject
       with MathShift
       with MathStyle
  inline def compact: compact = "compact".asInstanceOf[compact]
  
  @js.native
  sealed trait condensed
    extends StObject
       with _FontStretchAbsolute
  inline def condensed: condensed = "condensed".asInstanceOf[condensed]
  
  @js.native
  sealed trait contain
    extends StObject
       with ObjectFit
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with UserSelect
       with ViewportFit
       with _BgSize[Any]
       with _OverscrollBehavior
  inline def contain: contain = "contain".asInstanceOf[contain]
  
  @js.native
  sealed trait content
    extends StObject
       with _Contain
       with _Flex[Any]
       with _FlexBasis[Any]
       with _WebkitMask[Any]
       with _WebkitMaskClip
       with _WebkitMaskOrigin
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait `content-box`
    extends StObject
       with Box
       with BoxSizing
       with GeometryBox
       with MozFloatEdge
       with OverflowClipBox
       with TransformBox
       with VisualBox
  inline def `content-box`: `content-box` = "content-box".asInstanceOf[`content-box`]
  
  @js.native
  sealed trait contents
    extends StObject
       with _AnimateableFeature
       with _ContentList
       with _Display
  inline def contents: contents = "contents".asInstanceOf[contents]
  
  @js.native
  sealed trait `context-fill`
    extends StObject
       with _Paint
  inline def `context-fill`: `context-fill` = "context-fill".asInstanceOf[`context-fill`]
  
  @js.native
  sealed trait `context-menu`
    extends StObject
       with _Cursor
  inline def `context-menu`: `context-menu` = "context-menu".asInstanceOf[`context-menu`]
  
  @js.native
  sealed trait `context-stroke`
    extends StObject
       with _Paint
  inline def `context-stroke`: `context-stroke` = "context-stroke".asInstanceOf[`context-stroke`]
  
  @js.native
  sealed trait contextual
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  inline def contextual: contextual = "contextual".asInstanceOf[contextual]
  
  @js.native
  sealed trait copy
    extends StObject
       with CompositeStyle
       with _Cursor
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait coral
    extends StObject
       with NamedColor
  inline def coral: coral = "coral".asInstanceOf[coral]
  
  @js.native
  sealed trait cornflowerblue
    extends StObject
       with NamedColor
  inline def cornflowerblue: cornflowerblue = "cornflowerblue".asInstanceOf[cornflowerblue]
  
  @js.native
  sealed trait cornsilk
    extends StObject
       with NamedColor
  inline def cornsilk: cornsilk = "cornsilk".asInstanceOf[cornsilk]
  
  @js.native
  sealed trait cover
    extends StObject
       with ObjectFit
       with ViewportFit
       with _BgSize[Any]
  inline def cover: cover = "cover".asInstanceOf[cover]
  
  @js.native
  sealed trait crimson
    extends StObject
       with NamedColor
  inline def crimson: crimson = "crimson".asInstanceOf[crimson]
  
  @js.native
  sealed trait `crisp-edges`
    extends StObject
       with ImageRendering
  inline def `crisp-edges`: `crisp-edges` = "crisp-edges".asInstanceOf[`crisp-edges`]
  
  @js.native
  sealed trait crispEdges
    extends StObject
       with ShapeRendering
  inline def crispEdges: crispEdges = "crispEdges".asInstanceOf[crispEdges]
  
  @js.native
  sealed trait crop
    extends StObject
       with _Marks
  inline def crop: crop = "crop".asInstanceOf[crop]
  
  @js.native
  sealed trait cross
    extends StObject
       with _Marks
  inline def cross: cross = "cross".asInstanceOf[cross]
  
  @js.native
  sealed trait crosshair
    extends StObject
       with _Cursor
  inline def crosshair: crosshair = "crosshair".asInstanceOf[crosshair]
  
  @js.native
  sealed trait currentColor
    extends StObject
       with _FloodColor
       with _LightingColor
       with _StopColor
  inline def currentColor: currentColor = "currentColor".asInstanceOf[currentColor]
  
  @js.native
  sealed trait currentcolor_
    extends StObject
       with _Color
  inline def currentcolor_ : currentcolor_ = "currentcolor".asInstanceOf[currentcolor_]
  
  @js.native
  sealed trait cursive
    extends StObject
       with GenericFamily
  inline def cursive: cursive = "cursive".asInstanceOf[cursive]
  
  @js.native
  sealed trait cyan
    extends StObject
       with NamedColor
  inline def cyan: cyan = "cyan".asInstanceOf[cyan]
  
  @js.native
  sealed trait cyclic
    extends StObject
       with _System
  inline def cyclic: cyclic = "cyclic".asInstanceOf[cyclic]
  
  @js.native
  sealed trait dark
    extends StObject
       with _ColorScheme
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait darkblue
    extends StObject
       with NamedColor
  inline def darkblue: darkblue = "darkblue".asInstanceOf[darkblue]
  
  @js.native
  sealed trait darkcyan
    extends StObject
       with NamedColor
  inline def darkcyan: darkcyan = "darkcyan".asInstanceOf[darkcyan]
  
  @js.native
  sealed trait darken
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def darken: darken = "darken".asInstanceOf[darken]
  
  @js.native
  sealed trait darkgoldenrod
    extends StObject
       with NamedColor
  inline def darkgoldenrod: darkgoldenrod = "darkgoldenrod".asInstanceOf[darkgoldenrod]
  
  @js.native
  sealed trait darkgray
    extends StObject
       with NamedColor
  inline def darkgray: darkgray = "darkgray".asInstanceOf[darkgray]
  
  @js.native
  sealed trait darkgreen
    extends StObject
       with NamedColor
  inline def darkgreen: darkgreen = "darkgreen".asInstanceOf[darkgreen]
  
  @js.native
  sealed trait darkgrey
    extends StObject
       with NamedColor
  inline def darkgrey: darkgrey = "darkgrey".asInstanceOf[darkgrey]
  
  @js.native
  sealed trait darkkhaki
    extends StObject
       with NamedColor
  inline def darkkhaki: darkkhaki = "darkkhaki".asInstanceOf[darkkhaki]
  
  @js.native
  sealed trait darkmagenta
    extends StObject
       with NamedColor
  inline def darkmagenta: darkmagenta = "darkmagenta".asInstanceOf[darkmagenta]
  
  @js.native
  sealed trait darkolivegreen
    extends StObject
       with NamedColor
  inline def darkolivegreen: darkolivegreen = "darkolivegreen".asInstanceOf[darkolivegreen]
  
  @js.native
  sealed trait darkorange
    extends StObject
       with NamedColor
  inline def darkorange: darkorange = "darkorange".asInstanceOf[darkorange]
  
  @js.native
  sealed trait darkorchid
    extends StObject
       with NamedColor
  inline def darkorchid: darkorchid = "darkorchid".asInstanceOf[darkorchid]
  
  @js.native
  sealed trait darkred
    extends StObject
       with NamedColor
  inline def darkred: darkred = "darkred".asInstanceOf[darkred]
  
  @js.native
  sealed trait darksalmon
    extends StObject
       with NamedColor
  inline def darksalmon: darksalmon = "darksalmon".asInstanceOf[darksalmon]
  
  @js.native
  sealed trait darkseagreen
    extends StObject
       with NamedColor
  inline def darkseagreen: darkseagreen = "darkseagreen".asInstanceOf[darkseagreen]
  
  @js.native
  sealed trait darkslateblue
    extends StObject
       with NamedColor
  inline def darkslateblue: darkslateblue = "darkslateblue".asInstanceOf[darkslateblue]
  
  @js.native
  sealed trait darkslategray
    extends StObject
       with NamedColor
  inline def darkslategray: darkslategray = "darkslategray".asInstanceOf[darkslategray]
  
  @js.native
  sealed trait darkslategrey
    extends StObject
       with NamedColor
  inline def darkslategrey: darkslategrey = "darkslategrey".asInstanceOf[darkslategrey]
  
  @js.native
  sealed trait darkturquoise
    extends StObject
       with NamedColor
  inline def darkturquoise: darkturquoise = "darkturquoise".asInstanceOf[darkturquoise]
  
  @js.native
  sealed trait darkviolet
    extends StObject
       with NamedColor
  inline def darkviolet: darkviolet = "darkviolet".asInstanceOf[darkviolet]
  
  @js.native
  sealed trait dashed
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
       with TextDecorationStyle
       with _TextDecoration[Any]
  inline def dashed: dashed = "dashed".asInstanceOf[dashed]
  
  @js.native
  sealed trait deeppink
    extends StObject
       with NamedColor
  inline def deeppink: deeppink = "deeppink".asInstanceOf[deeppink]
  
  @js.native
  sealed trait deepskyblue
    extends StObject
       with NamedColor
  inline def deepskyblue: deepskyblue = "deepskyblue".asInstanceOf[deepskyblue]
  
  @js.native
  sealed trait `default-button`
    extends StObject
       with WebkitAppearance
  inline def `default-button`: `default-button` = "default-button".asInstanceOf[`default-button`]
  
  @js.native
  sealed trait dense
    extends StObject
       with _GridAutoFlow
  inline def dense: dense = "dense".asInstanceOf[dense]
  
  @js.native
  sealed trait `destination-atop`
    extends StObject
       with CompositeStyle
  inline def `destination-atop`: `destination-atop` = "destination-atop".asInstanceOf[`destination-atop`]
  
  @js.native
  sealed trait `destination-in`
    extends StObject
       with CompositeStyle
  inline def `destination-in`: `destination-in` = "destination-in".asInstanceOf[`destination-in`]
  
  @js.native
  sealed trait `destination-out`
    extends StObject
       with CompositeStyle
  inline def `destination-out`: `destination-out` = "destination-out".asInstanceOf[`destination-out`]
  
  @js.native
  sealed trait `destination-over`
    extends StObject
       with CompositeStyle
  inline def `destination-over`: `destination-over` = "destination-over".asInstanceOf[`destination-over`]
  
  @js.native
  sealed trait `diagonal-fractions`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  inline def `diagonal-fractions`: `diagonal-fractions` = "diagonal-fractions".asInstanceOf[`diagonal-fractions`]
  
  @js.native
  sealed trait difference
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def difference: difference = "difference".asInstanceOf[difference]
  
  @js.native
  sealed trait dimgray
    extends StObject
       with NamedColor
  inline def dimgray: dimgray = "dimgray".asInstanceOf[dimgray]
  
  @js.native
  sealed trait dimgrey
    extends StObject
       with NamedColor
  inline def dimgrey: dimgrey = "dimgrey".asInstanceOf[dimgrey]
  
  @js.native
  sealed trait disabled
    extends StObject
       with ImeMode
       with MozUserInput
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait `discretionary-ligatures`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  inline def `discretionary-ligatures`: `discretionary-ligatures` = "discretionary-ligatures".asInstanceOf[`discretionary-ligatures`]
  
  @js.native
  sealed trait dodgerblue
    extends StObject
       with NamedColor
  inline def dodgerblue: dodgerblue = "dodgerblue".asInstanceOf[dodgerblue]
  
  @js.native
  sealed trait dot
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  inline def dot: dot = "dot".asInstanceOf[dot]
  
  @js.native
  sealed trait dotted
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
       with TextDecorationStyle
       with _TextDecoration[Any]
  inline def dotted: dotted = "dotted".asInstanceOf[dotted]
  
  @js.native
  sealed trait double
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
       with TextDecorationStyle
       with _TextDecoration[Any]
  inline def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait `double-circle`
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  inline def `double-circle`: `double-circle` = "double-circle".asInstanceOf[`double-circle`]
  
  @js.native
  sealed trait drag
    extends StObject
       with MozWindowDragging
  inline def drag: drag = "drag".asInstanceOf[drag]
  
  @js.native
  sealed trait dualbutton
    extends StObject
       with MozAppearance
  inline def dualbutton: dualbutton = "dualbutton".asInstanceOf[dualbutton]
  
  @js.native
  sealed trait `e-resize`
    extends StObject
       with _Cursor
  inline def `e-resize`: `e-resize` = "e-resize".asInstanceOf[`e-resize`]
  
  @js.native
  sealed trait ease
    extends StObject
       with _CubicBezierTimingFunction
  inline def ease: ease = "ease".asInstanceOf[ease]
  
  @js.native
  sealed trait `ease-in`
    extends StObject
       with _CubicBezierTimingFunction
  inline def `ease-in`: `ease-in` = "ease-in".asInstanceOf[`ease-in`]
  
  @js.native
  sealed trait `ease-in-out`
    extends StObject
       with _CubicBezierTimingFunction
  inline def `ease-in-out`: `ease-in-out` = "ease-in-out".asInstanceOf[`ease-in-out`]
  
  @js.native
  sealed trait `ease-out`
    extends StObject
       with _CubicBezierTimingFunction
  inline def `ease-out`: `ease-out` = "ease-out".asInstanceOf[`ease-out`]
  
  @js.native
  sealed trait economy
    extends StObject
       with PrintColorAdjust
  inline def economy: economy = "economy".asInstanceOf[economy]
  
  @js.native
  sealed trait edges
    extends StObject
       with _TextDecorationSkip
  inline def edges: edges = "edges".asInstanceOf[edges]
  
  @js.native
  sealed trait element
    extends StObject
       with MsUserSelect
       with UserSelect
  inline def element: element = "element".asInstanceOf[element]
  
  @js.native
  sealed trait ellipsis
    extends StObject
       with _BlockOverflow
       with _TextOverflow
  inline def ellipsis: ellipsis = "ellipsis".asInstanceOf[ellipsis]
  
  @js.native
  sealed trait embed
    extends StObject
       with UnicodeBidi
  inline def embed: embed = "embed".asInstanceOf[embed]
  
  @js.native
  sealed trait enabled
    extends StObject
       with MozUserInput
  inline def enabled: enabled = "enabled".asInstanceOf[enabled]
  
  @js.native
  sealed trait end
    extends StObject
       with BoxAlign
       with BoxPack
       with ContentPosition
       with MsWrapFlow
       with SelfPosition
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with _ScrollSnapAlign
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait evenodd
    extends StObject
       with ClipRule
       with FillRule
  inline def evenodd: evenodd = "evenodd".asInstanceOf[evenodd]
  
  @js.native
  sealed trait `ew-resize`
    extends StObject
       with _Cursor
  inline def `ew-resize`: `ew-resize` = "ew-resize".asInstanceOf[`ew-resize`]
  
  @js.native
  sealed trait exact
    extends StObject
       with PrintColorAdjust
  inline def exact: exact = "exact".asInstanceOf[exact]
  
  @js.native
  sealed trait exclude
    extends StObject
       with CompositingOperator
  inline def exclude: exclude = "exclude".asInstanceOf[exclude]
  
  @js.native
  sealed trait exclusion
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def exclusion: exclusion = "exclusion".asInstanceOf[exclusion]
  
  @js.native
  sealed trait expanded
    extends StObject
       with _FontStretchAbsolute
  inline def expanded: expanded = "expanded".asInstanceOf[expanded]
  
  @js.native
  sealed trait `extra-condensed`
    extends StObject
       with _FontStretchAbsolute
  inline def `extra-condensed`: `extra-condensed` = "extra-condensed".asInstanceOf[`extra-condensed`]
  
  @js.native
  sealed trait `extra-expanded`
    extends StObject
       with _FontStretchAbsolute
  inline def `extra-expanded`: `extra-expanded` = "extra-expanded".asInstanceOf[`extra-expanded`]
  
  @js.native
  sealed trait fallback
    extends StObject
       with FontDisplay
  inline def fallback: fallback = "fallback".asInstanceOf[fallback]
  
  @js.native
  sealed trait `false`
    extends StObject
       with Inherits
       with MsAccelerator
  inline def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait fantasy
    extends StObject
       with GenericFamily
  inline def fantasy: fantasy = "fantasy".asInstanceOf[fantasy]
  
  @js.native
  sealed trait `far-left`
    extends StObject
       with _Azimuth
  inline def `far-left`: `far-left` = "far-left".asInstanceOf[`far-left`]
  
  @js.native
  sealed trait `far-right`
    extends StObject
       with _Azimuth
  inline def `far-right`: `far-right` = "far-right".asInstanceOf[`far-right`]
  
  @js.native
  sealed trait fill
    extends StObject
       with ObjectFit
       with PointerEvents
       with _MozContextProperties
       with _PaintOrder
  inline def fill: fill = "fill".asInstanceOf[fill]
  
  @js.native
  sealed trait `fill-box`
    extends StObject
       with GeometryBox
       with TransformBox
  inline def `fill-box`: `fill-box` = "fill-box".asInstanceOf[`fill-box`]
  
  @js.native
  sealed trait `fill-opacity`
    extends StObject
       with _MozContextProperties
  inline def `fill-opacity`: `fill-opacity` = "fill-opacity".asInstanceOf[`fill-opacity`]
  
  @js.native
  sealed trait filled
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  inline def filled: filled = "filled".asInstanceOf[filled]
  
  @js.native
  sealed trait firebrick
    extends StObject
       with NamedColor
  inline def firebrick: firebrick = "firebrick".asInstanceOf[firebrick]
  
  @js.native
  sealed trait first
    extends StObject
       with _HangingPunctuation
  inline def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait `fit-content`
    extends StObject
       with _BlockSize[Any]
       with _Flex[Any]
       with _FlexBasis[Any]
       with _Height[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _Width[Any]
  inline def `fit-content`: `fit-content` = "fit-content".asInstanceOf[`fit-content`]
  
  @js.native
  sealed trait fixed
    extends StObject
       with Attachment
       with Position
       with TableLayout
       with UserZoom
       with _System
  inline def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait flat
    extends StObject
       with TransformStyle
  inline def flat: flat = "flat".asInstanceOf[flat]
  
  @js.native
  sealed trait flex
    extends StObject
       with DisplayInside
  inline def flex: flex = "flex".asInstanceOf[flex]
  
  @js.native
  sealed trait `flex-end`
    extends StObject
       with ContentPosition
       with SelfPosition
  inline def `flex-end`: `flex-end` = "flex-end".asInstanceOf[`flex-end`]
  
  @js.native
  sealed trait `flex-start`
    extends StObject
       with ContentPosition
       with SelfPosition
  inline def `flex-start`: `flex-start` = "flex-start".asInstanceOf[`flex-start`]
  
  @js.native
  sealed trait flip
    extends StObject
       with _ImageOrientation
  inline def flip: flip = "flip".asInstanceOf[flip]
  
  @js.native
  sealed trait floralwhite
    extends StObject
       with NamedColor
  inline def floralwhite: floralwhite = "floralwhite".asInstanceOf[floralwhite]
  
  @js.native
  sealed trait flow
    extends StObject
       with DisplayInside
  inline def flow: flow = "flow".asInstanceOf[flow]
  
  @js.native
  sealed trait `flow-root`
    extends StObject
       with DisplayInside
  inline def `flow-root`: `flow-root` = "flow-root".asInstanceOf[`flow-root`]
  
  @js.native
  sealed trait `force-end`
    extends StObject
       with _HangingPunctuation
  inline def `force-end`: `force-end` = "force-end".asInstanceOf[`force-end`]
  
  @js.native
  sealed trait forestgreen
    extends StObject
       with NamedColor
  inline def forestgreen: forestgreen = "forestgreen".asInstanceOf[forestgreen]
  
  @js.native
  sealed trait forwards
    extends StObject
       with SingleAnimationFillMode
  inline def forwards: forwards = "forwards".asInstanceOf[forwards]
  
  @js.native
  sealed trait `from-font`
    extends StObject
       with _FontSizeAdjust
       with _TextDecoration[Any]
       with _TextDecorationThickness[Any]
       with _TextUnderlinePosition
  inline def `from-font`: `from-font` = "from-font".asInstanceOf[`from-font`]
  
  @js.native
  sealed trait `from-image`
    extends StObject
       with _ImageOrientation
       with _ImageResolution
  inline def `from-image`: `from-image` = "from-image".asInstanceOf[`from-image`]
  
  @js.native
  sealed trait fuchsia
    extends StObject
       with NamedColor
  inline def fuchsia: fuchsia = "fuchsia".asInstanceOf[fuchsia]
  
  @js.native
  sealed trait `full-size-kana`
    extends StObject
       with TextTransform
  inline def `full-size-kana`: `full-size-kana` = "full-size-kana".asInstanceOf[`full-size-kana`]
  
  @js.native
  sealed trait `full-width`
    extends StObject
       with TextTransform
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantEastAsian
  inline def `full-width`: `full-width` = "full-width".asInstanceOf[`full-width`]
  
  @js.native
  sealed trait gainsboro
    extends StObject
       with NamedColor
  inline def gainsboro: gainsboro = "gainsboro".asInstanceOf[gainsboro]
  
  @js.native
  sealed trait geometricPrecision
    extends StObject
       with ShapeRendering
       with TextRendering
  inline def geometricPrecision: geometricPrecision = "geometricPrecision".asInstanceOf[geometricPrecision]
  
  @js.native
  sealed trait ghostwhite
    extends StObject
       with NamedColor
  inline def ghostwhite: ghostwhite = "ghostwhite".asInstanceOf[ghostwhite]
  
  @js.native
  sealed trait gold
    extends StObject
       with NamedColor
  inline def gold: gold = "gold".asInstanceOf[gold]
  
  @js.native
  sealed trait goldenrod
    extends StObject
       with NamedColor
  inline def goldenrod: goldenrod = "goldenrod".asInstanceOf[goldenrod]
  
  @js.native
  sealed trait grab
    extends StObject
       with _Cursor
  inline def grab: grab = "grab".asInstanceOf[grab]
  
  @js.native
  sealed trait grabbing
    extends StObject
       with _Cursor
  inline def grabbing: grabbing = "grabbing".asInstanceOf[grabbing]
  
  @js.native
  sealed trait `grammar-error`
    extends StObject
       with _TextDecoration[Any]
       with _TextDecorationLine
  inline def `grammar-error`: `grammar-error` = "grammar-error".asInstanceOf[`grammar-error`]
  
  @js.native
  sealed trait gray
    extends StObject
       with NamedColor
  inline def gray: gray = "gray".asInstanceOf[gray]
  
  @js.native
  sealed trait green
    extends StObject
       with NamedColor
  inline def green: green = "green".asInstanceOf[green]
  
  @js.native
  sealed trait greenyellow
    extends StObject
       with NamedColor
  inline def greenyellow: greenyellow = "greenyellow".asInstanceOf[greenyellow]
  
  @js.native
  sealed trait grey
    extends StObject
       with NamedColor
  inline def grey: grey = "grey".asInstanceOf[grey]
  
  @js.native
  sealed trait grid
    extends StObject
       with DisplayInside
  inline def grid: grid = "grid".asInstanceOf[grid]
  
  @js.native
  sealed trait grippers
    extends StObject
       with MsTouchSelect
  inline def grippers: grippers = "grippers".asInstanceOf[grippers]
  
  @js.native
  sealed trait groove
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
  inline def groove: groove = "groove".asInstanceOf[groove]
  
  @js.native
  sealed trait groupbox
    extends StObject
       with MozAppearance
  inline def groupbox: groupbox = "groupbox".asInstanceOf[groupbox]
  
  @js.native
  sealed trait hanging
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  inline def hanging: hanging = "hanging".asInstanceOf[hanging]
  
  @js.native
  sealed trait `hard-light`
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def `hard-light`: `hard-light` = "hard-light".asInstanceOf[`hard-light`]
  
  @js.native
  sealed trait help
    extends StObject
       with _Cursor
  inline def help: help = "help".asInstanceOf[help]
  
  @js.native
  sealed trait hidden
    extends StObject
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with ContentVisibility
       with LineStyle
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with Visibility
       with _Overflow
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait hide
    extends StObject
       with EmptyCells
  inline def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait `historical-forms`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantAlternates
  inline def `historical-forms`: `historical-forms` = "historical-forms".asInstanceOf[`historical-forms`]
  
  @js.native
  sealed trait `historical-ligatures`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  inline def `historical-ligatures`: `historical-ligatures` = "historical-ligatures".asInstanceOf[`historical-ligatures`]
  
  @js.native
  sealed trait honeydew
    extends StObject
       with NamedColor
  inline def honeydew: honeydew = "honeydew".asInstanceOf[honeydew]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with BoxOrient
       with MozOrient
       with Resize
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait `horizontal-tb`
    extends StObject
       with WritingMode
  inline def `horizontal-tb`: `horizontal-tb` = "horizontal-tb".asInstanceOf[`horizontal-tb`]
  
  @js.native
  sealed trait hotpink
    extends StObject
       with NamedColor
  inline def hotpink: hotpink = "hotpink".asInstanceOf[hotpink]
  
  @js.native
  sealed trait hue
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def hue: hue = "hue".asInstanceOf[hue]
  
  @js.native
  sealed trait icon
    extends StObject
       with _Font
  inline def icon: icon = "icon".asInstanceOf[icon]
  
  @js.native
  sealed trait `ideograph-alpha`
    extends StObject
       with MsTextAutospace
  inline def `ideograph-alpha`: `ideograph-alpha` = "ideograph-alpha".asInstanceOf[`ideograph-alpha`]
  
  @js.native
  sealed trait `ideograph-numeric`
    extends StObject
       with MsTextAutospace
  inline def `ideograph-numeric`: `ideograph-numeric` = "ideograph-numeric".asInstanceOf[`ideograph-numeric`]
  
  @js.native
  sealed trait `ideograph-parenthesis`
    extends StObject
       with MsTextAutospace
  inline def `ideograph-parenthesis`: `ideograph-parenthesis` = "ideograph-parenthesis".asInstanceOf[`ideograph-parenthesis`]
  
  @js.native
  sealed trait `ideograph-space`
    extends StObject
       with MsTextAutospace
  inline def `ideograph-space`: `ideograph-space` = "ideograph-space".asInstanceOf[`ideograph-space`]
  
  @js.native
  sealed trait ideographic
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  inline def ideographic: ideographic = "ideographic".asInstanceOf[ideographic]
  
  @js.native
  sealed trait ignore
    extends StObject
       with MozStackSizing
       with MozUserFocus
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait inactive
    extends StObject
       with ImeMode
  inline def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait indianred
    extends StObject
       with NamedColor
  inline def indianred: indianred = "indianred".asInstanceOf[indianred]
  
  @js.native
  sealed trait indigo
    extends StObject
       with NamedColor
  inline def indigo: indigo = "indigo".asInstanceOf[indigo]
  
  @js.native
  sealed trait infinite
    extends StObject
       with _AnimationIterationCount
       with _SingleAnimation[Any]
  inline def infinite: infinite = "infinite".asInstanceOf[infinite]
  
  @js.native
  sealed trait inherit
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderCollapse
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with BoxAlign
       with BoxDecorationBreak
       with BoxDirection
       with BoxLines
       with BoxOrient
       with BoxPack
       with BoxSizing
       with BreakAfter
       with BreakBefore
       with BreakInside
       with CaptionSide
       with Clear
       with ClipRule
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
       with ContentVisibility
       with Direction
       with DominantBaseline
       with EmptyCells
       with FillRule
       with FlexDirection
       with FlexWrap
       with Float
       with FontKerning
       with FontOpticalSizing
       with FontVariantCaps
       with FontVariantPosition
       with ForcedColorAdjust
       with Globals
       with Hyphens
       with ImageRendering
       with ImeMode
       with InputSecurity
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
       with MathShift
       with MathStyle
       with MixBlendMode
       with MozAppearance
       with MozFloatEdge
       with MozOrient
       with MozStackSizing
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozUserModify
       with MozWindowDragging
       with MozWindowShadow
       with MsAccelerator
       with MsBlockProgression
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapFlow
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverflowBlock
       with OverflowClipBox
       with OverflowInline
       with OverflowWrap
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with Position
       with PrintColorAdjust
       with Resize
       with RubyAlign
       with RubyMerge
       with ScrollBehavior
       with ScrollSnapStop
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with ShapeRendering
       with StrokeLinecap
       with StrokeLinejoin
       with TableLayout
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with TextDecorationSkipInk
       with TextDecorationStyle
       with TextJustify
       with TextOrientation
       with TextRendering
       with TextTransform
       with TransformBox
       with TransformStyle
       with UnicodeBidi
       with UserSelect
       with VectorEffect
       with Visibility
       with WebkitAppearance
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with WebkitOverflowScrolling
       with WebkitTouchCallout
       with WebkitUserModify
       with WhiteSpace
       with WordBreak
       with WordWrap
       with WritingMode
  inline def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait initial
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderCollapse
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with BoxAlign
       with BoxDecorationBreak
       with BoxDirection
       with BoxLines
       with BoxOrient
       with BoxPack
       with BoxSizing
       with BreakAfter
       with BreakBefore
       with BreakInside
       with CaptionSide
       with Clear
       with ClipRule
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
       with ContentVisibility
       with Direction
       with DominantBaseline
       with EmptyCells
       with FillRule
       with FlexDirection
       with FlexWrap
       with Float
       with FontKerning
       with FontOpticalSizing
       with FontVariantCaps
       with FontVariantPosition
       with ForcedColorAdjust
       with Globals
       with Hyphens
       with ImageRendering
       with ImeMode
       with InputSecurity
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
       with MathShift
       with MathStyle
       with MixBlendMode
       with MozAppearance
       with MozFloatEdge
       with MozOrient
       with MozStackSizing
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozUserModify
       with MozWindowDragging
       with MozWindowShadow
       with MsAccelerator
       with MsBlockProgression
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapFlow
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverflowBlock
       with OverflowClipBox
       with OverflowInline
       with OverflowWrap
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with Position
       with PrintColorAdjust
       with Resize
       with RubyAlign
       with RubyMerge
       with ScrollBehavior
       with ScrollSnapStop
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with ShapeRendering
       with StrokeLinecap
       with StrokeLinejoin
       with TableLayout
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with TextDecorationSkipInk
       with TextDecorationStyle
       with TextJustify
       with TextOrientation
       with TextRendering
       with TextTransform
       with TransformBox
       with TransformStyle
       with UnicodeBidi
       with UserSelect
       with VectorEffect
       with Visibility
       with WebkitAppearance
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with WebkitOverflowScrolling
       with WebkitTouchCallout
       with WebkitUserModify
       with WhiteSpace
       with WordBreak
       with WordWrap
       with WritingMode
  inline def initial: initial = "initial".asInstanceOf[initial]
  
  @js.native
  sealed trait `inline`
    extends StObject
       with DisplayOutside
       with MozOrient
       with Resize
       with _ScrollSnapType
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait `inline-axis`
    extends StObject
       with BoxOrient
  inline def `inline-axis`: `inline-axis` = "inline-axis".asInstanceOf[`inline-axis`]
  
  @js.native
  sealed trait `inline-block`
    extends StObject
       with DisplayLegacy
  inline def `inline-block`: `inline-block` = "inline-block".asInstanceOf[`inline-block`]
  
  @js.native
  sealed trait `inline-end`
    extends StObject
       with CaptionSide
       with Clear
       with Float
  inline def `inline-end`: `inline-end` = "inline-end".asInstanceOf[`inline-end`]
  
  @js.native
  sealed trait `inline-flex`
    extends StObject
       with DisplayLegacy
  inline def `inline-flex`: `inline-flex` = "inline-flex".asInstanceOf[`inline-flex`]
  
  @js.native
  sealed trait `inline-grid`
    extends StObject
       with DisplayLegacy
  inline def `inline-grid`: `inline-grid` = "inline-grid".asInstanceOf[`inline-grid`]
  
  @js.native
  sealed trait `inline-list-item`
    extends StObject
       with DisplayLegacy
  inline def `inline-list-item`: `inline-list-item` = "inline-list-item".asInstanceOf[`inline-list-item`]
  
  @js.native
  sealed trait `inline-size`
    extends StObject
       with _Contain
  inline def `inline-size`: `inline-size` = "inline-size".asInstanceOf[`inline-size`]
  
  @js.native
  sealed trait `inline-start`
    extends StObject
       with CaptionSide
       with Clear
       with Float
  inline def `inline-start`: `inline-start` = "inline-start".asInstanceOf[`inline-start`]
  
  @js.native
  sealed trait `inline-table`
    extends StObject
       with DisplayLegacy
  inline def `inline-table`: `inline-table` = "inline-table".asInstanceOf[`inline-table`]
  
  @js.native
  sealed trait `inner-spin-button`
    extends StObject
       with WebkitAppearance
  inline def `inner-spin-button`: `inner-spin-button` = "inner-spin-button".asInstanceOf[`inner-spin-button`]
  
  @js.native
  sealed trait inset
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
  inline def inset: inset = "inset".asInstanceOf[inset]
  
  @js.native
  sealed trait inside
    extends StObject
       with ListStylePosition
       with _ListStyle
  inline def inside: inside = "inside".asInstanceOf[inside]
  
  @js.native
  sealed trait `inter-character`
    extends StObject
       with TextJustify
       with _RubyPosition
  inline def `inter-character`: `inter-character` = "inter-character".asInstanceOf[`inter-character`]
  
  @js.native
  sealed trait `inter-word`
    extends StObject
       with TextJustify
  inline def `inter-word`: `inter-word` = "inter-word".asInstanceOf[`inter-word`]
  
  @js.native
  sealed trait intersect
    extends StObject
       with CompositingOperator
  inline def intersect: intersect = "intersect".asInstanceOf[intersect]
  
  @js.native
  sealed trait intrinsic
    extends StObject
       with _MaxHeight[Any]
       with _MaxWidth[Any]
       with _MinHeight[Any]
       with _MinWidth[Any]
       with _Width[Any]
  inline def intrinsic: intrinsic = "intrinsic".asInstanceOf[intrinsic]
  
  @js.native
  sealed trait invert
    extends StObject
       with _Outline[Any]
       with _OutlineColor
  inline def invert: invert = "invert".asInstanceOf[invert]
  
  @js.native
  sealed trait isolate
    extends StObject
       with Isolation
       with UnicodeBidi
  inline def isolate: isolate = "isolate".asInstanceOf[isolate]
  
  @js.native
  sealed trait `isolate-override`
    extends StObject
       with UnicodeBidi
  inline def `isolate-override`: `isolate-override` = "isolate-override".asInstanceOf[`isolate-override`]
  
  @js.native
  sealed trait italic
    extends StObject
       with _FontStyle
       with typings.csstype.mod.AtRule._FontStyle
  inline def italic: italic = "italic".asInstanceOf[italic]
  
  @js.native
  sealed trait ivory
    extends StObject
       with NamedColor
  inline def ivory: ivory = "ivory".asInstanceOf[ivory]
  
  @js.native
  sealed trait jis04
    extends StObject
       with EastAsianVariantValues
  inline def jis04: jis04 = "jis04".asInstanceOf[jis04]
  
  @js.native
  sealed trait jis78
    extends StObject
       with EastAsianVariantValues
  inline def jis78: jis78 = "jis78".asInstanceOf[jis78]
  
  @js.native
  sealed trait jis83
    extends StObject
       with EastAsianVariantValues
  inline def jis83: jis83 = "jis83".asInstanceOf[jis83]
  
  @js.native
  sealed trait jis90
    extends StObject
       with EastAsianVariantValues
  inline def jis90: jis90 = "jis90".asInstanceOf[jis90]
  
  @js.native
  sealed trait justify
    extends StObject
       with BoxPack
       with TextAlign
       with TextAlignLast
  inline def justify: justify = "justify".asInstanceOf[justify]
  
  @js.native
  sealed trait `keep-all`
    extends StObject
       with WordBreak
  inline def `keep-all`: `keep-all` = "keep-all".asInstanceOf[`keep-all`]
  
  @js.native
  sealed trait khaki
    extends StObject
       with NamedColor
  inline def khaki: khaki = "khaki".asInstanceOf[khaki]
  
  @js.native
  sealed trait landscape
    extends StObject
       with Orientation
       with _Size[Any]
  inline def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait large
    extends StObject
       with AbsoluteSize
  inline def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait larger
    extends StObject
       with _FontSize[Any]
  inline def larger: larger = "larger".asInstanceOf[larger]
  
  @js.native
  sealed trait last
    extends StObject
       with _HangingPunctuation
  inline def last: last = "last".asInstanceOf[last]
  
  @js.native
  sealed trait lavender
    extends StObject
       with NamedColor
  inline def lavender: lavender = "lavender".asInstanceOf[lavender]
  
  @js.native
  sealed trait lavenderblush
    extends StObject
       with NamedColor
  inline def lavenderblush: lavenderblush = "lavenderblush".asInstanceOf[lavenderblush]
  
  @js.native
  sealed trait lawngreen
    extends StObject
       with NamedColor
  inline def lawngreen: lawngreen = "lawngreen".asInstanceOf[lawngreen]
  
  @js.native
  sealed trait layout
    extends StObject
       with _Contain
  inline def layout: layout = "layout".asInstanceOf[layout]
  
  @js.native
  sealed trait `leading-spaces`
    extends StObject
       with _TextDecorationSkip
  inline def `leading-spaces`: `leading-spaces` = "leading-spaces".asInstanceOf[`leading-spaces`]
  
  @js.native
  sealed trait ledger
    extends StObject
       with PageSize
  inline def ledger: ledger = "ledger".asInstanceOf[ledger]
  
  @js.native
  sealed trait left
    extends StObject
       with BreakAfter
       with BreakBefore
       with Clear
       with Float
       with PageBreakAfter
       with PageBreakBefore
       with TextAlign
       with TextAlignLast
       with _Azimuth
       with _BackgroundPositionX[Any]
       with _BgPosition[Any]
       with _JustifyContent
       with _JustifyItems
       with _JustifySelf
       with _JustifyTracks
       with _Position[Any]
       with _TextUnderlinePosition
       with _TransformOrigin[Any]
       with _WebkitBoxReflect[Any]
       with _WebkitMaskPositionX[Any]
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `left-side`
    extends StObject
       with _Azimuth
  inline def `left-side`: `left-side` = "left-side".asInstanceOf[`left-side`]
  
  @js.native
  sealed trait leftwards
    extends StObject
       with _Azimuth
  inline def leftwards: leftwards = "leftwards".asInstanceOf[leftwards]
  
  @js.native
  sealed trait legacy
    extends StObject
       with _JustifyItems
  inline def legacy: legacy = "legacy".asInstanceOf[legacy]
  
  @js.native
  sealed trait legal
    extends StObject
       with PageSize
  inline def legal: legal = "legal".asInstanceOf[legal]
  
  @js.native
  sealed trait lemonchiffon
    extends StObject
       with NamedColor
  inline def lemonchiffon: lemonchiffon = "lemonchiffon".asInstanceOf[lemonchiffon]
  
  @js.native
  sealed trait letter
    extends StObject
       with PageSize
  inline def letter: letter = "letter".asInstanceOf[letter]
  
  @js.native
  sealed trait light
    extends StObject
       with _ColorScheme
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait lightblue
    extends StObject
       with NamedColor
  inline def lightblue: lightblue = "lightblue".asInstanceOf[lightblue]
  
  @js.native
  sealed trait lightcoral
    extends StObject
       with NamedColor
  inline def lightcoral: lightcoral = "lightcoral".asInstanceOf[lightcoral]
  
  @js.native
  sealed trait lightcyan
    extends StObject
       with NamedColor
  inline def lightcyan: lightcyan = "lightcyan".asInstanceOf[lightcyan]
  
  @js.native
  sealed trait lighten
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def lighten: lighten = "lighten".asInstanceOf[lighten]
  
  @js.native
  sealed trait lighter
    extends StObject
       with _FontWeight
  inline def lighter: lighter = "lighter".asInstanceOf[lighter]
  
  @js.native
  sealed trait lightgoldenrodyellow
    extends StObject
       with NamedColor
  inline def lightgoldenrodyellow: lightgoldenrodyellow = "lightgoldenrodyellow".asInstanceOf[lightgoldenrodyellow]
  
  @js.native
  sealed trait lightgray
    extends StObject
       with NamedColor
  inline def lightgray: lightgray = "lightgray".asInstanceOf[lightgray]
  
  @js.native
  sealed trait lightgreen
    extends StObject
       with NamedColor
  inline def lightgreen: lightgreen = "lightgreen".asInstanceOf[lightgreen]
  
  @js.native
  sealed trait lightgrey
    extends StObject
       with NamedColor
  inline def lightgrey: lightgrey = "lightgrey".asInstanceOf[lightgrey]
  
  @js.native
  sealed trait lightpink
    extends StObject
       with NamedColor
  inline def lightpink: lightpink = "lightpink".asInstanceOf[lightpink]
  
  @js.native
  sealed trait lightsalmon
    extends StObject
       with NamedColor
  inline def lightsalmon: lightsalmon = "lightsalmon".asInstanceOf[lightsalmon]
  
  @js.native
  sealed trait lightseagreen
    extends StObject
       with NamedColor
  inline def lightseagreen: lightseagreen = "lightseagreen".asInstanceOf[lightseagreen]
  
  @js.native
  sealed trait lightskyblue
    extends StObject
       with NamedColor
  inline def lightskyblue: lightskyblue = "lightskyblue".asInstanceOf[lightskyblue]
  
  @js.native
  sealed trait lightslategray
    extends StObject
       with NamedColor
  inline def lightslategray: lightslategray = "lightslategray".asInstanceOf[lightslategray]
  
  @js.native
  sealed trait lightslategrey
    extends StObject
       with NamedColor
  inline def lightslategrey: lightslategrey = "lightslategrey".asInstanceOf[lightslategrey]
  
  @js.native
  sealed trait lightsteelblue
    extends StObject
       with NamedColor
  inline def lightsteelblue: lightsteelblue = "lightsteelblue".asInstanceOf[lightsteelblue]
  
  @js.native
  sealed trait lightyellow
    extends StObject
       with NamedColor
  inline def lightyellow: lightyellow = "lightyellow".asInstanceOf[lightyellow]
  
  @js.native
  sealed trait lime
    extends StObject
       with NamedColor
  inline def lime: lime = "lime".asInstanceOf[lime]
  
  @js.native
  sealed trait limegreen
    extends StObject
       with NamedColor
  inline def limegreen: limegreen = "limegreen".asInstanceOf[limegreen]
  
  @js.native
  sealed trait `line-through`
    extends StObject
       with _TextDecoration[Any]
       with _TextDecorationLine
  inline def `line-through`: `line-through` = "line-through".asInstanceOf[`line-through`]
  
  @js.native
  sealed trait linear
    extends StObject
       with _EasingFunction
  inline def linear: linear = "linear".asInstanceOf[linear]
  
  @js.native
  sealed trait linearRGB
    extends StObject
       with ColorInterpolation
  inline def linearRGB: linearRGB = "linearRGB".asInstanceOf[linearRGB]
  
  @js.native
  sealed trait linen
    extends StObject
       with NamedColor
  inline def linen: linen = "linen".asInstanceOf[linen]
  
  @js.native
  sealed trait `lining-nums`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  inline def `lining-nums`: `lining-nums` = "lining-nums".asInstanceOf[`lining-nums`]
  
  @js.native
  sealed trait `list-item`
    extends StObject
       with _Display
  inline def `list-item`: `list-item` = "list-item".asInstanceOf[`list-item`]
  
  @js.native
  sealed trait listbox
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  inline def listbox: listbox = "listbox".asInstanceOf[listbox]
  
  @js.native
  sealed trait listitem
    extends StObject
       with MozAppearance
       with WebkitAppearance
  inline def listitem: listitem = "listitem".asInstanceOf[listitem]
  
  @js.native
  sealed trait local
    extends StObject
       with Attachment
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait loose
    extends StObject
       with LineBreak
  inline def loose: loose = "loose".asInstanceOf[loose]
  
  @js.native
  sealed trait lowercase
    extends StObject
       with TextTransform
  inline def lowercase: lowercase = "lowercase".asInstanceOf[lowercase]
  
  @js.native
  sealed trait lr
    extends StObject
       with MsBlockProgression
  inline def lr: lr = "lr".asInstanceOf[lr]
  
  @js.native
  sealed trait ltr
    extends StObject
       with Direction
  inline def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait luminance
    extends StObject
       with MaskBorderMode
       with MaskType
       with MaskingMode
       with _MaskBorder
  inline def luminance: luminance = "luminance".asInstanceOf[luminance]
  
  @js.native
  sealed trait luminosity
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def luminosity: luminosity = "luminosity".asInstanceOf[luminosity]
  
  @js.native
  sealed trait magenta
    extends StObject
       with NamedColor
  inline def magenta: magenta = "magenta".asInstanceOf[magenta]
  
  @js.native
  sealed trait mandatory
    extends StObject
       with MsContentZoomSnapType
       with MsScrollSnapType
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with _MsContentZoomSnap
  inline def mandatory: mandatory = "mandatory".asInstanceOf[mandatory]
  
  @js.native
  sealed trait manipulation
    extends StObject
       with _TouchAction
  inline def manipulation: manipulation = "manipulation".asInstanceOf[manipulation]
  
  @js.native
  sealed trait manual
    extends StObject
       with Hyphens
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait `margin-box`
    extends StObject
       with GeometryBox
       with MozFloatEdge
       with _ShapeOutside
  inline def `margin-box`: `margin-box` = "margin-box".asInstanceOf[`margin-box`]
  
  @js.native
  sealed trait markers
    extends StObject
       with _PaintOrder
  inline def markers: markers = "markers".asInstanceOf[markers]
  
  @js.native
  sealed trait maroon
    extends StObject
       with NamedColor
  inline def maroon: maroon = "maroon".asInstanceOf[maroon]
  
  @js.native
  sealed trait `match-parent`
    extends StObject
       with TextAlign
  inline def `match-parent`: `match-parent` = "match-parent".asInstanceOf[`match-parent`]
  
  @js.native
  sealed trait `match-source`
    extends StObject
       with MaskingMode
  inline def `match-source`: `match-source` = "match-source".asInstanceOf[`match-source`]
  
  @js.native
  sealed trait mathematical
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  inline def mathematical: mathematical = "mathematical".asInstanceOf[mathematical]
  
  @js.native
  sealed trait `max-content`
    extends StObject
       with _BlockSize[Any]
       with _Flex[Any]
       with _FlexBasis[Any]
       with _Height[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _TrackBreadth[Any]
       with _Width[Any]
  inline def `max-content`: `max-content` = "max-content".asInstanceOf[`max-content`]
  
  @js.native
  sealed trait maximum
    extends StObject
       with MsWrapFlow
  inline def maximum: maximum = "maximum".asInstanceOf[maximum]
  
  @js.native
  sealed trait `media-controls-background`
    extends StObject
       with WebkitAppearance
  inline def `media-controls-background`: `media-controls-background` = "media-controls-background".asInstanceOf[`media-controls-background`]
  
  @js.native
  sealed trait `media-controls-fullscreen-background`
    extends StObject
       with WebkitAppearance
  inline def `media-controls-fullscreen-background`: `media-controls-fullscreen-background` = "media-controls-fullscreen-background".asInstanceOf[`media-controls-fullscreen-background`]
  
  @js.native
  sealed trait `media-current-time-display`
    extends StObject
       with WebkitAppearance
  inline def `media-current-time-display`: `media-current-time-display` = "media-current-time-display".asInstanceOf[`media-current-time-display`]
  
  @js.native
  sealed trait `media-enter-fullscreen-button`
    extends StObject
       with WebkitAppearance
  inline def `media-enter-fullscreen-button`: `media-enter-fullscreen-button` = "media-enter-fullscreen-button".asInstanceOf[`media-enter-fullscreen-button`]
  
  @js.native
  sealed trait `media-exit-fullscreen-button`
    extends StObject
       with WebkitAppearance
  inline def `media-exit-fullscreen-button`: `media-exit-fullscreen-button` = "media-exit-fullscreen-button".asInstanceOf[`media-exit-fullscreen-button`]
  
  @js.native
  sealed trait `media-fullscreen-button`
    extends StObject
       with WebkitAppearance
  inline def `media-fullscreen-button`: `media-fullscreen-button` = "media-fullscreen-button".asInstanceOf[`media-fullscreen-button`]
  
  @js.native
  sealed trait `media-mute-button`
    extends StObject
       with WebkitAppearance
  inline def `media-mute-button`: `media-mute-button` = "media-mute-button".asInstanceOf[`media-mute-button`]
  
  @js.native
  sealed trait `media-overlay-play-button`
    extends StObject
       with WebkitAppearance
  inline def `media-overlay-play-button`: `media-overlay-play-button` = "media-overlay-play-button".asInstanceOf[`media-overlay-play-button`]
  
  @js.native
  sealed trait `media-play-button`
    extends StObject
       with WebkitAppearance
  inline def `media-play-button`: `media-play-button` = "media-play-button".asInstanceOf[`media-play-button`]
  
  @js.native
  sealed trait `media-seek-back-button`
    extends StObject
       with WebkitAppearance
  inline def `media-seek-back-button`: `media-seek-back-button` = "media-seek-back-button".asInstanceOf[`media-seek-back-button`]
  
  @js.native
  sealed trait `media-seek-forward-button`
    extends StObject
       with WebkitAppearance
  inline def `media-seek-forward-button`: `media-seek-forward-button` = "media-seek-forward-button".asInstanceOf[`media-seek-forward-button`]
  
  @js.native
  sealed trait `media-slider`
    extends StObject
       with WebkitAppearance
  inline def `media-slider`: `media-slider` = "media-slider".asInstanceOf[`media-slider`]
  
  @js.native
  sealed trait `media-sliderthumb`
    extends StObject
       with WebkitAppearance
  inline def `media-sliderthumb`: `media-sliderthumb` = "media-sliderthumb".asInstanceOf[`media-sliderthumb`]
  
  @js.native
  sealed trait `media-time-remaining-display`
    extends StObject
       with WebkitAppearance
  inline def `media-time-remaining-display`: `media-time-remaining-display` = "media-time-remaining-display".asInstanceOf[`media-time-remaining-display`]
  
  @js.native
  sealed trait `media-toggle-closed-captions-button`
    extends StObject
       with WebkitAppearance
  inline def `media-toggle-closed-captions-button`: `media-toggle-closed-captions-button` = "media-toggle-closed-captions-button".asInstanceOf[`media-toggle-closed-captions-button`]
  
  @js.native
  sealed trait `media-volume-slider`
    extends StObject
       with WebkitAppearance
  inline def `media-volume-slider`: `media-volume-slider` = "media-volume-slider".asInstanceOf[`media-volume-slider`]
  
  @js.native
  sealed trait `media-volume-slider-container`
    extends StObject
       with WebkitAppearance
  inline def `media-volume-slider-container`: `media-volume-slider-container` = "media-volume-slider-container".asInstanceOf[`media-volume-slider-container`]
  
  @js.native
  sealed trait `media-volume-sliderthumb`
    extends StObject
       with WebkitAppearance
  inline def `media-volume-sliderthumb`: `media-volume-sliderthumb` = "media-volume-sliderthumb".asInstanceOf[`media-volume-sliderthumb`]
  
  @js.native
  sealed trait medium
    extends StObject
       with AbsoluteSize
       with _LineWidth[Any]
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait mediumaquamarine
    extends StObject
       with NamedColor
  inline def mediumaquamarine: mediumaquamarine = "mediumaquamarine".asInstanceOf[mediumaquamarine]
  
  @js.native
  sealed trait mediumblue
    extends StObject
       with NamedColor
  inline def mediumblue: mediumblue = "mediumblue".asInstanceOf[mediumblue]
  
  @js.native
  sealed trait mediumorchid
    extends StObject
       with NamedColor
  inline def mediumorchid: mediumorchid = "mediumorchid".asInstanceOf[mediumorchid]
  
  @js.native
  sealed trait mediumpurple
    extends StObject
       with NamedColor
  inline def mediumpurple: mediumpurple = "mediumpurple".asInstanceOf[mediumpurple]
  
  @js.native
  sealed trait mediumseagreen
    extends StObject
       with NamedColor
  inline def mediumseagreen: mediumseagreen = "mediumseagreen".asInstanceOf[mediumseagreen]
  
  @js.native
  sealed trait mediumslateblue
    extends StObject
       with NamedColor
  inline def mediumslateblue: mediumslateblue = "mediumslateblue".asInstanceOf[mediumslateblue]
  
  @js.native
  sealed trait mediumspringgreen
    extends StObject
       with NamedColor
  inline def mediumspringgreen: mediumspringgreen = "mediumspringgreen".asInstanceOf[mediumspringgreen]
  
  @js.native
  sealed trait mediumturquoise
    extends StObject
       with NamedColor
  inline def mediumturquoise: mediumturquoise = "mediumturquoise".asInstanceOf[mediumturquoise]
  
  @js.native
  sealed trait mediumvioletred
    extends StObject
       with NamedColor
  inline def mediumvioletred: mediumvioletred = "mediumvioletred".asInstanceOf[mediumvioletred]
  
  @js.native
  sealed trait menu_
    extends StObject
       with MozWindowShadow
       with _Font
  inline def menu_ : menu_ = "menu".asInstanceOf[menu_]
  
  @js.native
  sealed trait menuarrow
    extends StObject
       with MozAppearance
  inline def menuarrow: menuarrow = "menuarrow".asInstanceOf[menuarrow]
  
  @js.native
  sealed trait menubar
    extends StObject
       with MozAppearance
  inline def menubar: menubar = "menubar".asInstanceOf[menubar]
  
  @js.native
  sealed trait menucheckbox
    extends StObject
       with MozAppearance
  inline def menucheckbox: menucheckbox = "menucheckbox".asInstanceOf[menucheckbox]
  
  @js.native
  sealed trait menuimage
    extends StObject
       with MozAppearance
  inline def menuimage: menuimage = "menuimage".asInstanceOf[menuimage]
  
  @js.native
  sealed trait menuitem
    extends StObject
       with MozAppearance
  inline def menuitem: menuitem = "menuitem".asInstanceOf[menuitem]
  
  @js.native
  sealed trait menuitemtext
    extends StObject
       with MozAppearance
  inline def menuitemtext: menuitemtext = "menuitemtext".asInstanceOf[menuitemtext]
  
  @js.native
  sealed trait menulist
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  inline def menulist: menulist = "menulist".asInstanceOf[menulist]
  
  @js.native
  sealed trait `menulist-button`
    extends StObject
       with Appearance
       with MozAppearance
       with WebkitAppearance
  inline def `menulist-button`: `menulist-button` = "menulist-button".asInstanceOf[`menulist-button`]
  
  @js.native
  sealed trait `menulist-text`
    extends StObject
       with MozAppearance
       with WebkitAppearance
  inline def `menulist-text`: `menulist-text` = "menulist-text".asInstanceOf[`menulist-text`]
  
  @js.native
  sealed trait `menulist-textfield`
    extends StObject
       with MozAppearance
       with WebkitAppearance
  inline def `menulist-textfield`: `menulist-textfield` = "menulist-textfield".asInstanceOf[`menulist-textfield`]
  
  @js.native
  sealed trait menupopup
    extends StObject
       with MozAppearance
  inline def menupopup: menupopup = "menupopup".asInstanceOf[menupopup]
  
  @js.native
  sealed trait menuradio
    extends StObject
       with MozAppearance
  inline def menuradio: menuradio = "menuradio".asInstanceOf[menuradio]
  
  @js.native
  sealed trait menuseparator
    extends StObject
       with MozAppearance
  inline def menuseparator: menuseparator = "menuseparator".asInstanceOf[menuseparator]
  
  @js.native
  sealed trait `message-box`
    extends StObject
       with _Font
  inline def `message-box`: `message-box` = "message-box".asInstanceOf[`message-box`]
  
  @js.native
  sealed trait meter
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  inline def meter: meter = "meter".asInstanceOf[meter]
  
  @js.native
  sealed trait meterbar
    extends StObject
       with MozAppearance
  inline def meterbar: meterbar = "meterbar".asInstanceOf[meterbar]
  
  @js.native
  sealed trait meterchunk
    extends StObject
       with MozAppearance
  inline def meterchunk: meterchunk = "meterchunk".asInstanceOf[meterchunk]
  
  @js.native
  sealed trait middle
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
       with TextAnchor
       with _VerticalAlign[Any]
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait midnightblue
    extends StObject
       with NamedColor
  inline def midnightblue: midnightblue = "midnightblue".asInstanceOf[midnightblue]
  
  @js.native
  sealed trait `min-content`
    extends StObject
       with _BlockSize[Any]
       with _Flex[Any]
       with _FlexBasis[Any]
       with _Height[Any]
       with _InlineSize[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxWidth[Any]
       with _MinBlockSize[Any]
       with _MinHeight[Any]
       with _MinInlineSize[Any]
       with _MinWidth[Any]
       with _TrackBreadth[Any]
       with _Width[Any]
  inline def `min-content`: `min-content` = "min-content".asInstanceOf[`min-content`]
  
  @js.native
  sealed trait `min-intrinsic`
    extends StObject
       with _MinWidth[Any]
       with _Width[Any]
  inline def `min-intrinsic`: `min-intrinsic` = "min-intrinsic".asInstanceOf[`min-intrinsic`]
  
  @js.native
  sealed trait mintcream
    extends StObject
       with NamedColor
  inline def mintcream: mintcream = "mintcream".asInstanceOf[mintcream]
  
  @js.native
  sealed trait mistyrose
    extends StObject
       with NamedColor
  inline def mistyrose: mistyrose = "mistyrose".asInstanceOf[mistyrose]
  
  @js.native
  sealed trait miter
    extends StObject
       with StrokeLinejoin
  inline def miter: miter = "miter".asInstanceOf[miter]
  
  @js.native
  sealed trait mixed
    extends StObject
       with TextOrientation
  inline def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @js.native
  sealed trait moccasin
    extends StObject
       with NamedColor
  inline def moccasin: moccasin = "moccasin".asInstanceOf[moccasin]
  
  @js.native
  sealed trait monospace
    extends StObject
       with GenericFamily
  inline def monospace: monospace = "monospace".asInstanceOf[monospace]
  
  @js.native
  sealed trait move
    extends StObject
       with _Cursor
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait multiple
    extends StObject
       with BoxLines
  inline def multiple: multiple = "multiple".asInstanceOf[multiple]
  
  @js.native
  sealed trait multiply
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def multiply: multiply = "multiply".asInstanceOf[multiply]
  
  @js.native
  sealed trait `n-resize`
    extends StObject
       with _Cursor
  inline def `n-resize`: `n-resize` = "n-resize".asInstanceOf[`n-resize`]
  
  @js.native
  sealed trait navajowhite
    extends StObject
       with NamedColor
  inline def navajowhite: navajowhite = "navajowhite".asInstanceOf[navajowhite]
  
  @js.native
  sealed trait navy
    extends StObject
       with NamedColor
  inline def navy: navy = "navy".asInstanceOf[navy]
  
  @js.native
  sealed trait `ne-resize`
    extends StObject
       with _Cursor
  inline def `ne-resize`: `ne-resize` = "ne-resize".asInstanceOf[`ne-resize`]
  
  @js.native
  sealed trait `nesw-resize`
    extends StObject
       with _Cursor
  inline def `nesw-resize`: `nesw-resize` = "nesw-resize".asInstanceOf[`nesw-resize`]
  
  @js.native
  sealed trait never
    extends StObject
       with _FontSmooth[Any]
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait `no-change`
    extends StObject
       with DominantBaseline
  inline def `no-change`: `no-change` = "no-change".asInstanceOf[`no-change`]
  
  @js.native
  sealed trait `no-clip`
    extends StObject
       with _MaskClip
       with _MaskLayer[Any]
  inline def `no-clip`: `no-clip` = "no-clip".asInstanceOf[`no-clip`]
  
  @js.native
  sealed trait `no-close-quote`
    extends StObject
       with Quote
  inline def `no-close-quote`: `no-close-quote` = "no-close-quote".asInstanceOf[`no-close-quote`]
  
  @js.native
  sealed trait `no-common-ligatures`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  inline def `no-common-ligatures`: `no-common-ligatures` = "no-common-ligatures".asInstanceOf[`no-common-ligatures`]
  
  @js.native
  sealed trait `no-contextual`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  inline def `no-contextual`: `no-contextual` = "no-contextual".asInstanceOf[`no-contextual`]
  
  @js.native
  sealed trait `no-discretionary-ligatures`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  inline def `no-discretionary-ligatures`: `no-discretionary-ligatures` = "no-discretionary-ligatures".asInstanceOf[`no-discretionary-ligatures`]
  
  @js.native
  sealed trait `no-drag`
    extends StObject
       with MozWindowDragging
  inline def `no-drag`: `no-drag` = "no-drag".asInstanceOf[`no-drag`]
  
  @js.native
  sealed trait `no-drop`
    extends StObject
       with _Cursor
  inline def `no-drop`: `no-drop` = "no-drop".asInstanceOf[`no-drop`]
  
  @js.native
  sealed trait `no-historical-ligatures`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  inline def `no-historical-ligatures`: `no-historical-ligatures` = "no-historical-ligatures".asInstanceOf[`no-historical-ligatures`]
  
  @js.native
  sealed trait `no-limit`
    extends StObject
       with _MsHyphenateLimitLines
  inline def `no-limit`: `no-limit` = "no-limit".asInstanceOf[`no-limit`]
  
  @js.native
  sealed trait `no-open-quote`
    extends StObject
       with Quote
  inline def `no-open-quote`: `no-open-quote` = "no-open-quote".asInstanceOf[`no-open-quote`]
  
  @js.native
  sealed trait `no-repeat`
    extends StObject
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with _RepeatStyle
  inline def `no-repeat`: `no-repeat` = "no-repeat".asInstanceOf[`no-repeat`]
  
  @js.native
  sealed trait `non-scaling-stroke`
    extends StObject
       with VectorEffect
  inline def `non-scaling-stroke`: `non-scaling-stroke` = "non-scaling-stroke".asInstanceOf[`non-scaling-stroke`]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.csstype.mod.Property._Animation because Already inherited
  - typings.csstype.mod.DataType._SingleAnimation because Already inherited */ @js.native
  sealed trait none
    extends StObject
       with Appearance
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with Clear
       with ColumnSpan
       with Float
       with FontKerning
       with FontOpticalSizing
       with ForcedColorAdjust
       with Hyphens
       with InputSecurity
       with LineStyle
       with MozAppearance
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozWindowShadow
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PointerEvents
       with Resize
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with SingleAnimationFillMode
       with TextDecorationSkipInk
       with TextJustify
       with TextTransform
       with UserSelect
       with VectorEffect
       with WebkitAppearance
       with WebkitTouchCallout
       with _AnimationName
       with _BackdropFilter
       with _BackgroundImage
       with _BorderImage
       with _BorderImageSource
       with _BoxShadow
       with _ClipPath
       with _Contain
       with _Content
       with _CounterIncrement
       with _CounterReset
       with _CounterSet
       with _Cursor
       with _Display
       with _Filter
       with _FinalBgLayer[Any]
       with _Flex[Any]
       with _FontSizeAdjust
       with _FontSynthesis
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
       with _Grid
       with _GridTemplate
       with _GridTemplateAreas
       with _GridTemplateColumns[Any]
       with _GridTemplateRows[Any]
       with _HangingPunctuation
       with _LineClamp
       with _ListStyle
       with _ListStyleImage
       with _ListStyleType
       with _Marker
       with _MarkerEnd
       with _MarkerMid
       with _MarkerStart
       with _Marks
       with _MaskBorder
       with _MaskBorderSource
       with _MaskImage
       with _MaskLayer[Any]
       with _MaxBlockSize[Any]
       with _MaxHeight[Any]
       with _MaxInlineSize[Any]
       with _MaxLines
       with _MaxWidth[Any]
       with _MozBinding
       with _MozBorderBottomColors
       with _MozBorderLeftColors
       with _MozBorderRightColors
       with _MozBorderTopColors
       with _MozContextProperties
       with _MsContentZoomSnap
       with _MsFlowFrom
       with _MsFlowInto
       with _MsGridColumns[Any]
       with _MsGridRows[Any]
       with _Offset[Any]
       with _OffsetPath
       with _OverscrollBehavior
       with _Paint
       with _Perspective[Any]
       with _Quotes
       with _Rotate
       with _Scale
       with _ScrollSnapAlign
       with _ScrollSnapCoordinate[Any]
       with _ScrollSnapPointsX
       with _ScrollSnapPointsY
       with _ScrollSnapType
       with _ShapeOutside
       with _SingleAnimationTimeline
       with _SingleTransition[Any]
       with _StrokeDasharray[Any]
       with _TextCombineUpright
       with _TextDecoration[Any]
       with _TextDecorationLine
       with _TextDecorationSkip
       with _TextEmphasis
       with _TextEmphasisStyle
       with _TextShadow
       with _TextSizeAdjust
       with _TouchAction
       with _Transform
       with _TransitionProperty
       with _Translate[Any]
       with _WebkitLineClamp
       with _WebkitMask[Any]
       with _WebkitMaskImage
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait nonzero
    extends StObject
       with ClipRule
       with FillRule
  inline def nonzero: nonzero = "nonzero".asInstanceOf[nonzero]
  
  @js.native
  sealed trait normal
    extends StObject
       with BlendMode
       with BoxDirection
       with FontKerning
       with FontVariantCaps
       with FontVariantPosition
       with ImeMode
       with LineBreak
       with MathShift
       with MathStyle
       with MixBlendMode
       with MozUserFocus
       with OverflowWrap
       with ScrollSnapStop
       with SingleAnimationDirection
       with UnicodeBidi
       with WhiteSpace
       with WordBreak
       with WordWrap
       with _AlignContent
       with _AlignItems
       with _AlignSelf
       with _AlignTracks
       with _ColorScheme
       with _ColumnGap[Any]
       with _Content
       with _FontFeatureSettings
       with _FontLanguageOverride
       with _FontStretchAbsolute
       with _FontStyle
       with typings.csstype.mod.AtRule._FontStyle
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantAlternates
       with _FontVariantEastAsian
       with _FontVariantLigatures
       with _FontVariantNumeric
       with _FontVariationSettings
       with _FontWeightAbsolute
       with _Gap[Any]
       with _InitialLetter
       with _JustifyContent
       with _JustifyItems
       with _JustifySelf
       with _JustifyTracks
       with _LetterSpacing[Any]
       with _LineHeight[Any]
       with _PaintOrder
       with _PlaceContent
       with _PlaceItems
       with _PlaceSelf
       with _RowGap[Any]
       with _WordSpacing[Any]
       with _Zoom
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait `not-allowed`
    extends StObject
       with _Cursor
  inline def `not-allowed`: `not-allowed` = "not-allowed".asInstanceOf[`not-allowed`]
  
  @js.native
  sealed trait nowrap
    extends StObject
       with FlexWrap
       with WhiteSpace
       with _FlexFlow
  inline def nowrap: nowrap = "nowrap".asInstanceOf[nowrap]
  
  @js.native
  sealed trait `ns-resize`
    extends StObject
       with _Cursor
  inline def `ns-resize`: `ns-resize` = "ns-resize".asInstanceOf[`ns-resize`]
  
  @js.native
  sealed trait numbers
    extends StObject
       with _SpeakAs
  inline def numbers: numbers = "numbers".asInstanceOf[numbers]
  
  @js.native
  sealed trait numeric
    extends StObject
       with _System
  inline def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait `nw-resize`
    extends StObject
       with _Cursor
  inline def `nw-resize`: `nw-resize` = "nw-resize".asInstanceOf[`nw-resize`]
  
  @js.native
  sealed trait `nwse-resize`
    extends StObject
       with _Cursor
  inline def `nwse-resize`: `nwse-resize` = "nwse-resize".asInstanceOf[`nwse-resize`]
  
  @js.native
  sealed trait objects
    extends StObject
       with _TextDecorationSkip
  inline def objects: objects = "objects".asInstanceOf[objects]
  
  @js.native
  sealed trait oblique
    extends StObject
       with _FontStyle
       with typings.csstype.mod.AtRule._FontStyle
  inline def oblique: oblique = "oblique".asInstanceOf[oblique]
  
  @js.native
  sealed trait oldlace
    extends StObject
       with NamedColor
  inline def oldlace: oldlace = "oldlace".asInstanceOf[oldlace]
  
  @js.native
  sealed trait `oldstyle-nums`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  inline def `oldstyle-nums`: `oldstyle-nums` = "oldstyle-nums".asInstanceOf[`oldstyle-nums`]
  
  @js.native
  sealed trait olive
    extends StObject
       with NamedColor
  inline def olive: olive = "olive".asInstanceOf[olive]
  
  @js.native
  sealed trait olivedrab
    extends StObject
       with NamedColor
  inline def olivedrab: olivedrab = "olivedrab".asInstanceOf[olivedrab]
  
  @js.native
  sealed trait open
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait `open-quote`
    extends StObject
       with Quote
  inline def `open-quote`: `open-quote` = "open-quote".asInstanceOf[`open-quote`]
  
  @js.native
  sealed trait optimizeLegibility
    extends StObject
       with TextRendering
  inline def optimizeLegibility: optimizeLegibility = "optimizeLegibility".asInstanceOf[optimizeLegibility]
  
  @js.native
  sealed trait optimizeQuality
    extends StObject
       with ColorRendering
  inline def optimizeQuality: optimizeQuality = "optimizeQuality".asInstanceOf[optimizeQuality]
  
  @js.native
  sealed trait optimizeSpeed
    extends StObject
       with ColorRendering
       with ShapeRendering
       with TextRendering
  inline def optimizeSpeed: optimizeSpeed = "optimizeSpeed".asInstanceOf[optimizeSpeed]
  
  @js.native
  sealed trait optional
    extends StObject
       with FontDisplay
  inline def optional: optional = "optional".asInstanceOf[optional]
  
  @js.native
  sealed trait orange
    extends StObject
       with NamedColor
  inline def orange: orange = "orange".asInstanceOf[orange]
  
  @js.native
  sealed trait orangered
    extends StObject
       with NamedColor
  inline def orangered: orangered = "orangered".asInstanceOf[orangered]
  
  @js.native
  sealed trait orchid
    extends StObject
       with NamedColor
  inline def orchid: orchid = "orchid".asInstanceOf[orchid]
  
  @js.native
  sealed trait ordinal
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  inline def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  
  @js.native
  sealed trait outset
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
  inline def outset: outset = "outset".asInstanceOf[outset]
  
  @js.native
  sealed trait outside
    extends StObject
       with ListStylePosition
       with _ListStyle
  inline def outside: outside = "outside".asInstanceOf[outside]
  
  @js.native
  sealed trait over
    extends StObject
       with _RubyPosition
  inline def over: over = "over".asInstanceOf[over]
  
  @js.native
  sealed trait overlay
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def overlay: overlay = "overlay".asInstanceOf[overlay]
  
  @js.native
  sealed trait overline
    extends StObject
       with _TextDecoration[Any]
       with _TextDecorationLine
  inline def overline: overline = "overline".asInstanceOf[overline]
  
  @js.native
  sealed trait padding
    extends StObject
       with _WebkitMask[Any]
       with _WebkitMaskClip
       with _WebkitMaskOrigin
  inline def padding: padding = "padding".asInstanceOf[padding]
  
  @js.native
  sealed trait `padding-box`
    extends StObject
       with Box
       with GeometryBox
       with MozFloatEdge
       with OverflowClipBox
       with VisualBox
  inline def `padding-box`: `padding-box` = "padding-box".asInstanceOf[`padding-box`]
  
  @js.native
  sealed trait page
    extends StObject
       with BreakAfter
       with BreakBefore
  inline def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait paint
    extends StObject
       with _Contain
  inline def paint: paint = "paint".asInstanceOf[paint]
  
  @js.native
  sealed trait painted
    extends StObject
       with PointerEvents
  inline def painted: painted = "painted".asInstanceOf[painted]
  
  @js.native
  sealed trait palegoldenrod
    extends StObject
       with NamedColor
  inline def palegoldenrod: palegoldenrod = "palegoldenrod".asInstanceOf[palegoldenrod]
  
  @js.native
  sealed trait palegreen
    extends StObject
       with NamedColor
  inline def palegreen: palegreen = "palegreen".asInstanceOf[palegreen]
  
  @js.native
  sealed trait paleturquoise
    extends StObject
       with NamedColor
  inline def paleturquoise: paleturquoise = "paleturquoise".asInstanceOf[paleturquoise]
  
  @js.native
  sealed trait palevioletred
    extends StObject
       with NamedColor
  inline def palevioletred: palevioletred = "palevioletred".asInstanceOf[palevioletred]
  
  @js.native
  sealed trait `pan-down`
    extends StObject
       with _TouchAction
  inline def `pan-down`: `pan-down` = "pan-down".asInstanceOf[`pan-down`]
  
  @js.native
  sealed trait `pan-left`
    extends StObject
       with _TouchAction
  inline def `pan-left`: `pan-left` = "pan-left".asInstanceOf[`pan-left`]
  
  @js.native
  sealed trait `pan-right`
    extends StObject
       with _TouchAction
  inline def `pan-right`: `pan-right` = "pan-right".asInstanceOf[`pan-right`]
  
  @js.native
  sealed trait `pan-up`
    extends StObject
       with _TouchAction
  inline def `pan-up`: `pan-up` = "pan-up".asInstanceOf[`pan-up`]
  
  @js.native
  sealed trait `pan-x`
    extends StObject
       with _TouchAction
  inline def `pan-x`: `pan-x` = "pan-x".asInstanceOf[`pan-x`]
  
  @js.native
  sealed trait `pan-y`
    extends StObject
       with _TouchAction
  inline def `pan-y`: `pan-y` = "pan-y".asInstanceOf[`pan-y`]
  
  @js.native
  sealed trait papayawhip
    extends StObject
       with NamedColor
  inline def papayawhip: papayawhip = "papayawhip".asInstanceOf[papayawhip]
  
  @js.native
  sealed trait paused
    extends StObject
       with _AnimationPlayState
       with _SingleAnimation[Any]
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait peachpuff
    extends StObject
       with NamedColor
  inline def peachpuff: peachpuff = "peachpuff".asInstanceOf[peachpuff]
  
  @js.native
  sealed trait peru
    extends StObject
       with NamedColor
  inline def peru: peru = "peru".asInstanceOf[peru]
  
  @js.native
  sealed trait `petite-caps`
    extends StObject
       with FontVariantCaps
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  inline def `petite-caps`: `petite-caps` = "petite-caps".asInstanceOf[`petite-caps`]
  
  @js.native
  sealed trait `pinch-zoom`
    extends StObject
       with _TouchAction
  inline def `pinch-zoom`: `pinch-zoom` = "pinch-zoom".asInstanceOf[`pinch-zoom`]
  
  @js.native
  sealed trait pink
    extends StObject
       with NamedColor
  inline def pink: pink = "pink".asInstanceOf[pink]
  
  @js.native
  sealed trait pixelated
    extends StObject
       with ImageRendering
  inline def pixelated: pixelated = "pixelated".asInstanceOf[pixelated]
  
  @js.native
  sealed trait plaintext
    extends StObject
       with UnicodeBidi
  inline def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  
  @js.native
  sealed trait plum
    extends StObject
       with NamedColor
  inline def plum: plum = "plum".asInstanceOf[plum]
  
  @js.native
  sealed trait `plus-lighter`
    extends StObject
       with MixBlendMode
  inline def `plus-lighter`: `plus-lighter` = "plus-lighter".asInstanceOf[`plus-lighter`]
  
  @js.native
  sealed trait pointer
    extends StObject
       with _Cursor
  inline def pointer: pointer = "pointer".asInstanceOf[pointer]
  
  @js.native
  sealed trait portrait
    extends StObject
       with Orientation
       with _Size[Any]
  inline def portrait: portrait = "portrait".asInstanceOf[portrait]
  
  @js.native
  sealed trait powderblue
    extends StObject
       with NamedColor
  inline def powderblue: powderblue = "powderblue".asInstanceOf[powderblue]
  
  @js.native
  sealed trait pre
    extends StObject
       with WhiteSpace
  inline def pre: pre = "pre".asInstanceOf[pre]
  
  @js.native
  sealed trait `pre-line`
    extends StObject
       with WhiteSpace
  inline def `pre-line`: `pre-line` = "pre-line".asInstanceOf[`pre-line`]
  
  @js.native
  sealed trait `pre-wrap`
    extends StObject
       with WhiteSpace
  inline def `pre-wrap`: `pre-wrap` = "pre-wrap".asInstanceOf[`pre-wrap`]
  
  @js.native
  sealed trait `preserve-3d`
    extends StObject
       with TransformStyle
  inline def `preserve-3d`: `preserve-3d` = "preserve-3d".asInstanceOf[`preserve-3d`]
  
  @js.native
  sealed trait progress
    extends StObject
       with _Cursor
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait `progress-bar`
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  inline def `progress-bar`: `progress-bar` = "progress-bar".asInstanceOf[`progress-bar`]
  
  @js.native
  sealed trait `progress-bar-value`
    extends StObject
       with WebkitAppearance
  inline def `progress-bar-value`: `progress-bar-value` = "progress-bar-value".asInstanceOf[`progress-bar-value`]
  
  @js.native
  sealed trait progressbar
    extends StObject
       with MozAppearance
  inline def progressbar: progressbar = "progressbar".asInstanceOf[progressbar]
  
  @js.native
  sealed trait `progressbar-vertical`
    extends StObject
       with MozAppearance
  inline def `progressbar-vertical`: `progressbar-vertical` = "progressbar-vertical".asInstanceOf[`progressbar-vertical`]
  
  @js.native
  sealed trait progresschunk
    extends StObject
       with MozAppearance
  inline def progresschunk: progresschunk = "progresschunk".asInstanceOf[progresschunk]
  
  @js.native
  sealed trait `progresschunk-vertical`
    extends StObject
       with MozAppearance
  inline def `progresschunk-vertical`: `progresschunk-vertical` = "progresschunk-vertical".asInstanceOf[`progresschunk-vertical`]
  
  @js.native
  sealed trait `proportional-nums`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  inline def `proportional-nums`: `proportional-nums` = "proportional-nums".asInstanceOf[`proportional-nums`]
  
  @js.native
  sealed trait `proportional-width`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantEastAsian
  inline def `proportional-width`: `proportional-width` = "proportional-width".asInstanceOf[`proportional-width`]
  
  @js.native
  sealed trait proximity
    extends StObject
       with MsContentZoomSnapType
       with MsScrollSnapType
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with _MsContentZoomSnap
  inline def proximity: proximity = "proximity".asInstanceOf[proximity]
  
  @js.native
  sealed trait purple
    extends StObject
       with NamedColor
  inline def purple: purple = "purple".asInstanceOf[purple]
  
  @js.native
  sealed trait `push-button`
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  inline def `push-button`: `push-button` = "push-button".asInstanceOf[`push-button`]
  
  @js.native
  sealed trait radio
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  inline def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait `radio-container`
    extends StObject
       with MozAppearance
  inline def `radio-container`: `radio-container` = "radio-container".asInstanceOf[`radio-container`]
  
  @js.native
  sealed trait `radio-label`
    extends StObject
       with MozAppearance
  inline def `radio-label`: `radio-label` = "radio-label".asInstanceOf[`radio-label`]
  
  @js.native
  sealed trait radiomenuitem
    extends StObject
       with MozAppearance
  inline def radiomenuitem: radiomenuitem = "radiomenuitem".asInstanceOf[radiomenuitem]
  
  @js.native
  sealed trait railed
    extends StObject
       with MsScrollRails
  inline def railed: railed = "railed".asInstanceOf[railed]
  
  @js.native
  sealed trait range
    extends StObject
       with MozAppearance
  inline def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait `range-thumb`
    extends StObject
       with MozAppearance
  inline def `range-thumb`: `range-thumb` = "range-thumb".asInstanceOf[`range-thumb`]
  
  @js.native
  sealed trait `read-only`
    extends StObject
       with MozUserModify
       with WebkitUserModify
  inline def `read-only`: `read-only` = "read-only".asInstanceOf[`read-only`]
  
  @js.native
  sealed trait `read-write`
    extends StObject
       with MozUserModify
       with WebkitUserModify
  inline def `read-write`: `read-write` = "read-write".asInstanceOf[`read-write`]
  
  @js.native
  sealed trait `read-write-plaintext-only`
    extends StObject
       with WebkitUserModify
  inline def `read-write-plaintext-only`: `read-write-plaintext-only` = "read-write-plaintext-only".asInstanceOf[`read-write-plaintext-only`]
  
  @js.native
  sealed trait rebeccapurple
    extends StObject
       with NamedColor
  inline def rebeccapurple: rebeccapurple = "rebeccapurple".asInstanceOf[rebeccapurple]
  
  @js.native
  sealed trait recto
    extends StObject
       with BreakAfter
       with BreakBefore
       with PageBreakAfter
       with PageBreakBefore
  inline def recto: recto = "recto".asInstanceOf[recto]
  
  @js.native
  sealed trait red
    extends StObject
       with NamedColor
  inline def red: red = "red".asInstanceOf[red]
  
  @js.native
  sealed trait region
    extends StObject
       with BreakAfter
       with BreakBefore
  inline def region: region = "region".asInstanceOf[region]
  
  @js.native
  sealed trait relative
    extends StObject
       with Position
  inline def relative: relative = "relative".asInstanceOf[relative]
  
  @js.native
  sealed trait repeat
    extends StObject
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with _BorderImage
       with _BorderImageRepeat
       with _MaskBorder
       with _MaskBorderRepeat
       with _RepeatStyle
  inline def repeat: repeat = "repeat".asInstanceOf[repeat]
  
  @js.native
  sealed trait `repeat-x`
    extends StObject
       with _RepeatStyle
  inline def `repeat-x`: `repeat-x` = "repeat-x".asInstanceOf[`repeat-x`]
  
  @js.native
  sealed trait `repeat-y`
    extends StObject
       with _RepeatStyle
  inline def `repeat-y`: `repeat-y` = "repeat-y".asInstanceOf[`repeat-y`]
  
  @js.native
  sealed trait reset
    extends StObject
       with _Zoom
  inline def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait `reset-size`
    extends StObject
       with DominantBaseline
  inline def `reset-size`: `reset-size` = "reset-size".asInstanceOf[`reset-size`]
  
  @js.native
  sealed trait resizer
    extends StObject
       with MozAppearance
  inline def resizer: resizer = "resizer".asInstanceOf[resizer]
  
  @js.native
  sealed trait resizerpanel
    extends StObject
       with MozAppearance
  inline def resizerpanel: resizerpanel = "resizerpanel".asInstanceOf[resizerpanel]
  
  @js.native
  sealed trait reverse
    extends StObject
       with BoxDirection
       with SingleAnimationDirection
       with _OffsetRotate
  inline def reverse: reverse = "reverse".asInstanceOf[reverse]
  
  @js.native
  sealed trait revert
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderCollapse
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with BoxAlign
       with BoxDecorationBreak
       with BoxDirection
       with BoxLines
       with BoxOrient
       with BoxPack
       with BoxSizing
       with BreakAfter
       with BreakBefore
       with BreakInside
       with CaptionSide
       with Clear
       with ClipRule
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
       with ContentVisibility
       with Direction
       with DominantBaseline
       with EmptyCells
       with FillRule
       with FlexDirection
       with FlexWrap
       with Float
       with FontKerning
       with FontOpticalSizing
       with FontVariantCaps
       with FontVariantPosition
       with ForcedColorAdjust
       with Globals
       with Hyphens
       with ImageRendering
       with ImeMode
       with InputSecurity
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
       with MathShift
       with MathStyle
       with MixBlendMode
       with MozAppearance
       with MozFloatEdge
       with MozOrient
       with MozStackSizing
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozUserModify
       with MozWindowDragging
       with MozWindowShadow
       with MsAccelerator
       with MsBlockProgression
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapFlow
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverflowBlock
       with OverflowClipBox
       with OverflowInline
       with OverflowWrap
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with Position
       with PrintColorAdjust
       with Resize
       with RubyAlign
       with RubyMerge
       with ScrollBehavior
       with ScrollSnapStop
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with ShapeRendering
       with StrokeLinecap
       with StrokeLinejoin
       with TableLayout
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with TextDecorationSkipInk
       with TextDecorationStyle
       with TextJustify
       with TextOrientation
       with TextRendering
       with TextTransform
       with TransformBox
       with TransformStyle
       with UnicodeBidi
       with UserSelect
       with VectorEffect
       with Visibility
       with WebkitAppearance
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with WebkitOverflowScrolling
       with WebkitTouchCallout
       with WebkitUserModify
       with WhiteSpace
       with WordBreak
       with WordWrap
       with WritingMode
  inline def revert: revert = "revert".asInstanceOf[revert]
  
  @js.native
  sealed trait `revert-layer`
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderCollapse
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with BoxAlign
       with BoxDecorationBreak
       with BoxDirection
       with BoxLines
       with BoxOrient
       with BoxPack
       with BoxSizing
       with BreakAfter
       with BreakBefore
       with BreakInside
       with CaptionSide
       with Clear
       with ClipRule
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
       with ContentVisibility
       with Direction
       with DominantBaseline
       with EmptyCells
       with FillRule
       with FlexDirection
       with FlexWrap
       with Float
       with FontKerning
       with FontOpticalSizing
       with FontVariantCaps
       with FontVariantPosition
       with ForcedColorAdjust
       with Globals
       with Hyphens
       with ImageRendering
       with ImeMode
       with InputSecurity
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
       with MathShift
       with MathStyle
       with MixBlendMode
       with MozAppearance
       with MozFloatEdge
       with MozOrient
       with MozStackSizing
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozUserModify
       with MozWindowDragging
       with MozWindowShadow
       with MsAccelerator
       with MsBlockProgression
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapFlow
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverflowBlock
       with OverflowClipBox
       with OverflowInline
       with OverflowWrap
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with Position
       with PrintColorAdjust
       with Resize
       with RubyAlign
       with RubyMerge
       with ScrollBehavior
       with ScrollSnapStop
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with ShapeRendering
       with StrokeLinecap
       with StrokeLinejoin
       with TableLayout
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with TextDecorationSkipInk
       with TextDecorationStyle
       with TextJustify
       with TextOrientation
       with TextRendering
       with TextTransform
       with TransformBox
       with TransformStyle
       with UnicodeBidi
       with UserSelect
       with VectorEffect
       with Visibility
       with WebkitAppearance
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with WebkitOverflowScrolling
       with WebkitTouchCallout
       with WebkitUserModify
       with WhiteSpace
       with WordBreak
       with WordWrap
       with WritingMode
  inline def `revert-layer`: `revert-layer` = "revert-layer".asInstanceOf[`revert-layer`]
  
  @js.native
  sealed trait ridge
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
  inline def ridge: ridge = "ridge".asInstanceOf[ridge]
  
  @js.native
  sealed trait right
    extends StObject
       with BreakAfter
       with BreakBefore
       with Clear
       with Float
       with PageBreakAfter
       with PageBreakBefore
       with TextAlign
       with TextAlignLast
       with _Azimuth
       with _BackgroundPositionX[Any]
       with _BgPosition[Any]
       with _JustifyContent
       with _JustifyItems
       with _JustifySelf
       with _JustifyTracks
       with _Position[Any]
       with _TextUnderlinePosition
       with _TransformOrigin[Any]
       with _WebkitBoxReflect[Any]
       with _WebkitMaskPositionX[Any]
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `right-side`
    extends StObject
       with _Azimuth
  inline def `right-side`: `right-side` = "right-side".asInstanceOf[`right-side`]
  
  @js.native
  sealed trait rightwards
    extends StObject
       with _Azimuth
  inline def rightwards: rightwards = "rightwards".asInstanceOf[rightwards]
  
  @js.native
  sealed trait rl
    extends StObject
       with MsBlockProgression
  inline def rl: rl = "rl".asInstanceOf[rl]
  
  @js.native
  sealed trait rosybrown
    extends StObject
       with NamedColor
  inline def rosybrown: rosybrown = "rosybrown".asInstanceOf[rosybrown]
  
  @js.native
  sealed trait round
    extends StObject
       with StrokeLinecap
       with StrokeLinejoin
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with _BorderImage
       with _BorderImageRepeat
       with _MaskBorder
       with _MaskBorderRepeat
       with _RepeatStyle
  inline def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait row
    extends StObject
       with FlexDirection
       with _FlexFlow
       with _GridAutoFlow
  inline def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait `row-resize`
    extends StObject
       with _Cursor
  inline def `row-resize`: `row-resize` = "row-resize".asInstanceOf[`row-resize`]
  
  @js.native
  sealed trait `row-reverse`
    extends StObject
       with FlexDirection
       with _FlexFlow
  inline def `row-reverse`: `row-reverse` = "row-reverse".asInstanceOf[`row-reverse`]
  
  @js.native
  sealed trait royalblue
    extends StObject
       with NamedColor
  inline def royalblue: royalblue = "royalblue".asInstanceOf[royalblue]
  
  @js.native
  sealed trait rtl
    extends StObject
       with Direction
  inline def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait ruby
    extends StObject
       with DisplayInside
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantEastAsian
  inline def ruby: ruby = "ruby".asInstanceOf[ruby]
  
  @js.native
  sealed trait `ruby-base`
    extends StObject
       with DisplayInternal
  inline def `ruby-base`: `ruby-base` = "ruby-base".asInstanceOf[`ruby-base`]
  
  @js.native
  sealed trait `ruby-base-container`
    extends StObject
       with DisplayInternal
  inline def `ruby-base-container`: `ruby-base-container` = "ruby-base-container".asInstanceOf[`ruby-base-container`]
  
  @js.native
  sealed trait `ruby-text`
    extends StObject
       with DisplayInternal
  inline def `ruby-text`: `ruby-text` = "ruby-text".asInstanceOf[`ruby-text`]
  
  @js.native
  sealed trait `ruby-text-container`
    extends StObject
       with DisplayInternal
  inline def `ruby-text-container`: `ruby-text-container` = "ruby-text-container".asInstanceOf[`ruby-text-container`]
  
  @js.native
  sealed trait `run-in`
    extends StObject
       with DisplayOutside
  inline def `run-in`: `run-in` = "run-in".asInstanceOf[`run-in`]
  
  @js.native
  sealed trait running
    extends StObject
       with _AnimationPlayState
       with _SingleAnimation[Any]
  inline def running: running = "running".asInstanceOf[running]
  
  @js.native
  sealed trait `s-resize`
    extends StObject
       with _Cursor
  inline def `s-resize`: `s-resize` = "s-resize".asInstanceOf[`s-resize`]
  
  @js.native
  sealed trait sRGB
    extends StObject
       with ColorInterpolation
  inline def sRGB: sRGB = "sRGB".asInstanceOf[sRGB]
  
  @js.native
  sealed trait saddlebrown
    extends StObject
       with NamedColor
  inline def saddlebrown: saddlebrown = "saddlebrown".asInstanceOf[saddlebrown]
  
  @js.native
  sealed trait salmon
    extends StObject
       with NamedColor
  inline def salmon: salmon = "salmon".asInstanceOf[salmon]
  
  @js.native
  sealed trait sandybrown
    extends StObject
       with NamedColor
  inline def sandybrown: sandybrown = "sandybrown".asInstanceOf[sandybrown]
  
  @js.native
  sealed trait `sans-serif`
    extends StObject
       with GenericFamily
  inline def `sans-serif`: `sans-serif` = "sans-serif".asInstanceOf[`sans-serif`]
  
  @js.native
  sealed trait saturation
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def saturation: saturation = "saturation".asInstanceOf[saturation]
  
  @js.native
  sealed trait `scale-down`
    extends StObject
       with ObjectFit
  inline def `scale-down`: `scale-down` = "scale-down".asInstanceOf[`scale-down`]
  
  @js.native
  sealed trait `scale-horizontal`
    extends StObject
       with MozAppearance
  inline def `scale-horizontal`: `scale-horizontal` = "scale-horizontal".asInstanceOf[`scale-horizontal`]
  
  @js.native
  sealed trait `scale-vertical`
    extends StObject
       with MozAppearance
  inline def `scale-vertical`: `scale-vertical` = "scale-vertical".asInstanceOf[`scale-vertical`]
  
  @js.native
  sealed trait `scalethumb-horizontal`
    extends StObject
       with MozAppearance
  inline def `scalethumb-horizontal`: `scalethumb-horizontal` = "scalethumb-horizontal".asInstanceOf[`scalethumb-horizontal`]
  
  @js.native
  sealed trait `scalethumb-vertical`
    extends StObject
       with MozAppearance
  inline def `scalethumb-vertical`: `scalethumb-vertical` = "scalethumb-vertical".asInstanceOf[`scalethumb-vertical`]
  
  @js.native
  sealed trait scalethumbend
    extends StObject
       with MozAppearance
  inline def scalethumbend: scalethumbend = "scalethumbend".asInstanceOf[scalethumbend]
  
  @js.native
  sealed trait scalethumbstart
    extends StObject
       with MozAppearance
  inline def scalethumbstart: scalethumbstart = "scalethumbstart".asInstanceOf[scalethumbstart]
  
  @js.native
  sealed trait scalethumbtick
    extends StObject
       with MozAppearance
  inline def scalethumbtick: scalethumbtick = "scalethumbtick".asInstanceOf[scalethumbtick]
  
  @js.native
  sealed trait screen
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def screen: screen = "screen".asInstanceOf[screen]
  
  @js.native
  sealed trait scroll
    extends StObject
       with Attachment
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with _Overflow
  inline def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait `scroll-position`
    extends StObject
       with _AnimateableFeature
  inline def `scroll-position`: `scroll-position` = "scroll-position".asInstanceOf[`scroll-position`]
  
  @js.native
  sealed trait scrollbar_
    extends StObject
       with MsOverflowStyle
  inline def scrollbar_ : scrollbar_ = "scrollbar".asInstanceOf[scrollbar_]
  
  @js.native
  sealed trait `scrollbarbutton-down`
    extends StObject
       with MozAppearance
  inline def `scrollbarbutton-down`: `scrollbarbutton-down` = "scrollbarbutton-down".asInstanceOf[`scrollbarbutton-down`]
  
  @js.native
  sealed trait `scrollbarbutton-left`
    extends StObject
       with MozAppearance
  inline def `scrollbarbutton-left`: `scrollbarbutton-left` = "scrollbarbutton-left".asInstanceOf[`scrollbarbutton-left`]
  
  @js.native
  sealed trait `scrollbarbutton-right`
    extends StObject
       with MozAppearance
  inline def `scrollbarbutton-right`: `scrollbarbutton-right` = "scrollbarbutton-right".asInstanceOf[`scrollbarbutton-right`]
  
  @js.native
  sealed trait `scrollbarbutton-up`
    extends StObject
       with MozAppearance
  inline def `scrollbarbutton-up`: `scrollbarbutton-up` = "scrollbarbutton-up".asInstanceOf[`scrollbarbutton-up`]
  
  @js.native
  sealed trait `scrollbarthumb-horizontal`
    extends StObject
       with MozAppearance
  inline def `scrollbarthumb-horizontal`: `scrollbarthumb-horizontal` = "scrollbarthumb-horizontal".asInstanceOf[`scrollbarthumb-horizontal`]
  
  @js.native
  sealed trait `scrollbarthumb-vertical`
    extends StObject
       with MozAppearance
  inline def `scrollbarthumb-vertical`: `scrollbarthumb-vertical` = "scrollbarthumb-vertical".asInstanceOf[`scrollbarthumb-vertical`]
  
  @js.native
  sealed trait `scrollbartrack-horizontal`
    extends StObject
       with MozAppearance
  inline def `scrollbartrack-horizontal`: `scrollbartrack-horizontal` = "scrollbartrack-horizontal".asInstanceOf[`scrollbartrack-horizontal`]
  
  @js.native
  sealed trait `scrollbartrack-vertical`
    extends StObject
       with MozAppearance
  inline def `scrollbartrack-vertical`: `scrollbartrack-vertical` = "scrollbartrack-vertical".asInstanceOf[`scrollbartrack-vertical`]
  
  @js.native
  sealed trait `se-resize`
    extends StObject
       with _Cursor
  inline def `se-resize`: `se-resize` = "se-resize".asInstanceOf[`se-resize`]
  
  @js.native
  sealed trait seagreen
    extends StObject
       with NamedColor
  inline def seagreen: seagreen = "seagreen".asInstanceOf[seagreen]
  
  @js.native
  sealed trait searchfield
    extends StObject
       with Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  inline def searchfield: searchfield = "searchfield".asInstanceOf[searchfield]
  
  @js.native
  sealed trait `searchfield-cancel-button`
    extends StObject
       with WebkitAppearance
  inline def `searchfield-cancel-button`: `searchfield-cancel-button` = "searchfield-cancel-button".asInstanceOf[`searchfield-cancel-button`]
  
  @js.native
  sealed trait `searchfield-decoration`
    extends StObject
       with WebkitAppearance
  inline def `searchfield-decoration`: `searchfield-decoration` = "searchfield-decoration".asInstanceOf[`searchfield-decoration`]
  
  @js.native
  sealed trait `searchfield-results-button`
    extends StObject
       with WebkitAppearance
  inline def `searchfield-results-button`: `searchfield-results-button` = "searchfield-results-button".asInstanceOf[`searchfield-results-button`]
  
  @js.native
  sealed trait `searchfield-results-decoration`
    extends StObject
       with WebkitAppearance
  inline def `searchfield-results-decoration`: `searchfield-results-decoration` = "searchfield-results-decoration".asInstanceOf[`searchfield-results-decoration`]
  
  @js.native
  sealed trait seashell
    extends StObject
       with NamedColor
  inline def seashell: seashell = "seashell".asInstanceOf[seashell]
  
  @js.native
  sealed trait `select-after`
    extends StObject
       with MozUserFocus
  inline def `select-after`: `select-after` = "select-after".asInstanceOf[`select-after`]
  
  @js.native
  sealed trait `select-all`
    extends StObject
       with MozUserFocus
  inline def `select-all`: `select-all` = "select-all".asInstanceOf[`select-all`]
  
  @js.native
  sealed trait `select-before`
    extends StObject
       with MozUserFocus
  inline def `select-before`: `select-before` = "select-before".asInstanceOf[`select-before`]
  
  @js.native
  sealed trait `select-menu`
    extends StObject
       with MozUserFocus
  inline def `select-menu`: `select-menu` = "select-menu".asInstanceOf[`select-menu`]
  
  @js.native
  sealed trait `select-same`
    extends StObject
       with MozUserFocus
  inline def `select-same`: `select-same` = "select-same".asInstanceOf[`select-same`]
  
  @js.native
  sealed trait `self-end`
    extends StObject
       with SelfPosition
  inline def `self-end`: `self-end` = "self-end".asInstanceOf[`self-end`]
  
  @js.native
  sealed trait `self-start`
    extends StObject
       with SelfPosition
  inline def `self-start`: `self-start` = "self-start".asInstanceOf[`self-start`]
  
  @js.native
  sealed trait `semi-condensed`
    extends StObject
       with _FontStretchAbsolute
  inline def `semi-condensed`: `semi-condensed` = "semi-condensed".asInstanceOf[`semi-condensed`]
  
  @js.native
  sealed trait `semi-expanded`
    extends StObject
       with _FontStretchAbsolute
  inline def `semi-expanded`: `semi-expanded` = "semi-expanded".asInstanceOf[`semi-expanded`]
  
  @js.native
  sealed trait separate
    extends StObject
       with BorderCollapse
       with RubyMerge
  inline def separate: separate = "separate".asInstanceOf[separate]
  
  @js.native
  sealed trait separator
    extends StObject
       with MozAppearance
  inline def separator: separator = "separator".asInstanceOf[separator]
  
  @js.native
  sealed trait serif
    extends StObject
       with GenericFamily
  inline def serif: serif = "serif".asInstanceOf[serif]
  
  @js.native
  sealed trait sesame
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  inline def sesame: sesame = "sesame".asInstanceOf[sesame]
  
  @js.native
  sealed trait sheet
    extends StObject
       with MozAppearance
       with MozWindowShadow
  inline def sheet: sheet = "sheet".asInstanceOf[sheet]
  
  @js.native
  sealed trait show
    extends StObject
       with EmptyCells
  inline def show: show = "show".asInstanceOf[show]
  
  @js.native
  sealed trait sideways
    extends StObject
       with TextOrientation
  inline def sideways: sideways = "sideways".asInstanceOf[sideways]
  
  @js.native
  sealed trait `sideways-lr`
    extends StObject
       with WritingMode
  inline def `sideways-lr`: `sideways-lr` = "sideways-lr".asInstanceOf[`sideways-lr`]
  
  @js.native
  sealed trait `sideways-rl`
    extends StObject
       with WritingMode
  inline def `sideways-rl`: `sideways-rl` = "sideways-rl".asInstanceOf[`sideways-rl`]
  
  @js.native
  sealed trait sienna
    extends StObject
       with NamedColor
  inline def sienna: sienna = "sienna".asInstanceOf[sienna]
  
  @js.native
  sealed trait silver
    extends StObject
       with NamedColor
  inline def silver: silver = "silver".asInstanceOf[silver]
  
  @js.native
  sealed trait simplified
    extends StObject
       with EastAsianVariantValues
  inline def simplified: simplified = "simplified".asInstanceOf[simplified]
  
  @js.native
  sealed trait single
    extends StObject
       with BoxLines
  inline def single: single = "single".asInstanceOf[single]
  
  @js.native
  sealed trait size
    extends StObject
       with _Contain
  inline def size: size = "size".asInstanceOf[size]
  
  @js.native
  sealed trait skyblue
    extends StObject
       with NamedColor
  inline def skyblue: skyblue = "skyblue".asInstanceOf[skyblue]
  
  @js.native
  sealed trait `slashed-zero`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  inline def `slashed-zero`: `slashed-zero` = "slashed-zero".asInstanceOf[`slashed-zero`]
  
  @js.native
  sealed trait slateblue
    extends StObject
       with NamedColor
  inline def slateblue: slateblue = "slateblue".asInstanceOf[slateblue]
  
  @js.native
  sealed trait slategray
    extends StObject
       with NamedColor
  inline def slategray: slategray = "slategray".asInstanceOf[slategray]
  
  @js.native
  sealed trait slategrey
    extends StObject
       with NamedColor
  inline def slategrey: slategrey = "slategrey".asInstanceOf[slategrey]
  
  @js.native
  sealed trait slice
    extends StObject
       with BoxDecorationBreak
  inline def slice: slice = "slice".asInstanceOf[slice]
  
  @js.native
  sealed trait `slider-horizontal`
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  inline def `slider-horizontal`: `slider-horizontal` = "slider-horizontal".asInstanceOf[`slider-horizontal`]
  
  @js.native
  sealed trait `slider-vertical`
    extends StObject
       with WebkitAppearance
  inline def `slider-vertical`: `slider-vertical` = "slider-vertical".asInstanceOf[`slider-vertical`]
  
  @js.native
  sealed trait `sliderthumb-horizontal`
    extends StObject
       with WebkitAppearance
  inline def `sliderthumb-horizontal`: `sliderthumb-horizontal` = "sliderthumb-horizontal".asInstanceOf[`sliderthumb-horizontal`]
  
  @js.native
  sealed trait `sliderthumb-vertical`
    extends StObject
       with WebkitAppearance
  inline def `sliderthumb-vertical`: `sliderthumb-vertical` = "sliderthumb-vertical".asInstanceOf[`sliderthumb-vertical`]
  
  @js.native
  sealed trait small
    extends StObject
       with AbsoluteSize
  inline def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait `small-caps`
    extends StObject
       with FontVariantCaps
       with _FontSynthesis
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  inline def `small-caps`: `small-caps` = "small-caps".asInstanceOf[`small-caps`]
  
  @js.native
  sealed trait `small-caption`
    extends StObject
       with _Font
  inline def `small-caption`: `small-caption` = "small-caption".asInstanceOf[`small-caption`]
  
  @js.native
  sealed trait smaller
    extends StObject
       with _FontSize[Any]
  inline def smaller: smaller = "smaller".asInstanceOf[smaller]
  
  @js.native
  sealed trait smooth
    extends StObject
       with ScrollBehavior
  inline def smooth: smooth = "smooth".asInstanceOf[smooth]
  
  @js.native
  sealed trait snow
    extends StObject
       with NamedColor
  inline def snow: snow = "snow".asInstanceOf[snow]
  
  @js.native
  sealed trait `soft-light`
    extends StObject
       with BlendMode
       with MixBlendMode
  inline def `soft-light`: `soft-light` = "soft-light".asInstanceOf[`soft-light`]
  
  @js.native
  sealed trait solid
    extends StObject
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with LineStyle
       with TextDecorationStyle
       with _TextDecoration[Any]
  inline def solid: solid = "solid".asInstanceOf[solid]
  
  @js.native
  sealed trait `source-atop`
    extends StObject
       with CompositeStyle
  inline def `source-atop`: `source-atop` = "source-atop".asInstanceOf[`source-atop`]
  
  @js.native
  sealed trait `source-in`
    extends StObject
       with CompositeStyle
  inline def `source-in`: `source-in` = "source-in".asInstanceOf[`source-in`]
  
  @js.native
  sealed trait `source-out`
    extends StObject
       with CompositeStyle
  inline def `source-out`: `source-out` = "source-out".asInstanceOf[`source-out`]
  
  @js.native
  sealed trait `source-over`
    extends StObject
       with CompositeStyle
  inline def `source-over`: `source-over` = "source-over".asInstanceOf[`source-over`]
  
  @js.native
  sealed trait space
    extends StObject
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with _BorderImage
       with _BorderImageRepeat
       with _MaskBorder
       with _MaskBorderRepeat
       with _RepeatStyle
  inline def space: space = "space".asInstanceOf[space]
  
  @js.native
  sealed trait `space-around`
    extends StObject
       with ContentDistribution
       with RubyAlign
  inline def `space-around`: `space-around` = "space-around".asInstanceOf[`space-around`]
  
  @js.native
  sealed trait `space-between`
    extends StObject
       with ContentDistribution
       with RubyAlign
  inline def `space-between`: `space-between` = "space-between".asInstanceOf[`space-between`]
  
  @js.native
  sealed trait `space-evenly`
    extends StObject
       with ContentDistribution
  inline def `space-evenly`: `space-evenly` = "space-evenly".asInstanceOf[`space-evenly`]
  
  @js.native
  sealed trait spaces
    extends StObject
       with _TextDecorationSkip
  inline def spaces: spaces = "spaces".asInstanceOf[spaces]
  
  @js.native
  sealed trait `spell-out`
    extends StObject
       with _SpeakAs
  inline def `spell-out`: `spell-out` = "spell-out".asInstanceOf[`spell-out`]
  
  @js.native
  sealed trait `spelling-error`
    extends StObject
       with _TextDecoration[Any]
       with _TextDecorationLine
  inline def `spelling-error`: `spelling-error` = "spelling-error".asInstanceOf[`spelling-error`]
  
  @js.native
  sealed trait spinner
    extends StObject
       with MozAppearance
  inline def spinner: spinner = "spinner".asInstanceOf[spinner]
  
  @js.native
  sealed trait `spinner-downbutton`
    extends StObject
       with MozAppearance
  inline def `spinner-downbutton`: `spinner-downbutton` = "spinner-downbutton".asInstanceOf[`spinner-downbutton`]
  
  @js.native
  sealed trait `spinner-textfield`
    extends StObject
       with MozAppearance
  inline def `spinner-textfield`: `spinner-textfield` = "spinner-textfield".asInstanceOf[`spinner-textfield`]
  
  @js.native
  sealed trait `spinner-upbutton`
    extends StObject
       with MozAppearance
  inline def `spinner-upbutton`: `spinner-upbutton` = "spinner-upbutton".asInstanceOf[`spinner-upbutton`]
  
  @js.native
  sealed trait splitter
    extends StObject
       with MozAppearance
  inline def splitter: splitter = "splitter".asInstanceOf[splitter]
  
  @js.native
  sealed trait springgreen
    extends StObject
       with NamedColor
  inline def springgreen: springgreen = "springgreen".asInstanceOf[springgreen]
  
  @js.native
  sealed trait square
    extends StObject
       with StrokeLinecap
  inline def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait `square-button`
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  inline def `square-button`: `square-button` = "square-button".asInstanceOf[`square-button`]
  
  @js.native
  sealed trait stable
    extends StObject
       with _ScrollbarGutter
  inline def stable: stable = "stable".asInstanceOf[stable]
  
  @js.native
  sealed trait `stacked-fractions`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  inline def `stacked-fractions`: `stacked-fractions` = "stacked-fractions".asInstanceOf[`stacked-fractions`]
  
  @js.native
  sealed trait start
    extends StObject
       with BoxAlign
       with BoxPack
       with ContentPosition
       with MsWrapFlow
       with RubyAlign
       with SelfPosition
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with _ScrollSnapAlign
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait static
    extends StObject
       with Position
  inline def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait `status-bar`
    extends StObject
       with _Font
  inline def `status-bar`: `status-bar` = "status-bar".asInstanceOf[`status-bar`]
  
  @js.native
  sealed trait statusbar
    extends StObject
       with MozAppearance
  inline def statusbar: statusbar = "statusbar".asInstanceOf[statusbar]
  
  @js.native
  sealed trait statusbarpanel
    extends StObject
       with MozAppearance
  inline def statusbarpanel: statusbarpanel = "statusbarpanel".asInstanceOf[statusbarpanel]
  
  @js.native
  sealed trait steelblue
    extends StObject
       with NamedColor
  inline def steelblue: steelblue = "steelblue".asInstanceOf[steelblue]
  
  @js.native
  sealed trait `step-end`
    extends StObject
       with _StepTimingFunction
  inline def `step-end`: `step-end` = "step-end".asInstanceOf[`step-end`]
  
  @js.native
  sealed trait `step-start`
    extends StObject
       with _StepTimingFunction
  inline def `step-start`: `step-start` = "step-start".asInstanceOf[`step-start`]
  
  @js.native
  sealed trait sticky
    extends StObject
       with Position
  inline def sticky: sticky = "sticky".asInstanceOf[sticky]
  
  @js.native
  sealed trait stretch
    extends StObject
       with BoxAlign
       with ContentDistribution
       with _AlignItems
       with _AlignSelf
       with _BorderImage
       with _BorderImageRepeat
       with _JustifyItems
       with _JustifySelf
       with _MaskBorder
       with _MaskBorderRepeat
       with _PlaceItems
       with _PlaceSelf
  inline def stretch: stretch = "stretch".asInstanceOf[stretch]
  
  @js.native
  sealed trait `stretch-to-fit`
    extends StObject
       with MozStackSizing
  inline def `stretch-to-fit`: `stretch-to-fit` = "stretch-to-fit".asInstanceOf[`stretch-to-fit`]
  
  @js.native
  sealed trait strict
    extends StObject
       with LineBreak
       with _Contain
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait stroke
    extends StObject
       with PointerEvents
       with _MozContextProperties
       with _PaintOrder
  inline def stroke: stroke = "stroke".asInstanceOf[stroke]
  
  @js.native
  sealed trait `stroke-box`
    extends StObject
       with GeometryBox
       with TransformBox
  inline def `stroke-box`: `stroke-box` = "stroke-box".asInstanceOf[`stroke-box`]
  
  @js.native
  sealed trait `stroke-opacity`
    extends StObject
       with _MozContextProperties
  inline def `stroke-opacity`: `stroke-opacity` = "stroke-opacity".asInstanceOf[`stroke-opacity`]
  
  @js.native
  sealed trait style
    extends StObject
       with _Contain
       with _FontSynthesis
  inline def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait sub
    extends StObject
       with FontVariantPosition
       with _BaselineShift[Any]
       with _VerticalAlign[Any]
  inline def sub: sub = "sub".asInstanceOf[sub]
  
  @js.native
  sealed trait subgrid
    extends StObject
       with _GridTemplateColumns[Any]
       with _GridTemplateRows[Any]
  inline def subgrid: subgrid = "subgrid".asInstanceOf[subgrid]
  
  @js.native
  sealed trait subtract
    extends StObject
       with CompositingOperator
  inline def subtract: subtract = "subtract".asInstanceOf[subtract]
  
  @js.native
  sealed trait `super`
    extends StObject
       with FontVariantPosition
       with _BaselineShift[Any]
       with _VerticalAlign[Any]
  inline def `super`: `super` = "super".asInstanceOf[`super`]
  
  @js.native
  sealed trait `sw-resize`
    extends StObject
       with _Cursor
  inline def `sw-resize`: `sw-resize` = "sw-resize".asInstanceOf[`sw-resize`]
  
  @js.native
  sealed trait swap
    extends StObject
       with FontDisplay
  inline def swap: swap = "swap".asInstanceOf[swap]
  
  @js.native
  sealed trait symbolic
    extends StObject
       with _System
  inline def symbolic: symbolic = "symbolic".asInstanceOf[symbolic]
  
  @js.native
  sealed trait tab
    extends StObject
       with MozAppearance
  inline def tab: tab = "tab".asInstanceOf[tab]
  
  @js.native
  sealed trait `tab-scroll-arrow-back`
    extends StObject
       with MozAppearance
  inline def `tab-scroll-arrow-back`: `tab-scroll-arrow-back` = "tab-scroll-arrow-back".asInstanceOf[`tab-scroll-arrow-back`]
  
  @js.native
  sealed trait `tab-scroll-arrow-forward`
    extends StObject
       with MozAppearance
  inline def `tab-scroll-arrow-forward`: `tab-scroll-arrow-forward` = "tab-scroll-arrow-forward".asInstanceOf[`tab-scroll-arrow-forward`]
  
  @js.native
  sealed trait table
    extends StObject
       with DisplayInside
  inline def table: table = "table".asInstanceOf[table]
  
  @js.native
  sealed trait `table-caption`
    extends StObject
       with DisplayInternal
  inline def `table-caption`: `table-caption` = "table-caption".asInstanceOf[`table-caption`]
  
  @js.native
  sealed trait `table-cell`
    extends StObject
       with DisplayInternal
  inline def `table-cell`: `table-cell` = "table-cell".asInstanceOf[`table-cell`]
  
  @js.native
  sealed trait `table-column`
    extends StObject
       with DisplayInternal
  inline def `table-column`: `table-column` = "table-column".asInstanceOf[`table-column`]
  
  @js.native
  sealed trait `table-column-group`
    extends StObject
       with DisplayInternal
  inline def `table-column-group`: `table-column-group` = "table-column-group".asInstanceOf[`table-column-group`]
  
  @js.native
  sealed trait `table-footer-group`
    extends StObject
       with DisplayInternal
  inline def `table-footer-group`: `table-footer-group` = "table-footer-group".asInstanceOf[`table-footer-group`]
  
  @js.native
  sealed trait `table-header-group`
    extends StObject
       with DisplayInternal
  inline def `table-header-group`: `table-header-group` = "table-header-group".asInstanceOf[`table-header-group`]
  
  @js.native
  sealed trait `table-row`
    extends StObject
       with DisplayInternal
  inline def `table-row`: `table-row` = "table-row".asInstanceOf[`table-row`]
  
  @js.native
  sealed trait `table-row-group`
    extends StObject
       with DisplayInternal
  inline def `table-row-group`: `table-row-group` = "table-row-group".asInstanceOf[`table-row-group`]
  
  @js.native
  sealed trait tabpanel
    extends StObject
       with MozAppearance
  inline def tabpanel: tabpanel = "tabpanel".asInstanceOf[tabpanel]
  
  @js.native
  sealed trait tabpanels
    extends StObject
       with MozAppearance
  inline def tabpanels: tabpanels = "tabpanels".asInstanceOf[tabpanels]
  
  @js.native
  sealed trait `tabular-nums`
    extends StObject
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  inline def `tabular-nums`: `tabular-nums` = "tabular-nums".asInstanceOf[`tabular-nums`]
  
  @js.native
  sealed trait tan
    extends StObject
       with NamedColor
  inline def tan: tan = "tan".asInstanceOf[tan]
  
  @js.native
  sealed trait tb
    extends StObject
       with MsBlockProgression
  inline def tb: tb = "tb".asInstanceOf[tb]
  
  @js.native
  sealed trait teal
    extends StObject
       with NamedColor
  inline def teal: teal = "teal".asInstanceOf[teal]
  
  @js.native
  sealed trait text
    extends StObject
       with MsUserSelect
       with UserSelect
       with _Cursor
       with _WebkitMask[Any]
       with _WebkitMaskClip
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait `text-after-edge`
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  inline def `text-after-edge`: `text-after-edge` = "text-after-edge".asInstanceOf[`text-after-edge`]
  
  @js.native
  sealed trait `text-before-edge`
    extends StObject
       with AlignmentBaseline
       with DominantBaseline
  inline def `text-before-edge`: `text-before-edge` = "text-before-edge".asInstanceOf[`text-before-edge`]
  
  @js.native
  sealed trait `text-bottom`
    extends StObject
       with _VerticalAlign[Any]
  inline def `text-bottom`: `text-bottom` = "text-bottom".asInstanceOf[`text-bottom`]
  
  @js.native
  sealed trait `text-top`
    extends StObject
       with _VerticalAlign[Any]
  inline def `text-top`: `text-top` = "text-top".asInstanceOf[`text-top`]
  
  @js.native
  sealed trait textarea
    extends StObject
       with Appearance
       with CompatAuto
       with WebkitAppearance
  inline def textarea: textarea = "textarea".asInstanceOf[textarea]
  
  @js.native
  sealed trait textfield
    extends StObject
       with Appearance
       with MozAppearance
       with WebkitAppearance
  inline def textfield: textfield = "textfield".asInstanceOf[textfield]
  
  @js.native
  sealed trait `textfield-multiline`
    extends StObject
       with MozAppearance
  inline def `textfield-multiline`: `textfield-multiline` = "textfield-multiline".asInstanceOf[`textfield-multiline`]
  
  @js.native
  sealed trait thick
    extends StObject
       with _LineWidth[Any]
  inline def thick: thick = "thick".asInstanceOf[thick]
  
  @js.native
  sealed trait thin
    extends StObject
       with ScrollbarWidth
       with _LineWidth[Any]
  inline def thin: thin = "thin".asInstanceOf[thin]
  
  @js.native
  sealed trait thistle
    extends StObject
       with NamedColor
  inline def thistle: thistle = "thistle".asInstanceOf[thistle]
  
  @js.native
  sealed trait `titling-caps`
    extends StObject
       with FontVariantCaps
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  inline def `titling-caps`: `titling-caps` = "titling-caps".asInstanceOf[`titling-caps`]
  
  @js.native
  sealed trait tomato
    extends StObject
       with NamedColor
  inline def tomato: tomato = "tomato".asInstanceOf[tomato]
  
  @js.native
  sealed trait toolbar
    extends StObject
       with MozAppearance
  inline def toolbar: toolbar = "toolbar".asInstanceOf[toolbar]
  
  @js.native
  sealed trait toolbarbutton
    extends StObject
       with MozAppearance
  inline def toolbarbutton: toolbarbutton = "toolbarbutton".asInstanceOf[toolbarbutton]
  
  @js.native
  sealed trait `toolbarbutton-dropdown`
    extends StObject
       with MozAppearance
  inline def `toolbarbutton-dropdown`: `toolbarbutton-dropdown` = "toolbarbutton-dropdown".asInstanceOf[`toolbarbutton-dropdown`]
  
  @js.native
  sealed trait toolbargripper
    extends StObject
       with MozAppearance
  inline def toolbargripper: toolbargripper = "toolbargripper".asInstanceOf[toolbargripper]
  
  @js.native
  sealed trait toolbox
    extends StObject
       with MozAppearance
  inline def toolbox: toolbox = "toolbox".asInstanceOf[toolbox]
  
  @js.native
  sealed trait tooltip
    extends StObject
       with MozAppearance
       with MozWindowShadow
  inline def tooltip: tooltip = "tooltip".asInstanceOf[tooltip]
  
  @js.native
  sealed trait top
    extends StObject
       with CaptionSide
       with _BackgroundPositionY[Any]
       with _BgPosition[Any]
       with _Position[Any]
       with _TransformOrigin[Any]
       with _VerticalAlign[Any]
       with _WebkitMaskPositionY[Any]
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait touch
    extends StObject
       with WebkitOverflowScrolling
  inline def touch: touch = "touch".asInstanceOf[touch]
  
  @js.native
  sealed trait traditional
    extends StObject
       with EastAsianVariantValues
  inline def traditional: traditional = "traditional".asInstanceOf[traditional]
  
  @js.native
  sealed trait `trailing-spaces`
    extends StObject
       with _TextDecorationSkip
  inline def `trailing-spaces`: `trailing-spaces` = "trailing-spaces".asInstanceOf[`trailing-spaces`]
  
  @js.native
  sealed trait transparent
    extends StObject
       with NamedColor
  inline def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait treeheader
    extends StObject
       with MozAppearance
  inline def treeheader: treeheader = "treeheader".asInstanceOf[treeheader]
  
  @js.native
  sealed trait treeheadercell
    extends StObject
       with MozAppearance
  inline def treeheadercell: treeheadercell = "treeheadercell".asInstanceOf[treeheadercell]
  
  @js.native
  sealed trait treeheadersortarrow
    extends StObject
       with MozAppearance
  inline def treeheadersortarrow: treeheadersortarrow = "treeheadersortarrow".asInstanceOf[treeheadersortarrow]
  
  @js.native
  sealed trait treeitem
    extends StObject
       with MozAppearance
  inline def treeitem: treeitem = "treeitem".asInstanceOf[treeitem]
  
  @js.native
  sealed trait treeline
    extends StObject
       with MozAppearance
  inline def treeline: treeline = "treeline".asInstanceOf[treeline]
  
  @js.native
  sealed trait treetwisty
    extends StObject
       with MozAppearance
  inline def treetwisty: treetwisty = "treetwisty".asInstanceOf[treetwisty]
  
  @js.native
  sealed trait treetwistyopen
    extends StObject
       with MozAppearance
  inline def treetwistyopen: treetwistyopen = "treetwistyopen".asInstanceOf[treetwistyopen]
  
  @js.native
  sealed trait treeview
    extends StObject
       with MozAppearance
  inline def treeview: treeview = "treeview".asInstanceOf[treeview]
  
  @js.native
  sealed trait triangle
    extends StObject
       with _TextEmphasis
       with _TextEmphasisStyle
  inline def triangle: triangle = "triangle".asInstanceOf[triangle]
  
  @js.native
  sealed trait `true`
    extends StObject
       with Inherits
       with MsAccelerator
  inline def `true`: `true` = "true".asInstanceOf[`true`]
  
  @js.native
  sealed trait turquoise
    extends StObject
       with NamedColor
  inline def turquoise: turquoise = "turquoise".asInstanceOf[turquoise]
  
  @js.native
  sealed trait `ultra-condensed`
    extends StObject
       with _FontStretchAbsolute
  inline def `ultra-condensed`: `ultra-condensed` = "ultra-condensed".asInstanceOf[`ultra-condensed`]
  
  @js.native
  sealed trait `ultra-expanded`
    extends StObject
       with _FontStretchAbsolute
  inline def `ultra-expanded`: `ultra-expanded` = "ultra-expanded".asInstanceOf[`ultra-expanded`]
  
  @js.native
  sealed trait under
    extends StObject
       with _RubyPosition
       with _TextUnderlinePosition
  inline def under: under = "under".asInstanceOf[under]
  
  @js.native
  sealed trait underline
    extends StObject
       with _TextDecoration[Any]
       with _TextDecorationLine
  inline def underline: underline = "underline".asInstanceOf[underline]
  
  @js.native
  sealed trait unicase
    extends StObject
       with FontVariantCaps
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  inline def unicase: unicase = "unicase".asInstanceOf[unicase]
  
  @js.native
  sealed trait unset
    extends StObject
       with AlignmentBaseline
       with Appearance
       with BackfaceVisibility
       with BorderBlockEndStyle
       with BorderBlockStartStyle
       with BorderBlockStyle
       with BorderBottomStyle
       with BorderCollapse
       with BorderInlineEndStyle
       with BorderInlineStartStyle
       with BorderInlineStyle
       with BorderLeftStyle
       with BorderRightStyle
       with BorderTopStyle
       with BoxAlign
       with BoxDecorationBreak
       with BoxDirection
       with BoxLines
       with BoxOrient
       with BoxPack
       with BoxSizing
       with BreakAfter
       with BreakBefore
       with BreakInside
       with CaptionSide
       with Clear
       with ClipRule
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
       with ContentVisibility
       with Direction
       with DominantBaseline
       with EmptyCells
       with FillRule
       with FlexDirection
       with FlexWrap
       with Float
       with FontKerning
       with FontOpticalSizing
       with FontVariantCaps
       with FontVariantPosition
       with ForcedColorAdjust
       with Globals
       with Hyphens
       with ImageRendering
       with ImeMode
       with InputSecurity
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
       with MathShift
       with MathStyle
       with MixBlendMode
       with MozAppearance
       with MozFloatEdge
       with MozOrient
       with MozStackSizing
       with MozTextBlink
       with MozUserFocus
       with MozUserInput
       with MozUserModify
       with MozWindowDragging
       with MozWindowShadow
       with MsAccelerator
       with MsBlockProgression
       with MsContentZoomChaining
       with MsContentZoomSnapType
       with MsContentZooming
       with MsHighContrastAdjust
       with MsImeAlign
       with MsOverflowStyle
       with MsScrollChaining
       with MsScrollRails
       with MsScrollSnapType
       with MsScrollTranslation
       with MsTextAutospace
       with MsTouchSelect
       with MsUserSelect
       with MsWrapFlow
       with MsWrapThrough
       with ObjectFit
       with OverflowAnchor
       with OverflowBlock
       with OverflowClipBox
       with OverflowInline
       with OverflowWrap
       with OverflowX
       with OverflowY
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
       with PointerEvents
       with Position
       with PrintColorAdjust
       with Resize
       with RubyAlign
       with RubyMerge
       with ScrollBehavior
       with ScrollSnapStop
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with ScrollbarWidth
       with ShapeRendering
       with StrokeLinecap
       with StrokeLinejoin
       with TableLayout
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with TextDecorationSkipInk
       with TextDecorationStyle
       with TextJustify
       with TextOrientation
       with TextRendering
       with TextTransform
       with TransformBox
       with TransformStyle
       with UnicodeBidi
       with UserSelect
       with VectorEffect
       with Visibility
       with WebkitAppearance
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with WebkitOverflowScrolling
       with WebkitTouchCallout
       with WebkitUserModify
       with WhiteSpace
       with WordBreak
       with WordWrap
       with WritingMode
  inline def unset: unset = "unset".asInstanceOf[unset]
  
  @js.native
  sealed trait uppercase
    extends StObject
       with TextTransform
  inline def uppercase: uppercase = "uppercase".asInstanceOf[uppercase]
  
  @js.native
  sealed trait upright
    extends StObject
       with TextOrientation
  inline def upright: upright = "upright".asInstanceOf[upright]
  
  @js.native
  sealed trait `use-script`
    extends StObject
       with DominantBaseline
  inline def `use-script`: `use-script` = "use-script".asInstanceOf[`use-script`]
  
  @js.native
  sealed trait verso
    extends StObject
       with BreakAfter
       with BreakBefore
       with PageBreakAfter
       with PageBreakBefore
  inline def verso: verso = "verso".asInstanceOf[verso]
  
  @js.native
  sealed trait vertical
    extends StObject
       with BoxOrient
       with MozOrient
       with Resize
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait `vertical-lr`
    extends StObject
       with WritingMode
  inline def `vertical-lr`: `vertical-lr` = "vertical-lr".asInstanceOf[`vertical-lr`]
  
  @js.native
  sealed trait `vertical-rl`
    extends StObject
       with WritingMode
  inline def `vertical-rl`: `vertical-rl` = "vertical-rl".asInstanceOf[`vertical-rl`]
  
  @js.native
  sealed trait `vertical-text`
    extends StObject
       with _Cursor
  inline def `vertical-text`: `vertical-text` = "vertical-text".asInstanceOf[`vertical-text`]
  
  @js.native
  sealed trait `vertical-to-horizontal`
    extends StObject
       with MsScrollTranslation
  inline def `vertical-to-horizontal`: `vertical-to-horizontal` = "vertical-to-horizontal".asInstanceOf[`vertical-to-horizontal`]
  
  @js.native
  sealed trait `view-box`
    extends StObject
       with GeometryBox
       with TransformBox
  inline def `view-box`: `view-box` = "view-box".asInstanceOf[`view-box`]
  
  @js.native
  sealed trait violet
    extends StObject
       with NamedColor
  inline def violet: violet = "violet".asInstanceOf[violet]
  
  @js.native
  sealed trait visible
    extends StObject
       with BackfaceVisibility
       with ContentVisibility
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with PointerEvents
       with Visibility
       with _Overflow
  inline def visible: visible = "visible".asInstanceOf[visible]
  
  @js.native
  sealed trait visibleFill
    extends StObject
       with PointerEvents
  inline def visibleFill: visibleFill = "visibleFill".asInstanceOf[visibleFill]
  
  @js.native
  sealed trait visiblePainted
    extends StObject
       with PointerEvents
  inline def visiblePainted: visiblePainted = "visiblePainted".asInstanceOf[visiblePainted]
  
  @js.native
  sealed trait visibleStroke
    extends StObject
       with PointerEvents
  inline def visibleStroke: visibleStroke = "visibleStroke".asInstanceOf[visibleStroke]
  
  @js.native
  sealed trait `w-resize`
    extends StObject
       with _Cursor
  inline def `w-resize`: `w-resize` = "w-resize".asInstanceOf[`w-resize`]
  
  @js.native
  sealed trait wait
    extends StObject
       with _Cursor
  
  @js.native
  sealed trait wavy
    extends StObject
       with TextDecorationStyle
       with _TextDecoration[Any]
  inline def wavy: wavy = "wavy".asInstanceOf[wavy]
  
  @js.native
  sealed trait weight
    extends StObject
       with _FontSynthesis
  inline def weight: weight = "weight".asInstanceOf[weight]
  
  @js.native
  sealed trait wheat
    extends StObject
       with NamedColor
  inline def wheat: wheat = "wheat".asInstanceOf[wheat]
  
  @js.native
  sealed trait white
    extends StObject
       with NamedColor
  inline def white: white = "white".asInstanceOf[white]
  
  @js.native
  sealed trait whitesmoke
    extends StObject
       with NamedColor
  inline def whitesmoke: whitesmoke = "whitesmoke".asInstanceOf[whitesmoke]
  
  @js.native
  sealed trait words
    extends StObject
       with _SpeakAs
  inline def words: words = "words".asInstanceOf[words]
  
  @js.native
  sealed trait wrap
    extends StObject
       with FlexWrap
       with MsWrapThrough
       with _FlexFlow
  inline def wrap: wrap = "wrap".asInstanceOf[wrap]
  
  @js.native
  sealed trait `wrap-reverse`
    extends StObject
       with FlexWrap
       with _FlexFlow
  inline def `wrap-reverse`: `wrap-reverse` = "wrap-reverse".asInstanceOf[`wrap-reverse`]
  
  @js.native
  sealed trait `write-only`
    extends StObject
       with MozUserModify
  inline def `write-only`: `write-only` = "write-only".asInstanceOf[`write-only`]
  
  @js.native
  sealed trait x
    extends StObject
       with _ScrollSnapType
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait `x-end`
    extends StObject
       with _BackgroundPositionX[Any]
  inline def `x-end`: `x-end` = "x-end".asInstanceOf[`x-end`]
  
  @js.native
  sealed trait `x-large`
    extends StObject
       with AbsoluteSize
  inline def `x-large`: `x-large` = "x-large".asInstanceOf[`x-large`]
  
  @js.native
  sealed trait `x-small`
    extends StObject
       with AbsoluteSize
  inline def `x-small`: `x-small` = "x-small".asInstanceOf[`x-small`]
  
  @js.native
  sealed trait `x-start`
    extends StObject
       with _BackgroundPositionX[Any]
  inline def `x-start`: `x-start` = "x-start".asInstanceOf[`x-start`]
  
  @js.native
  sealed trait xor
    extends StObject
       with CompositeStyle
  inline def xor: xor = "xor".asInstanceOf[xor]
  
  @js.native
  sealed trait `xx-large`
    extends StObject
       with AbsoluteSize
  inline def `xx-large`: `xx-large` = "xx-large".asInstanceOf[`xx-large`]
  
  @js.native
  sealed trait `xx-small`
    extends StObject
       with AbsoluteSize
  inline def `xx-small`: `xx-small` = "xx-small".asInstanceOf[`xx-small`]
  
  @js.native
  sealed trait `xxx-large`
    extends StObject
       with AbsoluteSize
  inline def `xxx-large`: `xxx-large` = "xxx-large".asInstanceOf[`xxx-large`]
  
  @js.native
  sealed trait y
    extends StObject
       with _ScrollSnapType
  inline def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait `y-end`
    extends StObject
       with _BackgroundPositionY[Any]
  inline def `y-end`: `y-end` = "y-end".asInstanceOf[`y-end`]
  
  @js.native
  sealed trait `y-start`
    extends StObject
       with _BackgroundPositionY[Any]
  inline def `y-start`: `y-start` = "y-start".asInstanceOf[`y-start`]
  
  @js.native
  sealed trait yellow
    extends StObject
       with NamedColor
  inline def yellow: yellow = "yellow".asInstanceOf[yellow]
  
  @js.native
  sealed trait yellowgreen
    extends StObject
       with NamedColor
  inline def yellowgreen: yellowgreen = "yellowgreen".asInstanceOf[yellowgreen]
  
  @js.native
  sealed trait zoom
    extends StObject
       with MsContentZooming
       with UserZoom
  inline def zoom: zoom = "zoom".asInstanceOf[zoom]
  
  @js.native
  sealed trait `zoom-in`
    extends StObject
       with _Cursor
  inline def `zoom-in`: `zoom-in` = "zoom-in".asInstanceOf[`zoom-in`]
  
  @js.native
  sealed trait `zoom-out`
    extends StObject
       with _Cursor
  inline def `zoom-out`: `zoom-out` = "zoom-out".asInstanceOf[`zoom-out`]
}
