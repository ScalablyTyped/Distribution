package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VendorShorthandProperties[TLength] extends StObject {
  
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    */
  var MozAnimation: js.UndefOr[AnimationProperty] = js.undefined
  
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    */
  var MozBorderImage: js.UndefOr[BorderImageProperty] = js.undefined
  
  /**
    * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    */
  var MozColumnRule: js.UndefOr[ColumnRuleProperty[TLength]] = js.undefined
  
  /**
    * The **`columns`** CSS property sets the column width and column count of an element.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    */
  var MozColumns: js.UndefOr[ColumnsProperty[TLength]] = js.undefined
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var MozTransition: js.UndefOr[TransitionProperty] = js.undefined
  
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    */
  var WebkitAnimation: js.UndefOr[AnimationProperty] = js.undefined
  
  /**
    * The **`-webkit-border-before`** CSS property is a shorthand property for setting the individual logical block start border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-width'> || <'border-style'> || <'color'>`
    */
  var WebkitBorderBefore: js.UndefOr[WebkitBorderBeforeProperty[TLength]] = js.undefined
  
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    */
  var WebkitBorderImage: js.UndefOr[BorderImageProperty] = js.undefined
  
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    */
  var WebkitBorderRadius: js.UndefOr[BorderRadiusProperty[TLength]] = js.undefined
  
  /**
    * The **`column-rule`** CSS property sets the width, style, and color of the rule (line) drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    */
  var WebkitColumnRule: js.UndefOr[ColumnRuleProperty[TLength]] = js.undefined
  
  /**
    * The **`columns`** CSS property sets the column width and column count of an element.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    */
  var WebkitColumns: js.UndefOr[ColumnsProperty[TLength]] = js.undefined
  
  /**
    * The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    */
  var WebkitFlex: js.UndefOr[FlexProperty[TLength]] = js.undefined
  
  /**
    * The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties.
    *
    * **Syntax**: `<'flex-direction'> || <'flex-wrap'>`
    */
  var WebkitFlexFlow: js.UndefOr[FlexFlowProperty] = js.undefined
  
  /**
    * The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * **Syntax**: `[ <mask-reference> || <position> [ / <bg-size> ]? || <repeat-style> || [ <box> | border | padding | content | text ] || [ <box> | border | padding | content ] ]#`
    */
  var WebkitMask: js.UndefOr[WebkitMaskProperty[TLength]] = js.undefined
  
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * **Syntax**: `<'text-emphasis-style'> || <'text-emphasis-color'>`
    */
  var WebkitTextEmphasis: js.UndefOr[TextEmphasisProperty] = js.undefined
  
  /**
    * The **`-webkit-text-stroke`** CSS property specifies the width and color of strokes for text characters. This is a shorthand property for the longhand properties `-webkit-text-stroke-width` and `-webkit-text-stroke-color`.
    *
    * **Syntax**: `<length> || <color>`
    */
  var WebkitTextStroke: js.UndefOr[WebkitTextStrokeProperty[TLength]] = js.undefined
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var WebkitTransition: js.UndefOr[TransitionProperty] = js.undefined
  
  /**
    * The **`-ms-content-zoom-limit`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-limit-min` and `-ms-content-zoom-limit-max` properties.
    *
    * **Syntax**: `<'-ms-content-zoom-limit-min'> <'-ms-content-zoom-limit-max'>`
    */
  var msContentZoomLimit: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`-ms-content-zoom-snap`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-snap-type` and `-ms-content-zoom-snap-points` properties.
    *
    * **Syntax**: `<'-ms-content-zoom-snap-type'> || <'-ms-content-zoom-snap-points'>`
    */
  var msContentZoomSnap: js.UndefOr[MsContentZoomSnapProperty] = js.undefined
  
  /**
    * The **`flex`** CSS property sets how a flex item will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    */
  var msFlex: js.UndefOr[FlexProperty[TLength]] = js.undefined
  
  /**
    * The **\-ms-scroll-limit** CSS property is a Microsoft extension that specifies values for the `-ms-scroll-limit-x-min`, `-ms-scroll-limit-y-min`, `-ms-scroll-limit-x-max`, and `-ms-scroll-limit-y-max` properties.
    *
    * **Syntax**: `<'-ms-scroll-limit-x-min'> <'-ms-scroll-limit-y-min'> <'-ms-scroll-limit-x-max'> <'-ms-scroll-limit-y-max'>`
    */
  var msScrollLimit: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-x` properties.
    *
    * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-x'>`
    */
  var msScrollSnapX: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-y` properties.
    *
    * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-y'>`
    */
  var msScrollSnapY: js.UndefOr[GlobalsString] = js.undefined
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var msTransition: js.UndefOr[TransitionProperty] = js.undefined
}
object VendorShorthandProperties {
  
