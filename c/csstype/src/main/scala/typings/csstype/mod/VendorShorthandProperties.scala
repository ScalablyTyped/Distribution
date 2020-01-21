package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VendorShorthandProperties[TLength] extends js.Object {
  /** The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`. */
  var MozAnimation: js.UndefOr[AnimationProperty] = js.undefined
  /** The **`border-image`** CSS property draws an image in place of an element's `border-style`. */
  var MozBorderImage: js.UndefOr[BorderImageProperty] = js.undefined
  /** The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout. */
  var MozColumnRule: js.UndefOr[ColumnRuleProperty[TLength]] = js.undefined
  /** The **`columns`** CSS property sets the column width and column count of an element. */
  var MozColumns: js.UndefOr[ColumnsProperty[TLength]] = js.undefined
  /** The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`. */
  var MozTransition: js.UndefOr[TransitionProperty] = js.undefined
  /** The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`. */
  var WebkitAnimation: js.UndefOr[AnimationProperty] = js.undefined
  /** The **`-webkit-border-before`** CSS property is a shorthand property for setting the individual logical block start border property values in a single place in the style sheet. */
  var WebkitBorderBefore: js.UndefOr[WebkitBorderBeforeProperty[TLength]] = js.undefined
  /** The **`border-image`** CSS property draws an image in place of an element's `border-style`. */
  var WebkitBorderImage: js.UndefOr[BorderImageProperty] = js.undefined
  /** The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners. */
  var WebkitBorderRadius: js.UndefOr[BorderRadiusProperty[TLength]] = js.undefined
  /** The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout. */
  var WebkitColumnRule: js.UndefOr[ColumnRuleProperty[TLength]] = js.undefined
  /** The **`columns`** CSS property sets the column width and column count of an element. */
  var WebkitColumns: js.UndefOr[ColumnsProperty[TLength]] = js.undefined
  /** The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`. */
  var WebkitFlex: js.UndefOr[FlexProperty[TLength]] = js.undefined
  /** The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties. */
  var WebkitFlexFlow: js.UndefOr[FlexFlowProperty] = js.undefined
  /** The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points. */
  var WebkitMask: js.UndefOr[WebkitMaskProperty[TLength]] = js.undefined
  /** The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`. */
  var WebkitTextEmphasis: js.UndefOr[TextEmphasisProperty] = js.undefined
  /** The **`-webkit-text-stroke`** CSS property specifies the width and color of strokes for text characters. This is a shorthand property for the longhand properties `-webkit-text-stroke-width` and `-webkit-text-stroke-color`. */
  var WebkitTextStroke: js.UndefOr[WebkitTextStrokeProperty[TLength]] = js.undefined
  /** The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`. */
  var WebkitTransition: js.UndefOr[TransitionProperty] = js.undefined
  /** The **`-ms-content-zoom-limit`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-limit-min` and `-ms-content-zoom-limit-max` properties. */
  var msContentZoomLimit: js.UndefOr[GlobalsString] = js.undefined
  /** The **`-ms-content-zoom-snap`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-snap-type` and `-ms-content-zoom-snap-points` properties. */
  var msContentZoomSnap: js.UndefOr[MsContentZoomSnapProperty] = js.undefined
  /** The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`. */
  var msFlex: js.UndefOr[FlexProperty[TLength]] = js.undefined
  /** The **\-ms-scroll-limit** CSS property is a Microsoft extension that specifies values for the `-ms-scroll-limit-x-min`, `-ms-scroll-limit-y-min`, `-ms-scroll-limit-x-max`, and `-ms-scroll-limit-y-max` properties. */
  var msScrollLimit: js.UndefOr[GlobalsString] = js.undefined
  /** The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-x` properties. */
  var msScrollSnapX: js.UndefOr[GlobalsString] = js.undefined
  /** The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-y` properties. */
  var msScrollSnapY: js.UndefOr[GlobalsString] = js.undefined
  /** The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`. */
  var msTransition: js.UndefOr[TransitionProperty] = js.undefined
}

