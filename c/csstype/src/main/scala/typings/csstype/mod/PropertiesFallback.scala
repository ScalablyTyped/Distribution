package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgPropertiesFallback because var conflicts: clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ trait PropertiesFallback[TLength]
  extends StandardLonghandPropertiesFallback[TLength]
     with StandardShorthandPropertiesFallback[TLength]
     with VendorLonghandPropertiesFallback[TLength]
     with VendorShorthandPropertiesFallback[TLength]
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
    StandardLonghandPropertiesFallback: StandardLonghandPropertiesFallback[TLength] = null,
    StandardShorthandPropertiesFallback: StandardShorthandPropertiesFallback[TLength] = null,
    VendorLonghandPropertiesFallback: VendorLonghandPropertiesFallback[TLength] = null,
    VendorShorthandPropertiesFallback: VendorShorthandPropertiesFallback[TLength] = null,
    alignmentBaseline: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty] = null,
    baselineShift: BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]] = null,
    clipRule: ClipRuleProperty | js.Array[ClipRuleProperty] = null,
    colorInterpolation: ColorInterpolationProperty | js.Array[ColorInterpolationProperty] = null,
    colorRendering: ColorRenderingProperty | js.Array[ColorRenderingProperty] = null,
    dominantBaseline: DominantBaselineProperty | js.Array[DominantBaselineProperty] = null,
    fill: FillProperty | js.Array[FillProperty] = null,
    fillOpacity: GlobalsNumber | js.Array[GlobalsNumber] = null,
    fillRule: FillRuleProperty | js.Array[FillRuleProperty] = null,
    floodColor: FloodColorProperty | js.Array[FloodColorProperty] = null,
    floodOpacity: GlobalsNumber | js.Array[GlobalsNumber] = null,
    glyphOrientationVertical: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty] = null,
    lightingColor: LightingColorProperty | js.Array[LightingColorProperty] = null,
    marker: MarkerProperty | js.Array[MarkerProperty] = null,
    markerEnd: MarkerEndProperty | js.Array[MarkerEndProperty] = null,
    markerMid: MarkerMidProperty | js.Array[MarkerMidProperty] = null,
    markerStart: MarkerStartProperty | js.Array[MarkerStartProperty] = null,
    shapeRendering: ShapeRenderingProperty | js.Array[ShapeRenderingProperty] = null,
    stopColor: StopColorProperty | js.Array[StopColorProperty] = null,
    stopOpacity: GlobalsNumber | js.Array[GlobalsNumber] = null,
    stroke: StrokeProperty | js.Array[StrokeProperty] = null,
    strokeDasharray: StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]] = null,
    strokeDashoffset: StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]] = null,
    strokeLinecap: StrokeLinecapProperty | js.Array[StrokeLinecapProperty] = null,
    strokeLinejoin: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty] = null,
    strokeMiterlimit: GlobalsNumber | js.Array[GlobalsNumber] = null,
    strokeOpacity: GlobalsNumber | js.Array[GlobalsNumber] = null,
    strokeWidth: StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]] = null,
    textAnchor: TextAnchorProperty | js.Array[TextAnchorProperty] = null,
    vectorEffect: VectorEffectProperty | js.Array[VectorEffectProperty] = null
  ): PropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    if (ObsoletePropertiesFallback != null) js.Dynamic.global.Object.assign(__obj, ObsoletePropertiesFallback)
    if (StandardLonghandPropertiesFallback != null) js.Dynamic.global.Object.assign(__obj, StandardLonghandPropertiesFallback)
    if (StandardShorthandPropertiesFallback != null) js.Dynamic.global.Object.assign(__obj, StandardShorthandPropertiesFallback)
    if (VendorLonghandPropertiesFallback != null) js.Dynamic.global.Object.assign(__obj, VendorLonghandPropertiesFallback)
    if (VendorShorthandPropertiesFallback != null) js.Dynamic.global.Object.assign(__obj, VendorShorthandPropertiesFallback)
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesFallback[TLength]]
  }
}

