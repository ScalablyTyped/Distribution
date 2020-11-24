package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VendorLonghandProperties[TLength] extends js.Object {
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var MozAnimationDelay: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    */
  var MozAnimationDirection: js.UndefOr[AnimationDirectionProperty] = js.native
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var MozAnimationDuration: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    */
  var MozAnimationFillMode: js.UndefOr[AnimationFillModeProperty] = js.native
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    */
  var MozAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty] = js.native
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    */
  var MozAnimationName: js.UndefOr[AnimationNameProperty] = js.native
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    */
  var MozAnimationPlayState: js.UndefOr[AnimationPlayStateProperty] = js.native
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var MozAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty] = js.native
  
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Syntax**: `none | button | button-arrow-down | button-arrow-next | button-arrow-previous | button-arrow-up | button-bevel | button-focus | caret | checkbox | checkbox-container | checkbox-label | checkmenuitem | dualbutton | groupbox | listbox | listitem | menuarrow | menubar | menucheckbox | menuimage | menuitem | menuitemtext | menulist | menulist-button | menulist-text | menulist-textfield | menupopup | menuradio | menuseparator | meterbar | meterchunk | progressbar | progressbar-vertical | progresschunk | progresschunk-vertical | radio | radio-container | radio-label | radiomenuitem | range | range-thumb | resizer | resizerpanel | scale-horizontal | scalethumbend | scalethumb-horizontal | scalethumbstart | scalethumbtick | scalethumb-vertical | scale-vertical | scrollbarbutton-down | scrollbarbutton-left | scrollbarbutton-right | scrollbarbutton-up | scrollbarthumb-horizontal | scrollbarthumb-vertical | scrollbartrack-horizontal | scrollbartrack-vertical | searchfield | separator | sheet | spinner | spinner-downbutton | spinner-textfield | spinner-upbutton | splitter | statusbar | statusbarpanel | tab | tabpanel | tabpanels | tab-scroll-arrow-back | tab-scroll-arrow-forward | textfield | textfield-multiline | toolbar | toolbarbutton | toolbarbutton-dropdown | toolbargripper | toolbox | tooltip | treeheader | treeheadercell | treeheadersortarrow | treeitem | treeline | treetwisty | treetwistyopen | treeview | -moz-mac-unified-toolbar | -moz-win-borderless-glass | -moz-win-browsertabbar-toolbox | -moz-win-communicationstext | -moz-win-communications-toolbox | -moz-win-exclude-glass | -moz-win-glass | -moz-win-mediatext | -moz-win-media-toolbox | -moz-window-button-box | -moz-window-button-box-maximized | -moz-window-button-close | -moz-window-button-maximize | -moz-window-button-minimize | -moz-window-button-restore | -moz-window-frame-bottom | -moz-window-frame-left | -moz-window-frame-right | -moz-window-titlebar | -moz-window-titlebar-maximized`
    *
    * **Initial value**: `none` (but this value is overridden in the user agent CSS)
    */
  var MozAppearance: js.UndefOr[MozAppearanceProperty] = js.native
  
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Syntax**: `visible | hidden`
    *
    * **Initial value**: `visible`
    */
  var MozBackfaceVisibility: js.UndefOr[BackfaceVisibilityProperty] = js.native
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-bottom-colors`** CSS property sets a list of colors for the bottom border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var MozBorderBottomColors: js.UndefOr[MozBorderBottomColorsProperty] = js.native
  
  /**
    * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    */
  var MozBorderEndColor: js.UndefOr[BorderInlineEndColorProperty] = js.native
  
  /**
    * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    */
  var MozBorderEndStyle: js.UndefOr[BorderInlineEndStyleProperty] = js.native
  
  /**
    * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    */
  var MozBorderEndWidth: js.UndefOr[BorderInlineEndWidthProperty[TLength]] = js.native
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-left-colors`** CSS property sets a list of colors for the left border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var MozBorderLeftColors: js.UndefOr[MozBorderLeftColorsProperty] = js.native
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-right-colors`** CSS property sets a list of colors for the right border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var MozBorderRightColors: js.UndefOr[MozBorderRightColorsProperty] = js.native
  
  /**
    * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    */
  var MozBorderStartColor: js.UndefOr[BorderInlineStartColorProperty] = js.native
  
  /**
    * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    */
  var MozBorderStartStyle: js.UndefOr[BorderInlineStartStyleProperty] = js.native
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-top-colors`** CSS property sets a list of colors for the top border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var MozBorderTopColors: js.UndefOr[MozBorderTopColorsProperty] = js.native
  
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Syntax**: `content-box | border-box`
    *
    * **Initial value**: `content-box`
    */
  var MozBoxSizing: js.UndefOr[BoxSizingProperty] = js.native
  
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Syntax**: `<integer> | auto`
    *
    * **Initial value**: `auto`
    */
  var MozColumnCount: js.UndefOr[ColumnCountProperty] = js.native
  
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Syntax**: `auto | balance | balance-all`
    *
    * **Initial value**: `balance`
    */
  var MozColumnFill: js.UndefOr[ColumnFillProperty] = js.native
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    */
  var MozColumnGap: js.UndefOr[ColumnGapProperty[TLength]] = js.native
  
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var MozColumnRuleColor: js.UndefOr[ColumnRuleColorProperty] = js.native
  
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-style'>`
    *
    * **Initial value**: `none`
    */
  var MozColumnRuleStyle: js.UndefOr[ColumnRuleStyleProperty] = js.native
  
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-width'>`
    *
    * **Initial value**: `medium`
    */
  var MozColumnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.native
  
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Syntax**: `<length> | auto`
    *
    * **Initial value**: `auto`
    */
  var MozColumnWidth: js.UndefOr[ColumnWidthProperty[TLength]] = js.native
  
  /**
    * If you reference an SVG image in a webpage (such as with the `<img>` element or as a background image), the SVG image can coordinate with the embedding element (its context) to have the image adopt property values set on the embedding element. To do this the embedding element needs to list the properties that are to be made available to the image by listing them as values of the **`-moz-context-properties`** property, and the image needs to opt in to using those properties by using values such as the `context-fill` value.
    *
    * **Syntax**: `none | [ fill | fill-opacity | stroke | stroke-opacity ]#`
    *
    * **Initial value**: `none`
    */
  var MozContextProperties: js.UndefOr[MozContextPropertiesProperty] = js.native
  
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Syntax**: `normal | <feature-tag-value>#`
    *
    * **Initial value**: `normal`
    */
  var MozFontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty] = js.native
  
  /**
    * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
    *
    * **Syntax**: `normal | <string>`
    *
    * **Initial value**: `normal`
    */
  var MozFontLanguageOverride: js.UndefOr[FontLanguageOverrideProperty] = js.native
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Syntax**: `none | manual | auto`
    *
    * **Initial value**: `manual`
    */
  var MozHyphens: js.UndefOr[HyphensProperty] = js.native
  
  /**
    * For certain XUL elements and pseudo-elements that use an image from the `list-style-image` property, this property specifies a region of the image that is used in place of the whole image. This allows elements to use different pieces of the same image to improve performance.
    *
    * **Syntax**: `<shape> | auto`
    *
    * **Initial value**: `auto`
    */
  var MozImageRegion: js.UndefOr[MozImageRegionProperty] = js.native
  
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var MozMarginEnd: js.UndefOr[MarginInlineEndProperty[TLength]] = js.native
  
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var MozMarginStart: js.UndefOr[MarginInlineStartProperty[TLength]] = js.native
  
  /**
    * The **`-moz-orient`** CSS property specifies the orientation of the element to which it's applied.
    *
    * **Syntax**: `inline | block | horizontal | vertical`
    *
    * **Initial value**: `inline`
    */
  var MozOrient: js.UndefOr[MozOrientProperty] = js.native
  
  /**
    * The **`font-smooth`** CSS property controls the application of anti-aliasing when fonts are rendered.
    *
    * **Syntax**: `auto | never | always | <absolute-size> | <length>`
    *
    * **Initial value**: `auto`
    */
  var MozOsxFontSmoothing: js.UndefOr[FontSmoothProperty[TLength]] = js.native
  
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var MozPaddingEnd: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.native
  
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var MozPaddingStart: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.native
  
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Syntax**: `none | <length>`
    *
    * **Initial value**: `none`
    */
  var MozPerspective: js.UndefOr[PerspectiveProperty[TLength]] = js.native
  
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    */
  var MozPerspectiveOrigin: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.native
  
  /**
    * **`-moz-stack-sizing`** is an extended CSS property. Normally, a `stack` will change its size so that all of its child elements are completely visible. For example, moving a child of the stack far to the right will widen the stack so the child remains visible.
    *
    * **Syntax**: `ignore | stretch-to-fit`
    *
    * **Initial value**: `stretch-to-fit`
    */
  var MozStackSizing: js.UndefOr[MozStackSizingProperty] = js.native
  
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Syntax**: `<integer> | <length>`
    *
    * **Initial value**: `8`
    */
  var MozTabSize: js.UndefOr[TabSizeProperty[TLength]] = js.native
  
  /**
    * The **`-moz-text-blink`** non-standard Mozilla CSS extension specifies the blink mode.
    *
    * **Syntax**: `none | blink`
    *
    * **Initial value**: `none`
    */
  var MozTextBlink: js.UndefOr[MozTextBlinkProperty] = js.native
  
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Syntax**: `none | auto | <percentage>`
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    */
  var MozTextSizeAdjust: js.UndefOr[TextSizeAdjustProperty] = js.native
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var MozTransformOrigin: js.UndefOr[TransformOriginProperty[TLength]] = js.native
  
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Syntax**: `flat | preserve-3d`
    *
    * **Initial value**: `flat`
    */
  var MozTransformStyle: js.UndefOr[TransformStyleProperty] = js.native
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var MozTransitionDelay: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var MozTransitionDuration: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    */
  var MozTransitionProperty: js.UndefOr[TransitionPropertyProperty] = js.native
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var MozTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.native
  
  /**
    * The **`-moz-user-focus`** CSS property is used to indicate whether an element can have the focus.
    *
    * **Syntax**: `ignore | normal | select-after | select-before | select-menu | select-same | select-all | none`
    *
    * **Initial value**: `none`
    */
  var MozUserFocus: js.UndefOr[MozUserFocusProperty] = js.native
  
  /**
    * The **`user-modify`** property has no effect in Firefox. It was originally planned to determine whether or not the content of an element can be edited by a user.
    *
    * **Syntax**: `read-only | read-write | write-only`
    *
    * **Initial value**: `read-only`
    */
  var MozUserModify: js.UndefOr[MozUserModifyProperty] = js.native
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    */
  var MozUserSelect: js.UndefOr[UserSelectProperty] = js.native
  
  /**
    * The **`-moz-window-dragging`** CSS property specifies whether a window is draggable or not. It only works in Chrome code, and only on Mac OS X.
    *
    * **Syntax**: `drag | no-drag`
    *
    * **Initial value**: `drag`
    */
  var MozWindowDragging: js.UndefOr[MozWindowDraggingProperty] = js.native
  
  /**
    * The **`-moz-window-shadow`** CSS property specifies whether a window will have a shadow. It only works on Mac OS X.
    *
    * **Syntax**: `default | menu | tooltip | sheet | none`
    *
    * **Initial value**: `default`
    */
  var MozWindowShadow: js.UndefOr[MozWindowShadowProperty] = js.native
  
  /**
    * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Syntax**: `fill | contain | cover | none | scale-down`
    *
    * **Initial value**: `fill`
    */
  var OObjectFit: js.UndefOr[ObjectFitProperty] = js.native
  
  /**
    * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    */
  var OObjectPosition: js.UndefOr[ObjectPositionProperty[TLength]] = js.native
  
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Syntax**: `<integer> | <length>`
    *
    * **Initial value**: `8`
    */
  var OTabSize: js.UndefOr[TabSizeProperty[TLength]] = js.native
  
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
    *
    * **Initial value**: `clip`
    */
  var OTextOverflow: js.UndefOr[TextOverflowProperty] = js.native
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var OTransformOrigin: js.UndefOr[TransformOriginProperty[TLength]] = js.native
  
  /**
    * The CSS **`align-content`** property sets how the browser distributes space between and around content items along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * **Syntax**: `normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position>`
    *
    * **Initial value**: `normal`
    */
  var WebkitAlignContent: js.UndefOr[AlignContentProperty] = js.native
  
  /**
    * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align-self property sets the alignment of an item within its containing block. In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment of items on the Block Axis within their grid area.
    *
    * **Syntax**: `normal | stretch | <baseline-position> | [ <overflow-position>? <self-position> ]`
    *
    * **Initial value**: `normal`
    */
  var WebkitAlignItems: js.UndefOr[AlignItemsProperty] = js.native
  
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position>`
    *
    * **Initial value**: `auto`
    */
  var WebkitAlignSelf: js.UndefOr[AlignSelfProperty] = js.native
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var WebkitAnimationDelay: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    */
  var WebkitAnimationDirection: js.UndefOr[AnimationDirectionProperty] = js.native
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var WebkitAnimationDuration: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    */
  var WebkitAnimationFillMode: js.UndefOr[AnimationFillModeProperty] = js.native
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    */
  var WebkitAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty] = js.native
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    */
  var WebkitAnimationName: js.UndefOr[AnimationNameProperty] = js.native
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    */
  var WebkitAnimationPlayState: js.UndefOr[AnimationPlayStateProperty] = js.native
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var WebkitAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty] = js.native
  
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Syntax**: `none | button | button-bevel | caret | checkbox | default-button | inner-spin-button | listbox | listitem | media-controls-background | media-controls-fullscreen-background | media-current-time-display | media-enter-fullscreen-button | media-exit-fullscreen-button | media-fullscreen-button | media-mute-button | media-overlay-play-button | media-play-button | media-seek-back-button | media-seek-forward-button | media-slider | media-sliderthumb | media-time-remaining-display | media-toggle-closed-captions-button | media-volume-slider | media-volume-slider-container | media-volume-sliderthumb | menulist | menulist-button | menulist-text | menulist-textfield | meter | progress-bar | progress-bar-value | push-button | radio | searchfield | searchfield-cancel-button | searchfield-decoration | searchfield-results-button | searchfield-results-decoration | slider-horizontal | slider-vertical | sliderthumb-horizontal | sliderthumb-vertical | square-button | textarea | textfield | -apple-pay-button`
    *
    * **Initial value**: `none` (but this value is overridden in the user agent CSS)
    */
  var WebkitAppearance: js.UndefOr[WebkitAppearanceProperty] = js.native
  
  /**
    * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
    *
    * **Syntax**: `none | <filter-function-list>`
    *
    * **Initial value**: `none`
    */
  var WebkitBackdropFilter: js.UndefOr[BackdropFilterProperty] = js.native
  
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Syntax**: `visible | hidden`
    *
    * **Initial value**: `visible`
    */
  var WebkitBackfaceVisibility: js.UndefOr[BackfaceVisibilityProperty] = js.native
  
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `border-box`
    */
  var WebkitBackgroundClip: js.UndefOr[BackgroundClipProperty] = js.native
  
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `padding-box`
    */
  var WebkitBackgroundOrigin: js.UndefOr[BackgroundOriginProperty] = js.native
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    */
  var WebkitBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength]] = js.native
  
  /**
    * **Syntax**: `<'color'>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitBorderBeforeColor: js.UndefOr[WebkitBorderBeforeColorProperty] = js.native
  
  /**
    * **Syntax**: `<'border-style'>`
    *
    * **Initial value**: `none`
    */
  var WebkitBorderBeforeStyle: js.UndefOr[WebkitBorderBeforeStyleProperty] = js.native
  
  /**
    * **Syntax**: `<'border-width'>`
    *
    * **Initial value**: `medium`
    */
  var WebkitBorderBeforeWidth: js.UndefOr[WebkitBorderBeforeWidthProperty[TLength]] = js.native
  
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var WebkitBorderBottomLeftRadius: js.UndefOr[BorderBottomLeftRadiusProperty[TLength]] = js.native
  
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var WebkitBorderBottomRightRadius: js.UndefOr[BorderBottomRightRadiusProperty[TLength]] = js.native
  
  /**
    * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
    *
    * **Syntax**: `<number-percentage>{1,4} && fill?`
    *
    * **Initial value**: `100%`
    */
  var WebkitBorderImageSlice: js.UndefOr[BorderImageSliceProperty] = js.native
  
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var WebkitBorderTopLeftRadius: js.UndefOr[BorderTopLeftRadiusProperty[TLength]] = js.native
  
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var WebkitBorderTopRightRadius: js.UndefOr[BorderTopRightRadiusProperty[TLength]] = js.native
  
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Syntax**: `slice | clone`
    *
    * **Initial value**: `slice`
    */
  var WebkitBoxDecorationBreak: js.UndefOr[BoxDecorationBreakProperty] = js.native
  
  /**
    * The **`-webkit-box-reflect`** CSS property lets you reflect the content of an element in one specific direction.
    *
    * **Syntax**: `[ above | below | right | left ]? <length>? <image>?`
    *
    * **Initial value**: `none`
    */
  var WebkitBoxReflect: js.UndefOr[WebkitBoxReflectProperty[TLength]] = js.native
  
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Syntax**: `none | <shadow>#`
    *
    * **Initial value**: `none`
    */
  var WebkitBoxShadow: js.UndefOr[BoxShadowProperty] = js.native
  
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Syntax**: `content-box | border-box`
    *
    * **Initial value**: `content-box`
    */
  var WebkitBoxSizing: js.UndefOr[BoxSizingProperty] = js.native
  
  /**
    * The `**clip-path**` CSS property creates a clipping region that sets what part of an element should be shown. Parts that are inside the region are shown, while those outside are hidden.
    *
    * **Syntax**: `<clip-source> | [ <basic-shape> || <geometry-box> ] | none`
    *
    * **Initial value**: `none`
    */
  var WebkitClipPath: js.UndefOr[ClipPathProperty] = js.native
  
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Syntax**: `<integer> | auto`
    *
    * **Initial value**: `auto`
    */
  var WebkitColumnCount: js.UndefOr[ColumnCountProperty] = js.native
  
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Syntax**: `auto | balance | balance-all`
    *
    * **Initial value**: `balance`
    */
  var WebkitColumnFill: js.UndefOr[ColumnFillProperty] = js.native
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    */
  var WebkitColumnGap: js.UndefOr[ColumnGapProperty[TLength]] = js.native
  
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitColumnRuleColor: js.UndefOr[ColumnRuleColorProperty] = js.native
  
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-style'>`
    *
    * **Initial value**: `none`
    */
  var WebkitColumnRuleStyle: js.UndefOr[ColumnRuleStyleProperty] = js.native
  
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-width'>`
    *
    * **Initial value**: `medium`
    */
  var WebkitColumnRuleWidth: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.native
  
  /**
    * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
    *
    * **Syntax**: `none | all`
    *
    * **Initial value**: `none`
    */
  var WebkitColumnSpan: js.UndefOr[ColumnSpanProperty] = js.native
  
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Syntax**: `<length> | auto`
    *
    * **Initial value**: `auto`
    */
  var WebkitColumnWidth: js.UndefOr[ColumnWidthProperty[TLength]] = js.native
  
  /**
    * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
    *
    * **Syntax**: `none | <filter-function-list>`
    *
    * **Initial value**: `none`
    */
  var WebkitFilter: js.UndefOr[FilterProperty] = js.native
  
  /**
    * The **`flex-basis`** CSS property sets the initial main size of a flex item. It sets the size of the content box unless otherwise set with `box-sizing`.
    *
    * **Syntax**: `content | <'width'>`
    *
    * **Initial value**: `auto`
    */
  var WebkitFlexBasis: js.UndefOr[FlexBasisProperty[TLength]] = js.native
  
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Syntax**: `row | row-reverse | column | column-reverse`
    *
    * **Initial value**: `row`
    */
  var WebkitFlexDirection: js.UndefOr[FlexDirectionProperty] = js.native
  
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    */
  var WebkitFlexGrow: js.UndefOr[GlobalsNumber] = js.native
  
  /**
    * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `1`
    */
  var WebkitFlexShrink: js.UndefOr[GlobalsNumber] = js.native
  
  /**
    * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * **Syntax**: `nowrap | wrap | wrap-reverse`
    *
    * **Initial value**: `nowrap`
    */
  var WebkitFlexWrap: js.UndefOr[FlexWrapProperty] = js.native
  
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Syntax**: `normal | <feature-tag-value>#`
    *
    * **Initial value**: `normal`
    */
  var WebkitFontFeatureSettings: js.UndefOr[FontFeatureSettingsProperty] = js.native
  
  /**
    * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
    *
    * **Syntax**: `auto | normal | none`
    *
    * **Initial value**: `auto`
    */
  var WebkitFontKerning: js.UndefOr[FontKerningProperty] = js.native
  
  /**
    * The **`font-smooth`** CSS property controls the application of anti-aliasing when fonts are rendered.
    *
    * **Syntax**: `auto | never | always | <absolute-size> | <length>`
    *
    * **Initial value**: `auto`
    */
  var WebkitFontSmoothing: js.UndefOr[FontSmoothProperty[TLength]] = js.native
  
  /**
    * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
    *
    * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> ]`
    *
    * **Initial value**: `normal`
    */
  var WebkitFontVariantLigatures: js.UndefOr[FontVariantLigaturesProperty] = js.native
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Syntax**: `none | manual | auto`
    *
    * **Initial value**: `manual`
    */
  var WebkitHyphens: js.UndefOr[HyphensProperty] = js.native
  
  /**
    * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * **Syntax**: `normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ]`
    *
    * **Initial value**: `normal`
    */
  var WebkitJustifyContent: js.UndefOr[JustifyContentProperty] = js.native
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    */
  var WebkitLineBreak: js.UndefOr[LineBreakProperty] = js.native
  
  /**
    * The **`-webkit-line-clamp`** CSS property allows limiting of the contents of a block container to the specified number of lines.
    *
    * **Syntax**: `none | <integer>`
    *
    * **Initial value**: `none`
    */
  var WebkitLineClamp: js.UndefOr[WebkitLineClampProperty] = js.native
  
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var WebkitMarginEnd: js.UndefOr[MarginInlineEndProperty[TLength]] = js.native
  
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var WebkitMarginStart: js.UndefOr[MarginInlineStartProperty[TLength]] = js.native
  
  /**
    * If a `-webkit-mask-image` is specified, `-webkit-mask-attachment` determines whether the mask image's position is fixed within the viewport, or scrolls along with its containing block.
    *
    * **Syntax**: `<attachment>#`
    *
    * **Initial value**: `scroll`
    */
  var WebkitMaskAttachment: js.UndefOr[WebkitMaskAttachmentProperty] = js.native
  
  /**
    * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
    *
    * **Syntax**: `[ <box> | border | padding | content | text ]#`
    *
    * **Initial value**: `border`
    */
  var WebkitMaskClip: js.UndefOr[WebkitMaskClipProperty] = js.native
  
  /**
    * The **`-webkit-mask-composite`** property specifies the manner in which multiple mask images applied to the same element are composited with one another. Mask images are composited in the opposite order that they are declared with the `-webkit-mask-image` property.
    *
    * **Syntax**: `<composite-style>#`
    *
    * **Initial value**: `source-over`
    */
  var WebkitMaskComposite: js.UndefOr[WebkitMaskCompositeProperty] = js.native
  
  /**
    * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
    *
    * **Syntax**: `<mask-reference>#`
    *
    * **Initial value**: `none`
    */
  var WebkitMaskImage: js.UndefOr[WebkitMaskImageProperty] = js.native
  
  /**
    * The **`mask-origin`** CSS property sets the origin of a mask.
    *
    * **Syntax**: `[ <box> | border | padding | content ]#`
    *
    * **Initial value**: `padding`
    */
  var WebkitMaskOrigin: js.UndefOr[WebkitMaskOriginProperty] = js.native
  
  /**
    * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
    *
    * **Syntax**: `<position>#`
    *
    * **Initial value**: `0% 0%`
    */
  var WebkitMaskPosition: js.UndefOr[WebkitMaskPositionProperty[TLength]] = js.native
  
  /**
    * The `-webkit-mask-position-x` CSS property sets the initial horizontal position of a mask image.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right ]#`
    *
    * **Initial value**: `0%`
    */
  var WebkitMaskPositionX: js.UndefOr[WebkitMaskPositionXProperty[TLength]] = js.native
  
  /**
    * The `-webkit-mask-position-y` CSS property sets the initial vertical position of a mask image.
    *
    * **Syntax**: `[ <length-percentage> | top | center | bottom ]#`
    *
    * **Initial value**: `0%`
    */
  var WebkitMaskPositionY: js.UndefOr[WebkitMaskPositionYProperty[TLength]] = js.native
  
  /**
    * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Syntax**: `<repeat-style>#`
    *
    * **Initial value**: `repeat`
    */
  var WebkitMaskRepeat: js.UndefOr[WebkitMaskRepeatProperty] = js.native
  
  /**
    * The `-webkit-mask-repeat-x` property specifies whether and how a mask image is repeated (tiled) horizontally.
    *
    * **Syntax**: `repeat | no-repeat | space | round`
    *
    * **Initial value**: `repeat`
    */
  var WebkitMaskRepeatX: js.UndefOr[WebkitMaskRepeatXProperty] = js.native
  
  /**
    * The `-webkit-mask-repeat-y` property sets whether and how a mask image is repeated (tiled) vertically.
    *
    * **Syntax**: `repeat | no-repeat | space | round`
    *
    * **Initial value**: `repeat`
    */
  var WebkitMaskRepeatY: js.UndefOr[WebkitMaskRepeatYProperty] = js.native
  
  /**
    * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    */
  var WebkitMaskSize: js.UndefOr[WebkitMaskSizeProperty[TLength]] = js.native
  
  /**
    * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
    *
    * **Syntax**: `<'max-width'>`
    *
    * **Initial value**: `0`
    */
  var WebkitMaxInlineSize: js.UndefOr[MaxInlineSizeProperty[TLength]] = js.native
  
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `0`
    */
  var WebkitOrder: js.UndefOr[GlobalsNumber] = js.native
  
  /**
    * The `-webkit-overflow-scrolling` CSS property controls whether or not touch devices use momentum-based scrolling for a given element.
    *
    * **Syntax**: `auto | touch`
    *
    * **Initial value**: `auto`
    */
  var WebkitOverflowScrolling: js.UndefOr[WebkitOverflowScrollingProperty] = js.native
  
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var WebkitPaddingEnd: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.native
  
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var WebkitPaddingStart: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.native
  
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Syntax**: `none | <length>`
    *
    * **Initial value**: `none`
    */
  var WebkitPerspective: js.UndefOr[PerspectiveProperty[TLength]] = js.native
  
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    */
  var WebkitPerspectiveOrigin: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.native
  
  /**
    * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
    *
    * **Syntax**: `economy | exact`
    *
    * **Initial value**: `economy`
    */
  var WebkitPrintColorAdjust: js.UndefOr[ColorAdjustProperty] = js.native
  
  /**
    * The `**ruby-position**` CSS property defines the position of a ruby element relatives to its base element. It can be position over the element (`over`), under it (`under`), or between the characters, on their right side (`inter-character`).
    *
    * **Syntax**: `over | under | inter-character`
    *
    * **Initial value**: `over`
    */
  var WebkitRubyPosition: js.UndefOr[RubyPositionProperty] = js.native
  
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Syntax**: `none | [ x | y | block | inline | both ] [ mandatory | proximity ]?`
    *
    * **Initial value**: `none`
    */
  var WebkitScrollSnapType: js.UndefOr[ScrollSnapTypeProperty] = js.native
  
  /**
    * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    */
  var WebkitShapeMargin: js.UndefOr[ShapeMarginProperty[TLength]] = js.native
  
  /**
    * **`-webkit-tap-highlight-color`** is a non-standard CSS property that sets the color of the highlight that appears over a link while it's being tapped. The highlighting indicates to the user that their tap is being successfully recognized, and indicates which element they're tapping on.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `black`
    */
  var WebkitTapHighlightColor: js.UndefOr[WebkitTapHighlightColorProperty] = js.native
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    */
  var WebkitTextCombine: js.UndefOr[TextCombineUprightProperty] = js.native
  
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextDecorationColor: js.UndefOr[TextDecorationColorProperty] = js.native
  
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
    *
    * **Initial value**: `none`
    */
  var WebkitTextDecorationLine: js.UndefOr[TextDecorationLineProperty] = js.native
  
  /**
    * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
    *
    * **Syntax**: `none | [ objects || [ spaces | [ leading-spaces || trailing-spaces ] ] || edges || box-decoration ]`
    *
    * **Initial value**: `objects`
    */
  var WebkitTextDecorationSkip: js.UndefOr[TextDecorationSkipProperty] = js.native
  
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Syntax**: `solid | double | dotted | dashed | wavy`
    *
    * **Initial value**: `solid`
    */
  var WebkitTextDecorationStyle: js.UndefOr[TextDecorationStyleProperty] = js.native
  
  /**
    * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextEmphasisColor: js.UndefOr[TextEmphasisColorProperty] = js.native
  
  /**
    * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
    *
    * **Syntax**: `[ over | under ] && [ right | left ]`
    *
    * **Initial value**: `over right`
    */
  var WebkitTextEmphasisPosition: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
    *
    * **Syntax**: `none | [ [ filled | open ] || [ dot | circle | double-circle | triangle | sesame ] ] | <string>`
    *
    * **Initial value**: `none`
    */
  var WebkitTextEmphasisStyle: js.UndefOr[TextEmphasisStyleProperty] = js.native
  
  /**
    * The **`-webkit-text-fill-color`** CSS property specifies the fill color of characters of text. If this property is not set, the value of the `color` property is used.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextFillColor: js.UndefOr[WebkitTextFillColorProperty] = js.native
  
  /**
    * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
    *
    * **Syntax**: `mixed | upright | sideways`
    *
    * **Initial value**: `mixed`
    */
  var WebkitTextOrientation: js.UndefOr[TextOrientationProperty] = js.native
  
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Syntax**: `none | auto | <percentage>`
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    */
  var WebkitTextSizeAdjust: js.UndefOr[TextSizeAdjustProperty] = js.native
  
  /**
    * The **`-webkit-text-stroke-color`** CSS property specifies the stroke color of characters of text. If this property is not set, the value of the `color` property is used.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var WebkitTextStrokeColor: js.UndefOr[WebkitTextStrokeColorProperty] = js.native
  
  /**
    * The **`-webkit-text-stroke-width`** CSS property specifies the width of the stroke for text.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var WebkitTextStrokeWidth: js.UndefOr[WebkitTextStrokeWidthProperty[TLength]] = js.native
  
  /**
    * The **`text-underline-position`** CSS property specifies the position of the underline which is set using the `text-decoration` property's `underline` value.
    *
    * **Syntax**: `auto | from-font | [ under || [ left | right ] ]`
    *
    * **Initial value**: `auto`
    */
  var WebkitTextUnderlinePosition: js.UndefOr[TextUnderlinePositionProperty] = js.native
  
  /**
    * The `-webkit-touch-callout` CSS property controls the display of the default callout shown when you touch and hold a touch target.
    *
    * **Syntax**: `default | none`
    *
    * **Initial value**: `default`
    */
  var WebkitTouchCallout: js.UndefOr[WebkitTouchCalloutProperty] = js.native
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    */
  var WebkitTransform: js.UndefOr[TransformProperty] = js.native
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var WebkitTransformOrigin: js.UndefOr[TransformOriginProperty[TLength]] = js.native
  
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Syntax**: `flat | preserve-3d`
    *
    * **Initial value**: `flat`
    */
  var WebkitTransformStyle: js.UndefOr[TransformStyleProperty] = js.native
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var WebkitTransitionDelay: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var WebkitTransitionDuration: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    */
  var WebkitTransitionProperty: js.UndefOr[TransitionPropertyProperty] = js.native
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var WebkitTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.native
  
  /**
    * **Syntax**: `read-only | read-write | read-write-plaintext-only`
    *
    * **Initial value**: `read-only`
    */
  var WebkitUserModify: js.UndefOr[WebkitUserModifyProperty] = js.native
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    */
  var WebkitUserSelect: js.UndefOr[UserSelectProperty] = js.native
  
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
    *
    * **Initial value**: `horizontal-tb`
    */
  var WebkitWritingMode: js.UndefOr[WritingModeProperty] = js.native
  
  /**
    * The **`-ms-accelerator`** CSS property is a Microsoft extension that sets or retrieves a string indicating whether the object represents a keyboard shortcut.
    *
    * **Syntax**: `false | true`
    *
    * **Initial value**: `false`
    */
  var msAccelerator: js.UndefOr[MsAcceleratorProperty] = js.native
  
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position>`
    *
    * **Initial value**: `auto`
    */
  var msAlignSelf: js.UndefOr[AlignSelfProperty] = js.native
  
  /**
    * The **`-ms-block-progression`** CSS property is a Microsoft extension that specifies the block progression and layout orientation.
    *
    * **Syntax**: `tb | rl | bt | lr`
    *
    * **Initial value**: `tb`
    */
  var msBlockProgression: js.UndefOr[MsBlockProgressionProperty] = js.native
  
  /**
    * The **`-ms-content-zoom-chaining`** CSS property is a Microsoft extension specifying the zoom behavior that occurs when a user hits the zoom limit during page manipulation.
    *
    * **Syntax**: `none | chained`
    *
    * **Initial value**: `none`
    */
  var msContentZoomChaining: js.UndefOr[MsContentZoomChainingProperty] = js.native
  
  /**
    * The **`-ms-content-zoom-limit-max`** CSS property is a Microsoft extension that specifies the selected elements' maximum zoom factor.
    *
    * **Syntax**: `<percentage>`
    *
    * **Initial value**: `400%`
    */
  var msContentZoomLimitMax: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`-ms-content-zoom-limit-min`** CSS property is a Microsoft extension that specifies the minimum zoom factor.
    *
    * **Syntax**: `<percentage>`
    *
    * **Initial value**: `100%`
    */
  var msContentZoomLimitMin: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`-ms-content-zoom-snap-points`** CSS property is a Microsoft extension that specifies where zoom snap-points are located.
    *
    * **Syntax**: `snapInterval( <percentage>, <percentage> ) | snapList( <percentage># )`
    *
    * **Initial value**: `snapInterval(0%, 100%)`
    */
  var msContentZoomSnapPoints: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`-ms-content-zoom-snap-type`** CSS property is a Microsoft extension that specifies how zooming is affected by defined snap-points.
    *
    * **Syntax**: `none | proximity | mandatory`
    *
    * **Initial value**: `none`
    */
  var msContentZoomSnapType: js.UndefOr[MsContentZoomSnapTypeProperty] = js.native
  
  /**
    * The **`-ms-content-zooming`** CSS property is a Microsoft extension that specifies whether zooming is enabled.
    *
    * **Syntax**: `none | zoom`
    *
    * **Initial value**: zoom for the top level element, none for all other elements
    */
  var msContentZooming: js.UndefOr[MsContentZoomingProperty] = js.native
  
  /**
    * The `-ms-filter` CSS property is a Microsoft extension that sets or retrieves the filter or collection of filters applied to an object.
    *
    * **Syntax**: `<string>`
    *
    * **Initial value**: "" (the empty string)
    */
  var msFilter: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Syntax**: `row | row-reverse | column | column-reverse`
    *
    * **Initial value**: `row`
    */
  var msFlexDirection: js.UndefOr[FlexDirectionProperty] = js.native
  
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    */
  var msFlexPositive: js.UndefOr[GlobalsNumber] = js.native
  
  /**
    * The **`-ms-flow-from`** CSS property is a Microsoft extension that gets or sets a value identifying a region container in the document that accepts the content flow from the data source.
    *
    * **Syntax**: `[ none | <custom-ident> ]#`
    *
    * **Initial value**: `none`
    */
  var msFlowFrom: js.UndefOr[MsFlowFromProperty] = js.native
  
  /**
    * The **`-ms-flow-into`** CSS property is a Microsoft extension that gets or sets a value identifying an iframe container in the document that serves as the region's data source.
    *
    * **Syntax**: `[ none | <custom-ident> ]#`
    *
    * **Initial value**: `none`
    */
  var msFlowInto: js.UndefOr[MsFlowIntoProperty] = js.native
  
  /**
    * The **`grid-template-columns`** CSS property defines the line names and track sizing functions of the grid columns.
    *
    * **Syntax**: `none | <track-list> | <auto-track-list>`
    *
    * **Initial value**: `none`
    */
  var msGridColumns: js.UndefOr[MsGridColumnsProperty[TLength]] = js.native
  
  /**
    * The **`grid-template-rows`** CSS property defines the line names and track sizing functions of the grid rows.
    *
    * **Syntax**: `none | <track-list> | <auto-track-list>`
    *
    * **Initial value**: `none`
    */
  var msGridRows: js.UndefOr[MsGridRowsProperty[TLength]] = js.native
  
  /**
    * The **`-ms-high-contrast-adjust`** CSS property is a Microsoft extension that gets or sets a value indicating whether to override any CSS properties that would have been set in high contrast mode.
    *
    * **Syntax**: `auto | none`
    *
    * **Initial value**: `auto`
    */
  var msHighContrastAdjust: js.UndefOr[MsHighContrastAdjustProperty] = js.native
  
  /**
    * The **`-ms-hyphenate-limit-chars`** CSS property is a Microsoft extension that specifies one to three values indicating the minimum number of characters in a hyphenated word. If the word does not meet the required minimum number of characters in the word, before the hyphen, or after the hyphen, then the word is not hyphenated.
    *
    * **Syntax**: `auto | <integer>{1,3}`
    *
    * **Initial value**: `auto`
    */
  var msHyphenateLimitChars: js.UndefOr[MsHyphenateLimitCharsProperty] = js.native
  
  /**
    * The **`-ms-hyphenate-limit-lines`** CSS property is a Microsoft extension specifying the maximum number of consecutive lines in an element that may be ended with a hyphenated word.
    *
    * **Syntax**: `no-limit | <integer>`
    *
    * **Initial value**: `no-limit`
    */
  var msHyphenateLimitLines: js.UndefOr[MsHyphenateLimitLinesProperty] = js.native
  
  /**
    * The `**-ms-hyphenate-limit-zone**` CSS property is a Microsoft extension specifying the width of the hyphenation zone.
    *
    * **Syntax**: `<percentage> | <length>`
    *
    * **Initial value**: `0`
    */
  var msHyphenateLimitZone: js.UndefOr[MsHyphenateLimitZoneProperty[TLength]] = js.native
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Syntax**: `none | manual | auto`
    *
    * **Initial value**: `manual`
    */
  var msHyphens: js.UndefOr[HyphensProperty] = js.native
  
  /**
    * The **`-ms-ime-align`** CSS property is a Microsoft extension aligning the Input Method Editor (IME) candidate window box relative to the element on which the IME composition is active. The extension is implemented in Microsoft Edge and Internet Explorer 11.
    *
    * **Syntax**: `auto | after`
    *
    * **Initial value**: `auto`
    */
  var msImeAlign: js.UndefOr[MsImeAlignProperty] = js.native
  
  /**
    * The CSS **`justify-self`** property set the way a box is justified inside its alignment container along the appropriate axis.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? [ <self-position> | left | right ]`
    *
    * **Initial value**: `auto`
    */
  var msJustifySelf: js.UndefOr[JustifySelfProperty] = js.native
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    */
  var msLineBreak: js.UndefOr[LineBreakProperty] = js.native
  
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `0`
    */
  var msOrder: js.UndefOr[GlobalsNumber] = js.native
  
  /**
    * The **`-ms-overflow-style`** CSS property is a Microsoft extension controlling the behavior of scrollbars when the content of an element overflows.
    *
    * **Syntax**: `auto | none | scrollbar | -ms-autohiding-scrollbar`
    *
    * **Initial value**: `auto`
    */
  var msOverflowStyle: js.UndefOr[MsOverflowStyleProperty] = js.native
  
  /**
    * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `visible`
    */
  var msOverflowX: js.UndefOr[OverflowXProperty] = js.native
  
  /**
    * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `visible`
    */
  var msOverflowY: js.UndefOr[OverflowYProperty] = js.native
  
  /**
    * The `**-ms-scroll-chaining**` CSS property is a Microsoft extension that specifies the scrolling behavior that occurs when a user hits the scroll limit during a manipulation.
    *
    * **Syntax**: `chained | none`
    *
    * **Initial value**: `chained`
    */
  var msScrollChaining: js.UndefOr[MsScrollChainingProperty] = js.native
  
  /**
    * The `**-ms-scroll-limit-x-max**` CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollLeft` property.
    *
    * **Syntax**: `auto | <length>`
    *
    * **Initial value**: `auto`
    */
  var msScrollLimitXMax: js.UndefOr[MsScrollLimitXMaxProperty[TLength]] = js.native
  
  /**
    * The **`-ms-scroll-limit-x-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollLeft` property.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var msScrollLimitXMin: js.UndefOr[MsScrollLimitXMinProperty[TLength]] = js.native
  
  /**
    * The **`-ms-scroll-limit-y-max`** CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollTop` property.
    *
    * **Syntax**: `auto | <length>`
    *
    * **Initial value**: `auto`
    */
  var msScrollLimitYMax: js.UndefOr[MsScrollLimitYMaxProperty[TLength]] = js.native
  
  /**
    * The **`-ms-scroll-limit-y-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollTop` property.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var msScrollLimitYMin: js.UndefOr[MsScrollLimitYMinProperty[TLength]] = js.native
  
  /**
    * The **`-ms-scroll-rails`** CSS property is a Microsoft extension that specifies whether scrolling locks to the primary axis of motion.
    *
    * **Syntax**: `none | railed`
    *
    * **Initial value**: `railed`
    */
  var msScrollRails: js.UndefOr[MsScrollRailsProperty] = js.native
  
  /**
    * The **`-ms-scroll-snap-points-x`** CSS property is a Microsoft extension that specifies where snap-points will be located along the x-axis.
    *
    * **Syntax**: `snapInterval( <length-percentage>, <length-percentage> ) | snapList( <length-percentage># )`
    *
    * **Initial value**: `snapInterval(0px, 100%)`
    */
  var msScrollSnapPointsX: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`-ms-scroll-snap-points-y`** CSS property is a Microsoft extension that specifies where snap-points will be located along the y-axis.
    *
    * **Syntax**: `snapInterval( <length-percentage>, <length-percentage> ) | snapList( <length-percentage># )`
    *
    * **Initial value**: `snapInterval(0px, 100%)`
    */
  var msScrollSnapPointsY: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Syntax**: `none | proximity | mandatory`
    *
    * **Initial value**: `none`
    */
  var msScrollSnapType: js.UndefOr[MsScrollSnapTypeProperty] = js.native
  
  /**
    * The **`-ms-scroll-translation`** CSS property is a Microsoft extension that specifies whether vertical-to-horizontal scroll wheel translation occurs on the specified element.
    *
    * **Syntax**: `none | vertical-to-horizontal`
    *
    * **Initial value**: `none`
    */
  var msScrollTranslation: js.UndefOr[MsScrollTranslationProperty] = js.native
  
  /**
    * The **`-ms-scrollbar-3dlight-color`** CSS property is a Microsoft extension specifying the color of the top and left edges of the scroll box and scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: depends on user agent
    */
  var msScrollbar3dlightColor: js.UndefOr[MsScrollbar3dlightColorProperty] = js.native
  
  /**
    * The **`-ms-scrollbar-arrow-color`** CSS property is a Microsoft extension that specifies the color of the arrow elements of a scroll arrow.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ButtonText`
    */
  var msScrollbarArrowColor: js.UndefOr[MsScrollbarArrowColorProperty] = js.native
  
  /**
    * The `**-ms-scrollbar-base-color**` CSS property is a Microsoft extension that specifies the base color of the main elements of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: depends on user agent
    */
  var msScrollbarBaseColor: js.UndefOr[MsScrollbarBaseColorProperty] = js.native
  
  /**
    * The **`-ms-scrollbar-darkshadow-color`** CSS property is a Microsoft extension that specifies the color of a scroll bar's gutter.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDDarkShadow`
    */
  var msScrollbarDarkshadowColor: js.UndefOr[MsScrollbarDarkshadowColorProperty] = js.native
  
  /**
    * The `**-ms-scrollbar-face-color**` CSS property is a Microsoft extension that specifies the color of the scroll box and scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDFace`
    */
  var msScrollbarFaceColor: js.UndefOr[MsScrollbarFaceColorProperty] = js.native
  
  /**
    * The `**-ms-scrollbar-highlight-color**` CSS property is a Microsoft extension that specifies the color of the slider tray, the top and left edges of the scroll box, and the scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDHighlight`
    */
  var msScrollbarHighlightColor: js.UndefOr[MsScrollbarHighlightColorProperty] = js.native
  
  /**
    * The **`-ms-scrollbar-shadow-color`** CSS property is a Microsoft extension that specifies the color of the bottom and right edges of the scroll box and scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDDarkShadow`
    */
  var msScrollbarShadowColor: js.UndefOr[MsScrollbarShadowColorProperty] = js.native
  
  /**
    * The **`-ms-text-autospace`** CSS property is a Microsoft extension that specifies the autospacing and narrow space width adjustment of text.
    *
    * **Syntax**: `none | ideograph-alpha | ideograph-numeric | ideograph-parenthesis | ideograph-space`
    *
    * **Initial value**: `none`
    */
  var msTextAutospace: js.UndefOr[MsTextAutospaceProperty] = js.native
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    */
  var msTextCombineHorizontal: js.UndefOr[TextCombineUprightProperty] = js.native
  
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
    *
    * **Initial value**: `clip`
    */
  var msTextOverflow: js.UndefOr[TextOverflowProperty] = js.native
  
  /**
    * The **`touch-action`** CSS property sets how a region can be manipulated by a touchscreen user (for example, by zooming features built into the browser).
    *
    * **Syntax**: `auto | none | [ [ pan-x | pan-left | pan-right ] || [ pan-y | pan-up | pan-down ] || pinch-zoom ] | manipulation`
    *
    * **Initial value**: `auto`
    */
  var msTouchAction: js.UndefOr[TouchActionProperty] = js.native
  
  /**
    * The **`-ms-touch-select`** CSS property is a Microsoft extension that toggles the gripper visual elements that enable touch text selection.
    *
    * **Syntax**: `grippers | none`
    *
    * **Initial value**: `grippers`
    */
  var msTouchSelect: js.UndefOr[MsTouchSelectProperty] = js.native
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    */
  var msTransform: js.UndefOr[TransformProperty] = js.native
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var msTransformOrigin: js.UndefOr[TransformOriginProperty[TLength]] = js.native
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var msTransitionDelay: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var msTransitionDuration: js.UndefOr[GlobalsString] = js.native
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    */
  var msTransitionProperty: js.UndefOr[TransitionPropertyProperty] = js.native
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var msTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty] = js.native
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `none | element | text`
    *
    * **Initial value**: `text`
    */
  var msUserSelect: js.UndefOr[MsUserSelectProperty] = js.native
  
  /**
    * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
    *
    * **Syntax**: `normal | break-all | keep-all | break-word`
    *
    * **Initial value**: `normal`
    */
  var msWordBreak: js.UndefOr[WordBreakProperty] = js.native
  
  /**
    * The **`-ms-wrap-flow`** CSS property is a Microsoft extension that specifies how exclusions impact inline content within block-level elements.
    *
    * **Syntax**: `auto | both | start | end | maximum | clear`
    *
    * **Initial value**: `auto`
    */
  var msWrapFlow: js.UndefOr[MsWrapFlowProperty] = js.native
  
  /**
    * The **`-ms-wrap-margin`** CSS property is a Microsoft extension that specifies a margin that offsets the inner wrap shape from other shapes.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var msWrapMargin: js.UndefOr[MsWrapMarginProperty[TLength]] = js.native
  
  /**
    * The **`-ms-wrap-through`** CSS property is a Microsoft extension that specifies how content should wrap around an exclusion element.
    *
    * **Syntax**: `wrap | none`
    *
    * **Initial value**: `wrap`
    */
  var msWrapThrough: js.UndefOr[MsWrapThroughProperty] = js.native
  
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
    *
    * **Initial value**: `horizontal-tb`
    */
  var msWritingMode: js.UndefOr[WritingModeProperty] = js.native
}
object VendorLonghandProperties {
  
