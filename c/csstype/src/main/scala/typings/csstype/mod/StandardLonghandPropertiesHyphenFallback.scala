package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardLonghandPropertiesHyphenFallback[TLength] extends StObject {
  
  /**
    * The CSS **`align-content`** property sets how the browser distributes space between and around content items along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * **Syntax**: `normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position>`
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
  var `align-content`: js.UndefOr[AlignContentProperty | js.Array[AlignContentProperty]] = js.native
  
  /**
    * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align-self property sets the alignment of an item within its containing block. In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment of items on the Block Axis within their grid area.
    *
    * **Syntax**: `normal | stretch | <baseline-position> | [ <overflow-position>? <self-position> ]`
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
  var `align-items`: js.UndefOr[AlignItemsProperty | js.Array[AlignItemsProperty]] = js.native
  
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position>`
    *
    * **Initial value**: `auto`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **36**  | **20**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
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
  var `align-self`: js.UndefOr[AlignSelfProperty | js.Array[AlignSelfProperty]] = js.native
  
  /**
    * The **`align-tracks`** CSS property sets the alignment in the masonry axis for grid containers that have masonry in their block axis.
    *
    * **Syntax**: `[ normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position> ]#`
    *
    * **Initial value**: `normal`
    */
  var `align-tracks`: js.UndefOr[AlignTracksProperty | js.Array[AlignTracksProperty]] = js.native
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
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
  var `animation-delay`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
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
  var `animation-direction`: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.native
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
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
  var `animation-duration`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
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
  var `animation-fill-mode`: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.native
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
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
  var `animation-iteration-count`: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.native
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
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
  var `animation-name`: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.native
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
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
  var `animation-play-state`: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.native
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
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
  var `animation-timing-function`: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.native
  
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Syntax**: `none | auto | textfield | menulist-button | <compat-auto>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox |   Safari    |   Edge   | IE  |
    * | :-----: | :-----: | :---------: | :------: | :-: |
    * | **84**  | **80**  | **3** _-x-_ |  **84**  | No  |
    * | 1 _-x-_ | 1 _-x-_ |             | 12 _-x-_ |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/appearance
    */
  var appearance: js.UndefOr[AppearanceProperty | js.Array[AppearanceProperty]] = js.native
  
  /**
    * The **`aspect-ratio`**    CSS property sets a _**preferred aspect ratio**_ for the box, which will be used in the calculation of auto sizes and some other layout functions.
    *
    * **Syntax**: `auto | <ratio>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |   n/a   |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/aspect-ratio
    */
  var `aspect-ratio`: js.UndefOr[AspectRatioProperty | js.Array[AspectRatioProperty]] = js.native
  
  /**
    * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
    *
    * **Syntax**: `none | <filter-function-list>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |   Safari    |  Edge  | IE  |
    * | :----: | :-----: | :---------: | :----: | :-: |
    * | **76** |   n/a   | **9** _-x-_ | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backdrop-filter
    */
  var `backdrop-filter`: js.UndefOr[BackdropFilterProperty | js.Array[BackdropFilterProperty]] = js.native
  
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Syntax**: `visible | hidden`
    *
    * **Initial value**: `visible`
    *
    * |  Chrome  | Firefox  |    Safari     |  Edge  |   IE   |
    * | :------: | :------: | :-----------: | :----: | :----: |
    * |  **36**  |  **16**  | **5.1** _-x-_ | **12** | **10** |
    * | 12 _-x-_ | 10 _-x-_ |               |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/backface-visibility
    */
  var `backface-visibility`: js.UndefOr[BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]] = js.native
  
  /**
    * The **`background-attachment`** CSS property sets whether a background image's position is fixed within the viewport, or scrolls with its containing block.
    *
    * **Syntax**: `<attachment>#`
    *
    * **Initial value**: `scroll`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-attachment
    */
  var `background-attachment`: js.UndefOr[BackgroundAttachmentProperty | js.Array[BackgroundAttachmentProperty]] = js.native
  
  /**
    * The **`background-blend-mode`** CSS property sets how an element's background images should blend with each other and with the element's background color.
    *
    * **Syntax**: `<blend-mode>#`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **35** | **30**  | **8**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-blend-mode
    */
  var `background-blend-mode`: js.UndefOr[BackgroundBlendModeProperty | js.Array[BackgroundBlendModeProperty]] = js.native
  
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `border-box`
    *
    * | Chrome | Firefox |   Safari    |  Edge  |  IE   |
    * | :----: | :-----: | :---------: | :----: | :---: |
    * | **1**  |  **4**  | **3** _-x-_ | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-clip
    */
  var `background-clip`: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.native
  
  /**
    * The **`background-color`** CSS property sets the background color of an element.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `transparent`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-color
    */
  var `background-color`: js.UndefOr[BackgroundColorProperty | js.Array[BackgroundColorProperty]] = js.native
  
  /**
    * The **`background-image`** CSS property sets one or more background images on an element.
    *
    * **Syntax**: `<bg-image>#`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-image
    */
  var `background-image`: js.UndefOr[BackgroundImageProperty | js.Array[BackgroundImageProperty]] = js.native
  
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **4**  | **3**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-origin
    */
  var `background-origin`: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.native
  
  /**
    * The **`background-position`** CSS property sets the initial position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Syntax**: `<bg-position>#`
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
  ] = js.native
  
  /**
    * The **`background-position-x`** CSS property sets the initial horizontal position for each background image. The position is relative to the position layer set by `background-origin`.
    *
    * **Syntax**: `[ center | [ [ left | right | x-start | x-end ]? <length-percentage>? ]! ]#`
    *
    * **Initial value**: `left`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **49**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-x
    */
  var `background-position-x`: js.UndefOr[
    BackgroundPositionXProperty[TLength] | js.Array[BackgroundPositionXProperty[TLength]]
  ] = js.native
  
  /**
    * The **`background-position-y`** CSS property sets the initial vertical position, relative to the background position layer defined by `background-origin`, for each defined background image.
    *
    * **Syntax**: `[ center | [ [ top | bottom | y-start | y-end ]? <length-percentage>? ]! ]#`
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **49**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-position-y
    */
  var `background-position-y`: js.UndefOr[
    BackgroundPositionYProperty[TLength] | js.Array[BackgroundPositionYProperty[TLength]]
  ] = js.native
  
  /**
    * The **`background-repeat`** CSS property sets how background images are repeated. A background image can be repeated along the horizontal and vertical axes, or not repeated at all.
    *
    * **Syntax**: `<repeat-style>#`
    *
    * **Initial value**: `repeat`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-repeat
    */
  var `background-repeat`: js.UndefOr[BackgroundRepeatProperty | js.Array[BackgroundRepeatProperty]] = js.native
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * |  **3**  |  **4**  |  **5**  | **12** | **9** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-size
    */
  var `background-size`: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
  
  /**
    * **Syntax**: `clip | ellipsis | <string>`
    *
    * **Initial value**: `clip`
    */
  var `block-overflow`: js.UndefOr[BlockOverflowProperty | js.Array[BlockOverflowProperty]] = js.native
  
  /**
    * The **`block-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Syntax**: `<'width'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/block-size
    */
  var `block-size`: js.UndefOr[BlockSizeProperty[TLength] | js.Array[BlockSizeProperty[TLength]]] = js.native
  
  /**
    * The **`border-block-color`** CSS property defines the color of the logical block borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>{1,2}`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-color
    */
  var `border-block-color`: js.UndefOr[BorderBlockColorProperty | js.Array[BorderBlockColorProperty]] = js.native
  
  /**
    * The **`border-block-end-color`** CSS property defines the color of the logical block-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-color
    */
  var `border-block-end-color`: js.UndefOr[BorderBlockEndColorProperty | js.Array[BorderBlockEndColorProperty]] = js.native
  
  /**
    * The **`border-block-end-style`** CSS property defines the style of the logical block end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-style
    */
  var `border-block-end-style`: js.UndefOr[BorderBlockEndStyleProperty | js.Array[BorderBlockEndStyleProperty]] = js.native
  
  /**
    * The **`border-block-end-width`** CSS property defines the width of the logical block-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-end-width
    */
  var `border-block-end-width`: js.UndefOr[
    BorderBlockEndWidthProperty[TLength] | js.Array[BorderBlockEndWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-block-start-color`** CSS property defines the color of the logical block-start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-color
    */
  var `border-block-start-color`: js.UndefOr[BorderBlockStartColorProperty | js.Array[BorderBlockStartColorProperty]] = js.native
  
  /**
    * The **`border-block-start-style`** CSS property defines the style of the logical block start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-style
    */
  var `border-block-start-style`: js.UndefOr[BorderBlockStartStyleProperty | js.Array[BorderBlockStartStyleProperty]] = js.native
  
  /**
    * The **`border-block-start-width`** CSS property defines the width of the logical block-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-start-width
    */
  var `border-block-start-width`: js.UndefOr[
    BorderBlockStartWidthProperty[TLength] | js.Array[BorderBlockStartWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-block-style`** CSS property defines the style of the logical block borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-style
    */
  var `border-block-style`: js.UndefOr[BorderBlockStyleProperty | js.Array[BorderBlockStyleProperty]] = js.native
  
  /**
    * The **`border-block-width`** CSS property defines the width of the logical block borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-block-width
    */
  var `border-block-width`: js.UndefOr[BorderBlockWidthProperty[TLength] | js.Array[BorderBlockWidthProperty[TLength]]] = js.native
  
  /**
    * The **`border-bottom-color`** CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties `border-color` or `border-bottom`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-color
    */
  var `border-bottom-color`: js.UndefOr[BorderBottomColorProperty | js.Array[BorderBottomColorProperty]] = js.native
  
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
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
  ] = js.native
  
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
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
  ] = js.native
  
  /**
    * The **`border-bottom-style`** CSS property sets the line style of an element's bottom `border`.
    *
    * **Syntax**: `<line-style>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-bottom-style
    */
  var `border-bottom-style`: js.UndefOr[BorderBottomStyleProperty | js.Array[BorderBottomStyleProperty]] = js.native
  
  /**
    * The **`border-bottom-width`** CSS property sets the width of the bottom border of a box.
    *
    * **Syntax**: `<line-width>`
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
  ] = js.native
  
  /**
    * The **`border-collapse`** CSS property sets whether cells inside a `<table>` have shared or separate borders.
    *
    * **Syntax**: `collapse | separate`
    *
    * **Initial value**: `separate`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-collapse
    */
  var `border-collapse`: js.UndefOr[BorderCollapseProperty | js.Array[BorderCollapseProperty]] = js.native
  
  /**
    * The **`border-end-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-end-radius
    */
  var `border-end-end-radius`: js.UndefOr[
    BorderEndEndRadiusProperty[TLength] | js.Array[BorderEndEndRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-end-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-end-start-radius
    */
  var `border-end-start-radius`: js.UndefOr[
    BorderEndStartRadiusProperty[TLength] | js.Array[BorderEndStartRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-image-outset`** CSS property sets the distance by which an element's border image is set out from its border box.
    *
    * **Syntax**: `[ <length> | <number> ]{1,4}`
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
  ] = js.native
  
  /**
    * The **`border-image-repeat`** CSS property defines how the edge regions of a source image are adjusted to fit the dimensions of an element's border image.
    *
    * **Syntax**: `[ stretch | repeat | round | space ]{1,2}`
    *
    * **Initial value**: `stretch`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-repeat
    */
  var `border-image-repeat`: js.UndefOr[BorderImageRepeatProperty | js.Array[BorderImageRepeatProperty]] = js.native
  
  /**
    * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
    *
    * **Syntax**: `<number-percentage>{1,4} && fill?`
    *
    * **Initial value**: `100%`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-slice
    */
  var `border-image-slice`: js.UndefOr[BorderImageSliceProperty | js.Array[BorderImageSliceProperty]] = js.native
  
  /**
    * The **`border-image-source`** CSS property sets the source image used to create an element's border image.
    *
    * **Syntax**: `none | <image>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **15**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-source
    */
  var `border-image-source`: js.UndefOr[BorderImageSourceProperty | js.Array[BorderImageSourceProperty]] = js.native
  
  /**
    * The **`border-image-width`** CSS property sets the width of an element's border image.
    *
    * **Syntax**: `[ <length-percentage> | <number> | auto ]{1,4}`
    *
    * **Initial value**: `1`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **15** | **13**  | **6**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-image-width
    */
  var `border-image-width`: js.UndefOr[BorderImageWidthProperty[TLength] | js.Array[BorderImageWidthProperty[TLength]]] = js.native
  
  /**
    * The **`border-inline-color`** CSS property defines the color of the logical inline borders of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color` and `border-bottom-color`, or `border-right-color` and `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>{1,2}`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-color
    */
  var `border-inline-color`: js.UndefOr[BorderInlineColorProperty | js.Array[BorderInlineColorProperty]] = js.native
  
  /**
    * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
    * | :----: | :-------------------------: | :------: | :----: | :-: |
    * | **69** |           **41**            | **12.1** | **79** | No  |
    * |        | 3 _(-moz-border-end-color)_ |          |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-color
    */
  var `border-inline-end-color`: js.UndefOr[BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]] = js.native
  
  /**
    * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
    * | :----: | :-------------------------: | :------: | :----: | :-: |
    * | **69** |           **41**            | **12.1** | **79** | No  |
    * |        | 3 _(-moz-border-end-style)_ |          |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-style
    */
  var `border-inline-end-style`: js.UndefOr[BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]] = js.native
  
  /**
    * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome |           Firefox           |  Safari  |  Edge  | IE  |
    * | :----: | :-------------------------: | :------: | :----: | :-: |
    * | **69** |           **41**            | **12.1** | **79** | No  |
    * |        | 3 _(-moz-border-end-width)_ |          |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-end-width
    */
  var `border-inline-end-width`: js.UndefOr[
    BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome |            Firefox            |  Safari  |  Edge  | IE  |
    * | :----: | :---------------------------: | :------: | :----: | :-: |
    * | **69** |            **41**             | **12.1** | **79** | No  |
    * |        | 3 _(-moz-border-start-color)_ |          |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-color
    */
  var `border-inline-start-color`: js.UndefOr[BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]] = js.native
  
  /**
    * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome |            Firefox            |  Safari  |  Edge  | IE  |
    * | :----: | :---------------------------: | :------: | :----: | :-: |
    * | **69** |            **41**             | **12.1** | **79** | No  |
    * |        | 3 _(-moz-border-start-style)_ |          |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-style
    */
  var `border-inline-start-style`: js.UndefOr[BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]] = js.native
  
  /**
    * The **`border-inline-start-width`** CSS property defines the width of the logical inline-start border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-start-width
    */
  var `border-inline-start-width`: js.UndefOr[
    BorderInlineStartWidthProperty[TLength] | js.Array[BorderInlineStartWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-inline-style`** CSS property defines the style of the logical inline borders of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style` and `border-bottom-style`, or `border-left-style` and `border-right-style` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-style
    */
  var `border-inline-style`: js.UndefOr[BorderInlineStyleProperty | js.Array[BorderInlineStyleProperty]] = js.native
  
  /**
    * The **`border-inline-width`** CSS property defines the width of the logical inline borders of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width` and `border-bottom-width`, or `border-left-width`, and `border-right-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-inline-width
    */
  var `border-inline-width`: js.UndefOr[
    BorderInlineWidthProperty[TLength] | js.Array[BorderInlineWidthProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-left-color`** CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties `border-color` or `border-left`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-color
    */
  var `border-left-color`: js.UndefOr[BorderLeftColorProperty | js.Array[BorderLeftColorProperty]] = js.native
  
  /**
    * The **`border-left-style`** CSS property sets the line style of an element's left `border`.
    *
    * **Syntax**: `<line-style>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-style
    */
  var `border-left-style`: js.UndefOr[BorderLeftStyleProperty | js.Array[BorderLeftStyleProperty]] = js.native
  
  /**
    * The **`border-left-width`** CSS property sets the width of the left border of an element.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-left-width
    */
  var `border-left-width`: js.UndefOr[BorderLeftWidthProperty[TLength] | js.Array[BorderLeftWidthProperty[TLength]]] = js.native
  
  /**
    * The **`border-right-color`** CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties `border-color` or `border-right`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-color
    */
  var `border-right-color`: js.UndefOr[BorderRightColorProperty | js.Array[BorderRightColorProperty]] = js.native
  
  /**
    * The **`border-right-style`** CSS property sets the line style of an element's right `border`.
    *
    * **Syntax**: `<line-style>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-style
    */
  var `border-right-style`: js.UndefOr[BorderRightStyleProperty | js.Array[BorderRightStyleProperty]] = js.native
  
  /**
    * The **`border-right-width`** CSS property sets the width of the right border of an element.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-right-width
    */
  var `border-right-width`: js.UndefOr[BorderRightWidthProperty[TLength] | js.Array[BorderRightWidthProperty[TLength]]] = js.native
  
  /**
    * The **`border-spacing`** CSS property sets the distance between the borders of adjacent `<table>` cells. This property applies only when `border-collapse` is `separate`.
    *
    * **Syntax**: `<length> <length>?`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-spacing
    */
  var `border-spacing`: js.UndefOr[BorderSpacingProperty[TLength] | js.Array[BorderSpacingProperty[TLength]]] = js.native
  
  /**
    * The **`border-start-end-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius depending on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-end-radius
    */
  var `border-start-end-radius`: js.UndefOr[
    BorderStartEndRadiusProperty[TLength] | js.Array[BorderStartEndRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-start-start-radius`** CSS property defines a logical border radius on an element, which maps to a physical border radius that depends on the element's `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-start-start-radius
    */
  var `border-start-start-radius`: js.UndefOr[
    BorderStartStartRadiusProperty[TLength] | js.Array[BorderStartStartRadiusProperty[TLength]]
  ] = js.native
  
  /**
    * The **`border-top-color`** CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties `border-color` or `border-top`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-color
    */
  var `border-top-color`: js.UndefOr[BorderTopColorProperty | js.Array[BorderTopColorProperty]] = js.native
  
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
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
  ] = js.native
  
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
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
  ] = js.native
  
  /**
    * The **`border-top-style`** CSS property sets the line style of an element's top `border`.
    *
    * **Syntax**: `<line-style>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-style
    */
  var `border-top-style`: js.UndefOr[BorderTopStyleProperty | js.Array[BorderTopStyleProperty]] = js.native
  
  /**
    * The **`border-top-width`** CSS property sets the width of the top border of an element.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/border-top-width
    */
  var `border-top-width`: js.UndefOr[BorderTopWidthProperty[TLength] | js.Array[BorderTopWidthProperty[TLength]]] = js.native
  
  /**
    * The **`bottom`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/bottom
    */
  var bottom: js.UndefOr[BottomProperty[TLength] | js.Array[BottomProperty[TLength]]] = js.native
  
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Syntax**: `slice | clone`
    *
    * **Initial value**: `slice`
    *
    * |    Chrome    | Firefox |    Safari     |     Edge     | IE  |
    * | :----------: | :-----: | :-----------: | :----------: | :-: |
    * | **22** _-x-_ | **32**  | **6.1** _-x-_ | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-decoration-break
    */
  var `box-decoration-break`: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.native
  
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Syntax**: `none | <shadow>#`
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
  var `box-shadow`: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.native
  
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Syntax**: `content-box | border-box`
    *
    * **Initial value**: `content-box`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |  IE   |
    * | :-----: | :-----: | :-----: | :----: | :---: |
    * | **10**  | **29**  | **5.1** | **12** | **8** |
    * | 1 _-x-_ | 1 _-x-_ | 3 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/box-sizing
    */
  var `box-sizing`: js.UndefOr[BoxSizingProperty | js.Array[BoxSizingProperty]] = js.native
  
  /**
    * The **`break-after`** CSS property defines how page, column, or region breaks should behave after a generated box. If there is no generated box, the property is ignored.
    *
    * **Syntax**: `auto | avoid | always | all | avoid-page | page | left | right | recto | verso | avoid-column | column | avoid-region | region`
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
    * @see https://developer.mozilla.org/docs/Web/CSS/break-after
    */
  var `break-after`: js.UndefOr[BreakAfterProperty | js.Array[BreakAfterProperty]] = js.native
  
  /**
    * The **`break-before`** CSS property sets how page, column, or region breaks should behave before a generated box. If there is no generated box, the property is ignored.
    *
    * **Syntax**: `auto | avoid | always | all | avoid-page | page | left | right | recto | verso | avoid-column | column | avoid-region | region`
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
    * @see https://developer.mozilla.org/docs/Web/CSS/break-before
    */
  var `break-before`: js.UndefOr[BreakBeforeProperty | js.Array[BreakBeforeProperty]] = js.native
  
  /**
    * The **`break-inside`** CSS property defines how page, column, or region breaks should behave inside a generated box. If there is no generated box, the property is ignored.
    *
    * **Syntax**: `auto | avoid | avoid-page | avoid-column | avoid-region`
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
    * @see https://developer.mozilla.org/docs/Web/CSS/break-inside
    */
  var `break-inside`: js.UndefOr[BreakInsideProperty | js.Array[BreakInsideProperty]] = js.native
  
  /**
    * The **`caption-side`** CSS property puts the content of a table's `<caption>` on the specified side. The values are relative to the `writing-mode` of the table.
    *
    * **Syntax**: `top | bottom | block-start | block-end | inline-start | inline-end`
    *
    * **Initial value**: `top`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caption-side
    */
  var `caption-side`: js.UndefOr[CaptionSideProperty | js.Array[CaptionSideProperty]] = js.native
  
  /**
    * The **`caret-color`** CSS property sets the color of the insertion caret, the visible marker where the next character typed will be inserted. The caret appears in elements such as `<input>` or those with the `contenteditable` attribute. The caret is typically a thin vertical line that flashes to help make it more noticeable. By default, it is black, but its color can be altered with this property.
    *
    * **Syntax**: `auto | <color>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **53**  | **11.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/caret-color
    */
  var `caret-color`: js.UndefOr[CaretColorProperty | js.Array[CaretColorProperty]] = js.native
  
  /**
    * The **`clear`** CSS property sets whether an element must be moved below (cleared) floating elements that precede it. The `clear` property applies to floating and non-floating elements.
    *
    * **Syntax**: `none | left | right | both | inline-start | inline-end`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clear
    */
  var clear: js.UndefOr[ClearProperty | js.Array[ClearProperty]] = js.native
  
  /**
    * The `**clip-path**` CSS property creates a clipping region that sets what part of an element should be shown. Parts that are inside the region are shown, while those outside are hidden.
    *
    * **Syntax**: `<clip-source> | [ <basic-shape> || <geometry-box> ] | none`
    *
    * **Initial value**: `none`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **55**  | **3.5** |  **9.1**  | **12** | **10** |
    * | 23 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/clip-path
    */
  var `clip-path`: js.UndefOr[ClipPathProperty | js.Array[ClipPathProperty]] = js.native
  
  /**
    * The **`color`** CSS property sets the foreground color value of an element's text and text decorations, and sets the `currentcolor` value. `currentcolor` may be used as an indirect value on _other_ properties and is the default for other color properties, such as `border-color`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: Varies from one browser to another
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color
    */
  var color: js.UndefOr[ColorProperty | js.Array[ColorProperty]] = js.native
  
  /**
    * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
    *
    * **Syntax**: `economy | exact`
    *
    * **Initial value**: `economy`
    *
    * |                Chrome                 | Firefox |                Safari                |                 Edge                  | IE  |
    * | :-----------------------------------: | :-----: | :----------------------------------: | :-----------------------------------: | :-: |
    * | **49** _(-webkit-print-color-adjust)_ | **48**  | **6** _(-webkit-print-color-adjust)_ | **79** _(-webkit-print-color-adjust)_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/color-adjust
    */
  var `color-adjust`: js.UndefOr[ColorAdjustProperty | js.Array[ColorAdjustProperty]] = js.native
  
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Syntax**: `<integer> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-count
    */
  var `column-count`: js.UndefOr[ColumnCountProperty | js.Array[ColumnCountProperty]] = js.native
  
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Syntax**: `auto | balance | balance-all`
    *
    * **Initial value**: `balance`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **50** | **52**  |  **9**  | **12** | **10** |
    * |        |         | 8 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-fill
    */
  var `column-fill`: js.UndefOr[ColumnFillProperty | js.Array[ColumnFillProperty]] = js.native
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **84** | **63**  |   No   | **84** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |         Chrome         |        Firefox         |          Safari          |  Edge  | IE  |
    * | :--------------------: | :--------------------: | :----------------------: | :----: | :-: |
    * |         **66**         |         **61**         |         **12.1**         | **16** | No  |
    * | 57 _(grid-column-gap)_ | 52 _(grid-column-gap)_ | 10.1 _(grid-column-gap)_ |        |     |
    *
    * ---
    *
    * _Supported in Multi-column Layout_
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  | **10**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-gap
    */
  var `column-gap`: js.UndefOr[ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]] = js.native
  
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-color
    */
  var `column-rule-color`: js.UndefOr[ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]] = js.native
  
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-style
    */
  var `column-rule-style`: js.UndefOr[ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]] = js.native
  
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-width'>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **52**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-rule-width
    */
  var `column-rule-width`: js.UndefOr[ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]] = js.native
  
  /**
    * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
    *
    * **Syntax**: `none | all`
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :-----: | :-----: | :-------: | :----: | :----: |
    * | **50**  | **71**  |   **9**   | **12** | **10** |
    * | 6 _-x-_ |         | 5.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-span
    */
  var `column-span`: js.UndefOr[ColumnSpanProperty | js.Array[ColumnSpanProperty]] = js.native
  
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Syntax**: `<length> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :-----: | :-----: | :-----: | :----: | :----: |
    * | **50**  | **50**  |  **9**  | **12** | **10** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/column-width
    */
  var `column-width`: js.UndefOr[ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]] = js.native
  
  /**
    * The **`contain`** CSS property allows an author to indicate that an element and its contents are, as much as possible, _independent_ of the rest of the document tree. This allows the browser to recalculate layout, style, paint, size, or any combination of them for a limited area of the DOM and not the entire page.
    *
    * **Syntax**: `none | strict | content | [ size || layout || style || paint ]`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **52** | **69**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/contain
    */
  var contain: js.UndefOr[ContainProperty | js.Array[ContainProperty]] = js.native
  
  /**
    * The **`content`** CSS property replaces an element with a generated value. Objects inserted using the `content` property are _anonymous replaced elements._
    *
    * **Syntax**: `normal | none | [ <content-replacement> | <content-list> ] [/ <string> ]?`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/content
    */
  var content: js.UndefOr[ContentProperty | js.Array[ContentProperty]] = js.native
  
  /**
    * The **`counter-increment`** CSS property increases or decreases the value of a CSS counter by a given value.
    *
    * **Syntax**: `[ <custom-ident> <integer>? ]+ | none`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **3**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-increment
    */
  var `counter-increment`: js.UndefOr[CounterIncrementProperty | js.Array[CounterIncrementProperty]] = js.native
  
  /**
    * The **`counter-reset`** CSS property resets a CSS counter to a given value.
    *
    * **Syntax**: `[ <custom-ident> <integer>? ]+ | none`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **3**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-reset
    */
  var `counter-reset`: js.UndefOr[CounterResetProperty | js.Array[CounterResetProperty]] = js.native
  
  /**
    * The **`counter-set`** CSS property sets a CSS counter to a given value. It manipulates the value of existing counters, and will only create new counters if there isn't already a counter of the given name on the element.
    *
    * **Syntax**: `[ <custom-ident> <integer>? ]+ | none`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **85** | **68**  |   No   | **85** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/counter-set
    */
  var `counter-set`: js.UndefOr[CounterSetProperty | js.Array[CounterSetProperty]] = js.native
  
  /**
    * The **`cursor`** CSS property sets mouse cursor to display when the mouse pointer is over an element.
    *
    * **Syntax**: `[ [ <url> [ <x> <y> ]? , ]* [ auto | default | none | context-menu | help | pointer | progress | wait | cell | crosshair | text | vertical-text | alias | copy | move | no-drop | not-allowed | e-resize | n-resize | ne-resize | nw-resize | s-resize | se-resize | sw-resize | w-resize | ew-resize | ns-resize | nesw-resize | nwse-resize | col-resize | row-resize | all-scroll | zoom-in | zoom-out | grab | grabbing ] ]`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/cursor
    */
  var cursor: js.UndefOr[CursorProperty | js.Array[CursorProperty]] = js.native
  
  /**
    * The **`direction`** CSS property sets the direction of text, table columns, and horizontal overflow. Use `rtl` for languages written from right to left (like Hebrew or Arabic), and `ltr` for those written from left to right (like English and most other languages).
    *
    * **Syntax**: `ltr | rtl`
    *
    * **Initial value**: `ltr`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **2**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/direction
    */
  var direction: js.UndefOr[DirectionProperty | js.Array[DirectionProperty]] = js.native
  
  /**
    * The **`display`** CSS property defines the _display type_ of an element, which consists of the two basic qualities of how an element generates boxes — the **outer display type** defining how the box participates in flow layout, and the **inner display type** defining how the children of the box are laid out.
    *
    * **Syntax**: `[ <display-outside> || <display-inside> ] | <display-listitem> | <display-internal> | <display-box> | <display-legacy>`
    *
    * **Initial value**: `inline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/display
    */
  var display: js.UndefOr[DisplayProperty | js.Array[DisplayProperty]] = js.native
  
  /**
    * The **`empty-cells`** CSS property sets whether borders and backgrounds appear around `<table>` cells that have no visible content.
    *
    * **Syntax**: `show | hide`
    *
    * **Initial value**: `show`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/empty-cells
    */
  var `empty-cells`: js.UndefOr[EmptyCellsProperty | js.Array[EmptyCellsProperty]] = js.native
  
  /**
    * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
    *
    * **Syntax**: `none | <filter-function-list>`
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
  var filter: js.UndefOr[FilterProperty | js.Array[FilterProperty]] = js.native
  
  /**
    * The **`flex-basis`** CSS property sets the initial main size of a flex item. It sets the size of the content box unless otherwise set with `box-sizing`.
    *
    * **Syntax**: `content | <'width'>`
    *
    * **Initial value**: `auto`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **29**  | **22**  |  **9**  | **12** | **11** |
    * | 22 _-x-_ |         | 7 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-basis
    */
  var `flex-basis`: js.UndefOr[FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]] = js.native
  
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Syntax**: `row | row-reverse | column | column-reverse`
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
  var `flex-direction`: js.UndefOr[FlexDirectionProperty | js.Array[FlexDirectionProperty]] = js.native
  
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |            IE            |
    * | :------: | :-----: | :-------: | :----: | :----------------------: |
    * |  **29**  | **20**  |   **9**   | **12** |          **11**          |
    * | 22 _-x-_ |         | 6.1 _-x-_ |        | 10 _(-ms-flex-positive)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-grow
    */
  var `flex-grow`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `1`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  |   IE   |
    * | :------: | :-----: | :-----: | :----: | :----: |
    * |  **29**  | **20**  |  **9**  | **12** | **10** |
    * | 22 _-x-_ |         | 8 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-shrink
    */
  var `flex-shrink`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * **Syntax**: `nowrap | wrap | wrap-reverse`
    *
    * **Initial value**: `nowrap`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **29**  | **28**  |   **9**   | **12** | **11** |
    * | 21 _-x-_ |         | 6.1 _-x-_ |        |        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/flex-wrap
    */
  var `flex-wrap`: js.UndefOr[FlexWrapProperty | js.Array[FlexWrapProperty]] = js.native
  
  /**
    * The **`float`** CSS property places an element on the left or right side of its container, allowing text and inline elements to wrap around it. The element is removed from the normal flow of the page, though still remaining a part of the flow (in contrast to absolute positioning).
    *
    * **Syntax**: `left | right | none | inline-start | inline-end`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/float
    */
  var float: js.UndefOr[FloatProperty | js.Array[FloatProperty]] = js.native
  
  /**
    * The **`font-family`** CSS property specifies a prioritized list of one or more font family names and/or generic family names for the selected element.
    *
    * **Syntax**: `[ <family-name> | <generic-family> ]#`
    *
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-family
    */
  var `font-family`: js.UndefOr[FontFamilyProperty | js.Array[FontFamilyProperty]] = js.native
  
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Syntax**: `normal | <feature-tag-value>#`
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
  var `font-feature-settings`: js.UndefOr[FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]] = js.native
  
  /**
    * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
    *
    * **Syntax**: `auto | normal | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **33** | **32**  |  **9**  | **79** | No  |
    * |        |         | 6 _-x-_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-kerning
    */
  var `font-kerning`: js.UndefOr[FontKerningProperty | js.Array[FontKerningProperty]] = js.native
  
  /**
    * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
    *
    * **Syntax**: `normal | <string>`
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
  var `font-language-override`: js.UndefOr[FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]] = js.native
  
  /**
    * The **`font-optical-sizing`** CSS property sets whether text rendering is optimized for viewing at different sizes. This only works for fonts that have an optical size variation axis.
    *
    * **Syntax**: `auto | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **79** | **62**  | **11** | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-optical-sizing
    */
  var `font-optical-sizing`: js.UndefOr[FontOpticalSizingProperty | js.Array[FontOpticalSizingProperty]] = js.native
  
  /**
    * The **`font-size`** CSS property sets the size of the font. This property is also used to compute the size of `em`, `ex`, and other relative `<length>` units.
    *
    * **Syntax**: `<absolute-size> | <relative-size> | <length-percentage>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size
    */
  var `font-size`: js.UndefOr[FontSizeProperty[TLength] | js.Array[FontSizeProperty[TLength]]] = js.native
  
  /**
    * The **`font-size-adjust`** CSS property sets how the font size should be chosen based on the height of lowercase rather than capital letters.
    *
    * **Syntax**: `none | <number>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |  **1**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-size-adjust
    */
  var `font-size-adjust`: js.UndefOr[FontSizeAdjustProperty | js.Array[FontSizeAdjustProperty]] = js.native
  
  /**
    * The **`font-smooth`** CSS property controls the application of anti-aliasing when fonts are rendered.
    *
    * **Syntax**: `auto | never | always | <absolute-size> | <length>`
    *
    * **Initial value**: `auto`
    *
    * |              Chrome              |              Firefox               |              Safari              |               Edge                | IE  |
    * | :------------------------------: | :--------------------------------: | :------------------------------: | :-------------------------------: | :-: |
    * | **5** _(-webkit-font-smoothing)_ | **25** _(-moz-osx-font-smoothing)_ | **4** _(-webkit-font-smoothing)_ | **79** _(-webkit-font-smoothing)_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-smooth
    */
  var `font-smooth`: js.UndefOr[FontSmoothProperty[TLength] | js.Array[FontSmoothProperty[TLength]]] = js.native
  
  /**
    * The **`font-stretch`** CSS property selects a normal, condensed, or expanded face from a font.
    *
    * **Syntax**: `<font-stretch-absolute>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **60** |  **9**  | **11** | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-stretch
    */
  var `font-stretch`: js.UndefOr[FontStretchProperty | js.Array[FontStretchProperty]] = js.native
  
  /**
    * The **`font-style`** CSS property sets whether a font should be styled with a normal, italic, or oblique face from its `font-family`.
    *
    * **Syntax**: `normal | italic | oblique <angle>?`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-style
    */
  var `font-style`: js.UndefOr[FontStyleProperty | js.Array[FontStyleProperty]] = js.native
  
  /**
    * The **`font-synthesis`** CSS property controls which missing typefaces, bold or italic, may be synthesized by the browser.
    *
    * **Syntax**: `none | [ weight || style ]`
    *
    * **Initial value**: `weight style`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-synthesis
    */
  var `font-synthesis`: js.UndefOr[FontSynthesisProperty | js.Array[FontSynthesisProperty]] = js.native
  
  /**
    * The **font-variant** CSS property is a shorthand for the longhand properties `font-variant-caps`, `font-variant-numeric`, `font-variant-alternates`, `font-variant-ligatures`, and `font-variant-east-asian`. You can also set the CSS Level 2 (Revision 1) values of `font-variant`, (that is, `normal` or `small-caps`), by using the `font` shorthand.
    *
    * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> || stylistic( <feature-value-name> ) || historical-forms || styleset( <feature-value-name># ) || character-variant( <feature-value-name># ) || swash( <feature-value-name> ) || ornaments( <feature-value-name> ) || annotation( <feature-value-name> ) || [ small-caps | all-small-caps | petite-caps | all-petite-caps | unicase | titling-caps ] || <numeric-figure-values> || <numeric-spacing-values> || <numeric-fraction-values> || ordinal || slashed-zero || <east-asian-variant-values> || <east-asian-width-values> || ruby ]`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant
    */
  var `font-variant`: js.UndefOr[FontVariantProperty | js.Array[FontVariantProperty]] = js.native
  
  /**
    * The **`font-variant-caps`** CSS property controls the use of alternate glyphs for capital letters.
    *
    * **Syntax**: `normal | small-caps | all-small-caps | petite-caps | all-petite-caps | unicase | titling-caps`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **52** | **34**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-caps
    */
  var `font-variant-caps`: js.UndefOr[FontVariantCapsProperty | js.Array[FontVariantCapsProperty]] = js.native
  
  /**
    * The **`font-variant-east-asian`** CSS property controls the use of alternate glyphs for East Asian scripts, like Japanese and Chinese.
    *
    * **Syntax**: `normal | [ <east-asian-variant-values> || <east-asian-width-values> || ruby ]`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **34**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-east-asian
    */
  var `font-variant-east-asian`: js.UndefOr[FontVariantEastAsianProperty | js.Array[FontVariantEastAsianProperty]] = js.native
  
  /**
    * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
    *
    * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> ]`
    *
    * **Initial value**: `normal`
    *
    * |  Chrome  | Firefox | Safari  |  Edge  | IE  |
    * | :------: | :-----: | :-----: | :----: | :-: |
    * |  **34**  | **34**  | **9.1** | **79** | No  |
    * | 31 _-x-_ |         | 7 _-x-_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-ligatures
    */
  var `font-variant-ligatures`: js.UndefOr[FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]] = js.native
  
  /**
    * The **`font-variant-numeric`** CSS property controls the usage of alternate glyphs for numbers, fractions, and ordinal markers.
    *
    * **Syntax**: `normal | [ <numeric-figure-values> || <numeric-spacing-values> || <numeric-fraction-values> || ordinal || slashed-zero ]`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **52** | **34**  | **9.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-numeric
    */
  var `font-variant-numeric`: js.UndefOr[FontVariantNumericProperty | js.Array[FontVariantNumericProperty]] = js.native
  
  /**
    * The **`font-variant-position`** CSS property controls the use of alternate, smaller glyphs that are positioned as superscript or subscript.
    *
    * **Syntax**: `normal | sub | super`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **34**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variant-position
    */
  var `font-variant-position`: js.UndefOr[FontVariantPositionProperty | js.Array[FontVariantPositionProperty]] = js.native
  
  /**
    * The **`font-variation-settings`** CSS property provides low-level control over variable font characteristics, by specifying the four letter axis names of the characteristics you want to vary, along with their values.
    *
    * **Syntax**: `normal | [ <string> <number> ]#`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **62** | **62**  | **11** | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-variation-settings
    */
  var `font-variation-settings`: js.UndefOr[FontVariationSettingsProperty | js.Array[FontVariationSettingsProperty]] = js.native
  
  /**
    * The **`font-weight`** CSS property specifies the weight (or boldness) of the font. The font weights available to you will depend on the `font-family` you are using. Some fonts are only available in `normal` and `bold`.
    *
    * **Syntax**: `<font-weight-absolute> | bolder | lighter`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **2**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/font-weight
    */
  var `font-weight`: js.UndefOr[FontWeightProperty | js.Array[FontWeightProperty]] = js.native
  
  /**
    * The **`grid-auto-columns`** CSS property specifies the size of an implicitly-created grid column track.
    *
    * **Syntax**: `<track-size>+`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |          Edge           |             IE              |
    * | :----: | :-----: | :------: | :---------------------: | :-------------------------: |
    * | **57** | **70**  | **10.1** |         **16**          | **10** _(-ms-grid-columns)_ |
    * |        |         |          | 12 _(-ms-grid-columns)_ |                             |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-columns
    */
  var `grid-auto-columns`: js.UndefOr[GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]] = js.native
  
  /**
    * The **`grid-auto-flow`** CSS property controls how the auto-placement algorithm works, specifying exactly how auto-placed items get flowed into the grid.
    *
    * **Syntax**: `[ row | column ] || dense`
    *
    * **Initial value**: `row`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-flow
    */
  var `grid-auto-flow`: js.UndefOr[GridAutoFlowProperty | js.Array[GridAutoFlowProperty]] = js.native
  
  /**
    * The **`grid-auto-rows`** CSS property specifies the size of an implicitly-created grid row track.
    *
    * **Syntax**: `<track-size>+`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |         Edge         |            IE            |
    * | :----: | :-----: | :------: | :------------------: | :----------------------: |
    * | **57** | **70**  | **10.1** |        **16**        | **10** _(-ms-grid-rows)_ |
    * |        |         |          | 12 _(-ms-grid-rows)_ |                          |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-auto-rows
    */
  var `grid-auto-rows`: js.UndefOr[GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]] = js.native
  
  /**
    * The **`grid-column-end`** CSS property specifies a grid item’s end position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the block-end edge of its grid area.
    *
    * **Syntax**: `<grid-line>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-end
    */
  var `grid-column-end`: js.UndefOr[GridColumnEndProperty | js.Array[GridColumnEndProperty]] = js.native
  
  /**
    * The **`grid-column-start`** CSS property specifies a grid item’s start position within the grid column by contributing a line, a span, or nothing (automatic) to its grid placement. This start position defines the block-start edge of the grid area.
    *
    * **Syntax**: `<grid-line>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-column-start
    */
  var `grid-column-start`: js.UndefOr[GridColumnStartProperty | js.Array[GridColumnStartProperty]] = js.native
  
  /**
    * The **`grid-row-end`** CSS property specifies a grid item’s end position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-end edge of its grid area.
    *
    * **Syntax**: `<grid-line>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-end
    */
  var `grid-row-end`: js.UndefOr[GridRowEndProperty | js.Array[GridRowEndProperty]] = js.native
  
  /**
    * The **`grid-row-start`** CSS property specifies a grid item’s start position within the grid row by contributing a line, a span, or nothing (automatic) to its grid placement, thereby specifying the inline-start edge of its grid area.
    *
    * **Syntax**: `<grid-line>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-row-start
    */
  var `grid-row-start`: js.UndefOr[GridRowStartProperty | js.Array[GridRowStartProperty]] = js.native
  
  /**
    * The **`grid-template-areas`** CSS property specifies named grid areas.
    *
    * **Syntax**: `none | <string>+`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **52**  | **10.1** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-areas
    */
  var `grid-template-areas`: js.UndefOr[GridTemplateAreasProperty | js.Array[GridTemplateAreasProperty]] = js.native
  
  /**
    * The **`grid-template-columns`** CSS property defines the line names and track sizing functions of the grid columns.
    *
    * **Syntax**: `none | <track-list> | <auto-track-list> | subgrid <line-name-list>?`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  |             IE              |
    * | :----: | :-----: | :------: | :----: | :-------------------------: |
    * | **57** | **52**  | **10.1** | **16** | **10** _(-ms-grid-columns)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-columns
    */
  var `grid-template-columns`: js.UndefOr[
    GridTemplateColumnsProperty[TLength] | js.Array[GridTemplateColumnsProperty[TLength]]
  ] = js.native
  
  /**
    * The **`grid-template-rows`** CSS property defines the line names and track sizing functions of the grid rows.
    *
    * **Syntax**: `none | <track-list> | <auto-track-list> | subgrid <line-name-list>?`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  |            IE            |
    * | :----: | :-----: | :------: | :----: | :----------------------: |
    * | **57** | **52**  | **10.1** | **16** | **10** _(-ms-grid-rows)_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/grid-template-rows
    */
  var `grid-template-rows`: js.UndefOr[GridTemplateRowsProperty[TLength] | js.Array[GridTemplateRowsProperty[TLength]]] = js.native
  
  /**
    * The **`hanging-punctuation`** CSS property specifies whether a punctuation mark should hang at the start or end of a line of text. Hanging punctuation may be placed outside the line box.
    *
    * **Syntax**: `none | [ first || [ force-end | allow-end ] || last ]`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **10** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/hanging-punctuation
    */
  var `hanging-punctuation`: js.UndefOr[HangingPunctuationProperty | js.Array[HangingPunctuationProperty]] = js.native
  
  /**
    * The **`height`** CSS property specifies the height of an element. By default, the property defines the height of the content area. If `box-sizing` is set to `border-box`, however, it instead determines the height of the border area.
    *
    * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/height
    */
  var height: js.UndefOr[HeightProperty[TLength] | js.Array[HeightProperty[TLength]]] = js.native
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Syntax**: `none | manual | auto`
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
  var hyphens: js.UndefOr[HyphensProperty | js.Array[HyphensProperty]] = js.native
  
  /**
    * The **`image-orientation`** CSS property specifies a layout-independent correction to the orientation of an image. It should _not_ be used for any other orientation adjustments; instead, the `transform` property should be used with the `rotate` `<transform-function>`.
    *
    * **Syntax**: `from-image | <angle> | [ <angle>? flip ]`
    *
    * **Initial value**: `from-image`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **81** | **26**  | **13.1** | **81** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-orientation
    */
  var `image-orientation`: js.UndefOr[ImageOrientationProperty | js.Array[ImageOrientationProperty]] = js.native
  
  /**
    * The **`image-rendering`** CSS property sets an image scaling algorithm. The property applies to an element itself, to any images set in its other properties, and to its descendants.
    *
    * **Syntax**: `auto | crisp-edges | pixelated`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **13** | **3.6** | **6**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/image-rendering
    */
  var `image-rendering`: js.UndefOr[ImageRenderingProperty | js.Array[ImageRenderingProperty]] = js.native
  
  /**
    * **Syntax**: `[ from-image || <resolution> ] && snap?`
    *
    * **Initial value**: `1dppx`
    */
  var `image-resolution`: js.UndefOr[ImageResolutionProperty | js.Array[ImageResolutionProperty]] = js.native
  
  /**
    * The `initial-letter` CSS property sets styling for dropped, raised, and sunken initial letters.
    *
    * **Syntax**: `normal | [ <number> <integer>? ]`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   |   No    | **9**  |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/initial-letter
    */
  var `initial-letter`: js.UndefOr[InitialLetterProperty | js.Array[InitialLetterProperty]] = js.native
  
  /**
    * The **`inline-size`** CSS property defines the horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `width` or the `height` property, depending on the value of `writing-mode`.
    *
    * **Syntax**: `<'width'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inline-size
    */
  var `inline-size`: js.UndefOr[InlineSizeProperty[TLength] | js.Array[InlineSizeProperty[TLength]]] = js.native
  
  /**
    * The **`inset`** CSS property defines the logical block and inline start and end offsets of an element, which map to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,4}`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **66**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset
    */
  var inset: js.UndefOr[InsetProperty[TLength] | js.Array[InsetProperty[TLength]]] = js.native
  
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block
    */
  var `inset-block`: js.UndefOr[InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]] = js.native
  
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-end
    */
  var `inset-block-end`: js.UndefOr[InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]] = js.native
  
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-block-start
    */
  var `inset-block-start`: js.UndefOr[InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>{1,2}`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline
    */
  var `inset-inline`: js.UndefOr[InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-end
    */
  var `inset-inline-end`: js.UndefOr[InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'top'>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **63**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/inset-inline-start
    */
  var `inset-inline-start`: js.UndefOr[InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]] = js.native
  
  /**
    * The **`isolation`** CSS property determines whether an element must create a new stacking context.
    *
    * **Syntax**: `auto | isolate`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **41** | **36**  | **8**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/isolation
    */
  var isolation: js.UndefOr[IsolationProperty | js.Array[IsolationProperty]] = js.native
  
  /**
    * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * **Syntax**: `normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ]`
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  |   IE   |
    * | :------: | :-----: | :-------: | :----: | :----: |
    * |  **52**  | **20**  |   **9**   | **12** | **11** |
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
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-content
    */
  var `justify-content`: js.UndefOr[JustifyContentProperty | js.Array[JustifyContentProperty]] = js.native
  
  /**
    * The CSS **`justify-items`** property defines the default `justify-self` for all items of the box, giving them all a default way of justifying each box along the appropriate axis.
    *
    * **Syntax**: `normal | stretch | <baseline-position> | <overflow-position>? [ <self-position> | left | right ] | legacy | legacy && [ left | right | center ]`
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
  var `justify-items`: js.UndefOr[JustifyItemsProperty | js.Array[JustifyItemsProperty]] = js.native
  
  /**
    * The CSS **`justify-self`** property set the way a box is justified inside its alignment container along the appropriate axis.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? [ <self-position> | left | right ]`
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
    * | Chrome | Firefox |  Safari  |  Edge  |      IE      |
    * | :----: | :-----: | :------: | :----: | :----------: |
    * | **57** | **45**  | **10.1** | **16** | **10** _-x-_ |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/justify-self
    */
  var `justify-self`: js.UndefOr[JustifySelfProperty | js.Array[JustifySelfProperty]] = js.native
  
  /**
    * The **`justify-tracks`** CSS property sets the alignment in the masonry axis for grid containers that have masonry in their inline axis.
    *
    * **Syntax**: `[ normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ] ]#`
    *
    * **Initial value**: `normal`
    */
  var `justify-tracks`: js.UndefOr[JustifyTracksProperty | js.Array[JustifyTracksProperty]] = js.native
  
  /**
    * The **`left`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/left
    */
  var left: js.UndefOr[LeftProperty[TLength] | js.Array[LeftProperty[TLength]]] = js.native
  
  /**
    * The **`letter-spacing`** CSS property sets the spacing behavior between text characters.
    *
    * **Syntax**: `normal | <length>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/letter-spacing
    */
  var `letter-spacing`: js.UndefOr[LetterSpacingProperty[TLength] | js.Array[LetterSpacingProperty[TLength]]] = js.native
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox | Safari  |  Edge  |   IE    |
    * | :-----: | :-----: | :-----: | :----: | :-----: |
    * | **58**  | **69**  | **11**  | **14** | **5.5** |
    * | 1 _-x-_ |         | 3 _-x-_ |        |         |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-break
    */
  var `line-break`: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.native
  
  /**
    * The **`line-height`** CSS property sets the amount of space used for lines, such as in text. On block-level elements, it specifies the minimum height of line boxes within the element. On non-replaced inline elements, it specifies the height that is used to calculate line box height.
    *
    * **Syntax**: `normal | <number> | <length> | <percentage>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height
    */
  var `line-height`: js.UndefOr[LineHeightProperty[TLength] | js.Array[LineHeightProperty[TLength]]] = js.native
  
  /**
    * The **`line-height-step`** CSS property sets the step unit for line box heights. When the property is set, line box heights are rounded up to the closest multiple of the unit.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   |   No    |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/line-height-step
    */
  var `line-height-step`: js.UndefOr[LineHeightStepProperty[TLength] | js.Array[LineHeightStepProperty[TLength]]] = js.native
  
  /**
    * The **`list-style-image`** CSS property sets an image to be used as the list item marker.
    *
    * **Syntax**: `<url> | none`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-image
    */
  var `list-style-image`: js.UndefOr[ListStyleImageProperty | js.Array[ListStyleImageProperty]] = js.native
  
  /**
    * The **`list-style-position`** CSS property sets the position of the `::marker` relative to a list item.
    *
    * **Syntax**: `inside | outside`
    *
    * **Initial value**: `outside`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-position
    */
  var `list-style-position`: js.UndefOr[ListStylePositionProperty | js.Array[ListStylePositionProperty]] = js.native
  
  /**
    * The **`list-style-type`** CSS property sets the marker (such as a disc, character, or custom counter style) of a list item element.
    *
    * **Syntax**: `<counter-style> | <string> | none`
    *
    * **Initial value**: `disc`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/list-style-type
    */
  var `list-style-type`: js.UndefOr[ListStyleTypeProperty | js.Array[ListStyleTypeProperty]] = js.native
  
  /**
    * The **`margin-block`** CSS property defines the logical block start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'margin-left'>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block
    */
  var `margin-block`: js.UndefOr[MarginBlockProperty[TLength] | js.Array[MarginBlockProperty[TLength]]] = js.native
  
  /**
    * The **`margin-block-end`** CSS property defines the logical block end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-end
    */
  var `margin-block-end`: js.UndefOr[MarginBlockEndProperty[TLength] | js.Array[MarginBlockEndProperty[TLength]]] = js.native
  
  /**
    * The **`margin-block-start`** CSS property defines the logical block start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-block-start
    */
  var `margin-block-start`: js.UndefOr[MarginBlockStartProperty[TLength] | js.Array[MarginBlockStartProperty[TLength]]] = js.native
  
  /**
    * The **`margin-bottom`** CSS property sets the margin area on the bottom of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var `margin-bottom`: js.UndefOr[MarginBottomProperty[TLength] | js.Array[MarginBottomProperty[TLength]]] = js.native
  
  /**
    * The **`margin-inline`** CSS property defines the logical inline start and end margins of an element, which maps to physical margins depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'margin-left'>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline
    */
  var `margin-inline`: js.UndefOr[MarginInlineProperty[TLength] | js.Array[MarginInlineProperty[TLength]]] = js.native
  
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    *
    * |          Chrome          |        Firefox        |          Safari          |  Edge  | IE  |
    * | :----------------------: | :-------------------: | :----------------------: | :----: | :-: |
    * |          **69**          |        **41**         |         **12.1**         | **79** | No  |
    * | 2 _(-webkit-margin-end)_ | 3 _(-moz-margin-end)_ | 3 _(-webkit-margin-end)_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-end
    */
  var `margin-inline-end`: js.UndefOr[MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    *
    * |           Chrome           |         Firefox         |           Safari           |  Edge  | IE  |
    * | :------------------------: | :---------------------: | :------------------------: | :----: | :-: |
    * |           **69**           |         **41**          |          **12.1**          | **79** | No  |
    * | 2 _(-webkit-margin-start)_ | 3 _(-moz-margin-start)_ | 3 _(-webkit-margin-start)_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-inline-start
    */
  var `margin-inline-start`: js.UndefOr[
    MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * The **`margin-left`** CSS property sets the margin area on the left side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    */
  var `margin-left`: js.UndefOr[MarginLeftProperty[TLength] | js.Array[MarginLeftProperty[TLength]]] = js.native
  
  /**
    * The **`margin-right`** CSS property sets the margin area on the right side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var `margin-right`: js.UndefOr[MarginRightProperty[TLength] | js.Array[MarginRightProperty[TLength]]] = js.native
  
  /**
    * The **`margin-top`** CSS property sets the margin area on the top of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    */
  var `margin-top`: js.UndefOr[MarginTopProperty[TLength] | js.Array[MarginTopProperty[TLength]]] = js.native
  
  /**
    * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
    *
    * **Syntax**: `luminance | alpha`
    *
    * **Initial value**: `alpha`
    */
  var `mask-border-mode`: js.UndefOr[MaskBorderModeProperty | js.Array[MaskBorderModeProperty]] = js.native
  
  /**
    * The **`mask-border-outset`** CSS property specifies the distance by which an element's mask border is set out from its border box.
    *
    * **Syntax**: `[ <length> | <number> ]{1,4}`
    *
    * **Initial value**: `0`
    */
  var `mask-border-outset`: js.UndefOr[MaskBorderOutsetProperty[TLength] | js.Array[MaskBorderOutsetProperty[TLength]]] = js.native
  
  /**
    * The **`mask-border-repeat`** CSS property sets how the edge regions of a source image are adjusted to fit the dimensions of an element's mask border.
    *
    * **Syntax**: `[ stretch | repeat | round | space ]{1,2}`
    *
    * **Initial value**: `stretch`
    */
  var `mask-border-repeat`: js.UndefOr[MaskBorderRepeatProperty | js.Array[MaskBorderRepeatProperty]] = js.native
  
  /**
    * The **`mask-border-slice`** CSS property divides the image set by `mask-border-source` into regions. These regions are used to form the components of an element's mask border.
    *
    * **Syntax**: `<number-percentage>{1,4} fill?`
    *
    * **Initial value**: `0`
    */
  var `mask-border-slice`: js.UndefOr[MaskBorderSliceProperty | js.Array[MaskBorderSliceProperty]] = js.native
  
  /**
    * The **`mask-border-source`** CSS property sets the source image used to create an element's mask border.
    *
    * **Syntax**: `none | <image>`
    *
    * **Initial value**: `none`
    */
  var `mask-border-source`: js.UndefOr[MaskBorderSourceProperty | js.Array[MaskBorderSourceProperty]] = js.native
  
  /**
    * The **`mask-border-width`** CSS property sets the width of an element's mask border.
    *
    * **Syntax**: `[ <length-percentage> | <number> | auto ]{1,4}`
    *
    * **Initial value**: `auto`
    */
  var `mask-border-width`: js.UndefOr[MaskBorderWidthProperty[TLength] | js.Array[MaskBorderWidthProperty[TLength]]] = js.native
  
  /**
    * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
    *
    * **Syntax**: `[ <geometry-box> | no-clip ]#`
    *
    * **Initial value**: `border-box`
    *
    * |   Chrome    | Firefox |   Safari    |     Edge     | IE  |
    * | :---------: | :-----: | :---------: | :----------: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-clip
    */
  var `mask-clip`: js.UndefOr[MaskClipProperty | js.Array[MaskClipProperty]] = js.native
  
  /**
    * The **`mask-composite`** CSS property represents a compositing operation used on the current mask layer with the mask layers below it.
    *
    * **Syntax**: `<compositing-operator>#`
    *
    * **Initial value**: `add`
    *
    * | Chrome | Firefox | Safari | Edge  | IE  |
    * | :----: | :-----: | :----: | :---: | :-: |
    * |   No   | **53**  |   No   | 18-79 | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-composite
    */
  var `mask-composite`: js.UndefOr[MaskCompositeProperty | js.Array[MaskCompositeProperty]] = js.native
  
  /**
    * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
    *
    * **Syntax**: `<mask-reference>#`
    *
    * **Initial value**: `none`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-image
    */
  var `mask-image`: js.UndefOr[MaskImageProperty | js.Array[MaskImageProperty]] = js.native
  
  /**
    * The **`mask-mode`** CSS property sets whether the mask reference defined by `mask-image` is treated as a luminance or alpha mask.
    *
    * **Syntax**: `<masking-mode>#`
    *
    * **Initial value**: `match-source`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **53**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-mode
    */
  var `mask-mode`: js.UndefOr[MaskModeProperty | js.Array[MaskModeProperty]] = js.native
  
  /**
    * The **`mask-origin`** CSS property sets the origin of a mask.
    *
    * **Syntax**: `<geometry-box>#`
    *
    * **Initial value**: `border-box`
    *
    * |   Chrome    | Firefox |   Safari    |     Edge     | IE  |
    * | :---------: | :-----: | :---------: | :----------: | :-: |
    * | **1** _-x-_ | **53**  | **4** _-x-_ | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-origin
    */
  var `mask-origin`: js.UndefOr[MaskOriginProperty | js.Array[MaskOriginProperty]] = js.native
  
  /**
    * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
    *
    * **Syntax**: `<position>#`
    *
    * **Initial value**: `center`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  | IE  |
    * | :---------: | :-----: | :-----------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **3.2** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-position
    */
  var `mask-position`: js.UndefOr[MaskPositionProperty[TLength] | js.Array[MaskPositionProperty[TLength]]] = js.native
  
  /**
    * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Syntax**: `<repeat-style>#`
    *
    * **Initial value**: `no-repeat`
    *
    * |   Chrome    | Firefox |    Safari     |  Edge  | IE  |
    * | :---------: | :-----: | :-----------: | :----: | :-: |
    * | **1** _-x-_ | **53**  | **3.2** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-repeat
    */
  var `mask-repeat`: js.UndefOr[MaskRepeatProperty | js.Array[MaskRepeatProperty]] = js.native
  
  /**
    * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto`
    *
    * |   Chrome    | Firefox |   Safari    |  Edge  | IE  |
    * | :---------: | :-----: | :---------: | :----: | :-: |
    * | **4** _-x-_ | **53**  | **4** _-x-_ | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-size
    */
  var `mask-size`: js.UndefOr[MaskSizeProperty[TLength] | js.Array[MaskSizeProperty[TLength]]] = js.native
  
  /**
    * The **`mask-type`** CSS property sets whether an SVG `<mask>` element is used as a _luminance_ or an _alpha_ mask. It applies to the `<mask>` element itself.
    *
    * **Syntax**: `luminance | alpha`
    *
    * **Initial value**: `luminance`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **24** | **35**  | **6.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mask-type
    */
  var `mask-type`: js.UndefOr[MaskTypeProperty | js.Array[MaskTypeProperty]] = js.native
  
  /**
    * The **`masonry-auto-flow`** CSS property modifies how items are placed when using masonry in CSS Grid Layout.
    *
    * **Syntax**: `[ pack | next ] || [ definite-first | ordered ]`
    *
    * **Initial value**: `pack`
    */
  var `masonry-auto-flow`: js.UndefOr[MasonryAutoFlowProperty | js.Array[MasonryAutoFlowProperty]] = js.native
  
  /**
    * The `math-style` property indicates whether MathML equations should render with normal or compact height.
    *
    * **Syntax**: `normal | compact`
    *
    * **Initial value**: `normal`
    */
  var `math-style`: js.UndefOr[MathStyleProperty | js.Array[MathStyleProperty]] = js.native
  
  /**
    * The `**max-block-size**` CSS property specifies the maximum size of an element in the direction opposite that of the writing direction as specified by `writing-mode`. That is, if the writing direction is horizontal, then `max-block-size` is equivalent to `max-height`; if the writing direction is vertical, `max-block-size` is the same as `max-width`.
    *
    * **Syntax**: `<'max-width'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-block-size
    */
  var `max-block-size`: js.UndefOr[MaxBlockSizeProperty[TLength] | js.Array[MaxBlockSizeProperty[TLength]]] = js.native
  
  /**
    * The **`max-height`** CSS property sets the maximum height of an element. It prevents the used value of the `height` property from becoming larger than the value specified for `max-height`.
    *
    * **Syntax**: `none | <length-percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **18** |  **1**  | **1.3** | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-height
    */
  var `max-height`: js.UndefOr[MaxHeightProperty[TLength] | js.Array[MaxHeightProperty[TLength]]] = js.native
  
  /**
    * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
    *
    * **Syntax**: `<'max-width'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |   Safari   |  Edge  | IE  |
    * | :----: | :-----: | :--------: | :----: | :-: |
    * | **57** | **41**  |  **12.1**  | **79** | No  |
    * |        |         | 10.1 _-x-_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-inline-size
    */
  var `max-inline-size`: js.UndefOr[MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]] = js.native
  
  /**
    * **Syntax**: `none | <integer>`
    *
    * **Initial value**: `none`
    */
  var `max-lines`: js.UndefOr[MaxLinesProperty | js.Array[MaxLinesProperty]] = js.native
  
  /**
    * The **`max-width`** CSS property sets the maximum width of an element. It prevents the used value of the `width` property from becoming larger than the value specified by `max-width`.
    *
    * **Syntax**: `none | <length-percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/max-width
    */
  var `max-width`: js.UndefOr[MaxWidthProperty[TLength] | js.Array[MaxWidthProperty[TLength]]] = js.native
  
  /**
    * The **`min-block-size`** CSS property defines the minimum horizontal or vertical size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Syntax**: `<'min-width'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-block-size
    */
  var `min-block-size`: js.UndefOr[MinBlockSizeProperty[TLength] | js.Array[MinBlockSizeProperty[TLength]]] = js.native
  
  /**
    * The **`min-height`** CSS property sets the minimum height of an element. It prevents the used value of the `height` property from becoming smaller than the value specified for `min-height`.
    *
    * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **3**  | **1.3** | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-height
    */
  var `min-height`: js.UndefOr[MinHeightProperty[TLength] | js.Array[MinHeightProperty[TLength]]] = js.native
  
  /**
    * The **`min-inline-size`** CSS property defines the horizontal or vertical minimal size of an element's block, depending on its writing mode. It corresponds to either the `min-width` or the `min-height` property, depending on the value of `writing-mode`.
    *
    * **Syntax**: `<'min-width'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-inline-size
    */
  var `min-inline-size`: js.UndefOr[MinInlineSizeProperty[TLength] | js.Array[MinInlineSizeProperty[TLength]]] = js.native
  
  /**
    * The **`min-width`** CSS property sets the minimum width of an element. It prevents the used value of the `width` property from becoming smaller than the value specified for `min-width`.
    *
    * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **7** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/min-width
    */
  var `min-width`: js.UndefOr[MinWidthProperty[TLength] | js.Array[MinWidthProperty[TLength]]] = js.native
  
  /**
    * The **`mix-blend-mode`** CSS property sets how an element's content should blend with the content of the element's parent and the element's background.
    *
    * **Syntax**: `<blend-mode>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **41** | **32**  | **8**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/mix-blend-mode
    */
  var `mix-blend-mode`: js.UndefOr[MixBlendModeProperty | js.Array[MixBlendModeProperty]] = js.native
  
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari |  Edge  | IE  |
    * | :--------------------: | :-----: | :----: | :----: | :-: |
    * |         **55**         | **72**  |   No   | **79** | No  |
    * | 46 _(motion-distance)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var `motion-distance`: js.UndefOr[OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]] = js.native
  
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Syntax**: `none | ray( [ <angle> && <size> && contain? ] ) | <path()> | <url> | [ <basic-shape> || <geometry-box> ]`
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari |  Edge  | IE  |
    * | :----------------: | :-----: | :----: | :----: | :-: |
    * |       **55**       | **72**  |   No   | **79** | No  |
    * | 46 _(motion-path)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var `motion-path`: js.UndefOr[OffsetPathProperty | js.Array[OffsetPathProperty]] = js.native
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Syntax**: `[ auto | reverse ] || <angle>`
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari |  Edge  | IE  |
    * | :--------------------: | :-----: | :----: | :----: | :-: |
    * |         **56**         | **72**  |   No   | **79** | No  |
    * | 46 _(motion-rotation)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `motion-rotation`: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.native
  
  /**
    * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Syntax**: `fill | contain | cover | none | scale-down`
    *
    * **Initial value**: `fill`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-fit
    */
  var `object-fit`: js.UndefOr[ObjectFitProperty | js.Array[ObjectFitProperty]] = js.native
  
  /**
    * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **31** | **36**  | **10** | **16** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/object-position
    */
  var `object-position`: js.UndefOr[ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]] = js.native
  
  /**
    * **Syntax**: `auto | <position>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **79** | **72**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-anchor
    */
  var `offset-anchor`: js.UndefOr[OffsetAnchorProperty[TLength] | js.Array[OffsetAnchorProperty[TLength]]] = js.native
  
  /**
    * The **`offset-distance`** CSS property specifies a position along an `offset-path`.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * |         Chrome         | Firefox | Safari |  Edge  | IE  |
    * | :--------------------: | :-----: | :----: | :----: | :-: |
    * |         **55**         | **72**  |   No   | **79** | No  |
    * | 46 _(motion-distance)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-distance
    */
  var `offset-distance`: js.UndefOr[OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]] = js.native
  
  /**
    * The **`offset-path`** CSS property specifies a motion path for an element to follow and defines the element's positioning within the parent container or SVG coordinate system.
    *
    * **Syntax**: `none | ray( [ <angle> && <size> && contain? ] ) | <path()> | <url> | [ <basic-shape> || <geometry-box> ]`
    *
    * **Initial value**: `none`
    *
    * |       Chrome       | Firefox | Safari |  Edge  | IE  |
    * | :----------------: | :-----: | :----: | :----: | :-: |
    * |       **55**       | **72**  |   No   | **79** | No  |
    * | 46 _(motion-path)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-path
    */
  var `offset-path`: js.UndefOr[OffsetPathProperty | js.Array[OffsetPathProperty]] = js.native
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Syntax**: `[ auto | reverse ] || <angle>`
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari |  Edge  | IE  |
    * | :--------------------: | :-----: | :----: | :----: | :-: |
    * |         **56**         | **72**  |   No   | **79** | No  |
    * | 46 _(motion-rotation)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `offset-rotate`: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.native
  
  /**
    * The **`offset-rotate`** CSS property defines the direction of the element while positioning along the offset path.
    *
    * **Syntax**: `[ auto | reverse ] || <angle>`
    *
    * **Initial value**: `auto`
    *
    * |         Chrome         | Firefox | Safari |  Edge  | IE  |
    * | :--------------------: | :-----: | :----: | :----: | :-: |
    * |         **56**         | **72**  |   No   | **79** | No  |
    * | 46 _(motion-rotation)_ |         |        |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/offset-rotate
    */
  var `offset-rotation`: js.UndefOr[OffsetRotateProperty | js.Array[OffsetRotateProperty]] = js.native
  
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `1.0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **2**  | **12** | **9** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/opacity
    */
  var opacity: js.UndefOr[OpacityProperty | js.Array[OpacityProperty]] = js.native
  
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Syntax**: `<integer>`
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
  var order: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`orphans`** CSS property sets the minimum number of lines in a block container that must be shown at the _bottom_ of a page, region, or column.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **25** |   No    | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/orphans
    */
  var orphans: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Syntax**: `<color> | invert`
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-color
    */
  var `outline-color`: js.UndefOr[OutlineColorProperty | js.Array[OutlineColorProperty]] = js.native
  
  /**
    * The **`outline-offset`** CSS property sets the amount of space between an outline and the edge or border of an element.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **1**  | **1.5** | **1.2** | **15** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-offset
    */
  var `outline-offset`: js.UndefOr[OutlineOffsetProperty[TLength] | js.Array[OutlineOffsetProperty[TLength]]] = js.native
  
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `auto | <'border-style'>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-style
    */
  var `outline-style`: js.UndefOr[OutlineStyleProperty | js.Array[OutlineStyleProperty]] = js.native
  
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Syntax**: `<line-width>`
    *
    * **Initial value**: `medium`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **1.5** | **1.2** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/outline-width
    */
  var `outline-width`: js.UndefOr[OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]] = js.native
  
  /**
    * **Syntax**: `auto | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **56** | **66**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-anchor
    */
  var `overflow-anchor`: js.UndefOr[OverflowAnchorProperty | js.Array[OverflowAnchorProperty]] = js.native
  
  /**
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **69**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-block
    */
  var `overflow-block`: js.UndefOr[OverflowBlockProperty | js.Array[OverflowBlockProperty]] = js.native
  
  /**
    * The **`overflow-clip-box`** CSS property specifies relative to which box the clipping happens when there is an overflow. It is short hand for the `overflow-clip-box-inline` and `overflow-clip-box-block` properties.
    *
    * **Syntax**: `padding-box | content-box`
    *
    * **Initial value**: `padding-box`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **29**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Mozilla/Gecko/Chrome/CSS/overflow-clip-box
    */
  var `overflow-clip-box`: js.UndefOr[OverflowClipBoxProperty | js.Array[OverflowClipBoxProperty]] = js.native
  
  /**
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **69**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-inline
    */
  var `overflow-inline`: js.UndefOr[OverflowInlineProperty | js.Array[OverflowInlineProperty]] = js.native
  
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Syntax**: `normal | break-word | anywhere`
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
  var `overflow-wrap`: js.UndefOr[OverflowWrapProperty | js.Array[OverflowWrapProperty]] = js.native
  
  /**
    * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **3.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-x
    */
  var `overflow-x`: js.UndefOr[OverflowXProperty | js.Array[OverflowXProperty]] = js.native
  
  /**
    * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  | **3.5** | **3**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-y
    */
  var `overflow-y`: js.UndefOr[OverflowYProperty | js.Array[OverflowYProperty]] = js.native
  
  /**
    * The **`overscroll-behavior`** CSS property sets what a browser does when reaching the boundary of a scrolling area. It's a shorthand for `overscroll-behavior-x` and `overscroll-behavior-y`.
    *
    * **Syntax**: `[ contain | none | auto ]{1,2}`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior
    */
  var `overscroll-behavior`: js.UndefOr[OverscrollBehaviorProperty | js.Array[OverscrollBehaviorProperty]] = js.native
  
  /**
    * The **`overscroll-behavior-block`** CSS property sets the browser's behavior when the block direction boundary of a scrolling area is reached.
    *
    * **Syntax**: `contain | none | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **77** | **73**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-block
    */
  var `overscroll-behavior-block`: js.UndefOr[OverscrollBehaviorBlockProperty | js.Array[OverscrollBehaviorBlockProperty]] = js.native
  
  /**
    * The **`overscroll-behavior-inline`** CSS property sets the browser's behavior when the inline direction boundary of a scrolling area is reached.
    *
    * **Syntax**: `contain | none | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **77** | **73**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-inline
    */
  var `overscroll-behavior-inline`: js.UndefOr[OverscrollBehaviorInlineProperty | js.Array[OverscrollBehaviorInlineProperty]] = js.native
  
  /**
    * The **`overscroll-behavior-x`** CSS property sets the browser's behavior when the horizontal boundary of a scrolling area is reached.
    *
    * **Syntax**: `contain | none | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-x
    */
  var `overscroll-behavior-x`: js.UndefOr[OverscrollBehaviorXProperty | js.Array[OverscrollBehaviorXProperty]] = js.native
  
  /**
    * The **`overscroll-behavior-y`** CSS property sets the browser's behavior when the vertical boundary of a scrolling area is reached.
    *
    * **Syntax**: `contain | none | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **63** | **59**  |   No   | **18** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overscroll-behavior-y
    */
  var `overscroll-behavior-y`: js.UndefOr[OverscrollBehaviorYProperty | js.Array[OverscrollBehaviorYProperty]] = js.native
  
  /**
    * The **`padding-block`** CSS property defines the logical block start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'padding-left'>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block
    */
  var `padding-block`: js.UndefOr[PaddingBlockProperty[TLength] | js.Array[PaddingBlockProperty[TLength]]] = js.native
  
  /**
    * The **`padding-block-end`** CSS property defines the logical block end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-end
    */
  var `padding-block-end`: js.UndefOr[PaddingBlockEndProperty[TLength] | js.Array[PaddingBlockEndProperty[TLength]]] = js.native
  
  /**
    * The **`padding-block-start`** CSS property defines the logical block start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **69** | **41**  | **12.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-block-start
    */
  var `padding-block-start`: js.UndefOr[
    PaddingBlockStartProperty[TLength] | js.Array[PaddingBlockStartProperty[TLength]]
  ] = js.native
  
  /**
    * The **`padding-bottom`** CSS property sets the height of the padding area on the bottom of an element.
    *
    * **Syntax**: `<length> | <percentage>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var `padding-bottom`: js.UndefOr[PaddingBottomProperty[TLength] | js.Array[PaddingBottomProperty[TLength]]] = js.native
  
  /**
    * The **`padding-inline`** CSS property defines the logical inline start and end padding of an element, which maps to physical padding properties depending on the element's writing mode, directionality, and text orientation.
    *
    * **Syntax**: `<'padding-left'>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |  n/a   | **66**  |   No   | n/a  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline
    */
  var `padding-inline`: js.UndefOr[PaddingInlineProperty[TLength] | js.Array[PaddingInlineProperty[TLength]]] = js.native
  
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    *
    * |          Chrome           |        Firefox         |          Safari           |  Edge  | IE  |
    * | :-----------------------: | :--------------------: | :-----------------------: | :----: | :-: |
    * |          **69**           |         **41**         |         **12.1**          | **79** | No  |
    * | 2 _(-webkit-padding-end)_ | 3 _(-moz-padding-end)_ | 3 _(-webkit-padding-end)_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-end
    */
  var `padding-inline-end`: js.UndefOr[PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]] = js.native
  
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    *
    * |           Chrome            |         Firefox          |           Safari            |  Edge  | IE  |
    * | :-------------------------: | :----------------------: | :-------------------------: | :----: | :-: |
    * |           **69**            |          **41**          |          **12.1**           | **79** | No  |
    * | 2 _(-webkit-padding-start)_ | 3 _(-moz-padding-start)_ | 3 _(-webkit-padding-start)_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-inline-start
    */
  var `padding-inline-start`: js.UndefOr[
    PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * The **`padding-left`** CSS property sets the width of the padding area on the left side of an element.
    *
    * **Syntax**: `<length> | <percentage>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    */
  var `padding-left`: js.UndefOr[PaddingLeftProperty[TLength] | js.Array[PaddingLeftProperty[TLength]]] = js.native
  
  /**
    * The **`padding-right`** CSS property sets the width of the padding area on the right side of an element.
    *
    * **Syntax**: `<length> | <percentage>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var `padding-right`: js.UndefOr[PaddingRightProperty[TLength] | js.Array[PaddingRightProperty[TLength]]] = js.native
  
  /**
    * The **`padding-top`** padding area on the top of an element.
    *
    * **Syntax**: `<length> | <percentage>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    */
  var `padding-top`: js.UndefOr[PaddingTopProperty[TLength] | js.Array[PaddingTopProperty[TLength]]] = js.native
  
  /**
    * The **`page-break-after`** CSS property adjusts page breaks _after_ the current element.
    *
    * **Syntax**: `auto | always | avoid | left | right | recto | verso`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-after
    */
  var `page-break-after`: js.UndefOr[PageBreakAfterProperty | js.Array[PageBreakAfterProperty]] = js.native
  
  /**
    * The **`page-break-before`** CSS property adjusts page breaks _before_ the current element.
    *
    * **Syntax**: `auto | always | avoid | left | right | recto | verso`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **1**  | **1.2** | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-before
    */
  var `page-break-before`: js.UndefOr[PageBreakBeforeProperty | js.Array[PageBreakBeforeProperty]] = js.native
  
  /**
    * The **`page-break-inside`** CSS property adjusts page breaks _inside_ the current element.
    *
    * **Syntax**: `auto | avoid`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  | **19**  | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/page-break-inside
    */
  var `page-break-inside`: js.UndefOr[PageBreakInsideProperty | js.Array[PageBreakInsideProperty]] = js.native
  
  /**
    * The **`paint-order`** CSS property lets you control the order in which the fill and stroke (and painting markers) of text content and shapes are drawn.
    *
    * **Syntax**: `normal | [ fill || stroke || markers ]`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **35** | **60**  | **8**  | **17** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/paint-order
    */
  var `paint-order`: js.UndefOr[PaintOrderProperty | js.Array[PaintOrderProperty]] = js.native
  
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Syntax**: `none | <length>`
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
  var perspective: js.UndefOr[PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]] = js.native
  
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Syntax**: `<position>`
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
  var `perspective-origin`: js.UndefOr[
    PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]
  ] = js.native
  
  /**
    * The `**place-content**` CSS property is a shorthand for `align-content` and `justify-content`. It can be used in any layout method which utilizes both of these alignment values.
    *
    * **Syntax**: `<'align-content'> <'justify-content'>?`
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **45**  | **9**  | **79** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **59** | **53**  | **11** | **79** | No  |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/place-content
    */
  var `place-content`: js.UndefOr[PlaceContentProperty | js.Array[PlaceContentProperty]] = js.native
  
  /**
    * The **`pointer-events`** CSS property sets under what circumstances (if any) a particular graphic element can become the target of mouse events.
    *
    * **Syntax**: `auto | none | visiblePainted | visibleFill | visibleStroke | visible | painted | fill | stroke | all | inherit`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * | **1**  | **1.5** | **4**  | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/pointer-events
    */
  var `pointer-events`: js.UndefOr[PointerEventsProperty | js.Array[PointerEventsProperty]] = js.native
  
  /**
    * The **`position`** CSS property sets how an element is positioned in a document. The `top`, `right`, `bottom`, and `left` properties determine the final location of positioned elements.
    *
    * **Syntax**: `static | relative | absolute | sticky | fixed`
    *
    * **Initial value**: `static`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/position
    */
  var position: js.UndefOr[PositionProperty | js.Array[PositionProperty]] = js.native
  
  /**
    * The **`quotes`** CSS property sets how quotation marks appear.
    *
    * **Syntax**: `none | auto | [ <string> <string> ]+`
    *
    * **Initial value**: depends on user agent
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **11** | **1.5** | **9**  | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/quotes
    */
  var quotes: js.UndefOr[QuotesProperty | js.Array[QuotesProperty]] = js.native
  
  /**
    * The **`resize`** CSS property sets whether an element is resizable, and if so, in which directions.
    *
    * **Syntax**: `none | both | horizontal | vertical | block | inline`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **1**  |  **4**  | **3**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/resize
    */
  var resize: js.UndefOr[ResizeProperty | js.Array[ResizeProperty]] = js.native
  
  /**
    * The **`right`** CSS property participates in specifying the horizontal position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/right
    */
  var right: js.UndefOr[RightProperty[TLength] | js.Array[RightProperty[TLength]]] = js.native
  
  /**
    * The **`rotate`** CSS property allows you to specify rotation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Syntax**: `none | <angle> | [ x | y | z | <number>{3} ] && <angle>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **72**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/rotate
    */
  var rotate: js.UndefOr[RotateProperty | js.Array[RotateProperty]] = js.native
  
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    *
    * ---
    *
    * _Supported in Flex Layout_
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **84** | **63**  |   No   | **84** | No  |
    *
    * ---
    *
    * _Supported in Grid Layout_
    *
    * |       Chrome        |       Firefox       |        Safari         |  Edge  | IE  |
    * | :-----------------: | :-----------------: | :-------------------: | :----: | :-: |
    * |       **66**        |       **61**        |       **12.1**        | **16** | No  |
    * | 57 _(grid-row-gap)_ | 52 _(grid-row-gap)_ | 10.1 _(grid-row-gap)_ |        |     |
    *
    * ---
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/row-gap
    */
  var `row-gap`: js.UndefOr[RowGapProperty[TLength] | js.Array[RowGapProperty[TLength]]] = js.native
  
  /**
    * The `**ruby-align**` CSS property defines the distribution of the different ruby elements over the base.
    *
    * **Syntax**: `start | center | space-between | space-around`
    *
    * **Initial value**: `space-around`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **38**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-align
    */
  var `ruby-align`: js.UndefOr[RubyAlignProperty | js.Array[RubyAlignProperty]] = js.native
  
  /**
    * **Syntax**: `separate | collapse | auto`
    *
    * **Initial value**: `separate`
    */
  var `ruby-merge`: js.UndefOr[RubyMergeProperty | js.Array[RubyMergeProperty]] = js.native
  
  /**
    * The `**ruby-position**` CSS property defines the position of a ruby element relatives to its base element. It can be position over the element (`over`), under it (`under`), or between the characters, on their right side (`inter-character`).
    *
    * **Syntax**: `over | under | inter-character`
    *
    * **Initial value**: `over`
    *
    * | Chrome  | Firefox |    Safari     | Edge  | IE  |
    * | :-----: | :-----: | :-----------: | :---: | :-: |
    * | **84**  | **38**  | **6.1** _-x-_ | 12-79 | No  |
    * | 1 _-x-_ |         |               |       |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/ruby-position
    */
  var `ruby-position`: js.UndefOr[RubyPositionProperty | js.Array[RubyPositionProperty]] = js.native
  
  /**
    * The **`scale`** CSS property allows you to specify scale transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Syntax**: `none | <number>{1,3}`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **72**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scale
    */
  var scale: js.UndefOr[ScaleProperty | js.Array[ScaleProperty]] = js.native
  
  /**
    * The **`scroll-behavior`** CSS property sets the behavior for a scrolling box when scrolling is triggered by the navigation or CSSOM scrolling APIs.
    *
    * **Syntax**: `auto | smooth`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **61** | **36**  | **14** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-behavior
    */
  var `scroll-behavior`: js.UndefOr[ScrollBehaviorProperty | js.Array[ScrollBehaviorProperty]] = js.native
  
  /**
    * The **`scroll-margin`** property is a shorthand property which sets all of the `scroll-margin` longhands, assigning values much like the `margin` property does for the `margin-*` longhands.
    *
    * **Syntax**: `<length>{1,4}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |            Safari             |  Edge  | IE  |
    * | :----: | :-----: | :---------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
    */
  var `scroll-margin`: js.UndefOr[ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]] = js.native
  
  /**
    * The `scroll-margin-block` property is a shorthand property which sets the scroll-margin longhands in the block dimension.
    *
    * **Syntax**: `<length>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block
    */
  var `scroll-margin-block`: js.UndefOr[
    ScrollMarginBlockProperty[TLength] | js.Array[ScrollMarginBlockProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-block-end` property defines the margin of the scroll snap area at the end of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-end
    */
  var `scroll-margin-block-end`: js.UndefOr[
    ScrollMarginBlockEndProperty[TLength] | js.Array[ScrollMarginBlockEndProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-block-start` property defines the margin of the scroll snap area at the start of the block dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-block-start
    */
  var `scroll-margin-block-start`: js.UndefOr[
    ScrollMarginBlockStartProperty[TLength] | js.Array[ScrollMarginBlockStartProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-bottom` property defines the bottom margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |                Safari                |  Edge  | IE  |
    * | :----: | :-----: | :----------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-bottom)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-bottom
    */
  var `scroll-margin-bottom`: js.UndefOr[
    ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-inline` property is a shorthand property which sets the scroll-margin longhands in the inline dimension.
    *
    * **Syntax**: `<length>{1,2}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **68**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline
    */
  var `scroll-margin-inline`: js.UndefOr[
    ScrollMarginInlineProperty[TLength] | js.Array[ScrollMarginInlineProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-inline-end` property defines the margin of the scroll snap area at the end of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-end
    */
  var `scroll-margin-inline-end`: js.UndefOr[
    ScrollMarginInlineEndProperty[TLength] | js.Array[ScrollMarginInlineEndProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-inline-start` property defines the margin of the scroll snap area at the start of the inline dimension that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-inline-start
    */
  var `scroll-margin-inline-start`: js.UndefOr[
    ScrollMarginInlineStartProperty[TLength] | js.Array[ScrollMarginInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-left` property defines the left margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |               Safari               |  Edge  | IE  |
    * | :----: | :-----: | :--------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-left)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-left
    */
  var `scroll-margin-left`: js.UndefOr[ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]] = js.native
  
  /**
    * The `scroll-margin-right` property defines the right margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |               Safari                |  Edge  | IE  |
    * | :----: | :-----: | :---------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-right)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-right
    */
  var `scroll-margin-right`: js.UndefOr[
    ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-top` property defines the top margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |              Safari               |  Edge  | IE  |
    * | :----: | :-----: | :-------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-top)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-top
    */
  var `scroll-margin-top`: js.UndefOr[ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]] = js.native
  
  /**
    * The scroll-padding property is a shorthand property which sets all of the scroll-padding longhands, assigning values much like the padding property does for the padding-\* longhands.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Syntax**: `[ auto | <length-percentage> ]{1,4}`
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding
    */
  var `scroll-padding`: js.UndefOr[ScrollPaddingProperty[TLength] | js.Array[ScrollPaddingProperty[TLength]]] = js.native
  
  /**
    * The `scroll-padding-block` property is a shorthand property which sets the scroll-padding longhands for the block dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Syntax**: `[ auto | <length-percentage> ]{1,2}`
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block
    */
  var `scroll-padding-block`: js.UndefOr[
    ScrollPaddingBlockProperty[TLength] | js.Array[ScrollPaddingBlockProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-block-end` property defines offsets for the end edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-end
    */
  var `scroll-padding-block-end`: js.UndefOr[
    ScrollPaddingBlockEndProperty[TLength] | js.Array[ScrollPaddingBlockEndProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-block-start` property defines offsets for the start edge in the block dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-block-start
    */
  var `scroll-padding-block-start`: js.UndefOr[
    ScrollPaddingBlockStartProperty[TLength] | js.Array[ScrollPaddingBlockStartProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-bottom` property defines offsets for the bottom of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-bottom
    */
  var `scroll-padding-bottom`: js.UndefOr[
    ScrollPaddingBottomProperty[TLength] | js.Array[ScrollPaddingBottomProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-inline` property is a shorthand property which sets the scroll-padding longhands for the inline dimension.  
    
  The scroll-padding properties define offsets for the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    * 
    * **Syntax**: `[ auto | <length-percentage> ]{1,2}`
    * 
    * **Initial value**: `auto`
    * 
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    * 
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline
    */
  var `scroll-padding-inline`: js.UndefOr[
    ScrollPaddingInlineProperty[TLength] | js.Array[ScrollPaddingInlineProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-inline-end` property defines offsets for the end edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-end
    */
  var `scroll-padding-inline-end`: js.UndefOr[
    ScrollPaddingInlineEndProperty[TLength] | js.Array[ScrollPaddingInlineEndProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-inline-start` property defines offsets for the start edge in the inline dimension of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-inline-start
    */
  var `scroll-padding-inline-start`: js.UndefOr[
    ScrollPaddingInlineStartProperty[TLength] | js.Array[ScrollPaddingInlineStartProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-left` property defines offsets for the left of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-left
    */
  var `scroll-padding-left`: js.UndefOr[
    ScrollPaddingLeftProperty[TLength] | js.Array[ScrollPaddingLeftProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-right` property defines offsets for the right of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-right
    */
  var `scroll-padding-right`: js.UndefOr[
    ScrollPaddingRightProperty[TLength] | js.Array[ScrollPaddingRightProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-padding-top` property defines offsets for the top of the optimal viewing region of the scrollport: the region used as the target region for placing things in view of the user. This allows the author to exclude regions of the scrollport that are obscured by other content (such as fixed-positioned toolbars or sidebars) or simply to put more breathing room between a targetted element and the edges of the scrollport.
    *
    * **Syntax**: `auto | <length-percentage>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-padding-top
    */
  var `scroll-padding-top`: js.UndefOr[ScrollPaddingTopProperty[TLength] | js.Array[ScrollPaddingTopProperty[TLength]]] = js.native
  
  /**
    * The `scroll-snap-align` property specifies the box’s snap position as an alignment of its snap area (as the alignment subject) within its snap container’s snapport (as the alignment container). The two values specify the snapping alignment in the block axis and inline axis, respectively. If only one value is specified, the second value defaults to the same value.
    *
    * **Syntax**: `[ none | start | end | center ]{1,2}`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **69** | **68**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-align
    */
  var `scroll-snap-align`: js.UndefOr[ScrollSnapAlignProperty | js.Array[ScrollSnapAlignProperty]] = js.native
  
  /**
    * The **`scroll-margin`** property is a shorthand property which sets all of the `scroll-margin` longhands, assigning values much like the `margin` property does for the `margin-*` longhands.
    *
    * **Syntax**: `<length>{1,4}`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |            Safari             |  Edge  | IE  |
    * | :----: | :-----: | :---------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin
    */
  var `scroll-snap-margin`: js.UndefOr[ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]] = js.native
  
  /**
    * The `scroll-margin-bottom` property defines the bottom margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |                Safari                |  Edge  | IE  |
    * | :----: | :-----: | :----------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-bottom)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-bottom
    */
  var `scroll-snap-margin-bottom`: js.UndefOr[
    ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-left` property defines the left margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |               Safari               |  Edge  | IE  |
    * | :----: | :-----: | :--------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-left)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-left
    */
  var `scroll-snap-margin-left`: js.UndefOr[ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]] = js.native
  
  /**
    * The `scroll-margin-right` property defines the right margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |               Safari                |  Edge  | IE  |
    * | :----: | :-----: | :---------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-right)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-right
    */
  var `scroll-snap-margin-right`: js.UndefOr[
    ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]
  ] = js.native
  
  /**
    * The `scroll-margin-top` property defines the top margin of the scroll snap area that is used for snapping this box to the snapport. The scroll snap area is determined by taking the transformed border box, finding its rectangular bounding box (axis-aligned in the scroll container’s coordinate space), then adding the specified outsets.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |              Safari               |  Edge  | IE  |
    * | :----: | :-----: | :-------------------------------: | :----: | :-: |
    * | **69** | **68**  | **11** _(scroll-snap-margin-top)_ | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-margin-top
    */
  var `scroll-snap-margin-top`: js.UndefOr[ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]] = js.native
  
  /**
    * The **`scroll-snap-stop`** CSS property defines whether the scroll container is allowed to "pass over" possible snap positions.
    *
    * **Syntax**: `normal | always`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **75** |   No    |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scroll-snap-stop
    */
  var `scroll-snap-stop`: js.UndefOr[ScrollSnapStopProperty | js.Array[ScrollSnapStopProperty]] = js.native
  
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Syntax**: `none | [ x | y | block | inline | both ] [ mandatory | proximity ]?`
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
  var `scroll-snap-type`: js.UndefOr[ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]] = js.native
  
  /**
    * The **`scrollbar-color`** CSS property sets the color of the scrollbar track and thumb.
    *
    * **Syntax**: `auto | dark | light | <color>{2}`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-color
    */
  var `scrollbar-color`: js.UndefOr[ScrollbarColorProperty | js.Array[ScrollbarColorProperty]] = js.native
  
  /**
    * The **`scrollbar-gutter`** CSS property allows authors to reserve space for the scrollbar, preventing unwanted layout changes as the content grows while also avoiding unnecessary visuals when scrolling isn't needed.
    *
    * **Syntax**: `auto | [ stable | always ] && both? && force?`
    *
    * **Initial value**: `auto`
    */
  var `scrollbar-gutter`: js.UndefOr[ScrollbarGutterProperty | js.Array[ScrollbarGutterProperty]] = js.native
  
  /**
    * The `scrollbar-width` property allows the author to set the maximum thickness of an element’s scrollbars when they are shown.
    *
    * **Syntax**: `auto | thin | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **64**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/scrollbar-width
    */
  var `scrollbar-width`: js.UndefOr[ScrollbarWidthProperty | js.Array[ScrollbarWidthProperty]] = js.native
  
  /**
    * The **`shape-image-threshold`** CSS property sets the alpha channel threshold used to extract the shape using an image as the value for `shape-outside`.
    *
    * **Syntax**: `<alpha-value>`
    *
    * **Initial value**: `0.0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **37** | **62**  | **10.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-image-threshold
    */
  var `shape-image-threshold`: js.UndefOr[ShapeImageThresholdProperty | js.Array[ShapeImageThresholdProperty]] = js.native
  
  /**
    * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **37** | **62**  | **10.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-margin
    */
  var `shape-margin`: js.UndefOr[ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]] = js.native
  
  /**
    * The **`shape-outside`** CSS property defines a shape—which may be non-rectangular—around which adjacent inline content should wrap. By default, inline content wraps around its margin box; `shape-outside` provides a way to customize this wrapping, making it possible to wrap text around complex objects rather than simple boxes.
    *
    * **Syntax**: `none | <shape-box> || <basic-shape> | <image>`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **37** | **62**  | **10.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/shape-outside
    */
  var `shape-outside`: js.UndefOr[ShapeOutsideProperty | js.Array[ShapeOutsideProperty]] = js.native
  
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Syntax**: `<integer> | <length>`
    *
    * **Initial value**: `8`
    *
    * | Chrome |   Firefox   | Safari  |  Edge  | IE  |
    * | :----: | :---------: | :-----: | :----: | :-: |
    * | **21** | **4** _-x-_ | **6.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/tab-size
    */
  var `tab-size`: js.UndefOr[TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]] = js.native
  
  /**
    * The **`table-layout`** CSS property sets the algorithm used to lay out `<table>` cells, rows, and columns.
    *
    * **Syntax**: `auto | fixed`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **14** |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/table-layout
    */
  var `table-layout`: js.UndefOr[TableLayoutProperty | js.Array[TableLayoutProperty]] = js.native
  
  /**
    * The **`text-align`** CSS property sets the horizontal alignment of an inline or table-cell box. This means it works like `vertical-align` but in the horizontal direction.
    *
    * **Syntax**: `start | end | left | right | center | justify | match-parent`
    *
    * **Initial value**: `start`, or a nameless value that acts as `left` if _direction_ is `ltr`, `right` if _direction_ is `rtl` if `start` is not supported by the browser.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align
    */
  var `text-align`: js.UndefOr[TextAlignProperty | js.Array[TextAlignProperty]] = js.native
  
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Syntax**: `auto | start | end | left | right | center | justify`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **47** | **49**  |   No   | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-align-last
    */
  var `text-align-last`: js.UndefOr[TextAlignLastProperty | js.Array[TextAlignLastProperty]] = js.native
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    *
    * |           Chrome           | Firefox |              Safari              |                  Edge                  |                   IE                   |
    * | :------------------------: | :-----: | :------------------------------: | :------------------------------------: | :------------------------------------: |
    * |           **48**           | **48**  | **5.1** _(-webkit-text-combine)_ | **12** _(-ms-text-combine-horizontal)_ | **11** _(-ms-text-combine-horizontal)_ |
    * | 9 _(-webkit-text-combine)_ |         |                                  |                                        |                                        |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-combine-upright
    */
  var `text-combine-upright`: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.native
  
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **36**  | **12.1** | **79** | No  |
    * |        |         | 8 _-x-_  |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-color
    */
  var `text-decoration-color`: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.native
  
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **36**  | **12.1** | **79** | No  |
    * |        |         | 8 _-x-_  |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-line
    */
  var `text-decoration-line`: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.native
  
  /**
    * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
    *
    * **Syntax**: `none | [ objects || [ spaces | [ leading-spaces || trailing-spaces ] ] || edges || box-decoration ]`
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
  var `text-decoration-skip`: js.UndefOr[TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]] = js.native
  
  /**
    * The **`text-decoration-skip-ink`** CSS property specifies how overlines and underlines are drawn when they pass over glyph ascenders and descenders.
    *
    * **Syntax**: `auto | all | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **64** | **70**  |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-skip-ink
    */
  var `text-decoration-skip-ink`: js.UndefOr[TextDecorationSkipInkProperty | js.Array[TextDecorationSkipInkProperty]] = js.native
  
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Syntax**: `solid | double | dotted | dashed | wavy`
    *
    * **Initial value**: `solid`
    *
    * | Chrome | Firefox |  Safari  |  Edge  | IE  |
    * | :----: | :-----: | :------: | :----: | :-: |
    * | **57** | **36**  | **12.1** | **79** | No  |
    * |        |         | 8 _-x-_  |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-style
    */
  var `text-decoration-style`: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.native
  
  /**
    * The **`text-decoration-thickness`** CSS property sets the thickness, or width, of the decoration line that is used on text in an element, such as a line-through, underline, or overline.
    *
    * **Syntax**: `auto | from-font | <length> | <percentage> `
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * |   No   | **70**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-thickness
    */
  var `text-decoration-thickness`: js.UndefOr[
    TextDecorationThicknessProperty[TLength] | js.Array[TextDecorationThicknessProperty[TLength]]
  ] = js.native
  
  /**
    * The **`text-decoration-thickness`** CSS property sets the thickness, or width, of the decoration line that is used on text in an element, such as a line-through, underline, or overline.
    *
    * **Syntax**: `auto | from-font | <length> | <percentage> `
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * |   No   | **70**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-decoration-thickness
    */
  var `text-decoration-width`: js.UndefOr[
    TextDecorationThicknessProperty[TLength] | js.Array[TextDecorationThicknessProperty[TLength]]
  ] = js.native
  
  /**
    * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    *
    * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
    * | :----------: | :-----: | :-----: | :----------: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-color
    */
  var `text-emphasis-color`: js.UndefOr[TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]] = js.native
  
  /**
    * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
    *
    * **Syntax**: `[ over | under ] && [ right | left ]`
    *
    * **Initial value**: `over right`
    *
    * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
    * | :----------: | :-----: | :-----: | :----------: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-position
    */
  var `text-emphasis-position`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
    *
    * **Syntax**: `none | [ [ filled | open ] || [ dot | circle | double-circle | triangle | sesame ] ] | <string>`
    *
    * **Initial value**: `none`
    *
    * |    Chrome    | Firefox | Safari  |     Edge     | IE  |
    * | :----------: | :-----: | :-----: | :----------: | :-: |
    * | **25** _-x-_ | **46**  | **6.1** | **79** _-x-_ | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-emphasis-style
    */
  var `text-emphasis-style`: js.UndefOr[TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]] = js.native
  
  /**
    * The **`text-indent`** CSS property sets the length of empty space (indentation) that is put before lines of text in a block.
    *
    * **Syntax**: `<length-percentage> && hanging? && each-line?`
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-indent
    */
  var `text-indent`: js.UndefOr[TextIndentProperty[TLength] | js.Array[TextIndentProperty[TLength]]] = js.native
  
  /**
    * The **`text-justify`** CSS property sets what type of justification should be applied to text when `text-align``: justify;` is set on an element.
    *
    * **Syntax**: `auto | inter-character | inter-word | none`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE   |
    * | :----: | :-----: | :----: | :----: | :----: |
    * |  n/a   | **55**  |   No   | **12** | **11** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-justify
    */
  var `text-justify`: js.UndefOr[TextJustifyProperty | js.Array[TextJustifyProperty]] = js.native
  
  /**
    * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
    *
    * **Syntax**: `mixed | upright | sideways`
    *
    * **Initial value**: `mixed`
    *
    * |  Chrome  | Firefox |  Safari   |  Edge  | IE  |
    * | :------: | :-----: | :-------: | :----: | :-: |
    * |  **48**  | **41**  |  **14**   | **79** | No  |
    * | 11 _-x-_ |         | 5.1 _-x-_ |        |     |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-orientation
    */
  var `text-orientation`: js.UndefOr[TextOrientationProperty | js.Array[TextOrientationProperty]] = js.native
  
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
    *
    * **Initial value**: `clip`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **1**  |  **7**  | **1.3** | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-overflow
    */
  var `text-overflow`: js.UndefOr[TextOverflowProperty | js.Array[TextOverflowProperty]] = js.native
  
  /**
    * The **`text-rendering`** CSS property provides information to the rendering engine about what to optimize for when rendering text.
    *
    * **Syntax**: `auto | optimizeSpeed | optimizeLegibility | geometricPrecision`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **4**  |  **1**  | **5**  | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-rendering
    */
  var `text-rendering`: js.UndefOr[TextRenderingProperty | js.Array[TextRenderingProperty]] = js.native
  
  /**
    * The **`text-shadow`** CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from the element, blur radius, and color.
    *
    * **Syntax**: `none | <shadow-t>#`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE   |
    * | :----: | :-----: | :-----: | :----: | :----: |
    * | **2**  | **3.5** | **1.1** | **12** | **10** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-shadow
    */
  var `text-shadow`: js.UndefOr[TextShadowProperty | js.Array[TextShadowProperty]] = js.native
  
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Syntax**: `none | auto | <percentage>`
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **54** |   No    |   No   | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-size-adjust
    */
  var `text-size-adjust`: js.UndefOr[TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]] = js.native
  
  /**
    * The **`text-transform`** CSS property specifies how to capitalize an element's text. It can be used to make text appear in all-uppercase or all-lowercase, or with each word capitalized. It also can help improve legibility for ruby
    *
    * **Syntax**: `none | capitalize | uppercase | lowercase | full-width | full-size-kana`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-transform
    */
  var `text-transform`: js.UndefOr[TextTransformProperty | js.Array[TextTransformProperty]] = js.native
  
  /**
    * The **`text-underline-offset`** CSS property sets the offset distance of an underline text decoration line (applied using `text-decoration`) from its original position.
    *
    * **Syntax**: `auto | <length> | <percentage> `
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  | Edge | IE  |
    * | :----: | :-----: | :------: | :--: | :-: |
    * |   No   | **70**  | **12.1** |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-underline-offset
    */
  var `text-underline-offset`: js.UndefOr[
    TextUnderlineOffsetProperty[TLength] | js.Array[TextUnderlineOffsetProperty[TLength]]
  ] = js.native
  
  /**
    * The **`text-underline-position`** CSS property specifies the position of the underline which is set using the `text-decoration` property's `underline` value.
    *
    * **Syntax**: `auto | from-font | [ under || [ left | right ] ]`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox |  Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :------: | :----: | :---: |
    * | **33** | **74**  | **12.1** | **12** | **6** |
    * |        |         | 9 _-x-_  |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/text-underline-position
    */
  var `text-underline-position`: js.UndefOr[TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]] = js.native
  
  /**
    * The **`top`** CSS property participates in specifying the vertical position of a _positioned element_. It has no effect on non-positioned elements.
    *
    * **Syntax**: `<length> | <percentage> | auto`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/top
    */
  var top: js.UndefOr[TopProperty[TLength] | js.Array[TopProperty[TLength]]] = js.native
  
  /**
    * The **`touch-action`** CSS property sets how a region can be manipulated by a touchscreen user (for example, by zooming features built into the browser).
    *
    * **Syntax**: `auto | none | [ [ pan-x | pan-left | pan-right ] || [ pan-y | pan-up | pan-down ] || pinch-zoom ] | manipulation`
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
  var `touch-action`: js.UndefOr[TouchActionProperty | js.Array[TouchActionProperty]] = js.native
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |   IE    |
    * | :-----: | :-----: | :-------: | :----: | :-----: |
    * | **36**  | **16**  |   **9**   | **12** | **10**  |
    * | 1 _-x-_ |         | 3.1 _-x-_ |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform
    */
  var transform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.native
  
  /**
    * The **`transform-box`** CSS property defines the layout box to which the `transform` and `transform-origin` properties relate.
    *
    * **Syntax**: `content-box | border-box | fill-box | stroke-box | view-box`
    *
    * **Initial value**: `view-box`
    *
    * | Chrome | Firefox | Safari |  Edge  | IE  |
    * | :----: | :-----: | :----: | :----: | :-: |
    * | **64** | **55**  | **11** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-box
    */
  var `transform-box`: js.UndefOr[TransformBoxProperty | js.Array[TransformBoxProperty]] = js.native
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    *
    * | Chrome  |  Firefox  | Safari  |  Edge  |   IE    |
    * | :-----: | :-------: | :-----: | :----: | :-----: |
    * | **36**  |  **16**   |  **9**  | **12** | **10**  |
    * | 1 _-x-_ | 3.5 _-x-_ | 2 _-x-_ |        | 9 _-x-_ |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/transform-origin
    */
  var `transform-origin`: js.UndefOr[TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]] = js.native
  
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Syntax**: `flat | preserve-3d`
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
  var `transform-style`: js.UndefOr[TransformStyleProperty | js.Array[TransformStyleProperty]] = js.native
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
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
  var `transition-delay`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
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
  var `transition-duration`: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
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
  var `transition-property`: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.native
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
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
  var `transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.native
  
  /**
    * The **`translate`** CSS property allows you to specify translation transforms individually and independantly of the `transform` property. This maps better to typical user interface usage, and saves having to remember the exact order of transform functions to specify in the `transform` value.
    *
    * **Syntax**: `none | <length-percentage> [ <length-percentage> <length>? ]?`
    *
    * **Initial value**: `none`
    *
    * | Chrome | Firefox | Safari | Edge | IE  |
    * | :----: | :-----: | :----: | :--: | :-: |
    * |   No   | **72**  |   No   |  No  | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/translate
    */
  var translate: js.UndefOr[TranslateProperty[TLength] | js.Array[TranslateProperty[TLength]]] = js.native
  
  /**
    * The **`unicode-bidi`** CSS property, together with the `direction` property, determines how bidirectional text in a document is handled. For example, if a block of content contains both left-to-right and right-to-left text, the user-agent uses a complex Unicode algorithm to decide how to display the text. The `unicode-bidi` property overrides this algorithm and allows the developer to control the text embedding.
    *
    * **Syntax**: `normal | embed | isolate | bidi-override | isolate-override | plaintext`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **2**  |  **1**  | **1.3** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/unicode-bidi
    */
  var `unicode-bidi`: js.UndefOr[UnicodeBidiProperty | js.Array[UnicodeBidiProperty]] = js.native
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    *
    * | Chrome  | Firefox |   Safari    |     Edge     |      IE      |
    * | :-----: | :-----: | :---------: | :----------: | :----------: |
    * | **54**  | **69**  | **3** _-x-_ | **12** _-x-_ | **10** _-x-_ |
    * | 1 _-x-_ | 1 _-x-_ |             |              |              |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/user-select
    */
  var `user-select`: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.native
  
  /**
    * The **`vertical-align`** CSS property sets vertical alignment of an inline or table-cell box.
    *
    * **Syntax**: `baseline | sub | super | text-top | text-bottom | middle | top | bottom | <percentage> | <length>`
    *
    * **Initial value**: `baseline`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/vertical-align
    */
  var `vertical-align`: js.UndefOr[VerticalAlignProperty[TLength] | js.Array[VerticalAlignProperty[TLength]]] = js.native
  
  /**
    * The **`visibility`** CSS property shows or hides an element without changing the layout of a document. The property can also hide rows or columns in a `<table>`.
    *
    * **Syntax**: `visible | hidden | collapse`
    *
    * **Initial value**: `visible`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/visibility
    */
  var visibility: js.UndefOr[VisibilityProperty | js.Array[VisibilityProperty]] = js.native
  
  /**
    * The **`white-space`** CSS property sets how white space inside an element is handled.
    *
    * **Syntax**: `normal | pre | nowrap | pre-wrap | pre-line | break-spaces`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  |  **1**  | **1**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/white-space
    */
  var `white-space`: js.UndefOr[WhiteSpaceProperty | js.Array[WhiteSpaceProperty]] = js.native
  
  /**
    * The **`widows`** CSS property sets the minimum number of lines in a block container that must be shown at the _top_ of a page, region, or column.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `2`
    *
    * | Chrome | Firefox | Safari  |  Edge  |  IE   |
    * | :----: | :-----: | :-----: | :----: | :---: |
    * | **25** |   No    | **1.3** | **12** | **8** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/widows
    */
  var widows: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  /**
    * The **`width`** CSS property sets an element's width. By default it sets the width of the content area, but if `box-sizing` is set to `border-box`, it sets the width of the border area.
    *
    * **Syntax**: `auto | <length> | <percentage> | min-content | max-content | fit-content(<length-percentage>)`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/width
    */
  var width: js.UndefOr[WidthProperty[TLength] | js.Array[WidthProperty[TLength]]] = js.native
  
  /**
    * The **`will-change`** CSS property hints to browsers how an element is expected to change. Browsers may set up optimizations before an element is actually changed. These kinds of optimizations can increase the responsiveness of a page by doing potentially expensive work before they are actually required.
    *
    * **Syntax**: `auto | <animateable-feature>#`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari  |  Edge  | IE  |
    * | :----: | :-----: | :-----: | :----: | :-: |
    * | **36** | **36**  | **9.1** | **79** | No  |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/will-change
    */
  var `will-change`: js.UndefOr[WillChangeProperty | js.Array[WillChangeProperty]] = js.native
  
  /**
    * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
    *
    * **Syntax**: `normal | break-all | keep-all | break-word`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **15**  | **3**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-break
    */
  var `word-break`: js.UndefOr[WordBreakProperty | js.Array[WordBreakProperty]] = js.native
  
  /**
    * The **`word-spacing`** CSS property sets the length of space between words and between tags.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **6** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/word-spacing
    */
  var `word-spacing`: js.UndefOr[WordSpacingProperty[TLength] | js.Array[WordSpacingProperty[TLength]]] = js.native
  
  /**
    * The `**overflow-wrap**` CSS property sets whether the browser should insert line breaks within words to prevent text from overflowing its content box.
    *
    * **Syntax**: `normal | break-word`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari |  Edge  |   IE    |
    * | :----: | :-----: | :----: | :----: | :-----: |
    * | **1**  | **3.5** | **2**  | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/overflow-wrap
    */
  var `word-wrap`: js.UndefOr[WordWrapProperty | js.Array[WordWrapProperty]] = js.native
  
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
    *
    * **Initial value**: `horizontal-tb`
    *
    * | Chrome  | Firefox |  Safari   |  Edge  |  IE   |
    * | :-----: | :-----: | :-------: | :----: | :---: |
    * | **48**  | **41**  | **10.1**  | **12** | **9** |
    * | 8 _-x-_ |         | 5.1 _-x-_ |        |       |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/writing-mode
    */
  var `writing-mode`: js.UndefOr[WritingModeProperty | js.Array[WritingModeProperty]] = js.native
  
  /**
    * The **`z-index`** CSS property sets the z-order of a positioned element and its descendants or flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * **Syntax**: `auto | <integer>`
    *
    * **Initial value**: `auto`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/z-index
    */
  var `z-index`: js.UndefOr[ZIndexProperty | js.Array[ZIndexProperty]] = js.native
  
  /**
    * The non-standard **`zoom`** CSS property can be used to control the magnification level of an element. `transform: scale()` should be used instead of this property, if possible. However, unlike CSS Transforms, `zoom` affects the layout size of the element.
    *
    * **Syntax**: `normal | reset | <number> | <percentage>`
    *
    * **Initial value**: `normal`
    *
    * | Chrome | Firefox | Safari  |  Edge  |   IE    |
    * | :----: | :-----: | :-----: | :----: | :-----: |
    * | **1**  |   No    | **3.1** | **12** | **5.5** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/zoom
    */
  var zoom: js.UndefOr[ZoomProperty | js.Array[ZoomProperty]] = js.native
}
object StandardLonghandPropertiesHyphenFallback {
  
