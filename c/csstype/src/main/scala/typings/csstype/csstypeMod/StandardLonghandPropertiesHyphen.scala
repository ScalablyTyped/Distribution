package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardLonghandPropertiesHyphen[TLength] extends js.Object {
  /**
    * The CSS **`align-content`** property sets how the browser distributes space between and around content items along the cross-axis of a flexbox container, and the main-axis of a grid container.
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
  var `align-content`: js.UndefOr[AlignContentProperty] = js.undefined
  /**
    * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align-self property sets the alignment of an item within its containing block. In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment of items on the Block Axis within their grid area.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **52**  | **20**  |  **9**  | **12** | **11** |
    * | 21 _-x-_ |         | 7 _-x-_ |        |        |
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
    * @see https://developer.mozilla.org/docs/Web/CSS/align-items
    */
  var `align-items`: js.UndefOr[AlignItemsProperty] = js.undefined
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox | Safari |  Edge  |   IE   |
    * | :------: | :-----: | :----: | :----: | :----: |
    * |  **36**  | **20**  | **9**  | **12** | **11** |
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
  var `align-self`: js.UndefOr[AlignSelfProperty] = js.undefined
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-delay
    */
  var `animation-delay`: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Initial value**: `normal`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-direction
    */
  var `animation-direction`: js.UndefOr[AnimationDirectionProperty] = js.undefined
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-duration
    */
  var `animation-duration`: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 5 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-fill-mode
    */
  var `animation-fill-mode`: js.UndefOr[AnimationFillModeProperty] = js.undefined
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Initial value**: `1`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-iteration-count
    */
  var `animation-iteration-count`: js.UndefOr[AnimationIterationCountProperty] = js.undefined
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-name
    */
  var `animation-name`: js.UndefOr[AnimationNameProperty] = js.undefined
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Initial value**: `running`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-play-state
    */
  var `animation-play-state`: js.UndefOr[AnimationPlayStateProperty] = js.undefined
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Initial value**: `ease`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **43**  | **16**  |  **9**  | **12** | **10** |
    * | 3 _-x-_ | 5 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/animation-timing-function
    */
  var `animation-timing-function`: js.UndefOr[AnimationTimingFunctionProperty] = js.undefined
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Initial value**: `auto`
    *
    * |   Chrome    |   Firefox   |   Safari    |     Edge     | IE  |
    * | :---------: | :---------: | :---------: | :----------: | :-: |
    * | **1** _-x-_ | **1** _-x-_ | **3** _-x-_ | **12** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/appearance
    */
  var appearance: js.UndefOr[AppearanceProperty] = js.undefined
  /**
    * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  | IE  |
    * | :----: | :-----: | :---------: | :----: | :-: |
    * | **76** |   No    | **9** _-x-_ | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backdrop-filter
    */
  var `backdrop-filter`: js.UndefOr[BackdropFilterProperty] = js.undefined
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Initial value**: `visible`
    *
    * |  Chrome  | Firefox  | Safari |  Edge  |   IE   |
    * | :------: | :------: | :----: | :----: | :----: |
    * |  **36**  |  **16**  |  Yes   | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ |        |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backface-visibility
    */
  var `backface-visibility`: js.UndefOr[BackfaceVisibilityProperty] = js.undefined
  /**
    * The **`background-attachment`** CSS property sets whether a background image's position is fixed within the viewport, or scrolls with its containing block.
    *
    * **Initial value**: `scroll`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-attachment
    */
  var `background-attachment`: js.UndefOr[BackgroundAttachmentProperty] = js.undefined
  /**
    * The **`background-blend-mode`** CSS property sets how an element's background images should blend with each other and with the element's background color.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **35** | **30**  | **8**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-blend-mode
    */
  var `background-blend-mode`: js.UndefOr[BackgroundBlendModeProperty] = js.undefined
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |  IE   |
    * | :----: | :-----: | :---------: | :----: | :---: |
    * | **1**  |  **4**  | **3** _-x-_ | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-clip
    */
  var `background-clip`: js.UndefOr[BackgroundClipProperty] = js.undefined
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
  var `background-color`: js.UndefOr[BackgroundColorProperty] = js.undefined
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
  var `background-image`: js.UndefOr[BackgroundImageProperty] = js.undefined
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **4**  | **3**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-origin
    */
  var `background-origin`: js.UndefOr[BackgroundOriginProperty] = js.undefined
  /**
    * The **`background-position`** CSS property sets the initial position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Initial value**: `0% 0%`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position
    */
  var `background-position`: js.UndefOr[BackgroundPositionProperty[TLength]] = js.undefined
  /**
    * The **`background-position-x`** CSS property sets the initial horizontal position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Initial value**: `left`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **49**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-x
    */
  var `background-position-x`: js.UndefOr[BackgroundPositionXProperty[TLength]] = js.undefined
  /**
    * The **`background-position-y`** CSS property sets the initial vertical position, relative to the background position layer defined by `background-origin`, for each defined background image.
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **49**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-y
    */
  var `background-position-y`: js.UndefOr[BackgroundPositionYProperty[TLength]] = js.undefined
  /**
    * The **`background-repeat`** CSS property sets how background images are repeated. A background image can be repeated along the horizontal and vertical axes, or not repeated at all.
    *
    * **Initial value**: `repeat`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-repeat
    */
  var `background-repeat`: js.UndefOr[BackgroundRepeatProperty] = js.undefined
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
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
  var `background-size`: js.UndefOr[BackgroundSizeProperty[TLength]] = js.undefined
  /** **Initial value**: `clip` */
  var `block-overflow`: js.UndefOr[BlockOverflowProperty] = js.undefined
  /**
    * The **`block-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/block-size
    */
  var `block-size`: js.UndefOr[BlockSizeProperty[TLength]] = js.undefined
  /**
    * The **`border-block-color`** CSS property defines the color of the logical block borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-color
    */
  var `border-block-color`: js.UndefOr[BorderBlockColorProperty] = js.undefined
  /**
    * The **`border-block-end-color`** CSS property defines the color of the logical block-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-color
    */
  var `border-block-end-color`: js.UndefOr[BorderBlockEndColorProperty] = js.undefined
  /**
    * The **`border-block-end-style`** CSS property defines the style of the logical block end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-style
    */
  var `border-block-end-style`: js.UndefOr[BorderBlockEndStyleProperty] = js.undefined
  /**
    * The **`border-block-end-width`** CSS property defines the width of the logical block-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-width
    */
  var `border-block-end-width`: js.UndefOr[BorderBlockEndWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-block-start-color`** CSS property defines the color of the logical block-start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-color
    */
  var `border-block-start-color`: js.UndefOr[BorderBlockStartColorProperty] = js.undefined
  /**
    * The **`border-block-start-style`** CSS property defines the style of the logical block start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-style
    */
  var `border-block-start-style`: js.UndefOr[BorderBlockStartStyleProperty] = js.undefined
  /**
    * The **`border-block-start-width`** CSS property defines the width of the logical block-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-width
    */
  var `border-block-start-width`: js.UndefOr[BorderBlockStartWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-block-style`** CSS property defines the style of the logical block borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-style
    */
  var `border-block-style`: js.UndefOr[BorderBlockStyleProperty] = js.undefined
  /**
    * The **`border-block-width`** CSS property defines the width of the logical block borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-width
    */
  var `border-block-width`: js.UndefOr[BorderBlockWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-bottom-color`** CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties `border-color` or `border-bottom`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-color
    */
  var `border-bottom-color`: js.UndefOr[BorderBottomColorProperty] = js.undefined
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
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
  var `border-bottom-left-radius`: js.UndefOr[BorderBottomLeftRadiusProperty[TLength]] = js.undefined
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
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
  var `border-bottom-right-radius`: js.UndefOr[BorderBottomRightRadiusProperty[TLength]] = js.undefined
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
  var `border-bottom-style`: js.UndefOr[BorderBottomStyleProperty] = js.undefined
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
  var `border-bottom-width`: js.UndefOr[BorderBottomWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-collapse`** CSS property sets whether cells inside a `<table>` have shared or separate borders.
    *
    * **Initial value**: `separate`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-collapse
    */
  var `border-collapse`: js.UndefOr[BorderCollapseProperty] = js.undefined
  /**
    * The **`border-end-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-end-radius
    */
  var `border-end-end-radius`: js.UndefOr[BorderEndEndRadiusProperty[TLength]] = js.undefined
  /**
    * The **`border-end-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-start-radius
    */
  var `border-end-start-radius`: js.UndefOr[BorderEndStartRadiusProperty[TLength]] = js.undefined
  /**
    * The **`border-image-outset`** CSS property sets the distance by which an element's border image is set out from its border box.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-outset
    */
  var `border-image-outset`: js.UndefOr[BorderImageOutsetProperty[TLength]] = js.undefined
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
  var `border-image-repeat`: js.UndefOr[BorderImageRepeatProperty] = js.undefined
  /**
    * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
    *
    * **Initial value**: `100%`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-slice
    */
  var `border-image-slice`: js.UndefOr[BorderImageSliceProperty] = js.undefined
  /**
    * The **`border-image-source`** CSS property sets the source image used to create an element's border image.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-source
    */
  var `border-image-source`: js.UndefOr[BorderImageSourceProperty] = js.undefined
  /**
    * The **`border-image-width`** CSS property sets the width of an element's border image.
    *
    * **Initial value**: `1`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **13**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-width
    */
  var `border-image-width`: js.UndefOr[BorderImageWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-inline-color`** CSS property defines the color of the logical inline borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-color
    */
  var `border-inline-color`: js.UndefOr[BorderInlineColorProperty] = js.undefined
  /**
    * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |           Firefox           |  Safari  | Edge | IE  |
    * | :----: | :-------------------------: | :------: | :--: | :-: |
    * | **69** |           **41**            | **12.1** |  No  | No  |
    * |        | 3 _(-moz-border-end-color)_ |          |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-color
    */
  var `border-inline-end-color`: js.UndefOr[BorderInlineEndColorProperty] = js.undefined
  /**
    * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome |           Firefox           |  Safari  | Edge | IE  |
    * | :----: | :-------------------------: | :------: | :--: | :-: |
    * | **69** |           **41**            | **12.1** |  No  | No  |
    * |        | 3 _(-moz-border-end-style)_ |          |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-style
    */
  var `border-inline-end-style`: js.UndefOr[BorderInlineEndStyleProperty] = js.undefined
  /**
    * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome |           Firefox           |  Safari  | Edge | IE  |
    * | :----: | :-------------------------: | :------: | :--: | :-: |
    * | **69** |           **41**            | **12.1** |  No  | No  |
    * |        | 3 _(-moz-border-end-width)_ |          |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-width
    */
  var `border-inline-end-width`: js.UndefOr[BorderInlineEndWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |            Firefox            |  Safari  | Edge | IE  |
    * | :----: | :---------------------------: | :------: | :--: | :-: |
    * | **69** |            **41**             | **12.1** |  No  | No  |
    * |        | 3 _(-moz-border-start-color)_ |          |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-color
    */
  var `border-inline-start-color`: js.UndefOr[BorderInlineStartColorProperty] = js.undefined
  /**
    * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome |            Firefox            |  Safari  | Edge | IE  |
    * | :----: | :---------------------------: | :------: | :--: | :-: |
    * | **69** |            **41**             | **12.1** |  No  | No  |
    * |        | 3 _(-moz-border-start-style)_ |          |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-style
    */
  var `border-inline-start-style`: js.UndefOr[BorderInlineStartStyleProperty] = js.undefined
  /**
    * The **`border-inline-start-width`** CSS property defines the width of the logical inline-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-width
    */
  var `border-inline-start-width`: js.UndefOr[BorderInlineStartWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-inline-style`** CSS property defines the style of the logical inline borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-style
    */
  var `border-inline-style`: js.UndefOr[BorderInlineStyleProperty] = js.undefined
  /**
    * The **`border-inline-width`** CSS property defines the width of the logical inline borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-width
    */
  var `border-inline-width`: js.UndefOr[BorderInlineWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-left-color`** CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties `border-color` or `border-left`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-color
    */
  var `border-left-color`: js.UndefOr[BorderLeftColorProperty] = js.undefined
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
  var `border-left-style`: js.UndefOr[BorderLeftStyleProperty] = js.undefined
  /**
    * The **`border-left-width`** CSS property sets the width of the left border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-width
    */
  var `border-left-width`: js.UndefOr[BorderLeftWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-right-color`** CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties `border-color` or `border-right`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-color
    */
  var `border-right-color`: js.UndefOr[BorderRightColorProperty] = js.undefined
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
  var `border-right-style`: js.UndefOr[BorderRightStyleProperty] = js.undefined
  /**
    * The **`border-right-width`** CSS property sets the width of the right border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-width
    */
  var `border-right-width`: js.UndefOr[BorderRightWidthProperty[TLength]] = js.undefined
  /**
    * The **`border-spacing`** CSS property sets the distance between the borders of adjacent `<table>` cells. This property applies only when `border-collapse` is `separate`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-spacing
    */
  var `border-spacing`: js.UndefOr[BorderSpacingProperty[TLength]] = js.undefined
  /**
    * The **`border-start-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-end-radius
    */
  var `border-start-end-radius`: js.UndefOr[BorderStartEndRadiusProperty[TLength]] = js.undefined
  /**
    * The **`border-start-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-start-radius
    */
  var `border-start-start-radius`: js.UndefOr[BorderStartStartRadiusProperty[TLength]] = js.undefined
  /**
    * The **`border-top-color`** CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties `border-color` or `border-top`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-color
    */
  var `border-top-color`: js.UndefOr[BorderTopColorProperty] = js.undefined
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
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
  var `border-top-left-radius`: js.UndefOr[BorderTopLeftRadiusProperty[TLength]] = js.undefined
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
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
  var `border-top-right-radius`: js.UndefOr[BorderTopRightRadiusProperty[TLength]] = js.undefined
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
  var `border-top-style`: js.UndefOr[BorderTopStyleProperty] = js.undefined
  /**
    * The **`border-top-width`** CSS property sets the width of the top border of an element.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-width
    */
  var `border-top-width`: js.UndefOr[BorderTopWidthProperty[TLength]] = js.undefined
  /**
    * The **`bottom`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/bottom
    */
  var bottom: js.UndefOr[BottomProperty[TLength]] = js.undefined
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
  var `box-decoration-break`: js.UndefOr[BoxDecorationBreakProperty] = js.undefined
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
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
  var `box-shadow`: js.UndefOr[BoxShadowProperty] = js.undefined
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
  var `box-sizing`: js.UndefOr[BoxSizingProperty] = js.undefined
  /**
    * The **`break-after`** CSS property defines how page, column, or region breaks should behave after a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** |   No    |   No   | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-after
    */
  var `break-after`: js.UndefOr[BreakAfterProperty] = js.undefined
  /**
    * The **`break-before`** CSS property sets how page, column, or region breaks should behave before a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  |   No   | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-before
    */
  var `break-before`: js.UndefOr[BreakBeforeProperty] = js.undefined
  /**
    * The **`break-inside`** CSS property defines how page, column, or region breaks should behave inside a generated box. If there is no generated box, the property is ignored.
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in Paged Media_
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **50** | **65**  | **10** | **12** | **10** |
    *
    * ---
    *
    * _Supported in CSS Regions_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    |   No   |  No  | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/break-inside
    */
  var `break-inside`: js.UndefOr[BreakInsideProperty] = js.undefined
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
  var `caption-side`: js.UndefOr[CaptionSideProperty] = js.undefined
  /**
    * The **`caret-color`** CSS property sets the color of the insertion caret, the visible marker where the next character typed will be inserted. The caret appears in elements such as `<input>` or those with the `contenteditable` attribute. The caret is typically a thin vertical line that flashes to help make it more noticeable. By default, it is black, but its color can be altered with this property.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **53**  | **11.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caret-color
    */
  var `caret-color`: js.UndefOr[CaretColorProperty] = js.undefined
  /**
    * The **`clear`** CSS property sets whether an element must be moved below (cleared) floating elements that precede it. The `clear` property applies to floating and non-floating elements.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clear
    */
  var clear: js.UndefOr[ClearProperty] = js.undefined
  /**
    * The `**clip-path**` CSS property creates a clipping region that sets what part of an element should be shown. Parts that are inside the region are shown, while those outside are hidden.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox |   Safari    |  Edge  |   IE   |
    * | :------: | :-----: | :---------: | :----: | :----: |
    * |  **55**  | **3.5** | **7** _-x-_ | **12** | **10** |
    * | 24 _-x-_ |         |             |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clip-path
    */
  var `clip-path`: js.UndefOr[ClipPathProperty] = js.undefined
  /**
    * The **`color`** CSS property sets the foreground color value of an element's text and text decorations, and sets the `currentcolor` value. `currentcolor` may be used as an indirect value on _other_ properties and is the default for other color properties, such as `border-color`.
    *
    * **Initial value**: Varies from one browser to another
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  |  Yes   | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color
    */
  var color: js.UndefOr[ColorProperty] = js.undefined
  /**
    * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
    *
    * **Initial value**: `economy`
    *
    * |    Chrome    | Firefox |   Safari    | Edge | IE  |
    * | :----------: | :-----: | :---------: | :--: | :-: |
    * | **49** _-x-_ | **48**  | **6** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color-adjust
    */
  var `color-adjust`: js.UndefOr[ColorAdjustProperty] = js.undefined
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Initial value**: `auto`
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **52**   |  **9**  | **12** | **10** |
    * |        | 1.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-count
    */
  var `column-count`: js.UndefOr[ColumnCountProperty] = js.undefined
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Initial value**: `balance`
    *
    * | Chrome | Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :------: | :-----: | :----: | :----: |
    * | **50** |  **52**  |  **9**  | **12** | **10** |
    * |        | 13 _-x-_ | 8 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-fill
    */
  var `column-fill`: js.UndefOr[ColumnFillProperty] = js.undefined
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox |   Safari    | Edge | IE  |
    * | :----: | :-----: | :---------: | :--: | :-: |
    * |   No   | **63**  | **3** _-x-_ |  No  | No  |
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
  var `column-gap`: js.UndefOr[ColumnGapProperty[TLength]] = js.undefined
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **52**   |  **9**  | **12** | **10** |
    * |        | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-color
    */
  var `column-rule-color`: js.UndefOr[ColumnRuleColorProperty] = js.undefined
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Initial value**: `none`
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **52**   |  **9**  | **12** | **10** |
    * |        | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-style
    */
  var `column-rule-style`: js.UndefOr[ColumnRuleStyleProperty] = js.undefined
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Initial value**: `medium`
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **50**   |  **9**  | **12** | **10** |
    * |        | 3.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-width
    */
  var `column-rule-width`: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.undefined
  /**
    * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **50**  |   n/a   |   **9**   | **12** | **10** |
    * | 6 _-x-_ |         | 5.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-span
    */
  var `column-span`: js.UndefOr[ColumnSpanProperty] = js.undefined
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Initial value**: `auto`
    *
    * | Chrome |  Firefox  | Safari  |  Edge  |   IE   |
    * | :----: | :-------: | :-----: | :----: | :----: |
    * | **50** |  **50**   |  **9**  | **12** | **10** |
    * |        | 1.5 _-x-_ | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-width
    */
  var `column-width`: js.UndefOr[ColumnWidthProperty[TLength]] = js.undefined
  /**
    * The **`contain`** CSS property allows an author to indicate that an element and its contents are, as much as possible, _independent_ of the rest of the document tree. This allows the browser to recalculate layout, style, paint, size, or any combination of them for a limited area of the DOM and not the entire page.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **52** |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/contain
    */
  var contain: js.UndefOr[ContainProperty] = js.undefined
  /**
    * The **`content`** CSS property replaces an element with a generated value. Objects inserted using the `content` property are _anonymous replaced elements._
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/content
    */
  var content: js.UndefOr[ContentProperty] = js.undefined
  /**
    * The **`counter-increment`** CSS property increases or decreases the value of a CSS counter by a given value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **3**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-increment
    */
  var `counter-increment`: js.UndefOr[CounterIncrementProperty] = js.undefined
  /**
    * The **`counter-reset`** CSS property resets a CSS counter to a given value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **3**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-reset
    */
  var `counter-reset`: js.UndefOr[CounterResetProperty] = js.undefined
  /**
    * The **`counter-set`** CSS property sets a CSS counter to a given value. It manipulates the value of existing counters, and will only create new counters if there isn't already a counter of the given name on the element.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **68**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-set
    */
  var `counter-set`: js.UndefOr[CounterSetProperty] = js.undefined
  /**
    * The **`cursor`** CSS property sets mouse cursor to display when the mouse pointer is over an element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/cursor
    */
  var cursor: js.UndefOr[CursorProperty] = js.undefined
  /**
    * The **`direction`** CSS property sets the direction of text, table columns, and horizontal overflow. Use `rtl` for languages written from right to left (like Hebrew or Arabic), and `ltr` for those written from left to right (like English and most other languages).
    *
    * **Initial value**: `ltr`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **2**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/direction
    */
  var direction: js.UndefOr[DirectionProperty] = js.undefined
  /**
    * The **`display`** CSS property defines the _display type_ of an element, which consists of the two basic qualities of how an element generates boxes — the **outer display type** defining how the box participates in flow layout, and the **inner display type** defining how the children of the box are laid out.
    *
    * **Initial value**: `inline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/display
    */
  var display: js.UndefOr[DisplayProperty] = js.undefined
  /**
    * The **`empty-cells`** CSS property sets whether borders and backgrounds appear around `<table>` cells that have no visible content.
    *
    * **Initial value**: `show`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/empty-cells
    */
  var `empty-cells`: js.UndefOr[EmptyCellsProperty] = js.undefined
  /**
    * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  | IE  |
    * | :------: | :-----: | :-----: | :----: | :-: |
    * |  **53**  | **35**  | **9.1** | **12** | No  |
    * | 18 _-x-_ |         | 6 _-x-_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/filter
    */
  var filter: js.UndefOr[FilterProperty] = js.undefined
  /**
    * The **`flex-basis`** CSS property sets the initial main size of a flex item. It sets the size of the content box unless otherwise set with `box-sizing`.
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
  var `flex-basis`: js.UndefOr[FlexBasisProperty[TLength]] = js.undefined
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
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
  var `flex-direction`: js.UndefOr[FlexDirectionProperty] = js.undefined
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Initial value**: `0`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |            IE            |
    * | :------: | :-----: | :-------: | :----: | :----------------------: |
    * |  **29**  | **20**  |   **9**   | **12** |          **11**          |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        | 10 _(-ms-flex-positive)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-grow
    */
  var `flex-grow`: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
    *
    * **Initial value**: `1`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **29**  | **20**  |  **9**  | **12** | **10** |
    * | 21 _-x-_ |         | 8 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-shrink
    */
  var `flex-shrink`: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
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
  var `flex-wrap`: js.UndefOr[FlexWrapProperty] = js.undefined
  /**
    * The **`float`** CSS property places an element on the left or right side of its container, allowing text and inline elements to wrap around it. The element is removed from the normal flow of the page, though still remaining a part of the flow (in contrast to absolute positioning).
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/float
    */
  var float: js.UndefOr[FloatProperty] = js.undefined
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
  var `font-family`: js.UndefOr[FontFamilyProperty] = js.undefined
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
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
  var `font-feature-settings`: js.UndefOr[FontFeatureSettingsProperty] = js.undefined
  /**
    * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
    *
    * **Initial value**: `auto`
    *
    * |    Chrome    | Firefox | Safari | Edge | IE  |
    * | :----------: | :-----: | :----: | :--: | :-: |
    * | **32** _-x-_ | **32**  | **7**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-kerning
    */
  var `font-kerning`: js.UndefOr[FontKerningProperty] = js.undefined
  /**
    * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
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
  var `font-language-override`: js.UndefOr[FontLanguageOverrideProperty] = js.undefined
  /**
    * The **`font-optical-sizing`** CSS property sets whether text rendering is optimized for viewing at different sizes. This only works for fonts that have an optical size variation axis.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * |   No   | **62**  |  n/a   | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-optical-sizing
    */
  var `font-optical-sizing`: js.UndefOr[FontOpticalSizingProperty] = js.undefined
  /**
    * The **`font-size`** CSS property sets the size of the font. This property is also used to compute the size of `em`, `ex`, and other relative `<length>` units.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size
    */
  var `font-size`: js.UndefOr[FontSizeProperty[TLength]] = js.undefined
  /**
    * The **`font-size-adjust`** CSS property sets how the font size should be chosen based on the height of lowercase rather than capital letters.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |  **1**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size-adjust
    */
  var `font-size-adjust`: js.UndefOr[FontSizeAdjustProperty] = js.undefined
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
  var `font-stretch`: js.UndefOr[FontStretchProperty] = js.undefined
  /**
    * The **`font-style`** CSS property sets whether a font should be styled with a normal, italic, or oblique face from its `font-family`.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-style
    */
  var `font-style`: js.UndefOr[FontStyleProperty] = js.undefined
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
  var `font-synthesis`: js.UndefOr[FontSynthesisProperty] = js.undefined
  /**
    * The **font-variant** CSS property is a shorthand for the longhand properties `font-variant-caps`, `font-variant-numeric`, `font-variant-alternates`, `font-variant-ligatures`, and `font-variant-east-asian`. You can also set the CSS Level 2 (Revision 1) values of `font-variant`, (that is, `normal` or `small-caps`), by using the `font` shorthand.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant
    */
  var `font-variant`: js.UndefOr[FontVariantProperty] = js.undefined
  /**
    * The **`font-variant-caps`** CSS property controls the use of alternate glyphs for capital letters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **52** | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-caps
    */
  var `font-variant-caps`: js.UndefOr[FontVariantCapsProperty] = js.undefined
  /**
    * The **`font-variant-east-asian`** CSS property controls the use of alternate glyphs for East Asian scripts, like Japanese and Chinese.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **63** | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-east-asian
    */
  var `font-variant-east-asian`: js.UndefOr[FontVariantEastAsianProperty] = js.undefined
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
  var `font-variant-ligatures`: js.UndefOr[FontVariantLigaturesProperty] = js.undefined
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
  var `font-variant-numeric`: js.UndefOr[FontVariantNumericProperty] = js.undefined
  /**
    * The **`font-variant-position`** CSS property controls the use of alternate, smaller glyphs that are positioned as superscript or subscript.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-position
    */
  var `font-variant-position`: js.UndefOr[FontVariantPositionProperty] = js.undefined
  /**
    * The **`font-variation-settings`** CSS property provides low-level control over variable font characteristics, by specifying the four letter axis names of the characteristics you want to vary, along with their values.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **62** | **62**  | **11** | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variation-settings
    */
  var `font-variation-settings`: js.UndefOr[FontVariationSettingsProperty] = js.undefined
  /**
    * The **`font-weight`** CSS property specifies the weight (or boldness) of the font. The font weights available to you will depend on the `font-family` you are using. Some fonts are only available in `normal` and `bold`.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-weight
    */
  var `font-weight`: js.UndefOr[FontWeightProperty] = js.undefined
  /**
    * The **`grid-auto-columns`** CSS property specifies the size of an implicitly-created grid column track.
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
  var `grid-auto-columns`: js.UndefOr[GridAutoColumnsProperty[TLength]] = js.undefined
  /**
    * The **`grid-auto-flow`** CSS property controls how the auto-placement algorithm works, specifying exactly how auto-placed items get flowed into the grid.
    *
    * **Initial value**: `row`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-flow
    */
  var `grid-auto-flow`: js.UndefOr[GridAutoFlowProperty] = js.undefined
  /**
    * The **`grid-auto-rows`** CSS property specifies the size of an implicitly-created grid row track.
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
  var `grid-auto-rows`: js.UndefOr[GridAutoRowsProperty[TLength]] = js.undefined
  /**
    * The **`grid-column-end`** CSS property specifies a grid item’s end position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the block-end edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-end
    */
  var `grid-column-end`: js.UndefOr[GridColumnEndProperty] = js.undefined
  /**
    * The **`grid-column-start`** CSS property specifies a grid item’s start position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement. This start position defines the block-start edge of the grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-start
    */
  var `grid-column-start`: js.UndefOr[GridColumnStartProperty] = js.undefined
  /**
    * The **`grid-row-end`** CSS property specifies a grid item’s end position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-end edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-end
    */
  var `grid-row-end`: js.UndefOr[GridRowEndProperty] = js.undefined
  /**
    * The **`grid-row-start`** CSS property specifies a grid item’s start position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start edge of its grid area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-start
    */
  var `grid-row-start`: js.UndefOr[GridRowStartProperty] = js.undefined
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
  var `grid-template-areas`: js.UndefOr[GridTemplateAreasProperty] = js.undefined
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
  var `grid-template-columns`: js.UndefOr[GridTemplateColumnsProperty[TLength]] = js.undefined
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
  var `grid-template-rows`: js.UndefOr[GridTemplateRowsProperty[TLength]] = js.undefined
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
  var `hanging-punctuation`: js.UndefOr[HangingPunctuationProperty] = js.undefined
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
  var height: js.UndefOr[HeightProperty[TLength]] = js.undefined
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
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
  var hyphens: js.UndefOr[HyphensProperty] = js.undefined
  /**
    * The **`image-orientation`** CSS property specifies a layout-independent correction to the orientation of an image. It should _not_ be used for any other orientation adjustments; instead, the `transform` property should be used with the `rotate` `<transform-function>`.
    *
    * **Initial value**: `0deg`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **26**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-orientation
    */
  var `image-orientation`: js.UndefOr[ImageOrientationProperty] = js.undefined
  /**
    * The **`image-rendering`** CSS property sets an image scaling algorithm. The property applies to an element itself, to any images set in its other properties, and to its descendants.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  Yes   | **3.6** |  Yes   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-rendering
    */
  var `image-rendering`: js.UndefOr[ImageRenderingProperty] = js.undefined
  /** **Initial value**: `1dppx` */
  var `image-resolution`: js.UndefOr[ImageResolutionProperty] = js.undefined
  /**
    * The `initial-letter` CSS property sets styling for dropped, raised, and sunken initial letters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/initial-letter
    */
  var `initial-letter`: js.UndefOr[InitialLetterProperty] = js.undefined
  /**
    * The **`inline-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inline-size
    */
  var `inline-size`: js.UndefOr[InlineSizeProperty[TLength]] = js.undefined
  /**
    * The **`inset`** CSS property defines the logical block and inline start and end offsets of an element, which map to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset
    */
  var inset: js.UndefOr[InsetProperty[TLength]] = js.undefined
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block
    */
  var `inset-block`: js.UndefOr[InsetBlockProperty[TLength]] = js.undefined
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-end
    */
  var `inset-block-end`: js.UndefOr[InsetBlockEndProperty[TLength]] = js.undefined
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-start
    */
  var `inset-block-start`: js.UndefOr[InsetBlockStartProperty[TLength]] = js.undefined
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline
    */
  var `inset-inline`: js.UndefOr[InsetInlineProperty[TLength]] = js.undefined
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-end
    */
  var `inset-inline-end`: js.UndefOr[InsetInlineEndProperty[TLength]] = js.undefined
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-start
    */
  var `inset-inline-start`: js.UndefOr[InsetInlineStartProperty[TLength]] = js.undefined
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
  var isolation: js.UndefOr[IsolationProperty] = js.undefined
  /**
    * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
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
  var `justify-content`: js.UndefOr[JustifyContentProperty] = js.undefined
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
  var `justify-items`: js.UndefOr[JustifyItemsProperty] = js.undefined
  /**
    * The CSS **`justify-self`** property set the way a box is justified inside its alignment container along the appropriate axis.
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
  var `justify-self`: js.UndefOr[JustifySelfProperty] = js.undefined
  /**
    * The **`left`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/left
    */
  var left: js.UndefOr[LeftProperty[TLength]] = js.undefined
  /**
    * The **`letter-spacing`** CSS property sets the spacing behavior between text characters.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/letter-spacing
    */
  var `letter-spacing`: js.UndefOr[LetterSpacingProperty[TLength]] = js.undefined
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox |   Safari    |  Edge  |   IE    |
    * | :-----: | :-----: | :---------: | :----: | :-----: |
    * | **58**  |   No    | **3** _-x-_ | **14** | **5.5** |
    * | 1 _-x-_ |         |             |        |         |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-break
    */
  var `line-break`: js.UndefOr[LineBreakProperty] = js.undefined
  /**
    * The **`line-height`** CSS property sets the amount of space used for lines, such as in text. On block-level elements, it specifies the minimum height of line boxes within the element. On non-replaced inline elements, it specifies the height that is used to calculate line box height.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height
    */
  var `line-height`: js.UndefOr[LineHeightProperty[TLength]] = js.undefined
  /**
    * The **`line-height-step`** CSS property sets the step unit for line box heights. When the property is set, line box heights are rounded up to the closest multiple of the unit.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height-step
    */
  var `line-height-step`: js.UndefOr[LineHeightStepProperty[TLength]] = js.undefined
  /**
    * The **`list-style-image`** CSS property sets an image to be used as the list item marker.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-image
    */
  var `list-style-image`: js.UndefOr[ListStyleImageProperty] = js.undefined
  /**
    * The **`list-style-position`** CSS property sets the position of the `::marker` relative to a list item.
    *
    * **Initial value**: `outside`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-position
    */
  var `list-style-position`: js.UndefOr[ListStylePositionProperty] = js.undefined
  /**
    * The **`list-style-type`** CSS property sets the marker (such as a disc, character, or custom counter style) of a list item element.
    *
    * **Initial value**: `disc`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-type
    */
  var `list-style-type`: js.UndefOr[ListStyleTypeProperty] = js.undefined
  /**
    * The **`margin-block`** CSS property defines the logical block start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block
    */
  var `margin-block`: js.UndefOr[MarginBlockProperty[TLength]] = js.undefined
  /**
    * The **`margin-block-end`** CSS property defines the logical block end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-end
    */
  var `margin-block-end`: js.UndefOr[MarginBlockEndProperty[TLength]] = js.undefined
  /**
    * The **`margin-block-start`** CSS property defines the logical block start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-start
    */
  var `margin-block-start`: js.UndefOr[MarginBlockStartProperty[TLength]] = js.undefined
  /**
    * The **`margin-bottom`** CSS property sets the margin area on the bottom of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var `margin-bottom`: js.UndefOr[MarginBottomProperty[TLength]] = js.undefined
  /**
    * The **`margin-inline`** CSS property defines the logical inline start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline
    */
  var `margin-inline`: js.UndefOr[MarginInlineProperty[TLength]] = js.undefined
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |          Chrome          |        Firefox        |          Safari          | Edge | IE  |
    * | :----------------------: | :-------------------: | :----------------------: | :--: | :-: |
    * |          **69**          |        **41**         |         **12.1**         |  No  | No  |
    * | 2 _(-webkit-margin-end)_ | 3 _(-moz-margin-end)_ | 3 _(-webkit-margin-end)_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-end
    */
  var `margin-inline-end`: js.UndefOr[MarginInlineEndProperty[TLength]] = js.undefined
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |           Chrome           |         Firefox         |           Safari           | Edge | IE  |
    * | :------------------------: | :---------------------: | :------------------------: | :--: | :-: |
    * |           **69**           |         **41**          |          **12.1**          |  No  | No  |
    * | 2 _(-webkit-margin-start)_ | 3 _(-moz-margin-start)_ | 3 _(-webkit-margin-start)_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-start
    */
  var `margin-inline-start`: js.UndefOr[MarginInlineStartProperty[TLength]] = js.undefined
  /**
    * The **`margin-left`** CSS property sets the margin area on the left side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    */
  var `margin-left`: js.UndefOr[MarginLeftProperty[TLength]] = js.undefined
  /**
    * The **`margin-right`** CSS property sets the margin area on the right side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var `margin-right`: js.UndefOr[MarginRightProperty[TLength]] = js.undefined
  /**
    * The **`margin-top`** CSS property sets the margin area on the top of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    */
  var `margin-top`: js.UndefOr[MarginTopProperty[TLength]] = js.undefined
  /**
    * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
    *
    * **Initial value**: `alpha`
    */
  var `mask-border-mode`: js.UndefOr[MaskBorderModeProperty] = js.undefined
  /**
    * The **`mask-border-outset`** CSS property specifies the distance by which an element's mask border is set out from its border box.
    *
    * **Initial value**: `0`
    */
  var `mask-border-outset`: js.UndefOr[MaskBorderOutsetProperty[TLength]] = js.undefined
  /**
    * The **`mask-border-repeat`** CSS property sets how the edge regions of a source image are adjusted to fit the dimensions of an element's mask border.
    *
    * **Initial value**: `stretch`
    */
  var `mask-border-repeat`: js.UndefOr[MaskBorderRepeatProperty] = js.undefined
  /**
    * The **`mask-border-slice`** CSS property divides the image set by `mask-border-source` into regions. These regions are used to form the components of an element's mask border.
    *
    * **Initial value**: `0`
    */
  var `mask-border-slice`: js.UndefOr[MaskBorderSliceProperty] = js.undefined
  /**
    * The **`mask-border-source`** CSS property sets the source image used to create an element's mask border.
    *
    * **Initial value**: `none`
    */
  var `mask-border-source`: js.UndefOr[MaskBorderSourceProperty] = js.undefined
  /**
    * The **`mask-border-width`** CSS property sets the width of an element's mask border.
    *
    * **Initial value**: `auto`
    */
  var `mask-border-width`: js.UndefOr[MaskBorderWidthProperty[TLength]] = js.undefined
  /**
    * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
    *
    * **Initial value**: `border-box`
    *
    * |   Chrome    | Firefox |   Safari    | Edge | IE  |
    * | :---------: | :-----: | :---------: | :--: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-clip
    */
  var `mask-clip`: js.UndefOr[MaskClipProperty] = js.undefined
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
  var `mask-composite`: js.UndefOr[MaskCompositeProperty] = js.undefined
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
  var `mask-image`: js.UndefOr[MaskImageProperty] = js.undefined
  /**
    * The **`mask-mode`** CSS property sets whether the mask reference defined by `mask-image` is treated as a luminance or alpha mask.
    *
    * **Initial value**: `match-source`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **53**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-mode
    */
  var `mask-mode`: js.UndefOr[MaskModeProperty] = js.undefined
  /**
    * The **`mask-origin`** CSS property sets the origin of a mask.
    *
    * **Initial value**: `border-box`
    *
    * |   Chrome    | Firefox |   Safari    | Edge | IE  |
    * | :---------: | :-----: | :---------: | :--: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-origin
    */
  var `mask-origin`: js.UndefOr[MaskOriginProperty] = js.undefined
  /**
    * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
    *
    * **Initial value**: `center`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  | IE  |
    * | :---------: | :-----: | :-----------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **3.2** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-position
    */
  var `mask-position`: js.UndefOr[MaskPositionProperty[TLength]] = js.undefined
  /**
    * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Initial value**: `no-repeat`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  | IE  |
    * | :---------: | :-----: | :-----------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **3.2** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-repeat
    */
  var `mask-repeat`: js.UndefOr[MaskRepeatProperty] = js.undefined
  /**
    * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
    *
    * **Initial value**: `auto`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **4** _-x-_ | **53**  | **4** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-size
    */
  var `mask-size`: js.UndefOr[MaskSizeProperty[TLength]] = js.undefined
  /**
    * The **`mask-type`** CSS property sets whether an SVG `<mask>` element is used as a _luminance_ or an _alpha_ mask. It applies to the `<mask>` element itself.
    *
    * **Initial value**: `luminance`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **24** | **35**  |  n/a   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-type
    */
  var `mask-type`: js.UndefOr[MaskTypeProperty] = js.undefined
  /**
    * The `**max-block-size**` CSS property specifies the maximum size of an element in the direction opposite that of the writing direction as specified by `writing-mode`. That is, if the writing direction is horizontal, then `max-block-size` is equivalent to `max-height`; if the writing direction is vertical, `max-block-size` is the same as `max-width`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-block-size
    */
  var `max-block-size`: js.UndefOr[MaxBlockSizeProperty[TLength]] = js.undefined
  /**
    * The **`max-height`** CSS property sets the maximum height of an element. It prevents the used value of the `height` property from becoming larger than the value specified for `max-height`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **18** |  **1**  | **1.3** | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-height
    */
  var `max-height`: js.UndefOr[MaxHeightProperty[TLength]] = js.undefined
  /**
    * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |   Safari   | Edge | IE  |
    * | :----: | :-----: | :--------: | :--: | :-: |
    * | **57** | **41**  |  **12.1**  |  No  | No  |
    * |        |         | 10.1 _-x-_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-inline-size
    */
  var `max-inline-size`: js.UndefOr[MaxInlineSizeProperty[TLength]] = js.undefined
  /** **Initial value**: `none` */
  var `max-lines`: js.UndefOr[MaxLinesProperty] = js.undefined
  /**
    * The **`max-width`** CSS property sets the maximum width of an element. It prevents the used value of the `width` property from becoming larger than the value specified by `max-width`.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-width
    */
  var `max-width`: js.UndefOr[MaxWidthProperty[TLength]] = js.undefined
  /**
    * The **`min-block-size`** CSS property defines the minimum horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-block-size
    */
  var `min-block-size`: js.UndefOr[MinBlockSizeProperty[TLength]] = js.undefined
  /**
    * The **`min-height`** CSS property sets the minimum height of an element. It prevents the used value of the `height` property from becoming smaller than the value specified for `min-height`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **3**  | **1.3** | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-height
    */
  var `min-height`: js.UndefOr[MinHeightProperty[TLength]] = js.undefined
  /**
    * The **`min-inline-size`** CSS property defines the horizontal or vertical minimal size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-inline-size
    */
  var `min-inline-size`: js.UndefOr[MinInlineSizeProperty[TLength]] = js.undefined
  /**
    * The **`min-width`** CSS property sets the minimum width of an element. It prevents the used value of the `width` property from becoming smaller than the value specified for `min-width`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-width
    */
  var `min-width`: js.UndefOr[MinWidthProperty[TLength]] = js.undefined
  /**
    * The **`mix-blend-mode`** CSS property sets how an element's content should blend with the content of the element's parent and the element's background.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **41** | **32**  | **8**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mix-blend-mode
    */
  var `mix-blend-mode`: js.UndefOr[MixBlendModeProperty] = js.undefined
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **55**         |   No    |   No   |  No  | No  |
    * | 46 _(motion-distance)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var `motion-distance`: js.UndefOr[OffsetDistanceProperty[TLength]] = js.undefined
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari | Edge | IE  |
    * | :----------------: | :-----: | :----: | :--: | :-: |
    * |       **55**       |   n/a   |   No   |  No  | No  |
    * | 46 _(motion-path)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var `motion-path`: js.UndefOr[OffsetPathProperty] = js.undefined
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | No  |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `motion-rotation`: js.UndefOr[OffsetRotateProperty] = js.undefined
  /**
    * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Initial value**: `fill`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-fit
    */
  var `object-fit`: js.UndefOr[ObjectFitProperty] = js.undefined
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
  var `object-position`: js.UndefOr[ObjectPositionProperty[TLength]] = js.undefined
  /** **Initial value**: `auto` */
  var `offset-anchor`: js.UndefOr[OffsetAnchorProperty[TLength]] = js.undefined
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **55**         |   No    |   No   |  No  | No  |
    * | 46 _(motion-distance)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var `offset-distance`: js.UndefOr[OffsetDistanceProperty[TLength]] = js.undefined
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari | Edge | IE  |
    * | :----------------: | :-----: | :----: | :--: | :-: |
    * |       **55**       |   n/a   |   No   |  No  | No  |
    * | 46 _(motion-path)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var `offset-path`: js.UndefOr[OffsetPathProperty] = js.undefined
  /** **Initial value**: `auto` */
  var `offset-position`: js.UndefOr[OffsetPositionProperty[TLength]] = js.undefined
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | No  |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `offset-rotate`: js.UndefOr[OffsetRotateProperty] = js.undefined
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari | Edge | IE  |
    * | :--------------------: | :-----: | :----: | :--: | :-: |
    * |         **56**         |   No    |   No   |  No  | No  |
    * | 46 _(motion-rotation)_ |         |        |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `offset-rotation`: js.UndefOr[OffsetRotateProperty] = js.undefined
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **2**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/opacity
    */
  var opacity: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
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
  var order: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The **`orphans`** CSS property sets the minimum number of lines in a block container that must be shown at the _bottom_ of a page, region, or column.
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **25** |   No    | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/orphans
    */
  var orphans: js.UndefOr[GlobalsNumber] = js.undefined
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
  var `outline-color`: js.UndefOr[OutlineColorProperty] = js.undefined
  /**
    * The **`outline-offset`** CSS property sets the amount of space between an outline and the edge or border of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **1**  | **1.5** | **1.2** | **15** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-offset
    */
  var `outline-offset`: js.UndefOr[OutlineOffsetProperty[TLength]] = js.undefined
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
  var `outline-style`: js.UndefOr[OutlineStyleProperty] = js.undefined
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-width
    */
  var `outline-width`: js.UndefOr[OutlineWidthProperty[TLength]] = js.undefined
  /**
    * The **`overflow`** CSS property sets what to do when an element's content is too big to fit in its block formatting context. It is a shorthand for `overflow-x` and `overflow-y`.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow
    */
  var overflow: js.UndefOr[OverflowProperty] = js.undefined
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **56** | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-anchor
    */
  var `overflow-anchor`: js.UndefOr[OverflowAnchorProperty] = js.undefined
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **69**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-block
    */
  var `overflow-block`: js.UndefOr[OverflowBlockProperty] = js.undefined
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
  var `overflow-clip-box`: js.UndefOr[OverflowClipBoxProperty] = js.undefined
  /**
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **69**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-inline
    */
  var `overflow-inline`: js.UndefOr[OverflowInlineProperty] = js.undefined
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Initial value**: `normal`
    *
    * |     Chrome      |      Firefox      |     Safari      |       Edge       |          IE           |
    * | :-------------: | :---------------: | :-------------: | :--------------: | :-------------------: |
    * |     **23**      |      **49**       |     **6.1**     |      **18**      | **5.5** _(word-wrap)_ |
    * | 1 _(word-wrap)_ | 3.5 _(word-wrap)_ | 1 _(word-wrap)_ | 12 _(word-wrap)_ |                       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var `overflow-wrap`: js.UndefOr[OverflowWrapProperty] = js.undefined
  /**
    * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **3.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-x
    */
  var `overflow-x`: js.UndefOr[OverflowXProperty] = js.undefined
  /**
    * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **1.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-y
    */
  var `overflow-y`: js.UndefOr[OverflowYProperty] = js.undefined
  /**
    * The **`overscroll-behavior`** CSS property sets what a browser does when reaching the boundary of a scrolling area. It's a shorthand for `overscroll-behavior-x` and `overscroll-behavior-y`.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior
    */
  var `overscroll-behavior`: js.UndefOr[OverscrollBehaviorProperty] = js.undefined
  /**
    * The **`overscroll-behavior-x`** CSS property sets the browser's behavior when the horizontal boundary of a scrolling area is reached.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-x
    */
  var `overscroll-behavior-x`: js.UndefOr[OverscrollBehaviorXProperty] = js.undefined
  /**
    * The **`overscroll-behavior-y`** CSS property sets the browser's behavior when the vertical boundary of a scrolling area is reached.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-y
    */
  var `overscroll-behavior-y`: js.UndefOr[OverscrollBehaviorYProperty] = js.undefined
  /**
    * The **`padding-block`** CSS property defines the logical block start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block
    */
  var `padding-block`: js.UndefOr[PaddingBlockProperty[TLength]] = js.undefined
  /**
    * The **`padding-block-end`** CSS property defines the logical block end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-end
    */
  var `padding-block-end`: js.UndefOr[PaddingBlockEndProperty[TLength]] = js.undefined
  /**
    * The **`padding-block-start`** CSS property defines the logical block start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **69** | **41**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-start
    */
  var `padding-block-start`: js.UndefOr[PaddingBlockStartProperty[TLength]] = js.undefined
  /**
    * The **`padding-bottom`** CSS property sets the height of the padding area on the bottom of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var `padding-bottom`: js.UndefOr[PaddingBottomProperty[TLength]] = js.undefined
  /**
    * The **`padding-inline`** CSS property defines the logical inline start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline
    */
  var `padding-inline`: js.UndefOr[PaddingInlineProperty[TLength]] = js.undefined
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |          Chrome           |        Firefox         |          Safari           | Edge | IE  |
    * | :-----------------------: | :--------------------: | :-----------------------: | :--: | :-: |
    * |          **69**           |         **41**         |         **12.1**          |  No  | No  |
    * | 2 _(-webkit-padding-end)_ | 3 _(-moz-padding-end)_ | 3 _(-webkit-padding-end)_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-end
    */
  var `padding-inline-end`: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.undefined
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `0`
    *
    * |           Chrome            |         Firefox          |           Safari            | Edge | IE  |
    * | :-------------------------: | :----------------------: | :-------------------------: | :--: | :-: |
    * |           **69**            |          **41**          |          **12.1**           |  No  | No  |
    * | 2 _(-webkit-padding-start)_ | 3 _(-moz-padding-start)_ | 3 _(-webkit-padding-start)_ |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-start
    */
  var `padding-inline-start`: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.undefined
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
  var `padding-left`: js.UndefOr[PaddingLeftProperty[TLength]] = js.undefined
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
  var `padding-right`: js.UndefOr[PaddingRightProperty[TLength]] = js.undefined
  /**
    * The **`padding-top`** padding area on the top of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    */
  var `padding-top`: js.UndefOr[PaddingTopProperty[TLength]] = js.undefined
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
  var `page-break-after`: js.UndefOr[PageBreakAfterProperty] = js.undefined
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
  var `page-break-before`: js.UndefOr[PageBreakBeforeProperty] = js.undefined
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
  var `page-break-inside`: js.UndefOr[PageBreakInsideProperty] = js.undefined
  /**
    * The **`paint-order`** CSS property lets you control the order in which the fill and stroke (and painting markers) of text content and shapes are drawn.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **35** | **60**  |  Yes   | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/paint-order
    */
  var `paint-order`: js.UndefOr[PaintOrderProperty] = js.undefined
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
    * | :------: | :------: | :-----: | :----: | :----: |
    * |  **36**  |  **16**  |  **9**  | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/perspective
    */
  var perspective: js.UndefOr[PerspectiveProperty[TLength]] = js.undefined
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Initial value**: `50% 50%`
    *
    * |  Chrome  | Firefox  | Safari  |  Edge  |   IE   |
    * | :------: | :------: | :-----: | :----: | :----: |
    * |  **36**  |  **16**  |  **9**  | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/perspective-origin
    */
  var `perspective-origin`: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.undefined
  /**
    * The `**place-content**` CSS property is a shorthand for `align-content` and `justify-content`. It can be used in any layout method which utilizes both of these alignment values.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **59** | **45**  |  Yes   |  No  | No  |
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
  var `place-content`: js.UndefOr[PlaceContentProperty] = js.undefined
  /**
    * The **`pointer-events`** CSS property sets under what circumstances (if any) a particular graphic element can become the target of mouse events.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **1**  | **1.5** | **4**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/pointer-events
    */
  var `pointer-events`: js.UndefOr[PointerEventsProperty] = js.undefined
  /**
    * The **`position`** CSS property sets how an element is positioned in a document. The `top`, `right`, `bottom`, and `left` properties determine the final location of positioned elements.
    *
    * **Initial value**: `static`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/position
    */
  var position: js.UndefOr[PositionProperty] = js.undefined
  /**
    * The **`quotes`** CSS property sets how quotation marks appear.
    *
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **11** | **1.5** | **9**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/quotes
    */
  var quotes: js.UndefOr[QuotesProperty] = js.undefined
  /**
    * The **`resize`** CSS property sets whether an element is resizable, and if so, in which directions.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **1**  |  **4**  | **3**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/resize
    */
  var resize: js.UndefOr[ResizeProperty] = js.undefined
  /**
    * The **`right`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/right
    */
  var right: js.UndefOr[RightProperty[TLength]] = js.undefined
  /**
    * The **`rotate`** CSS property allows you to specify rotation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/rotate
    */
  var rotate: js.UndefOr[RotateProperty] = js.undefined
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **63**  |   No   |  No  | No  |
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
  var `row-gap`: js.UndefOr[RowGapProperty[TLength]] = js.undefined
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
  var `ruby-align`: js.UndefOr[RubyAlignProperty] = js.undefined
  /** **Initial value**: `separate` */
  var `ruby-merge`: js.UndefOr[RubyMergeProperty] = js.undefined
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
  var `ruby-position`: js.UndefOr[RubyPositionProperty] = js.undefined
  /**
    * The **`scale`** CSS property allows you to specify scale transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scale
    */
  var scale: js.UndefOr[ScaleProperty] = js.undefined
  /**
    * The **`scroll-behavior`** CSS property sets the behavior for a scrolling box when scrolling is triggered by the navigation or CSSOM scrolling APIs.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **61** | **36**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-behavior
    */
  var `scroll-behavior`: js.UndefOr[ScrollBehaviorProperty] = js.undefined
  /**
    * The **`scroll-margin`** property is a shorthand property which sets all of the `scroll-margin` longhands, assigning values much like the `margin` property does for the `margin-*` longhands.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
    */
  var `scroll-margin`: js.UndefOr[ScrollMarginProperty[TLength]] = js.undefined
  /**
    * The `scroll-margin-block` property is a shorthand property which sets the scroll-margin longhands in the block dimension.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block
    */
  var `scroll-margin-block`: js.UndefOr[ScrollMarginBlockProperty[TLength]] = js.undefined
  /**
    * The `scroll-margin-block-end` property defines the margin of the scroll snap area at the end of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-end
    */
  var `scroll-margin-block-end`: js.UndefOr[ScrollMarginBlockEndProperty[TLength]] = js.undefined
  /**
    * The `scroll-margin-block-start` property defines the margin of the scroll snap area at the start of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-start
    */
  var `scroll-margin-block-start`: js.UndefOr[ScrollMarginBlockStartProperty[TLength]] = js.undefined
  /**
    * The `scroll-margin-bottom` property defines the bottom margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-bottom
    */
  var `scroll-margin-bottom`: js.UndefOr[ScrollMarginBottomProperty[TLength]] = js.undefined
  /**
    * The `scroll-margin-inline` property is a shorthand property which sets the scroll-margin longhands in the inline dimension.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **68**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline
    */
  var `scroll-margin-inline`: js.UndefOr[ScrollMarginInlineProperty[TLength]] = js.undefined
  /**
    * The `scroll-margin-inline-end` property defines the margin of the scroll snap area at the end of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-end
    */
  var `scroll-margin-inline-end`: js.UndefOr[ScrollMarginInlineEndProperty[TLength]] = js.undefined
  /**
    * The `scroll-margin-inline-start` property defines the margin of the scroll snap area at the start of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-start
    */
  var `scroll-margin-inline-start`: js.UndefOr[ScrollMarginInlineStartProperty[TLength]] = js.undefined
  /**
    * The `scroll-margin-left` property defines the left margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-left
    */
  var `scroll-margin-left`: js.UndefOr[ScrollMarginLeftProperty[TLength]] = js.undefined
  /**
    * The `scroll-margin-right` property defines the right margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-right
    */
  var `scroll-margin-right`: js.UndefOr[ScrollMarginRightProperty[TLength]] = js.undefined
  /**
    * The `scroll-margin-top` property defines the top margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-top
    */
  var `scroll-margin-top`: js.UndefOr[ScrollMarginTopProperty[TLength]] = js.undefined
  /**
    * The scroll-padding property is a shorthand property which sets all of the scroll-padding longhands, assigning values much like the padding property does for the padding-\* longhands.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding
    */
  var `scroll-padding`: js.UndefOr[ScrollPaddingProperty[TLength]] = js.undefined
  /**
    * The `scroll-padding-block` property is a shorthand property which sets the scroll-padding longhands for the block dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  |   No   |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block
    */
  var `scroll-padding-block`: js.UndefOr[ScrollPaddingBlockProperty[TLength]] = js.undefined
  /**
    * The `scroll-padding-block-end` property defines offsets for the end edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-end
    */
  var `scroll-padding-block-end`: js.UndefOr[ScrollPaddingBlockEndProperty[TLength]] = js.undefined
  /**
    * The `scroll-padding-block-start` property defines offsets for the start edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-start
    */
  var `scroll-padding-block-start`: js.UndefOr[ScrollPaddingBlockStartProperty[TLength]] = js.undefined
  /**
    * The `scroll-padding-bottom` property defines offsets for the bottom of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-bottom
    */
  var `scroll-padding-bottom`: js.UndefOr[ScrollPaddingBottomProperty[TLength]] = js.undefined
  /**
    * The `scroll-padding-inline` property is a shorthand property which sets the scroll-padding longhands for the inline dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  |   No   |  No  | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline
    */
  var `scroll-padding-inline`: js.UndefOr[ScrollPaddingInlineProperty[TLength]] = js.undefined
  /**
    * The `scroll-padding-inline-end` property defines offsets for the end edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-end
    */
  var `scroll-padding-inline-end`: js.UndefOr[ScrollPaddingInlineEndProperty[TLength]] = js.undefined
  /**
    * The `scroll-padding-inline-start` property defines offsets for the start edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-start
    */
  var `scroll-padding-inline-start`: js.UndefOr[ScrollPaddingInlineStartProperty[TLength]] = js.undefined
  /**
    * The `scroll-padding-left` property defines offsets for the left of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-left
    */
  var `scroll-padding-left`: js.UndefOr[ScrollPaddingLeftProperty[TLength]] = js.undefined
  /**
    * The `scroll-padding-right` property defines offsets for the right of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-right
    */
  var `scroll-padding-right`: js.UndefOr[ScrollPaddingRightProperty[TLength]] = js.undefined
  /**
    * The `scroll-padding-top` property defines offsets for the top of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-top
    */
  var `scroll-padding-top`: js.UndefOr[ScrollPaddingTopProperty[TLength]] = js.undefined
  /**
    * The `scroll-snap-align` property specifies the box’s snap position as an alignment of its snap area (as the alignment subject) within its snap container’s snapport (as the alignment container). The two values specify the snapping alignment in the block axis and inline axis, respectively. If only one value is specified, the second value defaults to the same value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **69** | **68**  | **11** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-align
    */
  var `scroll-snap-align`: js.UndefOr[ScrollSnapAlignProperty] = js.undefined
  /**
    * The **`scroll-snap-stop`** CSS property defines whether the scroll container is allowed to "pass over" possible snap positions.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **75** |   No    |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-stop
    */
  var `scroll-snap-stop`: js.UndefOr[ScrollSnapStopProperty] = js.undefined
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |     Edge     |      IE      |
    * | :----: | :-----: | :-----: | :----------: | :----------: |
    * | **69** |  39-68  | **11**  | **12** _-x-_ | **10** _-x-_ |
    * |        |         | 9 _-x-_ |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-type
    */
  var `scroll-snap-type`: js.UndefOr[ScrollSnapTypeProperty] = js.undefined
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
  var `scrollbar-color`: js.UndefOr[ScrollbarColorProperty] = js.undefined
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
  var `scrollbar-width`: js.UndefOr[ScrollbarWidthProperty] = js.undefined
  /**
    * The **`shape-image-threshold`** CSS property sets the alpha channel threshold used to extract the shape using an image as the value for `shape-outside`.
    *
    * **Initial value**: `0.0`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **37** | **62**  | **10.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-image-threshold
    */
  var `shape-image-threshold`: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |     Safari     | Edge | IE  |
    * | :----: | :-----: | :------------: | :--: | :-: |
    * | **37** | **62**  | **10.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-margin
    */
  var `shape-margin`: js.UndefOr[ShapeMarginProperty[TLength]] = js.undefined
  /**
    * The **`shape-outside`** CSS property defines a shape—which may be non-rectangular—around which adjacent inline content should wrap. By default, inline content wraps around its margin box; `shape-outside` provides a way to customize this wrapping, making it possible to wrap text around complex objects rather than simple boxes.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **37** | **62**  | **10.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-outside
    */
  var `shape-outside`: js.UndefOr[ShapeOutsideProperty] = js.undefined
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
  var `tab-size`: js.UndefOr[TabSizeProperty[TLength]] = js.undefined
  /**
    * The **`table-layout`** CSS property sets the algorithm used to lay out `<table>` cells, rows, and columns.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **14** |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/table-layout
    */
  var `table-layout`: js.UndefOr[TableLayoutProperty] = js.undefined
  /**
    * The **`text-align`** CSS property sets the horizontal alignment of an inline or table-cell box. This means it works like `vertical-align` but in the horizontal direction.
    *
    * **Initial value**: `start`, or a nameless value that acts as `left` if _direction_ is `ltr`, `right` if _direction_ is `rtl` if `start` is not supported by the browser.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align
    */
  var `text-align`: js.UndefOr[TextAlignProperty] = js.undefined
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **47** | **49**  |   No   | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align-last
    */
  var `text-align-last`: js.UndefOr[TextAlignLastProperty] = js.undefined
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |                  Edge                  |                   IE                   |
    * | :----: | :-----: | :----: | :------------------------------------: | :------------------------------------: |
    * | **48** | **48**  |  Yes   | **12** _(-ms-text-combine-horizontal)_ | **11** _(-ms-text-combine-horizontal)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-combine-upright
    */
  var `text-combine-upright`: js.UndefOr[TextCombineUprightProperty] = js.undefined
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-color
    */
  var `text-decoration-color`: js.UndefOr[TextDecorationColorProperty] = js.undefined
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-line
    */
  var `text-decoration-line`: js.UndefOr[TextDecorationLineProperty] = js.undefined
  /**
    * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
    *
    * **Initial value**: `objects`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | 57-64  |   No    | **12.1** |  No  | No  |
    * |        |         | 8 _-x-_  |      |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip
    */
  var `text-decoration-skip`: js.UndefOr[TextDecorationSkipProperty] = js.undefined
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
  var `text-decoration-skip-ink`: js.UndefOr[TextDecorationSkipInkProperty] = js.undefined
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Initial value**: `solid`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * | **57** | **36**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-style
    */
  var `text-decoration-style`: js.UndefOr[TextDecorationStyleProperty] = js.undefined
  /**
    * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
    *
    * **Initial value**: `currentcolor`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-color
    */
  var `text-emphasis-color`: js.UndefOr[TextEmphasisColorProperty] = js.undefined
  /**
    * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
    *
    * **Initial value**: `over right`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-position
    */
  var `text-emphasis-position`: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
    *
    * **Initial value**: `none`
    *
    * |    Chrome    | Firefox |    Safari     | Edge | IE  |
    * | :----------: | :-----: | :-----------: | :--: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** _-x-_ |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-style
    */
  var `text-emphasis-style`: js.UndefOr[TextEmphasisStyleProperty] = js.undefined
  /**
    * The **`text-indent`** CSS property sets the length of empty space (indentation) that is put before lines of text in a block.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-indent
    */
  var `text-indent`: js.UndefOr[TextIndentProperty[TLength]] = js.undefined
  /**
    * The **`text-justify`** CSS property sets what type of justification should be applied to text when `text-align``: justify;` is set on an element.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * |  n/a   | **55**  |   No   | **14** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-justify
    */
  var `text-justify`: js.UndefOr[TextJustifyProperty] = js.undefined
  /**
    * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
    *
    * **Initial value**: `mixed`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **48** | **41**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-orientation
    */
  var `text-orientation`: js.UndefOr[TextOrientationProperty] = js.undefined
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Initial value**: `clip`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **7**  | **1.3** | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-overflow
    */
  var `text-overflow`: js.UndefOr[TextOverflowProperty] = js.undefined
  /**
    * The **`text-rendering`** CSS property provides information to the rendering engine about what to optimize for when rendering text.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * | **4**  |  **1**  | **5**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-rendering
    */
  var `text-rendering`: js.UndefOr[TextRenderingProperty] = js.undefined
  /**
    * The **`text-shadow`** CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from the element, blur radius, and color.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **2**  | **3.5** | **1.1** | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-shadow
    */
  var `text-shadow`: js.UndefOr[TextShadowProperty] = js.undefined
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
  var `text-size-adjust`: js.UndefOr[TextSizeAdjustProperty] = js.undefined
  /**
    * The **`text-transform`** CSS property specifies how to capitalize an element's text. It can be used to make text appear in all-uppercase or all-lowercase, or with each word capitalized. It also can help improve legibility for ruby
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-transform
    */
  var `text-transform`: js.UndefOr[TextTransformProperty] = js.undefined
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
  var `text-underline-position`: js.UndefOr[TextUnderlinePositionProperty] = js.undefined
  /**
    * The **`top`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/top
    */
  var top: js.UndefOr[TopProperty[TLength]] = js.undefined
  /**
    * The **`touch-action`** CSS property sets how a region can be manipulated by a touchscreen user (for example, by zooming features built into the browser).
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |    IE    |
    * | :----: | :-----: | :----: | :----: | :------: |
    * | **36** | **52**  | **13** | **12** |  **11**  |
    * |        |         |        |        | 10 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/touch-action
    */
  var `touch-action`: js.UndefOr[TouchActionProperty] = js.undefined
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari   |  Edge  |   IE    |
    * | :----: | :-----: | :-------: | :----: | :-----: |
    * | **36** | **16**  |   **9**   | **12** | **10**  |
    * |        |         | 3.1 _-x-_ |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform
    */
  var transform: js.UndefOr[TransformProperty] = js.undefined
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
  var `transform-box`: js.UndefOr[TransformBoxProperty] = js.undefined
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Initial value**: `50% 50% 0`
    *
    * | Chrome |  Firefox  |  Safari   |  Edge  |   IE    |
    * | :----: | :-------: | :-------: | :----: | :-----: |
    * | **36** |  **16**   |   **9**   | **12** | **10**  |
    * |        | 3.5 _-x-_ | 3.1 _-x-_ |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-origin
    */
  var `transform-origin`: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Initial value**: `flat`
    *
    * |  Chrome  | Firefox  | Safari  |  Edge  | IE  |
    * | :------: | :------: | :-----: | :----: | :-: |
    * |  **36**  |  **16**  |  **9**  | **12** | No  |
    * | 12 _-x-_ | 10 _-x-_ | 4 _-x-_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-style
    */
  var `transform-style`: js.UndefOr[TransformStyleProperty] = js.undefined
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **26**  | **16**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 4 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-delay
    */
  var `transition-delay`: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Initial value**: `0s`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **26**  | **16**  |   **9**   | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-duration
    */
  var `transition-duration`: js.UndefOr[GlobalsString] = js.undefined
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Initial value**: all
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **26**  | **16**  |   **9**   | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-property
    */
  var `transition-property`: js.UndefOr[TransitionPropertyProperty] = js.undefined
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Initial value**: `ease`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **26**  | **16**  |   **9**   | **12** | **10** |
    * | 1 _-x-_ | 4 _-x-_ | 3.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transition-timing-function
    */
  var `transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  /**
    * The **`translate`** CSS property allows you to specify translation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/translate
    */
  var translate: js.UndefOr[TranslateProperty[TLength]] = js.undefined
  /**
    * The **`unicode-bidi`** CSS property, together with the `direction` property, determines how bidirectional text in a document is handled. For example, if a block of content contains both left-to-right and right-to-left text, the user-agent uses a complex Unicode algorithm to decide how to display the text. The `unicode-bidi` property overrides this algorithm and allows the developer to control the text embedding.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **2**  |  **1**  | **1.3** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/unicode-bidi
    */
  var `unicode-bidi`: js.UndefOr[UnicodeBidiProperty] = js.undefined
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox |   Safari    |     Edge     |      IE      |
    * | :-----: | :-----: | :---------: | :----------: | :----------: |
    * | **54**  | **69**  | **3** _-x-_ | **12** _-x-_ | **10** _-x-_ |
    * | 6 _-x-_ | 1 _-x-_ |             |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/user-select
    */
  var `user-select`: js.UndefOr[UserSelectProperty] = js.undefined
  /**
    * The **`vertical-align`** CSS property sets vertical alignment of an inline or table-cell box.
    *
    * **Initial value**: `baseline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/vertical-align
    */
  var `vertical-align`: js.UndefOr[VerticalAlignProperty[TLength]] = js.undefined
  /**
    * The **`visibility`** CSS property shows or hides an element without changing the layout of a document. The property can also hide rows or columns in a `<table>`.
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/visibility
    */
  var visibility: js.UndefOr[VisibilityProperty] = js.undefined
  /**
    * The **`white-space`** CSS property sets how white space inside an element is handled.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/white-space
    */
  var `white-space`: js.UndefOr[WhiteSpaceProperty] = js.undefined
  /**
    * The **`widows`** CSS property sets the minimum number of lines in a block container that must be shown at the _top_ of a page, region, or column.
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **25** |   No    | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/widows
    */
  var widows: js.UndefOr[GlobalsNumber] = js.undefined
  /**
    * The **`width`** CSS property sets an element's width. By default it sets the width of the content area, but if `box-sizing` is set to `border-box`, it sets the width of the border area.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * |  Yes   |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/width
    */
  var width: js.UndefOr[WidthProperty[TLength]] = js.undefined
  /**
    * The **`will-change`** CSS property hints to browsers how an element is expected to change. Browsers may set up optimizations before an element is actually changed. These kinds of optimizations can increase the responsiveness of a page by doing potentially expensive work before they are actually required.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  | Edge | IE  |
    * | :----: | :-----: | :-----: | :--: | :-: |
    * | **36** | **36**  | **9.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/will-change
    */
  var `will-change`: js.UndefOr[WillChangeProperty] = js.undefined
  /**
    * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **15**  | **3**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-break
    */
  var `word-break`: js.UndefOr[WordBreakProperty] = js.undefined
  /**
    * The **`word-spacing`** CSS property sets the length of space between words and between tags.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-spacing
    */
  var `word-spacing`: js.UndefOr[WordSpacingProperty[TLength]] = js.undefined
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **3.5** | **2**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var `word-wrap`: js.UndefOr[WordWrapProperty] = js.undefined
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Initial value**: `horizontal-tb`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  |     IE      |
    * | :---------: | :-----: | :-----------: | :----: | :---------: |
    * | **8** _-x-_ | **41**  | **5.1** _-x-_ | **12** | **9** _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/writing-mode
    */
  var `writing-mode`: js.UndefOr[WritingModeProperty] = js.undefined
  /**
    * The **`z-index`** CSS property sets the z-order of a positioned element and its descendants or flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/z-index
    */
  var `z-index`: js.UndefOr[ZIndexProperty] = js.undefined
  /**
    * The non-standard **`zoom`** CSS property can be used to control the magnification level of an element. `transform: scale()` should be used instead of this property, if possible. However, unlike CSS Transforms, `zoom` affects the layout size of the element.
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **1**  |   No    | **3.1** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/zoom
    */
  var zoom: js.UndefOr[ZoomProperty] = js.undefined
}

object StandardLonghandPropertiesHyphen {
  @scala.inline
  def apply[TLength](
    `align-content`: AlignContentProperty = null,
    `align-items`: AlignItemsProperty = null,
    `align-self`: AlignSelfProperty = null,
    `animation-delay`: GlobalsString = null,
    `animation-direction`: AnimationDirectionProperty = null,
    `animation-duration`: GlobalsString = null,
    `animation-fill-mode`: AnimationFillModeProperty = null,
    `animation-iteration-count`: AnimationIterationCountProperty = null,
    `animation-name`: AnimationNameProperty = null,
    `animation-play-state`: AnimationPlayStateProperty = null,
    `animation-timing-function`: AnimationTimingFunctionProperty = null,
    appearance: AppearanceProperty = null,
    `backdrop-filter`: BackdropFilterProperty = null,
    `backface-visibility`: BackfaceVisibilityProperty = null,
    `background-attachment`: BackgroundAttachmentProperty = null,
    `background-blend-mode`: BackgroundBlendModeProperty = null,
    `background-clip`: BackgroundClipProperty = null,
    `background-color`: BackgroundColorProperty = null,
    `background-image`: BackgroundImageProperty = null,
    `background-origin`: BackgroundOriginProperty = null,
    `background-position`: BackgroundPositionProperty[TLength] = null,
    `background-position-x`: BackgroundPositionXProperty[TLength] = null,
    `background-position-y`: BackgroundPositionYProperty[TLength] = null,
    `background-repeat`: BackgroundRepeatProperty = null,
    `background-size`: BackgroundSizeProperty[TLength] = null,
    `block-overflow`: BlockOverflowProperty = null,
    `block-size`: BlockSizeProperty[TLength] = null,
    `border-block-color`: BorderBlockColorProperty = null,
    `border-block-end-color`: BorderBlockEndColorProperty = null,
    `border-block-end-style`: BorderBlockEndStyleProperty = null,
    `border-block-end-width`: BorderBlockEndWidthProperty[TLength] = null,
    `border-block-start-color`: BorderBlockStartColorProperty = null,
    `border-block-start-style`: BorderBlockStartStyleProperty = null,
    `border-block-start-width`: BorderBlockStartWidthProperty[TLength] = null,
    `border-block-style`: BorderBlockStyleProperty = null,
    `border-block-width`: BorderBlockWidthProperty[TLength] = null,
    `border-bottom-color`: BorderBottomColorProperty = null,
    `border-bottom-left-radius`: BorderBottomLeftRadiusProperty[TLength] = null,
    `border-bottom-right-radius`: BorderBottomRightRadiusProperty[TLength] = null,
    `border-bottom-style`: BorderBottomStyleProperty = null,
    `border-bottom-width`: BorderBottomWidthProperty[TLength] = null,
    `border-collapse`: BorderCollapseProperty = null,
    `border-end-end-radius`: BorderEndEndRadiusProperty[TLength] = null,
    `border-end-start-radius`: BorderEndStartRadiusProperty[TLength] = null,
    `border-image-outset`: BorderImageOutsetProperty[TLength] = null,
    `border-image-repeat`: BorderImageRepeatProperty = null,
    `border-image-slice`: BorderImageSliceProperty = null,
    `border-image-source`: BorderImageSourceProperty = null,
    `border-image-width`: BorderImageWidthProperty[TLength] = null,
    `border-inline-color`: BorderInlineColorProperty = null,
    `border-inline-end-color`: BorderInlineEndColorProperty = null,
    `border-inline-end-style`: BorderInlineEndStyleProperty = null,
    `border-inline-end-width`: BorderInlineEndWidthProperty[TLength] = null,
    `border-inline-start-color`: BorderInlineStartColorProperty = null,
    `border-inline-start-style`: BorderInlineStartStyleProperty = null,
    `border-inline-start-width`: BorderInlineStartWidthProperty[TLength] = null,
    `border-inline-style`: BorderInlineStyleProperty = null,
    `border-inline-width`: BorderInlineWidthProperty[TLength] = null,
    `border-left-color`: BorderLeftColorProperty = null,
    `border-left-style`: BorderLeftStyleProperty = null,
    `border-left-width`: BorderLeftWidthProperty[TLength] = null,
    `border-right-color`: BorderRightColorProperty = null,
    `border-right-style`: BorderRightStyleProperty = null,
    `border-right-width`: BorderRightWidthProperty[TLength] = null,
    `border-spacing`: BorderSpacingProperty[TLength] = null,
    `border-start-end-radius`: BorderStartEndRadiusProperty[TLength] = null,
    `border-start-start-radius`: BorderStartStartRadiusProperty[TLength] = null,
    `border-top-color`: BorderTopColorProperty = null,
    `border-top-left-radius`: BorderTopLeftRadiusProperty[TLength] = null,
    `border-top-right-radius`: BorderTopRightRadiusProperty[TLength] = null,
    `border-top-style`: BorderTopStyleProperty = null,
    `border-top-width`: BorderTopWidthProperty[TLength] = null,
    bottom: BottomProperty[TLength] = null,
    `box-decoration-break`: BoxDecorationBreakProperty = null,
    `box-shadow`: BoxShadowProperty = null,
    `box-sizing`: BoxSizingProperty = null,
    `break-after`: BreakAfterProperty = null,
    `break-before`: BreakBeforeProperty = null,
    `break-inside`: BreakInsideProperty = null,
    `caption-side`: CaptionSideProperty = null,
    `caret-color`: CaretColorProperty = null,
    clear: ClearProperty = null,
    `clip-path`: ClipPathProperty = null,
    color: ColorProperty = null,
    `color-adjust`: ColorAdjustProperty = null,
    `column-count`: ColumnCountProperty = null,
    `column-fill`: ColumnFillProperty = null,
    `column-gap`: ColumnGapProperty[TLength] = null,
    `column-rule-color`: ColumnRuleColorProperty = null,
    `column-rule-style`: ColumnRuleStyleProperty = null,
    `column-rule-width`: ColumnRuleWidthProperty[TLength] = null,
    `column-span`: ColumnSpanProperty = null,
    `column-width`: ColumnWidthProperty[TLength] = null,
    contain: ContainProperty = null,
    content: ContentProperty = null,
    `counter-increment`: CounterIncrementProperty = null,
    `counter-reset`: CounterResetProperty = null,
    `counter-set`: CounterSetProperty = null,
    cursor: CursorProperty = null,
    direction: DirectionProperty = null,
    display: DisplayProperty = null,
    `empty-cells`: EmptyCellsProperty = null,
    filter: FilterProperty = null,
    `flex-basis`: FlexBasisProperty[TLength] = null,
    `flex-direction`: FlexDirectionProperty = null,
    `flex-grow`: GlobalsNumber = null,
    `flex-shrink`: GlobalsNumber = null,
    `flex-wrap`: FlexWrapProperty = null,
    float: FloatProperty = null,
    `font-family`: FontFamilyProperty = null,
    `font-feature-settings`: FontFeatureSettingsProperty = null,
    `font-kerning`: FontKerningProperty = null,
    `font-language-override`: FontLanguageOverrideProperty = null,
    `font-optical-sizing`: FontOpticalSizingProperty = null,
    `font-size`: FontSizeProperty[TLength] = null,
    `font-size-adjust`: FontSizeAdjustProperty = null,
    `font-stretch`: FontStretchProperty = null,
    `font-style`: FontStyleProperty = null,
    `font-synthesis`: FontSynthesisProperty = null,
    `font-variant`: FontVariantProperty = null,
    `font-variant-caps`: FontVariantCapsProperty = null,
    `font-variant-east-asian`: FontVariantEastAsianProperty = null,
    `font-variant-ligatures`: FontVariantLigaturesProperty = null,
    `font-variant-numeric`: FontVariantNumericProperty = null,
    `font-variant-position`: FontVariantPositionProperty = null,
    `font-variation-settings`: FontVariationSettingsProperty = null,
    `font-weight`: FontWeightProperty = null,
    `grid-auto-columns`: GridAutoColumnsProperty[TLength] = null,
    `grid-auto-flow`: GridAutoFlowProperty = null,
    `grid-auto-rows`: GridAutoRowsProperty[TLength] = null,
    `grid-column-end`: GridColumnEndProperty = null,
    `grid-column-start`: GridColumnStartProperty = null,
    `grid-row-end`: GridRowEndProperty = null,
    `grid-row-start`: GridRowStartProperty = null,
    `grid-template-areas`: GridTemplateAreasProperty = null,
    `grid-template-columns`: GridTemplateColumnsProperty[TLength] = null,
    `grid-template-rows`: GridTemplateRowsProperty[TLength] = null,
    `hanging-punctuation`: HangingPunctuationProperty = null,
    height: HeightProperty[TLength] = null,
    hyphens: HyphensProperty = null,
    `image-orientation`: ImageOrientationProperty = null,
    `image-rendering`: ImageRenderingProperty = null,
    `image-resolution`: ImageResolutionProperty = null,
    `initial-letter`: InitialLetterProperty = null,
    `inline-size`: InlineSizeProperty[TLength] = null,
    inset: InsetProperty[TLength] = null,
    `inset-block`: InsetBlockProperty[TLength] = null,
    `inset-block-end`: InsetBlockEndProperty[TLength] = null,
    `inset-block-start`: InsetBlockStartProperty[TLength] = null,
    `inset-inline`: InsetInlineProperty[TLength] = null,
    `inset-inline-end`: InsetInlineEndProperty[TLength] = null,
    `inset-inline-start`: InsetInlineStartProperty[TLength] = null,
    isolation: IsolationProperty = null,
    `justify-content`: JustifyContentProperty = null,
    `justify-items`: JustifyItemsProperty = null,
    `justify-self`: JustifySelfProperty = null,
    left: LeftProperty[TLength] = null,
    `letter-spacing`: LetterSpacingProperty[TLength] = null,
    `line-break`: LineBreakProperty = null,
    `line-height`: LineHeightProperty[TLength] = null,
    `line-height-step`: LineHeightStepProperty[TLength] = null,
    `list-style-image`: ListStyleImageProperty = null,
    `list-style-position`: ListStylePositionProperty = null,
    `list-style-type`: ListStyleTypeProperty = null,
    `margin-block`: MarginBlockProperty[TLength] = null,
    `margin-block-end`: MarginBlockEndProperty[TLength] = null,
    `margin-block-start`: MarginBlockStartProperty[TLength] = null,
    `margin-bottom`: MarginBottomProperty[TLength] = null,
    `margin-inline`: MarginInlineProperty[TLength] = null,
    `margin-inline-end`: MarginInlineEndProperty[TLength] = null,
    `margin-inline-start`: MarginInlineStartProperty[TLength] = null,
    `margin-left`: MarginLeftProperty[TLength] = null,
    `margin-right`: MarginRightProperty[TLength] = null,
    `margin-top`: MarginTopProperty[TLength] = null,
    `mask-border-mode`: MaskBorderModeProperty = null,
    `mask-border-outset`: MaskBorderOutsetProperty[TLength] = null,
    `mask-border-repeat`: MaskBorderRepeatProperty = null,
    `mask-border-slice`: MaskBorderSliceProperty = null,
    `mask-border-source`: MaskBorderSourceProperty = null,
    `mask-border-width`: MaskBorderWidthProperty[TLength] = null,
    `mask-clip`: MaskClipProperty = null,
    `mask-composite`: MaskCompositeProperty = null,
    `mask-image`: MaskImageProperty = null,
    `mask-mode`: MaskModeProperty = null,
    `mask-origin`: MaskOriginProperty = null,
    `mask-position`: MaskPositionProperty[TLength] = null,
    `mask-repeat`: MaskRepeatProperty = null,
    `mask-size`: MaskSizeProperty[TLength] = null,
    `mask-type`: MaskTypeProperty = null,
    `max-block-size`: MaxBlockSizeProperty[TLength] = null,
    `max-height`: MaxHeightProperty[TLength] = null,
    `max-inline-size`: MaxInlineSizeProperty[TLength] = null,
    `max-lines`: MaxLinesProperty = null,
    `max-width`: MaxWidthProperty[TLength] = null,
    `min-block-size`: MinBlockSizeProperty[TLength] = null,
    `min-height`: MinHeightProperty[TLength] = null,
    `min-inline-size`: MinInlineSizeProperty[TLength] = null,
    `min-width`: MinWidthProperty[TLength] = null,
    `mix-blend-mode`: MixBlendModeProperty = null,
    `motion-distance`: OffsetDistanceProperty[TLength] = null,
    `motion-path`: OffsetPathProperty = null,
    `motion-rotation`: OffsetRotateProperty = null,
    `object-fit`: ObjectFitProperty = null,
    `object-position`: ObjectPositionProperty[TLength] = null,
    `offset-anchor`: OffsetAnchorProperty[TLength] = null,
    `offset-distance`: OffsetDistanceProperty[TLength] = null,
    `offset-path`: OffsetPathProperty = null,
    `offset-position`: OffsetPositionProperty[TLength] = null,
    `offset-rotate`: OffsetRotateProperty = null,
    `offset-rotation`: OffsetRotateProperty = null,
    opacity: GlobalsNumber = null,
    order: GlobalsNumber = null,
    orphans: GlobalsNumber = null,
    `outline-color`: OutlineColorProperty = null,
    `outline-offset`: OutlineOffsetProperty[TLength] = null,
    `outline-style`: OutlineStyleProperty = null,
    `outline-width`: OutlineWidthProperty[TLength] = null,
    overflow: OverflowProperty = null,
    `overflow-anchor`: OverflowAnchorProperty = null,
    `overflow-block`: OverflowBlockProperty = null,
    `overflow-clip-box`: OverflowClipBoxProperty = null,
    `overflow-inline`: OverflowInlineProperty = null,
    `overflow-wrap`: OverflowWrapProperty = null,
    `overflow-x`: OverflowXProperty = null,
    `overflow-y`: OverflowYProperty = null,
    `overscroll-behavior`: OverscrollBehaviorProperty = null,
    `overscroll-behavior-x`: OverscrollBehaviorXProperty = null,
    `overscroll-behavior-y`: OverscrollBehaviorYProperty = null,
    `padding-block`: PaddingBlockProperty[TLength] = null,
    `padding-block-end`: PaddingBlockEndProperty[TLength] = null,
    `padding-block-start`: PaddingBlockStartProperty[TLength] = null,
    `padding-bottom`: PaddingBottomProperty[TLength] = null,
    `padding-inline`: PaddingInlineProperty[TLength] = null,
    `padding-inline-end`: PaddingInlineEndProperty[TLength] = null,
    `padding-inline-start`: PaddingInlineStartProperty[TLength] = null,
    `padding-left`: PaddingLeftProperty[TLength] = null,
    `padding-right`: PaddingRightProperty[TLength] = null,
    `padding-top`: PaddingTopProperty[TLength] = null,
    `page-break-after`: PageBreakAfterProperty = null,
    `page-break-before`: PageBreakBeforeProperty = null,
    `page-break-inside`: PageBreakInsideProperty = null,
    `paint-order`: PaintOrderProperty = null,
    perspective: PerspectiveProperty[TLength] = null,
    `perspective-origin`: PerspectiveOriginProperty[TLength] = null,
    `place-content`: PlaceContentProperty = null,
    `pointer-events`: PointerEventsProperty = null,
    position: PositionProperty = null,
    quotes: QuotesProperty = null,
    resize: ResizeProperty = null,
    right: RightProperty[TLength] = null,
    rotate: RotateProperty = null,
    `row-gap`: RowGapProperty[TLength] = null,
    `ruby-align`: RubyAlignProperty = null,
    `ruby-merge`: RubyMergeProperty = null
  ): StandardLonghandPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    if (`align-content` != null) __obj.updateDynamic("align-content")(`align-content`.asInstanceOf[js.Any])
    if (`align-items` != null) __obj.updateDynamic("align-items")(`align-items`.asInstanceOf[js.Any])
    if (`align-self` != null) __obj.updateDynamic("align-self")(`align-self`.asInstanceOf[js.Any])
    if (`animation-delay` != null) __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    if (`animation-direction` != null) __obj.updateDynamic("animation-direction")(`animation-direction`.asInstanceOf[js.Any])
    if (`animation-duration` != null) __obj.updateDynamic("animation-duration")(`animation-duration`.asInstanceOf[js.Any])
    if (`animation-fill-mode` != null) __obj.updateDynamic("animation-fill-mode")(`animation-fill-mode`.asInstanceOf[js.Any])
    if (`animation-iteration-count` != null) __obj.updateDynamic("animation-iteration-count")(`animation-iteration-count`.asInstanceOf[js.Any])
    if (`animation-name` != null) __obj.updateDynamic("animation-name")(`animation-name`.asInstanceOf[js.Any])
    if (`animation-play-state` != null) __obj.updateDynamic("animation-play-state")(`animation-play-state`.asInstanceOf[js.Any])
    if (`animation-timing-function` != null) __obj.updateDynamic("animation-timing-function")(`animation-timing-function`.asInstanceOf[js.Any])
    if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (`backdrop-filter` != null) __obj.updateDynamic("backdrop-filter")(`backdrop-filter`.asInstanceOf[js.Any])
    if (`backface-visibility` != null) __obj.updateDynamic("backface-visibility")(`backface-visibility`.asInstanceOf[js.Any])
    if (`background-attachment` != null) __obj.updateDynamic("background-attachment")(`background-attachment`.asInstanceOf[js.Any])
    if (`background-blend-mode` != null) __obj.updateDynamic("background-blend-mode")(`background-blend-mode`.asInstanceOf[js.Any])
    if (`background-clip` != null) __obj.updateDynamic("background-clip")(`background-clip`.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`background-image` != null) __obj.updateDynamic("background-image")(`background-image`.asInstanceOf[js.Any])
    if (`background-origin` != null) __obj.updateDynamic("background-origin")(`background-origin`.asInstanceOf[js.Any])
    if (`background-position` != null) __obj.updateDynamic("background-position")(`background-position`.asInstanceOf[js.Any])
    if (`background-position-x` != null) __obj.updateDynamic("background-position-x")(`background-position-x`.asInstanceOf[js.Any])
    if (`background-position-y` != null) __obj.updateDynamic("background-position-y")(`background-position-y`.asInstanceOf[js.Any])
    if (`background-repeat` != null) __obj.updateDynamic("background-repeat")(`background-repeat`.asInstanceOf[js.Any])
    if (`background-size` != null) __obj.updateDynamic("background-size")(`background-size`.asInstanceOf[js.Any])
    if (`block-overflow` != null) __obj.updateDynamic("block-overflow")(`block-overflow`.asInstanceOf[js.Any])
    if (`block-size` != null) __obj.updateDynamic("block-size")(`block-size`.asInstanceOf[js.Any])
    if (`border-block-color` != null) __obj.updateDynamic("border-block-color")(`border-block-color`.asInstanceOf[js.Any])
    if (`border-block-end-color` != null) __obj.updateDynamic("border-block-end-color")(`border-block-end-color`.asInstanceOf[js.Any])
    if (`border-block-end-style` != null) __obj.updateDynamic("border-block-end-style")(`border-block-end-style`.asInstanceOf[js.Any])
    if (`border-block-end-width` != null) __obj.updateDynamic("border-block-end-width")(`border-block-end-width`.asInstanceOf[js.Any])
    if (`border-block-start-color` != null) __obj.updateDynamic("border-block-start-color")(`border-block-start-color`.asInstanceOf[js.Any])
    if (`border-block-start-style` != null) __obj.updateDynamic("border-block-start-style")(`border-block-start-style`.asInstanceOf[js.Any])
    if (`border-block-start-width` != null) __obj.updateDynamic("border-block-start-width")(`border-block-start-width`.asInstanceOf[js.Any])
    if (`border-block-style` != null) __obj.updateDynamic("border-block-style")(`border-block-style`.asInstanceOf[js.Any])
    if (`border-block-width` != null) __obj.updateDynamic("border-block-width")(`border-block-width`.asInstanceOf[js.Any])
    if (`border-bottom-color` != null) __obj.updateDynamic("border-bottom-color")(`border-bottom-color`.asInstanceOf[js.Any])
    if (`border-bottom-left-radius` != null) __obj.updateDynamic("border-bottom-left-radius")(`border-bottom-left-radius`.asInstanceOf[js.Any])
    if (`border-bottom-right-radius` != null) __obj.updateDynamic("border-bottom-right-radius")(`border-bottom-right-radius`.asInstanceOf[js.Any])
    if (`border-bottom-style` != null) __obj.updateDynamic("border-bottom-style")(`border-bottom-style`.asInstanceOf[js.Any])
    if (`border-bottom-width` != null) __obj.updateDynamic("border-bottom-width")(`border-bottom-width`.asInstanceOf[js.Any])
    if (`border-collapse` != null) __obj.updateDynamic("border-collapse")(`border-collapse`.asInstanceOf[js.Any])
    if (`border-end-end-radius` != null) __obj.updateDynamic("border-end-end-radius")(`border-end-end-radius`.asInstanceOf[js.Any])
    if (`border-end-start-radius` != null) __obj.updateDynamic("border-end-start-radius")(`border-end-start-radius`.asInstanceOf[js.Any])
    if (`border-image-outset` != null) __obj.updateDynamic("border-image-outset")(`border-image-outset`.asInstanceOf[js.Any])
    if (`border-image-repeat` != null) __obj.updateDynamic("border-image-repeat")(`border-image-repeat`.asInstanceOf[js.Any])
    if (`border-image-slice` != null) __obj.updateDynamic("border-image-slice")(`border-image-slice`.asInstanceOf[js.Any])
    if (`border-image-source` != null) __obj.updateDynamic("border-image-source")(`border-image-source`.asInstanceOf[js.Any])
    if (`border-image-width` != null) __obj.updateDynamic("border-image-width")(`border-image-width`.asInstanceOf[js.Any])
    if (`border-inline-color` != null) __obj.updateDynamic("border-inline-color")(`border-inline-color`.asInstanceOf[js.Any])
    if (`border-inline-end-color` != null) __obj.updateDynamic("border-inline-end-color")(`border-inline-end-color`.asInstanceOf[js.Any])
    if (`border-inline-end-style` != null) __obj.updateDynamic("border-inline-end-style")(`border-inline-end-style`.asInstanceOf[js.Any])
    if (`border-inline-end-width` != null) __obj.updateDynamic("border-inline-end-width")(`border-inline-end-width`.asInstanceOf[js.Any])
    if (`border-inline-start-color` != null) __obj.updateDynamic("border-inline-start-color")(`border-inline-start-color`.asInstanceOf[js.Any])
    if (`border-inline-start-style` != null) __obj.updateDynamic("border-inline-start-style")(`border-inline-start-style`.asInstanceOf[js.Any])
    if (`border-inline-start-width` != null) __obj.updateDynamic("border-inline-start-width")(`border-inline-start-width`.asInstanceOf[js.Any])
    if (`border-inline-style` != null) __obj.updateDynamic("border-inline-style")(`border-inline-style`.asInstanceOf[js.Any])
    if (`border-inline-width` != null) __obj.updateDynamic("border-inline-width")(`border-inline-width`.asInstanceOf[js.Any])
    if (`border-left-color` != null) __obj.updateDynamic("border-left-color")(`border-left-color`.asInstanceOf[js.Any])
    if (`border-left-style` != null) __obj.updateDynamic("border-left-style")(`border-left-style`.asInstanceOf[js.Any])
    if (`border-left-width` != null) __obj.updateDynamic("border-left-width")(`border-left-width`.asInstanceOf[js.Any])
    if (`border-right-color` != null) __obj.updateDynamic("border-right-color")(`border-right-color`.asInstanceOf[js.Any])
    if (`border-right-style` != null) __obj.updateDynamic("border-right-style")(`border-right-style`.asInstanceOf[js.Any])
    if (`border-right-width` != null) __obj.updateDynamic("border-right-width")(`border-right-width`.asInstanceOf[js.Any])
    if (`border-spacing` != null) __obj.updateDynamic("border-spacing")(`border-spacing`.asInstanceOf[js.Any])
    if (`border-start-end-radius` != null) __obj.updateDynamic("border-start-end-radius")(`border-start-end-radius`.asInstanceOf[js.Any])
    if (`border-start-start-radius` != null) __obj.updateDynamic("border-start-start-radius")(`border-start-start-radius`.asInstanceOf[js.Any])
    if (`border-top-color` != null) __obj.updateDynamic("border-top-color")(`border-top-color`.asInstanceOf[js.Any])
    if (`border-top-left-radius` != null) __obj.updateDynamic("border-top-left-radius")(`border-top-left-radius`.asInstanceOf[js.Any])
    if (`border-top-right-radius` != null) __obj.updateDynamic("border-top-right-radius")(`border-top-right-radius`.asInstanceOf[js.Any])
    if (`border-top-style` != null) __obj.updateDynamic("border-top-style")(`border-top-style`.asInstanceOf[js.Any])
    if (`border-top-width` != null) __obj.updateDynamic("border-top-width")(`border-top-width`.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (`box-decoration-break` != null) __obj.updateDynamic("box-decoration-break")(`box-decoration-break`.asInstanceOf[js.Any])
    if (`box-shadow` != null) __obj.updateDynamic("box-shadow")(`box-shadow`.asInstanceOf[js.Any])
    if (`box-sizing` != null) __obj.updateDynamic("box-sizing")(`box-sizing`.asInstanceOf[js.Any])
    if (`break-after` != null) __obj.updateDynamic("break-after")(`break-after`.asInstanceOf[js.Any])
    if (`break-before` != null) __obj.updateDynamic("break-before")(`break-before`.asInstanceOf[js.Any])
    if (`break-inside` != null) __obj.updateDynamic("break-inside")(`break-inside`.asInstanceOf[js.Any])
    if (`caption-side` != null) __obj.updateDynamic("caption-side")(`caption-side`.asInstanceOf[js.Any])
    if (`caret-color` != null) __obj.updateDynamic("caret-color")(`caret-color`.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (`clip-path` != null) __obj.updateDynamic("clip-path")(`clip-path`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`color-adjust` != null) __obj.updateDynamic("color-adjust")(`color-adjust`.asInstanceOf[js.Any])
    if (`column-count` != null) __obj.updateDynamic("column-count")(`column-count`.asInstanceOf[js.Any])
    if (`column-fill` != null) __obj.updateDynamic("column-fill")(`column-fill`.asInstanceOf[js.Any])
    if (`column-gap` != null) __obj.updateDynamic("column-gap")(`column-gap`.asInstanceOf[js.Any])
    if (`column-rule-color` != null) __obj.updateDynamic("column-rule-color")(`column-rule-color`.asInstanceOf[js.Any])
    if (`column-rule-style` != null) __obj.updateDynamic("column-rule-style")(`column-rule-style`.asInstanceOf[js.Any])
    if (`column-rule-width` != null) __obj.updateDynamic("column-rule-width")(`column-rule-width`.asInstanceOf[js.Any])
    if (`column-span` != null) __obj.updateDynamic("column-span")(`column-span`.asInstanceOf[js.Any])
    if (`column-width` != null) __obj.updateDynamic("column-width")(`column-width`.asInstanceOf[js.Any])
    if (contain != null) __obj.updateDynamic("contain")(contain.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (`counter-increment` != null) __obj.updateDynamic("counter-increment")(`counter-increment`.asInstanceOf[js.Any])
    if (`counter-reset` != null) __obj.updateDynamic("counter-reset")(`counter-reset`.asInstanceOf[js.Any])
    if (`counter-set` != null) __obj.updateDynamic("counter-set")(`counter-set`.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (`empty-cells` != null) __obj.updateDynamic("empty-cells")(`empty-cells`.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (`flex-basis` != null) __obj.updateDynamic("flex-basis")(`flex-basis`.asInstanceOf[js.Any])
    if (`flex-direction` != null) __obj.updateDynamic("flex-direction")(`flex-direction`.asInstanceOf[js.Any])
    if (`flex-grow` != null) __obj.updateDynamic("flex-grow")(`flex-grow`.asInstanceOf[js.Any])
    if (`flex-shrink` != null) __obj.updateDynamic("flex-shrink")(`flex-shrink`.asInstanceOf[js.Any])
    if (`flex-wrap` != null) __obj.updateDynamic("flex-wrap")(`flex-wrap`.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-feature-settings` != null) __obj.updateDynamic("font-feature-settings")(`font-feature-settings`.asInstanceOf[js.Any])
    if (`font-kerning` != null) __obj.updateDynamic("font-kerning")(`font-kerning`.asInstanceOf[js.Any])
    if (`font-language-override` != null) __obj.updateDynamic("font-language-override")(`font-language-override`.asInstanceOf[js.Any])
    if (`font-optical-sizing` != null) __obj.updateDynamic("font-optical-sizing")(`font-optical-sizing`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (`font-size-adjust` != null) __obj.updateDynamic("font-size-adjust")(`font-size-adjust`.asInstanceOf[js.Any])
    if (`font-stretch` != null) __obj.updateDynamic("font-stretch")(`font-stretch`.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-synthesis` != null) __obj.updateDynamic("font-synthesis")(`font-synthesis`.asInstanceOf[js.Any])
    if (`font-variant` != null) __obj.updateDynamic("font-variant")(`font-variant`.asInstanceOf[js.Any])
    if (`font-variant-caps` != null) __obj.updateDynamic("font-variant-caps")(`font-variant-caps`.asInstanceOf[js.Any])
    if (`font-variant-east-asian` != null) __obj.updateDynamic("font-variant-east-asian")(`font-variant-east-asian`.asInstanceOf[js.Any])
    if (`font-variant-ligatures` != null) __obj.updateDynamic("font-variant-ligatures")(`font-variant-ligatures`.asInstanceOf[js.Any])
    if (`font-variant-numeric` != null) __obj.updateDynamic("font-variant-numeric")(`font-variant-numeric`.asInstanceOf[js.Any])
    if (`font-variant-position` != null) __obj.updateDynamic("font-variant-position")(`font-variant-position`.asInstanceOf[js.Any])
    if (`font-variation-settings` != null) __obj.updateDynamic("font-variation-settings")(`font-variation-settings`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (`grid-auto-columns` != null) __obj.updateDynamic("grid-auto-columns")(`grid-auto-columns`.asInstanceOf[js.Any])
    if (`grid-auto-flow` != null) __obj.updateDynamic("grid-auto-flow")(`grid-auto-flow`.asInstanceOf[js.Any])
    if (`grid-auto-rows` != null) __obj.updateDynamic("grid-auto-rows")(`grid-auto-rows`.asInstanceOf[js.Any])
    if (`grid-column-end` != null) __obj.updateDynamic("grid-column-end")(`grid-column-end`.asInstanceOf[js.Any])
    if (`grid-column-start` != null) __obj.updateDynamic("grid-column-start")(`grid-column-start`.asInstanceOf[js.Any])
    if (`grid-row-end` != null) __obj.updateDynamic("grid-row-end")(`grid-row-end`.asInstanceOf[js.Any])
    if (`grid-row-start` != null) __obj.updateDynamic("grid-row-start")(`grid-row-start`.asInstanceOf[js.Any])
    if (`grid-template-areas` != null) __obj.updateDynamic("grid-template-areas")(`grid-template-areas`.asInstanceOf[js.Any])
    if (`grid-template-columns` != null) __obj.updateDynamic("grid-template-columns")(`grid-template-columns`.asInstanceOf[js.Any])
    if (`grid-template-rows` != null) __obj.updateDynamic("grid-template-rows")(`grid-template-rows`.asInstanceOf[js.Any])
    if (`hanging-punctuation` != null) __obj.updateDynamic("hanging-punctuation")(`hanging-punctuation`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hyphens != null) __obj.updateDynamic("hyphens")(hyphens.asInstanceOf[js.Any])
    if (`image-orientation` != null) __obj.updateDynamic("image-orientation")(`image-orientation`.asInstanceOf[js.Any])
    if (`image-rendering` != null) __obj.updateDynamic("image-rendering")(`image-rendering`.asInstanceOf[js.Any])
    if (`image-resolution` != null) __obj.updateDynamic("image-resolution")(`image-resolution`.asInstanceOf[js.Any])
    if (`initial-letter` != null) __obj.updateDynamic("initial-letter")(`initial-letter`.asInstanceOf[js.Any])
    if (`inline-size` != null) __obj.updateDynamic("inline-size")(`inline-size`.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (`inset-block` != null) __obj.updateDynamic("inset-block")(`inset-block`.asInstanceOf[js.Any])
    if (`inset-block-end` != null) __obj.updateDynamic("inset-block-end")(`inset-block-end`.asInstanceOf[js.Any])
    if (`inset-block-start` != null) __obj.updateDynamic("inset-block-start")(`inset-block-start`.asInstanceOf[js.Any])
    if (`inset-inline` != null) __obj.updateDynamic("inset-inline")(`inset-inline`.asInstanceOf[js.Any])
    if (`inset-inline-end` != null) __obj.updateDynamic("inset-inline-end")(`inset-inline-end`.asInstanceOf[js.Any])
    if (`inset-inline-start` != null) __obj.updateDynamic("inset-inline-start")(`inset-inline-start`.asInstanceOf[js.Any])
    if (isolation != null) __obj.updateDynamic("isolation")(isolation.asInstanceOf[js.Any])
    if (`justify-content` != null) __obj.updateDynamic("justify-content")(`justify-content`.asInstanceOf[js.Any])
    if (`justify-items` != null) __obj.updateDynamic("justify-items")(`justify-items`.asInstanceOf[js.Any])
    if (`justify-self` != null) __obj.updateDynamic("justify-self")(`justify-self`.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (`letter-spacing` != null) __obj.updateDynamic("letter-spacing")(`letter-spacing`.asInstanceOf[js.Any])
    if (`line-break` != null) __obj.updateDynamic("line-break")(`line-break`.asInstanceOf[js.Any])
    if (`line-height` != null) __obj.updateDynamic("line-height")(`line-height`.asInstanceOf[js.Any])
    if (`line-height-step` != null) __obj.updateDynamic("line-height-step")(`line-height-step`.asInstanceOf[js.Any])
    if (`list-style-image` != null) __obj.updateDynamic("list-style-image")(`list-style-image`.asInstanceOf[js.Any])
    if (`list-style-position` != null) __obj.updateDynamic("list-style-position")(`list-style-position`.asInstanceOf[js.Any])
    if (`list-style-type` != null) __obj.updateDynamic("list-style-type")(`list-style-type`.asInstanceOf[js.Any])
    if (`margin-block` != null) __obj.updateDynamic("margin-block")(`margin-block`.asInstanceOf[js.Any])
    if (`margin-block-end` != null) __obj.updateDynamic("margin-block-end")(`margin-block-end`.asInstanceOf[js.Any])
    if (`margin-block-start` != null) __obj.updateDynamic("margin-block-start")(`margin-block-start`.asInstanceOf[js.Any])
    if (`margin-bottom` != null) __obj.updateDynamic("margin-bottom")(`margin-bottom`.asInstanceOf[js.Any])
    if (`margin-inline` != null) __obj.updateDynamic("margin-inline")(`margin-inline`.asInstanceOf[js.Any])
    if (`margin-inline-end` != null) __obj.updateDynamic("margin-inline-end")(`margin-inline-end`.asInstanceOf[js.Any])
    if (`margin-inline-start` != null) __obj.updateDynamic("margin-inline-start")(`margin-inline-start`.asInstanceOf[js.Any])
    if (`margin-left` != null) __obj.updateDynamic("margin-left")(`margin-left`.asInstanceOf[js.Any])
    if (`margin-right` != null) __obj.updateDynamic("margin-right")(`margin-right`.asInstanceOf[js.Any])
    if (`margin-top` != null) __obj.updateDynamic("margin-top")(`margin-top`.asInstanceOf[js.Any])
    if (`mask-border-mode` != null) __obj.updateDynamic("mask-border-mode")(`mask-border-mode`.asInstanceOf[js.Any])
    if (`mask-border-outset` != null) __obj.updateDynamic("mask-border-outset")(`mask-border-outset`.asInstanceOf[js.Any])
    if (`mask-border-repeat` != null) __obj.updateDynamic("mask-border-repeat")(`mask-border-repeat`.asInstanceOf[js.Any])
    if (`mask-border-slice` != null) __obj.updateDynamic("mask-border-slice")(`mask-border-slice`.asInstanceOf[js.Any])
    if (`mask-border-source` != null) __obj.updateDynamic("mask-border-source")(`mask-border-source`.asInstanceOf[js.Any])
    if (`mask-border-width` != null) __obj.updateDynamic("mask-border-width")(`mask-border-width`.asInstanceOf[js.Any])
    if (`mask-clip` != null) __obj.updateDynamic("mask-clip")(`mask-clip`.asInstanceOf[js.Any])
    if (`mask-composite` != null) __obj.updateDynamic("mask-composite")(`mask-composite`.asInstanceOf[js.Any])
    if (`mask-image` != null) __obj.updateDynamic("mask-image")(`mask-image`.asInstanceOf[js.Any])
    if (`mask-mode` != null) __obj.updateDynamic("mask-mode")(`mask-mode`.asInstanceOf[js.Any])
    if (`mask-origin` != null) __obj.updateDynamic("mask-origin")(`mask-origin`.asInstanceOf[js.Any])
    if (`mask-position` != null) __obj.updateDynamic("mask-position")(`mask-position`.asInstanceOf[js.Any])
    if (`mask-repeat` != null) __obj.updateDynamic("mask-repeat")(`mask-repeat`.asInstanceOf[js.Any])
    if (`mask-size` != null) __obj.updateDynamic("mask-size")(`mask-size`.asInstanceOf[js.Any])
    if (`mask-type` != null) __obj.updateDynamic("mask-type")(`mask-type`.asInstanceOf[js.Any])
    if (`max-block-size` != null) __obj.updateDynamic("max-block-size")(`max-block-size`.asInstanceOf[js.Any])
    if (`max-height` != null) __obj.updateDynamic("max-height")(`max-height`.asInstanceOf[js.Any])
    if (`max-inline-size` != null) __obj.updateDynamic("max-inline-size")(`max-inline-size`.asInstanceOf[js.Any])
    if (`max-lines` != null) __obj.updateDynamic("max-lines")(`max-lines`.asInstanceOf[js.Any])
    if (`max-width` != null) __obj.updateDynamic("max-width")(`max-width`.asInstanceOf[js.Any])
    if (`min-block-size` != null) __obj.updateDynamic("min-block-size")(`min-block-size`.asInstanceOf[js.Any])
    if (`min-height` != null) __obj.updateDynamic("min-height")(`min-height`.asInstanceOf[js.Any])
    if (`min-inline-size` != null) __obj.updateDynamic("min-inline-size")(`min-inline-size`.asInstanceOf[js.Any])
    if (`min-width` != null) __obj.updateDynamic("min-width")(`min-width`.asInstanceOf[js.Any])
    if (`mix-blend-mode` != null) __obj.updateDynamic("mix-blend-mode")(`mix-blend-mode`.asInstanceOf[js.Any])
    if (`motion-distance` != null) __obj.updateDynamic("motion-distance")(`motion-distance`.asInstanceOf[js.Any])
    if (`motion-path` != null) __obj.updateDynamic("motion-path")(`motion-path`.asInstanceOf[js.Any])
    if (`motion-rotation` != null) __obj.updateDynamic("motion-rotation")(`motion-rotation`.asInstanceOf[js.Any])
    if (`object-fit` != null) __obj.updateDynamic("object-fit")(`object-fit`.asInstanceOf[js.Any])
    if (`object-position` != null) __obj.updateDynamic("object-position")(`object-position`.asInstanceOf[js.Any])
    if (`offset-anchor` != null) __obj.updateDynamic("offset-anchor")(`offset-anchor`.asInstanceOf[js.Any])
    if (`offset-distance` != null) __obj.updateDynamic("offset-distance")(`offset-distance`.asInstanceOf[js.Any])
    if (`offset-path` != null) __obj.updateDynamic("offset-path")(`offset-path`.asInstanceOf[js.Any])
    if (`offset-position` != null) __obj.updateDynamic("offset-position")(`offset-position`.asInstanceOf[js.Any])
    if (`offset-rotate` != null) __obj.updateDynamic("offset-rotate")(`offset-rotate`.asInstanceOf[js.Any])
    if (`offset-rotation` != null) __obj.updateDynamic("offset-rotation")(`offset-rotation`.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (orphans != null) __obj.updateDynamic("orphans")(orphans.asInstanceOf[js.Any])
    if (`outline-color` != null) __obj.updateDynamic("outline-color")(`outline-color`.asInstanceOf[js.Any])
    if (`outline-offset` != null) __obj.updateDynamic("outline-offset")(`outline-offset`.asInstanceOf[js.Any])
    if (`outline-style` != null) __obj.updateDynamic("outline-style")(`outline-style`.asInstanceOf[js.Any])
    if (`outline-width` != null) __obj.updateDynamic("outline-width")(`outline-width`.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (`overflow-anchor` != null) __obj.updateDynamic("overflow-anchor")(`overflow-anchor`.asInstanceOf[js.Any])
    if (`overflow-block` != null) __obj.updateDynamic("overflow-block")(`overflow-block`.asInstanceOf[js.Any])
    if (`overflow-clip-box` != null) __obj.updateDynamic("overflow-clip-box")(`overflow-clip-box`.asInstanceOf[js.Any])
    if (`overflow-inline` != null) __obj.updateDynamic("overflow-inline")(`overflow-inline`.asInstanceOf[js.Any])
    if (`overflow-wrap` != null) __obj.updateDynamic("overflow-wrap")(`overflow-wrap`.asInstanceOf[js.Any])
    if (`overflow-x` != null) __obj.updateDynamic("overflow-x")(`overflow-x`.asInstanceOf[js.Any])
    if (`overflow-y` != null) __obj.updateDynamic("overflow-y")(`overflow-y`.asInstanceOf[js.Any])
    if (`overscroll-behavior` != null) __obj.updateDynamic("overscroll-behavior")(`overscroll-behavior`.asInstanceOf[js.Any])
    if (`overscroll-behavior-x` != null) __obj.updateDynamic("overscroll-behavior-x")(`overscroll-behavior-x`.asInstanceOf[js.Any])
    if (`overscroll-behavior-y` != null) __obj.updateDynamic("overscroll-behavior-y")(`overscroll-behavior-y`.asInstanceOf[js.Any])
    if (`padding-block` != null) __obj.updateDynamic("padding-block")(`padding-block`.asInstanceOf[js.Any])
    if (`padding-block-end` != null) __obj.updateDynamic("padding-block-end")(`padding-block-end`.asInstanceOf[js.Any])
    if (`padding-block-start` != null) __obj.updateDynamic("padding-block-start")(`padding-block-start`.asInstanceOf[js.Any])
    if (`padding-bottom` != null) __obj.updateDynamic("padding-bottom")(`padding-bottom`.asInstanceOf[js.Any])
    if (`padding-inline` != null) __obj.updateDynamic("padding-inline")(`padding-inline`.asInstanceOf[js.Any])
    if (`padding-inline-end` != null) __obj.updateDynamic("padding-inline-end")(`padding-inline-end`.asInstanceOf[js.Any])
    if (`padding-inline-start` != null) __obj.updateDynamic("padding-inline-start")(`padding-inline-start`.asInstanceOf[js.Any])
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    if (`padding-top` != null) __obj.updateDynamic("padding-top")(`padding-top`.asInstanceOf[js.Any])
    if (`page-break-after` != null) __obj.updateDynamic("page-break-after")(`page-break-after`.asInstanceOf[js.Any])
    if (`page-break-before` != null) __obj.updateDynamic("page-break-before")(`page-break-before`.asInstanceOf[js.Any])
    if (`page-break-inside` != null) __obj.updateDynamic("page-break-inside")(`page-break-inside`.asInstanceOf[js.Any])
    if (`paint-order` != null) __obj.updateDynamic("paint-order")(`paint-order`.asInstanceOf[js.Any])
    if (perspective != null) __obj.updateDynamic("perspective")(perspective.asInstanceOf[js.Any])
    if (`perspective-origin` != null) __obj.updateDynamic("perspective-origin")(`perspective-origin`.asInstanceOf[js.Any])
    if (`place-content` != null) __obj.updateDynamic("place-content")(`place-content`.asInstanceOf[js.Any])
    if (`pointer-events` != null) __obj.updateDynamic("pointer-events")(`pointer-events`.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (`row-gap` != null) __obj.updateDynamic("row-gap")(`row-gap`.asInstanceOf[js.Any])
    if (`ruby-align` != null) __obj.updateDynamic("ruby-align")(`ruby-align`.asInstanceOf[js.Any])
    if (`ruby-merge` != null) __obj.updateDynamic("ruby-merge")(`ruby-merge`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardLonghandPropertiesHyphen[TLength]]
  }
}

