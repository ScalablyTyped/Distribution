package typings.csstype.mod

import typings.csstype.mod.Property.Animation
import typings.csstype.mod.Property.BorderImage
import typings.csstype.mod.Property.BorderRadius
import typings.csstype.mod.Property.ColumnRule
import typings.csstype.mod.Property.Columns
import typings.csstype.mod.Property.Flex
import typings.csstype.mod.Property.FlexFlow
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VendorShorthandPropertiesHyphen[TLength, TTime] extends js.Object {
  /**
    * The **`animation`** shorthand CSS property applies an animation between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    */
  var `-moz-animation`: js.UndefOr[Animation[TTime]] = js.native
  /**
    * The **`border-image`** CSS property draws an image around a given element. It replaces the element's regular border.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    */
  var `-moz-border-image`: js.UndefOr[BorderImage] = js.native
  /**
    * The **`column-rule`** shorthand CSS property sets the width, style, and color of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    */
  var `-moz-column-rule`: js.UndefOr[ColumnRule[TLength]] = js.native
  /**
    * The **`columns`** CSS property sets the column width and column count of an element.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    */
  var `-moz-columns`: js.UndefOr[Columns[TLength]] = js.native
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var `-moz-transition`: js.UndefOr[Transition[TTime]] = js.native
  /**
    * The **`-ms-content-zoom-limit`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-limit-min` and `-ms-content-zoom-limit-max` properties.
    *
    * **Syntax**: `<'-ms-content-zoom-limit-min'> <'-ms-content-zoom-limit-max'>`
    */
  var `-ms-content-zoom-limit`: js.UndefOr[MsContentZoomLimit] = js.native
  /**
    * The **`-ms-content-zoom-snap`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-content-zoom-snap-type` and `-ms-content-zoom-snap-points` properties.
    *
    * **Syntax**: `<'-ms-content-zoom-snap-type'> || <'-ms-content-zoom-snap-points'>`
    */
  var `-ms-content-zoom-snap`: js.UndefOr[MsContentZoomSnap] = js.native
  /**
    * The **`flex`** CSS property sets how a flex _item_ will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    */
  var `-ms-flex`: js.UndefOr[Flex[TLength]] = js.native
  /**
    * The **\-ms-scroll-limit** CSS property is a Microsoft extension that specifies values for the `-ms-scroll-limit-x-min`, `-ms-scroll-limit-y-min`, `-ms-scroll-limit-x-max`, and `-ms-scroll-limit-y-max` properties.
    *
    * **Syntax**: `<'-ms-scroll-limit-x-min'> <'-ms-scroll-limit-y-min'> <'-ms-scroll-limit-x-max'> <'-ms-scroll-limit-y-max'>`
    */
  var `-ms-scroll-limit`: js.UndefOr[MsScrollLimit] = js.native
  /**
    * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-x` properties.
    *
    * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-x'>`
    */
  var `-ms-scroll-snap-x`: js.UndefOr[MsScrollSnapX] = js.native
  /**
    * The **`-ms-scroll-snap-x`** CSS shorthand property is a Microsoft extension that specifies values for the `-ms-scroll-snap-type` and `-ms-scroll-snap-points-y` properties.
    *
    * **Syntax**: `<'-ms-scroll-snap-type'> <'-ms-scroll-snap-points-y'>`
    */
  var `-ms-scroll-snap-y`: js.UndefOr[MsScrollSnapY] = js.native
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var `-ms-transition`: js.UndefOr[Transition[TTime]] = js.native
  /**
    * The **`animation`** shorthand CSS property applies an animation between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * **Syntax**: `<single-animation>#`
    */
  var `-webkit-animation`: js.UndefOr[Animation[TTime]] = js.native
  /**
    * The **`-webkit-border-before`** CSS property is a shorthand property for setting the individual logical block start border property values in a single place in the style sheet.
    *
    * **Syntax**: `<'border-width'> || <'border-style'> || <'color'>`
    */
  var `-webkit-border-before`: js.UndefOr[WebkitBorderBefore[TLength]] = js.native
  /**
    * The **`border-image`** CSS property draws an image around a given element. It replaces the element's regular border.
    *
    * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
    */
  var `-webkit-border-image`: js.UndefOr[BorderImage] = js.native
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
    */
  var `-webkit-border-radius`: js.UndefOr[BorderRadius[TLength]] = js.native
  /**
    * The **`column-rule`** shorthand CSS property sets the width, style, and color of the line drawn between columns in a multi-column layout.
    *
    * **Syntax**: `<'column-rule-width'> || <'column-rule-style'> || <'column-rule-color'>`
    */
  var `-webkit-column-rule`: js.UndefOr[ColumnRule[TLength]] = js.native
  /**
    * The **`columns`** CSS property sets the column width and column count of an element.
    *
    * **Syntax**: `<'column-width'> || <'column-count'>`
    */
  var `-webkit-columns`: js.UndefOr[Columns[TLength]] = js.native
  /**
    * The **`flex`** CSS property sets how a flex _item_ will grow or shrink to fit the space available in its flex container. It is a shorthand for `flex-grow`, `flex-shrink`, and `flex-basis`.
    *
    * **Syntax**: `none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]`
    */
  var `-webkit-flex`: js.UndefOr[Flex[TLength]] = js.native
  /**
    * The **`flex-flow`** CSS property is a shorthand property for `flex-direction` and `flex-wrap` properties.
    *
    * **Syntax**: `<'flex-direction'> || <'flex-wrap'>`
    */
  var `-webkit-flex-flow`: js.UndefOr[FlexFlow] = js.native
  /**
    * The **`mask`** CSS property hides an element (partially or fully) by masking or clipping the image at specific points.
    *
    * **Syntax**: `[ <mask-reference> || <position> [ / <bg-size> ]? || <repeat-style> || [ <box> | border | padding | content | text ] || [ <box> | border | padding | content ] ]#`
    */
  var `-webkit-mask`: js.UndefOr[WebkitMask[TLength]] = js.native
  /**
    * The **`text-emphasis`** CSS property applies emphasis marks to text (except spaces and control characters). It is a shorthand for `text-emphasis-style` and `text-emphasis-color`.
    *
    * **Syntax**: `<'text-emphasis-style'> || <'text-emphasis-color'>`
    */
  var `-webkit-text-emphasis`: js.UndefOr[TextEmphasis] = js.native
  /**
    * The **`-webkit-text-stroke`** CSS property specifies the width and color of strokes for text characters. This is a shorthand property for the longhand properties `-webkit-text-stroke-width` and `-webkit-text-stroke-color`.
    *
    * **Syntax**: `<length> || <color>`
    */
  var `-webkit-text-stroke`: js.UndefOr[WebkitTextStroke[TLength]] = js.native
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * **Syntax**: `<single-transition>#`
    */
  var `-webkit-transition`: js.UndefOr[Transition[TTime]] = js.native
}

