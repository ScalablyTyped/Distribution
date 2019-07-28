package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.csstype.csstypeMod.SvgPropertiesHyphen because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `alignment-baseline`, `baseline-shift`, `clip-rule`, `color-interpolation`, `color-rendering`, `dominant-baseline`, fill, `fill-opacity`, `fill-rule`, `flood-color`, `flood-opacity`, `glyph-orientation-vertical`, `lighting-color`, marker, `marker-end`, `marker-mid`, `marker-start`, `shape-rendering`, `stop-color`, `stop-opacity`, stroke, `stroke-dasharray`, `stroke-dashoffset`, `stroke-linecap`, `stroke-linejoin`, `stroke-miterlimit`, `stroke-opacity`, `stroke-width`, `text-anchor`, `vector-effect` */ trait PropertiesHyphen[TLength]
  extends StandardPropertiesHyphen[TLength]
     with VendorPropertiesHyphen[TLength]
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
    StandardPropertiesHyphen: StandardPropertiesHyphen[TLength] = null,
    SvgPropertiesHyphen: SvgPropertiesHyphen[TLength] = null,
    VendorPropertiesHyphen: VendorPropertiesHyphen[TLength] = null
  ): PropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ObsoletePropertiesHyphen)
    js.Dynamic.global.Object.assign(__obj, StandardPropertiesHyphen)
    js.Dynamic.global.Object.assign(__obj, SvgPropertiesHyphen)
    js.Dynamic.global.Object.assign(__obj, VendorPropertiesHyphen)
    __obj.asInstanceOf[PropertiesHyphen[TLength]]
  }
}

