package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObsoleteProperties[TLength] extends StObject {
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var KhtmlBoxAlign: js.UndefOr[BoxAlignProperty] = js.undefined
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var KhtmlBoxDirection: js.UndefOr[BoxDirectionProperty] = js.undefined
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var KhtmlBoxFlex: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxFlexGroup: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var KhtmlBoxLines: js.UndefOr[BoxLinesProperty] = js.undefined
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxOrdinalGroup: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var KhtmlBoxOrient: js.UndefOr[BoxOrientProperty] = js.undefined
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var KhtmlBoxPack: js.UndefOr[BoxPackProperty] = js.undefined
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlLineBreak: js.UndefOr[LineBreakProperty] = js.undefined
  
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var KhtmlOpacity: js.UndefOr[OpacityProperty] = js.undefined
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlUserSelect: js.UndefOr[UserSelectProperty] = js.undefined
  
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `border-box`
    *
    * @deprecated
    */
  var MozBackgroundClip: js.UndefOr[BackgroundClipProperty] = js.undefined
  
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Syntax**: `slice | clone`
    *
    * **Initial value**: `slice`
    *
    * @deprecated
    */
  var MozBackgroundInlinePolicy: js.UndefOr[BoxDecorationBreakProperty] = js.undefined
  
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `padding-box`
    *
    * @deprecated
    */
  var MozBackgroundOrigin: js.UndefOr[BackgroundOriginProperty] = js.undefined
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var MozBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
    *
    * **Syntax**: `<url> | none`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBinding: js.UndefOr[MozBindingProperty] = js.undefined
  
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    *
    * @deprecated
    */
  var MozBorderRadius: js.UndefOr[BorderRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomleft: js.UndefOr[BorderBottomLeftRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomright: js.UndefOr[BorderBottomRightRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopleft: js.UndefOr[BorderTopLeftRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopright: js.UndefOr[BorderTopRightRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var MozBoxAlign: js.UndefOr[BoxAlignProperty] = js.undefined
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var MozBoxDirection: js.UndefOr[BoxDirectionProperty] = js.undefined
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBoxFlex: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var MozBoxOrdinalGroup: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var MozBoxOrient: js.UndefOr[BoxOrientProperty] = js.undefined
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var MozBoxPack: js.UndefOr[BoxPackProperty] = js.undefined
  
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Syntax**: `none | <shadow>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBoxShadow: js.UndefOr[BoxShadowProperty] = js.undefined
  
  /**
    * The non-standard **`-moz-float-edge`** CSS property specifies whether the height and width properties of the element include the margin, border, or padding thickness.
    *
    * **Syntax**: `border-box | content-box | margin-box | padding-box`
    *
    * **Initial value**: `content-box`
    *
    * @deprecated
    */
  var MozFloatEdge: js.UndefOr[MozFloatEdgeProperty] = js.undefined
  
  /**
    * The **`-moz-force-broken-image-icon`** extended CSS property can be used to force the broken image icon to be shown even when a broken image has an `alt` attribute.
    *
    * **Syntax**: `<integer [0,1]>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozForceBrokenImageIcon: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var MozOpacity: js.UndefOr[OpacityProperty] = js.undefined
  
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
    *
    * @deprecated
    */
  var MozOutline: js.UndefOr[OutlineProperty[TLength]] = js.undefined
  
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Syntax**: `<color> | invert`
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * @deprecated
    */
  var MozOutlineColor: js.UndefOr[OutlineColorProperty] = js.undefined
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS property can be used to give an element's `outline` rounded corners.
    *
    * **Syntax**: `<outline-radius>{1,4} [ / <outline-radius>{1,4} ]?`
    *
    * @deprecated
    */
  var MozOutlineRadius: js.UndefOr[MozOutlineRadiusProperty[TLength]] = js.undefined
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-bottomleft`** CSS property can be used to round the bottom-left corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozOutlineRadiusBottomleft: js.UndefOr[MozOutlineRadiusBottomleftProperty[TLength]] = js.undefined
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-bottomright`** CSS property can be used to round the bottom-right corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozOutlineRadiusBottomright: js.UndefOr[MozOutlineRadiusBottomrightProperty[TLength]] = js.undefined
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-topleft`** CSS property can be used to round the top-left corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozOutlineRadiusTopleft: js.UndefOr[MozOutlineRadiusTopleftProperty[TLength]] = js.undefined
  
  /**
    * In Mozilla applications, the **`-moz-outline-radius-topright`** CSS property can be used to round the top-right corner of an element's `outline`.
    *
    * **Syntax**: `<outline-radius>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozOutlineRadiusTopright: js.UndefOr[MozOutlineRadiusToprightProperty[TLength]] = js.undefined
  
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `auto | <'border-style'>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozOutlineStyle: js.UndefOr[OutlineStyleProperty] = js.undefined
  
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * @deprecated
    */
  var MozOutlineWidth: js.UndefOr[OutlineWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Syntax**: `auto | start | end | left | right | center | justify`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozTextAlignLast: js.UndefOr[TextAlignLastProperty] = js.undefined
  
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * @deprecated
    */
  var MozTextDecorationColor: js.UndefOr[TextDecorationColorProperty] = js.undefined
  
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozTextDecorationLine: js.UndefOr[TextDecorationLineProperty] = js.undefined
  
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Syntax**: `solid | double | dotted | dashed | wavy`
    *
    * **Initial value**: `solid`
    *
    * @deprecated
    */
  var MozTextDecorationStyle: js.UndefOr[TextDecorationStyleProperty] = js.undefined
  
  /**
    * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
    *
    * **Syntax**: `auto | none | enabled | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozUserInput: js.UndefOr[MozUserInputProperty] = js.undefined
  
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    *
    * @deprecated
    */
  var OAnimation: js.UndefOr[AnimationProperty] = js.undefined
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDelay: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var OAnimationDirection: js.UndefOr[AnimationDirectionProperty] = js.undefined
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDuration: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationFillMode: js.UndefOr[AnimationFillModeProperty] = js.undefined
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var OAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty] = js.undefined
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationName: js.UndefOr[AnimationNameProperty] = js.undefined
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    *
    * @deprecated
    */
  var OAnimationPlayState: js.UndefOr[AnimationPlayStateProperty] = js.undefined
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty] = js.undefined
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var OBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    *
    * @deprecated
    */
  var OBorderImage: js.UndefOr[BorderImageProperty] = js.undefined
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OTransform: js.UndefOr[TransformProperty] = js.undefined
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    *
    * @deprecated
    */
  var OTransition: js.UndefOr[TransitionProperty] = js.undefined
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDelay: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDuration: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    *
    * @deprecated
    */
  var OTransitionProperty: js.UndefOr[TransitionPropertyProperty] = js.undefined
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var WebkitBoxAlign: js.UndefOr[BoxAlignProperty] = js.undefined
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var WebkitBoxDirection: js.UndefOr[BoxDirectionProperty] = js.undefined
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var WebkitBoxFlex: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxFlexGroup: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var WebkitBoxLines: js.UndefOr[BoxLinesProperty] = js.undefined
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxOrdinalGroup: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var WebkitBoxOrient: js.UndefOr[BoxOrientProperty] = js.undefined
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var WebkitBoxPack: js.UndefOr[BoxPackProperty] = js.undefined
  
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty] = js.undefined
  
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty] = js.undefined
  
  /**
    * In combination with `elevation`, the **`azimuth`** CSS property enables different audio sources to be positioned spatially for aural presentation. This is important in that it provides a natural way to tell several voices apart, as each can be positioned to originate at a different location on the sound stage. Stereo output produce a lateral sound stage, while binaural headphones and multi-speaker setups allow for a fully three-dimensional stage.
    *
    * **Syntax**: `<angle> | [ [ left-side | far-left | left | center-left | center | center-right | right | far-right | right-side ] || behind ] | leftwards | rightwards`
    *
    * **Initial value**: `center`
    *
    * @deprecated
    */
  var azimuth: js.UndefOr[AzimuthProperty] = js.undefined
  
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | baseline | stretch`
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var boxAlign: js.UndefOr[BoxAlignProperty] = js.undefined
  
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Syntax**: `normal | reverse | inherit`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var boxDirection: js.UndefOr[BoxDirectionProperty] = js.undefined
  
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var boxFlex: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxFlexGroup: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Syntax**: `single | multiple`
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var boxLines: js.UndefOr[BoxLinesProperty] = js.undefined
  
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxOrdinalGroup: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var boxOrient: js.UndefOr[BoxOrientProperty] = js.undefined
  
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Syntax**: `start | center | end | justify`
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var boxPack: js.UndefOr[BoxPackProperty] = js.undefined
  
  /**
    * The **`clip`** CSS property defines what portion of an element is visible. The `clip` property applies only to absolutely positioned elements, that is elements with `position:absolute` or `position:fixed`.
    *
    * **Syntax**: `<shape> | auto`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var clip: js.UndefOr[ClipProperty] = js.undefined
  
  /**
    * The **`font-variant-alternates`** CSS property controls the usage of alternate glyphs. These alternate glyphs may be referenced by alternative names defined in `@font-feature-values`.
    *
    * **Syntax**: `normal | [ stylistic( <feature-value-name> ) || historical-forms || styleset( <feature-value-name># ) || character-variant( <feature-value-name># ) || swash( <feature-value-name> ) || ornaments( <feature-value-name> ) || annotation( <feature-value-name> ) ]`
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var fontVariantAlternates: js.UndefOr[FontVariantAlternatesProperty] = js.undefined
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridColumnGap: js.UndefOr[GridColumnGapProperty[TLength]] = js.undefined
  
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * **Syntax**: `<'grid-row-gap'> <'grid-column-gap'>?`
    *
    * @deprecated
    */
  var gridGap: js.UndefOr[GridGapProperty[TLength]] = js.undefined
  
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridRowGap: js.UndefOr[GridRowGapProperty[TLength]] = js.undefined
  
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var imeMode: js.UndefOr[ImeModeProperty] = js.undefined
  
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Syntax**: `auto | normal | active | inactive | disabled`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var msImeMode: js.UndefOr[ImeModeProperty] = js.undefined
  
  /**
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var msScrollbarTrackColor: js.UndefOr[MsScrollbarTrackColorProperty] = js.undefined
  
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlock: js.UndefOr[InsetBlockProperty[TLength]] = js.undefined
  
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockEnd: js.UndefOr[InsetBlockEndProperty[TLength]] = js.undefined
  
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockStart: js.UndefOr[InsetBlockStartProperty[TLength]] = js.undefined
  
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInline: js.UndefOr[InsetInlineProperty[TLength]] = js.undefined
  
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineEnd: js.UndefOr[InsetInlineEndProperty[TLength]] = js.undefined
  
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineStart: js.UndefOr[InsetInlineStartProperty[TLength]] = js.undefined
  
  /**
    * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
    *
    * **Syntax**: `none | <position>#`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapCoordinate: js.UndefOr[ScrollSnapCoordinateProperty[TLength]] = js.undefined
  
  /**
    * The **`scroll-snap-destination`** CSS property defines the position in x and y coordinates within the scroll container's visual viewport which element snap points align with.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `0px 0px`
    *
    * @deprecated
    */
  var scrollSnapDestination: js.UndefOr[ScrollSnapDestinationProperty[TLength]] = js.undefined
  
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty] = js.undefined
  
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Syntax**: `none | repeat( <length-percentage> )`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty] = js.undefined
  
  /**
    * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeX: js.UndefOr[ScrollSnapTypeXProperty] = js.undefined
  
  /**
    * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
    *
    * **Syntax**: `none | mandatory | proximity`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeY: js.UndefOr[ScrollSnapTypeYProperty] = js.undefined
  
  /**
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var scrollbarTrackColor: js.UndefOr[MsScrollbarTrackColorProperty] = js.undefined
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var textCombineHorizontal: js.UndefOr[TextCombineUprightProperty] = js.undefined
}
object ObsoleteProperties {
  
  inline def apply[TLength](): ObsoleteProperties[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObsoleteProperties[TLength]]
  }
  
  extension [Self <: ObsoleteProperties[?], TLength](x: Self & ObsoleteProperties[TLength]) {
    
    inline def setAzimuth(value: AzimuthProperty): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
    
    inline def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
    
    inline def setBoxAlign(value: BoxAlignProperty): Self = StObject.set(x, "boxAlign", value.asInstanceOf[js.Any])
    
    inline def setBoxAlignUndefined: Self = StObject.set(x, "boxAlign", js.undefined)
    
    inline def setBoxDirection(value: BoxDirectionProperty): Self = StObject.set(x, "boxDirection", value.asInstanceOf[js.Any])
    
    inline def setBoxDirectionUndefined: Self = StObject.set(x, "boxDirection", js.undefined)
    
    inline def setBoxFlex(value: GlobalsNumber): Self = StObject.set(x, "boxFlex", value.asInstanceOf[js.Any])
    
    inline def setBoxFlexGroup(value: GlobalsNumber): Self = StObject.set(x, "boxFlexGroup", value.asInstanceOf[js.Any])
    
    inline def setBoxFlexGroupUndefined: Self = StObject.set(x, "boxFlexGroup", js.undefined)
    
    inline def setBoxFlexUndefined: Self = StObject.set(x, "boxFlex", js.undefined)
    
    inline def setBoxLines(value: BoxLinesProperty): Self = StObject.set(x, "boxLines", value.asInstanceOf[js.Any])
    
    inline def setBoxLinesUndefined: Self = StObject.set(x, "boxLines", js.undefined)
    
    inline def setBoxOrdinalGroup(value: GlobalsNumber): Self = StObject.set(x, "boxOrdinalGroup", value.asInstanceOf[js.Any])
    
    inline def setBoxOrdinalGroupUndefined: Self = StObject.set(x, "boxOrdinalGroup", js.undefined)
    
    inline def setBoxOrient(value: BoxOrientProperty): Self = StObject.set(x, "boxOrient", value.asInstanceOf[js.Any])
    
    inline def setBoxOrientUndefined: Self = StObject.set(x, "boxOrient", js.undefined)
    
    inline def setBoxPack(value: BoxPackProperty): Self = StObject.set(x, "boxPack", value.asInstanceOf[js.Any])
    
    inline def setBoxPackUndefined: Self = StObject.set(x, "boxPack", js.undefined)
    
    inline def setClip(value: ClipProperty): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setFontVariantAlternates(value: FontVariantAlternatesProperty): Self = StObject.set(x, "fontVariantAlternates", value.asInstanceOf[js.Any])
    
    inline def setFontVariantAlternatesUndefined: Self = StObject.set(x, "fontVariantAlternates", js.undefined)
    
    inline def setGridColumnGap(value: GridColumnGapProperty[TLength]): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
    
    inline def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
    
    inline def setGridGap(value: GridGapProperty[TLength]): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
    
    inline def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
    
    inline def setGridRowGap(value: GridRowGapProperty[TLength]): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
    
    inline def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
    
    inline def setImeMode(value: ImeModeProperty): Self = StObject.set(x, "imeMode", value.asInstanceOf[js.Any])
    
    inline def setImeModeUndefined: Self = StObject.set(x, "imeMode", js.undefined)
    
    inline def setKhtmlBoxAlign(value: BoxAlignProperty): Self = StObject.set(x, "KhtmlBoxAlign", value.asInstanceOf[js.Any])
    
    inline def setKhtmlBoxAlignUndefined: Self = StObject.set(x, "KhtmlBoxAlign", js.undefined)
    
    inline def setKhtmlBoxDirection(value: BoxDirectionProperty): Self = StObject.set(x, "KhtmlBoxDirection", value.asInstanceOf[js.Any])
    
    inline def setKhtmlBoxDirectionUndefined: Self = StObject.set(x, "KhtmlBoxDirection", js.undefined)
    
    inline def setKhtmlBoxFlex(value: GlobalsNumber): Self = StObject.set(x, "KhtmlBoxFlex", value.asInstanceOf[js.Any])
    
    inline def setKhtmlBoxFlexGroup(value: GlobalsNumber): Self = StObject.set(x, "KhtmlBoxFlexGroup", value.asInstanceOf[js.Any])
    
    inline def setKhtmlBoxFlexGroupUndefined: Self = StObject.set(x, "KhtmlBoxFlexGroup", js.undefined)
    
    inline def setKhtmlBoxFlexUndefined: Self = StObject.set(x, "KhtmlBoxFlex", js.undefined)
    
    inline def setKhtmlBoxLines(value: BoxLinesProperty): Self = StObject.set(x, "KhtmlBoxLines", value.asInstanceOf[js.Any])
    
    inline def setKhtmlBoxLinesUndefined: Self = StObject.set(x, "KhtmlBoxLines", js.undefined)
    
    inline def setKhtmlBoxOrdinalGroup(value: GlobalsNumber): Self = StObject.set(x, "KhtmlBoxOrdinalGroup", value.asInstanceOf[js.Any])
    
    inline def setKhtmlBoxOrdinalGroupUndefined: Self = StObject.set(x, "KhtmlBoxOrdinalGroup", js.undefined)
    
    inline def setKhtmlBoxOrient(value: BoxOrientProperty): Self = StObject.set(x, "KhtmlBoxOrient", value.asInstanceOf[js.Any])
    
    inline def setKhtmlBoxOrientUndefined: Self = StObject.set(x, "KhtmlBoxOrient", js.undefined)
    
    inline def setKhtmlBoxPack(value: BoxPackProperty): Self = StObject.set(x, "KhtmlBoxPack", value.asInstanceOf[js.Any])
    
    inline def setKhtmlBoxPackUndefined: Self = StObject.set(x, "KhtmlBoxPack", js.undefined)
    
    inline def setKhtmlLineBreak(value: LineBreakProperty): Self = StObject.set(x, "KhtmlLineBreak", value.asInstanceOf[js.Any])
    
    inline def setKhtmlLineBreakUndefined: Self = StObject.set(x, "KhtmlLineBreak", js.undefined)
    
    inline def setKhtmlOpacity(value: OpacityProperty): Self = StObject.set(x, "KhtmlOpacity", value.asInstanceOf[js.Any])
    
    inline def setKhtmlOpacityUndefined: Self = StObject.set(x, "KhtmlOpacity", js.undefined)
    
    inline def setKhtmlUserSelect(value: UserSelectProperty): Self = StObject.set(x, "KhtmlUserSelect", value.asInstanceOf[js.Any])
    
    inline def setKhtmlUserSelectUndefined: Self = StObject.set(x, "KhtmlUserSelect", js.undefined)
    
    inline def setMozBackgroundClip(value: BackgroundClipProperty): Self = StObject.set(x, "MozBackgroundClip", value.asInstanceOf[js.Any])
    
    inline def setMozBackgroundClipUndefined: Self = StObject.set(x, "MozBackgroundClip", js.undefined)
    
    inline def setMozBackgroundInlinePolicy(value: BoxDecorationBreakProperty): Self = StObject.set(x, "MozBackgroundInlinePolicy", value.asInstanceOf[js.Any])
    
    inline def setMozBackgroundInlinePolicyUndefined: Self = StObject.set(x, "MozBackgroundInlinePolicy", js.undefined)
    
    inline def setMozBackgroundOrigin(value: BackgroundOriginProperty): Self = StObject.set(x, "MozBackgroundOrigin", value.asInstanceOf[js.Any])
    
    inline def setMozBackgroundOriginUndefined: Self = StObject.set(x, "MozBackgroundOrigin", js.undefined)
    
    inline def setMozBackgroundSize(value: BackgroundSizeProperty[TLength]): Self = StObject.set(x, "MozBackgroundSize", value.asInstanceOf[js.Any])
    
    inline def setMozBackgroundSizeUndefined: Self = StObject.set(x, "MozBackgroundSize", js.undefined)
    
    inline def setMozBinding(value: MozBindingProperty): Self = StObject.set(x, "MozBinding", value.asInstanceOf[js.Any])
    
    inline def setMozBindingUndefined: Self = StObject.set(x, "MozBinding", js.undefined)
    
    inline def setMozBorderRadius(value: BorderRadiusProperty[TLength]): Self = StObject.set(x, "MozBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setMozBorderRadiusBottomleft(value: BorderBottomLeftRadiusProperty[TLength]): Self = StObject.set(x, "MozBorderRadiusBottomleft", value.asInstanceOf[js.Any])
    
    inline def setMozBorderRadiusBottomleftUndefined: Self = StObject.set(x, "MozBorderRadiusBottomleft", js.undefined)
    
    inline def setMozBorderRadiusBottomright(value: BorderBottomRightRadiusProperty[TLength]): Self = StObject.set(x, "MozBorderRadiusBottomright", value.asInstanceOf[js.Any])
    
    inline def setMozBorderRadiusBottomrightUndefined: Self = StObject.set(x, "MozBorderRadiusBottomright", js.undefined)
    
    inline def setMozBorderRadiusTopleft(value: BorderTopLeftRadiusProperty[TLength]): Self = StObject.set(x, "MozBorderRadiusTopleft", value.asInstanceOf[js.Any])
    
    inline def setMozBorderRadiusTopleftUndefined: Self = StObject.set(x, "MozBorderRadiusTopleft", js.undefined)
    
    inline def setMozBorderRadiusTopright(value: BorderTopRightRadiusProperty[TLength]): Self = StObject.set(x, "MozBorderRadiusTopright", value.asInstanceOf[js.Any])
    
    inline def setMozBorderRadiusToprightUndefined: Self = StObject.set(x, "MozBorderRadiusTopright", js.undefined)
    
    inline def setMozBorderRadiusUndefined: Self = StObject.set(x, "MozBorderRadius", js.undefined)
    
    inline def setMozBoxAlign(value: BoxAlignProperty): Self = StObject.set(x, "MozBoxAlign", value.asInstanceOf[js.Any])
    
    inline def setMozBoxAlignUndefined: Self = StObject.set(x, "MozBoxAlign", js.undefined)
    
    inline def setMozBoxDirection(value: BoxDirectionProperty): Self = StObject.set(x, "MozBoxDirection", value.asInstanceOf[js.Any])
    
    inline def setMozBoxDirectionUndefined: Self = StObject.set(x, "MozBoxDirection", js.undefined)
    
    inline def setMozBoxFlex(value: GlobalsNumber): Self = StObject.set(x, "MozBoxFlex", value.asInstanceOf[js.Any])
    
    inline def setMozBoxFlexUndefined: Self = StObject.set(x, "MozBoxFlex", js.undefined)
    
    inline def setMozBoxOrdinalGroup(value: GlobalsNumber): Self = StObject.set(x, "MozBoxOrdinalGroup", value.asInstanceOf[js.Any])
    
    inline def setMozBoxOrdinalGroupUndefined: Self = StObject.set(x, "MozBoxOrdinalGroup", js.undefined)
    
    inline def setMozBoxOrient(value: BoxOrientProperty): Self = StObject.set(x, "MozBoxOrient", value.asInstanceOf[js.Any])
    
    inline def setMozBoxOrientUndefined: Self = StObject.set(x, "MozBoxOrient", js.undefined)
    
    inline def setMozBoxPack(value: BoxPackProperty): Self = StObject.set(x, "MozBoxPack", value.asInstanceOf[js.Any])
    
    inline def setMozBoxPackUndefined: Self = StObject.set(x, "MozBoxPack", js.undefined)
    
    inline def setMozBoxShadow(value: BoxShadowProperty): Self = StObject.set(x, "MozBoxShadow", value.asInstanceOf[js.Any])
    
    inline def setMozBoxShadowUndefined: Self = StObject.set(x, "MozBoxShadow", js.undefined)
    
    inline def setMozFloatEdge(value: MozFloatEdgeProperty): Self = StObject.set(x, "MozFloatEdge", value.asInstanceOf[js.Any])
    
    inline def setMozFloatEdgeUndefined: Self = StObject.set(x, "MozFloatEdge", js.undefined)
    
    inline def setMozForceBrokenImageIcon(value: GlobalsNumber): Self = StObject.set(x, "MozForceBrokenImageIcon", value.asInstanceOf[js.Any])
    
    inline def setMozForceBrokenImageIconUndefined: Self = StObject.set(x, "MozForceBrokenImageIcon", js.undefined)
    
    inline def setMozOpacity(value: OpacityProperty): Self = StObject.set(x, "MozOpacity", value.asInstanceOf[js.Any])
    
    inline def setMozOpacityUndefined: Self = StObject.set(x, "MozOpacity", js.undefined)
    
    inline def setMozOutline(value: OutlineProperty[TLength]): Self = StObject.set(x, "MozOutline", value.asInstanceOf[js.Any])
    
    inline def setMozOutlineColor(value: OutlineColorProperty): Self = StObject.set(x, "MozOutlineColor", value.asInstanceOf[js.Any])
    
    inline def setMozOutlineColorUndefined: Self = StObject.set(x, "MozOutlineColor", js.undefined)
    
    inline def setMozOutlineRadius(value: MozOutlineRadiusProperty[TLength]): Self = StObject.set(x, "MozOutlineRadius", value.asInstanceOf[js.Any])
    
    inline def setMozOutlineRadiusBottomleft(value: MozOutlineRadiusBottomleftProperty[TLength]): Self = StObject.set(x, "MozOutlineRadiusBottomleft", value.asInstanceOf[js.Any])
    
    inline def setMozOutlineRadiusBottomleftUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomleft", js.undefined)
    
    inline def setMozOutlineRadiusBottomright(value: MozOutlineRadiusBottomrightProperty[TLength]): Self = StObject.set(x, "MozOutlineRadiusBottomright", value.asInstanceOf[js.Any])
    
    inline def setMozOutlineRadiusBottomrightUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomright", js.undefined)
    
    inline def setMozOutlineRadiusTopleft(value: MozOutlineRadiusTopleftProperty[TLength]): Self = StObject.set(x, "MozOutlineRadiusTopleft", value.asInstanceOf[js.Any])
    
    inline def setMozOutlineRadiusTopleftUndefined: Self = StObject.set(x, "MozOutlineRadiusTopleft", js.undefined)
    
    inline def setMozOutlineRadiusTopright(value: MozOutlineRadiusToprightProperty[TLength]): Self = StObject.set(x, "MozOutlineRadiusTopright", value.asInstanceOf[js.Any])
    
    inline def setMozOutlineRadiusToprightUndefined: Self = StObject.set(x, "MozOutlineRadiusTopright", js.undefined)
    
    inline def setMozOutlineRadiusUndefined: Self = StObject.set(x, "MozOutlineRadius", js.undefined)
    
    inline def setMozOutlineStyle(value: OutlineStyleProperty): Self = StObject.set(x, "MozOutlineStyle", value.asInstanceOf[js.Any])
    
    inline def setMozOutlineStyleUndefined: Self = StObject.set(x, "MozOutlineStyle", js.undefined)
    
    inline def setMozOutlineUndefined: Self = StObject.set(x, "MozOutline", js.undefined)
    
    inline def setMozOutlineWidth(value: OutlineWidthProperty[TLength]): Self = StObject.set(x, "MozOutlineWidth", value.asInstanceOf[js.Any])
    
    inline def setMozOutlineWidthUndefined: Self = StObject.set(x, "MozOutlineWidth", js.undefined)
    
    inline def setMozTextAlignLast(value: TextAlignLastProperty): Self = StObject.set(x, "MozTextAlignLast", value.asInstanceOf[js.Any])
    
    inline def setMozTextAlignLastUndefined: Self = StObject.set(x, "MozTextAlignLast", js.undefined)
    
    inline def setMozTextDecorationColor(value: TextDecorationColorProperty): Self = StObject.set(x, "MozTextDecorationColor", value.asInstanceOf[js.Any])
    
    inline def setMozTextDecorationColorUndefined: Self = StObject.set(x, "MozTextDecorationColor", js.undefined)
    
    inline def setMozTextDecorationLine(value: TextDecorationLineProperty): Self = StObject.set(x, "MozTextDecorationLine", value.asInstanceOf[js.Any])
    
    inline def setMozTextDecorationLineUndefined: Self = StObject.set(x, "MozTextDecorationLine", js.undefined)
    
    inline def setMozTextDecorationStyle(value: TextDecorationStyleProperty): Self = StObject.set(x, "MozTextDecorationStyle", value.asInstanceOf[js.Any])
    
    inline def setMozTextDecorationStyleUndefined: Self = StObject.set(x, "MozTextDecorationStyle", js.undefined)
    
    inline def setMozUserInput(value: MozUserInputProperty): Self = StObject.set(x, "MozUserInput", value.asInstanceOf[js.Any])
    
    inline def setMozUserInputUndefined: Self = StObject.set(x, "MozUserInput", js.undefined)
    
    inline def setMsImeMode(value: ImeModeProperty): Self = StObject.set(x, "msImeMode", value.asInstanceOf[js.Any])
    
    inline def setMsImeModeUndefined: Self = StObject.set(x, "msImeMode", js.undefined)
    
    inline def setMsScrollbarTrackColor(value: MsScrollbarTrackColorProperty): Self = StObject.set(x, "msScrollbarTrackColor", value.asInstanceOf[js.Any])
    
    inline def setMsScrollbarTrackColorUndefined: Self = StObject.set(x, "msScrollbarTrackColor", js.undefined)
    
    inline def setOAnimation(value: AnimationProperty): Self = StObject.set(x, "OAnimation", value.asInstanceOf[js.Any])
    
    inline def setOAnimationDelay(value: GlobalsString): Self = StObject.set(x, "OAnimationDelay", value.asInstanceOf[js.Any])
    
    inline def setOAnimationDelayUndefined: Self = StObject.set(x, "OAnimationDelay", js.undefined)
    
    inline def setOAnimationDirection(value: AnimationDirectionProperty): Self = StObject.set(x, "OAnimationDirection", value.asInstanceOf[js.Any])
    
    inline def setOAnimationDirectionUndefined: Self = StObject.set(x, "OAnimationDirection", js.undefined)
    
    inline def setOAnimationDuration(value: GlobalsString): Self = StObject.set(x, "OAnimationDuration", value.asInstanceOf[js.Any])
    
    inline def setOAnimationDurationUndefined: Self = StObject.set(x, "OAnimationDuration", js.undefined)
    
    inline def setOAnimationFillMode(value: AnimationFillModeProperty): Self = StObject.set(x, "OAnimationFillMode", value.asInstanceOf[js.Any])
    
    inline def setOAnimationFillModeUndefined: Self = StObject.set(x, "OAnimationFillMode", js.undefined)
    
    inline def setOAnimationIterationCount(value: AnimationIterationCountProperty): Self = StObject.set(x, "OAnimationIterationCount", value.asInstanceOf[js.Any])
    
    inline def setOAnimationIterationCountUndefined: Self = StObject.set(x, "OAnimationIterationCount", js.undefined)
    
    inline def setOAnimationName(value: AnimationNameProperty): Self = StObject.set(x, "OAnimationName", value.asInstanceOf[js.Any])
    
    inline def setOAnimationNameUndefined: Self = StObject.set(x, "OAnimationName", js.undefined)
    
    inline def setOAnimationPlayState(value: AnimationPlayStateProperty): Self = StObject.set(x, "OAnimationPlayState", value.asInstanceOf[js.Any])
    
    inline def setOAnimationPlayStateUndefined: Self = StObject.set(x, "OAnimationPlayState", js.undefined)
    
    inline def setOAnimationTimingFunction(value: AnimationTimingFunctionProperty): Self = StObject.set(x, "OAnimationTimingFunction", value.asInstanceOf[js.Any])
    
    inline def setOAnimationTimingFunctionUndefined: Self = StObject.set(x, "OAnimationTimingFunction", js.undefined)
    
    inline def setOAnimationUndefined: Self = StObject.set(x, "OAnimation", js.undefined)
    
    inline def setOBackgroundSize(value: BackgroundSizeProperty[TLength]): Self = StObject.set(x, "OBackgroundSize", value.asInstanceOf[js.Any])
    
    inline def setOBackgroundSizeUndefined: Self = StObject.set(x, "OBackgroundSize", js.undefined)
    
    inline def setOBorderImage(value: BorderImageProperty): Self = StObject.set(x, "OBorderImage", value.asInstanceOf[js.Any])
    
    inline def setOBorderImageUndefined: Self = StObject.set(x, "OBorderImage", js.undefined)
    
    inline def setOTransform(value: TransformProperty): Self = StObject.set(x, "OTransform", value.asInstanceOf[js.Any])
    
    inline def setOTransformUndefined: Self = StObject.set(x, "OTransform", js.undefined)
    
    inline def setOTransition(value: TransitionProperty): Self = StObject.set(x, "OTransition", value.asInstanceOf[js.Any])
    
    inline def setOTransitionDelay(value: GlobalsString): Self = StObject.set(x, "OTransitionDelay", value.asInstanceOf[js.Any])
    
    inline def setOTransitionDelayUndefined: Self = StObject.set(x, "OTransitionDelay", js.undefined)
    
    inline def setOTransitionDuration(value: GlobalsString): Self = StObject.set(x, "OTransitionDuration", value.asInstanceOf[js.Any])
    
    inline def setOTransitionDurationUndefined: Self = StObject.set(x, "OTransitionDuration", js.undefined)
    
    inline def setOTransitionProperty(value: TransitionPropertyProperty): Self = StObject.set(x, "OTransitionProperty", value.asInstanceOf[js.Any])
    
    inline def setOTransitionPropertyUndefined: Self = StObject.set(x, "OTransitionProperty", js.undefined)
    
    inline def setOTransitionTimingFunction(value: TransitionTimingFunctionProperty): Self = StObject.set(x, "OTransitionTimingFunction", value.asInstanceOf[js.Any])
    
    inline def setOTransitionTimingFunctionUndefined: Self = StObject.set(x, "OTransitionTimingFunction", js.undefined)
    
    inline def setOTransitionUndefined: Self = StObject.set(x, "OTransition", js.undefined)
    
    inline def setOffsetBlock(value: InsetBlockProperty[TLength]): Self = StObject.set(x, "offsetBlock", value.asInstanceOf[js.Any])
    
    inline def setOffsetBlockEnd(value: InsetBlockEndProperty[TLength]): Self = StObject.set(x, "offsetBlockEnd", value.asInstanceOf[js.Any])
    
    inline def setOffsetBlockEndUndefined: Self = StObject.set(x, "offsetBlockEnd", js.undefined)
    
    inline def setOffsetBlockStart(value: InsetBlockStartProperty[TLength]): Self = StObject.set(x, "offsetBlockStart", value.asInstanceOf[js.Any])
    
    inline def setOffsetBlockStartUndefined: Self = StObject.set(x, "offsetBlockStart", js.undefined)
    
    inline def setOffsetBlockUndefined: Self = StObject.set(x, "offsetBlock", js.undefined)
    
    inline def setOffsetInline(value: InsetInlineProperty[TLength]): Self = StObject.set(x, "offsetInline", value.asInstanceOf[js.Any])
    
    inline def setOffsetInlineEnd(value: InsetInlineEndProperty[TLength]): Self = StObject.set(x, "offsetInlineEnd", value.asInstanceOf[js.Any])
    
    inline def setOffsetInlineEndUndefined: Self = StObject.set(x, "offsetInlineEnd", js.undefined)
    
    inline def setOffsetInlineStart(value: InsetInlineStartProperty[TLength]): Self = StObject.set(x, "offsetInlineStart", value.asInstanceOf[js.Any])
    
    inline def setOffsetInlineStartUndefined: Self = StObject.set(x, "offsetInlineStart", js.undefined)
    
    inline def setOffsetInlineUndefined: Self = StObject.set(x, "offsetInline", js.undefined)
    
    inline def setScrollSnapCoordinate(value: ScrollSnapCoordinateProperty[TLength]): Self = StObject.set(x, "scrollSnapCoordinate", value.asInstanceOf[js.Any])
    
    inline def setScrollSnapCoordinateUndefined: Self = StObject.set(x, "scrollSnapCoordinate", js.undefined)
    
    inline def setScrollSnapDestination(value: ScrollSnapDestinationProperty[TLength]): Self = StObject.set(x, "scrollSnapDestination", value.asInstanceOf[js.Any])
    
    inline def setScrollSnapDestinationUndefined: Self = StObject.set(x, "scrollSnapDestination", js.undefined)
    
    inline def setScrollSnapPointsX(value: ScrollSnapPointsXProperty): Self = StObject.set(x, "scrollSnapPointsX", value.asInstanceOf[js.Any])
    
    inline def setScrollSnapPointsXUndefined: Self = StObject.set(x, "scrollSnapPointsX", js.undefined)
    
    inline def setScrollSnapPointsY(value: ScrollSnapPointsYProperty): Self = StObject.set(x, "scrollSnapPointsY", value.asInstanceOf[js.Any])
    
    inline def setScrollSnapPointsYUndefined: Self = StObject.set(x, "scrollSnapPointsY", js.undefined)
    
    inline def setScrollSnapTypeX(value: ScrollSnapTypeXProperty): Self = StObject.set(x, "scrollSnapTypeX", value.asInstanceOf[js.Any])
    
    inline def setScrollSnapTypeXUndefined: Self = StObject.set(x, "scrollSnapTypeX", js.undefined)
    
    inline def setScrollSnapTypeY(value: ScrollSnapTypeYProperty): Self = StObject.set(x, "scrollSnapTypeY", value.asInstanceOf[js.Any])
    
    inline def setScrollSnapTypeYUndefined: Self = StObject.set(x, "scrollSnapTypeY", js.undefined)
    
    inline def setScrollbarTrackColor(value: MsScrollbarTrackColorProperty): Self = StObject.set(x, "scrollbarTrackColor", value.asInstanceOf[js.Any])
    
    inline def setScrollbarTrackColorUndefined: Self = StObject.set(x, "scrollbarTrackColor", js.undefined)
    
    inline def setTextCombineHorizontal(value: TextCombineUprightProperty): Self = StObject.set(x, "textCombineHorizontal", value.asInstanceOf[js.Any])
    
    inline def setTextCombineHorizontalUndefined: Self = StObject.set(x, "textCombineHorizontal", js.undefined)
    
    inline def setWebkitBoxAlign(value: BoxAlignProperty): Self = StObject.set(x, "WebkitBoxAlign", value.asInstanceOf[js.Any])
    
    inline def setWebkitBoxAlignUndefined: Self = StObject.set(x, "WebkitBoxAlign", js.undefined)
    
    inline def setWebkitBoxDirection(value: BoxDirectionProperty): Self = StObject.set(x, "WebkitBoxDirection", value.asInstanceOf[js.Any])
    
    inline def setWebkitBoxDirectionUndefined: Self = StObject.set(x, "WebkitBoxDirection", js.undefined)
    
    inline def setWebkitBoxFlex(value: GlobalsNumber): Self = StObject.set(x, "WebkitBoxFlex", value.asInstanceOf[js.Any])
    
    inline def setWebkitBoxFlexGroup(value: GlobalsNumber): Self = StObject.set(x, "WebkitBoxFlexGroup", value.asInstanceOf[js.Any])
    
    inline def setWebkitBoxFlexGroupUndefined: Self = StObject.set(x, "WebkitBoxFlexGroup", js.undefined)
    
    inline def setWebkitBoxFlexUndefined: Self = StObject.set(x, "WebkitBoxFlex", js.undefined)
    
    inline def setWebkitBoxLines(value: BoxLinesProperty): Self = StObject.set(x, "WebkitBoxLines", value.asInstanceOf[js.Any])
    
    inline def setWebkitBoxLinesUndefined: Self = StObject.set(x, "WebkitBoxLines", js.undefined)
    
    inline def setWebkitBoxOrdinalGroup(value: GlobalsNumber): Self = StObject.set(x, "WebkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
    
    inline def setWebkitBoxOrdinalGroupUndefined: Self = StObject.set(x, "WebkitBoxOrdinalGroup", js.undefined)
    
    inline def setWebkitBoxOrient(value: BoxOrientProperty): Self = StObject.set(x, "WebkitBoxOrient", value.asInstanceOf[js.Any])
    
    inline def setWebkitBoxOrientUndefined: Self = StObject.set(x, "WebkitBoxOrient", js.undefined)
    
    inline def setWebkitBoxPack(value: BoxPackProperty): Self = StObject.set(x, "WebkitBoxPack", value.asInstanceOf[js.Any])
    
    inline def setWebkitBoxPackUndefined: Self = StObject.set(x, "WebkitBoxPack", js.undefined)
    
    inline def setWebkitScrollSnapPointsX(value: ScrollSnapPointsXProperty): Self = StObject.set(x, "WebkitScrollSnapPointsX", value.asInstanceOf[js.Any])
    
    inline def setWebkitScrollSnapPointsXUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsX", js.undefined)
    
    inline def setWebkitScrollSnapPointsY(value: ScrollSnapPointsYProperty): Self = StObject.set(x, "WebkitScrollSnapPointsY", value.asInstanceOf[js.Any])
    
    inline def setWebkitScrollSnapPointsYUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsY", js.undefined)
  }
}
