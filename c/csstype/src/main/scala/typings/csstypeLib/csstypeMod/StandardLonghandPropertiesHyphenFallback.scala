package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardLonghandPropertiesHyphenFallback[TLength] extends js.Object {
  /**
    * The CSS **`align-content`** property defines how the browser distributes space between and around content items along the cross\-axis of their container, which is serving as a flexbox container.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **29**  | **28**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-content
    */
  var `align-content`: js.UndefOr[AlignContentProperty | js.Array[AlignContentProperty]] = js.undefined
  /**
    * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align\-self property sets the alignment of an item within its containing block.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :------: | :-----: | :---------: | :----: | :----: |
    * |  **52**  | **20**  | **7** _-x-_ | **12** | **11** |
    * | 21 _-x-_ |         |             |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | n/a |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-items
    */
  var `align-items`: js.UndefOr[AlignItemsProperty | js.Array[AlignItemsProperty]] = js.undefined
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross\-axis margin is set to `auto`, then `align-self` is ignored.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **36**  | **20**  |   No   | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  |      IE      |
    * | :----: | :-----: | :------: | :----: | :----------: |
    * | **57** | **52**  | **10.1** | **16** | **10** _-x-_ |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/align-self
    */
  var `align-self`: js.UndefOr[AlignSelfProperty | js.Array[AlignSelfProperty]] = js.undefined
  /**
    * The **`animation-delay`** CSS property specifies when an animation should start. You can begin the animation at a future point in time, immediately and from its beginning, or immediately and partway through the animation cycle.
    *
    * **Initial value**: `0s`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **43** | **16**  |  **9**  | **12** | **10** |
    * |        | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-delay
    */
  var `animation-delay`: js.UndefOr[csstypeLib.GlobalsString | js.Array[csstypeLib.GlobalsString]] = js.undefined
  /**
    * The **`animation-direction`** CSS property specifies whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-direction
    */
  var `animation-direction`: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.undefined
  /**
    * The **`animation-duration`** CSS property specifies the length of time that an animation should take to complete one cycle.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :-----: | :-----: | :---------: | :----: | :----: |
    * | **43**  | **16**  | **4** _-x-_ | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-duration
    */
  var `animation-duration`: js.UndefOr[csstypeLib.GlobalsString | js.Array[csstypeLib.GlobalsString]] = js.undefined
  /**
    * The **`animation-fill-mode`** CSS property specifies how a CSS animation should apply styles to its target before and after its execution.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-fill-mode
    */
  var `animation-fill-mode`: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.undefined
  /**
    * The **`animation-iteration-count`** CSS property specifies  the number of times an animation cycle should be played before stopping. If multiple values are specified, each time the animation is played the next value in the list is used, cycling back to the first value after the last one is used.
    *
    * **Initial value**: `1`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-iteration-count
    */
  var `animation-iteration-count`: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.undefined
  /**
    * The **`animation-name`** CSS property specifies one or more animations that should be applied to an element. Each name indicates an `@keyframes` at\-rule that defines the property values for the animation sequence.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-name
    */
  var `animation-name`: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.undefined
  /**
    * The **`animation-play-state`** CSS property specifies whether an **animation is running or paused**. In JavaScript, this can be queried to determine whether or not the animation is currently running. In addition, you can use JavaScript to set its value to pause or resume playback of an animation.
    *
    * **Initial value**: `running`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **43** | **16**  |  Yes   | **12** | **10** |
    * |        | 5 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-play-state
    */
  var `animation-play-state`: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.undefined
  /**
    * The `**animation-timing-function**` CSS property specifies how a CSS animation should progress over the duration of each cycle.
    *
    * **Initial value**: `ease`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **43** | **16**  | **4** _-x-_ | **12** | **10** |
    * |        | 5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-timing-function
    */
  var `animation-timing-function`: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.undefined
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform\-native styling based on the operating system's theme.
    *
    * **Initial value**: `auto`
    *
    * |   Chrome    |   Firefox   |   Safari    |     Edge     | IE  |
    * | :---------: | :---------: | :---------: | :----------: | :-: |
    * | **1** _-x-_ | **1** _-x-_ | **3** _-x-_ | **12** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/appearance
    */
  var appearance: js.UndefOr[AppearanceProperty | js.Array[AppearanceProperty]] = js.undefined
  /**
    * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  | IE  |
    * | :----: | :-----: | :---------: | :----: | :-: |
    * |  n/a   |   No    | **9** _-x-_ | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backdrop-filter
    */
  var `backdrop-filter`: js.UndefOr[BackdropFilterProperty | js.Array[BackdropFilterProperty]] = js.undefined
  /**
    * The **`backface-visibility`** CSS property determines whether the back face of an element is visible when turned towards the user.
    *
    * **Initial value**: `visible`
    *
    * |    Chrome    | Firefox  | Safari |  Edge  |   IE   |
    * | :----------: | :------: | :----: | :----: | :----: |
    * | **12** _-x-_ |  **16**  |  Yes   | **12** | **10** |
    * |              | 10 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backface-visibility
    */
  var `backface-visibility`: js.UndefOr[BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]] = js.undefined
  /**
    * If a `background-image` is specified, the **`background-attachment`** CSS property determines whether that image's position is fixed within the viewport, or scrolls along with its containing block.
    *
    * **Initial value**: `scroll`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-attachment
    */
  var `background-attachment`: js.UndefOr[BackgroundAttachmentProperty | js.Array[BackgroundAttachmentProperty]] = js.undefined
  /**
    * The **`background-blend-mode`** CSS property determines how an element's background images should blend with each other and with the element's background color.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **35** | **30**  |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-blend-mode
    */
  var `background-blend-mode`: js.UndefOr[BackgroundBlendModeProperty | js.Array[BackgroundBlendModeProperty]] = js.undefined
  /**
    * The **`background-clip`** CSS property specifies if an element's background, whether a `<color>` or an `<image>`, extends underneath its border.
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **4**  | **3**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-clip
    */
  var `background-clip`: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.undefined
  /**
    * The **`background-color`** CSS property sets the background color of an element.
    *
    * **Initial value**: `transparent`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-color
    */
  var `background-color`: js.UndefOr[BackgroundColorProperty | js.Array[BackgroundColorProperty]] = js.undefined
  /**
    * The **`background-image`** CSS property sets one or more background images on an element.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-image
    */
  var `background-image`: js.UndefOr[BackgroundImageProperty | js.Array[BackgroundImageProperty]] = js.undefined
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_, i.e., the origin position of an image specified using the `background-image` property.
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **4**  | **3**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-origin
    */
  var `background-origin`: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.undefined
  /**
    * The **`background-position`** CSS property sets the initial position, relative to the background position layer defined by `background-origin`, for each defined background image.
    *
    * **Initial value**: `0% 0%`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position
    */
  var `background-position`: js.UndefOr[
    BackgroundPositionProperty[TLength] | js.Array[BackgroundPositionProperty[TLength]]
  ] = js.undefined
  /**
    * The **`background-position-x`** CSS property sets the initial horizontal position, relative to the background position layer defined by `background-origin`, for each defined background image.
    *
    * **Initial value**: `left`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * |  Yes   | **49**  |  Yes   | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-x
    */
  var `background-position-x`: js.UndefOr[
    BackgroundPositionXProperty[TLength] | js.Array[BackgroundPositionXProperty[TLength]]
  ] = js.undefined
  /**
    * The **`background-position-y`** CSS property sets the initial vertical position, relative to the background position layer defined by `background-origin`, for each defined background image.
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * |  Yes   | **49**  |  Yes   | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-y
    */
  var `background-position-y`: js.UndefOr[
    BackgroundPositionYProperty[TLength] | js.Array[BackgroundPositionYProperty[TLength]]
  ] = js.undefined
  /**
    * The **`background-repeat`** CSS property defines how background images are repeated. A background image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Initial value**: `repeat`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-repeat
    */
  var `background-repeat`: js.UndefOr[BackgroundRepeatProperty | js.Array[BackgroundRepeatProperty]] = js.undefined
  /**
    * The **`background-size`** CSS property specifies the size of the element's background image. The image can be left to its natural size, stretched to a new size, or constrained to fit the available space while preserving its intrinsic proportions.
    *
    * **Initial value**: `auto auto`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **3**  |  **4**  | **4.1** | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-size
    */
  var `background-size`: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.undefined
  /** **Initial value**: `clip` */
  var `block-overflow`: js.UndefOr[BlockOverflowProperty | js.Array[BlockOverflowProperty]] = js.undefined
  /**
    * The **`block-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/block-size
    */
  var `block-size`: js.UndefOr[BlockSizeProperty[TLength] | js.Array[BlockSizeProperty[TLength]]] = js.undefined
  /**
    * The **`border-block-end-color`** CSS property defines the color of the logical block\-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-color
    */
  var `border-block-end-color`: js.UndefOr[BorderBlockEndColorProperty | js.Array[BorderBlockEndColorProperty]] = js.undefined
  /**
    * The **`border-block-end-style`** CSS property defines the style of the logical block end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-style
    */
  var `border-block-end-style`: js.UndefOr[BorderBlockEndStyleProperty | js.Array[BorderBlockEndStyleProperty]] = js.undefined
  /**
    * The **`border-block-end-width`** CSS property defines the width of the logical block\-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-width
    */
  var `border-block-end-width`: js.UndefOr[
    BorderBlockEndWidthProperty[TLength] | js.Array[BorderBlockEndWidthProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-block-start-color`** CSS property defines the color of the logical block\-start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-color
    */
  var `border-block-start-color`: js.UndefOr[BorderBlockStartColorProperty | js.Array[BorderBlockStartColorProperty]] = js.undefined
  /**
    * The **`border-block-start-style`** CSS property defines the style of the logical block start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-style
    */
  var `border-block-start-style`: js.UndefOr[BorderBlockStartStyleProperty | js.Array[BorderBlockStartStyleProperty]] = js.undefined
  /**
    * The **`border-block-start-width`** CSS property defines the width of the logical block\-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-width
    */
  var `border-block-start-width`: js.UndefOr[
    BorderBlockStartWidthProperty[TLength] | js.Array[BorderBlockStartWidthProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-bottom-color`** CSS property sets the color of an element's bottom `border`. Note that in many cases the shorthand CSS properties `border-color` or `border-bottom` are more convenient and preferable.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-color
    */
  var `border-bottom-color`: js.UndefOr[BorderBottomColorProperty | js.Array[BorderBottomColorProperty]] = js.undefined
  /**
    * The **`border-bottom-left-radius`** CSS property sets the rounding of the bottom\-left corner of the element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-left-radius
    */
  var `border-bottom-left-radius`: js.UndefOr[
    BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-bottom-right-radius`** CSS property sets the rounding of the bottom\-right corner of the element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-right-radius
    */
  var `border-bottom-right-radius`: js.UndefOr[
    BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-bottom-style`** CSS property sets the line style of an element's bottom `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-style
    */
  var `border-bottom-style`: js.UndefOr[BorderBottomStyleProperty | js.Array[BorderBottomStyleProperty]] = js.undefined
  /**
    * The **`border-bottom-width`** CSS property sets the width of the bottom border of a box.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-width
    */
  var `border-bottom-width`: js.UndefOr[
    BorderBottomWidthProperty[TLength] | js.Array[BorderBottomWidthProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-collapse`** CSS property specifies whether cells inside a `<table>` have shared or separate borders.
    *
    * **Initial value**: `separate`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-collapse
    */
  var `border-collapse`: js.UndefOr[BorderCollapseProperty | js.Array[BorderCollapseProperty]] = js.undefined
  /**
    * The **`border-image-outset`** CSS property specifies the distance by which an element's border image is set out from its border box.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-outset
    */
  var `border-image-outset`: js.UndefOr[
    BorderImageOutsetProperty[TLength] | js.Array[BorderImageOutsetProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-image-repeat`** CSS property defines how the edge regions of a source image are adjusted to fit the dimensions of an element's border image.
    *
    * **Initial value**: `stretch`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-repeat
    */
  var `border-image-repeat`: js.UndefOr[BorderImageRepeatProperty | js.Array[BorderImageRepeatProperty]] = js.undefined
  /**
    * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions are used to form the components of an element's border image.
    *
    * **Initial value**: `100%`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-slice
    */
  var `border-image-slice`: js.UndefOr[BorderImageSliceProperty | js.Array[BorderImageSliceProperty]] = js.undefined
  /**
    * The **`border-image-source`** CSS property specifies the source image used to create an element's border image.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-source
    */
  var `border-image-source`: js.UndefOr[BorderImageSourceProperty | js.Array[BorderImageSourceProperty]] = js.undefined
  /**
    * The **`border-image-width`** CSS property specifies the width of an element's border image.
    *
    * **Initial value**: `1`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **13**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-width
    */
  var `border-image-width`: js.UndefOr[BorderImageWidthProperty[TLength] | js.Array[BorderImageWidthProperty[TLength]]] = js.undefined
  /**
    * The **`border-inline-end-color`** CSS property defines the color of the logical inline\-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-color
    */
  var `border-inline-end-color`: js.UndefOr[BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]] = js.undefined
  /**
    * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome |           Firefox            | Safari | Edge | IE  |
    * | :----: | :--------------------------: | :----: | :--: | :-: |
    * | **69** |            **41**            |   No   |  No  | No  |
    * |        | 38 _(-moz-border-end-style)_ |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-style
    */
  var `border-inline-end-style`: js.UndefOr[BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]] = js.undefined
  /**
    * The **`border-inline-end-width`** CSS property defines the width of the logical inline\-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-width
    */
  var `border-inline-end-width`: js.UndefOr[
    BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |            Firefox             | Safari | Edge | IE  |
    * | :----: | :----------------------------: | :----: | :--: | :-: |
    * | **69** |             **41**             |   No   |  No  | No  |
    * |        | 38 _(-moz-border-start-color)_ |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-color
    */
  var `border-inline-start-color`: js.UndefOr[BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]] = js.undefined
  /**
    * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-style
    */
  var `border-inline-start-style`: js.UndefOr[BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]] = js.undefined
  /**
    * The **`border-inline-start-width`** CSS property defines the width of the logical inline\-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-width
    */
  var `border-inline-start-width`: js.UndefOr[
    BorderInlineStartWidthProperty[TLength] | js.Array[BorderInlineStartWidthProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-left-color`** CSS property sets the color of an element's left `border`. Note that in many cases the shorthand CSS properties `border-color` or `border-left` are more convenient and preferable.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-color
    */
  var `border-left-color`: js.UndefOr[BorderLeftColorProperty | js.Array[BorderLeftColorProperty]] = js.undefined
  /**
    * The **`border-left-style`** CSS property sets the line style of an element's left `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-style
    */
  var `border-left-style`: js.UndefOr[BorderLeftStyleProperty | js.Array[BorderLeftStyleProperty]] = js.undefined
  /**
    * The **`border-left-width`** CSS property sets the width of the left border of a box.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-width
    */
  var `border-left-width`: js.UndefOr[BorderLeftWidthProperty[TLength] | js.Array[BorderLeftWidthProperty[TLength]]] = js.undefined
  /**
    * The **`border-right-color`** CSS property sets the color of an element's right `border`. Note that in many cases the shorthand CSS properties  `border-color` or `border-right` are more convenient and preferable.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-color
    */
  var `border-right-color`: js.UndefOr[BorderRightColorProperty | js.Array[BorderRightColorProperty]] = js.undefined
  /**
    * The **`border-right-style`** CSS property sets the line style of an element's right `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-style
    */
  var `border-right-style`: js.UndefOr[BorderRightStyleProperty | js.Array[BorderRightStyleProperty]] = js.undefined
  /**
    * The **`border-right-width`** CSS property sets the width of the right border of a box.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-width
    */
  var `border-right-width`: js.UndefOr[BorderRightWidthProperty[TLength] | js.Array[BorderRightWidthProperty[TLength]]] = js.undefined
  /**
    * The **`border-spacing`** CSS property specifies the distance between the borders of adjacent `<table>` cells. This property applies only when `border-collapse` is `separate`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-spacing
    */
  var `border-spacing`: js.UndefOr[BorderSpacingProperty[TLength] | js.Array[BorderSpacingProperty[TLength]]] = js.undefined
  /**
    * The **`border-top-color`** CSS property sets the color of an element's top `border`. Note that in many cases the shorthand CSS properties `border-color` or `border-top` are more convenient and preferable.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-color
    */
  var `border-top-color`: js.UndefOr[BorderTopColorProperty | js.Array[BorderTopColorProperty]] = js.undefined
  /**
    * The **`border-top-left-radius`** CSS property sets the rounding of the top\-left corner of the element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-left-radius
    */
  var `border-top-left-radius`: js.UndefOr[
    BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-top-right-radius`** CSS property sets the rounding of the top\-right corner of the element.
    *
    * **Initial value**: `0`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **4**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-right-radius
    */
  var `border-top-right-radius`: js.UndefOr[
    BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-top-style`** CSS property sets the line style of an element's top `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-style
    */
  var `border-top-style`: js.UndefOr[BorderTopStyleProperty | js.Array[BorderTopStyleProperty]] = js.undefined
  /**
    * The **`border-top-width`** CSS property sets the width of the top border of a box.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-width
    */
  var `border-top-width`: js.UndefOr[BorderTopWidthProperty[TLength] | js.Array[BorderTopWidthProperty[TLength]]] = js.undefined
  /**
    * The **`bottom`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non\-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/bottom
    */
  var bottom: js.UndefOr[BottomProperty[TLength] | js.Array[BottomProperty[TLength]]] = js.undefined
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Initial value**: `slice`
    *
    * |    Chrome    | Firefox | Safari  | Edge | IE  |
    * | :----------: | :-----: | :-----: | :--: | :-: |
    * | **22** _-x-_ | **32**  | **6.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-decoration-break
    */
  var `box-decoration-break`: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.undefined
  /**
    * The **`box-shadow`** CSS property is used to add shadow effects around an element's frame. You can specify multiple effects separated by commas if you wish to do so. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * | **10**  |  **4**  | **5.1** | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-shadow
    */
  var `box-shadow`: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.undefined
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Initial value**: `content-box`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * | **10**  | **29**  | **5.1** | **12** | **8** |
    * | 1 _-x-_ | 1 _-x-_ |         |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-sizing
    */
  var `box-sizing`: js.UndefOr[BoxSizingProperty | js.Array[BoxSizingProperty]] = js.undefined
  /**
    * The **`break-after`** CSS property defines how page, column, or region breaks should behave after a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** |   No    | **10** | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-after
    */
  var `break-after`: js.UndefOr[BreakAfterProperty | js.Array[BreakAfterProperty]] = js.undefined
  /**
    * The **`break-before`** CSS property defines how page, column, or region breaks should behave before a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** |   No    | **10** | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-before
    */
  var `break-before`: js.UndefOr[BreakBeforeProperty | js.Array[BreakBeforeProperty]] = js.undefined
  /**
    * The **`break-inside`** CSS property defines how page, column, or region breaks should behave inside a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** |   No    | **10** | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-inside
    */
  var `break-inside`: js.UndefOr[BreakInsideProperty | js.Array[BreakInsideProperty]] = js.undefined
  /**
    * The **`caption-side`** CSS property puts the content of a table's `<caption>` on the specified side. The values are relative to the `writing-mode` of the table.
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caption-side
    */
  var `caption-side`: js.UndefOr[CaptionSideProperty | js.Array[CaptionSideProperty]] = js.undefined
  /**
    * The **`caret-color`** CSS property sets the color of the insertion caret — the visible indicator of the point at which the next character typed by the user will be inserted — within an element such as `<input>` or one with the `contenteditable` attribute set. The caret is typically a thin vertical line that flashes to help make it more noticeable. By default, it is black, but its color can be altered with this property.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **53**  | **11.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caret-color
    */
  var `caret-color`: js.UndefOr[CaretColorProperty | js.Array[CaretColorProperty]] = js.undefined
  /**
    * The **`clear`** CSS property specifies whether an element can be next to floating elements that precede it or must be moved down (cleared) below them. The `clear` property applies to both floating and non\-floating elements.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clear
    */
  var clear: js.UndefOr[ClearProperty | js.Array[ClearProperty]] = js.undefined
  /**
    * The `**clip-path**` CSS property creates a clipping region that defines what part of an element should be displayed. More specifically, those portions that are inside the region are shown, while those outside are hidden.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox | Safari | Edge | IE  |
    * | :------: | :-----: | :----: | :--: | :-: |
    * |  **55**  | **3.5** |   No   |  No  | No  |
    * | 24 _-x-_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clip-path
    */
  var `clip-path`: js.UndefOr[ClipPathProperty | js.Array[ClipPathProperty]] = js.undefined
  /**
    * The **`color`** CSS property sets the foreground color value of an element's text content and text decorations. It also sets the `currentcolor` value, which may be used as an indirect value on _other_ properties, and is the default for other color properties, such as `border-color`.
    *
    * **Initial value**: Varies from one browser to another
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **1**  |  **1**  |  Yes   | **12** | Yes |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color
    */
  var color: js.UndefOr[ColorProperty | js.Array[ColorProperty]] = js.undefined
  /**
    * The **`color-adjust`** CSS property gives the web author control over what if anything the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
    *
    * **Initial value**: `economy`
    *
    * |    Chrome    | Firefox |   Safari    | Edge | IE  |
    * | :----------: | :-----: | :---------: | :--: | :-: |
    * | **49** _-x-_ | **48**  | **6** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color-adjust
    */
  var `color-adjust`: js.UndefOr[ColorAdjustProperty | js.Array[ColorAdjustProperty]] = js.undefined
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Initial value**: `auto`
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **52**   | **3** _-x-_ | **12** | **10** |
    * |        | 1.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-count
    */
  var `column-count`: js.UndefOr[ColumnCountProperty | js.Array[ColumnCountProperty]] = js.undefined
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Initial value**: `balance`
    *
    * | Chrome | Firefox  | Safari |  Edge  | IE  |
    * | :----: | :------: | :----: | :----: | :-: |
    * |  Yes   |  **52**  |  n/a   | **12** | n/a |
    * |        | 13 _-x-_ |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-fill
    */
  var `column-fill`: js.UndefOr[ColumnFillProperty | js.Array[ColumnFillProperty]] = js.undefined
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |     Chrome      |     Firefox     |        Safari         |  Edge  | IE  |
    * | :-------------: | :-------------: | :-------------------: | :----: | :-: |
    * |     **66**      |     **61**      | **10.1** _(grid-gap)_ | **16** | No  |
    * | 57 _(grid-gap)_ | 52 _(grid-gap)_ |                       |        |     |
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **52**   | **10**  | **12** | **10** |
    * |        | 1.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-gap
    */
  var `column-gap`: js.UndefOr[ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]] = js.undefined
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi\-column layout.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **52**   | **3** _-x-_ | **12** | **10** |
    * |        | 3.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-color
    */
  var `column-rule-color`: js.UndefOr[ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]] = js.undefined
  /**
    * The **`column-rule-style`** CSS property sets the style of the rule (line) drawn between columns in a multi\-column layout.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |   IE   |
    * | :----: | :-----: | :---------: | :----: | :----: |
    * | **50** | **52**  | **3** _-x-_ | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-style
    */
  var `column-rule-style`: js.UndefOr[ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]] = js.undefined
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi\-column layout.
    *
    * **Initial value**: `medium`
    *
    * | Chrome |  Firefox  |   Safari    |     Edge     |   IE   |
    * | :----: | :-------: | :---------: | :----------: | :----: |
    * | **50** |  **50**   | **3** _-x-_ | **12** _-x-_ | **10** |
    * |        | 3.5 _-x-_ |             |              |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-width
    */
  var `column-rule-width`: js.UndefOr[ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]] = js.undefined
  /**
    * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** |   n/a   |  Yes   | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-span
    */
  var `column-span`: js.UndefOr[ColumnSpanProperty | js.Array[ColumnSpanProperty]] = js.undefined
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi\-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value.  If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Initial value**: `auto`
    *
    * | Chrome |  Firefox  |   Safari    |  Edge  |   IE   |
    * | :----: | :-------: | :---------: | :----: | :----: |
    * | **50** |  **50**   | **3** _-x-_ | **12** | **10** |
    * |        | 1.5 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-width
    */
  var `column-width`: js.UndefOr[ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]] = js.undefined
  /**
    * The **`contain`** CSS property allows an author to indicate that an element and its contents are, as much as possible, _independent_ of the rest of the document tree. This allows the browser to recalculate layout, style, paint, size, or any combination of them for a limited area of the DOM and not the entire page.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **52** |   n/a   |  n/a   | n/a  | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/contain
    */
  var contain: js.UndefOr[ContainProperty | js.Array[ContainProperty]] = js.undefined
  /**
    * The **`content`** CSS property is used to replace an element with a generated value. Objects inserted using the `content` property are _anonymous replaced elements._
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/content
    */
  var content: js.UndefOr[ContentProperty | js.Array[ContentProperty]] = js.undefined
  /**
    * The **`counter-increment`** CSS property increases or decreases the value of a CSS counter by a given value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge |  IE   |
    * | :----: | :-----: | :----: | :--: | :---: |
    * | **2**  |  **1**  | **3**  | n/a  | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-increment
    */
  var `counter-increment`: js.UndefOr[CounterIncrementProperty | js.Array[CounterIncrementProperty]] = js.undefined
  /**
    * The **`counter-reset`** CSS property resets a CSS counter to a given value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **2**  |  **1**  | **3.1** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-reset
    */
  var `counter-reset`: js.UndefOr[CounterResetProperty | js.Array[CounterResetProperty]] = js.undefined
  /**
    * The **`cursor`** CSS property specifies which mouse cursor to display when the mouse pointer is over an element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/cursor
    */
  var cursor: js.UndefOr[CursorProperty | js.Array[CursorProperty]] = js.undefined
  /**
    * The **`direction`** CSS property sets the direction of text, table columns, and horizontal overflow. Use `rtl` for languages written from right to left (like Hebrew or Arabic), and `ltr` for those written from left to right (like English and most other languages).
    *
    * **Initial value**: `ltr`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **2**  |  **1**  | **1.3** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/direction
    */
  var direction: js.UndefOr[DirectionProperty | js.Array[DirectionProperty]] = js.undefined
  /**
    * The **`display`** CSS property defines the  _display type_ of an element, which consists of the two basic qualities of how an element generates boxes. These being the **outer display type** defining how the box participates in flow layout , and the **inner display type** defining how the children of this box are laid out.
    *
    * **Initial value**: `inline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/display
    */
  var display: js.UndefOr[DisplayProperty | js.Array[DisplayProperty]] = js.undefined
  /**
    * The **`empty-cells`** CSS property specifies how the user agent should render borders and backgrounds around `<table>` cells that have no visible content.
    *
    * **Initial value**: `show`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/empty-cells
    */
  var `empty-cells`: js.UndefOr[EmptyCellsProperty | js.Array[EmptyCellsProperty]] = js.undefined
  /**
    * The **`filter`** CSS property lets you apply graphical effects like blurring or color shifting to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox |   Safari    |  Edge  | IE  |
    * | :------: | :-----: | :---------: | :----: | :-: |
    * |  **53**  | **35**  | **6** _-x-_ | **12** | No  |
    * | 18 _-x-_ |         |             |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/filter
    */
  var filter: js.UndefOr[FilterProperty | js.Array[FilterProperty]] = js.undefined
  /**
    * The **`flex-basis`** CSS property specifies the initial **main size** of a flex item. This property determines the size of the content\-box unless specified otherwise using `box-sizing`.
    *
    * **Initial value**: `auto`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **29**  | **22**  |  **9**  | **12** | **11** |
    * | 21 _-x-_ |         | 7 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-basis
    */
  var `flex-basis`: js.UndefOr[FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]] = js.undefined
  /**
    * The **`flex-direction`** CSS property specifies how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Initial value**: `row`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
    * | :------: | :-----: | :-----: | :----: | :------: |
    * |  **29**  | **20**  |  **9**  | **12** |  **11**  |
    * | 21 _-x-_ |         | 7 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-direction
    */
  var `flex-direction`: js.UndefOr[FlexDirectionProperty | js.Array[FlexDirectionProperty]] = js.undefined
  /**
    * The **`flex-grow`** CSS property specifies the flex grow factor of a flex item. It specifies how much of the available space in the flex container should be assigned to that item. If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Initial value**: `0`
    *
    * |  Chrome  | Firefox |    Safari     |  Edge  |            IE            |
    * | :------: | :-----: | :-----------: | :----: | :----------------------: |
    * |  **29**  | **20**  | **6.1** _-x-_ | **12** |          **11**          |
    * | 21 _-x-_ |         |               |        | 10 _(-ms-flex-positive)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-grow
    */
  var `flex-grow`: js.UndefOr[csstypeLib.GlobalsNumber | js.Array[csstypeLib.GlobalsNumber]] = js.undefined
  /**
    * The **`flex-shrink`** CSS property specifies the flex shrink factor of a flex item. Flex items will shrink to fill the container according to the `flex-shrink` number, when the default size of flex items is larger than the flex container.
    *
    * **Initial value**: `1`
    *
    * |  Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :------: | :-----: | :---------: | :----: | :----: |
    * |  **29**  | **20**  | **8** _-x-_ | **12** | **10** |
    * | 21 _-x-_ |         |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-shrink
    */
  var `flex-shrink`: js.UndefOr[csstypeLib.GlobalsNumber | js.Array[csstypeLib.GlobalsNumber]] = js.undefined
  /**
    * The CSS **`flex-wrap`** property specifies whether flex items are forced into a single line or can be wrapped onto multiple lines. If wrapping is allowed, this property also enables you to control the direction in which lines are stacked.
    *
    * **Initial value**: `nowrap`
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **29**  | **28**  | **9**  | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-wrap
    */
  var `flex-wrap`: js.UndefOr[FlexWrapProperty | js.Array[FlexWrapProperty]] = js.undefined
  /**
    * The **`float`** CSS property specifies that an element should be placed along the left or right side of its container, allowing text and inline elements to wrap around it. The element is removed from the normal flow of the web page, though still remaining a part of the flow (in contrast to absolute positioning).
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/float
    */
  var float: js.UndefOr[FloatProperty | js.Array[FloatProperty]] = js.undefined
  /**
    * The **`font-family`** CSS property specifies a prioritized list of one or more font family names and/or generic family names for the selected element.
    *
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-family
    */
  var `font-family`: js.UndefOr[FontFamilyProperty | js.Array[FontFamilyProperty]] = js.undefined
  /**
    * The **`font-feature-settings`** CSS property gives you control over advanced typographic features in OpenType fonts.
    *
    * **Initial value**: `normal`
    *
    * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
    * | :------: | :------: | :-----: | :----: | :----: |
    * |  **48**  |  **34**  | **9.1** | **15** | **10** |
    * | 16 _-x-_ | 15 _-x-_ |         |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-feature-settings
    */
  var `font-feature-settings`: js.UndefOr[FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]] = js.undefined
  /**
    * The **`font-kerning`** CSS property controls the usage of the kerning information stored in a font.
    *
    * **Initial value**: `auto`
    *
    * |    Chrome    | Firefox | Safari | Edge | IE  |
    * | :----------: | :-----: | :----: | :--: | :-: |
    * | **32** _-x-_ | **32**  | **7**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-kerning
    */
  var `font-kerning`: js.UndefOr[FontKerningProperty | js.Array[FontKerningProperty]] = js.undefined
  /**
    * The **`font-language-override`** CSS property controls the usage of language\-specific glyphs in a typeface.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  |   No   |  No  | No  |
    * |        | 4 _-x-_ |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-language-override
    */
  var `font-language-override`: js.UndefOr[FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]] = js.undefined
  /**
    * The **`font-optical-sizing`** CSS property allows developers to control whether browsers render text with slightly differing visual representations to optimize viewing at different sizes, or not. This only works for fonts that have an optical size variation axis.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **62**  |  n/a   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-optical-sizing
    */
  var `font-optical-sizing`: js.UndefOr[FontOpticalSizingProperty | js.Array[FontOpticalSizingProperty]] = js.undefined
  /**
    * The **`font-size`** CSS property specifies the size of the font. Setting this property may change the size of other items, too, since it is used to compute the value of `em`, `ex`, and various other relative `<length>` units.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size
    */
  var `font-size`: js.UndefOr[FontSizeProperty[TLength] | js.Array[FontSizeProperty[TLength]]] = js.undefined
  /**
    * The **`font-size-adjust`** CSS property specifies that the font size should be chosen based on the height of lowercase letters rather than the height of capital letters. This is useful since the legibility of fonts, especially at small sizes, is determined more by the size of lowercase letters than by the size of capital letters.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |  **1**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size-adjust
    */
  var `font-size-adjust`: js.UndefOr[FontSizeAdjustProperty | js.Array[FontSizeAdjustProperty]] = js.undefined
  /**
    * The **`font-stretch`** CSS property selects a normal, condensed, or expanded face from a font.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **60** |  **9**  | **11** | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-stretch
    */
  var `font-stretch`: js.UndefOr[FontStretchProperty | js.Array[FontStretchProperty]] = js.undefined
  /**
    * The **`font-style`** CSS property specifies whether a font should be styled with a normal, italic, or oblique face from its `font-family`.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-style
    */
  var `font-style`: js.UndefOr[FontStyleProperty | js.Array[FontStyleProperty]] = js.undefined
  /**
    * The **`font-synthesis`** CSS property controls which missing typefaces, bold or italic, may be synthesized by the browser.
    *
    * **Initial value**: `weight style`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-synthesis
    */
  var `font-synthesis`: js.UndefOr[FontSynthesisProperty | js.Array[FontSynthesisProperty]] = js.undefined
  /**
    * The **font\-variant** CSS property is a shorthand for the longhand properties `font-variant-caps`, `font-variant-numeric`, `font-variant-alternates`, `font-variant-ligatures`, and `font-variant-east-asian`. You can also set the CSS Level 2 (Revision 1) values of `font-variant`, (that is, `normal` or `small-caps`), by using the `font` shorthand.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant
    */
  var `font-variant`: js.UndefOr[FontVariantProperty | js.Array[FontVariantProperty]] = js.undefined
  /**
    * The **`font-variant-caps`** CSS property controls the usage of alternate glyphs for capital letters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **52** | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-caps
    */
  var `font-variant-caps`: js.UndefOr[FontVariantCapsProperty | js.Array[FontVariantCapsProperty]] = js.undefined
  /**
    * The **`font-variant-east-asian`** CSS property controls the usage of alternate glyphs for East Asian scripts, like Japanese and Chinese.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **63** | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-east-asian
    */
  var `font-variant-east-asian`: js.UndefOr[FontVariantEastAsianProperty | js.Array[FontVariantEastAsianProperty]] = js.undefined
  /**
    * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
    *
    * **Initial value**: `normal`
    *
    * |  Chrome  | Firefox | Safari  | Edge | IE  |
    * | :------: | :-----: | :-----: | :--: | :-: |
    * |  **34**  | **34**  | **9.1** |  No  | No  |
    * | 31 _-x-_ |         | 7 _-x-_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-ligatures
    */
  var `font-variant-ligatures`: js.UndefOr[FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]] = js.undefined
  /**
    * The **`font-variant-numeric`** CSS property controls the usage of alternate glyphs for numbers, fractions, and ordinal markers.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **52** | **34**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-numeric
    */
  var `font-variant-numeric`: js.UndefOr[FontVariantNumericProperty | js.Array[FontVariantNumericProperty]] = js.undefined
  /**
    * The **`font-variant-position`** CSS property controls the usage of alternate, smaller glyphs that are positioned as superscript or subscript relative to the baseline of the font (which remains unchanged). These glyphs are likely to be used in `<sub>` and `<sup>` elements.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-position
    */
  var `font-variant-position`: js.UndefOr[FontVariantPositionProperty | js.Array[FontVariantPositionProperty]] = js.undefined
  /**
    * The **`font-variation-settings`** CSS property provides low\-level control over variable font characteristics, by specifying the four letter axis names of the characteristics you want to vary, along with their values.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **62** | **62**  | **11** | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variation-settings
    */
  var `font-variation-settings`: js.UndefOr[FontVariationSettingsProperty | js.Array[FontVariationSettingsProperty]] = js.undefined
  /**
    * The **`font-weight`** CSS property specifies the weight (or boldness) of the font. The font weights available to you will depend on the `font-family` you are using. Some fonts are only available in `normal` and `bold`.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **2**  |  **1**  | **1.3** | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-weight
    */
  var `font-weight`: js.UndefOr[FontWeightProperty | js.Array[FontWeightProperty]] = js.undefined
  /**
    * The **`grid-auto-columns`** CSS property specifies the size of an implicitly\-created grid column track.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |          Edge           |             IE              |
    * | :----: | :-----: | :------: | :---------------------: | :-------------------------: |
    * | **57** | **52**  | **10.1** |         **16**          | **10** _(-ms-grid-columns)_ |
    * |        |         |          | 12 _(-ms-grid-columns)_ |                             |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-columns
    */
  var `grid-auto-columns`: js.UndefOr[GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]] = js.undefined
  /**
    * The **`grid-auto-flow`** CSS property controls how the auto\-placement algorithm works, specifying exactly how auto\-placed items get flowed into the grid.
    *
    * **Initial value**: `row`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-flow
    */
  var `grid-auto-flow`: js.UndefOr[GridAutoFlowProperty | js.Array[GridAutoFlowProperty]] = js.undefined
  /**
    * The **`grid-auto-rows`** CSS property specifies the size of an implicitly\-created grid row track.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |         Edge         |            IE            |
    * | :----: | :-----: | :------: | :------------------: | :----------------------: |
    * | **57** | **52**  | **10.1** |        **16**        | **10** _(-ms-grid-rows)_ |
    * |        |         |          | 12 _(-ms-grid-rows)_ |                          |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-rows
    */
  var `grid-auto-rows`: js.UndefOr[GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]] = js.undefined
  /**
    * The **`grid-column-end`** CSS property specifies a grid item’s end position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the block\-end edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-end
    */
  var `grid-column-end`: js.UndefOr[GridColumnEndProperty | js.Array[GridColumnEndProperty]] = js.undefined
  /**
    * The **`grid-column-start`** CSS property specifies a grid item’s start position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement. This start position defines the block\-start edge of the grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-start
    */
  var `grid-column-start`: js.UndefOr[GridColumnStartProperty | js.Array[GridColumnStartProperty]] = js.undefined
  /**
    * The **`grid-row-end`** CSS property specifies a grid item’s end position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline\-end edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-end
    */
  var `grid-row-end`: js.UndefOr[GridRowEndProperty | js.Array[GridRowEndProperty]] = js.undefined
  /**
    * The **`grid-row-start`** CSS property specifies a grid item’s start position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline\-start edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-start
    */
  var `grid-row-start`: js.UndefOr[GridRowStartProperty | js.Array[GridRowStartProperty]] = js.undefined
  /**
    * The **`grid-template-areas`** CSS property specifies named grid areas.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-areas
    */
  var `grid-template-areas`: js.UndefOr[GridTemplateAreasProperty | js.Array[GridTemplateAreasProperty]] = js.undefined
  /**
    * The **`grid-template-columns`** CSS property defines the line names and track sizing functions of the grid columns.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-columns
    */
  var `grid-template-columns`: js.UndefOr[
    GridTemplateColumnsProperty[TLength] | js.Array[GridTemplateColumnsProperty[TLength]]
  ] = js.undefined
  /**
    * The **`grid-template-rows`** CSS property defines the line names and track sizing functions of the grid rows.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-rows
    */
  var `grid-template-rows`: js.UndefOr[GridTemplateRowsProperty[TLength] | js.Array[GridTemplateRowsProperty[TLength]]] = js.undefined
  /**
    * The **`hanging-punctuation`** CSS property specifies whether a punctuation mark should hang at the start or end of a line of text. Hanging punctuation may be placed outside the line box.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **10** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/hanging-punctuation
    */
  var `hanging-punctuation`: js.UndefOr[HangingPunctuationProperty | js.Array[HangingPunctuationProperty]] = js.undefined
  /**
    * The **`height`** CSS property specifies the height of an element. By default, the property defines the height of the content area. If `box-sizing` is set to `border-box`, however, it instead determines the height of the border area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/height
    */
  var height: js.UndefOr[HeightProperty[TLength] | js.Array[HeightProperty[TLength]]] = js.undefined
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually\-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Initial value**: `manual`
    *
    * |  Chrome  | Firefox |    Safari     |     Edge     |      IE      |
    * | :------: | :-----: | :-----------: | :----------: | :----------: |
    * |  **55**  | **43**  | **5.1** _-x-_ | **12** _-x-_ | **10** _-x-_ |
    * | 13 _-x-_ | 6 _-x-_ |               |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/hyphens
    */
  var hyphens: js.UndefOr[HyphensProperty | js.Array[HyphensProperty]] = js.undefined
  /**
    * The **`image-orientation`** CSS property specifies a layout\-independent correction to the orientation of an image. It should _not_ be used for any other orientation adjustments; instead, the `transform` property should be used with the `rotate` `<transform-function>`.
    *
    * **Initial value**: `0deg`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **26**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-orientation
    */
  var `image-orientation`: js.UndefOr[ImageOrientationProperty | js.Array[ImageOrientationProperty]] = js.undefined
  /**
    * The **`image-rendering`** CSS property indicates the algorithm to use when scaling images. When applied to an element, the property applies to the element itself, to any images supplied in its other properties, and to its descendant elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **3.6** |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-rendering
    */
  var `image-rendering`: js.UndefOr[ImageRenderingProperty | js.Array[ImageRenderingProperty]] = js.undefined
  /** **Initial value**: `1dppx` */
  var `image-resolution`: js.UndefOr[ImageResolutionProperty | js.Array[ImageResolutionProperty]] = js.undefined
  /**
    * The `initial-letter` CSS property specifies styling for dropped, raised, and sunken initial letters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **9**  | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/initial-letter
    */
  var `initial-letter`: js.UndefOr[InitialLetterProperty | js.Array[InitialLetterProperty]] = js.undefined
  /**
    * The **`inline-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inline-size
    */
  var `inline-size`: js.UndefOr[InlineSizeProperty[TLength] | js.Array[InlineSizeProperty[TLength]]] = js.undefined
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-end
    */
  var `inset-block-end`: js.UndefOr[InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]] = js.undefined
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-start
    */
  var `inset-block-start`: js.UndefOr[InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]] = js.undefined
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-end
    */
  var `inset-inline-end`: js.UndefOr[InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]] = js.undefined
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-start
    */
  var `inset-inline-start`: js.UndefOr[InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]] = js.undefined
  /**
    * The **`isolation`** CSS property determines whether an element must create a new stacking context.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **41** | **36**  |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/isolation
    */
  var isolation: js.UndefOr[IsolationProperty | js.Array[IsolationProperty]] = js.undefined
  /**
    * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main\-axis of their container.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **52**  | **20**  | **9**  | **12** | **11** |
    * | 21 _-x-_ |         |        |        |        |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-content
    */
  var `justify-content`: js.UndefOr[JustifyContentProperty | js.Array[JustifyContentProperty]] = js.undefined
  /**
    * The CSS **`justify-items`** property defines the default `justify-self` for all items of the box, giving them all a default way of justifying each box along the appropriate axis.
    *
    * **Initial value**: `legacy`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **52** | **20**  | **9**  | **12** | **11** |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-items
    */
  var `justify-items`: js.UndefOr[JustifyItemsProperty | js.Array[JustifyItemsProperty]] = js.undefined
  /**
    * The CSS **`justify-self`** property defines the way of justifying a box inside its alignment container along the appropriate axis.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **45**  | **10.1** | **16** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-self
    */
  var `justify-self`: js.UndefOr[JustifySelfProperty | js.Array[JustifySelfProperty]] = js.undefined
  /**
    * The **`left`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non\-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/left
    */
  var left: js.UndefOr[LeftProperty[TLength] | js.Array[LeftProperty[TLength]]] = js.undefined
  /**
    * The **`letter-spacing`** CSS property specifies the spacing behavior between text characters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/letter-spacing
    */
  var `letter-spacing`: js.UndefOr[LetterSpacingProperty[TLength] | js.Array[LetterSpacingProperty[TLength]]] = js.undefined
  /**
    * The **`line-break`** CSS property is used to specify how (or if) to break lines when working with punctuation and symbols. This only affects text in Chinese, Japanese, or Korean (CJK).
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox | Safari |  Edge  |   IE    |
    * | :-----: | :-----: | :----: | :----: | :-----: |
    * | **58**  |   No    |  Yes   | **14** | **5.5** |
    * | 1 _-x-_ |         |        |        |         |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-break
    */
  var `line-break`: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.undefined
  /**
    * The **`line-height`** CSS property sets the amount of space used for lines, such as in text. On block\-level elements, it specifies the minimum height of line boxes within the element. On non\-replaced inline elements, it specifies the height that is used to calculate line box height.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height
    */
  var `line-height`: js.UndefOr[LineHeightProperty[TLength] | js.Array[LineHeightProperty[TLength]]] = js.undefined
  /**
    * The **`list-style-image`** CSS property specifies an image to be used as the list item marker. It is often more convenient to use the shorthand `list-style`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-image
    */
  var `list-style-image`: js.UndefOr[ListStyleImageProperty | js.Array[ListStyleImageProperty]] = js.undefined
  /**
    * The **`list-style-position`** CSS property specifies the position of the `::marker` relative to a list item.
    *
    * **Initial value**: `outside`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-position
    */
  var `list-style-position`: js.UndefOr[ListStylePositionProperty | js.Array[ListStylePositionProperty]] = js.undefined
  /**
    * The **`list-style-type`** CSS property specifies the appearance of a list item element.
    *
    * **Initial value**: `disc`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-type
    */
  var `list-style-type`: js.UndefOr[ListStyleTypeProperty | js.Array[ListStyleTypeProperty]] = js.undefined
  /**
    * The **`margin-block-end`** CSS property defines the logical block end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-end
    */
  var `margin-block-end`: js.UndefOr[MarginBlockEndProperty[TLength] | js.Array[MarginBlockEndProperty[TLength]]] = js.undefined
  /**
    * The **`margin-block-start`** CSS property defines the logical block start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-start
    */
  var `margin-block-start`: js.UndefOr[MarginBlockStartProperty[TLength] | js.Array[MarginBlockStartProperty[TLength]]] = js.undefined
  /**
    * The **`margin-bottom`** CSS property sets the margin area on the bottom of an element. A positive value will place it farther than normal from its neighbors, while a negative value will place it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var `margin-bottom`: js.UndefOr[MarginBottomProperty[TLength] | js.Array[MarginBottomProperty[TLength]]] = js.undefined
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |          Chrome          |        Firefox        |            Safari            | Edge | IE  |
    * | :----------------------: | :-------------------: | :--------------------------: | :--: | :-: |
    * |          **69**          |        **41**         | **3** _(-webkit-margin-end)_ |  No  | No  |
    * | 2 _(-webkit-margin-end)_ | 3 _(-moz-margin-end)_ |                              |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-end
    */
  var `margin-inline-end`: js.UndefOr[MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]] = js.undefined
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |           Chrome           |         Firefox         |             Safari             | Edge | IE  |
    * | :------------------------: | :---------------------: | :----------------------------: | :--: | :-: |
    * |           **69**           |         **41**          | **3** _(-webkit-margin-start)_ |  No  | No  |
    * | 2 _(-webkit-margin-start)_ | 3 _(-moz-margin-start)_ |                                |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-start
    */
  var `margin-inline-start`: js.UndefOr[
    MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]
  ] = js.undefined
  /**
    * The **`margin-left`** CSS property sets the margin area on the left side of an element. A positive value will place it farther than normal from its neighbors, while a negative value will place it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    */
  var `margin-left`: js.UndefOr[MarginLeftProperty[TLength] | js.Array[MarginLeftProperty[TLength]]] = js.undefined
  /**
    * The **`margin-right`** CSS property sets the margin area on the right side of an element. A positive value will place it farther than normal from its neighbors, while a negative value will place it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var `margin-right`: js.UndefOr[MarginRightProperty[TLength] | js.Array[MarginRightProperty[TLength]]] = js.undefined
  /**
    * The **`margin-top`** CSS property sets the margin area on the top of an element. A positive value will place it farther than normal from its neighbors, while a negative value will place it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    */
  var `margin-top`: js.UndefOr[MarginTopProperty[TLength] | js.Array[MarginTopProperty[TLength]]] = js.undefined
  /**
    * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
    *
    * **Initial value**: `alpha`
    */
  var `mask-border-mode`: js.UndefOr[MaskBorderModeProperty | js.Array[MaskBorderModeProperty]] = js.undefined
  /**
    * The **`mask-border-outset`** CSS property specifies the distance by which an element's mask border is set out from its border box.
    *
    * **Initial value**: `0`
    */
  var `mask-border-outset`: js.UndefOr[MaskBorderOutsetProperty[TLength] | js.Array[MaskBorderOutsetProperty[TLength]]] = js.undefined
  /**
    * The **`mask-border-repeat`** CSS property defines how the edge regions of a source image are adjusted to fit the dimensions of an element's mask border.
    *
    * **Initial value**: `stretch`
    */
  var `mask-border-repeat`: js.UndefOr[MaskBorderRepeatProperty | js.Array[MaskBorderRepeatProperty]] = js.undefined
  /**
    * The **`mask-border-slice`** CSS property divides the image specified by `mask-border-source` into regions. These regions are used to form the components of an element's mask border.
    *
    * **Initial value**: `0`
    */
  var `mask-border-slice`: js.UndefOr[MaskBorderSliceProperty | js.Array[MaskBorderSliceProperty]] = js.undefined
  /**
    * The **`mask-border-source`** CSS property specifies the source image used to create an element's mask border.
    *
    * **Initial value**: `none`
    */
  var `mask-border-source`: js.UndefOr[MaskBorderSourceProperty | js.Array[MaskBorderSourceProperty]] = js.undefined
  /**
    * The **`mask-border-width`** CSS property specifies the width of an element's mask border.
    *
    * **Initial value**: `auto`
    */
  var `mask-border-width`: js.UndefOr[MaskBorderWidthProperty[TLength] | js.Array[MaskBorderWidthProperty[TLength]]] = js.undefined
  /**
    * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **53**  |  Yes   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-clip
    */
  var `mask-clip`: js.UndefOr[MaskClipProperty | js.Array[MaskClipProperty]] = js.undefined
  /**
    * The **`mask-composite`** CSS property represents a compositing operation used on the current mask layer with the mask layers below it.
    *
    * **Initial value**: `add`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **53**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-composite
    */
  var `mask-composite`: js.UndefOr[MaskCompositeProperty | js.Array[MaskCompositeProperty]] = js.undefined
  /**
    * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
    *
    * **Initial value**: `none`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-image
    */
  var `mask-image`: js.UndefOr[MaskImageProperty | js.Array[MaskImageProperty]] = js.undefined
  /**
    * The **`mask-mode`** CSS property determines whether the mask reference defined by `mask-image` is treated as a luminance or alpha mask.
    *
    * **Initial value**: `match-source`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **53**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-mode
    */
  var `mask-mode`: js.UndefOr[MaskModeProperty | js.Array[MaskModeProperty]] = js.undefined
  /**
    * The **`mask-origin`** CSS property determines the origin of a mask.
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **53**  |  Yes   | n/a  | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-origin
    */
  var `mask-origin`: js.UndefOr[MaskOriginProperty | js.Array[MaskOriginProperty]] = js.undefined
  /**
    * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer defined by `mask-origin`, for each defined mask image.
    *
    * **Initial value**: `center`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **18** | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-position
    */
  var `mask-position`: js.UndefOr[MaskPositionProperty[TLength] | js.Array[MaskPositionProperty[TLength]]] = js.undefined
  /**
    * The **`mask-repeat`** CSS property defines how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Initial value**: `no-repeat`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **18** | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-repeat
    */
  var `mask-repeat`: js.UndefOr[MaskRepeatProperty | js.Array[MaskRepeatProperty]] = js.undefined
  /**
    * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |  n/a   | **53**  |  n/a   | **17** | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-size
    */
  var `mask-size`: js.UndefOr[MaskSizeProperty[TLength] | js.Array[MaskSizeProperty[TLength]]] = js.undefined
  /**
    * The **`mask-type`** CSS property determines whether the mask defined by an SVG `<mask>` element is used as a _luminance_ or an _alpha_ mask. It applies to the `<mask>` element itself.
    *
    * **Initial value**: `luminance`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **24** | **35**  |  n/a   | n/a  | n/a |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-type
    */
  var `mask-type`: js.UndefOr[MaskTypeProperty | js.Array[MaskTypeProperty]] = js.undefined
  /**
    * The `**max-block-size**` CSS property specifies the maximum size of an element in the direction opposite that of the writing direction as specified by `writing-mode`. That is, if the writing direction is horizontal, then `max-block-size` is equivalent to `max-height`; if the writing direction is vertical, `max-block-size` is the same as `max-width`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-block-size
    */
  var `max-block-size`: js.UndefOr[MaxBlockSizeProperty[TLength] | js.Array[MaxBlockSizeProperty[TLength]]] = js.undefined
  /**
    * The **`max-height`** CSS property sets the maximum height of an element. It prevents the used value of the `height` property from becoming larger than the value specified for `max-height`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-height
    */
  var `max-height`: js.UndefOr[MaxHeightProperty[TLength] | js.Array[MaxHeightProperty[TLength]]] = js.undefined
  /**
    * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |     Safari     | Edge | IE  |
    * | :----: | :-----: | :------------: | :--: | :-: |
    * | **57** | **41**  | **10.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-inline-size
    */
  var `max-inline-size`: js.UndefOr[MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]] = js.undefined
  /** **Initial value**: `none` */
  var `max-lines`: js.UndefOr[MaxLinesProperty | js.Array[MaxLinesProperty]] = js.undefined
  /**
    * The **`max-width`** CSS property sets the maximum width of an element. It prevents the used value of the `width` property from becoming larger than the value specified by `max-width`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **2**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-width
    */
  var `max-width`: js.UndefOr[MaxWidthProperty[TLength] | js.Array[MaxWidthProperty[TLength]]] = js.undefined
  /**
    * The **`min-block-size`** CSS property defines the minimum horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-block-size
    */
  var `min-block-size`: js.UndefOr[MinBlockSizeProperty[TLength] | js.Array[MinBlockSizeProperty[TLength]]] = js.undefined
  /**
    * The **`min-height`** CSS property sets the minimum height of an element. It prevents the used value of the `height` property from becoming smaller than the value specified for `min-height`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **3**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-height
    */
  var `min-height`: js.UndefOr[MinHeightProperty[TLength] | js.Array[MinHeightProperty[TLength]]] = js.undefined
  /**
    * The **`min-inline-size`** CSS property defines the horizontal or vertical minimal size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-inline-size
    */
  var `min-inline-size`: js.UndefOr[MinInlineSizeProperty[TLength] | js.Array[MinInlineSizeProperty[TLength]]] = js.undefined
  /**
    * The **`min-width`** CSS property sets the minimum width of an element. It prevents the used value of the `width` property from becoming smaller than the value specified for `min-width`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **2**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-width
    */
  var `min-width`: js.UndefOr[MinWidthProperty[TLength] | js.Array[MinWidthProperty[TLength]]] = js.undefined
  /**
    * The **`mix-blend-mode`** CSS property describes how an element's content should blend with the content of the element's direct parent and the element's background.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **41** | **32**  | **8**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mix-blend-mode
    */
  var `mix-blend-mode`: js.UndefOr[MixBlendModeProperty | js.Array[MixBlendModeProperty]] = js.undefined
  /** **Initial value**: `<code>0</code>` */
  var `motion-offset`: js.UndefOr[csstypeLib.GlobalsString | js.Array[csstypeLib.GlobalsString]] = js.undefined
  /** **Initial value**: `<code>none</code>` */
  var `motion-path`: js.UndefOr[MotionPathProperty | js.Array[MotionPathProperty]] = js.undefined
  /** **Initial value**: `<code>auto</code>` */
  var `motion-rotation`: js.UndefOr[csstypeLib.GlobalsString | js.Array[csstypeLib.GlobalsString]] = js.undefined
  /**
    * The **`object-fit`** CSS property specifies how the contents of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Initial value**: `fill`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-fit
    */
  var `object-fit`: js.UndefOr[ObjectFitProperty | js.Array[ObjectFitProperty]] = js.undefined
  /**
    * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
    *
    * **Initial value**: `50% 50%`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-position
    */
  var `object-position`: js.UndefOr[ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]] = js.undefined
  /** **Initial value**: `auto` */
  var `offset-position`: js.UndefOr[OffsetPositionProperty[TLength] | js.Array[OffsetPositionProperty[TLength]]] = js.undefined
  /**
    * The **`opacity`** CSS property specifies the level of transparency of an element, that is, the degree to which the content behind the element is visible.
    *
    * **Initial value**: `1.0`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/opacity
    */
  var opacity: js.UndefOr[csstypeLib.GlobalsNumber | js.Array[csstypeLib.GlobalsNumber]] = js.undefined
  /**
    * The **`order`** CSS property specifies the order used to lay out a flex or grid item in its flex or grid container. Items within the same container are laid out in ascending order according to their `order` values. Elements with the same `order` value are laid out in the order in which they appear in the source code.
    *
    * **Initial value**: `0`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |    IE    |
    * | :------: | :-----: | :-----: | :----: | :------: |
    * |  **29**  | **20**  |  **9**  | **12** |  **11**  |
    * | 21 _-x-_ |         | 7 _-x-_ |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/order
    */
  var order: js.UndefOr[csstypeLib.GlobalsNumber | js.Array[csstypeLib.GlobalsNumber]] = js.undefined
  /**
    * The **`orphans`** CSS property specifies the minimum number of lines in a block container that must be shown at the _bottom_ of a page, region, or column. This property is normally used to control how breaks occur.
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **25** |   No    |   No   | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/orphans
    */
  var orphans: js.UndefOr[csstypeLib.GlobalsNumber | js.Array[csstypeLib.GlobalsNumber]] = js.undefined
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-color
    */
  var `outline-color`: js.UndefOr[OutlineColorProperty | js.Array[OutlineColorProperty]] = js.undefined
  /**
    * The **`outline-offset`** CSS property sets the amount of space between an `outline` and the edge or border of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **1**  | **1.5** | **1.2** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-offset
    */
  var `outline-offset`: js.UndefOr[OutlineOffsetProperty[TLength] | js.Array[OutlineOffsetProperty[TLength]]] = js.undefined
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-style
    */
  var `outline-style`: js.UndefOr[OutlineStyleProperty | js.Array[OutlineStyleProperty]] = js.undefined
  /**
    * The **`outline-width`** CSS property sets the width (thickness) of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-width
    */
  var `outline-width`: js.UndefOr[OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]] = js.undefined
  /**
    * The **`overflow`** CSS property specifies what to do when an element's content is too large to fit in its block formatting context. It is a shorthand for the `overflow-x` and `overflow-y` properties.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow
    */
  var overflow: js.UndefOr[OverflowProperty | js.Array[OverflowProperty]] = js.undefined
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **56** |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-anchor
    */
  var `overflow-anchor`: js.UndefOr[OverflowAnchorProperty | js.Array[OverflowAnchorProperty]] = js.undefined
  /** **Initial value**: `auto` */
  var `overflow-block`: js.UndefOr[OverflowBlockProperty | js.Array[OverflowBlockProperty]] = js.undefined
  /**
    * The **`overflow-clip-box`** CSS property specifies relative to which box the clipping happens when there is an overflow. It is short hand for the `overflow-clip-box-inline` and `overflow-clip-box-block` properties.
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **29**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Mozilla/CSS/overflow-clip-box
    */
  var `overflow-clip-box`: js.UndefOr[OverflowClipBoxProperty | js.Array[OverflowClipBoxProperty]] = js.undefined
  /** **Initial value**: `auto` */
  var `overflow-inline`: js.UndefOr[OverflowInlineProperty | js.Array[OverflowInlineProperty]] = js.undefined
  /**
    * The `**overflow-wrap**` CSS property specifies whether or not the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Initial value**: `normal`
    *
    * |       Chrome        |      Firefox      |       Safari        |       Edge       |          IE           |
    * | :-----------------: | :---------------: | :-----------------: | :--------------: | :-------------------: |
    * | **1** _(word-wrap)_ |      **49**       | **1** _(word-wrap)_ |      **18**      | **5.5** _(word-wrap)_ |
    * |                     | 3.5 _(word-wrap)_ |                     | 12 _(word-wrap)_ |                       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var `overflow-wrap`: js.UndefOr[OverflowWrapProperty | js.Array[OverflowWrapProperty]] = js.undefined
  /**
    * The **`overflow-x`** CSS property specifies whether to clip content, render a scroll bar, or display overflow content of a block\-level element, when it overflows at the left and right edges.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **3.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-x
    */
  var `overflow-x`: js.UndefOr[OverflowXProperty | js.Array[OverflowXProperty]] = js.undefined
  /**
    * The **`overflow-y`** CSS property specifies whether to clip content, render a scroll bar, or display overflow content of a block\-level element, when it overflows at the top and bottom edges.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **1.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-y
    */
  var `overflow-y`: js.UndefOr[OverflowYProperty | js.Array[OverflowYProperty]] = js.undefined
  /**
    * The **`overscroll-behavior`** CSS property is shorthand for the `overscroll-behavior-x` and `overscroll-behavior-y` properties, which allow you to control the browser's scroll overflow behavior — what happens when the boundary of a scrolling area is reached.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior
    */
  var `overscroll-behavior`: js.UndefOr[OverscrollBehaviorProperty | js.Array[OverscrollBehaviorProperty]] = js.undefined
  /**
    * The **`overscroll-behavior-x`** CSS property is allows you to control the browser's scroll overflow behavior — what happens when the boundary of a scrolling area is reached — in the x axis direction.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-x
    */
  var `overscroll-behavior-x`: js.UndefOr[OverscrollBehaviorXProperty | js.Array[OverscrollBehaviorXProperty]] = js.undefined
  /**
    * The **`overscroll-behavior-y`** CSS property is allows you to control the browser's scroll overflow behavior — what happens when the boundary of a scrolling area is reached — in the y axis direction.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-y
    */
  var `overscroll-behavior-y`: js.UndefOr[OverscrollBehaviorYProperty | js.Array[OverscrollBehaviorYProperty]] = js.undefined
  /**
    * The **`padding-block-end`** CSS property defines the logical block end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-end
    */
  var `padding-block-end`: js.UndefOr[PaddingBlockEndProperty[TLength] | js.Array[PaddingBlockEndProperty[TLength]]] = js.undefined
  /**
    * The **`padding-block-start`** CSS property defines the logical block start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-start
    */
  var `padding-block-start`: js.UndefOr[
    PaddingBlockStartProperty[TLength] | js.Array[PaddingBlockStartProperty[TLength]]
  ] = js.undefined
  /**
    * The **`padding-bottom`** CSS property sets the height of the padding area on the bottom of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var `padding-bottom`: js.UndefOr[PaddingBottomProperty[TLength] | js.Array[PaddingBottomProperty[TLength]]] = js.undefined
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |          Chrome           |        Firefox         |            Safari             | Edge | IE  |
    * | :-----------------------: | :--------------------: | :---------------------------: | :--: | :-: |
    * |          **69**           |         **41**         | **3** _(-webkit-padding-end)_ |  No  | No  |
    * | 2 _(-webkit-padding-end)_ | 3 _(-moz-padding-end)_ |                               |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-end
    */
  var `padding-inline-end`: js.UndefOr[PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]] = js.undefined
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |           Chrome            |         Firefox          |             Safari              | Edge | IE  |
    * | :-------------------------: | :----------------------: | :-----------------------------: | :--: | :-: |
    * |           **69**            |          **41**          | **3** _(-webkit-padding-start)_ |  No  | No  |
    * | 2 _(-webkit-padding-start)_ | 3 _(-moz-padding-start)_ |                                 |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-start
    */
  var `padding-inline-start`: js.UndefOr[
    PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]
  ] = js.undefined
  /**
    * The **`padding-left`** CSS property sets the width of the padding area on the left side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    */
  var `padding-left`: js.UndefOr[PaddingLeftProperty[TLength] | js.Array[PaddingLeftProperty[TLength]]] = js.undefined
  /**
    * The **`padding-right`** CSS property sets the width of the padding area on the right side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var `padding-right`: js.UndefOr[PaddingRightProperty[TLength] | js.Array[PaddingRightProperty[TLength]]] = js.undefined
  /**
    * The **`padding-top`** CSS property sets the height of the padding area on the top of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    */
  var `padding-top`: js.UndefOr[PaddingTopProperty[TLength] | js.Array[PaddingTopProperty[TLength]]] = js.undefined
  /**
    * The **`page-break-after`** CSS property adjusts page breaks _after_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-after
    */
  var `page-break-after`: js.UndefOr[PageBreakAfterProperty | js.Array[PageBreakAfterProperty]] = js.undefined
  /**
    * The **`page-break-before`** CSS property adjusts page breaks _before_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-before
    */
  var `page-break-before`: js.UndefOr[PageBreakBeforeProperty | js.Array[PageBreakBeforeProperty]] = js.undefined
  /**
    * The **`page-break-inside`** CSS property adjusts page breaks _inside_ the current element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **19**  | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-inside
    */
  var `page-break-inside`: js.UndefOr[PageBreakInsideProperty | js.Array[PageBreakInsideProperty]] = js.undefined
  /**
    * The **`paint-order`** CSS property lets you control the order in which the fill and stroke (and painting markers) of text content and shapes are drawn.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **60**  |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/paint-order
    */
  var `paint-order`: js.UndefOr[PaintOrderProperty | js.Array[PaintOrderProperty]] = js.undefined
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D\-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D\-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox  | Safari |  Edge  |   IE   |
    * | :------: | :------: | :----: | :----: | :----: |
    * |  **45**  |  **16**  |  Yes   | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/perspective
    */
  var perspective: js.UndefOr[PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]] = js.undefined
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Initial value**: `50% 50%`
    *
    * |    Chrome    | Firefox  | Safari |  Edge  |   IE   |
    * | :----------: | :------: | :----: | :----: | :----: |
    * | **12** _-x-_ |  **16**  |  Yes   | **12** | **10** |
    * |              | 10 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/perspective-origin
    */
  var `perspective-origin`: js.UndefOr[
    PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]
  ] = js.undefined
  /**
    * The `**place-content**` CSS shorthand property sets both the `align-content` and `justify-content` properties.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** |   Yes   |  Yes   |  No  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **53**  |  Yes   |  No  | No  |
    *
    * ---
    *
    * _You can only specify a single value if it is valid for both <code>align-content</code> and <code>justify-content</code>_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **60**  |  Yes   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-content
    */
  var `place-content`: js.UndefOr[PlaceContentProperty | js.Array[PlaceContentProperty]] = js.undefined
  /**
    * The **`pointer-events`** CSS property specifies under what circumstances (if any) a particular graphic element can become the target of mouse events.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **1**  | **1.5** | **3**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/pointer-events
    */
  var `pointer-events`: js.UndefOr[PointerEventsProperty | js.Array[PointerEventsProperty]] = js.undefined
  /**
    * The **`position`** CSS property specifies how an element is positioned in a document. The `top`, `right`, `bottom`, and `left` properties determine the final location of positioned elements.
    *
    * **Initial value**: `static`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/position
    */
  var position: js.UndefOr[PositionProperty | js.Array[PositionProperty]] = js.undefined
  /**
    * The **`quotes`** CSS property indicates how user agents should render quotation marks.
    *
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **11** | **1.5** | **9**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/quotes
    */
  var quotes: js.UndefOr[QuotesProperty | js.Array[QuotesProperty]] = js.undefined
  /**
    * The **`resize`** CSS property sets whether an element is resizable, and if so, in which direction(s).
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **1**  |         | **3**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/resize
    */
  var resize: js.UndefOr[ResizeProperty | js.Array[ResizeProperty]] = js.undefined
  /**
    * The **`right`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non\-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/right
    */
  var right: js.UndefOr[RightProperty[TLength] | js.Array[RightProperty[TLength]]] = js.undefined
  /**
    * The **`rotate`** CSS property allows you to specify rotation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/rotate
    */
  var rotate: js.UndefOr[RotateProperty | js.Array[RotateProperty]] = js.undefined
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's rows.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |       Chrome        |       Firefox       |          Safari           |  Edge  | IE  |
    * | :-----------------: | :-----------------: | :-----------------------: | :----: | :-: |
    * |       **66**        |       **61**        | **10.1** _(grid-row-gap)_ | **16** | No  |
    * | 57 _(grid-row-gap)_ | 52 _(grid-row-gap)_ |                           |        |     |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/row-gap
    */
  var `row-gap`: js.UndefOr[RowGapProperty[TLength] | js.Array[RowGapProperty[TLength]]] = js.undefined
  /**
    * The `**ruby-align**` CSS property defines the distribution of the different ruby elements over the base.
    *
    * **Initial value**: `space-around`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **38**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-align
    */
  var `ruby-align`: js.UndefOr[RubyAlignProperty | js.Array[RubyAlignProperty]] = js.undefined
  /** **Initial value**: `separate` */
  var `ruby-merge`: js.UndefOr[RubyMergeProperty | js.Array[RubyMergeProperty]] = js.undefined
  /**
    * The `**ruby-position**` CSS property defines the position of a ruby element relatives to its base element. It can be position over the element (`over`), under it (`under`), or between the characters, on their right side (`inter-character`).
    *
    * **Initial value**: `over`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **38**  |   No   | **12** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-position
    */
  var `ruby-position`: js.UndefOr[RubyPositionProperty | js.Array[RubyPositionProperty]] = js.undefined
  /**
    * The **`scale`** CSS property allows you to specify scale transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scale
    */
  var scale: js.UndefOr[ScaleProperty | js.Array[ScaleProperty]] = js.undefined
  /**
    * The **`scroll-behavior`** CSS property specifies the scrolling behavior for a scrolling box when scrolling is triggered by one of the navigation or CSSOM scrolling APIs.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **36**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-behavior
    */
  var `scroll-behavior`: js.UndefOr[ScrollBehaviorProperty | js.Array[ScrollBehaviorProperty]] = js.undefined
  /**
    * The `scroll-margin` property is a shorthand property which sets all of the scroll-margin longhands, assigning values much like the margin property does for the margin-\* longhands.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
    */
  var `scroll-margin`: js.UndefOr[ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]] = js.undefined
  /**
    * The `scroll-margin-block` property is a shorthand property which sets the scroll-margin longhands in the block dimension.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block
    */
  var `scroll-margin-block`: js.UndefOr[
    ScrollMarginBlockProperty[TLength] | js.Array[ScrollMarginBlockProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-margin-block-end` property defines the margin of the scroll snap area at the end of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-end
    */
  var `scroll-margin-block-end`: js.UndefOr[
    ScrollMarginBlockEndProperty[TLength] | js.Array[ScrollMarginBlockEndProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-margin-block-start` property defines the margin of the scroll snap area at the start of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-start
    */
  var `scroll-margin-block-start`: js.UndefOr[
    ScrollMarginBlockStartProperty[TLength] | js.Array[ScrollMarginBlockStartProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-margin-bottom` property defines the bottom margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-bottom
    */
  var `scroll-margin-bottom`: js.UndefOr[
    ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-margin-inline-end` property defines the margin of the scroll snap area at the end of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-end
    */
  var `scroll-margin-inline-end`: js.UndefOr[
    ScrollMarginInlineEndProperty[TLength] | js.Array[ScrollMarginInlineEndProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-margin-inline-start` property defines the margin of the scroll snap area at the start of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-start
    */
  var `scroll-margin-inline-start`: js.UndefOr[
    ScrollMarginInlineStartProperty[TLength] | js.Array[ScrollMarginInlineStartProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-margin-left` property defines the left margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-left
    */
  var `scroll-margin-left`: js.UndefOr[ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]] = js.undefined
  /**
    * The `scroll-margin-right` property defines the right margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-right
    */
  var `scroll-margin-right`: js.UndefOr[
    ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-margin-top` property defines the top margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-top
    */
  var `scroll-margin-top`: js.UndefOr[ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]] = js.undefined
  /**
    * The scroll-padding property is a shorthand property which sets all of the scroll-padding longhands, assigning values much like the padding property does for the padding-\* longhands.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding
    */
  var `scroll-padding`: js.UndefOr[ScrollPaddingProperty[TLength] | js.Array[ScrollPaddingProperty[TLength]]] = js.undefined
  /**
    * The `scroll-padding-block` property is a shorthand property which sets the scroll-padding longhands for the block dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    |   No   |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block
    */
  var `scroll-padding-block`: js.UndefOr[
    ScrollPaddingBlockProperty[TLength] | js.Array[ScrollPaddingBlockProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-padding-block-end` property defines offsets for the end edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-end
    */
  var `scroll-padding-block-end`: js.UndefOr[
    ScrollPaddingBlockEndProperty[TLength] | js.Array[ScrollPaddingBlockEndProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-padding-block-start` property defines offsets for the start edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-start
    */
  var `scroll-padding-block-start`: js.UndefOr[
    ScrollPaddingBlockStartProperty[TLength] | js.Array[ScrollPaddingBlockStartProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-padding-bottom` property defines offsets for the bottom of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-bottom
    */
  var `scroll-padding-bottom`: js.UndefOr[
    ScrollPaddingBottomProperty[TLength] | js.Array[ScrollPaddingBottomProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-padding-inline` property is a shorthand property which sets the scroll-padding longhands for the inline dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    |   No   |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline
    */
  var `scroll-padding-inline`: js.UndefOr[
    ScrollPaddingInlineProperty[TLength] | js.Array[ScrollPaddingInlineProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-padding-inline-end` property defines offsets for the end edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-end
    */
  var `scroll-padding-inline-end`: js.UndefOr[
    ScrollPaddingInlineEndProperty[TLength] | js.Array[ScrollPaddingInlineEndProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-padding-inline-start` property defines offsets for the start edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-start
    */
  var `scroll-padding-inline-start`: js.UndefOr[
    ScrollPaddingInlineStartProperty[TLength] | js.Array[ScrollPaddingInlineStartProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-padding-left` property defines offsets for the left of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-left
    */
  var `scroll-padding-left`: js.UndefOr[
    ScrollPaddingLeftProperty[TLength] | js.Array[ScrollPaddingLeftProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-padding-right` property defines offsets for the right of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-right
    */
  var `scroll-padding-right`: js.UndefOr[
    ScrollPaddingRightProperty[TLength] | js.Array[ScrollPaddingRightProperty[TLength]]
  ] = js.undefined
  /**
    * The `scroll-padding-top` property defines offsets for the top of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-top
    */
  var `scroll-padding-top`: js.UndefOr[ScrollPaddingTopProperty[TLength] | js.Array[ScrollPaddingTopProperty[TLength]]] = js.undefined
  /**
    * The `scroll-snap-align` property specifies the box’s snap position as an alignment of its snap area (as the alignment subject) within its snap container’s snapport (as the alignment container). The two values specify the snapping alignment in the block axis and inline axis, respectively. If only one value is specified, the second value defaults to the same value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-align
    */
  var `scroll-snap-align`: js.UndefOr[ScrollSnapAlignProperty | js.Array[ScrollSnapAlignProperty]] = js.undefined
  /**
    * The **`scroll-snap-stop`** CSS property defines whether the scroll container is allowed to "pass over" possible snap positions.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-stop
    */
  var `scroll-snap-stop`: js.UndefOr[ScrollSnapStopProperty | js.Array[ScrollSnapStopProperty]] = js.undefined
  /**
    * The **`scroll-snap-type`** CSS property defines how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |     Edge     |      IE      |
    * | :----: | :-----: | :-----: | :----------: | :----------: |
    * | **69** | **39**  | **11**  | **12** _-x-_ | **10** _-x-_ |
    * |        |         | 9 _-x-_ |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-type
    */
  var `scroll-snap-type`: js.UndefOr[ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]] = js.undefined
  /**
    * The **`scrollbar-color`** CSS property sets the color of the scrollbar track and thumb.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-color
    */
  var `scrollbar-color`: js.UndefOr[ScrollbarColorProperty | js.Array[ScrollbarColorProperty]] = js.undefined
  /**
    * The `scrollbar-width` property allows the author to set the maximum thickness of an element’s scrollbars when they are shown.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-width
    */
  var `scrollbar-width`: js.UndefOr[ScrollbarWidthProperty[TLength] | js.Array[ScrollbarWidthProperty[TLength]]] = js.undefined
  /**
    * The **`shape-image-threshold`** CSS property defines the alpha channel threshold used to extract the shape using an image as the value for `shape-outside`.
    *
    * **Initial value**: `0.0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **37** | **62**  | **10.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-image-threshold
    */
  var `shape-image-threshold`: js.UndefOr[csstypeLib.GlobalsNumber | js.Array[csstypeLib.GlobalsNumber]] = js.undefined
  /**
    * The **`shape-margin`** CSS property specifies a margin for a CSS shape created using `shape-outside`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |     Safari     | Edge | IE  |
    * | :----: | :-----: | :------------: | :--: | :-: |
    * | **37** | **62**  | **10.1** _-x-_ | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-margin
    */
  var `shape-margin`: js.UndefOr[ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]] = js.undefined
  /**
    * The **`shape-outside`** CSS property defines a shape—which may be non\-rectangular—around which adjacent inline content should wrap. By default, inline content wraps around its margin box; `shape-outside` provides a way to customize this wrapping, making it possible to wrap text around complex objects rather than simple boxes.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **37** | **62**  | **10.1** | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-outside
    */
  var `shape-outside`: js.UndefOr[ShapeOutsideProperty | js.Array[ShapeOutsideProperty]] = js.undefined
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Initial value**: `8`
    *
    * | Chrome |   Firefox   | Safari  | Edge | IE  |
    * | :----: | :---------: | :-----: | :--: | :-: |
    * | **21** | **4** _-x-_ | **6.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/tab-size
    */
  var `tab-size`: js.UndefOr[TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]] = js.undefined
  /**
    * The **`table-layout`** CSS property specifies the algorithm used to lay out `<table>` cells, rows, and columns.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **14** |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/table-layout
    */
  var `table-layout`: js.UndefOr[TableLayoutProperty | js.Array[TableLayoutProperty]] = js.undefined
  /**
    * The **`text-align`** CSS property specifies the horizontal alignment of an inline or table\-cell box.This means it works like `vertical-align` but in the horizontal direction.
    *
    * **Initial value**: `start`, or a nameless value that acts as `left` if _direction_ is `ltr`, `right` if _direction_ is `rtl` if `start` is not supported by the browser.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align
    */
  var `text-align`: js.UndefOr[TextAlignProperty | js.Array[TextAlignProperty]] = js.undefined
  /**
    * The **`text-align-last`** CSS property describes how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **47** | **49**  |   No   | **12** | Yes |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align-last
    */
  var `text-align-last`: js.UndefOr[TextAlignLastProperty | js.Array[TextAlignLastProperty]] = js.undefined
  /**
    * The **`text-combine-upright`** CSS property specifies the combination of multiple characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |                   IE                   |
    * | :----: | :-----: | :----: | :----: | :------------------------------------: |
    * | **48** | **48**  |  Yes   | **15** | **11** _(-ms-text-combine-horizontal)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-combine-upright
    */
  var `text-combine-upright`: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.undefined
  /**
    * The **`text-decoration-color`** CSS property sets the color of the decorative additions to text that are specified by `text-decoration-line`; these include underlines and overlines, strikethroughs, and wavy lines like those typically used to indicate content is misspelled (for example). The specified color applies to all such decorative lines in the scope of the property's value.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **36**  |  Yes   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-color
    */
  var `text-decoration-color`: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.undefined
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **36**  |  Yes   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-line
    */
  var `text-decoration-line`: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.undefined
  /**
    * The **`text-decoration-skip`** CSS property specifies what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
    *
    * **Initial value**: `objects`
    *
    * | Chrome | Firefox |   Safari    | Edge | IE  |
    * | :----: | :-----: | :---------: | :--: | :-: |
    * | 57-64  |   No    | **8** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip
    */
  var `text-decoration-skip`: js.UndefOr[TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]] = js.undefined
  /**
    * The **`text-decoration-skip-ink`** CSS property specifies how overlines and underlines are drawn when they pass over glyph ascenders and descenders.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **64** |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip-ink
    */
  var `text-decoration-skip-ink`: js.UndefOr[TextDecorationSkipInkProperty | js.Array[TextDecorationSkipInkProperty]] = js.undefined
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are specified; there is no way to define different styles for each of the lines defined by `text-decoration-line`.
    *
    * **Initial value**: `solid`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **57** | **36**  |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-style
    */
  var `text-decoration-style`: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.undefined
  /**
    * The **`text-emphasis-color`** CSS property defines the color used to draw emphasis marks on text being rendered in the HTML document. This value can also be set and reset using the `text-emphasis` shorthand.
    *
    * **Initial value**: `currentcolor`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-color
    */
  var `text-emphasis-color`: js.UndefOr[TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]] = js.undefined
  /**
    * The **`text-emphasis-position`** CSS property describes where emphasis marks are drawn at. The effect of emphasis marks on the line height is the same as for ruby text: if there isn't enough place, the line height is increased.
    *
    * **Initial value**: `over right`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-position
    */
  var `text-emphasis-position`: js.UndefOr[csstypeLib.GlobalsString | js.Array[csstypeLib.GlobalsString]] = js.undefined
  /**
    * The **`text-emphasis-style`** CSS property defines the type of emphasis used. It can also be set, and reset, using the `text-emphasis` shorthand.
    *
    * **Initial value**: `none`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-style
    */
  var `text-emphasis-style`: js.UndefOr[TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]] = js.undefined
  /**
    * The **`text-indent`** CSS property specifies the amount of indentation (empty space) that is put before lines of text in a block. By default, this controls the indentation of only the first formatted line of the block, but the `hanging` and `each-line` keywords can be used to change this behavior.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-indent
    */
  var `text-indent`: js.UndefOr[TextIndentProperty[TLength] | js.Array[TextIndentProperty[TLength]]] = js.undefined
  /**
    * The **`text-justify`** CSS property defines what type of justification should be applied to text when it is justified (i.e., when `text-align``: justify;` is set on it).
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * |  n/a   | **55**  |   No   | **14** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-justify
    */
  var `text-justify`: js.UndefOr[TextJustifyProperty | js.Array[TextJustifyProperty]] = js.undefined
  /**
    * The **`text-orientation`** CSS property defines the orientation of the text characters in a line. This property only has an effect in vertical mode, that is, when `writing-mode` is not `horizontal-tb`. It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
    *
    * **Initial value**: `mixed`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **48** | **41**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-orientation
    */
  var `text-orientation`: js.UndefOr[TextOrientationProperty | js.Array[TextOrientationProperty]] = js.undefined
  /**
    * The **`text-overflow`** CSS property determines how overflowed content that is not displayed is signaled to users. It can be clipped, display an ellipsis ('`…`', `U+2026 Horizontal Ellipsis`), or display a custom string.
    *
    * **Initial value**: `clip`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **7**  | **1.3** | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-overflow
    */
  var `text-overflow`: js.UndefOr[TextOverflowProperty | js.Array[TextOverflowProperty]] = js.undefined
  /**
    * The **`text-rendering`** CSS property provides information to the rendering engine about what to optimize for when rendering text.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **4**  |  **3**  | **5**  | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-rendering
    */
  var `text-rendering`: js.UndefOr[TextRenderingProperty | js.Array[TextRenderingProperty]] = js.undefined
  /**
    * The **`text-shadow`** CSS property adds shadows to text. It accepts a comma\-separated list of shadows to be applied to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from the element, blur radius, and color.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **2**  | **3.5** | **1.1** | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-shadow
    */
  var `text-shadow`: js.UndefOr[TextShadowProperty | js.Array[TextShadowProperty]] = js.undefined
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    *
    * | Chrome | Firefox | Safari |     Edge     | IE  |
    * | :----: | :-----: | :----: | :----------: | :-: |
    * | **54** |   No    |   No   | **12** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-size-adjust
    */
  var `text-size-adjust`: js.UndefOr[TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]] = js.undefined
  /**
    * The **`text-transform`** CSS property specifies how to capitalize an element's text. It can be used to make text appear in all\-uppercase or all\-lowercase, or with each word capitalized.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-transform
    */
  var `text-transform`: js.UndefOr[TextTransformProperty | js.Array[TextTransformProperty]] = js.undefined
  /**
    * The **`text-underline-position`** CSS property specifies the position of the underline which is set using the `text-decoration` property's `underline` value.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **33** |   No    |   No   | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-underline-position
    */
  var `text-underline-position`: js.UndefOr[TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]] = js.undefined
  /**
    * The **`top`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non\-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/top
    */
  var top: js.UndefOr[TopProperty[TLength] | js.Array[TopProperty[TLength]]] = js.undefined
  /**
    * The **`touch-action`** CSS property specifies whether, and in what ways, a given region can be manipulated by the user via a touchscreen (for instance, by panning or zooming features built into the browser).
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |    IE    |
    * | :----: | :-----: | :----: | :----: | :------: |
    * | **36** | **52**  |   No   | **12** |  **11**  |
    * |        |         |        |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/touch-action
    */
  var `touch-action`: js.UndefOr[TouchActionProperty | js.Array[TouchActionProperty]] = js.undefined
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate a given element. This is achieved by modifying the coordinate space of the CSS visual formatting model.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari   |     Edge     |   IE    |
    * | :----: | :-----: | :-------: | :----------: | :-----: |
    * | **36** | **16**  |   **9**   | **12** _-x-_ | **10**  |
    * |        |         | 3.1 _-x-_ |              | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform
    */
  var transform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.undefined
  /**
    * The **`transform-box`** CSS property defines the layout box to which the `transform` and `transform-origin` properties relate.
    *
    * **Initial value**: `border-box `
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **64** | **55**  |  n/a   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-box
    */
  var `transform-box`: js.UndefOr[TransformBoxProperty | js.Array[TransformBoxProperty]] = js.undefined
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Initial value**: `50% 50% 0`
    *
    * | Chrome |  Firefox  |    Safari     |  Edge  |   IE    |
    * | :----: | :-------: | :-----------: | :----: | :-----: |
    * |  Yes   |  **16**   | **3.1** _-x-_ | **12** | **10**  |
    * |        | 3.5 _-x-_ |               |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-origin
    */
  var `transform-origin`: js.UndefOr[TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]] = js.undefined
  /**
    * The **`transform-style`** CSS property determines if the children of an element are positioned in the 3D\-space or are flattened in the plane of the element.
    *
    * **Initial value**: `flat`
    *
    * |    Chrome    | Firefox  | Safari |  Edge  | IE  |
    * | :----------: | :------: | :----: | :----: | :-: |
    * | **12** _-x-_ |  **16**  |  Yes   | **12** | No  |
    * |              | 10 _-x-_ |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-style
    */
  var `transform-style`: js.UndefOr[TransformStyleProperty | js.Array[TransformStyleProperty]] = js.undefined
  /**
    * The **`transition-delay`** CSS property specifies the amount of time to wait before starting a property's transition effect when its value changes.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :-----: | :-----: | :---------: | :----: | :----: |
    * | **26**  | **16**  | **3** _-x-_ | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-delay
    */
  var `transition-delay`: js.UndefOr[csstypeLib.GlobalsString | js.Array[csstypeLib.GlobalsString]] = js.undefined
  /**
    * The **`transition-duration`** CSS property specifies the number of seconds or milliseconds a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :-----: | :-----: | :---------: | :----: | :----: |
    * | **26**  | **16**  | **3** _-x-_ | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-duration
    */
  var `transition-duration`: js.UndefOr[csstypeLib.GlobalsString | js.Array[csstypeLib.GlobalsString]] = js.undefined
  /**
    * The **`transition-property`** CSS property specifies the CSS properties to which a transition effect should be applied.
    *
    * **Initial value**: all
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **26** | **16**  |  Yes   | **12** | **10** |
    * |        | 4 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-property
    */
  var `transition-property`: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.undefined
  /**
    * The **`transition-timing-function`** CSS property is used to describe how the intermediate values of the CSS properties being affected by a transition effect are calculated.
    *
    * **Initial value**: `ease`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **26** | **16**  |  Yes   | **12** | **10** |
    * |        | 4 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-timing-function
    */
  var `transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.undefined
  /**
    * The **`translate`** CSS property allows you to specify translation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/translate
    */
  var translate: js.UndefOr[TranslateProperty[TLength] | js.Array[TranslateProperty[TLength]]] = js.undefined
  /**
    * The **`unicode-bidi`** CSS property, together with the `direction` property, determines how bidirectional text in a document is handled. For example, if a block of content contains both left\-to\-right and right\-to\-left text, the user\-agent uses a complex Unicode algorithm to decide how to display the text. The `unicode-bidi` property overrides this algorithm and allows the developer to control the text embedding.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **2**  |  **1**  | **1.3** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/unicode-bidi
    */
  var `unicode-bidi`: js.UndefOr[UnicodeBidiProperty | js.Array[UnicodeBidiProperty]] = js.undefined
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `auto`
    *
    * | Chrome  |   Firefox    |    Safari     |     Edge     |   IE   |
    * | :-----: | :----------: | :-----------: | :----------: | :----: |
    * | **54**  | **49** _-x-_ | **3.1** _-x-_ | **12** _-x-_ | **10** |
    * | 6 _-x-_ |              |               |              |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/user-select
    */
  var `user-select`: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.undefined
  /**
    * The **`vertical-align`** CSS property specifies the vertical alignment of an inline or table\-cell box.
    *
    * **Initial value**: `baseline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/vertical-align
    */
  var `vertical-align`: js.UndefOr[VerticalAlignProperty[TLength] | js.Array[VerticalAlignProperty[TLength]]] = js.undefined
  /**
    * The **`visibility`** CSS property can show or hide an element without affecting the layout of a document (i.e., space is created for elements regardless of whether they are visible or not). The property can also hide rows or columns in a `<table>`.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/visibility
    */
  var visibility: js.UndefOr[VisibilityProperty | js.Array[VisibilityProperty]] = js.undefined
  /**
    * The **`white-space`** CSS property determines how white space inside an element is handled.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/white-space
    */
  var `white-space`: js.UndefOr[WhiteSpaceProperty | js.Array[WhiteSpaceProperty]] = js.undefined
  /**
    * The **`widows`** CSS property specifies the minimum number of lines in a block container that must be shown at the _top_ of a page, region, or column. This property is normally used to control how breaks occur.
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **25** |   No    |   No   | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/widows
    */
  var widows: js.UndefOr[csstypeLib.GlobalsNumber | js.Array[csstypeLib.GlobalsNumber]] = js.undefined
  /**
    * The **`width`** CSS property specifies the width of an element. By default, the property defines the width of the content area. If `box-sizing` is set to `border-box`, however, it instead determines the width of the border area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * |  Yes   |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/width
    */
  var width: js.UndefOr[WidthProperty[TLength] | js.Array[WidthProperty[TLength]]] = js.undefined
  /**
    * The **`will-change`** CSS property provides a way for authors to hint browsers about the kind of changes to be expected on an element, so that the browser can set up appropriate optimizations ahead of time before the element is actually changed. These kinds of optimizations can increase the responsiveness of a page by doing potentially expensive work ahead of time before they are actually required.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **36** | **36**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/will-change
    */
  var `will-change`: js.UndefOr[WillChangeProperty | js.Array[WillChangeProperty]] = js.undefined
  /**
    * The **`word-break`** CSS property specifies whether or not the browser should insert line breaks wherever the text would otherwise overflow its content box.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **15**  |  Yes   | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-break
    */
  var `word-break`: js.UndefOr[WordBreakProperty | js.Array[WordBreakProperty]] = js.undefined
  /**
    * The **`word-spacing`** CSS property specifies the spacing behavior between tags and words.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-spacing
    */
  var `word-spacing`: js.UndefOr[WordSpacingProperty[TLength] | js.Array[WordSpacingProperty[TLength]]] = js.undefined
  /**
    * The `**overflow-wrap**` CSS property specifies whether or not the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **3.5** | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var `word-wrap`: js.UndefOr[WordWrapProperty | js.Array[WordWrapProperty]] = js.undefined
  /**
    * The **`writing-mode`** CSS property defines whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Initial value**: `horizontal-tb`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  |     IE      |
    * | :---------: | :-----: | :-----------: | :----: | :---------: |
    * | **8** _-x-_ | **41**  | **5.1** _-x-_ | **12** | **9** _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/writing-mode
    */
  var `writing-mode`: js.UndefOr[WritingModeProperty | js.Array[WritingModeProperty]] = js.undefined
  /**
    * The **`z-index`** CSS property specifies the z\-order of a positioned element and its descendants or flex items (children of an element with `display: flex`). When elements overlap, z\-order determines which one covers the other. An element with a larger z\-index generally covers an element with a lower one.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/z-index
    */
  var `z-index`: js.UndefOr[ZIndexProperty | js.Array[ZIndexProperty]] = js.undefined
  /**
    * The non\-standard **`zoom`** CSS property can be used to control the magnification level of an element. `transform: scale()` should be used instead of this property, if possible. However, unlike CSS Transforms, `zoom` affects the layout size of the element.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * |  Yes   |   No    | **4**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/zoom
    */
  var zoom: js.UndefOr[ZoomProperty | js.Array[ZoomProperty]] = js.undefined
}