object VendorShorthandProperties {
  @scala.inline
  def apply[TLength](
    MozAnimation: AnimationProperty = null,
    MozBorderImage: BorderImageProperty = null,
    MozColumnRule: ColumnRuleProperty[TLength] = null,
    MozColumns: ColumnsProperty[TLength] = null,
    MozTransition: TransitionProperty = null,
    WebkitAnimation: AnimationProperty = null,
    WebkitBorderBefore: WebkitBorderBeforeProperty[TLength] = null,
    WebkitBorderImage: BorderImageProperty = null,
    WebkitBorderRadius: BorderRadiusProperty[TLength] = null,
    WebkitColumnRule: ColumnRuleProperty[TLength] = null,
    WebkitColumns: ColumnsProperty[TLength] = null,
    WebkitFlex: FlexProperty[TLength] = null,
    WebkitFlexFlow: FlexFlowProperty = null,
    WebkitMask: WebkitMaskProperty[TLength] = null,
    WebkitTextEmphasis: TextEmphasisProperty = null,
    WebkitTextStroke: WebkitTextStrokeProperty[TLength] = null,
    WebkitTransition: TransitionProperty = null,
    msContentZoomLimit: GlobalsString = null,
    msContentZoomSnap: MsContentZoomSnapProperty = null,
    msFlex: FlexProperty[TLength] = null,
    msScrollLimit: GlobalsString = null,
    msScrollSnapX: GlobalsString = null,
    msScrollSnapY: GlobalsString = null,
    msTransition: TransitionProperty = null
  ): VendorShorthandProperties[TLength] = {
    val __obj = js.Dynamic.literal()
    if (MozAnimation != null) __obj.updateDynamic("MozAnimation")(MozAnimation.asInstanceOf[js.Any])
    if (MozBorderImage != null) __obj.updateDynamic("MozBorderImage")(MozBorderImage.asInstanceOf[js.Any])
    if (MozColumnRule != null) __obj.updateDynamic("MozColumnRule")(MozColumnRule.asInstanceOf[js.Any])
    if (MozColumns != null) __obj.updateDynamic("MozColumns")(MozColumns.asInstanceOf[js.Any])
    if (MozTransition != null) __obj.updateDynamic("MozTransition")(MozTransition.asInstanceOf[js.Any])
    if (WebkitAnimation != null) __obj.updateDynamic("WebkitAnimation")(WebkitAnimation.asInstanceOf[js.Any])
    if (WebkitBorderBefore != null) __obj.updateDynamic("WebkitBorderBefore")(WebkitBorderBefore.asInstanceOf[js.Any])
    if (WebkitBorderImage != null) __obj.updateDynamic("WebkitBorderImage")(WebkitBorderImage.asInstanceOf[js.Any])
    if (WebkitBorderRadius != null) __obj.updateDynamic("WebkitBorderRadius")(WebkitBorderRadius.asInstanceOf[js.Any])
    if (WebkitColumnRule != null) __obj.updateDynamic("WebkitColumnRule")(WebkitColumnRule.asInstanceOf[js.Any])
    if (WebkitColumns != null) __obj.updateDynamic("WebkitColumns")(WebkitColumns.asInstanceOf[js.Any])
    if (WebkitFlex != null) __obj.updateDynamic("WebkitFlex")(WebkitFlex.asInstanceOf[js.Any])
    if (WebkitFlexFlow != null) __obj.updateDynamic("WebkitFlexFlow")(WebkitFlexFlow.asInstanceOf[js.Any])
    if (WebkitMask != null) __obj.updateDynamic("WebkitMask")(WebkitMask.asInstanceOf[js.Any])
    if (WebkitTextEmphasis != null) __obj.updateDynamic("WebkitTextEmphasis")(WebkitTextEmphasis.asInstanceOf[js.Any])
    if (WebkitTextStroke != null) __obj.updateDynamic("WebkitTextStroke")(WebkitTextStroke.asInstanceOf[js.Any])
    if (WebkitTransition != null) __obj.updateDynamic("WebkitTransition")(WebkitTransition.asInstanceOf[js.Any])
    if (msContentZoomLimit != null) __obj.updateDynamic("msContentZoomLimit")(msContentZoomLimit.asInstanceOf[js.Any])
    if (msContentZoomSnap != null) __obj.updateDynamic("msContentZoomSnap")(msContentZoomSnap.asInstanceOf[js.Any])
    if (msFlex != null) __obj.updateDynamic("msFlex")(msFlex.asInstanceOf[js.Any])
    if (msScrollLimit != null) __obj.updateDynamic("msScrollLimit")(msScrollLimit.asInstanceOf[js.Any])
    if (msScrollSnapX != null) __obj.updateDynamic("msScrollSnapX")(msScrollSnapX.asInstanceOf[js.Any])
    if (msScrollSnapY != null) __obj.updateDynamic("msScrollSnapY")(msScrollSnapY.asInstanceOf[js.Any])
    if (msTransition != null) __obj.updateDynamic("msTransition")(msTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[VendorShorthandProperties[TLength]]
  }
}

