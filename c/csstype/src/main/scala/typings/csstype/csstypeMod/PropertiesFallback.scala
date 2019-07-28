package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.csstype.csstypeMod.SvgPropertiesFallback because var conflicts: clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ trait PropertiesFallback[TLength]
  extends StandardPropertiesFallback[TLength]
     with VendorPropertiesFallback[TLength]
     with ObsoletePropertiesFallback[TLength] {
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]] = js.undefined
  var baselineShift: js.UndefOr[BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]] = js.undefined
  var clipRule: js.UndefOr[ClipRuleProperty | js.Array[ClipRuleProperty]] = js.undefined
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty | js.Array[ColorInterpolationProperty]] = js.undefined
  var colorRendering: js.UndefOr[ColorRenderingProperty | js.Array[ColorRenderingProperty]] = js.undefined
  var dominantBaseline: js.UndefOr[DominantBaselineProperty | js.Array[DominantBaselineProperty]] = js.undefined
  var fill: js.UndefOr[FillProperty | js.Array[FillProperty]] = js.undefined
  var fillOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var fillRule: js.UndefOr[FillRuleProperty | js.Array[FillRuleProperty]] = js.undefined
  var floodColor: js.UndefOr[FloodColorProperty | js.Array[FloodColorProperty]] = js.undefined
  var floodOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]] = js.undefined
  var lightingColor: js.UndefOr[LightingColorProperty | js.Array[LightingColorProperty]] = js.undefined
  var marker: js.UndefOr[MarkerProperty | js.Array[MarkerProperty]] = js.undefined
  var markerEnd: js.UndefOr[MarkerEndProperty | js.Array[MarkerEndProperty]] = js.undefined
  var markerMid: js.UndefOr[MarkerMidProperty | js.Array[MarkerMidProperty]] = js.undefined
  var markerStart: js.UndefOr[MarkerStartProperty | js.Array[MarkerStartProperty]] = js.undefined
  var shapeRendering: js.UndefOr[ShapeRenderingProperty | js.Array[ShapeRenderingProperty]] = js.undefined
  var stopColor: js.UndefOr[StopColorProperty | js.Array[StopColorProperty]] = js.undefined
  var stopOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var stroke: js.UndefOr[StrokeProperty | js.Array[StrokeProperty]] = js.undefined
  var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]] = js.undefined
  var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]] = js.undefined
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty | js.Array[StrokeLinecapProperty]] = js.undefined
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]] = js.undefined
  var strokeMiterlimit: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var strokeOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var strokeWidth: js.UndefOr[StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]] = js.undefined
  var textAnchor: js.UndefOr[TextAnchorProperty | js.Array[TextAnchorProperty]] = js.undefined
  var vectorEffect: js.UndefOr[VectorEffectProperty | js.Array[VectorEffectProperty]] = js.undefined
}

object PropertiesFallback {
  @scala.inline
  def apply[TLength](
    ObsoletePropertiesFallback: ObsoletePropertiesFallback[TLength] = null,
    StandardPropertiesFallback: StandardPropertiesFallback[TLength] = null,
    SvgPropertiesFallback: SvgPropertiesFallback[TLength] = null,
    VendorPropertiesFallback: VendorPropertiesFallback[TLength] = null
  ): PropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ObsoletePropertiesFallback)
    js.Dynamic.global.Object.assign(__obj, StandardPropertiesFallback)
    js.Dynamic.global.Object.assign(__obj, SvgPropertiesFallback)
    js.Dynamic.global.Object.assign(__obj, VendorPropertiesFallback)
    __obj.asInstanceOf[PropertiesFallback[TLength]]
  }
}