object VendorShorthandPropertiesHyphen {
  @scala.inline
  def apply[TLength, TTime](): VendorShorthandPropertiesHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VendorShorthandPropertiesHyphen[TLength, TTime]]
  }
  @scala.inline
  implicit class VendorShorthandPropertiesHyphenOps[Self <: VendorShorthandPropertiesHyphen[_, _], TLength, TTime] (val x: Self with (VendorShorthandPropertiesHyphen[TLength, TTime])) extends AnyVal {
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
    def `set-moz-animation`(value: Animation[TTime]): Self = this.set("-moz-animation", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-animation`: Self = this.set("-moz-animation", js.undefined)
    @scala.inline
    def `set-moz-border-image`(value: BorderImage): Self = this.set("-moz-border-image", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-border-image`: Self = this.set("-moz-border-image", js.undefined)
    @scala.inline
    def `set-moz-column-rule`(value: ColumnRule[TLength]): Self = this.set("-moz-column-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-column-rule`: Self = this.set("-moz-column-rule", js.undefined)
    @scala.inline
    def `set-moz-columns`(value: Columns[TLength]): Self = this.set("-moz-columns", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-columns`: Self = this.set("-moz-columns", js.undefined)
    @scala.inline
    def `set-moz-transition`(value: Transition[TTime]): Self = this.set("-moz-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-moz-transition`: Self = this.set("-moz-transition", js.undefined)
    @scala.inline
    def `set-ms-content-zoom-limit`(value: MsContentZoomLimit): Self = this.set("-ms-content-zoom-limit", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-content-zoom-limit`: Self = this.set("-ms-content-zoom-limit", js.undefined)
    @scala.inline
    def `set-ms-content-zoom-snap`(value: MsContentZoomSnap): Self = this.set("-ms-content-zoom-snap", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-content-zoom-snap`: Self = this.set("-ms-content-zoom-snap", js.undefined)
    @scala.inline
    def `set-ms-flex`(value: Flex[TLength]): Self = this.set("-ms-flex", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-flex`: Self = this.set("-ms-flex", js.undefined)
    @scala.inline
    def `set-ms-scroll-limit`(value: MsScrollLimit): Self = this.set("-ms-scroll-limit", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-scroll-limit`: Self = this.set("-ms-scroll-limit", js.undefined)
    @scala.inline
    def `set-ms-scroll-snap-x`(value: MsScrollSnapX): Self = this.set("-ms-scroll-snap-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-scroll-snap-x`: Self = this.set("-ms-scroll-snap-x", js.undefined)
    @scala.inline
    def `set-ms-scroll-snap-y`(value: MsScrollSnapY): Self = this.set("-ms-scroll-snap-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-scroll-snap-y`: Self = this.set("-ms-scroll-snap-y", js.undefined)
    @scala.inline
    def `set-ms-transition`(value: Transition[TTime]): Self = this.set("-ms-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-ms-transition`: Self = this.set("-ms-transition", js.undefined)
    @scala.inline
    def `set-webkit-animation`(value: Animation[TTime]): Self = this.set("-webkit-animation", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-animation`: Self = this.set("-webkit-animation", js.undefined)
    @scala.inline
    def `set-webkit-border-before`(value: WebkitBorderBefore[TLength]): Self = this.set("-webkit-border-before", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-border-before`: Self = this.set("-webkit-border-before", js.undefined)
    @scala.inline
    def `set-webkit-border-image`(value: BorderImage): Self = this.set("-webkit-border-image", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-border-image`: Self = this.set("-webkit-border-image", js.undefined)
    @scala.inline
    def `set-webkit-border-radius`(value: BorderRadius[TLength]): Self = this.set("-webkit-border-radius", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-border-radius`: Self = this.set("-webkit-border-radius", js.undefined)
    @scala.inline
    def `set-webkit-column-rule`(value: ColumnRule[TLength]): Self = this.set("-webkit-column-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-column-rule`: Self = this.set("-webkit-column-rule", js.undefined)
    @scala.inline
    def `set-webkit-columns`(value: Columns[TLength]): Self = this.set("-webkit-columns", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-columns`: Self = this.set("-webkit-columns", js.undefined)
    @scala.inline
    def `set-webkit-flex`(value: Flex[TLength]): Self = this.set("-webkit-flex", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-flex`: Self = this.set("-webkit-flex", js.undefined)
    @scala.inline
    def `set-webkit-flex-flow`(value: FlexFlow): Self = this.set("-webkit-flex-flow", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-flex-flow`: Self = this.set("-webkit-flex-flow", js.undefined)
    @scala.inline
    def `set-webkit-mask`(value: WebkitMask[TLength]): Self = this.set("-webkit-mask", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-mask`: Self = this.set("-webkit-mask", js.undefined)
    @scala.inline
    def `set-webkit-text-emphasis`(value: TextEmphasis): Self = this.set("-webkit-text-emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-text-emphasis`: Self = this.set("-webkit-text-emphasis", js.undefined)
    @scala.inline
    def `set-webkit-text-stroke`(value: WebkitTextStroke[TLength]): Self = this.set("-webkit-text-stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-text-stroke`: Self = this.set("-webkit-text-stroke", js.undefined)
    @scala.inline
    def `set-webkit-transition`(value: Transition[TTime]): Self = this.set("-webkit-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete-webkit-transition`: Self = this.set("-webkit-transition", js.undefined)
  }
  
}

