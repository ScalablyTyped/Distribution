package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgPropertiesHyphenFallback because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `alignment-baseline`, `baseline-shift`, `clip-rule`, `color-interpolation`, `color-rendering`, `dominant-baseline`, fill, `fill-opacity`, `fill-rule`, `flood-color`, `flood-opacity`, `glyph-orientation-vertical`, `lighting-color`, marker, `marker-end`, `marker-mid`, `marker-start`, `shape-rendering`, `stop-color`, `stop-opacity`, stroke, `stroke-dasharray`, `stroke-dashoffset`, `stroke-linecap`, `stroke-linejoin`, `stroke-miterlimit`, `stroke-opacity`, `stroke-width`, `text-anchor`, `vector-effect` */ trait PropertiesHyphenFallback[TLength]
  extends StandardLonghandPropertiesHyphenFallback[TLength]
     with StandardShorthandPropertiesHyphenFallback[TLength]
     with VendorLonghandPropertiesHyphenFallback[TLength]
     with VendorShorthandPropertiesHyphenFallback[TLength]
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
    StandardLonghandPropertiesHyphenFallback: StandardLonghandPropertiesHyphenFallback[TLength] = null,
    StandardShorthandPropertiesHyphenFallback: StandardShorthandPropertiesHyphenFallback[TLength] = null,
    VendorLonghandPropertiesHyphenFallback: VendorLonghandPropertiesHyphenFallback[TLength] = null,
    VendorShorthandPropertiesHyphenFallback: VendorShorthandPropertiesHyphenFallback[TLength] = null,
    `alignment-baseline`: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty] = null,
    `baseline-shift`: BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]] = null,
    `clip-rule`: ClipRuleProperty | js.Array[ClipRuleProperty] = null,
    `color-interpolation`: ColorInterpolationProperty | js.Array[ColorInterpolationProperty] = null,
    `color-rendering`: ColorRenderingProperty | js.Array[ColorRenderingProperty] = null,
    `dominant-baseline`: DominantBaselineProperty | js.Array[DominantBaselineProperty] = null,
    fill: FillProperty | js.Array[FillProperty] = null,
    `fill-opacity`: GlobalsNumber | js.Array[GlobalsNumber] = null,
    `fill-rule`: FillRuleProperty | js.Array[FillRuleProperty] = null,
    `flood-color`: FloodColorProperty | js.Array[FloodColorProperty] = null,
    `flood-opacity`: GlobalsNumber | js.Array[GlobalsNumber] = null,
    `glyph-orientation-vertical`: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty] = null,
    `lighting-color`: LightingColorProperty | js.Array[LightingColorProperty] = null,
    marker: MarkerProperty | js.Array[MarkerProperty] = null,
    `marker-end`: MarkerEndProperty | js.Array[MarkerEndProperty] = null,
    `marker-mid`: MarkerMidProperty | js.Array[MarkerMidProperty] = null,
    `marker-start`: MarkerStartProperty | js.Array[MarkerStartProperty] = null,
    `shape-rendering`: ShapeRenderingProperty | js.Array[ShapeRenderingProperty] = null,
    `stop-color`: StopColorProperty | js.Array[StopColorProperty] = null,
    `stop-opacity`: GlobalsNumber | js.Array[GlobalsNumber] = null,
    stroke: StrokeProperty | js.Array[StrokeProperty] = null,
    `stroke-dasharray`: StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]] = null,
    `stroke-dashoffset`: StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]] = null,
    `stroke-linecap`: StrokeLinecapProperty | js.Array[StrokeLinecapProperty] = null,
    `stroke-linejoin`: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty] = null,
    `stroke-miterlimit`: GlobalsNumber | js.Array[GlobalsNumber] = null,
    `stroke-opacity`: GlobalsNumber | js.Array[GlobalsNumber] = null,
    `stroke-width`: StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]] = null,
    `text-anchor`: TextAnchorProperty | js.Array[TextAnchorProperty] = null,
    `vector-effect`: VectorEffectProperty | js.Array[VectorEffectProperty] = null
  ): PropertiesHyphenFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    if (ObsoletePropertiesHyphenFallback != null) js.Dynamic.global.Object.assign(__obj, ObsoletePropertiesHyphenFallback)
    if (StandardLonghandPropertiesHyphenFallback != null) js.Dynamic.global.Object.assign(__obj, StandardLonghandPropertiesHyphenFallback)
    if (StandardShorthandPropertiesHyphenFallback != null) js.Dynamic.global.Object.assign(__obj, StandardShorthandPropertiesHyphenFallback)
    if (VendorLonghandPropertiesHyphenFallback != null) js.Dynamic.global.Object.assign(__obj, VendorLonghandPropertiesHyphenFallback)
    if (VendorShorthandPropertiesHyphenFallback != null) js.Dynamic.global.Object.assign(__obj, VendorShorthandPropertiesHyphenFallback)
    if (`alignment-baseline` != null) __obj.updateDynamic("alignment-baseline")(`alignment-baseline`.asInstanceOf[js.Any])
    if (`baseline-shift` != null) __obj.updateDynamic("baseline-shift")(`baseline-shift`.asInstanceOf[js.Any])
    if (`clip-rule` != null) __obj.updateDynamic("clip-rule")(`clip-rule`.asInstanceOf[js.Any])
    if (`color-interpolation` != null) __obj.updateDynamic("color-interpolation")(`color-interpolation`.asInstanceOf[js.Any])
    if (`color-rendering` != null) __obj.updateDynamic("color-rendering")(`color-rendering`.asInstanceOf[js.Any])
    if (`dominant-baseline` != null) __obj.updateDynamic("dominant-baseline")(`dominant-baseline`.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (`fill-opacity` != null) __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    if (`fill-rule` != null) __obj.updateDynamic("fill-rule")(`fill-rule`.asInstanceOf[js.Any])
    if (`flood-color` != null) __obj.updateDynamic("flood-color")(`flood-color`.asInstanceOf[js.Any])
    if (`flood-opacity` != null) __obj.updateDynamic("flood-opacity")(`flood-opacity`.asInstanceOf[js.Any])
    if (`glyph-orientation-vertical` != null) __obj.updateDynamic("glyph-orientation-vertical")(`glyph-orientation-vertical`.asInstanceOf[js.Any])
    if (`lighting-color` != null) __obj.updateDynamic("lighting-color")(`lighting-color`.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (`marker-end` != null) __obj.updateDynamic("marker-end")(`marker-end`.asInstanceOf[js.Any])
    if (`marker-mid` != null) __obj.updateDynamic("marker-mid")(`marker-mid`.asInstanceOf[js.Any])
    if (`marker-start` != null) __obj.updateDynamic("marker-start")(`marker-start`.asInstanceOf[js.Any])
    if (`shape-rendering` != null) __obj.updateDynamic("shape-rendering")(`shape-rendering`.asInstanceOf[js.Any])
    if (`stop-color` != null) __obj.updateDynamic("stop-color")(`stop-color`.asInstanceOf[js.Any])
    if (`stop-opacity` != null) __obj.updateDynamic("stop-opacity")(`stop-opacity`.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`stroke-dasharray` != null) __obj.updateDynamic("stroke-dasharray")(`stroke-dasharray`.asInstanceOf[js.Any])
    if (`stroke-dashoffset` != null) __obj.updateDynamic("stroke-dashoffset")(`stroke-dashoffset`.asInstanceOf[js.Any])
    if (`stroke-linecap` != null) __obj.updateDynamic("stroke-linecap")(`stroke-linecap`.asInstanceOf[js.Any])
    if (`stroke-linejoin` != null) __obj.updateDynamic("stroke-linejoin")(`stroke-linejoin`.asInstanceOf[js.Any])
    if (`stroke-miterlimit` != null) __obj.updateDynamic("stroke-miterlimit")(`stroke-miterlimit`.asInstanceOf[js.Any])
    if (`stroke-opacity` != null) __obj.updateDynamic("stroke-opacity")(`stroke-opacity`.asInstanceOf[js.Any])
    if (`stroke-width` != null) __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    if (`vector-effect` != null) __obj.updateDynamic("vector-effect")(`vector-effect`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesHyphenFallback[TLength]]
  }
}

