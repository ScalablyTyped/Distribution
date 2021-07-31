package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardLonghandProperties[TLength] extends StObject {
  
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
  var alignContent: js.UndefOr[AlignContentProperty] = js.undefined
  
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
  var alignItems: js.UndefOr[AlignItemsProperty] = js.undefined
  
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
  var alignSelf: js.UndefOr[AlignSelfProperty] = js.undefined
  
  /**
    * The **`align-tracks`** CSS property sets the alignment in the masonry axis for grid containers that have masonry in their block axis.
    *
    * **Syntax**: `[ normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position> ]#`
    *
    * **Initial value**: `normal`
    */
  var alignTracks: js.UndefOr[AlignTracksProperty] = js.undefined
  
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
  var animationDelay: js.UndefOr[GlobalsString] = js.undefined
  
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
  var animationDirection: js.UndefOr[AnimationDirectionProperty] = js.undefined
  
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
  var animationDuration: js.UndefOr[GlobalsString] = js.undefined
  
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
  var animationFillMode: js.UndefOr[AnimationFillModeProperty] = js.undefined
  
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
  var animationIterationCount: js.UndefOr[AnimationIterationCountProperty] = js.undefined
  
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
  var animationName: js.UndefOr[AnimationNameProperty] = js.undefined
  
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
  var animationPlayState: js.UndefOr[AnimationPlayStateProperty] = js.undefined
  
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
  var animationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty] = js.undefined
  
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
  var appearance: js.UndefOr[AppearanceProperty] = js.undefined
  
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
  var aspectRatio: js.UndefOr[AspectRatioProperty] = js.undefined
  
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
  var backdropFilter: js.UndefOr[BackdropFilterProperty] = js.undefined
  
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
  var backfaceVisibility: js.UndefOr[BackfaceVisibilityProperty] = js.undefined
  
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
  var backgroundAttachment: js.UndefOr[BackgroundAttachmentProperty] = js.undefined
  
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
  var backgroundBlendMode: js.UndefOr[BackgroundBlendModeProperty] = js.undefined
  
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
  var backgroundClip: js.UndefOr[BackgroundClipProperty] = js.undefined
  
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
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.undefined
  
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
  var backgroundImage: js.UndefOr[BackgroundImageProperty] = js.undefined
  
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
  var backgroundOrigin: js.UndefOr[BackgroundOriginProperty] = js.undefined
  
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
  var backgroundPosition: js.UndefOr[BackgroundPositionProperty[TLength]] = js.undefined
  
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
  var backgroundPositionX: js.UndefOr[BackgroundPositionXProperty[TLength]] = js.undefined
  
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
  var backgroundPositionY: js.UndefOr[BackgroundPositionYProperty[TLength]] = js.undefined
  
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
  var backgroundRepeat: js.UndefOr[BackgroundRepeatProperty] = js.undefined
  
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
  var backgroundSize: js.UndefOr[BackgroundSizeProperty[TLength]] = js.undefined
  
  /**
    * **Syntax**: `clip | ellipsis | <string>`
    *
    * **Initial value**: `clip`
    */
  var blockOverflow: js.UndefOr[BlockOverflowProperty] = js.undefined
  
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
  var blockSize: js.UndefOr[BlockSizeProperty[TLength]] = js.undefined
  
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
  var borderBlockColor: js.UndefOr[BorderBlockColorProperty] = js.undefined
  
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
  var borderBlockEndColor: js.UndefOr[BorderBlockEndColorProperty] = js.undefined
  
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
  var borderBlockEndStyle: js.UndefOr[BorderBlockEndStyleProperty] = js.undefined
  
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
  var borderBlockEndWidth: js.UndefOr[BorderBlockEndWidthProperty[TLength]] = js.undefined
  
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
  var borderBlockStartColor: js.UndefOr[BorderBlockStartColorProperty] = js.undefined
  
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
  var borderBlockStartStyle: js.UndefOr[BorderBlockStartStyleProperty] = js.undefined
  
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
  var borderBlockStartWidth: js.UndefOr[BorderBlockStartWidthProperty[TLength]] = js.undefined
  
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
  var borderBlockStyle: js.UndefOr[BorderBlockStyleProperty] = js.undefined
  
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
  var borderBlockWidth: js.UndefOr[BorderBlockWidthProperty[TLength]] = js.undefined
  
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
  var borderBottomColor: js.UndefOr[BorderBottomColorProperty] = js.undefined
  
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
  var borderBottomLeftRadius: js.UndefOr[BorderBottomLeftRadiusProperty[TLength]] = js.undefined
  
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
  var borderBottomRightRadius: js.UndefOr[BorderBottomRightRadiusProperty[TLength]] = js.undefined
  
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
  var borderBottomStyle: js.UndefOr[BorderBottomStyleProperty] = js.undefined
  
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
  var borderBottomWidth: js.UndefOr[BorderBottomWidthProperty[TLength]] = js.undefined
  
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
  var borderCollapse: js.UndefOr[BorderCollapseProperty] = js.undefined
  
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
  var borderEndEndRadius: js.UndefOr[BorderEndEndRadiusProperty[TLength]] = js.undefined
  
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
  var borderEndStartRadius: js.UndefOr[BorderEndStartRadiusProperty[TLength]] = js.undefined
  
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
  var borderImageOutset: js.UndefOr[BorderImageOutsetProperty[TLength]] = js.undefined
  
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
  var borderImageRepeat: js.UndefOr[BorderImageRepeatProperty] = js.undefined
  
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
  var borderImageSlice: js.UndefOr[BorderImageSliceProperty] = js.undefined
  
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
  var borderImageSource: js.UndefOr[BorderImageSourceProperty] = js.undefined
  
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
  var borderImageWidth: js.UndefOr[BorderImageWidthProperty[TLength]] = js.undefined
  
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
  var borderInlineColor: js.UndefOr[BorderInlineColorProperty] = js.undefined
  
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
  var borderInlineEndColor: js.UndefOr[BorderInlineEndColorProperty] = js.undefined
  
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
  var borderInlineEndStyle: js.UndefOr[BorderInlineEndStyleProperty] = js.undefined
  
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
  var borderInlineEndWidth: js.UndefOr[BorderInlineEndWidthProperty[TLength]] = js.undefined
  
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
  var borderInlineStartColor: js.UndefOr[BorderInlineStartColorProperty] = js.undefined
  
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
  var borderInlineStartStyle: js.UndefOr[BorderInlineStartStyleProperty] = js.undefined
  
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
  var borderInlineStartWidth: js.UndefOr[BorderInlineStartWidthProperty[TLength]] = js.undefined
  
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
  var borderInlineStyle: js.UndefOr[BorderInlineStyleProperty] = js.undefined
  
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
  var borderInlineWidth: js.UndefOr[BorderInlineWidthProperty[TLength]] = js.undefined
  
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
  var borderLeftColor: js.UndefOr[BorderLeftColorProperty] = js.undefined
  
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
  var borderLeftStyle: js.UndefOr[BorderLeftStyleProperty] = js.undefined
  
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
  var borderLeftWidth: js.UndefOr[BorderLeftWidthProperty[TLength]] = js.undefined
  
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
  var borderRightColor: js.UndefOr[BorderRightColorProperty] = js.undefined
  
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
  var borderRightStyle: js.UndefOr[BorderRightStyleProperty] = js.undefined
  
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
  var borderRightWidth: js.UndefOr[BorderRightWidthProperty[TLength]] = js.undefined
  
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
  var borderSpacing: js.UndefOr[BorderSpacingProperty[TLength]] = js.undefined
  
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
  var borderStartEndRadius: js.UndefOr[BorderStartEndRadiusProperty[TLength]] = js.undefined
  
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
  var borderStartStartRadius: js.UndefOr[BorderStartStartRadiusProperty[TLength]] = js.undefined
  
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
  var borderTopColor: js.UndefOr[BorderTopColorProperty] = js.undefined
  
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
  var borderTopLeftRadius: js.UndefOr[BorderTopLeftRadiusProperty[TLength]] = js.undefined
  
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
  var borderTopRightRadius: js.UndefOr[BorderTopRightRadiusProperty[TLength]] = js.undefined
  
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
  var borderTopStyle: js.UndefOr[BorderTopStyleProperty] = js.undefined
  
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
  var borderTopWidth: js.UndefOr[BorderTopWidthProperty[TLength]] = js.undefined
  
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
  var bottom: js.UndefOr[BottomProperty[TLength]] = js.undefined
  
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
  var boxDecorationBreak: js.UndefOr[BoxDecorationBreakProperty] = js.undefined
  
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
  var boxShadow: js.UndefOr[BoxShadowProperty] = js.undefined
  
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
  var boxSizing: js.UndefOr[BoxSizingProperty] = js.undefined
  
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
  var breakAfter: js.UndefOr[BreakAfterProperty] = js.undefined
  
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
  var breakBefore: js.UndefOr[BreakBeforeProperty] = js.undefined
  
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
  var breakInside: js.UndefOr[BreakInsideProperty] = js.undefined
  
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
  var captionSide: js.UndefOr[CaptionSideProperty] = js.undefined
  
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
  var caretColor: js.UndefOr[CaretColorProperty] = js.undefined
  
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
  var clear: js.UndefOr[ClearProperty] = js.undefined
  
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
  var clipPath: js.UndefOr[ClipPathProperty] = js.undefined
  
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
  var color: js.UndefOr[ColorProperty] = js.undefined
  
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
  var colorAdjust: js.UndefOr[ColorAdjustProperty] = js.undefined
  
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
  var columnCount: js.UndefOr[ColumnCountProperty] = js.undefined
  
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
  var columnFill: js.UndefOr[ColumnFillProperty] = js.undefined
  
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
  var columnGap: js.UndefOr[ColumnGapProperty[TLength]] = js.undefined
  
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
  var columnRuleColor: js.UndefOr[ColumnRuleColorProperty] = js.undefined
  
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
  var columnRuleStyle: js.UndefOr[ColumnRuleStyleProperty] = js.undefined
  
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
  var columnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.undefined
  
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
  var columnSpan: js.UndefOr[ColumnSpanProperty] = js.undefined
  
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
  var columnWidth: js.UndefOr[ColumnWidthProperty[TLength]] = js.undefined
  
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
  var contain: js.UndefOr[ContainProperty] = js.undefined
  
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
  var content: js.UndefOr[ContentProperty] = js.undefined
  
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
  var counterIncrement: js.UndefOr[CounterIncrementProperty] = js.undefined
  
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
  var counterReset: js.UndefOr[CounterResetProperty] = js.undefined
  
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
  var counterSet: js.UndefOr[CounterSetProperty] = js.undefined
  
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
  var cursor: js.UndefOr[CursorProperty] = js.undefined
  
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
  var direction: js.UndefOr[DirectionProperty] = js.undefined
  
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
  var display: js.UndefOr[DisplayProperty] = js.undefined
  
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
  var emptyCells: js.UndefOr[EmptyCellsProperty] = js.undefined
  
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
  var filter: js.UndefOr[FilterProperty] = js.undefined
  
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
  var flexBasis: js.UndefOr[FlexBasisProperty[TLength]] = js.undefined
  
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
  var flexDirection: js.UndefOr[FlexDirectionProperty] = js.undefined
  
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
  var flexGrow: js.UndefOr[GlobalsNumber] = js.undefined
  
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
  var flexShrink: js.UndefOr[GlobalsNumber] = js.undefined
  
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
  var flexWrap: js.UndefOr[FlexWrapProperty] = js.undefined
  
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
  var float: js.UndefOr[FloatProperty] = js.undefined
  
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
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.undefined
  
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
  var fontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty] = js.undefined
  
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
  var fontKerning: js.UndefOr[FontKerningProperty] = js.undefined
  
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
  var fontLanguageOverride: js.UndefOr[FontLanguageOverrideProperty] = js.undefined
  
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
  var fontOpticalSizing: js.UndefOr[FontOpticalSizingProperty] = js.undefined
  
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
  var fontSize: js.UndefOr[FontSizeProperty[TLength]] = js.undefined
  
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
  var fontSizeAdjust: js.UndefOr[FontSizeAdjustProperty] = js.undefined
  
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
  var fontSmooth: js.UndefOr[FontSmoothProperty[TLength]] = js.undefined
  
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
  var fontStretch: js.UndefOr[FontStretchProperty] = js.undefined
  
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
  var fontStyle: js.UndefOr[FontStyleProperty] = js.undefined
  
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
  var fontSynthesis: js.UndefOr[FontSynthesisProperty] = js.undefined
  
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
  var fontVariant: js.UndefOr[FontVariantProperty] = js.undefined
  
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
  var fontVariantCaps: js.UndefOr[FontVariantCapsProperty] = js.undefined
  
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
  var fontVariantEastAsian: js.UndefOr[FontVariantEastAsianProperty] = js.undefined
  
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
  var fontVariantLigatures: js.UndefOr[FontVariantLigaturesProperty] = js.undefined
  
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
  var fontVariantNumeric: js.UndefOr[FontVariantNumericProperty] = js.undefined
  
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
  var fontVariantPosition: js.UndefOr[FontVariantPositionProperty] = js.undefined
  
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
  var fontVariationSettings: js.UndefOr[FontVariationSettingsProperty] = js.undefined
  
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
  var fontWeight: js.UndefOr[FontWeightProperty] = js.undefined
  
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
  var gridAutoColumns: js.UndefOr[GridAutoColumnsProperty[TLength]] = js.undefined
  
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
  var gridAutoFlow: js.UndefOr[GridAutoFlowProperty] = js.undefined
  
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
  var gridAutoRows: js.UndefOr[GridAutoRowsProperty[TLength]] = js.undefined
  
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
  var gridColumnEnd: js.UndefOr[GridColumnEndProperty] = js.undefined
  
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
  var gridColumnStart: js.UndefOr[GridColumnStartProperty] = js.undefined
  
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
  var gridRowEnd: js.UndefOr[GridRowEndProperty] = js.undefined
  
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
  var gridRowStart: js.UndefOr[GridRowStartProperty] = js.undefined
  
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
  var gridTemplateAreas: js.UndefOr[GridTemplateAreasProperty] = js.undefined
  
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
  var gridTemplateColumns: js.UndefOr[GridTemplateColumnsProperty[TLength]] = js.undefined
  
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
  var gridTemplateRows: js.UndefOr[GridTemplateRowsProperty[TLength]] = js.undefined
  
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
  var hangingPunctuation: js.UndefOr[HangingPunctuationProperty] = js.undefined
  
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
  var height: js.UndefOr[HeightProperty[TLength]] = js.undefined
  
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
  var hyphens: js.UndefOr[HyphensProperty] = js.undefined
  
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
  var imageOrientation: js.UndefOr[ImageOrientationProperty] = js.undefined
  
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
  var imageRendering: js.UndefOr[ImageRenderingProperty] = js.undefined
  
  /**
    * **Syntax**: `[ from-image || <resolution> ] && snap?`
    *
    * **Initial value**: `1dppx`
    */
  var imageResolution: js.UndefOr[ImageResolutionProperty] = js.undefined
  
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
  var initialLetter: js.UndefOr[InitialLetterProperty] = js.undefined
  
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
  var inlineSize: js.UndefOr[InlineSizeProperty[TLength]] = js.undefined
  
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
  var inset: js.UndefOr[InsetProperty[TLength]] = js.undefined
  
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
  var insetBlock: js.UndefOr[InsetBlockProperty[TLength]] = js.undefined
  
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
  var insetBlockEnd: js.UndefOr[InsetBlockEndProperty[TLength]] = js.undefined
  
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
  var insetBlockStart: js.UndefOr[InsetBlockStartProperty[TLength]] = js.undefined
  
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
  var insetInline: js.UndefOr[InsetInlineProperty[TLength]] = js.undefined
  
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
  var insetInlineEnd: js.UndefOr[InsetInlineEndProperty[TLength]] = js.undefined
  
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
  var insetInlineStart: js.UndefOr[InsetInlineStartProperty[TLength]] = js.undefined
  
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
  var isolation: js.UndefOr[IsolationProperty] = js.undefined
  
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
  var justifyContent: js.UndefOr[JustifyContentProperty] = js.undefined
  
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
  var justifyItems: js.UndefOr[JustifyItemsProperty] = js.undefined
  
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
  var justifySelf: js.UndefOr[JustifySelfProperty] = js.undefined
  
  /**
    * The **`justify-tracks`** CSS property sets the alignment in the masonry axis for grid containers that have masonry in their inline axis.
    *
    * **Syntax**: `[ normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ] ]#`
    *
    * **Initial value**: `normal`
    */
  var justifyTracks: js.UndefOr[JustifyTracksProperty] = js.undefined
  
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
  var left: js.UndefOr[LeftProperty[TLength]] = js.undefined
  
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
  var letterSpacing: js.UndefOr[LetterSpacingProperty[TLength]] = js.undefined
  
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
  var lineBreak: js.UndefOr[LineBreakProperty] = js.undefined
  
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
  var lineHeight: js.UndefOr[LineHeightProperty[TLength]] = js.undefined
  
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
  var lineHeightStep: js.UndefOr[LineHeightStepProperty[TLength]] = js.undefined
  
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
  var listStyleImage: js.UndefOr[ListStyleImageProperty] = js.undefined
  
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
  var listStylePosition: js.UndefOr[ListStylePositionProperty] = js.undefined
  
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
  var listStyleType: js.UndefOr[ListStyleTypeProperty] = js.undefined
  
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
  var marginBlock: js.UndefOr[MarginBlockProperty[TLength]] = js.undefined
  
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
  var marginBlockEnd: js.UndefOr[MarginBlockEndProperty[TLength]] = js.undefined
  
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
  var marginBlockStart: js.UndefOr[MarginBlockStartProperty[TLength]] = js.undefined
  
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
  var marginBottom: js.UndefOr[MarginBottomProperty[TLength]] = js.undefined
  
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
  var marginInline: js.UndefOr[MarginInlineProperty[TLength]] = js.undefined
  
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
  var marginInlineEnd: js.UndefOr[MarginInlineEndProperty[TLength]] = js.undefined
  
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
  var marginInlineStart: js.UndefOr[MarginInlineStartProperty[TLength]] = js.undefined
  
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
  var marginLeft: js.UndefOr[MarginLeftProperty[TLength]] = js.undefined
  
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
  var marginRight: js.UndefOr[MarginRightProperty[TLength]] = js.undefined
  
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
  var marginTop: js.UndefOr[MarginTopProperty[TLength]] = js.undefined
  
  /**
    * The **`mask-border-mode`** CSS property specifies the blending mode used in a mask border.
    *
    * **Syntax**: `luminance | alpha`
    *
    * **Initial value**: `alpha`
    */
  var maskBorderMode: js.UndefOr[MaskBorderModeProperty] = js.undefined
  
  /**
    * The **`mask-border-outset`** CSS property specifies the distance by which an element's mask border is set out from its border box.
    *
    * **Syntax**: `[ <length> | <number> ]{1,4}`
    *
    * **Initial value**: `0`
    */
  var maskBorderOutset: js.UndefOr[MaskBorderOutsetProperty[TLength]] = js.undefined
  
  /**
    * The **`mask-border-repeat`** CSS property sets how the edge regions of a source image are adjusted to fit the dimensions of an element's mask border.
    *
    * **Syntax**: `[ stretch | repeat | round | space ]{1,2}`
    *
    * **Initial value**: `stretch`
    */
  var maskBorderRepeat: js.UndefOr[MaskBorderRepeatProperty] = js.undefined
  
  /**
    * The **`mask-border-slice`** CSS property divides the image set by `mask-border-source` into regions. These regions are used to form the components of an element's mask border.
    *
    * **Syntax**: `<number-percentage>{1,4} fill?`
    *
    * **Initial value**: `0`
    */
  var maskBorderSlice: js.UndefOr[MaskBorderSliceProperty] = js.undefined
  
  /**
    * The **`mask-border-source`** CSS property sets the source image used to create an element's mask border.
    *
    * **Syntax**: `none | <image>`
    *
    * **Initial value**: `none`
    */
  var maskBorderSource: js.UndefOr[MaskBorderSourceProperty] = js.undefined
  
  /**
    * The **`mask-border-width`** CSS property sets the width of an element's mask border.
    *
    * **Syntax**: `[ <length-percentage> | <number> | auto ]{1,4}`
    *
    * **Initial value**: `auto`
    */
  var maskBorderWidth: js.UndefOr[MaskBorderWidthProperty[TLength]] = js.undefined
  
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
  var maskClip: js.UndefOr[MaskClipProperty] = js.undefined
  
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
  var maskComposite: js.UndefOr[MaskCompositeProperty] = js.undefined
  
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
  var maskImage: js.UndefOr[MaskImageProperty] = js.undefined
  
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
  var maskMode: js.UndefOr[MaskModeProperty] = js.undefined
  
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
  var maskOrigin: js.UndefOr[MaskOriginProperty] = js.undefined
  
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
  var maskPosition: js.UndefOr[MaskPositionProperty[TLength]] = js.undefined
  
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
  var maskRepeat: js.UndefOr[MaskRepeatProperty] = js.undefined
  
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
  var maskSize: js.UndefOr[MaskSizeProperty[TLength]] = js.undefined
  
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
  var maskType: js.UndefOr[MaskTypeProperty] = js.undefined
  
  /**
    * The **`masonry-auto-flow`** CSS property modifies how items are placed when using masonry in CSS Grid Layout.
    *
    * **Syntax**: `[ pack | next ] || [ definite-first | ordered ]`
    *
    * **Initial value**: `pack`
    */
  var masonryAutoFlow: js.UndefOr[MasonryAutoFlowProperty] = js.undefined
  
  /**
    * The `math-style` property indicates whether MathML equations should render with normal or compact height.
    *
    * **Syntax**: `normal | compact`
    *
    * **Initial value**: `normal`
    */
  var mathStyle: js.UndefOr[MathStyleProperty] = js.undefined
  
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
  var maxBlockSize: js.UndefOr[MaxBlockSizeProperty[TLength]] = js.undefined
  
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
  var maxHeight: js.UndefOr[MaxHeightProperty[TLength]] = js.undefined
  
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
  var maxInlineSize: js.UndefOr[MaxInlineSizeProperty[TLength]] = js.undefined
  
  /**
    * **Syntax**: `none | <integer>`
    *
    * **Initial value**: `none`
    */
  var maxLines: js.UndefOr[MaxLinesProperty] = js.undefined
  
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
  var maxWidth: js.UndefOr[MaxWidthProperty[TLength]] = js.undefined
  
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
  var minBlockSize: js.UndefOr[MinBlockSizeProperty[TLength]] = js.undefined
  
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
  var minHeight: js.UndefOr[MinHeightProperty[TLength]] = js.undefined
  
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
  var minInlineSize: js.UndefOr[MinInlineSizeProperty[TLength]] = js.undefined
  
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
  var minWidth: js.UndefOr[MinWidthProperty[TLength]] = js.undefined
  
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
  var mixBlendMode: js.UndefOr[MixBlendModeProperty] = js.undefined
  
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
  var motionDistance: js.UndefOr[OffsetDistanceProperty[TLength]] = js.undefined
  
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
  var motionPath: js.UndefOr[OffsetPathProperty] = js.undefined
  
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
  var motionRotation: js.UndefOr[OffsetRotateProperty] = js.undefined
  
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
  var objectFit: js.UndefOr[ObjectFitProperty] = js.undefined
  
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
  var objectPosition: js.UndefOr[ObjectPositionProperty[TLength]] = js.undefined
  
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
  var offsetAnchor: js.UndefOr[OffsetAnchorProperty[TLength]] = js.undefined
  
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
  var offsetDistance: js.UndefOr[OffsetDistanceProperty[TLength]] = js.undefined
  
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
  var offsetPath: js.UndefOr[OffsetPathProperty] = js.undefined
  
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
  var offsetRotate: js.UndefOr[OffsetRotateProperty] = js.undefined
  
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
  var offsetRotation: js.UndefOr[OffsetRotateProperty] = js.undefined
  
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
  var opacity: js.UndefOr[OpacityProperty] = js.undefined
  
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
  var order: js.UndefOr[GlobalsNumber] = js.undefined
  
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
  var orphans: js.UndefOr[GlobalsNumber] = js.undefined
  
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
  var outlineColor: js.UndefOr[OutlineColorProperty] = js.undefined
  
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
  var outlineOffset: js.UndefOr[OutlineOffsetProperty[TLength]] = js.undefined
  
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
  var outlineStyle: js.UndefOr[OutlineStyleProperty] = js.undefined
  
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
  var outlineWidth: js.UndefOr[OutlineWidthProperty[TLength]] = js.undefined
  
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
  var overflowAnchor: js.UndefOr[OverflowAnchorProperty] = js.undefined
  
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
  var overflowBlock: js.UndefOr[OverflowBlockProperty] = js.undefined
  
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
  var overflowClipBox: js.UndefOr[OverflowClipBoxProperty] = js.undefined
  
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
  var overflowInline: js.UndefOr[OverflowInlineProperty] = js.undefined
  
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
  var overflowWrap: js.UndefOr[OverflowWrapProperty] = js.undefined
  
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
  var overflowX: js.UndefOr[OverflowXProperty] = js.undefined
  
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
  var overflowY: js.UndefOr[OverflowYProperty] = js.undefined
  
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
  var overscrollBehavior: js.UndefOr[OverscrollBehaviorProperty] = js.undefined
  
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
  var overscrollBehaviorBlock: js.UndefOr[OverscrollBehaviorBlockProperty] = js.undefined
  
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
  var overscrollBehaviorInline: js.UndefOr[OverscrollBehaviorInlineProperty] = js.undefined
  
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
  var overscrollBehaviorX: js.UndefOr[OverscrollBehaviorXProperty] = js.undefined
  
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
  var overscrollBehaviorY: js.UndefOr[OverscrollBehaviorYProperty] = js.undefined
  
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
  var paddingBlock: js.UndefOr[PaddingBlockProperty[TLength]] = js.undefined
  
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
  var paddingBlockEnd: js.UndefOr[PaddingBlockEndProperty[TLength]] = js.undefined
  
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
  var paddingBlockStart: js.UndefOr[PaddingBlockStartProperty[TLength]] = js.undefined
  
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
  var paddingBottom: js.UndefOr[PaddingBottomProperty[TLength]] = js.undefined
  
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
  var paddingInline: js.UndefOr[PaddingInlineProperty[TLength]] = js.undefined
  
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
  var paddingInlineEnd: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.undefined
  
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
  var paddingInlineStart: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.undefined
  
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
  var paddingLeft: js.UndefOr[PaddingLeftProperty[TLength]] = js.undefined
  
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
  var paddingRight: js.UndefOr[PaddingRightProperty[TLength]] = js.undefined
  
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
  var paddingTop: js.UndefOr[PaddingTopProperty[TLength]] = js.undefined
  
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
  var pageBreakAfter: js.UndefOr[PageBreakAfterProperty] = js.undefined
  
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
  var pageBreakBefore: js.UndefOr[PageBreakBeforeProperty] = js.undefined
  
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
  var pageBreakInside: js.UndefOr[PageBreakInsideProperty] = js.undefined
  
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
  var paintOrder: js.UndefOr[PaintOrderProperty] = js.undefined
  
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
  var perspective: js.UndefOr[PerspectiveProperty[TLength]] = js.undefined
  
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
  var perspectiveOrigin: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.undefined
  
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
  var placeContent: js.UndefOr[PlaceContentProperty] = js.undefined
  
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
  var pointerEvents: js.UndefOr[PointerEventsProperty] = js.undefined
  
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
  var position: js.UndefOr[PositionProperty] = js.undefined
  
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
  var quotes: js.UndefOr[QuotesProperty] = js.undefined
  
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
  var resize: js.UndefOr[ResizeProperty] = js.undefined
  
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
  var right: js.UndefOr[RightProperty[TLength]] = js.undefined
  
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
  var rotate: js.UndefOr[RotateProperty] = js.undefined
  
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
  var rowGap: js.UndefOr[RowGapProperty[TLength]] = js.undefined
  
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
  var rubyAlign: js.UndefOr[RubyAlignProperty] = js.undefined
  
  /**
    * **Syntax**: `separate | collapse | auto`
    *
    * **Initial value**: `separate`
    */
  var rubyMerge: js.UndefOr[RubyMergeProperty] = js.undefined
  
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
  var rubyPosition: js.UndefOr[RubyPositionProperty] = js.undefined
  
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
  var scale: js.UndefOr[ScaleProperty] = js.undefined
  
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
  var scrollBehavior: js.UndefOr[ScrollBehaviorProperty] = js.undefined
  
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
  var scrollMargin: js.UndefOr[ScrollMarginProperty[TLength]] = js.undefined
  
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
  var scrollMarginBlock: js.UndefOr[ScrollMarginBlockProperty[TLength]] = js.undefined
  
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
  var scrollMarginBlockEnd: js.UndefOr[ScrollMarginBlockEndProperty[TLength]] = js.undefined
  
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
  var scrollMarginBlockStart: js.UndefOr[ScrollMarginBlockStartProperty[TLength]] = js.undefined
  
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
  var scrollMarginBottom: js.UndefOr[ScrollMarginBottomProperty[TLength]] = js.undefined
  
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
  var scrollMarginInline: js.UndefOr[ScrollMarginInlineProperty[TLength]] = js.undefined
  
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
  var scrollMarginInlineEnd: js.UndefOr[ScrollMarginInlineEndProperty[TLength]] = js.undefined
  
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
  var scrollMarginInlineStart: js.UndefOr[ScrollMarginInlineStartProperty[TLength]] = js.undefined
  
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
  var scrollMarginLeft: js.UndefOr[ScrollMarginLeftProperty[TLength]] = js.undefined
  
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
  var scrollMarginRight: js.UndefOr[ScrollMarginRightProperty[TLength]] = js.undefined
  
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
  var scrollMarginTop: js.UndefOr[ScrollMarginTopProperty[TLength]] = js.undefined
  
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
  var scrollPadding: js.UndefOr[ScrollPaddingProperty[TLength]] = js.undefined
  
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
  var scrollPaddingBlock: js.UndefOr[ScrollPaddingBlockProperty[TLength]] = js.undefined
  
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
  var scrollPaddingBlockEnd: js.UndefOr[ScrollPaddingBlockEndProperty[TLength]] = js.undefined
  
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
  var scrollPaddingBlockStart: js.UndefOr[ScrollPaddingBlockStartProperty[TLength]] = js.undefined
  
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
  var scrollPaddingBottom: js.UndefOr[ScrollPaddingBottomProperty[TLength]] = js.undefined
  
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
  var scrollPaddingInline: js.UndefOr[ScrollPaddingInlineProperty[TLength]] = js.undefined
  
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
  var scrollPaddingInlineEnd: js.UndefOr[ScrollPaddingInlineEndProperty[TLength]] = js.undefined
  
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
  var scrollPaddingInlineStart: js.UndefOr[ScrollPaddingInlineStartProperty[TLength]] = js.undefined
  
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
  var scrollPaddingLeft: js.UndefOr[ScrollPaddingLeftProperty[TLength]] = js.undefined
  
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
  var scrollPaddingRight: js.UndefOr[ScrollPaddingRightProperty[TLength]] = js.undefined
  
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
  var scrollPaddingTop: js.UndefOr[ScrollPaddingTopProperty[TLength]] = js.undefined
  
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
  var scrollSnapAlign: js.UndefOr[ScrollSnapAlignProperty] = js.undefined
  
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
  var scrollSnapMargin: js.UndefOr[ScrollMarginProperty[TLength]] = js.undefined
  
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
  var scrollSnapMarginBottom: js.UndefOr[ScrollMarginBottomProperty[TLength]] = js.undefined
  
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
  var scrollSnapMarginLeft: js.UndefOr[ScrollMarginLeftProperty[TLength]] = js.undefined
  
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
  var scrollSnapMarginRight: js.UndefOr[ScrollMarginRightProperty[TLength]] = js.undefined
  
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
  var scrollSnapMarginTop: js.UndefOr[ScrollMarginTopProperty[TLength]] = js.undefined
  
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
  var scrollSnapStop: js.UndefOr[ScrollSnapStopProperty] = js.undefined
  
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
  var scrollSnapType: js.UndefOr[ScrollSnapTypeProperty] = js.undefined
  
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
  var scrollbarColor: js.UndefOr[ScrollbarColorProperty] = js.undefined
  
  /**
    * The **`scrollbar-gutter`** CSS property allows authors to reserve space for the scrollbar, preventing unwanted layout changes as the content grows while also avoiding unnecessary visuals when scrolling isn't needed.
    *
    * **Syntax**: `auto | [ stable | always ] && both? && force?`
    *
    * **Initial value**: `auto`
    */
  var scrollbarGutter: js.UndefOr[ScrollbarGutterProperty] = js.undefined
  
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
  var scrollbarWidth: js.UndefOr[ScrollbarWidthProperty] = js.undefined
  
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
  var shapeImageThreshold: js.UndefOr[ShapeImageThresholdProperty] = js.undefined
  
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
  var shapeMargin: js.UndefOr[ShapeMarginProperty[TLength]] = js.undefined
  
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
  var shapeOutside: js.UndefOr[ShapeOutsideProperty] = js.undefined
  
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
  var tabSize: js.UndefOr[TabSizeProperty[TLength]] = js.undefined
  
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
  var tableLayout: js.UndefOr[TableLayoutProperty] = js.undefined
  
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
  var textAlign: js.UndefOr[TextAlignProperty] = js.undefined
  
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
  var textAlignLast: js.UndefOr[TextAlignLastProperty] = js.undefined
  
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
  var textCombineUpright: js.UndefOr[TextCombineUprightProperty] = js.undefined
  
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
  var textDecorationColor: js.UndefOr[TextDecorationColorProperty] = js.undefined
  
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
  var textDecorationLine: js.UndefOr[TextDecorationLineProperty] = js.undefined
  
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
  var textDecorationSkip: js.UndefOr[TextDecorationSkipProperty] = js.undefined
  
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
  var textDecorationSkipInk: js.UndefOr[TextDecorationSkipInkProperty] = js.undefined
  
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
  var textDecorationStyle: js.UndefOr[TextDecorationStyleProperty] = js.undefined
  
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
  var textDecorationThickness: js.UndefOr[TextDecorationThicknessProperty[TLength]] = js.undefined
  
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
  var textDecorationWidth: js.UndefOr[TextDecorationThicknessProperty[TLength]] = js.undefined
  
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
  var textEmphasisColor: js.UndefOr[TextEmphasisColorProperty] = js.undefined
  
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
  var textEmphasisPosition: js.UndefOr[GlobalsString] = js.undefined
  
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
  var textEmphasisStyle: js.UndefOr[TextEmphasisStyleProperty] = js.undefined
  
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
  var textIndent: js.UndefOr[TextIndentProperty[TLength]] = js.undefined
  
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
  var textJustify: js.UndefOr[TextJustifyProperty] = js.undefined
  
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
  var textOrientation: js.UndefOr[TextOrientationProperty] = js.undefined
  
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
  var textOverflow: js.UndefOr[TextOverflowProperty] = js.undefined
  
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
  var textRendering: js.UndefOr[TextRenderingProperty] = js.undefined
  
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
  var textShadow: js.UndefOr[TextShadowProperty] = js.undefined
  
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
  var textSizeAdjust: js.UndefOr[TextSizeAdjustProperty] = js.undefined
  
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
  var textTransform: js.UndefOr[TextTransformProperty] = js.undefined
  
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
  var textUnderlineOffset: js.UndefOr[TextUnderlineOffsetProperty[TLength]] = js.undefined
  
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
  var textUnderlinePosition: js.UndefOr[TextUnderlinePositionProperty] = js.undefined
  
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
  var top: js.UndefOr[TopProperty[TLength]] = js.undefined
  
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
  var touchAction: js.UndefOr[TouchActionProperty] = js.undefined
  
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
  var transform: js.UndefOr[TransformProperty] = js.undefined
  
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
  var transformBox: js.UndefOr[TransformBoxProperty] = js.undefined
  
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
  var transformOrigin: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  
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
  var transformStyle: js.UndefOr[TransformStyleProperty] = js.undefined
  
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
  var transitionDelay: js.UndefOr[GlobalsString] = js.undefined
  
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
  var transitionDuration: js.UndefOr[GlobalsString] = js.undefined
  
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
  var transitionProperty: js.UndefOr[TransitionPropertyProperty] = js.undefined
  
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
  var transitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  
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
  var translate: js.UndefOr[TranslateProperty[TLength]] = js.undefined
  
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
  var unicodeBidi: js.UndefOr[UnicodeBidiProperty] = js.undefined
  
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
  var userSelect: js.UndefOr[UserSelectProperty] = js.undefined
  
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
  var verticalAlign: js.UndefOr[VerticalAlignProperty[TLength]] = js.undefined
  
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
  var visibility: js.UndefOr[VisibilityProperty] = js.undefined
  
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
  var whiteSpace: js.UndefOr[WhiteSpaceProperty] = js.undefined
  
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
  var widows: js.UndefOr[GlobalsNumber] = js.undefined
  
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
  var width: js.UndefOr[WidthProperty[TLength]] = js.undefined
  
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
  var willChange: js.UndefOr[WillChangeProperty] = js.undefined
  
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
  var wordBreak: js.UndefOr[WordBreakProperty] = js.undefined
  
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
  var wordSpacing: js.UndefOr[WordSpacingProperty[TLength]] = js.undefined
  
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
  var wordWrap: js.UndefOr[WordWrapProperty] = js.undefined
  
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
  var writingMode: js.UndefOr[WritingModeProperty] = js.undefined
  
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
  var zIndex: js.UndefOr[ZIndexProperty] = js.undefined
  
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
  var zoom: js.UndefOr[ZoomProperty] = js.undefined
}
object StandardLonghandProperties {
  
