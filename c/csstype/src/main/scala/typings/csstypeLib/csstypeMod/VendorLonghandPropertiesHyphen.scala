package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VendorLonghandPropertiesHyphen[TLength] extends js.Object {
  /**
     * The **`animation-delay`** CSS property specifies when an animation should start. You can begin the animation at a future point in time, immediately and from its beginning, or immediately and partway through the animation cycle.
     *
     * **Initial value**: `0s`
     */
  var `-moz-animation-delay`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`animation-direction`** CSS property specifies whether an animation should play forwards, backwards, or alternating back and forth.
     *
     * **Initial value**: `normal`
     */
  var `-moz-animation-direction`: js.UndefOr[AnimationDirectionProperty] = js.undefined
  /**
     * The **`animation-duration`** CSS property specifies the length of time that an animation should take to complete one cycle.
     *
     * **Initial value**: `0s`
     */
  var `-moz-animation-duration`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`animation-fill-mode`** CSS property specifies how a CSS animation should apply styles to its target before and after its execution.
     *
     * **Initial value**: `none`
     */
  var `-moz-animation-fill-mode`: js.UndefOr[AnimationFillModeProperty] = js.undefined
  /**
     * The **`animation-iteration-count`** CSS property specifies  the number of times an animation cycle should be played before stopping. If multiple values are specified, each time the animation is played the next value in the list is used, cycling back to the first value after the last one is used.
     *
     * **Initial value**: `1`
     */
  var `-moz-animation-iteration-count`: js.UndefOr[AnimationIterationCountProperty] = js.undefined
  /**
     * The **`animation-name`** CSS property specifies one or more animations that should be applied to an element. Each name indicates an `@keyframes` at\-rule that defines the property values for the animation sequence.
     *
     * **Initial value**: `none`
     */
  var `-moz-animation-name`: js.UndefOr[AnimationNameProperty] = js.undefined
  /**
     * The **`animation-play-state`** CSS property specifies whether an **animation is running or paused**. In JavaScript, this can be queried to determine whether or not the animation is currently running. In addition, you can use JavaScript to set its value to pause or resume playback of an animation.
     *
     * **Initial value**: `running`
     */
  var `-moz-animation-play-state`: js.UndefOr[AnimationPlayStateProperty] = js.undefined
  /**
     * The `**animation-timing-function**` CSS property specifies how a CSS animation should progress over the duration of each cycle.
     *
     * **Initial value**: `ease`
     */
  var `-moz-animation-timing-function`: js.UndefOr[AnimationTimingFunctionProperty] = js.undefined
  /**
     * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform\-native styling based on the operating system's theme.
     *
     * **Initial value**: `none` (but this value is overridden in the user agent CSS)
     */
  var `-moz-appearance`: js.UndefOr[MozAppearanceProperty] = js.undefined
  /**
     * The **`backface-visibility`** CSS property determines whether the back face of an element is visible when turned towards the user.
     *
     * **Initial value**: `visible`
     */
  var `-moz-backface-visibility`: js.UndefOr[BackfaceVisibilityProperty] = js.undefined
  /**
     * The **`-moz-binding`** CSS property is used by Mozilla\-based applications to attach an XBL binding to a DOM element.
     *
     * **Initial value**: `none`
     */
  var `-moz-binding`: js.UndefOr[MozBindingProperty] = js.undefined
  /**
     * In Mozilla applications like Firefox, the **`-moz-border-bottom-colors`** CSS property sets a list of colors for the bottom border.
     *
     * **Initial value**: `none`
     */
  var `-moz-border-bottom-colors`: js.UndefOr[MozBorderBottomColorsProperty] = js.undefined
  /**
     * The **`border-inline-end-color`** CSS property defines the color of the logical inline\-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `currentcolor`
     */
  var `-moz-border-end-color`: js.UndefOr[BorderInlineEndColorProperty] = js.undefined
  /**
     * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `none`
     */
  var `-moz-border-end-style`: js.UndefOr[BorderInlineEndStyleProperty] = js.undefined
  /**
     * The **`border-inline-end-width`** CSS property defines the width of the logical inline\-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `medium`
     */
  var `-moz-border-end-width`: js.UndefOr[BorderInlineEndWidthProperty[TLength]] = js.undefined
  /**
     * In Mozilla applications like Firefox, the **`-moz-border-left-colors`** CSS property sets a list of colors for the left border.
     *
     * **Initial value**: `none`
     */
  var `-moz-border-left-colors`: js.UndefOr[MozBorderLeftColorsProperty] = js.undefined
  /**
     * In Mozilla applications like Firefox, the **`-moz-border-right-colors`** CSS property sets a list of colors for the right border.
     *
     * **Initial value**: `none`
     */
  var `-moz-border-right-colors`: js.UndefOr[MozBorderRightColorsProperty] = js.undefined
  /**
     * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `currentcolor`
     */
  var `-moz-border-start-color`: js.UndefOr[BorderInlineStartColorProperty] = js.undefined
  /**
     * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `none`
     */
  var `-moz-border-start-style`: js.UndefOr[BorderInlineStartStyleProperty] = js.undefined
  /**
     * In Mozilla applications like Firefox, the **`-moz-border-top-colors`** CSS property sets a list of colors for the top border.
     *
     * **Initial value**: `none`
     */
  var `-moz-border-top-colors`: js.UndefOr[MozBorderTopColorsProperty] = js.undefined
  /**
     * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
     *
     * **Initial value**: `content-box`
     */
  var `-moz-box-sizing`: js.UndefOr[BoxSizingProperty] = js.undefined
  /**
     * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
     *
     * **Initial value**: `auto`
     */
  var `-moz-column-count`: js.UndefOr[ColumnCountProperty] = js.undefined
  /**
     * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
     *
     * **Initial value**: `balance`
     */
  var `-moz-column-fill`: js.UndefOr[ColumnFillProperty] = js.undefined
  /**
     * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
     *
     * **Initial value**: `normal`
     */
  var `-moz-column-gap`: js.UndefOr[ColumnGapProperty[TLength]] = js.undefined
  /**
     * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi\-column layout.
     *
     * **Initial value**: `currentcolor`
     */
  var `-moz-column-rule-color`: js.UndefOr[ColumnRuleColorProperty] = js.undefined
  /**
     * The **`column-rule-style`** CSS property sets the style of the rule (line) drawn between columns in a multi\-column layout.
     *
     * **Initial value**: `none`
     */
  var `-moz-column-rule-style`: js.UndefOr[ColumnRuleStyleProperty] = js.undefined
  /**
     * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi\-column layout.
     *
     * **Initial value**: `medium`
     */
  var `-moz-column-rule-width`: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.undefined
  /**
     * The **`column-width`** CSS property specifies the ideal column width in a multi\-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value.  If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
     *
     * **Initial value**: `auto`
     */
  var `-moz-column-width`: js.UndefOr[ColumnWidthProperty[TLength]] = js.undefined
  /**
     * If you reference an SVG image in a webpage (such as with the `<img>` element or as a background image), the SVG image can coordinate with the embedding element (its context) to have the image adopt property values set on the embedding element. To do this the embedding element needs to list the properties that are to be made available to the image by listing them as values of the **`-moz-context-properties`** property, and the image needs to opt in to using those properties by using values such as the `context-fill` value.
     *
     * **Initial value**: `none`
     */
  var `-moz-context-properties`: js.UndefOr[MozContextPropertiesProperty] = js.undefined
  /**
     * The non\-standard **`-moz-float-edge`** CSS property specifies whether the height and width properties of the element include the margin, border, or padding thickness.
     *
     * **Initial value**: `content-box`
     */
  var `-moz-float-edge`: js.UndefOr[MozFloatEdgeProperty] = js.undefined
  /**
     * The **`font-feature-settings`** CSS property gives you control over advanced typographic features in OpenType fonts.
     *
     * **Initial value**: `normal`
     */
  var `-moz-font-feature-settings`: js.UndefOr[FontFeatureSettingsProperty] = js.undefined
  /**
     * The **`font-language-override`** CSS property controls the usage of language\-specific glyphs in a typeface.
     *
     * **Initial value**: `normal`
     */
  var `-moz-font-language-override`: js.UndefOr[FontLanguageOverrideProperty] = js.undefined
  /**
     * The **`-moz-force-broken-image-icon`** extended CSS property can be used to force the broken image icon to be shown even when a broken image has an `alt` attribute.
     *
     * **Initial value**: `0`
     */
  var `-moz-force-broken-image-icon`: js.UndefOr[csstypeLib.GlobalsNumber] = js.undefined
  /**
     * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually\-specified points within the text, or let the browser automatically insert hyphens where appropriate.
     *
     * **Initial value**: `manual`
     */
  var `-moz-hyphens`: js.UndefOr[HyphensProperty] = js.undefined
  /**
     * For certain XUL elements and pseudo\-elements that use an image from the `list-style-image` property, this property specifies a region of the image that is used in place of the whole image. This allows elements to use different pieces of the same image to improve performance.
     *
     * **Initial value**: `auto`
     */
  var `-moz-image-region`: js.UndefOr[MozImageRegionProperty] = js.undefined
  /**
     * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `0`
     */
  var `-moz-margin-end`: js.UndefOr[MarginInlineEndProperty[TLength]] = js.undefined
  /**
     * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `0`
     */
  var `-moz-margin-start`: js.UndefOr[MarginInlineStartProperty[TLength]] = js.undefined
  /**
     * The **`-moz-orient`** CSS property specifies the orientation of the element to which it's applied.
     *
     * **Initial value**: `inline`
     */
  var `-moz-orient`: js.UndefOr[MozOrientProperty] = js.undefined
  /**
     * In Mozilla applications, the **`-moz-outline-radius-bottomleft`** CSS property can be used to round the bottom\-left corner of an element's `outline`.
     *
     * **Initial value**: `0`
     */
  var `-moz-outline-radius-bottomleft`: js.UndefOr[MozOutlineRadiusBottomleftProperty[TLength]] = js.undefined
  /**
     * In Mozilla applications, the **`-moz-outline-radius-bottomright`** CSS property can be used to round the bottom\-right corner of an element's `outline`.
     *
     * **Initial value**: `0`
     */
  var `-moz-outline-radius-bottomright`: js.UndefOr[MozOutlineRadiusBottomrightProperty[TLength]] = js.undefined
  /**
     * In Mozilla applications, the **`-moz-outline-radius-topleft`** CSS property can be used to round the top\-left corner of an element's `outline`.
     *
     * **Initial value**: `0`
     */
  var `-moz-outline-radius-topleft`: js.UndefOr[MozOutlineRadiusTopleftProperty[TLength]] = js.undefined
  /**
     * In Mozilla applications, the **`-moz-outline-radius-topright`** CSS property can be used to round the top\-right corner of an element's `outline`.
     *
     * **Initial value**: `0`
     */
  var `-moz-outline-radius-topright`: js.UndefOr[MozOutlineRadiusToprightProperty[TLength]] = js.undefined
  /**
     * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `0`
     */
  var `-moz-padding-end`: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.undefined
  /**
     * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `0`
     */
  var `-moz-padding-start`: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.undefined
  /**
     * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D\-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D\-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
     *
     * **Initial value**: `none`
     */
  var `-moz-perspective`: js.UndefOr[PerspectiveProperty[TLength]] = js.undefined
  /**
     * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
     *
     * **Initial value**: `50% 50%`
     */
  var `-moz-perspective-origin`: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.undefined
  /**
     * **`-moz-stack-sizing`** is an extended CSS property. Normally, a `stack` will change its size so that all of its child elements are completely visible. For example, moving a child of the stack far to the right will widen the stack so the child remains visible.
     *
     * **Initial value**: `stretch-to-fit`
     */
  var `-moz-stack-sizing`: js.UndefOr[MozStackSizingProperty] = js.undefined
  /**
     * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
     *
     * **Initial value**: `8`
     */
  var `-moz-tab-size`: js.UndefOr[TabSizeProperty[TLength]] = js.undefined
  /**
     * The **`-moz-text-blink`** non\-standard Mozilla CSS extension specifies the blink mode.
     *
     * **Initial value**: `none`
     */
  var `-moz-text-blink`: js.UndefOr[MozTextBlinkProperty] = js.undefined
  /**
     * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
     *
     * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
     */
  var `-moz-text-size-adjust`: js.UndefOr[TextSizeAdjustProperty] = js.undefined
  /**
     * The **`transform-origin`** CSS property sets the origin for an element's transformations.
     *
     * **Initial value**: `50% 50% 0`
     */
  var `-moz-transform-origin`: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  /**
     * The **`transform-style`** CSS property determines if the children of an element are positioned in the 3D\-space or are flattened in the plane of the element.
     *
     * **Initial value**: `flat`
     */
  var `-moz-transform-style`: js.UndefOr[TransformStyleProperty] = js.undefined
  /**
     * The **`transition-delay`** CSS property specifies the amount of time to wait before starting a property's transition effect when its value changes.
     *
     * **Initial value**: `0s`
     */
  var `-moz-transition-delay`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`transition-duration`** CSS property specifies the number of seconds or milliseconds a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
     *
     * **Initial value**: `0s`
     */
  var `-moz-transition-duration`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`transition-property`** CSS property specifies the CSS properties to which a transition effect should be applied.
     *
     * **Initial value**: all
     */
  var `-moz-transition-property`: js.UndefOr[TransitionPropertyProperty] = js.undefined
  /**
     * The **`transition-timing-function`** CSS property is used to describe how the intermediate values of the CSS properties being affected by a transition effect are calculated.
     *
     * **Initial value**: `ease`
     */
  var `-moz-transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  /**
     * The **`-moz-user-focus`** CSS property is used to indicate whether an element can have the focus.
     *
     * **Initial value**: `none`
     */
  var `-moz-user-focus`: js.UndefOr[MozUserFocusProperty] = js.undefined
  /**
     * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
     *
     * **Initial value**: `auto`
     */
  var `-moz-user-input`: js.UndefOr[MozUserInputProperty] = js.undefined
  /**
     * The **`-moz-user-modify`** property has no effect. It was originally planned to determine whether or not the content of an element can be edited by a user.
     *
     * **Initial value**: `read-only`
     */
  var `-moz-user-modify`: js.UndefOr[MozUserModifyProperty] = js.undefined
  /**
     * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
     *
     * **Initial value**: `auto`
     */
  var `-moz-user-select`: js.UndefOr[UserSelectProperty] = js.undefined
  /**
     * The **`-moz-window-dragging`** CSS property specifies whether a window is draggable or not. It only works in Chrome code, and only on Mac OS X.
     *
     * **Initial value**: `drag`
     */
  var `-moz-window-dragging`: js.UndefOr[MozWindowDraggingProperty] = js.undefined
  /**
     * The **`-moz-window-shadow`** CSS property specifies whether a window will have a shadow. It only works on Mac OS X.
     *
     * **Initial value**: `default`
     */
  var `-moz-window-shadow`: js.UndefOr[MozWindowShadowProperty] = js.undefined
  /**
     * The **`-ms-accelerator`** CSS property is a Microsoft extension that sets or retrieves a string indicating whether the object represents a keyboard shortcut.
     *
     * **Initial value**: `false`
     */
  var `-ms-accelerator`: js.UndefOr[MsAcceleratorProperty] = js.undefined
  /**
     * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross\-axis margin is set to `auto`, then `align-self` is ignored.
     *
     * **Initial value**: `auto`
     */
  var `-ms-align-self`: js.UndefOr[AlignSelfProperty] = js.undefined
  /**
     * The **`-ms-block-progression`** CSS property is a Microsoft extension that specifies the block progression and layout orientation.
     *
     * **Initial value**: `tb`
     */
  var `-ms-block-progression`: js.UndefOr[MsBlockProgressionProperty] = js.undefined
  /**
     * The **`-ms-content-zoom-chaining`** CSS property is a Microsoft extension specifying the zoom behavior that occurs when a user hits the zoom limit during page manipulation.
     *
     * **Initial value**: `none`
     */
  var `-ms-content-zoom-chaining`: js.UndefOr[MsContentZoomChainingProperty] = js.undefined
  /**
     * The **`-ms-content-zoom-limit-max`** CSS property is a Microsoft extension that specifies the selected elements' maximum zoom factor.
     *
     * **Initial value**: `400%`
     */
  var `-ms-content-zoom-limit-max`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`-ms-content-zoom-limit-min`** CSS property is a Microsoft extension that specifies the minimum zoom factor.
     *
     * **Initial value**: `100%`
     */
  var `-ms-content-zoom-limit-min`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`-ms-content-zoom-snap-points`** CSS property is a Microsoft extension that specifies where zoom snap\-points are located.
     *
     * **Initial value**: `snapInterval(0%, 100%)`
     */
  var `-ms-content-zoom-snap-points`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`-ms-content-zoom-snap-type`** CSS property is a Microsoft extension that specifies how zooming is affected by defined snap\-points.
     *
     * **Initial value**: `none`
     */
  var `-ms-content-zoom-snap-type`: js.UndefOr[MsContentZoomSnapTypeProperty] = js.undefined
  /**
     * The **`-ms-content-zooming`** CSS property is a Microsoft extension that specifies whether zooming is enabled.
     *
     * **Initial value**: zoom for the top level element, none for all other elements
     */
  var `-ms-content-zooming`: js.UndefOr[MsContentZoomingProperty] = js.undefined
  /**
     * The `-ms-filter` CSS property is a Microsoft extension that sets or retrieves the filter or collection of filters applied to an object.
     *
     * **Initial value**: "" (the empty string)
     */
  var `-ms-filter`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`flex-direction`** CSS property specifies how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
     *
     * **Initial value**: `row`
     */
  var `-ms-flex-direction`: js.UndefOr[FlexDirectionProperty] = js.undefined
  /**
     * The **`flex-grow`** CSS property specifies the flex grow factor of a flex item. It specifies how much of the available space in the flex container should be assigned to that item. If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
     *
     * **Initial value**: `0`
     */
  var `-ms-flex-positive`: js.UndefOr[csstypeLib.GlobalsNumber] = js.undefined
  /**
     * The **`-ms-flow-from`** CSS property is a Microsoft extension that gets or sets a value identifying a region container in the document that accepts the content flow from the data source.
     *
     * **Initial value**: `none`
     */
  var `-ms-flow-from`: js.UndefOr[MsFlowFromProperty] = js.undefined
  /**
     * The **`-ms-flow-into`** CSS property is a Microsoft extension that gets or sets a value identifying an iframe container in the document that serves as the region's data source.
     *
     * **Initial value**: `none`
     */
  var `-ms-flow-into`: js.UndefOr[MsFlowIntoProperty] = js.undefined
  /**
     * The **`grid-auto-columns`** CSS property specifies the size of an implicitly\-created grid column track.
     *
     * **Initial value**: `auto`
     */
  var `-ms-grid-columns`: js.UndefOr[GridAutoColumnsProperty[TLength]] = js.undefined
  /**
     * The **`grid-auto-rows`** CSS property specifies the size of an implicitly\-created grid row track.
     *
     * **Initial value**: `auto`
     */
  var `-ms-grid-rows`: js.UndefOr[GridAutoRowsProperty[TLength]] = js.undefined
  /**
     * The **`-ms-high-contrast-adjust`** CSS property is a Microsoft extension that gets or sets a value indicating whether to override any CSS properties that would have been set in high contrast mode.
     *
     * **Initial value**: `auto`
     */
  var `-ms-high-contrast-adjust`: js.UndefOr[MsHighContrastAdjustProperty] = js.undefined
  /**
     * The **`-ms-hyphenate-limit-chars`** CSS property is a Microsoft extension that specifies one to three values indicating the minimum number of characters in a hyphenated word. If the word does not meet the required minimum number of characters in the word, before the hyphen, or after the hyphen, then the word is not hyphenated.
     *
     * **Initial value**: `auto`
     */
  var `-ms-hyphenate-limit-chars`: js.UndefOr[MsHyphenateLimitCharsProperty] = js.undefined
  /**
     * The **`-ms-hyphenate-limit-lines`** CSS property is a Microsoft extension specifying the maximum number of consecutive lines in an element that may be ended with a hyphenated word.
     *
     * **Initial value**: `no-limit`
     */
  var `-ms-hyphenate-limit-lines`: js.UndefOr[MsHyphenateLimitLinesProperty] = js.undefined
  /**
     * The `**-ms-hyphenate-limit-zone**` CSS property is a Microsoft extension specifying the width of the hyphenation zone.
     *
     * **Initial value**: `0`
     */
  var `-ms-hyphenate-limit-zone`: js.UndefOr[MsHyphenateLimitZoneProperty[TLength]] = js.undefined
  /**
     * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually\-specified points within the text, or let the browser automatically insert hyphens where appropriate.
     *
     * **Initial value**: `manual`
     */
  var `-ms-hyphens`: js.UndefOr[HyphensProperty] = js.undefined
  /**
     * The **`-ms-ime-align`** CSS property is a Microsoft extension aligning the Input Method Editor (IME) candidate window box relative to the element on which the IME composition is active. The extension is implemented in Microsoft Edge and Internet Explorer 11.
     *
     * **Initial value**: `auto`
     */
  var `-ms-ime-align`: js.UndefOr[MsImeAlignProperty] = js.undefined
  /**
     * The **`line-break`** CSS property is used to specify how (or if) to break lines when working with punctuation and symbols. This only affects text in Chinese, Japanese, or Korean (CJK).
     *
     * **Initial value**: `auto`
     */
  var `-ms-line-break`: js.UndefOr[LineBreakProperty] = js.undefined
  /**
     * The **`order`** CSS property specifies the order used to lay out a flex or grid item in its flex or grid container. Items within the same container are laid out in ascending order according to their `order` values. Elements with the same `order` value are laid out in the order in which they appear in the source code.
     *
     * **Initial value**: `0`
     */
  var `-ms-order`: js.UndefOr[csstypeLib.GlobalsNumber] = js.undefined
  /**
     * The **`-ms-overflow-style`** CSS property is a Microsoft extension controlling the behavior of scrollbars when the content of an element overflows.
     *
     * **Initial value**: `auto`
     */
  var `-ms-overflow-style`: js.UndefOr[MsOverflowStyleProperty] = js.undefined
  /**
     * The **`overflow-x`** CSS property specifies whether to clip content, render a scroll bar, or display overflow content of a block\-level element, when it overflows at the left and right edges.
     *
     * **Initial value**: `visible`
     */
  var `-ms-overflow-x`: js.UndefOr[OverflowXProperty] = js.undefined
  /**
     * The **`overflow-y`** CSS property specifies whether to clip content, render a scroll bar, or display overflow content of a block\-level element, when it overflows at the top and bottom edges.
     *
     * **Initial value**: `visible`
     */
  var `-ms-overflow-y`: js.UndefOr[OverflowYProperty] = js.undefined
  /**
     * The `**-ms-scroll-chaining**` CSS property is a Microsoft extension that specifies the scrolling behavior that occurs when a user hits the scroll limit during a manipulation.
     *
     * **Initial value**: `chained`
     */
  var `-ms-scroll-chaining`: js.UndefOr[MsScrollChainingProperty] = js.undefined
  /**
     * The `**-ms-scroll-limit-x-max**` CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollLeft` property.
     *
     * **Initial value**: `auto`
     */
  var `-ms-scroll-limit-x-max`: js.UndefOr[MsScrollLimitXMaxProperty[TLength]] = js.undefined
  /**
     * The **`-ms-scroll-limit-x-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollLeft` property.
     *
     * **Initial value**: `0`
     */
  var `-ms-scroll-limit-x-min`: js.UndefOr[MsScrollLimitXMinProperty[TLength]] = js.undefined
  /**
     * The **`-ms-scroll-limit-y-max`** CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollTop` property.
     *
     * **Initial value**: `auto`
     */
  var `-ms-scroll-limit-y-max`: js.UndefOr[MsScrollLimitYMaxProperty[TLength]] = js.undefined
  /**
     * The **`-ms-scroll-limit-y-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollTop` property.
     *
     * **Initial value**: `0`
     */
  var `-ms-scroll-limit-y-min`: js.UndefOr[MsScrollLimitYMinProperty[TLength]] = js.undefined
  /**
     * The **`-ms-scroll-rails`** CSS property is a Microsoft extension that specifies whether scrolling locks to the primary axis of motion.
     *
     * **Initial value**: `railed`
     */
  var `-ms-scroll-rails`: js.UndefOr[MsScrollRailsProperty] = js.undefined
  /**
     * The **`-ms-scroll-snap-points-x`** CSS property is a Microsoft extension that specifies where snap\-points will be located along the x\-axis.
     *
     * **Initial value**: `snapInterval(0px, 100%)`
     */
  var `-ms-scroll-snap-points-x`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`-ms-scroll-snap-points-y`** CSS property is a Microsoft extension that specifies where snap\-points will be located along the y\-axis.
     *
     * **Initial value**: `snapInterval(0px, 100%)`
     */
  var `-ms-scroll-snap-points-y`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`scroll-snap-type`** CSS property defines how strictly snap points are enforced on the scroll container in case there is one.
     *
     * **Initial value**: `none`
     */
  var `-ms-scroll-snap-type`: js.UndefOr[MsScrollSnapTypeProperty] = js.undefined
  /**
     * The **`-ms-scroll-translation`** CSS property is a Microsoft extension that specifies whether vertical\-to\-horizontal scroll wheel translation occurs on the specified element.
     *
     * **Initial value**: `none`
     */
  var `-ms-scroll-translation`: js.UndefOr[MsScrollTranslationProperty] = js.undefined
  /**
     * The **`-ms-text-autospace`** CSS property is a Microsoft extension that specifies the autospacing and narrow space width adjustment of text.
     *
     * **Initial value**: `none`
     */
  var `-ms-text-autospace`: js.UndefOr[MsTextAutospaceProperty] = js.undefined
  /**
     * The **`text-combine-upright`** CSS property specifies the combination of multiple characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
     *
     * **Initial value**: `none`
     */
  var `-ms-text-combine-horizontal`: js.UndefOr[TextCombineUprightProperty] = js.undefined
  /**
     * The **`text-overflow`** CSS property determines how overflowed content that is not displayed is signaled to users. It can be clipped, display an ellipsis ('`…`', `U+2026 Horizontal Ellipsis`), or display a custom string.
     *
     * **Initial value**: `clip`
     */
  var `-ms-text-overflow`: js.UndefOr[TextOverflowProperty] = js.undefined
  /**
     * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
     *
     * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
     */
  var `-ms-text-size-adjust`: js.UndefOr[TextSizeAdjustProperty] = js.undefined
  /**
     * The **`touch-action`** CSS property specifies whether, and in what ways, a given region can be manipulated by the user via a touchscreen (for instance, by panning or zooming features built into the browser).
     *
     * **Initial value**: `auto`
     */
  var `-ms-touch-action`: js.UndefOr[TouchActionProperty] = js.undefined
  /**
     * The **`-ms-touch-select`** CSS property is a Microsoft extension that toggles the gripper visual elements that enable touch text selection.
     *
     * **Initial value**: `grippers`
     */
  var `-ms-touch-select`: js.UndefOr[MsTouchSelectProperty] = js.undefined
  /**
     * The **`transform`** CSS property lets you rotate, scale, skew, or translate a given element. This is achieved by modifying the coordinate space of the CSS visual formatting model.
     *
     * **Initial value**: `none`
     */
  var `-ms-transform`: js.UndefOr[TransformProperty] = js.undefined
  /**
     * The **`transform-origin`** CSS property sets the origin for an element's transformations.
     *
     * **Initial value**: `50% 50% 0`
     */
  var `-ms-transform-origin`: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  /**
     * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
     *
     * **Initial value**: `text`
     */
  var `-ms-user-select`: js.UndefOr[MsUserSelectProperty] = js.undefined
  /**
     * The **`word-break`** CSS property specifies whether or not the browser should insert line breaks wherever the text would otherwise overflow its content box.
     *
     * **Initial value**: `normal`
     */
  var `-ms-word-break`: js.UndefOr[WordBreakProperty] = js.undefined
  /**
     * The **`-ms-wrap-flow`** CSS property is a Microsoft extension that specifies how exclusions impact inline content within block\-level elements.
     *
     * **Initial value**: `auto`
     */
  var `-ms-wrap-flow`: js.UndefOr[MsWrapFlowProperty] = js.undefined
  /**
     * The **`-ms-wrap-margin`** CSS property is a Microsoft extension that specifies a margin that offsets the inner wrap shape from other shapes.
     *
     * **Initial value**: `0`
     */
  var `-ms-wrap-margin`: js.UndefOr[MsWrapMarginProperty[TLength]] = js.undefined
  /**
     * The **`-ms-wrap-through`** CSS property is a Microsoft extension that specifies how content should wrap around an exclusion element.
     *
     * **Initial value**: `wrap`
     */
  var `-ms-wrap-through`: js.UndefOr[MsWrapThroughProperty] = js.undefined
  /**
     * The **`writing-mode`** CSS property defines whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
     *
     * **Initial value**: `horizontal-tb`
     */
  var `-ms-writing-mode`: js.UndefOr[WritingModeProperty] = js.undefined
  /**
     * The **`background-size`** CSS property specifies the size of the element's background image. The image can be left to its natural size, stretched to a new size, or constrained to fit the available space while preserving its intrinsic proportions.
     *
     * **Initial value**: `auto auto`
     */
  var `-o-background-size`: js.UndefOr[BackgroundSizeProperty[TLength]] = js.undefined
  /**
     * The **`object-fit`** CSS property specifies how the contents of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
     *
     * **Initial value**: `fill`
     */
  var `-o-object-fit`: js.UndefOr[ObjectFitProperty] = js.undefined
  /**
     * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
     *
     * **Initial value**: `50% 50%`
     */
  var `-o-object-position`: js.UndefOr[ObjectPositionProperty[TLength]] = js.undefined
  /**
     * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
     *
     * **Initial value**: `8`
     */
  var `-o-tab-size`: js.UndefOr[TabSizeProperty[TLength]] = js.undefined
  /**
     * The **`text-overflow`** CSS property determines how overflowed content that is not displayed is signaled to users. It can be clipped, display an ellipsis ('`…`', `U+2026 Horizontal Ellipsis`), or display a custom string.
     *
     * **Initial value**: `clip`
     */
  var `-o-text-overflow`: js.UndefOr[TextOverflowProperty] = js.undefined
  /**
     * The **`transform-origin`** CSS property sets the origin for an element's transformations.
     *
     * **Initial value**: `50% 50% 0`
     */
  var `-o-transform-origin`: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  /**
     * The CSS **`align-content`** property defines how the browser distributes space between and around content items along the cross\-axis of their container, which is serving as a flexbox container.
     *
     * **Initial value**: `normal`
     */
  var `-webkit-align-content`: js.UndefOr[AlignContentProperty] = js.undefined
  /**
     * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align\-self property sets the alignment of an item within its containing block.
     *
     * **Initial value**: `normal`
     */
  var `-webkit-align-items`: js.UndefOr[AlignItemsProperty] = js.undefined
  /**
     * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross\-axis margin is set to `auto`, then `align-self` is ignored.
     *
     * **Initial value**: `auto`
     */
  var `-webkit-align-self`: js.UndefOr[AlignSelfProperty] = js.undefined
  /**
     * The **`animation-delay`** CSS property specifies when an animation should start. You can begin the animation at a future point in time, immediately and from its beginning, or immediately and partway through the animation cycle.
     *
     * **Initial value**: `0s`
     */
  var `-webkit-animation-delay`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`animation-direction`** CSS property specifies whether an animation should play forwards, backwards, or alternating back and forth.
     *
     * **Initial value**: `normal`
     */
  var `-webkit-animation-direction`: js.UndefOr[AnimationDirectionProperty] = js.undefined
  /**
     * The **`animation-duration`** CSS property specifies the length of time that an animation should take to complete one cycle.
     *
     * **Initial value**: `0s`
     */
  var `-webkit-animation-duration`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`animation-fill-mode`** CSS property specifies how a CSS animation should apply styles to its target before and after its execution.
     *
     * **Initial value**: `none`
     */
  var `-webkit-animation-fill-mode`: js.UndefOr[AnimationFillModeProperty] = js.undefined
  /**
     * The **`animation-iteration-count`** CSS property specifies  the number of times an animation cycle should be played before stopping. If multiple values are specified, each time the animation is played the next value in the list is used, cycling back to the first value after the last one is used.
     *
     * **Initial value**: `1`
     */
  var `-webkit-animation-iteration-count`: js.UndefOr[AnimationIterationCountProperty] = js.undefined
  /**
     * The **`animation-name`** CSS property specifies one or more animations that should be applied to an element. Each name indicates an `@keyframes` at\-rule that defines the property values for the animation sequence.
     *
     * **Initial value**: `none`
     */
  var `-webkit-animation-name`: js.UndefOr[AnimationNameProperty] = js.undefined
  /**
     * The **`animation-play-state`** CSS property specifies whether an **animation is running or paused**. In JavaScript, this can be queried to determine whether or not the animation is currently running. In addition, you can use JavaScript to set its value to pause or resume playback of an animation.
     *
     * **Initial value**: `running`
     */
  var `-webkit-animation-play-state`: js.UndefOr[AnimationPlayStateProperty] = js.undefined
  /**
     * The `**animation-timing-function**` CSS property specifies how a CSS animation should progress over the duration of each cycle.
     *
     * **Initial value**: `ease`
     */
  var `-webkit-animation-timing-function`: js.UndefOr[AnimationTimingFunctionProperty] = js.undefined
  /**
     * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform\-native styling based on the operating system's theme.
     *
     * **Initial value**: `none` (but this value is overridden in the user agent CSS)
     */
  var `-webkit-appearance`: js.UndefOr[WebkitAppearanceProperty] = js.undefined
  /**
     * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
     *
     * **Initial value**: `none`
     */
  var `-webkit-backdrop-filter`: js.UndefOr[BackdropFilterProperty] = js.undefined
  /**
     * The **`backface-visibility`** CSS property determines whether the back face of an element is visible when turned towards the user.
     *
     * **Initial value**: `visible`
     */
  var `-webkit-backface-visibility`: js.UndefOr[BackfaceVisibilityProperty] = js.undefined
  /**
     * The **`background-size`** CSS property specifies the size of the element's background image. The image can be left to its natural size, stretched to a new size, or constrained to fit the available space while preserving its intrinsic proportions.
     *
     * **Initial value**: `auto auto`
     */
  var `-webkit-background-size`: js.UndefOr[BackgroundSizeProperty[TLength]] = js.undefined
  /** **Initial value**: `currentcolor` */
  var `-webkit-border-before-color`: js.UndefOr[WebkitBorderBeforeColorProperty] = js.undefined
  /** **Initial value**: `none` */
  var `-webkit-border-before-style`: js.UndefOr[WebkitBorderBeforeStyleProperty] = js.undefined
  /** **Initial value**: `medium` */
  var `-webkit-border-before-width`: js.UndefOr[WebkitBorderBeforeWidthProperty[TLength]] = js.undefined
  /**
     * The **`border-bottom-left-radius`** CSS property sets the rounding of the bottom\-left corner of the element.
     *
     * **Initial value**: `0`
     */
  var `-webkit-border-bottom-left-radius`: js.UndefOr[BorderBottomLeftRadiusProperty[TLength]] = js.undefined
  /**
     * The **`border-bottom-right-radius`** CSS property sets the rounding of the bottom\-right corner of the element.
     *
     * **Initial value**: `0`
     */
  var `-webkit-border-bottom-right-radius`: js.UndefOr[BorderBottomRightRadiusProperty[TLength]] = js.undefined
  /**
     * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions are used to form the components of an element's border image.
     *
     * **Initial value**: `100%`
     */
  var `-webkit-border-image-slice`: js.UndefOr[BorderImageSliceProperty] = js.undefined
  /**
     * The **`border-top-left-radius`** CSS property sets the rounding of the top\-left corner of the element.
     *
     * **Initial value**: `0`
     */
  var `-webkit-border-top-left-radius`: js.UndefOr[BorderTopLeftRadiusProperty[TLength]] = js.undefined
  /**
     * The **`border-top-right-radius`** CSS property sets the rounding of the top\-right corner of the element.
     *
     * **Initial value**: `0`
     */
  var `-webkit-border-top-right-radius`: js.UndefOr[BorderTopRightRadiusProperty[TLength]] = js.undefined
  /**
     * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
     *
     * **Initial value**: `slice`
     */
  var `-webkit-box-decoration-break`: js.UndefOr[BoxDecorationBreakProperty] = js.undefined
  /**
     * The **`-webkit-box-reflect`** CSS property lets you reflect the content of an element in one specific direction.
     *
     * **Initial value**: `none`
     */
  var `-webkit-box-reflect`: js.UndefOr[WebkitBoxReflectProperty[TLength]] = js.undefined
  /**
     * The **`box-shadow`** CSS property is used to add shadow effects around an element's frame. You can specify multiple effects separated by commas if you wish to do so. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
     *
     * **Initial value**: `none`
     */
  var `-webkit-box-shadow`: js.UndefOr[BoxShadowProperty] = js.undefined
  /**
     * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
     *
     * **Initial value**: `content-box`
     */
  var `-webkit-box-sizing`: js.UndefOr[BoxSizingProperty] = js.undefined
  /**
     * The `**clip-path**` CSS property creates a clipping region that defines what part of an element should be displayed. More specifically, those portions that are inside the region are shown, while those outside are hidden.
     *
     * **Initial value**: `none`
     */
  var `-webkit-clip-path`: js.UndefOr[ClipPathProperty] = js.undefined
  /**
     * The **`color-adjust`** CSS property gives the web author control over what if anything the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
     *
     * **Initial value**: `economy`
     */
  var `-webkit-color-adjust`: js.UndefOr[ColorAdjustProperty] = js.undefined
  /**
     * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
     *
     * **Initial value**: `auto`
     */
  var `-webkit-column-count`: js.UndefOr[ColumnCountProperty] = js.undefined
  /**
     * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
     *
     * **Initial value**: `normal`
     */
  var `-webkit-column-gap`: js.UndefOr[ColumnGapProperty[TLength]] = js.undefined
  /**
     * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi\-column layout.
     *
     * **Initial value**: `currentcolor`
     */
  var `-webkit-column-rule-color`: js.UndefOr[ColumnRuleColorProperty] = js.undefined
  /**
     * The **`column-rule-style`** CSS property sets the style of the rule (line) drawn between columns in a multi\-column layout.
     *
     * **Initial value**: `none`
     */
  var `-webkit-column-rule-style`: js.UndefOr[ColumnRuleStyleProperty] = js.undefined
  /**
     * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi\-column layout.
     *
     * **Initial value**: `medium`
     */
  var `-webkit-column-rule-width`: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.undefined
  /**
     * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
     *
     * **Initial value**: `none`
     */
  var `-webkit-column-span`: js.UndefOr[ColumnSpanProperty] = js.undefined
  /**
     * The **`column-width`** CSS property specifies the ideal column width in a multi\-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value.  If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
     *
     * **Initial value**: `auto`
     */
  var `-webkit-column-width`: js.UndefOr[ColumnWidthProperty[TLength]] = js.undefined
  /**
     * The **`filter`** CSS property lets you apply graphical effects like blurring or color shifting to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
     *
     * **Initial value**: `none`
     */
  var `-webkit-filter`: js.UndefOr[FilterProperty] = js.undefined
  /**
     * The **`flex-basis`** CSS property specifies the initial **main size** of a flex item. This property determines the size of the content\-box unless specified otherwise using `box-sizing`.
     *
     * **Initial value**: `auto`
     */
  var `-webkit-flex-basis`: js.UndefOr[FlexBasisProperty[TLength]] = js.undefined
  /**
     * The **`flex-direction`** CSS property specifies how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
     *
     * **Initial value**: `row`
     */
  var `-webkit-flex-direction`: js.UndefOr[FlexDirectionProperty] = js.undefined
  /**
     * The **`flex-grow`** CSS property specifies the flex grow factor of a flex item. It specifies how much of the available space in the flex container should be assigned to that item. If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
     *
     * **Initial value**: `0`
     */
  var `-webkit-flex-grow`: js.UndefOr[csstypeLib.GlobalsNumber] = js.undefined
  /**
     * The **`flex-shrink`** CSS property specifies the flex shrink factor of a flex item. Flex items will shrink to fill the container according to the `flex-shrink` number, when the default size of flex items is larger than the flex container.
     *
     * **Initial value**: `1`
     */
  var `-webkit-flex-shrink`: js.UndefOr[csstypeLib.GlobalsNumber] = js.undefined
  /**
     * The CSS **`flex-wrap`** property specifies whether flex items are forced into a single line or can be wrapped onto multiple lines. If wrapping is allowed, this property also enables you to control the direction in which lines are stacked.
     *
     * **Initial value**: `nowrap`
     */
  var `-webkit-flex-wrap`: js.UndefOr[FlexWrapProperty] = js.undefined
  /**
     * The **`font-feature-settings`** CSS property gives you control over advanced typographic features in OpenType fonts.
     *
     * **Initial value**: `normal`
     */
  var `-webkit-font-feature-settings`: js.UndefOr[FontFeatureSettingsProperty] = js.undefined
  /**
     * The **`font-kerning`** CSS property controls the usage of the kerning information stored in a font.
     *
     * **Initial value**: `auto`
     */
  var `-webkit-font-kerning`: js.UndefOr[FontKerningProperty] = js.undefined
  /**
     * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
     *
     * **Initial value**: `normal`
     */
  var `-webkit-font-variant-ligatures`: js.UndefOr[FontVariantLigaturesProperty] = js.undefined
  /**
     * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually\-specified points within the text, or let the browser automatically insert hyphens where appropriate.
     *
     * **Initial value**: `manual`
     */
  var `-webkit-hyphens`: js.UndefOr[HyphensProperty] = js.undefined
  /**
     * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main\-axis of their container.
     *
     * **Initial value**: `normal`
     */
  var `-webkit-justify-content`: js.UndefOr[JustifyContentProperty] = js.undefined
  /**
     * The **`line-break`** CSS property is used to specify how (or if) to break lines when working with punctuation and symbols. This only affects text in Chinese, Japanese, or Korean (CJK).
     *
     * **Initial value**: `auto`
     */
  var `-webkit-line-break`: js.UndefOr[LineBreakProperty] = js.undefined
  /**
     * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `0`
     */
  var `-webkit-margin-end`: js.UndefOr[MarginInlineEndProperty[TLength]] = js.undefined
  /**
     * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `0`
     */
  var `-webkit-margin-start`: js.UndefOr[MarginInlineStartProperty[TLength]] = js.undefined
  /**
     * If a `-webkit-mask-image` is specified, `-webkit-mask-attachment` determines whether the mask image's position is fixed within the viewport, or scrolls along with its containing block.
     *
     * **Initial value**: `scroll`
     */
  var `-webkit-mask-attachment`: js.UndefOr[WebkitMaskAttachmentProperty] = js.undefined
  /**
     * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
     *
     * **Initial value**: `border`
     */
  var `-webkit-mask-clip`: js.UndefOr[WebkitMaskClipProperty] = js.undefined
  /**
     * The **`-webkit-mask-composite`** property specifies the manner in which multiple mask images applied to the same element are composited with one another. Mask images are composited in the opposite order that they are declared with the `-webkit-mask-image` property.
     *
     * **Initial value**: `source-over`
     */
  var `-webkit-mask-composite`: js.UndefOr[WebkitMaskCompositeProperty] = js.undefined
  /**
     * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
     *
     * **Initial value**: `none`
     */
  var `-webkit-mask-image`: js.UndefOr[WebkitMaskImageProperty] = js.undefined
  /**
     * The **`mask-origin`** CSS property determines the origin of a mask.
     *
     * **Initial value**: `padding`
     */
  var `-webkit-mask-origin`: js.UndefOr[WebkitMaskOriginProperty] = js.undefined
  /**
     * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer defined by `mask-origin`, for each defined mask image.
     *
     * **Initial value**: `0% 0%`
     */
  var `-webkit-mask-position`: js.UndefOr[WebkitMaskPositionProperty[TLength]] = js.undefined
  /**
     * The `-webkit-mask-position-x` CSS property sets the initial horizontal position of a mask image.
     *
     * **Initial value**: `0%`
     */
  var `-webkit-mask-position-x`: js.UndefOr[WebkitMaskPositionXProperty[TLength]] = js.undefined
  /**
     * The `-webkit-mask-position-y` CSS property sets the initial vertical position of a mask image.
     *
     * **Initial value**: `0%`
     */
  var `-webkit-mask-position-y`: js.UndefOr[WebkitMaskPositionYProperty[TLength]] = js.undefined
  /**
     * The **`mask-repeat`** CSS property defines how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
     *
     * **Initial value**: `repeat`
     */
  var `-webkit-mask-repeat`: js.UndefOr[WebkitMaskRepeatProperty] = js.undefined
  /**
     * The `-webkit-mask-repeat-x` property specifies whether and how a mask image is repeated (tiled) horizontally.
     *
     * **Initial value**: `repeat`
     */
  var `-webkit-mask-repeat-x`: js.UndefOr[WebkitMaskRepeatXProperty] = js.undefined
  /**
     * The `-webkit-mask-repeat-y` property specifies whether and how a mask image is repeated (tiled) vertically.
     *
     * **Initial value**: `repeat`
     */
  var `-webkit-mask-repeat-y`: js.UndefOr[WebkitMaskRepeatYProperty] = js.undefined
  /**
     * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
     *
     * **Initial value**: `auto auto`
     */
  var `-webkit-mask-size`: js.UndefOr[WebkitMaskSizeProperty[TLength]] = js.undefined
  /**
     * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
     *
     * **Initial value**: `0`
     */
  var `-webkit-max-inline-size`: js.UndefOr[MaxInlineSizeProperty[TLength]] = js.undefined
  /**
     * The **`order`** CSS property specifies the order used to lay out a flex or grid item in its flex or grid container. Items within the same container are laid out in ascending order according to their `order` values. Elements with the same `order` value are laid out in the order in which they appear in the source code.
     *
     * **Initial value**: `0`
     */
  var `-webkit-order`: js.UndefOr[csstypeLib.GlobalsNumber] = js.undefined
  /**
     * The `-webkit-overflow-scrolling` CSS property controls whether or not touch devices use momentum\-based scrolling for a given element.
     *
     * **Initial value**: `auto`
     */
  var `-webkit-overflow-scrolling`: js.UndefOr[WebkitOverflowScrollingProperty] = js.undefined
  /**
     * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `0`
     */
  var `-webkit-padding-end`: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.undefined
  /**
     * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
     *
     * **Initial value**: `0`
     */
  var `-webkit-padding-start`: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.undefined
  /**
     * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D\-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D\-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
     *
     * **Initial value**: `none`
     */
  var `-webkit-perspective`: js.UndefOr[PerspectiveProperty[TLength]] = js.undefined
  /**
     * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
     *
     * **Initial value**: `50% 50%`
     */
  var `-webkit-perspective-origin`: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.undefined
  /**
     * The **`scroll-snap-type`** CSS property defines how strictly snap points are enforced on the scroll container in case there is one.
     *
     * **Initial value**: `none`
     */
  var `-webkit-scroll-snap-type`: js.UndefOr[ScrollSnapTypeProperty] = js.undefined
  /**
     * The **`shape-margin`** CSS property specifies a margin for a CSS shape created using `shape-outside`.
     *
     * **Initial value**: `0`
     */
  var `-webkit-shape-margin`: js.UndefOr[ShapeMarginProperty[TLength]] = js.undefined
  /**
     * **`-webkit-tap-highlight-color`** is a non\-standard CSS property that sets the color of the highlight that appears over a link while it's being tapped. The highlighting indicates to the user that their tap is being successfully recognized, and indicates which element they're tapping on.
     *
     * **Initial value**: `black`
     */
  var `-webkit-tap-highlight-color`: js.UndefOr[WebkitTapHighlightColorProperty] = js.undefined
  /**
     * The **`text-combine-upright`** CSS property specifies the combination of multiple characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
     *
     * **Initial value**: `none`
     */
  var `-webkit-text-combine`: js.UndefOr[TextCombineUprightProperty] = js.undefined
  /**
     * The **`text-decoration-color`** CSS property sets the color of the decorative additions to text that are specified by `text-decoration-line`; these include underlines and overlines, strikethroughs, and wavy lines like those typically used to indicate content is misspelled (for example). The specified color applies to all such decorative lines in the scope of the property's value.
     *
     * **Initial value**: `currentcolor`
     */
  var `-webkit-text-decoration-color`: js.UndefOr[TextDecorationColorProperty] = js.undefined
  /**
     * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element.
     *
     * **Initial value**: `none`
     */
  var `-webkit-text-decoration-line`: js.UndefOr[TextDecorationLineProperty] = js.undefined
  /**
     * The **`text-decoration-skip`** CSS property specifies what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
     *
     * **Initial value**: `objects`
     */
  var `-webkit-text-decoration-skip`: js.UndefOr[TextDecorationSkipProperty] = js.undefined
  /**
     * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are specified; there is no way to define different styles for each of the lines defined by `text-decoration-line`.
     *
     * **Initial value**: `solid`
     */
  var `-webkit-text-decoration-style`: js.UndefOr[TextDecorationStyleProperty] = js.undefined
  /**
     * The **`text-emphasis-color`** CSS property defines the color used to draw emphasis marks on text being rendered in the HTML document. This value can also be set and reset using the `text-emphasis` shorthand.
     *
     * **Initial value**: `currentcolor`
     */
  var `-webkit-text-emphasis-color`: js.UndefOr[TextEmphasisColorProperty] = js.undefined
  /**
     * The **`text-emphasis-position`** CSS property describes where emphasis marks are drawn at. The effect of emphasis marks on the line height is the same as for ruby text: if there isn't enough place, the line height is increased.
     *
     * **Initial value**: `over right`
     */
  var `-webkit-text-emphasis-position`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`text-emphasis-style`** CSS property defines the type of emphasis used. It can also be set, and reset, using the `text-emphasis` shorthand.
     *
     * **Initial value**: `none`
     */
  var `-webkit-text-emphasis-style`: js.UndefOr[TextEmphasisStyleProperty] = js.undefined
  /**
     * The **`-webkit-text-fill-color`** CSS property specifies the fill color of characters of text. If this property is not set, the value of the `color` property is used.
     *
     * **Initial value**: `currentcolor`
     */
  var `-webkit-text-fill-color`: js.UndefOr[WebkitTextFillColorProperty] = js.undefined
  /**
     * The **`text-orientation`** CSS property defines the orientation of the text characters in a line. This property only has an effect in vertical mode, that is, when `writing-mode` is not `horizontal-tb`. It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
     *
     * **Initial value**: `mixed`
     */
  var `-webkit-text-orientation`: js.UndefOr[TextOrientationProperty] = js.undefined
  /**
     * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
     *
     * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
     */
  var `-webkit-text-size-adjust`: js.UndefOr[TextSizeAdjustProperty] = js.undefined
  /**
     * The **`-webkit-text-stroke-color`** CSS property specifies the stroke color of characters of text. If this property is not set, the value of the `color` property is used.
     *
     * **Initial value**: `currentcolor`
     */
  var `-webkit-text-stroke-color`: js.UndefOr[WebkitTextStrokeColorProperty] = js.undefined
  /**
     * The **`-webkit-text-stroke-width`** CSS property specifies the width of the stroke for text.
     *
     * **Initial value**: `0`
     */
  var `-webkit-text-stroke-width`: js.UndefOr[WebkitTextStrokeWidthProperty[TLength]] = js.undefined
  /**
     * The `-webkit-touch-callout` CSS property controls the display of the default callout shown when you touch and hold a touch target.
     *
     * **Initial value**: `default`
     */
  var `-webkit-touch-callout`: js.UndefOr[WebkitTouchCalloutProperty] = js.undefined
  /**
     * The **`transform`** CSS property lets you rotate, scale, skew, or translate a given element. This is achieved by modifying the coordinate space of the CSS visual formatting model.
     *
     * **Initial value**: `none`
     */
  var `-webkit-transform`: js.UndefOr[TransformProperty] = js.undefined
  /**
     * The **`transform-origin`** CSS property sets the origin for an element's transformations.
     *
     * **Initial value**: `50% 50% 0`
     */
  var `-webkit-transform-origin`: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  /**
     * The **`transform-style`** CSS property determines if the children of an element are positioned in the 3D\-space or are flattened in the plane of the element.
     *
     * **Initial value**: `flat`
     */
  var `-webkit-transform-style`: js.UndefOr[TransformStyleProperty] = js.undefined
  /**
     * The **`transition-delay`** CSS property specifies the amount of time to wait before starting a property's transition effect when its value changes.
     *
     * **Initial value**: `0s`
     */
  var `-webkit-transition-delay`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`transition-duration`** CSS property specifies the number of seconds or milliseconds a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
     *
     * **Initial value**: `0s`
     */
  var `-webkit-transition-duration`: js.UndefOr[csstypeLib.GlobalsString] = js.undefined
  /**
     * The **`transition-property`** CSS property specifies the CSS properties to which a transition effect should be applied.
     *
     * **Initial value**: all
     */
  var `-webkit-transition-property`: js.UndefOr[TransitionPropertyProperty] = js.undefined
  /**
     * The **`transition-timing-function`** CSS property is used to describe how the intermediate values of the CSS properties being affected by a transition effect are calculated.
     *
     * **Initial value**: `ease`
     */
  var `-webkit-transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  /** **Initial value**: `read-only` */
  var `-webkit-user-modify`: js.UndefOr[WebkitUserModifyProperty] = js.undefined
  /**
     * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
     *
     * **Initial value**: `auto`
     */
  var `-webkit-user-select`: js.UndefOr[UserSelectProperty] = js.undefined
  /**
     * The **`writing-mode`** CSS property defines whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
     *
     * **Initial value**: `horizontal-tb`
     */
  var `-webkit-writing-mode`: js.UndefOr[WritingModeProperty] = js.undefined
}

