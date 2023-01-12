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
import typings.csstype.mod.Property.Azimuth
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
import typings.csstype.mod.Property.MozFloatEdge
import typings.csstype.mod.Property.MozForceBrokenImageIcon
import typings.csstype.mod.Property.MozOutlineRadius
import typings.csstype.mod.Property.MozOutlineRadiusBottomleft
import typings.csstype.mod.Property.MozOutlineRadiusBottomright
import typings.csstype.mod.Property.MozOutlineRadiusTopleft
import typings.csstype.mod.Property.MozOutlineRadiusTopright
import typings.csstype.mod.Property.MozUserInput
import typings.csstype.mod.Property.ObjectFit
import typings.csstype.mod.Property.ObjectPosition
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
import typings.csstype.mod.Property.TabSize
import typings.csstype.mod.Property.TextAlignLast
import typings.csstype.mod.Property.TextDecorationColor
import typings.csstype.mod.Property.TextDecorationLine
import typings.csstype.mod.Property.TextDecorationStyle
import typings.csstype.mod.Property.TextOverflow
import typings.csstype.mod.Property.Transform
import typings.csstype.mod.Property.TransformOrigin
import typings.csstype.mod.Property.Transition
import typings.csstype.mod.Property.TransitionDelay
import typings.csstype.mod.Property.TransitionDuration
import typings.csstype.mod.Property.TransitionProperty
import typings.csstype.mod.Property.TransitionTimingFunction
import typings.csstype.mod.Property.UserSelect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObsoletePropertiesHyphen[TLength, TTime] extends StObject {
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var `-khtml-box-align`: js.UndefOr[BoxAlign] = js.undefined
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-khtml-box-direction`: js.UndefOr[BoxDirection] = js.undefined
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-khtml-box-flex`: js.UndefOr[BoxFlex] = js.undefined
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-khtml-box-flex-group`: js.UndefOr[BoxFlexGroup] = js.undefined
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var `-khtml-box-lines`: js.UndefOr[BoxLines] = js.undefined
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-khtml-box-ordinal-group`: js.UndefOr[BoxOrdinalGroup] = js.undefined
  
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `-khtml-box-orient`: js.UndefOr[BoxOrient] = js.undefined
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `-khtml-box-pack`: js.UndefOr[BoxPack] = js.undefined
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-khtml-line-break`: js.UndefOr[LineBreak] = js.undefined
  
  /**
    * The **`opacity`** CSS property sets the opacity of an element. Opacity is the degree to which content behind an element is hidden, and is the opposite of transparency.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-khtml-opacity`: js.UndefOr[Opacity] = js.undefined
  
  /**
    * The **`user-select`** CSS property controls whether the user can select text. This doesn't have any effect on content loaded as part of a browser's user interface (its chrome), except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-khtml-user-select`: js.UndefOr[UserSelect] = js.undefined
  
  /**
    * The **`background-clip`** CSS property sets whether an element's background extends underneath its border box, padding box, or content box.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `border-box`
    *
    * @deprecated
    */
  var `-moz-background-clip`: js.UndefOr[BackgroundClip] = js.undefined
  
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Syntax**: `slice | clone`
    *
    * **Initial value**: `slice`
    *
    * @deprecated
    */
  var `-moz-background-inline-policy`: js.UndefOr[BoxDecorationBreak] = js.undefined
  
  /**
    * The **`background-origin`** CSS property sets the background's origin: from the border start, inside the border, or inside the padding.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `padding-box`
    *
    * @deprecated
    */
  var `-moz-background-origin`: js.UndefOr[BackgroundOrigin] = js.undefined
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var `-moz-background-size`: js.UndefOr[BackgroundSize[TLength]] = js.undefined
  
  /**
    * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
    *
    * **Syntax**: `<url> | none`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-binding`: js.UndefOr[MozBinding] = js.undefined
  
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    *
    * @deprecated
    */
  var `-moz-border-radius`: js.UndefOr[BorderRadius[TLength]] = js.undefined
  
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element by specifying the radius (or the radius of the semi-major and semi-minor axes) of the ellipse defining the curvature of the corner.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-border-radius-bottomleft`: js.UndefOr[BorderBottomLeftRadius[TLength]] = js.undefined
  
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element by specifying the radius (or the radius of the semi-major and semi-minor axes) of the ellipse defining the curvature of the corner.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-border-radius-bottomright`: js.UndefOr[BorderBottomRightRadius[TLength]] = js.undefined
  
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element by specifying the radius (or the radius of the semi-major and semi-minor axes) of the ellipse defining the curvature of the corner.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-border-radius-topleft`: js.UndefOr[BorderTopLeftRadius[TLength]] = js.undefined
  
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element by specifying the radius (or the radius of the semi-major and semi-minor axes) of the ellipse defining the curvature of the corner.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-border-radius-topright`: js.UndefOr[BorderTopRightRadius[TLength]] = js.undefined
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var `-moz-box-align`: js.UndefOr[BoxAlign] = js.undefined
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-moz-box-direction`: js.UndefOr[BoxDirection] = js.undefined
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-box-flex`: js.UndefOr[BoxFlex] = js.undefined
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-moz-box-ordinal-group`: js.UndefOr[BoxOrdinalGroup] = js.undefined
  
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `-moz-box-orient`: js.UndefOr[BoxOrient] = js.undefined
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `-moz-box-pack`: js.UndefOr[BoxPack] = js.undefined
  
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radius, and color.
    *
    * **Syntax**: `none | <shadow>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-box-shadow`: js.UndefOr[BoxShadow] = js.undefined
  
  /**
    * The non-standard **`-moz-float-edge`** CSS property specifies whether the height and width properties of the element include the margin, border, or padding thickness.
    *
    * **Syntax**: `border-box | content-box | margin-box | padding-box`
    *
    * **Initial value**: `content-box`
    *
    * @deprecated
    */
  var `-moz-float-edge`: js.UndefOr[MozFloatEdge] = js.undefined
  
  /**
    * The **`-moz-force-broken-image-icon`** extended CSS property can be used to force the broken image icon to be shown even when a broken image has an `alt` attribute.
    *
    * **Syntax**: `0 | 1`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-force-broken-image-icon`: js.UndefOr[MozForceBrokenImageIcon] = js.undefined
  
  /**
    * The **`opacity`** CSS property sets the opacity of an element. Opacity is the degree to which content behind an element is hidden, and is the opposite of transparency.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-moz-opacity`: js.UndefOr[Opacity] = js.undefined
  
  /**
    * The **`outline`** CSS shorthand property set all the outline properties in a single declaration.
    *
    * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
    *
    * @deprecated
    */
  var `-moz-outline`: js.UndefOr[Outline[TLength]] = js.undefined
  
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Syntax**: `<color> | invert`
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * @deprecated
    */
  var `-moz-outline-color`: js.UndefOr[OutlineColor] = js.undefined
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS shorthand property can be used to give an element's `outline` rounded corners.
    *
    * **Syntax**: `<outline-radius>{1,4} [ / <outline-radius>{1,4} ]?`
    *
    * @deprecated
    */
  var `-moz-outline-radius`: js.UndefOr[MozOutlineRadius[TLength]] = js.undefined
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-bottomleft`** CSS property can be used to round the bottom-left corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-outline-radius-bottomleft`: js.UndefOr[MozOutlineRadiusBottomleft[TLength]] = js.undefined
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-bottomright`** CSS property can be used to round the bottom-right corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-outline-radius-bottomright`: js.UndefOr[MozOutlineRadiusBottomright[TLength]] = js.undefined
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-topleft`** CSS property can be used to round the top-left corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-outline-radius-topleft`: js.UndefOr[MozOutlineRadiusTopleft[TLength]] = js.undefined
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-topright`** CSS property can be used to round the top-right corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-moz-outline-radius-topright`: js.UndefOr[MozOutlineRadiusTopright[TLength]] = js.undefined
  
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `auto | <'border-style'>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-outline-style`: js.UndefOr[OutlineStyle] = js.undefined
  
  /**
    * The CSS **`outline-width`** property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * @deprecated
    */
  var `-moz-outline-width`: js.UndefOr[OutlineWidth[TLength]] = js.undefined
  
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Syntax**: `auto | start | end | left | right | center | justify`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-moz-text-align-last`: js.UndefOr[TextAlignLast] = js.undefined
  
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * @deprecated
    */
  var `-moz-text-decoration-color`: js.UndefOr[TextDecorationColor] = js.undefined
  
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-moz-text-decoration-line`: js.UndefOr[TextDecorationLine] = js.undefined
  
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Syntax**: `solid | double | dotted | dashed | wavy`
    *
    * **Initial value**: `solid`
    *
    * @deprecated
    */
  var `-moz-text-decoration-style`: js.UndefOr[TextDecorationStyle] = js.undefined
  
  /**
    * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
    *
    * **Syntax**: `auto | none | enabled | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-moz-user-input`: js.UndefOr[MozUserInput] = js.undefined
  
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `-ms-ime-mode`: js.UndefOr[ImeMode] = js.undefined
  
  /**
    * The **`animation`** shorthand CSS property applies an animation between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    *
    * @deprecated
    */
  var `-o-animation`: js.UndefOr[Animation[TTime]] = js.undefined
  
  /**
    * The **`animation-delay`** CSS property specifies the amount of time to wait from applying the animation to an element before beginning to perform the animation. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-animation-delay`: js.UndefOr[AnimationDelay[TTime]] = js.undefined
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forward, backward, or alternate back and forth between playing the sequence forward and backward.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-o-animation-direction`: js.UndefOr[AnimationDirection] = js.undefined
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-animation-duration`: js.UndefOr[AnimationDuration[TTime]] = js.undefined
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-o-animation-fill-mode`: js.UndefOr[AnimationFillMode] = js.undefined
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation sequence should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-o-animation-iteration-count`: js.UndefOr[AnimationIterationCount] = js.undefined
  
  /**
    * The **`animation-name`** CSS property specifies the names of one or more `@keyframes` at-rules describing the animation or animations to apply to the element.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-o-animation-name`: js.UndefOr[AnimationName] = js.undefined
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    *
    * @deprecated
    */
  var `-o-animation-play-state`: js.UndefOr[AnimationPlayState] = js.undefined
  
  /**
    * The **`animation-timing-function`** CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<easing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var `-o-animation-timing-function`: js.UndefOr[AnimationTimingFunction] = js.undefined
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var `-o-background-size`: js.UndefOr[BackgroundSize[TLength]] = js.undefined
  
  /**
    * The **`border-image`** CSS property draws an image around a given element. It replaces the element's regular border.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    *
    * @deprecated
    */
  var `-o-border-image`: js.UndefOr[BorderImage] = js.undefined
  
  /**
    * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Syntax**: `fill | contain | cover | none | scale-down`
    *
    * **Initial value**: `fill`
    *
    * @deprecated
    */
  var `-o-object-fit`: js.UndefOr[ObjectFit] = js.undefined
  
  /**
    * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    *
    * @deprecated
    */
  var `-o-object-position`: js.UndefOr[ObjectPosition[TLength]] = js.undefined
  
  /**
    * The **`tab-size`** CSS property is used to customize the width of tab characters (U+0009).
    *
    * **Syntax**: `<integer> | <length>`
    *
    * **Initial value**: `8`
    *
    * @deprecated
    */
  var `-o-tab-size`: js.UndefOr[TabSize[TLength]] = js.undefined
  
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
    *
    * **Initial value**: `clip`
    *
    * @deprecated
    */
  var `-o-text-overflow`: js.UndefOr[TextOverflow] = js.undefined
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-o-transform`: js.UndefOr[Transform] = js.undefined
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    *
    * @deprecated
    */
  var `-o-transform-origin`: js.UndefOr[TransformOrigin[TLength]] = js.undefined
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    *
    * @deprecated
    */
  var `-o-transition`: js.UndefOr[Transition[TTime]] = js.undefined
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-transition-delay`: js.UndefOr[TransitionDelay[TTime]] = js.undefined
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var `-o-transition-duration`: js.UndefOr[TransitionDuration[TTime]] = js.undefined
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    *
    * @deprecated
    */
  var `-o-transition-property`: js.UndefOr[TransitionProperty] = js.undefined
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<easing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var `-o-transition-timing-function`: js.UndefOr[TransitionTimingFunction] = js.undefined
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var `-webkit-box-align`: js.UndefOr[BoxAlign] = js.undefined
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `-webkit-box-direction`: js.UndefOr[BoxDirection] = js.undefined
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `-webkit-box-flex`: js.UndefOr[BoxFlex] = js.undefined
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-webkit-box-flex-group`: js.UndefOr[BoxFlexGroup] = js.undefined
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var `-webkit-box-lines`: js.UndefOr[BoxLines] = js.undefined
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `-webkit-box-ordinal-group`: js.UndefOr[BoxOrdinalGroup] = js.undefined
  
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `-webkit-box-orient`: js.UndefOr[BoxOrient] = js.undefined
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `-webkit-box-pack`: js.UndefOr[BoxPack] = js.undefined
  
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-webkit-scroll-snap-points-x`: js.UndefOr[ScrollSnapPointsX] = js.undefined
  
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `-webkit-scroll-snap-points-y`: js.UndefOr[ScrollSnapPointsY] = js.undefined
  
  /**
    * In combination with `elevation`, the **`azimuth`** CSS property enables different audio sources to be positioned spatially for aural presentation. This is important in that it provides a natural way to tell several voices apart, as each can be positioned to originate at a different location on the sound stage. Stereo output produce a lateral sound stage, while binaural headphones and multi-speaker setups allow for a fully three-dimensional stage.
    *
    * **Syntax**: `<angle> | [ [ left-side | far-left | left | center-left | center | center-right | right | far-right | right-side ] || behind ] | leftwards | rightwards`
    *
    * **Initial value**: `center`
    *
    * @deprecated
    */
  var azimuth: js.UndefOr[Azimuth] = js.undefined
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var `box-align`: js.UndefOr[BoxAlign] = js.undefined
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var `box-direction`: js.UndefOr[BoxDirection] = js.undefined
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `box-flex`: js.UndefOr[BoxFlex] = js.undefined
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `box-flex-group`: js.UndefOr[BoxFlexGroup] = js.undefined
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var `box-lines`: js.UndefOr[BoxLines] = js.undefined
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var `box-ordinal-group`: js.UndefOr[BoxOrdinalGroup] = js.undefined
  
  /**
    * The **`box-orient`** CSS property sets whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var `box-orient`: js.UndefOr[BoxOrient] = js.undefined
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var `box-pack`: js.UndefOr[BoxPack] = js.undefined
  
  /**
    * The **`clip`** CSS property defines a visible portion of an element. The `clip` property applies only to absolutely positioned elements — that is, elements with `position:absolute` or `position:fixed`.
    *
    * **Syntax**: `<shape> | auto`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var clip: js.UndefOr[Clip] = js.undefined
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `grid-column-gap`: js.UndefOr[GridColumnGap[TLength]] = js.undefined
  
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * **Syntax**: `<'grid-row-gap'> <'grid-column-gap'>?`
    *
    * @deprecated
    */
  var `grid-gap`: js.UndefOr[GridGap[TLength]] = js.undefined
  
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var `grid-row-gap`: js.UndefOr[GridRowGap[TLength]] = js.undefined
  
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `ime-mode`: js.UndefOr[ImeMode] = js.undefined
  
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-block`: js.UndefOr[InsetBlock[TLength]] = js.undefined
  
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-block-end`: js.UndefOr[InsetBlockEnd[TLength]] = js.undefined
  
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-block-start`: js.UndefOr[InsetBlockStart[TLength]] = js.undefined
  
  /**
    * The **`inset-inline`** CSS property defines the logical start and end offsets of an element in the inline direction, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-inline`: js.UndefOr[InsetInline[TLength]] = js.undefined
  
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-inline-end`: js.UndefOr[InsetInlineEnd[TLength]] = js.undefined
  
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var `offset-inline-start`: js.UndefOr[InsetInlineStart[TLength]] = js.undefined
  
  /**
    * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
    *
    * **Syntax**: `none | <position>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-coordinate`: js.UndefOr[ScrollSnapCoordinate[TLength]] = js.undefined
  
  /**
    * The **`scroll-snap-destination`** CSS property defines the position in x and y coordinates within the scroll container's visual viewport which element snap points align with.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `0px 0px`
    *
    * @deprecated
    */
  var `scroll-snap-destination`: js.UndefOr[ScrollSnapDestination[TLength]] = js.undefined
  
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-points-x`: js.UndefOr[ScrollSnapPointsX] = js.undefined
  
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-points-y`: js.UndefOr[ScrollSnapPointsY] = js.undefined
  
  /**
    * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-type-x`: js.UndefOr[ScrollSnapTypeX] = js.undefined
  
  /**
    * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var `scroll-snap-type-y`: js.UndefOr[ScrollSnapTypeY] = js.undefined
}
object ObsoletePropertiesHyphen {
  
  inline def apply[TLength, TTime](): ObsoletePropertiesHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObsoletePropertiesHyphen[TLength, TTime]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObsoletePropertiesHyphen[?, ?], TLength, TTime] (val x: Self & (ObsoletePropertiesHyphen[TLength, TTime])) extends AnyVal {
    
    inline def `set-khtml-box-align`(value: BoxAlign): Self = StObject.set(x, "-khtml-box-align", value.asInstanceOf[js.Any])
    
    inline def `set-khtml-box-alignUndefined`: Self = StObject.set(x, "-khtml-box-align", js.undefined)
    
    inline def `set-khtml-box-direction`(value: BoxDirection): Self = StObject.set(x, "-khtml-box-direction", value.asInstanceOf[js.Any])
    
    inline def `set-khtml-box-directionUndefined`: Self = StObject.set(x, "-khtml-box-direction", js.undefined)
    
    inline def `set-khtml-box-flex`(value: BoxFlex): Self = StObject.set(x, "-khtml-box-flex", value.asInstanceOf[js.Any])
    
    inline def `set-khtml-box-flex-group`(value: BoxFlexGroup): Self = StObject.set(x, "-khtml-box-flex-group", value.asInstanceOf[js.Any])
    
    inline def `set-khtml-box-flex-groupUndefined`: Self = StObject.set(x, "-khtml-box-flex-group", js.undefined)
    
    inline def `set-khtml-box-flexUndefined`: Self = StObject.set(x, "-khtml-box-flex", js.undefined)
    
    inline def `set-khtml-box-lines`(value: BoxLines): Self = StObject.set(x, "-khtml-box-lines", value.asInstanceOf[js.Any])
    
    inline def `set-khtml-box-linesUndefined`: Self = StObject.set(x, "-khtml-box-lines", js.undefined)
    
    inline def `set-khtml-box-ordinal-group`(value: BoxOrdinalGroup): Self = StObject.set(x, "-khtml-box-ordinal-group", value.asInstanceOf[js.Any])
    
    inline def `set-khtml-box-ordinal-groupUndefined`: Self = StObject.set(x, "-khtml-box-ordinal-group", js.undefined)
    
    inline def `set-khtml-box-orient`(value: BoxOrient): Self = StObject.set(x, "-khtml-box-orient", value.asInstanceOf[js.Any])
    
    inline def `set-khtml-box-orientUndefined`: Self = StObject.set(x, "-khtml-box-orient", js.undefined)
    
    inline def `set-khtml-box-pack`(value: BoxPack): Self = StObject.set(x, "-khtml-box-pack", value.asInstanceOf[js.Any])
    
    inline def `set-khtml-box-packUndefined`: Self = StObject.set(x, "-khtml-box-pack", js.undefined)
    
    inline def `set-khtml-line-break`(value: LineBreak): Self = StObject.set(x, "-khtml-line-break", value.asInstanceOf[js.Any])
    
    inline def `set-khtml-line-breakUndefined`: Self = StObject.set(x, "-khtml-line-break", js.undefined)
    
    inline def `set-khtml-opacity`(value: Opacity): Self = StObject.set(x, "-khtml-opacity", value.asInstanceOf[js.Any])
    
    inline def `set-khtml-opacityUndefined`: Self = StObject.set(x, "-khtml-opacity", js.undefined)
    
    inline def `set-khtml-user-select`(value: UserSelect): Self = StObject.set(x, "-khtml-user-select", value.asInstanceOf[js.Any])
    
    inline def `set-khtml-user-selectUndefined`: Self = StObject.set(x, "-khtml-user-select", js.undefined)
    
    inline def `set-moz-background-clip`(value: BackgroundClip): Self = StObject.set(x, "-moz-background-clip", value.asInstanceOf[js.Any])
    
    inline def `set-moz-background-clipUndefined`: Self = StObject.set(x, "-moz-background-clip", js.undefined)
    
    inline def `set-moz-background-inline-policy`(value: BoxDecorationBreak): Self = StObject.set(x, "-moz-background-inline-policy", value.asInstanceOf[js.Any])
    
    inline def `set-moz-background-inline-policyUndefined`: Self = StObject.set(x, "-moz-background-inline-policy", js.undefined)
    
    inline def `set-moz-background-origin`(value: BackgroundOrigin): Self = StObject.set(x, "-moz-background-origin", value.asInstanceOf[js.Any])
    
    inline def `set-moz-background-originUndefined`: Self = StObject.set(x, "-moz-background-origin", js.undefined)
    
    inline def `set-moz-background-size`(value: BackgroundSize[TLength]): Self = StObject.set(x, "-moz-background-size", value.asInstanceOf[js.Any])
    
    inline def `set-moz-background-sizeUndefined`: Self = StObject.set(x, "-moz-background-size", js.undefined)
    
    inline def `set-moz-binding`(value: MozBinding): Self = StObject.set(x, "-moz-binding", value.asInstanceOf[js.Any])
    
    inline def `set-moz-bindingUndefined`: Self = StObject.set(x, "-moz-binding", js.undefined)
    
    inline def `set-moz-border-radius`(value: BorderRadius[TLength]): Self = StObject.set(x, "-moz-border-radius", value.asInstanceOf[js.Any])
    
    inline def `set-moz-border-radius-bottomleft`(value: BorderBottomLeftRadius[TLength]): Self = StObject.set(x, "-moz-border-radius-bottomleft", value.asInstanceOf[js.Any])
    
    inline def `set-moz-border-radius-bottomleftUndefined`: Self = StObject.set(x, "-moz-border-radius-bottomleft", js.undefined)
    
    inline def `set-moz-border-radius-bottomright`(value: BorderBottomRightRadius[TLength]): Self = StObject.set(x, "-moz-border-radius-bottomright", value.asInstanceOf[js.Any])
    
    inline def `set-moz-border-radius-bottomrightUndefined`: Self = StObject.set(x, "-moz-border-radius-bottomright", js.undefined)
    
    inline def `set-moz-border-radius-topleft`(value: BorderTopLeftRadius[TLength]): Self = StObject.set(x, "-moz-border-radius-topleft", value.asInstanceOf[js.Any])
    
    inline def `set-moz-border-radius-topleftUndefined`: Self = StObject.set(x, "-moz-border-radius-topleft", js.undefined)
    
    inline def `set-moz-border-radius-topright`(value: BorderTopRightRadius[TLength]): Self = StObject.set(x, "-moz-border-radius-topright", value.asInstanceOf[js.Any])
    
    inline def `set-moz-border-radius-toprightUndefined`: Self = StObject.set(x, "-moz-border-radius-topright", js.undefined)
    
    inline def `set-moz-border-radiusUndefined`: Self = StObject.set(x, "-moz-border-radius", js.undefined)
    
    inline def `set-moz-box-align`(value: BoxAlign): Self = StObject.set(x, "-moz-box-align", value.asInstanceOf[js.Any])
    
    inline def `set-moz-box-alignUndefined`: Self = StObject.set(x, "-moz-box-align", js.undefined)
    
    inline def `set-moz-box-direction`(value: BoxDirection): Self = StObject.set(x, "-moz-box-direction", value.asInstanceOf[js.Any])
    
    inline def `set-moz-box-directionUndefined`: Self = StObject.set(x, "-moz-box-direction", js.undefined)
    
    inline def `set-moz-box-flex`(value: BoxFlex): Self = StObject.set(x, "-moz-box-flex", value.asInstanceOf[js.Any])
    
    inline def `set-moz-box-flexUndefined`: Self = StObject.set(x, "-moz-box-flex", js.undefined)
    
    inline def `set-moz-box-ordinal-group`(value: BoxOrdinalGroup): Self = StObject.set(x, "-moz-box-ordinal-group", value.asInstanceOf[js.Any])
    
    inline def `set-moz-box-ordinal-groupUndefined`: Self = StObject.set(x, "-moz-box-ordinal-group", js.undefined)
    
    inline def `set-moz-box-orient`(value: BoxOrient): Self = StObject.set(x, "-moz-box-orient", value.asInstanceOf[js.Any])
    
    inline def `set-moz-box-orientUndefined`: Self = StObject.set(x, "-moz-box-orient", js.undefined)
    
    inline def `set-moz-box-pack`(value: BoxPack): Self = StObject.set(x, "-moz-box-pack", value.asInstanceOf[js.Any])
    
    inline def `set-moz-box-packUndefined`: Self = StObject.set(x, "-moz-box-pack", js.undefined)
    
    inline def `set-moz-box-shadow`(value: BoxShadow): Self = StObject.set(x, "-moz-box-shadow", value.asInstanceOf[js.Any])
    
    inline def `set-moz-box-shadowUndefined`: Self = StObject.set(x, "-moz-box-shadow", js.undefined)
    
    inline def `set-moz-float-edge`(value: MozFloatEdge): Self = StObject.set(x, "-moz-float-edge", value.asInstanceOf[js.Any])
    
    inline def `set-moz-float-edgeUndefined`: Self = StObject.set(x, "-moz-float-edge", js.undefined)
    
    inline def `set-moz-force-broken-image-icon`(value: MozForceBrokenImageIcon): Self = StObject.set(x, "-moz-force-broken-image-icon", value.asInstanceOf[js.Any])
    
    inline def `set-moz-force-broken-image-iconUndefined`: Self = StObject.set(x, "-moz-force-broken-image-icon", js.undefined)
    
    inline def `set-moz-opacity`(value: Opacity): Self = StObject.set(x, "-moz-opacity", value.asInstanceOf[js.Any])
    
    inline def `set-moz-opacityUndefined`: Self = StObject.set(x, "-moz-opacity", js.undefined)
    
    inline def `set-moz-outline`(value: Outline[TLength]): Self = StObject.set(x, "-moz-outline", value.asInstanceOf[js.Any])
    
    inline def `set-moz-outline-color`(value: OutlineColor): Self = StObject.set(x, "-moz-outline-color", value.asInstanceOf[js.Any])
    
    inline def `set-moz-outline-colorUndefined`: Self = StObject.set(x, "-moz-outline-color", js.undefined)
    
    inline def `set-moz-outline-radius`(value: MozOutlineRadius[TLength]): Self = StObject.set(x, "-moz-outline-radius", value.asInstanceOf[js.Any])
    
    inline def `set-moz-outline-radius-bottomleft`(value: MozOutlineRadiusBottomleft[TLength]): Self = StObject.set(x, "-moz-outline-radius-bottomleft", value.asInstanceOf[js.Any])
    
    inline def `set-moz-outline-radius-bottomleftUndefined`: Self = StObject.set(x, "-moz-outline-radius-bottomleft", js.undefined)
    
    inline def `set-moz-outline-radius-bottomright`(value: MozOutlineRadiusBottomright[TLength]): Self = StObject.set(x, "-moz-outline-radius-bottomright", value.asInstanceOf[js.Any])
    
    inline def `set-moz-outline-radius-bottomrightUndefined`: Self = StObject.set(x, "-moz-outline-radius-bottomright", js.undefined)
    
    inline def `set-moz-outline-radius-topleft`(value: MozOutlineRadiusTopleft[TLength]): Self = StObject.set(x, "-moz-outline-radius-topleft", value.asInstanceOf[js.Any])
    
    inline def `set-moz-outline-radius-topleftUndefined`: Self = StObject.set(x, "-moz-outline-radius-topleft", js.undefined)
    
    inline def `set-moz-outline-radius-topright`(value: MozOutlineRadiusTopright[TLength]): Self = StObject.set(x, "-moz-outline-radius-topright", value.asInstanceOf[js.Any])
    
    inline def `set-moz-outline-radius-toprightUndefined`: Self = StObject.set(x, "-moz-outline-radius-topright", js.undefined)
    
    inline def `set-moz-outline-radiusUndefined`: Self = StObject.set(x, "-moz-outline-radius", js.undefined)
    
    inline def `set-moz-outline-style`(value: OutlineStyle): Self = StObject.set(x, "-moz-outline-style", value.asInstanceOf[js.Any])
    
    inline def `set-moz-outline-styleUndefined`: Self = StObject.set(x, "-moz-outline-style", js.undefined)
    
    inline def `set-moz-outline-width`(value: OutlineWidth[TLength]): Self = StObject.set(x, "-moz-outline-width", value.asInstanceOf[js.Any])
    
    inline def `set-moz-outline-widthUndefined`: Self = StObject.set(x, "-moz-outline-width", js.undefined)
    
    inline def `set-moz-outlineUndefined`: Self = StObject.set(x, "-moz-outline", js.undefined)
    
    inline def `set-moz-text-align-last`(value: TextAlignLast): Self = StObject.set(x, "-moz-text-align-last", value.asInstanceOf[js.Any])
    
    inline def `set-moz-text-align-lastUndefined`: Self = StObject.set(x, "-moz-text-align-last", js.undefined)
    
    inline def `set-moz-text-decoration-color`(value: TextDecorationColor): Self = StObject.set(x, "-moz-text-decoration-color", value.asInstanceOf[js.Any])
    
    inline def `set-moz-text-decoration-colorUndefined`: Self = StObject.set(x, "-moz-text-decoration-color", js.undefined)
    
    inline def `set-moz-text-decoration-line`(value: TextDecorationLine): Self = StObject.set(x, "-moz-text-decoration-line", value.asInstanceOf[js.Any])
    
    inline def `set-moz-text-decoration-lineUndefined`: Self = StObject.set(x, "-moz-text-decoration-line", js.undefined)
    
    inline def `set-moz-text-decoration-style`(value: TextDecorationStyle): Self = StObject.set(x, "-moz-text-decoration-style", value.asInstanceOf[js.Any])
    
    inline def `set-moz-text-decoration-styleUndefined`: Self = StObject.set(x, "-moz-text-decoration-style", js.undefined)
    
    inline def `set-moz-user-input`(value: MozUserInput): Self = StObject.set(x, "-moz-user-input", value.asInstanceOf[js.Any])
    
    inline def `set-moz-user-inputUndefined`: Self = StObject.set(x, "-moz-user-input", js.undefined)
    
    inline def `set-ms-ime-mode`(value: ImeMode): Self = StObject.set(x, "-ms-ime-mode", value.asInstanceOf[js.Any])
    
    inline def `set-ms-ime-modeUndefined`: Self = StObject.set(x, "-ms-ime-mode", js.undefined)
    
    inline def `set-o-animation`(value: Animation[TTime]): Self = StObject.set(x, "-o-animation", value.asInstanceOf[js.Any])
    
    inline def `set-o-animation-delay`(value: AnimationDelay[TTime]): Self = StObject.set(x, "-o-animation-delay", value.asInstanceOf[js.Any])
    
    inline def `set-o-animation-delayUndefined`: Self = StObject.set(x, "-o-animation-delay", js.undefined)
    
    inline def `set-o-animation-direction`(value: AnimationDirection): Self = StObject.set(x, "-o-animation-direction", value.asInstanceOf[js.Any])
    
    inline def `set-o-animation-directionUndefined`: Self = StObject.set(x, "-o-animation-direction", js.undefined)
    
    inline def `set-o-animation-duration`(value: AnimationDuration[TTime]): Self = StObject.set(x, "-o-animation-duration", value.asInstanceOf[js.Any])
    
    inline def `set-o-animation-durationUndefined`: Self = StObject.set(x, "-o-animation-duration", js.undefined)
    
    inline def `set-o-animation-fill-mode`(value: AnimationFillMode): Self = StObject.set(x, "-o-animation-fill-mode", value.asInstanceOf[js.Any])
    
    inline def `set-o-animation-fill-modeUndefined`: Self = StObject.set(x, "-o-animation-fill-mode", js.undefined)
    
    inline def `set-o-animation-iteration-count`(value: AnimationIterationCount): Self = StObject.set(x, "-o-animation-iteration-count", value.asInstanceOf[js.Any])
    
    inline def `set-o-animation-iteration-countUndefined`: Self = StObject.set(x, "-o-animation-iteration-count", js.undefined)
    
    inline def `set-o-animation-name`(value: AnimationName): Self = StObject.set(x, "-o-animation-name", value.asInstanceOf[js.Any])
    
    inline def `set-o-animation-nameUndefined`: Self = StObject.set(x, "-o-animation-name", js.undefined)
    
    inline def `set-o-animation-play-state`(value: AnimationPlayState): Self = StObject.set(x, "-o-animation-play-state", value.asInstanceOf[js.Any])
    
    inline def `set-o-animation-play-stateUndefined`: Self = StObject.set(x, "-o-animation-play-state", js.undefined)
    
    inline def `set-o-animation-timing-function`(value: AnimationTimingFunction): Self = StObject.set(x, "-o-animation-timing-function", value.asInstanceOf[js.Any])
    
    inline def `set-o-animation-timing-functionUndefined`: Self = StObject.set(x, "-o-animation-timing-function", js.undefined)
    
    inline def `set-o-animationUndefined`: Self = StObject.set(x, "-o-animation", js.undefined)
    
    inline def `set-o-background-size`(value: BackgroundSize[TLength]): Self = StObject.set(x, "-o-background-size", value.asInstanceOf[js.Any])
    
    inline def `set-o-background-sizeUndefined`: Self = StObject.set(x, "-o-background-size", js.undefined)
    
    inline def `set-o-border-image`(value: BorderImage): Self = StObject.set(x, "-o-border-image", value.asInstanceOf[js.Any])
    
    inline def `set-o-border-imageUndefined`: Self = StObject.set(x, "-o-border-image", js.undefined)
    
    inline def `set-o-object-fit`(value: ObjectFit): Self = StObject.set(x, "-o-object-fit", value.asInstanceOf[js.Any])
    
    inline def `set-o-object-fitUndefined`: Self = StObject.set(x, "-o-object-fit", js.undefined)
    
    inline def `set-o-object-position`(value: ObjectPosition[TLength]): Self = StObject.set(x, "-o-object-position", value.asInstanceOf[js.Any])
    
    inline def `set-o-object-positionUndefined`: Self = StObject.set(x, "-o-object-position", js.undefined)
    
    inline def `set-o-tab-size`(value: TabSize[TLength]): Self = StObject.set(x, "-o-tab-size", value.asInstanceOf[js.Any])
    
    inline def `set-o-tab-sizeUndefined`: Self = StObject.set(x, "-o-tab-size", js.undefined)
    
    inline def `set-o-text-overflow`(value: TextOverflow): Self = StObject.set(x, "-o-text-overflow", value.asInstanceOf[js.Any])
    
    inline def `set-o-text-overflowUndefined`: Self = StObject.set(x, "-o-text-overflow", js.undefined)
    
    inline def `set-o-transform`(value: Transform): Self = StObject.set(x, "-o-transform", value.asInstanceOf[js.Any])
    
    inline def `set-o-transform-origin`(value: TransformOrigin[TLength]): Self = StObject.set(x, "-o-transform-origin", value.asInstanceOf[js.Any])
    
    inline def `set-o-transform-originUndefined`: Self = StObject.set(x, "-o-transform-origin", js.undefined)
    
    inline def `set-o-transformUndefined`: Self = StObject.set(x, "-o-transform", js.undefined)
    
    inline def `set-o-transition`(value: Transition[TTime]): Self = StObject.set(x, "-o-transition", value.asInstanceOf[js.Any])
    
    inline def `set-o-transition-delay`(value: TransitionDelay[TTime]): Self = StObject.set(x, "-o-transition-delay", value.asInstanceOf[js.Any])
    
    inline def `set-o-transition-delayUndefined`: Self = StObject.set(x, "-o-transition-delay", js.undefined)
    
    inline def `set-o-transition-duration`(value: TransitionDuration[TTime]): Self = StObject.set(x, "-o-transition-duration", value.asInstanceOf[js.Any])
    
    inline def `set-o-transition-durationUndefined`: Self = StObject.set(x, "-o-transition-duration", js.undefined)
    
    inline def `set-o-transition-property`(value: TransitionProperty): Self = StObject.set(x, "-o-transition-property", value.asInstanceOf[js.Any])
    
    inline def `set-o-transition-propertyUndefined`: Self = StObject.set(x, "-o-transition-property", js.undefined)
    
    inline def `set-o-transition-timing-function`(value: TransitionTimingFunction): Self = StObject.set(x, "-o-transition-timing-function", value.asInstanceOf[js.Any])
    
    inline def `set-o-transition-timing-functionUndefined`: Self = StObject.set(x, "-o-transition-timing-function", js.undefined)
    
    inline def `set-o-transitionUndefined`: Self = StObject.set(x, "-o-transition", js.undefined)
    
    inline def `set-webkit-box-align`(value: BoxAlign): Self = StObject.set(x, "-webkit-box-align", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-box-alignUndefined`: Self = StObject.set(x, "-webkit-box-align", js.undefined)
    
    inline def `set-webkit-box-direction`(value: BoxDirection): Self = StObject.set(x, "-webkit-box-direction", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-box-directionUndefined`: Self = StObject.set(x, "-webkit-box-direction", js.undefined)
    
    inline def `set-webkit-box-flex`(value: BoxFlex): Self = StObject.set(x, "-webkit-box-flex", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-box-flex-group`(value: BoxFlexGroup): Self = StObject.set(x, "-webkit-box-flex-group", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-box-flex-groupUndefined`: Self = StObject.set(x, "-webkit-box-flex-group", js.undefined)
    
    inline def `set-webkit-box-flexUndefined`: Self = StObject.set(x, "-webkit-box-flex", js.undefined)
    
    inline def `set-webkit-box-lines`(value: BoxLines): Self = StObject.set(x, "-webkit-box-lines", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-box-linesUndefined`: Self = StObject.set(x, "-webkit-box-lines", js.undefined)
    
    inline def `set-webkit-box-ordinal-group`(value: BoxOrdinalGroup): Self = StObject.set(x, "-webkit-box-ordinal-group", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-box-ordinal-groupUndefined`: Self = StObject.set(x, "-webkit-box-ordinal-group", js.undefined)
    
    inline def `set-webkit-box-orient`(value: BoxOrient): Self = StObject.set(x, "-webkit-box-orient", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-box-orientUndefined`: Self = StObject.set(x, "-webkit-box-orient", js.undefined)
    
    inline def `set-webkit-box-pack`(value: BoxPack): Self = StObject.set(x, "-webkit-box-pack", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-box-packUndefined`: Self = StObject.set(x, "-webkit-box-pack", js.undefined)
    
    inline def `set-webkit-scroll-snap-points-x`(value: ScrollSnapPointsX): Self = StObject.set(x, "-webkit-scroll-snap-points-x", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-scroll-snap-points-xUndefined`: Self = StObject.set(x, "-webkit-scroll-snap-points-x", js.undefined)
    
    inline def `set-webkit-scroll-snap-points-y`(value: ScrollSnapPointsY): Self = StObject.set(x, "-webkit-scroll-snap-points-y", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-scroll-snap-points-yUndefined`: Self = StObject.set(x, "-webkit-scroll-snap-points-y", js.undefined)
    
    inline def setAzimuth(value: Azimuth): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
    
    inline def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
    
    inline def `setBox-align`(value: BoxAlign): Self = StObject.set(x, "box-align", value.asInstanceOf[js.Any])
    
    inline def `setBox-alignUndefined`: Self = StObject.set(x, "box-align", js.undefined)
    
    inline def `setBox-direction`(value: BoxDirection): Self = StObject.set(x, "box-direction", value.asInstanceOf[js.Any])
    
    inline def `setBox-directionUndefined`: Self = StObject.set(x, "box-direction", js.undefined)
    
    inline def `setBox-flex`(value: BoxFlex): Self = StObject.set(x, "box-flex", value.asInstanceOf[js.Any])
    
    inline def `setBox-flex-group`(value: BoxFlexGroup): Self = StObject.set(x, "box-flex-group", value.asInstanceOf[js.Any])
    
    inline def `setBox-flex-groupUndefined`: Self = StObject.set(x, "box-flex-group", js.undefined)
    
    inline def `setBox-flexUndefined`: Self = StObject.set(x, "box-flex", js.undefined)
    
    inline def `setBox-lines`(value: BoxLines): Self = StObject.set(x, "box-lines", value.asInstanceOf[js.Any])
    
    inline def `setBox-linesUndefined`: Self = StObject.set(x, "box-lines", js.undefined)
    
    inline def `setBox-ordinal-group`(value: BoxOrdinalGroup): Self = StObject.set(x, "box-ordinal-group", value.asInstanceOf[js.Any])
    
    inline def `setBox-ordinal-groupUndefined`: Self = StObject.set(x, "box-ordinal-group", js.undefined)
    
    inline def `setBox-orient`(value: BoxOrient): Self = StObject.set(x, "box-orient", value.asInstanceOf[js.Any])
    
    inline def `setBox-orientUndefined`: Self = StObject.set(x, "box-orient", js.undefined)
    
    inline def `setBox-pack`(value: BoxPack): Self = StObject.set(x, "box-pack", value.asInstanceOf[js.Any])
    
    inline def `setBox-packUndefined`: Self = StObject.set(x, "box-pack", js.undefined)
    
    inline def setClip(value: Clip): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def `setGrid-column-gap`(value: GridColumnGap[TLength]): Self = StObject.set(x, "grid-column-gap", value.asInstanceOf[js.Any])
    
    inline def `setGrid-column-gapUndefined`: Self = StObject.set(x, "grid-column-gap", js.undefined)
    
    inline def `setGrid-gap`(value: GridGap[TLength]): Self = StObject.set(x, "grid-gap", value.asInstanceOf[js.Any])
    
    inline def `setGrid-gapUndefined`: Self = StObject.set(x, "grid-gap", js.undefined)
    
    inline def `setGrid-row-gap`(value: GridRowGap[TLength]): Self = StObject.set(x, "grid-row-gap", value.asInstanceOf[js.Any])
    
    inline def `setGrid-row-gapUndefined`: Self = StObject.set(x, "grid-row-gap", js.undefined)
    
    inline def `setIme-mode`(value: ImeMode): Self = StObject.set(x, "ime-mode", value.asInstanceOf[js.Any])
    
    inline def `setIme-modeUndefined`: Self = StObject.set(x, "ime-mode", js.undefined)
    
    inline def `setOffset-block`(value: InsetBlock[TLength]): Self = StObject.set(x, "offset-block", value.asInstanceOf[js.Any])
    
    inline def `setOffset-block-end`(value: InsetBlockEnd[TLength]): Self = StObject.set(x, "offset-block-end", value.asInstanceOf[js.Any])
    
    inline def `setOffset-block-endUndefined`: Self = StObject.set(x, "offset-block-end", js.undefined)
    
    inline def `setOffset-block-start`(value: InsetBlockStart[TLength]): Self = StObject.set(x, "offset-block-start", value.asInstanceOf[js.Any])
    
    inline def `setOffset-block-startUndefined`: Self = StObject.set(x, "offset-block-start", js.undefined)
    
    inline def `setOffset-blockUndefined`: Self = StObject.set(x, "offset-block", js.undefined)
    
    inline def `setOffset-inline`(value: InsetInline[TLength]): Self = StObject.set(x, "offset-inline", value.asInstanceOf[js.Any])
    
    inline def `setOffset-inline-end`(value: InsetInlineEnd[TLength]): Self = StObject.set(x, "offset-inline-end", value.asInstanceOf[js.Any])
    
    inline def `setOffset-inline-endUndefined`: Self = StObject.set(x, "offset-inline-end", js.undefined)
    
    inline def `setOffset-inline-start`(value: InsetInlineStart[TLength]): Self = StObject.set(x, "offset-inline-start", value.asInstanceOf[js.Any])
    
    inline def `setOffset-inline-startUndefined`: Self = StObject.set(x, "offset-inline-start", js.undefined)
    
    inline def `setOffset-inlineUndefined`: Self = StObject.set(x, "offset-inline", js.undefined)
    
    inline def `setScroll-snap-coordinate`(value: ScrollSnapCoordinate[TLength]): Self = StObject.set(x, "scroll-snap-coordinate", value.asInstanceOf[js.Any])
    
    inline def `setScroll-snap-coordinateUndefined`: Self = StObject.set(x, "scroll-snap-coordinate", js.undefined)
    
    inline def `setScroll-snap-destination`(value: ScrollSnapDestination[TLength]): Self = StObject.set(x, "scroll-snap-destination", value.asInstanceOf[js.Any])
    
    inline def `setScroll-snap-destinationUndefined`: Self = StObject.set(x, "scroll-snap-destination", js.undefined)
    
    inline def `setScroll-snap-points-x`(value: ScrollSnapPointsX): Self = StObject.set(x, "scroll-snap-points-x", value.asInstanceOf[js.Any])
    
    inline def `setScroll-snap-points-xUndefined`: Self = StObject.set(x, "scroll-snap-points-x", js.undefined)
    
    inline def `setScroll-snap-points-y`(value: ScrollSnapPointsY): Self = StObject.set(x, "scroll-snap-points-y", value.asInstanceOf[js.Any])
    
    inline def `setScroll-snap-points-yUndefined`: Self = StObject.set(x, "scroll-snap-points-y", js.undefined)
    
    inline def `setScroll-snap-type-x`(value: ScrollSnapTypeX): Self = StObject.set(x, "scroll-snap-type-x", value.asInstanceOf[js.Any])
    
    inline def `setScroll-snap-type-xUndefined`: Self = StObject.set(x, "scroll-snap-type-x", js.undefined)
    
    inline def `setScroll-snap-type-y`(value: ScrollSnapTypeY): Self = StObject.set(x, "scroll-snap-type-y", value.asInstanceOf[js.Any])
    
    inline def `setScroll-snap-type-yUndefined`: Self = StObject.set(x, "scroll-snap-type-y", js.undefined)
  }
}
