package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.csstype.csstypeMod.SvgPropertiesHyphenFallback because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `alignment-baseline`, `baseline-shift`, `clip-rule`, `color-interpolation`, `color-rendering`, `dominant-baseline`, fill, `fill-opacity`, `fill-rule`, `flood-color`, `flood-opacity`, `glyph-orientation-vertical`, `lighting-color`, marker, `marker-end`, `marker-mid`, `marker-start`, `shape-rendering`, `stop-color`, `stop-opacity`, stroke, `stroke-dasharray`, `stroke-dashoffset`, `stroke-linecap`, `stroke-linejoin`, `stroke-miterlimit`, `stroke-opacity`, `stroke-width`, `text-anchor`, `vector-effect` */ trait PropertiesHyphenFallback[TLength]
  extends StandardPropertiesHyphenFallback[TLength]
     with VendorPropertiesHyphenFallback[TLength]
     with ObsoletePropertiesHyphenFallback[TLength] {
  var `alignment-baseline`: js.UndefOr[AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]] = js.undefined
  var `baseline-shift`: js.UndefOr[BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]] = js.undefined
  var `clip-rule`: js.UndefOr[ClipRuleProperty | js.Array[ClipRuleProperty]] = js.undefined
  var `color-interpolation`: js.UndefOr[ColorInterpolationProperty | js.Array[ColorInterpolationProperty]] = js.undefined
  var `color-rendering`: js.UndefOr[ColorRenderingProperty | js.Array[ColorRenderingProperty]] = js.undefined
  var `dominant-baseline`: js.UndefOr[DominantBaselineProperty | js.Array[DominantBaselineProperty]] = js.undefined
  var fill: js.UndefOr[FillProperty | js.Array[FillProperty]] = js.undefined
  var `fill-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var `fill-rule`: js.UndefOr[FillRuleProperty | js.Array[FillRuleProperty]] = js.undefined
  var `flood-color`: js.UndefOr[FloodColorProperty | js.Array[FloodColorProperty]] = js.undefined
  var `flood-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]] = js.undefined
  var `lighting-color`: js.UndefOr[LightingColorProperty | js.Array[LightingColorProperty]] = js.undefined
  var marker: js.UndefOr[MarkerProperty | js.Array[MarkerProperty]] = js.undefined
  var `marker-end`: js.UndefOr[MarkerEndProperty | js.Array[MarkerEndProperty]] = js.undefined
  var `marker-mid`: js.UndefOr[MarkerMidProperty | js.Array[MarkerMidProperty]] = js.undefined
  var `marker-start`: js.UndefOr[MarkerStartProperty | js.Array[MarkerStartProperty]] = js.undefined
  var `shape-rendering`: js.UndefOr[ShapeRenderingProperty | js.Array[ShapeRenderingProperty]] = js.undefined
  var `stop-color`: js.UndefOr[StopColorProperty | js.Array[StopColorProperty]] = js.undefined
  var `stop-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var stroke: js.UndefOr[StrokeProperty | js.Array[StrokeProperty]] = js.undefined
  var `stroke-dasharray`: js.UndefOr[StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]] = js.undefined
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]] = js.undefined
  var `stroke-linecap`: js.UndefOr[StrokeLinecapProperty | js.Array[StrokeLinecapProperty]] = js.undefined
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]] = js.undefined
  var `stroke-miterlimit`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var `stroke-opacity`: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var `stroke-width`: js.UndefOr[StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]] = js.undefined
  var `text-anchor`: js.UndefOr[TextAnchorProperty | js.Array[TextAnchorProperty]] = js.undefined
  var `vector-effect`: js.UndefOr[VectorEffectProperty | js.Array[VectorEffectProperty]] = js.undefined
}

object PropertiesHyphenFallback {
  @scala.inline
  def apply[TLength](
    ObsoletePropertiesHyphenFallback: ObsoletePropertiesHyphenFallback[TLength] = null,
    StandardPropertiesHyphenFallback: StandardPropertiesHyphenFallback[TLength] = null,
    SvgPropertiesHyphenFallback: SvgPropertiesHyphenFallback[TLength] = null,
    VendorPropertiesHyphenFallback: VendorPropertiesHyphenFallback[TLength] = null
  ): PropertiesHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ObsoletePropertiesHyphenFallback)
    js.Dynamic.global.Object.assign(__obj, StandardPropertiesHyphenFallback)
    js.Dynamic.global.Object.assign(__obj, SvgPropertiesHyphenFallback)
    js.Dynamic.global.Object.assign(__obj, VendorPropertiesHyphenFallback)
    __obj.asInstanceOf[PropertiesHyphenFallback[TLength]]
  }
}

