package typings.csstype.mod

import typings.csstype.mod.Property.Animation
import typings.csstype.mod.Property.BorderImage
import typings.csstype.mod.Property.BorderRadius
import typings.csstype.mod.Property.ColumnRule
import typings.csstype.mod.Property.Columns
import typings.csstype.mod.Property.Flex
import typings.csstype.mod.Property.FlexFlow
import typings.csstype.mod.Property.MaskBorder
import typings.csstype.mod.Property.MsContentZoomLimit
import typings.csstype.mod.Property.MsContentZoomSnap
import typings.csstype.mod.Property.MsScrollLimit
import typings.csstype.mod.Property.MsScrollSnapX
import typings.csstype.mod.Property.MsScrollSnapY
import typings.csstype.mod.Property.TextEmphasis
import typings.csstype.mod.Property.Transition
import typings.csstype.mod.Property.WebkitBorderBefore
import typings.csstype.mod.Property.WebkitMask
import typings.csstype.mod.Property.WebkitTextStroke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VendorShorthandProperties[TLength, TTime] extends StObject {
  
  /**
    * The **`animation`** shorthand CSS property applies an animation between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    */
  var MozAnimation: js.UndefOr[Animation[TTime]] = js.undefined
  
  /**
    * The **`border-image`** CSS property draws an image around a given element. It replaces the element's regular border.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    */
  var MozBorderImage: js.UndefOr[BorderImage] = js.undefined
  
  /**
    * The **`column-rule`** shorthand CSS property sets the width, style, and color of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    */
  var MozColumnRule: js.UndefOr[ColumnRule[TLength]] = js.undefined
  
  /**
    * The **`columns`** CSS shorthand property sets the number of columns to use when drawing an element's contents, as well as those columns' widths.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    */
  var MozColumns: js.UndefOr[Columns[TLength]] = js.undefined
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var MozTransition: js.UndefOr[Transition[TTime]] = js.undefined
  
  /**
    * The **`animation`** shorthand CSS property applies an animation between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    */
  var WebkitAnimation: js.UndefOr[Animation[TTime]] = js.undefined
  
  /**
    * The **`-webkit-border-before`** CSS property is a shorthand property for setting the individual logical block start border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-width'> || <'border-style'> || <color>`
    */
  var WebkitBorderBefore: js.UndefOr[typings.csstype.mod.Property.WebkitBorderBefore[TLength]] = js.undefined
  
  /**
    * The **`border-image`** CSS property draws an image around a given element. It replaces the element's regular border.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    */
  var WebkitBorderImage: js.UndefOr[BorderImage] = js.undefined
  
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    */
  var WebkitBorderRadius: js.UndefOr[BorderRadius[TLength]] = js.undefined
  
  /**
    * The **`column-rule`** shorthand CSS property sets the width, style, and color of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    */
  var WebkitColumnRule: js.UndefOr[ColumnRule[TLength]] = js.undefined
  
  /**
    * The **`columns`** CSS shorthand property sets the number of columns to use when drawing an element's contents, as well as those columns' widths.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    */
  var WebkitColumns: js.UndefOr[Columns[TLength]] = js.undefined
  
  /**
    * The **`flex`** CSS shorthand property sets how a flex _item_ will grow or shrink to fit the space available in its flex container.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    */
  var WebkitFlex: js.UndefOr[Flex[TLength]] = js.undefined
  
  /**
    * The **`flex-flow`** CSS shorthand property specifies the direction of a flex container, as well as its wrapping behavior.
    *
    * **Syntax**: `<'flex-direction'> || <'flex-wrap'>`
    */
  var WebkitFlexFlow: js.UndefOr[FlexFlow] = js.undefined
  
  /**
    * The **`mask`** CSS shorthand property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * **Syntax**: `[ <mask-reference> || <position> [ / <bg-size> ]? || <repeat-style> || [ <box> | border | padding | content | text ] || [ <box> | border | padding | content ] ]#`
    */
  var WebkitMask: js.UndefOr[typings.csstype.mod.Property.WebkitMask[TLength]] = js.undefined
  
  /**
    * The **`mask-border`** CSS shorthand property lets you create a mask along the edge of an element's border.
    *
    * **Syntax**: `<'mask-border-source'> || <'mask-border-slice'> [ / <'mask-border-width'>? [ / <'mask-border-outset'> ]? ]? || <'mask-border-repeat'> || <'mask-border-mode'>`
    */
  var WebkitMaskBoxImage: js.UndefOr[MaskBorder] = js.undefined
  
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * **Syntax**: `<'text-emphasis-style'> || <'text-emphasis-color'>`
    */
  var WebkitTextEmphasis: js.UndefOr[TextEmphasis] = js.undefined
  
  /**
    * The **`-webkit-text-stroke`** CSS property specifies the width and color of strokes for text characters. This is a shorthand property for the longhand properties `-webkit-text-stroke-width` and `-webkit-text-stroke-color`.
    *
    * **Syntax**: `<length> || <color>`
    */
  var WebkitTextStroke: js.UndefOr[typings.csstype.mod.Property.WebkitTextStroke[TLength]] = js.undefined
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var WebkitTransition: js.UndefOr[Transition[TTime]] = js.undefined
  
  /**
    * The **`-ms-content-zoom-limit`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-limit-min` and `-ms-content-zoom-limit-max` properties.
    *
    * **Syntax**: `<'-ms-content-zoom-limit-min'> <'-ms-content-zoom-limit-max'>`
    */
  var msContentZoomLimit: js.UndefOr[MsContentZoomLimit] = js.undefined
  
  /**
    * The **`-ms-content-zoom-snap`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-snap-type` and `-ms-content-zoom-snap-points` properties.
    *
    * **Syntax**: `<'-ms-content-zoom-snap-type'> || <'-ms-content-zoom-snap-points'>`
    */
  var msContentZoomSnap: js.UndefOr[MsContentZoomSnap] = js.undefined
  
  /**
    * The **`flex`** CSS shorthand property sets how a flex _item_ will grow or shrink to fit the space available in its flex container.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    */
  var msFlex: js.UndefOr[Flex[TLength]] = js.undefined
  
  /**
    * The **\-ms-scroll-limit** CSS property is a Microsoft extension that specifies values for the `-ms-scroll-limit-x-min`, `-ms-scroll-limit-y-min`, `-ms-scroll-limit-x-max`, and `-ms-scroll-limit-y-max` properties.
    *
    * **Syntax**: `<'-ms-scroll-limit-x-min'> <'-ms-scroll-limit-y-min'> <'-ms-scroll-limit-x-max'> <'-ms-scroll-limit-y-max'>`
    */
  var msScrollLimit: js.UndefOr[MsScrollLimit] = js.undefined
  
  /**
    * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-x` properties.
    *
    * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-x'>`
    */
  var msScrollSnapX: js.UndefOr[MsScrollSnapX] = js.undefined
  
  /**
    * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-y` properties.
    *
    * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-y'>`
    */
  var msScrollSnapY: js.UndefOr[MsScrollSnapY] = js.undefined
  
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var msTransition: js.UndefOr[Transition[TTime]] = js.undefined
}
object VendorShorthandProperties {
  
