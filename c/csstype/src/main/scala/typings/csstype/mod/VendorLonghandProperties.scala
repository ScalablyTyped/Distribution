package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VendorLonghandProperties[TLength] extends js.Object {
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Initial value**: `0s`
    */
  var MozAnimationDelay: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Initial value**: `normal`
    */
  var MozAnimationDirection: js.UndefOr[AnimationDirectionProperty] = js.undefined
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Initial value**: `0s`
    */
  var MozAnimationDuration: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Initial value**: `none`
    */
  var MozAnimationFillMode: js.UndefOr[AnimationFillModeProperty] = js.undefined
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Initial value**: `1`
    */
  var MozAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty] = js.undefined
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Initial value**: `none`
    */
  var MozAnimationName: js.UndefOr[AnimationNameProperty] = js.undefined
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Initial value**: `running`
    */
  var MozAnimationPlayState: js.UndefOr[AnimationPlayStateProperty] = js.undefined
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Initial value**: `ease`
    */
  var MozAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty] = js.undefined
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Initial value**: `none` (but this value is overridden in the user agent CSS)
    */
  var MozAppearance: js.UndefOr[MozAppearanceProperty] = js.undefined
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Initial value**: `visible`
    */
  var MozBackfaceVisibility: js.UndefOr[BackfaceVisibilityProperty] = js.undefined
  /**
    * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    */
  var MozBorderEndColor: js.UndefOr[BorderInlineEndColorProperty] = js.undefined
  /**
    * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    */
  var MozBorderEndStyle: js.UndefOr[BorderInlineEndStyleProperty] = js.undefined
  /**
    * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    */
  var MozBorderEndWidth: js.UndefOr[BorderInlineEndWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    */
  var MozBorderStartColor: js.UndefOr[BorderInlineStartColorProperty] = js.undefined
  /**
    * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    */
  var MozBorderStartStyle: js.UndefOr[BorderInlineStartStyleProperty] = js.undefined
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Initial value**: `content-box`
    */
  var MozBoxSizing: js.UndefOr[BoxSizingProperty] = js.undefined
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Initial value**: `auto`
    */
  var MozColumnCount: js.UndefOr[ColumnCountProperty] = js.undefined
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Initial value**: `balance`
    */
  var MozColumnFill: js.UndefOr[ColumnFillProperty] = js.undefined
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Initial value**: `normal`
    */
  var MozColumnGap: js.UndefOr[ColumnGapProperty[TLength]] = js.undefined
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `currentcolor`
    */
  var MozColumnRuleColor: js.UndefOr[ColumnRuleColorProperty] = js.undefined
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Initial value**: `none`
    */
  var MozColumnRuleStyle: js.UndefOr[ColumnRuleStyleProperty] = js.undefined
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `medium`
    */
  var MozColumnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.undefined
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Initial value**: `auto`
    */
  var MozColumnWidth: js.UndefOr[ColumnWidthProperty[TLength]] = js.undefined
  /**
    * If you reference an SVG image in a webpage (such as with the `<img>` element or as a background image), the SVG image can coordinate with the embedding element (its context) to have the image adopt property values set on the embedding element. To do this the embedding element needs to list the properties that are to be made available to the image by listing them as values of the **`-moz-context-properties`** property, and the image needs to opt in to using those properties by using values such as the `context-fill` value.
    *
    * **Initial value**: `none`
    */
  var MozContextProperties: js.UndefOr[MozContextPropertiesProperty] = js.undefined
  /**
    * The non-standard **`-moz-float-edge`** CSS property specifies whether the height and width properties of the element include the margin, border, or padding thickness.
    *
    * **Initial value**: `content-box`
    */
  var MozFloatEdge: js.UndefOr[MozFloatEdgeProperty] = js.undefined
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Initial value**: `normal`
    */
  var MozFontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty] = js.undefined
  /**
    * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
    *
    * **Initial value**: `normal`
    */
  var MozFontLanguageOverride: js.UndefOr[FontLanguageOverrideProperty] = js.undefined
  /**
    * The **`-moz-force-broken-image-icon`** extended CSS property can be used to force the broken image icon to be shown even when a broken image has an `alt` attribute.
    *
    * **Initial value**: `0`
    */
  var MozForceBrokenImageIcon: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Initial value**: `manual`
    */
  var MozHyphens: js.UndefOr[HyphensProperty] = js.undefined
  /**
    * For certain XUL elements and pseudo-elements that use an image from the `list-style-image` property, this property specifies a region of the image that is used in place of the whole image. This allows elements to use different pieces of the same image to improve performance.
    *
    * **Initial value**: `auto`
    */
  var MozImageRegion: js.UndefOr[MozImageRegionProperty] = js.undefined
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    */
  var MozMarginEnd: js.UndefOr[MarginInlineEndProperty[TLength]] = js.undefined
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    */
  var MozMarginStart: js.UndefOr[MarginInlineStartProperty[TLength]] = js.undefined
  /**
    * The **`-moz-orient`** CSS property specifies the orientation of the element to which it's applied.
    *
    * **Initial value**: `inline`
    */
  var MozOrient: js.UndefOr[MozOrientProperty] = js.undefined
  /**
    * In Mozilla applications, the **`-moz-outline-radius-bottomleft`** CSS property can be used to round the bottom-left corner of an element's `outline`.
    *
    * **Initial value**: `0`
    */
  var MozOutlineRadiusBottomleft: js.UndefOr[MozOutlineRadiusBottomleftProperty[TLength]] = js.undefined
  /**
    * In Mozilla applications, the **`-moz-outline-radius-bottomright`** CSS property can be used to round the bottom-right corner of an element's `outline`.
    *
    * **Initial value**: `0`
    */
  var MozOutlineRadiusBottomright: js.UndefOr[MozOutlineRadiusBottomrightProperty[TLength]] = js.undefined
  /**
    * In Mozilla applications, the **`-moz-outline-radius-topleft`** CSS property can be used to round the top-left corner of an element's `outline`.
    *
    * **Initial value**: `0`
    */
  var MozOutlineRadiusTopleft: js.UndefOr[MozOutlineRadiusTopleftProperty[TLength]] = js.undefined
  /**
    * In Mozilla applications, the **`-moz-outline-radius-topright`** CSS property can be used to round the top-right corner of an element's `outline`.
    *
    * **Initial value**: `0`
    */
  var MozOutlineRadiusTopright: js.UndefOr[MozOutlineRadiusToprightProperty[TLength]] = js.undefined
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    */
  var MozPaddingEnd: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.undefined
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    */
  var MozPaddingStart: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.undefined
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Initial value**: `none`
    */
  var MozPerspective: js.UndefOr[PerspectiveProperty[TLength]] = js.undefined
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Initial value**: `50% 50%`
    */
  var MozPerspectiveOrigin: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.undefined
  /**
    * **`-moz-stack-sizing`** is an extended CSS property. Normally, a `stack` will change its size so that all of its child elements are completely visible. For example, moving a child of the stack far to the right will widen the stack so the child remains visible.
    *
    * **Initial value**: `stretch-to-fit`
    */
  var MozStackSizing: js.UndefOr[MozStackSizingProperty] = js.undefined
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Initial value**: `8`
    */
  var MozTabSize: js.UndefOr[TabSizeProperty[TLength]] = js.undefined
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    */
  var MozTextSizeAdjust: js.UndefOr[TextSizeAdjustProperty] = js.undefined
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Initial value**: `50% 50% 0`
    */
  var MozTransformOrigin: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Initial value**: `flat`
    */
  var MozTransformStyle: js.UndefOr[TransformStyleProperty] = js.undefined
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Initial value**: `0s`
    */
  var MozTransitionDelay: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Initial value**: `0s`
    */
  var MozTransitionDuration: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Initial value**: all
    */
  var MozTransitionProperty: js.UndefOr[TransitionPropertyProperty] = js.undefined
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Initial value**: `ease`
    */
  var MozTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  /**
    * The **`-moz-user-focus`** CSS property is used to indicate whether an element can have the focus.
    *
    * **Initial value**: `none`
    */
  var MozUserFocus: js.UndefOr[MozUserFocusProperty] = js.undefined
  /**
    * The **`user-modify`** property has no effect in Firefox. It was originally planned to determine whether or not the content of an element can be edited by a user.
    *
    * **Initial value**: `read-only`
    */
  var MozUserModify: js.UndefOr[MozUserModifyProperty] = js.undefined
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `auto`
    */
  var MozUserSelect: js.UndefOr[UserSelectProperty] = js.undefined
  /**
    * The **`-moz-window-dragging`** CSS property specifies whether a window is draggable or not. It only works in Chrome code, and only on Mac OS X.
    *
    * **Initial value**: `drag`
    */
  var MozWindowDragging: js.UndefOr[MozWindowDraggingProperty] = js.undefined
  /**
    * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Initial value**: `fill`
    */
  var OObjectFit: js.UndefOr[ObjectFitProperty] = js.undefined
  /**
    * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
    *
    * **Initial value**: `50% 50%`
    */
  var OObjectPosition: js.UndefOr[ObjectPositionProperty[TLength]] = js.undefined
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Initial value**: `8`
    */
  var OTabSize: js.UndefOr[TabSizeProperty[TLength]] = js.undefined
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Initial value**: `clip`
    */
  var OTextOverflow: js.UndefOr[TextOverflowProperty] = js.undefined
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Initial value**: `50% 50% 0`
    */
  var OTransformOrigin: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  /**
    * The CSS **`align-content`** property sets how the browser distributes space between and around content items along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * **Initial value**: `normal`
    */
  var WebkitAlignContent: js.UndefOr[AlignContentProperty] = js.undefined
  /**
    * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align-self property sets the alignment of an item within its containing block. In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment of items on the Block Axis within their grid area.
    *
    * **Initial value**: `normal`
    */
  var WebkitAlignItems: js.UndefOr[AlignItemsProperty] = js.undefined
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Initial value**: `auto`
    */
  var WebkitAlignSelf: js.UndefOr[AlignSelfProperty] = js.undefined
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Initial value**: `0s`
    */
  var WebkitAnimationDelay: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Initial value**: `normal`
    */
  var WebkitAnimationDirection: js.UndefOr[AnimationDirectionProperty] = js.undefined
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Initial value**: `0s`
    */
  var WebkitAnimationDuration: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Initial value**: `none`
    */
  var WebkitAnimationFillMode: js.UndefOr[AnimationFillModeProperty] = js.undefined
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Initial value**: `1`
    */
  var WebkitAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty] = js.undefined
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Initial value**: `none`
    */
  var WebkitAnimationName: js.UndefOr[AnimationNameProperty] = js.undefined
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Initial value**: `running`
    */
  var WebkitAnimationPlayState: js.UndefOr[AnimationPlayStateProperty] = js.undefined
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Initial value**: `ease`
    */
  var WebkitAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty] = js.undefined
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Initial value**: `none` (but this value is overridden in the user agent CSS)
    */
  var WebkitAppearance: js.UndefOr[WebkitAppearanceProperty] = js.undefined
  /**
    * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
    *
    * **Initial value**: `none`
    */
  var WebkitBackdropFilter: js.UndefOr[BackdropFilterProperty] = js.undefined
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Initial value**: `visible`
    */
  var WebkitBackfaceVisibility: js.UndefOr[BackfaceVisibilityProperty] = js.undefined
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Initial value**: `border-box`
    */
  var WebkitBackgroundClip: js.UndefOr[BackgroundClipProperty] = js.undefined
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Initial value**: `padding-box`
    */
  var WebkitBackgroundOrigin: js.UndefOr[BackgroundOriginProperty] = js.undefined
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    */
  var WebkitBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength]] = js.undefined
  /** **Initial value**: `currentcolor` */
  var WebkitBorderBeforeColor: js.UndefOr[WebkitBorderBeforeColorProperty] = js.undefined
  /** **Initial value**: `none` */
  var WebkitBorderBeforeStyle: js.UndefOr[WebkitBorderBeforeStyleProperty] = js.undefined
  /** **Initial value**: `medium` */
  var WebkitBorderBeforeWidth: js.UndefOr[WebkitBorderBeforeWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Initial value**: `0`
    */
  var WebkitBorderBottomLeftRadius: js.UndefOr[BorderBottomLeftRadiusProperty[TLength]] = js.undefined
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Initial value**: `0`
    */
  var WebkitBorderBottomRightRadius: js.UndefOr[BorderBottomRightRadiusProperty[TLength]] = js.undefined
  /**
    * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
    *
    * **Initial value**: `100%`
    */
  var WebkitBorderImageSlice: js.UndefOr[BorderImageSliceProperty] = js.undefined
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Initial value**: `0`
    */
  var WebkitBorderTopLeftRadius: js.UndefOr[BorderTopLeftRadiusProperty[TLength]] = js.undefined
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Initial value**: `0`
    */
  var WebkitBorderTopRightRadius: js.UndefOr[BorderTopRightRadiusProperty[TLength]] = js.undefined
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Initial value**: `slice`
    */
  var WebkitBoxDecorationBreak: js.UndefOr[BoxDecorationBreakProperty] = js.undefined
  /**
    * The **`-webkit-box-reflect`** CSS property lets you reflect the content of an element in one specific direction.
    *
    * **Initial value**: `none`
    */
  var WebkitBoxReflect: js.UndefOr[WebkitBoxReflectProperty[TLength]] = js.undefined
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Initial value**: `none`
    */
  var WebkitBoxShadow: js.UndefOr[BoxShadowProperty] = js.undefined
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Initial value**: `content-box`
    */
  var WebkitBoxSizing: js.UndefOr[BoxSizingProperty] = js.undefined
  /**
    * The `**clip-path**` CSS property creates a clipping region that sets what part of an element should be shown. Parts that are inside the region are shown, while those outside are hidden.
    *
    * **Initial value**: `none`
    */
  var WebkitClipPath: js.UndefOr[ClipPathProperty] = js.undefined
  /**
    * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
    *
    * **Initial value**: `economy`
    */
  var WebkitColorAdjust: js.UndefOr[ColorAdjustProperty] = js.undefined
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Initial value**: `auto`
    */
  var WebkitColumnCount: js.UndefOr[ColumnCountProperty] = js.undefined
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Initial value**: `balance`
    */
  var WebkitColumnFill: js.UndefOr[ColumnFillProperty] = js.undefined
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Initial value**: `normal`
    */
  var WebkitColumnGap: js.UndefOr[ColumnGapProperty[TLength]] = js.undefined
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitColumnRuleColor: js.UndefOr[ColumnRuleColorProperty] = js.undefined
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Initial value**: `none`
    */
  var WebkitColumnRuleStyle: js.UndefOr[ColumnRuleStyleProperty] = js.undefined
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `medium`
    */
  var WebkitColumnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.undefined
  /**
    * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
    *
    * **Initial value**: `none`
    */
  var WebkitColumnSpan: js.UndefOr[ColumnSpanProperty] = js.undefined
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Initial value**: `auto`
    */
  var WebkitColumnWidth: js.UndefOr[ColumnWidthProperty[TLength]] = js.undefined
  /**
    * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
    *
    * **Initial value**: `none`
    */
  var WebkitFilter: js.UndefOr[FilterProperty] = js.undefined
  /**
    * The **`flex-basis`** CSS property sets the initial main size of a flex item. It sets the size of the content box unless otherwise set with `box-sizing`.
    *
    * **Initial value**: `auto`
    */
  var WebkitFlexBasis: js.UndefOr[FlexBasisProperty[TLength]] = js.undefined
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Initial value**: `row`
    */
  var WebkitFlexDirection: js.UndefOr[FlexDirectionProperty] = js.undefined
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Initial value**: `0`
    */
  var WebkitFlexGrow: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
    *
    * **Initial value**: `1`
    */
  var WebkitFlexShrink: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * **Initial value**: `nowrap`
    */
  var WebkitFlexWrap: js.UndefOr[FlexWrapProperty] = js.undefined
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Initial value**: `normal`
    */
  var WebkitFontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty] = js.undefined
  /**
    * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
    *
    * **Initial value**: `auto`
    */
  var WebkitFontKerning: js.UndefOr[FontKerningProperty] = js.undefined
  /**
    * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
    *
    * **Initial value**: `normal`
    */
  var WebkitFontVariantLigatures: js.UndefOr[FontVariantLigaturesProperty] = js.undefined
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Initial value**: `manual`
    */
  var WebkitHyphens: js.UndefOr[HyphensProperty] = js.undefined
  /**
    * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * **Initial value**: `normal`
    */
  var WebkitJustifyContent: js.UndefOr[JustifyContentProperty] = js.undefined
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Initial value**: `auto`
    */
  var WebkitLineBreak: js.UndefOr[LineBreakProperty] = js.undefined
  /**
    * The **`-webkit-line-clamp`** CSS property allows limiting of the contents of a block container to the specified number of lines.
    *
    * **Initial value**: `none`
    */
  var WebkitLineClamp: js.UndefOr[WebkitLineClampProperty] = js.undefined
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    */
  var WebkitMarginEnd: js.UndefOr[MarginInlineEndProperty[TLength]] = js.undefined
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    */
  var WebkitMarginStart: js.UndefOr[MarginInlineStartProperty[TLength]] = js.undefined
  /**
    * If a `-webkit-mask-image` is specified, `-webkit-mask-attachment` determines whether the mask image's position is fixed within the viewport, or scrolls along with its containing block.
    *
    * **Initial value**: `scroll`
    */
  var WebkitMaskAttachment: js.UndefOr[WebkitMaskAttachmentProperty] = js.undefined
  /**
    * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
    *
    * **Initial value**: `border`
    */
  var WebkitMaskClip: js.UndefOr[WebkitMaskClipProperty] = js.undefined
  /**
    * The **`-webkit-mask-composite`** property specifies the manner in which multiple mask images applied to the same element are composited with one another. Mask images are composited in the opposite order that they are declared with the `-webkit-mask-image` property.
    *
    * **Initial value**: `source-over`
    */
  var WebkitMaskComposite: js.UndefOr[WebkitMaskCompositeProperty] = js.undefined
  /**
    * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
    *
    * **Initial value**: `none`
    */
  var WebkitMaskImage: js.UndefOr[WebkitMaskImageProperty] = js.undefined
  /**
    * The **`mask-origin`** CSS property sets the origin of a mask.
    *
    * **Initial value**: `padding`
    */
  var WebkitMaskOrigin: js.UndefOr[WebkitMaskOriginProperty] = js.undefined
  /**
    * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
    *
    * **Initial value**: `0% 0%`
    */
  var WebkitMaskPosition: js.UndefOr[WebkitMaskPositionProperty[TLength]] = js.undefined
  /**
    * The `-webkit-mask-position-x` CSS property sets the initial horizontal position of a mask image.
    *
    * **Initial value**: `0%`
    */
  var WebkitMaskPositionX: js.UndefOr[WebkitMaskPositionXProperty[TLength]] = js.undefined
  /**
    * The `-webkit-mask-position-y` CSS property sets the initial vertical position of a mask image.
    *
    * **Initial value**: `0%`
    */
  var WebkitMaskPositionY: js.UndefOr[WebkitMaskPositionYProperty[TLength]] = js.undefined
  /**
    * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Initial value**: `repeat`
    */
  var WebkitMaskRepeat: js.UndefOr[WebkitMaskRepeatProperty] = js.undefined
  /**
    * The `-webkit-mask-repeat-x` property specifies whether and how a mask image is repeated (tiled) horizontally.
    *
    * **Initial value**: `repeat`
    */
  var WebkitMaskRepeatX: js.UndefOr[WebkitMaskRepeatXProperty] = js.undefined
  /**
    * The `-webkit-mask-repeat-y` property sets whether and how a mask image is repeated (tiled) vertically.
    *
    * **Initial value**: `repeat`
    */
  var WebkitMaskRepeatY: js.UndefOr[WebkitMaskRepeatYProperty] = js.undefined
  /**
    * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
    *
    * **Initial value**: `auto auto`
    */
  var WebkitMaskSize: js.UndefOr[WebkitMaskSizeProperty[TLength]] = js.undefined
  /**
    * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
    *
    * **Initial value**: `0`
    */
  var WebkitMaxInlineSize: js.UndefOr[MaxInlineSizeProperty[TLength]] = js.undefined
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Initial value**: `0`
    */
  var WebkitOrder: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The `-webkit-overflow-scrolling` CSS property controls whether or not touch devices use momentum-based scrolling for a given element.
    *
    * **Initial value**: `auto`
    */
  var WebkitOverflowScrolling: js.UndefOr[WebkitOverflowScrollingProperty] = js.undefined
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    */
  var WebkitPaddingEnd: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.undefined
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    */
  var WebkitPaddingStart: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.undefined
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Initial value**: `none`
    */
  var WebkitPerspective: js.UndefOr[PerspectiveProperty[TLength]] = js.undefined
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Initial value**: `50% 50%`
    */
  var WebkitPerspectiveOrigin: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.undefined
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Initial value**: `none`
    */
  var WebkitScrollSnapType: js.UndefOr[ScrollSnapTypeProperty] = js.undefined
  /**
    * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
    *
    * **Initial value**: `0`
    */
  var WebkitShapeMargin: js.UndefOr[ShapeMarginProperty[TLength]] = js.undefined
  /**
    * **`-webkit-tap-highlight-color`** is a non-standard CSS property that sets the color of the highlight that appears over a link while it's being tapped. The highlighting indicates to the user that their tap is being successfully recognized, and indicates which element they're tapping on.
    *
    * **Initial value**: `black`
    */
  var WebkitTapHighlightColor: js.UndefOr[WebkitTapHighlightColorProperty] = js.undefined
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Initial value**: `none`
    */
  var WebkitTextCombine: js.UndefOr[TextCombineUprightProperty] = js.undefined
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextDecorationColor: js.UndefOr[TextDecorationColorProperty] = js.undefined
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Initial value**: `none`
    */
  var WebkitTextDecorationLine: js.UndefOr[TextDecorationLineProperty] = js.undefined
  /**
    * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
    *
    * **Initial value**: `objects`
    */
  var WebkitTextDecorationSkip: js.UndefOr[TextDecorationSkipProperty] = js.undefined
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Initial value**: `solid`
    */
  var WebkitTextDecorationStyle: js.UndefOr[TextDecorationStyleProperty] = js.undefined
  /**
    * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextEmphasisColor: js.UndefOr[TextEmphasisColorProperty] = js.undefined
  /**
    * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
    *
    * **Initial value**: `over right`
    */
  var WebkitTextEmphasisPosition: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
    *
    * **Initial value**: `none`
    */
  var WebkitTextEmphasisStyle: js.UndefOr[TextEmphasisStyleProperty] = js.undefined
  /**
    * The **`-webkit-text-fill-color`** CSS property specifies the fill color of characters of text. If this property is not set, the value of the `color` property is used.
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextFillColor: js.UndefOr[WebkitTextFillColorProperty] = js.undefined
  /**
    * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
    *
    * **Initial value**: `mixed`
    */
  var WebkitTextOrientation: js.UndefOr[TextOrientationProperty] = js.undefined
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    */
  var WebkitTextSizeAdjust: js.UndefOr[TextSizeAdjustProperty] = js.undefined
  /**
    * The **`-webkit-text-stroke-color`** CSS property specifies the stroke color of characters of text. If this property is not set, the value of the `color` property is used.
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextStrokeColor: js.UndefOr[WebkitTextStrokeColorProperty] = js.undefined
  /**
    * The **`-webkit-text-stroke-width`** CSS property specifies the width of the stroke for text.
    *
    * **Initial value**: `0`
    */
  var WebkitTextStrokeWidth: js.UndefOr[WebkitTextStrokeWidthProperty[TLength]] = js.undefined
  /**
    * The `-webkit-touch-callout` CSS property controls the display of the default callout shown when you touch and hold a touch target.
    *
    * **Initial value**: `default`
    */
  var WebkitTouchCallout: js.UndefOr[WebkitTouchCalloutProperty] = js.undefined
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Initial value**: `none`
    */
  var WebkitTransform: js.UndefOr[TransformProperty] = js.undefined
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Initial value**: `50% 50% 0`
    */
  var WebkitTransformOrigin: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Initial value**: `flat`
    */
  var WebkitTransformStyle: js.UndefOr[TransformStyleProperty] = js.undefined
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Initial value**: `0s`
    */
  var WebkitTransitionDelay: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Initial value**: `0s`
    */
  var WebkitTransitionDuration: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Initial value**: all
    */
  var WebkitTransitionProperty: js.UndefOr[TransitionPropertyProperty] = js.undefined
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Initial value**: `ease`
    */
  var WebkitTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  /** **Initial value**: `read-only` */
  var WebkitUserModify: js.UndefOr[WebkitUserModifyProperty] = js.undefined
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `auto`
    */
  var WebkitUserSelect: js.UndefOr[UserSelectProperty] = js.undefined
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Initial value**: `horizontal-tb`
    */
  var WebkitWritingMode: js.UndefOr[WritingModeProperty] = js.undefined
  /**
    * The **`-ms-accelerator`** CSS property is a Microsoft extension that sets or retrieves a string indicating whether the object represents a keyboard shortcut.
    *
    * **Initial value**: `false`
    */
  var msAccelerator: js.UndefOr[MsAcceleratorProperty] = js.undefined
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Initial value**: `auto`
    */
  var msAlignSelf: js.UndefOr[AlignSelfProperty] = js.undefined
  /**
    * The **`-ms-block-progression`** CSS property is a Microsoft extension that specifies the block progression and layout orientation.
    *
    * **Initial value**: `tb`
    */
  var msBlockProgression: js.UndefOr[MsBlockProgressionProperty] = js.undefined
  /**
    * The **`-ms-content-zoom-chaining`** CSS property is a Microsoft extension specifying the zoom behavior that occurs when a user hits the zoom limit during page manipulation.
    *
    * **Initial value**: `none`
    */
  var msContentZoomChaining: js.UndefOr[MsContentZoomChainingProperty] = js.undefined
  /**
    * The **`-ms-content-zoom-limit-max`** CSS property is a Microsoft extension that specifies the selected elements' maximum zoom factor.
    *
    * **Initial value**: `400%`
    */
  var msContentZoomLimitMax: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`-ms-content-zoom-limit-min`** CSS property is a Microsoft extension that specifies the minimum zoom factor.
    *
    * **Initial value**: `100%`
    */
  var msContentZoomLimitMin: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`-ms-content-zoom-snap-points`** CSS property is a Microsoft extension that specifies where zoom snap-points are located.
    *
    * **Initial value**: `snapInterval(0%, 100%)`
    */
  var msContentZoomSnapPoints: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`-ms-content-zoom-snap-type`** CSS property is a Microsoft extension that specifies how zooming is affected by defined snap-points.
    *
    * **Initial value**: `none`
    */
  var msContentZoomSnapType: js.UndefOr[MsContentZoomSnapTypeProperty] = js.undefined
  /**
    * The **`-ms-content-zooming`** CSS property is a Microsoft extension that specifies whether zooming is enabled.
    *
    * **Initial value**: zoom for the top level element, none for all other elements
    */
  var msContentZooming: js.UndefOr[MsContentZoomingProperty] = js.undefined
  /**
    * The `-ms-filter` CSS property is a Microsoft extension that sets or retrieves the filter or collection of filters applied to an object.
    *
    * **Initial value**: "" (the empty string)
    */
  var msFilter: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Initial value**: `row`
    */
  var msFlexDirection: js.UndefOr[FlexDirectionProperty] = js.undefined
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Initial value**: `0`
    */
  var msFlexPositive: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The **`-ms-flow-from`** CSS property is a Microsoft extension that gets or sets a value identifying a region container in the document that accepts the content flow from the data source.
    *
    * **Initial value**: `none`
    */
  var msFlowFrom: js.UndefOr[MsFlowFromProperty] = js.undefined
  /**
    * The **`-ms-flow-into`** CSS property is a Microsoft extension that gets or sets a value identifying an iframe container in the document that serves as the region's data source.
    *
    * **Initial value**: `none`
    */
  var msFlowInto: js.UndefOr[MsFlowIntoProperty] = js.undefined
  /**
    * The **`grid-auto-columns`** CSS property specifies the size of an implicitly-created grid column track.
    *
    * **Initial value**: `auto`
    */
  var msGridColumns: js.UndefOr[GridAutoColumnsProperty[TLength]] = js.undefined
  /**
    * The **`grid-auto-rows`** CSS property specifies the size of an implicitly-created grid row track.
    *
    * **Initial value**: `auto`
    */
  var msGridRows: js.UndefOr[GridAutoRowsProperty[TLength]] = js.undefined
  /**
    * The **`-ms-high-contrast-adjust`** CSS property is a Microsoft extension that gets or sets a value indicating whether to override any CSS properties that would have been set in high contrast mode.
    *
    * **Initial value**: `auto`
    */
  var msHighContrastAdjust: js.UndefOr[MsHighContrastAdjustProperty] = js.undefined
  /**
    * The **`-ms-hyphenate-limit-chars`** CSS property is a Microsoft extension that specifies one to three values indicating the minimum number of characters in a hyphenated word. If the word does not meet the required minimum number of characters in the word, before the hyphen, or after the hyphen, then the word is not hyphenated.
    *
    * **Initial value**: `auto`
    */
  var msHyphenateLimitChars: js.UndefOr[MsHyphenateLimitCharsProperty] = js.undefined
  /**
    * The **`-ms-hyphenate-limit-lines`** CSS property is a Microsoft extension specifying the maximum number of consecutive lines in an element that may be ended with a hyphenated word.
    *
    * **Initial value**: `no-limit`
    */
  var msHyphenateLimitLines: js.UndefOr[MsHyphenateLimitLinesProperty] = js.undefined
  /**
    * The `**-ms-hyphenate-limit-zone**` CSS property is a Microsoft extension specifying the width of the hyphenation zone.
    *
    * **Initial value**: `0`
    */
  var msHyphenateLimitZone: js.UndefOr[MsHyphenateLimitZoneProperty[TLength]] = js.undefined
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Initial value**: `manual`
    */
  var msHyphens: js.UndefOr[HyphensProperty] = js.undefined
  /**
    * The **`-ms-ime-align`** CSS property is a Microsoft extension aligning the Input Method Editor (IME) candidate window box relative to the element on which the IME composition is active. The extension is implemented in Microsoft Edge and Internet Explorer 11.
    *
    * **Initial value**: `auto`
    */
  var msImeAlign: js.UndefOr[MsImeAlignProperty] = js.undefined
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Initial value**: `auto`
    */
  var msLineBreak: js.UndefOr[LineBreakProperty] = js.undefined
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Initial value**: `0`
    */
  var msOrder: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The **`-ms-overflow-style`** CSS property is a Microsoft extension controlling the behavior of scrollbars when the content of an element overflows.
    *
    * **Initial value**: `auto`
    */
  var msOverflowStyle: js.UndefOr[MsOverflowStyleProperty] = js.undefined
  /**
    * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Initial value**: `visible`
    */
  var msOverflowX: js.UndefOr[OverflowXProperty] = js.undefined
  /**
    * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Initial value**: `visible`
    */
  var msOverflowY: js.UndefOr[OverflowYProperty] = js.undefined
  /**
    * The `**-ms-scroll-chaining**` CSS property is a Microsoft extension that specifies the scrolling behavior that occurs when a user hits the scroll limit during a manipulation.
    *
    * **Initial value**: `chained`
    */
  var msScrollChaining: js.UndefOr[MsScrollChainingProperty] = js.undefined
  /**
    * The `**-ms-scroll-limit-x-max**` CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollLeft` property.
    *
    * **Initial value**: `auto`
    */
  var msScrollLimitXMax: js.UndefOr[MsScrollLimitXMaxProperty[TLength]] = js.undefined
  /**
    * The **`-ms-scroll-limit-x-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollLeft` property.
    *
    * **Initial value**: `0`
    */
  var msScrollLimitXMin: js.UndefOr[MsScrollLimitXMinProperty[TLength]] = js.undefined
  /**
    * The **`-ms-scroll-limit-y-max`** CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollTop` property.
    *
    * **Initial value**: `auto`
    */
  var msScrollLimitYMax: js.UndefOr[MsScrollLimitYMaxProperty[TLength]] = js.undefined
  /**
    * The **`-ms-scroll-limit-y-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollTop` property.
    *
    * **Initial value**: `0`
    */
  var msScrollLimitYMin: js.UndefOr[MsScrollLimitYMinProperty[TLength]] = js.undefined
  /**
    * The **`-ms-scroll-rails`** CSS property is a Microsoft extension that specifies whether scrolling locks to the primary axis of motion.
    *
    * **Initial value**: `railed`
    */
  var msScrollRails: js.UndefOr[MsScrollRailsProperty] = js.undefined
  /**
    * The **`-ms-scroll-snap-points-x`** CSS property is a Microsoft extension that specifies where snap-points will be located along the x-axis.
    *
    * **Initial value**: `snapInterval(0px, 100%)`
    */
  var msScrollSnapPointsX: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`-ms-scroll-snap-points-y`** CSS property is a Microsoft extension that specifies where snap-points will be located along the y-axis.
    *
    * **Initial value**: `snapInterval(0px, 100%)`
    */
  var msScrollSnapPointsY: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Initial value**: `none`
    */
  var msScrollSnapType: js.UndefOr[MsScrollSnapTypeProperty] = js.undefined
  /**
    * The **`-ms-scroll-translation`** CSS property is a Microsoft extension that specifies whether vertical-to-horizontal scroll wheel translation occurs on the specified element.
    *
    * **Initial value**: `none`
    */
  var msScrollTranslation: js.UndefOr[MsScrollTranslationProperty] = js.undefined
  /**
    * The **`-ms-scrollbar-3dlight-color`** CSS property is a Microsoft extension specifying the color of the top and left edges of the scroll box and scroll arrows of a scroll bar.
    *
    * **Initial value**: depends on user agent
    */
  var msScrollbar3dlightColor: js.UndefOr[MsScrollbar3dlightColorProperty] = js.undefined
  /**
    * The **`-ms-scrollbar-arrow-color`** CSS property is a Microsoft extension that specifies the color of the arrow elements of a scroll arrow.
    *
    * **Initial value**: `ButtonText`
    */
  var msScrollbarArrowColor: js.UndefOr[MsScrollbarArrowColorProperty] = js.undefined
  /**
    * The `**-ms-scrollbar-base-color**` CSS property is a Microsoft extension that specifies the base color of the main elements of a scroll bar.
    *
    * **Initial value**: depends on user agent
    */
  var msScrollbarBaseColor: js.UndefOr[MsScrollbarBaseColorProperty] = js.undefined
  /**
    * The **`-ms-scrollbar-darkshadow-color`** CSS property is a Microsoft extension that specifies the color of a scroll bar's gutter.
    *
    * **Initial value**: `ThreeDDarkShadow`
    */
  var msScrollbarDarkshadowColor: js.UndefOr[MsScrollbarDarkshadowColorProperty] = js.undefined
  /**
    * The `**-ms-scrollbar-face-color**` CSS property is a Microsoft extension that specifies the color of the scroll box and scroll arrows of a scroll bar.
    *
    * **Initial value**: `ThreeDFace`
    */
  var msScrollbarFaceColor: js.UndefOr[MsScrollbarFaceColorProperty] = js.undefined
  /**
    * The `**-ms-scrollbar-highlight-color**` CSS property is a Microsoft extension that specifies the color of the slider tray, the top and left edges of the scroll box, and the scroll arrows of a scroll bar.
    *
    * **Initial value**: `ThreeDHighlight`
    */
  var msScrollbarHighlightColor: js.UndefOr[MsScrollbarHighlightColorProperty] = js.undefined
  /**
    * The **`-ms-scrollbar-shadow-color`** CSS property is a Microsoft extension that specifies the color of the bottom and right edges of the scroll box and scroll arrows of a scroll bar.
    *
    * **Initial value**: `ThreeDDarkShadow`
    */
  var msScrollbarShadowColor: js.UndefOr[MsScrollbarShadowColorProperty] = js.undefined
  /**
    * The **`-ms-text-autospace`** CSS property is a Microsoft extension that specifies the autospacing and narrow space width adjustment of text.
    *
    * **Initial value**: `none`
    */
  var msTextAutospace: js.UndefOr[MsTextAutospaceProperty] = js.undefined
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Initial value**: `none`
    */
  var msTextCombineHorizontal: js.UndefOr[TextCombineUprightProperty] = js.undefined
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Initial value**: `clip`
    */
  var msTextOverflow: js.UndefOr[TextOverflowProperty] = js.undefined
  /**
    * The **`touch-action`** CSS property sets how a region can be manipulated by a touchscreen user (for example, by zooming features built into the browser).
    *
    * **Initial value**: `auto`
    */
  var msTouchAction: js.UndefOr[TouchActionProperty] = js.undefined
  /**
    * The **`-ms-touch-select`** CSS property is a Microsoft extension that toggles the gripper visual elements that enable touch text selection.
    *
    * **Initial value**: `grippers`
    */
  var msTouchSelect: js.UndefOr[MsTouchSelectProperty] = js.undefined
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Initial value**: `none`
    */
  var msTransform: js.UndefOr[TransformProperty] = js.undefined
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Initial value**: `50% 50% 0`
    */
  var msTransformOrigin: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Initial value**: `0s`
    */
  var msTransitionDelay: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Initial value**: `0s`
    */
  var msTransitionDuration: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Initial value**: all
    */
  var msTransitionProperty: js.UndefOr[TransitionPropertyProperty] = js.undefined
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Initial value**: `ease`
    */
  var msTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `text`
    */
  var msUserSelect: js.UndefOr[MsUserSelectProperty] = js.undefined
  /**
    * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
    *
    * **Initial value**: `normal`
    */
  var msWordBreak: js.UndefOr[WordBreakProperty] = js.undefined
  /**
    * The **`-ms-wrap-flow`** CSS property is a Microsoft extension that specifies how exclusions impact inline content within block-level elements.
    *
    * **Initial value**: `auto`
    */
  var msWrapFlow: js.UndefOr[MsWrapFlowProperty] = js.undefined
  /**
    * The **`-ms-wrap-margin`** CSS property is a Microsoft extension that specifies a margin that offsets the inner wrap shape from other shapes.
    *
    * **Initial value**: `0`
    */
  var msWrapMargin: js.UndefOr[MsWrapMarginProperty[TLength]] = js.undefined
  /**
    * The **`-ms-wrap-through`** CSS property is a Microsoft extension that specifies how content should wrap around an exclusion element.
    *
    * **Initial value**: `wrap`
    */
  var msWrapThrough: js.UndefOr[MsWrapThroughProperty] = js.undefined
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Initial value**: `horizontal-tb`
    */
  var msWritingMode: js.UndefOr[WritingModeProperty] = js.undefined
}