  @scala.inline
  def apply[TLength](): VendorLonghandProperties[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorLonghandProperties[TLength]]
  }
  
  @scala.inline
  implicit class VendorLonghandPropertiesOps[Self <: VendorLonghandProperties[_], TLength] (val x: Self with VendorLonghandProperties[TLength]) extends AnyVal {
    
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
    def setMozAnimationDelay(value: GlobalsString): Self = this.set("MozAnimationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozAnimationDelay: Self = this.set("MozAnimationDelay", js.undefined)
    
    @scala.inline
    def setMozAnimationDirection(value: AnimationDirectionProperty): Self = this.set("MozAnimationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozAnimationDirection: Self = this.set("MozAnimationDirection", js.undefined)
    
    @scala.inline
    def setMozAnimationDuration(value: GlobalsString): Self = this.set("MozAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozAnimationDuration: Self = this.set("MozAnimationDuration", js.undefined)
    
    @scala.inline
    def setMozAnimationFillMode(value: AnimationFillModeProperty): Self = this.set("MozAnimationFillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozAnimationFillMode: Self = this.set("MozAnimationFillMode", js.undefined)
    
    @scala.inline
    def setMozAnimationIterationCount(value: AnimationIterationCountProperty): Self = this.set("MozAnimationIterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozAnimationIterationCount: Self = this.set("MozAnimationIterationCount", js.undefined)
    
    @scala.inline
    def setMozAnimationName(value: AnimationNameProperty): Self = this.set("MozAnimationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozAnimationName: Self = this.set("MozAnimationName", js.undefined)
    
    @scala.inline
    def setMozAnimationPlayState(value: AnimationPlayStateProperty): Self = this.set("MozAnimationPlayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozAnimationPlayState: Self = this.set("MozAnimationPlayState", js.undefined)
    
    @scala.inline
    def setMozAnimationTimingFunction(value: AnimationTimingFunctionProperty): Self = this.set("MozAnimationTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozAnimationTimingFunction: Self = this.set("MozAnimationTimingFunction", js.undefined)
    
    @scala.inline
    def setMozAppearance(value: MozAppearanceProperty): Self = this.set("MozAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozAppearance: Self = this.set("MozAppearance", js.undefined)
    
    @scala.inline
    def setMozBackfaceVisibility(value: BackfaceVisibilityProperty): Self = this.set("MozBackfaceVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBackfaceVisibility: Self = this.set("MozBackfaceVisibility", js.undefined)
    
    @scala.inline
    def setMozBorderBottomColors(value: MozBorderBottomColorsProperty): Self = this.set("MozBorderBottomColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderBottomColors: Self = this.set("MozBorderBottomColors", js.undefined)
    
    @scala.inline
    def setMozBorderEndColor(value: BorderInlineEndColorProperty): Self = this.set("MozBorderEndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderEndColor: Self = this.set("MozBorderEndColor", js.undefined)
    
    @scala.inline
    def setMozBorderEndStyle(value: BorderInlineEndStyleProperty): Self = this.set("MozBorderEndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderEndStyle: Self = this.set("MozBorderEndStyle", js.undefined)
    
    @scala.inline
    def setMozBorderEndWidth(value: BorderInlineEndWidthProperty[TLength]): Self = this.set("MozBorderEndWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderEndWidth: Self = this.set("MozBorderEndWidth", js.undefined)
    
    @scala.inline
    def setMozBorderLeftColors(value: MozBorderLeftColorsProperty): Self = this.set("MozBorderLeftColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderLeftColors: Self = this.set("MozBorderLeftColors", js.undefined)
    
    @scala.inline
    def setMozBorderRightColors(value: MozBorderRightColorsProperty): Self = this.set("MozBorderRightColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderRightColors: Self = this.set("MozBorderRightColors", js.undefined)
    
    @scala.inline
    def setMozBorderStartColor(value: BorderInlineStartColorProperty): Self = this.set("MozBorderStartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderStartColor: Self = this.set("MozBorderStartColor", js.undefined)
    
    @scala.inline
    def setMozBorderStartStyle(value: BorderInlineStartStyleProperty): Self = this.set("MozBorderStartStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderStartStyle: Self = this.set("MozBorderStartStyle", js.undefined)
    
    @scala.inline
    def setMozBorderTopColors(value: MozBorderTopColorsProperty): Self = this.set("MozBorderTopColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBorderTopColors: Self = this.set("MozBorderTopColors", js.undefined)
    
    @scala.inline
    def setMozBoxSizing(value: BoxSizingProperty): Self = this.set("MozBoxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozBoxSizing: Self = this.set("MozBoxSizing", js.undefined)
    
    @scala.inline
    def setMozColumnCount(value: ColumnCountProperty): Self = this.set("MozColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozColumnCount: Self = this.set("MozColumnCount", js.undefined)
    
    @scala.inline
    def setMozColumnFill(value: ColumnFillProperty): Self = this.set("MozColumnFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozColumnFill: Self = this.set("MozColumnFill", js.undefined)
    
    @scala.inline
    def setMozColumnGap(value: ColumnGapProperty[TLength]): Self = this.set("MozColumnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozColumnGap: Self = this.set("MozColumnGap", js.undefined)
    
    @scala.inline
    def setMozColumnRuleColor(value: ColumnRuleColorProperty): Self = this.set("MozColumnRuleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozColumnRuleColor: Self = this.set("MozColumnRuleColor", js.undefined)
    
    @scala.inline
    def setMozColumnRuleStyle(value: ColumnRuleStyleProperty): Self = this.set("MozColumnRuleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozColumnRuleStyle: Self = this.set("MozColumnRuleStyle", js.undefined)
    
    @scala.inline
    def setMozColumnRuleWidth(value: ColumnRuleWidthProperty[TLength]): Self = this.set("MozColumnRuleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozColumnRuleWidth: Self = this.set("MozColumnRuleWidth", js.undefined)
    
    @scala.inline
    def setMozColumnWidth(value: ColumnWidthProperty[TLength]): Self = this.set("MozColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozColumnWidth: Self = this.set("MozColumnWidth", js.undefined)
    
    @scala.inline
    def setMozContextProperties(value: MozContextPropertiesProperty): Self = this.set("MozContextProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozContextProperties: Self = this.set("MozContextProperties", js.undefined)
    
    @scala.inline
    def setMozFontFeatureSettings(value: FontFeatureSettingsProperty): Self = this.set("MozFontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozFontFeatureSettings: Self = this.set("MozFontFeatureSettings", js.undefined)
    
    @scala.inline
    def setMozFontLanguageOverride(value: FontLanguageOverrideProperty): Self = this.set("MozFontLanguageOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozFontLanguageOverride: Self = this.set("MozFontLanguageOverride", js.undefined)
    
    @scala.inline
    def setMozHyphens(value: HyphensProperty): Self = this.set("MozHyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozHyphens: Self = this.set("MozHyphens", js.undefined)
    
    @scala.inline
    def setMozImageRegion(value: MozImageRegionProperty): Self = this.set("MozImageRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozImageRegion: Self = this.set("MozImageRegion", js.undefined)
    
    @scala.inline
    def setMozMarginEnd(value: MarginInlineEndProperty[TLength]): Self = this.set("MozMarginEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozMarginEnd: Self = this.set("MozMarginEnd", js.undefined)
    
    @scala.inline
    def setMozMarginStart(value: MarginInlineStartProperty[TLength]): Self = this.set("MozMarginStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozMarginStart: Self = this.set("MozMarginStart", js.undefined)
    
    @scala.inline
    def setMozOrient(value: MozOrientProperty): Self = this.set("MozOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozOrient: Self = this.set("MozOrient", js.undefined)
    
    @scala.inline
    def setMozOsxFontSmoothing(value: FontSmoothProperty[TLength]): Self = this.set("MozOsxFontSmoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozOsxFontSmoothing: Self = this.set("MozOsxFontSmoothing", js.undefined)
    
    @scala.inline
    def setMozPaddingEnd(value: PaddingInlineEndProperty[TLength]): Self = this.set("MozPaddingEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozPaddingEnd: Self = this.set("MozPaddingEnd", js.undefined)
    
    @scala.inline
    def setMozPaddingStart(value: PaddingInlineStartProperty[TLength]): Self = this.set("MozPaddingStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozPaddingStart: Self = this.set("MozPaddingStart", js.undefined)
    
    @scala.inline
    def setMozPerspective(value: PerspectiveProperty[TLength]): Self = this.set("MozPerspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozPerspective: Self = this.set("MozPerspective", js.undefined)
    
    @scala.inline
    def setMozPerspectiveOrigin(value: PerspectiveOriginProperty[TLength]): Self = this.set("MozPerspectiveOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozPerspectiveOrigin: Self = this.set("MozPerspectiveOrigin", js.undefined)
    
    @scala.inline
    def setMozStackSizing(value: MozStackSizingProperty): Self = this.set("MozStackSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozStackSizing: Self = this.set("MozStackSizing", js.undefined)
    
    @scala.inline
    def setMozTabSize(value: TabSizeProperty[TLength]): Self = this.set("MozTabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTabSize: Self = this.set("MozTabSize", js.undefined)
    
    @scala.inline
    def setMozTextBlink(value: MozTextBlinkProperty): Self = this.set("MozTextBlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTextBlink: Self = this.set("MozTextBlink", js.undefined)
    
    @scala.inline
    def setMozTextSizeAdjust(value: TextSizeAdjustProperty): Self = this.set("MozTextSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTextSizeAdjust: Self = this.set("MozTextSizeAdjust", js.undefined)
    
    @scala.inline
    def setMozTransformOrigin(value: TransformOriginProperty[TLength]): Self = this.set("MozTransformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTransformOrigin: Self = this.set("MozTransformOrigin", js.undefined)
    
    @scala.inline
    def setMozTransformStyle(value: TransformStyleProperty): Self = this.set("MozTransformStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTransformStyle: Self = this.set("MozTransformStyle", js.undefined)
    
    @scala.inline
    def setMozTransitionDelay(value: GlobalsString): Self = this.set("MozTransitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTransitionDelay: Self = this.set("MozTransitionDelay", js.undefined)
    
    @scala.inline
    def setMozTransitionDuration(value: GlobalsString): Self = this.set("MozTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTransitionDuration: Self = this.set("MozTransitionDuration", js.undefined)
    
    @scala.inline
    def setMozTransitionProperty(value: TransitionPropertyProperty): Self = this.set("MozTransitionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTransitionProperty: Self = this.set("MozTransitionProperty", js.undefined)
    
    @scala.inline
    def setMozTransitionTimingFunction(value: TransitionTimingFunctionProperty): Self = this.set("MozTransitionTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozTransitionTimingFunction: Self = this.set("MozTransitionTimingFunction", js.undefined)
    
    @scala.inline
    def setMozUserFocus(value: MozUserFocusProperty): Self = this.set("MozUserFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozUserFocus: Self = this.set("MozUserFocus", js.undefined)
    
    @scala.inline
    def setMozUserModify(value: MozUserModifyProperty): Self = this.set("MozUserModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozUserModify: Self = this.set("MozUserModify", js.undefined)
    
    @scala.inline
    def setMozUserSelect(value: UserSelectProperty): Self = this.set("MozUserSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozUserSelect: Self = this.set("MozUserSelect", js.undefined)
    
    @scala.inline
    def setMozWindowDragging(value: MozWindowDraggingProperty): Self = this.set("MozWindowDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozWindowDragging: Self = this.set("MozWindowDragging", js.undefined)
    
    @scala.inline
    def setMozWindowShadow(value: MozWindowShadowProperty): Self = this.set("MozWindowShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMozWindowShadow: Self = this.set("MozWindowShadow", js.undefined)
    
    @scala.inline
    def setOObjectFit(value: ObjectFitProperty): Self = this.set("OObjectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOObjectFit: Self = this.set("OObjectFit", js.undefined)
    
    @scala.inline
    def setOObjectPosition(value: ObjectPositionProperty[TLength]): Self = this.set("OObjectPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOObjectPosition: Self = this.set("OObjectPosition", js.undefined)
    
    @scala.inline
    def setOTabSize(value: TabSizeProperty[TLength]): Self = this.set("OTabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOTabSize: Self = this.set("OTabSize", js.undefined)
    
    @scala.inline
    def setOTextOverflow(value: TextOverflowProperty): Self = this.set("OTextOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOTextOverflow: Self = this.set("OTextOverflow", js.undefined)
    
    @scala.inline
    def setOTransformOrigin(value: TransformOriginProperty[TLength]): Self = this.set("OTransformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOTransformOrigin: Self = this.set("OTransformOrigin", js.undefined)
    
    @scala.inline
    def setWebkitAlignContent(value: AlignContentProperty): Self = this.set("WebkitAlignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAlignContent: Self = this.set("WebkitAlignContent", js.undefined)
    
    @scala.inline
    def setWebkitAlignItems(value: AlignItemsProperty): Self = this.set("WebkitAlignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAlignItems: Self = this.set("WebkitAlignItems", js.undefined)
    
    @scala.inline
    def setWebkitAlignSelf(value: AlignSelfProperty): Self = this.set("WebkitAlignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAlignSelf: Self = this.set("WebkitAlignSelf", js.undefined)
    
    @scala.inline
    def setWebkitAnimationDelay(value: GlobalsString): Self = this.set("WebkitAnimationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAnimationDelay: Self = this.set("WebkitAnimationDelay", js.undefined)
    
    @scala.inline
    def setWebkitAnimationDirection(value: AnimationDirectionProperty): Self = this.set("WebkitAnimationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAnimationDirection: Self = this.set("WebkitAnimationDirection", js.undefined)
    
    @scala.inline
    def setWebkitAnimationDuration(value: GlobalsString): Self = this.set("WebkitAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAnimationDuration: Self = this.set("WebkitAnimationDuration", js.undefined)
    
    @scala.inline
    def setWebkitAnimationFillMode(value: AnimationFillModeProperty): Self = this.set("WebkitAnimationFillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAnimationFillMode: Self = this.set("WebkitAnimationFillMode", js.undefined)
    
    @scala.inline
    def setWebkitAnimationIterationCount(value: AnimationIterationCountProperty): Self = this.set("WebkitAnimationIterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAnimationIterationCount: Self = this.set("WebkitAnimationIterationCount", js.undefined)
    
    @scala.inline
    def setWebkitAnimationName(value: AnimationNameProperty): Self = this.set("WebkitAnimationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAnimationName: Self = this.set("WebkitAnimationName", js.undefined)
    
    @scala.inline
    def setWebkitAnimationPlayState(value: AnimationPlayStateProperty): Self = this.set("WebkitAnimationPlayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAnimationPlayState: Self = this.set("WebkitAnimationPlayState", js.undefined)
    
    @scala.inline
    def setWebkitAnimationTimingFunction(value: AnimationTimingFunctionProperty): Self = this.set("WebkitAnimationTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAnimationTimingFunction: Self = this.set("WebkitAnimationTimingFunction", js.undefined)
    
    @scala.inline
    def setWebkitAppearance(value: WebkitAppearanceProperty): Self = this.set("WebkitAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitAppearance: Self = this.set("WebkitAppearance", js.undefined)
    
    @scala.inline
    def setWebkitBackdropFilter(value: BackdropFilterProperty): Self = this.set("WebkitBackdropFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBackdropFilter: Self = this.set("WebkitBackdropFilter", js.undefined)
    
    @scala.inline
    def setWebkitBackfaceVisibility(value: BackfaceVisibilityProperty): Self = this.set("WebkitBackfaceVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBackfaceVisibility: Self = this.set("WebkitBackfaceVisibility", js.undefined)
    
    @scala.inline
    def setWebkitBackgroundClip(value: BackgroundClipProperty): Self = this.set("WebkitBackgroundClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBackgroundClip: Self = this.set("WebkitBackgroundClip", js.undefined)
    
    @scala.inline
    def setWebkitBackgroundOrigin(value: BackgroundOriginProperty): Self = this.set("WebkitBackgroundOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBackgroundOrigin: Self = this.set("WebkitBackgroundOrigin", js.undefined)
    
    @scala.inline
    def setWebkitBackgroundSize(value: BackgroundSizeProperty[TLength]): Self = this.set("WebkitBackgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBackgroundSize: Self = this.set("WebkitBackgroundSize", js.undefined)
    
    @scala.inline
    def setWebkitBorderBeforeColor(value: WebkitBorderBeforeColorProperty): Self = this.set("WebkitBorderBeforeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBorderBeforeColor: Self = this.set("WebkitBorderBeforeColor", js.undefined)
    
    @scala.inline
    def setWebkitBorderBeforeStyle(value: WebkitBorderBeforeStyleProperty): Self = this.set("WebkitBorderBeforeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBorderBeforeStyle: Self = this.set("WebkitBorderBeforeStyle", js.undefined)
    
    @scala.inline
    def setWebkitBorderBeforeWidth(value: WebkitBorderBeforeWidthProperty[TLength]): Self = this.set("WebkitBorderBeforeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBorderBeforeWidth: Self = this.set("WebkitBorderBeforeWidth", js.undefined)
    
    @scala.inline
    def setWebkitBorderBottomLeftRadius(value: BorderBottomLeftRadiusProperty[TLength]): Self = this.set("WebkitBorderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBorderBottomLeftRadius: Self = this.set("WebkitBorderBottomLeftRadius", js.undefined)
    
    @scala.inline
    def setWebkitBorderBottomRightRadius(value: BorderBottomRightRadiusProperty[TLength]): Self = this.set("WebkitBorderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBorderBottomRightRadius: Self = this.set("WebkitBorderBottomRightRadius", js.undefined)
    
    @scala.inline
    def setWebkitBorderImageSlice(value: BorderImageSliceProperty): Self = this.set("WebkitBorderImageSlice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBorderImageSlice: Self = this.set("WebkitBorderImageSlice", js.undefined)
    
    @scala.inline
    def setWebkitBorderTopLeftRadius(value: BorderTopLeftRadiusProperty[TLength]): Self = this.set("WebkitBorderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBorderTopLeftRadius: Self = this.set("WebkitBorderTopLeftRadius", js.undefined)
    
    @scala.inline
    def setWebkitBorderTopRightRadius(value: BorderTopRightRadiusProperty[TLength]): Self = this.set("WebkitBorderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBorderTopRightRadius: Self = this.set("WebkitBorderTopRightRadius", js.undefined)
    
    @scala.inline
    def setWebkitBoxDecorationBreak(value: BoxDecorationBreakProperty): Self = this.set("WebkitBoxDecorationBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxDecorationBreak: Self = this.set("WebkitBoxDecorationBreak", js.undefined)
    
    @scala.inline
    def setWebkitBoxReflect(value: WebkitBoxReflectProperty[TLength]): Self = this.set("WebkitBoxReflect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxReflect: Self = this.set("WebkitBoxReflect", js.undefined)
    
    @scala.inline
    def setWebkitBoxShadow(value: BoxShadowProperty): Self = this.set("WebkitBoxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxShadow: Self = this.set("WebkitBoxShadow", js.undefined)
    
    @scala.inline
    def setWebkitBoxSizing(value: BoxSizingProperty): Self = this.set("WebkitBoxSizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitBoxSizing: Self = this.set("WebkitBoxSizing", js.undefined)
    
    @scala.inline
    def setWebkitClipPath(value: ClipPathProperty): Self = this.set("WebkitClipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitClipPath: Self = this.set("WebkitClipPath", js.undefined)
    
    @scala.inline
    def setWebkitColumnCount(value: ColumnCountProperty): Self = this.set("WebkitColumnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitColumnCount: Self = this.set("WebkitColumnCount", js.undefined)
    
    @scala.inline
    def setWebkitColumnFill(value: ColumnFillProperty): Self = this.set("WebkitColumnFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitColumnFill: Self = this.set("WebkitColumnFill", js.undefined)
    
    @scala.inline
    def setWebkitColumnGap(value: ColumnGapProperty[TLength]): Self = this.set("WebkitColumnGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitColumnGap: Self = this.set("WebkitColumnGap", js.undefined)
    
    @scala.inline
    def setWebkitColumnRuleColor(value: ColumnRuleColorProperty): Self = this.set("WebkitColumnRuleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitColumnRuleColor: Self = this.set("WebkitColumnRuleColor", js.undefined)
    
    @scala.inline
    def setWebkitColumnRuleStyle(value: ColumnRuleStyleProperty): Self = this.set("WebkitColumnRuleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitColumnRuleStyle: Self = this.set("WebkitColumnRuleStyle", js.undefined)
    
    @scala.inline
    def setWebkitColumnRuleWidth(value: ColumnRuleWidthProperty[TLength]): Self = this.set("WebkitColumnRuleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitColumnRuleWidth: Self = this.set("WebkitColumnRuleWidth", js.undefined)
    
    @scala.inline
    def setWebkitColumnSpan(value: ColumnSpanProperty): Self = this.set("WebkitColumnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitColumnSpan: Self = this.set("WebkitColumnSpan", js.undefined)
    
    @scala.inline
    def setWebkitColumnWidth(value: ColumnWidthProperty[TLength]): Self = this.set("WebkitColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitColumnWidth: Self = this.set("WebkitColumnWidth", js.undefined)
    
    @scala.inline
    def setWebkitFilter(value: FilterProperty): Self = this.set("WebkitFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFilter: Self = this.set("WebkitFilter", js.undefined)
    
    @scala.inline
    def setWebkitFlexBasis(value: FlexBasisProperty[TLength]): Self = this.set("WebkitFlexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFlexBasis: Self = this.set("WebkitFlexBasis", js.undefined)
    
    @scala.inline
    def setWebkitFlexDirection(value: FlexDirectionProperty): Self = this.set("WebkitFlexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFlexDirection: Self = this.set("WebkitFlexDirection", js.undefined)
    
    @scala.inline
    def setWebkitFlexGrow(value: GlobalsNumber): Self = this.set("WebkitFlexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFlexGrow: Self = this.set("WebkitFlexGrow", js.undefined)
    
    @scala.inline
    def setWebkitFlexShrink(value: GlobalsNumber): Self = this.set("WebkitFlexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFlexShrink: Self = this.set("WebkitFlexShrink", js.undefined)
    
    @scala.inline
    def setWebkitFlexWrap(value: FlexWrapProperty): Self = this.set("WebkitFlexWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFlexWrap: Self = this.set("WebkitFlexWrap", js.undefined)
    
    @scala.inline
    def setWebkitFontFeatureSettings(value: FontFeatureSettingsProperty): Self = this.set("WebkitFontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFontFeatureSettings: Self = this.set("WebkitFontFeatureSettings", js.undefined)
    
    @scala.inline
    def setWebkitFontKerning(value: FontKerningProperty): Self = this.set("WebkitFontKerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFontKerning: Self = this.set("WebkitFontKerning", js.undefined)
    
    @scala.inline
    def setWebkitFontSmoothing(value: FontSmoothProperty[TLength]): Self = this.set("WebkitFontSmoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFontSmoothing: Self = this.set("WebkitFontSmoothing", js.undefined)
    
    @scala.inline
    def setWebkitFontVariantLigatures(value: FontVariantLigaturesProperty): Self = this.set("WebkitFontVariantLigatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitFontVariantLigatures: Self = this.set("WebkitFontVariantLigatures", js.undefined)
    
    @scala.inline
    def setWebkitHyphens(value: HyphensProperty): Self = this.set("WebkitHyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitHyphens: Self = this.set("WebkitHyphens", js.undefined)
    
    @scala.inline
    def setWebkitJustifyContent(value: JustifyContentProperty): Self = this.set("WebkitJustifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitJustifyContent: Self = this.set("WebkitJustifyContent", js.undefined)
    
    @scala.inline
    def setWebkitLineBreak(value: LineBreakProperty): Self = this.set("WebkitLineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitLineBreak: Self = this.set("WebkitLineBreak", js.undefined)
    
    @scala.inline
    def setWebkitLineClamp(value: WebkitLineClampProperty): Self = this.set("WebkitLineClamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitLineClamp: Self = this.set("WebkitLineClamp", js.undefined)
    
    @scala.inline
    def setWebkitMarginEnd(value: MarginInlineEndProperty[TLength]): Self = this.set("WebkitMarginEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMarginEnd: Self = this.set("WebkitMarginEnd", js.undefined)
    
    @scala.inline
    def setWebkitMarginStart(value: MarginInlineStartProperty[TLength]): Self = this.set("WebkitMarginStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMarginStart: Self = this.set("WebkitMarginStart", js.undefined)
    
    @scala.inline
    def setWebkitMaskAttachment(value: WebkitMaskAttachmentProperty): Self = this.set("WebkitMaskAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskAttachment: Self = this.set("WebkitMaskAttachment", js.undefined)
    
    @scala.inline
    def setWebkitMaskClip(value: WebkitMaskClipProperty): Self = this.set("WebkitMaskClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskClip: Self = this.set("WebkitMaskClip", js.undefined)
    
    @scala.inline
    def setWebkitMaskComposite(value: WebkitMaskCompositeProperty): Self = this.set("WebkitMaskComposite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskComposite: Self = this.set("WebkitMaskComposite", js.undefined)
    
    @scala.inline
    def setWebkitMaskImage(value: WebkitMaskImageProperty): Self = this.set("WebkitMaskImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskImage: Self = this.set("WebkitMaskImage", js.undefined)
    
    @scala.inline
    def setWebkitMaskOrigin(value: WebkitMaskOriginProperty): Self = this.set("WebkitMaskOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskOrigin: Self = this.set("WebkitMaskOrigin", js.undefined)
    
    @scala.inline
    def setWebkitMaskPosition(value: WebkitMaskPositionProperty[TLength]): Self = this.set("WebkitMaskPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskPosition: Self = this.set("WebkitMaskPosition", js.undefined)
    
    @scala.inline
    def setWebkitMaskPositionX(value: WebkitMaskPositionXProperty[TLength]): Self = this.set("WebkitMaskPositionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskPositionX: Self = this.set("WebkitMaskPositionX", js.undefined)
    
    @scala.inline
    def setWebkitMaskPositionY(value: WebkitMaskPositionYProperty[TLength]): Self = this.set("WebkitMaskPositionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskPositionY: Self = this.set("WebkitMaskPositionY", js.undefined)
    
    @scala.inline
    def setWebkitMaskRepeat(value: WebkitMaskRepeatProperty): Self = this.set("WebkitMaskRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskRepeat: Self = this.set("WebkitMaskRepeat", js.undefined)
    
    @scala.inline
    def setWebkitMaskRepeatX(value: WebkitMaskRepeatXProperty): Self = this.set("WebkitMaskRepeatX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskRepeatX: Self = this.set("WebkitMaskRepeatX", js.undefined)
    
    @scala.inline
    def setWebkitMaskRepeatY(value: WebkitMaskRepeatYProperty): Self = this.set("WebkitMaskRepeatY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskRepeatY: Self = this.set("WebkitMaskRepeatY", js.undefined)
    
    @scala.inline
    def setWebkitMaskSize(value: WebkitMaskSizeProperty[TLength]): Self = this.set("WebkitMaskSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaskSize: Self = this.set("WebkitMaskSize", js.undefined)
    
    @scala.inline
    def setWebkitMaxInlineSize(value: MaxInlineSizeProperty[TLength]): Self = this.set("WebkitMaxInlineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitMaxInlineSize: Self = this.set("WebkitMaxInlineSize", js.undefined)
    
    @scala.inline
    def setWebkitOrder(value: GlobalsNumber): Self = this.set("WebkitOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitOrder: Self = this.set("WebkitOrder", js.undefined)
    
    @scala.inline
    def setWebkitOverflowScrolling(value: WebkitOverflowScrollingProperty): Self = this.set("WebkitOverflowScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitOverflowScrolling: Self = this.set("WebkitOverflowScrolling", js.undefined)
    
    @scala.inline
    def setWebkitPaddingEnd(value: PaddingInlineEndProperty[TLength]): Self = this.set("WebkitPaddingEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitPaddingEnd: Self = this.set("WebkitPaddingEnd", js.undefined)
    
    @scala.inline
    def setWebkitPaddingStart(value: PaddingInlineStartProperty[TLength]): Self = this.set("WebkitPaddingStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitPaddingStart: Self = this.set("WebkitPaddingStart", js.undefined)
    
    @scala.inline
    def setWebkitPerspective(value: PerspectiveProperty[TLength]): Self = this.set("WebkitPerspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitPerspective: Self = this.set("WebkitPerspective", js.undefined)
    
    @scala.inline
    def setWebkitPerspectiveOrigin(value: PerspectiveOriginProperty[TLength]): Self = this.set("WebkitPerspectiveOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitPerspectiveOrigin: Self = this.set("WebkitPerspectiveOrigin", js.undefined)
    
    @scala.inline
    def setWebkitPrintColorAdjust(value: ColorAdjustProperty): Self = this.set("WebkitPrintColorAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitPrintColorAdjust: Self = this.set("WebkitPrintColorAdjust", js.undefined)
    
    @scala.inline
    def setWebkitRubyPosition(value: RubyPositionProperty): Self = this.set("WebkitRubyPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitRubyPosition: Self = this.set("WebkitRubyPosition", js.undefined)
    
    @scala.inline
    def setWebkitScrollSnapType(value: ScrollSnapTypeProperty): Self = this.set("WebkitScrollSnapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitScrollSnapType: Self = this.set("WebkitScrollSnapType", js.undefined)
    
    @scala.inline
    def setWebkitShapeMargin(value: ShapeMarginProperty[TLength]): Self = this.set("WebkitShapeMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitShapeMargin: Self = this.set("WebkitShapeMargin", js.undefined)
    
    @scala.inline
    def setWebkitTapHighlightColor(value: WebkitTapHighlightColorProperty): Self = this.set("WebkitTapHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTapHighlightColor: Self = this.set("WebkitTapHighlightColor", js.undefined)
    
    @scala.inline
    def setWebkitTextCombine(value: TextCombineUprightProperty): Self = this.set("WebkitTextCombine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextCombine: Self = this.set("WebkitTextCombine", js.undefined)
    
    @scala.inline
    def setWebkitTextDecorationColor(value: TextDecorationColorProperty): Self = this.set("WebkitTextDecorationColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextDecorationColor: Self = this.set("WebkitTextDecorationColor", js.undefined)
    
    @scala.inline
    def setWebkitTextDecorationLine(value: TextDecorationLineProperty): Self = this.set("WebkitTextDecorationLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextDecorationLine: Self = this.set("WebkitTextDecorationLine", js.undefined)
    
    @scala.inline
    def setWebkitTextDecorationSkip(value: TextDecorationSkipProperty): Self = this.set("WebkitTextDecorationSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextDecorationSkip: Self = this.set("WebkitTextDecorationSkip", js.undefined)
    
    @scala.inline
    def setWebkitTextDecorationStyle(value: TextDecorationStyleProperty): Self = this.set("WebkitTextDecorationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextDecorationStyle: Self = this.set("WebkitTextDecorationStyle", js.undefined)
    
    @scala.inline
    def setWebkitTextEmphasisColor(value: TextEmphasisColorProperty): Self = this.set("WebkitTextEmphasisColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextEmphasisColor: Self = this.set("WebkitTextEmphasisColor", js.undefined)
    
    @scala.inline
    def setWebkitTextEmphasisPosition(value: GlobalsString): Self = this.set("WebkitTextEmphasisPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextEmphasisPosition: Self = this.set("WebkitTextEmphasisPosition", js.undefined)
    
    @scala.inline
    def setWebkitTextEmphasisStyle(value: TextEmphasisStyleProperty): Self = this.set("WebkitTextEmphasisStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextEmphasisStyle: Self = this.set("WebkitTextEmphasisStyle", js.undefined)
    
    @scala.inline
    def setWebkitTextFillColor(value: WebkitTextFillColorProperty): Self = this.set("WebkitTextFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextFillColor: Self = this.set("WebkitTextFillColor", js.undefined)
    
    @scala.inline
    def setWebkitTextOrientation(value: TextOrientationProperty): Self = this.set("WebkitTextOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextOrientation: Self = this.set("WebkitTextOrientation", js.undefined)
    
    @scala.inline
    def setWebkitTextSizeAdjust(value: TextSizeAdjustProperty): Self = this.set("WebkitTextSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextSizeAdjust: Self = this.set("WebkitTextSizeAdjust", js.undefined)
    
    @scala.inline
    def setWebkitTextStrokeColor(value: WebkitTextStrokeColorProperty): Self = this.set("WebkitTextStrokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextStrokeColor: Self = this.set("WebkitTextStrokeColor", js.undefined)
    
    @scala.inline
    def setWebkitTextStrokeWidth(value: WebkitTextStrokeWidthProperty[TLength]): Self = this.set("WebkitTextStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextStrokeWidth: Self = this.set("WebkitTextStrokeWidth", js.undefined)
    
    @scala.inline
    def setWebkitTextUnderlinePosition(value: TextUnderlinePositionProperty): Self = this.set("WebkitTextUnderlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTextUnderlinePosition: Self = this.set("WebkitTextUnderlinePosition", js.undefined)
    
    @scala.inline
    def setWebkitTouchCallout(value: WebkitTouchCalloutProperty): Self = this.set("WebkitTouchCallout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTouchCallout: Self = this.set("WebkitTouchCallout", js.undefined)
    
    @scala.inline
    def setWebkitTransform(value: TransformProperty): Self = this.set("WebkitTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTransform: Self = this.set("WebkitTransform", js.undefined)
    
    @scala.inline
    def setWebkitTransformOrigin(value: TransformOriginProperty[TLength]): Self = this.set("WebkitTransformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTransformOrigin: Self = this.set("WebkitTransformOrigin", js.undefined)
    
    @scala.inline
    def setWebkitTransformStyle(value: TransformStyleProperty): Self = this.set("WebkitTransformStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTransformStyle: Self = this.set("WebkitTransformStyle", js.undefined)
    
    @scala.inline
    def setWebkitTransitionDelay(value: GlobalsString): Self = this.set("WebkitTransitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTransitionDelay: Self = this.set("WebkitTransitionDelay", js.undefined)
    
    @scala.inline
    def setWebkitTransitionDuration(value: GlobalsString): Self = this.set("WebkitTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTransitionDuration: Self = this.set("WebkitTransitionDuration", js.undefined)
    
    @scala.inline
    def setWebkitTransitionProperty(value: TransitionPropertyProperty): Self = this.set("WebkitTransitionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTransitionProperty: Self = this.set("WebkitTransitionProperty", js.undefined)
    
    @scala.inline
    def setWebkitTransitionTimingFunction(value: TransitionTimingFunctionProperty): Self = this.set("WebkitTransitionTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitTransitionTimingFunction: Self = this.set("WebkitTransitionTimingFunction", js.undefined)
    
    @scala.inline
    def setWebkitUserModify(value: WebkitUserModifyProperty): Self = this.set("WebkitUserModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitUserModify: Self = this.set("WebkitUserModify", js.undefined)
    
    @scala.inline
    def setWebkitUserSelect(value: UserSelectProperty): Self = this.set("WebkitUserSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitUserSelect: Self = this.set("WebkitUserSelect", js.undefined)
    
    @scala.inline
    def setWebkitWritingMode(value: WritingModeProperty): Self = this.set("WebkitWritingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebkitWritingMode: Self = this.set("WebkitWritingMode", js.undefined)
    
    @scala.inline
    def setMsAccelerator(value: MsAcceleratorProperty): Self = this.set("msAccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsAccelerator: Self = this.set("msAccelerator", js.undefined)
    
    @scala.inline
    def setMsAlignSelf(value: AlignSelfProperty): Self = this.set("msAlignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsAlignSelf: Self = this.set("msAlignSelf", js.undefined)
    
    @scala.inline
    def setMsBlockProgression(value: MsBlockProgressionProperty): Self = this.set("msBlockProgression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsBlockProgression: Self = this.set("msBlockProgression", js.undefined)
    
    @scala.inline
    def setMsContentZoomChaining(value: MsContentZoomChainingProperty): Self = this.set("msContentZoomChaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsContentZoomChaining: Self = this.set("msContentZoomChaining", js.undefined)
    
    @scala.inline
    def setMsContentZoomLimitMax(value: GlobalsString): Self = this.set("msContentZoomLimitMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsContentZoomLimitMax: Self = this.set("msContentZoomLimitMax", js.undefined)
    
    @scala.inline
    def setMsContentZoomLimitMin(value: GlobalsString): Self = this.set("msContentZoomLimitMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsContentZoomLimitMin: Self = this.set("msContentZoomLimitMin", js.undefined)
    
    @scala.inline
    def setMsContentZoomSnapPoints(value: GlobalsString): Self = this.set("msContentZoomSnapPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsContentZoomSnapPoints: Self = this.set("msContentZoomSnapPoints", js.undefined)
    
    @scala.inline
    def setMsContentZoomSnapType(value: MsContentZoomSnapTypeProperty): Self = this.set("msContentZoomSnapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsContentZoomSnapType: Self = this.set("msContentZoomSnapType", js.undefined)
    
    @scala.inline
    def setMsContentZooming(value: MsContentZoomingProperty): Self = this.set("msContentZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsContentZooming: Self = this.set("msContentZooming", js.undefined)
    
    @scala.inline
    def setMsFilter(value: GlobalsString): Self = this.set("msFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsFilter: Self = this.set("msFilter", js.undefined)
    
    @scala.inline
    def setMsFlexDirection(value: FlexDirectionProperty): Self = this.set("msFlexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsFlexDirection: Self = this.set("msFlexDirection", js.undefined)
    
    @scala.inline
    def setMsFlexPositive(value: GlobalsNumber): Self = this.set("msFlexPositive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsFlexPositive: Self = this.set("msFlexPositive", js.undefined)
    
    @scala.inline
    def setMsFlowFrom(value: MsFlowFromProperty): Self = this.set("msFlowFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsFlowFrom: Self = this.set("msFlowFrom", js.undefined)
    
    @scala.inline
    def setMsFlowInto(value: MsFlowIntoProperty): Self = this.set("msFlowInto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsFlowInto: Self = this.set("msFlowInto", js.undefined)
    
    @scala.inline
    def setMsGridColumns(value: MsGridColumnsProperty[TLength]): Self = this.set("msGridColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsGridColumns: Self = this.set("msGridColumns", js.undefined)
    
    @scala.inline
    def setMsGridRows(value: MsGridRowsProperty[TLength]): Self = this.set("msGridRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsGridRows: Self = this.set("msGridRows", js.undefined)
    
    @scala.inline
    def setMsHighContrastAdjust(value: MsHighContrastAdjustProperty): Self = this.set("msHighContrastAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsHighContrastAdjust: Self = this.set("msHighContrastAdjust", js.undefined)
    
    @scala.inline
    def setMsHyphenateLimitChars(value: MsHyphenateLimitCharsProperty): Self = this.set("msHyphenateLimitChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsHyphenateLimitChars: Self = this.set("msHyphenateLimitChars", js.undefined)
    
    @scala.inline
    def setMsHyphenateLimitLines(value: MsHyphenateLimitLinesProperty): Self = this.set("msHyphenateLimitLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsHyphenateLimitLines: Self = this.set("msHyphenateLimitLines", js.undefined)
    
    @scala.inline
    def setMsHyphenateLimitZone(value: MsHyphenateLimitZoneProperty[TLength]): Self = this.set("msHyphenateLimitZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsHyphenateLimitZone: Self = this.set("msHyphenateLimitZone", js.undefined)
    
    @scala.inline
    def setMsHyphens(value: HyphensProperty): Self = this.set("msHyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsHyphens: Self = this.set("msHyphens", js.undefined)
    
    @scala.inline
    def setMsImeAlign(value: MsImeAlignProperty): Self = this.set("msImeAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsImeAlign: Self = this.set("msImeAlign", js.undefined)
    
    @scala.inline
    def setMsJustifySelf(value: JustifySelfProperty): Self = this.set("msJustifySelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsJustifySelf: Self = this.set("msJustifySelf", js.undefined)
    
    @scala.inline
    def setMsLineBreak(value: LineBreakProperty): Self = this.set("msLineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsLineBreak: Self = this.set("msLineBreak", js.undefined)
    
    @scala.inline
    def setMsOrder(value: GlobalsNumber): Self = this.set("msOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsOrder: Self = this.set("msOrder", js.undefined)
    
    @scala.inline
    def setMsOverflowStyle(value: MsOverflowStyleProperty): Self = this.set("msOverflowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsOverflowStyle: Self = this.set("msOverflowStyle", js.undefined)
    
    @scala.inline
    def setMsOverflowX(value: OverflowXProperty): Self = this.set("msOverflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsOverflowX: Self = this.set("msOverflowX", js.undefined)
    
    @scala.inline
    def setMsOverflowY(value: OverflowYProperty): Self = this.set("msOverflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsOverflowY: Self = this.set("msOverflowY", js.undefined)
    
    @scala.inline
    def setMsScrollChaining(value: MsScrollChainingProperty): Self = this.set("msScrollChaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollChaining: Self = this.set("msScrollChaining", js.undefined)
    
    @scala.inline
    def setMsScrollLimitXMax(value: MsScrollLimitXMaxProperty[TLength]): Self = this.set("msScrollLimitXMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollLimitXMax: Self = this.set("msScrollLimitXMax", js.undefined)
    
    @scala.inline
    def setMsScrollLimitXMin(value: MsScrollLimitXMinProperty[TLength]): Self = this.set("msScrollLimitXMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollLimitXMin: Self = this.set("msScrollLimitXMin", js.undefined)
    
    @scala.inline
    def setMsScrollLimitYMax(value: MsScrollLimitYMaxProperty[TLength]): Self = this.set("msScrollLimitYMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollLimitYMax: Self = this.set("msScrollLimitYMax", js.undefined)
    
    @scala.inline
    def setMsScrollLimitYMin(value: MsScrollLimitYMinProperty[TLength]): Self = this.set("msScrollLimitYMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollLimitYMin: Self = this.set("msScrollLimitYMin", js.undefined)
    
    @scala.inline
    def setMsScrollRails(value: MsScrollRailsProperty): Self = this.set("msScrollRails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollRails: Self = this.set("msScrollRails", js.undefined)
    
    @scala.inline
    def setMsScrollSnapPointsX(value: GlobalsString): Self = this.set("msScrollSnapPointsX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollSnapPointsX: Self = this.set("msScrollSnapPointsX", js.undefined)
    
    @scala.inline
    def setMsScrollSnapPointsY(value: GlobalsString): Self = this.set("msScrollSnapPointsY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollSnapPointsY: Self = this.set("msScrollSnapPointsY", js.undefined)
    
    @scala.inline
    def setMsScrollSnapType(value: MsScrollSnapTypeProperty): Self = this.set("msScrollSnapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollSnapType: Self = this.set("msScrollSnapType", js.undefined)
    
    @scala.inline
    def setMsScrollTranslation(value: MsScrollTranslationProperty): Self = this.set("msScrollTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollTranslation: Self = this.set("msScrollTranslation", js.undefined)
    
    @scala.inline
    def setMsScrollbar3dlightColor(value: MsScrollbar3dlightColorProperty): Self = this.set("msScrollbar3dlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollbar3dlightColor: Self = this.set("msScrollbar3dlightColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarArrowColor(value: MsScrollbarArrowColorProperty): Self = this.set("msScrollbarArrowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollbarArrowColor: Self = this.set("msScrollbarArrowColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarBaseColor(value: MsScrollbarBaseColorProperty): Self = this.set("msScrollbarBaseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollbarBaseColor: Self = this.set("msScrollbarBaseColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarDarkshadowColor(value: MsScrollbarDarkshadowColorProperty): Self = this.set("msScrollbarDarkshadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollbarDarkshadowColor: Self = this.set("msScrollbarDarkshadowColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarFaceColor(value: MsScrollbarFaceColorProperty): Self = this.set("msScrollbarFaceColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollbarFaceColor: Self = this.set("msScrollbarFaceColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarHighlightColor(value: MsScrollbarHighlightColorProperty): Self = this.set("msScrollbarHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollbarHighlightColor: Self = this.set("msScrollbarHighlightColor", js.undefined)
    
    @scala.inline
    def setMsScrollbarShadowColor(value: MsScrollbarShadowColorProperty): Self = this.set("msScrollbarShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsScrollbarShadowColor: Self = this.set("msScrollbarShadowColor", js.undefined)
    
    @scala.inline
    def setMsTextAutospace(value: MsTextAutospaceProperty): Self = this.set("msTextAutospace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTextAutospace: Self = this.set("msTextAutospace", js.undefined)
    
    @scala.inline
    def setMsTextCombineHorizontal(value: TextCombineUprightProperty): Self = this.set("msTextCombineHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTextCombineHorizontal: Self = this.set("msTextCombineHorizontal", js.undefined)
    
    @scala.inline
    def setMsTextOverflow(value: TextOverflowProperty): Self = this.set("msTextOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTextOverflow: Self = this.set("msTextOverflow", js.undefined)
    
    @scala.inline
    def setMsTouchAction(value: TouchActionProperty): Self = this.set("msTouchAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTouchAction: Self = this.set("msTouchAction", js.undefined)
    
    @scala.inline
    def setMsTouchSelect(value: MsTouchSelectProperty): Self = this.set("msTouchSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTouchSelect: Self = this.set("msTouchSelect", js.undefined)
    
    @scala.inline
    def setMsTransform(value: TransformProperty): Self = this.set("msTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTransform: Self = this.set("msTransform", js.undefined)
    
    @scala.inline
    def setMsTransformOrigin(value: TransformOriginProperty[TLength]): Self = this.set("msTransformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTransformOrigin: Self = this.set("msTransformOrigin", js.undefined)
    
    @scala.inline
    def setMsTransitionDelay(value: GlobalsString): Self = this.set("msTransitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTransitionDelay: Self = this.set("msTransitionDelay", js.undefined)
    
    @scala.inline
    def setMsTransitionDuration(value: GlobalsString): Self = this.set("msTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTransitionDuration: Self = this.set("msTransitionDuration", js.undefined)
    
    @scala.inline
    def setMsTransitionProperty(value: TransitionPropertyProperty): Self = this.set("msTransitionProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTransitionProperty: Self = this.set("msTransitionProperty", js.undefined)
    
    @scala.inline
    def setMsTransitionTimingFunction(value: TransitionTimingFunctionProperty): Self = this.set("msTransitionTimingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsTransitionTimingFunction: Self = this.set("msTransitionTimingFunction", js.undefined)
    
    @scala.inline
    def setMsUserSelect(value: MsUserSelectProperty): Self = this.set("msUserSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsUserSelect: Self = this.set("msUserSelect", js.undefined)
    
    @scala.inline
    def setMsWordBreak(value: WordBreakProperty): Self = this.set("msWordBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsWordBreak: Self = this.set("msWordBreak", js.undefined)
    
    @scala.inline
    def setMsWrapFlow(value: MsWrapFlowProperty): Self = this.set("msWrapFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsWrapFlow: Self = this.set("msWrapFlow", js.undefined)
    
    @scala.inline
    def setMsWrapMargin(value: MsWrapMarginProperty[TLength]): Self = this.set("msWrapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsWrapMargin: Self = this.set("msWrapMargin", js.undefined)
    
    @scala.inline
    def setMsWrapThrough(value: MsWrapThroughProperty): Self = this.set("msWrapThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsWrapThrough: Self = this.set("msWrapThrough", js.undefined)
    
    @scala.inline
    def setMsWritingMode(value: WritingModeProperty): Self = this.set("msWritingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsWritingMode: Self = this.set("msWritingMode", js.undefined)
  }
}