  @scala.inline
  def apply[TLength](): StandardLonghandProperties[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardLonghandProperties[TLength]]
  }
  
  @scala.inline
  implicit class StandardLonghandPropertiesMutableBuilder[Self <: StandardLonghandProperties[?], TLength] (val x: Self & StandardLonghandProperties[TLength]) extends AnyVal {
    
    @scala.inline
    def setAlignContent(value: AlignContentProperty): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    @scala.inline
    def setAlignItems(value: AlignItemsProperty): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: AlignSelfProperty): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    @scala.inline
    def setAlignTracks(value: AlignTracksProperty): Self = StObject.set(x, "alignTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignTracksUndefined: Self = StObject.set(x, "alignTracks", js.undefined)
    
    @scala.inline
    def setAnimationDelay(value: GlobalsString): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
    
    @scala.inline
    def setAnimationDirection(value: AnimationDirectionProperty): Self = StObject.set(x, "animationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDirectionUndefined: Self = StObject.set(x, "animationDirection", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: GlobalsString): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationFillMode(value: AnimationFillModeProperty): Self = StObject.set(x, "animationFillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationFillModeUndefined: Self = StObject.set(x, "animationFillMode", js.undefined)
    
    @scala.inline
    def setAnimationIterationCount(value: AnimationIterationCountProperty): Self = StObject.set(x, "animationIterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationIterationCountUndefined: Self = StObject.set(x, "animationIterationCount", js.undefined)
    
    @scala.inline
    def setAnimationName(value: AnimationNameProperty): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationNameUndefined: Self = StObject.set(x, "animationName", js.undefined)
    
    @scala.inline
    def setAnimationPlayState(value: AnimationPlayStateProperty): Self = StObject.set(x, "animationPlayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationPlayStateUndefined: Self = StObject.set(x, "animationPlayState", js.undefined)
    
    @scala.inline
    def setAnimationTimingFunction(value: AnimationTimingFunctionProperty): Self = StObject.set(x, "animationTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationTimingFunctionUndefined: Self = StObject.set(x, "animationTimingFunction", js.undefined)
    
    @scala.inline
    def setAppearance(value: AppearanceProperty): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    @scala.inline
    def setAspectRatio(value: AspectRatioProperty): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setBackdropFilter(value: BackdropFilterProperty): Self = StObject.set(x, "backdropFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropFilterUndefined: Self = StObject.set(x, "backdropFilter", js.undefined)
    
    @scala.inline
    def setBackfaceVisibility(value: BackfaceVisibilityProperty): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
    
    @scala.inline
    def setBackgroundAttachment(value: BackgroundAttachmentProperty): Self = StObject.set(x, "backgroundAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundAttachmentUndefined: Self = StObject.set(x, "backgroundAttachment", js.undefined)
    
    @scala.inline
    def setBackgroundBlendMode(value: BackgroundBlendModeProperty): Self = StObject.set(x, "backgroundBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundBlendModeUndefined: Self = StObject.set(x, "backgroundBlendMode", js.undefined)
    
    @scala.inline
    def setBackgroundClip(value: BackgroundClipProperty): Self = StObject.set(x, "backgroundClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundClipUndefined: Self = StObject.set(x, "backgroundClip", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: BackgroundColorProperty): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundImage(value: BackgroundImageProperty): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    @scala.inline
    def setBackgroundOrigin(value: BackgroundOriginProperty): Self = StObject.set(x, "backgroundOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundOriginUndefined: Self = StObject.set(x, "backgroundOrigin", js.undefined)
    
    @scala.inline
    def setBackgroundPosition(value: BackgroundPositionProperty[TLength]): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    @scala.inline
    def setBackgroundPositionX(value: BackgroundPositionXProperty[TLength]): Self = StObject.set(x, "backgroundPositionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPositionXUndefined: Self = StObject.set(x, "backgroundPositionX", js.undefined)
    
    @scala.inline
    def setBackgroundPositionY(value: BackgroundPositionYProperty[TLength]): Self = StObject.set(x, "backgroundPositionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPositionYUndefined: Self = StObject.set(x, "backgroundPositionY", js.undefined)
    
    @scala.inline
    def setBackgroundRepeat(value: BackgroundRepeatProperty): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    @scala.inline
    def setBackgroundSize(value: BackgroundSizeProperty[TLength]): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
    
    @scala.inline
    def setBlockOverflow(value: BlockOverflowProperty): Self = StObject.set(x, "blockOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockOverflowUndefined: Self = StObject.set(x, "blockOverflow", js.undefined)
    
    @scala.inline
    def setBlockSize(value: BlockSizeProperty[TLength]): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
    
    @scala.inline
    def setBorderBlockColor(value: BorderBlockColorProperty): Self = StObject.set(x, "borderBlockColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBlockColorUndefined: Self = StObject.set(x, "borderBlockColor", js.undefined)
    
    @scala.inline
    def setBorderBlockEndColor(value: BorderBlockEndColorProperty): Self = StObject.set(x, "borderBlockEndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBlockEndColorUndefined: Self = StObject.set(x, "borderBlockEndColor", js.undefined)
    
    @scala.inline
    def setBorderBlockEndStyle(value: BorderBlockEndStyleProperty): Self = StObject.set(x, "borderBlockEndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBlockEndStyleUndefined: Self = StObject.set(x, "borderBlockEndStyle", js.undefined)
    
    @scala.inline
    def setBorderBlockEndWidth(value: BorderBlockEndWidthProperty[TLength]): Self = StObject.set(x, "borderBlockEndWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBlockEndWidthUndefined: Self = StObject.set(x, "borderBlockEndWidth", js.undefined)
    
    @scala.inline
    def setBorderBlockStartColor(value: BorderBlockStartColorProperty): Self = StObject.set(x, "borderBlockStartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBlockStartColorUndefined: Self = StObject.set(x, "borderBlockStartColor", js.undefined)
    
    @scala.inline
    def setBorderBlockStartStyle(value: BorderBlockStartStyleProperty): Self = StObject.set(x, "borderBlockStartStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBlockStartStyleUndefined: Self = StObject.set(x, "borderBlockStartStyle", js.undefined)
    
    @scala.inline
    def setBorderBlockStartWidth(value: BorderBlockStartWidthProperty[TLength]): Self = StObject.set(x, "borderBlockStartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBlockStartWidthUndefined: Self = StObject.set(x, "borderBlockStartWidth", js.undefined)
    
    @scala.inline
    def setBorderBlockStyle(value: BorderBlockStyleProperty): Self = StObject.set(x, "borderBlockStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBlockStyleUndefined: Self = StObject.set(x, "borderBlockStyle", js.undefined)
    
    @scala.inline
    def setBorderBlockWidth(value: BorderBlockWidthProperty[TLength]): Self = StObject.set(x, "borderBlockWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBlockWidthUndefined: Self = StObject.set(x, "borderBlockWidth", js.undefined)
    
    @scala.inline
    def setBorderBottomColor(value: BorderBottomColorProperty): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
    
    @scala.inline
    def setBorderBottomLeftRadius(value: BorderBottomLeftRadiusProperty[TLength]): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomRightRadius(value: BorderBottomRightRadiusProperty[TLength]): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
    
    @scala.inline
    def setBorderBottomStyle(value: BorderBottomStyleProperty): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomStyleUndefined: Self = StObject.set(x, "borderBottomStyle", js.undefined)
    
    @scala.inline
    def setBorderBottomWidth(value: BorderBottomWidthProperty[TLength]): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
    
    @scala.inline
    def setBorderCollapse(value: BorderCollapseProperty): Self = StObject.set(x, "borderCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderCollapseUndefined: Self = StObject.set(x, "borderCollapse", js.undefined)
    
    @scala.inline
    def setBorderEndEndRadius(value: BorderEndEndRadiusProperty[TLength]): Self = StObject.set(x, "borderEndEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderEndEndRadiusUndefined: Self = StObject.set(x, "borderEndEndRadius", js.undefined)
    
    @scala.inline
    def setBorderEndStartRadius(value: BorderEndStartRadiusProperty[TLength]): Self = StObject.set(x, "borderEndStartRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderEndStartRadiusUndefined: Self = StObject.set(x, "borderEndStartRadius", js.undefined)
    
    @scala.inline
    def setBorderImageOutset(value: BorderImageOutsetProperty[TLength]): Self = StObject.set(x, "borderImageOutset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderImageOutsetUndefined: Self = StObject.set(x, "borderImageOutset", js.undefined)
    
    @scala.inline
    def setBorderImageRepeat(value: BorderImageRepeatProperty): Self = StObject.set(x, "borderImageRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderImageRepeatUndefined: Self = StObject.set(x, "borderImageRepeat", js.undefined)
    
    @scala.inline
    def setBorderImageSlice(value: BorderImageSliceProperty): Self = StObject.set(x, "borderImageSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderImageSliceUndefined: Self = StObject.set(x, "borderImageSlice", js.undefined)
    
    @scala.inline
    def setBorderImageSource(value: BorderImageSourceProperty): Self = StObject.set(x, "borderImageSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderImageSourceUndefined: Self = StObject.set(x, "borderImageSource", js.undefined)
    
    @scala.inline
    def setBorderImageWidth(value: BorderImageWidthProperty[TLength]): Self = StObject.set(x, "borderImageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderImageWidthUndefined: Self = StObject.set(x, "borderImageWidth", js.undefined)
    
    @scala.inline
    def setBorderInlineColor(value: BorderInlineColorProperty): Self = StObject.set(x, "borderInlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderInlineColorUndefined: Self = StObject.set(x, "borderInlineColor", js.undefined)
    
    @scala.inline
    def setBorderInlineEndColor(value: BorderInlineEndColorProperty): Self = StObject.set(x, "borderInlineEndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderInlineEndColorUndefined: Self = StObject.set(x, "borderInlineEndColor", js.undefined)
    
    @scala.inline
    def setBorderInlineEndStyle(value: BorderInlineEndStyleProperty): Self = StObject.set(x, "borderInlineEndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderInlineEndStyleUndefined: Self = StObject.set(x, "borderInlineEndStyle", js.undefined)
    
    @scala.inline
    def setBorderInlineEndWidth(value: BorderInlineEndWidthProperty[TLength]): Self = StObject.set(x, "borderInlineEndWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderInlineEndWidthUndefined: Self = StObject.set(x, "borderInlineEndWidth", js.undefined)
    
    @scala.inline
    def setBorderInlineStartColor(value: BorderInlineStartColorProperty): Self = StObject.set(x, "borderInlineStartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderInlineStartColorUndefined: Self = StObject.set(x, "borderInlineStartColor", js.undefined)
    
    @scala.inline
    def setBorderInlineStartStyle(value: BorderInlineStartStyleProperty): Self = StObject.set(x, "borderInlineStartStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderInlineStartStyleUndefined: Self = StObject.set(x, "borderInlineStartStyle", js.undefined)
    
    @scala.inline
    def setBorderInlineStartWidth(value: BorderInlineStartWidthProperty[TLength]): Self = StObject.set(x, "borderInlineStartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderInlineStartWidthUndefined: Self = StObject.set(x, "borderInlineStartWidth", js.undefined)
    
    @scala.inline
    def setBorderInlineStyle(value: BorderInlineStyleProperty): Self = StObject.set(x, "borderInlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderInlineStyleUndefined: Self = StObject.set(x, "borderInlineStyle", js.undefined)
    
    @scala.inline
    def setBorderInlineWidth(value: BorderInlineWidthProperty[TLength]): Self = StObject.set(x, "borderInlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderInlineWidthUndefined: Self = StObject.set(x, "borderInlineWidth", js.undefined)
    
    @scala.inline
    def setBorderLeftColor(value: BorderLeftColorProperty): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
    
    @scala.inline
    def setBorderLeftStyle(value: BorderLeftStyleProperty): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftStyleUndefined: Self = StObject.set(x, "borderLeftStyle", js.undefined)
    
    @scala.inline
    def setBorderLeftWidth(value: BorderLeftWidthProperty[TLength]): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
    
    @scala.inline
    def setBorderRightColor(value: BorderRightColorProperty): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
    
    @scala.inline
    def setBorderRightStyle(value: BorderRightStyleProperty): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightStyleUndefined: Self = StObject.set(x, "borderRightStyle", js.undefined)
    
    @scala.inline
    def setBorderRightWidth(value: BorderRightWidthProperty[TLength]): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
    
    @scala.inline
    def setBorderSpacing(value: BorderSpacingProperty[TLength]): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderSpacingUndefined: Self = StObject.set(x, "borderSpacing", js.undefined)
    
    @scala.inline
    def setBorderStartEndRadius(value: BorderStartEndRadiusProperty[TLength]): Self = StObject.set(x, "borderStartEndRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStartEndRadiusUndefined: Self = StObject.set(x, "borderStartEndRadius", js.undefined)
    
    @scala.inline
    def setBorderStartStartRadius(value: BorderStartStartRadiusProperty[TLength]): Self = StObject.set(x, "borderStartStartRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStartStartRadiusUndefined: Self = StObject.set(x, "borderStartStartRadius", js.undefined)
    
    @scala.inline
    def setBorderTopColor(value: BorderTopColorProperty): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
    
    @scala.inline
    def setBorderTopLeftRadius(value: BorderTopLeftRadiusProperty[TLength]): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
    
    @scala.inline
    def setBorderTopRightRadius(value: BorderTopRightRadiusProperty[TLength]): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
    
    @scala.inline
    def setBorderTopStyle(value: BorderTopStyleProperty): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopStyleUndefined: Self = StObject.set(x, "borderTopStyle", js.undefined)
    
    @scala.inline
    def setBorderTopWidth(value: BorderTopWidthProperty[TLength]): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
    
    @scala.inline
    def setBottom(value: BottomProperty[TLength]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setBoxDecorationBreak(value: BoxDecorationBreakProperty): Self = StObject.set(x, "boxDecorationBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxDecorationBreakUndefined: Self = StObject.set(x, "boxDecorationBreak", js.undefined)
    
    @scala.inline
    def setBoxShadow(value: BoxShadowProperty): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
    
    @scala.inline
    def setBoxSizing(value: BoxSizingProperty): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxSizingUndefined: Self = StObject.set(x, "boxSizing", js.undefined)
    
    @scala.inline
    def setBreakAfter(value: BreakAfterProperty): Self = StObject.set(x, "breakAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakAfterUndefined: Self = StObject.set(x, "breakAfter", js.undefined)
    
    @scala.inline
    def setBreakBefore(value: BreakBeforeProperty): Self = StObject.set(x, "breakBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakBeforeUndefined: Self = StObject.set(x, "breakBefore", js.undefined)
    
    @scala.inline
    def setBreakInside(value: BreakInsideProperty): Self = StObject.set(x, "breakInside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakInsideUndefined: Self = StObject.set(x, "breakInside", js.undefined)
    
    @scala.inline
    def setCaptionSide(value: CaptionSideProperty): Self = StObject.set(x, "captionSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionSideUndefined: Self = StObject.set(x, "captionSide", js.undefined)
    
    @scala.inline
    def setCaretColor(value: CaretColorProperty): Self = StObject.set(x, "caretColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaretColorUndefined: Self = StObject.set(x, "caretColor", js.undefined)
    
    @scala.inline
    def setClear(value: ClearProperty): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setClipPath(value: ClipPathProperty): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    @scala.inline
    def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAdjust(value: ColorAdjustProperty): Self = StObject.set(x, "colorAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorAdjustUndefined: Self = StObject.set(x, "colorAdjust", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColumnCount(value: ColumnCountProperty): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    @scala.inline
    def setColumnFill(value: ColumnFillProperty): Self = StObject.set(x, "columnFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFillUndefined: Self = StObject.set(x, "columnFill", js.undefined)
    
    @scala.inline
    def setColumnGap(value: ColumnGapProperty[TLength]): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
    
    @scala.inline
    def setColumnRuleColor(value: ColumnRuleColorProperty): Self = StObject.set(x, "columnRuleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnRuleColorUndefined: Self = StObject.set(x, "columnRuleColor", js.undefined)
    
    @scala.inline
    def setColumnRuleStyle(value: ColumnRuleStyleProperty): Self = StObject.set(x, "columnRuleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnRuleStyleUndefined: Self = StObject.set(x, "columnRuleStyle", js.undefined)
    
    @scala.inline
    def setColumnRuleWidth(value: ColumnRuleWidthProperty[TLength]): Self = StObject.set(x, "columnRuleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnRuleWidthUndefined: Self = StObject.set(x, "columnRuleWidth", js.undefined)
    
    @scala.inline
    def setColumnSpan(value: ColumnSpanProperty): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: ColumnWidthProperty[TLength]): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    @scala.inline
    def setContain(value: ContainProperty): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
    
    @scala.inline
    def setContent(value: ContentProperty): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCounterIncrement(value: CounterIncrementProperty): Self = StObject.set(x, "counterIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterIncrementUndefined: Self = StObject.set(x, "counterIncrement", js.undefined)
    
    @scala.inline
    def setCounterReset(value: CounterResetProperty): Self = StObject.set(x, "counterReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterResetUndefined: Self = StObject.set(x, "counterReset", js.undefined)
    
    @scala.inline
    def setCounterSet(value: CounterSetProperty): Self = StObject.set(x, "counterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterSetUndefined: Self = StObject.set(x, "counterSet", js.undefined)
    
    @scala.inline
    def setCursor(value: CursorProperty): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDirection(value: DirectionProperty): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: DisplayProperty): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setEmptyCells(value: EmptyCellsProperty): Self = StObject.set(x, "emptyCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyCellsUndefined: Self = StObject.set(x, "emptyCells", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterProperty): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFlexBasis(value: FlexBasisProperty[TLength]): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    @scala.inline
    def setFlexDirection(value: FlexDirectionProperty): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
    
    @scala.inline
    def setFlexGrow(value: GlobalsNumber): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    @scala.inline
    def setFlexShrink(value: GlobalsNumber): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    @scala.inline
    def setFlexWrap(value: FlexWrapProperty): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
    
    @scala.inline
    def setFloat(value: FloatProperty): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
    
    @scala.inline
    def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontFeatureSettings(value: FontFeatureSettingsProperty): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
    
    @scala.inline
    def setFontKerning(value: FontKerningProperty): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontKerningUndefined: Self = StObject.set(x, "fontKerning", js.undefined)
    
    @scala.inline
    def setFontLanguageOverride(value: FontLanguageOverrideProperty): Self = StObject.set(x, "fontLanguageOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontLanguageOverrideUndefined: Self = StObject.set(x, "fontLanguageOverride", js.undefined)
    
    @scala.inline
    def setFontOpticalSizing(value: FontOpticalSizingProperty): Self = StObject.set(x, "fontOpticalSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontOpticalSizingUndefined: Self = StObject.set(x, "fontOpticalSizing", js.undefined)
    
    @scala.inline
    def setFontSize(value: FontSizeProperty[TLength]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjust(value: FontSizeAdjustProperty): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontSmooth(value: FontSmoothProperty[TLength]): Self = StObject.set(x, "fontSmooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSmoothUndefined: Self = StObject.set(x, "fontSmooth", js.undefined)
    
    @scala.inline
    def setFontStretch(value: FontStretchProperty): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyleProperty): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontSynthesis(value: FontSynthesisProperty): Self = StObject.set(x, "fontSynthesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSynthesisUndefined: Self = StObject.set(x, "fontSynthesis", js.undefined)
    
    @scala.inline
    def setFontVariant(value: FontVariantProperty): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantCaps(value: FontVariantCapsProperty): Self = StObject.set(x, "fontVariantCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantCapsUndefined: Self = StObject.set(x, "fontVariantCaps", js.undefined)
    
    @scala.inline
    def setFontVariantEastAsian(value: FontVariantEastAsianProperty): Self = StObject.set(x, "fontVariantEastAsian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantEastAsianUndefined: Self = StObject.set(x, "fontVariantEastAsian", js.undefined)
    
    @scala.inline
    def setFontVariantLigatures(value: FontVariantLigaturesProperty): Self = StObject.set(x, "fontVariantLigatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantLigaturesUndefined: Self = StObject.set(x, "fontVariantLigatures", js.undefined)
    
    @scala.inline
    def setFontVariantNumeric(value: FontVariantNumericProperty): Self = StObject.set(x, "fontVariantNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantNumericUndefined: Self = StObject.set(x, "fontVariantNumeric", js.undefined)
    
    @scala.inline
    def setFontVariantPosition(value: FontVariantPositionProperty): Self = StObject.set(x, "fontVariantPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantPositionUndefined: Self = StObject.set(x, "fontVariantPosition", js.undefined)
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    @scala.inline
    def setFontVariationSettings(value: FontVariationSettingsProperty): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeightProperty): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setGridAutoColumns(value: GridAutoColumnsProperty[TLength]): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
    
    @scala.inline
    def setGridAutoFlow(value: GridAutoFlowProperty): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
    
    @scala.inline
    def setGridAutoRows(value: GridAutoRowsProperty[TLength]): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
    
    @scala.inline
    def setGridColumnEnd(value: GridColumnEndProperty): Self = StObject.set(x, "gridColumnEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColumnEndUndefined: Self = StObject.set(x, "gridColumnEnd", js.undefined)
    
    @scala.inline
    def setGridColumnStart(value: GridColumnStartProperty): Self = StObject.set(x, "gridColumnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColumnStartUndefined: Self = StObject.set(x, "gridColumnStart", js.undefined)
    
    @scala.inline
    def setGridRowEnd(value: GridRowEndProperty): Self = StObject.set(x, "gridRowEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridRowEndUndefined: Self = StObject.set(x, "gridRowEnd", js.undefined)
    
    @scala.inline
    def setGridRowStart(value: GridRowStartProperty): Self = StObject.set(x, "gridRowStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridRowStartUndefined: Self = StObject.set(x, "gridRowStart", js.undefined)
    
    @scala.inline
    def setGridTemplateAreas(value: GridTemplateAreasProperty): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
    
    @scala.inline
    def setGridTemplateColumns(value: GridTemplateColumnsProperty[TLength]): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
    
    @scala.inline
    def setGridTemplateRows(value: GridTemplateRowsProperty[TLength]): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
    
    @scala.inline
    def setHangingPunctuation(value: HangingPunctuationProperty): Self = StObject.set(x, "hangingPunctuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangingPunctuationUndefined: Self = StObject.set(x, "hangingPunctuation", js.undefined)
    
    @scala.inline
    def setHeight(value: HeightProperty[TLength]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHyphens(value: HyphensProperty): Self = StObject.set(x, "hyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyphensUndefined: Self = StObject.set(x, "hyphens", js.undefined)
    
    @scala.inline
    def setImageOrientation(value: ImageOrientationProperty): Self = StObject.set(x, "imageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOrientationUndefined: Self = StObject.set(x, "imageOrientation", js.undefined)
    
    @scala.inline
    def setImageRendering(value: ImageRenderingProperty): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
    
    @scala.inline
    def setImageResolution(value: ImageResolutionProperty): Self = StObject.set(x, "imageResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageResolutionUndefined: Self = StObject.set(x, "imageResolution", js.undefined)
    
    @scala.inline
    def setInitialLetter(value: InitialLetterProperty): Self = StObject.set(x, "initialLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialLetterUndefined: Self = StObject.set(x, "initialLetter", js.undefined)
    
    @scala.inline
    def setInlineSize(value: InlineSizeProperty[TLength]): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
    
    @scala.inline
    def setInset(value: InsetProperty[TLength]): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetBlock(value: InsetBlockProperty[TLength]): Self = StObject.set(x, "insetBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetBlockEnd(value: InsetBlockEndProperty[TLength]): Self = StObject.set(x, "insetBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetBlockEndUndefined: Self = StObject.set(x, "insetBlockEnd", js.undefined)
    
    @scala.inline
    def setInsetBlockStart(value: InsetBlockStartProperty[TLength]): Self = StObject.set(x, "insetBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetBlockStartUndefined: Self = StObject.set(x, "insetBlockStart", js.undefined)
    
    @scala.inline
    def setInsetBlockUndefined: Self = StObject.set(x, "insetBlock", js.undefined)
    
    @scala.inline
    def setInsetInline(value: InsetInlineProperty[TLength]): Self = StObject.set(x, "insetInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetInlineEnd(value: InsetInlineEndProperty[TLength]): Self = StObject.set(x, "insetInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetInlineEndUndefined: Self = StObject.set(x, "insetInlineEnd", js.undefined)
    
    @scala.inline
    def setInsetInlineStart(value: InsetInlineStartProperty[TLength]): Self = StObject.set(x, "insetInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetInlineStartUndefined: Self = StObject.set(x, "insetInlineStart", js.undefined)
    
    @scala.inline
    def setInsetInlineUndefined: Self = StObject.set(x, "insetInline", js.undefined)
    
    @scala.inline
    def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    @scala.inline
    def setIsolation(value: IsolationProperty): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolationUndefined: Self = StObject.set(x, "isolation", js.undefined)
    
    @scala.inline
    def setJustifyContent(value: JustifyContentProperty): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    @scala.inline
    def setJustifyItems(value: JustifyItemsProperty): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
    
    @scala.inline
    def setJustifySelf(value: JustifySelfProperty): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
    
    @scala.inline
    def setJustifyTracks(value: JustifyTracksProperty): Self = StObject.set(x, "justifyTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyTracksUndefined: Self = StObject.set(x, "justifyTracks", js.undefined)
    
    @scala.inline
    def setLeft(value: LeftProperty[TLength]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: LetterSpacingProperty[TLength]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setLineBreak(value: LineBreakProperty): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
    
    @scala.inline
    def setLineHeight(value: LineHeightProperty[TLength]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightStep(value: LineHeightStepProperty[TLength]): Self = StObject.set(x, "lineHeightStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightStepUndefined: Self = StObject.set(x, "lineHeightStep", js.undefined)
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setListStyleImage(value: ListStyleImageProperty): Self = StObject.set(x, "listStyleImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStyleImageUndefined: Self = StObject.set(x, "listStyleImage", js.undefined)
    
    @scala.inline
    def setListStylePosition(value: ListStylePositionProperty): Self = StObject.set(x, "listStylePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStylePositionUndefined: Self = StObject.set(x, "listStylePosition", js.undefined)
    
    @scala.inline
    def setListStyleType(value: ListStyleTypeProperty): Self = StObject.set(x, "listStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListStyleTypeUndefined: Self = StObject.set(x, "listStyleType", js.undefined)
    
    @scala.inline
    def setMarginBlock(value: MarginBlockProperty[TLength]): Self = StObject.set(x, "marginBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBlockEnd(value: MarginBlockEndProperty[TLength]): Self = StObject.set(x, "marginBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBlockEndUndefined: Self = StObject.set(x, "marginBlockEnd", js.undefined)
    
    @scala.inline
    def setMarginBlockStart(value: MarginBlockStartProperty[TLength]): Self = StObject.set(x, "marginBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBlockStartUndefined: Self = StObject.set(x, "marginBlockStart", js.undefined)
    
    @scala.inline
    def setMarginBlockUndefined: Self = StObject.set(x, "marginBlock", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: MarginBottomProperty[TLength]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginInline(value: MarginInlineProperty[TLength]): Self = StObject.set(x, "marginInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginInlineEnd(value: MarginInlineEndProperty[TLength]): Self = StObject.set(x, "marginInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginInlineEndUndefined: Self = StObject.set(x, "marginInlineEnd", js.undefined)
    
    @scala.inline
    def setMarginInlineStart(value: MarginInlineStartProperty[TLength]): Self = StObject.set(x, "marginInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginInlineStartUndefined: Self = StObject.set(x, "marginInlineStart", js.undefined)
    
    @scala.inline
    def setMarginInlineUndefined: Self = StObject.set(x, "marginInline", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: MarginLeftProperty[TLength]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: MarginRightProperty[TLength]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: MarginTopProperty[TLength]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setMaskBorderMode(value: MaskBorderModeProperty): Self = StObject.set(x, "maskBorderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskBorderModeUndefined: Self = StObject.set(x, "maskBorderMode", js.undefined)
    
    @scala.inline
    def setMaskBorderOutset(value: MaskBorderOutsetProperty[TLength]): Self = StObject.set(x, "maskBorderOutset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskBorderOutsetUndefined: Self = StObject.set(x, "maskBorderOutset", js.undefined)
    
    @scala.inline
    def setMaskBorderRepeat(value: MaskBorderRepeatProperty): Self = StObject.set(x, "maskBorderRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskBorderRepeatUndefined: Self = StObject.set(x, "maskBorderRepeat", js.undefined)
    
    @scala.inline
    def setMaskBorderSlice(value: MaskBorderSliceProperty): Self = StObject.set(x, "maskBorderSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskBorderSliceUndefined: Self = StObject.set(x, "maskBorderSlice", js.undefined)
    
    @scala.inline
    def setMaskBorderSource(value: MaskBorderSourceProperty): Self = StObject.set(x, "maskBorderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskBorderSourceUndefined: Self = StObject.set(x, "maskBorderSource", js.undefined)
    
    @scala.inline
    def setMaskBorderWidth(value: MaskBorderWidthProperty[TLength]): Self = StObject.set(x, "maskBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskBorderWidthUndefined: Self = StObject.set(x, "maskBorderWidth", js.undefined)
    
    @scala.inline
    def setMaskClip(value: MaskClipProperty): Self = StObject.set(x, "maskClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskClipUndefined: Self = StObject.set(x, "maskClip", js.undefined)
    
    @scala.inline
    def setMaskComposite(value: MaskCompositeProperty): Self = StObject.set(x, "maskComposite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskCompositeUndefined: Self = StObject.set(x, "maskComposite", js.undefined)
    
    @scala.inline
    def setMaskImage(value: MaskImageProperty): Self = StObject.set(x, "maskImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskImageUndefined: Self = StObject.set(x, "maskImage", js.undefined)
    
    @scala.inline
    def setMaskMode(value: MaskModeProperty): Self = StObject.set(x, "maskMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskModeUndefined: Self = StObject.set(x, "maskMode", js.undefined)
    
    @scala.inline
    def setMaskOrigin(value: MaskOriginProperty): Self = StObject.set(x, "maskOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskOriginUndefined: Self = StObject.set(x, "maskOrigin", js.undefined)
    
    @scala.inline
    def setMaskPosition(value: MaskPositionProperty[TLength]): Self = StObject.set(x, "maskPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskPositionUndefined: Self = StObject.set(x, "maskPosition", js.undefined)
    
    @scala.inline
    def setMaskRepeat(value: MaskRepeatProperty): Self = StObject.set(x, "maskRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskRepeatUndefined: Self = StObject.set(x, "maskRepeat", js.undefined)
    
    @scala.inline
    def setMaskSize(value: MaskSizeProperty[TLength]): Self = StObject.set(x, "maskSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskSizeUndefined: Self = StObject.set(x, "maskSize", js.undefined)
    
    @scala.inline
    def setMaskType(value: MaskTypeProperty): Self = StObject.set(x, "maskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskTypeUndefined: Self = StObject.set(x, "maskType", js.undefined)
    
    @scala.inline
    def setMasonryAutoFlow(value: MasonryAutoFlowProperty): Self = StObject.set(x, "masonryAutoFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasonryAutoFlowUndefined: Self = StObject.set(x, "masonryAutoFlow", js.undefined)
    
    @scala.inline
    def setMathStyle(value: MathStyleProperty): Self = StObject.set(x, "mathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMathStyleUndefined: Self = StObject.set(x, "mathStyle", js.undefined)
    
    @scala.inline
    def setMaxBlockSize(value: MaxBlockSizeProperty[TLength]): Self = StObject.set(x, "maxBlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBlockSizeUndefined: Self = StObject.set(x, "maxBlockSize", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: MaxHeightProperty[TLength]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxInlineSize(value: MaxInlineSizeProperty[TLength]): Self = StObject.set(x, "maxInlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInlineSizeUndefined: Self = StObject.set(x, "maxInlineSize", js.undefined)
    
    @scala.inline
    def setMaxLines(value: MaxLinesProperty): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: MaxWidthProperty[TLength]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinBlockSize(value: MinBlockSizeProperty[TLength]): Self = StObject.set(x, "minBlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBlockSizeUndefined: Self = StObject.set(x, "minBlockSize", js.undefined)
    
    @scala.inline
    def setMinHeight(value: MinHeightProperty[TLength]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinInlineSize(value: MinInlineSizeProperty[TLength]): Self = StObject.set(x, "minInlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinInlineSizeUndefined: Self = StObject.set(x, "minInlineSize", js.undefined)
    
    @scala.inline
    def setMinWidth(value: MinWidthProperty[TLength]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setMixBlendMode(value: MixBlendModeProperty): Self = StObject.set(x, "mixBlendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixBlendModeUndefined: Self = StObject.set(x, "mixBlendMode", js.undefined)
    
    @scala.inline
    def setMotionDistance(value: OffsetDistanceProperty[TLength]): Self = StObject.set(x, "motionDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionDistanceUndefined: Self = StObject.set(x, "motionDistance", js.undefined)
    
    @scala.inline
    def setMotionPath(value: OffsetPathProperty): Self = StObject.set(x, "motionPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionPathUndefined: Self = StObject.set(x, "motionPath", js.undefined)
    
    @scala.inline
    def setMotionRotation(value: OffsetRotateProperty): Self = StObject.set(x, "motionRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionRotationUndefined: Self = StObject.set(x, "motionRotation", js.undefined)
    
    @scala.inline
    def setObjectFit(value: ObjectFitProperty): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
    
    @scala.inline
    def setObjectPosition(value: ObjectPositionProperty[TLength]): Self = StObject.set(x, "objectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectPositionUndefined: Self = StObject.set(x, "objectPosition", js.undefined)
    
    @scala.inline
    def setOffsetAnchor(value: OffsetAnchorProperty[TLength]): Self = StObject.set(x, "offsetAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetAnchorUndefined: Self = StObject.set(x, "offsetAnchor", js.undefined)
    
    @scala.inline
    def setOffsetDistance(value: OffsetDistanceProperty[TLength]): Self = StObject.set(x, "offsetDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetDistanceUndefined: Self = StObject.set(x, "offsetDistance", js.undefined)
    
    @scala.inline
    def setOffsetPath(value: OffsetPathProperty): Self = StObject.set(x, "offsetPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetPathUndefined: Self = StObject.set(x, "offsetPath", js.undefined)
    
    @scala.inline
    def setOffsetRotate(value: OffsetRotateProperty): Self = StObject.set(x, "offsetRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRotateUndefined: Self = StObject.set(x, "offsetRotate", js.undefined)
    
    @scala.inline
    def setOffsetRotation(value: OffsetRotateProperty): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRotationUndefined: Self = StObject.set(x, "offsetRotation", js.undefined)
    
    @scala.inline
    def setOpacity(value: OpacityProperty): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOrder(value: GlobalsNumber): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrphans(value: GlobalsNumber): Self = StObject.set(x, "orphans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrphansUndefined: Self = StObject.set(x, "orphans", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: OutlineColorProperty): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineOffset(value: OutlineOffsetProperty[TLength]): Self = StObject.set(x, "outlineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineOffsetUndefined: Self = StObject.set(x, "outlineOffset", js.undefined)
    
    @scala.inline
    def setOutlineStyle(value: OutlineStyleProperty): Self = StObject.set(x, "outlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineStyleUndefined: Self = StObject.set(x, "outlineStyle", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: OutlineWidthProperty[TLength]): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
    
    @scala.inline
    def setOverflowAnchor(value: OverflowAnchorProperty): Self = StObject.set(x, "overflowAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowAnchorUndefined: Self = StObject.set(x, "overflowAnchor", js.undefined)
    
    @scala.inline
    def setOverflowBlock(value: OverflowBlockProperty): Self = StObject.set(x, "overflowBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowBlockUndefined: Self = StObject.set(x, "overflowBlock", js.undefined)
    
    @scala.inline
    def setOverflowClipBox(value: OverflowClipBoxProperty): Self = StObject.set(x, "overflowClipBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowClipBoxUndefined: Self = StObject.set(x, "overflowClipBox", js.undefined)
    
    @scala.inline
    def setOverflowInline(value: OverflowInlineProperty): Self = StObject.set(x, "overflowInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowInlineUndefined: Self = StObject.set(x, "overflowInline", js.undefined)
    
    @scala.inline
    def setOverflowWrap(value: OverflowWrapProperty): Self = StObject.set(x, "overflowWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowWrapUndefined: Self = StObject.set(x, "overflowWrap", js.undefined)
    
    @scala.inline
    def setOverflowX(value: OverflowXProperty): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
    
    @scala.inline
    def setOverflowY(value: OverflowYProperty): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
    
    @scala.inline
    def setOverscrollBehavior(value: OverscrollBehaviorProperty): Self = StObject.set(x, "overscrollBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscrollBehaviorBlock(value: OverscrollBehaviorBlockProperty): Self = StObject.set(x, "overscrollBehaviorBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscrollBehaviorBlockUndefined: Self = StObject.set(x, "overscrollBehaviorBlock", js.undefined)
    
    @scala.inline
    def setOverscrollBehaviorInline(value: OverscrollBehaviorInlineProperty): Self = StObject.set(x, "overscrollBehaviorInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscrollBehaviorInlineUndefined: Self = StObject.set(x, "overscrollBehaviorInline", js.undefined)
    
    @scala.inline
    def setOverscrollBehaviorUndefined: Self = StObject.set(x, "overscrollBehavior", js.undefined)
    
    @scala.inline
    def setOverscrollBehaviorX(value: OverscrollBehaviorXProperty): Self = StObject.set(x, "overscrollBehaviorX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscrollBehaviorXUndefined: Self = StObject.set(x, "overscrollBehaviorX", js.undefined)
    
    @scala.inline
    def setOverscrollBehaviorY(value: OverscrollBehaviorYProperty): Self = StObject.set(x, "overscrollBehaviorY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscrollBehaviorYUndefined: Self = StObject.set(x, "overscrollBehaviorY", js.undefined)
    
    @scala.inline
    def setPaddingBlock(value: PaddingBlockProperty[TLength]): Self = StObject.set(x, "paddingBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBlockEnd(value: PaddingBlockEndProperty[TLength]): Self = StObject.set(x, "paddingBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBlockEndUndefined: Self = StObject.set(x, "paddingBlockEnd", js.undefined)
    
    @scala.inline
    def setPaddingBlockStart(value: PaddingBlockStartProperty[TLength]): Self = StObject.set(x, "paddingBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBlockStartUndefined: Self = StObject.set(x, "paddingBlockStart", js.undefined)
    
    @scala.inline
    def setPaddingBlockUndefined: Self = StObject.set(x, "paddingBlock", js.undefined)
    
    @scala.inline
    def setPaddingBottom(value: PaddingBottomProperty[TLength]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingInline(value: PaddingInlineProperty[TLength]): Self = StObject.set(x, "paddingInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingInlineEnd(value: PaddingInlineEndProperty[TLength]): Self = StObject.set(x, "paddingInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingInlineEndUndefined: Self = StObject.set(x, "paddingInlineEnd", js.undefined)
    
    @scala.inline
    def setPaddingInlineStart(value: PaddingInlineStartProperty[TLength]): Self = StObject.set(x, "paddingInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingInlineStartUndefined: Self = StObject.set(x, "paddingInlineStart", js.undefined)
    
    @scala.inline
    def setPaddingInlineUndefined: Self = StObject.set(x, "paddingInline", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: PaddingLeftProperty[TLength]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: PaddingRightProperty[TLength]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingTop(value: PaddingTopProperty[TLength]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    @scala.inline
    def setPageBreakAfter(value: PageBreakAfterProperty): Self = StObject.set(x, "pageBreakAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBreakAfterUndefined: Self = StObject.set(x, "pageBreakAfter", js.undefined)
    
    @scala.inline
    def setPageBreakBefore(value: PageBreakBeforeProperty): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
    
    @scala.inline
    def setPageBreakInside(value: PageBreakInsideProperty): Self = StObject.set(x, "pageBreakInside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBreakInsideUndefined: Self = StObject.set(x, "pageBreakInside", js.undefined)
    
    @scala.inline
    def setPaintOrder(value: PaintOrderProperty): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
    
    @scala.inline
    def setPerspective(value: PerspectiveProperty[TLength]): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerspectiveOrigin(value: PerspectiveOriginProperty[TLength]): Self = StObject.set(x, "perspectiveOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerspectiveOriginUndefined: Self = StObject.set(x, "perspectiveOrigin", js.undefined)
    
    @scala.inline
    def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
    
    @scala.inline
    def setPlaceContent(value: PlaceContentProperty): Self = StObject.set(x, "placeContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceContentUndefined: Self = StObject.set(x, "placeContent", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: PointerEventsProperty): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionProperty): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setQuotes(value: QuotesProperty): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
    
    @scala.inline
    def setResize(value: ResizeProperty): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setRight(value: RightProperty[TLength]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setRotate(value: RotateProperty): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setRowGap(value: RowGapProperty[TLength]): Self = StObject.set(x, "rowGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowGapUndefined: Self = StObject.set(x, "rowGap", js.undefined)
    
    @scala.inline
    def setRubyAlign(value: RubyAlignProperty): Self = StObject.set(x, "rubyAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRubyAlignUndefined: Self = StObject.set(x, "rubyAlign", js.undefined)
    
    @scala.inline
    def setRubyMerge(value: RubyMergeProperty): Self = StObject.set(x, "rubyMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRubyMergeUndefined: Self = StObject.set(x, "rubyMerge", js.undefined)
    
    @scala.inline
    def setRubyPosition(value: RubyPositionProperty): Self = StObject.set(x, "rubyPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRubyPositionUndefined: Self = StObject.set(x, "rubyPosition", js.undefined)
    
    @scala.inline
    def setScale(value: ScaleProperty): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setScrollBehavior(value: ScrollBehaviorProperty): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
    
    @scala.inline
    def setScrollMargin(value: ScrollMarginProperty[TLength]): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMarginBlock(value: ScrollMarginBlockProperty[TLength]): Self = StObject.set(x, "scrollMarginBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMarginBlockEnd(value: ScrollMarginBlockEndProperty[TLength]): Self = StObject.set(x, "scrollMarginBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMarginBlockEndUndefined: Self = StObject.set(x, "scrollMarginBlockEnd", js.undefined)
    
    @scala.inline
    def setScrollMarginBlockStart(value: ScrollMarginBlockStartProperty[TLength]): Self = StObject.set(x, "scrollMarginBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMarginBlockStartUndefined: Self = StObject.set(x, "scrollMarginBlockStart", js.undefined)
    
    @scala.inline
    def setScrollMarginBlockUndefined: Self = StObject.set(x, "scrollMarginBlock", js.undefined)
    
    @scala.inline
    def setScrollMarginBottom(value: ScrollMarginBottomProperty[TLength]): Self = StObject.set(x, "scrollMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMarginBottomUndefined: Self = StObject.set(x, "scrollMarginBottom", js.undefined)
    
    @scala.inline
    def setScrollMarginInline(value: ScrollMarginInlineProperty[TLength]): Self = StObject.set(x, "scrollMarginInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMarginInlineEnd(value: ScrollMarginInlineEndProperty[TLength]): Self = StObject.set(x, "scrollMarginInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMarginInlineEndUndefined: Self = StObject.set(x, "scrollMarginInlineEnd", js.undefined)
    
    @scala.inline
    def setScrollMarginInlineStart(value: ScrollMarginInlineStartProperty[TLength]): Self = StObject.set(x, "scrollMarginInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMarginInlineStartUndefined: Self = StObject.set(x, "scrollMarginInlineStart", js.undefined)
    
    @scala.inline
    def setScrollMarginInlineUndefined: Self = StObject.set(x, "scrollMarginInline", js.undefined)
    
    @scala.inline
    def setScrollMarginLeft(value: ScrollMarginLeftProperty[TLength]): Self = StObject.set(x, "scrollMarginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMarginLeftUndefined: Self = StObject.set(x, "scrollMarginLeft", js.undefined)
    
    @scala.inline
    def setScrollMarginRight(value: ScrollMarginRightProperty[TLength]): Self = StObject.set(x, "scrollMarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMarginRightUndefined: Self = StObject.set(x, "scrollMarginRight", js.undefined)
    
    @scala.inline
    def setScrollMarginTop(value: ScrollMarginTopProperty[TLength]): Self = StObject.set(x, "scrollMarginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollMarginTopUndefined: Self = StObject.set(x, "scrollMarginTop", js.undefined)
    
    @scala.inline
    def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
    
    @scala.inline
    def setScrollPadding(value: ScrollPaddingProperty[TLength]): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingBlock(value: ScrollPaddingBlockProperty[TLength]): Self = StObject.set(x, "scrollPaddingBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingBlockEnd(value: ScrollPaddingBlockEndProperty[TLength]): Self = StObject.set(x, "scrollPaddingBlockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingBlockEndUndefined: Self = StObject.set(x, "scrollPaddingBlockEnd", js.undefined)
    
    @scala.inline
    def setScrollPaddingBlockStart(value: ScrollPaddingBlockStartProperty[TLength]): Self = StObject.set(x, "scrollPaddingBlockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingBlockStartUndefined: Self = StObject.set(x, "scrollPaddingBlockStart", js.undefined)
    
    @scala.inline
    def setScrollPaddingBlockUndefined: Self = StObject.set(x, "scrollPaddingBlock", js.undefined)
    
    @scala.inline
    def setScrollPaddingBottom(value: ScrollPaddingBottomProperty[TLength]): Self = StObject.set(x, "scrollPaddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingBottomUndefined: Self = StObject.set(x, "scrollPaddingBottom", js.undefined)
    
    @scala.inline
    def setScrollPaddingInline(value: ScrollPaddingInlineProperty[TLength]): Self = StObject.set(x, "scrollPaddingInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingInlineEnd(value: ScrollPaddingInlineEndProperty[TLength]): Self = StObject.set(x, "scrollPaddingInlineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingInlineEndUndefined: Self = StObject.set(x, "scrollPaddingInlineEnd", js.undefined)
    
    @scala.inline
    def setScrollPaddingInlineStart(value: ScrollPaddingInlineStartProperty[TLength]): Self = StObject.set(x, "scrollPaddingInlineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingInlineStartUndefined: Self = StObject.set(x, "scrollPaddingInlineStart", js.undefined)
    
    @scala.inline
    def setScrollPaddingInlineUndefined: Self = StObject.set(x, "scrollPaddingInline", js.undefined)
    
    @scala.inline
    def setScrollPaddingLeft(value: ScrollPaddingLeftProperty[TLength]): Self = StObject.set(x, "scrollPaddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingLeftUndefined: Self = StObject.set(x, "scrollPaddingLeft", js.undefined)
    
    @scala.inline
    def setScrollPaddingRight(value: ScrollPaddingRightProperty[TLength]): Self = StObject.set(x, "scrollPaddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingRightUndefined: Self = StObject.set(x, "scrollPaddingRight", js.undefined)
    
    @scala.inline
    def setScrollPaddingTop(value: ScrollPaddingTopProperty[TLength]): Self = StObject.set(x, "scrollPaddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingTopUndefined: Self = StObject.set(x, "scrollPaddingTop", js.undefined)
    
    @scala.inline
    def setScrollPaddingUndefined: Self = StObject.set(x, "scrollPadding", js.undefined)
    
    @scala.inline
    def setScrollSnapAlign(value: ScrollSnapAlignProperty): Self = StObject.set(x, "scrollSnapAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSnapAlignUndefined: Self = StObject.set(x, "scrollSnapAlign", js.undefined)
    
    @scala.inline
    def setScrollSnapMargin(value: ScrollMarginProperty[TLength]): Self = StObject.set(x, "scrollSnapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSnapMarginBottom(value: ScrollMarginBottomProperty[TLength]): Self = StObject.set(x, "scrollSnapMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSnapMarginBottomUndefined: Self = StObject.set(x, "scrollSnapMarginBottom", js.undefined)
    
    @scala.inline
    def setScrollSnapMarginLeft(value: ScrollMarginLeftProperty[TLength]): Self = StObject.set(x, "scrollSnapMarginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSnapMarginLeftUndefined: Self = StObject.set(x, "scrollSnapMarginLeft", js.undefined)
    
    @scala.inline
    def setScrollSnapMarginRight(value: ScrollMarginRightProperty[TLength]): Self = StObject.set(x, "scrollSnapMarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSnapMarginRightUndefined: Self = StObject.set(x, "scrollSnapMarginRight", js.undefined)
    
    @scala.inline
    def setScrollSnapMarginTop(value: ScrollMarginTopProperty[TLength]): Self = StObject.set(x, "scrollSnapMarginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSnapMarginTopUndefined: Self = StObject.set(x, "scrollSnapMarginTop", js.undefined)
    
    @scala.inline
    def setScrollSnapMarginUndefined: Self = StObject.set(x, "scrollSnapMargin", js.undefined)
    
    @scala.inline
    def setScrollSnapStop(value: ScrollSnapStopProperty): Self = StObject.set(x, "scrollSnapStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSnapStopUndefined: Self = StObject.set(x, "scrollSnapStop", js.undefined)
    
    @scala.inline
    def setScrollSnapType(value: ScrollSnapTypeProperty): Self = StObject.set(x, "scrollSnapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollSnapTypeUndefined: Self = StObject.set(x, "scrollSnapType", js.undefined)
    
    @scala.inline
    def setScrollbarColor(value: ScrollbarColorProperty): Self = StObject.set(x, "scrollbarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarColorUndefined: Self = StObject.set(x, "scrollbarColor", js.undefined)
    
    @scala.inline
    def setScrollbarGutter(value: ScrollbarGutterProperty): Self = StObject.set(x, "scrollbarGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarGutterUndefined: Self = StObject.set(x, "scrollbarGutter", js.undefined)
    
    @scala.inline
    def setScrollbarWidth(value: ScrollbarWidthProperty): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarWidthUndefined: Self = StObject.set(x, "scrollbarWidth", js.undefined)
    
    @scala.inline
    def setShapeImageThreshold(value: ShapeImageThresholdProperty): Self = StObject.set(x, "shapeImageThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeImageThresholdUndefined: Self = StObject.set(x, "shapeImageThreshold", js.undefined)
    
    @scala.inline
    def setShapeMargin(value: ShapeMarginProperty[TLength]): Self = StObject.set(x, "shapeMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeMarginUndefined: Self = StObject.set(x, "shapeMargin", js.undefined)
    
    @scala.inline
    def setShapeOutside(value: ShapeOutsideProperty): Self = StObject.set(x, "shapeOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeOutsideUndefined: Self = StObject.set(x, "shapeOutside", js.undefined)
    
    @scala.inline
    def setTabSize(value: TabSizeProperty[TLength]): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    
    @scala.inline
    def setTableLayout(value: TableLayoutProperty): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
    
    @scala.inline
    def setTextAlign(value: TextAlignProperty): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignLast(value: TextAlignLastProperty): Self = StObject.set(x, "textAlignLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignLastUndefined: Self = StObject.set(x, "textAlignLast", js.undefined)
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextCombineUpright(value: TextCombineUprightProperty): Self = StObject.set(x, "textCombineUpright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextCombineUprightUndefined: Self = StObject.set(x, "textCombineUpright", js.undefined)
    
    @scala.inline
    def setTextDecorationColor(value: TextDecorationColorProperty): Self = StObject.set(x, "textDecorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationColorUndefined: Self = StObject.set(x, "textDecorationColor", js.undefined)
    
    @scala.inline
    def setTextDecorationLine(value: TextDecorationLineProperty): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
    
    @scala.inline
    def setTextDecorationSkip(value: TextDecorationSkipProperty): Self = StObject.set(x, "textDecorationSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationSkipInk(value: TextDecorationSkipInkProperty): Self = StObject.set(x, "textDecorationSkipInk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationSkipInkUndefined: Self = StObject.set(x, "textDecorationSkipInk", js.undefined)
    
    @scala.inline
    def setTextDecorationSkipUndefined: Self = StObject.set(x, "textDecorationSkip", js.undefined)
    
    @scala.inline
    def setTextDecorationStyle(value: TextDecorationStyleProperty): Self = StObject.set(x, "textDecorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationStyleUndefined: Self = StObject.set(x, "textDecorationStyle", js.undefined)
    
    @scala.inline
    def setTextDecorationThickness(value: TextDecorationThicknessProperty[TLength]): Self = StObject.set(x, "textDecorationThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationThicknessUndefined: Self = StObject.set(x, "textDecorationThickness", js.undefined)
    
    @scala.inline
    def setTextDecorationWidth(value: TextDecorationThicknessProperty[TLength]): Self = StObject.set(x, "textDecorationWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationWidthUndefined: Self = StObject.set(x, "textDecorationWidth", js.undefined)
    
    @scala.inline
    def setTextEmphasisColor(value: TextEmphasisColorProperty): Self = StObject.set(x, "textEmphasisColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEmphasisColorUndefined: Self = StObject.set(x, "textEmphasisColor", js.undefined)
    
    @scala.inline
    def setTextEmphasisPosition(value: GlobalsString): Self = StObject.set(x, "textEmphasisPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEmphasisPositionUndefined: Self = StObject.set(x, "textEmphasisPosition", js.undefined)
    
    @scala.inline
    def setTextEmphasisStyle(value: TextEmphasisStyleProperty): Self = StObject.set(x, "textEmphasisStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEmphasisStyleUndefined: Self = StObject.set(x, "textEmphasisStyle", js.undefined)
    
    @scala.inline
    def setTextIndent(value: TextIndentProperty[TLength]): Self = StObject.set(x, "textIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextIndentUndefined: Self = StObject.set(x, "textIndent", js.undefined)
    
    @scala.inline
    def setTextJustify(value: TextJustifyProperty): Self = StObject.set(x, "textJustify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextJustifyUndefined: Self = StObject.set(x, "textJustify", js.undefined)
    
    @scala.inline
    def setTextOrientation(value: TextOrientationProperty): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    @scala.inline
    def setTextOverflow(value: TextOverflowProperty): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    @scala.inline
    def setTextRendering(value: TextRenderingProperty): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
    
    @scala.inline
    def setTextShadow(value: TextShadowProperty): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
    
    @scala.inline
    def setTextSizeAdjust(value: TextSizeAdjustProperty): Self = StObject.set(x, "textSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSizeAdjustUndefined: Self = StObject.set(x, "textSizeAdjust", js.undefined)
    
    @scala.inline
    def setTextTransform(value: TextTransformProperty): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    
    @scala.inline
    def setTextUnderlineOffset(value: TextUnderlineOffsetProperty[TLength]): Self = StObject.set(x, "textUnderlineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUnderlineOffsetUndefined: Self = StObject.set(x, "textUnderlineOffset", js.undefined)
    
    @scala.inline
    def setTextUnderlinePosition(value: TextUnderlinePositionProperty): Self = StObject.set(x, "textUnderlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUnderlinePositionUndefined: Self = StObject.set(x, "textUnderlinePosition", js.undefined)
    
    @scala.inline
    def setTop(value: TopProperty[TLength]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setTouchAction(value: TouchActionProperty): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
    
    @scala.inline
    def setTransform(value: TransformProperty): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformBox(value: TransformBoxProperty): Self = StObject.set(x, "transformBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformBoxUndefined: Self = StObject.set(x, "transformBox", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: TransformOriginProperty[TLength]): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
    
    @scala.inline
    def setTransformStyle(value: TransformStyleProperty): Self = StObject.set(x, "transformStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformStyleUndefined: Self = StObject.set(x, "transformStyle", js.undefined)
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTransitionDelay(value: GlobalsString): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: GlobalsString): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionProperty(value: TransitionPropertyProperty): Self = StObject.set(x, "transitionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionPropertyUndefined: Self = StObject.set(x, "transitionProperty", js.undefined)
    
    @scala.inline
    def setTransitionTimingFunction(value: TransitionTimingFunctionProperty): Self = StObject.set(x, "transitionTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionTimingFunctionUndefined: Self = StObject.set(x, "transitionTimingFunction", js.undefined)
    
    @scala.inline
    def setTranslate(value: TranslateProperty[TLength]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    
    @scala.inline
    def setUnicodeBidi(value: UnicodeBidiProperty): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
    
    @scala.inline
    def setUserSelect(value: UserSelectProperty): Self = StObject.set(x, "userSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSelectUndefined: Self = StObject.set(x, "userSelect", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignProperty[TLength]): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setVisibility(value: VisibilityProperty): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    @scala.inline
    def setWhiteSpace(value: WhiteSpaceProperty): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
    
    @scala.inline
    def setWidows(value: GlobalsNumber): Self = StObject.set(x, "widows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidowsUndefined: Self = StObject.set(x, "widows", js.undefined)
    
    @scala.inline
    def setWidth(value: WidthProperty[TLength]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWillChange(value: WillChangeProperty): Self = StObject.set(x, "willChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillChangeUndefined: Self = StObject.set(x, "willChange", js.undefined)
    
    @scala.inline
    def setWordBreak(value: WordBreakProperty): Self = StObject.set(x, "wordBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordBreakUndefined: Self = StObject.set(x, "wordBreak", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: WordSpacingProperty[TLength]): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
    
    @scala.inline
    def setWordWrap(value: WordWrapProperty): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    
    @scala.inline
    def setWritingMode(value: WritingModeProperty): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
    
    @scala.inline
    def setZIndex(value: ZIndexProperty): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    @scala.inline
    def setZoom(value: ZoomProperty): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
