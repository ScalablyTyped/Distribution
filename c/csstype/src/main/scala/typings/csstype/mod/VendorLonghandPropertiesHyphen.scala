package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VendorLonghandPropertiesHyphen[TLength] extends StObject {
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var `-moz-animation-delay`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    */
  var `-moz-animation-direction`: js.UndefOr[AnimationDirectionProperty] = js.undefined
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var `-moz-animation-duration`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    */
  var `-moz-animation-fill-mode`: js.UndefOr[AnimationFillModeProperty] = js.undefined
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    */
  var `-moz-animation-iteration-count`: js.UndefOr[AnimationIterationCountProperty] = js.undefined
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    */
  var `-moz-animation-name`: js.UndefOr[AnimationNameProperty] = js.undefined
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    */
  var `-moz-animation-play-state`: js.UndefOr[AnimationPlayStateProperty] = js.undefined
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var `-moz-animation-timing-function`: js.UndefOr[AnimationTimingFunctionProperty] = js.undefined
  
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Syntax**: `none | button | button-arrow-down | button-arrow-next | button-arrow-previous | button-arrow-up | button-bevel | button-focus | caret | checkbox | checkbox-container | checkbox-label | checkmenuitem | dualbutton | groupbox | listbox | listitem | menuarrow | menubar | menucheckbox | menuimage | menuitem | menuitemtext | menulist | menulist-button | menulist-text | menulist-textfield | menupopup | menuradio | menuseparator | meterbar | meterchunk | progressbar | progressbar-vertical | progresschunk | progresschunk-vertical | radio | radio-container | radio-label | radiomenuitem | range | range-thumb | resizer | resizerpanel | scale-horizontal | scalethumbend | scalethumb-horizontal | scalethumbstart | scalethumbtick | scalethumb-vertical | scale-vertical | scrollbarbutton-down | scrollbarbutton-left | scrollbarbutton-right | scrollbarbutton-up | scrollbarthumb-horizontal | scrollbarthumb-vertical | scrollbartrack-horizontal | scrollbartrack-vertical | searchfield | separator | sheet | spinner | spinner-downbutton | spinner-textfield | spinner-upbutton | splitter | statusbar | statusbarpanel | tab | tabpanel | tabpanels | tab-scroll-arrow-back | tab-scroll-arrow-forward | textfield | textfield-multiline | toolbar | toolbarbutton | toolbarbutton-dropdown | toolbargripper | toolbox | tooltip | treeheader | treeheadercell | treeheadersortarrow | treeitem | treeline | treetwisty | treetwistyopen | treeview | -moz-mac-unified-toolbar | -moz-win-borderless-glass | -moz-win-browsertabbar-toolbox | -moz-win-communicationstext | -moz-win-communications-toolbox | -moz-win-exclude-glass | -moz-win-glass | -moz-win-mediatext | -moz-win-media-toolbox | -moz-window-button-box | -moz-window-button-box-maximized | -moz-window-button-close | -moz-window-button-maximize | -moz-window-button-minimize | -moz-window-button-restore | -moz-window-frame-bottom | -moz-window-frame-left | -moz-window-frame-right | -moz-window-titlebar | -moz-window-titlebar-maximized`
    *
    * **Initial value**: `none` (but this value is overridden in the user agent CSS)
    */
  var `-moz-appearance`: js.UndefOr[MozAppearanceProperty] = js.undefined
  
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Syntax**: `visible | hidden`
    *
    * **Initial value**: `visible`
    */
  var `-moz-backface-visibility`: js.UndefOr[BackfaceVisibilityProperty] = js.undefined
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-bottom-colors`** CSS property sets a list of colors for the bottom border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var `-moz-border-bottom-colors`: js.UndefOr[MozBorderBottomColorsProperty] = js.undefined
  
  /**
    * The **`border-inline-end-color`** CSS property defines the color of the logical inline-end border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    */
  var `-moz-border-end-color`: js.UndefOr[BorderInlineEndColorProperty] = js.undefined
  
  /**
    * The **`border-inline-end-style`** CSS property defines the style of the logical inline end border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    */
  var `-moz-border-end-style`: js.UndefOr[BorderInlineEndStyleProperty] = js.undefined
  
  /**
    * The **`border-inline-end-width`** CSS property defines the width of the logical inline-end border of an element, which maps to a physical border width depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-width`, `border-right-width`, `border-bottom-width`, or `border-left-width` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-width'>`
    *
    * **Initial value**: `medium`
    */
  var `-moz-border-end-width`: js.UndefOr[BorderInlineEndWidthProperty[TLength]] = js.undefined
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-left-colors`** CSS property sets a list of colors for the left border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var `-moz-border-left-colors`: js.UndefOr[MozBorderLeftColorsProperty] = js.undefined
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-right-colors`** CSS property sets a list of colors for the right border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var `-moz-border-right-colors`: js.UndefOr[MozBorderRightColorsProperty] = js.undefined
  
  /**
    * The **`border-inline-start-color`** CSS property defines the color of the logical inline start border of an element, which maps to a physical border color depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-color`, `border-right-color`, `border-bottom-color`, or `border-left-color` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-color'>`
    *
    * **Initial value**: `currentcolor`
    */
  var `-moz-border-start-color`: js.UndefOr[BorderInlineStartColorProperty] = js.undefined
  
  /**
    * The **`border-inline-start-style`** CSS property defines the style of the logical inline start border of an element, which maps to a physical border style depending on the element's writing mode, directionality, and text orientation. It corresponds to the `border-top-style`, `border-right-style`, `border-bottom-style`, or `border-left-style` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'border-top-style'>`
    *
    * **Initial value**: `none`
    */
  var `-moz-border-start-style`: js.UndefOr[BorderInlineStartStyleProperty] = js.undefined
  
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-top-colors`** CSS property sets a list of colors for the top border.
    *
    * **Syntax**: `<color>+ | none`
    *
    * **Initial value**: `none`
    */
  var `-moz-border-top-colors`: js.UndefOr[MozBorderTopColorsProperty] = js.undefined
  
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Syntax**: `content-box | border-box`
    *
    * **Initial value**: `content-box`
    */
  var `-moz-box-sizing`: js.UndefOr[BoxSizingProperty] = js.undefined
  
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Syntax**: `<integer> | auto`
    *
    * **Initial value**: `auto`
    */
  var `-moz-column-count`: js.UndefOr[ColumnCountProperty] = js.undefined
  
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Syntax**: `auto | balance | balance-all`
    *
    * **Initial value**: `balance`
    */
  var `-moz-column-fill`: js.UndefOr[ColumnFillProperty] = js.undefined
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    */
  var `-moz-column-gap`: js.UndefOr[ColumnGapProperty[TLength]] = js.undefined
  
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var `-moz-column-rule-color`: js.UndefOr[ColumnRuleColorProperty] = js.undefined
  
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-style'>`
    *
    * **Initial value**: `none`
    */
  var `-moz-column-rule-style`: js.UndefOr[ColumnRuleStyleProperty] = js.undefined
  
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-width'>`
    *
    * **Initial value**: `medium`
    */
  var `-moz-column-rule-width`: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Syntax**: `<length> | auto`
    *
    * **Initial value**: `auto`
    */
  var `-moz-column-width`: js.UndefOr[ColumnWidthProperty[TLength]] = js.undefined
  
  /**
    * If you reference an SVG image in a webpage (such as with the `<img>` element or as a background image), the SVG image can coordinate with the embedding element (its context) to have the image adopt property values set on the embedding element. To do this the embedding element needs to list the properties that are to be made available to the image by listing them as values of the **`-moz-context-properties`** property, and the image needs to opt in to using those properties by using values such as the `context-fill` value.
    *
    * **Syntax**: `none | [ fill | fill-opacity | stroke | stroke-opacity ]#`
    *
    * **Initial value**: `none`
    */
  var `-moz-context-properties`: js.UndefOr[MozContextPropertiesProperty] = js.undefined
  
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Syntax**: `normal | <feature-tag-value>#`
    *
    * **Initial value**: `normal`
    */
  var `-moz-font-feature-settings`: js.UndefOr[FontFeatureSettingsProperty] = js.undefined
  
  /**
    * The **`font-language-override`** CSS property controls the use of language-specific glyphs in a typeface.
    *
    * **Syntax**: `normal | <string>`
    *
    * **Initial value**: `normal`
    */
  var `-moz-font-language-override`: js.UndefOr[FontLanguageOverrideProperty] = js.undefined
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Syntax**: `none | manual | auto`
    *
    * **Initial value**: `manual`
    */
  var `-moz-hyphens`: js.UndefOr[HyphensProperty] = js.undefined
  
  /**
    * For certain XUL elements and pseudo-elements that use an image from the `list-style-image` property, this property specifies a region of the image that is used in place of the whole image. This allows elements to use different pieces of the same image to improve performance.
    *
    * **Syntax**: `<shape> | auto`
    *
    * **Initial value**: `auto`
    */
  var `-moz-image-region`: js.UndefOr[MozImageRegionProperty] = js.undefined
  
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var `-moz-margin-end`: js.UndefOr[MarginInlineEndProperty[TLength]] = js.undefined
  
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var `-moz-margin-start`: js.UndefOr[MarginInlineStartProperty[TLength]] = js.undefined
  
  /**
    * The **`-moz-orient`** CSS property specifies the orientation of the element to which it's applied.
    *
    * **Syntax**: `inline | block | horizontal | vertical`
    *
    * **Initial value**: `inline`
    */
  var `-moz-orient`: js.UndefOr[MozOrientProperty] = js.undefined
  
  /**
    * The **`font-smooth`** CSS property controls the application of anti-aliasing when fonts are rendered.
    *
    * **Syntax**: `auto | never | always | <absolute-size> | <length>`
    *
    * **Initial value**: `auto`
    */
  var `-moz-osx-font-smoothing`: js.UndefOr[FontSmoothProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var `-moz-padding-end`: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var `-moz-padding-start`: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.undefined
  
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Syntax**: `none | <length>`
    *
    * **Initial value**: `none`
    */
  var `-moz-perspective`: js.UndefOr[PerspectiveProperty[TLength]] = js.undefined
  
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    */
  var `-moz-perspective-origin`: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.undefined
  
  /**
    * **`-moz-stack-sizing`** is an extended CSS property. Normally, a `stack` will change its size so that all of its child elements are completely visible. For example, moving a child of the stack far to the right will widen the stack so the child remains visible.
    *
    * **Syntax**: `ignore | stretch-to-fit`
    *
    * **Initial value**: `stretch-to-fit`
    */
  var `-moz-stack-sizing`: js.UndefOr[MozStackSizingProperty] = js.undefined
  
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Syntax**: `<integer> | <length>`
    *
    * **Initial value**: `8`
    */
  var `-moz-tab-size`: js.UndefOr[TabSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`-moz-text-blink`** non-standard Mozilla CSS extension specifies the blink mode.
    *
    * **Syntax**: `none | blink`
    *
    * **Initial value**: `none`
    */
  var `-moz-text-blink`: js.UndefOr[MozTextBlinkProperty] = js.undefined
  
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Syntax**: `none | auto | <percentage>`
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    */
  var `-moz-text-size-adjust`: js.UndefOr[TextSizeAdjustProperty] = js.undefined
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var `-moz-transform-origin`: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Syntax**: `flat | preserve-3d`
    *
    * **Initial value**: `flat`
    */
  var `-moz-transform-style`: js.UndefOr[TransformStyleProperty] = js.undefined
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var `-moz-transition-delay`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var `-moz-transition-duration`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    */
  var `-moz-transition-property`: js.UndefOr[TransitionPropertyProperty] = js.undefined
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var `-moz-transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  
  /**
    * The **`-moz-user-focus`** CSS property is used to indicate whether an element can have the focus.
    *
    * **Syntax**: `ignore | normal | select-after | select-before | select-menu | select-same | select-all | none`
    *
    * **Initial value**: `none`
    */
  var `-moz-user-focus`: js.UndefOr[MozUserFocusProperty] = js.undefined
  
  /**
    * The **`user-modify`** property has no effect in Firefox. It was originally planned to determine whether or not the content of an element can be edited by a user.
    *
    * **Syntax**: `read-only | read-write | write-only`
    *
    * **Initial value**: `read-only`
    */
  var `-moz-user-modify`: js.UndefOr[MozUserModifyProperty] = js.undefined
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    */
  var `-moz-user-select`: js.UndefOr[UserSelectProperty] = js.undefined
  
  /**
    * The **`-moz-window-dragging`** CSS property specifies whether a window is draggable or not. It only works in Chrome code, and only on Mac OS X.
    *
    * **Syntax**: `drag | no-drag`
    *
    * **Initial value**: `drag`
    */
  var `-moz-window-dragging`: js.UndefOr[MozWindowDraggingProperty] = js.undefined
  
  /**
    * The **`-moz-window-shadow`** CSS property specifies whether a window will have a shadow. It only works on Mac OS X.
    *
    * **Syntax**: `default | menu | tooltip | sheet | none`
    *
    * **Initial value**: `default`
    */
  var `-moz-window-shadow`: js.UndefOr[MozWindowShadowProperty] = js.undefined
  
  /**
    * The **`-ms-accelerator`** CSS property is a Microsoft extension that sets or retrieves a string indicating whether the object represents a keyboard shortcut.
    *
    * **Syntax**: `false | true`
    *
    * **Initial value**: `false`
    */
  var `-ms-accelerator`: js.UndefOr[MsAcceleratorProperty] = js.undefined
  
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position>`
    *
    * **Initial value**: `auto`
    */
  var `-ms-align-self`: js.UndefOr[AlignSelfProperty] = js.undefined
  
  /**
    * The **`-ms-block-progression`** CSS property is a Microsoft extension that specifies the block progression and layout orientation.
    *
    * **Syntax**: `tb | rl | bt | lr`
    *
    * **Initial value**: `tb`
    */
  var `-ms-block-progression`: js.UndefOr[MsBlockProgressionProperty] = js.undefined
  
  /**
    * The **`-ms-content-zoom-chaining`** CSS property is a Microsoft extension specifying the zoom behavior that occurs when a user hits the zoom limit during page manipulation.
    *
    * **Syntax**: `none | chained`
    *
    * **Initial value**: `none`
    */
  var `-ms-content-zoom-chaining`: js.UndefOr[MsContentZoomChainingProperty] = js.undefined
  
  /**
    * The **`-ms-content-zoom-limit-max`** CSS property is a Microsoft extension that specifies the selected elements' maximum zoom factor.
    *
    * **Syntax**: `<percentage>`
    *
    * **Initial value**: `400%`
    */
  var `-ms-content-zoom-limit-max`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`-ms-content-zoom-limit-min`** CSS property is a Microsoft extension that specifies the minimum zoom factor.
    *
    * **Syntax**: `<percentage>`
    *
    * **Initial value**: `100%`
    */
  var `-ms-content-zoom-limit-min`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`-ms-content-zoom-snap-points`** CSS property is a Microsoft extension that specifies where zoom snap-points are located.
    *
    * **Syntax**: `snapInterval( <percentage>, <percentage> ) | snapList( <percentage># )`
    *
    * **Initial value**: `snapInterval(0%, 100%)`
    */
  var `-ms-content-zoom-snap-points`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`-ms-content-zoom-snap-type`** CSS property is a Microsoft extension that specifies how zooming is affected by defined snap-points.
    *
    * **Syntax**: `none | proximity | mandatory`
    *
    * **Initial value**: `none`
    */
  var `-ms-content-zoom-snap-type`: js.UndefOr[MsContentZoomSnapTypeProperty] = js.undefined
  
  /**
    * The **`-ms-content-zooming`** CSS property is a Microsoft extension that specifies whether zooming is enabled.
    *
    * **Syntax**: `none | zoom`
    *
    * **Initial value**: zoom for the top level element, none for all other elements
    */
  var `-ms-content-zooming`: js.UndefOr[MsContentZoomingProperty] = js.undefined
  
  /**
    * The `-ms-filter` CSS property is a Microsoft extension that sets or retrieves the filter or collection of filters applied to an object.
    *
    * **Syntax**: `<string>`
    *
    * **Initial value**: "" (the empty string)
    */
  var `-ms-filter`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Syntax**: `row | row-reverse | column | column-reverse`
    *
    * **Initial value**: `row`
    */
  var `-ms-flex-direction`: js.UndefOr[FlexDirectionProperty] = js.undefined
  
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    */
  var `-ms-flex-positive`: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`-ms-flow-from`** CSS property is a Microsoft extension that gets or sets a value identifying a region container in the document that accepts the content flow from the data source.
    *
    * **Syntax**: `[ none | <custom-ident> ]#`
    *
    * **Initial value**: `none`
    */
  var `-ms-flow-from`: js.UndefOr[MsFlowFromProperty] = js.undefined
  
  /**
    * The **`-ms-flow-into`** CSS property is a Microsoft extension that gets or sets a value identifying an iframe container in the document that serves as the region's data source.
    *
    * **Syntax**: `[ none | <custom-ident> ]#`
    *
    * **Initial value**: `none`
    */
  var `-ms-flow-into`: js.UndefOr[MsFlowIntoProperty] = js.undefined
  
  /**
    * The **`grid-template-columns`** CSS property defines the line names and track sizing functions of the grid columns.
    *
    * **Syntax**: `none | <track-list> | <auto-track-list>`
    *
    * **Initial value**: `none`
    */
  var `-ms-grid-columns`: js.UndefOr[MsGridColumnsProperty[TLength]] = js.undefined
  
  /**
    * The **`grid-template-rows`** CSS property defines the line names and track sizing functions of the grid rows.
    *
    * **Syntax**: `none | <track-list> | <auto-track-list>`
    *
    * **Initial value**: `none`
    */
  var `-ms-grid-rows`: js.UndefOr[MsGridRowsProperty[TLength]] = js.undefined
  
  /**
    * The **`-ms-high-contrast-adjust`** CSS property is a Microsoft extension that gets or sets a value indicating whether to override any CSS properties that would have been set in high contrast mode.
    *
    * **Syntax**: `auto | none`
    *
    * **Initial value**: `auto`
    */
  var `-ms-high-contrast-adjust`: js.UndefOr[MsHighContrastAdjustProperty] = js.undefined
  
  /**
    * The **`-ms-hyphenate-limit-chars`** CSS property is a Microsoft extension that specifies one to three values indicating the minimum number of characters in a hyphenated word. If the word does not meet the required minimum number of characters in the word, before the hyphen, or after the hyphen, then the word is not hyphenated.
    *
    * **Syntax**: `auto | <integer>{1,3}`
    *
    * **Initial value**: `auto`
    */
  var `-ms-hyphenate-limit-chars`: js.UndefOr[MsHyphenateLimitCharsProperty] = js.undefined
  
  /**
    * The **`-ms-hyphenate-limit-lines`** CSS property is a Microsoft extension specifying the maximum number of consecutive lines in an element that may be ended with a hyphenated word.
    *
    * **Syntax**: `no-limit | <integer>`
    *
    * **Initial value**: `no-limit`
    */
  var `-ms-hyphenate-limit-lines`: js.UndefOr[MsHyphenateLimitLinesProperty] = js.undefined
  
  /**
    * The `**-ms-hyphenate-limit-zone**` CSS property is a Microsoft extension specifying the width of the hyphenation zone.
    *
    * **Syntax**: `<percentage> | <length>`
    *
    * **Initial value**: `0`
    */
  var `-ms-hyphenate-limit-zone`: js.UndefOr[MsHyphenateLimitZoneProperty[TLength]] = js.undefined
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Syntax**: `none | manual | auto`
    *
    * **Initial value**: `manual`
    */
  var `-ms-hyphens`: js.UndefOr[HyphensProperty] = js.undefined
  
  /**
    * The **`-ms-ime-align`** CSS property is a Microsoft extension aligning the Input Method Editor (IME) candidate window box relative to the element on which the IME composition is active. The extension is implemented in Microsoft Edge and Internet Explorer 11.
    *
    * **Syntax**: `auto | after`
    *
    * **Initial value**: `auto`
    */
  var `-ms-ime-align`: js.UndefOr[MsImeAlignProperty] = js.undefined
  
  /**
    * The CSS **`justify-self`** property set the way a box is justified inside its alignment container along the appropriate axis.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? [ <self-position> | left | right ]`
    *
    * **Initial value**: `auto`
    */
  var `-ms-justify-self`: js.UndefOr[JustifySelfProperty] = js.undefined
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    */
  var `-ms-line-break`: js.UndefOr[LineBreakProperty] = js.undefined
  
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `0`
    */
  var `-ms-order`: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`-ms-overflow-style`** CSS property is a Microsoft extension controlling the behavior of scrollbars when the content of an element overflows.
    *
    * **Syntax**: `auto | none | scrollbar | -ms-autohiding-scrollbar`
    *
    * **Initial value**: `auto`
    */
  var `-ms-overflow-style`: js.UndefOr[MsOverflowStyleProperty] = js.undefined
  
  /**
    * The **`overflow-x`** CSS property sets what shows when content overflows a block-level element's left and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `visible`
    */
  var `-ms-overflow-x`: js.UndefOr[OverflowXProperty] = js.undefined
  
  /**
    * The **`overflow-y`** CSS property sets what shows when content overflows a block-level element's top and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * **Syntax**: `visible | hidden | clip | scroll | auto`
    *
    * **Initial value**: `visible`
    */
  var `-ms-overflow-y`: js.UndefOr[OverflowYProperty] = js.undefined
  
  /**
    * The `**-ms-scroll-chaining**` CSS property is a Microsoft extension that specifies the scrolling behavior that occurs when a user hits the scroll limit during a manipulation.
    *
    * **Syntax**: `chained | none`
    *
    * **Initial value**: `chained`
    */
  var `-ms-scroll-chaining`: js.UndefOr[MsScrollChainingProperty] = js.undefined
  
  /**
    * The `**-ms-scroll-limit-x-max**` CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollLeft` property.
    *
    * **Syntax**: `auto | <length>`
    *
    * **Initial value**: `auto`
    */
  var `-ms-scroll-limit-x-max`: js.UndefOr[MsScrollLimitXMaxProperty[TLength]] = js.undefined
  
  /**
    * The **`-ms-scroll-limit-x-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollLeft` property.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var `-ms-scroll-limit-x-min`: js.UndefOr[MsScrollLimitXMinProperty[TLength]] = js.undefined
  
  /**
    * The **`-ms-scroll-limit-y-max`** CSS property is a Microsoft extension that specifies the maximum value for the `Element.scrollTop` property.
    *
    * **Syntax**: `auto | <length>`
    *
    * **Initial value**: `auto`
    */
  var `-ms-scroll-limit-y-max`: js.UndefOr[MsScrollLimitYMaxProperty[TLength]] = js.undefined
  
  /**
    * The **`-ms-scroll-limit-y-min`** CSS property is a Microsoft extension that specifies the minimum value for the `Element.scrollTop` property.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var `-ms-scroll-limit-y-min`: js.UndefOr[MsScrollLimitYMinProperty[TLength]] = js.undefined
  
  /**
    * The **`-ms-scroll-rails`** CSS property is a Microsoft extension that specifies whether scrolling locks to the primary axis of motion.
    *
    * **Syntax**: `none | railed`
    *
    * **Initial value**: `railed`
    */
  var `-ms-scroll-rails`: js.UndefOr[MsScrollRailsProperty] = js.undefined
  
  /**
    * The **`-ms-scroll-snap-points-x`** CSS property is a Microsoft extension that specifies where snap-points will be located along the x-axis.
    *
    * **Syntax**: `snapInterval( <length-percentage>, <length-percentage> ) | snapList( <length-percentage># )`
    *
    * **Initial value**: `snapInterval(0px, 100%)`
    */
  var `-ms-scroll-snap-points-x`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`-ms-scroll-snap-points-y`** CSS property is a Microsoft extension that specifies where snap-points will be located along the y-axis.
    *
    * **Syntax**: `snapInterval( <length-percentage>, <length-percentage> ) | snapList( <length-percentage># )`
    *
    * **Initial value**: `snapInterval(0px, 100%)`
    */
  var `-ms-scroll-snap-points-y`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Syntax**: `none | proximity | mandatory`
    *
    * **Initial value**: `none`
    */
  var `-ms-scroll-snap-type`: js.UndefOr[MsScrollSnapTypeProperty] = js.undefined
  
  /**
    * The **`-ms-scroll-translation`** CSS property is a Microsoft extension that specifies whether vertical-to-horizontal scroll wheel translation occurs on the specified element.
    *
    * **Syntax**: `none | vertical-to-horizontal`
    *
    * **Initial value**: `none`
    */
  var `-ms-scroll-translation`: js.UndefOr[MsScrollTranslationProperty] = js.undefined
  
  /**
    * The **`-ms-scrollbar-3dlight-color`** CSS property is a Microsoft extension specifying the color of the top and left edges of the scroll box and scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: depends on user agent
    */
  var `-ms-scrollbar-3dlight-color`: js.UndefOr[MsScrollbar3dlightColorProperty] = js.undefined
  
  /**
    * The **`-ms-scrollbar-arrow-color`** CSS property is a Microsoft extension that specifies the color of the arrow elements of a scroll arrow.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ButtonText`
    */
  var `-ms-scrollbar-arrow-color`: js.UndefOr[MsScrollbarArrowColorProperty] = js.undefined
  
  /**
    * The `**-ms-scrollbar-base-color**` CSS property is a Microsoft extension that specifies the base color of the main elements of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: depends on user agent
    */
  var `-ms-scrollbar-base-color`: js.UndefOr[MsScrollbarBaseColorProperty] = js.undefined
  
  /**
    * The **`-ms-scrollbar-darkshadow-color`** CSS property is a Microsoft extension that specifies the color of a scroll bar's gutter.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDDarkShadow`
    */
  var `-ms-scrollbar-darkshadow-color`: js.UndefOr[MsScrollbarDarkshadowColorProperty] = js.undefined
  
  /**
    * The `**-ms-scrollbar-face-color**` CSS property is a Microsoft extension that specifies the color of the scroll box and scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDFace`
    */
  var `-ms-scrollbar-face-color`: js.UndefOr[MsScrollbarFaceColorProperty] = js.undefined
  
  /**
    * The `**-ms-scrollbar-highlight-color**` CSS property is a Microsoft extension that specifies the color of the slider tray, the top and left edges of the scroll box, and the scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDHighlight`
    */
  var `-ms-scrollbar-highlight-color`: js.UndefOr[MsScrollbarHighlightColorProperty] = js.undefined
  
  /**
    * The **`-ms-scrollbar-shadow-color`** CSS property is a Microsoft extension that specifies the color of the bottom and right edges of the scroll box and scroll arrows of a scroll bar.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `ThreeDDarkShadow`
    */
  var `-ms-scrollbar-shadow-color`: js.UndefOr[MsScrollbarShadowColorProperty] = js.undefined
  
  /**
    * The **`-ms-text-autospace`** CSS property is a Microsoft extension that specifies the autospacing and narrow space width adjustment of text.
    *
    * **Syntax**: `none | ideograph-alpha | ideograph-numeric | ideograph-parenthesis | ideograph-space`
    *
    * **Initial value**: `none`
    */
  var `-ms-text-autospace`: js.UndefOr[MsTextAutospaceProperty] = js.undefined
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    */
  var `-ms-text-combine-horizontal`: js.UndefOr[TextCombineUprightProperty] = js.undefined
  
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
    *
    * **Initial value**: `clip`
    */
  var `-ms-text-overflow`: js.UndefOr[TextOverflowProperty] = js.undefined
  
  /**
    * The **`touch-action`** CSS property sets how a region can be manipulated by a touchscreen user (for example, by zooming features built into the browser).
    *
    * **Syntax**: `auto | none | [ [ pan-x | pan-left | pan-right ] || [ pan-y | pan-up | pan-down ] || pinch-zoom ] | manipulation`
    *
    * **Initial value**: `auto`
    */
  var `-ms-touch-action`: js.UndefOr[TouchActionProperty] = js.undefined
  
  /**
    * The **`-ms-touch-select`** CSS property is a Microsoft extension that toggles the gripper visual elements that enable touch text selection.
    *
    * **Syntax**: `grippers | none`
    *
    * **Initial value**: `grippers`
    */
  var `-ms-touch-select`: js.UndefOr[MsTouchSelectProperty] = js.undefined
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    */
  var `-ms-transform`: js.UndefOr[TransformProperty] = js.undefined
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var `-ms-transform-origin`: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var `-ms-transition-delay`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var `-ms-transition-duration`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    */
  var `-ms-transition-property`: js.UndefOr[TransitionPropertyProperty] = js.undefined
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var `-ms-transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `none | element | text`
    *
    * **Initial value**: `text`
    */
  var `-ms-user-select`: js.UndefOr[MsUserSelectProperty] = js.undefined
  
  /**
    * The **`word-break`** CSS property sets whether line breaks appear wherever the text would otherwise overflow its content box.
    *
    * **Syntax**: `normal | break-all | keep-all | break-word`
    *
    * **Initial value**: `normal`
    */
  var `-ms-word-break`: js.UndefOr[WordBreakProperty] = js.undefined
  
  /**
    * The **`-ms-wrap-flow`** CSS property is a Microsoft extension that specifies how exclusions impact inline content within block-level elements.
    *
    * **Syntax**: `auto | both | start | end | maximum | clear`
    *
    * **Initial value**: `auto`
    */
  var `-ms-wrap-flow`: js.UndefOr[MsWrapFlowProperty] = js.undefined
  
  /**
    * The **`-ms-wrap-margin`** CSS property is a Microsoft extension that specifies a margin that offsets the inner wrap shape from other shapes.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var `-ms-wrap-margin`: js.UndefOr[MsWrapMarginProperty[TLength]] = js.undefined
  
  /**
    * The **`-ms-wrap-through`** CSS property is a Microsoft extension that specifies how content should wrap around an exclusion element.
    *
    * **Syntax**: `wrap | none`
    *
    * **Initial value**: `wrap`
    */
  var `-ms-wrap-through`: js.UndefOr[MsWrapThroughProperty] = js.undefined
  
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
    *
    * **Initial value**: `horizontal-tb`
    */
  var `-ms-writing-mode`: js.UndefOr[WritingModeProperty] = js.undefined
  
  /**
    * The **`object-fit`** CSS property sets how the content of a replaced element, such as an `<img>` or `<video>`, should be resized to fit its container.
    *
    * **Syntax**: `fill | contain | cover | none | scale-down`
    *
    * **Initial value**: `fill`
    */
  var `-o-object-fit`: js.UndefOr[ObjectFitProperty] = js.undefined
  
  /**
    * The **`object-position`** CSS property specifies the alignment of the selected replaced element's contents within the element's box. Areas of the box which aren't covered by the replaced element's object will show the element's background.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    */
  var `-o-object-position`: js.UndefOr[ObjectPositionProperty[TLength]] = js.undefined
  
  /**
    * The **`tab-size`** CSS property is used to customize the width of a tab (`U+0009`) character.
    *
    * **Syntax**: `<integer> | <length>`
    *
    * **Initial value**: `8`
    */
  var `-o-tab-size`: js.UndefOr[TabSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`text-overflow`** CSS property sets how hidden overflow content is signaled to users. It can be clipped, display an ellipsis ('`…`'), or display a custom string.
    *
    * **Syntax**: `[ clip | ellipsis | <string> ]{1,2}`
    *
    * **Initial value**: `clip`
    */
  var `-o-text-overflow`: js.UndefOr[TextOverflowProperty] = js.undefined
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var `-o-transform-origin`: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  
  /**
    * The CSS **`align-content`** property sets how the browser distributes space between and around content items along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * **Syntax**: `normal | <baseline-position> | <content-distribution> | <overflow-position>? <content-position>`
    *
    * **Initial value**: `normal`
    */
  var `-webkit-align-content`: js.UndefOr[AlignContentProperty] = js.undefined
  
  /**
    * The CSS **`align-items`** property sets the `align-self` value on all direct children as a group. The align-self property sets the alignment of an item within its containing block. In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment of items on the Block Axis within their grid area.
    *
    * **Syntax**: `normal | stretch | <baseline-position> | [ <overflow-position>? <self-position> ]`
    *
    * **Initial value**: `normal`
    */
  var `-webkit-align-items`: js.UndefOr[AlignItemsProperty] = js.undefined
  
  /**
    * The **`align-self`** CSS property aligns flex items of the current flex line overriding the `align-items` value. If any of the item's cross-axis margin is set to `auto`, then `align-self` is ignored. In Grid layout `align-self` aligns the item inside the grid area.
    *
    * **Syntax**: `auto | normal | stretch | <baseline-position> | <overflow-position>? <self-position>`
    *
    * **Initial value**: `auto`
    */
  var `-webkit-align-self`: js.UndefOr[AlignSelfProperty] = js.undefined
  
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var `-webkit-animation-delay`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Syntax**: `<single-animation-direction>#`
    *
    * **Initial value**: `normal`
    */
  var `-webkit-animation-direction`: js.UndefOr[AnimationDirectionProperty] = js.undefined
  
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var `-webkit-animation-duration`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Syntax**: `<single-animation-fill-mode>#`
    *
    * **Initial value**: `none`
    */
  var `-webkit-animation-fill-mode`: js.UndefOr[AnimationFillModeProperty] = js.undefined
  
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Syntax**: `<single-animation-iteration-count>#`
    *
    * **Initial value**: `1`
    */
  var `-webkit-animation-iteration-count`: js.UndefOr[AnimationIterationCountProperty] = js.undefined
  
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Syntax**: `[ none | <keyframes-name> ]#`
    *
    * **Initial value**: `none`
    */
  var `-webkit-animation-name`: js.UndefOr[AnimationNameProperty] = js.undefined
  
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Syntax**: `<single-animation-play-state>#`
    *
    * **Initial value**: `running`
    */
  var `-webkit-animation-play-state`: js.UndefOr[AnimationPlayStateProperty] = js.undefined
  
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var `-webkit-animation-timing-function`: js.UndefOr[AnimationTimingFunctionProperty] = js.undefined
  
  /**
    * The **`-moz-appearance`** CSS property is used in Gecko (Firefox) to display an element using platform-native styling based on the operating system's theme.
    *
    * **Syntax**: `none | button | button-bevel | caret | checkbox | default-button | inner-spin-button | listbox | listitem | media-controls-background | media-controls-fullscreen-background | media-current-time-display | media-enter-fullscreen-button | media-exit-fullscreen-button | media-fullscreen-button | media-mute-button | media-overlay-play-button | media-play-button | media-seek-back-button | media-seek-forward-button | media-slider | media-sliderthumb | media-time-remaining-display | media-toggle-closed-captions-button | media-volume-slider | media-volume-slider-container | media-volume-sliderthumb | menulist | menulist-button | menulist-text | menulist-textfield | meter | progress-bar | progress-bar-value | push-button | radio | searchfield | searchfield-cancel-button | searchfield-decoration | searchfield-results-button | searchfield-results-decoration | slider-horizontal | slider-vertical | sliderthumb-horizontal | sliderthumb-vertical | square-button | textarea | textfield | -apple-pay-button`
    *
    * **Initial value**: `none` (but this value is overridden in the user agent CSS)
    */
  var `-webkit-appearance`: js.UndefOr[WebkitAppearanceProperty] = js.undefined
  
  /**
    * The **`backdrop-filter`** CSS property lets you apply graphical effects such as blurring or color shifting to the area behind an element. Because it applies to everything _behind_ the element, to see the effect you must make the element or its background at least partially transparent.
    *
    * **Syntax**: `none | <filter-function-list>`
    *
    * **Initial value**: `none`
    */
  var `-webkit-backdrop-filter`: js.UndefOr[BackdropFilterProperty] = js.undefined
  
  /**
    * The **`backface-visibility`** CSS property sets whether the back face of an element is visible when turned towards the user.
    *
    * **Syntax**: `visible | hidden`
    *
    * **Initial value**: `visible`
    */
  var `-webkit-backface-visibility`: js.UndefOr[BackfaceVisibilityProperty] = js.undefined
  
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `border-box`
    */
  var `-webkit-background-clip`: js.UndefOr[BackgroundClipProperty] = js.undefined
  
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Syntax**: `<box>#`
    *
    * **Initial value**: `padding-box`
    */
  var `-webkit-background-origin`: js.UndefOr[BackgroundOriginProperty] = js.undefined
  
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    */
  var `-webkit-background-size`: js.UndefOr[BackgroundSizeProperty[TLength]] = js.undefined
  
  /**
    * **Syntax**: `<'color'>`
    *
    * **Initial value**: `currentcolor`
    */
  var `-webkit-border-before-color`: js.UndefOr[WebkitBorderBeforeColorProperty] = js.undefined
  
  /**
    * **Syntax**: `<'border-style'>`
    *
    * **Initial value**: `none`
    */
  var `-webkit-border-before-style`: js.UndefOr[WebkitBorderBeforeStyleProperty] = js.undefined
  
  /**
    * **Syntax**: `<'border-width'>`
    *
    * **Initial value**: `medium`
    */
  var `-webkit-border-before-width`: js.UndefOr[WebkitBorderBeforeWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var `-webkit-border-bottom-left-radius`: js.UndefOr[BorderBottomLeftRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var `-webkit-border-bottom-right-radius`: js.UndefOr[BorderBottomRightRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-image-slice`** CSS property divides the image specified by `border-image-source` into regions. These regions form the components of an element's border image.
    *
    * **Syntax**: `<number-percentage>{1,4} && fill?`
    *
    * **Initial value**: `100%`
    */
  var `-webkit-border-image-slice`: js.UndefOr[BorderImageSliceProperty] = js.undefined
  
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var `-webkit-border-top-left-radius`: js.UndefOr[BorderTopLeftRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Syntax**: `<length-percentage>{1,2}`
    *
    * **Initial value**: `0`
    */
  var `-webkit-border-top-right-radius`: js.UndefOr[BorderTopRightRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Syntax**: `slice | clone`
    *
    * **Initial value**: `slice`
    */
  var `-webkit-box-decoration-break`: js.UndefOr[BoxDecorationBreakProperty] = js.undefined
  
  /**
    * The **`-webkit-box-reflect`** CSS property lets you reflect the content of an element in one specific direction.
    *
    * **Syntax**: `[ above | below | right | left ]? <length>? <image>?`
    *
    * **Initial value**: `none`
    */
  var `-webkit-box-reflect`: js.UndefOr[WebkitBoxReflectProperty[TLength]] = js.undefined
  
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Syntax**: `none | <shadow>#`
    *
    * **Initial value**: `none`
    */
  var `-webkit-box-shadow`: js.UndefOr[BoxShadowProperty] = js.undefined
  
  /**
    * The **`box-sizing`** CSS property defines how the user agent should calculate the total width and height of an element.
    *
    * **Syntax**: `content-box | border-box`
    *
    * **Initial value**: `content-box`
    */
  var `-webkit-box-sizing`: js.UndefOr[BoxSizingProperty] = js.undefined
  
  /**
    * The `**clip-path**` CSS property creates a clipping region that sets what part of an element should be shown. Parts that are inside the region are shown, while those outside are hidden.
    *
    * **Syntax**: `<clip-source> | [ <basic-shape> || <geometry-box> ] | none`
    *
    * **Initial value**: `none`
    */
  var `-webkit-clip-path`: js.UndefOr[ClipPathProperty] = js.undefined
  
  /**
    * The **`column-count`** CSS property breaks an element's content into the specified number of columns.
    *
    * **Syntax**: `<integer> | auto`
    *
    * **Initial value**: `auto`
    */
  var `-webkit-column-count`: js.UndefOr[ColumnCountProperty] = js.undefined
  
  /**
    * The **`column-fill`** CSS property controls how an element's contents are balanced when broken into columns.
    *
    * **Syntax**: `auto | balance | balance-all`
    *
    * **Initial value**: `balance`
    */
  var `-webkit-column-fill`: js.UndefOr[ColumnFillProperty] = js.undefined
  
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Syntax**: `normal | <length-percentage>`
    *
    * **Initial value**: `normal`
    */
  var `-webkit-column-gap`: js.UndefOr[ColumnGapProperty[TLength]] = js.undefined
  
  /**
    * The **`column-rule-color`** CSS property sets the color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var `-webkit-column-rule-color`: js.UndefOr[ColumnRuleColorProperty] = js.undefined
  
  /**
    * The **`column-rule-style`** CSS property sets the style of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-style'>`
    *
    * **Initial value**: `none`
    */
  var `-webkit-column-rule-style`: js.UndefOr[ColumnRuleStyleProperty] = js.undefined
  
  /**
    * The **`column-rule-width`** CSS property sets the width of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'border-width'>`
    *
    * **Initial value**: `medium`
    */
  var `-webkit-column-rule-width`: js.UndefOr[ColumnRuleWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`column-span`** CSS property makes it possible for an element to span across all columns when its value is set to `all`.
    *
    * **Syntax**: `none | all`
    *
    * **Initial value**: `none`
    */
  var `-webkit-column-span`: js.UndefOr[ColumnSpanProperty] = js.undefined
  
  /**
    * The **`column-width`** CSS property specifies the ideal column width in a multi-column layout. The container will have as many columns as can fit without any of them having a width less than the `column-width` value. If the width of the container is narrower than the specified value, the single column's width will be smaller than the declared column width.
    *
    * **Syntax**: `<length> | auto`
    *
    * **Initial value**: `auto`
    */
  var `-webkit-column-width`: js.UndefOr[ColumnWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`filter`** CSS property applies graphical effects like blur or color shift to an element. Filters are commonly used to adjust the rendering of images, backgrounds, and borders.
    *
    * **Syntax**: `none | <filter-function-list>`
    *
    * **Initial value**: `none`
    */
  var `-webkit-filter`: js.UndefOr[FilterProperty] = js.undefined
  
  /**
    * The **`flex-basis`** CSS property sets the initial main size of a flex item. It sets the size of the content box unless otherwise set with `box-sizing`.
    *
    * **Syntax**: `content | <'width'>`
    *
    * **Initial value**: `auto`
    */
  var `-webkit-flex-basis`: js.UndefOr[FlexBasisProperty[TLength]] = js.undefined
  
  /**
    * The **`flex-direction`** CSS property sets how flex items are placed in the flex container defining the main axis and the direction (normal or reversed).
    *
    * **Syntax**: `row | row-reverse | column | column-reverse`
    *
    * **Initial value**: `row`
    */
  var `-webkit-flex-direction`: js.UndefOr[FlexDirectionProperty] = js.undefined
  
  /**
    * The **`flex-grow`** CSS property sets how much of the available space in the flex container should be assigned to that item (the flex grow factor). If all sibling items have the same flex grow factor, then all items will receive the same share of available space, otherwise it is distributed according to the ratio defined by the different flex grow factors.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `0`
    */
  var `-webkit-flex-grow`: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`flex-shrink`** CSS property sets the flex shrink factor of a flex item. If the size of flex items is larger than the flex container, items shrink to fit according to `flex-shrink`.
    *
    * **Syntax**: `<number>`
    *
    * **Initial value**: `1`
    */
  var `-webkit-flex-shrink`: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The **`flex-wrap`** CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines. If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * **Syntax**: `nowrap | wrap | wrap-reverse`
    *
    * **Initial value**: `nowrap`
    */
  var `-webkit-flex-wrap`: js.UndefOr[FlexWrapProperty] = js.undefined
  
  /**
    * The **`font-feature-settings`** CSS property controls advanced typographic features in OpenType fonts.
    *
    * **Syntax**: `normal | <feature-tag-value>#`
    *
    * **Initial value**: `normal`
    */
  var `-webkit-font-feature-settings`: js.UndefOr[FontFeatureSettingsProperty] = js.undefined
  
  /**
    * The **`font-kerning`** CSS property sets the use of the kerning information stored in a font.
    *
    * **Syntax**: `auto | normal | none`
    *
    * **Initial value**: `auto`
    */
  var `-webkit-font-kerning`: js.UndefOr[FontKerningProperty] = js.undefined
  
  /**
    * The **`font-smooth`** CSS property controls the application of anti-aliasing when fonts are rendered.
    *
    * **Syntax**: `auto | never | always | <absolute-size> | <length>`
    *
    * **Initial value**: `auto`
    */
  var `-webkit-font-smoothing`: js.UndefOr[FontSmoothProperty[TLength]] = js.undefined
  
  /**
    * The **`font-variant-ligatures`** CSS property controls which ligatures and contextual forms are used in textual content of the elements it applies to. This leads to more harmonized forms in the resulting text.
    *
    * **Syntax**: `normal | none | [ <common-lig-values> || <discretionary-lig-values> || <historical-lig-values> || <contextual-alt-values> ]`
    *
    * **Initial value**: `normal`
    */
  var `-webkit-font-variant-ligatures`: js.UndefOr[FontVariantLigaturesProperty] = js.undefined
  
  /**
    * The **`hyphens`** CSS property specifies how words should be hyphenated when text wraps across multiple lines. You can prevent hyphenation entirely, use hyphenation in manually-specified points within the text, or let the browser automatically insert hyphens where appropriate.
    *
    * **Syntax**: `none | manual | auto`
    *
    * **Initial value**: `manual`
    */
  var `-webkit-hyphens`: js.UndefOr[HyphensProperty] = js.undefined
  
  /**
    * The CSS **`justify-content`** property defines how the browser distributes space between and around content items along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * **Syntax**: `normal | <content-distribution> | <overflow-position>? [ <content-position> | left | right ]`
    *
    * **Initial value**: `normal`
    */
  var `-webkit-justify-content`: js.UndefOr[JustifyContentProperty] = js.undefined
  
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Syntax**: `auto | loose | normal | strict | anywhere`
    *
    * **Initial value**: `auto`
    */
  var `-webkit-line-break`: js.UndefOr[LineBreakProperty] = js.undefined
  
  /**
    * The **`-webkit-line-clamp`** CSS property allows limiting of the contents of a block container to the specified number of lines.
    *
    * **Syntax**: `none | <integer>`
    *
    * **Initial value**: `none`
    */
  var `-webkit-line-clamp`: js.UndefOr[WebkitLineClampProperty] = js.undefined
  
  /**
    * The **`margin-inline-end`** CSS property defines the logical inline end margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. In other words, it corresponds to the `margin-top`, `margin-right`, `margin-bottom` or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var `-webkit-margin-end`: js.UndefOr[MarginInlineEndProperty[TLength]] = js.undefined
  
  /**
    * The **`margin-inline-start`** CSS property defines the logical inline start margin of an element, which maps to a physical margin depending on the element's writing mode, directionality, and text orientation. It corresponds to the `margin-top`, `margin-right`, `margin-bottom`, or `margin-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'margin-left'>`
    *
    * **Initial value**: `0`
    */
  var `-webkit-margin-start`: js.UndefOr[MarginInlineStartProperty[TLength]] = js.undefined
  
  /**
    * If a `-webkit-mask-image` is specified, `-webkit-mask-attachment` determines whether the mask image's position is fixed within the viewport, or scrolls along with its containing block.
    *
    * **Syntax**: `<attachment>#`
    *
    * **Initial value**: `scroll`
    */
  var `-webkit-mask-attachment`: js.UndefOr[WebkitMaskAttachmentProperty] = js.undefined
  
  /**
    * The **`mask-clip`** CSS property determines the area, which is affected by a mask. The painted content of an element must be restricted to this area.
    *
    * **Syntax**: `[ <box> | border | padding | content | text ]#`
    *
    * **Initial value**: `border`
    */
  var `-webkit-mask-clip`: js.UndefOr[WebkitMaskClipProperty] = js.undefined
  
  /**
    * The **`-webkit-mask-composite`** property specifies the manner in which multiple mask images applied to the same element are composited with one another. Mask images are composited in the opposite order that they are declared with the `-webkit-mask-image` property.
    *
    * **Syntax**: `<composite-style>#`
    *
    * **Initial value**: `source-over`
    */
  var `-webkit-mask-composite`: js.UndefOr[WebkitMaskCompositeProperty] = js.undefined
  
  /**
    * The **`mask-image`** CSS property sets the image that is used as mask layer for an element.
    *
    * **Syntax**: `<mask-reference>#`
    *
    * **Initial value**: `none`
    */
  var `-webkit-mask-image`: js.UndefOr[WebkitMaskImageProperty] = js.undefined
  
  /**
    * The **`mask-origin`** CSS property sets the origin of a mask.
    *
    * **Syntax**: `[ <box> | border | padding | content ]#`
    *
    * **Initial value**: `padding`
    */
  var `-webkit-mask-origin`: js.UndefOr[WebkitMaskOriginProperty] = js.undefined
  
  /**
    * The **`mask-position`** CSS property sets the initial position, relative to the mask position layer set by `mask-origin`, for each defined mask image.
    *
    * **Syntax**: `<position>#`
    *
    * **Initial value**: `0% 0%`
    */
  var `-webkit-mask-position`: js.UndefOr[WebkitMaskPositionProperty[TLength]] = js.undefined
  
  /**
    * The `-webkit-mask-position-x` CSS property sets the initial horizontal position of a mask image.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right ]#`
    *
    * **Initial value**: `0%`
    */
  var `-webkit-mask-position-x`: js.UndefOr[WebkitMaskPositionXProperty[TLength]] = js.undefined
  
  /**
    * The `-webkit-mask-position-y` CSS property sets the initial vertical position of a mask image.
    *
    * **Syntax**: `[ <length-percentage> | top | center | bottom ]#`
    *
    * **Initial value**: `0%`
    */
  var `-webkit-mask-position-y`: js.UndefOr[WebkitMaskPositionYProperty[TLength]] = js.undefined
  
  /**
    * The **`mask-repeat`** CSS property sets how mask images are repeated. A mask image can be repeated along the horizontal axis, the vertical axis, both axes, or not repeated at all.
    *
    * **Syntax**: `<repeat-style>#`
    *
    * **Initial value**: `repeat`
    */
  var `-webkit-mask-repeat`: js.UndefOr[WebkitMaskRepeatProperty] = js.undefined
  
  /**
    * The `-webkit-mask-repeat-x` property specifies whether and how a mask image is repeated (tiled) horizontally.
    *
    * **Syntax**: `repeat | no-repeat | space | round`
    *
    * **Initial value**: `repeat`
    */
  var `-webkit-mask-repeat-x`: js.UndefOr[WebkitMaskRepeatXProperty] = js.undefined
  
  /**
    * The `-webkit-mask-repeat-y` property sets whether and how a mask image is repeated (tiled) vertically.
    *
    * **Syntax**: `repeat | no-repeat | space | round`
    *
    * **Initial value**: `repeat`
    */
  var `-webkit-mask-repeat-y`: js.UndefOr[WebkitMaskRepeatYProperty] = js.undefined
  
  /**
    * The **`mask-size`** CSS property specifies the sizes of the mask images. The size of the image can be fully or partially constrained in order to preserve its intrinsic ratio.
    *
    * **Syntax**: `<bg-size>#`
    *
    * **Initial value**: `auto auto`
    */
  var `-webkit-mask-size`: js.UndefOr[WebkitMaskSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`max-inline-size`** CSS property defines the horizontal or vertical maximum size of an element's block depending on its writing mode. It corresponds to the `max-width` or the `max-height` property depending on the value defined for `writing-mode`. If the writing mode is vertically oriented, the value of `max-inline-size` relates to the maximal height of the element, otherwise it relates to the maximal width of the element. It relates to `max-block-size`, which defines the other dimension of the element.
    *
    * **Syntax**: `<'max-width'>`
    *
    * **Initial value**: `0`
    */
  var `-webkit-max-inline-size`: js.UndefOr[MaxInlineSizeProperty[TLength]] = js.undefined
  
  /**
    * The **`order`** CSS property sets the order to lay out an item in a flex or grid container. Items in a container are sorted by ascending `order` value and then by their source code order.
    *
    * **Syntax**: `<integer>`
    *
    * **Initial value**: `0`
    */
  var `-webkit-order`: js.UndefOr[GlobalsNumber] = js.undefined
  
  /**
    * The `-webkit-overflow-scrolling` CSS property controls whether or not touch devices use momentum-based scrolling for a given element.
    *
    * **Syntax**: `auto | touch`
    *
    * **Initial value**: `auto`
    */
  var `-webkit-overflow-scrolling`: js.UndefOr[WebkitOverflowScrollingProperty] = js.undefined
  
  /**
    * The **`padding-inline-end`** CSS property defines the logical inline end padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var `-webkit-padding-end`: js.UndefOr[PaddingInlineEndProperty[TLength]] = js.undefined
  
  /**
    * The **`padding-inline-start`** CSS property defines the logical inline start padding of an element, which maps to a physical padding depending on the element's writing mode, directionality, and text orientation. It corresponds to the `padding-top`, `padding-right`, `padding-bottom`, or `padding-left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Syntax**: `<'padding-left'>`
    *
    * **Initial value**: `0`
    */
  var `-webkit-padding-start`: js.UndefOr[PaddingInlineStartProperty[TLength]] = js.undefined
  
  /**
    * The **`perspective`** CSS property determines the distance between the z=0 plane and the user in order to give a 3D-positioned element some perspective. Each 3D element with z>0 becomes larger; each 3D-element with z<0 becomes smaller. The strength of the effect is determined by the value of this property.
    *
    * **Syntax**: `none | <length>`
    *
    * **Initial value**: `none`
    */
  var `-webkit-perspective`: js.UndefOr[PerspectiveProperty[TLength]] = js.undefined
  
  /**
    * The **`perspective-origin`** CSS property determines the position at which the viewer is looking. It is used as the _vanishing point_ by the `perspective` property.
    *
    * **Syntax**: `<position>`
    *
    * **Initial value**: `50% 50%`
    */
  var `-webkit-perspective-origin`: js.UndefOr[PerspectiveOriginProperty[TLength]] = js.undefined
  
  /**
    * The **`color-adjust`** CSS property sets what, if anything, the user agent may do to optimize the appearance of the element on the output device. By default, the browser is allowed to make any adjustments to the element's appearance it determines to be necessary and prudent given the type and capabilities of the output device.
    *
    * **Syntax**: `economy | exact`
    *
    * **Initial value**: `economy`
    */
  var `-webkit-print-color-adjust`: js.UndefOr[ColorAdjustProperty] = js.undefined
  
  /**
    * The `**ruby-position**` CSS property defines the position of a ruby element relatives to its base element. It can be position over the element (`over`), under it (`under`), or between the characters, on their right side (`inter-character`).
    *
    * **Syntax**: `over | under | inter-character`
    *
    * **Initial value**: `over`
    */
  var `-webkit-ruby-position`: js.UndefOr[RubyPositionProperty] = js.undefined
  
  /**
    * The **`scroll-snap-type`** CSS property sets how strictly snap points are enforced on the scroll container in case there is one.
    *
    * **Syntax**: `none | [ x | y | block | inline | both ] [ mandatory | proximity ]?`
    *
    * **Initial value**: `none`
    */
  var `-webkit-scroll-snap-type`: js.UndefOr[ScrollSnapTypeProperty] = js.undefined
  
  /**
    * The **`shape-margin`** CSS property sets a margin for a CSS shape created using `shape-outside`.
    *
    * **Syntax**: `<length-percentage>`
    *
    * **Initial value**: `0`
    */
  var `-webkit-shape-margin`: js.UndefOr[ShapeMarginProperty[TLength]] = js.undefined
  
  /**
    * **`-webkit-tap-highlight-color`** is a non-standard CSS property that sets the color of the highlight that appears over a link while it's being tapped. The highlighting indicates to the user that their tap is being successfully recognized, and indicates which element they're tapping on.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `black`
    */
  var `-webkit-tap-highlight-color`: js.UndefOr[WebkitTapHighlightColorProperty] = js.undefined
  
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Syntax**: `none | all | [ digits <integer>? ]`
    *
    * **Initial value**: `none`
    */
  var `-webkit-text-combine`: js.UndefOr[TextCombineUprightProperty] = js.undefined
  
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var `-webkit-text-decoration-color`: js.UndefOr[TextDecorationColorProperty] = js.undefined
  
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
    *
    * **Initial value**: `none`
    */
  var `-webkit-text-decoration-line`: js.UndefOr[TextDecorationLineProperty] = js.undefined
  
  /**
    * The **`text-decoration-skip`** CSS property sets what parts of an element’s content any text decoration affecting the element must skip over. It controls all text decoration lines drawn by the element and also any text decoration lines drawn by its ancestors.
    *
    * **Syntax**: `none | [ objects || [ spaces | [ leading-spaces || trailing-spaces ] ] || edges || box-decoration ]`
    *
    * **Initial value**: `objects`
    */
  var `-webkit-text-decoration-skip`: js.UndefOr[TextDecorationSkipProperty] = js.undefined
  
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Syntax**: `solid | double | dotted | dashed | wavy`
    *
    * **Initial value**: `solid`
    */
  var `-webkit-text-decoration-style`: js.UndefOr[TextDecorationStyleProperty] = js.undefined
  
  /**
    * The **`text-emphasis-color`** CSS property sets the color of emphasis marks. This value can also be set using the `text-emphasis` shorthand.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var `-webkit-text-emphasis-color`: js.UndefOr[TextEmphasisColorProperty] = js.undefined
  
  /**
    * The **`text-emphasis-position`** CSS property sets where emphasis marks are drawn. Like ruby text, if there isn't enough room for emphasis marks, the line height is increased.
    *
    * **Syntax**: `[ over | under ] && [ right | left ]`
    *
    * **Initial value**: `over right`
    */
  var `-webkit-text-emphasis-position`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`text-emphasis-style`** CSS property sets the appearance of emphasis marks. It can also be set, and reset, using the `text-emphasis` shorthand.
    *
    * **Syntax**: `none | [ [ filled | open ] || [ dot | circle | double-circle | triangle | sesame ] ] | <string>`
    *
    * **Initial value**: `none`
    */
  var `-webkit-text-emphasis-style`: js.UndefOr[TextEmphasisStyleProperty] = js.undefined
  
  /**
    * The **`-webkit-text-fill-color`** CSS property specifies the fill color of characters of text. If this property is not set, the value of the `color` property is used.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var `-webkit-text-fill-color`: js.UndefOr[WebkitTextFillColorProperty] = js.undefined
  
  /**
    * The **`text-orientation`** CSS property sets the orientation of the text characters in a line. It only affects text in vertical mode (when `writing-mode` is not `horizontal-tb`). It is useful for controlling the display of languages that use vertical script, and also for making vertical table headers.
    *
    * **Syntax**: `mixed | upright | sideways`
    *
    * **Initial value**: `mixed`
    */
  var `-webkit-text-orientation`: js.UndefOr[TextOrientationProperty] = js.undefined
  
  /**
    * The **`text-size-adjust`** CSS property controls the text inflation algorithm used on some smartphones and tablets. Other browsers will ignore this property.
    *
    * **Syntax**: `none | auto | <percentage>`
    *
    * **Initial value**: `auto` for smartphone browsers supporting inflation, `none` in other cases (and then not modifiable).
    */
  var `-webkit-text-size-adjust`: js.UndefOr[TextSizeAdjustProperty] = js.undefined
  
  /**
    * The **`-webkit-text-stroke-color`** CSS property specifies the stroke color of characters of text. If this property is not set, the value of the `color` property is used.
    *
    * **Syntax**: `<color>`
    *
    * **Initial value**: `currentcolor`
    */
  var `-webkit-text-stroke-color`: js.UndefOr[WebkitTextStrokeColorProperty] = js.undefined
  
  /**
    * The **`-webkit-text-stroke-width`** CSS property specifies the width of the stroke for text.
    *
    * **Syntax**: `<length>`
    *
    * **Initial value**: `0`
    */
  var `-webkit-text-stroke-width`: js.UndefOr[WebkitTextStrokeWidthProperty[TLength]] = js.undefined
  
  /**
    * The **`text-underline-position`** CSS property specifies the position of the underline which is set using the `text-decoration` property's `underline` value.
    *
    * **Syntax**: `auto | from-font | [ under || [ left | right ] ]`
    *
    * **Initial value**: `auto`
    */
  var `-webkit-text-underline-position`: js.UndefOr[TextUnderlinePositionProperty] = js.undefined
  
  /**
    * The `-webkit-touch-callout` CSS property controls the display of the default callout shown when you touch and hold a touch target.
    *
    * **Syntax**: `default | none`
    *
    * **Initial value**: `default`
    */
  var `-webkit-touch-callout`: js.UndefOr[WebkitTouchCalloutProperty] = js.undefined
  
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Syntax**: `none | <transform-list>`
    *
    * **Initial value**: `none`
    */
  var `-webkit-transform`: js.UndefOr[TransformProperty] = js.undefined
  
  /**
    * The **`transform-origin`** CSS property sets the origin for an element's transformations.
    *
    * **Syntax**: `[ <length-percentage> | left | center | right | top | bottom ] | [ [ <length-percentage> | left | center | right ] && [ <length-percentage> | top | center | bottom ] ] <length>?`
    *
    * **Initial value**: `50% 50% 0`
    */
  var `-webkit-transform-origin`: js.UndefOr[TransformOriginProperty[TLength]] = js.undefined
  
  /**
    * The **`transform-style`** CSS property sets whether children of an element are positioned in the 3D space or are flattened in the plane of the element.
    *
    * **Syntax**: `flat | preserve-3d`
    *
    * **Initial value**: `flat`
    */
  var `-webkit-transform-style`: js.UndefOr[TransformStyleProperty] = js.undefined
  
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var `-webkit-transition-delay`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Syntax**: `<time>#`
    *
    * **Initial value**: `0s`
    */
  var `-webkit-transition-duration`: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Syntax**: `none | <single-transition-property>#`
    *
    * **Initial value**: all
    */
  var `-webkit-transition-property`: js.UndefOr[TransitionPropertyProperty] = js.undefined
  
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Syntax**: `<timing-function>#`
    *
    * **Initial value**: `ease`
    */
  var `-webkit-transition-timing-function`: js.UndefOr[TransitionTimingFunctionProperty] = js.undefined
  
  /**
    * **Syntax**: `read-only | read-write | read-write-plaintext-only`
    *
    * **Initial value**: `read-only`
    */
  var `-webkit-user-modify`: js.UndefOr[WebkitUserModifyProperty] = js.undefined
  
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Syntax**: `auto | text | none | contain | all`
    *
    * **Initial value**: `auto`
    */
  var `-webkit-user-select`: js.UndefOr[UserSelectProperty] = js.undefined
  
  /**
    * The **`writing-mode`** CSS property sets whether lines of text are laid out horizontally or vertically, as well as the direction in which blocks progress.
    *
    * **Syntax**: `horizontal-tb | vertical-rl | vertical-lr | sideways-rl | sideways-lr`
    *
    * **Initial value**: `horizontal-tb`
    */
  var `-webkit-writing-mode`: js.UndefOr[WritingModeProperty] = js.undefined
}
object VendorLonghandPropertiesHyphen {
  
  @scala.inline
  def apply[TLength](): VendorLonghandPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorLonghandPropertiesHyphen[TLength]]
  }
  
  @scala.inline
  implicit class VendorLonghandPropertiesHyphenMutableBuilder[Self <: VendorLonghandPropertiesHyphen[?], TLength] (val x: Self & VendorLonghandPropertiesHyphen[TLength]) extends AnyVal {
    
    @scala.inline
    def `set-moz-animation-delay`(value: GlobalsString): Self = StObject.set(x, "-moz-animation-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-animation-delayUndefined`: Self = StObject.set(x, "-moz-animation-delay", js.undefined)
    
    @scala.inline
    def `set-moz-animation-direction`(value: AnimationDirectionProperty): Self = StObject.set(x, "-moz-animation-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-animation-directionUndefined`: Self = StObject.set(x, "-moz-animation-direction", js.undefined)
    
    @scala.inline
    def `set-moz-animation-duration`(value: GlobalsString): Self = StObject.set(x, "-moz-animation-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-animation-durationUndefined`: Self = StObject.set(x, "-moz-animation-duration", js.undefined)
    
    @scala.inline
    def `set-moz-animation-fill-mode`(value: AnimationFillModeProperty): Self = StObject.set(x, "-moz-animation-fill-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-animation-fill-modeUndefined`: Self = StObject.set(x, "-moz-animation-fill-mode", js.undefined)
    
    @scala.inline
    def `set-moz-animation-iteration-count`(value: AnimationIterationCountProperty): Self = StObject.set(x, "-moz-animation-iteration-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-animation-iteration-countUndefined`: Self = StObject.set(x, "-moz-animation-iteration-count", js.undefined)
    
    @scala.inline
    def `set-moz-animation-name`(value: AnimationNameProperty): Self = StObject.set(x, "-moz-animation-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-animation-nameUndefined`: Self = StObject.set(x, "-moz-animation-name", js.undefined)
    
    @scala.inline
    def `set-moz-animation-play-state`(value: AnimationPlayStateProperty): Self = StObject.set(x, "-moz-animation-play-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-animation-play-stateUndefined`: Self = StObject.set(x, "-moz-animation-play-state", js.undefined)
    
    @scala.inline
    def `set-moz-animation-timing-function`(value: AnimationTimingFunctionProperty): Self = StObject.set(x, "-moz-animation-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-animation-timing-functionUndefined`: Self = StObject.set(x, "-moz-animation-timing-function", js.undefined)
    
    @scala.inline
    def `set-moz-appearance`(value: MozAppearanceProperty): Self = StObject.set(x, "-moz-appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-appearanceUndefined`: Self = StObject.set(x, "-moz-appearance", js.undefined)
    
    @scala.inline
    def `set-moz-backface-visibility`(value: BackfaceVisibilityProperty): Self = StObject.set(x, "-moz-backface-visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-backface-visibilityUndefined`: Self = StObject.set(x, "-moz-backface-visibility", js.undefined)
    
    @scala.inline
    def `set-moz-border-bottom-colors`(value: MozBorderBottomColorsProperty): Self = StObject.set(x, "-moz-border-bottom-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-border-bottom-colorsUndefined`: Self = StObject.set(x, "-moz-border-bottom-colors", js.undefined)
    
    @scala.inline
    def `set-moz-border-end-color`(value: BorderInlineEndColorProperty): Self = StObject.set(x, "-moz-border-end-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-border-end-colorUndefined`: Self = StObject.set(x, "-moz-border-end-color", js.undefined)
    
    @scala.inline
    def `set-moz-border-end-style`(value: BorderInlineEndStyleProperty): Self = StObject.set(x, "-moz-border-end-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-border-end-styleUndefined`: Self = StObject.set(x, "-moz-border-end-style", js.undefined)
    
    @scala.inline
    def `set-moz-border-end-width`(value: BorderInlineEndWidthProperty[TLength]): Self = StObject.set(x, "-moz-border-end-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-border-end-widthUndefined`: Self = StObject.set(x, "-moz-border-end-width", js.undefined)
    
    @scala.inline
    def `set-moz-border-left-colors`(value: MozBorderLeftColorsProperty): Self = StObject.set(x, "-moz-border-left-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-border-left-colorsUndefined`: Self = StObject.set(x, "-moz-border-left-colors", js.undefined)
    
    @scala.inline
    def `set-moz-border-right-colors`(value: MozBorderRightColorsProperty): Self = StObject.set(x, "-moz-border-right-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-border-right-colorsUndefined`: Self = StObject.set(x, "-moz-border-right-colors", js.undefined)
    
    @scala.inline
    def `set-moz-border-start-color`(value: BorderInlineStartColorProperty): Self = StObject.set(x, "-moz-border-start-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-border-start-colorUndefined`: Self = StObject.set(x, "-moz-border-start-color", js.undefined)
    
    @scala.inline
    def `set-moz-border-start-style`(value: BorderInlineStartStyleProperty): Self = StObject.set(x, "-moz-border-start-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-border-start-styleUndefined`: Self = StObject.set(x, "-moz-border-start-style", js.undefined)
    
    @scala.inline
    def `set-moz-border-top-colors`(value: MozBorderTopColorsProperty): Self = StObject.set(x, "-moz-border-top-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-border-top-colorsUndefined`: Self = StObject.set(x, "-moz-border-top-colors", js.undefined)
    
    @scala.inline
    def `set-moz-box-sizing`(value: BoxSizingProperty): Self = StObject.set(x, "-moz-box-sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-box-sizingUndefined`: Self = StObject.set(x, "-moz-box-sizing", js.undefined)
    
    @scala.inline
    def `set-moz-column-count`(value: ColumnCountProperty): Self = StObject.set(x, "-moz-column-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-column-countUndefined`: Self = StObject.set(x, "-moz-column-count", js.undefined)
    
    @scala.inline
    def `set-moz-column-fill`(value: ColumnFillProperty): Self = StObject.set(x, "-moz-column-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-column-fillUndefined`: Self = StObject.set(x, "-moz-column-fill", js.undefined)
    
    @scala.inline
    def `set-moz-column-gap`(value: ColumnGapProperty[TLength]): Self = StObject.set(x, "-moz-column-gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-column-gapUndefined`: Self = StObject.set(x, "-moz-column-gap", js.undefined)
    
    @scala.inline
    def `set-moz-column-rule-color`(value: ColumnRuleColorProperty): Self = StObject.set(x, "-moz-column-rule-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-column-rule-colorUndefined`: Self = StObject.set(x, "-moz-column-rule-color", js.undefined)
    
    @scala.inline
    def `set-moz-column-rule-style`(value: ColumnRuleStyleProperty): Self = StObject.set(x, "-moz-column-rule-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-column-rule-styleUndefined`: Self = StObject.set(x, "-moz-column-rule-style", js.undefined)
    
    @scala.inline
    def `set-moz-column-rule-width`(value: ColumnRuleWidthProperty[TLength]): Self = StObject.set(x, "-moz-column-rule-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-column-rule-widthUndefined`: Self = StObject.set(x, "-moz-column-rule-width", js.undefined)
    
    @scala.inline
    def `set-moz-column-width`(value: ColumnWidthProperty[TLength]): Self = StObject.set(x, "-moz-column-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-column-widthUndefined`: Self = StObject.set(x, "-moz-column-width", js.undefined)
    
    @scala.inline
    def `set-moz-context-properties`(value: MozContextPropertiesProperty): Self = StObject.set(x, "-moz-context-properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-context-propertiesUndefined`: Self = StObject.set(x, "-moz-context-properties", js.undefined)
    
    @scala.inline
    def `set-moz-font-feature-settings`(value: FontFeatureSettingsProperty): Self = StObject.set(x, "-moz-font-feature-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-font-feature-settingsUndefined`: Self = StObject.set(x, "-moz-font-feature-settings", js.undefined)
    
    @scala.inline
    def `set-moz-font-language-override`(value: FontLanguageOverrideProperty): Self = StObject.set(x, "-moz-font-language-override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-font-language-overrideUndefined`: Self = StObject.set(x, "-moz-font-language-override", js.undefined)
    
    @scala.inline
    def `set-moz-hyphens`(value: HyphensProperty): Self = StObject.set(x, "-moz-hyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-hyphensUndefined`: Self = StObject.set(x, "-moz-hyphens", js.undefined)
    
    @scala.inline
    def `set-moz-image-region`(value: MozImageRegionProperty): Self = StObject.set(x, "-moz-image-region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-image-regionUndefined`: Self = StObject.set(x, "-moz-image-region", js.undefined)
    
    @scala.inline
    def `set-moz-margin-end`(value: MarginInlineEndProperty[TLength]): Self = StObject.set(x, "-moz-margin-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-margin-endUndefined`: Self = StObject.set(x, "-moz-margin-end", js.undefined)
    
    @scala.inline
    def `set-moz-margin-start`(value: MarginInlineStartProperty[TLength]): Self = StObject.set(x, "-moz-margin-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-margin-startUndefined`: Self = StObject.set(x, "-moz-margin-start", js.undefined)
    
    @scala.inline
    def `set-moz-orient`(value: MozOrientProperty): Self = StObject.set(x, "-moz-orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-orientUndefined`: Self = StObject.set(x, "-moz-orient", js.undefined)
    
    @scala.inline
    def `set-moz-osx-font-smoothing`(value: FontSmoothProperty[TLength]): Self = StObject.set(x, "-moz-osx-font-smoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-osx-font-smoothingUndefined`: Self = StObject.set(x, "-moz-osx-font-smoothing", js.undefined)
    
    @scala.inline
    def `set-moz-padding-end`(value: PaddingInlineEndProperty[TLength]): Self = StObject.set(x, "-moz-padding-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-padding-endUndefined`: Self = StObject.set(x, "-moz-padding-end", js.undefined)
    
    @scala.inline
    def `set-moz-padding-start`(value: PaddingInlineStartProperty[TLength]): Self = StObject.set(x, "-moz-padding-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-padding-startUndefined`: Self = StObject.set(x, "-moz-padding-start", js.undefined)
    
    @scala.inline
    def `set-moz-perspective`(value: PerspectiveProperty[TLength]): Self = StObject.set(x, "-moz-perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-perspective-origin`(value: PerspectiveOriginProperty[TLength]): Self = StObject.set(x, "-moz-perspective-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-perspective-originUndefined`: Self = StObject.set(x, "-moz-perspective-origin", js.undefined)
    
    @scala.inline
    def `set-moz-perspectiveUndefined`: Self = StObject.set(x, "-moz-perspective", js.undefined)
    
    @scala.inline
    def `set-moz-stack-sizing`(value: MozStackSizingProperty): Self = StObject.set(x, "-moz-stack-sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-stack-sizingUndefined`: Self = StObject.set(x, "-moz-stack-sizing", js.undefined)
    
    @scala.inline
    def `set-moz-tab-size`(value: TabSizeProperty[TLength]): Self = StObject.set(x, "-moz-tab-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-tab-sizeUndefined`: Self = StObject.set(x, "-moz-tab-size", js.undefined)
    
    @scala.inline
    def `set-moz-text-blink`(value: MozTextBlinkProperty): Self = StObject.set(x, "-moz-text-blink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-text-blinkUndefined`: Self = StObject.set(x, "-moz-text-blink", js.undefined)
    
    @scala.inline
    def `set-moz-text-size-adjust`(value: TextSizeAdjustProperty): Self = StObject.set(x, "-moz-text-size-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-text-size-adjustUndefined`: Self = StObject.set(x, "-moz-text-size-adjust", js.undefined)
    
    @scala.inline
    def `set-moz-transform-origin`(value: TransformOriginProperty[TLength]): Self = StObject.set(x, "-moz-transform-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-transform-originUndefined`: Self = StObject.set(x, "-moz-transform-origin", js.undefined)
    
    @scala.inline
    def `set-moz-transform-style`(value: TransformStyleProperty): Self = StObject.set(x, "-moz-transform-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-transform-styleUndefined`: Self = StObject.set(x, "-moz-transform-style", js.undefined)
    
    @scala.inline
    def `set-moz-transition-delay`(value: GlobalsString): Self = StObject.set(x, "-moz-transition-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-transition-delayUndefined`: Self = StObject.set(x, "-moz-transition-delay", js.undefined)
    
    @scala.inline
    def `set-moz-transition-duration`(value: GlobalsString): Self = StObject.set(x, "-moz-transition-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-transition-durationUndefined`: Self = StObject.set(x, "-moz-transition-duration", js.undefined)
    
    @scala.inline
    def `set-moz-transition-property`(value: TransitionPropertyProperty): Self = StObject.set(x, "-moz-transition-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-transition-propertyUndefined`: Self = StObject.set(x, "-moz-transition-property", js.undefined)
    
    @scala.inline
    def `set-moz-transition-timing-function`(value: TransitionTimingFunctionProperty): Self = StObject.set(x, "-moz-transition-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-transition-timing-functionUndefined`: Self = StObject.set(x, "-moz-transition-timing-function", js.undefined)
    
    @scala.inline
    def `set-moz-user-focus`(value: MozUserFocusProperty): Self = StObject.set(x, "-moz-user-focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-user-focusUndefined`: Self = StObject.set(x, "-moz-user-focus", js.undefined)
    
    @scala.inline
    def `set-moz-user-modify`(value: MozUserModifyProperty): Self = StObject.set(x, "-moz-user-modify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-user-modifyUndefined`: Self = StObject.set(x, "-moz-user-modify", js.undefined)
    
    @scala.inline
    def `set-moz-user-select`(value: UserSelectProperty): Self = StObject.set(x, "-moz-user-select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-user-selectUndefined`: Self = StObject.set(x, "-moz-user-select", js.undefined)
    
    @scala.inline
    def `set-moz-window-dragging`(value: MozWindowDraggingProperty): Self = StObject.set(x, "-moz-window-dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-window-draggingUndefined`: Self = StObject.set(x, "-moz-window-dragging", js.undefined)
    
    @scala.inline
    def `set-moz-window-shadow`(value: MozWindowShadowProperty): Self = StObject.set(x, "-moz-window-shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-moz-window-shadowUndefined`: Self = StObject.set(x, "-moz-window-shadow", js.undefined)
    
    @scala.inline
    def `set-ms-accelerator`(value: MsAcceleratorProperty): Self = StObject.set(x, "-ms-accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-acceleratorUndefined`: Self = StObject.set(x, "-ms-accelerator", js.undefined)
    
    @scala.inline
    def `set-ms-align-self`(value: AlignSelfProperty): Self = StObject.set(x, "-ms-align-self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-align-selfUndefined`: Self = StObject.set(x, "-ms-align-self", js.undefined)
    
    @scala.inline
    def `set-ms-block-progression`(value: MsBlockProgressionProperty): Self = StObject.set(x, "-ms-block-progression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-block-progressionUndefined`: Self = StObject.set(x, "-ms-block-progression", js.undefined)
    
    @scala.inline
    def `set-ms-content-zoom-chaining`(value: MsContentZoomChainingProperty): Self = StObject.set(x, "-ms-content-zoom-chaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-content-zoom-chainingUndefined`: Self = StObject.set(x, "-ms-content-zoom-chaining", js.undefined)
    
    @scala.inline
    def `set-ms-content-zoom-limit-max`(value: GlobalsString): Self = StObject.set(x, "-ms-content-zoom-limit-max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-content-zoom-limit-maxUndefined`: Self = StObject.set(x, "-ms-content-zoom-limit-max", js.undefined)
    
    @scala.inline
    def `set-ms-content-zoom-limit-min`(value: GlobalsString): Self = StObject.set(x, "-ms-content-zoom-limit-min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-content-zoom-limit-minUndefined`: Self = StObject.set(x, "-ms-content-zoom-limit-min", js.undefined)
    
    @scala.inline
    def `set-ms-content-zoom-snap-points`(value: GlobalsString): Self = StObject.set(x, "-ms-content-zoom-snap-points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-content-zoom-snap-pointsUndefined`: Self = StObject.set(x, "-ms-content-zoom-snap-points", js.undefined)
    
    @scala.inline
    def `set-ms-content-zoom-snap-type`(value: MsContentZoomSnapTypeProperty): Self = StObject.set(x, "-ms-content-zoom-snap-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-content-zoom-snap-typeUndefined`: Self = StObject.set(x, "-ms-content-zoom-snap-type", js.undefined)
    
    @scala.inline
    def `set-ms-content-zooming`(value: MsContentZoomingProperty): Self = StObject.set(x, "-ms-content-zooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-content-zoomingUndefined`: Self = StObject.set(x, "-ms-content-zooming", js.undefined)
    
    @scala.inline
    def `set-ms-filter`(value: GlobalsString): Self = StObject.set(x, "-ms-filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-filterUndefined`: Self = StObject.set(x, "-ms-filter", js.undefined)
    
    @scala.inline
    def `set-ms-flex-direction`(value: FlexDirectionProperty): Self = StObject.set(x, "-ms-flex-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-flex-directionUndefined`: Self = StObject.set(x, "-ms-flex-direction", js.undefined)
    
    @scala.inline
    def `set-ms-flex-positive`(value: GlobalsNumber): Self = StObject.set(x, "-ms-flex-positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-flex-positiveUndefined`: Self = StObject.set(x, "-ms-flex-positive", js.undefined)
    
    @scala.inline
    def `set-ms-flow-from`(value: MsFlowFromProperty): Self = StObject.set(x, "-ms-flow-from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-flow-fromUndefined`: Self = StObject.set(x, "-ms-flow-from", js.undefined)
    
    @scala.inline
    def `set-ms-flow-into`(value: MsFlowIntoProperty): Self = StObject.set(x, "-ms-flow-into", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-flow-intoUndefined`: Self = StObject.set(x, "-ms-flow-into", js.undefined)
    
    @scala.inline
    def `set-ms-grid-columns`(value: MsGridColumnsProperty[TLength]): Self = StObject.set(x, "-ms-grid-columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-grid-columnsUndefined`: Self = StObject.set(x, "-ms-grid-columns", js.undefined)
    
    @scala.inline
    def `set-ms-grid-rows`(value: MsGridRowsProperty[TLength]): Self = StObject.set(x, "-ms-grid-rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-grid-rowsUndefined`: Self = StObject.set(x, "-ms-grid-rows", js.undefined)
    
    @scala.inline
    def `set-ms-high-contrast-adjust`(value: MsHighContrastAdjustProperty): Self = StObject.set(x, "-ms-high-contrast-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-high-contrast-adjustUndefined`: Self = StObject.set(x, "-ms-high-contrast-adjust", js.undefined)
    
    @scala.inline
    def `set-ms-hyphenate-limit-chars`(value: MsHyphenateLimitCharsProperty): Self = StObject.set(x, "-ms-hyphenate-limit-chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-hyphenate-limit-charsUndefined`: Self = StObject.set(x, "-ms-hyphenate-limit-chars", js.undefined)
    
    @scala.inline
    def `set-ms-hyphenate-limit-lines`(value: MsHyphenateLimitLinesProperty): Self = StObject.set(x, "-ms-hyphenate-limit-lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-hyphenate-limit-linesUndefined`: Self = StObject.set(x, "-ms-hyphenate-limit-lines", js.undefined)
    
    @scala.inline
    def `set-ms-hyphenate-limit-zone`(value: MsHyphenateLimitZoneProperty[TLength]): Self = StObject.set(x, "-ms-hyphenate-limit-zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-hyphenate-limit-zoneUndefined`: Self = StObject.set(x, "-ms-hyphenate-limit-zone", js.undefined)
    
    @scala.inline
    def `set-ms-hyphens`(value: HyphensProperty): Self = StObject.set(x, "-ms-hyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-hyphensUndefined`: Self = StObject.set(x, "-ms-hyphens", js.undefined)
    
    @scala.inline
    def `set-ms-ime-align`(value: MsImeAlignProperty): Self = StObject.set(x, "-ms-ime-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-ime-alignUndefined`: Self = StObject.set(x, "-ms-ime-align", js.undefined)
    
    @scala.inline
    def `set-ms-justify-self`(value: JustifySelfProperty): Self = StObject.set(x, "-ms-justify-self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-justify-selfUndefined`: Self = StObject.set(x, "-ms-justify-self", js.undefined)
    
    @scala.inline
    def `set-ms-line-break`(value: LineBreakProperty): Self = StObject.set(x, "-ms-line-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-line-breakUndefined`: Self = StObject.set(x, "-ms-line-break", js.undefined)
    
    @scala.inline
    def `set-ms-order`(value: GlobalsNumber): Self = StObject.set(x, "-ms-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-orderUndefined`: Self = StObject.set(x, "-ms-order", js.undefined)
    
    @scala.inline
    def `set-ms-overflow-style`(value: MsOverflowStyleProperty): Self = StObject.set(x, "-ms-overflow-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-overflow-styleUndefined`: Self = StObject.set(x, "-ms-overflow-style", js.undefined)
    
    @scala.inline
    def `set-ms-overflow-x`(value: OverflowXProperty): Self = StObject.set(x, "-ms-overflow-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-overflow-xUndefined`: Self = StObject.set(x, "-ms-overflow-x", js.undefined)
    
    @scala.inline
    def `set-ms-overflow-y`(value: OverflowYProperty): Self = StObject.set(x, "-ms-overflow-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-overflow-yUndefined`: Self = StObject.set(x, "-ms-overflow-y", js.undefined)
    
    @scala.inline
    def `set-ms-scroll-chaining`(value: MsScrollChainingProperty): Self = StObject.set(x, "-ms-scroll-chaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scroll-chainingUndefined`: Self = StObject.set(x, "-ms-scroll-chaining", js.undefined)
    
    @scala.inline
    def `set-ms-scroll-limit-x-max`(value: MsScrollLimitXMaxProperty[TLength]): Self = StObject.set(x, "-ms-scroll-limit-x-max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scroll-limit-x-maxUndefined`: Self = StObject.set(x, "-ms-scroll-limit-x-max", js.undefined)
    
    @scala.inline
    def `set-ms-scroll-limit-x-min`(value: MsScrollLimitXMinProperty[TLength]): Self = StObject.set(x, "-ms-scroll-limit-x-min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scroll-limit-x-minUndefined`: Self = StObject.set(x, "-ms-scroll-limit-x-min", js.undefined)
    
    @scala.inline
    def `set-ms-scroll-limit-y-max`(value: MsScrollLimitYMaxProperty[TLength]): Self = StObject.set(x, "-ms-scroll-limit-y-max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scroll-limit-y-maxUndefined`: Self = StObject.set(x, "-ms-scroll-limit-y-max", js.undefined)
    
    @scala.inline
    def `set-ms-scroll-limit-y-min`(value: MsScrollLimitYMinProperty[TLength]): Self = StObject.set(x, "-ms-scroll-limit-y-min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scroll-limit-y-minUndefined`: Self = StObject.set(x, "-ms-scroll-limit-y-min", js.undefined)
    
    @scala.inline
    def `set-ms-scroll-rails`(value: MsScrollRailsProperty): Self = StObject.set(x, "-ms-scroll-rails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scroll-railsUndefined`: Self = StObject.set(x, "-ms-scroll-rails", js.undefined)
    
    @scala.inline
    def `set-ms-scroll-snap-points-x`(value: GlobalsString): Self = StObject.set(x, "-ms-scroll-snap-points-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scroll-snap-points-xUndefined`: Self = StObject.set(x, "-ms-scroll-snap-points-x", js.undefined)
    
    @scala.inline
    def `set-ms-scroll-snap-points-y`(value: GlobalsString): Self = StObject.set(x, "-ms-scroll-snap-points-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scroll-snap-points-yUndefined`: Self = StObject.set(x, "-ms-scroll-snap-points-y", js.undefined)
    
    @scala.inline
    def `set-ms-scroll-snap-type`(value: MsScrollSnapTypeProperty): Self = StObject.set(x, "-ms-scroll-snap-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scroll-snap-typeUndefined`: Self = StObject.set(x, "-ms-scroll-snap-type", js.undefined)
    
    @scala.inline
    def `set-ms-scroll-translation`(value: MsScrollTranslationProperty): Self = StObject.set(x, "-ms-scroll-translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scroll-translationUndefined`: Self = StObject.set(x, "-ms-scroll-translation", js.undefined)
    
    @scala.inline
    def `set-ms-scrollbar-3dlight-color`(value: MsScrollbar3dlightColorProperty): Self = StObject.set(x, "-ms-scrollbar-3dlight-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scrollbar-3dlight-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-3dlight-color", js.undefined)
    
    @scala.inline
    def `set-ms-scrollbar-arrow-color`(value: MsScrollbarArrowColorProperty): Self = StObject.set(x, "-ms-scrollbar-arrow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scrollbar-arrow-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-arrow-color", js.undefined)
    
    @scala.inline
    def `set-ms-scrollbar-base-color`(value: MsScrollbarBaseColorProperty): Self = StObject.set(x, "-ms-scrollbar-base-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scrollbar-base-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-base-color", js.undefined)
    
    @scala.inline
    def `set-ms-scrollbar-darkshadow-color`(value: MsScrollbarDarkshadowColorProperty): Self = StObject.set(x, "-ms-scrollbar-darkshadow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scrollbar-darkshadow-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-darkshadow-color", js.undefined)
    
    @scala.inline
    def `set-ms-scrollbar-face-color`(value: MsScrollbarFaceColorProperty): Self = StObject.set(x, "-ms-scrollbar-face-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scrollbar-face-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-face-color", js.undefined)
    
    @scala.inline
    def `set-ms-scrollbar-highlight-color`(value: MsScrollbarHighlightColorProperty): Self = StObject.set(x, "-ms-scrollbar-highlight-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scrollbar-highlight-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-highlight-color", js.undefined)
    
    @scala.inline
    def `set-ms-scrollbar-shadow-color`(value: MsScrollbarShadowColorProperty): Self = StObject.set(x, "-ms-scrollbar-shadow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-scrollbar-shadow-colorUndefined`: Self = StObject.set(x, "-ms-scrollbar-shadow-color", js.undefined)
    
    @scala.inline
    def `set-ms-text-autospace`(value: MsTextAutospaceProperty): Self = StObject.set(x, "-ms-text-autospace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-text-autospaceUndefined`: Self = StObject.set(x, "-ms-text-autospace", js.undefined)
    
    @scala.inline
    def `set-ms-text-combine-horizontal`(value: TextCombineUprightProperty): Self = StObject.set(x, "-ms-text-combine-horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-text-combine-horizontalUndefined`: Self = StObject.set(x, "-ms-text-combine-horizontal", js.undefined)
    
    @scala.inline
    def `set-ms-text-overflow`(value: TextOverflowProperty): Self = StObject.set(x, "-ms-text-overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-text-overflowUndefined`: Self = StObject.set(x, "-ms-text-overflow", js.undefined)
    
    @scala.inline
    def `set-ms-touch-action`(value: TouchActionProperty): Self = StObject.set(x, "-ms-touch-action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-touch-actionUndefined`: Self = StObject.set(x, "-ms-touch-action", js.undefined)
    
    @scala.inline
    def `set-ms-touch-select`(value: MsTouchSelectProperty): Self = StObject.set(x, "-ms-touch-select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-touch-selectUndefined`: Self = StObject.set(x, "-ms-touch-select", js.undefined)
    
    @scala.inline
    def `set-ms-transform`(value: TransformProperty): Self = StObject.set(x, "-ms-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-transform-origin`(value: TransformOriginProperty[TLength]): Self = StObject.set(x, "-ms-transform-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-transform-originUndefined`: Self = StObject.set(x, "-ms-transform-origin", js.undefined)
    
    @scala.inline
    def `set-ms-transformUndefined`: Self = StObject.set(x, "-ms-transform", js.undefined)
    
    @scala.inline
    def `set-ms-transition-delay`(value: GlobalsString): Self = StObject.set(x, "-ms-transition-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-transition-delayUndefined`: Self = StObject.set(x, "-ms-transition-delay", js.undefined)
    
    @scala.inline
    def `set-ms-transition-duration`(value: GlobalsString): Self = StObject.set(x, "-ms-transition-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-transition-durationUndefined`: Self = StObject.set(x, "-ms-transition-duration", js.undefined)
    
    @scala.inline
    def `set-ms-transition-property`(value: TransitionPropertyProperty): Self = StObject.set(x, "-ms-transition-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-transition-propertyUndefined`: Self = StObject.set(x, "-ms-transition-property", js.undefined)
    
    @scala.inline
    def `set-ms-transition-timing-function`(value: TransitionTimingFunctionProperty): Self = StObject.set(x, "-ms-transition-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-transition-timing-functionUndefined`: Self = StObject.set(x, "-ms-transition-timing-function", js.undefined)
    
    @scala.inline
    def `set-ms-user-select`(value: MsUserSelectProperty): Self = StObject.set(x, "-ms-user-select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-user-selectUndefined`: Self = StObject.set(x, "-ms-user-select", js.undefined)
    
    @scala.inline
    def `set-ms-word-break`(value: WordBreakProperty): Self = StObject.set(x, "-ms-word-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-word-breakUndefined`: Self = StObject.set(x, "-ms-word-break", js.undefined)
    
    @scala.inline
    def `set-ms-wrap-flow`(value: MsWrapFlowProperty): Self = StObject.set(x, "-ms-wrap-flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-wrap-flowUndefined`: Self = StObject.set(x, "-ms-wrap-flow", js.undefined)
    
    @scala.inline
    def `set-ms-wrap-margin`(value: MsWrapMarginProperty[TLength]): Self = StObject.set(x, "-ms-wrap-margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-wrap-marginUndefined`: Self = StObject.set(x, "-ms-wrap-margin", js.undefined)
    
    @scala.inline
    def `set-ms-wrap-through`(value: MsWrapThroughProperty): Self = StObject.set(x, "-ms-wrap-through", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-wrap-throughUndefined`: Self = StObject.set(x, "-ms-wrap-through", js.undefined)
    
    @scala.inline
    def `set-ms-writing-mode`(value: WritingModeProperty): Self = StObject.set(x, "-ms-writing-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-ms-writing-modeUndefined`: Self = StObject.set(x, "-ms-writing-mode", js.undefined)
    
    @scala.inline
    def `set-o-object-fit`(value: ObjectFitProperty): Self = StObject.set(x, "-o-object-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-o-object-fitUndefined`: Self = StObject.set(x, "-o-object-fit", js.undefined)
    
    @scala.inline
    def `set-o-object-position`(value: ObjectPositionProperty[TLength]): Self = StObject.set(x, "-o-object-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-o-object-positionUndefined`: Self = StObject.set(x, "-o-object-position", js.undefined)
    
    @scala.inline
    def `set-o-tab-size`(value: TabSizeProperty[TLength]): Self = StObject.set(x, "-o-tab-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-o-tab-sizeUndefined`: Self = StObject.set(x, "-o-tab-size", js.undefined)
    
    @scala.inline
    def `set-o-text-overflow`(value: TextOverflowProperty): Self = StObject.set(x, "-o-text-overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-o-text-overflowUndefined`: Self = StObject.set(x, "-o-text-overflow", js.undefined)
    
    @scala.inline
    def `set-o-transform-origin`(value: TransformOriginProperty[TLength]): Self = StObject.set(x, "-o-transform-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-o-transform-originUndefined`: Self = StObject.set(x, "-o-transform-origin", js.undefined)
    
    @scala.inline
    def `set-webkit-align-content`(value: AlignContentProperty): Self = StObject.set(x, "-webkit-align-content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-align-contentUndefined`: Self = StObject.set(x, "-webkit-align-content", js.undefined)
    
    @scala.inline
    def `set-webkit-align-items`(value: AlignItemsProperty): Self = StObject.set(x, "-webkit-align-items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-align-itemsUndefined`: Self = StObject.set(x, "-webkit-align-items", js.undefined)
    
    @scala.inline
    def `set-webkit-align-self`(value: AlignSelfProperty): Self = StObject.set(x, "-webkit-align-self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-align-selfUndefined`: Self = StObject.set(x, "-webkit-align-self", js.undefined)
    
    @scala.inline
    def `set-webkit-animation-delay`(value: GlobalsString): Self = StObject.set(x, "-webkit-animation-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-animation-delayUndefined`: Self = StObject.set(x, "-webkit-animation-delay", js.undefined)
    
    @scala.inline
    def `set-webkit-animation-direction`(value: AnimationDirectionProperty): Self = StObject.set(x, "-webkit-animation-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-animation-directionUndefined`: Self = StObject.set(x, "-webkit-animation-direction", js.undefined)
    
    @scala.inline
    def `set-webkit-animation-duration`(value: GlobalsString): Self = StObject.set(x, "-webkit-animation-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-animation-durationUndefined`: Self = StObject.set(x, "-webkit-animation-duration", js.undefined)
    
    @scala.inline
    def `set-webkit-animation-fill-mode`(value: AnimationFillModeProperty): Self = StObject.set(x, "-webkit-animation-fill-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-animation-fill-modeUndefined`: Self = StObject.set(x, "-webkit-animation-fill-mode", js.undefined)
    
    @scala.inline
    def `set-webkit-animation-iteration-count`(value: AnimationIterationCountProperty): Self = StObject.set(x, "-webkit-animation-iteration-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-animation-iteration-countUndefined`: Self = StObject.set(x, "-webkit-animation-iteration-count", js.undefined)
    
    @scala.inline
    def `set-webkit-animation-name`(value: AnimationNameProperty): Self = StObject.set(x, "-webkit-animation-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-animation-nameUndefined`: Self = StObject.set(x, "-webkit-animation-name", js.undefined)
    
    @scala.inline
    def `set-webkit-animation-play-state`(value: AnimationPlayStateProperty): Self = StObject.set(x, "-webkit-animation-play-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-animation-play-stateUndefined`: Self = StObject.set(x, "-webkit-animation-play-state", js.undefined)
    
    @scala.inline
    def `set-webkit-animation-timing-function`(value: AnimationTimingFunctionProperty): Self = StObject.set(x, "-webkit-animation-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-animation-timing-functionUndefined`: Self = StObject.set(x, "-webkit-animation-timing-function", js.undefined)
    
    @scala.inline
    def `set-webkit-appearance`(value: WebkitAppearanceProperty): Self = StObject.set(x, "-webkit-appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-appearanceUndefined`: Self = StObject.set(x, "-webkit-appearance", js.undefined)
    
    @scala.inline
    def `set-webkit-backdrop-filter`(value: BackdropFilterProperty): Self = StObject.set(x, "-webkit-backdrop-filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-backdrop-filterUndefined`: Self = StObject.set(x, "-webkit-backdrop-filter", js.undefined)
    
    @scala.inline
    def `set-webkit-backface-visibility`(value: BackfaceVisibilityProperty): Self = StObject.set(x, "-webkit-backface-visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-backface-visibilityUndefined`: Self = StObject.set(x, "-webkit-backface-visibility", js.undefined)
    
    @scala.inline
    def `set-webkit-background-clip`(value: BackgroundClipProperty): Self = StObject.set(x, "-webkit-background-clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-background-clipUndefined`: Self = StObject.set(x, "-webkit-background-clip", js.undefined)
    
    @scala.inline
    def `set-webkit-background-origin`(value: BackgroundOriginProperty): Self = StObject.set(x, "-webkit-background-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-background-originUndefined`: Self = StObject.set(x, "-webkit-background-origin", js.undefined)
    
    @scala.inline
    def `set-webkit-background-size`(value: BackgroundSizeProperty[TLength]): Self = StObject.set(x, "-webkit-background-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-background-sizeUndefined`: Self = StObject.set(x, "-webkit-background-size", js.undefined)
    
    @scala.inline
    def `set-webkit-border-before-color`(value: WebkitBorderBeforeColorProperty): Self = StObject.set(x, "-webkit-border-before-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-border-before-colorUndefined`: Self = StObject.set(x, "-webkit-border-before-color", js.undefined)
    
    @scala.inline
    def `set-webkit-border-before-style`(value: WebkitBorderBeforeStyleProperty): Self = StObject.set(x, "-webkit-border-before-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-border-before-styleUndefined`: Self = StObject.set(x, "-webkit-border-before-style", js.undefined)
    
    @scala.inline
    def `set-webkit-border-before-width`(value: WebkitBorderBeforeWidthProperty[TLength]): Self = StObject.set(x, "-webkit-border-before-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-border-before-widthUndefined`: Self = StObject.set(x, "-webkit-border-before-width", js.undefined)
    
    @scala.inline
    def `set-webkit-border-bottom-left-radius`(value: BorderBottomLeftRadiusProperty[TLength]): Self = StObject.set(x, "-webkit-border-bottom-left-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-border-bottom-left-radiusUndefined`: Self = StObject.set(x, "-webkit-border-bottom-left-radius", js.undefined)
    
    @scala.inline
    def `set-webkit-border-bottom-right-radius`(value: BorderBottomRightRadiusProperty[TLength]): Self = StObject.set(x, "-webkit-border-bottom-right-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-border-bottom-right-radiusUndefined`: Self = StObject.set(x, "-webkit-border-bottom-right-radius", js.undefined)
    
    @scala.inline
    def `set-webkit-border-image-slice`(value: BorderImageSliceProperty): Self = StObject.set(x, "-webkit-border-image-slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-border-image-sliceUndefined`: Self = StObject.set(x, "-webkit-border-image-slice", js.undefined)
    
    @scala.inline
    def `set-webkit-border-top-left-radius`(value: BorderTopLeftRadiusProperty[TLength]): Self = StObject.set(x, "-webkit-border-top-left-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-border-top-left-radiusUndefined`: Self = StObject.set(x, "-webkit-border-top-left-radius", js.undefined)
    
    @scala.inline
    def `set-webkit-border-top-right-radius`(value: BorderTopRightRadiusProperty[TLength]): Self = StObject.set(x, "-webkit-border-top-right-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-border-top-right-radiusUndefined`: Self = StObject.set(x, "-webkit-border-top-right-radius", js.undefined)
    
    @scala.inline
    def `set-webkit-box-decoration-break`(value: BoxDecorationBreakProperty): Self = StObject.set(x, "-webkit-box-decoration-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-box-decoration-breakUndefined`: Self = StObject.set(x, "-webkit-box-decoration-break", js.undefined)
    
    @scala.inline
    def `set-webkit-box-reflect`(value: WebkitBoxReflectProperty[TLength]): Self = StObject.set(x, "-webkit-box-reflect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-box-reflectUndefined`: Self = StObject.set(x, "-webkit-box-reflect", js.undefined)
    
    @scala.inline
    def `set-webkit-box-shadow`(value: BoxShadowProperty): Self = StObject.set(x, "-webkit-box-shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-box-shadowUndefined`: Self = StObject.set(x, "-webkit-box-shadow", js.undefined)
    
    @scala.inline
    def `set-webkit-box-sizing`(value: BoxSizingProperty): Self = StObject.set(x, "-webkit-box-sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-box-sizingUndefined`: Self = StObject.set(x, "-webkit-box-sizing", js.undefined)
    
    @scala.inline
    def `set-webkit-clip-path`(value: ClipPathProperty): Self = StObject.set(x, "-webkit-clip-path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-clip-pathUndefined`: Self = StObject.set(x, "-webkit-clip-path", js.undefined)
    
    @scala.inline
    def `set-webkit-column-count`(value: ColumnCountProperty): Self = StObject.set(x, "-webkit-column-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-column-countUndefined`: Self = StObject.set(x, "-webkit-column-count", js.undefined)
    
    @scala.inline
    def `set-webkit-column-fill`(value: ColumnFillProperty): Self = StObject.set(x, "-webkit-column-fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-column-fillUndefined`: Self = StObject.set(x, "-webkit-column-fill", js.undefined)
    
    @scala.inline
    def `set-webkit-column-gap`(value: ColumnGapProperty[TLength]): Self = StObject.set(x, "-webkit-column-gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-column-gapUndefined`: Self = StObject.set(x, "-webkit-column-gap", js.undefined)
    
    @scala.inline
    def `set-webkit-column-rule-color`(value: ColumnRuleColorProperty): Self = StObject.set(x, "-webkit-column-rule-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-column-rule-colorUndefined`: Self = StObject.set(x, "-webkit-column-rule-color", js.undefined)
    
    @scala.inline
    def `set-webkit-column-rule-style`(value: ColumnRuleStyleProperty): Self = StObject.set(x, "-webkit-column-rule-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-column-rule-styleUndefined`: Self = StObject.set(x, "-webkit-column-rule-style", js.undefined)
    
    @scala.inline
    def `set-webkit-column-rule-width`(value: ColumnRuleWidthProperty[TLength]): Self = StObject.set(x, "-webkit-column-rule-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-column-rule-widthUndefined`: Self = StObject.set(x, "-webkit-column-rule-width", js.undefined)
    
    @scala.inline
    def `set-webkit-column-span`(value: ColumnSpanProperty): Self = StObject.set(x, "-webkit-column-span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-column-spanUndefined`: Self = StObject.set(x, "-webkit-column-span", js.undefined)
    
    @scala.inline
    def `set-webkit-column-width`(value: ColumnWidthProperty[TLength]): Self = StObject.set(x, "-webkit-column-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-column-widthUndefined`: Self = StObject.set(x, "-webkit-column-width", js.undefined)
    
    @scala.inline
    def `set-webkit-filter`(value: FilterProperty): Self = StObject.set(x, "-webkit-filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-filterUndefined`: Self = StObject.set(x, "-webkit-filter", js.undefined)
    
    @scala.inline
    def `set-webkit-flex-basis`(value: FlexBasisProperty[TLength]): Self = StObject.set(x, "-webkit-flex-basis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-flex-basisUndefined`: Self = StObject.set(x, "-webkit-flex-basis", js.undefined)
    
    @scala.inline
    def `set-webkit-flex-direction`(value: FlexDirectionProperty): Self = StObject.set(x, "-webkit-flex-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-flex-directionUndefined`: Self = StObject.set(x, "-webkit-flex-direction", js.undefined)
    
    @scala.inline
    def `set-webkit-flex-grow`(value: GlobalsNumber): Self = StObject.set(x, "-webkit-flex-grow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-flex-growUndefined`: Self = StObject.set(x, "-webkit-flex-grow", js.undefined)
    
    @scala.inline
    def `set-webkit-flex-shrink`(value: GlobalsNumber): Self = StObject.set(x, "-webkit-flex-shrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-flex-shrinkUndefined`: Self = StObject.set(x, "-webkit-flex-shrink", js.undefined)
    
    @scala.inline
    def `set-webkit-flex-wrap`(value: FlexWrapProperty): Self = StObject.set(x, "-webkit-flex-wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-flex-wrapUndefined`: Self = StObject.set(x, "-webkit-flex-wrap", js.undefined)
    
    @scala.inline
    def `set-webkit-font-feature-settings`(value: FontFeatureSettingsProperty): Self = StObject.set(x, "-webkit-font-feature-settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-font-feature-settingsUndefined`: Self = StObject.set(x, "-webkit-font-feature-settings", js.undefined)
    
    @scala.inline
    def `set-webkit-font-kerning`(value: FontKerningProperty): Self = StObject.set(x, "-webkit-font-kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-font-kerningUndefined`: Self = StObject.set(x, "-webkit-font-kerning", js.undefined)
    
    @scala.inline
    def `set-webkit-font-smoothing`(value: FontSmoothProperty[TLength]): Self = StObject.set(x, "-webkit-font-smoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-font-smoothingUndefined`: Self = StObject.set(x, "-webkit-font-smoothing", js.undefined)
    
    @scala.inline
    def `set-webkit-font-variant-ligatures`(value: FontVariantLigaturesProperty): Self = StObject.set(x, "-webkit-font-variant-ligatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-font-variant-ligaturesUndefined`: Self = StObject.set(x, "-webkit-font-variant-ligatures", js.undefined)
    
    @scala.inline
    def `set-webkit-hyphens`(value: HyphensProperty): Self = StObject.set(x, "-webkit-hyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-hyphensUndefined`: Self = StObject.set(x, "-webkit-hyphens", js.undefined)
    
    @scala.inline
    def `set-webkit-justify-content`(value: JustifyContentProperty): Self = StObject.set(x, "-webkit-justify-content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-justify-contentUndefined`: Self = StObject.set(x, "-webkit-justify-content", js.undefined)
    
    @scala.inline
    def `set-webkit-line-break`(value: LineBreakProperty): Self = StObject.set(x, "-webkit-line-break", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-line-breakUndefined`: Self = StObject.set(x, "-webkit-line-break", js.undefined)
    
    @scala.inline
    def `set-webkit-line-clamp`(value: WebkitLineClampProperty): Self = StObject.set(x, "-webkit-line-clamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-line-clampUndefined`: Self = StObject.set(x, "-webkit-line-clamp", js.undefined)
    
    @scala.inline
    def `set-webkit-margin-end`(value: MarginInlineEndProperty[TLength]): Self = StObject.set(x, "-webkit-margin-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-margin-endUndefined`: Self = StObject.set(x, "-webkit-margin-end", js.undefined)
    
    @scala.inline
    def `set-webkit-margin-start`(value: MarginInlineStartProperty[TLength]): Self = StObject.set(x, "-webkit-margin-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-margin-startUndefined`: Self = StObject.set(x, "-webkit-margin-start", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-attachment`(value: WebkitMaskAttachmentProperty): Self = StObject.set(x, "-webkit-mask-attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-attachmentUndefined`: Self = StObject.set(x, "-webkit-mask-attachment", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-clip`(value: WebkitMaskClipProperty): Self = StObject.set(x, "-webkit-mask-clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-clipUndefined`: Self = StObject.set(x, "-webkit-mask-clip", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-composite`(value: WebkitMaskCompositeProperty): Self = StObject.set(x, "-webkit-mask-composite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-compositeUndefined`: Self = StObject.set(x, "-webkit-mask-composite", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-image`(value: WebkitMaskImageProperty): Self = StObject.set(x, "-webkit-mask-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-imageUndefined`: Self = StObject.set(x, "-webkit-mask-image", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-origin`(value: WebkitMaskOriginProperty): Self = StObject.set(x, "-webkit-mask-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-originUndefined`: Self = StObject.set(x, "-webkit-mask-origin", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-position`(value: WebkitMaskPositionProperty[TLength]): Self = StObject.set(x, "-webkit-mask-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-position-x`(value: WebkitMaskPositionXProperty[TLength]): Self = StObject.set(x, "-webkit-mask-position-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-position-xUndefined`: Self = StObject.set(x, "-webkit-mask-position-x", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-position-y`(value: WebkitMaskPositionYProperty[TLength]): Self = StObject.set(x, "-webkit-mask-position-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-position-yUndefined`: Self = StObject.set(x, "-webkit-mask-position-y", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-positionUndefined`: Self = StObject.set(x, "-webkit-mask-position", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-repeat`(value: WebkitMaskRepeatProperty): Self = StObject.set(x, "-webkit-mask-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-repeat-x`(value: WebkitMaskRepeatXProperty): Self = StObject.set(x, "-webkit-mask-repeat-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-repeat-xUndefined`: Self = StObject.set(x, "-webkit-mask-repeat-x", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-repeat-y`(value: WebkitMaskRepeatYProperty): Self = StObject.set(x, "-webkit-mask-repeat-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-repeat-yUndefined`: Self = StObject.set(x, "-webkit-mask-repeat-y", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-repeatUndefined`: Self = StObject.set(x, "-webkit-mask-repeat", js.undefined)
    
    @scala.inline
    def `set-webkit-mask-size`(value: WebkitMaskSizeProperty[TLength]): Self = StObject.set(x, "-webkit-mask-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-mask-sizeUndefined`: Self = StObject.set(x, "-webkit-mask-size", js.undefined)
    
    @scala.inline
    def `set-webkit-max-inline-size`(value: MaxInlineSizeProperty[TLength]): Self = StObject.set(x, "-webkit-max-inline-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-max-inline-sizeUndefined`: Self = StObject.set(x, "-webkit-max-inline-size", js.undefined)
    
    @scala.inline
    def `set-webkit-order`(value: GlobalsNumber): Self = StObject.set(x, "-webkit-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-orderUndefined`: Self = StObject.set(x, "-webkit-order", js.undefined)
    
    @scala.inline
    def `set-webkit-overflow-scrolling`(value: WebkitOverflowScrollingProperty): Self = StObject.set(x, "-webkit-overflow-scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-overflow-scrollingUndefined`: Self = StObject.set(x, "-webkit-overflow-scrolling", js.undefined)
    
    @scala.inline
    def `set-webkit-padding-end`(value: PaddingInlineEndProperty[TLength]): Self = StObject.set(x, "-webkit-padding-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-padding-endUndefined`: Self = StObject.set(x, "-webkit-padding-end", js.undefined)
    
    @scala.inline
    def `set-webkit-padding-start`(value: PaddingInlineStartProperty[TLength]): Self = StObject.set(x, "-webkit-padding-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-padding-startUndefined`: Self = StObject.set(x, "-webkit-padding-start", js.undefined)
    
    @scala.inline
    def `set-webkit-perspective`(value: PerspectiveProperty[TLength]): Self = StObject.set(x, "-webkit-perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-perspective-origin`(value: PerspectiveOriginProperty[TLength]): Self = StObject.set(x, "-webkit-perspective-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-perspective-originUndefined`: Self = StObject.set(x, "-webkit-perspective-origin", js.undefined)
    
    @scala.inline
    def `set-webkit-perspectiveUndefined`: Self = StObject.set(x, "-webkit-perspective", js.undefined)
    
    @scala.inline
    def `set-webkit-print-color-adjust`(value: ColorAdjustProperty): Self = StObject.set(x, "-webkit-print-color-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-print-color-adjustUndefined`: Self = StObject.set(x, "-webkit-print-color-adjust", js.undefined)
    
    @scala.inline
    def `set-webkit-ruby-position`(value: RubyPositionProperty): Self = StObject.set(x, "-webkit-ruby-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-ruby-positionUndefined`: Self = StObject.set(x, "-webkit-ruby-position", js.undefined)
    
    @scala.inline
    def `set-webkit-scroll-snap-type`(value: ScrollSnapTypeProperty): Self = StObject.set(x, "-webkit-scroll-snap-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-scroll-snap-typeUndefined`: Self = StObject.set(x, "-webkit-scroll-snap-type", js.undefined)
    
    @scala.inline
    def `set-webkit-shape-margin`(value: ShapeMarginProperty[TLength]): Self = StObject.set(x, "-webkit-shape-margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-shape-marginUndefined`: Self = StObject.set(x, "-webkit-shape-margin", js.undefined)
    
    @scala.inline
    def `set-webkit-tap-highlight-color`(value: WebkitTapHighlightColorProperty): Self = StObject.set(x, "-webkit-tap-highlight-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-tap-highlight-colorUndefined`: Self = StObject.set(x, "-webkit-tap-highlight-color", js.undefined)
    
    @scala.inline
    def `set-webkit-text-combine`(value: TextCombineUprightProperty): Self = StObject.set(x, "-webkit-text-combine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-combineUndefined`: Self = StObject.set(x, "-webkit-text-combine", js.undefined)
    
    @scala.inline
    def `set-webkit-text-decoration-color`(value: TextDecorationColorProperty): Self = StObject.set(x, "-webkit-text-decoration-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-decoration-colorUndefined`: Self = StObject.set(x, "-webkit-text-decoration-color", js.undefined)
    
    @scala.inline
    def `set-webkit-text-decoration-line`(value: TextDecorationLineProperty): Self = StObject.set(x, "-webkit-text-decoration-line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-decoration-lineUndefined`: Self = StObject.set(x, "-webkit-text-decoration-line", js.undefined)
    
    @scala.inline
    def `set-webkit-text-decoration-skip`(value: TextDecorationSkipProperty): Self = StObject.set(x, "-webkit-text-decoration-skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-decoration-skipUndefined`: Self = StObject.set(x, "-webkit-text-decoration-skip", js.undefined)
    
    @scala.inline
    def `set-webkit-text-decoration-style`(value: TextDecorationStyleProperty): Self = StObject.set(x, "-webkit-text-decoration-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-decoration-styleUndefined`: Self = StObject.set(x, "-webkit-text-decoration-style", js.undefined)
    
    @scala.inline
    def `set-webkit-text-emphasis-color`(value: TextEmphasisColorProperty): Self = StObject.set(x, "-webkit-text-emphasis-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-emphasis-colorUndefined`: Self = StObject.set(x, "-webkit-text-emphasis-color", js.undefined)
    
    @scala.inline
    def `set-webkit-text-emphasis-position`(value: GlobalsString): Self = StObject.set(x, "-webkit-text-emphasis-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-emphasis-positionUndefined`: Self = StObject.set(x, "-webkit-text-emphasis-position", js.undefined)
    
    @scala.inline
    def `set-webkit-text-emphasis-style`(value: TextEmphasisStyleProperty): Self = StObject.set(x, "-webkit-text-emphasis-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-emphasis-styleUndefined`: Self = StObject.set(x, "-webkit-text-emphasis-style", js.undefined)
    
    @scala.inline
    def `set-webkit-text-fill-color`(value: WebkitTextFillColorProperty): Self = StObject.set(x, "-webkit-text-fill-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-fill-colorUndefined`: Self = StObject.set(x, "-webkit-text-fill-color", js.undefined)
    
    @scala.inline
    def `set-webkit-text-orientation`(value: TextOrientationProperty): Self = StObject.set(x, "-webkit-text-orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-orientationUndefined`: Self = StObject.set(x, "-webkit-text-orientation", js.undefined)
    
    @scala.inline
    def `set-webkit-text-size-adjust`(value: TextSizeAdjustProperty): Self = StObject.set(x, "-webkit-text-size-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-size-adjustUndefined`: Self = StObject.set(x, "-webkit-text-size-adjust", js.undefined)
    
    @scala.inline
    def `set-webkit-text-stroke-color`(value: WebkitTextStrokeColorProperty): Self = StObject.set(x, "-webkit-text-stroke-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-stroke-colorUndefined`: Self = StObject.set(x, "-webkit-text-stroke-color", js.undefined)
    
    @scala.inline
    def `set-webkit-text-stroke-width`(value: WebkitTextStrokeWidthProperty[TLength]): Self = StObject.set(x, "-webkit-text-stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-stroke-widthUndefined`: Self = StObject.set(x, "-webkit-text-stroke-width", js.undefined)
    
    @scala.inline
    def `set-webkit-text-underline-position`(value: TextUnderlinePositionProperty): Self = StObject.set(x, "-webkit-text-underline-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-text-underline-positionUndefined`: Self = StObject.set(x, "-webkit-text-underline-position", js.undefined)
    
    @scala.inline
    def `set-webkit-touch-callout`(value: WebkitTouchCalloutProperty): Self = StObject.set(x, "-webkit-touch-callout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-touch-calloutUndefined`: Self = StObject.set(x, "-webkit-touch-callout", js.undefined)
    
    @scala.inline
    def `set-webkit-transform`(value: TransformProperty): Self = StObject.set(x, "-webkit-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-transform-origin`(value: TransformOriginProperty[TLength]): Self = StObject.set(x, "-webkit-transform-origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-transform-originUndefined`: Self = StObject.set(x, "-webkit-transform-origin", js.undefined)
    
    @scala.inline
    def `set-webkit-transform-style`(value: TransformStyleProperty): Self = StObject.set(x, "-webkit-transform-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-transform-styleUndefined`: Self = StObject.set(x, "-webkit-transform-style", js.undefined)
    
    @scala.inline
    def `set-webkit-transformUndefined`: Self = StObject.set(x, "-webkit-transform", js.undefined)
    
    @scala.inline
    def `set-webkit-transition-delay`(value: GlobalsString): Self = StObject.set(x, "-webkit-transition-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-transition-delayUndefined`: Self = StObject.set(x, "-webkit-transition-delay", js.undefined)
    
    @scala.inline
    def `set-webkit-transition-duration`(value: GlobalsString): Self = StObject.set(x, "-webkit-transition-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-transition-durationUndefined`: Self = StObject.set(x, "-webkit-transition-duration", js.undefined)
    
    @scala.inline
    def `set-webkit-transition-property`(value: TransitionPropertyProperty): Self = StObject.set(x, "-webkit-transition-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-transition-propertyUndefined`: Self = StObject.set(x, "-webkit-transition-property", js.undefined)
    
    @scala.inline
    def `set-webkit-transition-timing-function`(value: TransitionTimingFunctionProperty): Self = StObject.set(x, "-webkit-transition-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-transition-timing-functionUndefined`: Self = StObject.set(x, "-webkit-transition-timing-function", js.undefined)
    
    @scala.inline
    def `set-webkit-user-modify`(value: WebkitUserModifyProperty): Self = StObject.set(x, "-webkit-user-modify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-user-modifyUndefined`: Self = StObject.set(x, "-webkit-user-modify", js.undefined)
    
    @scala.inline
    def `set-webkit-user-select`(value: UserSelectProperty): Self = StObject.set(x, "-webkit-user-select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-user-selectUndefined`: Self = StObject.set(x, "-webkit-user-select", js.undefined)
    
    @scala.inline
    def `set-webkit-writing-mode`(value: WritingModeProperty): Self = StObject.set(x, "-webkit-writing-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set-webkit-writing-modeUndefined`: Self = StObject.set(x, "-webkit-writing-mode", js.undefined)
  }
}
