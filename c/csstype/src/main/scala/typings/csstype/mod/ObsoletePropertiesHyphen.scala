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
import scala.scalajs.js.annotation._

@js.native
trait ObsoletePropertiesHyphen[TLength, TTime] extends js.Object {
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var `-khtml-box-align`: js.UndefOr[BoxAlign] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-khtml-box-direction`: js.UndefOr[BoxDirection] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-khtml-box-flex`: js.UndefOr[BoxFlex] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-khtml-box-flex-group`: js.UndefOr[BoxFlexGroup] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var `-khtml-box-lines`: js.UndefOr[BoxLines] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-khtml-box-ordinal-group`: js.UndefOr[BoxOrdinalGroup] = js.native
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `-khtml-box-orient`: js.UndefOr[BoxOrient] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `-khtml-box-pack`: js.UndefOr[BoxPack] = js.native
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-khtml-line-break`: js.UndefOr[LineBreak] = js.native
  /**
    * The **`opacity`** CSS property sets the opacity of an element. Opacity is the degree to which content behind an element is hidden, and is the opposite of transparency.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var `-khtml-opacity`: js.UndefOr[Opacity] = js.native
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-khtml-user-select`: js.UndefOr[UserSelect] = js.native
  /**
    * The **`background-clip`** CSS property sets whether an element's background extends underneath its border box, padding box, or content box.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `border-box`
    *
    * @deprecated
    */
  var `-moz-background-clip`: js.UndefOr[BackgroundClip] = js.native
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Syntax**: `slice | clone`
    *
    * **Initial value**: `slice`
    *
    * @deprecated
    */
  var `-moz-background-inline-policy`: js.UndefOr[BoxDecorationBreak] = js.native
  /**
    * The **`background-origin`** CSS property sets the background's origin: from the border start, inside the border, or inside the padding.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `padding-box`
    *
    * @deprecated
    */
  var `-moz-background-origin`: js.UndefOr[BackgroundOrigin] = js.native
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var `-moz-background-size`: js.UndefOr[BackgroundSize[TLength]] = js.native
  /**
    * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
    *
    * **Syntax**: `<url> | none`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-binding`: js.UndefOr[MozBinding] = js.native
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    *
    * @deprecated
    */
  var `-moz-border-radius`: js.UndefOr[BorderRadius[TLength]] = js.native
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-border-radius-bottomleft`: js.UndefOr[BorderBottomLeftRadius[TLength]] = js.native
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-border-radius-bottomright`: js.UndefOr[BorderBottomRightRadius[TLength]] = js.native
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-border-radius-topleft`: js.UndefOr[BorderTopLeftRadius[TLength]] = js.native
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-border-radius-topright`: js.UndefOr[BorderTopRightRadius[TLength]] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var `-moz-box-align`: js.UndefOr[BoxAlign] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-moz-box-direction`: js.UndefOr[BoxDirection] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-box-flex`: js.UndefOr[BoxFlex] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-moz-box-ordinal-group`: js.UndefOr[BoxOrdinalGroup] = js.native
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `-moz-box-orient`: js.UndefOr[BoxOrient] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `-moz-box-pack`: js.UndefOr[BoxPack] = js.native
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Syntax**: `none | <shadow>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-box-shadow`: js.UndefOr[BoxShadow] = js.native
  /**
    * The **`opacity`** CSS property sets the opacity of an element. Opacity is the degree to which content behind an element is hidden, and is the opposite of transparency.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var `-moz-opacity`: js.UndefOr[Opacity] = js.native
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
    *
    * @deprecated
    */
  var `-moz-outline`: js.UndefOr[Outline[TLength]] = js.native
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Syntax**: `<color> | invert`
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * @deprecated
    */
  var `-moz-outline-color`: js.UndefOr[OutlineColor] = js.native
  /**
    * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS property can be used to give an element's `outline` rounded corners.
    *
    * **Syntax**: `<outline-radius>{1,4} [ / <outline-radius>{1,4} ]?`
    *
    * @deprecated
    */
  var `-moz-outline-radius`: js.UndefOr[MozOutlineRadius[TLength]] = js.native
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `auto | <'border-style'>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-outline-style`: js.UndefOr[OutlineStyle] = js.native
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * @deprecated
    */
  var `-moz-outline-width`: js.UndefOr[OutlineWidth[TLength]] = js.native
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Syntax**: `auto | start | end | left | right | center | justify`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-moz-text-align-last`: js.UndefOr[TextAlignLast] = js.native
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * @deprecated
    */
  var `-moz-text-decoration-color`: js.UndefOr[TextDecorationColor] = js.native
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-text-decoration-line`: js.UndefOr[TextDecorationLine] = js.native
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Syntax**: `solid | double | dotted | dashed | wavy`
    *
    * **Initial value**: `solid`
    *
    * @deprecated
    */
  var `-moz-text-decoration-style`: js.UndefOr[TextDecorationStyle] = js.native
  /**
    * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
    *
    * **Syntax**: `auto | none | enabled | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-moz-user-input`: js.UndefOr[MozUserInput] = js.native
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-ms-ime-mode`: js.UndefOr[ImeMode] = js.native
  /**
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var `-ms-scrollbar-track-color`: js.UndefOr[MsScrollbarTrackColor] = js.native
  /**
    * The **`animation`** shorthand CSS property applies an animation between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    *
    * @deprecated
    */
  var `-o-animation`: js.UndefOr[Animation[TTime]] = js.native
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-animation-delay`: js.UndefOr[AnimationDelay[TTime]] = js.native
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-o-animation-direction`: js.UndefOr[AnimationDirection] = js.native
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-animation-duration`: js.UndefOr[AnimationDuration[TTime]] = js.native
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-o-animation-fill-mode`: js.UndefOr[AnimationFillMode] = js.native
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-o-animation-iteration-count`: js.UndefOr[AnimationIterationCount] = js.native
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-o-animation-name`: js.UndefOr[AnimationName] = js.native
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    *
    * @deprecated
    */
  var `-o-animation-play-state`: js.UndefOr[AnimationPlayState] = js.native
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var `-o-animation-timing-function`: js.UndefOr[AnimationTimingFunction] = js.native
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var `-o-background-size`: js.UndefOr[BackgroundSize[TLength]] = js.native
  /**
    * The **`border-image`** CSS property draws an image around a given element. It replaces the element's regular border.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    *
    * @deprecated
    */
  var `-o-border-image`: js.UndefOr[BorderImage] = js.native
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-o-transform`: js.UndefOr[Transform] = js.native
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    *
    * @deprecated
    */
  var `-o-transition`: js.UndefOr[Transition[TTime]] = js.native
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-transition-delay`: js.UndefOr[TransitionDelay[TTime]] = js.native
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-transition-duration`: js.UndefOr[TransitionDuration[TTime]] = js.native
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    *
    * @deprecated
    */
  var `-o-transition-property`: js.UndefOr[TransitionProperty] = js.native
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var `-o-transition-timing-function`: js.UndefOr[TransitionTimingFunction] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var `-webkit-box-align`: js.UndefOr[BoxAlign] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-webkit-box-direction`: js.UndefOr[BoxDirection] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-webkit-box-flex`: js.UndefOr[BoxFlex] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-webkit-box-flex-group`: js.UndefOr[BoxFlexGroup] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var `-webkit-box-lines`: js.UndefOr[BoxLines] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-webkit-box-ordinal-group`: js.UndefOr[BoxOrdinalGroup] = js.native
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `-webkit-box-orient`: js.UndefOr[BoxOrient] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `-webkit-box-pack`: js.UndefOr[BoxPack] = js.native
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-webkit-scroll-snap-points-x`: js.UndefOr[ScrollSnapPointsX] = js.native
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-webkit-scroll-snap-points-y`: js.UndefOr[ScrollSnapPointsY] = js.native
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var `box-align`: js.UndefOr[BoxAlign] = js.native
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `box-direction`: js.UndefOr[BoxDirection] = js.native
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `box-flex`: js.UndefOr[BoxFlex] = js.native
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `box-flex-group`: js.UndefOr[BoxFlexGroup] = js.native
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var `box-lines`: js.UndefOr[BoxLines] = js.native
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `box-ordinal-group`: js.UndefOr[BoxOrdinalGroup] = js.native
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `box-orient`: js.UndefOr[BoxOrient] = js.native
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `box-pack`: js.UndefOr[BoxPack] = js.native
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
  var `font-variant-alternates`: js.UndefOr[FontVariantAlternates] = js.native
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `grid-column-gap`: js.UndefOr[GridColumnGap[TLength]] = js.native
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * **Syntax**: `<'grid-row-gap'> <'grid-column-gap'>?`
    *
    * @deprecated
    */
  var `grid-gap`: js.UndefOr[GridGap[TLength]] = js.native
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `grid-row-gap`: js.UndefOr[GridRowGap[TLength]] = js.native
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `ime-mode`: js.UndefOr[ImeMode] = js.native
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-block`: js.UndefOr[InsetBlock[TLength]] = js.native
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-block-end`: js.UndefOr[InsetBlockEnd[TLength]] = js.native
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-block-start`: js.UndefOr[InsetBlockStart[TLength]] = js.native
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-inline`: js.UndefOr[InsetInline[TLength]] = js.native
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-inline-end`: js.UndefOr[InsetInlineEnd[TLength]] = js.native
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-inline-start`: js.UndefOr[InsetInlineStart[TLength]] = js.native
  /**
    * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
    *
    * **Syntax**: `none | <position>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-coordinate`: js.UndefOr[ScrollSnapCoordinate[TLength]] = js.native
  /**
    * The **`scroll-snap-destination`** CSS property defines the position in x and y coordinates within the scroll container's visual viewport which element snap points align with.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `0px 0px`
    *
    * @deprecated
    */
  var `scroll-snap-destination`: js.UndefOr[ScrollSnapDestination[TLength]] = js.native
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-points-x`: js.UndefOr[ScrollSnapPointsX] = js.native
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-points-y`: js.UndefOr[ScrollSnapPointsY] = js.native
  /**
    * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-type-x`: js.UndefOr[ScrollSnapTypeX] = js.native
  /**
    * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-type-y`: js.UndefOr[ScrollSnapTypeY] = js.native
  /**
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var `scrollbar-track-color`: js.UndefOr[MsScrollbarTrackColor] = js.native
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `text-combine-horizontal`: js.UndefOr[TextCombineUpright] = js.native
}

object ObsoletePropertiesHyphen {
  @scala.inline
  def apply[TLength, TTime](): ObsoletePropertiesHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObsoletePropertiesHyphen[TLength, TTime]]
  }
  @scala.inline
  implicit class ObsoletePropertiesHyphenOps[Self <: ObsoletePropertiesHyphen[_, _], TLength, TTime] (val x: Self with (ObsoletePropertiesHyphen[TLength, TTime])) extends AnyVal {
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
    def `set-khtml-box-align`(value: BoxAlign): Self = this.set("-khtml-box-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-khtml-box-align`: Self = this.set("-khtml-box-align", js.undefined)
    @scala.inline
    def `set-khtml-box-direction`(value: BoxDirection): Self = this.set("-khtml-box-direction", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-khtml-box-direction`: Self = this.set("-khtml-box-direction", js.undefined)
    @scala.inline
    def `set-khtml-box-flex`(value: BoxFlex): Self = this.set("-khtml-box-flex", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-khtml-box-flex`: Self = this.set("-khtml-box-flex", js.undefined)
    @scala.inline
    def `set-khtml-box-flex-group`(value: BoxFlexGroup): Self = this.set("-khtml-box-flex-group", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-khtml-box-flex-group`: Self = this.set("-khtml-box-flex-group", js.undefined)
    @scala.inline
    def `set-khtml-box-lines`(value: BoxLines): Self = this.set("-khtml-box-lines", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-khtml-box-lines`: Self = this.set("-khtml-box-lines", js.undefined)
    @scala.inline
    def `set-khtml-box-ordinal-group`(value: BoxOrdinalGroup): Self = this.set("-khtml-box-ordinal-group", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-khtml-box-ordinal-group`: Self = this.set("-khtml-box-ordinal-group", js.undefined)
    @scala.inline
    def `set-khtml-box-orient`(value: BoxOrient): Self = this.set("-khtml-box-orient", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-khtml-box-orient`: Self = this.set("-khtml-box-orient", js.undefined)
    @scala.inline
    def `set-khtml-box-pack`(value: BoxPack): Self = this.set("-khtml-box-pack", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-khtml-box-pack`: Self = this.set("-khtml-box-pack", js.undefined)
    @scala.inline
    def `set-khtml-line-break`(value: LineBreak): Self = this.set("-khtml-line-break", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-khtml-line-break`: Self = this.set("-khtml-line-break", js.undefined)
    @scala.inline
    def `set-khtml-opacity`(value: Opacity): Self = this.set("-khtml-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-khtml-opacity`: Self = this.set("-khtml-opacity", js.undefined)
    @scala.inline
    def `set-khtml-user-select`(value: UserSelect): Self = this.set("-khtml-user-select", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-khtml-user-select`: Self = this.set("-khtml-user-select", js.undefined)
    @scala.inline
    def `set-moz-background-clip`(value: BackgroundClip): Self = this.set("-moz-background-clip", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-background-clip`: Self = this.set("-moz-background-clip", js.undefined)
    @scala.inline
    def `set-moz-background-inline-policy`(value: BoxDecorationBreak): Self = this.set("-moz-background-inline-policy", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-background-inline-policy`: Self = this.set("-moz-background-inline-policy", js.undefined)
    @scala.inline
    def `set-moz-background-origin`(value: BackgroundOrigin): Self = this.set("-moz-background-origin", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-background-origin`: Self = this.set("-moz-background-origin", js.undefined)
    @scala.inline
    def `set-moz-background-size`(value: BackgroundSize[TLength]): Self = this.set("-moz-background-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-background-size`: Self = this.set("-moz-background-size", js.undefined)
    @scala.inline
    def `set-moz-binding`(value: MozBinding): Self = this.set("-moz-binding", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-binding`: Self = this.set("-moz-binding", js.undefined)
    @scala.inline
    def `set-moz-border-radius`(value: BorderRadius[TLength]): Self = this.set("-moz-border-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-border-radius`: Self = this.set("-moz-border-radius", js.undefined)
    @scala.inline
    def `set-moz-border-radius-bottomleft`(value: BorderBottomLeftRadius[TLength]): Self = this.set("-moz-border-radius-bottomleft", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-border-radius-bottomleft`: Self = this.set("-moz-border-radius-bottomleft", js.undefined)
    @scala.inline
    def `set-moz-border-radius-bottomright`(value: BorderBottomRightRadius[TLength]): Self = this.set("-moz-border-radius-bottomright", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-border-radius-bottomright`: Self = this.set("-moz-border-radius-bottomright", js.undefined)
    @scala.inline
    def `set-moz-border-radius-topleft`(value: BorderTopLeftRadius[TLength]): Self = this.set("-moz-border-radius-topleft", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-border-radius-topleft`: Self = this.set("-moz-border-radius-topleft", js.undefined)
    @scala.inline
    def `set-moz-border-radius-topright`(value: BorderTopRightRadius[TLength]): Self = this.set("-moz-border-radius-topright", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-border-radius-topright`: Self = this.set("-moz-border-radius-topright", js.undefined)
    @scala.inline
    def `set-moz-box-align`(value: BoxAlign): Self = this.set("-moz-box-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-box-align`: Self = this.set("-moz-box-align", js.undefined)
    @scala.inline
    def `set-moz-box-direction`(value: BoxDirection): Self = this.set("-moz-box-direction", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-box-direction`: Self = this.set("-moz-box-direction", js.undefined)
    @scala.inline
    def `set-moz-box-flex`(value: BoxFlex): Self = this.set("-moz-box-flex", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-box-flex`: Self = this.set("-moz-box-flex", js.undefined)
    @scala.inline
    def `set-moz-box-ordinal-group`(value: BoxOrdinalGroup): Self = this.set("-moz-box-ordinal-group", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-box-ordinal-group`: Self = this.set("-moz-box-ordinal-group", js.undefined)
    @scala.inline
    def `set-moz-box-orient`(value: BoxOrient): Self = this.set("-moz-box-orient", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-box-orient`: Self = this.set("-moz-box-orient", js.undefined)
    @scala.inline
    def `set-moz-box-pack`(value: BoxPack): Self = this.set("-moz-box-pack", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-box-pack`: Self = this.set("-moz-box-pack", js.undefined)
    @scala.inline
    def `set-moz-box-shadow`(value: BoxShadow): Self = this.set("-moz-box-shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-box-shadow`: Self = this.set("-moz-box-shadow", js.undefined)
    @scala.inline
    def `set-moz-opacity`(value: Opacity): Self = this.set("-moz-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-opacity`: Self = this.set("-moz-opacity", js.undefined)
    @scala.inline
    def `set-moz-outline`(value: Outline[TLength]): Self = this.set("-moz-outline", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-outline`: Self = this.set("-moz-outline", js.undefined)
    @scala.inline
    def `set-moz-outline-color`(value: OutlineColor): Self = this.set("-moz-outline-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-outline-color`: Self = this.set("-moz-outline-color", js.undefined)
    @scala.inline
    def `set-moz-outline-radius`(value: MozOutlineRadius[TLength]): Self = this.set("-moz-outline-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-outline-radius`: Self = this.set("-moz-outline-radius", js.undefined)
    @scala.inline
    def `set-moz-outline-style`(value: OutlineStyle): Self = this.set("-moz-outline-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-outline-style`: Self = this.set("-moz-outline-style", js.undefined)
    @scala.inline
    def `set-moz-outline-width`(value: OutlineWidth[TLength]): Self = this.set("-moz-outline-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-outline-width`: Self = this.set("-moz-outline-width", js.undefined)
    @scala.inline
    def `set-moz-text-align-last`(value: TextAlignLast): Self = this.set("-moz-text-align-last", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-text-align-last`: Self = this.set("-moz-text-align-last", js.undefined)
    @scala.inline
    def `set-moz-text-decoration-color`(value: TextDecorationColor): Self = this.set("-moz-text-decoration-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-text-decoration-color`: Self = this.set("-moz-text-decoration-color", js.undefined)
    @scala.inline
    def `set-moz-text-decoration-line`(value: TextDecorationLine): Self = this.set("-moz-text-decoration-line", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-text-decoration-line`: Self = this.set("-moz-text-decoration-line", js.undefined)
    @scala.inline
    def `set-moz-text-decoration-style`(value: TextDecorationStyle): Self = this.set("-moz-text-decoration-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-text-decoration-style`: Self = this.set("-moz-text-decoration-style", js.undefined)
    @scala.inline
    def `set-moz-user-input`(value: MozUserInput): Self = this.set("-moz-user-input", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-user-input`: Self = this.set("-moz-user-input", js.undefined)
    @scala.inline
    def `set-ms-ime-mode`(value: ImeMode): Self = this.set("-ms-ime-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-ime-mode`: Self = this.set("-ms-ime-mode", js.undefined)
    @scala.inline
    def `set-ms-scrollbar-track-color`(value: MsScrollbarTrackColor): Self = this.set("-ms-scrollbar-track-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-scrollbar-track-color`: Self = this.set("-ms-scrollbar-track-color", js.undefined)
    @scala.inline
    def `set-o-animation`(value: Animation[TTime]): Self = this.set("-o-animation", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-animation`: Self = this.set("-o-animation", js.undefined)
    @scala.inline
    def `set-o-animation-delay`(value: AnimationDelay[TTime]): Self = this.set("-o-animation-delay", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-animation-delay`: Self = this.set("-o-animation-delay", js.undefined)
    @scala.inline
    def `set-o-animation-direction`(value: AnimationDirection): Self = this.set("-o-animation-direction", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-animation-direction`: Self = this.set("-o-animation-direction", js.undefined)
    @scala.inline
    def `set-o-animation-duration`(value: AnimationDuration[TTime]): Self = this.set("-o-animation-duration", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-animation-duration`: Self = this.set("-o-animation-duration", js.undefined)
    @scala.inline
    def `set-o-animation-fill-mode`(value: AnimationFillMode): Self = this.set("-o-animation-fill-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-animation-fill-mode`: Self = this.set("-o-animation-fill-mode", js.undefined)
    @scala.inline
    def `set-o-animation-iteration-count`(value: AnimationIterationCount): Self = this.set("-o-animation-iteration-count", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-animation-iteration-count`: Self = this.set("-o-animation-iteration-count", js.undefined)
    @scala.inline
    def `set-o-animation-name`(value: AnimationName): Self = this.set("-o-animation-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-animation-name`: Self = this.set("-o-animation-name", js.undefined)
    @scala.inline
    def `set-o-animation-play-state`(value: AnimationPlayState): Self = this.set("-o-animation-play-state", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-animation-play-state`: Self = this.set("-o-animation-play-state", js.undefined)
    @scala.inline
    def `set-o-animation-timing-function`(value: AnimationTimingFunction): Self = this.set("-o-animation-timing-function", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-animation-timing-function`: Self = this.set("-o-animation-timing-function", js.undefined)
    @scala.inline
    def `set-o-background-size`(value: BackgroundSize[TLength]): Self = this.set("-o-background-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-background-size`: Self = this.set("-o-background-size", js.undefined)
    @scala.inline
    def `set-o-border-image`(value: BorderImage): Self = this.set("-o-border-image", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-border-image`: Self = this.set("-o-border-image", js.undefined)
    @scala.inline
    def `set-o-transform`(value: Transform): Self = this.set("-o-transform", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-transform`: Self = this.set("-o-transform", js.undefined)
    @scala.inline
    def `set-o-transition`(value: Transition[TTime]): Self = this.set("-o-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-transition`: Self = this.set("-o-transition", js.undefined)
    @scala.inline
    def `set-o-transition-delay`(value: TransitionDelay[TTime]): Self = this.set("-o-transition-delay", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-transition-delay`: Self = this.set("-o-transition-delay", js.undefined)
    @scala.inline
    def `set-o-transition-duration`(value: TransitionDuration[TTime]): Self = this.set("-o-transition-duration", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-transition-duration`: Self = this.set("-o-transition-duration", js.undefined)
    @scala.inline
    def `set-o-transition-property`(value: TransitionProperty): Self = this.set("-o-transition-property", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-transition-property`: Self = this.set("-o-transition-property", js.undefined)
    @scala.inline
    def `set-o-transition-timing-function`(value: TransitionTimingFunction): Self = this.set("-o-transition-timing-function", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-o-transition-timing-function`: Self = this.set("-o-transition-timing-function", js.undefined)
    @scala.inline
    def `set-webkit-box-align`(value: BoxAlign): Self = this.set("-webkit-box-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-box-align`: Self = this.set("-webkit-box-align", js.undefined)
    @scala.inline
    def `set-webkit-box-direction`(value: BoxDirection): Self = this.set("-webkit-box-direction", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-box-direction`: Self = this.set("-webkit-box-direction", js.undefined)
    @scala.inline
    def `set-webkit-box-flex`(value: BoxFlex): Self = this.set("-webkit-box-flex", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-box-flex`: Self = this.set("-webkit-box-flex", js.undefined)
    @scala.inline
    def `set-webkit-box-flex-group`(value: BoxFlexGroup): Self = this.set("-webkit-box-flex-group", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-box-flex-group`: Self = this.set("-webkit-box-flex-group", js.undefined)
    @scala.inline
    def `set-webkit-box-lines`(value: BoxLines): Self = this.set("-webkit-box-lines", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-box-lines`: Self = this.set("-webkit-box-lines", js.undefined)
    @scala.inline
    def `set-webkit-box-ordinal-group`(value: BoxOrdinalGroup): Self = this.set("-webkit-box-ordinal-group", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-box-ordinal-group`: Self = this.set("-webkit-box-ordinal-group", js.undefined)
    @scala.inline
    def `set-webkit-box-orient`(value: BoxOrient): Self = this.set("-webkit-box-orient", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-box-orient`: Self = this.set("-webkit-box-orient", js.undefined)
    @scala.inline
    def `set-webkit-box-pack`(value: BoxPack): Self = this.set("-webkit-box-pack", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-box-pack`: Self = this.set("-webkit-box-pack", js.undefined)
    @scala.inline
    def `set-webkit-scroll-snap-points-x`(value: ScrollSnapPointsX): Self = this.set("-webkit-scroll-snap-points-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-scroll-snap-points-x`: Self = this.set("-webkit-scroll-snap-points-x", js.undefined)
    @scala.inline
    def `set-webkit-scroll-snap-points-y`(value: ScrollSnapPointsY): Self = this.set("-webkit-scroll-snap-points-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-scroll-snap-points-y`: Self = this.set("-webkit-scroll-snap-points-y", js.undefined)
    @scala.inline
    def `setBox-align`(value: BoxAlign): Self = this.set("box-align", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBox-align`: Self = this.set("box-align", js.undefined)
    @scala.inline
    def `setBox-direction`(value: BoxDirection): Self = this.set("box-direction", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBox-direction`: Self = this.set("box-direction", js.undefined)
    @scala.inline
    def `setBox-flex`(value: BoxFlex): Self = this.set("box-flex", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBox-flex`: Self = this.set("box-flex", js.undefined)
    @scala.inline
    def `setBox-flex-group`(value: BoxFlexGroup): Self = this.set("box-flex-group", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBox-flex-group`: Self = this.set("box-flex-group", js.undefined)
    @scala.inline
    def `setBox-lines`(value: BoxLines): Self = this.set("box-lines", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBox-lines`: Self = this.set("box-lines", js.undefined)
    @scala.inline
    def `setBox-ordinal-group`(value: BoxOrdinalGroup): Self = this.set("box-ordinal-group", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBox-ordinal-group`: Self = this.set("box-ordinal-group", js.undefined)
    @scala.inline
    def `setBox-orient`(value: BoxOrient): Self = this.set("box-orient", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBox-orient`: Self = this.set("box-orient", js.undefined)
    @scala.inline
    def `setBox-pack`(value: BoxPack): Self = this.set("box-pack", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBox-pack`: Self = this.set("box-pack", js.undefined)
    @scala.inline
    def setClip(value: Clip): Self = this.set("clip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    @scala.inline
    def `setFont-variant-alternates`(value: FontVariantAlternates): Self = this.set("font-variant-alternates", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variant-alternates`: Self = this.set("font-variant-alternates", js.undefined)
    @scala.inline
    def `setGrid-column-gap`(value: GridColumnGap[TLength]): Self = this.set("grid-column-gap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-column-gap`: Self = this.set("grid-column-gap", js.undefined)
    @scala.inline
    def `setGrid-gap`(value: GridGap[TLength]): Self = this.set("grid-gap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-gap`: Self = this.set("grid-gap", js.undefined)
    @scala.inline
    def `setGrid-row-gap`(value: GridRowGap[TLength]): Self = this.set("grid-row-gap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGrid-row-gap`: Self = this.set("grid-row-gap", js.undefined)
    @scala.inline
    def `setIme-mode`(value: ImeMode): Self = this.set("ime-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIme-mode`: Self = this.set("ime-mode", js.undefined)
    @scala.inline
    def `setOffset-block`(value: InsetBlock[TLength]): Self = this.set("offset-block", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-block`: Self = this.set("offset-block", js.undefined)
    @scala.inline
    def `setOffset-block-end`(value: InsetBlockEnd[TLength]): Self = this.set("offset-block-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-block-end`: Self = this.set("offset-block-end", js.undefined)
    @scala.inline
    def `setOffset-block-start`(value: InsetBlockStart[TLength]): Self = this.set("offset-block-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-block-start`: Self = this.set("offset-block-start", js.undefined)
    @scala.inline
    def `setOffset-inline`(value: InsetInline[TLength]): Self = this.set("offset-inline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-inline`: Self = this.set("offset-inline", js.undefined)
    @scala.inline
    def `setOffset-inline-end`(value: InsetInlineEnd[TLength]): Self = this.set("offset-inline-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-inline-end`: Self = this.set("offset-inline-end", js.undefined)
    @scala.inline
    def `setOffset-inline-start`(value: InsetInlineStart[TLength]): Self = this.set("offset-inline-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOffset-inline-start`: Self = this.set("offset-inline-start", js.undefined)
    @scala.inline
    def `setScroll-snap-coordinate`(value: ScrollSnapCoordinate[TLength]): Self = this.set("scroll-snap-coordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-snap-coordinate`: Self = this.set("scroll-snap-coordinate", js.undefined)
    @scala.inline
    def `setScroll-snap-destination`(value: ScrollSnapDestination[TLength]): Self = this.set("scroll-snap-destination", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-snap-destination`: Self = this.set("scroll-snap-destination", js.undefined)
    @scala.inline
    def `setScroll-snap-points-x`(value: ScrollSnapPointsX): Self = this.set("scroll-snap-points-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-snap-points-x`: Self = this.set("scroll-snap-points-x", js.undefined)
    @scala.inline
    def `setScroll-snap-points-y`(value: ScrollSnapPointsY): Self = this.set("scroll-snap-points-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-snap-points-y`: Self = this.set("scroll-snap-points-y", js.undefined)
    @scala.inline
    def `setScroll-snap-type-x`(value: ScrollSnapTypeX): Self = this.set("scroll-snap-type-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-snap-type-x`: Self = this.set("scroll-snap-type-x", js.undefined)
    @scala.inline
    def `setScroll-snap-type-y`(value: ScrollSnapTypeY): Self = this.set("scroll-snap-type-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScroll-snap-type-y`: Self = this.set("scroll-snap-type-y", js.undefined)
    @scala.inline
    def `setScrollbar-track-color`(value: MsScrollbarTrackColor): Self = this.set("scrollbar-track-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteScrollbar-track-color`: Self = this.set("scrollbar-track-color", js.undefined)
    @scala.inline
    def `setText-combine-horizontal`(value: TextCombineUpright): Self = this.set("text-combine-horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-combine-horizontal`: Self = this.set("text-combine-horizontal", js.undefined)
  }
  
}

