package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgPropertiesHyphen because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `alignment-baseline`, `baseline-shift`, `clip-rule`, `color-interpolation`, `color-rendering`, `dominant-baseline`, fill, `fill-opacity`, `fill-rule`, `flood-color`, `flood-opacity`, `glyph-orientation-vertical`, `lighting-color`, marker, `marker-end`, `marker-mid`, `marker-start`, `shape-rendering`, `stop-color`, `stop-opacity`, stroke, `stroke-dasharray`, `stroke-dashoffset`, `stroke-linecap`, `stroke-linejoin`, `stroke-miterlimit`, `stroke-opacity`, `stroke-width`, `text-anchor`, `vector-effect` */ trait PropertiesHyphen[TLength]
  extends StandardLonghandPropertiesHyphen[TLength]
     with StandardShorthandPropertiesHyphen[TLength]
     with VendorLonghandPropertiesHyphen[TLength]
     with VendorShorthandPropertiesHyphen[TLength]
     with ObsoletePropertiesHyphen[TLength] {
  var `alignment-baseline`: js.UndefOr[AlignmentBaselineProperty] = js.undefined
  var `baseline-shift`: js.UndefOr[BaselineShiftProperty[TLength]] = js.undefined
  var `clip-rule`: js.UndefOr[ClipRuleProperty] = js.undefined
  var `color-interpolation`: js.UndefOr[ColorInterpolationProperty] = js.undefined
  var `color-rendering`: js.UndefOr[ColorRenderingProperty] = js.undefined
  var `dominant-baseline`: js.UndefOr[DominantBaselineProperty] = js.undefined
  var fill: js.UndefOr[FillProperty] = js.undefined
  var `fill-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  var `fill-rule`: js.UndefOr[FillRuleProperty] = js.undefined
  var `flood-color`: js.UndefOr[FloodColorProperty] = js.undefined
  var `flood-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVerticalProperty] = js.undefined
  var `lighting-color`: js.UndefOr[LightingColorProperty] = js.undefined
  var marker: js.UndefOr[MarkerProperty] = js.undefined
  var `marker-end`: js.UndefOr[MarkerEndProperty] = js.undefined
  var `marker-mid`: js.UndefOr[MarkerMidProperty] = js.undefined
  var `marker-start`: js.UndefOr[MarkerStartProperty] = js.undefined
  var `shape-rendering`: js.UndefOr[ShapeRenderingProperty] = js.undefined
  var `stop-color`: js.UndefOr[StopColorProperty] = js.undefined
  var `stop-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  var stroke: js.UndefOr[StrokeProperty] = js.undefined
  var `stroke-dasharray`: js.UndefOr[StrokeDasharrayProperty[TLength]] = js.undefined
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffsetProperty[TLength]] = js.undefined
  var `stroke-linecap`: js.UndefOr[StrokeLinecapProperty] = js.undefined
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoinProperty] = js.undefined
  var `stroke-miterlimit`: js.UndefOr[GlobalsNumber] = js.undefined
  var `stroke-opacity`: js.UndefOr[GlobalsNumber] = js.undefined
  var `stroke-width`: js.UndefOr[StrokeWidthProperty[TLength]] = js.undefined
  var `text-anchor`: js.UndefOr[TextAnchorProperty] = js.undefined
  var `vector-effect`: js.UndefOr[VectorEffectProperty] = js.undefined
}

object PropertiesHyphen {
  @scala.inline
  def apply[TLength](
    ObsoletePropertiesHyphen: ObsoletePropertiesHyphen[TLength] = null,
    StandardLonghandPropertiesHyphen: StandardLonghandPropertiesHyphen[TLength] = null,
    StandardShorthandPropertiesHyphen: StandardShorthandPropertiesHyphen[TLength] = null,
    VendorLonghandPropertiesHyphen: VendorLonghandPropertiesHyphen[TLength] = null,
    VendorShorthandPropertiesHyphen: VendorShorthandPropertiesHyphen[TLength] = null,
    `alignment-baseline`: AlignmentBaselineProperty = null,
    `baseline-shift`: BaselineShiftProperty[TLength] = null,
    `clip-rule`: ClipRuleProperty = null,
    `color-interpolation`: ColorInterpolationProperty = null,
    `color-rendering`: ColorRenderingProperty = null,
    `dominant-baseline`: DominantBaselineProperty = null,
    fill: FillProperty = null,
    `fill-opacity`: GlobalsNumber = null,
    `fill-rule`: FillRuleProperty = null,
    `flood-color`: FloodColorProperty = null,
    `flood-opacity`: GlobalsNumber = null,
    `glyph-orientation-vertical`: GlyphOrientationVerticalProperty = null,
    `lighting-color`: LightingColorProperty = null,
    marker: MarkerProperty = null,
    `marker-end`: MarkerEndProperty = null,
    `marker-mid`: MarkerMidProperty = null,
    `marker-start`: MarkerStartProperty = null,
    `shape-rendering`: ShapeRenderingProperty = null,
    `stop-color`: StopColorProperty = null,
    `stop-opacity`: GlobalsNumber = null,
    stroke: StrokeProperty = null,
    `stroke-dasharray`: StrokeDasharrayProperty[TLength] = null,
    `stroke-dashoffset`: StrokeDashoffsetProperty[TLength] = null,
    `stroke-linecap`: StrokeLinecapProperty = null,
    `stroke-linejoin`: StrokeLinejoinProperty = null,
    `stroke-miterlimit`: GlobalsNumber = null,
    `stroke-opacity`: GlobalsNumber = null,
    `stroke-width`: StrokeWidthProperty[TLength] = null,
    `text-anchor`: TextAnchorProperty = null,
    `vector-effect`: VectorEffectProperty = null
  ): PropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    if (ObsoletePropertiesHyphen != null) js.Dynamic.global.Object.assign(__obj, ObsoletePropertiesHyphen)
    if (StandardLonghandPropertiesHyphen != null) js.Dynamic.global.Object.assign(__obj, StandardLonghandPropertiesHyphen)
    if (StandardShorthandPropertiesHyphen != null) js.Dynamic.global.Object.assign(__obj, StandardShorthandPropertiesHyphen)
    if (VendorLonghandPropertiesHyphen != null) js.Dynamic.global.Object.assign(__obj, VendorLonghandPropertiesHyphen)
    if (VendorShorthandPropertiesHyphen != null) js.Dynamic.global.Object.assign(__obj, VendorShorthandPropertiesHyphen)
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
    __obj.asInstanceOf[PropertiesHyphen[TLength]]
  }
}