  inline def apply[TLength, TTime](): VendorShorthandProperties[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorShorthandProperties[TLength, TTime]]
  }
  
  extension [Self <: VendorShorthandProperties[?, ?], TLength, TTime](x: Self & (VendorShorthandProperties[TLength, TTime])) {
    
    inline def setMozAnimation(value: Animation[TTime]): Self = StObject.set(x, "MozAnimation", value.asInstanceOf[js.Any])
    
    inline def setMozAnimationUndefined: Self = StObject.set(x, "MozAnimation", js.undefined)
    
    inline def setMozBorderImage(value: BorderImage): Self = StObject.set(x, "MozBorderImage", value.asInstanceOf[js.Any])
    
    inline def setMozBorderImageUndefined: Self = StObject.set(x, "MozBorderImage", js.undefined)
    
    inline def setMozColumnRule(value: ColumnRule[TLength]): Self = StObject.set(x, "MozColumnRule", value.asInstanceOf[js.Any])
    
    inline def setMozColumnRuleUndefined: Self = StObject.set(x, "MozColumnRule", js.undefined)
    
    inline def setMozColumns(value: Columns[TLength]): Self = StObject.set(x, "MozColumns", value.asInstanceOf[js.Any])
    
    inline def setMozColumnsUndefined: Self = StObject.set(x, "MozColumns", js.undefined)
    
    inline def setMozTransition(value: Transition[TTime]): Self = StObject.set(x, "MozTransition", value.asInstanceOf[js.Any])
    
    inline def setMozTransitionUndefined: Self = StObject.set(x, "MozTransition", js.undefined)
    
    inline def setMsContentZoomLimit(value: MsContentZoomLimit): Self = StObject.set(x, "msContentZoomLimit", value.asInstanceOf[js.Any])
    
    inline def setMsContentZoomLimitUndefined: Self = StObject.set(x, "msContentZoomLimit", js.undefined)
    
    inline def setMsContentZoomSnap(value: MsContentZoomSnap): Self = StObject.set(x, "msContentZoomSnap", value.asInstanceOf[js.Any])
    
    inline def setMsContentZoomSnapUndefined: Self = StObject.set(x, "msContentZoomSnap", js.undefined)
    
    inline def setMsFlex(value: Flex[TLength]): Self = StObject.set(x, "msFlex", value.asInstanceOf[js.Any])
    
    inline def setMsFlexUndefined: Self = StObject.set(x, "msFlex", js.undefined)
    
    inline def setMsScrollLimit(value: MsScrollLimit): Self = StObject.set(x, "msScrollLimit", value.asInstanceOf[js.Any])
    
    inline def setMsScrollLimitUndefined: Self = StObject.set(x, "msScrollLimit", js.undefined)
    
    inline def setMsScrollSnapX(value: MsScrollSnapX): Self = StObject.set(x, "msScrollSnapX", value.asInstanceOf[js.Any])
    
    inline def setMsScrollSnapXUndefined: Self = StObject.set(x, "msScrollSnapX", js.undefined)
    
    inline def setMsScrollSnapY(value: MsScrollSnapY): Self = StObject.set(x, "msScrollSnapY", value.asInstanceOf[js.Any])
    
    inline def setMsScrollSnapYUndefined: Self = StObject.set(x, "msScrollSnapY", js.undefined)
    
    inline def setMsTransition(value: Transition[TTime]): Self = StObject.set(x, "msTransition", value.asInstanceOf[js.Any])
    
    inline def setMsTransitionUndefined: Self = StObject.set(x, "msTransition", js.undefined)
    
    inline def setWebkitAnimation(value: Animation[TTime]): Self = StObject.set(x, "WebkitAnimation", value.asInstanceOf[js.Any])
    
    inline def setWebkitAnimationUndefined: Self = StObject.set(x, "WebkitAnimation", js.undefined)
    
    inline def setWebkitBorderBefore(value: WebkitBorderBefore[TLength]): Self = StObject.set(x, "WebkitBorderBefore", value.asInstanceOf[js.Any])
    
    inline def setWebkitBorderBeforeUndefined: Self = StObject.set(x, "WebkitBorderBefore", js.undefined)
    
    inline def setWebkitBorderImage(value: BorderImage): Self = StObject.set(x, "WebkitBorderImage", value.asInstanceOf[js.Any])
    
    inline def setWebkitBorderImageUndefined: Self = StObject.set(x, "WebkitBorderImage", js.undefined)
    
    inline def setWebkitBorderRadius(value: BorderRadius[TLength]): Self = StObject.set(x, "WebkitBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setWebkitBorderRadiusUndefined: Self = StObject.set(x, "WebkitBorderRadius", js.undefined)
    
    inline def setWebkitColumnRule(value: ColumnRule[TLength]): Self = StObject.set(x, "WebkitColumnRule", value.asInstanceOf[js.Any])
    
    inline def setWebkitColumnRuleUndefined: Self = StObject.set(x, "WebkitColumnRule", js.undefined)
    
    inline def setWebkitColumns(value: Columns[TLength]): Self = StObject.set(x, "WebkitColumns", value.asInstanceOf[js.Any])
    
    inline def setWebkitColumnsUndefined: Self = StObject.set(x, "WebkitColumns", js.undefined)
    
    inline def setWebkitFlex(value: Flex[TLength]): Self = StObject.set(x, "WebkitFlex", value.asInstanceOf[js.Any])
    
    inline def setWebkitFlexFlow(value: FlexFlow): Self = StObject.set(x, "WebkitFlexFlow", value.asInstanceOf[js.Any])
    
    inline def setWebkitFlexFlowUndefined: Self = StObject.set(x, "WebkitFlexFlow", js.undefined)
    
    inline def setWebkitFlexUndefined: Self = StObject.set(x, "WebkitFlex", js.undefined)
    
    inline def setWebkitMask(value: WebkitMask[TLength]): Self = StObject.set(x, "WebkitMask", value.asInstanceOf[js.Any])
    
    inline def setWebkitMaskBoxImage(value: MaskBorder): Self = StObject.set(x, "WebkitMaskBoxImage", value.asInstanceOf[js.Any])
    
    inline def setWebkitMaskBoxImageUndefined: Self = StObject.set(x, "WebkitMaskBoxImage", js.undefined)
    
    inline def setWebkitMaskUndefined: Self = StObject.set(x, "WebkitMask", js.undefined)
    
    inline def setWebkitTextEmphasis(value: TextEmphasis): Self = StObject.set(x, "WebkitTextEmphasis", value.asInstanceOf[js.Any])
    
    inline def setWebkitTextEmphasisUndefined: Self = StObject.set(x, "WebkitTextEmphasis", js.undefined)
    
    inline def setWebkitTextStroke(value: WebkitTextStroke[TLength]): Self = StObject.set(x, "WebkitTextStroke", value.asInstanceOf[js.Any])
    
    inline def setWebkitTextStrokeUndefined: Self = StObject.set(x, "WebkitTextStroke", js.undefined)
    
    inline def setWebkitTransition(value: Transition[TTime]): Self = StObject.set(x, "WebkitTransition", value.asInstanceOf[js.Any])
    
    inline def setWebkitTransitionUndefined: Self = StObject.set(x, "WebkitTransition", js.undefined)
  }
}
