package typings.csstype.mod

import typings.csstype.mod.Property.Animation
import typings.csstype.mod.Property.AnimationDelay
import typings.csstype.mod.Property.AnimationDirection
import typings.csstype.mod.Property.AnimationDuration
import typings.csstype.mod.Property.AnimationFillMode
import typings.csstype.mod.Property.AnimationIterationCount
import typings.csstype.mod.Property.AnimationName
import typings.csstype.mod.Property.AnimationPlayState
import typings.csstype.mod.Property.AnimationTimingFunction
import typings.csstype.mod.Property.BackgroundClip
import typings.csstype.mod.Property.BackgroundOrigin
import typings.csstype.mod.Property.BackgroundSize
import typings.csstype.mod.Property.BorderBottomLeftRadius
import typings.csstype.mod.Property.BorderBottomRightRadius
import typings.csstype.mod.Property.BorderImage
import typings.csstype.mod.Property.BorderRadius
import typings.csstype.mod.Property.BorderTopLeftRadius
import typings.csstype.mod.Property.BorderTopRightRadius
import typings.csstype.mod.Property.BoxAlign
import typings.csstype.mod.Property.BoxDecorationBreak
import typings.csstype.mod.Property.BoxDirection
import typings.csstype.mod.Property.BoxFlex
import typings.csstype.mod.Property.BoxFlexGroup
import typings.csstype.mod.Property.BoxLines
import typings.csstype.mod.Property.BoxOrdinalGroup
import typings.csstype.mod.Property.BoxOrient
import typings.csstype.mod.Property.BoxPack
import typings.csstype.mod.Property.BoxShadow
import typings.csstype.mod.Property.Clip
import typings.csstype.mod.Property.FontVariantAlternates
import typings.csstype.mod.Property.GridColumnGap
import typings.csstype.mod.Property.GridGap
import typings.csstype.mod.Property.GridRowGap
import typings.csstype.mod.Property.ImeMode
import typings.csstype.mod.Property.InsetBlock
import typings.csstype.mod.Property.InsetBlockEnd
import typings.csstype.mod.Property.InsetBlockStart
import typings.csstype.mod.Property.InsetInline
import typings.csstype.mod.Property.InsetInlineEnd
import typings.csstype.mod.Property.InsetInlineStart
import typings.csstype.mod.Property.LineBreak
import typings.csstype.mod.Property.MozBinding
import typings.csstype.mod.Property.MozOutlineRadius
import typings.csstype.mod.Property.MozUserInput
import typings.csstype.mod.Property.MsScrollbarTrackColor
import typings.csstype.mod.Property.Opacity
import typings.csstype.mod.Property.Outline
import typings.csstype.mod.Property.OutlineColor
import typings.csstype.mod.Property.OutlineStyle
import typings.csstype.mod.Property.OutlineWidth
import typings.csstype.mod.Property.ScrollSnapCoordinate
import typings.csstype.mod.Property.ScrollSnapDestination
import typings.csstype.mod.Property.ScrollSnapPointsX
import typings.csstype.mod.Property.ScrollSnapPointsY
import typings.csstype.mod.Property.ScrollSnapTypeX
import typings.csstype.mod.Property.ScrollSnapTypeY
import typings.csstype.mod.Property.TextAlignLast
import typings.csstype.mod.Property.TextCombineUpright
import typings.csstype.mod.Property.TextDecorationColor
import typings.csstype.mod.Property.TextDecorationLine
import typings.csstype.mod.Property.TextDecorationStyle
import typings.csstype.mod.Property.Transform
import typings.csstype.mod.Property.Transition
import typings.csstype.mod.Property.TransitionDelay
import typings.csstype.mod.Property.TransitionDuration
import typings.csstype.mod.Property.TransitionProperty
import typings.csstype.mod.Property.TransitionTimingFunction
import typings.csstype.mod.Property.UserSelect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObsoleteProperties[TLength, TTime] extends js.Object {
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var KhtmlBoxAlign: js.UndefOr[BoxAlign] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var KhtmlBoxDirection: js.UndefOr[BoxDirection] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var KhtmlBoxFlex: js.UndefOr[BoxFlex] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxFlexGroup: js.UndefOr[BoxFlexGroup] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var KhtmlBoxLines: js.UndefOr[BoxLines] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxOrdinalGroup: js.UndefOr[BoxOrdinalGroup] = js.native
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var KhtmlBoxOrient: js.UndefOr[BoxOrient] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var KhtmlBoxPack: js.UndefOr[BoxPack] = js.native
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlLineBreak: js.UndefOr[LineBreak] = js.native
  /**
    * The **`opacity`** CSS property sets the opacity of an element. Opacity is the degree to which content behind an element is hidden, and is the opposite of transparency.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var KhtmlOpacity: js.UndefOr[Opacity] = js.native
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlUserSelect: js.UndefOr[UserSelect] = js.native
  /**
    * The **`background-clip`** CSS property sets whether an element's background extends underneath its border box, padding box, or content box.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `border-box`
    *
    * @deprecated
    */
  var MozBackgroundClip: js.UndefOr[BackgroundClip] = js.native
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Syntax**: `slice | clone`
    *
    * **Initial value**: `slice`
    *
    * @deprecated
    */
  var MozBackgroundInlinePolicy: js.UndefOr[BoxDecorationBreak] = js.native
  /**
    * The **`background-origin`** CSS property sets the background's origin: from the border start, inside the border, or inside the padding.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `padding-box`
    *
    * @deprecated
    */
  var MozBackgroundOrigin: js.UndefOr[BackgroundOrigin] = js.native
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var MozBackgroundSize: js.UndefOr[BackgroundSize[TLength]] = js.native
  /**
    * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
    *
    * **Syntax**: `<url> | none`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBinding: js.UndefOr[typings.csstype.mod.Property.MozBinding] = js.native
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    *
    * @deprecated
    */
  var MozBorderRadius: js.UndefOr[BorderRadius[TLength]] = js.native
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomleft: js.UndefOr[BorderBottomLeftRadius[TLength]] = js.native
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomright: js.UndefOr[BorderBottomRightRadius[TLength]] = js.native
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopleft: js.UndefOr[BorderTopLeftRadius[TLength]] = js.native
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopright: js.UndefOr[BorderTopRightRadius[TLength]] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var MozBoxAlign: js.UndefOr[BoxAlign] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var MozBoxDirection: js.UndefOr[BoxDirection] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBoxFlex: js.UndefOr[BoxFlex] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var MozBoxOrdinalGroup: js.UndefOr[BoxOrdinalGroup] = js.native
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var MozBoxOrient: js.UndefOr[BoxOrient] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var MozBoxPack: js.UndefOr[BoxPack] = js.native
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Syntax**: `none | <shadow>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBoxShadow: js.UndefOr[BoxShadow] = js.native
  /**
    * The **`opacity`** CSS property sets the opacity of an element. Opacity is the degree to which content behind an element is hidden, and is the opposite of transparency.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var MozOpacity: js.UndefOr[Opacity] = js.native
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
    *
    * @deprecated
    */
  var MozOutline: js.UndefOr[Outline[TLength]] = js.native
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Syntax**: `<color> | invert`
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * @deprecated
    */
  var MozOutlineColor: js.UndefOr[OutlineColor] = js.native
  /**
    * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS property can be used to give an element's `outline` rounded corners.
    *
    * **Syntax**: `<outline-radius>{1,4} [ / <outline-radius>{1,4} ]?`
    *
    * @deprecated
    */
  var MozOutlineRadius: js.UndefOr[typings.csstype.mod.Property.MozOutlineRadius[TLength]] = js.native
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `auto | <'border-style'>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozOutlineStyle: js.UndefOr[OutlineStyle] = js.native
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * @deprecated
    */
  var MozOutlineWidth: js.UndefOr[OutlineWidth[TLength]] = js.native
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Syntax**: `auto | start | end | left | right | center | justify`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozTextAlignLast: js.UndefOr[TextAlignLast] = js.native
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * @deprecated
    */
  var MozTextDecorationColor: js.UndefOr[TextDecorationColor] = js.native
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozTextDecorationLine: js.UndefOr[TextDecorationLine] = js.native
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Syntax**: `solid | double | dotted | dashed | wavy`
    *
    * **Initial value**: `solid`
    *
    * @deprecated
    */
  var MozTextDecorationStyle: js.UndefOr[TextDecorationStyle] = js.native
  /**
    * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
    *
    * **Syntax**: `auto | none | enabled | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozUserInput: js.UndefOr[typings.csstype.mod.Property.MozUserInput] = js.native
  /**
    * The **`animation`** shorthand CSS property applies an animation between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    *
    * @deprecated
    */
  var OAnimation: js.UndefOr[Animation[TTime]] = js.native
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDelay: js.UndefOr[AnimationDelay[TTime]] = js.native
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var OAnimationDirection: js.UndefOr[AnimationDirection] = js.native
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDuration: js.UndefOr[AnimationDuration[TTime]] = js.native
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationFillMode: js.UndefOr[AnimationFillMode] = js.native
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var OAnimationIterationCount: js.UndefOr[AnimationIterationCount] = js.native
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationName: js.UndefOr[AnimationName] = js.native
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    *
    * @deprecated
    */
  var OAnimationPlayState: js.UndefOr[AnimationPlayState] = js.native
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OAnimationTimingFunction: js.UndefOr[AnimationTimingFunction] = js.native
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var OBackgroundSize: js.UndefOr[BackgroundSize[TLength]] = js.native
  /**
    * The **`border-image`** CSS property draws an image around a given element. It replaces the element's regular border.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    *
    * @deprecated
    */
  var OBorderImage: js.UndefOr[BorderImage] = js.native
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OTransform: js.UndefOr[Transform] = js.native
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    *
    * @deprecated
    */
  var OTransition: js.UndefOr[Transition[TTime]] = js.native
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDelay: js.UndefOr[TransitionDelay[TTime]] = js.native
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDuration: js.UndefOr[TransitionDuration[TTime]] = js.native
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    *
    * @deprecated
    */
  var OTransitionProperty: js.UndefOr[TransitionProperty] = js.native
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OTransitionTimingFunction: js.UndefOr[TransitionTimingFunction] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var WebkitBoxAlign: js.UndefOr[BoxAlign] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var WebkitBoxDirection: js.UndefOr[BoxDirection] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var WebkitBoxFlex: js.UndefOr[BoxFlex] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxFlexGroup: js.UndefOr[BoxFlexGroup] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var WebkitBoxLines: js.UndefOr[BoxLines] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxOrdinalGroup: js.UndefOr[BoxOrdinalGroup] = js.native
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var WebkitBoxOrient: js.UndefOr[BoxOrient] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var WebkitBoxPack: js.UndefOr[BoxPack] = js.native
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsX: js.UndefOr[ScrollSnapPointsX] = js.native
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsY: js.UndefOr[ScrollSnapPointsY] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var boxAlign: js.UndefOr[BoxAlign] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var boxDirection: js.UndefOr[BoxDirection] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var boxFlex: js.UndefOr[BoxFlex] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxFlexGroup: js.UndefOr[BoxFlexGroup] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var boxLines: js.UndefOr[BoxLines] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxOrdinalGroup: js.UndefOr[BoxOrdinalGroup] = js.native
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var boxOrient: js.UndefOr[BoxOrient] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var boxPack: js.UndefOr[BoxPack] = js.native
  /**
    * The **`clip`** CSS property defines what portion of an element is visible. The `clip` property applies only to absolutely positioned elements, that is elements with `position:absolute` or `position:fixed`.
    *
    * **Syntax**: `<shape> | auto`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var clip: js.UndefOr[Clip] = js.native
  /**
    * The **`font-variant-alternates`** CSS property controls the usage of alternate glyphs. These alternate glyphs may be referenced by alternative names defined in `@font-feature-values`.
    *
    * **Syntax**: `normal | [ stylistic( <feature-value-name> ) || historical-forms || styleset( <feature-value-name># ) || character-variant( <feature-value-name># ) || swash( <feature-value-name> ) || ornaments( <feature-value-name> ) || annotation( <feature-value-name> ) ]`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var fontVariantAlternates: js.UndefOr[FontVariantAlternates] = js.native
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridColumnGap: js.UndefOr[GridColumnGap[TLength]] = js.native
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * **Syntax**: `<'grid-row-gap'> <'grid-column-gap'>?`
    *
    * @deprecated
    */
  var gridGap: js.UndefOr[GridGap[TLength]] = js.native
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridRowGap: js.UndefOr[GridRowGap[TLength]] = js.native
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var imeMode: js.UndefOr[ImeMode] = js.native
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var msImeMode: js.UndefOr[ImeMode] = js.native
  /**
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var msScrollbarTrackColor: js.UndefOr[MsScrollbarTrackColor] = js.native
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlock: js.UndefOr[InsetBlock[TLength]] = js.native
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockEnd: js.UndefOr[InsetBlockEnd[TLength]] = js.native
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockStart: js.UndefOr[InsetBlockStart[TLength]] = js.native
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInline: js.UndefOr[InsetInline[TLength]] = js.native
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineEnd: js.UndefOr[InsetInlineEnd[TLength]] = js.native
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineStart: js.UndefOr[InsetInlineStart[TLength]] = js.native
  /**
    * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
    *
    * **Syntax**: `none | <position>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapCoordinate: js.UndefOr[ScrollSnapCoordinate[TLength]] = js.native
  /**
    * The **`scroll-snap-destination`** CSS property defines the position in x and y coordinates within the scroll container's visual viewport which element snap points align with.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `0px 0px`
    *
    * @deprecated
    */
  var scrollSnapDestination: js.UndefOr[ScrollSnapDestination[TLength]] = js.native
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsX: js.UndefOr[ScrollSnapPointsX] = js.native
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsY: js.UndefOr[ScrollSnapPointsY] = js.native
  /**
    * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeX: js.UndefOr[ScrollSnapTypeX] = js.native
  /**
    * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeY: js.UndefOr[ScrollSnapTypeY] = js.native
  /**
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var scrollbarTrackColor: js.UndefOr[MsScrollbarTrackColor] = js.native
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var textCombineHorizontal: js.UndefOr[TextCombineUpright] = js.native
}

object ObsoleteProperties {
  @scala.inline
  def apply[TLength, TTime](): ObsoleteProperties[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObsoleteProperties[TLength, TTime]]
  }
  @scala.inline
  implicit class ObsoletePropertiesOps[Self <: ObsoleteProperties[_, _], TLength, TTime] (val x: Self with (ObsoleteProperties[TLength, TTime])) extends AnyVal {
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
    def setKhtmlBoxAlign(value: BoxAlign): Self = this.set("KhtmlBoxAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKhtmlBoxAlign: Self = this.set("KhtmlBoxAlign", js.undefined)
    @scala.inline
    def setKhtmlBoxDirection(value: BoxDirection): Self = this.set("KhtmlBoxDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKhtmlBoxDirection: Self = this.set("KhtmlBoxDirection", js.undefined)
    @scala.inline
    def setKhtmlBoxFlex(value: BoxFlex): Self = this.set("KhtmlBoxFlex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKhtmlBoxFlex: Self = this.set("KhtmlBoxFlex", js.undefined)
    @scala.inline
    def setKhtmlBoxFlexGroup(value: BoxFlexGroup): Self = this.set("KhtmlBoxFlexGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKhtmlBoxFlexGroup: Self = this.set("KhtmlBoxFlexGroup", js.undefined)
    @scala.inline
    def setKhtmlBoxLines(value: BoxLines): Self = this.set("KhtmlBoxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKhtmlBoxLines: Self = this.set("KhtmlBoxLines", js.undefined)
    @scala.inline
    def setKhtmlBoxOrdinalGroup(value: BoxOrdinalGroup): Self = this.set("KhtmlBoxOrdinalGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKhtmlBoxOrdinalGroup: Self = this.set("KhtmlBoxOrdinalGroup", js.undefined)
    @scala.inline
    def setKhtmlBoxOrient(value: BoxOrient): Self = this.set("KhtmlBoxOrient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKhtmlBoxOrient: Self = this.set("KhtmlBoxOrient", js.undefined)
    @scala.inline
    def setKhtmlBoxPack(value: BoxPack): Self = this.set("KhtmlBoxPack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKhtmlBoxPack: Self = this.set("KhtmlBoxPack", js.undefined)
    @scala.inline
    def setKhtmlLineBreak(value: LineBreak): Self = this.set("KhtmlLineBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKhtmlLineBreak: Self = this.set("KhtmlLineBreak", js.undefined)
    @scala.inline
    def setKhtmlOpacity(value: Opacity): Self = this.set("KhtmlOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKhtmlOpacity: Self = this.set("KhtmlOpacity", js.undefined)
    @scala.inline
    def setKhtmlUserSelect(value: UserSelect): Self = this.set("KhtmlUserSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKhtmlUserSelect: Self = this.set("KhtmlUserSelect", js.undefined)
    @scala.inline
    def setMozBackgroundClip(value: BackgroundClip): Self = this.set("MozBackgroundClip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBackgroundClip: Self = this.set("MozBackgroundClip", js.undefined)
    @scala.inline
    def setMozBackgroundInlinePolicy(value: BoxDecorationBreak): Self = this.set("MozBackgroundInlinePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBackgroundInlinePolicy: Self = this.set("MozBackgroundInlinePolicy", js.undefined)
    @scala.inline
    def setMozBackgroundOrigin(value: BackgroundOrigin): Self = this.set("MozBackgroundOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBackgroundOrigin: Self = this.set("MozBackgroundOrigin", js.undefined)
    @scala.inline
    def setMozBackgroundSize(value: BackgroundSize[TLength]): Self = this.set("MozBackgroundSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBackgroundSize: Self = this.set("MozBackgroundSize", js.undefined)
    @scala.inline
    def setMozBinding(value: MozBinding): Self = this.set("MozBinding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBinding: Self = this.set("MozBinding", js.undefined)
    @scala.inline
    def setMozBorderRadius(value: BorderRadius[TLength]): Self = this.set("MozBorderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBorderRadius: Self = this.set("MozBorderRadius", js.undefined)
    @scala.inline
    def setMozBorderRadiusBottomleft(value: BorderBottomLeftRadius[TLength]): Self = this.set("MozBorderRadiusBottomleft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBorderRadiusBottomleft: Self = this.set("MozBorderRadiusBottomleft", js.undefined)
    @scala.inline
    def setMozBorderRadiusBottomright(value: BorderBottomRightRadius[TLength]): Self = this.set("MozBorderRadiusBottomright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBorderRadiusBottomright: Self = this.set("MozBorderRadiusBottomright", js.undefined)
    @scala.inline
    def setMozBorderRadiusTopleft(value: BorderTopLeftRadius[TLength]): Self = this.set("MozBorderRadiusTopleft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBorderRadiusTopleft: Self = this.set("MozBorderRadiusTopleft", js.undefined)
    @scala.inline
    def setMozBorderRadiusTopright(value: BorderTopRightRadius[TLength]): Self = this.set("MozBorderRadiusTopright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBorderRadiusTopright: Self = this.set("MozBorderRadiusTopright", js.undefined)
    @scala.inline
    def setMozBoxAlign(value: BoxAlign): Self = this.set("MozBoxAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBoxAlign: Self = this.set("MozBoxAlign", js.undefined)
    @scala.inline
    def setMozBoxDirection(value: BoxDirection): Self = this.set("MozBoxDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBoxDirection: Self = this.set("MozBoxDirection", js.undefined)
    @scala.inline
    def setMozBoxFlex(value: BoxFlex): Self = this.set("MozBoxFlex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBoxFlex: Self = this.set("MozBoxFlex", js.undefined)
    @scala.inline
    def setMozBoxOrdinalGroup(value: BoxOrdinalGroup): Self = this.set("MozBoxOrdinalGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBoxOrdinalGroup: Self = this.set("MozBoxOrdinalGroup", js.undefined)
    @scala.inline
    def setMozBoxOrient(value: BoxOrient): Self = this.set("MozBoxOrient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBoxOrient: Self = this.set("MozBoxOrient", js.undefined)
    @scala.inline
    def setMozBoxPack(value: BoxPack): Self = this.set("MozBoxPack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBoxPack: Self = this.set("MozBoxPack", js.undefined)
    @scala.inline
    def setMozBoxShadow(value: BoxShadow): Self = this.set("MozBoxShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozBoxShadow: Self = this.set("MozBoxShadow", js.undefined)
    @scala.inline
    def setMozOpacity(value: Opacity): Self = this.set("MozOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozOpacity: Self = this.set("MozOpacity", js.undefined)
    @scala.inline
    def setMozOutline(value: Outline[TLength]): Self = this.set("MozOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozOutline: Self = this.set("MozOutline", js.undefined)
    @scala.inline
    def setMozOutlineColor(value: OutlineColor): Self = this.set("MozOutlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozOutlineColor: Self = this.set("MozOutlineColor", js.undefined)
    @scala.inline
    def setMozOutlineRadius(value: MozOutlineRadius[TLength]): Self = this.set("MozOutlineRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozOutlineRadius: Self = this.set("MozOutlineRadius", js.undefined)
    @scala.inline
    def setMozOutlineStyle(value: OutlineStyle): Self = this.set("MozOutlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozOutlineStyle: Self = this.set("MozOutlineStyle", js.undefined)
    @scala.inline
    def setMozOutlineWidth(value: OutlineWidth[TLength]): Self = this.set("MozOutlineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozOutlineWidth: Self = this.set("MozOutlineWidth", js.undefined)
    @scala.inline
    def setMozTextAlignLast(value: TextAlignLast): Self = this.set("MozTextAlignLast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozTextAlignLast: Self = this.set("MozTextAlignLast", js.undefined)
    @scala.inline
    def setMozTextDecorationColor(value: TextDecorationColor): Self = this.set("MozTextDecorationColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozTextDecorationColor: Self = this.set("MozTextDecorationColor", js.undefined)
    @scala.inline
    def setMozTextDecorationLine(value: TextDecorationLine): Self = this.set("MozTextDecorationLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozTextDecorationLine: Self = this.set("MozTextDecorationLine", js.undefined)
    @scala.inline
    def setMozTextDecorationStyle(value: TextDecorationStyle): Self = this.set("MozTextDecorationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozTextDecorationStyle: Self = this.set("MozTextDecorationStyle", js.undefined)
    @scala.inline
    def setMozUserInput(value: MozUserInput): Self = this.set("MozUserInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMozUserInput: Self = this.set("MozUserInput", js.undefined)
    @scala.inline
    def setOAnimation(value: Animation[TTime]): Self = this.set("OAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOAnimation: Self = this.set("OAnimation", js.undefined)
    @scala.inline
    def setOAnimationDelay(value: AnimationDelay[TTime]): Self = this.set("OAnimationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOAnimationDelay: Self = this.set("OAnimationDelay", js.undefined)
    @scala.inline
    def setOAnimationDirection(value: AnimationDirection): Self = this.set("OAnimationDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOAnimationDirection: Self = this.set("OAnimationDirection", js.undefined)
    @scala.inline
    def setOAnimationDuration(value: AnimationDuration[TTime]): Self = this.set("OAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOAnimationDuration: Self = this.set("OAnimationDuration", js.undefined)
    @scala.inline
    def setOAnimationFillMode(value: AnimationFillMode): Self = this.set("OAnimationFillMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOAnimationFillMode: Self = this.set("OAnimationFillMode", js.undefined)
    @scala.inline
    def setOAnimationIterationCount(value: AnimationIterationCount): Self = this.set("OAnimationIterationCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOAnimationIterationCount: Self = this.set("OAnimationIterationCount", js.undefined)
    @scala.inline
    def setOAnimationName(value: AnimationName): Self = this.set("OAnimationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOAnimationName: Self = this.set("OAnimationName", js.undefined)
    @scala.inline
    def setOAnimationPlayState(value: AnimationPlayState): Self = this.set("OAnimationPlayState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOAnimationPlayState: Self = this.set("OAnimationPlayState", js.undefined)
    @scala.inline
    def setOAnimationTimingFunction(value: AnimationTimingFunction): Self = this.set("OAnimationTimingFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOAnimationTimingFunction: Self = this.set("OAnimationTimingFunction", js.undefined)
    @scala.inline
    def setOBackgroundSize(value: BackgroundSize[TLength]): Self = this.set("OBackgroundSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOBackgroundSize: Self = this.set("OBackgroundSize", js.undefined)
    @scala.inline
    def setOBorderImage(value: BorderImage): Self = this.set("OBorderImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOBorderImage: Self = this.set("OBorderImage", js.undefined)
    @scala.inline
    def setOTransform(value: Transform): Self = this.set("OTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOTransform: Self = this.set("OTransform", js.undefined)
    @scala.inline
    def setOTransition(value: Transition[TTime]): Self = this.set("OTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOTransition: Self = this.set("OTransition", js.undefined)
    @scala.inline
    def setOTransitionDelay(value: TransitionDelay[TTime]): Self = this.set("OTransitionDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOTransitionDelay: Self = this.set("OTransitionDelay", js.undefined)
    @scala.inline
    def setOTransitionDuration(value: TransitionDuration[TTime]): Self = this.set("OTransitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOTransitionDuration: Self = this.set("OTransitionDuration", js.undefined)
    @scala.inline
    def setOTransitionProperty(value: TransitionProperty): Self = this.set("OTransitionProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOTransitionProperty: Self = this.set("OTransitionProperty", js.undefined)
    @scala.inline
    def setOTransitionTimingFunction(value: TransitionTimingFunction): Self = this.set("OTransitionTimingFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOTransitionTimingFunction: Self = this.set("OTransitionTimingFunction", js.undefined)
    @scala.inline
    def setWebkitBoxAlign(value: BoxAlign): Self = this.set("WebkitBoxAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBoxAlign: Self = this.set("WebkitBoxAlign", js.undefined)
    @scala.inline
    def setWebkitBoxDirection(value: BoxDirection): Self = this.set("WebkitBoxDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBoxDirection: Self = this.set("WebkitBoxDirection", js.undefined)
    @scala.inline
    def setWebkitBoxFlex(value: BoxFlex): Self = this.set("WebkitBoxFlex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBoxFlex: Self = this.set("WebkitBoxFlex", js.undefined)
    @scala.inline
    def setWebkitBoxFlexGroup(value: BoxFlexGroup): Self = this.set("WebkitBoxFlexGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBoxFlexGroup: Self = this.set("WebkitBoxFlexGroup", js.undefined)
    @scala.inline
    def setWebkitBoxLines(value: BoxLines): Self = this.set("WebkitBoxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBoxLines: Self = this.set("WebkitBoxLines", js.undefined)
    @scala.inline
    def setWebkitBoxOrdinalGroup(value: BoxOrdinalGroup): Self = this.set("WebkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBoxOrdinalGroup: Self = this.set("WebkitBoxOrdinalGroup", js.undefined)
    @scala.inline
    def setWebkitBoxOrient(value: BoxOrient): Self = this.set("WebkitBoxOrient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBoxOrient: Self = this.set("WebkitBoxOrient", js.undefined)
    @scala.inline
    def setWebkitBoxPack(value: BoxPack): Self = this.set("WebkitBoxPack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitBoxPack: Self = this.set("WebkitBoxPack", js.undefined)
    @scala.inline
    def setWebkitScrollSnapPointsX(value: ScrollSnapPointsX): Self = this.set("WebkitScrollSnapPointsX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitScrollSnapPointsX: Self = this.set("WebkitScrollSnapPointsX", js.undefined)
    @scala.inline
    def setWebkitScrollSnapPointsY(value: ScrollSnapPointsY): Self = this.set("WebkitScrollSnapPointsY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebkitScrollSnapPointsY: Self = this.set("WebkitScrollSnapPointsY", js.undefined)
    @scala.inline
    def setBoxAlign(value: BoxAlign): Self = this.set("boxAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxAlign: Self = this.set("boxAlign", js.undefined)
    @scala.inline
    def setBoxDirection(value: BoxDirection): Self = this.set("boxDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxDirection: Self = this.set("boxDirection", js.undefined)
    @scala.inline
    def setBoxFlex(value: BoxFlex): Self = this.set("boxFlex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxFlex: Self = this.set("boxFlex", js.undefined)
    @scala.inline
    def setBoxFlexGroup(value: BoxFlexGroup): Self = this.set("boxFlexGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxFlexGroup: Self = this.set("boxFlexGroup", js.undefined)
    @scala.inline
    def setBoxLines(value: BoxLines): Self = this.set("boxLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxLines: Self = this.set("boxLines", js.undefined)
    @scala.inline
    def setBoxOrdinalGroup(value: BoxOrdinalGroup): Self = this.set("boxOrdinalGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxOrdinalGroup: Self = this.set("boxOrdinalGroup", js.undefined)
    @scala.inline
    def setBoxOrient(value: BoxOrient): Self = this.set("boxOrient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxOrient: Self = this.set("boxOrient", js.undefined)
    @scala.inline
    def setBoxPack(value: BoxPack): Self = this.set("boxPack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxPack: Self = this.set("boxPack", js.undefined)
    @scala.inline
    def setClip(value: Clip): Self = this.set("clip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    @scala.inline
    def setFontVariantAlternates(value: FontVariantAlternates): Self = this.set("fontVariantAlternates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariantAlternates: Self = this.set("fontVariantAlternates", js.undefined)
    @scala.inline
    def setGridColumnGap(value: GridColumnGap[TLength]): Self = this.set("gridColumnGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumnGap: Self = this.set("gridColumnGap", js.undefined)
    @scala.inline
    def setGridGap(value: GridGap[TLength]): Self = this.set("gridGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridGap: Self = this.set("gridGap", js.undefined)
    @scala.inline
    def setGridRowGap(value: GridRowGap[TLength]): Self = this.set("gridRowGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRowGap: Self = this.set("gridRowGap", js.undefined)
    @scala.inline
    def setImeMode(value: ImeMode): Self = this.set("imeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImeMode: Self = this.set("imeMode", js.undefined)
    @scala.inline
    def setMsImeMode(value: ImeMode): Self = this.set("msImeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsImeMode: Self = this.set("msImeMode", js.undefined)
    @scala.inline
    def setMsScrollbarTrackColor(value: MsScrollbarTrackColor): Self = this.set("msScrollbarTrackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsScrollbarTrackColor: Self = this.set("msScrollbarTrackColor", js.undefined)
    @scala.inline
    def setOffsetBlock(value: InsetBlock[TLength]): Self = this.set("offsetBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetBlock: Self = this.set("offsetBlock", js.undefined)
    @scala.inline
    def setOffsetBlockEnd(value: InsetBlockEnd[TLength]): Self = this.set("offsetBlockEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetBlockEnd: Self = this.set("offsetBlockEnd", js.undefined)
    @scala.inline
    def setOffsetBlockStart(value: InsetBlockStart[TLength]): Self = this.set("offsetBlockStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetBlockStart: Self = this.set("offsetBlockStart", js.undefined)
    @scala.inline
    def setOffsetInline(value: InsetInline[TLength]): Self = this.set("offsetInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetInline: Self = this.set("offsetInline", js.undefined)
    @scala.inline
    def setOffsetInlineEnd(value: InsetInlineEnd[TLength]): Self = this.set("offsetInlineEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetInlineEnd: Self = this.set("offsetInlineEnd", js.undefined)
    @scala.inline
    def setOffsetInlineStart(value: InsetInlineStart[TLength]): Self = this.set("offsetInlineStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetInlineStart: Self = this.set("offsetInlineStart", js.undefined)
    @scala.inline
    def setScrollSnapCoordinate(value: ScrollSnapCoordinate[TLength]): Self = this.set("scrollSnapCoordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSnapCoordinate: Self = this.set("scrollSnapCoordinate", js.undefined)
    @scala.inline
    def setScrollSnapDestination(value: ScrollSnapDestination[TLength]): Self = this.set("scrollSnapDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSnapDestination: Self = this.set("scrollSnapDestination", js.undefined)
    @scala.inline
    def setScrollSnapPointsX(value: ScrollSnapPointsX): Self = this.set("scrollSnapPointsX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSnapPointsX: Self = this.set("scrollSnapPointsX", js.undefined)
    @scala.inline
    def setScrollSnapPointsY(value: ScrollSnapPointsY): Self = this.set("scrollSnapPointsY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSnapPointsY: Self = this.set("scrollSnapPointsY", js.undefined)
    @scala.inline
    def setScrollSnapTypeX(value: ScrollSnapTypeX): Self = this.set("scrollSnapTypeX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSnapTypeX: Self = this.set("scrollSnapTypeX", js.undefined)
    @scala.inline
    def setScrollSnapTypeY(value: ScrollSnapTypeY): Self = this.set("scrollSnapTypeY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSnapTypeY: Self = this.set("scrollSnapTypeY", js.undefined)
    @scala.inline
    def setScrollbarTrackColor(value: MsScrollbarTrackColor): Self = this.set("scrollbarTrackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarTrackColor: Self = this.set("scrollbarTrackColor", js.undefined)
    @scala.inline
    def setTextCombineHorizontal(value: TextCombineUpright): Self = this.set("textCombineHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextCombineHorizontal: Self = this.set("textCombineHorizontal", js.undefined)
  }
  
}