  @scala.inline
  def apply[TLength](): VendorShorthandProperties[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorShorthandProperties[TLength]]
  }
  
  @scala.inline
  implicit class VendorShorthandPropertiesMutableBuilder[Self <: VendorShorthandProperties[?], TLength] (val x: Self & VendorShorthandProperties[TLength]) extends AnyVal {
    
    @scala.inline
    def setMozAnimation(value: AnimationProperty): Self = StObject.set(x, "MozAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozAnimationUndefined: Self = StObject.set(x, "MozAnimation", js.undefined)
    
    @scala.inline
    def setMozBorderImage(value: BorderImageProperty): Self = StObject.set(x, "MozBorderImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozBorderImageUndefined: Self = StObject.set(x, "MozBorderImage", js.undefined)
    
    @scala.inline
    def setMozColumnRule(value: ColumnRuleProperty[TLength]): Self = StObject.set(x, "MozColumnRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColumnRuleUndefined: Self = StObject.set(x, "MozColumnRule", js.undefined)
    
    @scala.inline
    def setMozColumns(value: ColumnsProperty[TLength]): Self = StObject.set(x, "MozColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozColumnsUndefined: Self = StObject.set(x, "MozColumns", js.undefined)
    
    @scala.inline
    def setMozTransition(value: TransitionProperty): Self = StObject.set(x, "MozTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozTransitionUndefined: Self = StObject.set(x, "MozTransition", js.undefined)
    
    @scala.inline
    def setMsContentZoomLimit(value: GlobalsString): Self = StObject.set(x, "msContentZoomLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsContentZoomLimitUndefined: Self = StObject.set(x, "msContentZoomLimit", js.undefined)
    
    @scala.inline
    def setMsContentZoomSnap(value: MsContentZoomSnapProperty): Self = StObject.set(x, "msContentZoomSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsContentZoomSnapUndefined: Self = StObject.set(x, "msContentZoomSnap", js.undefined)
    
    @scala.inline
    def setMsFlex(value: FlexProperty[TLength]): Self = StObject.set(x, "msFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsFlexUndefined: Self = StObject.set(x, "msFlex", js.undefined)
    
    @scala.inline
    def setMsScrollLimit(value: GlobalsString): Self = StObject.set(x, "msScrollLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollLimitUndefined: Self = StObject.set(x, "msScrollLimit", js.undefined)
    
    @scala.inline
    def setMsScrollSnapX(value: GlobalsString): Self = StObject.set(x, "msScrollSnapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollSnapXUndefined: Self = StObject.set(x, "msScrollSnapX", js.undefined)
    
    @scala.inline
    def setMsScrollSnapY(value: GlobalsString): Self = StObject.set(x, "msScrollSnapY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsScrollSnapYUndefined: Self = StObject.set(x, "msScrollSnapY", js.undefined)
    
    @scala.inline
    def setMsTransition(value: TransitionProperty): Self = StObject.set(x, "msTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTransitionUndefined: Self = StObject.set(x, "msTransition", js.undefined)
    
    @scala.inline
    def setWebkitAnimation(value: AnimationProperty): Self = StObject.set(x, "WebkitAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitAnimationUndefined: Self = StObject.set(x, "WebkitAnimation", js.undefined)
    
    @scala.inline
    def setWebkitBorderBefore(value: WebkitBorderBeforeProperty[TLength]): Self = StObject.set(x, "WebkitBorderBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderBeforeUndefined: Self = StObject.set(x, "WebkitBorderBefore", js.undefined)
    
    @scala.inline
    def setWebkitBorderImage(value: BorderImageProperty): Self = StObject.set(x, "WebkitBorderImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderImageUndefined: Self = StObject.set(x, "WebkitBorderImage", js.undefined)
    
    @scala.inline
    def setWebkitBorderRadius(value: BorderRadiusProperty[TLength]): Self = StObject.set(x, "WebkitBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitBorderRadiusUndefined: Self = StObject.set(x, "WebkitBorderRadius", js.undefined)
    
    @scala.inline
    def setWebkitColumnRule(value: ColumnRuleProperty[TLength]): Self = StObject.set(x, "WebkitColumnRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnRuleUndefined: Self = StObject.set(x, "WebkitColumnRule", js.undefined)
    
    @scala.inline
    def setWebkitColumns(value: ColumnsProperty[TLength]): Self = StObject.set(x, "WebkitColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitColumnsUndefined: Self = StObject.set(x, "WebkitColumns", js.undefined)
    
    @scala.inline
    def setWebkitFlex(value: FlexProperty[TLength]): Self = StObject.set(x, "WebkitFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFlexFlow(value: FlexFlowProperty): Self = StObject.set(x, "WebkitFlexFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitFlexFlowUndefined: Self = StObject.set(x, "WebkitFlexFlow", js.undefined)
    
    @scala.inline
    def setWebkitFlexUndefined: Self = StObject.set(x, "WebkitFlex", js.undefined)
    
    @scala.inline
    def setWebkitMask(value: WebkitMaskProperty[TLength]): Self = StObject.set(x, "WebkitMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMaskUndefined: Self = StObject.set(x, "WebkitMask", js.undefined)
    
    @scala.inline
    def setWebkitTextEmphasis(value: TextEmphasisProperty): Self = StObject.set(x, "WebkitTextEmphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextEmphasisUndefined: Self = StObject.set(x, "WebkitTextEmphasis", js.undefined)
    
    @scala.inline
    def setWebkitTextStroke(value: WebkitTextStrokeProperty[TLength]): Self = StObject.set(x, "WebkitTextStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTextStrokeUndefined: Self = StObject.set(x, "WebkitTextStroke", js.undefined)
    
    @scala.inline
    def setWebkitTransition(value: TransitionProperty): Self = StObject.set(x, "WebkitTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTransitionUndefined: Self = StObject.set(x, "WebkitTransition", js.undefined)
  }
}
