package typings.csstype

import typings.csstype.mod.AdvancedPseudos
import typings.csstype.mod.AtRule.FontDisplay
import typings.csstype.mod.AtRule.Orientation
import typings.csstype.mod.AtRule.UserZoom
import typings.csstype.mod.AtRule._Range
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
import typings.csstype.mod.DataType.Quote
import typings.csstype.mod.DataType.SelfPosition
import typings.csstype.mod.DataType.SingleAnimationDirection
import typings.csstype.mod.DataType.SingleAnimationFillMode
import typings.csstype.mod.DataType._AnimateableFeature
import typings.csstype.mod.DataType._BgPosition
import typings.csstype.mod.DataType._BgSize
import typings.csstype.mod.DataType._Color
import typings.csstype.mod.DataType._ContentList
import typings.csstype.mod.DataType._CubicBezierTimingFunction
import typings.csstype.mod.DataType._FinalBgLayer
import typings.csstype.mod.DataType._FontStretchAbsolute
import typings.csstype.mod.DataType._FontWeightAbsolute
import typings.csstype.mod.DataType._LineWidth
import typings.csstype.mod.DataType._MaskLayer
import typings.csstype.mod.DataType._Paint
import typings.csstype.mod.DataType._Position
import typings.csstype.mod.DataType._RepeatStyle
import typings.csstype.mod.DataType._SingleAnimation
import typings.csstype.mod.DataType._SingleTransition
import typings.csstype.mod.DataType._StepTimingFunction
import typings.csstype.mod.DataType._TimingFunction
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
import typings.csstype.mod.Property.ColorAdjust
import typings.csstype.mod.Property.ColorInterpolation
import typings.csstype.mod.Property.ColorRendering
import typings.csstype.mod.Property.ColumnFill
import typings.csstype.mod.Property.ColumnSpan
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
import typings.csstype.mod.Property.Hyphens
import typings.csstype.mod.Property.ImageRendering
import typings.csstype.mod.Property.ImeMode
import typings.csstype.mod.Property.Isolation
import typings.csstype.mod.Property.LineBreak
import typings.csstype.mod.Property.ListStylePosition
import typings.csstype.mod.Property.MaskBorderMode
import typings.csstype.mod.Property.MaskType
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
import typings.csstype.mod.Property.Resize
import typings.csstype.mod.Property.RubyAlign
import typings.csstype.mod.Property.RubyMerge
import typings.csstype.mod.Property.RubyPosition
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
import typings.csstype.mod.Property._AlignContent
import typings.csstype.mod.Property._AlignItems
import typings.csstype.mod.Property._AlignSelf
import typings.csstype.mod.Property._AnimationIterationCount
import typings.csstype.mod.Property._AnimationName
import typings.csstype.mod.Property._AnimationPlayState
import typings.csstype.mod.Property._AspectRatio
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
import typings.csstype.mod.Property._MaskOrigin
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
import typings.csstype.mod.Pseudos
import typings.csstype.mod.SimplePseudos
import typings.csstype.mod.SvgAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object csstypeStrings {
  @js.native
  sealed trait `-moz-crisp-edges` extends ImageRendering
  
  @js.native
  sealed trait `-moz-grab` extends _Cursor
  
  @js.native
  sealed trait `-moz-initial`
    extends Globals
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
       with ColorAdjust
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
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
       with Hyphens
       with ImageRendering
       with ImeMode
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
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
       with Resize
       with RubyAlign
       with RubyMerge
       with RubyPosition
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
  
  @js.native
  sealed trait `-moz-isolate` extends UnicodeBidi
  
  @js.native
  sealed trait `-moz-isolate-override` extends UnicodeBidi
  
  @js.native
  sealed trait `-moz-mac-unified-toolbar` extends MozAppearance
  
  @js.native
  sealed trait `-moz-max-content`
    extends _BlockSize[js.Any]
       with _FlexBasis[js.Any]
       with _Height[js.Any]
       with _InlineSize[js.Any]
       with _MaxBlockSize[js.Any]
       with _MaxHeight[js.Any]
       with _MaxInlineSize[js.Any]
       with _MaxWidth[js.Any]
       with _MinBlockSize[js.Any]
       with _MinHeight[js.Any]
       with _MinInlineSize[js.Any]
       with _MinWidth[js.Any]
       with _Width[js.Any]
  
  @js.native
  sealed trait `-moz-min-content`
    extends _BlockSize[js.Any]
       with _FlexBasis[js.Any]
       with _Height[js.Any]
       with _InlineSize[js.Any]
       with _MaxBlockSize[js.Any]
       with _MaxHeight[js.Any]
       with _MaxInlineSize[js.Any]
       with _MaxWidth[js.Any]
       with _MinBlockSize[js.Any]
       with _MinHeight[js.Any]
       with _MinInlineSize[js.Any]
       with _MinWidth[js.Any]
       with _Width[js.Any]
  
  @js.native
  sealed trait `-moz-none` extends UserSelect
  
  @js.native
  sealed trait `-moz-plaintext` extends UnicodeBidi
  
  @js.native
  sealed trait `-moz-pre-wrap` extends WhiteSpace
  
  @js.native
  sealed trait `-moz-win-borderless-glass` extends MozAppearance
  
  @js.native
  sealed trait `-moz-win-browsertabbar-toolbox` extends MozAppearance
  
  @js.native
  sealed trait `-moz-win-communications-toolbox` extends MozAppearance
  
  @js.native
  sealed trait `-moz-win-communicationstext` extends MozAppearance
  
  @js.native
  sealed trait `-moz-win-exclude-glass` extends MozAppearance
  
  @js.native
  sealed trait `-moz-win-glass` extends MozAppearance
  
  @js.native
  sealed trait `-moz-win-media-toolbox` extends MozAppearance
  
  @js.native
  sealed trait `-moz-win-mediatext` extends MozAppearance
  
  @js.native
  sealed trait `-moz-window-button-box` extends MozAppearance
  
  @js.native
  sealed trait `-moz-window-button-box-maximized` extends MozAppearance
  
  @js.native
  sealed trait `-moz-window-button-close` extends MozAppearance
  
  @js.native
  sealed trait `-moz-window-button-maximize` extends MozAppearance
  
  @js.native
  sealed trait `-moz-window-button-minimize` extends MozAppearance
  
  @js.native
  sealed trait `-moz-window-button-restore` extends MozAppearance
  
  @js.native
  sealed trait `-moz-window-frame-bottom` extends MozAppearance
  
  @js.native
  sealed trait `-moz-window-frame-left` extends MozAppearance
  
  @js.native
  sealed trait `-moz-window-frame-right` extends MozAppearance
  
  @js.native
  sealed trait `-moz-window-titlebar` extends MozAppearance
  
  @js.native
  sealed trait `-moz-window-titlebar-maximized` extends MozAppearance
  
  @js.native
  sealed trait `-ms-autohiding-scrollbar` extends MsOverflowStyle
  
  @js.native
  sealed trait `-ms-flexbox` extends DisplayInside
  
  @js.native
  sealed trait `-ms-grid` extends DisplayInside
  
  @js.native
  sealed trait `-ms-inline-flexbox` extends DisplayLegacy
  
  @js.native
  sealed trait `-ms-inline-grid` extends DisplayLegacy
  
  @js.native
  sealed trait `-ms-manipulation` extends _TouchAction
  
  @js.native
  sealed trait `-ms-none` extends _TouchAction
  
  @js.native
  sealed trait `-ms-pinch-zoom` extends _TouchAction
  
  @js.native
  sealed trait `-ms-zoom` extends UserZoom
  
  @js.native
  sealed trait `-webkit-auto`
    extends _FlexBasis[js.Any]
  
  @js.native
  sealed trait `-webkit-flex` extends DisplayInside
  
  @js.native
  sealed trait `-webkit-grab` extends _Cursor
  
  @js.native
  sealed trait `-webkit-inline-flex` extends DisplayLegacy
  
  @js.native
  sealed trait `-webkit-isolate` extends UnicodeBidi
  
  @js.native
  sealed trait `-webkit-max-content`
    extends _MaxHeight[js.Any]
       with _MaxWidth[js.Any]
       with _MinHeight[js.Any]
       with _MinWidth[js.Any]
       with _Width[js.Any]
  
  @js.native
  sealed trait `-webkit-min-content`
    extends _MaxHeight[js.Any]
       with _MaxWidth[js.Any]
       with _MinHeight[js.Any]
       with _MinWidth[js.Any]
  
  @js.native
  sealed trait `-webkit-optimize-contrast` extends ImageRendering
  
  @js.native
  sealed trait `-webkit-sticky` extends Position
  
  @js.native
  sealed trait `@charset` extends AtRules
  
  @js.native
  sealed trait `@counter-style` extends AtRules
  
  @js.native
  sealed trait `@document` extends AtRules
  
  @js.native
  sealed trait `@font-face` extends AtRules
  
  @js.native
  sealed trait `@font-feature-values` extends AtRules
  
  @js.native
  sealed trait `@import` extends AtRules
  
  @js.native
  sealed trait `@keyframes` extends AtRules
  
  @js.native
  sealed trait `@media` extends AtRules
  
  @js.native
  sealed trait `@namespace` extends AtRules
  
  @js.native
  sealed trait `@page` extends AtRules
  
  @js.native
  sealed trait `@supports` extends AtRules
  
  @js.native
  sealed trait `@viewport` extends AtRules
  
  @js.native
  sealed trait ActiveBorder extends DeprecatedSystemColor
  
  @js.native
  sealed trait ActiveCaption extends DeprecatedSystemColor
  
  @js.native
  sealed trait AppWorkspace extends DeprecatedSystemColor
  
  @js.native
  sealed trait Background extends DeprecatedSystemColor
  
  @js.native
  sealed trait ButtonFace extends DeprecatedSystemColor
  
  @js.native
  sealed trait ButtonHighlight extends DeprecatedSystemColor
  
  @js.native
  sealed trait ButtonShadow extends DeprecatedSystemColor
  
  @js.native
  sealed trait ButtonText extends DeprecatedSystemColor
  
  @js.native
  sealed trait CaptionText extends DeprecatedSystemColor
  
  @js.native
  sealed trait `Colon-khtml-any-link`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colon-moz-any-link`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colon-moz-anyLeftparenthesisRightparenthesis`
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait `Colon-moz-dir`
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait `Colon-moz-focusring`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colon-moz-full-screen`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colon-moz-placeholder`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colon-moz-read-only`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colon-moz-read-write`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colon-ms-fullscreen`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colon-ms-input-placeholder`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colon-webkit-any-link`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colon-webkit-anyLeftparenthesisRightparenthesis`
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait `Colon-webkit-full-screen`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-moz-placeholder`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-moz-progress-bar`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-moz-range-progress`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-moz-range-thumb`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-moz-range-track`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-moz-selection`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-backdrop`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-browse`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-check`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-clear`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-fill`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-fill-lower`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-fill-upper`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-input-placeholder`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-reveal`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-thumb`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-ticks-after`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-ticks-before`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-tooltip`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-track`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-ms-value`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-webkit-backdrop`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-webkit-input-placeholder`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-webkit-progress-bar`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-webkit-progress-inner-value`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-webkit-progress-value`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-webkit-slider-runnable-track`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColon-webkit-slider-thumb`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait ColonColonafter
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait ColonColonbackdrop
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait ColonColonbefore
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait ColonColoncue
    extends AdvancedPseudos
       with Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColoncue-region`
    extends AdvancedPseudos
       with Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColonfirst-letter`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColonfirst-line`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `ColonColongrammar-error`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait ColonColonmarker
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait ColonColonpart
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait ColonColonplaceholder
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait ColonColonselection
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait ColonColonslotted
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait `ColonColonspelling-error`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonactive
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonafter
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonany-link`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonbefore
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonblank
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonchecked
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colondefault
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colondefined
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colondir
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait Colondisabled
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonempty
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonenabled
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonfirst
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonfirst-child`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonfirst-letter`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonfirst-line`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonfirst-of-type`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonfocus
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonfocus-visible`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonfocus-within`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonfullscreen
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonhas
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait Colonhost
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait `Colonhost-context`
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait Colonhover
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonin-range`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonindeterminate
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Coloninvalid
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonis
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait Colonlang
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait `Colonlast-child`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonlast-of-type`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonleft
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonlink
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait ColonmatchesLeftparenthesisRightparenthesis
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait Colonnot
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait `Colonnth-child`
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait `Colonnth-last-child`
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait `Colonnth-last-of-type`
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait `Colonnth-of-type`
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait `Colononly-child`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colononly-of-type`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonoptional
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonout-of-range`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonplaceholder-shown`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonread-only`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait `Colonread-write`
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonrequired
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonright
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonroot
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonscope
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colontarget
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonvalid
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonvisited
    extends Pseudos
       with SimplePseudos
  
  @js.native
  sealed trait Colonwhere
    extends AdvancedPseudos
       with Pseudos
  
  @js.native
  sealed trait GrayText extends DeprecatedSystemColor
  
  @js.native
  sealed trait Highlight extends DeprecatedSystemColor
  
  @js.native
  sealed trait HighlightText extends DeprecatedSystemColor
  
  @js.native
  sealed trait InactiveBorder extends DeprecatedSystemColor
  
  @js.native
  sealed trait InactiveCaption extends DeprecatedSystemColor
  
  @js.native
  sealed trait InactiveCaptionText extends DeprecatedSystemColor
  
  @js.native
  sealed trait InfoBackground extends DeprecatedSystemColor
  
  @js.native
  sealed trait InfoText extends DeprecatedSystemColor
  
  @js.native
  sealed trait Menu extends DeprecatedSystemColor
  
  @js.native
  sealed trait MenuText extends DeprecatedSystemColor
  
  @js.native
  sealed trait Scrollbar extends DeprecatedSystemColor
  
  @js.native
  sealed trait ThreeDDarkShadow extends DeprecatedSystemColor
  
  @js.native
  sealed trait ThreeDFace extends DeprecatedSystemColor
  
  @js.native
  sealed trait ThreeDHighlight extends DeprecatedSystemColor
  
  @js.native
  sealed trait ThreeDLightShadow extends DeprecatedSystemColor
  
  @js.native
  sealed trait ThreeDShadow extends DeprecatedSystemColor
  
  @js.native
  sealed trait Window extends DeprecatedSystemColor
  
  @js.native
  sealed trait WindowFrame extends DeprecatedSystemColor
  
  @js.native
  sealed trait WindowText extends DeprecatedSystemColor
  
  @js.native
  sealed trait `[-webkit-dropzone]` extends HtmlAttributes
  
  @js.native
  sealed trait `[abbr]` extends HtmlAttributes
  
  @js.native
  sealed trait `[accent-height]` extends SvgAttributes
  
  @js.native
  sealed trait `[accept-charset]` extends HtmlAttributes
  
  @js.native
  sealed trait `[accept]` extends HtmlAttributes
  
  @js.native
  sealed trait `[accesskey]` extends HtmlAttributes
  
  @js.native
  sealed trait `[action]` extends HtmlAttributes
  
  @js.native
  sealed trait `[align]` extends HtmlAttributes
  
  @js.native
  sealed trait `[alignment-baseline]` extends SvgAttributes
  
  @js.native
  sealed trait `[alink]` extends HtmlAttributes
  
  @js.native
  sealed trait `[allowReorder]` extends SvgAttributes
  
  @js.native
  sealed trait `[allow]` extends HtmlAttributes
  
  @js.native
  sealed trait `[allowfullscreen]` extends HtmlAttributes
  
  @js.native
  sealed trait `[allowpaymentrequest]` extends HtmlAttributes
  
  @js.native
  sealed trait `[alphabetic]` extends SvgAttributes
  
  @js.native
  sealed trait `[alt]` extends HtmlAttributes
  
  @js.native
  sealed trait `[animation]` extends SvgAttributes
  
  @js.native
  sealed trait `[arabic-form]` extends SvgAttributes
  
  @js.native
  sealed trait `[archive]` extends HtmlAttributes
  
  @js.native
  sealed trait `[ascent]` extends SvgAttributes
  
  @js.native
  sealed trait `[async]` extends HtmlAttributes
  
  @js.native
  sealed trait `[attributeName]` extends SvgAttributes
  
  @js.native
  sealed trait `[attributeType]` extends SvgAttributes
  
  @js.native
  sealed trait `[autobuffer]` extends HtmlAttributes
  
  @js.native
  sealed trait `[autocapitalize]` extends HtmlAttributes
  
  @js.native
  sealed trait `[autocomplete]` extends HtmlAttributes
  
  @js.native
  sealed trait `[autofocus]` extends HtmlAttributes
  
  @js.native
  sealed trait `[autoplay]` extends HtmlAttributes
  
  @js.native
  sealed trait `[axis]` extends HtmlAttributes
  
  @js.native
  sealed trait `[azimuth]` extends SvgAttributes
  
  @js.native
  sealed trait `[background]` extends HtmlAttributes
  
  @js.native
  sealed trait `[baseFrequency]` extends SvgAttributes
  
  @js.native
  sealed trait `[baseProfile]` extends SvgAttributes
  
  @js.native
  sealed trait `[baseline-shift]` extends SvgAttributes
  
  @js.native
  sealed trait `[bbox]` extends SvgAttributes
  
  @js.native
  sealed trait `[begin]` extends SvgAttributes
  
  @js.native
  sealed trait `[behavior]` extends HtmlAttributes
  
  @js.native
  sealed trait `[bgcolor]` extends HtmlAttributes
  
  @js.native
  sealed trait `[bias]` extends SvgAttributes
  
  @js.native
  sealed trait `[border]` extends HtmlAttributes
  
  @js.native
  sealed trait `[bottommargin]` extends HtmlAttributes
  
  @js.native
  sealed trait `[buffered]` extends HtmlAttributes
  
  @js.native
  sealed trait `[by]` extends SvgAttributes
  
  @js.native
  sealed trait `[calcMode]` extends SvgAttributes
  
  @js.native
  sealed trait `[cap-height]` extends SvgAttributes
  
  @js.native
  sealed trait `[cellpadding]` extends HtmlAttributes
  
  @js.native
  sealed trait `[cellspacing]` extends HtmlAttributes
  
  @js.native
  sealed trait `[char]` extends HtmlAttributes
  
  @js.native
  sealed trait `[charoff]` extends HtmlAttributes
  
  @js.native
  sealed trait `[charset]` extends HtmlAttributes
  
  @js.native
  sealed trait `[checked]` extends HtmlAttributes
  
  @js.native
  sealed trait `[cite]` extends HtmlAttributes
  
  @js.native
  sealed trait `[class]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[classid]` extends HtmlAttributes
  
  @js.native
  sealed trait `[clear]` extends HtmlAttributes
  
  @js.native
  sealed trait `[clip-path]` extends SvgAttributes
  
  @js.native
  sealed trait `[clip-rule]` extends SvgAttributes
  
  @js.native
  sealed trait `[clipPathUnits]` extends SvgAttributes
  
  @js.native
  sealed trait `[clip]` extends SvgAttributes
  
  @js.native
  sealed trait `[code]` extends HtmlAttributes
  
  @js.native
  sealed trait `[codebase]` extends HtmlAttributes
  
  @js.native
  sealed trait `[codetype]` extends HtmlAttributes
  
  @js.native
  sealed trait `[color-interpolation-filters]` extends SvgAttributes
  
  @js.native
  sealed trait `[color-interpolation]` extends SvgAttributes
  
  @js.native
  sealed trait `[color-profile]` extends SvgAttributes
  
  @js.native
  sealed trait `[color-rendering]` extends SvgAttributes
  
  @js.native
  sealed trait `[color]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[cols]` extends HtmlAttributes
  
  @js.native
  sealed trait `[colspan]` extends HtmlAttributes
  
  @js.native
  sealed trait `[command]` extends HtmlAttributes
  
  @js.native
  sealed trait `[compact]` extends HtmlAttributes
  
  @js.native
  sealed trait `[contentScriptType]` extends SvgAttributes
  
  @js.native
  sealed trait `[contentStyleType]` extends SvgAttributes
  
  @js.native
  sealed trait `[content]` extends HtmlAttributes
  
  @js.native
  sealed trait `[contenteditable]` extends HtmlAttributes
  
  @js.native
  sealed trait `[contextmenu]` extends HtmlAttributes
  
  @js.native
  sealed trait `[controls]` extends HtmlAttributes
  
  @js.native
  sealed trait `[coords]` extends HtmlAttributes
  
  @js.native
  sealed trait `[crossorigin]` extends HtmlAttributes
  
  @js.native
  sealed trait `[cursor]` extends SvgAttributes
  
  @js.native
  sealed trait `[cx]` extends SvgAttributes
  
  @js.native
  sealed trait `[cy]` extends SvgAttributes
  
  @js.native
  sealed trait `[d]` extends SvgAttributes
  
  @js.native
  sealed trait `[data]` extends HtmlAttributes
  
  @js.native
  sealed trait `[datafld]` extends HtmlAttributes
  
  @js.native
  sealed trait `[datasrc]` extends HtmlAttributes
  
  @js.native
  sealed trait `[datetime]` extends HtmlAttributes
  
  @js.native
  sealed trait `[declare]` extends HtmlAttributes
  
  @js.native
  sealed trait `[decoding]` extends HtmlAttributes
  
  @js.native
  sealed trait `[default]` extends HtmlAttributes
  
  @js.native
  sealed trait `[defer]` extends HtmlAttributes
  
  @js.native
  sealed trait `[descent]` extends SvgAttributes
  
  @js.native
  sealed trait `[diffuseConstant]` extends SvgAttributes
  
  @js.native
  sealed trait `[dir]` extends HtmlAttributes
  
  @js.native
  sealed trait `[direction]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[disabled]` extends HtmlAttributes
  
  @js.native
  sealed trait `[display]` extends SvgAttributes
  
  @js.native
  sealed trait `[divisor]` extends SvgAttributes
  
  @js.native
  sealed trait `[document]` extends SvgAttributes
  
  @js.native
  sealed trait `[dominant-baseline]` extends SvgAttributes
  
  @js.native
  sealed trait `[download]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[draggable]` extends HtmlAttributes
  
  @js.native
  sealed trait `[dropzone]` extends HtmlAttributes
  
  @js.native
  sealed trait `[dur]` extends SvgAttributes
  
  @js.native
  sealed trait `[dx]` extends SvgAttributes
  
  @js.native
  sealed trait `[dy]` extends SvgAttributes
  
  @js.native
  sealed trait `[edgeMode]` extends SvgAttributes
  
  @js.native
  sealed trait `[elevation]` extends SvgAttributes
  
  @js.native
  sealed trait `[enable-background]` extends SvgAttributes
  
  @js.native
  sealed trait `[enctype]` extends HtmlAttributes
  
  @js.native
  sealed trait `[enterkeyhint]` extends HtmlAttributes
  
  @js.native
  sealed trait `[exportparts]` extends HtmlAttributes
  
  @js.native
  sealed trait `[externalResourcesRequired]` extends SvgAttributes
  
  @js.native
  sealed trait `[face]` extends HtmlAttributes
  
  @js.native
  sealed trait `[fill-opacity]` extends SvgAttributes
  
  @js.native
  sealed trait `[fill-rule]` extends SvgAttributes
  
  @js.native
  sealed trait `[fill]` extends SvgAttributes
  
  @js.native
  sealed trait `[filterRes]` extends SvgAttributes
  
  @js.native
  sealed trait `[filterUnits]` extends SvgAttributes
  
  @js.native
  sealed trait `[filter]` extends SvgAttributes
  
  @js.native
  sealed trait `[flood-color]` extends SvgAttributes
  
  @js.native
  sealed trait `[flood-opacity]` extends SvgAttributes
  
  @js.native
  sealed trait `[font-family]` extends SvgAttributes
  
  @js.native
  sealed trait `[font-size-adjust]` extends SvgAttributes
  
  @js.native
  sealed trait `[font-size]` extends SvgAttributes
  
  @js.native
  sealed trait `[font-stretch]` extends SvgAttributes
  
  @js.native
  sealed trait `[font-style]` extends SvgAttributes
  
  @js.native
  sealed trait `[font-variant]` extends SvgAttributes
  
  @js.native
  sealed trait `[font-weight]` extends SvgAttributes
  
  @js.native
  sealed trait `[for]` extends HtmlAttributes
  
  @js.native
  sealed trait `[form]` extends HtmlAttributes
  
  @js.native
  sealed trait `[formaction]` extends HtmlAttributes
  
  @js.native
  sealed trait `[format]` extends SvgAttributes
  
  @js.native
  sealed trait `[formenctype]` extends HtmlAttributes
  
  @js.native
  sealed trait `[formmethod]` extends HtmlAttributes
  
  @js.native
  sealed trait `[formnovalidate]` extends HtmlAttributes
  
  @js.native
  sealed trait `[formtarget]` extends HtmlAttributes
  
  @js.native
  sealed trait `[fr]` extends SvgAttributes
  
  @js.native
  sealed trait `[frame]` extends HtmlAttributes
  
  @js.native
  sealed trait `[frameborder]` extends HtmlAttributes
  
  @js.native
  sealed trait `[from]` extends SvgAttributes
  
  @js.native
  sealed trait `[fx]` extends SvgAttributes
  
  @js.native
  sealed trait `[fy]` extends SvgAttributes
  
  @js.native
  sealed trait `[g1]` extends SvgAttributes
  
  @js.native
  sealed trait `[g2]` extends SvgAttributes
  
  @js.native
  sealed trait `[global]` extends SvgAttributes
  
  @js.native
  sealed trait `[glyph-name]` extends SvgAttributes
  
  @js.native
  sealed trait `[glyph-orientation-horizontal]` extends SvgAttributes
  
  @js.native
  sealed trait `[glyph-orientation-vertical]` extends SvgAttributes
  
  @js.native
  sealed trait `[glyphRef]` extends SvgAttributes
  
  @js.native
  sealed trait `[gradientTransform]` extends SvgAttributes
  
  @js.native
  sealed trait `[gradientUnits]` extends SvgAttributes
  
  @js.native
  sealed trait `[graphical]` extends SvgAttributes
  
  @js.native
  sealed trait `[hanging]` extends SvgAttributes
  
  @js.native
  sealed trait `[hatchContentUnits]` extends SvgAttributes
  
  @js.native
  sealed trait `[hatchUnits]` extends SvgAttributes
  
  @js.native
  sealed trait `[headers]` extends HtmlAttributes
  
  @js.native
  sealed trait `[height]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[hidden]` extends HtmlAttributes
  
  @js.native
  sealed trait `[high]` extends HtmlAttributes
  
  @js.native
  sealed trait `[horiz-adv-x]` extends SvgAttributes
  
  @js.native
  sealed trait `[horiz-origin-x]` extends SvgAttributes
  
  @js.native
  sealed trait `[horiz-origin-y]` extends SvgAttributes
  
  @js.native
  sealed trait `[href]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[hreflang]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[hspace]` extends HtmlAttributes
  
  @js.native
  sealed trait `[http-equiv]` extends HtmlAttributes
  
  @js.native
  sealed trait `[icon]` extends HtmlAttributes
  
  @js.native
  sealed trait `[id]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[ideographic]` extends SvgAttributes
  
  @js.native
  sealed trait `[image-rendering]` extends SvgAttributes
  
  @js.native
  sealed trait `[in2]` extends SvgAttributes
  
  @js.native
  sealed trait `[in]` extends SvgAttributes
  
  @js.native
  sealed trait `[inputmode]` extends HtmlAttributes
  
  @js.native
  sealed trait `[integrity]` extends HtmlAttributes
  
  @js.native
  sealed trait `[intrinsicsize]` extends HtmlAttributes
  
  @js.native
  sealed trait `[is]` extends HtmlAttributes
  
  @js.native
  sealed trait `[ismap]` extends HtmlAttributes
  
  @js.native
  sealed trait `[itemid]` extends HtmlAttributes
  
  @js.native
  sealed trait `[itemprop]` extends HtmlAttributes
  
  @js.native
  sealed trait `[itemref]` extends HtmlAttributes
  
  @js.native
  sealed trait `[itemscope]` extends HtmlAttributes
  
  @js.native
  sealed trait `[itemtype]` extends HtmlAttributes
  
  @js.native
  sealed trait `[k1]` extends SvgAttributes
  
  @js.native
  sealed trait `[k2]` extends SvgAttributes
  
  @js.native
  sealed trait `[k3]` extends SvgAttributes
  
  @js.native
  sealed trait `[k4]` extends SvgAttributes
  
  @js.native
  sealed trait `[k]` extends SvgAttributes
  
  @js.native
  sealed trait `[kernelMatrix]` extends SvgAttributes
  
  @js.native
  sealed trait `[kernelUnitLength]` extends SvgAttributes
  
  @js.native
  sealed trait `[kerning]` extends SvgAttributes
  
  @js.native
  sealed trait `[keyPoints]` extends SvgAttributes
  
  @js.native
  sealed trait `[kind]` extends HtmlAttributes
  
  @js.native
  sealed trait `[label]` extends HtmlAttributes
  
  @js.native
  sealed trait `[lang]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[language]` extends HtmlAttributes
  
  @js.native
  sealed trait `[leftmargin]` extends HtmlAttributes
  
  @js.native
  sealed trait `[lengthAdjust]` extends SvgAttributes
  
  @js.native
  sealed trait `[letter-spacing]` extends SvgAttributes
  
  @js.native
  sealed trait `[lighterForError]` extends SvgAttributes
  
  @js.native
  sealed trait `[lighting-color]` extends SvgAttributes
  
  @js.native
  sealed trait `[limitingConeAngle]` extends SvgAttributes
  
  @js.native
  sealed trait `[link]` extends HtmlAttributes
  
  @js.native
  sealed trait `[loading]` extends HtmlAttributes
  
  @js.native
  sealed trait `[local]` extends SvgAttributes
  
  @js.native
  sealed trait `[longdesc]` extends HtmlAttributes
  
  @js.native
  sealed trait `[loop]` extends HtmlAttributes
  
  @js.native
  sealed trait `[low]` extends HtmlAttributes
  
  @js.native
  sealed trait `[manifest]` extends HtmlAttributes
  
  @js.native
  sealed trait `[marginheight]` extends HtmlAttributes
  
  @js.native
  sealed trait `[marginwidth]` extends HtmlAttributes
  
  @js.native
  sealed trait `[marker-end]` extends SvgAttributes
  
  @js.native
  sealed trait `[marker-mid]` extends SvgAttributes
  
  @js.native
  sealed trait `[marker-start]` extends SvgAttributes
  
  @js.native
  sealed trait `[markerHeight]` extends SvgAttributes
  
  @js.native
  sealed trait `[markerUnits]` extends SvgAttributes
  
  @js.native
  sealed trait `[markerWidth]` extends SvgAttributes
  
  @js.native
  sealed trait `[maskContentUnits]` extends SvgAttributes
  
  @js.native
  sealed trait `[maskUnits]` extends SvgAttributes
  
  @js.native
  sealed trait `[mask]` extends SvgAttributes
  
  @js.native
  sealed trait `[mathematical]` extends SvgAttributes
  
  @js.native
  sealed trait `[max]` extends HtmlAttributes
  
  @js.native
  sealed trait `[maxlength]` extends HtmlAttributes
  
  @js.native
  sealed trait `[mayscript]` extends HtmlAttributes
  
  @js.native
  sealed trait `[media]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[method]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[methods]` extends HtmlAttributes
  
  @js.native
  sealed trait `[min]` extends HtmlAttributes
  
  @js.native
  sealed trait `[minlength]` extends HtmlAttributes
  
  @js.native
  sealed trait `[mode]` extends SvgAttributes
  
  @js.native
  sealed trait `[moz-opaque]` extends HtmlAttributes
  
  @js.native
  sealed trait `[mozallowfullscreen]` extends HtmlAttributes
  
  @js.native
  sealed trait `[mozcurrentsampleoffset]` extends HtmlAttributes
  
  @js.native
  sealed trait `[msallowfullscreen]` extends HtmlAttributes
  
  @js.native
  sealed trait `[multiple]` extends HtmlAttributes
  
  @js.native
  sealed trait `[muted]` extends HtmlAttributes
  
  @js.native
  sealed trait `[name]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[nohref]` extends HtmlAttributes
  
  @js.native
  sealed trait `[nomodule]` extends HtmlAttributes
  
  @js.native
  sealed trait `[noresize]` extends HtmlAttributes
  
  @js.native
  sealed trait `[noshade]` extends HtmlAttributes
  
  @js.native
  sealed trait `[novalidate]` extends HtmlAttributes
  
  @js.native
  sealed trait `[nowrap]` extends HtmlAttributes
  
  @js.native
  sealed trait `[numOctaves]` extends SvgAttributes
  
  @js.native
  sealed trait `[object]` extends HtmlAttributes
  
  @js.native
  sealed trait `[offset]` extends SvgAttributes
  
  @js.native
  sealed trait `[onafterprint]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onbeforeprint]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onbeforeunload]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onblur]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onerror]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onfocus]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onhashchange]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onlanguagechange]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onload]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onmessage]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onoffline]` extends HtmlAttributes
  
  @js.native
  sealed trait `[ononline]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onpopstate]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onredo]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onresize]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onstorage]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onundo]` extends HtmlAttributes
  
  @js.native
  sealed trait `[onunload]` extends HtmlAttributes
  
  @js.native
  sealed trait `[opacity]` extends SvgAttributes
  
  @js.native
  sealed trait `[open]` extends HtmlAttributes
  
  @js.native
  sealed trait `[operator]` extends SvgAttributes
  
  @js.native
  sealed trait `[optimum]` extends HtmlAttributes
  
  @js.native
  sealed trait `[order]` extends SvgAttributes
  
  @js.native
  sealed trait `[orient]` extends SvgAttributes
  
  @js.native
  sealed trait `[orientation]` extends SvgAttributes
  
  @js.native
  sealed trait `[origin]` extends SvgAttributes
  
  @js.native
  sealed trait `[overflow]` extends SvgAttributes
  
  @js.native
  sealed trait `[overline-position]` extends SvgAttributes
  
  @js.native
  sealed trait `[overline-thickness]` extends SvgAttributes
  
  @js.native
  sealed trait `[paint-order]` extends SvgAttributes
  
  @js.native
  sealed trait `[panose-1]` extends SvgAttributes
  
  @js.native
  sealed trait `[part]` extends HtmlAttributes
  
  @js.native
  sealed trait `[path]` extends SvgAttributes
  
  @js.native
  sealed trait `[patternContentUnits]` extends SvgAttributes
  
  @js.native
  sealed trait `[patternTransform]` extends SvgAttributes
  
  @js.native
  sealed trait `[patternUnits]` extends SvgAttributes
  
  @js.native
  sealed trait `[ping]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[pitch]` extends SvgAttributes
  
  @js.native
  sealed trait `[placeholder]` extends HtmlAttributes
  
  @js.native
  sealed trait `[played]` extends HtmlAttributes
  
  @js.native
  sealed trait `[pointer-events]` extends SvgAttributes
  
  @js.native
  sealed trait `[pointsAtX]` extends SvgAttributes
  
  @js.native
  sealed trait `[pointsAtY]` extends SvgAttributes
  
  @js.native
  sealed trait `[pointsAtZ]` extends SvgAttributes
  
  @js.native
  sealed trait `[points]` extends SvgAttributes
  
  @js.native
  sealed trait `[poster]` extends HtmlAttributes
  
  @js.native
  sealed trait `[prefetch]` extends HtmlAttributes
  
  @js.native
  sealed trait `[preload]` extends HtmlAttributes
  
  @js.native
  sealed trait `[preserveAlpha]` extends SvgAttributes
  
  @js.native
  sealed trait `[preserveAspectRatio]` extends SvgAttributes
  
  @js.native
  sealed trait `[primitiveUnits]` extends SvgAttributes
  
  @js.native
  sealed trait `[profile]` extends HtmlAttributes
  
  @js.native
  sealed trait `[prompt]` extends HtmlAttributes
  
  @js.native
  sealed trait `[r]` extends SvgAttributes
  
  @js.native
  sealed trait `[radiogroup]` extends HtmlAttributes
  
  @js.native
  sealed trait `[radius]` extends SvgAttributes
  
  @js.native
  sealed trait `[readonly]` extends HtmlAttributes
  
  @js.native
  sealed trait `[refX]` extends SvgAttributes
  
  @js.native
  sealed trait `[refY]` extends SvgAttributes
  
  @js.native
  sealed trait `[referrerPolicy]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[referrerpolicy]_` extends HtmlAttributes
  
  @js.native
  sealed trait `[rel]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[rendering-intent]` extends SvgAttributes
  
  @js.native
  sealed trait `[repeatCount]` extends SvgAttributes
  
  @js.native
  sealed trait `[requiredExtensions]` extends SvgAttributes
  
  @js.native
  sealed trait `[requiredFeatures]` extends SvgAttributes
  
  @js.native
  sealed trait `[required]` extends HtmlAttributes
  
  @js.native
  sealed trait `[rev]` extends HtmlAttributes
  
  @js.native
  sealed trait `[reversed]` extends HtmlAttributes
  
  @js.native
  sealed trait `[rightmargin]` extends HtmlAttributes
  
  @js.native
  sealed trait `[rotate]` extends SvgAttributes
  
  @js.native
  sealed trait `[rows]` extends HtmlAttributes
  
  @js.native
  sealed trait `[rowspan]` extends HtmlAttributes
  
  @js.native
  sealed trait `[rules]` extends HtmlAttributes
  
  @js.native
  sealed trait `[rx]` extends SvgAttributes
  
  @js.native
  sealed trait `[ry]` extends SvgAttributes
  
  @js.native
  sealed trait `[sandbox-allow-modals]` extends HtmlAttributes
  
  @js.native
  sealed trait `[sandbox-allow-popups-to-escape-sandbox]` extends HtmlAttributes
  
  @js.native
  sealed trait `[sandbox-allow-popups]` extends HtmlAttributes
  
  @js.native
  sealed trait `[sandbox-allow-presentation]` extends HtmlAttributes
  
  @js.native
  sealed trait `[sandbox-allow-storage-access-by-user-activation]` extends HtmlAttributes
  
  @js.native
  sealed trait `[sandbox-allow-top-navigation-by-user-activation]` extends HtmlAttributes
  
  @js.native
  sealed trait `[sandbox]` extends HtmlAttributes
  
  @js.native
  sealed trait `[scale]` extends SvgAttributes
  
  @js.native
  sealed trait `[scope]` extends HtmlAttributes
  
  @js.native
  sealed trait `[scoped]` extends HtmlAttributes
  
  @js.native
  sealed trait `[scrollamount]` extends HtmlAttributes
  
  @js.native
  sealed trait `[scrolldelay]` extends HtmlAttributes
  
  @js.native
  sealed trait `[scrolling]` extends HtmlAttributes
  
  @js.native
  sealed trait `[seed]` extends SvgAttributes
  
  @js.native
  sealed trait `[selected]` extends HtmlAttributes
  
  @js.native
  sealed trait `[shape-rendering]` extends SvgAttributes
  
  @js.native
  sealed trait `[shape]` extends HtmlAttributes
  
  @js.native
  sealed trait `[side]` extends SvgAttributes
  
  @js.native
  sealed trait `[size]` extends HtmlAttributes
  
  @js.native
  sealed trait `[sizes]` extends HtmlAttributes
  
  @js.native
  sealed trait `[slope]` extends SvgAttributes
  
  @js.native
  sealed trait `[slot]` extends HtmlAttributes
  
  @js.native
  sealed trait `[solid-color]` extends SvgAttributes
  
  @js.native
  sealed trait `[solid-opacity]` extends SvgAttributes
  
  @js.native
  sealed trait `[spacing]` extends SvgAttributes
  
  @js.native
  sealed trait `[span]` extends HtmlAttributes
  
  @js.native
  sealed trait `[specularConstant]` extends SvgAttributes
  
  @js.native
  sealed trait `[specularExponent]` extends SvgAttributes
  
  @js.native
  sealed trait `[spellcheck]` extends HtmlAttributes
  
  @js.native
  sealed trait `[spreadMethod]` extends SvgAttributes
  
  @js.native
  sealed trait `[src]` extends HtmlAttributes
  
  @js.native
  sealed trait `[srcdoc]` extends HtmlAttributes
  
  @js.native
  sealed trait `[srclang]` extends HtmlAttributes
  
  @js.native
  sealed trait `[srcset]` extends HtmlAttributes
  
  @js.native
  sealed trait `[standby]` extends HtmlAttributes
  
  @js.native
  sealed trait `[startOffset]` extends SvgAttributes
  
  @js.native
  sealed trait `[start]` extends HtmlAttributes
  
  @js.native
  sealed trait `[stdDeviation]` extends SvgAttributes
  
  @js.native
  sealed trait `[stemh]` extends SvgAttributes
  
  @js.native
  sealed trait `[stemv]` extends SvgAttributes
  
  @js.native
  sealed trait `[stitchTiles]` extends SvgAttributes
  
  @js.native
  sealed trait `[stop-color]` extends SvgAttributes
  
  @js.native
  sealed trait `[stop-opacity]` extends SvgAttributes
  
  @js.native
  sealed trait `[strikethrough-position]` extends SvgAttributes
  
  @js.native
  sealed trait `[strikethrough-thickness]` extends SvgAttributes
  
  @js.native
  sealed trait `[string]` extends SvgAttributes
  
  @js.native
  sealed trait `[stroke-dasharray]` extends SvgAttributes
  
  @js.native
  sealed trait `[stroke-dashoffset]` extends SvgAttributes
  
  @js.native
  sealed trait `[stroke-linecap]` extends SvgAttributes
  
  @js.native
  sealed trait `[stroke-linejoin]` extends SvgAttributes
  
  @js.native
  sealed trait `[stroke-miterlimit]` extends SvgAttributes
  
  @js.native
  sealed trait `[stroke-opacity]` extends SvgAttributes
  
  @js.native
  sealed trait `[stroke-width]` extends SvgAttributes
  
  @js.native
  sealed trait `[stroke]` extends SvgAttributes
  
  @js.native
  sealed trait `[style]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[summary]` extends HtmlAttributes
  
  @js.native
  sealed trait `[surfaceScale]` extends SvgAttributes
  
  @js.native
  sealed trait `[systemLanguage]` extends SvgAttributes
  
  @js.native
  sealed trait `[tabindex]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[targetX]` extends SvgAttributes
  
  @js.native
  sealed trait `[targetY]` extends SvgAttributes
  
  @js.native
  sealed trait `[target]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[text-anchor]` extends SvgAttributes
  
  @js.native
  sealed trait `[text-decoration]` extends SvgAttributes
  
  @js.native
  sealed trait `[text-overflow]` extends SvgAttributes
  
  @js.native
  sealed trait `[text-rendering]` extends SvgAttributes
  
  @js.native
  sealed trait `[textLength]` extends SvgAttributes
  
  @js.native
  sealed trait `[text]` extends HtmlAttributes
  
  @js.native
  sealed trait `[title]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[to]` extends SvgAttributes
  
  @js.native
  sealed trait `[topmargin]` extends HtmlAttributes
  
  @js.native
  sealed trait `[transform-origin]` extends SvgAttributes
  
  @js.native
  sealed trait `[transform]` extends SvgAttributes
  
  @js.native
  sealed trait `[translate]` extends HtmlAttributes
  
  @js.native
  sealed trait `[truespeed]` extends HtmlAttributes
  
  @js.native
  sealed trait `[type]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[typemustmatch]` extends HtmlAttributes
  
  @js.native
  sealed trait `[u1]` extends SvgAttributes
  
  @js.native
  sealed trait `[u2]` extends SvgAttributes
  
  @js.native
  sealed trait `[underline-position]` extends SvgAttributes
  
  @js.native
  sealed trait `[underline-thickness]` extends SvgAttributes
  
  @js.native
  sealed trait `[unicode-bidi]` extends SvgAttributes
  
  @js.native
  sealed trait `[unicode-range]` extends SvgAttributes
  
  @js.native
  sealed trait `[unicode]` extends SvgAttributes
  
  @js.native
  sealed trait `[units-per-em]` extends SvgAttributes
  
  @js.native
  sealed trait `[usemap]` extends HtmlAttributes
  
  @js.native
  sealed trait `[v-alphabetic]` extends SvgAttributes
  
  @js.native
  sealed trait `[v-hanging]` extends SvgAttributes
  
  @js.native
  sealed trait `[v-ideographic]` extends SvgAttributes
  
  @js.native
  sealed trait `[v-mathematical]` extends SvgAttributes
  
  @js.native
  sealed trait `[valign]` extends HtmlAttributes
  
  @js.native
  sealed trait `[value]` extends HtmlAttributes
  
  @js.native
  sealed trait `[values]` extends SvgAttributes
  
  @js.native
  sealed trait `[valuetype]` extends HtmlAttributes
  
  @js.native
  sealed trait `[vector-effect]` extends SvgAttributes
  
  @js.native
  sealed trait `[version]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[vert-adv-y]` extends SvgAttributes
  
  @js.native
  sealed trait `[vert-origin-x]` extends SvgAttributes
  
  @js.native
  sealed trait `[vert-origin-y]` extends SvgAttributes
  
  @js.native
  sealed trait `[viewBox]` extends SvgAttributes
  
  @js.native
  sealed trait `[viewTarget]` extends SvgAttributes
  
  @js.native
  sealed trait `[visibility]` extends SvgAttributes
  
  @js.native
  sealed trait `[vlink]` extends HtmlAttributes
  
  @js.native
  sealed trait `[volume]` extends HtmlAttributes
  
  @js.native
  sealed trait `[vspace]` extends HtmlAttributes
  
  @js.native
  sealed trait `[webkitallowfullscreen]` extends HtmlAttributes
  
  @js.native
  sealed trait `[white-space]` extends SvgAttributes
  
  @js.native
  sealed trait `[width]`
    extends HtmlAttributes
       with SvgAttributes
  
  @js.native
  sealed trait `[widths]` extends SvgAttributes
  
  @js.native
  sealed trait `[word-spacing]` extends SvgAttributes
  
  @js.native
  sealed trait `[wrap]` extends HtmlAttributes
  
  @js.native
  sealed trait `[writing-mode]` extends SvgAttributes
  
  @js.native
  sealed trait `[x-height]` extends SvgAttributes
  
  @js.native
  sealed trait `[x1]` extends SvgAttributes
  
  @js.native
  sealed trait `[x2]` extends SvgAttributes
  
  @js.native
  sealed trait `[xChannelSelector]` extends SvgAttributes
  
  @js.native
  sealed trait `[x]` extends SvgAttributes
  
  @js.native
  sealed trait `[xmlns]` extends HtmlAttributes
  
  @js.native
  sealed trait `[y1]` extends SvgAttributes
  
  @js.native
  sealed trait `[y2]` extends SvgAttributes
  
  @js.native
  sealed trait `[yChannelSelector]` extends SvgAttributes
  
  @js.native
  sealed trait `[y]` extends SvgAttributes
  
  @js.native
  sealed trait `[z]` extends SvgAttributes
  
  @js.native
  sealed trait `[zoomAndPan]` extends SvgAttributes
  
  @js.native
  sealed trait above
    extends _WebkitBoxReflect[js.Any]
  
  @js.native
  sealed trait absolute extends Position
  
  @js.native
  sealed trait active extends ImeMode
  
  @js.native
  sealed trait add extends CompositingOperator
  
  @js.native
  sealed trait additive extends _System
  
  @js.native
  sealed trait after extends MsImeAlign
  
  @js.native
  sealed trait `after-edge` extends AlignmentBaseline
  
  @js.native
  sealed trait alias extends _Cursor
  
  @js.native
  sealed trait aliceblue extends NamedColor
  
  @js.native
  sealed trait all
    extends _SingleTransition[js.Any]
       with BreakAfter
       with BreakBefore
       with ColumnSpan
       with PointerEvents
       with TextDecorationSkipInk
       with UserSelect
       with _TextCombineUpright
       with _TransitionProperty
  
  @js.native
  sealed trait `all-petite-caps`
    extends FontVariantCaps
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  
  @js.native
  sealed trait `all-scroll` extends _Cursor
  
  @js.native
  sealed trait `all-small-caps`
    extends FontVariantCaps
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  
  @js.native
  sealed trait `allow-end` extends _HangingPunctuation
  
  @js.native
  sealed trait alpha
    extends MaskingMode
       with MaskBorderMode
       with MaskType
       with _MaskBorder
  
  @js.native
  sealed trait alphabetic
    extends AlignmentBaseline
       with DominantBaseline
       with _System
  
  @js.native
  sealed trait alternate extends SingleAnimationDirection
  
  @js.native
  sealed trait `alternate-reverse` extends SingleAnimationDirection
  
  @js.native
  sealed trait always
    extends BreakAfter
       with BreakBefore
       with PageBreakAfter
       with PageBreakBefore
       with ScrollSnapStop
  
  @js.native
  sealed trait antiquewhite extends NamedColor
  
  @js.native
  sealed trait anywhere
    extends LineBreak
       with OverflowWrap
  
  @js.native
  sealed trait aqua extends NamedColor
  
  @js.native
  sealed trait aquamarine extends NamedColor
  
  @js.native
  sealed trait auto
    extends _TrackBreadth[js.Any]
       with AlignmentBaseline
       with BreakAfter
       with BreakBefore
       with BreakInside
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with DominantBaseline
       with FontDisplay
       with FontKerning
       with FontOpticalSizing
       with Hyphens
       with ImageRendering
       with ImeMode
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
       with WebkitOverflowScrolling
       with _AlignSelf
       with _AspectRatio
       with _BgSize[js.Any]
       with _BlockSize[js.Any]
       with _BorderImageWidth[js.Any]
       with _Bottom[js.Any]
       with _CaretColor
       with _Clip
       with _ColumnCount
       with _ColumnWidth[js.Any]
       with _Columns[js.Any]
       with _Cursor
       with _Flex[js.Any]
       with _FlexBasis[js.Any]
       with _GlyphOrientationVertical
       with _Height[js.Any]
       with _InlineSize[js.Any]
       with _Inset[js.Any]
       with _InsetBlock[js.Any]
       with _InsetBlockEnd[js.Any]
       with _InsetBlockStart[js.Any]
       with _InsetInline[js.Any]
       with _InsetInlineEnd[js.Any]
       with _InsetInlineStart[js.Any]
       with _JustifySelf
       with _Left[js.Any]
       with _Margin[js.Any]
       with _MarginBlock[js.Any]
       with _MarginBlockEnd[js.Any]
       with _MarginBlockStart[js.Any]
       with _MarginBottom[js.Any]
       with _MarginInline[js.Any]
       with _MarginInlineEnd[js.Any]
       with _MarginInlineStart[js.Any]
       with _MarginLeft[js.Any]
       with _MarginRight[js.Any]
       with _MarginTop[js.Any]
       with _MaskBorderWidth[js.Any]
       with _MaxBlockSize[js.Any]
       with _MaxHeight[js.Any]
       with _MaxInlineSize[js.Any]
       with _MaxWidth[js.Any]
       with _MinBlockSize[js.Any]
       with _MinHeight[js.Any]
       with _MinInlineSize[js.Any]
       with _MinWidth[js.Any]
       with _MozImageRegion
       with _MsHyphenateLimitChars
       with _MsScrollLimitXMax[js.Any]
       with _MsScrollLimitYMax[js.Any]
       with _Offset[js.Any]
       with _OffsetAnchor[js.Any]
       with _OffsetRotate
       with _Outline[js.Any]
       with _OutlineStyle
       with _Overflow
       with _OverscrollBehavior
       with _PlaceSelf
       with _Quotes
       with _Range
       with _Right[js.Any]
       with _ScrollPadding[js.Any]
       with _ScrollPaddingBlock[js.Any]
       with _ScrollPaddingBlockEnd[js.Any]
       with _ScrollPaddingBlockStart[js.Any]
       with _ScrollPaddingBottom[js.Any]
       with _ScrollPaddingInline[js.Any]
       with _ScrollPaddingInlineEnd[js.Any]
       with _ScrollPaddingInlineStart[js.Any]
       with _ScrollPaddingLeft[js.Any]
       with _ScrollPaddingRight[js.Any]
       with _ScrollPaddingTop[js.Any]
       with _ScrollbarColor
       with _SpeakAs
       with _TextDecoration[js.Any]
       with _TextDecorationThickness[js.Any]
       with _TextSizeAdjust
       with _TextUnderlineOffset[js.Any]
       with _TextUnderlinePosition
       with _Top[js.Any]
       with _TouchAction
       with _Width[js.Any]
       with _WillChange
       with _ZIndex
  
  @js.native
  sealed trait avoid
    extends BreakAfter
       with BreakBefore
       with BreakInside
       with PageBreakAfter
       with PageBreakBefore
       with PageBreakInside
  
  @js.native
  sealed trait `avoid-column`
    extends BreakAfter
       with BreakBefore
       with BreakInside
  
  @js.native
  sealed trait `avoid-page`
    extends BreakAfter
       with BreakBefore
       with BreakInside
  
  @js.native
  sealed trait `avoid-region`
    extends BreakAfter
       with BreakBefore
       with BreakInside
  
  @js.native
  sealed trait azure extends NamedColor
  
  @js.native
  sealed trait backwards extends SingleAnimationFillMode
  
  @js.native
  sealed trait balance extends ColumnFill
  
  @js.native
  sealed trait baseline
    extends AlignmentBaseline
       with BoxAlign
       with _AlignContent
       with _AlignItems
       with _AlignSelf
       with _BaselineShift[js.Any]
       with _JustifyItems
       with _JustifySelf
       with _PlaceContent
       with _PlaceItems
       with _PlaceSelf
       with _VerticalAlign[js.Any]
  
  @js.native
  sealed trait `before-edge` extends AlignmentBaseline
  
  @js.native
  sealed trait beige extends NamedColor
  
  @js.native
  sealed trait below
    extends _WebkitBoxReflect[js.Any]
  
  @js.native
  sealed trait bevel extends StrokeLinejoin
  
  @js.native
  sealed trait `bidi-override` extends UnicodeBidi
  
  @js.native
  sealed trait bisque extends NamedColor
  
  @js.native
  sealed trait black extends NamedColor
  
  @js.native
  sealed trait blanchedalmond extends NamedColor
  
  @js.native
  sealed trait blink
    extends MozTextBlink
       with _TextDecoration[js.Any]
       with _TextDecorationLine
  
  @js.native
  sealed trait block
    extends DisplayOutside
       with FontDisplay
       with MozOrient
       with Resize
       with _ScrollSnapType
  
  @js.native
  sealed trait `block-axis` extends BoxOrient
  
  @js.native
  sealed trait `block-end` extends CaptionSide
  
  @js.native
  sealed trait `block-start` extends CaptionSide
  
  @js.native
  sealed trait blue extends NamedColor
  
  @js.native
  sealed trait blueviolet extends NamedColor
  
  @js.native
  sealed trait bold extends _FontWeightAbsolute
  
  @js.native
  sealed trait bolder extends _FontWeight
  
  @js.native
  sealed trait border
    extends _WebkitMask[js.Any]
       with _WebkitMaskClip
       with _WebkitMaskOrigin
  
  @js.native
  sealed trait `border-box`
    extends Box
       with BoxSizing
       with GeometryBox
       with MozFloatEdge
       with TransformBox
  
  @js.native
  sealed trait both
    extends SingleAnimationFillMode
       with Clear
       with MsWrapFlow
       with Resize
       with _ScrollSnapType
  
  @js.native
  sealed trait bottom
    extends _Position[js.Any]
       with CaptionSide
       with _BackgroundPositionY[js.Any]
       with _BgPosition[js.Any]
       with _TransformOrigin[js.Any]
       with _VerticalAlign[js.Any]
       with _WebkitMaskPositionY[js.Any]
  
  @js.native
  sealed trait `box-decoration` extends _TextDecorationSkip
  
  @js.native
  sealed trait `break-all` extends WordBreak
  
  @js.native
  sealed trait `break-spaces` extends WhiteSpace
  
  @js.native
  sealed trait `break-word`
    extends OverflowWrap
       with WordBreak
       with WordWrap
  
  @js.native
  sealed trait brown extends NamedColor
  
  @js.native
  sealed trait bt extends MsBlockProgression
  
  @js.native
  sealed trait bullets extends _SpeakAs
  
  @js.native
  sealed trait burlywood extends NamedColor
  
  @js.native
  sealed trait butt extends StrokeLinecap
  
  @js.native
  sealed trait button
    extends Appearance
       with MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait `button-arrow-down` extends MozAppearance
  
  @js.native
  sealed trait `button-arrow-next` extends MozAppearance
  
  @js.native
  sealed trait `button-arrow-previous` extends MozAppearance
  
  @js.native
  sealed trait `button-arrow-up` extends MozAppearance
  
  @js.native
  sealed trait `button-bevel`
    extends MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait `button-focus` extends MozAppearance
  
  @js.native
  sealed trait cadetblue extends NamedColor
  
  @js.native
  sealed trait capitalize extends TextTransform
  
  @js.native
  sealed trait caption extends _Font
  
  @js.native
  sealed trait caret
    extends MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait cell extends _Cursor
  
  @js.native
  sealed trait center
    extends _Position[js.Any]
       with BoxAlign
       with BoxPack
       with ContentPosition
       with RubyAlign
       with SelfPosition
       with TextAlign
       with TextAlignLast
       with _BackgroundPositionX[js.Any]
       with _BackgroundPositionY[js.Any]
       with _BgPosition[js.Any]
       with _ScrollSnapAlign
       with _TransformOrigin[js.Any]
       with _WebkitMaskPositionX[js.Any]
       with _WebkitMaskPositionY[js.Any]
  
  @js.native
  sealed trait central
    extends AlignmentBaseline
       with DominantBaseline
  
  @js.native
  sealed trait chained
    extends MsContentZoomChaining
       with MsScrollChaining
  
  @js.native
  sealed trait chartreuse extends NamedColor
  
  @js.native
  sealed trait checkbox
    extends Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait `checkbox-container` extends MozAppearance
  
  @js.native
  sealed trait `checkbox-label` extends MozAppearance
  
  @js.native
  sealed trait checkmenuitem extends MozAppearance
  
  @js.native
  sealed trait child extends _Paint
  
  @js.native
  sealed trait chocolate extends NamedColor
  
  @js.native
  sealed trait circle
    extends _TextEmphasis
       with _TextEmphasisStyle
  
  @js.native
  sealed trait clear
    extends CompositeStyle
       with MsWrapFlow
  
  @js.native
  sealed trait clip
    extends OverflowBlock
       with OverflowInline
       with _BlockOverflow
       with _TextOverflow
  
  @js.native
  sealed trait clone extends BoxDecorationBreak
  
  @js.native
  sealed trait `close-quote` extends Quote
  
  @js.native
  sealed trait `col-resize` extends _Cursor
  
  @js.native
  sealed trait collapse
    extends BorderCollapse
       with RubyMerge
       with Visibility
  
  @js.native
  sealed trait color
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait `color-burn`
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait `color-dodge`
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait column
    extends BreakAfter
       with BreakBefore
       with FlexDirection
       with _FlexFlow
       with _GridAutoFlow
  
  @js.native
  sealed trait `column-reverse`
    extends FlexDirection
       with _FlexFlow
  
  @js.native
  sealed trait `common-ligatures`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  
  @js.native
  sealed trait condensed extends _FontStretchAbsolute
  
  @js.native
  sealed trait contain
    extends _BgSize[js.Any]
       with ObjectFit
       with OverscrollBehaviorBlock
       with OverscrollBehaviorInline
       with OverscrollBehaviorX
       with OverscrollBehaviorY
       with UserSelect
       with _OverscrollBehavior
  
  @js.native
  sealed trait content
    extends _Contain
       with _Flex[js.Any]
       with _FlexBasis[js.Any]
       with _WebkitMask[js.Any]
       with _WebkitMaskClip
       with _WebkitMaskOrigin
  
  @js.native
  sealed trait `content-box`
    extends Box
       with BoxSizing
       with GeometryBox
       with MozFloatEdge
       with OverflowClipBox
       with TransformBox
  
  @js.native
  sealed trait contents
    extends _AnimateableFeature
       with _ContentList
       with _Display
  
  @js.native
  sealed trait `context-fill` extends _Paint
  
  @js.native
  sealed trait `context-menu` extends _Cursor
  
  @js.native
  sealed trait `context-stroke` extends _Paint
  
  @js.native
  sealed trait contextual
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  
  @js.native
  sealed trait copy
    extends CompositeStyle
       with _Cursor
  
  @js.native
  sealed trait coral extends NamedColor
  
  @js.native
  sealed trait cornflowerblue extends NamedColor
  
  @js.native
  sealed trait cornsilk extends NamedColor
  
  @js.native
  sealed trait cover
    extends _BgSize[js.Any]
       with ObjectFit
  
  @js.native
  sealed trait crimson extends NamedColor
  
  @js.native
  sealed trait `crisp-edges` extends ImageRendering
  
  @js.native
  sealed trait crispEdges extends ShapeRendering
  
  @js.native
  sealed trait crosshair extends _Cursor
  
  @js.native
  sealed trait currentColor
    extends _FloodColor
       with _LightingColor
       with _StopColor
  
  @js.native
  sealed trait currentcolor_ extends _Color
  
  @js.native
  sealed trait cursive extends GenericFamily
  
  @js.native
  sealed trait cyan extends NamedColor
  
  @js.native
  sealed trait cyclic extends _System
  
  @js.native
  sealed trait dark extends _ScrollbarColor
  
  @js.native
  sealed trait darkblue extends NamedColor
  
  @js.native
  sealed trait darkcyan extends NamedColor
  
  @js.native
  sealed trait darken
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait darkgoldenrod extends NamedColor
  
  @js.native
  sealed trait darkgray extends NamedColor
  
  @js.native
  sealed trait darkgreen extends NamedColor
  
  @js.native
  sealed trait darkgrey extends NamedColor
  
  @js.native
  sealed trait darkkhaki extends NamedColor
  
  @js.native
  sealed trait darkmagenta extends NamedColor
  
  @js.native
  sealed trait darkolivegreen extends NamedColor
  
  @js.native
  sealed trait darkorange extends NamedColor
  
  @js.native
  sealed trait darkorchid extends NamedColor
  
  @js.native
  sealed trait darkred extends NamedColor
  
  @js.native
  sealed trait darksalmon extends NamedColor
  
  @js.native
  sealed trait darkseagreen extends NamedColor
  
  @js.native
  sealed trait darkslateblue extends NamedColor
  
  @js.native
  sealed trait darkslategray extends NamedColor
  
  @js.native
  sealed trait darkslategrey extends NamedColor
  
  @js.native
  sealed trait darkturquoise extends NamedColor
  
  @js.native
  sealed trait darkviolet extends NamedColor
  
  @js.native
  sealed trait dashed
    extends LineStyle
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
       with TextDecorationStyle
       with _TextDecoration[js.Any]
  
  @js.native
  sealed trait deeppink extends NamedColor
  
  @js.native
  sealed trait deepskyblue extends NamedColor
  
  @js.native
  sealed trait default
    extends MozWindowShadow
       with WebkitTouchCallout
       with _Cursor
  
  @js.native
  sealed trait `default-button` extends WebkitAppearance
  
  @js.native
  sealed trait dense extends _GridAutoFlow
  
  @js.native
  sealed trait `destination-atop` extends CompositeStyle
  
  @js.native
  sealed trait `destination-in` extends CompositeStyle
  
  @js.native
  sealed trait `destination-out` extends CompositeStyle
  
  @js.native
  sealed trait `destination-over` extends CompositeStyle
  
  @js.native
  sealed trait `diagonal-fractions`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  
  @js.native
  sealed trait difference
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait digits extends _TextCombineUpright
  
  @js.native
  sealed trait dimgray extends NamedColor
  
  @js.native
  sealed trait dimgrey extends NamedColor
  
  @js.native
  sealed trait disabled
    extends ImeMode
       with MozUserInput
  
  @js.native
  sealed trait `discretionary-ligatures`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  
  @js.native
  sealed trait dodgerblue extends NamedColor
  
  @js.native
  sealed trait dot
    extends _TextEmphasis
       with _TextEmphasisStyle
  
  @js.native
  sealed trait dotted
    extends LineStyle
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
       with TextDecorationStyle
       with _TextDecoration[js.Any]
  
  @js.native
  sealed trait double
    extends LineStyle
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
       with TextDecorationStyle
       with _TextDecoration[js.Any]
  
  @js.native
  sealed trait `double-circle`
    extends _TextEmphasis
       with _TextEmphasisStyle
  
  @js.native
  sealed trait drag extends MozWindowDragging
  
  @js.native
  sealed trait dualbutton extends MozAppearance
  
  @js.native
  sealed trait `e-resize` extends _Cursor
  
  @js.native
  sealed trait ease extends _CubicBezierTimingFunction
  
  @js.native
  sealed trait `ease-in` extends _CubicBezierTimingFunction
  
  @js.native
  sealed trait `ease-in-out` extends _CubicBezierTimingFunction
  
  @js.native
  sealed trait `ease-out` extends _CubicBezierTimingFunction
  
  @js.native
  sealed trait economy extends ColorAdjust
  
  @js.native
  sealed trait edges extends _TextDecorationSkip
  
  @js.native
  sealed trait element
    extends MsUserSelect
       with UserSelect
  
  @js.native
  sealed trait ellipsis
    extends _BlockOverflow
       with _TextOverflow
  
  @js.native
  sealed trait embed extends UnicodeBidi
  
  @js.native
  sealed trait enabled extends MozUserInput
  
  @js.native
  sealed trait end
    extends SelfPosition
       with BoxAlign
       with BoxPack
       with ContentPosition
       with MsWrapFlow
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with _ScrollSnapAlign
  
  @js.native
  sealed trait evenodd
    extends ClipRule
       with FillRule
  
  @js.native
  sealed trait `ew-resize` extends _Cursor
  
  @js.native
  sealed trait exact extends ColorAdjust
  
  @js.native
  sealed trait exclude extends CompositingOperator
  
  @js.native
  sealed trait exclusion
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait expanded extends _FontStretchAbsolute
  
  @js.native
  sealed trait `extra-condensed` extends _FontStretchAbsolute
  
  @js.native
  sealed trait `extra-expanded` extends _FontStretchAbsolute
  
  @js.native
  sealed trait fallback extends FontDisplay
  
  @js.native
  sealed trait `false` extends MsAccelerator
  
  @js.native
  sealed trait fantasy extends GenericFamily
  
  @js.native
  sealed trait fill
    extends ObjectFit
       with PointerEvents
       with _MozContextProperties
       with _PaintOrder
  
  @js.native
  sealed trait `fill-box`
    extends GeometryBox
       with TransformBox
  
  @js.native
  sealed trait `fill-opacity` extends _MozContextProperties
  
  @js.native
  sealed trait filled
    extends _TextEmphasis
       with _TextEmphasisStyle
  
  @js.native
  sealed trait firebrick extends NamedColor
  
  @js.native
  sealed trait first extends _HangingPunctuation
  
  @js.native
  sealed trait fixed
    extends Attachment
       with Position
       with TableLayout
       with UserZoom
       with _System
  
  @js.native
  sealed trait flat extends TransformStyle
  
  @js.native
  sealed trait flex extends DisplayInside
  
  @js.native
  sealed trait `flex-end`
    extends SelfPosition
       with ContentPosition
  
  @js.native
  sealed trait `flex-start`
    extends SelfPosition
       with ContentPosition
  
  @js.native
  sealed trait flip extends _ImageOrientation
  
  @js.native
  sealed trait floralwhite extends NamedColor
  
  @js.native
  sealed trait flow extends DisplayInside
  
  @js.native
  sealed trait `flow-root` extends DisplayInside
  
  @js.native
  sealed trait `force-end` extends _HangingPunctuation
  
  @js.native
  sealed trait forestgreen extends NamedColor
  
  @js.native
  sealed trait forwards extends SingleAnimationFillMode
  
  @js.native
  sealed trait `from-font`
    extends _TextDecoration[js.Any]
       with _TextDecorationThickness[js.Any]
       with _TextUnderlinePosition
  
  @js.native
  sealed trait `from-image`
    extends _ImageOrientation
       with _ImageResolution
  
  @js.native
  sealed trait fuchsia extends NamedColor
  
  @js.native
  sealed trait `full-size-kana` extends TextTransform
  
  @js.native
  sealed trait `full-width`
    extends TextTransform
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantEastAsian
  
  @js.native
  sealed trait gainsboro extends NamedColor
  
  @js.native
  sealed trait geometricPrecision
    extends ShapeRendering
       with TextRendering
  
  @js.native
  sealed trait ghostwhite extends NamedColor
  
  @js.native
  sealed trait gold extends NamedColor
  
  @js.native
  sealed trait goldenrod extends NamedColor
  
  @js.native
  sealed trait grab extends _Cursor
  
  @js.native
  sealed trait grabbing extends _Cursor
  
  @js.native
  sealed trait `grammar-error`
    extends _TextDecoration[js.Any]
       with _TextDecorationLine
  
  @js.native
  sealed trait gray extends NamedColor
  
  @js.native
  sealed trait green extends NamedColor
  
  @js.native
  sealed trait greenyellow extends NamedColor
  
  @js.native
  sealed trait grey extends NamedColor
  
  @js.native
  sealed trait grid extends DisplayInside
  
  @js.native
  sealed trait grippers extends MsTouchSelect
  
  @js.native
  sealed trait groove
    extends LineStyle
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
  
  @js.native
  sealed trait groupbox extends MozAppearance
  
  @js.native
  sealed trait hanging
    extends AlignmentBaseline
       with DominantBaseline
  
  @js.native
  sealed trait `hard-light`
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait help extends _Cursor
  
  @js.native
  sealed trait hidden
    extends LineStyle
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
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with Visibility
       with _Overflow
  
  @js.native
  sealed trait hide extends EmptyCells
  
  @js.native
  sealed trait `historical-forms`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantAlternates
  
  @js.native
  sealed trait `historical-ligatures`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  
  @js.native
  sealed trait honeydew extends NamedColor
  
  @js.native
  sealed trait horizontal
    extends BoxOrient
       with MozOrient
       with Resize
  
  @js.native
  sealed trait `horizontal-tb` extends WritingMode
  
  @js.native
  sealed trait hotpink extends NamedColor
  
  @js.native
  sealed trait hue
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait icon extends _Font
  
  @js.native
  sealed trait `ideograph-alpha` extends MsTextAutospace
  
  @js.native
  sealed trait `ideograph-numeric` extends MsTextAutospace
  
  @js.native
  sealed trait `ideograph-parenthesis` extends MsTextAutospace
  
  @js.native
  sealed trait `ideograph-space` extends MsTextAutospace
  
  @js.native
  sealed trait ideographic
    extends AlignmentBaseline
       with DominantBaseline
  
  @js.native
  sealed trait ignore
    extends MozStackSizing
       with MozUserFocus
  
  @js.native
  sealed trait inactive extends ImeMode
  
  @js.native
  sealed trait indianred extends NamedColor
  
  @js.native
  sealed trait indigo extends NamedColor
  
  @js.native
  sealed trait infinite
    extends _SingleAnimation[js.Any]
       with _AnimationIterationCount
       with _Range
  
  @js.native
  sealed trait inherit
    extends Globals
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
       with ColorAdjust
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
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
       with Hyphens
       with ImageRendering
       with ImeMode
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
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
       with Resize
       with RubyAlign
       with RubyMerge
       with RubyPosition
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
  
  @js.native
  sealed trait initial
    extends Globals
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
       with ColorAdjust
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
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
       with Hyphens
       with ImageRendering
       with ImeMode
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
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
       with Resize
       with RubyAlign
       with RubyMerge
       with RubyPosition
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
  
  @js.native
  sealed trait `inline`
    extends DisplayOutside
       with MozOrient
       with Resize
       with _ScrollSnapType
  
  @js.native
  sealed trait `inline-axis` extends BoxOrient
  
  @js.native
  sealed trait `inline-block` extends DisplayLegacy
  
  @js.native
  sealed trait `inline-end`
    extends CaptionSide
       with Clear
       with Float
  
  @js.native
  sealed trait `inline-flex` extends DisplayLegacy
  
  @js.native
  sealed trait `inline-grid` extends DisplayLegacy
  
  @js.native
  sealed trait `inline-list-item` extends DisplayLegacy
  
  @js.native
  sealed trait `inline-start`
    extends CaptionSide
       with Clear
       with Float
  
  @js.native
  sealed trait `inline-table` extends DisplayLegacy
  
  @js.native
  sealed trait `inner-spin-button` extends WebkitAppearance
  
  @js.native
  sealed trait inset
    extends LineStyle
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
  
  @js.native
  sealed trait inside
    extends ListStylePosition
       with _ListStyle
  
  @js.native
  sealed trait `inter-character` extends TextJustify
  
  @js.native
  sealed trait `inter-word` extends TextJustify
  
  @js.native
  sealed trait intersect extends CompositingOperator
  
  @js.native
  sealed trait intrinsic
    extends _MaxWidth[js.Any]
       with _MinWidth[js.Any]
       with _Width[js.Any]
  
  @js.native
  sealed trait invert
    extends _Outline[js.Any]
       with _OutlineColor
  
  @js.native
  sealed trait isolate
    extends Isolation
       with UnicodeBidi
  
  @js.native
  sealed trait `isolate-override` extends UnicodeBidi
  
  @js.native
  sealed trait italic
    extends _FontStyle
       with typings.csstype.mod.AtRule._FontStyle
  
  @js.native
  sealed trait ivory extends NamedColor
  
  @js.native
  sealed trait jis04 extends EastAsianVariantValues
  
  @js.native
  sealed trait jis78 extends EastAsianVariantValues
  
  @js.native
  sealed trait jis83 extends EastAsianVariantValues
  
  @js.native
  sealed trait jis90 extends EastAsianVariantValues
  
  @js.native
  sealed trait justify
    extends BoxPack
       with TextAlign
       with TextAlignLast
  
  @js.native
  sealed trait `keep-all` extends WordBreak
  
  @js.native
  sealed trait khaki extends NamedColor
  
  @js.native
  sealed trait landscape extends Orientation
  
  @js.native
  sealed trait large extends AbsoluteSize
  
  @js.native
  sealed trait larger
    extends _FontSize[js.Any]
  
  @js.native
  sealed trait last extends _HangingPunctuation
  
  @js.native
  sealed trait lavender extends NamedColor
  
  @js.native
  sealed trait lavenderblush extends NamedColor
  
  @js.native
  sealed trait lawngreen extends NamedColor
  
  @js.native
  sealed trait layout extends _Contain
  
  @js.native
  sealed trait `leading-spaces` extends _TextDecorationSkip
  
  @js.native
  sealed trait left
    extends _Position[js.Any]
       with BreakAfter
       with BreakBefore
       with Clear
       with Float
       with PageBreakAfter
       with PageBreakBefore
       with TextAlign
       with TextAlignLast
       with _BackgroundPositionX[js.Any]
       with _BgPosition[js.Any]
       with _JustifyContent
       with _JustifyItems
       with _JustifySelf
       with _TextUnderlinePosition
       with _TransformOrigin[js.Any]
       with _WebkitBoxReflect[js.Any]
       with _WebkitMaskPositionX[js.Any]
  
  @js.native
  sealed trait legacy extends _JustifyItems
  
  @js.native
  sealed trait lemonchiffon extends NamedColor
  
  @js.native
  sealed trait light extends _ScrollbarColor
  
  @js.native
  sealed trait lightblue extends NamedColor
  
  @js.native
  sealed trait lightcoral extends NamedColor
  
  @js.native
  sealed trait lightcyan extends NamedColor
  
  @js.native
  sealed trait lighten
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait lighter extends _FontWeight
  
  @js.native
  sealed trait lightgoldenrodyellow extends NamedColor
  
  @js.native
  sealed trait lightgray extends NamedColor
  
  @js.native
  sealed trait lightgreen extends NamedColor
  
  @js.native
  sealed trait lightgrey extends NamedColor
  
  @js.native
  sealed trait lightpink extends NamedColor
  
  @js.native
  sealed trait lightsalmon extends NamedColor
  
  @js.native
  sealed trait lightseagreen extends NamedColor
  
  @js.native
  sealed trait lightskyblue extends NamedColor
  
  @js.native
  sealed trait lightslategray extends NamedColor
  
  @js.native
  sealed trait lightslategrey extends NamedColor
  
  @js.native
  sealed trait lightsteelblue extends NamedColor
  
  @js.native
  sealed trait lightyellow extends NamedColor
  
  @js.native
  sealed trait lime extends NamedColor
  
  @js.native
  sealed trait limegreen extends NamedColor
  
  @js.native
  sealed trait `line-through`
    extends _TextDecoration[js.Any]
       with _TextDecorationLine
  
  @js.native
  sealed trait linear extends _TimingFunction
  
  @js.native
  sealed trait linearRGB extends ColorInterpolation
  
  @js.native
  sealed trait linen extends NamedColor
  
  @js.native
  sealed trait `lining-nums`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  
  @js.native
  sealed trait `list-item` extends _Display
  
  @js.native
  sealed trait listbox
    extends Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait listitem
    extends MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait local extends Attachment
  
  @js.native
  sealed trait loose extends LineBreak
  
  @js.native
  sealed trait lowercase extends TextTransform
  
  @js.native
  sealed trait lr extends MsBlockProgression
  
  @js.native
  sealed trait ltr extends Direction
  
  @js.native
  sealed trait luminance
    extends MaskingMode
       with MaskBorderMode
       with MaskType
       with _MaskBorder
  
  @js.native
  sealed trait luminosity
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait magenta extends NamedColor
  
  @js.native
  sealed trait mandatory
    extends MsContentZoomSnapType
       with MsScrollSnapType
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with _MsContentZoomSnap
  
  @js.native
  sealed trait manipulation extends _TouchAction
  
  @js.native
  sealed trait manual extends Hyphens
  
  @js.native
  sealed trait `margin-box`
    extends GeometryBox
       with MozFloatEdge
       with _MaskOrigin
       with _ShapeOutside
  
  @js.native
  sealed trait markers extends _PaintOrder
  
  @js.native
  sealed trait maroon extends NamedColor
  
  @js.native
  sealed trait `match-parent` extends TextAlign
  
  @js.native
  sealed trait `match-source` extends MaskingMode
  
  @js.native
  sealed trait mathematical
    extends AlignmentBaseline
       with DominantBaseline
  
  @js.native
  sealed trait `max-content`
    extends _TrackBreadth[js.Any]
       with _BlockSize[js.Any]
       with _Flex[js.Any]
       with _FlexBasis[js.Any]
       with _Height[js.Any]
       with _InlineSize[js.Any]
       with _MaxBlockSize[js.Any]
       with _MaxHeight[js.Any]
       with _MaxInlineSize[js.Any]
       with _MaxWidth[js.Any]
       with _MinBlockSize[js.Any]
       with _MinHeight[js.Any]
       with _MinInlineSize[js.Any]
       with _MinWidth[js.Any]
       with _Width[js.Any]
  
  @js.native
  sealed trait maximum extends MsWrapFlow
  
  @js.native
  sealed trait `media-controls-background` extends WebkitAppearance
  
  @js.native
  sealed trait `media-controls-fullscreen-background` extends WebkitAppearance
  
  @js.native
  sealed trait `media-current-time-display` extends WebkitAppearance
  
  @js.native
  sealed trait `media-enter-fullscreen-button` extends WebkitAppearance
  
  @js.native
  sealed trait `media-exit-fullscreen-button` extends WebkitAppearance
  
  @js.native
  sealed trait `media-fullscreen-button` extends WebkitAppearance
  
  @js.native
  sealed trait `media-mute-button` extends WebkitAppearance
  
  @js.native
  sealed trait `media-overlay-play-button` extends WebkitAppearance
  
  @js.native
  sealed trait `media-play-button` extends WebkitAppearance
  
  @js.native
  sealed trait `media-seek-back-button` extends WebkitAppearance
  
  @js.native
  sealed trait `media-seek-forward-button` extends WebkitAppearance
  
  @js.native
  sealed trait `media-slider` extends WebkitAppearance
  
  @js.native
  sealed trait `media-sliderthumb` extends WebkitAppearance
  
  @js.native
  sealed trait `media-time-remaining-display` extends WebkitAppearance
  
  @js.native
  sealed trait `media-toggle-closed-captions-button` extends WebkitAppearance
  
  @js.native
  sealed trait `media-volume-slider` extends WebkitAppearance
  
  @js.native
  sealed trait `media-volume-slider-container` extends WebkitAppearance
  
  @js.native
  sealed trait `media-volume-sliderthumb` extends WebkitAppearance
  
  @js.native
  sealed trait medium
    extends _LineWidth[js.Any]
       with AbsoluteSize
  
  @js.native
  sealed trait mediumaquamarine extends NamedColor
  
  @js.native
  sealed trait mediumblue extends NamedColor
  
  @js.native
  sealed trait mediumorchid extends NamedColor
  
  @js.native
  sealed trait mediumpurple extends NamedColor
  
  @js.native
  sealed trait mediumseagreen extends NamedColor
  
  @js.native
  sealed trait mediumslateblue extends NamedColor
  
  @js.native
  sealed trait mediumspringgreen extends NamedColor
  
  @js.native
  sealed trait mediumturquoise extends NamedColor
  
  @js.native
  sealed trait mediumvioletred extends NamedColor
  
  @js.native
  sealed trait menu_
    extends MozWindowShadow
       with _Font
  
  @js.native
  sealed trait menuarrow extends MozAppearance
  
  @js.native
  sealed trait menubar extends MozAppearance
  
  @js.native
  sealed trait menucheckbox extends MozAppearance
  
  @js.native
  sealed trait menuimage extends MozAppearance
  
  @js.native
  sealed trait menuitem extends MozAppearance
  
  @js.native
  sealed trait menuitemtext extends MozAppearance
  
  @js.native
  sealed trait menulist
    extends Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait `menulist-button`
    extends Appearance
       with MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait `menulist-text`
    extends MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait `menulist-textfield`
    extends MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait menupopup extends MozAppearance
  
  @js.native
  sealed trait menuradio extends MozAppearance
  
  @js.native
  sealed trait menuseparator extends MozAppearance
  
  @js.native
  sealed trait `message-box` extends _Font
  
  @js.native
  sealed trait meter
    extends Appearance
       with CompatAuto
       with WebkitAppearance
  
  @js.native
  sealed trait meterbar extends MozAppearance
  
  @js.native
  sealed trait meterchunk extends MozAppearance
  
  @js.native
  sealed trait middle
    extends AlignmentBaseline
       with DominantBaseline
       with TextAnchor
       with _VerticalAlign[js.Any]
  
  @js.native
  sealed trait midnightblue extends NamedColor
  
  @js.native
  sealed trait `min-content`
    extends _TrackBreadth[js.Any]
       with _BlockSize[js.Any]
       with _Flex[js.Any]
       with _FlexBasis[js.Any]
       with _Height[js.Any]
       with _InlineSize[js.Any]
       with _MaxBlockSize[js.Any]
       with _MaxHeight[js.Any]
       with _MaxInlineSize[js.Any]
       with _MaxWidth[js.Any]
       with _MinBlockSize[js.Any]
       with _MinHeight[js.Any]
       with _MinInlineSize[js.Any]
       with _MinWidth[js.Any]
       with _Width[js.Any]
  
  @js.native
  sealed trait `min-intrinsic`
    extends _MinWidth[js.Any]
       with _Width[js.Any]
  
  @js.native
  sealed trait mintcream extends NamedColor
  
  @js.native
  sealed trait mistyrose extends NamedColor
  
  @js.native
  sealed trait miter extends StrokeLinejoin
  
  @js.native
  sealed trait mixed extends TextOrientation
  
  @js.native
  sealed trait moccasin extends NamedColor
  
  @js.native
  sealed trait monospace extends GenericFamily
  
  @js.native
  sealed trait move extends _Cursor
  
  @js.native
  sealed trait multiple extends BoxLines
  
  @js.native
  sealed trait multiply
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait `n-resize` extends _Cursor
  
  @js.native
  sealed trait navajowhite extends NamedColor
  
  @js.native
  sealed trait navy extends NamedColor
  
  @js.native
  sealed trait `ne-resize` extends _Cursor
  
  @js.native
  sealed trait `nesw-resize` extends _Cursor
  
  @js.native
  sealed trait `no-change` extends DominantBaseline
  
  @js.native
  sealed trait `no-clip`
    extends _MaskLayer[js.Any]
       with _MaskClip
  
  @js.native
  sealed trait `no-close-quote` extends Quote
  
  @js.native
  sealed trait `no-common-ligatures`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  
  @js.native
  sealed trait `no-contextual`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  
  @js.native
  sealed trait `no-discretionary-ligatures`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  
  @js.native
  sealed trait `no-drag` extends MozWindowDragging
  
  @js.native
  sealed trait `no-drop` extends _Cursor
  
  @js.native
  sealed trait `no-historical-ligatures`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
  
  @js.native
  sealed trait `no-limit` extends _MsHyphenateLimitLines
  
  @js.native
  sealed trait `no-open-quote` extends Quote
  
  @js.native
  sealed trait `no-repeat`
    extends _RepeatStyle
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
  
  @js.native
  sealed trait `non-scaling-stroke` extends VectorEffect
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.csstype.mod.Property._Animation because Already inherited
  - typings.csstype.mod.DataType._SingleAnimation because Already inherited */ @js.native
  sealed trait none
    extends LineStyle
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
       with Hyphens
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
       with _FinalBgLayer[js.Any]
       with _Flex[js.Any]
       with _FontSizeAdjust
       with _FontSynthesis
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantLigatures
       with _Grid
       with _GridTemplate
       with _GridTemplateAreas
       with _GridTemplateColumns[js.Any]
       with _GridTemplateRows[js.Any]
       with _HangingPunctuation
       with _LineClamp
       with _ListStyle
       with _ListStyleImage
       with _ListStyleType
       with _Marker
       with _MarkerEnd
       with _MarkerMid
       with _MarkerStart
       with _MaskBorder
       with _MaskBorderSource
       with _MaskImage
       with _MaskLayer[js.Any]
       with _MaxLines
       with _MozBinding
       with _MozBorderBottomColors
       with _MozBorderLeftColors
       with _MozBorderRightColors
       with _MozBorderTopColors
       with _MozContextProperties
       with _MsContentZoomSnap
       with _MsFlowFrom
       with _MsFlowInto
       with _Offset[js.Any]
       with _OffsetPath
       with _OverscrollBehavior
       with _Paint
       with _Perspective[js.Any]
       with _Quotes
       with _Rotate
       with _Scale
       with _ScrollSnapAlign
       with _ScrollSnapCoordinate[js.Any]
       with _ScrollSnapPointsX
       with _ScrollSnapPointsY
       with _ScrollSnapType
       with _ShapeOutside
       with _SingleTransition[js.Any]
       with _StrokeDasharray[js.Any]
       with _TextCombineUpright
       with _TextDecoration[js.Any]
       with _TextDecorationLine
       with _TextDecorationSkip
       with _TextEmphasis
       with _TextEmphasisStyle
       with _TextShadow
       with _TextSizeAdjust
       with _TouchAction
       with _Transform
       with _TransitionProperty
       with _Translate[js.Any]
       with _WebkitLineClamp
       with _WebkitMask[js.Any]
       with _WebkitMaskImage
  
  @js.native
  sealed trait nonzero
    extends ClipRule
       with FillRule
  
  @js.native
  sealed trait normal
    extends SingleAnimationDirection
       with BlendMode
       with BoxDirection
       with FontKerning
       with FontVariantCaps
       with FontVariantPosition
       with ImeMode
       with LineBreak
       with MixBlendMode
       with MozUserFocus
       with OverflowWrap
       with ScrollSnapStop
       with UnicodeBidi
       with WhiteSpace
       with WordBreak
       with WordWrap
       with _AlignContent
       with _AlignItems
       with _AlignSelf
       with _ColumnGap[js.Any]
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
       with _Gap[js.Any]
       with _InitialLetter
       with _JustifyContent
       with _JustifyItems
       with _JustifySelf
       with _LetterSpacing[js.Any]
       with _LineHeight[js.Any]
       with _PaintOrder
       with _PlaceContent
       with _PlaceItems
       with _PlaceSelf
       with _RowGap[js.Any]
       with _WordSpacing[js.Any]
       with _Zoom
  
  @js.native
  sealed trait `not-allowed` extends _Cursor
  
  @js.native
  sealed trait nowrap
    extends FlexWrap
       with WhiteSpace
       with _FlexFlow
  
  @js.native
  sealed trait `ns-resize` extends _Cursor
  
  @js.native
  sealed trait numbers extends _SpeakAs
  
  @js.native
  sealed trait numeric extends _System
  
  @js.native
  sealed trait `nw-resize` extends _Cursor
  
  @js.native
  sealed trait `nwse-resize` extends _Cursor
  
  @js.native
  sealed trait objects extends _TextDecorationSkip
  
  @js.native
  sealed trait oblique
    extends _FontStyle
       with typings.csstype.mod.AtRule._FontStyle
  
  @js.native
  sealed trait oldlace extends NamedColor
  
  @js.native
  sealed trait `oldstyle-nums`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  
  @js.native
  sealed trait olive extends NamedColor
  
  @js.native
  sealed trait olivedrab extends NamedColor
  
  @js.native
  sealed trait open
    extends _TextEmphasis
       with _TextEmphasisStyle
  
  @js.native
  sealed trait `open-quote` extends Quote
  
  @js.native
  sealed trait optimizeLegibility extends TextRendering
  
  @js.native
  sealed trait optimizeQuality extends ColorRendering
  
  @js.native
  sealed trait optimizeSpeed
    extends ColorRendering
       with ShapeRendering
       with TextRendering
  
  @js.native
  sealed trait optional extends FontDisplay
  
  @js.native
  sealed trait orange extends NamedColor
  
  @js.native
  sealed trait orangered extends NamedColor
  
  @js.native
  sealed trait orchid extends NamedColor
  
  @js.native
  sealed trait ordinal
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  
  @js.native
  sealed trait outset
    extends LineStyle
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
  
  @js.native
  sealed trait outside
    extends ListStylePosition
       with _ListStyle
  
  @js.native
  sealed trait over extends RubyPosition
  
  @js.native
  sealed trait overlay
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait overline
    extends _TextDecoration[js.Any]
       with _TextDecorationLine
  
  @js.native
  sealed trait padding
    extends _WebkitMask[js.Any]
       with _WebkitMaskClip
       with _WebkitMaskOrigin
  
  @js.native
  sealed trait `padding-box`
    extends Box
       with GeometryBox
       with MozFloatEdge
       with OverflowClipBox
  
  @js.native
  sealed trait page
    extends BreakAfter
       with BreakBefore
  
  @js.native
  sealed trait paint extends _Contain
  
  @js.native
  sealed trait painted extends PointerEvents
  
  @js.native
  sealed trait palegoldenrod extends NamedColor
  
  @js.native
  sealed trait palegreen extends NamedColor
  
  @js.native
  sealed trait paleturquoise extends NamedColor
  
  @js.native
  sealed trait palevioletred extends NamedColor
  
  @js.native
  sealed trait `pan-down` extends _TouchAction
  
  @js.native
  sealed trait `pan-left` extends _TouchAction
  
  @js.native
  sealed trait `pan-right` extends _TouchAction
  
  @js.native
  sealed trait `pan-up` extends _TouchAction
  
  @js.native
  sealed trait `pan-x` extends _TouchAction
  
  @js.native
  sealed trait `pan-y` extends _TouchAction
  
  @js.native
  sealed trait papayawhip extends NamedColor
  
  @js.native
  sealed trait paused
    extends _SingleAnimation[js.Any]
       with _AnimationPlayState
  
  @js.native
  sealed trait peachpuff extends NamedColor
  
  @js.native
  sealed trait peru extends NamedColor
  
  @js.native
  sealed trait `petite-caps`
    extends FontVariantCaps
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  
  @js.native
  sealed trait `pinch-zoom` extends _TouchAction
  
  @js.native
  sealed trait pink extends NamedColor
  
  @js.native
  sealed trait pixelated extends ImageRendering
  
  @js.native
  sealed trait plaintext extends UnicodeBidi
  
  @js.native
  sealed trait plum extends NamedColor
  
  @js.native
  sealed trait pointer extends _Cursor
  
  @js.native
  sealed trait portrait extends Orientation
  
  @js.native
  sealed trait powderblue extends NamedColor
  
  @js.native
  sealed trait pre extends WhiteSpace
  
  @js.native
  sealed trait `pre-line` extends WhiteSpace
  
  @js.native
  sealed trait `pre-wrap` extends WhiteSpace
  
  @js.native
  sealed trait `preserve-3d` extends TransformStyle
  
  @js.native
  sealed trait progress extends _Cursor
  
  @js.native
  sealed trait `progress-bar`
    extends Appearance
       with CompatAuto
       with WebkitAppearance
  
  @js.native
  sealed trait `progress-bar-value` extends WebkitAppearance
  
  @js.native
  sealed trait progressbar extends MozAppearance
  
  @js.native
  sealed trait `progressbar-vertical` extends MozAppearance
  
  @js.native
  sealed trait progresschunk extends MozAppearance
  
  @js.native
  sealed trait `progresschunk-vertical` extends MozAppearance
  
  @js.native
  sealed trait `proportional-nums`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  
  @js.native
  sealed trait `proportional-width`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantEastAsian
  
  @js.native
  sealed trait proximity
    extends MsContentZoomSnapType
       with MsScrollSnapType
       with ScrollSnapTypeX
       with ScrollSnapTypeY
       with _MsContentZoomSnap
  
  @js.native
  sealed trait purple extends NamedColor
  
  @js.native
  sealed trait `push-button`
    extends Appearance
       with CompatAuto
       with WebkitAppearance
  
  @js.native
  sealed trait radio
    extends Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait `radio-container` extends MozAppearance
  
  @js.native
  sealed trait `radio-label` extends MozAppearance
  
  @js.native
  sealed trait radiomenuitem extends MozAppearance
  
  @js.native
  sealed trait railed extends MsScrollRails
  
  @js.native
  sealed trait range extends MozAppearance
  
  @js.native
  sealed trait `range-thumb` extends MozAppearance
  
  @js.native
  sealed trait `read-only`
    extends MozUserModify
       with WebkitUserModify
  
  @js.native
  sealed trait `read-write`
    extends MozUserModify
       with WebkitUserModify
  
  @js.native
  sealed trait `read-write-plaintext-only` extends WebkitUserModify
  
  @js.native
  sealed trait rebeccapurple extends NamedColor
  
  @js.native
  sealed trait recto
    extends BreakAfter
       with BreakBefore
       with PageBreakAfter
       with PageBreakBefore
  
  @js.native
  sealed trait red extends NamedColor
  
  @js.native
  sealed trait region
    extends BreakAfter
       with BreakBefore
  
  @js.native
  sealed trait relative extends Position
  
  @js.native
  sealed trait repeat
    extends _RepeatStyle
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with _BorderImage
       with _BorderImageRepeat
       with _MaskBorder
       with _MaskBorderRepeat
  
  @js.native
  sealed trait `repeat-x` extends _RepeatStyle
  
  @js.native
  sealed trait `repeat-y` extends _RepeatStyle
  
  @js.native
  sealed trait reset extends _Zoom
  
  @js.native
  sealed trait `reset-size` extends DominantBaseline
  
  @js.native
  sealed trait resizer extends MozAppearance
  
  @js.native
  sealed trait resizerpanel extends MozAppearance
  
  @js.native
  sealed trait reverse
    extends SingleAnimationDirection
       with BoxDirection
       with _OffsetRotate
  
  @js.native
  sealed trait revert
    extends Globals
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
       with ColorAdjust
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
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
       with Hyphens
       with ImageRendering
       with ImeMode
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
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
       with Resize
       with RubyAlign
       with RubyMerge
       with RubyPosition
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
  
  @js.native
  sealed trait ridge
    extends LineStyle
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
  
  @js.native
  sealed trait right
    extends _Position[js.Any]
       with BreakAfter
       with BreakBefore
       with Clear
       with Float
       with PageBreakAfter
       with PageBreakBefore
       with TextAlign
       with TextAlignLast
       with _BackgroundPositionX[js.Any]
       with _BgPosition[js.Any]
       with _JustifyContent
       with _JustifyItems
       with _JustifySelf
       with _TextUnderlinePosition
       with _TransformOrigin[js.Any]
       with _WebkitBoxReflect[js.Any]
       with _WebkitMaskPositionX[js.Any]
  
  @js.native
  sealed trait rl extends MsBlockProgression
  
  @js.native
  sealed trait rosybrown extends NamedColor
  
  @js.native
  sealed trait round
    extends _RepeatStyle
       with StrokeLinecap
       with StrokeLinejoin
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with _BorderImage
       with _BorderImageRepeat
       with _MaskBorder
       with _MaskBorderRepeat
  
  @js.native
  sealed trait row
    extends FlexDirection
       with _FlexFlow
       with _GridAutoFlow
  
  @js.native
  sealed trait `row-resize` extends _Cursor
  
  @js.native
  sealed trait `row-reverse`
    extends FlexDirection
       with _FlexFlow
  
  @js.native
  sealed trait royalblue extends NamedColor
  
  @js.native
  sealed trait rtl extends Direction
  
  @js.native
  sealed trait ruby
    extends DisplayInside
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantEastAsian
  
  @js.native
  sealed trait `ruby-base` extends DisplayInternal
  
  @js.native
  sealed trait `ruby-base-container` extends DisplayInternal
  
  @js.native
  sealed trait `ruby-text` extends DisplayInternal
  
  @js.native
  sealed trait `ruby-text-container` extends DisplayInternal
  
  @js.native
  sealed trait `run-in` extends DisplayOutside
  
  @js.native
  sealed trait running
    extends _SingleAnimation[js.Any]
       with _AnimationPlayState
  
  @js.native
  sealed trait `s-resize` extends _Cursor
  
  @js.native
  sealed trait sRGB extends ColorInterpolation
  
  @js.native
  sealed trait saddlebrown extends NamedColor
  
  @js.native
  sealed trait salmon extends NamedColor
  
  @js.native
  sealed trait sandybrown extends NamedColor
  
  @js.native
  sealed trait `sans-serif` extends GenericFamily
  
  @js.native
  sealed trait saturation
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait `scale-down` extends ObjectFit
  
  @js.native
  sealed trait `scale-horizontal` extends MozAppearance
  
  @js.native
  sealed trait `scale-vertical` extends MozAppearance
  
  @js.native
  sealed trait `scalethumb-horizontal` extends MozAppearance
  
  @js.native
  sealed trait `scalethumb-vertical` extends MozAppearance
  
  @js.native
  sealed trait scalethumbend extends MozAppearance
  
  @js.native
  sealed trait scalethumbstart extends MozAppearance
  
  @js.native
  sealed trait scalethumbtick extends MozAppearance
  
  @js.native
  sealed trait screen
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait scroll
    extends Attachment
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with _Overflow
  
  @js.native
  sealed trait `scroll-position` extends _AnimateableFeature
  
  @js.native
  sealed trait scrollbar_ extends MsOverflowStyle
  
  @js.native
  sealed trait `scrollbarbutton-down` extends MozAppearance
  
  @js.native
  sealed trait `scrollbarbutton-left` extends MozAppearance
  
  @js.native
  sealed trait `scrollbarbutton-right` extends MozAppearance
  
  @js.native
  sealed trait `scrollbarbutton-up` extends MozAppearance
  
  @js.native
  sealed trait `scrollbarthumb-horizontal` extends MozAppearance
  
  @js.native
  sealed trait `scrollbarthumb-vertical` extends MozAppearance
  
  @js.native
  sealed trait `scrollbartrack-horizontal` extends MozAppearance
  
  @js.native
  sealed trait `scrollbartrack-vertical` extends MozAppearance
  
  @js.native
  sealed trait `se-resize` extends _Cursor
  
  @js.native
  sealed trait seagreen extends NamedColor
  
  @js.native
  sealed trait searchfield
    extends Appearance
       with CompatAuto
       with MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait `searchfield-cancel-button` extends WebkitAppearance
  
  @js.native
  sealed trait `searchfield-decoration` extends WebkitAppearance
  
  @js.native
  sealed trait `searchfield-results-button` extends WebkitAppearance
  
  @js.native
  sealed trait `searchfield-results-decoration` extends WebkitAppearance
  
  @js.native
  sealed trait seashell extends NamedColor
  
  @js.native
  sealed trait `select-after` extends MozUserFocus
  
  @js.native
  sealed trait `select-all` extends MozUserFocus
  
  @js.native
  sealed trait `select-before` extends MozUserFocus
  
  @js.native
  sealed trait `select-menu` extends MozUserFocus
  
  @js.native
  sealed trait `select-same` extends MozUserFocus
  
  @js.native
  sealed trait `self-end` extends SelfPosition
  
  @js.native
  sealed trait `self-start` extends SelfPosition
  
  @js.native
  sealed trait `semi-condensed` extends _FontStretchAbsolute
  
  @js.native
  sealed trait `semi-expanded` extends _FontStretchAbsolute
  
  @js.native
  sealed trait separate
    extends BorderCollapse
       with RubyMerge
  
  @js.native
  sealed trait separator extends MozAppearance
  
  @js.native
  sealed trait serif extends GenericFamily
  
  @js.native
  sealed trait sesame
    extends _TextEmphasis
       with _TextEmphasisStyle
  
  @js.native
  sealed trait sheet
    extends MozAppearance
       with MozWindowShadow
  
  @js.native
  sealed trait show extends EmptyCells
  
  @js.native
  sealed trait sideways extends TextOrientation
  
  @js.native
  sealed trait `sideways-lr` extends WritingMode
  
  @js.native
  sealed trait `sideways-rl` extends WritingMode
  
  @js.native
  sealed trait sienna extends NamedColor
  
  @js.native
  sealed trait silver extends NamedColor
  
  @js.native
  sealed trait simplified extends EastAsianVariantValues
  
  @js.native
  sealed trait single extends BoxLines
  
  @js.native
  sealed trait size extends _Contain
  
  @js.native
  sealed trait skyblue extends NamedColor
  
  @js.native
  sealed trait `slashed-zero`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  
  @js.native
  sealed trait slateblue extends NamedColor
  
  @js.native
  sealed trait slategray extends NamedColor
  
  @js.native
  sealed trait slategrey extends NamedColor
  
  @js.native
  sealed trait slice extends BoxDecorationBreak
  
  @js.native
  sealed trait `slider-horizontal`
    extends Appearance
       with CompatAuto
       with WebkitAppearance
  
  @js.native
  sealed trait `slider-vertical` extends WebkitAppearance
  
  @js.native
  sealed trait `sliderthumb-horizontal` extends WebkitAppearance
  
  @js.native
  sealed trait `sliderthumb-vertical` extends WebkitAppearance
  
  @js.native
  sealed trait small extends AbsoluteSize
  
  @js.native
  sealed trait `small-caps`
    extends FontVariantCaps
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  
  @js.native
  sealed trait `small-caption` extends _Font
  
  @js.native
  sealed trait smaller
    extends _FontSize[js.Any]
  
  @js.native
  sealed trait smooth extends ScrollBehavior
  
  @js.native
  sealed trait snow extends NamedColor
  
  @js.native
  sealed trait `soft-light`
    extends BlendMode
       with MixBlendMode
  
  @js.native
  sealed trait solid
    extends LineStyle
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
       with TextDecorationStyle
       with _TextDecoration[js.Any]
  
  @js.native
  sealed trait `source-atop` extends CompositeStyle
  
  @js.native
  sealed trait `source-in` extends CompositeStyle
  
  @js.native
  sealed trait `source-out` extends CompositeStyle
  
  @js.native
  sealed trait `source-over` extends CompositeStyle
  
  @js.native
  sealed trait space
    extends _RepeatStyle
       with WebkitMaskRepeatX
       with WebkitMaskRepeatY
       with _BorderImage
       with _BorderImageRepeat
       with _MaskBorder
       with _MaskBorderRepeat
  
  @js.native
  sealed trait `space-around`
    extends ContentDistribution
       with RubyAlign
  
  @js.native
  sealed trait `space-between`
    extends ContentDistribution
       with RubyAlign
  
  @js.native
  sealed trait `space-evenly` extends ContentDistribution
  
  @js.native
  sealed trait spaces extends _TextDecorationSkip
  
  @js.native
  sealed trait `spell-out` extends _SpeakAs
  
  @js.native
  sealed trait `spelling-error`
    extends _TextDecoration[js.Any]
       with _TextDecorationLine
  
  @js.native
  sealed trait spinner extends MozAppearance
  
  @js.native
  sealed trait `spinner-downbutton` extends MozAppearance
  
  @js.native
  sealed trait `spinner-textfield` extends MozAppearance
  
  @js.native
  sealed trait `spinner-upbutton` extends MozAppearance
  
  @js.native
  sealed trait splitter extends MozAppearance
  
  @js.native
  sealed trait springgreen extends NamedColor
  
  @js.native
  sealed trait square extends StrokeLinecap
  
  @js.native
  sealed trait `square-button`
    extends Appearance
       with CompatAuto
       with WebkitAppearance
  
  @js.native
  sealed trait `stacked-fractions`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  
  @js.native
  sealed trait start
    extends SelfPosition
       with BoxAlign
       with BoxPack
       with ContentPosition
       with MsWrapFlow
       with RubyAlign
       with TextAlign
       with TextAlignLast
       with TextAnchor
       with _ScrollSnapAlign
  
  @js.native
  sealed trait static extends Position
  
  @js.native
  sealed trait `status-bar` extends _Font
  
  @js.native
  sealed trait statusbar extends MozAppearance
  
  @js.native
  sealed trait statusbarpanel extends MozAppearance
  
  @js.native
  sealed trait steelblue extends NamedColor
  
  @js.native
  sealed trait `step-end` extends _StepTimingFunction
  
  @js.native
  sealed trait `step-start` extends _StepTimingFunction
  
  @js.native
  sealed trait sticky extends Position
  
  @js.native
  sealed trait stretch
    extends ContentDistribution
       with BoxAlign
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
  
  @js.native
  sealed trait `stretch-to-fit` extends MozStackSizing
  
  @js.native
  sealed trait strict
    extends LineBreak
       with _Contain
  
  @js.native
  sealed trait stroke
    extends PointerEvents
       with _MozContextProperties
       with _PaintOrder
  
  @js.native
  sealed trait `stroke-box`
    extends GeometryBox
       with TransformBox
  
  @js.native
  sealed trait `stroke-opacity` extends _MozContextProperties
  
  @js.native
  sealed trait style
    extends _Contain
       with _FontSynthesis
  
  @js.native
  sealed trait sub
    extends FontVariantPosition
       with _BaselineShift[js.Any]
       with _VerticalAlign[js.Any]
  
  @js.native
  sealed trait subgrid
    extends _GridTemplateColumns[js.Any]
       with _GridTemplateRows[js.Any]
  
  @js.native
  sealed trait subtract extends CompositingOperator
  
  @js.native
  sealed trait `super`
    extends FontVariantPosition
       with _BaselineShift[js.Any]
       with _VerticalAlign[js.Any]
  
  @js.native
  sealed trait `sw-resize` extends _Cursor
  
  @js.native
  sealed trait swap extends FontDisplay
  
  @js.native
  sealed trait symbolic extends _System
  
  @js.native
  sealed trait tab extends MozAppearance
  
  @js.native
  sealed trait `tab-scroll-arrow-back` extends MozAppearance
  
  @js.native
  sealed trait `tab-scroll-arrow-forward` extends MozAppearance
  
  @js.native
  sealed trait table extends DisplayInside
  
  @js.native
  sealed trait `table-caption` extends DisplayInternal
  
  @js.native
  sealed trait `table-cell` extends DisplayInternal
  
  @js.native
  sealed trait `table-column` extends DisplayInternal
  
  @js.native
  sealed trait `table-column-group` extends DisplayInternal
  
  @js.native
  sealed trait `table-footer-group` extends DisplayInternal
  
  @js.native
  sealed trait `table-header-group` extends DisplayInternal
  
  @js.native
  sealed trait `table-row` extends DisplayInternal
  
  @js.native
  sealed trait `table-row-group` extends DisplayInternal
  
  @js.native
  sealed trait tabpanel extends MozAppearance
  
  @js.native
  sealed trait tabpanels extends MozAppearance
  
  @js.native
  sealed trait `tabular-nums`
    extends _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
       with _FontVariantNumeric
  
  @js.native
  sealed trait tan extends NamedColor
  
  @js.native
  sealed trait tb extends MsBlockProgression
  
  @js.native
  sealed trait teal extends NamedColor
  
  @js.native
  sealed trait text
    extends MsUserSelect
       with UserSelect
       with _Cursor
       with _WebkitMask[js.Any]
       with _WebkitMaskClip
  
  @js.native
  sealed trait `text-after-edge`
    extends AlignmentBaseline
       with DominantBaseline
  
  @js.native
  sealed trait `text-before-edge`
    extends AlignmentBaseline
       with DominantBaseline
  
  @js.native
  sealed trait `text-bottom`
    extends _VerticalAlign[js.Any]
  
  @js.native
  sealed trait `text-top`
    extends _VerticalAlign[js.Any]
  
  @js.native
  sealed trait textarea
    extends Appearance
       with CompatAuto
       with WebkitAppearance
  
  @js.native
  sealed trait textfield
    extends Appearance
       with MozAppearance
       with WebkitAppearance
  
  @js.native
  sealed trait `textfield-multiline` extends MozAppearance
  
  @js.native
  sealed trait thick
    extends _LineWidth[js.Any]
  
  @js.native
  sealed trait thin
    extends _LineWidth[js.Any]
       with ScrollbarWidth
  
  @js.native
  sealed trait thistle extends NamedColor
  
  @js.native
  sealed trait `titling-caps`
    extends FontVariantCaps
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  
  @js.native
  sealed trait tomato extends NamedColor
  
  @js.native
  sealed trait toolbar extends MozAppearance
  
  @js.native
  sealed trait toolbarbutton extends MozAppearance
  
  @js.native
  sealed trait `toolbarbutton-dropdown` extends MozAppearance
  
  @js.native
  sealed trait toolbargripper extends MozAppearance
  
  @js.native
  sealed trait toolbox extends MozAppearance
  
  @js.native
  sealed trait tooltip
    extends MozAppearance
       with MozWindowShadow
  
  @js.native
  sealed trait top
    extends _Position[js.Any]
       with CaptionSide
       with _BackgroundPositionY[js.Any]
       with _BgPosition[js.Any]
       with _TransformOrigin[js.Any]
       with _VerticalAlign[js.Any]
       with _WebkitMaskPositionY[js.Any]
  
  @js.native
  sealed trait touch extends WebkitOverflowScrolling
  
  @js.native
  sealed trait traditional extends EastAsianVariantValues
  
  @js.native
  sealed trait `trailing-spaces` extends _TextDecorationSkip
  
  @js.native
  sealed trait transparent extends NamedColor
  
  @js.native
  sealed trait treeheader extends MozAppearance
  
  @js.native
  sealed trait treeheadercell extends MozAppearance
  
  @js.native
  sealed trait treeheadersortarrow extends MozAppearance
  
  @js.native
  sealed trait treeitem extends MozAppearance
  
  @js.native
  sealed trait treeline extends MozAppearance
  
  @js.native
  sealed trait treetwisty extends MozAppearance
  
  @js.native
  sealed trait treetwistyopen extends MozAppearance
  
  @js.native
  sealed trait treeview extends MozAppearance
  
  @js.native
  sealed trait triangle
    extends _TextEmphasis
       with _TextEmphasisStyle
  
  @js.native
  sealed trait `true` extends MsAccelerator
  
  @js.native
  sealed trait turquoise extends NamedColor
  
  @js.native
  sealed trait `ultra-condensed` extends _FontStretchAbsolute
  
  @js.native
  sealed trait `ultra-expanded` extends _FontStretchAbsolute
  
  @js.native
  sealed trait under
    extends RubyPosition
       with _TextUnderlinePosition
  
  @js.native
  sealed trait underline
    extends _TextDecoration[js.Any]
       with _TextDecorationLine
  
  @js.native
  sealed trait unicase
    extends FontVariantCaps
       with _FontVariant
       with typings.csstype.mod.AtRule._FontVariant
  
  @js.native
  sealed trait unset
    extends Globals
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
       with ColorAdjust
       with ColorInterpolation
       with ColorRendering
       with ColumnFill
       with ColumnSpan
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
       with Hyphens
       with ImageRendering
       with ImeMode
       with Isolation
       with LineBreak
       with ListStylePosition
       with MaskBorderMode
       with MaskType
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
       with Resize
       with RubyAlign
       with RubyMerge
       with RubyPosition
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
  
  @js.native
  sealed trait uppercase extends TextTransform
  
  @js.native
  sealed trait upright extends TextOrientation
  
  @js.native
  sealed trait `use-script` extends DominantBaseline
  
  @js.native
  sealed trait verso
    extends BreakAfter
       with BreakBefore
       with PageBreakAfter
       with PageBreakBefore
  
  @js.native
  sealed trait vertical
    extends BoxOrient
       with MozOrient
       with Resize
  
  @js.native
  sealed trait `vertical-lr` extends WritingMode
  
  @js.native
  sealed trait `vertical-rl` extends WritingMode
  
  @js.native
  sealed trait `vertical-text` extends _Cursor
  
  @js.native
  sealed trait `vertical-to-horizontal` extends MsScrollTranslation
  
  @js.native
  sealed trait `view-box`
    extends GeometryBox
       with TransformBox
  
  @js.native
  sealed trait violet extends NamedColor
  
  @js.native
  sealed trait visible
    extends BackfaceVisibility
       with OverflowBlock
       with OverflowInline
       with OverflowX
       with OverflowY
       with PointerEvents
       with Visibility
       with _Overflow
  
  @js.native
  sealed trait visibleFill extends PointerEvents
  
  @js.native
  sealed trait visiblePainted extends PointerEvents
  
  @js.native
  sealed trait visibleStroke extends PointerEvents
  
  @js.native
  sealed trait `w-resize` extends _Cursor
  
  @js.native
  sealed trait wait extends _Cursor
  
  @js.native
  sealed trait wavy
    extends TextDecorationStyle
       with _TextDecoration[js.Any]
  
  @js.native
  sealed trait weight extends _FontSynthesis
  
  @js.native
  sealed trait wheat extends NamedColor
  
  @js.native
  sealed trait white extends NamedColor
  
  @js.native
  sealed trait whitesmoke extends NamedColor
  
  @js.native
  sealed trait words extends _SpeakAs
  
  @js.native
  sealed trait wrap
    extends FlexWrap
       with MsWrapThrough
       with _FlexFlow
  
  @js.native
  sealed trait `wrap-reverse`
    extends FlexWrap
       with _FlexFlow
  
  @js.native
  sealed trait `write-only` extends MozUserModify
  
  @js.native
  sealed trait x extends _ScrollSnapType
  
  @js.native
  sealed trait `x-end`
    extends _BackgroundPositionX[js.Any]
  
  @js.native
  sealed trait `x-large` extends AbsoluteSize
  
  @js.native
  sealed trait `x-small` extends AbsoluteSize
  
  @js.native
  sealed trait `x-start`
    extends _BackgroundPositionX[js.Any]
  
  @js.native
  sealed trait xor extends CompositeStyle
  
  @js.native
  sealed trait `xx-large` extends AbsoluteSize
  
  @js.native
  sealed trait `xx-small` extends AbsoluteSize
  
  @js.native
  sealed trait `xxx-large` extends AbsoluteSize
  
  @js.native
  sealed trait y extends _ScrollSnapType
  
  @js.native
  sealed trait `y-end`
    extends _BackgroundPositionY[js.Any]
  
  @js.native
  sealed trait `y-start`
    extends _BackgroundPositionY[js.Any]
  
  @js.native
  sealed trait yellow extends NamedColor
  
  @js.native
  sealed trait yellowgreen extends NamedColor
  
  @js.native
  sealed trait zoom
    extends MsContentZooming
       with UserZoom
  
  @js.native
  sealed trait `zoom-in` extends _Cursor
  
  @js.native
  sealed trait `zoom-out` extends _Cursor
  
  @scala.inline
  def `-moz-crisp-edges`: `-moz-crisp-edges` = "-moz-crisp-edges".asInstanceOf[`-moz-crisp-edges`]
  @scala.inline
  def `-moz-grab`: `-moz-grab` = "-moz-grab".asInstanceOf[`-moz-grab`]
  @scala.inline
  def `-moz-initial`: `-moz-initial` = "-moz-initial".asInstanceOf[`-moz-initial`]
  @scala.inline
  def `-moz-isolate`: `-moz-isolate` = "-moz-isolate".asInstanceOf[`-moz-isolate`]
  @scala.inline
  def `-moz-isolate-override`: `-moz-isolate-override` = "-moz-isolate-override".asInstanceOf[`-moz-isolate-override`]
  @scala.inline
  def `-moz-mac-unified-toolbar`: `-moz-mac-unified-toolbar` = "-moz-mac-unified-toolbar".asInstanceOf[`-moz-mac-unified-toolbar`]
  @scala.inline
  def `-moz-max-content`: `-moz-max-content` = "-moz-max-content".asInstanceOf[`-moz-max-content`]
  @scala.inline
  def `-moz-min-content`: `-moz-min-content` = "-moz-min-content".asInstanceOf[`-moz-min-content`]
  @scala.inline
  def `-moz-none`: `-moz-none` = "-moz-none".asInstanceOf[`-moz-none`]
  @scala.inline
  def `-moz-plaintext`: `-moz-plaintext` = "-moz-plaintext".asInstanceOf[`-moz-plaintext`]
  @scala.inline
  def `-moz-pre-wrap`: `-moz-pre-wrap` = "-moz-pre-wrap".asInstanceOf[`-moz-pre-wrap`]
  @scala.inline
  def `-moz-win-borderless-glass`: `-moz-win-borderless-glass` = "-moz-win-borderless-glass".asInstanceOf[`-moz-win-borderless-glass`]
  @scala.inline
  def `-moz-win-browsertabbar-toolbox`: `-moz-win-browsertabbar-toolbox` = "-moz-win-browsertabbar-toolbox".asInstanceOf[`-moz-win-browsertabbar-toolbox`]
  @scala.inline
  def `-moz-win-communications-toolbox`: `-moz-win-communications-toolbox` = "-moz-win-communications-toolbox".asInstanceOf[`-moz-win-communications-toolbox`]
  @scala.inline
  def `-moz-win-communicationstext`: `-moz-win-communicationstext` = "-moz-win-communicationstext".asInstanceOf[`-moz-win-communicationstext`]
  @scala.inline
  def `-moz-win-exclude-glass`: `-moz-win-exclude-glass` = "-moz-win-exclude-glass".asInstanceOf[`-moz-win-exclude-glass`]
  @scala.inline
  def `-moz-win-glass`: `-moz-win-glass` = "-moz-win-glass".asInstanceOf[`-moz-win-glass`]
  @scala.inline
  def `-moz-win-media-toolbox`: `-moz-win-media-toolbox` = "-moz-win-media-toolbox".asInstanceOf[`-moz-win-media-toolbox`]
  @scala.inline
  def `-moz-win-mediatext`: `-moz-win-mediatext` = "-moz-win-mediatext".asInstanceOf[`-moz-win-mediatext`]
  @scala.inline
  def `-moz-window-button-box`: `-moz-window-button-box` = "-moz-window-button-box".asInstanceOf[`-moz-window-button-box`]
  @scala.inline
  def `-moz-window-button-box-maximized`: `-moz-window-button-box-maximized` = "-moz-window-button-box-maximized".asInstanceOf[`-moz-window-button-box-maximized`]
  @scala.inline
  def `-moz-window-button-close`: `-moz-window-button-close` = "-moz-window-button-close".asInstanceOf[`-moz-window-button-close`]
  @scala.inline
  def `-moz-window-button-maximize`: `-moz-window-button-maximize` = "-moz-window-button-maximize".asInstanceOf[`-moz-window-button-maximize`]
  @scala.inline
  def `-moz-window-button-minimize`: `-moz-window-button-minimize` = "-moz-window-button-minimize".asInstanceOf[`-moz-window-button-minimize`]
  @scala.inline
  def `-moz-window-button-restore`: `-moz-window-button-restore` = "-moz-window-button-restore".asInstanceOf[`-moz-window-button-restore`]
  @scala.inline
  def `-moz-window-frame-bottom`: `-moz-window-frame-bottom` = "-moz-window-frame-bottom".asInstanceOf[`-moz-window-frame-bottom`]
  @scala.inline
  def `-moz-window-frame-left`: `-moz-window-frame-left` = "-moz-window-frame-left".asInstanceOf[`-moz-window-frame-left`]
  @scala.inline
  def `-moz-window-frame-right`: `-moz-window-frame-right` = "-moz-window-frame-right".asInstanceOf[`-moz-window-frame-right`]
  @scala.inline
  def `-moz-window-titlebar`: `-moz-window-titlebar` = "-moz-window-titlebar".asInstanceOf[`-moz-window-titlebar`]
  @scala.inline
  def `-moz-window-titlebar-maximized`: `-moz-window-titlebar-maximized` = "-moz-window-titlebar-maximized".asInstanceOf[`-moz-window-titlebar-maximized`]
  @scala.inline
  def `-ms-autohiding-scrollbar`: `-ms-autohiding-scrollbar` = "-ms-autohiding-scrollbar".asInstanceOf[`-ms-autohiding-scrollbar`]
  @scala.inline
  def `-ms-flexbox`: `-ms-flexbox` = "-ms-flexbox".asInstanceOf[`-ms-flexbox`]
  @scala.inline
  def `-ms-grid`: `-ms-grid` = "-ms-grid".asInstanceOf[`-ms-grid`]
  @scala.inline
  def `-ms-inline-flexbox`: `-ms-inline-flexbox` = "-ms-inline-flexbox".asInstanceOf[`-ms-inline-flexbox`]
  @scala.inline
  def `-ms-inline-grid`: `-ms-inline-grid` = "-ms-inline-grid".asInstanceOf[`-ms-inline-grid`]
  @scala.inline
  def `-ms-manipulation`: `-ms-manipulation` = "-ms-manipulation".asInstanceOf[`-ms-manipulation`]
  @scala.inline
  def `-ms-none`: `-ms-none` = "-ms-none".asInstanceOf[`-ms-none`]
  @scala.inline
  def `-ms-pinch-zoom`: `-ms-pinch-zoom` = "-ms-pinch-zoom".asInstanceOf[`-ms-pinch-zoom`]
  @scala.inline
  def `-ms-zoom`: `-ms-zoom` = "-ms-zoom".asInstanceOf[`-ms-zoom`]
  @scala.inline
  def `-webkit-auto`: `-webkit-auto` = "-webkit-auto".asInstanceOf[`-webkit-auto`]
  @scala.inline
  def `-webkit-flex`: `-webkit-flex` = "-webkit-flex".asInstanceOf[`-webkit-flex`]
  @scala.inline
  def `-webkit-grab`: `-webkit-grab` = "-webkit-grab".asInstanceOf[`-webkit-grab`]
  @scala.inline
  def `-webkit-inline-flex`: `-webkit-inline-flex` = "-webkit-inline-flex".asInstanceOf[`-webkit-inline-flex`]
  @scala.inline
  def `-webkit-isolate`: `-webkit-isolate` = "-webkit-isolate".asInstanceOf[`-webkit-isolate`]
  @scala.inline
  def `-webkit-max-content`: `-webkit-max-content` = "-webkit-max-content".asInstanceOf[`-webkit-max-content`]
  @scala.inline
  def `-webkit-min-content`: `-webkit-min-content` = "-webkit-min-content".asInstanceOf[`-webkit-min-content`]
  @scala.inline
  def `-webkit-optimize-contrast`: `-webkit-optimize-contrast` = "-webkit-optimize-contrast".asInstanceOf[`-webkit-optimize-contrast`]
  @scala.inline
  def `-webkit-sticky`: `-webkit-sticky` = "-webkit-sticky".asInstanceOf[`-webkit-sticky`]
  @scala.inline
  def `@charset`: `@charset` = "@charset".asInstanceOf[`@charset`]
  @scala.inline
  def `@counter-style`: `@counter-style` = "@counter-style".asInstanceOf[`@counter-style`]
  @scala.inline
  def `@document`: `@document` = "@document".asInstanceOf[`@document`]
  @scala.inline
  def `@font-face`: `@font-face` = "@font-face".asInstanceOf[`@font-face`]
  @scala.inline
  def `@font-feature-values`: `@font-feature-values` = "@font-feature-values".asInstanceOf[`@font-feature-values`]
  @scala.inline
  def `@import`: `@import` = "@import".asInstanceOf[`@import`]
  @scala.inline
  def `@keyframes`: `@keyframes` = "@keyframes".asInstanceOf[`@keyframes`]
  @scala.inline
  def `@media`: `@media` = "@media".asInstanceOf[`@media`]
  @scala.inline
  def `@namespace`: `@namespace` = "@namespace".asInstanceOf[`@namespace`]
  @scala.inline
  def `@page`: `@page` = "@page".asInstanceOf[`@page`]
  @scala.inline
  def `@supports`: `@supports` = "@supports".asInstanceOf[`@supports`]
  @scala.inline
  def `@viewport`: `@viewport` = "@viewport".asInstanceOf[`@viewport`]
  @scala.inline
  def ActiveBorder: ActiveBorder = "ActiveBorder".asInstanceOf[ActiveBorder]
  @scala.inline
  def ActiveCaption: ActiveCaption = "ActiveCaption".asInstanceOf[ActiveCaption]
  @scala.inline
  def AppWorkspace: AppWorkspace = "AppWorkspace".asInstanceOf[AppWorkspace]
  @scala.inline
  def Background: Background = "Background".asInstanceOf[Background]
  @scala.inline
  def ButtonFace: ButtonFace = "ButtonFace".asInstanceOf[ButtonFace]
  @scala.inline
  def ButtonHighlight: ButtonHighlight = "ButtonHighlight".asInstanceOf[ButtonHighlight]
  @scala.inline
  def ButtonShadow: ButtonShadow = "ButtonShadow".asInstanceOf[ButtonShadow]
  @scala.inline
  def ButtonText: ButtonText = "ButtonText".asInstanceOf[ButtonText]
  @scala.inline
  def CaptionText: CaptionText = "CaptionText".asInstanceOf[CaptionText]
  @scala.inline
  def `Colon-khtml-any-link`: `Colon-khtml-any-link` = ":-khtml-any-link".asInstanceOf[`Colon-khtml-any-link`]
  @scala.inline
  def `Colon-moz-any-link`: `Colon-moz-any-link` = ":-moz-any-link".asInstanceOf[`Colon-moz-any-link`]
  @scala.inline
  def `Colon-moz-anyLeftparenthesisRightparenthesis`: `Colon-moz-anyLeftparenthesisRightparenthesis` = ":-moz-any()".asInstanceOf[`Colon-moz-anyLeftparenthesisRightparenthesis`]
  @scala.inline
  def `Colon-moz-dir`: `Colon-moz-dir` = ":-moz-dir".asInstanceOf[`Colon-moz-dir`]
  @scala.inline
  def `Colon-moz-focusring`: `Colon-moz-focusring` = ":-moz-focusring".asInstanceOf[`Colon-moz-focusring`]
  @scala.inline
  def `Colon-moz-full-screen`: `Colon-moz-full-screen` = ":-moz-full-screen".asInstanceOf[`Colon-moz-full-screen`]
  @scala.inline
  def `Colon-moz-placeholder`: `Colon-moz-placeholder` = ":-moz-placeholder".asInstanceOf[`Colon-moz-placeholder`]
  @scala.inline
  def `Colon-moz-read-only`: `Colon-moz-read-only` = ":-moz-read-only".asInstanceOf[`Colon-moz-read-only`]
  @scala.inline
  def `Colon-moz-read-write`: `Colon-moz-read-write` = ":-moz-read-write".asInstanceOf[`Colon-moz-read-write`]
  @scala.inline
  def `Colon-ms-fullscreen`: `Colon-ms-fullscreen` = ":-ms-fullscreen".asInstanceOf[`Colon-ms-fullscreen`]
  @scala.inline
  def `Colon-ms-input-placeholder`: `Colon-ms-input-placeholder` = ":-ms-input-placeholder".asInstanceOf[`Colon-ms-input-placeholder`]
  @scala.inline
  def `Colon-webkit-any-link`: `Colon-webkit-any-link` = ":-webkit-any-link".asInstanceOf[`Colon-webkit-any-link`]
  @scala.inline
  def `Colon-webkit-anyLeftparenthesisRightparenthesis`: `Colon-webkit-anyLeftparenthesisRightparenthesis` = ":-webkit-any()".asInstanceOf[`Colon-webkit-anyLeftparenthesisRightparenthesis`]
  @scala.inline
  def `Colon-webkit-full-screen`: `Colon-webkit-full-screen` = ":-webkit-full-screen".asInstanceOf[`Colon-webkit-full-screen`]
  @scala.inline
  def `ColonColon-moz-placeholder`: `ColonColon-moz-placeholder` = "::-moz-placeholder".asInstanceOf[`ColonColon-moz-placeholder`]
  @scala.inline
  def `ColonColon-moz-progress-bar`: `ColonColon-moz-progress-bar` = "::-moz-progress-bar".asInstanceOf[`ColonColon-moz-progress-bar`]
  @scala.inline
  def `ColonColon-moz-range-progress`: `ColonColon-moz-range-progress` = "::-moz-range-progress".asInstanceOf[`ColonColon-moz-range-progress`]
  @scala.inline
  def `ColonColon-moz-range-thumb`: `ColonColon-moz-range-thumb` = "::-moz-range-thumb".asInstanceOf[`ColonColon-moz-range-thumb`]
  @scala.inline
  def `ColonColon-moz-range-track`: `ColonColon-moz-range-track` = "::-moz-range-track".asInstanceOf[`ColonColon-moz-range-track`]
  @scala.inline
  def `ColonColon-moz-selection`: `ColonColon-moz-selection` = "::-moz-selection".asInstanceOf[`ColonColon-moz-selection`]
  @scala.inline
  def `ColonColon-ms-backdrop`: `ColonColon-ms-backdrop` = "::-ms-backdrop".asInstanceOf[`ColonColon-ms-backdrop`]
  @scala.inline
  def `ColonColon-ms-browse`: `ColonColon-ms-browse` = "::-ms-browse".asInstanceOf[`ColonColon-ms-browse`]
  @scala.inline
  def `ColonColon-ms-check`: `ColonColon-ms-check` = "::-ms-check".asInstanceOf[`ColonColon-ms-check`]
  @scala.inline
  def `ColonColon-ms-clear`: `ColonColon-ms-clear` = "::-ms-clear".asInstanceOf[`ColonColon-ms-clear`]
  @scala.inline
  def `ColonColon-ms-fill`: `ColonColon-ms-fill` = "::-ms-fill".asInstanceOf[`ColonColon-ms-fill`]
  @scala.inline
  def `ColonColon-ms-fill-lower`: `ColonColon-ms-fill-lower` = "::-ms-fill-lower".asInstanceOf[`ColonColon-ms-fill-lower`]
  @scala.inline
  def `ColonColon-ms-fill-upper`: `ColonColon-ms-fill-upper` = "::-ms-fill-upper".asInstanceOf[`ColonColon-ms-fill-upper`]
  @scala.inline
  def `ColonColon-ms-input-placeholder`: `ColonColon-ms-input-placeholder` = "::-ms-input-placeholder".asInstanceOf[`ColonColon-ms-input-placeholder`]
  @scala.inline
  def `ColonColon-ms-reveal`: `ColonColon-ms-reveal` = "::-ms-reveal".asInstanceOf[`ColonColon-ms-reveal`]
  @scala.inline
  def `ColonColon-ms-thumb`: `ColonColon-ms-thumb` = "::-ms-thumb".asInstanceOf[`ColonColon-ms-thumb`]
  @scala.inline
  def `ColonColon-ms-ticks-after`: `ColonColon-ms-ticks-after` = "::-ms-ticks-after".asInstanceOf[`ColonColon-ms-ticks-after`]
  @scala.inline
  def `ColonColon-ms-ticks-before`: `ColonColon-ms-ticks-before` = "::-ms-ticks-before".asInstanceOf[`ColonColon-ms-ticks-before`]
  @scala.inline
  def `ColonColon-ms-tooltip`: `ColonColon-ms-tooltip` = "::-ms-tooltip".asInstanceOf[`ColonColon-ms-tooltip`]
  @scala.inline
  def `ColonColon-ms-track`: `ColonColon-ms-track` = "::-ms-track".asInstanceOf[`ColonColon-ms-track`]
  @scala.inline
  def `ColonColon-ms-value`: `ColonColon-ms-value` = "::-ms-value".asInstanceOf[`ColonColon-ms-value`]
  @scala.inline
  def `ColonColon-webkit-backdrop`: `ColonColon-webkit-backdrop` = "::-webkit-backdrop".asInstanceOf[`ColonColon-webkit-backdrop`]
  @scala.inline
  def `ColonColon-webkit-input-placeholder`: `ColonColon-webkit-input-placeholder` = "::-webkit-input-placeholder".asInstanceOf[`ColonColon-webkit-input-placeholder`]
  @scala.inline
  def `ColonColon-webkit-progress-bar`: `ColonColon-webkit-progress-bar` = "::-webkit-progress-bar".asInstanceOf[`ColonColon-webkit-progress-bar`]
  @scala.inline
  def `ColonColon-webkit-progress-inner-value`: `ColonColon-webkit-progress-inner-value` = "::-webkit-progress-inner-value".asInstanceOf[`ColonColon-webkit-progress-inner-value`]
  @scala.inline
  def `ColonColon-webkit-progress-value`: `ColonColon-webkit-progress-value` = "::-webkit-progress-value".asInstanceOf[`ColonColon-webkit-progress-value`]
  @scala.inline
  def `ColonColon-webkit-slider-runnable-track`: `ColonColon-webkit-slider-runnable-track` = "::-webkit-slider-runnable-track".asInstanceOf[`ColonColon-webkit-slider-runnable-track`]
  @scala.inline
  def `ColonColon-webkit-slider-thumb`: `ColonColon-webkit-slider-thumb` = "::-webkit-slider-thumb".asInstanceOf[`ColonColon-webkit-slider-thumb`]
  @scala.inline
  def ColonColonafter: ColonColonafter = "::after".asInstanceOf[ColonColonafter]
  @scala.inline
  def ColonColonbackdrop: ColonColonbackdrop = "::backdrop".asInstanceOf[ColonColonbackdrop]
  @scala.inline
  def ColonColonbefore: ColonColonbefore = "::before".asInstanceOf[ColonColonbefore]
  @scala.inline
  def ColonColoncue: ColonColoncue = "::cue".asInstanceOf[ColonColoncue]
  @scala.inline
  def `ColonColoncue-region`: `ColonColoncue-region` = "::cue-region".asInstanceOf[`ColonColoncue-region`]
  @scala.inline
  def `ColonColonfirst-letter`: `ColonColonfirst-letter` = "::first-letter".asInstanceOf[`ColonColonfirst-letter`]
  @scala.inline
  def `ColonColonfirst-line`: `ColonColonfirst-line` = "::first-line".asInstanceOf[`ColonColonfirst-line`]
  @scala.inline
  def `ColonColongrammar-error`: `ColonColongrammar-error` = "::grammar-error".asInstanceOf[`ColonColongrammar-error`]
  @scala.inline
  def ColonColonmarker: ColonColonmarker = "::marker".asInstanceOf[ColonColonmarker]
  @scala.inline
  def ColonColonpart: ColonColonpart = "::part".asInstanceOf[ColonColonpart]
  @scala.inline
  def ColonColonplaceholder: ColonColonplaceholder = "::placeholder".asInstanceOf[ColonColonplaceholder]
  @scala.inline
  def ColonColonselection: ColonColonselection = "::selection".asInstanceOf[ColonColonselection]
  @scala.inline
  def ColonColonslotted: ColonColonslotted = "::slotted".asInstanceOf[ColonColonslotted]
  @scala.inline
  def `ColonColonspelling-error`: `ColonColonspelling-error` = "::spelling-error".asInstanceOf[`ColonColonspelling-error`]
  @scala.inline
  def Colonactive: Colonactive = ":active".asInstanceOf[Colonactive]
  @scala.inline
  def Colonafter: Colonafter = ":after".asInstanceOf[Colonafter]
  @scala.inline
  def `Colonany-link`: `Colonany-link` = ":any-link".asInstanceOf[`Colonany-link`]
  @scala.inline
  def Colonbefore: Colonbefore = ":before".asInstanceOf[Colonbefore]
  @scala.inline
  def Colonblank: Colonblank = ":blank".asInstanceOf[Colonblank]
  @scala.inline
  def Colonchecked: Colonchecked = ":checked".asInstanceOf[Colonchecked]
  @scala.inline
  def Colondefault: Colondefault = ":default".asInstanceOf[Colondefault]
  @scala.inline
  def Colondefined: Colondefined = ":defined".asInstanceOf[Colondefined]
  @scala.inline
  def Colondir: Colondir = ":dir".asInstanceOf[Colondir]
  @scala.inline
  def Colondisabled: Colondisabled = ":disabled".asInstanceOf[Colondisabled]
  @scala.inline
  def Colonempty: Colonempty = ":empty".asInstanceOf[Colonempty]
  @scala.inline
  def Colonenabled: Colonenabled = ":enabled".asInstanceOf[Colonenabled]
  @scala.inline
  def Colonfirst: Colonfirst = ":first".asInstanceOf[Colonfirst]
  @scala.inline
  def `Colonfirst-child`: `Colonfirst-child` = ":first-child".asInstanceOf[`Colonfirst-child`]
  @scala.inline
  def `Colonfirst-letter`: `Colonfirst-letter` = ":first-letter".asInstanceOf[`Colonfirst-letter`]
  @scala.inline
  def `Colonfirst-line`: `Colonfirst-line` = ":first-line".asInstanceOf[`Colonfirst-line`]
  @scala.inline
  def `Colonfirst-of-type`: `Colonfirst-of-type` = ":first-of-type".asInstanceOf[`Colonfirst-of-type`]
  @scala.inline
  def Colonfocus: Colonfocus = ":focus".asInstanceOf[Colonfocus]
  @scala.inline
  def `Colonfocus-visible`: `Colonfocus-visible` = ":focus-visible".asInstanceOf[`Colonfocus-visible`]
  @scala.inline
  def `Colonfocus-within`: `Colonfocus-within` = ":focus-within".asInstanceOf[`Colonfocus-within`]
  @scala.inline
  def Colonfullscreen: Colonfullscreen = ":fullscreen".asInstanceOf[Colonfullscreen]
  @scala.inline
  def Colonhas: Colonhas = ":has".asInstanceOf[Colonhas]
  @scala.inline
  def Colonhost: Colonhost = ":host".asInstanceOf[Colonhost]
  @scala.inline
  def `Colonhost-context`: `Colonhost-context` = ":host-context".asInstanceOf[`Colonhost-context`]
  @scala.inline
  def Colonhover: Colonhover = ":hover".asInstanceOf[Colonhover]
  @scala.inline
  def `Colonin-range`: `Colonin-range` = ":in-range".asInstanceOf[`Colonin-range`]
  @scala.inline
  def Colonindeterminate: Colonindeterminate = ":indeterminate".asInstanceOf[Colonindeterminate]
  @scala.inline
  def Coloninvalid: Coloninvalid = ":invalid".asInstanceOf[Coloninvalid]
  @scala.inline
  def Colonis: Colonis = ":is".asInstanceOf[Colonis]
  @scala.inline
  def Colonlang: Colonlang = ":lang".asInstanceOf[Colonlang]
  @scala.inline
  def `Colonlast-child`: `Colonlast-child` = ":last-child".asInstanceOf[`Colonlast-child`]
  @scala.inline
  def `Colonlast-of-type`: `Colonlast-of-type` = ":last-of-type".asInstanceOf[`Colonlast-of-type`]
  @scala.inline
  def Colonleft: Colonleft = ":left".asInstanceOf[Colonleft]
  @scala.inline
  def Colonlink: Colonlink = ":link".asInstanceOf[Colonlink]
  @scala.inline
  def ColonmatchesLeftparenthesisRightparenthesis: ColonmatchesLeftparenthesisRightparenthesis = ":matches()".asInstanceOf[ColonmatchesLeftparenthesisRightparenthesis]
  @scala.inline
  def Colonnot: Colonnot = ":not".asInstanceOf[Colonnot]
  @scala.inline
  def `Colonnth-child`: `Colonnth-child` = ":nth-child".asInstanceOf[`Colonnth-child`]
  @scala.inline
  def `Colonnth-last-child`: `Colonnth-last-child` = ":nth-last-child".asInstanceOf[`Colonnth-last-child`]
  @scala.inline
  def `Colonnth-last-of-type`: `Colonnth-last-of-type` = ":nth-last-of-type".asInstanceOf[`Colonnth-last-of-type`]
  @scala.inline
  def `Colonnth-of-type`: `Colonnth-of-type` = ":nth-of-type".asInstanceOf[`Colonnth-of-type`]
  @scala.inline
  def `Colononly-child`: `Colononly-child` = ":only-child".asInstanceOf[`Colononly-child`]
  @scala.inline
  def `Colononly-of-type`: `Colononly-of-type` = ":only-of-type".asInstanceOf[`Colononly-of-type`]
  @scala.inline
  def Colonoptional: Colonoptional = ":optional".asInstanceOf[Colonoptional]
  @scala.inline
  def `Colonout-of-range`: `Colonout-of-range` = ":out-of-range".asInstanceOf[`Colonout-of-range`]
  @scala.inline
  def `Colonplaceholder-shown`: `Colonplaceholder-shown` = ":placeholder-shown".asInstanceOf[`Colonplaceholder-shown`]
  @scala.inline
  def `Colonread-only`: `Colonread-only` = ":read-only".asInstanceOf[`Colonread-only`]
  @scala.inline
  def `Colonread-write`: `Colonread-write` = ":read-write".asInstanceOf[`Colonread-write`]
  @scala.inline
  def Colonrequired: Colonrequired = ":required".asInstanceOf[Colonrequired]
  @scala.inline
  def Colonright: Colonright = ":right".asInstanceOf[Colonright]
  @scala.inline
  def Colonroot: Colonroot = ":root".asInstanceOf[Colonroot]
  @scala.inline
  def Colonscope: Colonscope = ":scope".asInstanceOf[Colonscope]
  @scala.inline
  def Colontarget: Colontarget = ":target".asInstanceOf[Colontarget]
  @scala.inline
  def Colonvalid: Colonvalid = ":valid".asInstanceOf[Colonvalid]
  @scala.inline
  def Colonvisited: Colonvisited = ":visited".asInstanceOf[Colonvisited]
  @scala.inline
  def Colonwhere: Colonwhere = ":where".asInstanceOf[Colonwhere]
  @scala.inline
  def GrayText: GrayText = "GrayText".asInstanceOf[GrayText]
  @scala.inline
  def Highlight: Highlight = "Highlight".asInstanceOf[Highlight]
  @scala.inline
  def HighlightText: HighlightText = "HighlightText".asInstanceOf[HighlightText]
  @scala.inline
  def InactiveBorder: InactiveBorder = "InactiveBorder".asInstanceOf[InactiveBorder]
  @scala.inline
  def InactiveCaption: InactiveCaption = "InactiveCaption".asInstanceOf[InactiveCaption]
  @scala.inline
  def InactiveCaptionText: InactiveCaptionText = "InactiveCaptionText".asInstanceOf[InactiveCaptionText]
  @scala.inline
  def InfoBackground: InfoBackground = "InfoBackground".asInstanceOf[InfoBackground]
  @scala.inline
  def InfoText: InfoText = "InfoText".asInstanceOf[InfoText]
  @scala.inline
  def Menu: Menu = "Menu".asInstanceOf[Menu]
  @scala.inline
  def MenuText: MenuText = "MenuText".asInstanceOf[MenuText]
  @scala.inline
  def Scrollbar: Scrollbar = "Scrollbar".asInstanceOf[Scrollbar]
  @scala.inline
  def ThreeDDarkShadow: ThreeDDarkShadow = "ThreeDDarkShadow".asInstanceOf[ThreeDDarkShadow]
  @scala.inline
  def ThreeDFace: ThreeDFace = "ThreeDFace".asInstanceOf[ThreeDFace]
  @scala.inline
  def ThreeDHighlight: ThreeDHighlight = "ThreeDHighlight".asInstanceOf[ThreeDHighlight]
  @scala.inline
  def ThreeDLightShadow: ThreeDLightShadow = "ThreeDLightShadow".asInstanceOf[ThreeDLightShadow]
  @scala.inline
  def ThreeDShadow: ThreeDShadow = "ThreeDShadow".asInstanceOf[ThreeDShadow]
  @scala.inline
  def Window: Window = "Window".asInstanceOf[Window]
  @scala.inline
  def WindowFrame: WindowFrame = "WindowFrame".asInstanceOf[WindowFrame]
  @scala.inline
  def WindowText: WindowText = "WindowText".asInstanceOf[WindowText]
  @scala.inline
  def `[-webkit-dropzone]`: `[-webkit-dropzone]` = "[-webkit-dropzone]".asInstanceOf[`[-webkit-dropzone]`]
  @scala.inline
  def `[abbr]`: `[abbr]` = "[abbr]".asInstanceOf[`[abbr]`]
  @scala.inline
  def `[accent-height]`: `[accent-height]` = "[accent-height]".asInstanceOf[`[accent-height]`]
  @scala.inline
  def `[accept-charset]`: `[accept-charset]` = "[accept-charset]".asInstanceOf[`[accept-charset]`]
  @scala.inline
  def `[accept]`: `[accept]` = "[accept]".asInstanceOf[`[accept]`]
  @scala.inline
  def `[accesskey]`: `[accesskey]` = "[accesskey]".asInstanceOf[`[accesskey]`]
  @scala.inline
  def `[action]`: `[action]` = "[action]".asInstanceOf[`[action]`]
  @scala.inline
  def `[align]`: `[align]` = "[align]".asInstanceOf[`[align]`]
  @scala.inline
  def `[alignment-baseline]`: `[alignment-baseline]` = "[alignment-baseline]".asInstanceOf[`[alignment-baseline]`]
  @scala.inline
  def `[alink]`: `[alink]` = "[alink]".asInstanceOf[`[alink]`]
  @scala.inline
  def `[allowReorder]`: `[allowReorder]` = "[allowReorder]".asInstanceOf[`[allowReorder]`]
  @scala.inline
  def `[allow]`: `[allow]` = "[allow]".asInstanceOf[`[allow]`]
  @scala.inline
  def `[allowfullscreen]`: `[allowfullscreen]` = "[allowfullscreen]".asInstanceOf[`[allowfullscreen]`]
  @scala.inline
  def `[allowpaymentrequest]`: `[allowpaymentrequest]` = "[allowpaymentrequest]".asInstanceOf[`[allowpaymentrequest]`]
  @scala.inline
  def `[alphabetic]`: `[alphabetic]` = "[alphabetic]".asInstanceOf[`[alphabetic]`]
  @scala.inline
  def `[alt]`: `[alt]` = "[alt]".asInstanceOf[`[alt]`]
  @scala.inline
  def `[animation]`: `[animation]` = "[animation]".asInstanceOf[`[animation]`]
  @scala.inline
  def `[arabic-form]`: `[arabic-form]` = "[arabic-form]".asInstanceOf[`[arabic-form]`]
  @scala.inline
  def `[archive]`: `[archive]` = "[archive]".asInstanceOf[`[archive]`]
  @scala.inline
  def `[ascent]`: `[ascent]` = "[ascent]".asInstanceOf[`[ascent]`]
  @scala.inline
  def `[async]`: `[async]` = "[async]".asInstanceOf[`[async]`]
  @scala.inline
  def `[attributeName]`: `[attributeName]` = "[attributeName]".asInstanceOf[`[attributeName]`]
  @scala.inline
  def `[attributeType]`: `[attributeType]` = "[attributeType]".asInstanceOf[`[attributeType]`]
  @scala.inline
  def `[autobuffer]`: `[autobuffer]` = "[autobuffer]".asInstanceOf[`[autobuffer]`]
  @scala.inline
  def `[autocapitalize]`: `[autocapitalize]` = "[autocapitalize]".asInstanceOf[`[autocapitalize]`]
  @scala.inline
  def `[autocomplete]`: `[autocomplete]` = "[autocomplete]".asInstanceOf[`[autocomplete]`]
  @scala.inline
  def `[autofocus]`: `[autofocus]` = "[autofocus]".asInstanceOf[`[autofocus]`]
  @scala.inline
  def `[autoplay]`: `[autoplay]` = "[autoplay]".asInstanceOf[`[autoplay]`]
  @scala.inline
  def `[axis]`: `[axis]` = "[axis]".asInstanceOf[`[axis]`]
  @scala.inline
  def `[azimuth]`: `[azimuth]` = "[azimuth]".asInstanceOf[`[azimuth]`]
  @scala.inline
  def `[background]`: `[background]` = "[background]".asInstanceOf[`[background]`]
  @scala.inline
  def `[baseFrequency]`: `[baseFrequency]` = "[baseFrequency]".asInstanceOf[`[baseFrequency]`]
  @scala.inline
  def `[baseProfile]`: `[baseProfile]` = "[baseProfile]".asInstanceOf[`[baseProfile]`]
  @scala.inline
  def `[baseline-shift]`: `[baseline-shift]` = "[baseline-shift]".asInstanceOf[`[baseline-shift]`]
  @scala.inline
  def `[bbox]`: `[bbox]` = "[bbox]".asInstanceOf[`[bbox]`]
  @scala.inline
  def `[begin]`: `[begin]` = "[begin]".asInstanceOf[`[begin]`]
  @scala.inline
  def `[behavior]`: `[behavior]` = "[behavior]".asInstanceOf[`[behavior]`]
  @scala.inline
  def `[bgcolor]`: `[bgcolor]` = "[bgcolor]".asInstanceOf[`[bgcolor]`]
  @scala.inline
  def `[bias]`: `[bias]` = "[bias]".asInstanceOf[`[bias]`]
  @scala.inline
  def `[border]`: `[border]` = "[border]".asInstanceOf[`[border]`]
  @scala.inline
  def `[bottommargin]`: `[bottommargin]` = "[bottommargin]".asInstanceOf[`[bottommargin]`]
  @scala.inline
  def `[buffered]`: `[buffered]` = "[buffered]".asInstanceOf[`[buffered]`]
  @scala.inline
  def `[by]`: `[by]` = "[by]".asInstanceOf[`[by]`]
  @scala.inline
  def `[calcMode]`: `[calcMode]` = "[calcMode]".asInstanceOf[`[calcMode]`]
  @scala.inline
  def `[cap-height]`: `[cap-height]` = "[cap-height]".asInstanceOf[`[cap-height]`]
  @scala.inline
  def `[cellpadding]`: `[cellpadding]` = "[cellpadding]".asInstanceOf[`[cellpadding]`]
  @scala.inline
  def `[cellspacing]`: `[cellspacing]` = "[cellspacing]".asInstanceOf[`[cellspacing]`]
  @scala.inline
  def `[char]`: `[char]` = "[char]".asInstanceOf[`[char]`]
  @scala.inline
  def `[charoff]`: `[charoff]` = "[charoff]".asInstanceOf[`[charoff]`]
  @scala.inline
  def `[charset]`: `[charset]` = "[charset]".asInstanceOf[`[charset]`]
  @scala.inline
  def `[checked]`: `[checked]` = "[checked]".asInstanceOf[`[checked]`]
  @scala.inline
  def `[cite]`: `[cite]` = "[cite]".asInstanceOf[`[cite]`]
  @scala.inline
  def `[class]`: `[class]` = "[class]".asInstanceOf[`[class]`]
  @scala.inline
  def `[classid]`: `[classid]` = "[classid]".asInstanceOf[`[classid]`]
  @scala.inline
  def `[clear]`: `[clear]` = "[clear]".asInstanceOf[`[clear]`]
  @scala.inline
  def `[clip-path]`: `[clip-path]` = "[clip-path]".asInstanceOf[`[clip-path]`]
  @scala.inline
  def `[clip-rule]`: `[clip-rule]` = "[clip-rule]".asInstanceOf[`[clip-rule]`]
  @scala.inline
  def `[clipPathUnits]`: `[clipPathUnits]` = "[clipPathUnits]".asInstanceOf[`[clipPathUnits]`]
  @scala.inline
  def `[clip]`: `[clip]` = "[clip]".asInstanceOf[`[clip]`]
  @scala.inline
  def `[code]`: `[code]` = "[code]".asInstanceOf[`[code]`]
  @scala.inline
  def `[codebase]`: `[codebase]` = "[codebase]".asInstanceOf[`[codebase]`]
  @scala.inline
  def `[codetype]`: `[codetype]` = "[codetype]".asInstanceOf[`[codetype]`]
  @scala.inline
  def `[color-interpolation-filters]`: `[color-interpolation-filters]` = "[color-interpolation-filters]".asInstanceOf[`[color-interpolation-filters]`]
  @scala.inline
  def `[color-interpolation]`: `[color-interpolation]` = "[color-interpolation]".asInstanceOf[`[color-interpolation]`]
  @scala.inline
  def `[color-profile]`: `[color-profile]` = "[color-profile]".asInstanceOf[`[color-profile]`]
  @scala.inline
  def `[color-rendering]`: `[color-rendering]` = "[color-rendering]".asInstanceOf[`[color-rendering]`]
  @scala.inline
  def `[color]`: `[color]` = "[color]".asInstanceOf[`[color]`]
  @scala.inline
  def `[cols]`: `[cols]` = "[cols]".asInstanceOf[`[cols]`]
  @scala.inline
  def `[colspan]`: `[colspan]` = "[colspan]".asInstanceOf[`[colspan]`]
  @scala.inline
  def `[command]`: `[command]` = "[command]".asInstanceOf[`[command]`]
  @scala.inline
  def `[compact]`: `[compact]` = "[compact]".asInstanceOf[`[compact]`]
  @scala.inline
  def `[contentScriptType]`: `[contentScriptType]` = "[contentScriptType]".asInstanceOf[`[contentScriptType]`]
  @scala.inline
  def `[contentStyleType]`: `[contentStyleType]` = "[contentStyleType]".asInstanceOf[`[contentStyleType]`]
  @scala.inline
  def `[content]`: `[content]` = "[content]".asInstanceOf[`[content]`]
  @scala.inline
  def `[contenteditable]`: `[contenteditable]` = "[contenteditable]".asInstanceOf[`[contenteditable]`]
  @scala.inline
  def `[contextmenu]`: `[contextmenu]` = "[contextmenu]".asInstanceOf[`[contextmenu]`]
  @scala.inline
  def `[controls]`: `[controls]` = "[controls]".asInstanceOf[`[controls]`]
  @scala.inline
  def `[coords]`: `[coords]` = "[coords]".asInstanceOf[`[coords]`]
  @scala.inline
  def `[crossorigin]`: `[crossorigin]` = "[crossorigin]".asInstanceOf[`[crossorigin]`]
  @scala.inline
  def `[cursor]`: `[cursor]` = "[cursor]".asInstanceOf[`[cursor]`]
  @scala.inline
  def `[cx]`: `[cx]` = "[cx]".asInstanceOf[`[cx]`]
  @scala.inline
  def `[cy]`: `[cy]` = "[cy]".asInstanceOf[`[cy]`]
  @scala.inline
  def `[d]`: `[d]` = "[d]".asInstanceOf[`[d]`]
  @scala.inline
  def `[data]`: `[data]` = "[data]".asInstanceOf[`[data]`]
  @scala.inline
  def `[datafld]`: `[datafld]` = "[datafld]".asInstanceOf[`[datafld]`]
  @scala.inline
  def `[datasrc]`: `[datasrc]` = "[datasrc]".asInstanceOf[`[datasrc]`]
  @scala.inline
  def `[datetime]`: `[datetime]` = "[datetime]".asInstanceOf[`[datetime]`]
  @scala.inline
  def `[declare]`: `[declare]` = "[declare]".asInstanceOf[`[declare]`]
  @scala.inline
  def `[decoding]`: `[decoding]` = "[decoding]".asInstanceOf[`[decoding]`]
  @scala.inline
  def `[default]`: `[default]` = "[default]".asInstanceOf[`[default]`]
  @scala.inline
  def `[defer]`: `[defer]` = "[defer]".asInstanceOf[`[defer]`]
  @scala.inline
  def `[descent]`: `[descent]` = "[descent]".asInstanceOf[`[descent]`]
  @scala.inline
  def `[diffuseConstant]`: `[diffuseConstant]` = "[diffuseConstant]".asInstanceOf[`[diffuseConstant]`]
  @scala.inline
  def `[dir]`: `[dir]` = "[dir]".asInstanceOf[`[dir]`]
  @scala.inline
  def `[direction]`: `[direction]` = "[direction]".asInstanceOf[`[direction]`]
  @scala.inline
  def `[disabled]`: `[disabled]` = "[disabled]".asInstanceOf[`[disabled]`]
  @scala.inline
  def `[display]`: `[display]` = "[display]".asInstanceOf[`[display]`]
  @scala.inline
  def `[divisor]`: `[divisor]` = "[divisor]".asInstanceOf[`[divisor]`]
  @scala.inline
  def `[document]`: `[document]` = "[document]".asInstanceOf[`[document]`]
  @scala.inline
  def `[dominant-baseline]`: `[dominant-baseline]` = "[dominant-baseline]".asInstanceOf[`[dominant-baseline]`]
  @scala.inline
  def `[download]`: `[download]` = "[download]".asInstanceOf[`[download]`]
  @scala.inline
  def `[draggable]`: `[draggable]` = "[draggable]".asInstanceOf[`[draggable]`]
  @scala.inline
  def `[dropzone]`: `[dropzone]` = "[dropzone]".asInstanceOf[`[dropzone]`]
  @scala.inline
  def `[dur]`: `[dur]` = "[dur]".asInstanceOf[`[dur]`]
  @scala.inline
  def `[dx]`: `[dx]` = "[dx]".asInstanceOf[`[dx]`]
  @scala.inline
  def `[dy]`: `[dy]` = "[dy]".asInstanceOf[`[dy]`]
  @scala.inline
  def `[edgeMode]`: `[edgeMode]` = "[edgeMode]".asInstanceOf[`[edgeMode]`]
  @scala.inline
  def `[elevation]`: `[elevation]` = "[elevation]".asInstanceOf[`[elevation]`]
  @scala.inline
  def `[enable-background]`: `[enable-background]` = "[enable-background]".asInstanceOf[`[enable-background]`]
  @scala.inline
  def `[enctype]`: `[enctype]` = "[enctype]".asInstanceOf[`[enctype]`]
  @scala.inline
  def `[enterkeyhint]`: `[enterkeyhint]` = "[enterkeyhint]".asInstanceOf[`[enterkeyhint]`]
  @scala.inline
  def `[exportparts]`: `[exportparts]` = "[exportparts]".asInstanceOf[`[exportparts]`]
  @scala.inline
  def `[externalResourcesRequired]`: `[externalResourcesRequired]` = "[externalResourcesRequired]".asInstanceOf[`[externalResourcesRequired]`]
  @scala.inline
  def `[face]`: `[face]` = "[face]".asInstanceOf[`[face]`]
  @scala.inline
  def `[fill-opacity]`: `[fill-opacity]` = "[fill-opacity]".asInstanceOf[`[fill-opacity]`]
  @scala.inline
  def `[fill-rule]`: `[fill-rule]` = "[fill-rule]".asInstanceOf[`[fill-rule]`]
  @scala.inline
  def `[fill]`: `[fill]` = "[fill]".asInstanceOf[`[fill]`]
  @scala.inline
  def `[filterRes]`: `[filterRes]` = "[filterRes]".asInstanceOf[`[filterRes]`]
  @scala.inline
  def `[filterUnits]`: `[filterUnits]` = "[filterUnits]".asInstanceOf[`[filterUnits]`]
  @scala.inline
  def `[filter]`: `[filter]` = "[filter]".asInstanceOf[`[filter]`]
  @scala.inline
  def `[flood-color]`: `[flood-color]` = "[flood-color]".asInstanceOf[`[flood-color]`]
  @scala.inline
  def `[flood-opacity]`: `[flood-opacity]` = "[flood-opacity]".asInstanceOf[`[flood-opacity]`]
  @scala.inline
  def `[font-family]`: `[font-family]` = "[font-family]".asInstanceOf[`[font-family]`]
  @scala.inline
  def `[font-size-adjust]`: `[font-size-adjust]` = "[font-size-adjust]".asInstanceOf[`[font-size-adjust]`]
  @scala.inline
  def `[font-size]`: `[font-size]` = "[font-size]".asInstanceOf[`[font-size]`]
  @scala.inline
  def `[font-stretch]`: `[font-stretch]` = "[font-stretch]".asInstanceOf[`[font-stretch]`]
  @scala.inline
  def `[font-style]`: `[font-style]` = "[font-style]".asInstanceOf[`[font-style]`]
  @scala.inline
  def `[font-variant]`: `[font-variant]` = "[font-variant]".asInstanceOf[`[font-variant]`]
  @scala.inline
  def `[font-weight]`: `[font-weight]` = "[font-weight]".asInstanceOf[`[font-weight]`]
  @scala.inline
  def `[for]`: `[for]` = "[for]".asInstanceOf[`[for]`]
  @scala.inline
  def `[form]`: `[form]` = "[form]".asInstanceOf[`[form]`]
  @scala.inline
  def `[formaction]`: `[formaction]` = "[formaction]".asInstanceOf[`[formaction]`]
  @scala.inline
  def `[format]`: `[format]` = "[format]".asInstanceOf[`[format]`]
  @scala.inline
  def `[formenctype]`: `[formenctype]` = "[formenctype]".asInstanceOf[`[formenctype]`]
  @scala.inline
  def `[formmethod]`: `[formmethod]` = "[formmethod]".asInstanceOf[`[formmethod]`]
  @scala.inline
  def `[formnovalidate]`: `[formnovalidate]` = "[formnovalidate]".asInstanceOf[`[formnovalidate]`]
  @scala.inline
  def `[formtarget]`: `[formtarget]` = "[formtarget]".asInstanceOf[`[formtarget]`]
  @scala.inline
  def `[fr]`: `[fr]` = "[fr]".asInstanceOf[`[fr]`]
  @scala.inline
  def `[frame]`: `[frame]` = "[frame]".asInstanceOf[`[frame]`]
  @scala.inline
  def `[frameborder]`: `[frameborder]` = "[frameborder]".asInstanceOf[`[frameborder]`]
  @scala.inline
  def `[from]`: `[from]` = "[from]".asInstanceOf[`[from]`]
  @scala.inline
  def `[fx]`: `[fx]` = "[fx]".asInstanceOf[`[fx]`]
  @scala.inline
  def `[fy]`: `[fy]` = "[fy]".asInstanceOf[`[fy]`]
  @scala.inline
  def `[g1]`: `[g1]` = "[g1]".asInstanceOf[`[g1]`]
  @scala.inline
  def `[g2]`: `[g2]` = "[g2]".asInstanceOf[`[g2]`]
  @scala.inline
  def `[global]`: `[global]` = "[global]".asInstanceOf[`[global]`]
  @scala.inline
  def `[glyph-name]`: `[glyph-name]` = "[glyph-name]".asInstanceOf[`[glyph-name]`]
  @scala.inline
  def `[glyph-orientation-horizontal]`: `[glyph-orientation-horizontal]` = "[glyph-orientation-horizontal]".asInstanceOf[`[glyph-orientation-horizontal]`]
  @scala.inline
  def `[glyph-orientation-vertical]`: `[glyph-orientation-vertical]` = "[glyph-orientation-vertical]".asInstanceOf[`[glyph-orientation-vertical]`]
  @scala.inline
  def `[glyphRef]`: `[glyphRef]` = "[glyphRef]".asInstanceOf[`[glyphRef]`]
  @scala.inline
  def `[gradientTransform]`: `[gradientTransform]` = "[gradientTransform]".asInstanceOf[`[gradientTransform]`]
  @scala.inline
  def `[gradientUnits]`: `[gradientUnits]` = "[gradientUnits]".asInstanceOf[`[gradientUnits]`]
  @scala.inline
  def `[graphical]`: `[graphical]` = "[graphical]".asInstanceOf[`[graphical]`]
  @scala.inline
  def `[hanging]`: `[hanging]` = "[hanging]".asInstanceOf[`[hanging]`]
  @scala.inline
  def `[hatchContentUnits]`: `[hatchContentUnits]` = "[hatchContentUnits]".asInstanceOf[`[hatchContentUnits]`]
  @scala.inline
  def `[hatchUnits]`: `[hatchUnits]` = "[hatchUnits]".asInstanceOf[`[hatchUnits]`]
  @scala.inline
  def `[headers]`: `[headers]` = "[headers]".asInstanceOf[`[headers]`]
  @scala.inline
  def `[height]`: `[height]` = "[height]".asInstanceOf[`[height]`]
  @scala.inline
  def `[hidden]`: `[hidden]` = "[hidden]".asInstanceOf[`[hidden]`]
  @scala.inline
  def `[high]`: `[high]` = "[high]".asInstanceOf[`[high]`]
  @scala.inline
  def `[horiz-adv-x]`: `[horiz-adv-x]` = "[horiz-adv-x]".asInstanceOf[`[horiz-adv-x]`]
  @scala.inline
  def `[horiz-origin-x]`: `[horiz-origin-x]` = "[horiz-origin-x]".asInstanceOf[`[horiz-origin-x]`]
  @scala.inline
  def `[horiz-origin-y]`: `[horiz-origin-y]` = "[horiz-origin-y]".asInstanceOf[`[horiz-origin-y]`]
  @scala.inline
  def `[href]`: `[href]` = "[href]".asInstanceOf[`[href]`]
  @scala.inline
  def `[hreflang]`: `[hreflang]` = "[hreflang]".asInstanceOf[`[hreflang]`]
  @scala.inline
  def `[hspace]`: `[hspace]` = "[hspace]".asInstanceOf[`[hspace]`]
  @scala.inline
  def `[http-equiv]`: `[http-equiv]` = "[http-equiv]".asInstanceOf[`[http-equiv]`]
  @scala.inline
  def `[icon]`: `[icon]` = "[icon]".asInstanceOf[`[icon]`]
  @scala.inline
  def `[id]`: `[id]` = "[id]".asInstanceOf[`[id]`]
  @scala.inline
  def `[ideographic]`: `[ideographic]` = "[ideographic]".asInstanceOf[`[ideographic]`]
  @scala.inline
  def `[image-rendering]`: `[image-rendering]` = "[image-rendering]".asInstanceOf[`[image-rendering]`]
  @scala.inline
  def `[in2]`: `[in2]` = "[in2]".asInstanceOf[`[in2]`]
  @scala.inline
  def `[in]`: `[in]` = "[in]".asInstanceOf[`[in]`]
  @scala.inline
  def `[inputmode]`: `[inputmode]` = "[inputmode]".asInstanceOf[`[inputmode]`]
  @scala.inline
  def `[integrity]`: `[integrity]` = "[integrity]".asInstanceOf[`[integrity]`]
  @scala.inline
  def `[intrinsicsize]`: `[intrinsicsize]` = "[intrinsicsize]".asInstanceOf[`[intrinsicsize]`]
  @scala.inline
  def `[is]`: `[is]` = "[is]".asInstanceOf[`[is]`]
  @scala.inline
  def `[ismap]`: `[ismap]` = "[ismap]".asInstanceOf[`[ismap]`]
  @scala.inline
  def `[itemid]`: `[itemid]` = "[itemid]".asInstanceOf[`[itemid]`]
  @scala.inline
  def `[itemprop]`: `[itemprop]` = "[itemprop]".asInstanceOf[`[itemprop]`]
  @scala.inline
  def `[itemref]`: `[itemref]` = "[itemref]".asInstanceOf[`[itemref]`]
  @scala.inline
  def `[itemscope]`: `[itemscope]` = "[itemscope]".asInstanceOf[`[itemscope]`]
  @scala.inline
  def `[itemtype]`: `[itemtype]` = "[itemtype]".asInstanceOf[`[itemtype]`]
  @scala.inline
  def `[k1]`: `[k1]` = "[k1]".asInstanceOf[`[k1]`]
  @scala.inline
  def `[k2]`: `[k2]` = "[k2]".asInstanceOf[`[k2]`]
  @scala.inline
  def `[k3]`: `[k3]` = "[k3]".asInstanceOf[`[k3]`]
  @scala.inline
  def `[k4]`: `[k4]` = "[k4]".asInstanceOf[`[k4]`]
  @scala.inline
  def `[k]`: `[k]` = "[k]".asInstanceOf[`[k]`]
  @scala.inline
  def `[kernelMatrix]`: `[kernelMatrix]` = "[kernelMatrix]".asInstanceOf[`[kernelMatrix]`]
  @scala.inline
  def `[kernelUnitLength]`: `[kernelUnitLength]` = "[kernelUnitLength]".asInstanceOf[`[kernelUnitLength]`]
  @scala.inline
  def `[kerning]`: `[kerning]` = "[kerning]".asInstanceOf[`[kerning]`]
  @scala.inline
  def `[keyPoints]`: `[keyPoints]` = "[keyPoints]".asInstanceOf[`[keyPoints]`]
  @scala.inline
  def `[kind]`: `[kind]` = "[kind]".asInstanceOf[`[kind]`]
  @scala.inline
  def `[label]`: `[label]` = "[label]".asInstanceOf[`[label]`]
  @scala.inline
  def `[lang]`: `[lang]` = "[lang]".asInstanceOf[`[lang]`]
  @scala.inline
  def `[language]`: `[language]` = "[language]".asInstanceOf[`[language]`]
  @scala.inline
  def `[leftmargin]`: `[leftmargin]` = "[leftmargin]".asInstanceOf[`[leftmargin]`]
  @scala.inline
  def `[lengthAdjust]`: `[lengthAdjust]` = "[lengthAdjust]".asInstanceOf[`[lengthAdjust]`]
  @scala.inline
  def `[letter-spacing]`: `[letter-spacing]` = "[letter-spacing]".asInstanceOf[`[letter-spacing]`]
  @scala.inline
  def `[lighterForError]`: `[lighterForError]` = "[lighterForError]".asInstanceOf[`[lighterForError]`]
  @scala.inline
  def `[lighting-color]`: `[lighting-color]` = "[lighting-color]".asInstanceOf[`[lighting-color]`]
  @scala.inline
  def `[limitingConeAngle]`: `[limitingConeAngle]` = "[limitingConeAngle]".asInstanceOf[`[limitingConeAngle]`]
  @scala.inline
  def `[link]`: `[link]` = "[link]".asInstanceOf[`[link]`]
  @scala.inline
  def `[loading]`: `[loading]` = "[loading]".asInstanceOf[`[loading]`]
  @scala.inline
  def `[local]`: `[local]` = "[local]".asInstanceOf[`[local]`]
  @scala.inline
  def `[longdesc]`: `[longdesc]` = "[longdesc]".asInstanceOf[`[longdesc]`]
  @scala.inline
  def `[loop]`: `[loop]` = "[loop]".asInstanceOf[`[loop]`]
  @scala.inline
  def `[low]`: `[low]` = "[low]".asInstanceOf[`[low]`]
  @scala.inline
  def `[manifest]`: `[manifest]` = "[manifest]".asInstanceOf[`[manifest]`]
  @scala.inline
  def `[marginheight]`: `[marginheight]` = "[marginheight]".asInstanceOf[`[marginheight]`]
  @scala.inline
  def `[marginwidth]`: `[marginwidth]` = "[marginwidth]".asInstanceOf[`[marginwidth]`]
  @scala.inline
  def `[marker-end]`: `[marker-end]` = "[marker-end]".asInstanceOf[`[marker-end]`]
  @scala.inline
  def `[marker-mid]`: `[marker-mid]` = "[marker-mid]".asInstanceOf[`[marker-mid]`]
  @scala.inline
  def `[marker-start]`: `[marker-start]` = "[marker-start]".asInstanceOf[`[marker-start]`]
  @scala.inline
  def `[markerHeight]`: `[markerHeight]` = "[markerHeight]".asInstanceOf[`[markerHeight]`]
  @scala.inline
  def `[markerUnits]`: `[markerUnits]` = "[markerUnits]".asInstanceOf[`[markerUnits]`]
  @scala.inline
  def `[markerWidth]`: `[markerWidth]` = "[markerWidth]".asInstanceOf[`[markerWidth]`]
  @scala.inline
  def `[maskContentUnits]`: `[maskContentUnits]` = "[maskContentUnits]".asInstanceOf[`[maskContentUnits]`]
  @scala.inline
  def `[maskUnits]`: `[maskUnits]` = "[maskUnits]".asInstanceOf[`[maskUnits]`]
  @scala.inline
  def `[mask]`: `[mask]` = "[mask]".asInstanceOf[`[mask]`]
  @scala.inline
  def `[mathematical]`: `[mathematical]` = "[mathematical]".asInstanceOf[`[mathematical]`]
  @scala.inline
  def `[max]`: `[max]` = "[max]".asInstanceOf[`[max]`]
  @scala.inline
  def `[maxlength]`: `[maxlength]` = "[maxlength]".asInstanceOf[`[maxlength]`]
  @scala.inline
  def `[mayscript]`: `[mayscript]` = "[mayscript]".asInstanceOf[`[mayscript]`]
  @scala.inline
  def `[media]`: `[media]` = "[media]".asInstanceOf[`[media]`]
  @scala.inline
  def `[method]`: `[method]` = "[method]".asInstanceOf[`[method]`]
  @scala.inline
  def `[methods]`: `[methods]` = "[methods]".asInstanceOf[`[methods]`]
  @scala.inline
  def `[min]`: `[min]` = "[min]".asInstanceOf[`[min]`]
  @scala.inline
  def `[minlength]`: `[minlength]` = "[minlength]".asInstanceOf[`[minlength]`]
  @scala.inline
  def `[mode]`: `[mode]` = "[mode]".asInstanceOf[`[mode]`]
  @scala.inline
  def `[moz-opaque]`: `[moz-opaque]` = "[moz-opaque]".asInstanceOf[`[moz-opaque]`]
  @scala.inline
  def `[mozallowfullscreen]`: `[mozallowfullscreen]` = "[mozallowfullscreen]".asInstanceOf[`[mozallowfullscreen]`]
  @scala.inline
  def `[mozcurrentsampleoffset]`: `[mozcurrentsampleoffset]` = "[mozcurrentsampleoffset]".asInstanceOf[`[mozcurrentsampleoffset]`]
  @scala.inline
  def `[msallowfullscreen]`: `[msallowfullscreen]` = "[msallowfullscreen]".asInstanceOf[`[msallowfullscreen]`]
  @scala.inline
  def `[multiple]`: `[multiple]` = "[multiple]".asInstanceOf[`[multiple]`]
  @scala.inline
  def `[muted]`: `[muted]` = "[muted]".asInstanceOf[`[muted]`]
  @scala.inline
  def `[name]`: `[name]` = "[name]".asInstanceOf[`[name]`]
  @scala.inline
  def `[nohref]`: `[nohref]` = "[nohref]".asInstanceOf[`[nohref]`]
  @scala.inline
  def `[nomodule]`: `[nomodule]` = "[nomodule]".asInstanceOf[`[nomodule]`]
  @scala.inline
  def `[noresize]`: `[noresize]` = "[noresize]".asInstanceOf[`[noresize]`]
  @scala.inline
  def `[noshade]`: `[noshade]` = "[noshade]".asInstanceOf[`[noshade]`]
  @scala.inline
  def `[novalidate]`: `[novalidate]` = "[novalidate]".asInstanceOf[`[novalidate]`]
  @scala.inline
  def `[nowrap]`: `[nowrap]` = "[nowrap]".asInstanceOf[`[nowrap]`]
  @scala.inline
  def `[numOctaves]`: `[numOctaves]` = "[numOctaves]".asInstanceOf[`[numOctaves]`]
  @scala.inline
  def `[object]`: `[object]` = "[object]".asInstanceOf[`[object]`]
  @scala.inline
  def `[offset]`: `[offset]` = "[offset]".asInstanceOf[`[offset]`]
  @scala.inline
  def `[onafterprint]`: `[onafterprint]` = "[onafterprint]".asInstanceOf[`[onafterprint]`]
  @scala.inline
  def `[onbeforeprint]`: `[onbeforeprint]` = "[onbeforeprint]".asInstanceOf[`[onbeforeprint]`]
  @scala.inline
  def `[onbeforeunload]`: `[onbeforeunload]` = "[onbeforeunload]".asInstanceOf[`[onbeforeunload]`]
  @scala.inline
  def `[onblur]`: `[onblur]` = "[onblur]".asInstanceOf[`[onblur]`]
  @scala.inline
  def `[onerror]`: `[onerror]` = "[onerror]".asInstanceOf[`[onerror]`]
  @scala.inline
  def `[onfocus]`: `[onfocus]` = "[onfocus]".asInstanceOf[`[onfocus]`]
  @scala.inline
  def `[onhashchange]`: `[onhashchange]` = "[onhashchange]".asInstanceOf[`[onhashchange]`]
  @scala.inline
  def `[onlanguagechange]`: `[onlanguagechange]` = "[onlanguagechange]".asInstanceOf[`[onlanguagechange]`]
  @scala.inline
  def `[onload]`: `[onload]` = "[onload]".asInstanceOf[`[onload]`]
  @scala.inline
  def `[onmessage]`: `[onmessage]` = "[onmessage]".asInstanceOf[`[onmessage]`]
  @scala.inline
  def `[onoffline]`: `[onoffline]` = "[onoffline]".asInstanceOf[`[onoffline]`]
  @scala.inline
  def `[ononline]`: `[ononline]` = "[ononline]".asInstanceOf[`[ononline]`]
  @scala.inline
  def `[onpopstate]`: `[onpopstate]` = "[onpopstate]".asInstanceOf[`[onpopstate]`]
  @scala.inline
  def `[onredo]`: `[onredo]` = "[onredo]".asInstanceOf[`[onredo]`]
  @scala.inline
  def `[onresize]`: `[onresize]` = "[onresize]".asInstanceOf[`[onresize]`]
  @scala.inline
  def `[onstorage]`: `[onstorage]` = "[onstorage]".asInstanceOf[`[onstorage]`]
  @scala.inline
  def `[onundo]`: `[onundo]` = "[onundo]".asInstanceOf[`[onundo]`]
  @scala.inline
  def `[onunload]`: `[onunload]` = "[onunload]".asInstanceOf[`[onunload]`]
  @scala.inline
  def `[opacity]`: `[opacity]` = "[opacity]".asInstanceOf[`[opacity]`]
  @scala.inline
  def `[open]`: `[open]` = "[open]".asInstanceOf[`[open]`]
  @scala.inline
  def `[operator]`: `[operator]` = "[operator]".asInstanceOf[`[operator]`]
  @scala.inline
  def `[optimum]`: `[optimum]` = "[optimum]".asInstanceOf[`[optimum]`]
  @scala.inline
  def `[order]`: `[order]` = "[order]".asInstanceOf[`[order]`]
  @scala.inline
  def `[orient]`: `[orient]` = "[orient]".asInstanceOf[`[orient]`]
  @scala.inline
  def `[orientation]`: `[orientation]` = "[orientation]".asInstanceOf[`[orientation]`]
  @scala.inline
  def `[origin]`: `[origin]` = "[origin]".asInstanceOf[`[origin]`]
  @scala.inline
  def `[overflow]`: `[overflow]` = "[overflow]".asInstanceOf[`[overflow]`]
  @scala.inline
  def `[overline-position]`: `[overline-position]` = "[overline-position]".asInstanceOf[`[overline-position]`]
  @scala.inline
  def `[overline-thickness]`: `[overline-thickness]` = "[overline-thickness]".asInstanceOf[`[overline-thickness]`]
  @scala.inline
  def `[paint-order]`: `[paint-order]` = "[paint-order]".asInstanceOf[`[paint-order]`]
  @scala.inline
  def `[panose-1]`: `[panose-1]` = "[panose-1]".asInstanceOf[`[panose-1]`]
  @scala.inline
  def `[part]`: `[part]` = "[part]".asInstanceOf[`[part]`]
  @scala.inline
  def `[path]`: `[path]` = "[path]".asInstanceOf[`[path]`]
  @scala.inline
  def `[patternContentUnits]`: `[patternContentUnits]` = "[patternContentUnits]".asInstanceOf[`[patternContentUnits]`]
  @scala.inline
  def `[patternTransform]`: `[patternTransform]` = "[patternTransform]".asInstanceOf[`[patternTransform]`]
  @scala.inline
  def `[patternUnits]`: `[patternUnits]` = "[patternUnits]".asInstanceOf[`[patternUnits]`]
  @scala.inline
  def `[ping]`: `[ping]` = "[ping]".asInstanceOf[`[ping]`]
  @scala.inline
  def `[pitch]`: `[pitch]` = "[pitch]".asInstanceOf[`[pitch]`]
  @scala.inline
  def `[placeholder]`: `[placeholder]` = "[placeholder]".asInstanceOf[`[placeholder]`]
  @scala.inline
  def `[played]`: `[played]` = "[played]".asInstanceOf[`[played]`]
  @scala.inline
  def `[pointer-events]`: `[pointer-events]` = "[pointer-events]".asInstanceOf[`[pointer-events]`]
  @scala.inline
  def `[pointsAtX]`: `[pointsAtX]` = "[pointsAtX]".asInstanceOf[`[pointsAtX]`]
  @scala.inline
  def `[pointsAtY]`: `[pointsAtY]` = "[pointsAtY]".asInstanceOf[`[pointsAtY]`]
  @scala.inline
  def `[pointsAtZ]`: `[pointsAtZ]` = "[pointsAtZ]".asInstanceOf[`[pointsAtZ]`]
  @scala.inline
  def `[points]`: `[points]` = "[points]".asInstanceOf[`[points]`]
  @scala.inline
  def `[poster]`: `[poster]` = "[poster]".asInstanceOf[`[poster]`]
  @scala.inline
  def `[prefetch]`: `[prefetch]` = "[prefetch]".asInstanceOf[`[prefetch]`]
  @scala.inline
  def `[preload]`: `[preload]` = "[preload]".asInstanceOf[`[preload]`]
  @scala.inline
  def `[preserveAlpha]`: `[preserveAlpha]` = "[preserveAlpha]".asInstanceOf[`[preserveAlpha]`]
  @scala.inline
  def `[preserveAspectRatio]`: `[preserveAspectRatio]` = "[preserveAspectRatio]".asInstanceOf[`[preserveAspectRatio]`]
  @scala.inline
  def `[primitiveUnits]`: `[primitiveUnits]` = "[primitiveUnits]".asInstanceOf[`[primitiveUnits]`]
  @scala.inline
  def `[profile]`: `[profile]` = "[profile]".asInstanceOf[`[profile]`]
  @scala.inline
  def `[prompt]`: `[prompt]` = "[prompt]".asInstanceOf[`[prompt]`]
  @scala.inline
  def `[r]`: `[r]` = "[r]".asInstanceOf[`[r]`]
  @scala.inline
  def `[radiogroup]`: `[radiogroup]` = "[radiogroup]".asInstanceOf[`[radiogroup]`]
  @scala.inline
  def `[radius]`: `[radius]` = "[radius]".asInstanceOf[`[radius]`]
  @scala.inline
  def `[readonly]`: `[readonly]` = "[readonly]".asInstanceOf[`[readonly]`]
  @scala.inline
  def `[refX]`: `[refX]` = "[refX]".asInstanceOf[`[refX]`]
  @scala.inline
  def `[refY]`: `[refY]` = "[refY]".asInstanceOf[`[refY]`]
  @scala.inline
  def `[referrerPolicy]`: `[referrerPolicy]` = "[referrerPolicy]".asInstanceOf[`[referrerPolicy]`]
  @scala.inline
  def `[referrerpolicy]_`: `[referrerpolicy]_` = "[referrerpolicy]".asInstanceOf[`[referrerpolicy]_`]
  @scala.inline
  def `[rel]`: `[rel]` = "[rel]".asInstanceOf[`[rel]`]
  @scala.inline
  def `[rendering-intent]`: `[rendering-intent]` = "[rendering-intent]".asInstanceOf[`[rendering-intent]`]
  @scala.inline
  def `[repeatCount]`: `[repeatCount]` = "[repeatCount]".asInstanceOf[`[repeatCount]`]
  @scala.inline
  def `[requiredExtensions]`: `[requiredExtensions]` = "[requiredExtensions]".asInstanceOf[`[requiredExtensions]`]
  @scala.inline
  def `[requiredFeatures]`: `[requiredFeatures]` = "[requiredFeatures]".asInstanceOf[`[requiredFeatures]`]
  @scala.inline
  def `[required]`: `[required]` = "[required]".asInstanceOf[`[required]`]
  @scala.inline
  def `[rev]`: `[rev]` = "[rev]".asInstanceOf[`[rev]`]
  @scala.inline
  def `[reversed]`: `[reversed]` = "[reversed]".asInstanceOf[`[reversed]`]
  @scala.inline
  def `[rightmargin]`: `[rightmargin]` = "[rightmargin]".asInstanceOf[`[rightmargin]`]
  @scala.inline
  def `[rotate]`: `[rotate]` = "[rotate]".asInstanceOf[`[rotate]`]
  @scala.inline
  def `[rows]`: `[rows]` = "[rows]".asInstanceOf[`[rows]`]
  @scala.inline
  def `[rowspan]`: `[rowspan]` = "[rowspan]".asInstanceOf[`[rowspan]`]
  @scala.inline
  def `[rules]`: `[rules]` = "[rules]".asInstanceOf[`[rules]`]
  @scala.inline
  def `[rx]`: `[rx]` = "[rx]".asInstanceOf[`[rx]`]
  @scala.inline
  def `[ry]`: `[ry]` = "[ry]".asInstanceOf[`[ry]`]
  @scala.inline
  def `[sandbox-allow-modals]`: `[sandbox-allow-modals]` = "[sandbox-allow-modals]".asInstanceOf[`[sandbox-allow-modals]`]
  @scala.inline
  def `[sandbox-allow-popups-to-escape-sandbox]`: `[sandbox-allow-popups-to-escape-sandbox]` = "[sandbox-allow-popups-to-escape-sandbox]".asInstanceOf[`[sandbox-allow-popups-to-escape-sandbox]`]
  @scala.inline
  def `[sandbox-allow-popups]`: `[sandbox-allow-popups]` = "[sandbox-allow-popups]".asInstanceOf[`[sandbox-allow-popups]`]
  @scala.inline
  def `[sandbox-allow-presentation]`: `[sandbox-allow-presentation]` = "[sandbox-allow-presentation]".asInstanceOf[`[sandbox-allow-presentation]`]
  @scala.inline
  def `[sandbox-allow-storage-access-by-user-activation]`: `[sandbox-allow-storage-access-by-user-activation]` = "[sandbox-allow-storage-access-by-user-activation]".asInstanceOf[`[sandbox-allow-storage-access-by-user-activation]`]
  @scala.inline
  def `[sandbox-allow-top-navigation-by-user-activation]`: `[sandbox-allow-top-navigation-by-user-activation]` = "[sandbox-allow-top-navigation-by-user-activation]".asInstanceOf[`[sandbox-allow-top-navigation-by-user-activation]`]
  @scala.inline
  def `[sandbox]`: `[sandbox]` = "[sandbox]".asInstanceOf[`[sandbox]`]
  @scala.inline
  def `[scale]`: `[scale]` = "[scale]".asInstanceOf[`[scale]`]
  @scala.inline
  def `[scope]`: `[scope]` = "[scope]".asInstanceOf[`[scope]`]
  @scala.inline
  def `[scoped]`: `[scoped]` = "[scoped]".asInstanceOf[`[scoped]`]
  @scala.inline
  def `[scrollamount]`: `[scrollamount]` = "[scrollamount]".asInstanceOf[`[scrollamount]`]
  @scala.inline
  def `[scrolldelay]`: `[scrolldelay]` = "[scrolldelay]".asInstanceOf[`[scrolldelay]`]
  @scala.inline
  def `[scrolling]`: `[scrolling]` = "[scrolling]".asInstanceOf[`[scrolling]`]
  @scala.inline
  def `[seed]`: `[seed]` = "[seed]".asInstanceOf[`[seed]`]
  @scala.inline
  def `[selected]`: `[selected]` = "[selected]".asInstanceOf[`[selected]`]
  @scala.inline
  def `[shape-rendering]`: `[shape-rendering]` = "[shape-rendering]".asInstanceOf[`[shape-rendering]`]
  @scala.inline
  def `[shape]`: `[shape]` = "[shape]".asInstanceOf[`[shape]`]
  @scala.inline
  def `[side]`: `[side]` = "[side]".asInstanceOf[`[side]`]
  @scala.inline
  def `[size]`: `[size]` = "[size]".asInstanceOf[`[size]`]
  @scala.inline
  def `[sizes]`: `[sizes]` = "[sizes]".asInstanceOf[`[sizes]`]
  @scala.inline
  def `[slope]`: `[slope]` = "[slope]".asInstanceOf[`[slope]`]
  @scala.inline
  def `[slot]`: `[slot]` = "[slot]".asInstanceOf[`[slot]`]
  @scala.inline
  def `[solid-color]`: `[solid-color]` = "[solid-color]".asInstanceOf[`[solid-color]`]
  @scala.inline
  def `[solid-opacity]`: `[solid-opacity]` = "[solid-opacity]".asInstanceOf[`[solid-opacity]`]
  @scala.inline
  def `[spacing]`: `[spacing]` = "[spacing]".asInstanceOf[`[spacing]`]
  @scala.inline
  def `[span]`: `[span]` = "[span]".asInstanceOf[`[span]`]
  @scala.inline
  def `[specularConstant]`: `[specularConstant]` = "[specularConstant]".asInstanceOf[`[specularConstant]`]
  @scala.inline
  def `[specularExponent]`: `[specularExponent]` = "[specularExponent]".asInstanceOf[`[specularExponent]`]
  @scala.inline
  def `[spellcheck]`: `[spellcheck]` = "[spellcheck]".asInstanceOf[`[spellcheck]`]
  @scala.inline
  def `[spreadMethod]`: `[spreadMethod]` = "[spreadMethod]".asInstanceOf[`[spreadMethod]`]
  @scala.inline
  def `[src]`: `[src]` = "[src]".asInstanceOf[`[src]`]
  @scala.inline
  def `[srcdoc]`: `[srcdoc]` = "[srcdoc]".asInstanceOf[`[srcdoc]`]
  @scala.inline
  def `[srclang]`: `[srclang]` = "[srclang]".asInstanceOf[`[srclang]`]
  @scala.inline
  def `[srcset]`: `[srcset]` = "[srcset]".asInstanceOf[`[srcset]`]
  @scala.inline
  def `[standby]`: `[standby]` = "[standby]".asInstanceOf[`[standby]`]
  @scala.inline
  def `[startOffset]`: `[startOffset]` = "[startOffset]".asInstanceOf[`[startOffset]`]
  @scala.inline
  def `[start]`: `[start]` = "[start]".asInstanceOf[`[start]`]
  @scala.inline
  def `[stdDeviation]`: `[stdDeviation]` = "[stdDeviation]".asInstanceOf[`[stdDeviation]`]
  @scala.inline
  def `[stemh]`: `[stemh]` = "[stemh]".asInstanceOf[`[stemh]`]
  @scala.inline
  def `[stemv]`: `[stemv]` = "[stemv]".asInstanceOf[`[stemv]`]
  @scala.inline
  def `[stitchTiles]`: `[stitchTiles]` = "[stitchTiles]".asInstanceOf[`[stitchTiles]`]
  @scala.inline
  def `[stop-color]`: `[stop-color]` = "[stop-color]".asInstanceOf[`[stop-color]`]
  @scala.inline
  def `[stop-opacity]`: `[stop-opacity]` = "[stop-opacity]".asInstanceOf[`[stop-opacity]`]
  @scala.inline
  def `[strikethrough-position]`: `[strikethrough-position]` = "[strikethrough-position]".asInstanceOf[`[strikethrough-position]`]
  @scala.inline
  def `[strikethrough-thickness]`: `[strikethrough-thickness]` = "[strikethrough-thickness]".asInstanceOf[`[strikethrough-thickness]`]
  @scala.inline
  def `[string]`: `[string]` = "[string]".asInstanceOf[`[string]`]
  @scala.inline
  def `[stroke-dasharray]`: `[stroke-dasharray]` = "[stroke-dasharray]".asInstanceOf[`[stroke-dasharray]`]
  @scala.inline
  def `[stroke-dashoffset]`: `[stroke-dashoffset]` = "[stroke-dashoffset]".asInstanceOf[`[stroke-dashoffset]`]
  @scala.inline
  def `[stroke-linecap]`: `[stroke-linecap]` = "[stroke-linecap]".asInstanceOf[`[stroke-linecap]`]
  @scala.inline
  def `[stroke-linejoin]`: `[stroke-linejoin]` = "[stroke-linejoin]".asInstanceOf[`[stroke-linejoin]`]
  @scala.inline
  def `[stroke-miterlimit]`: `[stroke-miterlimit]` = "[stroke-miterlimit]".asInstanceOf[`[stroke-miterlimit]`]
  @scala.inline
  def `[stroke-opacity]`: `[stroke-opacity]` = "[stroke-opacity]".asInstanceOf[`[stroke-opacity]`]
  @scala.inline
  def `[stroke-width]`: `[stroke-width]` = "[stroke-width]".asInstanceOf[`[stroke-width]`]
  @scala.inline
  def `[stroke]`: `[stroke]` = "[stroke]".asInstanceOf[`[stroke]`]
  @scala.inline
  def `[style]`: `[style]` = "[style]".asInstanceOf[`[style]`]
  @scala.inline
  def `[summary]`: `[summary]` = "[summary]".asInstanceOf[`[summary]`]
  @scala.inline
  def `[surfaceScale]`: `[surfaceScale]` = "[surfaceScale]".asInstanceOf[`[surfaceScale]`]
  @scala.inline
  def `[systemLanguage]`: `[systemLanguage]` = "[systemLanguage]".asInstanceOf[`[systemLanguage]`]
  @scala.inline
  def `[tabindex]`: `[tabindex]` = "[tabindex]".asInstanceOf[`[tabindex]`]
  @scala.inline
  def `[targetX]`: `[targetX]` = "[targetX]".asInstanceOf[`[targetX]`]
  @scala.inline
  def `[targetY]`: `[targetY]` = "[targetY]".asInstanceOf[`[targetY]`]
  @scala.inline
  def `[target]`: `[target]` = "[target]".asInstanceOf[`[target]`]
  @scala.inline
  def `[text-anchor]`: `[text-anchor]` = "[text-anchor]".asInstanceOf[`[text-anchor]`]
  @scala.inline
  def `[text-decoration]`: `[text-decoration]` = "[text-decoration]".asInstanceOf[`[text-decoration]`]
  @scala.inline
  def `[text-overflow]`: `[text-overflow]` = "[text-overflow]".asInstanceOf[`[text-overflow]`]
  @scala.inline
  def `[text-rendering]`: `[text-rendering]` = "[text-rendering]".asInstanceOf[`[text-rendering]`]
  @scala.inline
  def `[textLength]`: `[textLength]` = "[textLength]".asInstanceOf[`[textLength]`]
  @scala.inline
  def `[text]`: `[text]` = "[text]".asInstanceOf[`[text]`]
  @scala.inline
  def `[title]`: `[title]` = "[title]".asInstanceOf[`[title]`]
  @scala.inline
  def `[to]`: `[to]` = "[to]".asInstanceOf[`[to]`]
  @scala.inline
  def `[topmargin]`: `[topmargin]` = "[topmargin]".asInstanceOf[`[topmargin]`]
  @scala.inline
  def `[transform-origin]`: `[transform-origin]` = "[transform-origin]".asInstanceOf[`[transform-origin]`]
  @scala.inline
  def `[transform]`: `[transform]` = "[transform]".asInstanceOf[`[transform]`]
  @scala.inline
  def `[translate]`: `[translate]` = "[translate]".asInstanceOf[`[translate]`]
  @scala.inline
  def `[truespeed]`: `[truespeed]` = "[truespeed]".asInstanceOf[`[truespeed]`]
  @scala.inline
  def `[type]`: `[type]` = "[type]".asInstanceOf[`[type]`]
  @scala.inline
  def `[typemustmatch]`: `[typemustmatch]` = "[typemustmatch]".asInstanceOf[`[typemustmatch]`]
  @scala.inline
  def `[u1]`: `[u1]` = "[u1]".asInstanceOf[`[u1]`]
  @scala.inline
  def `[u2]`: `[u2]` = "[u2]".asInstanceOf[`[u2]`]
  @scala.inline
  def `[underline-position]`: `[underline-position]` = "[underline-position]".asInstanceOf[`[underline-position]`]
  @scala.inline
  def `[underline-thickness]`: `[underline-thickness]` = "[underline-thickness]".asInstanceOf[`[underline-thickness]`]
  @scala.inline
  def `[unicode-bidi]`: `[unicode-bidi]` = "[unicode-bidi]".asInstanceOf[`[unicode-bidi]`]
  @scala.inline
  def `[unicode-range]`: `[unicode-range]` = "[unicode-range]".asInstanceOf[`[unicode-range]`]
  @scala.inline
  def `[unicode]`: `[unicode]` = "[unicode]".asInstanceOf[`[unicode]`]
  @scala.inline
  def `[units-per-em]`: `[units-per-em]` = "[units-per-em]".asInstanceOf[`[units-per-em]`]
  @scala.inline
  def `[usemap]`: `[usemap]` = "[usemap]".asInstanceOf[`[usemap]`]
  @scala.inline
  def `[v-alphabetic]`: `[v-alphabetic]` = "[v-alphabetic]".asInstanceOf[`[v-alphabetic]`]
  @scala.inline
  def `[v-hanging]`: `[v-hanging]` = "[v-hanging]".asInstanceOf[`[v-hanging]`]
  @scala.inline
  def `[v-ideographic]`: `[v-ideographic]` = "[v-ideographic]".asInstanceOf[`[v-ideographic]`]
  @scala.inline
  def `[v-mathematical]`: `[v-mathematical]` = "[v-mathematical]".asInstanceOf[`[v-mathematical]`]
  @scala.inline
  def `[valign]`: `[valign]` = "[valign]".asInstanceOf[`[valign]`]
  @scala.inline
  def `[value]`: `[value]` = "[value]".asInstanceOf[`[value]`]
  @scala.inline
  def `[values]`: `[values]` = "[values]".asInstanceOf[`[values]`]
  @scala.inline
  def `[valuetype]`: `[valuetype]` = "[valuetype]".asInstanceOf[`[valuetype]`]
  @scala.inline
  def `[vector-effect]`: `[vector-effect]` = "[vector-effect]".asInstanceOf[`[vector-effect]`]
  @scala.inline
  def `[version]`: `[version]` = "[version]".asInstanceOf[`[version]`]
  @scala.inline
  def `[vert-adv-y]`: `[vert-adv-y]` = "[vert-adv-y]".asInstanceOf[`[vert-adv-y]`]
  @scala.inline
  def `[vert-origin-x]`: `[vert-origin-x]` = "[vert-origin-x]".asInstanceOf[`[vert-origin-x]`]
  @scala.inline
  def `[vert-origin-y]`: `[vert-origin-y]` = "[vert-origin-y]".asInstanceOf[`[vert-origin-y]`]
  @scala.inline
  def `[viewBox]`: `[viewBox]` = "[viewBox]".asInstanceOf[`[viewBox]`]
  @scala.inline
  def `[viewTarget]`: `[viewTarget]` = "[viewTarget]".asInstanceOf[`[viewTarget]`]
  @scala.inline
  def `[visibility]`: `[visibility]` = "[visibility]".asInstanceOf[`[visibility]`]
  @scala.inline
  def `[vlink]`: `[vlink]` = "[vlink]".asInstanceOf[`[vlink]`]
  @scala.inline
  def `[volume]`: `[volume]` = "[volume]".asInstanceOf[`[volume]`]
  @scala.inline
  def `[vspace]`: `[vspace]` = "[vspace]".asInstanceOf[`[vspace]`]
  @scala.inline
  def `[webkitallowfullscreen]`: `[webkitallowfullscreen]` = "[webkitallowfullscreen]".asInstanceOf[`[webkitallowfullscreen]`]
  @scala.inline
  def `[white-space]`: `[white-space]` = "[white-space]".asInstanceOf[`[white-space]`]
  @scala.inline
  def `[width]`: `[width]` = "[width]".asInstanceOf[`[width]`]
  @scala.inline
  def `[widths]`: `[widths]` = "[widths]".asInstanceOf[`[widths]`]
  @scala.inline
  def `[word-spacing]`: `[word-spacing]` = "[word-spacing]".asInstanceOf[`[word-spacing]`]
  @scala.inline
  def `[wrap]`: `[wrap]` = "[wrap]".asInstanceOf[`[wrap]`]
  @scala.inline
  def `[writing-mode]`: `[writing-mode]` = "[writing-mode]".asInstanceOf[`[writing-mode]`]
  @scala.inline
  def `[x-height]`: `[x-height]` = "[x-height]".asInstanceOf[`[x-height]`]
  @scala.inline
  def `[x1]`: `[x1]` = "[x1]".asInstanceOf[`[x1]`]
  @scala.inline
  def `[x2]`: `[x2]` = "[x2]".asInstanceOf[`[x2]`]
  @scala.inline
  def `[xChannelSelector]`: `[xChannelSelector]` = "[xChannelSelector]".asInstanceOf[`[xChannelSelector]`]
  @scala.inline
  def `[x]`: `[x]` = "[x]".asInstanceOf[`[x]`]
  @scala.inline
  def `[xmlns]`: `[xmlns]` = "[xmlns]".asInstanceOf[`[xmlns]`]
  @scala.inline
  def `[y1]`: `[y1]` = "[y1]".asInstanceOf[`[y1]`]
  @scala.inline
  def `[y2]`: `[y2]` = "[y2]".asInstanceOf[`[y2]`]
  @scala.inline
  def `[yChannelSelector]`: `[yChannelSelector]` = "[yChannelSelector]".asInstanceOf[`[yChannelSelector]`]
  @scala.inline
  def `[y]`: `[y]` = "[y]".asInstanceOf[`[y]`]
  @scala.inline
  def `[z]`: `[z]` = "[z]".asInstanceOf[`[z]`]
  @scala.inline
  def `[zoomAndPan]`: `[zoomAndPan]` = "[zoomAndPan]".asInstanceOf[`[zoomAndPan]`]
  @scala.inline
  def above: above = "above".asInstanceOf[above]
  @scala.inline
  def absolute: absolute = "absolute".asInstanceOf[absolute]
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  @scala.inline
  def additive: additive = "additive".asInstanceOf[additive]
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  @scala.inline
  def `after-edge`: `after-edge` = "after-edge".asInstanceOf[`after-edge`]
  @scala.inline
  def alias: alias = "alias".asInstanceOf[alias]
  @scala.inline
  def aliceblue: aliceblue = "aliceblue".asInstanceOf[aliceblue]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def `all-petite-caps`: `all-petite-caps` = "all-petite-caps".asInstanceOf[`all-petite-caps`]
  @scala.inline
  def `all-scroll`: `all-scroll` = "all-scroll".asInstanceOf[`all-scroll`]
  @scala.inline
  def `all-small-caps`: `all-small-caps` = "all-small-caps".asInstanceOf[`all-small-caps`]
  @scala.inline
  def `allow-end`: `allow-end` = "allow-end".asInstanceOf[`allow-end`]
  @scala.inline
  def alpha: alpha = "alpha".asInstanceOf[alpha]
  @scala.inline
  def alphabetic: alphabetic = "alphabetic".asInstanceOf[alphabetic]
  @scala.inline
  def alternate: alternate = "alternate".asInstanceOf[alternate]
  @scala.inline
  def `alternate-reverse`: `alternate-reverse` = "alternate-reverse".asInstanceOf[`alternate-reverse`]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def antiquewhite: antiquewhite = "antiquewhite".asInstanceOf[antiquewhite]
  @scala.inline
  def anywhere: anywhere = "anywhere".asInstanceOf[anywhere]
  @scala.inline
  def aqua: aqua = "aqua".asInstanceOf[aqua]
  @scala.inline
  def aquamarine: aquamarine = "aquamarine".asInstanceOf[aquamarine]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def avoid: avoid = "avoid".asInstanceOf[avoid]
  @scala.inline
  def `avoid-column`: `avoid-column` = "avoid-column".asInstanceOf[`avoid-column`]
  @scala.inline
  def `avoid-page`: `avoid-page` = "avoid-page".asInstanceOf[`avoid-page`]
  @scala.inline
  def `avoid-region`: `avoid-region` = "avoid-region".asInstanceOf[`avoid-region`]
  @scala.inline
  def azure: azure = "azure".asInstanceOf[azure]
  @scala.inline
  def backwards: backwards = "backwards".asInstanceOf[backwards]
  @scala.inline
  def balance: balance = "balance".asInstanceOf[balance]
  @scala.inline
  def baseline: baseline = "baseline".asInstanceOf[baseline]
  @scala.inline
  def `before-edge`: `before-edge` = "before-edge".asInstanceOf[`before-edge`]
  @scala.inline
  def beige: beige = "beige".asInstanceOf[beige]
  @scala.inline
  def below: below = "below".asInstanceOf[below]
  @scala.inline
  def bevel: bevel = "bevel".asInstanceOf[bevel]
  @scala.inline
  def `bidi-override`: `bidi-override` = "bidi-override".asInstanceOf[`bidi-override`]
  @scala.inline
  def bisque: bisque = "bisque".asInstanceOf[bisque]
  @scala.inline
  def black: black = "black".asInstanceOf[black]
  @scala.inline
  def blanchedalmond: blanchedalmond = "blanchedalmond".asInstanceOf[blanchedalmond]
  @scala.inline
  def blink: blink = "blink".asInstanceOf[blink]
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  @scala.inline
  def `block-axis`: `block-axis` = "block-axis".asInstanceOf[`block-axis`]
  @scala.inline
  def `block-end`: `block-end` = "block-end".asInstanceOf[`block-end`]
  @scala.inline
  def `block-start`: `block-start` = "block-start".asInstanceOf[`block-start`]
  @scala.inline
  def blue: blue = "blue".asInstanceOf[blue]
  @scala.inline
  def blueviolet: blueviolet = "blueviolet".asInstanceOf[blueviolet]
  @scala.inline
  def bold: bold = "bold".asInstanceOf[bold]
  @scala.inline
  def bolder: bolder = "bolder".asInstanceOf[bolder]
  @scala.inline
  def border: border = "border".asInstanceOf[border]
  @scala.inline
  def `border-box`: `border-box` = "border-box".asInstanceOf[`border-box`]
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def `box-decoration`: `box-decoration` = "box-decoration".asInstanceOf[`box-decoration`]
  @scala.inline
  def `break-all`: `break-all` = "break-all".asInstanceOf[`break-all`]
  @scala.inline
  def `break-spaces`: `break-spaces` = "break-spaces".asInstanceOf[`break-spaces`]
  @scala.inline
  def `break-word`: `break-word` = "break-word".asInstanceOf[`break-word`]
  @scala.inline
  def brown: brown = "brown".asInstanceOf[brown]
  @scala.inline
  def bt: bt = "bt".asInstanceOf[bt]
  @scala.inline
  def bullets: bullets = "bullets".asInstanceOf[bullets]
  @scala.inline
  def burlywood: burlywood = "burlywood".asInstanceOf[burlywood]
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  @scala.inline
  def button: button = "button".asInstanceOf[button]
  @scala.inline
  def `button-arrow-down`: `button-arrow-down` = "button-arrow-down".asInstanceOf[`button-arrow-down`]
  @scala.inline
  def `button-arrow-next`: `button-arrow-next` = "button-arrow-next".asInstanceOf[`button-arrow-next`]
  @scala.inline
  def `button-arrow-previous`: `button-arrow-previous` = "button-arrow-previous".asInstanceOf[`button-arrow-previous`]
  @scala.inline
  def `button-arrow-up`: `button-arrow-up` = "button-arrow-up".asInstanceOf[`button-arrow-up`]
  @scala.inline
  def `button-bevel`: `button-bevel` = "button-bevel".asInstanceOf[`button-bevel`]
  @scala.inline
  def `button-focus`: `button-focus` = "button-focus".asInstanceOf[`button-focus`]
  @scala.inline
  def cadetblue: cadetblue = "cadetblue".asInstanceOf[cadetblue]
  @scala.inline
  def capitalize: capitalize = "capitalize".asInstanceOf[capitalize]
  @scala.inline
  def caption: caption = "caption".asInstanceOf[caption]
  @scala.inline
  def caret: caret = "caret".asInstanceOf[caret]
  @scala.inline
  def cell: cell = "cell".asInstanceOf[cell]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def central: central = "central".asInstanceOf[central]
  @scala.inline
  def chained: chained = "chained".asInstanceOf[chained]
  @scala.inline
  def chartreuse: chartreuse = "chartreuse".asInstanceOf[chartreuse]
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def `checkbox-container`: `checkbox-container` = "checkbox-container".asInstanceOf[`checkbox-container`]
  @scala.inline
  def `checkbox-label`: `checkbox-label` = "checkbox-label".asInstanceOf[`checkbox-label`]
  @scala.inline
  def checkmenuitem: checkmenuitem = "checkmenuitem".asInstanceOf[checkmenuitem]
  @scala.inline
  def child: child = "child".asInstanceOf[child]
  @scala.inline
  def chocolate: chocolate = "chocolate".asInstanceOf[chocolate]
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  @scala.inline
  def clip: clip = "clip".asInstanceOf[clip]
  @scala.inline
  def `close-quote`: `close-quote` = "close-quote".asInstanceOf[`close-quote`]
  @scala.inline
  def `col-resize`: `col-resize` = "col-resize".asInstanceOf[`col-resize`]
  @scala.inline
  def collapse: collapse = "collapse".asInstanceOf[collapse]
  @scala.inline
  def color: color = "color".asInstanceOf[color]
  @scala.inline
  def `color-burn`: `color-burn` = "color-burn".asInstanceOf[`color-burn`]
  @scala.inline
  def `color-dodge`: `color-dodge` = "color-dodge".asInstanceOf[`color-dodge`]
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  @scala.inline
  def `column-reverse`: `column-reverse` = "column-reverse".asInstanceOf[`column-reverse`]
  @scala.inline
  def `common-ligatures`: `common-ligatures` = "common-ligatures".asInstanceOf[`common-ligatures`]
  @scala.inline
  def condensed: condensed = "condensed".asInstanceOf[condensed]
  @scala.inline
  def contain: contain = "contain".asInstanceOf[contain]
  @scala.inline
  def content: content = "content".asInstanceOf[content]
  @scala.inline
  def `content-box`: `content-box` = "content-box".asInstanceOf[`content-box`]
  @scala.inline
  def contents: contents = "contents".asInstanceOf[contents]
  @scala.inline
  def `context-fill`: `context-fill` = "context-fill".asInstanceOf[`context-fill`]
  @scala.inline
  def `context-menu`: `context-menu` = "context-menu".asInstanceOf[`context-menu`]
  @scala.inline
  def `context-stroke`: `context-stroke` = "context-stroke".asInstanceOf[`context-stroke`]
  @scala.inline
  def contextual: contextual = "contextual".asInstanceOf[contextual]
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  @scala.inline
  def coral: coral = "coral".asInstanceOf[coral]
  @scala.inline
  def cornflowerblue: cornflowerblue = "cornflowerblue".asInstanceOf[cornflowerblue]
  @scala.inline
  def cornsilk: cornsilk = "cornsilk".asInstanceOf[cornsilk]
  @scala.inline
  def cover: cover = "cover".asInstanceOf[cover]
  @scala.inline
  def crimson: crimson = "crimson".asInstanceOf[crimson]
  @scala.inline
  def `crisp-edges`: `crisp-edges` = "crisp-edges".asInstanceOf[`crisp-edges`]
  @scala.inline
  def crispEdges: crispEdges = "crispEdges".asInstanceOf[crispEdges]
  @scala.inline
  def crosshair: crosshair = "crosshair".asInstanceOf[crosshair]
  @scala.inline
  def currentColor: currentColor = "currentColor".asInstanceOf[currentColor]
  @scala.inline
  def currentcolor_ : currentcolor_ = "currentcolor".asInstanceOf[currentcolor_]
  @scala.inline
  def cursive: cursive = "cursive".asInstanceOf[cursive]
  @scala.inline
  def cyan: cyan = "cyan".asInstanceOf[cyan]
  @scala.inline
  def cyclic: cyclic = "cyclic".asInstanceOf[cyclic]
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  @scala.inline
  def darkblue: darkblue = "darkblue".asInstanceOf[darkblue]
  @scala.inline
  def darkcyan: darkcyan = "darkcyan".asInstanceOf[darkcyan]
  @scala.inline
  def darken: darken = "darken".asInstanceOf[darken]
  @scala.inline
  def darkgoldenrod: darkgoldenrod = "darkgoldenrod".asInstanceOf[darkgoldenrod]
  @scala.inline
  def darkgray: darkgray = "darkgray".asInstanceOf[darkgray]
  @scala.inline
  def darkgreen: darkgreen = "darkgreen".asInstanceOf[darkgreen]
  @scala.inline
  def darkgrey: darkgrey = "darkgrey".asInstanceOf[darkgrey]
  @scala.inline
  def darkkhaki: darkkhaki = "darkkhaki".asInstanceOf[darkkhaki]
  @scala.inline
  def darkmagenta: darkmagenta = "darkmagenta".asInstanceOf[darkmagenta]
  @scala.inline
  def darkolivegreen: darkolivegreen = "darkolivegreen".asInstanceOf[darkolivegreen]
  @scala.inline
  def darkorange: darkorange = "darkorange".asInstanceOf[darkorange]
  @scala.inline
  def darkorchid: darkorchid = "darkorchid".asInstanceOf[darkorchid]
  @scala.inline
  def darkred: darkred = "darkred".asInstanceOf[darkred]
  @scala.inline
  def darksalmon: darksalmon = "darksalmon".asInstanceOf[darksalmon]
  @scala.inline
  def darkseagreen: darkseagreen = "darkseagreen".asInstanceOf[darkseagreen]
  @scala.inline
  def darkslateblue: darkslateblue = "darkslateblue".asInstanceOf[darkslateblue]
  @scala.inline
  def darkslategray: darkslategray = "darkslategray".asInstanceOf[darkslategray]
  @scala.inline
  def darkslategrey: darkslategrey = "darkslategrey".asInstanceOf[darkslategrey]
  @scala.inline
  def darkturquoise: darkturquoise = "darkturquoise".asInstanceOf[darkturquoise]
  @scala.inline
  def darkviolet: darkviolet = "darkviolet".asInstanceOf[darkviolet]
  @scala.inline
  def dashed: dashed = "dashed".asInstanceOf[dashed]
  @scala.inline
  def deeppink: deeppink = "deeppink".asInstanceOf[deeppink]
  @scala.inline
  def deepskyblue: deepskyblue = "deepskyblue".asInstanceOf[deepskyblue]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def `default-button`: `default-button` = "default-button".asInstanceOf[`default-button`]
  @scala.inline
  def dense: dense = "dense".asInstanceOf[dense]
  @scala.inline
  def `destination-atop`: `destination-atop` = "destination-atop".asInstanceOf[`destination-atop`]
  @scala.inline
  def `destination-in`: `destination-in` = "destination-in".asInstanceOf[`destination-in`]
  @scala.inline
  def `destination-out`: `destination-out` = "destination-out".asInstanceOf[`destination-out`]
  @scala.inline
  def `destination-over`: `destination-over` = "destination-over".asInstanceOf[`destination-over`]
  @scala.inline
  def `diagonal-fractions`: `diagonal-fractions` = "diagonal-fractions".asInstanceOf[`diagonal-fractions`]
  @scala.inline
  def difference: difference = "difference".asInstanceOf[difference]
  @scala.inline
  def digits: digits = "digits".asInstanceOf[digits]
  @scala.inline
  def dimgray: dimgray = "dimgray".asInstanceOf[dimgray]
  @scala.inline
  def dimgrey: dimgrey = "dimgrey".asInstanceOf[dimgrey]
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  @scala.inline
  def `discretionary-ligatures`: `discretionary-ligatures` = "discretionary-ligatures".asInstanceOf[`discretionary-ligatures`]
  @scala.inline
  def dodgerblue: dodgerblue = "dodgerblue".asInstanceOf[dodgerblue]
  @scala.inline
  def dot: dot = "dot".asInstanceOf[dot]
  @scala.inline
  def dotted: dotted = "dotted".asInstanceOf[dotted]
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  @scala.inline
  def `double-circle`: `double-circle` = "double-circle".asInstanceOf[`double-circle`]
  @scala.inline
  def drag: drag = "drag".asInstanceOf[drag]
  @scala.inline
  def dualbutton: dualbutton = "dualbutton".asInstanceOf[dualbutton]
  @scala.inline
  def `e-resize`: `e-resize` = "e-resize".asInstanceOf[`e-resize`]
  @scala.inline
  def ease: ease = "ease".asInstanceOf[ease]
  @scala.inline
  def `ease-in`: `ease-in` = "ease-in".asInstanceOf[`ease-in`]
  @scala.inline
  def `ease-in-out`: `ease-in-out` = "ease-in-out".asInstanceOf[`ease-in-out`]
  @scala.inline
  def `ease-out`: `ease-out` = "ease-out".asInstanceOf[`ease-out`]
  @scala.inline
  def economy: economy = "economy".asInstanceOf[economy]
  @scala.inline
  def edges: edges = "edges".asInstanceOf[edges]
  @scala.inline
  def element: element = "element".asInstanceOf[element]
  @scala.inline
  def ellipsis: ellipsis = "ellipsis".asInstanceOf[ellipsis]
  @scala.inline
  def embed: embed = "embed".asInstanceOf[embed]
  @scala.inline
  def enabled: enabled = "enabled".asInstanceOf[enabled]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def evenodd: evenodd = "evenodd".asInstanceOf[evenodd]
  @scala.inline
  def `ew-resize`: `ew-resize` = "ew-resize".asInstanceOf[`ew-resize`]
  @scala.inline
  def exact: exact = "exact".asInstanceOf[exact]
  @scala.inline
  def exclude: exclude = "exclude".asInstanceOf[exclude]
  @scala.inline
  def exclusion: exclusion = "exclusion".asInstanceOf[exclusion]
  @scala.inline
  def expanded: expanded = "expanded".asInstanceOf[expanded]
  @scala.inline
  def `extra-condensed`: `extra-condensed` = "extra-condensed".asInstanceOf[`extra-condensed`]
  @scala.inline
  def `extra-expanded`: `extra-expanded` = "extra-expanded".asInstanceOf[`extra-expanded`]
  @scala.inline
  def fallback: fallback = "fallback".asInstanceOf[fallback]
  @scala.inline
  def `false`: `false` = "false".asInstanceOf[`false`]
  @scala.inline
  def fantasy: fantasy = "fantasy".asInstanceOf[fantasy]
  @scala.inline
  def fill: fill = "fill".asInstanceOf[fill]
  @scala.inline
  def `fill-box`: `fill-box` = "fill-box".asInstanceOf[`fill-box`]
  @scala.inline
  def `fill-opacity`: `fill-opacity` = "fill-opacity".asInstanceOf[`fill-opacity`]
  @scala.inline
  def filled: filled = "filled".asInstanceOf[filled]
  @scala.inline
  def firebrick: firebrick = "firebrick".asInstanceOf[firebrick]
  @scala.inline
  def first: first = "first".asInstanceOf[first]
  @scala.inline
  def fixed: fixed = "fixed".asInstanceOf[fixed]
  @scala.inline
  def flat: flat = "flat".asInstanceOf[flat]
  @scala.inline
  def flex: flex = "flex".asInstanceOf[flex]
  @scala.inline
  def `flex-end`: `flex-end` = "flex-end".asInstanceOf[`flex-end`]
  @scala.inline
  def `flex-start`: `flex-start` = "flex-start".asInstanceOf[`flex-start`]
  @scala.inline
  def flip: flip = "flip".asInstanceOf[flip]
  @scala.inline
  def floralwhite: floralwhite = "floralwhite".asInstanceOf[floralwhite]
  @scala.inline
  def flow: flow = "flow".asInstanceOf[flow]
  @scala.inline
  def `flow-root`: `flow-root` = "flow-root".asInstanceOf[`flow-root`]
  @scala.inline
  def `force-end`: `force-end` = "force-end".asInstanceOf[`force-end`]
  @scala.inline
  def forestgreen: forestgreen = "forestgreen".asInstanceOf[forestgreen]
  @scala.inline
  def forwards: forwards = "forwards".asInstanceOf[forwards]
  @scala.inline
  def `from-font`: `from-font` = "from-font".asInstanceOf[`from-font`]
  @scala.inline
  def `from-image`: `from-image` = "from-image".asInstanceOf[`from-image`]
  @scala.inline
  def fuchsia: fuchsia = "fuchsia".asInstanceOf[fuchsia]
  @scala.inline
  def `full-size-kana`: `full-size-kana` = "full-size-kana".asInstanceOf[`full-size-kana`]
  @scala.inline
  def `full-width`: `full-width` = "full-width".asInstanceOf[`full-width`]
  @scala.inline
  def gainsboro: gainsboro = "gainsboro".asInstanceOf[gainsboro]
  @scala.inline
  def geometricPrecision: geometricPrecision = "geometricPrecision".asInstanceOf[geometricPrecision]
  @scala.inline
  def ghostwhite: ghostwhite = "ghostwhite".asInstanceOf[ghostwhite]
  @scala.inline
  def gold: gold = "gold".asInstanceOf[gold]
  @scala.inline
  def goldenrod: goldenrod = "goldenrod".asInstanceOf[goldenrod]
  @scala.inline
  def grab: grab = "grab".asInstanceOf[grab]
  @scala.inline
  def grabbing: grabbing = "grabbing".asInstanceOf[grabbing]
  @scala.inline
  def `grammar-error`: `grammar-error` = "grammar-error".asInstanceOf[`grammar-error`]
  @scala.inline
  def gray: gray = "gray".asInstanceOf[gray]
  @scala.inline
  def green: green = "green".asInstanceOf[green]
  @scala.inline
  def greenyellow: greenyellow = "greenyellow".asInstanceOf[greenyellow]
  @scala.inline
  def grey: grey = "grey".asInstanceOf[grey]
  @scala.inline
  def grid: grid = "grid".asInstanceOf[grid]
  @scala.inline
  def grippers: grippers = "grippers".asInstanceOf[grippers]
  @scala.inline
  def groove: groove = "groove".asInstanceOf[groove]
  @scala.inline
  def groupbox: groupbox = "groupbox".asInstanceOf[groupbox]
  @scala.inline
  def hanging: hanging = "hanging".asInstanceOf[hanging]
  @scala.inline
  def `hard-light`: `hard-light` = "hard-light".asInstanceOf[`hard-light`]
  @scala.inline
  def help: help = "help".asInstanceOf[help]
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  @scala.inline
  def `historical-forms`: `historical-forms` = "historical-forms".asInstanceOf[`historical-forms`]
  @scala.inline
  def `historical-ligatures`: `historical-ligatures` = "historical-ligatures".asInstanceOf[`historical-ligatures`]
  @scala.inline
  def honeydew: honeydew = "honeydew".asInstanceOf[honeydew]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def `horizontal-tb`: `horizontal-tb` = "horizontal-tb".asInstanceOf[`horizontal-tb`]
  @scala.inline
  def hotpink: hotpink = "hotpink".asInstanceOf[hotpink]
  @scala.inline
  def hue: hue = "hue".asInstanceOf[hue]
  @scala.inline
  def icon: icon = "icon".asInstanceOf[icon]
  @scala.inline
  def `ideograph-alpha`: `ideograph-alpha` = "ideograph-alpha".asInstanceOf[`ideograph-alpha`]
  @scala.inline
  def `ideograph-numeric`: `ideograph-numeric` = "ideograph-numeric".asInstanceOf[`ideograph-numeric`]
  @scala.inline
  def `ideograph-parenthesis`: `ideograph-parenthesis` = "ideograph-parenthesis".asInstanceOf[`ideograph-parenthesis`]
  @scala.inline
  def `ideograph-space`: `ideograph-space` = "ideograph-space".asInstanceOf[`ideograph-space`]
  @scala.inline
  def ideographic: ideographic = "ideographic".asInstanceOf[ideographic]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  @scala.inline
  def indianred: indianred = "indianred".asInstanceOf[indianred]
  @scala.inline
  def indigo: indigo = "indigo".asInstanceOf[indigo]
  @scala.inline
  def infinite: infinite = "infinite".asInstanceOf[infinite]
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  @scala.inline
  def initial: initial = "initial".asInstanceOf[initial]
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  @scala.inline
  def `inline-axis`: `inline-axis` = "inline-axis".asInstanceOf[`inline-axis`]
  @scala.inline
  def `inline-block`: `inline-block` = "inline-block".asInstanceOf[`inline-block`]
  @scala.inline
  def `inline-end`: `inline-end` = "inline-end".asInstanceOf[`inline-end`]
  @scala.inline
  def `inline-flex`: `inline-flex` = "inline-flex".asInstanceOf[`inline-flex`]
  @scala.inline
  def `inline-grid`: `inline-grid` = "inline-grid".asInstanceOf[`inline-grid`]
  @scala.inline
  def `inline-list-item`: `inline-list-item` = "inline-list-item".asInstanceOf[`inline-list-item`]
  @scala.inline
  def `inline-start`: `inline-start` = "inline-start".asInstanceOf[`inline-start`]
  @scala.inline
  def `inline-table`: `inline-table` = "inline-table".asInstanceOf[`inline-table`]
  @scala.inline
  def `inner-spin-button`: `inner-spin-button` = "inner-spin-button".asInstanceOf[`inner-spin-button`]
  @scala.inline
  def inset: inset = "inset".asInstanceOf[inset]
  @scala.inline
  def inside: inside = "inside".asInstanceOf[inside]
  @scala.inline
  def `inter-character`: `inter-character` = "inter-character".asInstanceOf[`inter-character`]
  @scala.inline
  def `inter-word`: `inter-word` = "inter-word".asInstanceOf[`inter-word`]
  @scala.inline
  def intersect: intersect = "intersect".asInstanceOf[intersect]
  @scala.inline
  def intrinsic: intrinsic = "intrinsic".asInstanceOf[intrinsic]
  @scala.inline
  def invert: invert = "invert".asInstanceOf[invert]
  @scala.inline
  def isolate: isolate = "isolate".asInstanceOf[isolate]
  @scala.inline
  def `isolate-override`: `isolate-override` = "isolate-override".asInstanceOf[`isolate-override`]
  @scala.inline
  def italic: italic = "italic".asInstanceOf[italic]
  @scala.inline
  def ivory: ivory = "ivory".asInstanceOf[ivory]
  @scala.inline
  def jis04: jis04 = "jis04".asInstanceOf[jis04]
  @scala.inline
  def jis78: jis78 = "jis78".asInstanceOf[jis78]
  @scala.inline
  def jis83: jis83 = "jis83".asInstanceOf[jis83]
  @scala.inline
  def jis90: jis90 = "jis90".asInstanceOf[jis90]
  @scala.inline
  def justify: justify = "justify".asInstanceOf[justify]
  @scala.inline
  def `keep-all`: `keep-all` = "keep-all".asInstanceOf[`keep-all`]
  @scala.inline
  def khaki: khaki = "khaki".asInstanceOf[khaki]
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  @scala.inline
  def larger: larger = "larger".asInstanceOf[larger]
  @scala.inline
  def last: last = "last".asInstanceOf[last]
  @scala.inline
  def lavender: lavender = "lavender".asInstanceOf[lavender]
  @scala.inline
  def lavenderblush: lavenderblush = "lavenderblush".asInstanceOf[lavenderblush]
  @scala.inline
  def lawngreen: lawngreen = "lawngreen".asInstanceOf[lawngreen]
  @scala.inline
  def layout: layout = "layout".asInstanceOf[layout]
  @scala.inline
  def `leading-spaces`: `leading-spaces` = "leading-spaces".asInstanceOf[`leading-spaces`]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def legacy: legacy = "legacy".asInstanceOf[legacy]
  @scala.inline
  def lemonchiffon: lemonchiffon = "lemonchiffon".asInstanceOf[lemonchiffon]
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  @scala.inline
  def lightblue: lightblue = "lightblue".asInstanceOf[lightblue]
  @scala.inline
  def lightcoral: lightcoral = "lightcoral".asInstanceOf[lightcoral]
  @scala.inline
  def lightcyan: lightcyan = "lightcyan".asInstanceOf[lightcyan]
  @scala.inline
  def lighten: lighten = "lighten".asInstanceOf[lighten]
  @scala.inline
  def lighter: lighter = "lighter".asInstanceOf[lighter]
  @scala.inline
  def lightgoldenrodyellow: lightgoldenrodyellow = "lightgoldenrodyellow".asInstanceOf[lightgoldenrodyellow]
  @scala.inline
  def lightgray: lightgray = "lightgray".asInstanceOf[lightgray]
  @scala.inline
  def lightgreen: lightgreen = "lightgreen".asInstanceOf[lightgreen]
  @scala.inline
  def lightgrey: lightgrey = "lightgrey".asInstanceOf[lightgrey]
  @scala.inline
  def lightpink: lightpink = "lightpink".asInstanceOf[lightpink]
  @scala.inline
  def lightsalmon: lightsalmon = "lightsalmon".asInstanceOf[lightsalmon]
  @scala.inline
  def lightseagreen: lightseagreen = "lightseagreen".asInstanceOf[lightseagreen]
  @scala.inline
  def lightskyblue: lightskyblue = "lightskyblue".asInstanceOf[lightskyblue]
  @scala.inline
  def lightslategray: lightslategray = "lightslategray".asInstanceOf[lightslategray]
  @scala.inline
  def lightslategrey: lightslategrey = "lightslategrey".asInstanceOf[lightslategrey]
  @scala.inline
  def lightsteelblue: lightsteelblue = "lightsteelblue".asInstanceOf[lightsteelblue]
  @scala.inline
  def lightyellow: lightyellow = "lightyellow".asInstanceOf[lightyellow]
  @scala.inline
  def lime: lime = "lime".asInstanceOf[lime]
  @scala.inline
  def limegreen: limegreen = "limegreen".asInstanceOf[limegreen]
  @scala.inline
  def `line-through`: `line-through` = "line-through".asInstanceOf[`line-through`]
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  @scala.inline
  def linearRGB: linearRGB = "linearRGB".asInstanceOf[linearRGB]
  @scala.inline
  def linen: linen = "linen".asInstanceOf[linen]
  @scala.inline
  def `lining-nums`: `lining-nums` = "lining-nums".asInstanceOf[`lining-nums`]
  @scala.inline
  def `list-item`: `list-item` = "list-item".asInstanceOf[`list-item`]
  @scala.inline
  def listbox: listbox = "listbox".asInstanceOf[listbox]
  @scala.inline
  def listitem: listitem = "listitem".asInstanceOf[listitem]
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def loose: loose = "loose".asInstanceOf[loose]
  @scala.inline
  def lowercase: lowercase = "lowercase".asInstanceOf[lowercase]
  @scala.inline
  def lr: lr = "lr".asInstanceOf[lr]
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  @scala.inline
  def luminance: luminance = "luminance".asInstanceOf[luminance]
  @scala.inline
  def luminosity: luminosity = "luminosity".asInstanceOf[luminosity]
  @scala.inline
  def magenta: magenta = "magenta".asInstanceOf[magenta]
  @scala.inline
  def mandatory: mandatory = "mandatory".asInstanceOf[mandatory]
  @scala.inline
  def manipulation: manipulation = "manipulation".asInstanceOf[manipulation]
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def `margin-box`: `margin-box` = "margin-box".asInstanceOf[`margin-box`]
  @scala.inline
  def markers: markers = "markers".asInstanceOf[markers]
  @scala.inline
  def maroon: maroon = "maroon".asInstanceOf[maroon]
  @scala.inline
  def `match-parent`: `match-parent` = "match-parent".asInstanceOf[`match-parent`]
  @scala.inline
  def `match-source`: `match-source` = "match-source".asInstanceOf[`match-source`]
  @scala.inline
  def mathematical: mathematical = "mathematical".asInstanceOf[mathematical]
  @scala.inline
  def `max-content`: `max-content` = "max-content".asInstanceOf[`max-content`]
  @scala.inline
  def maximum: maximum = "maximum".asInstanceOf[maximum]
  @scala.inline
  def `media-controls-background`: `media-controls-background` = "media-controls-background".asInstanceOf[`media-controls-background`]
  @scala.inline
  def `media-controls-fullscreen-background`: `media-controls-fullscreen-background` = "media-controls-fullscreen-background".asInstanceOf[`media-controls-fullscreen-background`]
  @scala.inline
  def `media-current-time-display`: `media-current-time-display` = "media-current-time-display".asInstanceOf[`media-current-time-display`]
  @scala.inline
  def `media-enter-fullscreen-button`: `media-enter-fullscreen-button` = "media-enter-fullscreen-button".asInstanceOf[`media-enter-fullscreen-button`]
  @scala.inline
  def `media-exit-fullscreen-button`: `media-exit-fullscreen-button` = "media-exit-fullscreen-button".asInstanceOf[`media-exit-fullscreen-button`]
  @scala.inline
  def `media-fullscreen-button`: `media-fullscreen-button` = "media-fullscreen-button".asInstanceOf[`media-fullscreen-button`]
  @scala.inline
  def `media-mute-button`: `media-mute-button` = "media-mute-button".asInstanceOf[`media-mute-button`]
  @scala.inline
  def `media-overlay-play-button`: `media-overlay-play-button` = "media-overlay-play-button".asInstanceOf[`media-overlay-play-button`]
  @scala.inline
  def `media-play-button`: `media-play-button` = "media-play-button".asInstanceOf[`media-play-button`]
  @scala.inline
  def `media-seek-back-button`: `media-seek-back-button` = "media-seek-back-button".asInstanceOf[`media-seek-back-button`]
  @scala.inline
  def `media-seek-forward-button`: `media-seek-forward-button` = "media-seek-forward-button".asInstanceOf[`media-seek-forward-button`]
  @scala.inline
  def `media-slider`: `media-slider` = "media-slider".asInstanceOf[`media-slider`]
  @scala.inline
  def `media-sliderthumb`: `media-sliderthumb` = "media-sliderthumb".asInstanceOf[`media-sliderthumb`]
  @scala.inline
  def `media-time-remaining-display`: `media-time-remaining-display` = "media-time-remaining-display".asInstanceOf[`media-time-remaining-display`]
  @scala.inline
  def `media-toggle-closed-captions-button`: `media-toggle-closed-captions-button` = "media-toggle-closed-captions-button".asInstanceOf[`media-toggle-closed-captions-button`]
  @scala.inline
  def `media-volume-slider`: `media-volume-slider` = "media-volume-slider".asInstanceOf[`media-volume-slider`]
  @scala.inline
  def `media-volume-slider-container`: `media-volume-slider-container` = "media-volume-slider-container".asInstanceOf[`media-volume-slider-container`]
  @scala.inline
  def `media-volume-sliderthumb`: `media-volume-sliderthumb` = "media-volume-sliderthumb".asInstanceOf[`media-volume-sliderthumb`]
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  @scala.inline
  def mediumaquamarine: mediumaquamarine = "mediumaquamarine".asInstanceOf[mediumaquamarine]
  @scala.inline
  def mediumblue: mediumblue = "mediumblue".asInstanceOf[mediumblue]
  @scala.inline
  def mediumorchid: mediumorchid = "mediumorchid".asInstanceOf[mediumorchid]
  @scala.inline
  def mediumpurple: mediumpurple = "mediumpurple".asInstanceOf[mediumpurple]
  @scala.inline
  def mediumseagreen: mediumseagreen = "mediumseagreen".asInstanceOf[mediumseagreen]
  @scala.inline
  def mediumslateblue: mediumslateblue = "mediumslateblue".asInstanceOf[mediumslateblue]
  @scala.inline
  def mediumspringgreen: mediumspringgreen = "mediumspringgreen".asInstanceOf[mediumspringgreen]
  @scala.inline
  def mediumturquoise: mediumturquoise = "mediumturquoise".asInstanceOf[mediumturquoise]
  @scala.inline
  def mediumvioletred: mediumvioletred = "mediumvioletred".asInstanceOf[mediumvioletred]
  @scala.inline
  def menu_ : menu_ = "menu".asInstanceOf[menu_]
  @scala.inline
  def menuarrow: menuarrow = "menuarrow".asInstanceOf[menuarrow]
  @scala.inline
  def menubar: menubar = "menubar".asInstanceOf[menubar]
  @scala.inline
  def menucheckbox: menucheckbox = "menucheckbox".asInstanceOf[menucheckbox]
  @scala.inline
  def menuimage: menuimage = "menuimage".asInstanceOf[menuimage]
  @scala.inline
  def menuitem: menuitem = "menuitem".asInstanceOf[menuitem]
  @scala.inline
  def menuitemtext: menuitemtext = "menuitemtext".asInstanceOf[menuitemtext]
  @scala.inline
  def menulist: menulist = "menulist".asInstanceOf[menulist]
  @scala.inline
  def `menulist-button`: `menulist-button` = "menulist-button".asInstanceOf[`menulist-button`]
  @scala.inline
  def `menulist-text`: `menulist-text` = "menulist-text".asInstanceOf[`menulist-text`]
  @scala.inline
  def `menulist-textfield`: `menulist-textfield` = "menulist-textfield".asInstanceOf[`menulist-textfield`]
  @scala.inline
  def menupopup: menupopup = "menupopup".asInstanceOf[menupopup]
  @scala.inline
  def menuradio: menuradio = "menuradio".asInstanceOf[menuradio]
  @scala.inline
  def menuseparator: menuseparator = "menuseparator".asInstanceOf[menuseparator]
  @scala.inline
  def `message-box`: `message-box` = "message-box".asInstanceOf[`message-box`]
  @scala.inline
  def meter: meter = "meter".asInstanceOf[meter]
  @scala.inline
  def meterbar: meterbar = "meterbar".asInstanceOf[meterbar]
  @scala.inline
  def meterchunk: meterchunk = "meterchunk".asInstanceOf[meterchunk]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def midnightblue: midnightblue = "midnightblue".asInstanceOf[midnightblue]
  @scala.inline
  def `min-content`: `min-content` = "min-content".asInstanceOf[`min-content`]
  @scala.inline
  def `min-intrinsic`: `min-intrinsic` = "min-intrinsic".asInstanceOf[`min-intrinsic`]
  @scala.inline
  def mintcream: mintcream = "mintcream".asInstanceOf[mintcream]
  @scala.inline
  def mistyrose: mistyrose = "mistyrose".asInstanceOf[mistyrose]
  @scala.inline
  def miter: miter = "miter".asInstanceOf[miter]
  @scala.inline
  def mixed: mixed = "mixed".asInstanceOf[mixed]
  @scala.inline
  def moccasin: moccasin = "moccasin".asInstanceOf[moccasin]
  @scala.inline
  def monospace: monospace = "monospace".asInstanceOf[monospace]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def multiple: multiple = "multiple".asInstanceOf[multiple]
  @scala.inline
  def multiply: multiply = "multiply".asInstanceOf[multiply]
  @scala.inline
  def `n-resize`: `n-resize` = "n-resize".asInstanceOf[`n-resize`]
  @scala.inline
  def navajowhite: navajowhite = "navajowhite".asInstanceOf[navajowhite]
  @scala.inline
  def navy: navy = "navy".asInstanceOf[navy]
  @scala.inline
  def `ne-resize`: `ne-resize` = "ne-resize".asInstanceOf[`ne-resize`]
  @scala.inline
  def `nesw-resize`: `nesw-resize` = "nesw-resize".asInstanceOf[`nesw-resize`]
  @scala.inline
  def `no-change`: `no-change` = "no-change".asInstanceOf[`no-change`]
  @scala.inline
  def `no-clip`: `no-clip` = "no-clip".asInstanceOf[`no-clip`]
  @scala.inline
  def `no-close-quote`: `no-close-quote` = "no-close-quote".asInstanceOf[`no-close-quote`]
  @scala.inline
  def `no-common-ligatures`: `no-common-ligatures` = "no-common-ligatures".asInstanceOf[`no-common-ligatures`]
  @scala.inline
  def `no-contextual`: `no-contextual` = "no-contextual".asInstanceOf[`no-contextual`]
  @scala.inline
  def `no-discretionary-ligatures`: `no-discretionary-ligatures` = "no-discretionary-ligatures".asInstanceOf[`no-discretionary-ligatures`]
  @scala.inline
  def `no-drag`: `no-drag` = "no-drag".asInstanceOf[`no-drag`]
  @scala.inline
  def `no-drop`: `no-drop` = "no-drop".asInstanceOf[`no-drop`]
  @scala.inline
  def `no-historical-ligatures`: `no-historical-ligatures` = "no-historical-ligatures".asInstanceOf[`no-historical-ligatures`]
  @scala.inline
  def `no-limit`: `no-limit` = "no-limit".asInstanceOf[`no-limit`]
  @scala.inline
  def `no-open-quote`: `no-open-quote` = "no-open-quote".asInstanceOf[`no-open-quote`]
  @scala.inline
  def `no-repeat`: `no-repeat` = "no-repeat".asInstanceOf[`no-repeat`]
  @scala.inline
  def `non-scaling-stroke`: `non-scaling-stroke` = "non-scaling-stroke".asInstanceOf[`non-scaling-stroke`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def nonzero: nonzero = "nonzero".asInstanceOf[nonzero]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def `not-allowed`: `not-allowed` = "not-allowed".asInstanceOf[`not-allowed`]
  @scala.inline
  def nowrap: nowrap = "nowrap".asInstanceOf[nowrap]
  @scala.inline
  def `ns-resize`: `ns-resize` = "ns-resize".asInstanceOf[`ns-resize`]
  @scala.inline
  def numbers: numbers = "numbers".asInstanceOf[numbers]
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  @scala.inline
  def `nw-resize`: `nw-resize` = "nw-resize".asInstanceOf[`nw-resize`]
  @scala.inline
  def `nwse-resize`: `nwse-resize` = "nwse-resize".asInstanceOf[`nwse-resize`]
  @scala.inline
  def objects: objects = "objects".asInstanceOf[objects]
  @scala.inline
  def oblique: oblique = "oblique".asInstanceOf[oblique]
  @scala.inline
  def oldlace: oldlace = "oldlace".asInstanceOf[oldlace]
  @scala.inline
  def `oldstyle-nums`: `oldstyle-nums` = "oldstyle-nums".asInstanceOf[`oldstyle-nums`]
  @scala.inline
  def olive: olive = "olive".asInstanceOf[olive]
  @scala.inline
  def olivedrab: olivedrab = "olivedrab".asInstanceOf[olivedrab]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def `open-quote`: `open-quote` = "open-quote".asInstanceOf[`open-quote`]
  @scala.inline
  def optimizeLegibility: optimizeLegibility = "optimizeLegibility".asInstanceOf[optimizeLegibility]
  @scala.inline
  def optimizeQuality: optimizeQuality = "optimizeQuality".asInstanceOf[optimizeQuality]
  @scala.inline
  def optimizeSpeed: optimizeSpeed = "optimizeSpeed".asInstanceOf[optimizeSpeed]
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  @scala.inline
  def orange: orange = "orange".asInstanceOf[orange]
  @scala.inline
  def orangered: orangered = "orangered".asInstanceOf[orangered]
  @scala.inline
  def orchid: orchid = "orchid".asInstanceOf[orchid]
  @scala.inline
  def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  @scala.inline
  def outset: outset = "outset".asInstanceOf[outset]
  @scala.inline
  def outside: outside = "outside".asInstanceOf[outside]
  @scala.inline
  def over: over = "over".asInstanceOf[over]
  @scala.inline
  def overlay: overlay = "overlay".asInstanceOf[overlay]
  @scala.inline
  def overline: overline = "overline".asInstanceOf[overline]
  @scala.inline
  def padding: padding = "padding".asInstanceOf[padding]
  @scala.inline
  def `padding-box`: `padding-box` = "padding-box".asInstanceOf[`padding-box`]
  @scala.inline
  def page: page = "page".asInstanceOf[page]
  @scala.inline
  def paint: paint = "paint".asInstanceOf[paint]
  @scala.inline
  def painted: painted = "painted".asInstanceOf[painted]
  @scala.inline
  def palegoldenrod: palegoldenrod = "palegoldenrod".asInstanceOf[palegoldenrod]
  @scala.inline
  def palegreen: palegreen = "palegreen".asInstanceOf[palegreen]
  @scala.inline
  def paleturquoise: paleturquoise = "paleturquoise".asInstanceOf[paleturquoise]
  @scala.inline
  def palevioletred: palevioletred = "palevioletred".asInstanceOf[palevioletred]
  @scala.inline
  def `pan-down`: `pan-down` = "pan-down".asInstanceOf[`pan-down`]
  @scala.inline
  def `pan-left`: `pan-left` = "pan-left".asInstanceOf[`pan-left`]
  @scala.inline
  def `pan-right`: `pan-right` = "pan-right".asInstanceOf[`pan-right`]
  @scala.inline
  def `pan-up`: `pan-up` = "pan-up".asInstanceOf[`pan-up`]
  @scala.inline
  def `pan-x`: `pan-x` = "pan-x".asInstanceOf[`pan-x`]
  @scala.inline
  def `pan-y`: `pan-y` = "pan-y".asInstanceOf[`pan-y`]
  @scala.inline
  def papayawhip: papayawhip = "papayawhip".asInstanceOf[papayawhip]
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  @scala.inline
  def peachpuff: peachpuff = "peachpuff".asInstanceOf[peachpuff]
  @scala.inline
  def peru: peru = "peru".asInstanceOf[peru]
  @scala.inline
  def `petite-caps`: `petite-caps` = "petite-caps".asInstanceOf[`petite-caps`]
  @scala.inline
  def `pinch-zoom`: `pinch-zoom` = "pinch-zoom".asInstanceOf[`pinch-zoom`]
  @scala.inline
  def pink: pink = "pink".asInstanceOf[pink]
  @scala.inline
  def pixelated: pixelated = "pixelated".asInstanceOf[pixelated]
  @scala.inline
  def plaintext: plaintext = "plaintext".asInstanceOf[plaintext]
  @scala.inline
  def plum: plum = "plum".asInstanceOf[plum]
  @scala.inline
  def pointer: pointer = "pointer".asInstanceOf[pointer]
  @scala.inline
  def portrait: portrait = "portrait".asInstanceOf[portrait]
  @scala.inline
  def powderblue: powderblue = "powderblue".asInstanceOf[powderblue]
  @scala.inline
  def pre: pre = "pre".asInstanceOf[pre]
  @scala.inline
  def `pre-line`: `pre-line` = "pre-line".asInstanceOf[`pre-line`]
  @scala.inline
  def `pre-wrap`: `pre-wrap` = "pre-wrap".asInstanceOf[`pre-wrap`]
  @scala.inline
  def `preserve-3d`: `preserve-3d` = "preserve-3d".asInstanceOf[`preserve-3d`]
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  @scala.inline
  def `progress-bar`: `progress-bar` = "progress-bar".asInstanceOf[`progress-bar`]
  @scala.inline
  def `progress-bar-value`: `progress-bar-value` = "progress-bar-value".asInstanceOf[`progress-bar-value`]
  @scala.inline
  def progressbar: progressbar = "progressbar".asInstanceOf[progressbar]
  @scala.inline
  def `progressbar-vertical`: `progressbar-vertical` = "progressbar-vertical".asInstanceOf[`progressbar-vertical`]
  @scala.inline
  def progresschunk: progresschunk = "progresschunk".asInstanceOf[progresschunk]
  @scala.inline
  def `progresschunk-vertical`: `progresschunk-vertical` = "progresschunk-vertical".asInstanceOf[`progresschunk-vertical`]
  @scala.inline
  def `proportional-nums`: `proportional-nums` = "proportional-nums".asInstanceOf[`proportional-nums`]
  @scala.inline
  def `proportional-width`: `proportional-width` = "proportional-width".asInstanceOf[`proportional-width`]
  @scala.inline
  def proximity: proximity = "proximity".asInstanceOf[proximity]
  @scala.inline
  def purple: purple = "purple".asInstanceOf[purple]
  @scala.inline
  def `push-button`: `push-button` = "push-button".asInstanceOf[`push-button`]
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
  @scala.inline
  def `radio-container`: `radio-container` = "radio-container".asInstanceOf[`radio-container`]
  @scala.inline
  def `radio-label`: `radio-label` = "radio-label".asInstanceOf[`radio-label`]
  @scala.inline
  def radiomenuitem: radiomenuitem = "radiomenuitem".asInstanceOf[radiomenuitem]
  @scala.inline
  def railed: railed = "railed".asInstanceOf[railed]
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  @scala.inline
  def `range-thumb`: `range-thumb` = "range-thumb".asInstanceOf[`range-thumb`]
  @scala.inline
  def `read-only`: `read-only` = "read-only".asInstanceOf[`read-only`]
  @scala.inline
  def `read-write`: `read-write` = "read-write".asInstanceOf[`read-write`]
  @scala.inline
  def `read-write-plaintext-only`: `read-write-plaintext-only` = "read-write-plaintext-only".asInstanceOf[`read-write-plaintext-only`]
  @scala.inline
  def rebeccapurple: rebeccapurple = "rebeccapurple".asInstanceOf[rebeccapurple]
  @scala.inline
  def recto: recto = "recto".asInstanceOf[recto]
  @scala.inline
  def red: red = "red".asInstanceOf[red]
  @scala.inline
  def region: region = "region".asInstanceOf[region]
  @scala.inline
  def relative: relative = "relative".asInstanceOf[relative]
  @scala.inline
  def repeat: repeat = "repeat".asInstanceOf[repeat]
  @scala.inline
  def `repeat-x`: `repeat-x` = "repeat-x".asInstanceOf[`repeat-x`]
  @scala.inline
  def `repeat-y`: `repeat-y` = "repeat-y".asInstanceOf[`repeat-y`]
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  @scala.inline
  def `reset-size`: `reset-size` = "reset-size".asInstanceOf[`reset-size`]
  @scala.inline
  def resizer: resizer = "resizer".asInstanceOf[resizer]
  @scala.inline
  def resizerpanel: resizerpanel = "resizerpanel".asInstanceOf[resizerpanel]
  @scala.inline
  def reverse: reverse = "reverse".asInstanceOf[reverse]
  @scala.inline
  def revert: revert = "revert".asInstanceOf[revert]
  @scala.inline
  def ridge: ridge = "ridge".asInstanceOf[ridge]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def rl: rl = "rl".asInstanceOf[rl]
  @scala.inline
  def rosybrown: rosybrown = "rosybrown".asInstanceOf[rosybrown]
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  @scala.inline
  def `row-resize`: `row-resize` = "row-resize".asInstanceOf[`row-resize`]
  @scala.inline
  def `row-reverse`: `row-reverse` = "row-reverse".asInstanceOf[`row-reverse`]
  @scala.inline
  def royalblue: royalblue = "royalblue".asInstanceOf[royalblue]
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  @scala.inline
  def ruby: ruby = "ruby".asInstanceOf[ruby]
  @scala.inline
  def `ruby-base`: `ruby-base` = "ruby-base".asInstanceOf[`ruby-base`]
  @scala.inline
  def `ruby-base-container`: `ruby-base-container` = "ruby-base-container".asInstanceOf[`ruby-base-container`]
  @scala.inline
  def `ruby-text`: `ruby-text` = "ruby-text".asInstanceOf[`ruby-text`]
  @scala.inline
  def `ruby-text-container`: `ruby-text-container` = "ruby-text-container".asInstanceOf[`ruby-text-container`]
  @scala.inline
  def `run-in`: `run-in` = "run-in".asInstanceOf[`run-in`]
  @scala.inline
  def running: running = "running".asInstanceOf[running]
  @scala.inline
  def `s-resize`: `s-resize` = "s-resize".asInstanceOf[`s-resize`]
  @scala.inline
  def sRGB: sRGB = "sRGB".asInstanceOf[sRGB]
  @scala.inline
  def saddlebrown: saddlebrown = "saddlebrown".asInstanceOf[saddlebrown]
  @scala.inline
  def salmon: salmon = "salmon".asInstanceOf[salmon]
  @scala.inline
  def sandybrown: sandybrown = "sandybrown".asInstanceOf[sandybrown]
  @scala.inline
  def `sans-serif`: `sans-serif` = "sans-serif".asInstanceOf[`sans-serif`]
  @scala.inline
  def saturation: saturation = "saturation".asInstanceOf[saturation]
  @scala.inline
  def `scale-down`: `scale-down` = "scale-down".asInstanceOf[`scale-down`]
  @scala.inline
  def `scale-horizontal`: `scale-horizontal` = "scale-horizontal".asInstanceOf[`scale-horizontal`]
  @scala.inline
  def `scale-vertical`: `scale-vertical` = "scale-vertical".asInstanceOf[`scale-vertical`]
  @scala.inline
  def `scalethumb-horizontal`: `scalethumb-horizontal` = "scalethumb-horizontal".asInstanceOf[`scalethumb-horizontal`]
  @scala.inline
  def `scalethumb-vertical`: `scalethumb-vertical` = "scalethumb-vertical".asInstanceOf[`scalethumb-vertical`]
  @scala.inline
  def scalethumbend: scalethumbend = "scalethumbend".asInstanceOf[scalethumbend]
  @scala.inline
  def scalethumbstart: scalethumbstart = "scalethumbstart".asInstanceOf[scalethumbstart]
  @scala.inline
  def scalethumbtick: scalethumbtick = "scalethumbtick".asInstanceOf[scalethumbtick]
  @scala.inline
  def screen: screen = "screen".asInstanceOf[screen]
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  @scala.inline
  def `scroll-position`: `scroll-position` = "scroll-position".asInstanceOf[`scroll-position`]
  @scala.inline
  def scrollbar_ : scrollbar_ = "scrollbar".asInstanceOf[scrollbar_]
  @scala.inline
  def `scrollbarbutton-down`: `scrollbarbutton-down` = "scrollbarbutton-down".asInstanceOf[`scrollbarbutton-down`]
  @scala.inline
  def `scrollbarbutton-left`: `scrollbarbutton-left` = "scrollbarbutton-left".asInstanceOf[`scrollbarbutton-left`]
  @scala.inline
  def `scrollbarbutton-right`: `scrollbarbutton-right` = "scrollbarbutton-right".asInstanceOf[`scrollbarbutton-right`]
  @scala.inline
  def `scrollbarbutton-up`: `scrollbarbutton-up` = "scrollbarbutton-up".asInstanceOf[`scrollbarbutton-up`]
  @scala.inline
  def `scrollbarthumb-horizontal`: `scrollbarthumb-horizontal` = "scrollbarthumb-horizontal".asInstanceOf[`scrollbarthumb-horizontal`]
  @scala.inline
  def `scrollbarthumb-vertical`: `scrollbarthumb-vertical` = "scrollbarthumb-vertical".asInstanceOf[`scrollbarthumb-vertical`]
  @scala.inline
  def `scrollbartrack-horizontal`: `scrollbartrack-horizontal` = "scrollbartrack-horizontal".asInstanceOf[`scrollbartrack-horizontal`]
  @scala.inline
  def `scrollbartrack-vertical`: `scrollbartrack-vertical` = "scrollbartrack-vertical".asInstanceOf[`scrollbartrack-vertical`]
  @scala.inline
  def `se-resize`: `se-resize` = "se-resize".asInstanceOf[`se-resize`]
  @scala.inline
  def seagreen: seagreen = "seagreen".asInstanceOf[seagreen]
  @scala.inline
  def searchfield: searchfield = "searchfield".asInstanceOf[searchfield]
  @scala.inline
  def `searchfield-cancel-button`: `searchfield-cancel-button` = "searchfield-cancel-button".asInstanceOf[`searchfield-cancel-button`]
  @scala.inline
  def `searchfield-decoration`: `searchfield-decoration` = "searchfield-decoration".asInstanceOf[`searchfield-decoration`]
  @scala.inline
  def `searchfield-results-button`: `searchfield-results-button` = "searchfield-results-button".asInstanceOf[`searchfield-results-button`]
  @scala.inline
  def `searchfield-results-decoration`: `searchfield-results-decoration` = "searchfield-results-decoration".asInstanceOf[`searchfield-results-decoration`]
  @scala.inline
  def seashell: seashell = "seashell".asInstanceOf[seashell]
  @scala.inline
  def `select-after`: `select-after` = "select-after".asInstanceOf[`select-after`]
  @scala.inline
  def `select-all`: `select-all` = "select-all".asInstanceOf[`select-all`]
  @scala.inline
  def `select-before`: `select-before` = "select-before".asInstanceOf[`select-before`]
  @scala.inline
  def `select-menu`: `select-menu` = "select-menu".asInstanceOf[`select-menu`]
  @scala.inline
  def `select-same`: `select-same` = "select-same".asInstanceOf[`select-same`]
  @scala.inline
  def `self-end`: `self-end` = "self-end".asInstanceOf[`self-end`]
  @scala.inline
  def `self-start`: `self-start` = "self-start".asInstanceOf[`self-start`]
  @scala.inline
  def `semi-condensed`: `semi-condensed` = "semi-condensed".asInstanceOf[`semi-condensed`]
  @scala.inline
  def `semi-expanded`: `semi-expanded` = "semi-expanded".asInstanceOf[`semi-expanded`]
  @scala.inline
  def separate: separate = "separate".asInstanceOf[separate]
  @scala.inline
  def separator: separator = "separator".asInstanceOf[separator]
  @scala.inline
  def serif: serif = "serif".asInstanceOf[serif]
  @scala.inline
  def sesame: sesame = "sesame".asInstanceOf[sesame]
  @scala.inline
  def sheet: sheet = "sheet".asInstanceOf[sheet]
  @scala.inline
  def show: show = "show".asInstanceOf[show]
  @scala.inline
  def sideways: sideways = "sideways".asInstanceOf[sideways]
  @scala.inline
  def `sideways-lr`: `sideways-lr` = "sideways-lr".asInstanceOf[`sideways-lr`]
  @scala.inline
  def `sideways-rl`: `sideways-rl` = "sideways-rl".asInstanceOf[`sideways-rl`]
  @scala.inline
  def sienna: sienna = "sienna".asInstanceOf[sienna]
  @scala.inline
  def silver: silver = "silver".asInstanceOf[silver]
  @scala.inline
  def simplified: simplified = "simplified".asInstanceOf[simplified]
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  @scala.inline
  def size: size = "size".asInstanceOf[size]
  @scala.inline
  def skyblue: skyblue = "skyblue".asInstanceOf[skyblue]
  @scala.inline
  def `slashed-zero`: `slashed-zero` = "slashed-zero".asInstanceOf[`slashed-zero`]
  @scala.inline
  def slateblue: slateblue = "slateblue".asInstanceOf[slateblue]
  @scala.inline
  def slategray: slategray = "slategray".asInstanceOf[slategray]
  @scala.inline
  def slategrey: slategrey = "slategrey".asInstanceOf[slategrey]
  @scala.inline
  def slice: slice = "slice".asInstanceOf[slice]
  @scala.inline
  def `slider-horizontal`: `slider-horizontal` = "slider-horizontal".asInstanceOf[`slider-horizontal`]
  @scala.inline
  def `slider-vertical`: `slider-vertical` = "slider-vertical".asInstanceOf[`slider-vertical`]
  @scala.inline
  def `sliderthumb-horizontal`: `sliderthumb-horizontal` = "sliderthumb-horizontal".asInstanceOf[`sliderthumb-horizontal`]
  @scala.inline
  def `sliderthumb-vertical`: `sliderthumb-vertical` = "sliderthumb-vertical".asInstanceOf[`sliderthumb-vertical`]
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  @scala.inline
  def `small-caps`: `small-caps` = "small-caps".asInstanceOf[`small-caps`]
  @scala.inline
  def `small-caption`: `small-caption` = "small-caption".asInstanceOf[`small-caption`]
  @scala.inline
  def smaller: smaller = "smaller".asInstanceOf[smaller]
  @scala.inline
  def smooth: smooth = "smooth".asInstanceOf[smooth]
  @scala.inline
  def snow: snow = "snow".asInstanceOf[snow]
  @scala.inline
  def `soft-light`: `soft-light` = "soft-light".asInstanceOf[`soft-light`]
  @scala.inline
  def solid: solid = "solid".asInstanceOf[solid]
  @scala.inline
  def `source-atop`: `source-atop` = "source-atop".asInstanceOf[`source-atop`]
  @scala.inline
  def `source-in`: `source-in` = "source-in".asInstanceOf[`source-in`]
  @scala.inline
  def `source-out`: `source-out` = "source-out".asInstanceOf[`source-out`]
  @scala.inline
  def `source-over`: `source-over` = "source-over".asInstanceOf[`source-over`]
  @scala.inline
  def space: space = "space".asInstanceOf[space]
  @scala.inline
  def `space-around`: `space-around` = "space-around".asInstanceOf[`space-around`]
  @scala.inline
  def `space-between`: `space-between` = "space-between".asInstanceOf[`space-between`]
  @scala.inline
  def `space-evenly`: `space-evenly` = "space-evenly".asInstanceOf[`space-evenly`]
  @scala.inline
  def spaces: spaces = "spaces".asInstanceOf[spaces]
  @scala.inline
  def `spell-out`: `spell-out` = "spell-out".asInstanceOf[`spell-out`]
  @scala.inline
  def `spelling-error`: `spelling-error` = "spelling-error".asInstanceOf[`spelling-error`]
  @scala.inline
  def spinner: spinner = "spinner".asInstanceOf[spinner]
  @scala.inline
  def `spinner-downbutton`: `spinner-downbutton` = "spinner-downbutton".asInstanceOf[`spinner-downbutton`]
  @scala.inline
  def `spinner-textfield`: `spinner-textfield` = "spinner-textfield".asInstanceOf[`spinner-textfield`]
  @scala.inline
  def `spinner-upbutton`: `spinner-upbutton` = "spinner-upbutton".asInstanceOf[`spinner-upbutton`]
  @scala.inline
  def splitter: splitter = "splitter".asInstanceOf[splitter]
  @scala.inline
  def springgreen: springgreen = "springgreen".asInstanceOf[springgreen]
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  @scala.inline
  def `square-button`: `square-button` = "square-button".asInstanceOf[`square-button`]
  @scala.inline
  def `stacked-fractions`: `stacked-fractions` = "stacked-fractions".asInstanceOf[`stacked-fractions`]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def static: static = "static".asInstanceOf[static]
  @scala.inline
  def `status-bar`: `status-bar` = "status-bar".asInstanceOf[`status-bar`]
  @scala.inline
  def statusbar: statusbar = "statusbar".asInstanceOf[statusbar]
  @scala.inline
  def statusbarpanel: statusbarpanel = "statusbarpanel".asInstanceOf[statusbarpanel]
  @scala.inline
  def steelblue: steelblue = "steelblue".asInstanceOf[steelblue]
  @scala.inline
  def `step-end`: `step-end` = "step-end".asInstanceOf[`step-end`]
  @scala.inline
  def `step-start`: `step-start` = "step-start".asInstanceOf[`step-start`]
  @scala.inline
  def sticky: sticky = "sticky".asInstanceOf[sticky]
  @scala.inline
  def stretch: stretch = "stretch".asInstanceOf[stretch]
  @scala.inline
  def `stretch-to-fit`: `stretch-to-fit` = "stretch-to-fit".asInstanceOf[`stretch-to-fit`]
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  @scala.inline
  def stroke: stroke = "stroke".asInstanceOf[stroke]
  @scala.inline
  def `stroke-box`: `stroke-box` = "stroke-box".asInstanceOf[`stroke-box`]
  @scala.inline
  def `stroke-opacity`: `stroke-opacity` = "stroke-opacity".asInstanceOf[`stroke-opacity`]
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  @scala.inline
  def sub: sub = "sub".asInstanceOf[sub]
  @scala.inline
  def subgrid: subgrid = "subgrid".asInstanceOf[subgrid]
  @scala.inline
  def subtract: subtract = "subtract".asInstanceOf[subtract]
  @scala.inline
  def `super`: `super` = "super".asInstanceOf[`super`]
  @scala.inline
  def `sw-resize`: `sw-resize` = "sw-resize".asInstanceOf[`sw-resize`]
  @scala.inline
  def swap: swap = "swap".asInstanceOf[swap]
  @scala.inline
  def symbolic: symbolic = "symbolic".asInstanceOf[symbolic]
  @scala.inline
  def tab: tab = "tab".asInstanceOf[tab]
  @scala.inline
  def `tab-scroll-arrow-back`: `tab-scroll-arrow-back` = "tab-scroll-arrow-back".asInstanceOf[`tab-scroll-arrow-back`]
  @scala.inline
  def `tab-scroll-arrow-forward`: `tab-scroll-arrow-forward` = "tab-scroll-arrow-forward".asInstanceOf[`tab-scroll-arrow-forward`]
  @scala.inline
  def table: table = "table".asInstanceOf[table]
  @scala.inline
  def `table-caption`: `table-caption` = "table-caption".asInstanceOf[`table-caption`]
  @scala.inline
  def `table-cell`: `table-cell` = "table-cell".asInstanceOf[`table-cell`]
  @scala.inline
  def `table-column`: `table-column` = "table-column".asInstanceOf[`table-column`]
  @scala.inline
  def `table-column-group`: `table-column-group` = "table-column-group".asInstanceOf[`table-column-group`]
  @scala.inline
  def `table-footer-group`: `table-footer-group` = "table-footer-group".asInstanceOf[`table-footer-group`]
  @scala.inline
  def `table-header-group`: `table-header-group` = "table-header-group".asInstanceOf[`table-header-group`]
  @scala.inline
  def `table-row`: `table-row` = "table-row".asInstanceOf[`table-row`]
  @scala.inline
  def `table-row-group`: `table-row-group` = "table-row-group".asInstanceOf[`table-row-group`]
  @scala.inline
  def tabpanel: tabpanel = "tabpanel".asInstanceOf[tabpanel]
  @scala.inline
  def tabpanels: tabpanels = "tabpanels".asInstanceOf[tabpanels]
  @scala.inline
  def `tabular-nums`: `tabular-nums` = "tabular-nums".asInstanceOf[`tabular-nums`]
  @scala.inline
  def tan: tan = "tan".asInstanceOf[tan]
  @scala.inline
  def tb: tb = "tb".asInstanceOf[tb]
  @scala.inline
  def teal: teal = "teal".asInstanceOf[teal]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def `text-after-edge`: `text-after-edge` = "text-after-edge".asInstanceOf[`text-after-edge`]
  @scala.inline
  def `text-before-edge`: `text-before-edge` = "text-before-edge".asInstanceOf[`text-before-edge`]
  @scala.inline
  def `text-bottom`: `text-bottom` = "text-bottom".asInstanceOf[`text-bottom`]
  @scala.inline
  def `text-top`: `text-top` = "text-top".asInstanceOf[`text-top`]
  @scala.inline
  def textarea: textarea = "textarea".asInstanceOf[textarea]
  @scala.inline
  def textfield: textfield = "textfield".asInstanceOf[textfield]
  @scala.inline
  def `textfield-multiline`: `textfield-multiline` = "textfield-multiline".asInstanceOf[`textfield-multiline`]
  @scala.inline
  def thick: thick = "thick".asInstanceOf[thick]
  @scala.inline
  def thin: thin = "thin".asInstanceOf[thin]
  @scala.inline
  def thistle: thistle = "thistle".asInstanceOf[thistle]
  @scala.inline
  def `titling-caps`: `titling-caps` = "titling-caps".asInstanceOf[`titling-caps`]
  @scala.inline
  def tomato: tomato = "tomato".asInstanceOf[tomato]
  @scala.inline
  def toolbar: toolbar = "toolbar".asInstanceOf[toolbar]
  @scala.inline
  def toolbarbutton: toolbarbutton = "toolbarbutton".asInstanceOf[toolbarbutton]
  @scala.inline
  def `toolbarbutton-dropdown`: `toolbarbutton-dropdown` = "toolbarbutton-dropdown".asInstanceOf[`toolbarbutton-dropdown`]
  @scala.inline
  def toolbargripper: toolbargripper = "toolbargripper".asInstanceOf[toolbargripper]
  @scala.inline
  def toolbox: toolbox = "toolbox".asInstanceOf[toolbox]
  @scala.inline
  def tooltip: tooltip = "tooltip".asInstanceOf[tooltip]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def touch: touch = "touch".asInstanceOf[touch]
  @scala.inline
  def traditional: traditional = "traditional".asInstanceOf[traditional]
  @scala.inline
  def `trailing-spaces`: `trailing-spaces` = "trailing-spaces".asInstanceOf[`trailing-spaces`]
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
  @scala.inline
  def treeheader: treeheader = "treeheader".asInstanceOf[treeheader]
  @scala.inline
  def treeheadercell: treeheadercell = "treeheadercell".asInstanceOf[treeheadercell]
  @scala.inline
  def treeheadersortarrow: treeheadersortarrow = "treeheadersortarrow".asInstanceOf[treeheadersortarrow]
  @scala.inline
  def treeitem: treeitem = "treeitem".asInstanceOf[treeitem]
  @scala.inline
  def treeline: treeline = "treeline".asInstanceOf[treeline]
  @scala.inline
  def treetwisty: treetwisty = "treetwisty".asInstanceOf[treetwisty]
  @scala.inline
  def treetwistyopen: treetwistyopen = "treetwistyopen".asInstanceOf[treetwistyopen]
  @scala.inline
  def treeview: treeview = "treeview".asInstanceOf[treeview]
  @scala.inline
  def triangle: triangle = "triangle".asInstanceOf[triangle]
  @scala.inline
  def `true`: `true` = "true".asInstanceOf[`true`]
  @scala.inline
  def turquoise: turquoise = "turquoise".asInstanceOf[turquoise]
  @scala.inline
  def `ultra-condensed`: `ultra-condensed` = "ultra-condensed".asInstanceOf[`ultra-condensed`]
  @scala.inline
  def `ultra-expanded`: `ultra-expanded` = "ultra-expanded".asInstanceOf[`ultra-expanded`]
  @scala.inline
  def under: under = "under".asInstanceOf[under]
  @scala.inline
  def underline: underline = "underline".asInstanceOf[underline]
  @scala.inline
  def unicase: unicase = "unicase".asInstanceOf[unicase]
  @scala.inline
  def unset: unset = "unset".asInstanceOf[unset]
  @scala.inline
  def uppercase: uppercase = "uppercase".asInstanceOf[uppercase]
  @scala.inline
  def upright: upright = "upright".asInstanceOf[upright]
  @scala.inline
  def `use-script`: `use-script` = "use-script".asInstanceOf[`use-script`]
  @scala.inline
  def verso: verso = "verso".asInstanceOf[verso]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  @scala.inline
  def `vertical-lr`: `vertical-lr` = "vertical-lr".asInstanceOf[`vertical-lr`]
  @scala.inline
  def `vertical-rl`: `vertical-rl` = "vertical-rl".asInstanceOf[`vertical-rl`]
  @scala.inline
  def `vertical-text`: `vertical-text` = "vertical-text".asInstanceOf[`vertical-text`]
  @scala.inline
  def `vertical-to-horizontal`: `vertical-to-horizontal` = "vertical-to-horizontal".asInstanceOf[`vertical-to-horizontal`]
  @scala.inline
  def `view-box`: `view-box` = "view-box".asInstanceOf[`view-box`]
  @scala.inline
  def violet: violet = "violet".asInstanceOf[violet]
  @scala.inline
  def visible: visible = "visible".asInstanceOf[visible]
  @scala.inline
  def visibleFill: visibleFill = "visibleFill".asInstanceOf[visibleFill]
  @scala.inline
  def visiblePainted: visiblePainted = "visiblePainted".asInstanceOf[visiblePainted]
  @scala.inline
  def visibleStroke: visibleStroke = "visibleStroke".asInstanceOf[visibleStroke]
  @scala.inline
  def `w-resize`: `w-resize` = "w-resize".asInstanceOf[`w-resize`]
  @scala.inline
  def wavy: wavy = "wavy".asInstanceOf[wavy]
  @scala.inline
  def weight: weight = "weight".asInstanceOf[weight]
  @scala.inline
  def wheat: wheat = "wheat".asInstanceOf[wheat]
  @scala.inline
  def white: white = "white".asInstanceOf[white]
  @scala.inline
  def whitesmoke: whitesmoke = "whitesmoke".asInstanceOf[whitesmoke]
  @scala.inline
  def words: words = "words".asInstanceOf[words]
  @scala.inline
  def wrap: wrap = "wrap".asInstanceOf[wrap]
  @scala.inline
  def `wrap-reverse`: `wrap-reverse` = "wrap-reverse".asInstanceOf[`wrap-reverse`]
  @scala.inline
  def `write-only`: `write-only` = "write-only".asInstanceOf[`write-only`]
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  @scala.inline
  def `x-end`: `x-end` = "x-end".asInstanceOf[`x-end`]
  @scala.inline
  def `x-large`: `x-large` = "x-large".asInstanceOf[`x-large`]
  @scala.inline
  def `x-small`: `x-small` = "x-small".asInstanceOf[`x-small`]
  @scala.inline
  def `x-start`: `x-start` = "x-start".asInstanceOf[`x-start`]
  @scala.inline
  def xor: xor = "xor".asInstanceOf[xor]
  @scala.inline
  def `xx-large`: `xx-large` = "xx-large".asInstanceOf[`xx-large`]
  @scala.inline
  def `xx-small`: `xx-small` = "xx-small".asInstanceOf[`xx-small`]
  @scala.inline
  def `xxx-large`: `xxx-large` = "xxx-large".asInstanceOf[`xxx-large`]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  @scala.inline
  def `y-end`: `y-end` = "y-end".asInstanceOf[`y-end`]
  @scala.inline
  def `y-start`: `y-start` = "y-start".asInstanceOf[`y-start`]
  @scala.inline
  def yellow: yellow = "yellow".asInstanceOf[yellow]
  @scala.inline
  def yellowgreen: yellowgreen = "yellowgreen".asInstanceOf[yellowgreen]
  @scala.inline
  def zoom: zoom = "zoom".asInstanceOf[zoom]
  @scala.inline
  def `zoom-in`: `zoom-in` = "zoom-in".asInstanceOf[`zoom-in`]
  @scala.inline
  def `zoom-out`: `zoom-out` = "zoom-out".asInstanceOf[`zoom-out`]
}