  @scala.inline
  def apply[TLength](): StandardLonghandPropertiesHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardLonghandPropertiesHyphenFallback[TLength]]
  }
  
  @scala.inline
  implicit class StandardLonghandPropertiesHyphenFallbackMutableBuilder[Self <: StandardLonghandPropertiesHyphenFallback[_], TLength] (val x: Self with StandardLonghandPropertiesHyphenFallback[TLength]) extends AnyVal {
    
    @scala.inline
    def `setAlign-content`(value: AlignContentProperty | js.Array[AlignContentProperty]): Self = StObject.set(x, "align-content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAlign-contentUndefined`: Self = StObject.set(x, "align-content", js.undefined)
    
    @scala.inline
    def `setAlign-contentVarargs`(value: AlignContentProperty*): Self = StObject.set(x, "align-content", js.Array(value :_*))
    
    @scala.inline
    def `setAlign-items`(value: AlignItemsProperty | js.Array[AlignItemsProperty]): Self = StObject.set(x, "align-items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAlign-itemsUndefined`: Self = StObject.set(x, "align-items", js.undefined)
    
    @scala.inline
    def `setAlign-itemsVarargs`(value: AlignItemsProperty*): Self = StObject.set(x, "align-items", js.Array(value :_*))
    
    @scala.inline
    def `setAlign-self`(value: AlignSelfProperty | js.Array[AlignSelfProperty]): Self = StObject.set(x, "align-self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAlign-selfUndefined`: Self = StObject.set(x, "align-self", js.undefined)
    
    @scala.inline
    def `setAlign-selfVarargs`(value: AlignSelfProperty*): Self = StObject.set(x, "align-self", js.Array(value :_*))
    
    @scala.inline
    def `setAlign-tracks`(value: AlignTracksProperty | js.Array[AlignTracksProperty]): Self = StObject.set(x, "align-tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAlign-tracksUndefined`: Self = StObject.set(x, "align-tracks", js.undefined)
    
    @scala.inline
    def `setAlign-tracksVarargs`(value: AlignTracksProperty*): Self = StObject.set(x, "align-tracks", js.Array(value :_*))
    
    @scala.inline
    def `setAnimation-delay`(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "animation-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAnimation-delayUndefined`: Self = StObject.set(x, "animation-delay", js.undefined)
    
    @scala.inline
    def `setAnimation-delayVarargs`(value: GlobalsString*): Self = StObject.set(x, "animation-delay", js.Array(value :_*))
    
    @scala.inline
    def `setAnimation-direction`(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): Self = StObject.set(x, "animation-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAnimation-directionUndefined`: Self = StObject.set(x, "animation-direction", js.undefined)
    
    @scala.inline
    def `setAnimation-directionVarargs`(value: AnimationDirectionProperty*): Self = StObject.set(x, "animation-direction", js.Array(value :_*))
    
    @scala.inline
    def `setAnimation-duration`(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "animation-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAnimation-durationUndefined`: Self = StObject.set(x, "animation-duration", js.undefined)
    
    @scala.inline
    def `setAnimation-durationVarargs`(value: GlobalsString*): Self = StObject.set(x, "animation-duration", js.Array(value :_*))
    
    @scala.inline
    def `setAnimation-fill-mode`(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): Self = StObject.set(x, "animation-fill-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAnimation-fill-modeUndefined`: Self = StObject.set(x, "animation-fill-mode", js.undefined)
    
    @scala.inline
    def `setAnimation-fill-modeVarargs`(value: AnimationFillModeProperty*): Self = StObject.set(x, "animation-fill-mode", js.Array(value :_*))
    
    @scala.inline
    def `setAnimation-iteration-count`(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): Self = StObject.set(x, "animation-iteration-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAnimation-iteration-countUndefined`: Self = StObject.set(x, "animation-iteration-count", js.undefined)
    
    @scala.inline
    def `setAnimation-iteration-countVarargs`(value: AnimationIterationCountProperty*): Self = StObject.set(x, "animation-iteration-count", js.Array(value :_*))
    
    @scala.inline
    def `setAnimation-name`(value: AnimationNameProperty | js.Array[AnimationNameProperty]): Self = StObject.set(x, "animation-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAnimation-nameUndefined`: Self = StObject.set(x, "animation-name", js.undefined)
    
    @scala.inline
    def `setAnimation-nameVarargs`(value: AnimationNameProperty*): Self = StObject.set(x, "animation-name", js.Array(value :_*))
    
    @scala.inline
    def `setAnimation-play-state`(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): Self = StObject.set(x, "animation-play-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAnimation-play-stateUndefined`: Self = StObject.set(x, "animation-play-state", js.undefined)
    
    @scala.inline
    def `setAnimation-play-stateVarargs`(value: AnimationPlayStateProperty*): Self = StObject.set(x, "animation-play-state", js.Array(value :_*))
    
    @scala.inline
    def `setAnimation-timing-function`(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): Self = StObject.set(x, "animation-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAnimation-timing-functionUndefined`: Self = StObject.set(x, "animation-timing-function", js.undefined)
    
    @scala.inline
    def `setAnimation-timing-functionVarargs`(value: AnimationTimingFunctionProperty*): Self = StObject.set(x, "animation-timing-function", js.Array(value :_*))
    
    @scala.inline
    def setAppearance(value: AppearanceProperty | js.Array[AppearanceProperty]): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    @scala.inline
    def setAppearanceVarargs(value: AppearanceProperty*): Self = StObject.set(x, "appearance", js.Array(value :_*))
    
    @scala.inline
    def `setAspect-ratio`(value: AspectRatioProperty | js.Array[AspectRatioProperty]): Self = StObject.set(x, "aspect-ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAspect-ratioUndefined`: Self = StObject.set(x, "aspect-ratio", js.undefined)
    
    @scala.inline
    def `setAspect-ratioVarargs`(value: AspectRatioProperty*): Self = StObject.set(x, "aspect-ratio", js.Array(value :_*))
    
    @scala.inline
    def `setBackdrop-filter`(value: BackdropFilterProperty | js.Array[BackdropFilterProperty]): Self = StObject.set(x, "backdrop-filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackdrop-filterUndefined`: Self = StObject.set(x, "backdrop-filter", js.undefined)
    
    @scala.inline
    def `setBackdrop-filterVarargs`(value: BackdropFilterProperty*): Self = StObject.set(x, "backdrop-filter", js.Array(value :_*))
    
    @scala.inline
    def `setBackface-visibility`(value: BackfaceVisibilityProperty | js.Array[BackfaceVisibilityProperty]): Self = StObject.set(x, "backface-visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackface-visibilityUndefined`: Self = StObject.set(x, "backface-visibility", js.undefined)
    
    @scala.inline
    def `setBackface-visibilityVarargs`(value: BackfaceVisibilityProperty*): Self = StObject.set(x, "backface-visibility", js.Array(value :_*))
    
    @scala.inline
    def `setBackground-attachment`(value: BackgroundAttachmentProperty | js.Array[BackgroundAttachmentProperty]): Self = StObject.set(x, "background-attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-attachmentUndefined`: Self = StObject.set(x, "background-attachment", js.undefined)
    
    @scala.inline
    def `setBackground-attachmentVarargs`(value: BackgroundAttachmentProperty*): Self = StObject.set(x, "background-attachment", js.Array(value :_*))
    
    @scala.inline
    def `setBackground-blend-mode`(value: BackgroundBlendModeProperty | js.Array[BackgroundBlendModeProperty]): Self = StObject.set(x, "background-blend-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-blend-modeUndefined`: Self = StObject.set(x, "background-blend-mode", js.undefined)
    
    @scala.inline
    def `setBackground-blend-modeVarargs`(value: BackgroundBlendModeProperty*): Self = StObject.set(x, "background-blend-mode", js.Array(value :_*))
    
    @scala.inline
    def `setBackground-clip`(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): Self = StObject.set(x, "background-clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-clipUndefined`: Self = StObject.set(x, "background-clip", js.undefined)
    
    @scala.inline
    def `setBackground-clipVarargs`(value: BackgroundClipProperty*): Self = StObject.set(x, "background-clip", js.Array(value :_*))
    
    @scala.inline
    def `setBackground-color`(value: BackgroundColorProperty | js.Array[BackgroundColorProperty]): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    @scala.inline
    def `setBackground-colorVarargs`(value: BackgroundColorProperty*): Self = StObject.set(x, "background-color", js.Array(value :_*))
    
    @scala.inline
    def `setBackground-image`(value: BackgroundImageProperty | js.Array[BackgroundImageProperty]): Self = StObject.set(x, "background-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-imageUndefined`: Self = StObject.set(x, "background-image", js.undefined)
    
    @scala.inline
    def `setBackground-imageVarargs`(value: BackgroundImageProperty*): Self = StObject.set(x, "background-image", js.Array(value :_*))
    
    @scala.inline
    def `setBackground-origin`(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): Self = StObject.set(x, "background-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-originUndefined`: Self = StObject.set(x, "background-origin", js.undefined)
    
    @scala.inline
    def `setBackground-originVarargs`(value: BackgroundOriginProperty*): Self = StObject.set(x, "background-origin", js.Array(value :_*))
    
    @scala.inline
    def `setBackground-position`(value: BackgroundPositionProperty[TLength] | js.Array[BackgroundPositionProperty[TLength]]): Self = StObject.set(x, "background-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-position-x`(value: BackgroundPositionXProperty[TLength] | js.Array[BackgroundPositionXProperty[TLength]]): Self = StObject.set(x, "background-position-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-position-xUndefined`: Self = StObject.set(x, "background-position-x", js.undefined)
    
    @scala.inline
    def `setBackground-position-xVarargs`(value: BackgroundPositionXProperty[TLength]*): Self = StObject.set(x, "background-position-x", js.Array(value :_*))
    
    @scala.inline
    def `setBackground-position-y`(value: BackgroundPositionYProperty[TLength] | js.Array[BackgroundPositionYProperty[TLength]]): Self = StObject.set(x, "background-position-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-position-yUndefined`: Self = StObject.set(x, "background-position-y", js.undefined)
    
    @scala.inline
    def `setBackground-position-yVarargs`(value: BackgroundPositionYProperty[TLength]*): Self = StObject.set(x, "background-position-y", js.Array(value :_*))
    
    @scala.inline
    def `setBackground-positionUndefined`: Self = StObject.set(x, "background-position", js.undefined)
    
    @scala.inline
    def `setBackground-positionVarargs`(value: BackgroundPositionProperty[TLength]*): Self = StObject.set(x, "background-position", js.Array(value :_*))
    
    @scala.inline
    def `setBackground-repeat`(value: BackgroundRepeatProperty | js.Array[BackgroundRepeatProperty]): Self = StObject.set(x, "background-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-repeatUndefined`: Self = StObject.set(x, "background-repeat", js.undefined)
    
    @scala.inline
    def `setBackground-repeatVarargs`(value: BackgroundRepeatProperty*): Self = StObject.set(x, "background-repeat", js.Array(value :_*))
    
    @scala.inline
    def `setBackground-size`(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = StObject.set(x, "background-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBackground-sizeUndefined`: Self = StObject.set(x, "background-size", js.undefined)
    
    @scala.inline
    def `setBackground-sizeVarargs`(value: BackgroundSizeProperty[TLength]*): Self = StObject.set(x, "background-size", js.Array(value :_*))
    
    @scala.inline
    def `setBlock-overflow`(value: BlockOverflowProperty | js.Array[BlockOverflowProperty]): Self = StObject.set(x, "block-overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlock-overflowUndefined`: Self = StObject.set(x, "block-overflow", js.undefined)
    
    @scala.inline
    def `setBlock-overflowVarargs`(value: BlockOverflowProperty*): Self = StObject.set(x, "block-overflow", js.Array(value :_*))
    
    @scala.inline
    def `setBlock-size`(value: BlockSizeProperty[TLength] | js.Array[BlockSizeProperty[TLength]]): Self = StObject.set(x, "block-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBlock-sizeUndefined`: Self = StObject.set(x, "block-size", js.undefined)
    
    @scala.inline
    def `setBlock-sizeVarargs`(value: BlockSizeProperty[TLength]*): Self = StObject.set(x, "block-size", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-block-color`(value: BorderBlockColorProperty | js.Array[BorderBlockColorProperty]): Self = StObject.set(x, "border-block-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-block-colorUndefined`: Self = StObject.set(x, "border-block-color", js.undefined)
    
    @scala.inline
    def `setBorder-block-colorVarargs`(value: BorderBlockColorProperty*): Self = StObject.set(x, "border-block-color", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-block-end-color`(value: BorderBlockEndColorProperty | js.Array[BorderBlockEndColorProperty]): Self = StObject.set(x, "border-block-end-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-block-end-colorUndefined`: Self = StObject.set(x, "border-block-end-color", js.undefined)
    
    @scala.inline
    def `setBorder-block-end-colorVarargs`(value: BorderBlockEndColorProperty*): Self = StObject.set(x, "border-block-end-color", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-block-end-style`(value: BorderBlockEndStyleProperty | js.Array[BorderBlockEndStyleProperty]): Self = StObject.set(x, "border-block-end-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-block-end-styleUndefined`: Self = StObject.set(x, "border-block-end-style", js.undefined)
    
    @scala.inline
    def `setBorder-block-end-styleVarargs`(value: BorderBlockEndStyleProperty*): Self = StObject.set(x, "border-block-end-style", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-block-end-width`(value: BorderBlockEndWidthProperty[TLength] | js.Array[BorderBlockEndWidthProperty[TLength]]): Self = StObject.set(x, "border-block-end-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-block-end-widthUndefined`: Self = StObject.set(x, "border-block-end-width", js.undefined)
    
    @scala.inline
    def `setBorder-block-end-widthVarargs`(value: BorderBlockEndWidthProperty[TLength]*): Self = StObject.set(x, "border-block-end-width", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-block-start-color`(value: BorderBlockStartColorProperty | js.Array[BorderBlockStartColorProperty]): Self = StObject.set(x, "border-block-start-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-block-start-colorUndefined`: Self = StObject.set(x, "border-block-start-color", js.undefined)
    
    @scala.inline
    def `setBorder-block-start-colorVarargs`(value: BorderBlockStartColorProperty*): Self = StObject.set(x, "border-block-start-color", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-block-start-style`(value: BorderBlockStartStyleProperty | js.Array[BorderBlockStartStyleProperty]): Self = StObject.set(x, "border-block-start-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-block-start-styleUndefined`: Self = StObject.set(x, "border-block-start-style", js.undefined)
    
    @scala.inline
    def `setBorder-block-start-styleVarargs`(value: BorderBlockStartStyleProperty*): Self = StObject.set(x, "border-block-start-style", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-block-start-width`(value: BorderBlockStartWidthProperty[TLength] | js.Array[BorderBlockStartWidthProperty[TLength]]): Self = StObject.set(x, "border-block-start-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-block-start-widthUndefined`: Self = StObject.set(x, "border-block-start-width", js.undefined)
    
    @scala.inline
    def `setBorder-block-start-widthVarargs`(value: BorderBlockStartWidthProperty[TLength]*): Self = StObject.set(x, "border-block-start-width", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-block-style`(value: BorderBlockStyleProperty | js.Array[BorderBlockStyleProperty]): Self = StObject.set(x, "border-block-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-block-styleUndefined`: Self = StObject.set(x, "border-block-style", js.undefined)
    
    @scala.inline
    def `setBorder-block-styleVarargs`(value: BorderBlockStyleProperty*): Self = StObject.set(x, "border-block-style", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-block-width`(value: BorderBlockWidthProperty[TLength] | js.Array[BorderBlockWidthProperty[TLength]]): Self = StObject.set(x, "border-block-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-block-widthUndefined`: Self = StObject.set(x, "border-block-width", js.undefined)
    
    @scala.inline
    def `setBorder-block-widthVarargs`(value: BorderBlockWidthProperty[TLength]*): Self = StObject.set(x, "border-block-width", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-bottom-color`(value: BorderBottomColorProperty | js.Array[BorderBottomColorProperty]): Self = StObject.set(x, "border-bottom-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-bottom-colorUndefined`: Self = StObject.set(x, "border-bottom-color", js.undefined)
    
    @scala.inline
    def `setBorder-bottom-colorVarargs`(value: BorderBottomColorProperty*): Self = StObject.set(x, "border-bottom-color", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-bottom-left-radius`(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): Self = StObject.set(x, "border-bottom-left-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-bottom-left-radiusUndefined`: Self = StObject.set(x, "border-bottom-left-radius", js.undefined)
    
    @scala.inline
    def `setBorder-bottom-left-radiusVarargs`(value: BorderBottomLeftRadiusProperty[TLength]*): Self = StObject.set(x, "border-bottom-left-radius", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-bottom-right-radius`(
      value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
    ): Self = StObject.set(x, "border-bottom-right-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-bottom-right-radiusUndefined`: Self = StObject.set(x, "border-bottom-right-radius", js.undefined)
    
    @scala.inline
    def `setBorder-bottom-right-radiusVarargs`(value: BorderBottomRightRadiusProperty[TLength]*): Self = StObject.set(x, "border-bottom-right-radius", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-bottom-style`(value: BorderBottomStyleProperty | js.Array[BorderBottomStyleProperty]): Self = StObject.set(x, "border-bottom-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-bottom-styleUndefined`: Self = StObject.set(x, "border-bottom-style", js.undefined)
    
    @scala.inline
    def `setBorder-bottom-styleVarargs`(value: BorderBottomStyleProperty*): Self = StObject.set(x, "border-bottom-style", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-bottom-width`(value: BorderBottomWidthProperty[TLength] | js.Array[BorderBottomWidthProperty[TLength]]): Self = StObject.set(x, "border-bottom-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-bottom-widthUndefined`: Self = StObject.set(x, "border-bottom-width", js.undefined)
    
    @scala.inline
    def `setBorder-bottom-widthVarargs`(value: BorderBottomWidthProperty[TLength]*): Self = StObject.set(x, "border-bottom-width", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-collapse`(value: BorderCollapseProperty | js.Array[BorderCollapseProperty]): Self = StObject.set(x, "border-collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-collapseUndefined`: Self = StObject.set(x, "border-collapse", js.undefined)
    
    @scala.inline
    def `setBorder-collapseVarargs`(value: BorderCollapseProperty*): Self = StObject.set(x, "border-collapse", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-end-end-radius`(value: BorderEndEndRadiusProperty[TLength] | js.Array[BorderEndEndRadiusProperty[TLength]]): Self = StObject.set(x, "border-end-end-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-end-end-radiusUndefined`: Self = StObject.set(x, "border-end-end-radius", js.undefined)
    
    @scala.inline
    def `setBorder-end-end-radiusVarargs`(value: BorderEndEndRadiusProperty[TLength]*): Self = StObject.set(x, "border-end-end-radius", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-end-start-radius`(value: BorderEndStartRadiusProperty[TLength] | js.Array[BorderEndStartRadiusProperty[TLength]]): Self = StObject.set(x, "border-end-start-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-end-start-radiusUndefined`: Self = StObject.set(x, "border-end-start-radius", js.undefined)
    
    @scala.inline
    def `setBorder-end-start-radiusVarargs`(value: BorderEndStartRadiusProperty[TLength]*): Self = StObject.set(x, "border-end-start-radius", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-image-outset`(value: BorderImageOutsetProperty[TLength] | js.Array[BorderImageOutsetProperty[TLength]]): Self = StObject.set(x, "border-image-outset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-image-outsetUndefined`: Self = StObject.set(x, "border-image-outset", js.undefined)
    
    @scala.inline
    def `setBorder-image-outsetVarargs`(value: BorderImageOutsetProperty[TLength]*): Self = StObject.set(x, "border-image-outset", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-image-repeat`(value: BorderImageRepeatProperty | js.Array[BorderImageRepeatProperty]): Self = StObject.set(x, "border-image-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-image-repeatUndefined`: Self = StObject.set(x, "border-image-repeat", js.undefined)
    
    @scala.inline
    def `setBorder-image-repeatVarargs`(value: BorderImageRepeatProperty*): Self = StObject.set(x, "border-image-repeat", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-image-slice`(value: BorderImageSliceProperty | js.Array[BorderImageSliceProperty]): Self = StObject.set(x, "border-image-slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-image-sliceUndefined`: Self = StObject.set(x, "border-image-slice", js.undefined)
    
    @scala.inline
    def `setBorder-image-sliceVarargs`(value: BorderImageSliceProperty*): Self = StObject.set(x, "border-image-slice", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-image-source`(value: BorderImageSourceProperty | js.Array[BorderImageSourceProperty]): Self = StObject.set(x, "border-image-source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-image-sourceUndefined`: Self = StObject.set(x, "border-image-source", js.undefined)
    
    @scala.inline
    def `setBorder-image-sourceVarargs`(value: BorderImageSourceProperty*): Self = StObject.set(x, "border-image-source", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-image-width`(value: BorderImageWidthProperty[TLength] | js.Array[BorderImageWidthProperty[TLength]]): Self = StObject.set(x, "border-image-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-image-widthUndefined`: Self = StObject.set(x, "border-image-width", js.undefined)
    
    @scala.inline
    def `setBorder-image-widthVarargs`(value: BorderImageWidthProperty[TLength]*): Self = StObject.set(x, "border-image-width", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-inline-color`(value: BorderInlineColorProperty | js.Array[BorderInlineColorProperty]): Self = StObject.set(x, "border-inline-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-inline-colorUndefined`: Self = StObject.set(x, "border-inline-color", js.undefined)
    
    @scala.inline
    def `setBorder-inline-colorVarargs`(value: BorderInlineColorProperty*): Self = StObject.set(x, "border-inline-color", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-inline-end-color`(value: BorderInlineEndColorProperty | js.Array[BorderInlineEndColorProperty]): Self = StObject.set(x, "border-inline-end-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-inline-end-colorUndefined`: Self = StObject.set(x, "border-inline-end-color", js.undefined)
    
    @scala.inline
    def `setBorder-inline-end-colorVarargs`(value: BorderInlineEndColorProperty*): Self = StObject.set(x, "border-inline-end-color", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-inline-end-style`(value: BorderInlineEndStyleProperty | js.Array[BorderInlineEndStyleProperty]): Self = StObject.set(x, "border-inline-end-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-inline-end-styleUndefined`: Self = StObject.set(x, "border-inline-end-style", js.undefined)
    
    @scala.inline
    def `setBorder-inline-end-styleVarargs`(value: BorderInlineEndStyleProperty*): Self = StObject.set(x, "border-inline-end-style", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-inline-end-width`(value: BorderInlineEndWidthProperty[TLength] | js.Array[BorderInlineEndWidthProperty[TLength]]): Self = StObject.set(x, "border-inline-end-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-inline-end-widthUndefined`: Self = StObject.set(x, "border-inline-end-width", js.undefined)
    
    @scala.inline
    def `setBorder-inline-end-widthVarargs`(value: BorderInlineEndWidthProperty[TLength]*): Self = StObject.set(x, "border-inline-end-width", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-inline-start-color`(value: BorderInlineStartColorProperty | js.Array[BorderInlineStartColorProperty]): Self = StObject.set(x, "border-inline-start-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-inline-start-colorUndefined`: Self = StObject.set(x, "border-inline-start-color", js.undefined)
    
    @scala.inline
    def `setBorder-inline-start-colorVarargs`(value: BorderInlineStartColorProperty*): Self = StObject.set(x, "border-inline-start-color", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-inline-start-style`(value: BorderInlineStartStyleProperty | js.Array[BorderInlineStartStyleProperty]): Self = StObject.set(x, "border-inline-start-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-inline-start-styleUndefined`: Self = StObject.set(x, "border-inline-start-style", js.undefined)
    
    @scala.inline
    def `setBorder-inline-start-styleVarargs`(value: BorderInlineStartStyleProperty*): Self = StObject.set(x, "border-inline-start-style", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-inline-start-width`(value: BorderInlineStartWidthProperty[TLength] | js.Array[BorderInlineStartWidthProperty[TLength]]): Self = StObject.set(x, "border-inline-start-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-inline-start-widthUndefined`: Self = StObject.set(x, "border-inline-start-width", js.undefined)
    
    @scala.inline
    def `setBorder-inline-start-widthVarargs`(value: BorderInlineStartWidthProperty[TLength]*): Self = StObject.set(x, "border-inline-start-width", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-inline-style`(value: BorderInlineStyleProperty | js.Array[BorderInlineStyleProperty]): Self = StObject.set(x, "border-inline-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-inline-styleUndefined`: Self = StObject.set(x, "border-inline-style", js.undefined)
    
    @scala.inline
    def `setBorder-inline-styleVarargs`(value: BorderInlineStyleProperty*): Self = StObject.set(x, "border-inline-style", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-inline-width`(value: BorderInlineWidthProperty[TLength] | js.Array[BorderInlineWidthProperty[TLength]]): Self = StObject.set(x, "border-inline-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-inline-widthUndefined`: Self = StObject.set(x, "border-inline-width", js.undefined)
    
    @scala.inline
    def `setBorder-inline-widthVarargs`(value: BorderInlineWidthProperty[TLength]*): Self = StObject.set(x, "border-inline-width", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-left-color`(value: BorderLeftColorProperty | js.Array[BorderLeftColorProperty]): Self = StObject.set(x, "border-left-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-left-colorUndefined`: Self = StObject.set(x, "border-left-color", js.undefined)
    
    @scala.inline
    def `setBorder-left-colorVarargs`(value: BorderLeftColorProperty*): Self = StObject.set(x, "border-left-color", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-left-style`(value: BorderLeftStyleProperty | js.Array[BorderLeftStyleProperty]): Self = StObject.set(x, "border-left-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-left-styleUndefined`: Self = StObject.set(x, "border-left-style", js.undefined)
    
    @scala.inline
    def `setBorder-left-styleVarargs`(value: BorderLeftStyleProperty*): Self = StObject.set(x, "border-left-style", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-left-width`(value: BorderLeftWidthProperty[TLength] | js.Array[BorderLeftWidthProperty[TLength]]): Self = StObject.set(x, "border-left-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-left-widthUndefined`: Self = StObject.set(x, "border-left-width", js.undefined)
    
    @scala.inline
    def `setBorder-left-widthVarargs`(value: BorderLeftWidthProperty[TLength]*): Self = StObject.set(x, "border-left-width", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-right-color`(value: BorderRightColorProperty | js.Array[BorderRightColorProperty]): Self = StObject.set(x, "border-right-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-right-colorUndefined`: Self = StObject.set(x, "border-right-color", js.undefined)
    
    @scala.inline
    def `setBorder-right-colorVarargs`(value: BorderRightColorProperty*): Self = StObject.set(x, "border-right-color", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-right-style`(value: BorderRightStyleProperty | js.Array[BorderRightStyleProperty]): Self = StObject.set(x, "border-right-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-right-styleUndefined`: Self = StObject.set(x, "border-right-style", js.undefined)
    
    @scala.inline
    def `setBorder-right-styleVarargs`(value: BorderRightStyleProperty*): Self = StObject.set(x, "border-right-style", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-right-width`(value: BorderRightWidthProperty[TLength] | js.Array[BorderRightWidthProperty[TLength]]): Self = StObject.set(x, "border-right-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-right-widthUndefined`: Self = StObject.set(x, "border-right-width", js.undefined)
    
    @scala.inline
    def `setBorder-right-widthVarargs`(value: BorderRightWidthProperty[TLength]*): Self = StObject.set(x, "border-right-width", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-spacing`(value: BorderSpacingProperty[TLength] | js.Array[BorderSpacingProperty[TLength]]): Self = StObject.set(x, "border-spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-spacingUndefined`: Self = StObject.set(x, "border-spacing", js.undefined)
    
    @scala.inline
    def `setBorder-spacingVarargs`(value: BorderSpacingProperty[TLength]*): Self = StObject.set(x, "border-spacing", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-start-end-radius`(value: BorderStartEndRadiusProperty[TLength] | js.Array[BorderStartEndRadiusProperty[TLength]]): Self = StObject.set(x, "border-start-end-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-start-end-radiusUndefined`: Self = StObject.set(x, "border-start-end-radius", js.undefined)
    
    @scala.inline
    def `setBorder-start-end-radiusVarargs`(value: BorderStartEndRadiusProperty[TLength]*): Self = StObject.set(x, "border-start-end-radius", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-start-start-radius`(value: BorderStartStartRadiusProperty[TLength] | js.Array[BorderStartStartRadiusProperty[TLength]]): Self = StObject.set(x, "border-start-start-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-start-start-radiusUndefined`: Self = StObject.set(x, "border-start-start-radius", js.undefined)
    
    @scala.inline
    def `setBorder-start-start-radiusVarargs`(value: BorderStartStartRadiusProperty[TLength]*): Self = StObject.set(x, "border-start-start-radius", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-top-color`(value: BorderTopColorProperty | js.Array[BorderTopColorProperty]): Self = StObject.set(x, "border-top-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-top-colorUndefined`: Self = StObject.set(x, "border-top-color", js.undefined)
    
    @scala.inline
    def `setBorder-top-colorVarargs`(value: BorderTopColorProperty*): Self = StObject.set(x, "border-top-color", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-top-left-radius`(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): Self = StObject.set(x, "border-top-left-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-top-left-radiusUndefined`: Self = StObject.set(x, "border-top-left-radius", js.undefined)
    
    @scala.inline
    def `setBorder-top-left-radiusVarargs`(value: BorderTopLeftRadiusProperty[TLength]*): Self = StObject.set(x, "border-top-left-radius", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-top-right-radius`(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): Self = StObject.set(x, "border-top-right-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-top-right-radiusUndefined`: Self = StObject.set(x, "border-top-right-radius", js.undefined)
    
    @scala.inline
    def `setBorder-top-right-radiusVarargs`(value: BorderTopRightRadiusProperty[TLength]*): Self = StObject.set(x, "border-top-right-radius", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-top-style`(value: BorderTopStyleProperty | js.Array[BorderTopStyleProperty]): Self = StObject.set(x, "border-top-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-top-styleUndefined`: Self = StObject.set(x, "border-top-style", js.undefined)
    
    @scala.inline
    def `setBorder-top-styleVarargs`(value: BorderTopStyleProperty*): Self = StObject.set(x, "border-top-style", js.Array(value :_*))
    
    @scala.inline
    def `setBorder-top-width`(value: BorderTopWidthProperty[TLength] | js.Array[BorderTopWidthProperty[TLength]]): Self = StObject.set(x, "border-top-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-top-widthUndefined`: Self = StObject.set(x, "border-top-width", js.undefined)
    
    @scala.inline
    def `setBorder-top-widthVarargs`(value: BorderTopWidthProperty[TLength]*): Self = StObject.set(x, "border-top-width", js.Array(value :_*))
    
    @scala.inline
    def setBottom(value: BottomProperty[TLength] | js.Array[BottomProperty[TLength]]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setBottomVarargs(value: BottomProperty[TLength]*): Self = StObject.set(x, "bottom", js.Array(value :_*))
    
    @scala.inline
    def `setBox-decoration-break`(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): Self = StObject.set(x, "box-decoration-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBox-decoration-breakUndefined`: Self = StObject.set(x, "box-decoration-break", js.undefined)
    
    @scala.inline
    def `setBox-decoration-breakVarargs`(value: BoxDecorationBreakProperty*): Self = StObject.set(x, "box-decoration-break", js.Array(value :_*))
    
    @scala.inline
    def `setBox-shadow`(value: BoxShadowProperty | js.Array[BoxShadowProperty]): Self = StObject.set(x, "box-shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBox-shadowUndefined`: Self = StObject.set(x, "box-shadow", js.undefined)
    
    @scala.inline
    def `setBox-shadowVarargs`(value: BoxShadowProperty*): Self = StObject.set(x, "box-shadow", js.Array(value :_*))
    
    @scala.inline
    def `setBox-sizing`(value: BoxSizingProperty | js.Array[BoxSizingProperty]): Self = StObject.set(x, "box-sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBox-sizingUndefined`: Self = StObject.set(x, "box-sizing", js.undefined)
    
    @scala.inline
    def `setBox-sizingVarargs`(value: BoxSizingProperty*): Self = StObject.set(x, "box-sizing", js.Array(value :_*))
    
    @scala.inline
    def `setBreak-after`(value: BreakAfterProperty | js.Array[BreakAfterProperty]): Self = StObject.set(x, "break-after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBreak-afterUndefined`: Self = StObject.set(x, "break-after", js.undefined)
    
    @scala.inline
    def `setBreak-afterVarargs`(value: BreakAfterProperty*): Self = StObject.set(x, "break-after", js.Array(value :_*))
    
    @scala.inline
    def `setBreak-before`(value: BreakBeforeProperty | js.Array[BreakBeforeProperty]): Self = StObject.set(x, "break-before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBreak-beforeUndefined`: Self = StObject.set(x, "break-before", js.undefined)
    
    @scala.inline
    def `setBreak-beforeVarargs`(value: BreakBeforeProperty*): Self = StObject.set(x, "break-before", js.Array(value :_*))
    
    @scala.inline
    def `setBreak-inside`(value: BreakInsideProperty | js.Array[BreakInsideProperty]): Self = StObject.set(x, "break-inside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBreak-insideUndefined`: Self = StObject.set(x, "break-inside", js.undefined)
    
    @scala.inline
    def `setBreak-insideVarargs`(value: BreakInsideProperty*): Self = StObject.set(x, "break-inside", js.Array(value :_*))
    
    @scala.inline
    def `setCaption-side`(value: CaptionSideProperty | js.Array[CaptionSideProperty]): Self = StObject.set(x, "caption-side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCaption-sideUndefined`: Self = StObject.set(x, "caption-side", js.undefined)
    
    @scala.inline
    def `setCaption-sideVarargs`(value: CaptionSideProperty*): Self = StObject.set(x, "caption-side", js.Array(value :_*))
    
    @scala.inline
    def `setCaret-color`(value: CaretColorProperty | js.Array[CaretColorProperty]): Self = StObject.set(x, "caret-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCaret-colorUndefined`: Self = StObject.set(x, "caret-color", js.undefined)
    
    @scala.inline
    def `setCaret-colorVarargs`(value: CaretColorProperty*): Self = StObject.set(x, "caret-color", js.Array(value :_*))
    
    @scala.inline
    def setClear(value: ClearProperty | js.Array[ClearProperty]): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setClearVarargs(value: ClearProperty*): Self = StObject.set(x, "clear", js.Array(value :_*))
    
    @scala.inline
    def `setClip-path`(value: ClipPathProperty | js.Array[ClipPathProperty]): Self = StObject.set(x, "clip-path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setClip-pathUndefined`: Self = StObject.set(x, "clip-path", js.undefined)
    
    @scala.inline
    def `setClip-pathVarargs`(value: ClipPathProperty*): Self = StObject.set(x, "clip-path", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: ColorProperty | js.Array[ColorProperty]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-adjust`(value: ColorAdjustProperty | js.Array[ColorAdjustProperty]): Self = StObject.set(x, "color-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-adjustUndefined`: Self = StObject.set(x, "color-adjust", js.undefined)
    
    @scala.inline
    def `setColor-adjustVarargs`(value: ColorAdjustProperty*): Self = StObject.set(x, "color-adjust", js.Array(value :_*))
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: ColorProperty*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def `setColumn-count`(value: ColumnCountProperty | js.Array[ColumnCountProperty]): Self = StObject.set(x, "column-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColumn-countUndefined`: Self = StObject.set(x, "column-count", js.undefined)
    
    @scala.inline
    def `setColumn-countVarargs`(value: ColumnCountProperty*): Self = StObject.set(x, "column-count", js.Array(value :_*))
    
    @scala.inline
    def `setColumn-fill`(value: ColumnFillProperty | js.Array[ColumnFillProperty]): Self = StObject.set(x, "column-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColumn-fillUndefined`: Self = StObject.set(x, "column-fill", js.undefined)
    
    @scala.inline
    def `setColumn-fillVarargs`(value: ColumnFillProperty*): Self = StObject.set(x, "column-fill", js.Array(value :_*))
    
    @scala.inline
    def `setColumn-gap`(value: ColumnGapProperty[TLength] | js.Array[ColumnGapProperty[TLength]]): Self = StObject.set(x, "column-gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColumn-gapUndefined`: Self = StObject.set(x, "column-gap", js.undefined)
    
    @scala.inline
    def `setColumn-gapVarargs`(value: ColumnGapProperty[TLength]*): Self = StObject.set(x, "column-gap", js.Array(value :_*))
    
    @scala.inline
    def `setColumn-rule-color`(value: ColumnRuleColorProperty | js.Array[ColumnRuleColorProperty]): Self = StObject.set(x, "column-rule-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColumn-rule-colorUndefined`: Self = StObject.set(x, "column-rule-color", js.undefined)
    
    @scala.inline
    def `setColumn-rule-colorVarargs`(value: ColumnRuleColorProperty*): Self = StObject.set(x, "column-rule-color", js.Array(value :_*))
    
    @scala.inline
    def `setColumn-rule-style`(value: ColumnRuleStyleProperty | js.Array[ColumnRuleStyleProperty]): Self = StObject.set(x, "column-rule-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColumn-rule-styleUndefined`: Self = StObject.set(x, "column-rule-style", js.undefined)
    
    @scala.inline
    def `setColumn-rule-styleVarargs`(value: ColumnRuleStyleProperty*): Self = StObject.set(x, "column-rule-style", js.Array(value :_*))
    
    @scala.inline
    def `setColumn-rule-width`(value: ColumnRuleWidthProperty[TLength] | js.Array[ColumnRuleWidthProperty[TLength]]): Self = StObject.set(x, "column-rule-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColumn-rule-widthUndefined`: Self = StObject.set(x, "column-rule-width", js.undefined)
    
    @scala.inline
    def `setColumn-rule-widthVarargs`(value: ColumnRuleWidthProperty[TLength]*): Self = StObject.set(x, "column-rule-width", js.Array(value :_*))
    
    @scala.inline
    def `setColumn-span`(value: ColumnSpanProperty | js.Array[ColumnSpanProperty]): Self = StObject.set(x, "column-span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColumn-spanUndefined`: Self = StObject.set(x, "column-span", js.undefined)
    
    @scala.inline
    def `setColumn-spanVarargs`(value: ColumnSpanProperty*): Self = StObject.set(x, "column-span", js.Array(value :_*))
    
    @scala.inline
    def `setColumn-width`(value: ColumnWidthProperty[TLength] | js.Array[ColumnWidthProperty[TLength]]): Self = StObject.set(x, "column-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColumn-widthUndefined`: Self = StObject.set(x, "column-width", js.undefined)
    
    @scala.inline
    def `setColumn-widthVarargs`(value: ColumnWidthProperty[TLength]*): Self = StObject.set(x, "column-width", js.Array(value :_*))
    
    @scala.inline
    def setContain(value: ContainProperty | js.Array[ContainProperty]): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
    
    @scala.inline
    def setContainVarargs(value: ContainProperty*): Self = StObject.set(x, "contain", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: ContentProperty | js.Array[ContentProperty]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: ContentProperty*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def `setCounter-increment`(value: CounterIncrementProperty | js.Array[CounterIncrementProperty]): Self = StObject.set(x, "counter-increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCounter-incrementUndefined`: Self = StObject.set(x, "counter-increment", js.undefined)
    
    @scala.inline
    def `setCounter-incrementVarargs`(value: CounterIncrementProperty*): Self = StObject.set(x, "counter-increment", js.Array(value :_*))
    
    @scala.inline
    def `setCounter-reset`(value: CounterResetProperty | js.Array[CounterResetProperty]): Self = StObject.set(x, "counter-reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCounter-resetUndefined`: Self = StObject.set(x, "counter-reset", js.undefined)
    
    @scala.inline
    def `setCounter-resetVarargs`(value: CounterResetProperty*): Self = StObject.set(x, "counter-reset", js.Array(value :_*))
    
    @scala.inline
    def `setCounter-set`(value: CounterSetProperty | js.Array[CounterSetProperty]): Self = StObject.set(x, "counter-set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCounter-setUndefined`: Self = StObject.set(x, "counter-set", js.undefined)
    
    @scala.inline
    def `setCounter-setVarargs`(value: CounterSetProperty*): Self = StObject.set(x, "counter-set", js.Array(value :_*))
    
    @scala.inline
    def setCursor(value: CursorProperty | js.Array[CursorProperty]): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setCursorVarargs(value: CursorProperty*): Self = StObject.set(x, "cursor", js.Array(value :_*))
    
    @scala.inline
    def setDirection(value: DirectionProperty | js.Array[DirectionProperty]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDirectionVarargs(value: DirectionProperty*): Self = StObject.set(x, "direction", js.Array(value :_*))
    
    @scala.inline
    def setDisplay(value: DisplayProperty | js.Array[DisplayProperty]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDisplayVarargs(value: DisplayProperty*): Self = StObject.set(x, "display", js.Array(value :_*))
    
    @scala.inline
    def `setEmpty-cells`(value: EmptyCellsProperty | js.Array[EmptyCellsProperty]): Self = StObject.set(x, "empty-cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEmpty-cellsUndefined`: Self = StObject.set(x, "empty-cells", js.undefined)
    
    @scala.inline
    def `setEmpty-cellsVarargs`(value: EmptyCellsProperty*): Self = StObject.set(x, "empty-cells", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: FilterProperty | js.Array[FilterProperty]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: FilterProperty*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def `setFlex-basis`(value: FlexBasisProperty[TLength] | js.Array[FlexBasisProperty[TLength]]): Self = StObject.set(x, "flex-basis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFlex-basisUndefined`: Self = StObject.set(x, "flex-basis", js.undefined)
    
    @scala.inline
    def `setFlex-basisVarargs`(value: FlexBasisProperty[TLength]*): Self = StObject.set(x, "flex-basis", js.Array(value :_*))
    
    @scala.inline
    def `setFlex-direction`(value: FlexDirectionProperty | js.Array[FlexDirectionProperty]): Self = StObject.set(x, "flex-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFlex-directionUndefined`: Self = StObject.set(x, "flex-direction", js.undefined)
    
    @scala.inline
    def `setFlex-directionVarargs`(value: FlexDirectionProperty*): Self = StObject.set(x, "flex-direction", js.Array(value :_*))
    
    @scala.inline
    def `setFlex-grow`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "flex-grow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFlex-growUndefined`: Self = StObject.set(x, "flex-grow", js.undefined)
    
    @scala.inline
    def `setFlex-growVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "flex-grow", js.Array(value :_*))
    
    @scala.inline
    def `setFlex-shrink`(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "flex-shrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFlex-shrinkUndefined`: Self = StObject.set(x, "flex-shrink", js.undefined)
    
    @scala.inline
    def `setFlex-shrinkVarargs`(value: GlobalsNumber*): Self = StObject.set(x, "flex-shrink", js.Array(value :_*))
    
    @scala.inline
    def `setFlex-wrap`(value: FlexWrapProperty | js.Array[FlexWrapProperty]): Self = StObject.set(x, "flex-wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFlex-wrapUndefined`: Self = StObject.set(x, "flex-wrap", js.undefined)
    
    @scala.inline
    def `setFlex-wrapVarargs`(value: FlexWrapProperty*): Self = StObject.set(x, "flex-wrap", js.Array(value :_*))
    
    @scala.inline
    def setFloat(value: FloatProperty | js.Array[FloatProperty]): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
    
    @scala.inline
    def setFloatVarargs(value: FloatProperty*): Self = StObject.set(x, "float", js.Array(value :_*))
    
    @scala.inline
    def `setFont-family`(value: FontFamilyProperty | js.Array[FontFamilyProperty]): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    @scala.inline
    def `setFont-familyVarargs`(value: FontFamilyProperty*): Self = StObject.set(x, "font-family", js.Array(value :_*))
    
    @scala.inline
    def `setFont-feature-settings`(value: FontFeatureSettingsProperty | js.Array[FontFeatureSettingsProperty]): Self = StObject.set(x, "font-feature-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-feature-settingsUndefined`: Self = StObject.set(x, "font-feature-settings", js.undefined)
    
    @scala.inline
    def `setFont-feature-settingsVarargs`(value: FontFeatureSettingsProperty*): Self = StObject.set(x, "font-feature-settings", js.Array(value :_*))
    
    @scala.inline
    def `setFont-kerning`(value: FontKerningProperty | js.Array[FontKerningProperty]): Self = StObject.set(x, "font-kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-kerningUndefined`: Self = StObject.set(x, "font-kerning", js.undefined)
    
    @scala.inline
    def `setFont-kerningVarargs`(value: FontKerningProperty*): Self = StObject.set(x, "font-kerning", js.Array(value :_*))
    
    @scala.inline
    def `setFont-language-override`(value: FontLanguageOverrideProperty | js.Array[FontLanguageOverrideProperty]): Self = StObject.set(x, "font-language-override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-language-overrideUndefined`: Self = StObject.set(x, "font-language-override", js.undefined)
    
    @scala.inline
    def `setFont-language-overrideVarargs`(value: FontLanguageOverrideProperty*): Self = StObject.set(x, "font-language-override", js.Array(value :_*))
    
    @scala.inline
    def `setFont-optical-sizing`(value: FontOpticalSizingProperty | js.Array[FontOpticalSizingProperty]): Self = StObject.set(x, "font-optical-sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-optical-sizingUndefined`: Self = StObject.set(x, "font-optical-sizing", js.undefined)
    
    @scala.inline
    def `setFont-optical-sizingVarargs`(value: FontOpticalSizingProperty*): Self = StObject.set(x, "font-optical-sizing", js.Array(value :_*))
    
    @scala.inline
    def `setFont-size`(value: FontSizeProperty[TLength] | js.Array[FontSizeProperty[TLength]]): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-size-adjust`(value: FontSizeAdjustProperty | js.Array[FontSizeAdjustProperty]): Self = StObject.set(x, "font-size-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-size-adjustUndefined`: Self = StObject.set(x, "font-size-adjust", js.undefined)
    
    @scala.inline
    def `setFont-size-adjustVarargs`(value: FontSizeAdjustProperty*): Self = StObject.set(x, "font-size-adjust", js.Array(value :_*))
    
    @scala.inline
    def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    @scala.inline
    def `setFont-sizeVarargs`(value: FontSizeProperty[TLength]*): Self = StObject.set(x, "font-size", js.Array(value :_*))
    
    @scala.inline
    def `setFont-smooth`(value: FontSmoothProperty[TLength] | js.Array[FontSmoothProperty[TLength]]): Self = StObject.set(x, "font-smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-smoothUndefined`: Self = StObject.set(x, "font-smooth", js.undefined)
    
    @scala.inline
    def `setFont-smoothVarargs`(value: FontSmoothProperty[TLength]*): Self = StObject.set(x, "font-smooth", js.Array(value :_*))
    
    @scala.inline
    def `setFont-stretch`(value: FontStretchProperty | js.Array[FontStretchProperty]): Self = StObject.set(x, "font-stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-stretchUndefined`: Self = StObject.set(x, "font-stretch", js.undefined)
    
    @scala.inline
    def `setFont-stretchVarargs`(value: FontStretchProperty*): Self = StObject.set(x, "font-stretch", js.Array(value :_*))
    
    @scala.inline
    def `setFont-style`(value: FontStyleProperty | js.Array[FontStyleProperty]): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    @scala.inline
    def `setFont-styleVarargs`(value: FontStyleProperty*): Self = StObject.set(x, "font-style", js.Array(value :_*))
    
    @scala.inline
    def `setFont-synthesis`(value: FontSynthesisProperty | js.Array[FontSynthesisProperty]): Self = StObject.set(x, "font-synthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-synthesisUndefined`: Self = StObject.set(x, "font-synthesis", js.undefined)
    
    @scala.inline
    def `setFont-synthesisVarargs`(value: FontSynthesisProperty*): Self = StObject.set(x, "font-synthesis", js.Array(value :_*))
    
    @scala.inline
    def `setFont-variant`(value: FontVariantProperty | js.Array[FontVariantProperty]): Self = StObject.set(x, "font-variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-variant-caps`(value: FontVariantCapsProperty | js.Array[FontVariantCapsProperty]): Self = StObject.set(x, "font-variant-caps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-variant-capsUndefined`: Self = StObject.set(x, "font-variant-caps", js.undefined)
    
    @scala.inline
    def `setFont-variant-capsVarargs`(value: FontVariantCapsProperty*): Self = StObject.set(x, "font-variant-caps", js.Array(value :_*))
    
    @scala.inline
    def `setFont-variant-east-asian`(value: FontVariantEastAsianProperty | js.Array[FontVariantEastAsianProperty]): Self = StObject.set(x, "font-variant-east-asian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-variant-east-asianUndefined`: Self = StObject.set(x, "font-variant-east-asian", js.undefined)
    
    @scala.inline
    def `setFont-variant-east-asianVarargs`(value: FontVariantEastAsianProperty*): Self = StObject.set(x, "font-variant-east-asian", js.Array(value :_*))
    
    @scala.inline
    def `setFont-variant-ligatures`(value: FontVariantLigaturesProperty | js.Array[FontVariantLigaturesProperty]): Self = StObject.set(x, "font-variant-ligatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-variant-ligaturesUndefined`: Self = StObject.set(x, "font-variant-ligatures", js.undefined)
    
    @scala.inline
    def `setFont-variant-ligaturesVarargs`(value: FontVariantLigaturesProperty*): Self = StObject.set(x, "font-variant-ligatures", js.Array(value :_*))
    
    @scala.inline
    def `setFont-variant-numeric`(value: FontVariantNumericProperty | js.Array[FontVariantNumericProperty]): Self = StObject.set(x, "font-variant-numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-variant-numericUndefined`: Self = StObject.set(x, "font-variant-numeric", js.undefined)
    
    @scala.inline
    def `setFont-variant-numericVarargs`(value: FontVariantNumericProperty*): Self = StObject.set(x, "font-variant-numeric", js.Array(value :_*))
    
    @scala.inline
    def `setFont-variant-position`(value: FontVariantPositionProperty | js.Array[FontVariantPositionProperty]): Self = StObject.set(x, "font-variant-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-variant-positionUndefined`: Self = StObject.set(x, "font-variant-position", js.undefined)
    
    @scala.inline
    def `setFont-variant-positionVarargs`(value: FontVariantPositionProperty*): Self = StObject.set(x, "font-variant-position", js.Array(value :_*))
    
    @scala.inline
    def `setFont-variantUndefined`: Self = StObject.set(x, "font-variant", js.undefined)
    
    @scala.inline
    def `setFont-variantVarargs`(value: FontVariantProperty*): Self = StObject.set(x, "font-variant", js.Array(value :_*))
    
    @scala.inline
    def `setFont-variation-settings`(value: FontVariationSettingsProperty | js.Array[FontVariationSettingsProperty]): Self = StObject.set(x, "font-variation-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-variation-settingsUndefined`: Self = StObject.set(x, "font-variation-settings", js.undefined)
    
    @scala.inline
    def `setFont-variation-settingsVarargs`(value: FontVariationSettingsProperty*): Self = StObject.set(x, "font-variation-settings", js.Array(value :_*))
    
    @scala.inline
    def `setFont-weight`(value: FontWeightProperty | js.Array[FontWeightProperty]): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    @scala.inline
    def `setFont-weightVarargs`(value: FontWeightProperty*): Self = StObject.set(x, "font-weight", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-auto-columns`(value: GridAutoColumnsProperty[TLength] | js.Array[GridAutoColumnsProperty[TLength]]): Self = StObject.set(x, "grid-auto-columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGrid-auto-columnsUndefined`: Self = StObject.set(x, "grid-auto-columns", js.undefined)
    
    @scala.inline
    def `setGrid-auto-columnsVarargs`(value: GridAutoColumnsProperty[TLength]*): Self = StObject.set(x, "grid-auto-columns", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-auto-flow`(value: GridAutoFlowProperty | js.Array[GridAutoFlowProperty]): Self = StObject.set(x, "grid-auto-flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGrid-auto-flowUndefined`: Self = StObject.set(x, "grid-auto-flow", js.undefined)
    
    @scala.inline
    def `setGrid-auto-flowVarargs`(value: GridAutoFlowProperty*): Self = StObject.set(x, "grid-auto-flow", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-auto-rows`(value: GridAutoRowsProperty[TLength] | js.Array[GridAutoRowsProperty[TLength]]): Self = StObject.set(x, "grid-auto-rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGrid-auto-rowsUndefined`: Self = StObject.set(x, "grid-auto-rows", js.undefined)
    
    @scala.inline
    def `setGrid-auto-rowsVarargs`(value: GridAutoRowsProperty[TLength]*): Self = StObject.set(x, "grid-auto-rows", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-column-end`(value: GridColumnEndProperty | js.Array[GridColumnEndProperty]): Self = StObject.set(x, "grid-column-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGrid-column-endUndefined`: Self = StObject.set(x, "grid-column-end", js.undefined)
    
    @scala.inline
    def `setGrid-column-endVarargs`(value: GridColumnEndProperty*): Self = StObject.set(x, "grid-column-end", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-column-start`(value: GridColumnStartProperty | js.Array[GridColumnStartProperty]): Self = StObject.set(x, "grid-column-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGrid-column-startUndefined`: Self = StObject.set(x, "grid-column-start", js.undefined)
    
    @scala.inline
    def `setGrid-column-startVarargs`(value: GridColumnStartProperty*): Self = StObject.set(x, "grid-column-start", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-row-end`(value: GridRowEndProperty | js.Array[GridRowEndProperty]): Self = StObject.set(x, "grid-row-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGrid-row-endUndefined`: Self = StObject.set(x, "grid-row-end", js.undefined)
    
    @scala.inline
    def `setGrid-row-endVarargs`(value: GridRowEndProperty*): Self = StObject.set(x, "grid-row-end", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-row-start`(value: GridRowStartProperty | js.Array[GridRowStartProperty]): Self = StObject.set(x, "grid-row-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGrid-row-startUndefined`: Self = StObject.set(x, "grid-row-start", js.undefined)
    
    @scala.inline
    def `setGrid-row-startVarargs`(value: GridRowStartProperty*): Self = StObject.set(x, "grid-row-start", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-template-areas`(value: GridTemplateAreasProperty | js.Array[GridTemplateAreasProperty]): Self = StObject.set(x, "grid-template-areas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGrid-template-areasUndefined`: Self = StObject.set(x, "grid-template-areas", js.undefined)
    
    @scala.inline
    def `setGrid-template-areasVarargs`(value: GridTemplateAreasProperty*): Self = StObject.set(x, "grid-template-areas", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-template-columns`(value: GridTemplateColumnsProperty[TLength] | js.Array[GridTemplateColumnsProperty[TLength]]): Self = StObject.set(x, "grid-template-columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGrid-template-columnsUndefined`: Self = StObject.set(x, "grid-template-columns", js.undefined)
    
    @scala.inline
    def `setGrid-template-columnsVarargs`(value: GridTemplateColumnsProperty[TLength]*): Self = StObject.set(x, "grid-template-columns", js.Array(value :_*))
    
    @scala.inline
    def `setGrid-template-rows`(value: GridTemplateRowsProperty[TLength] | js.Array[GridTemplateRowsProperty[TLength]]): Self = StObject.set(x, "grid-template-rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGrid-template-rowsUndefined`: Self = StObject.set(x, "grid-template-rows", js.undefined)
    
    @scala.inline
    def `setGrid-template-rowsVarargs`(value: GridTemplateRowsProperty[TLength]*): Self = StObject.set(x, "grid-template-rows", js.Array(value :_*))
    
    @scala.inline
    def `setHanging-punctuation`(value: HangingPunctuationProperty | js.Array[HangingPunctuationProperty]): Self = StObject.set(x, "hanging-punctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHanging-punctuationUndefined`: Self = StObject.set(x, "hanging-punctuation", js.undefined)
    
    @scala.inline
    def `setHanging-punctuationVarargs`(value: HangingPunctuationProperty*): Self = StObject.set(x, "hanging-punctuation", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: HeightProperty[TLength] | js.Array[HeightProperty[TLength]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHeightVarargs(value: HeightProperty[TLength]*): Self = StObject.set(x, "height", js.Array(value :_*))
    
    @scala.inline
    def setHyphens(value: HyphensProperty | js.Array[HyphensProperty]): Self = StObject.set(x, "hyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyphensUndefined: Self = StObject.set(x, "hyphens", js.undefined)
    
    @scala.inline
    def setHyphensVarargs(value: HyphensProperty*): Self = StObject.set(x, "hyphens", js.Array(value :_*))
    
    @scala.inline
    def `setImage-orientation`(value: ImageOrientationProperty | js.Array[ImageOrientationProperty]): Self = StObject.set(x, "image-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setImage-orientationUndefined`: Self = StObject.set(x, "image-orientation", js.undefined)
    
    @scala.inline
    def `setImage-orientationVarargs`(value: ImageOrientationProperty*): Self = StObject.set(x, "image-orientation", js.Array(value :_*))
    
    @scala.inline
    def `setImage-rendering`(value: ImageRenderingProperty | js.Array[ImageRenderingProperty]): Self = StObject.set(x, "image-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setImage-renderingUndefined`: Self = StObject.set(x, "image-rendering", js.undefined)
    
    @scala.inline
    def `setImage-renderingVarargs`(value: ImageRenderingProperty*): Self = StObject.set(x, "image-rendering", js.Array(value :_*))
    
    @scala.inline
    def `setImage-resolution`(value: ImageResolutionProperty | js.Array[ImageResolutionProperty]): Self = StObject.set(x, "image-resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setImage-resolutionUndefined`: Self = StObject.set(x, "image-resolution", js.undefined)
    
    @scala.inline
    def `setImage-resolutionVarargs`(value: ImageResolutionProperty*): Self = StObject.set(x, "image-resolution", js.Array(value :_*))
    
    @scala.inline
    def `setInitial-letter`(value: InitialLetterProperty | js.Array[InitialLetterProperty]): Self = StObject.set(x, "initial-letter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInitial-letterUndefined`: Self = StObject.set(x, "initial-letter", js.undefined)
    
    @scala.inline
    def `setInitial-letterVarargs`(value: InitialLetterProperty*): Self = StObject.set(x, "initial-letter", js.Array(value :_*))
    
    @scala.inline
    def `setInline-size`(value: InlineSizeProperty[TLength] | js.Array[InlineSizeProperty[TLength]]): Self = StObject.set(x, "inline-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInline-sizeUndefined`: Self = StObject.set(x, "inline-size", js.undefined)
    
    @scala.inline
    def `setInline-sizeVarargs`(value: InlineSizeProperty[TLength]*): Self = StObject.set(x, "inline-size", js.Array(value :_*))
    
    @scala.inline
    def setInset(value: InsetProperty[TLength] | js.Array[InsetProperty[TLength]]): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInset-block`(value: InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]): Self = StObject.set(x, "inset-block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInset-block-end`(value: InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]): Self = StObject.set(x, "inset-block-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInset-block-endUndefined`: Self = StObject.set(x, "inset-block-end", js.undefined)
    
    @scala.inline
    def `setInset-block-endVarargs`(value: InsetBlockEndProperty[TLength]*): Self = StObject.set(x, "inset-block-end", js.Array(value :_*))
    
    @scala.inline
    def `setInset-block-start`(value: InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]): Self = StObject.set(x, "inset-block-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInset-block-startUndefined`: Self = StObject.set(x, "inset-block-start", js.undefined)
    
    @scala.inline
    def `setInset-block-startVarargs`(value: InsetBlockStartProperty[TLength]*): Self = StObject.set(x, "inset-block-start", js.Array(value :_*))
    
    @scala.inline
    def `setInset-blockUndefined`: Self = StObject.set(x, "inset-block", js.undefined)
    
    @scala.inline
    def `setInset-blockVarargs`(value: InsetBlockProperty[TLength]*): Self = StObject.set(x, "inset-block", js.Array(value :_*))
    
    @scala.inline
    def `setInset-inline`(value: InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]): Self = StObject.set(x, "inset-inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInset-inline-end`(value: InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]): Self = StObject.set(x, "inset-inline-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInset-inline-endUndefined`: Self = StObject.set(x, "inset-inline-end", js.undefined)
    
    @scala.inline
    def `setInset-inline-endVarargs`(value: InsetInlineEndProperty[TLength]*): Self = StObject.set(x, "inset-inline-end", js.Array(value :_*))
    
    @scala.inline
    def `setInset-inline-start`(value: InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]): Self = StObject.set(x, "inset-inline-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInset-inline-startUndefined`: Self = StObject.set(x, "inset-inline-start", js.undefined)
    
    @scala.inline
    def `setInset-inline-startVarargs`(value: InsetInlineStartProperty[TLength]*): Self = StObject.set(x, "inset-inline-start", js.Array(value :_*))
    
    @scala.inline
    def `setInset-inlineUndefined`: Self = StObject.set(x, "inset-inline", js.undefined)
    
    @scala.inline
    def `setInset-inlineVarargs`(value: InsetInlineProperty[TLength]*): Self = StObject.set(x, "inset-inline", js.Array(value :_*))
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setInsetVarargs(value: InsetProperty[TLength]*): Self = StObject.set(x, "inset", js.Array(value :_*))
    
    @scala.inline
    def setIsolation(value: IsolationProperty | js.Array[IsolationProperty]): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolationUndefined: Self = StObject.set(x, "isolation", js.undefined)
    
    @scala.inline
    def setIsolationVarargs(value: IsolationProperty*): Self = StObject.set(x, "isolation", js.Array(value :_*))
    
    @scala.inline
    def `setJustify-content`(value: JustifyContentProperty | js.Array[JustifyContentProperty]): Self = StObject.set(x, "justify-content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJustify-contentUndefined`: Self = StObject.set(x, "justify-content", js.undefined)
    
    @scala.inline
    def `setJustify-contentVarargs`(value: JustifyContentProperty*): Self = StObject.set(x, "justify-content", js.Array(value :_*))
    
    @scala.inline
    def `setJustify-items`(value: JustifyItemsProperty | js.Array[JustifyItemsProperty]): Self = StObject.set(x, "justify-items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJustify-itemsUndefined`: Self = StObject.set(x, "justify-items", js.undefined)
    
    @scala.inline
    def `setJustify-itemsVarargs`(value: JustifyItemsProperty*): Self = StObject.set(x, "justify-items", js.Array(value :_*))
    
    @scala.inline
    def `setJustify-self`(value: JustifySelfProperty | js.Array[JustifySelfProperty]): Self = StObject.set(x, "justify-self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJustify-selfUndefined`: Self = StObject.set(x, "justify-self", js.undefined)
    
    @scala.inline
    def `setJustify-selfVarargs`(value: JustifySelfProperty*): Self = StObject.set(x, "justify-self", js.Array(value :_*))
    
    @scala.inline
    def `setJustify-tracks`(value: JustifyTracksProperty | js.Array[JustifyTracksProperty]): Self = StObject.set(x, "justify-tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJustify-tracksUndefined`: Self = StObject.set(x, "justify-tracks", js.undefined)
    
    @scala.inline
    def `setJustify-tracksVarargs`(value: JustifyTracksProperty*): Self = StObject.set(x, "justify-tracks", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: LeftProperty[TLength] | js.Array[LeftProperty[TLength]]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLeftVarargs(value: LeftProperty[TLength]*): Self = StObject.set(x, "left", js.Array(value :_*))
    
    @scala.inline
    def `setLetter-spacing`(value: LetterSpacingProperty[TLength] | js.Array[LetterSpacingProperty[TLength]]): Self = StObject.set(x, "letter-spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLetter-spacingUndefined`: Self = StObject.set(x, "letter-spacing", js.undefined)
    
    @scala.inline
    def `setLetter-spacingVarargs`(value: LetterSpacingProperty[TLength]*): Self = StObject.set(x, "letter-spacing", js.Array(value :_*))
    
    @scala.inline
    def `setLine-break`(value: LineBreakProperty | js.Array[LineBreakProperty]): Self = StObject.set(x, "line-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-breakUndefined`: Self = StObject.set(x, "line-break", js.undefined)
    
    @scala.inline
    def `setLine-breakVarargs`(value: LineBreakProperty*): Self = StObject.set(x, "line-break", js.Array(value :_*))
    
    @scala.inline
    def `setLine-height`(value: LineHeightProperty[TLength] | js.Array[LineHeightProperty[TLength]]): Self = StObject.set(x, "line-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-height-step`(value: LineHeightStepProperty[TLength] | js.Array[LineHeightStepProperty[TLength]]): Self = StObject.set(x, "line-height-step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-height-stepUndefined`: Self = StObject.set(x, "line-height-step", js.undefined)
    
    @scala.inline
    def `setLine-height-stepVarargs`(value: LineHeightStepProperty[TLength]*): Self = StObject.set(x, "line-height-step", js.Array(value :_*))
    
    @scala.inline
    def `setLine-heightUndefined`: Self = StObject.set(x, "line-height", js.undefined)
    
    @scala.inline
    def `setLine-heightVarargs`(value: LineHeightProperty[TLength]*): Self = StObject.set(x, "line-height", js.Array(value :_*))
    
    @scala.inline
    def `setList-style-image`(value: ListStyleImageProperty | js.Array[ListStyleImageProperty]): Self = StObject.set(x, "list-style-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setList-style-imageUndefined`: Self = StObject.set(x, "list-style-image", js.undefined)
    
    @scala.inline
    def `setList-style-imageVarargs`(value: ListStyleImageProperty*): Self = StObject.set(x, "list-style-image", js.Array(value :_*))
    
    @scala.inline
    def `setList-style-position`(value: ListStylePositionProperty | js.Array[ListStylePositionProperty]): Self = StObject.set(x, "list-style-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setList-style-positionUndefined`: Self = StObject.set(x, "list-style-position", js.undefined)
    
    @scala.inline
    def `setList-style-positionVarargs`(value: ListStylePositionProperty*): Self = StObject.set(x, "list-style-position", js.Array(value :_*))
    
    @scala.inline
    def `setList-style-type`(value: ListStyleTypeProperty | js.Array[ListStyleTypeProperty]): Self = StObject.set(x, "list-style-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setList-style-typeUndefined`: Self = StObject.set(x, "list-style-type", js.undefined)
    
    @scala.inline
    def `setList-style-typeVarargs`(value: ListStyleTypeProperty*): Self = StObject.set(x, "list-style-type", js.Array(value :_*))
    
    @scala.inline
    def `setMargin-block`(value: MarginBlockProperty[TLength] | js.Array[MarginBlockProperty[TLength]]): Self = StObject.set(x, "margin-block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-block-end`(value: MarginBlockEndProperty[TLength] | js.Array[MarginBlockEndProperty[TLength]]): Self = StObject.set(x, "margin-block-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-block-endUndefined`: Self = StObject.set(x, "margin-block-end", js.undefined)
    
    @scala.inline
    def `setMargin-block-endVarargs`(value: MarginBlockEndProperty[TLength]*): Self = StObject.set(x, "margin-block-end", js.Array(value :_*))
    
    @scala.inline
    def `setMargin-block-start`(value: MarginBlockStartProperty[TLength] | js.Array[MarginBlockStartProperty[TLength]]): Self = StObject.set(x, "margin-block-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-block-startUndefined`: Self = StObject.set(x, "margin-block-start", js.undefined)
    
    @scala.inline
    def `setMargin-block-startVarargs`(value: MarginBlockStartProperty[TLength]*): Self = StObject.set(x, "margin-block-start", js.Array(value :_*))
    
    @scala.inline
    def `setMargin-blockUndefined`: Self = StObject.set(x, "margin-block", js.undefined)
    
    @scala.inline
    def `setMargin-blockVarargs`(value: MarginBlockProperty[TLength]*): Self = StObject.set(x, "margin-block", js.Array(value :_*))
    
    @scala.inline
    def `setMargin-bottom`(value: MarginBottomProperty[TLength] | js.Array[MarginBottomProperty[TLength]]): Self = StObject.set(x, "margin-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-bottomUndefined`: Self = StObject.set(x, "margin-bottom", js.undefined)
    
    @scala.inline
    def `setMargin-bottomVarargs`(value: MarginBottomProperty[TLength]*): Self = StObject.set(x, "margin-bottom", js.Array(value :_*))
    
    @scala.inline
    def `setMargin-inline`(value: MarginInlineProperty[TLength] | js.Array[MarginInlineProperty[TLength]]): Self = StObject.set(x, "margin-inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-inline-end`(value: MarginInlineEndProperty[TLength] | js.Array[MarginInlineEndProperty[TLength]]): Self = StObject.set(x, "margin-inline-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-inline-endUndefined`: Self = StObject.set(x, "margin-inline-end", js.undefined)
    
    @scala.inline
    def `setMargin-inline-endVarargs`(value: MarginInlineEndProperty[TLength]*): Self = StObject.set(x, "margin-inline-end", js.Array(value :_*))
    
    @scala.inline
    def `setMargin-inline-start`(value: MarginInlineStartProperty[TLength] | js.Array[MarginInlineStartProperty[TLength]]): Self = StObject.set(x, "margin-inline-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-inline-startUndefined`: Self = StObject.set(x, "margin-inline-start", js.undefined)
    
    @scala.inline
    def `setMargin-inline-startVarargs`(value: MarginInlineStartProperty[TLength]*): Self = StObject.set(x, "margin-inline-start", js.Array(value :_*))
    
    @scala.inline
    def `setMargin-inlineUndefined`: Self = StObject.set(x, "margin-inline", js.undefined)
    
    @scala.inline
    def `setMargin-inlineVarargs`(value: MarginInlineProperty[TLength]*): Self = StObject.set(x, "margin-inline", js.Array(value :_*))
    
    @scala.inline
    def `setMargin-left`(value: MarginLeftProperty[TLength] | js.Array[MarginLeftProperty[TLength]]): Self = StObject.set(x, "margin-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-leftUndefined`: Self = StObject.set(x, "margin-left", js.undefined)
    
    @scala.inline
    def `setMargin-leftVarargs`(value: MarginLeftProperty[TLength]*): Self = StObject.set(x, "margin-left", js.Array(value :_*))
    
    @scala.inline
    def `setMargin-right`(value: MarginRightProperty[TLength] | js.Array[MarginRightProperty[TLength]]): Self = StObject.set(x, "margin-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-rightUndefined`: Self = StObject.set(x, "margin-right", js.undefined)
    
    @scala.inline
    def `setMargin-rightVarargs`(value: MarginRightProperty[TLength]*): Self = StObject.set(x, "margin-right", js.Array(value :_*))
    
    @scala.inline
    def `setMargin-top`(value: MarginTopProperty[TLength] | js.Array[MarginTopProperty[TLength]]): Self = StObject.set(x, "margin-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMargin-topUndefined`: Self = StObject.set(x, "margin-top", js.undefined)
    
    @scala.inline
    def `setMargin-topVarargs`(value: MarginTopProperty[TLength]*): Self = StObject.set(x, "margin-top", js.Array(value :_*))
    
    @scala.inline
    def `setMask-border-mode`(value: MaskBorderModeProperty | js.Array[MaskBorderModeProperty]): Self = StObject.set(x, "mask-border-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-border-modeUndefined`: Self = StObject.set(x, "mask-border-mode", js.undefined)
    
    @scala.inline
    def `setMask-border-modeVarargs`(value: MaskBorderModeProperty*): Self = StObject.set(x, "mask-border-mode", js.Array(value :_*))
    
    @scala.inline
    def `setMask-border-outset`(value: MaskBorderOutsetProperty[TLength] | js.Array[MaskBorderOutsetProperty[TLength]]): Self = StObject.set(x, "mask-border-outset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-border-outsetUndefined`: Self = StObject.set(x, "mask-border-outset", js.undefined)
    
    @scala.inline
    def `setMask-border-outsetVarargs`(value: MaskBorderOutsetProperty[TLength]*): Self = StObject.set(x, "mask-border-outset", js.Array(value :_*))
    
    @scala.inline
    def `setMask-border-repeat`(value: MaskBorderRepeatProperty | js.Array[MaskBorderRepeatProperty]): Self = StObject.set(x, "mask-border-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-border-repeatUndefined`: Self = StObject.set(x, "mask-border-repeat", js.undefined)
    
    @scala.inline
    def `setMask-border-repeatVarargs`(value: MaskBorderRepeatProperty*): Self = StObject.set(x, "mask-border-repeat", js.Array(value :_*))
    
    @scala.inline
    def `setMask-border-slice`(value: MaskBorderSliceProperty | js.Array[MaskBorderSliceProperty]): Self = StObject.set(x, "mask-border-slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-border-sliceUndefined`: Self = StObject.set(x, "mask-border-slice", js.undefined)
    
    @scala.inline
    def `setMask-border-sliceVarargs`(value: MaskBorderSliceProperty*): Self = StObject.set(x, "mask-border-slice", js.Array(value :_*))
    
    @scala.inline
    def `setMask-border-source`(value: MaskBorderSourceProperty | js.Array[MaskBorderSourceProperty]): Self = StObject.set(x, "mask-border-source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-border-sourceUndefined`: Self = StObject.set(x, "mask-border-source", js.undefined)
    
    @scala.inline
    def `setMask-border-sourceVarargs`(value: MaskBorderSourceProperty*): Self = StObject.set(x, "mask-border-source", js.Array(value :_*))
    
    @scala.inline
    def `setMask-border-width`(value: MaskBorderWidthProperty[TLength] | js.Array[MaskBorderWidthProperty[TLength]]): Self = StObject.set(x, "mask-border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-border-widthUndefined`: Self = StObject.set(x, "mask-border-width", js.undefined)
    
    @scala.inline
    def `setMask-border-widthVarargs`(value: MaskBorderWidthProperty[TLength]*): Self = StObject.set(x, "mask-border-width", js.Array(value :_*))
    
    @scala.inline
    def `setMask-clip`(value: MaskClipProperty | js.Array[MaskClipProperty]): Self = StObject.set(x, "mask-clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-clipUndefined`: Self = StObject.set(x, "mask-clip", js.undefined)
    
    @scala.inline
    def `setMask-clipVarargs`(value: MaskClipProperty*): Self = StObject.set(x, "mask-clip", js.Array(value :_*))
    
    @scala.inline
    def `setMask-composite`(value: MaskCompositeProperty | js.Array[MaskCompositeProperty]): Self = StObject.set(x, "mask-composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-compositeUndefined`: Self = StObject.set(x, "mask-composite", js.undefined)
    
    @scala.inline
    def `setMask-compositeVarargs`(value: MaskCompositeProperty*): Self = StObject.set(x, "mask-composite", js.Array(value :_*))
    
    @scala.inline
    def `setMask-image`(value: MaskImageProperty | js.Array[MaskImageProperty]): Self = StObject.set(x, "mask-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-imageUndefined`: Self = StObject.set(x, "mask-image", js.undefined)
    
    @scala.inline
    def `setMask-imageVarargs`(value: MaskImageProperty*): Self = StObject.set(x, "mask-image", js.Array(value :_*))
    
    @scala.inline
    def `setMask-mode`(value: MaskModeProperty | js.Array[MaskModeProperty]): Self = StObject.set(x, "mask-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-modeUndefined`: Self = StObject.set(x, "mask-mode", js.undefined)
    
    @scala.inline
    def `setMask-modeVarargs`(value: MaskModeProperty*): Self = StObject.set(x, "mask-mode", js.Array(value :_*))
    
    @scala.inline
    def `setMask-origin`(value: MaskOriginProperty | js.Array[MaskOriginProperty]): Self = StObject.set(x, "mask-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-originUndefined`: Self = StObject.set(x, "mask-origin", js.undefined)
    
    @scala.inline
    def `setMask-originVarargs`(value: MaskOriginProperty*): Self = StObject.set(x, "mask-origin", js.Array(value :_*))
    
    @scala.inline
    def `setMask-position`(value: MaskPositionProperty[TLength] | js.Array[MaskPositionProperty[TLength]]): Self = StObject.set(x, "mask-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-positionUndefined`: Self = StObject.set(x, "mask-position", js.undefined)
    
    @scala.inline
    def `setMask-positionVarargs`(value: MaskPositionProperty[TLength]*): Self = StObject.set(x, "mask-position", js.Array(value :_*))
    
    @scala.inline
    def `setMask-repeat`(value: MaskRepeatProperty | js.Array[MaskRepeatProperty]): Self = StObject.set(x, "mask-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-repeatUndefined`: Self = StObject.set(x, "mask-repeat", js.undefined)
    
    @scala.inline
    def `setMask-repeatVarargs`(value: MaskRepeatProperty*): Self = StObject.set(x, "mask-repeat", js.Array(value :_*))
    
    @scala.inline
    def `setMask-size`(value: MaskSizeProperty[TLength] | js.Array[MaskSizeProperty[TLength]]): Self = StObject.set(x, "mask-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-sizeUndefined`: Self = StObject.set(x, "mask-size", js.undefined)
    
    @scala.inline
    def `setMask-sizeVarargs`(value: MaskSizeProperty[TLength]*): Self = StObject.set(x, "mask-size", js.Array(value :_*))
    
    @scala.inline
    def `setMask-type`(value: MaskTypeProperty | js.Array[MaskTypeProperty]): Self = StObject.set(x, "mask-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMask-typeUndefined`: Self = StObject.set(x, "mask-type", js.undefined)
    
    @scala.inline
    def `setMask-typeVarargs`(value: MaskTypeProperty*): Self = StObject.set(x, "mask-type", js.Array(value :_*))
    
    @scala.inline
    def `setMasonry-auto-flow`(value: MasonryAutoFlowProperty | js.Array[MasonryAutoFlowProperty]): Self = StObject.set(x, "masonry-auto-flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMasonry-auto-flowUndefined`: Self = StObject.set(x, "masonry-auto-flow", js.undefined)
    
    @scala.inline
    def `setMasonry-auto-flowVarargs`(value: MasonryAutoFlowProperty*): Self = StObject.set(x, "masonry-auto-flow", js.Array(value :_*))
    
    @scala.inline
    def `setMath-style`(value: MathStyleProperty | js.Array[MathStyleProperty]): Self = StObject.set(x, "math-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMath-styleUndefined`: Self = StObject.set(x, "math-style", js.undefined)
    
    @scala.inline
    def `setMath-styleVarargs`(value: MathStyleProperty*): Self = StObject.set(x, "math-style", js.Array(value :_*))
    
    @scala.inline
    def `setMax-block-size`(value: MaxBlockSizeProperty[TLength] | js.Array[MaxBlockSizeProperty[TLength]]): Self = StObject.set(x, "max-block-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-block-sizeUndefined`: Self = StObject.set(x, "max-block-size", js.undefined)
    
    @scala.inline
    def `setMax-block-sizeVarargs`(value: MaxBlockSizeProperty[TLength]*): Self = StObject.set(x, "max-block-size", js.Array(value :_*))
    
    @scala.inline
    def `setMax-height`(value: MaxHeightProperty[TLength] | js.Array[MaxHeightProperty[TLength]]): Self = StObject.set(x, "max-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-heightUndefined`: Self = StObject.set(x, "max-height", js.undefined)
    
    @scala.inline
    def `setMax-heightVarargs`(value: MaxHeightProperty[TLength]*): Self = StObject.set(x, "max-height", js.Array(value :_*))
    
    @scala.inline
    def `setMax-inline-size`(value: MaxInlineSizeProperty[TLength] | js.Array[MaxInlineSizeProperty[TLength]]): Self = StObject.set(x, "max-inline-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-inline-sizeUndefined`: Self = StObject.set(x, "max-inline-size", js.undefined)
    
    @scala.inline
    def `setMax-inline-sizeVarargs`(value: MaxInlineSizeProperty[TLength]*): Self = StObject.set(x, "max-inline-size", js.Array(value :_*))
    
    @scala.inline
    def `setMax-lines`(value: MaxLinesProperty | js.Array[MaxLinesProperty]): Self = StObject.set(x, "max-lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-linesUndefined`: Self = StObject.set(x, "max-lines", js.undefined)
    
    @scala.inline
    def `setMax-linesVarargs`(value: MaxLinesProperty*): Self = StObject.set(x, "max-lines", js.Array(value :_*))
    
    @scala.inline
    def `setMax-width`(value: MaxWidthProperty[TLength] | js.Array[MaxWidthProperty[TLength]]): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-widthUndefined`: Self = StObject.set(x, "max-width", js.undefined)
    
    @scala.inline
    def `setMax-widthVarargs`(value: MaxWidthProperty[TLength]*): Self = StObject.set(x, "max-width", js.Array(value :_*))
    
    @scala.inline
    def `setMin-block-size`(value: MinBlockSizeProperty[TLength] | js.Array[MinBlockSizeProperty[TLength]]): Self = StObject.set(x, "min-block-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-block-sizeUndefined`: Self = StObject.set(x, "min-block-size", js.undefined)
    
    @scala.inline
    def `setMin-block-sizeVarargs`(value: MinBlockSizeProperty[TLength]*): Self = StObject.set(x, "min-block-size", js.Array(value :_*))
    
    @scala.inline
    def `setMin-height`(value: MinHeightProperty[TLength] | js.Array[MinHeightProperty[TLength]]): Self = StObject.set(x, "min-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-heightUndefined`: Self = StObject.set(x, "min-height", js.undefined)
    
    @scala.inline
    def `setMin-heightVarargs`(value: MinHeightProperty[TLength]*): Self = StObject.set(x, "min-height", js.Array(value :_*))
    
    @scala.inline
    def `setMin-inline-size`(value: MinInlineSizeProperty[TLength] | js.Array[MinInlineSizeProperty[TLength]]): Self = StObject.set(x, "min-inline-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-inline-sizeUndefined`: Self = StObject.set(x, "min-inline-size", js.undefined)
    
    @scala.inline
    def `setMin-inline-sizeVarargs`(value: MinInlineSizeProperty[TLength]*): Self = StObject.set(x, "min-inline-size", js.Array(value :_*))
    
    @scala.inline
    def `setMin-width`(value: MinWidthProperty[TLength] | js.Array[MinWidthProperty[TLength]]): Self = StObject.set(x, "min-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-widthUndefined`: Self = StObject.set(x, "min-width", js.undefined)
    
    @scala.inline
    def `setMin-widthVarargs`(value: MinWidthProperty[TLength]*): Self = StObject.set(x, "min-width", js.Array(value :_*))
    
    @scala.inline
    def `setMix-blend-mode`(value: MixBlendModeProperty | js.Array[MixBlendModeProperty]): Self = StObject.set(x, "mix-blend-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMix-blend-modeUndefined`: Self = StObject.set(x, "mix-blend-mode", js.undefined)
    
    @scala.inline
    def `setMix-blend-modeVarargs`(value: MixBlendModeProperty*): Self = StObject.set(x, "mix-blend-mode", js.Array(value :_*))
    
    @scala.inline
    def `setMotion-distance`(value: OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]): Self = StObject.set(x, "motion-distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMotion-distanceUndefined`: Self = StObject.set(x, "motion-distance", js.undefined)
    
    @scala.inline
    def `setMotion-distanceVarargs`(value: OffsetDistanceProperty[TLength]*): Self = StObject.set(x, "motion-distance", js.Array(value :_*))
    
    @scala.inline
    def `setMotion-path`(value: OffsetPathProperty | js.Array[OffsetPathProperty]): Self = StObject.set(x, "motion-path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMotion-pathUndefined`: Self = StObject.set(x, "motion-path", js.undefined)
    
    @scala.inline
    def `setMotion-pathVarargs`(value: OffsetPathProperty*): Self = StObject.set(x, "motion-path", js.Array(value :_*))
    
    @scala.inline
    def `setMotion-rotation`(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self = StObject.set(x, "motion-rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMotion-rotationUndefined`: Self = StObject.set(x, "motion-rotation", js.undefined)
    
    @scala.inline
    def `setMotion-rotationVarargs`(value: OffsetRotateProperty*): Self = StObject.set(x, "motion-rotation", js.Array(value :_*))
    
    @scala.inline
    def `setObject-fit`(value: ObjectFitProperty | js.Array[ObjectFitProperty]): Self = StObject.set(x, "object-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setObject-fitUndefined`: Self = StObject.set(x, "object-fit", js.undefined)
    
    @scala.inline
    def `setObject-fitVarargs`(value: ObjectFitProperty*): Self = StObject.set(x, "object-fit", js.Array(value :_*))
    
    @scala.inline
    def `setObject-position`(value: ObjectPositionProperty[TLength] | js.Array[ObjectPositionProperty[TLength]]): Self = StObject.set(x, "object-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setObject-positionUndefined`: Self = StObject.set(x, "object-position", js.undefined)
    
    @scala.inline
    def `setObject-positionVarargs`(value: ObjectPositionProperty[TLength]*): Self = StObject.set(x, "object-position", js.Array(value :_*))
    
    @scala.inline
    def `setOffset-anchor`(value: OffsetAnchorProperty[TLength] | js.Array[OffsetAnchorProperty[TLength]]): Self = StObject.set(x, "offset-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-anchorUndefined`: Self = StObject.set(x, "offset-anchor", js.undefined)
    
    @scala.inline
    def `setOffset-anchorVarargs`(value: OffsetAnchorProperty[TLength]*): Self = StObject.set(x, "offset-anchor", js.Array(value :_*))
    
    @scala.inline
    def `setOffset-distance`(value: OffsetDistanceProperty[TLength] | js.Array[OffsetDistanceProperty[TLength]]): Self = StObject.set(x, "offset-distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-distanceUndefined`: Self = StObject.set(x, "offset-distance", js.undefined)
    
    @scala.inline
    def `setOffset-distanceVarargs`(value: OffsetDistanceProperty[TLength]*): Self = StObject.set(x, "offset-distance", js.Array(value :_*))
    
    @scala.inline
    def `setOffset-path`(value: OffsetPathProperty | js.Array[OffsetPathProperty]): Self = StObject.set(x, "offset-path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-pathUndefined`: Self = StObject.set(x, "offset-path", js.undefined)
    
    @scala.inline
    def `setOffset-pathVarargs`(value: OffsetPathProperty*): Self = StObject.set(x, "offset-path", js.Array(value :_*))
    
    @scala.inline
    def `setOffset-rotate`(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self = StObject.set(x, "offset-rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-rotateUndefined`: Self = StObject.set(x, "offset-rotate", js.undefined)
    
    @scala.inline
    def `setOffset-rotateVarargs`(value: OffsetRotateProperty*): Self = StObject.set(x, "offset-rotate", js.Array(value :_*))
    
    @scala.inline
    def `setOffset-rotation`(value: OffsetRotateProperty | js.Array[OffsetRotateProperty]): Self = StObject.set(x, "offset-rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOffset-rotationUndefined`: Self = StObject.set(x, "offset-rotation", js.undefined)
    
    @scala.inline
    def `setOffset-rotationVarargs`(value: OffsetRotateProperty*): Self = StObject.set(x, "offset-rotation", js.Array(value :_*))
    
    @scala.inline
    def setOpacity(value: OpacityProperty | js.Array[OpacityProperty]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOpacityVarargs(value: OpacityProperty*): Self = StObject.set(x, "opacity", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: GlobalsNumber*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setOrphans(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "orphans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrphansUndefined: Self = StObject.set(x, "orphans", js.undefined)
    
    @scala.inline
    def setOrphansVarargs(value: GlobalsNumber*): Self = StObject.set(x, "orphans", js.Array(value :_*))
    
    @scala.inline
    def `setOutline-color`(value: OutlineColorProperty | js.Array[OutlineColorProperty]): Self = StObject.set(x, "outline-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutline-colorUndefined`: Self = StObject.set(x, "outline-color", js.undefined)
    
    @scala.inline
    def `setOutline-colorVarargs`(value: OutlineColorProperty*): Self = StObject.set(x, "outline-color", js.Array(value :_*))
    
    @scala.inline
    def `setOutline-offset`(value: OutlineOffsetProperty[TLength] | js.Array[OutlineOffsetProperty[TLength]]): Self = StObject.set(x, "outline-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutline-offsetUndefined`: Self = StObject.set(x, "outline-offset", js.undefined)
    
    @scala.inline
    def `setOutline-offsetVarargs`(value: OutlineOffsetProperty[TLength]*): Self = StObject.set(x, "outline-offset", js.Array(value :_*))
    
    @scala.inline
    def `setOutline-style`(value: OutlineStyleProperty | js.Array[OutlineStyleProperty]): Self = StObject.set(x, "outline-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutline-styleUndefined`: Self = StObject.set(x, "outline-style", js.undefined)
    
    @scala.inline
    def `setOutline-styleVarargs`(value: OutlineStyleProperty*): Self = StObject.set(x, "outline-style", js.Array(value :_*))
    
    @scala.inline
    def `setOutline-width`(value: OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]): Self = StObject.set(x, "outline-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutline-widthUndefined`: Self = StObject.set(x, "outline-width", js.undefined)
    
    @scala.inline
    def `setOutline-widthVarargs`(value: OutlineWidthProperty[TLength]*): Self = StObject.set(x, "outline-width", js.Array(value :_*))
    
    @scala.inline
    def `setOverflow-anchor`(value: OverflowAnchorProperty | js.Array[OverflowAnchorProperty]): Self = StObject.set(x, "overflow-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverflow-anchorUndefined`: Self = StObject.set(x, "overflow-anchor", js.undefined)
    
    @scala.inline
    def `setOverflow-anchorVarargs`(value: OverflowAnchorProperty*): Self = StObject.set(x, "overflow-anchor", js.Array(value :_*))
    
    @scala.inline
    def `setOverflow-block`(value: OverflowBlockProperty | js.Array[OverflowBlockProperty]): Self = StObject.set(x, "overflow-block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverflow-blockUndefined`: Self = StObject.set(x, "overflow-block", js.undefined)
    
    @scala.inline
    def `setOverflow-blockVarargs`(value: OverflowBlockProperty*): Self = StObject.set(x, "overflow-block", js.Array(value :_*))
    
    @scala.inline
    def `setOverflow-clip-box`(value: OverflowClipBoxProperty | js.Array[OverflowClipBoxProperty]): Self = StObject.set(x, "overflow-clip-box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverflow-clip-boxUndefined`: Self = StObject.set(x, "overflow-clip-box", js.undefined)
    
    @scala.inline
    def `setOverflow-clip-boxVarargs`(value: OverflowClipBoxProperty*): Self = StObject.set(x, "overflow-clip-box", js.Array(value :_*))
    
    @scala.inline
    def `setOverflow-inline`(value: OverflowInlineProperty | js.Array[OverflowInlineProperty]): Self = StObject.set(x, "overflow-inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverflow-inlineUndefined`: Self = StObject.set(x, "overflow-inline", js.undefined)
    
    @scala.inline
    def `setOverflow-inlineVarargs`(value: OverflowInlineProperty*): Self = StObject.set(x, "overflow-inline", js.Array(value :_*))
    
    @scala.inline
    def `setOverflow-wrap`(value: OverflowWrapProperty | js.Array[OverflowWrapProperty]): Self = StObject.set(x, "overflow-wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverflow-wrapUndefined`: Self = StObject.set(x, "overflow-wrap", js.undefined)
    
    @scala.inline
    def `setOverflow-wrapVarargs`(value: OverflowWrapProperty*): Self = StObject.set(x, "overflow-wrap", js.Array(value :_*))
    
    @scala.inline
    def `setOverflow-x`(value: OverflowXProperty | js.Array[OverflowXProperty]): Self = StObject.set(x, "overflow-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverflow-xUndefined`: Self = StObject.set(x, "overflow-x", js.undefined)
    
    @scala.inline
    def `setOverflow-xVarargs`(value: OverflowXProperty*): Self = StObject.set(x, "overflow-x", js.Array(value :_*))
    
    @scala.inline
    def `setOverflow-y`(value: OverflowYProperty | js.Array[OverflowYProperty]): Self = StObject.set(x, "overflow-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverflow-yUndefined`: Self = StObject.set(x, "overflow-y", js.undefined)
    
    @scala.inline
    def `setOverflow-yVarargs`(value: OverflowYProperty*): Self = StObject.set(x, "overflow-y", js.Array(value :_*))
    
    @scala.inline
    def `setOverscroll-behavior`(value: OverscrollBehaviorProperty | js.Array[OverscrollBehaviorProperty]): Self = StObject.set(x, "overscroll-behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverscroll-behavior-block`(value: OverscrollBehaviorBlockProperty | js.Array[OverscrollBehaviorBlockProperty]): Self = StObject.set(x, "overscroll-behavior-block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverscroll-behavior-blockUndefined`: Self = StObject.set(x, "overscroll-behavior-block", js.undefined)
    
    @scala.inline
    def `setOverscroll-behavior-blockVarargs`(value: OverscrollBehaviorBlockProperty*): Self = StObject.set(x, "overscroll-behavior-block", js.Array(value :_*))
    
    @scala.inline
    def `setOverscroll-behavior-inline`(value: OverscrollBehaviorInlineProperty | js.Array[OverscrollBehaviorInlineProperty]): Self = StObject.set(x, "overscroll-behavior-inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverscroll-behavior-inlineUndefined`: Self = StObject.set(x, "overscroll-behavior-inline", js.undefined)
    
    @scala.inline
    def `setOverscroll-behavior-inlineVarargs`(value: OverscrollBehaviorInlineProperty*): Self = StObject.set(x, "overscroll-behavior-inline", js.Array(value :_*))
    
    @scala.inline
    def `setOverscroll-behavior-x`(value: OverscrollBehaviorXProperty | js.Array[OverscrollBehaviorXProperty]): Self = StObject.set(x, "overscroll-behavior-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverscroll-behavior-xUndefined`: Self = StObject.set(x, "overscroll-behavior-x", js.undefined)
    
    @scala.inline
    def `setOverscroll-behavior-xVarargs`(value: OverscrollBehaviorXProperty*): Self = StObject.set(x, "overscroll-behavior-x", js.Array(value :_*))
    
    @scala.inline
    def `setOverscroll-behavior-y`(value: OverscrollBehaviorYProperty | js.Array[OverscrollBehaviorYProperty]): Self = StObject.set(x, "overscroll-behavior-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverscroll-behavior-yUndefined`: Self = StObject.set(x, "overscroll-behavior-y", js.undefined)
    
    @scala.inline
    def `setOverscroll-behavior-yVarargs`(value: OverscrollBehaviorYProperty*): Self = StObject.set(x, "overscroll-behavior-y", js.Array(value :_*))
    
    @scala.inline
    def `setOverscroll-behaviorUndefined`: Self = StObject.set(x, "overscroll-behavior", js.undefined)
    
    @scala.inline
    def `setOverscroll-behaviorVarargs`(value: OverscrollBehaviorProperty*): Self = StObject.set(x, "overscroll-behavior", js.Array(value :_*))
    
    @scala.inline
    def `setPadding-block`(value: PaddingBlockProperty[TLength] | js.Array[PaddingBlockProperty[TLength]]): Self = StObject.set(x, "padding-block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-block-end`(value: PaddingBlockEndProperty[TLength] | js.Array[PaddingBlockEndProperty[TLength]]): Self = StObject.set(x, "padding-block-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-block-endUndefined`: Self = StObject.set(x, "padding-block-end", js.undefined)
    
    @scala.inline
    def `setPadding-block-endVarargs`(value: PaddingBlockEndProperty[TLength]*): Self = StObject.set(x, "padding-block-end", js.Array(value :_*))
    
    @scala.inline
    def `setPadding-block-start`(value: PaddingBlockStartProperty[TLength] | js.Array[PaddingBlockStartProperty[TLength]]): Self = StObject.set(x, "padding-block-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-block-startUndefined`: Self = StObject.set(x, "padding-block-start", js.undefined)
    
    @scala.inline
    def `setPadding-block-startVarargs`(value: PaddingBlockStartProperty[TLength]*): Self = StObject.set(x, "padding-block-start", js.Array(value :_*))
    
    @scala.inline
    def `setPadding-blockUndefined`: Self = StObject.set(x, "padding-block", js.undefined)
    
    @scala.inline
    def `setPadding-blockVarargs`(value: PaddingBlockProperty[TLength]*): Self = StObject.set(x, "padding-block", js.Array(value :_*))
    
    @scala.inline
    def `setPadding-bottom`(value: PaddingBottomProperty[TLength] | js.Array[PaddingBottomProperty[TLength]]): Self = StObject.set(x, "padding-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-bottomUndefined`: Self = StObject.set(x, "padding-bottom", js.undefined)
    
    @scala.inline
    def `setPadding-bottomVarargs`(value: PaddingBottomProperty[TLength]*): Self = StObject.set(x, "padding-bottom", js.Array(value :_*))
    
    @scala.inline
    def `setPadding-inline`(value: PaddingInlineProperty[TLength] | js.Array[PaddingInlineProperty[TLength]]): Self = StObject.set(x, "padding-inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-inline-end`(value: PaddingInlineEndProperty[TLength] | js.Array[PaddingInlineEndProperty[TLength]]): Self = StObject.set(x, "padding-inline-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-inline-endUndefined`: Self = StObject.set(x, "padding-inline-end", js.undefined)
    
    @scala.inline
    def `setPadding-inline-endVarargs`(value: PaddingInlineEndProperty[TLength]*): Self = StObject.set(x, "padding-inline-end", js.Array(value :_*))
    
    @scala.inline
    def `setPadding-inline-start`(value: PaddingInlineStartProperty[TLength] | js.Array[PaddingInlineStartProperty[TLength]]): Self = StObject.set(x, "padding-inline-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-inline-startUndefined`: Self = StObject.set(x, "padding-inline-start", js.undefined)
    
    @scala.inline
    def `setPadding-inline-startVarargs`(value: PaddingInlineStartProperty[TLength]*): Self = StObject.set(x, "padding-inline-start", js.Array(value :_*))
    
    @scala.inline
    def `setPadding-inlineUndefined`: Self = StObject.set(x, "padding-inline", js.undefined)
    
    @scala.inline
    def `setPadding-inlineVarargs`(value: PaddingInlineProperty[TLength]*): Self = StObject.set(x, "padding-inline", js.Array(value :_*))
    
    @scala.inline
    def `setPadding-left`(value: PaddingLeftProperty[TLength] | js.Array[PaddingLeftProperty[TLength]]): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
    
    @scala.inline
    def `setPadding-leftVarargs`(value: PaddingLeftProperty[TLength]*): Self = StObject.set(x, "padding-left", js.Array(value :_*))
    
    @scala.inline
    def `setPadding-right`(value: PaddingRightProperty[TLength] | js.Array[PaddingRightProperty[TLength]]): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
    
    @scala.inline
    def `setPadding-rightVarargs`(value: PaddingRightProperty[TLength]*): Self = StObject.set(x, "padding-right", js.Array(value :_*))
    
    @scala.inline
    def `setPadding-top`(value: PaddingTopProperty[TLength] | js.Array[PaddingTopProperty[TLength]]): Self = StObject.set(x, "padding-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPadding-topUndefined`: Self = StObject.set(x, "padding-top", js.undefined)
    
    @scala.inline
    def `setPadding-topVarargs`(value: PaddingTopProperty[TLength]*): Self = StObject.set(x, "padding-top", js.Array(value :_*))
    
    @scala.inline
    def `setPage-break-after`(value: PageBreakAfterProperty | js.Array[PageBreakAfterProperty]): Self = StObject.set(x, "page-break-after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage-break-afterUndefined`: Self = StObject.set(x, "page-break-after", js.undefined)
    
    @scala.inline
    def `setPage-break-afterVarargs`(value: PageBreakAfterProperty*): Self = StObject.set(x, "page-break-after", js.Array(value :_*))
    
    @scala.inline
    def `setPage-break-before`(value: PageBreakBeforeProperty | js.Array[PageBreakBeforeProperty]): Self = StObject.set(x, "page-break-before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage-break-beforeUndefined`: Self = StObject.set(x, "page-break-before", js.undefined)
    
    @scala.inline
    def `setPage-break-beforeVarargs`(value: PageBreakBeforeProperty*): Self = StObject.set(x, "page-break-before", js.Array(value :_*))
    
    @scala.inline
    def `setPage-break-inside`(value: PageBreakInsideProperty | js.Array[PageBreakInsideProperty]): Self = StObject.set(x, "page-break-inside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage-break-insideUndefined`: Self = StObject.set(x, "page-break-inside", js.undefined)
    
    @scala.inline
    def `setPage-break-insideVarargs`(value: PageBreakInsideProperty*): Self = StObject.set(x, "page-break-inside", js.Array(value :_*))
    
    @scala.inline
    def `setPaint-order`(value: PaintOrderProperty | js.Array[PaintOrderProperty]): Self = StObject.set(x, "paint-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPaint-orderUndefined`: Self = StObject.set(x, "paint-order", js.undefined)
    
    @scala.inline
    def `setPaint-orderVarargs`(value: PaintOrderProperty*): Self = StObject.set(x, "paint-order", js.Array(value :_*))
    
    @scala.inline
    def setPerspective(value: PerspectiveProperty[TLength] | js.Array[PerspectiveProperty[TLength]]): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPerspective-origin`(value: PerspectiveOriginProperty[TLength] | js.Array[PerspectiveOriginProperty[TLength]]): Self = StObject.set(x, "perspective-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPerspective-originUndefined`: Self = StObject.set(x, "perspective-origin", js.undefined)
    
    @scala.inline
    def `setPerspective-originVarargs`(value: PerspectiveOriginProperty[TLength]*): Self = StObject.set(x, "perspective-origin", js.Array(value :_*))
    
    @scala.inline
    def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
    
    @scala.inline
    def setPerspectiveVarargs(value: PerspectiveProperty[TLength]*): Self = StObject.set(x, "perspective", js.Array(value :_*))
    
    @scala.inline
    def `setPlace-content`(value: PlaceContentProperty | js.Array[PlaceContentProperty]): Self = StObject.set(x, "place-content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPlace-contentUndefined`: Self = StObject.set(x, "place-content", js.undefined)
    
    @scala.inline
    def `setPlace-contentVarargs`(value: PlaceContentProperty*): Self = StObject.set(x, "place-content", js.Array(value :_*))
    
    @scala.inline
    def `setPointer-events`(value: PointerEventsProperty | js.Array[PointerEventsProperty]): Self = StObject.set(x, "pointer-events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPointer-eventsUndefined`: Self = StObject.set(x, "pointer-events", js.undefined)
    
    @scala.inline
    def `setPointer-eventsVarargs`(value: PointerEventsProperty*): Self = StObject.set(x, "pointer-events", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: PositionProperty | js.Array[PositionProperty]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: PositionProperty*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    @scala.inline
    def setQuotes(value: QuotesProperty | js.Array[QuotesProperty]): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
    
    @scala.inline
    def setQuotesVarargs(value: QuotesProperty*): Self = StObject.set(x, "quotes", js.Array(value :_*))
    
    @scala.inline
    def setResize(value: ResizeProperty | js.Array[ResizeProperty]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setResizeVarargs(value: ResizeProperty*): Self = StObject.set(x, "resize", js.Array(value :_*))
    
    @scala.inline
    def setRight(value: RightProperty[TLength] | js.Array[RightProperty[TLength]]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setRightVarargs(value: RightProperty[TLength]*): Self = StObject.set(x, "right", js.Array(value :_*))
    
    @scala.inline
    def setRotate(value: RotateProperty | js.Array[RotateProperty]): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setRotateVarargs(value: RotateProperty*): Self = StObject.set(x, "rotate", js.Array(value :_*))
    
    @scala.inline
    def `setRow-gap`(value: RowGapProperty[TLength] | js.Array[RowGapProperty[TLength]]): Self = StObject.set(x, "row-gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRow-gapUndefined`: Self = StObject.set(x, "row-gap", js.undefined)
    
    @scala.inline
    def `setRow-gapVarargs`(value: RowGapProperty[TLength]*): Self = StObject.set(x, "row-gap", js.Array(value :_*))
    
    @scala.inline
    def `setRuby-align`(value: RubyAlignProperty | js.Array[RubyAlignProperty]): Self = StObject.set(x, "ruby-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRuby-alignUndefined`: Self = StObject.set(x, "ruby-align", js.undefined)
    
    @scala.inline
    def `setRuby-alignVarargs`(value: RubyAlignProperty*): Self = StObject.set(x, "ruby-align", js.Array(value :_*))
    
    @scala.inline
    def `setRuby-merge`(value: RubyMergeProperty | js.Array[RubyMergeProperty]): Self = StObject.set(x, "ruby-merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRuby-mergeUndefined`: Self = StObject.set(x, "ruby-merge", js.undefined)
    
    @scala.inline
    def `setRuby-mergeVarargs`(value: RubyMergeProperty*): Self = StObject.set(x, "ruby-merge", js.Array(value :_*))
    
    @scala.inline
    def `setRuby-position`(value: RubyPositionProperty | js.Array[RubyPositionProperty]): Self = StObject.set(x, "ruby-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRuby-positionUndefined`: Self = StObject.set(x, "ruby-position", js.undefined)
    
    @scala.inline
    def `setRuby-positionVarargs`(value: RubyPositionProperty*): Self = StObject.set(x, "ruby-position", js.Array(value :_*))
    
    @scala.inline
    def setScale(value: ScaleProperty | js.Array[ScaleProperty]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setScaleVarargs(value: ScaleProperty*): Self = StObject.set(x, "scale", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-behavior`(value: ScrollBehaviorProperty | js.Array[ScrollBehaviorProperty]): Self = StObject.set(x, "scroll-behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-behaviorUndefined`: Self = StObject.set(x, "scroll-behavior", js.undefined)
    
    @scala.inline
    def `setScroll-behaviorVarargs`(value: ScrollBehaviorProperty*): Self = StObject.set(x, "scroll-behavior", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-margin`(value: ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]): Self = StObject.set(x, "scroll-margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-margin-block`(value: ScrollMarginBlockProperty[TLength] | js.Array[ScrollMarginBlockProperty[TLength]]): Self = StObject.set(x, "scroll-margin-block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-margin-block-end`(value: ScrollMarginBlockEndProperty[TLength] | js.Array[ScrollMarginBlockEndProperty[TLength]]): Self = StObject.set(x, "scroll-margin-block-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-margin-block-endUndefined`: Self = StObject.set(x, "scroll-margin-block-end", js.undefined)
    
    @scala.inline
    def `setScroll-margin-block-endVarargs`(value: ScrollMarginBlockEndProperty[TLength]*): Self = StObject.set(x, "scroll-margin-block-end", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-margin-block-start`(value: ScrollMarginBlockStartProperty[TLength] | js.Array[ScrollMarginBlockStartProperty[TLength]]): Self = StObject.set(x, "scroll-margin-block-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-margin-block-startUndefined`: Self = StObject.set(x, "scroll-margin-block-start", js.undefined)
    
    @scala.inline
    def `setScroll-margin-block-startVarargs`(value: ScrollMarginBlockStartProperty[TLength]*): Self = StObject.set(x, "scroll-margin-block-start", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-margin-blockUndefined`: Self = StObject.set(x, "scroll-margin-block", js.undefined)
    
    @scala.inline
    def `setScroll-margin-blockVarargs`(value: ScrollMarginBlockProperty[TLength]*): Self = StObject.set(x, "scroll-margin-block", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-margin-bottom`(value: ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]): Self = StObject.set(x, "scroll-margin-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-margin-bottomUndefined`: Self = StObject.set(x, "scroll-margin-bottom", js.undefined)
    
    @scala.inline
    def `setScroll-margin-bottomVarargs`(value: ScrollMarginBottomProperty[TLength]*): Self = StObject.set(x, "scroll-margin-bottom", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-margin-inline`(value: ScrollMarginInlineProperty[TLength] | js.Array[ScrollMarginInlineProperty[TLength]]): Self = StObject.set(x, "scroll-margin-inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-margin-inline-end`(value: ScrollMarginInlineEndProperty[TLength] | js.Array[ScrollMarginInlineEndProperty[TLength]]): Self = StObject.set(x, "scroll-margin-inline-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-margin-inline-endUndefined`: Self = StObject.set(x, "scroll-margin-inline-end", js.undefined)
    
    @scala.inline
    def `setScroll-margin-inline-endVarargs`(value: ScrollMarginInlineEndProperty[TLength]*): Self = StObject.set(x, "scroll-margin-inline-end", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-margin-inline-start`(
      value: ScrollMarginInlineStartProperty[TLength] | js.Array[ScrollMarginInlineStartProperty[TLength]]
    ): Self = StObject.set(x, "scroll-margin-inline-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-margin-inline-startUndefined`: Self = StObject.set(x, "scroll-margin-inline-start", js.undefined)
    
    @scala.inline
    def `setScroll-margin-inline-startVarargs`(value: ScrollMarginInlineStartProperty[TLength]*): Self = StObject.set(x, "scroll-margin-inline-start", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-margin-inlineUndefined`: Self = StObject.set(x, "scroll-margin-inline", js.undefined)
    
    @scala.inline
    def `setScroll-margin-inlineVarargs`(value: ScrollMarginInlineProperty[TLength]*): Self = StObject.set(x, "scroll-margin-inline", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-margin-left`(value: ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]): Self = StObject.set(x, "scroll-margin-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-margin-leftUndefined`: Self = StObject.set(x, "scroll-margin-left", js.undefined)
    
    @scala.inline
    def `setScroll-margin-leftVarargs`(value: ScrollMarginLeftProperty[TLength]*): Self = StObject.set(x, "scroll-margin-left", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-margin-right`(value: ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]): Self = StObject.set(x, "scroll-margin-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-margin-rightUndefined`: Self = StObject.set(x, "scroll-margin-right", js.undefined)
    
    @scala.inline
    def `setScroll-margin-rightVarargs`(value: ScrollMarginRightProperty[TLength]*): Self = StObject.set(x, "scroll-margin-right", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-margin-top`(value: ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]): Self = StObject.set(x, "scroll-margin-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-margin-topUndefined`: Self = StObject.set(x, "scroll-margin-top", js.undefined)
    
    @scala.inline
    def `setScroll-margin-topVarargs`(value: ScrollMarginTopProperty[TLength]*): Self = StObject.set(x, "scroll-margin-top", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-marginUndefined`: Self = StObject.set(x, "scroll-margin", js.undefined)
    
    @scala.inline
    def `setScroll-marginVarargs`(value: ScrollMarginProperty[TLength]*): Self = StObject.set(x, "scroll-margin", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-padding`(value: ScrollPaddingProperty[TLength] | js.Array[ScrollPaddingProperty[TLength]]): Self = StObject.set(x, "scroll-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-padding-block`(value: ScrollPaddingBlockProperty[TLength] | js.Array[ScrollPaddingBlockProperty[TLength]]): Self = StObject.set(x, "scroll-padding-block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-padding-block-end`(value: ScrollPaddingBlockEndProperty[TLength] | js.Array[ScrollPaddingBlockEndProperty[TLength]]): Self = StObject.set(x, "scroll-padding-block-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-padding-block-endUndefined`: Self = StObject.set(x, "scroll-padding-block-end", js.undefined)
    
    @scala.inline
    def `setScroll-padding-block-endVarargs`(value: ScrollPaddingBlockEndProperty[TLength]*): Self = StObject.set(x, "scroll-padding-block-end", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-padding-block-start`(
      value: ScrollPaddingBlockStartProperty[TLength] | js.Array[ScrollPaddingBlockStartProperty[TLength]]
    ): Self = StObject.set(x, "scroll-padding-block-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-padding-block-startUndefined`: Self = StObject.set(x, "scroll-padding-block-start", js.undefined)
    
    @scala.inline
    def `setScroll-padding-block-startVarargs`(value: ScrollPaddingBlockStartProperty[TLength]*): Self = StObject.set(x, "scroll-padding-block-start", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-padding-blockUndefined`: Self = StObject.set(x, "scroll-padding-block", js.undefined)
    
    @scala.inline
    def `setScroll-padding-blockVarargs`(value: ScrollPaddingBlockProperty[TLength]*): Self = StObject.set(x, "scroll-padding-block", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-padding-bottom`(value: ScrollPaddingBottomProperty[TLength] | js.Array[ScrollPaddingBottomProperty[TLength]]): Self = StObject.set(x, "scroll-padding-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-padding-bottomUndefined`: Self = StObject.set(x, "scroll-padding-bottom", js.undefined)
    
    @scala.inline
    def `setScroll-padding-bottomVarargs`(value: ScrollPaddingBottomProperty[TLength]*): Self = StObject.set(x, "scroll-padding-bottom", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-padding-inline`(value: ScrollPaddingInlineProperty[TLength] | js.Array[ScrollPaddingInlineProperty[TLength]]): Self = StObject.set(x, "scroll-padding-inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-padding-inline-end`(value: ScrollPaddingInlineEndProperty[TLength] | js.Array[ScrollPaddingInlineEndProperty[TLength]]): Self = StObject.set(x, "scroll-padding-inline-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-padding-inline-endUndefined`: Self = StObject.set(x, "scroll-padding-inline-end", js.undefined)
    
    @scala.inline
    def `setScroll-padding-inline-endVarargs`(value: ScrollPaddingInlineEndProperty[TLength]*): Self = StObject.set(x, "scroll-padding-inline-end", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-padding-inline-start`(
      value: ScrollPaddingInlineStartProperty[TLength] | js.Array[ScrollPaddingInlineStartProperty[TLength]]
    ): Self = StObject.set(x, "scroll-padding-inline-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-padding-inline-startUndefined`: Self = StObject.set(x, "scroll-padding-inline-start", js.undefined)
    
    @scala.inline
    def `setScroll-padding-inline-startVarargs`(value: ScrollPaddingInlineStartProperty[TLength]*): Self = StObject.set(x, "scroll-padding-inline-start", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-padding-inlineUndefined`: Self = StObject.set(x, "scroll-padding-inline", js.undefined)
    
    @scala.inline
    def `setScroll-padding-inlineVarargs`(value: ScrollPaddingInlineProperty[TLength]*): Self = StObject.set(x, "scroll-padding-inline", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-padding-left`(value: ScrollPaddingLeftProperty[TLength] | js.Array[ScrollPaddingLeftProperty[TLength]]): Self = StObject.set(x, "scroll-padding-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-padding-leftUndefined`: Self = StObject.set(x, "scroll-padding-left", js.undefined)
    
    @scala.inline
    def `setScroll-padding-leftVarargs`(value: ScrollPaddingLeftProperty[TLength]*): Self = StObject.set(x, "scroll-padding-left", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-padding-right`(value: ScrollPaddingRightProperty[TLength] | js.Array[ScrollPaddingRightProperty[TLength]]): Self = StObject.set(x, "scroll-padding-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-padding-rightUndefined`: Self = StObject.set(x, "scroll-padding-right", js.undefined)
    
    @scala.inline
    def `setScroll-padding-rightVarargs`(value: ScrollPaddingRightProperty[TLength]*): Self = StObject.set(x, "scroll-padding-right", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-padding-top`(value: ScrollPaddingTopProperty[TLength] | js.Array[ScrollPaddingTopProperty[TLength]]): Self = StObject.set(x, "scroll-padding-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-padding-topUndefined`: Self = StObject.set(x, "scroll-padding-top", js.undefined)
    
    @scala.inline
    def `setScroll-padding-topVarargs`(value: ScrollPaddingTopProperty[TLength]*): Self = StObject.set(x, "scroll-padding-top", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-paddingUndefined`: Self = StObject.set(x, "scroll-padding", js.undefined)
    
    @scala.inline
    def `setScroll-paddingVarargs`(value: ScrollPaddingProperty[TLength]*): Self = StObject.set(x, "scroll-padding", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-align`(value: ScrollSnapAlignProperty | js.Array[ScrollSnapAlignProperty]): Self = StObject.set(x, "scroll-snap-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-snap-alignUndefined`: Self = StObject.set(x, "scroll-snap-align", js.undefined)
    
    @scala.inline
    def `setScroll-snap-alignVarargs`(value: ScrollSnapAlignProperty*): Self = StObject.set(x, "scroll-snap-align", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-margin`(value: ScrollMarginProperty[TLength] | js.Array[ScrollMarginProperty[TLength]]): Self = StObject.set(x, "scroll-snap-margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-snap-margin-bottom`(value: ScrollMarginBottomProperty[TLength] | js.Array[ScrollMarginBottomProperty[TLength]]): Self = StObject.set(x, "scroll-snap-margin-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-snap-margin-bottomUndefined`: Self = StObject.set(x, "scroll-snap-margin-bottom", js.undefined)
    
    @scala.inline
    def `setScroll-snap-margin-bottomVarargs`(value: ScrollMarginBottomProperty[TLength]*): Self = StObject.set(x, "scroll-snap-margin-bottom", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-margin-left`(value: ScrollMarginLeftProperty[TLength] | js.Array[ScrollMarginLeftProperty[TLength]]): Self = StObject.set(x, "scroll-snap-margin-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-snap-margin-leftUndefined`: Self = StObject.set(x, "scroll-snap-margin-left", js.undefined)
    
    @scala.inline
    def `setScroll-snap-margin-leftVarargs`(value: ScrollMarginLeftProperty[TLength]*): Self = StObject.set(x, "scroll-snap-margin-left", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-margin-right`(value: ScrollMarginRightProperty[TLength] | js.Array[ScrollMarginRightProperty[TLength]]): Self = StObject.set(x, "scroll-snap-margin-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-snap-margin-rightUndefined`: Self = StObject.set(x, "scroll-snap-margin-right", js.undefined)
    
    @scala.inline
    def `setScroll-snap-margin-rightVarargs`(value: ScrollMarginRightProperty[TLength]*): Self = StObject.set(x, "scroll-snap-margin-right", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-margin-top`(value: ScrollMarginTopProperty[TLength] | js.Array[ScrollMarginTopProperty[TLength]]): Self = StObject.set(x, "scroll-snap-margin-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-snap-margin-topUndefined`: Self = StObject.set(x, "scroll-snap-margin-top", js.undefined)
    
    @scala.inline
    def `setScroll-snap-margin-topVarargs`(value: ScrollMarginTopProperty[TLength]*): Self = StObject.set(x, "scroll-snap-margin-top", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-marginUndefined`: Self = StObject.set(x, "scroll-snap-margin", js.undefined)
    
    @scala.inline
    def `setScroll-snap-marginVarargs`(value: ScrollMarginProperty[TLength]*): Self = StObject.set(x, "scroll-snap-margin", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-stop`(value: ScrollSnapStopProperty | js.Array[ScrollSnapStopProperty]): Self = StObject.set(x, "scroll-snap-stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-snap-stopUndefined`: Self = StObject.set(x, "scroll-snap-stop", js.undefined)
    
    @scala.inline
    def `setScroll-snap-stopVarargs`(value: ScrollSnapStopProperty*): Self = StObject.set(x, "scroll-snap-stop", js.Array(value :_*))
    
    @scala.inline
    def `setScroll-snap-type`(value: ScrollSnapTypeProperty | js.Array[ScrollSnapTypeProperty]): Self = StObject.set(x, "scroll-snap-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-snap-typeUndefined`: Self = StObject.set(x, "scroll-snap-type", js.undefined)
    
    @scala.inline
    def `setScroll-snap-typeVarargs`(value: ScrollSnapTypeProperty*): Self = StObject.set(x, "scroll-snap-type", js.Array(value :_*))
    
    @scala.inline
    def `setScrollbar-color`(value: ScrollbarColorProperty | js.Array[ScrollbarColorProperty]): Self = StObject.set(x, "scrollbar-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScrollbar-colorUndefined`: Self = StObject.set(x, "scrollbar-color", js.undefined)
    
    @scala.inline
    def `setScrollbar-colorVarargs`(value: ScrollbarColorProperty*): Self = StObject.set(x, "scrollbar-color", js.Array(value :_*))
    
    @scala.inline
    def `setScrollbar-gutter`(value: ScrollbarGutterProperty | js.Array[ScrollbarGutterProperty]): Self = StObject.set(x, "scrollbar-gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScrollbar-gutterUndefined`: Self = StObject.set(x, "scrollbar-gutter", js.undefined)
    
    @scala.inline
    def `setScrollbar-gutterVarargs`(value: ScrollbarGutterProperty*): Self = StObject.set(x, "scrollbar-gutter", js.Array(value :_*))
    
    @scala.inline
    def `setScrollbar-width`(value: ScrollbarWidthProperty | js.Array[ScrollbarWidthProperty]): Self = StObject.set(x, "scrollbar-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScrollbar-widthUndefined`: Self = StObject.set(x, "scrollbar-width", js.undefined)
    
    @scala.inline
    def `setScrollbar-widthVarargs`(value: ScrollbarWidthProperty*): Self = StObject.set(x, "scrollbar-width", js.Array(value :_*))
    
    @scala.inline
    def `setShape-image-threshold`(value: ShapeImageThresholdProperty | js.Array[ShapeImageThresholdProperty]): Self = StObject.set(x, "shape-image-threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShape-image-thresholdUndefined`: Self = StObject.set(x, "shape-image-threshold", js.undefined)
    
    @scala.inline
    def `setShape-image-thresholdVarargs`(value: ShapeImageThresholdProperty*): Self = StObject.set(x, "shape-image-threshold", js.Array(value :_*))
    
    @scala.inline
    def `setShape-margin`(value: ShapeMarginProperty[TLength] | js.Array[ShapeMarginProperty[TLength]]): Self = StObject.set(x, "shape-margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShape-marginUndefined`: Self = StObject.set(x, "shape-margin", js.undefined)
    
    @scala.inline
    def `setShape-marginVarargs`(value: ShapeMarginProperty[TLength]*): Self = StObject.set(x, "shape-margin", js.Array(value :_*))
    
    @scala.inline
    def `setShape-outside`(value: ShapeOutsideProperty | js.Array[ShapeOutsideProperty]): Self = StObject.set(x, "shape-outside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShape-outsideUndefined`: Self = StObject.set(x, "shape-outside", js.undefined)
    
    @scala.inline
    def `setShape-outsideVarargs`(value: ShapeOutsideProperty*): Self = StObject.set(x, "shape-outside", js.Array(value :_*))
    
    @scala.inline
    def `setTab-size`(value: TabSizeProperty[TLength] | js.Array[TabSizeProperty[TLength]]): Self = StObject.set(x, "tab-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTab-sizeUndefined`: Self = StObject.set(x, "tab-size", js.undefined)
    
    @scala.inline
    def `setTab-sizeVarargs`(value: TabSizeProperty[TLength]*): Self = StObject.set(x, "tab-size", js.Array(value :_*))
    
    @scala.inline
    def `setTable-layout`(value: TableLayoutProperty | js.Array[TableLayoutProperty]): Self = StObject.set(x, "table-layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTable-layoutUndefined`: Self = StObject.set(x, "table-layout", js.undefined)
    
    @scala.inline
    def `setTable-layoutVarargs`(value: TableLayoutProperty*): Self = StObject.set(x, "table-layout", js.Array(value :_*))
    
    @scala.inline
    def `setText-align`(value: TextAlignProperty | js.Array[TextAlignProperty]): Self = StObject.set(x, "text-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-align-last`(value: TextAlignLastProperty | js.Array[TextAlignLastProperty]): Self = StObject.set(x, "text-align-last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-align-lastUndefined`: Self = StObject.set(x, "text-align-last", js.undefined)
    
    @scala.inline
    def `setText-align-lastVarargs`(value: TextAlignLastProperty*): Self = StObject.set(x, "text-align-last", js.Array(value :_*))
    
    @scala.inline
    def `setText-alignUndefined`: Self = StObject.set(x, "text-align", js.undefined)
    
    @scala.inline
    def `setText-alignVarargs`(value: TextAlignProperty*): Self = StObject.set(x, "text-align", js.Array(value :_*))
    
    @scala.inline
    def `setText-combine-upright`(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): Self = StObject.set(x, "text-combine-upright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-combine-uprightUndefined`: Self = StObject.set(x, "text-combine-upright", js.undefined)
    
    @scala.inline
    def `setText-combine-uprightVarargs`(value: TextCombineUprightProperty*): Self = StObject.set(x, "text-combine-upright", js.Array(value :_*))
    
    @scala.inline
    def `setText-decoration-color`(value: TextDecorationColorProperty | js.Array[TextDecorationColorProperty]): Self = StObject.set(x, "text-decoration-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-decoration-colorUndefined`: Self = StObject.set(x, "text-decoration-color", js.undefined)
    
    @scala.inline
    def `setText-decoration-colorVarargs`(value: TextDecorationColorProperty*): Self = StObject.set(x, "text-decoration-color", js.Array(value :_*))
    
    @scala.inline
    def `setText-decoration-line`(value: TextDecorationLineProperty | js.Array[TextDecorationLineProperty]): Self = StObject.set(x, "text-decoration-line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-decoration-lineUndefined`: Self = StObject.set(x, "text-decoration-line", js.undefined)
    
    @scala.inline
    def `setText-decoration-lineVarargs`(value: TextDecorationLineProperty*): Self = StObject.set(x, "text-decoration-line", js.Array(value :_*))
    
    @scala.inline
    def `setText-decoration-skip`(value: TextDecorationSkipProperty | js.Array[TextDecorationSkipProperty]): Self = StObject.set(x, "text-decoration-skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-decoration-skip-ink`(value: TextDecorationSkipInkProperty | js.Array[TextDecorationSkipInkProperty]): Self = StObject.set(x, "text-decoration-skip-ink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-decoration-skip-inkUndefined`: Self = StObject.set(x, "text-decoration-skip-ink", js.undefined)
    
    @scala.inline
    def `setText-decoration-skip-inkVarargs`(value: TextDecorationSkipInkProperty*): Self = StObject.set(x, "text-decoration-skip-ink", js.Array(value :_*))
    
    @scala.inline
    def `setText-decoration-skipUndefined`: Self = StObject.set(x, "text-decoration-skip", js.undefined)
    
    @scala.inline
    def `setText-decoration-skipVarargs`(value: TextDecorationSkipProperty*): Self = StObject.set(x, "text-decoration-skip", js.Array(value :_*))
    
    @scala.inline
    def `setText-decoration-style`(value: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]): Self = StObject.set(x, "text-decoration-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-decoration-styleUndefined`: Self = StObject.set(x, "text-decoration-style", js.undefined)
    
    @scala.inline
    def `setText-decoration-styleVarargs`(value: TextDecorationStyleProperty*): Self = StObject.set(x, "text-decoration-style", js.Array(value :_*))
    
    @scala.inline
    def `setText-decoration-thickness`(
      value: TextDecorationThicknessProperty[TLength] | js.Array[TextDecorationThicknessProperty[TLength]]
    ): Self = StObject.set(x, "text-decoration-thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-decoration-thicknessUndefined`: Self = StObject.set(x, "text-decoration-thickness", js.undefined)
    
    @scala.inline
    def `setText-decoration-thicknessVarargs`(value: TextDecorationThicknessProperty[TLength]*): Self = StObject.set(x, "text-decoration-thickness", js.Array(value :_*))
    
    @scala.inline
    def `setText-decoration-width`(
      value: TextDecorationThicknessProperty[TLength] | js.Array[TextDecorationThicknessProperty[TLength]]
    ): Self = StObject.set(x, "text-decoration-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-decoration-widthUndefined`: Self = StObject.set(x, "text-decoration-width", js.undefined)
    
    @scala.inline
    def `setText-decoration-widthVarargs`(value: TextDecorationThicknessProperty[TLength]*): Self = StObject.set(x, "text-decoration-width", js.Array(value :_*))
    
    @scala.inline
    def `setText-emphasis-color`(value: TextEmphasisColorProperty | js.Array[TextEmphasisColorProperty]): Self = StObject.set(x, "text-emphasis-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-emphasis-colorUndefined`: Self = StObject.set(x, "text-emphasis-color", js.undefined)
    
    @scala.inline
    def `setText-emphasis-colorVarargs`(value: TextEmphasisColorProperty*): Self = StObject.set(x, "text-emphasis-color", js.Array(value :_*))
    
    @scala.inline
    def `setText-emphasis-position`(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "text-emphasis-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-emphasis-positionUndefined`: Self = StObject.set(x, "text-emphasis-position", js.undefined)
    
    @scala.inline
    def `setText-emphasis-positionVarargs`(value: GlobalsString*): Self = StObject.set(x, "text-emphasis-position", js.Array(value :_*))
    
    @scala.inline
    def `setText-emphasis-style`(value: TextEmphasisStyleProperty | js.Array[TextEmphasisStyleProperty]): Self = StObject.set(x, "text-emphasis-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-emphasis-styleUndefined`: Self = StObject.set(x, "text-emphasis-style", js.undefined)
    
    @scala.inline
    def `setText-emphasis-styleVarargs`(value: TextEmphasisStyleProperty*): Self = StObject.set(x, "text-emphasis-style", js.Array(value :_*))
    
    @scala.inline
    def `setText-indent`(value: TextIndentProperty[TLength] | js.Array[TextIndentProperty[TLength]]): Self = StObject.set(x, "text-indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-indentUndefined`: Self = StObject.set(x, "text-indent", js.undefined)
    
    @scala.inline
    def `setText-indentVarargs`(value: TextIndentProperty[TLength]*): Self = StObject.set(x, "text-indent", js.Array(value :_*))
    
    @scala.inline
    def `setText-justify`(value: TextJustifyProperty | js.Array[TextJustifyProperty]): Self = StObject.set(x, "text-justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-justifyUndefined`: Self = StObject.set(x, "text-justify", js.undefined)
    
    @scala.inline
    def `setText-justifyVarargs`(value: TextJustifyProperty*): Self = StObject.set(x, "text-justify", js.Array(value :_*))
    
    @scala.inline
    def `setText-orientation`(value: TextOrientationProperty | js.Array[TextOrientationProperty]): Self = StObject.set(x, "text-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-orientationUndefined`: Self = StObject.set(x, "text-orientation", js.undefined)
    
    @scala.inline
    def `setText-orientationVarargs`(value: TextOrientationProperty*): Self = StObject.set(x, "text-orientation", js.Array(value :_*))
    
    @scala.inline
    def `setText-overflow`(value: TextOverflowProperty | js.Array[TextOverflowProperty]): Self = StObject.set(x, "text-overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-overflowUndefined`: Self = StObject.set(x, "text-overflow", js.undefined)
    
    @scala.inline
    def `setText-overflowVarargs`(value: TextOverflowProperty*): Self = StObject.set(x, "text-overflow", js.Array(value :_*))
    
    @scala.inline
    def `setText-rendering`(value: TextRenderingProperty | js.Array[TextRenderingProperty]): Self = StObject.set(x, "text-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-renderingUndefined`: Self = StObject.set(x, "text-rendering", js.undefined)
    
    @scala.inline
    def `setText-renderingVarargs`(value: TextRenderingProperty*): Self = StObject.set(x, "text-rendering", js.Array(value :_*))
    
    @scala.inline
    def `setText-shadow`(value: TextShadowProperty | js.Array[TextShadowProperty]): Self = StObject.set(x, "text-shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-shadowUndefined`: Self = StObject.set(x, "text-shadow", js.undefined)
    
    @scala.inline
    def `setText-shadowVarargs`(value: TextShadowProperty*): Self = StObject.set(x, "text-shadow", js.Array(value :_*))
    
    @scala.inline
    def `setText-size-adjust`(value: TextSizeAdjustProperty | js.Array[TextSizeAdjustProperty]): Self = StObject.set(x, "text-size-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-size-adjustUndefined`: Self = StObject.set(x, "text-size-adjust", js.undefined)
    
    @scala.inline
    def `setText-size-adjustVarargs`(value: TextSizeAdjustProperty*): Self = StObject.set(x, "text-size-adjust", js.Array(value :_*))
    
    @scala.inline
    def `setText-transform`(value: TextTransformProperty | js.Array[TextTransformProperty]): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-transformUndefined`: Self = StObject.set(x, "text-transform", js.undefined)
    
    @scala.inline
    def `setText-transformVarargs`(value: TextTransformProperty*): Self = StObject.set(x, "text-transform", js.Array(value :_*))
    
    @scala.inline
    def `setText-underline-offset`(value: TextUnderlineOffsetProperty[TLength] | js.Array[TextUnderlineOffsetProperty[TLength]]): Self = StObject.set(x, "text-underline-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-underline-offsetUndefined`: Self = StObject.set(x, "text-underline-offset", js.undefined)
    
    @scala.inline
    def `setText-underline-offsetVarargs`(value: TextUnderlineOffsetProperty[TLength]*): Self = StObject.set(x, "text-underline-offset", js.Array(value :_*))
    
    @scala.inline
    def `setText-underline-position`(value: TextUnderlinePositionProperty | js.Array[TextUnderlinePositionProperty]): Self = StObject.set(x, "text-underline-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-underline-positionUndefined`: Self = StObject.set(x, "text-underline-position", js.undefined)
    
    @scala.inline
    def `setText-underline-positionVarargs`(value: TextUnderlinePositionProperty*): Self = StObject.set(x, "text-underline-position", js.Array(value :_*))
    
    @scala.inline
    def setTop(value: TopProperty[TLength] | js.Array[TopProperty[TLength]]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setTopVarargs(value: TopProperty[TLength]*): Self = StObject.set(x, "top", js.Array(value :_*))
    
    @scala.inline
    def `setTouch-action`(value: TouchActionProperty | js.Array[TouchActionProperty]): Self = StObject.set(x, "touch-action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTouch-actionUndefined`: Self = StObject.set(x, "touch-action", js.undefined)
    
    @scala.inline
    def `setTouch-actionVarargs`(value: TouchActionProperty*): Self = StObject.set(x, "touch-action", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: TransformProperty | js.Array[TransformProperty]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransform-box`(value: TransformBoxProperty | js.Array[TransformBoxProperty]): Self = StObject.set(x, "transform-box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransform-boxUndefined`: Self = StObject.set(x, "transform-box", js.undefined)
    
    @scala.inline
    def `setTransform-boxVarargs`(value: TransformBoxProperty*): Self = StObject.set(x, "transform-box", js.Array(value :_*))
    
    @scala.inline
    def `setTransform-origin`(value: TransformOriginProperty[TLength] | js.Array[TransformOriginProperty[TLength]]): Self = StObject.set(x, "transform-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransform-originUndefined`: Self = StObject.set(x, "transform-origin", js.undefined)
    
    @scala.inline
    def `setTransform-originVarargs`(value: TransformOriginProperty[TLength]*): Self = StObject.set(x, "transform-origin", js.Array(value :_*))
    
    @scala.inline
    def `setTransform-style`(value: TransformStyleProperty | js.Array[TransformStyleProperty]): Self = StObject.set(x, "transform-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransform-styleUndefined`: Self = StObject.set(x, "transform-style", js.undefined)
    
    @scala.inline
    def `setTransform-styleVarargs`(value: TransformStyleProperty*): Self = StObject.set(x, "transform-style", js.Array(value :_*))
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: TransformProperty*): Self = StObject.set(x, "transform", js.Array(value :_*))
    
    @scala.inline
    def `setTransition-delay`(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "transition-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-delayUndefined`: Self = StObject.set(x, "transition-delay", js.undefined)
    
    @scala.inline
    def `setTransition-delayVarargs`(value: GlobalsString*): Self = StObject.set(x, "transition-delay", js.Array(value :_*))
    
    @scala.inline
    def `setTransition-duration`(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "transition-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-durationUndefined`: Self = StObject.set(x, "transition-duration", js.undefined)
    
    @scala.inline
    def `setTransition-durationVarargs`(value: GlobalsString*): Self = StObject.set(x, "transition-duration", js.Array(value :_*))
    
    @scala.inline
    def `setTransition-property`(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): Self = StObject.set(x, "transition-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-propertyUndefined`: Self = StObject.set(x, "transition-property", js.undefined)
    
    @scala.inline
    def `setTransition-propertyVarargs`(value: TransitionPropertyProperty*): Self = StObject.set(x, "transition-property", js.Array(value :_*))
    
    @scala.inline
    def `setTransition-timing-function`(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): Self = StObject.set(x, "transition-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTransition-timing-functionUndefined`: Self = StObject.set(x, "transition-timing-function", js.undefined)
    
    @scala.inline
    def `setTransition-timing-functionVarargs`(value: TransitionTimingFunctionProperty*): Self = StObject.set(x, "transition-timing-function", js.Array(value :_*))
    
    @scala.inline
    def setTranslate(value: TranslateProperty[TLength] | js.Array[TranslateProperty[TLength]]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setTranslateVarargs(value: TranslateProperty[TLength]*): Self = StObject.set(x, "translate", js.Array(value :_*))
    
    @scala.inline
    def `setUnicode-bidi`(value: UnicodeBidiProperty | js.Array[UnicodeBidiProperty]): Self = StObject.set(x, "unicode-bidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnicode-bidiUndefined`: Self = StObject.set(x, "unicode-bidi", js.undefined)
    
    @scala.inline
    def `setUnicode-bidiVarargs`(value: UnicodeBidiProperty*): Self = StObject.set(x, "unicode-bidi", js.Array(value :_*))
    
    @scala.inline
    def `setUser-select`(value: UserSelectProperty | js.Array[UserSelectProperty]): Self = StObject.set(x, "user-select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUser-selectUndefined`: Self = StObject.set(x, "user-select", js.undefined)
    
    @scala.inline
    def `setUser-selectVarargs`(value: UserSelectProperty*): Self = StObject.set(x, "user-select", js.Array(value :_*))
    
    @scala.inline
    def `setVertical-align`(value: VerticalAlignProperty[TLength] | js.Array[VerticalAlignProperty[TLength]]): Self = StObject.set(x, "vertical-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVertical-alignUndefined`: Self = StObject.set(x, "vertical-align", js.undefined)
    
    @scala.inline
    def `setVertical-alignVarargs`(value: VerticalAlignProperty[TLength]*): Self = StObject.set(x, "vertical-align", js.Array(value :_*))
    
    @scala.inline
    def setVisibility(value: VisibilityProperty | js.Array[VisibilityProperty]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    @scala.inline
    def setVisibilityVarargs(value: VisibilityProperty*): Self = StObject.set(x, "visibility", js.Array(value :_*))
    
    @scala.inline
    def `setWhite-space`(value: WhiteSpaceProperty | js.Array[WhiteSpaceProperty]): Self = StObject.set(x, "white-space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWhite-spaceUndefined`: Self = StObject.set(x, "white-space", js.undefined)
    
    @scala.inline
    def `setWhite-spaceVarargs`(value: WhiteSpaceProperty*): Self = StObject.set(x, "white-space", js.Array(value :_*))
    
    @scala.inline
    def setWidows(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "widows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidowsUndefined: Self = StObject.set(x, "widows", js.undefined)
    
    @scala.inline
    def setWidowsVarargs(value: GlobalsNumber*): Self = StObject.set(x, "widows", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: WidthProperty[TLength] | js.Array[WidthProperty[TLength]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWidthVarargs(value: WidthProperty[TLength]*): Self = StObject.set(x, "width", js.Array(value :_*))
    
    @scala.inline
    def `setWill-change`(value: WillChangeProperty | js.Array[WillChangeProperty]): Self = StObject.set(x, "will-change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWill-changeUndefined`: Self = StObject.set(x, "will-change", js.undefined)
    
    @scala.inline
    def `setWill-changeVarargs`(value: WillChangeProperty*): Self = StObject.set(x, "will-change", js.Array(value :_*))
    
    @scala.inline
    def `setWord-break`(value: WordBreakProperty | js.Array[WordBreakProperty]): Self = StObject.set(x, "word-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWord-breakUndefined`: Self = StObject.set(x, "word-break", js.undefined)
    
    @scala.inline
    def `setWord-breakVarargs`(value: WordBreakProperty*): Self = StObject.set(x, "word-break", js.Array(value :_*))
    
    @scala.inline
    def `setWord-spacing`(value: WordSpacingProperty[TLength] | js.Array[WordSpacingProperty[TLength]]): Self = StObject.set(x, "word-spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWord-spacingUndefined`: Self = StObject.set(x, "word-spacing", js.undefined)
    
    @scala.inline
    def `setWord-spacingVarargs`(value: WordSpacingProperty[TLength]*): Self = StObject.set(x, "word-spacing", js.Array(value :_*))
    
    @scala.inline
    def `setWord-wrap`(value: WordWrapProperty | js.Array[WordWrapProperty]): Self = StObject.set(x, "word-wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWord-wrapUndefined`: Self = StObject.set(x, "word-wrap", js.undefined)
    
    @scala.inline
    def `setWord-wrapVarargs`(value: WordWrapProperty*): Self = StObject.set(x, "word-wrap", js.Array(value :_*))
    
    @scala.inline
    def `setWriting-mode`(value: WritingModeProperty | js.Array[WritingModeProperty]): Self = StObject.set(x, "writing-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWriting-modeUndefined`: Self = StObject.set(x, "writing-mode", js.undefined)
    
    @scala.inline
    def `setWriting-modeVarargs`(value: WritingModeProperty*): Self = StObject.set(x, "writing-mode", js.Array(value :_*))
    
    @scala.inline
    def `setZ-index`(value: ZIndexProperty | js.Array[ZIndexProperty]): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZ-indexUndefined`: Self = StObject.set(x, "z-index", js.undefined)
    
    @scala.inline
    def `setZ-indexVarargs`(value: ZIndexProperty*): Self = StObject.set(x, "z-index", js.Array(value :_*))
    
    @scala.inline
    def setZoom(value: ZoomProperty | js.Array[ZoomProperty]): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    @scala.inline
    def setZoomVarargs(value: ZoomProperty*): Self = StObject.set(x, "zoom", js.Array(value :_*))
  }
}
