package typings.createEmotion.mod

import typings.csstype.mod.AlignmentBaselineProperty
import typings.csstype.mod.BaselineShiftProperty
import typings.csstype.mod.ClipRuleProperty
import typings.csstype.mod.ColorInterpolationProperty
import typings.csstype.mod.ColorRenderingProperty
import typings.csstype.mod.DominantBaselineProperty
import typings.csstype.mod.FillProperty
import typings.csstype.mod.FillRuleProperty
import typings.csstype.mod.FloodColorProperty
import typings.csstype.mod.GlobalsNumber
import typings.csstype.mod.GlyphOrientationVerticalProperty
import typings.csstype.mod.LightingColorProperty
import typings.csstype.mod.MarkerEndProperty
import typings.csstype.mod.MarkerMidProperty
import typings.csstype.mod.MarkerProperty
import typings.csstype.mod.MarkerStartProperty
import typings.csstype.mod.ObsoletePropertiesFallback
import typings.csstype.mod.ShapeRenderingProperty
import typings.csstype.mod.StandardLonghandPropertiesFallback
import typings.csstype.mod.StandardShorthandPropertiesFallback
import typings.csstype.mod.StopColorProperty
import typings.csstype.mod.StrokeDasharrayProperty
import typings.csstype.mod.StrokeDashoffsetProperty
import typings.csstype.mod.StrokeLinecapProperty
import typings.csstype.mod.StrokeLinejoinProperty
import typings.csstype.mod.StrokeProperty
import typings.csstype.mod.StrokeWidthProperty
import typings.csstype.mod.TextAnchorProperty
import typings.csstype.mod.VectorEffectProperty
import typings.csstype.mod.VendorLonghandPropertiesFallback
import typings.csstype.mod.VendorShorthandPropertiesFallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgPropertiesFallback because var conflicts: clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ @js.native
trait CSSObject
  extends CSSOthersObject
     with StandardLonghandPropertiesFallback[Double | String]
     with StandardShorthandPropertiesFallback[Double | String]
     with VendorLonghandPropertiesFallback[Double | String]
     with VendorShorthandPropertiesFallback[Double | String]
     with ObsoletePropertiesFallback[Double | String]
     with CSSPseudoObject
     with _Interpolation {
  
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]] = js.native
  
  var baselineShift: js.UndefOr[
    (BaselineShiftProperty[Double | String]) | (js.Array[BaselineShiftProperty[Double | String]])
  ] = js.native
  
  var clipRule: js.UndefOr[ClipRuleProperty | js.Array[ClipRuleProperty]] = js.native
  
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty | js.Array[ColorInterpolationProperty]] = js.native
  
  var colorRendering: js.UndefOr[ColorRenderingProperty | js.Array[ColorRenderingProperty]] = js.native
  
  var dominantBaseline: js.UndefOr[DominantBaselineProperty | js.Array[DominantBaselineProperty]] = js.native
  
  var fill: js.UndefOr[FillProperty | js.Array[FillProperty]] = js.native
  
  var fillOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  var fillRule: js.UndefOr[FillRuleProperty | js.Array[FillRuleProperty]] = js.native
  
  var floodColor: js.UndefOr[FloodColorProperty | js.Array[FloodColorProperty]] = js.native
  
  var floodOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]] = js.native
  
  var lightingColor: js.UndefOr[LightingColorProperty | js.Array[LightingColorProperty]] = js.native
  
  var marker: js.UndefOr[MarkerProperty | js.Array[MarkerProperty]] = js.native
  
  var markerEnd: js.UndefOr[MarkerEndProperty | js.Array[MarkerEndProperty]] = js.native
  
  var markerMid: js.UndefOr[MarkerMidProperty | js.Array[MarkerMidProperty]] = js.native
  
  var markerStart: js.UndefOr[MarkerStartProperty | js.Array[MarkerStartProperty]] = js.native
  
  var shapeRendering: js.UndefOr[ShapeRenderingProperty | js.Array[ShapeRenderingProperty]] = js.native
  
  var stopColor: js.UndefOr[StopColorProperty | js.Array[StopColorProperty]] = js.native
  
  var stopOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  var stroke: js.UndefOr[StrokeProperty | js.Array[StrokeProperty]] = js.native
  
  var strokeDasharray: js.UndefOr[
    (StrokeDasharrayProperty[Double | String]) | (js.Array[StrokeDasharrayProperty[Double | String]])
  ] = js.native
  
  var strokeDashoffset: js.UndefOr[
    (StrokeDashoffsetProperty[Double | String]) | (js.Array[StrokeDashoffsetProperty[Double | String]])
  ] = js.native
  
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty | js.Array[StrokeLinecapProperty]] = js.native
  
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]] = js.native
  
  var strokeMiterlimit: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  var strokeOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
  
  var strokeWidth: js.UndefOr[
    (StrokeWidthProperty[Double | String]) | (js.Array[StrokeWidthProperty[Double | String]])
  ] = js.native
  
  var textAnchor: js.UndefOr[TextAnchorProperty | js.Array[TextAnchorProperty]] = js.native
  
  var vectorEffect: js.UndefOr[VectorEffectProperty | js.Array[VectorEffectProperty]] = js.native
}
object CSSObject {
  
  @scala.inline
  def apply(): CSSObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSObject]
  }
  
  @scala.inline
  implicit class CSSObjectOps[Self <: CSSObject] (val x: Self) extends AnyVal {
    
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
    def setAlignmentBaselineVarargs(value: AlignmentBaselineProperty*): Self = this.set("alignmentBaseline", js.Array(value :_*))
    
    @scala.inline
    def setAlignmentBaseline(value: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    
    @scala.inline
    def setBaselineShiftVarargs(value: (BaselineShiftProperty[Double | String])*): Self = this.set("baselineShift", js.Array(value :_*))
    
    @scala.inline
    def setBaselineShift(
      value: (BaselineShiftProperty[Double | String]) | (js.Array[BaselineShiftProperty[Double | String]])
    ): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", js.undefined)
    
    @scala.inline
    def setClipRuleVarargs(value: ClipRuleProperty*): Self = this.set("clipRule", js.Array(value :_*))
    
    @scala.inline
    def setClipRule(value: ClipRuleProperty | js.Array[ClipRuleProperty]): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    
    @scala.inline
    def setColorInterpolationVarargs(value: ColorInterpolationProperty*): Self = this.set("colorInterpolation", js.Array(value :_*))
    
    @scala.inline
    def setColorInterpolation(value: ColorInterpolationProperty | js.Array[ColorInterpolationProperty]): Self = this.set("colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInterpolation: Self = this.set("colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorRenderingVarargs(value: ColorRenderingProperty*): Self = this.set("colorRendering", js.Array(value :_*))
    
    @scala.inline
    def setColorRendering(value: ColorRenderingProperty | js.Array[ColorRenderingProperty]): Self = this.set("colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRendering: Self = this.set("colorRendering", js.undefined)
    
    @scala.inline
    def setDominantBaselineVarargs(value: DominantBaselineProperty*): Self = this.set("dominantBaseline", js.Array(value :_*))
    
    @scala.inline
    def setDominantBaseline(value: DominantBaselineProperty | js.Array[DominantBaselineProperty]): Self = this.set("dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantBaseline: Self = this.set("dominantBaseline", js.undefined)
    
    @scala.inline
    def setFillVarargs(value: FillProperty*): Self = this.set("fill", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: FillProperty | js.Array[FillProperty]): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillOpacityVarargs(value: GlobalsNumber*): Self = this.set("fillOpacity", js.Array(value :_*))
    
    @scala.inline
    def setFillOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRuleVarargs(value: FillRuleProperty*): Self = this.set("fillRule", js.Array(value :_*))
    
    @scala.inline
    def setFillRule(value: FillRuleProperty | js.Array[FillRuleProperty]): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    
    @scala.inline
    def setFloodColorVarargs(value: FloodColorProperty*): Self = this.set("floodColor", js.Array(value :_*))
    
    @scala.inline
    def setFloodColor(value: FloodColorProperty | js.Array[FloodColorProperty]): Self = this.set("floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodColor: Self = this.set("floodColor", js.undefined)
    
    @scala.inline
    def setFloodOpacityVarargs(value: GlobalsNumber*): Self = this.set("floodOpacity", js.Array(value :_*))
    
    @scala.inline
    def setFloodOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodOpacity: Self = this.set("floodOpacity", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVerticalVarargs(value: GlyphOrientationVerticalProperty*): Self = this.set("glyphOrientationVertical", js.Array(value :_*))
    
    @scala.inline
    def setGlyphOrientationVertical(value: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]): Self = this.set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphOrientationVertical: Self = this.set("glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setLightingColorVarargs(value: LightingColorProperty*): Self = this.set("lightingColor", js.Array(value :_*))
    
    @scala.inline
    def setLightingColor(value: LightingColorProperty | js.Array[LightingColorProperty]): Self = this.set("lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightingColor: Self = this.set("lightingColor", js.undefined)
    
    @scala.inline
    def setMarkerVarargs(value: MarkerProperty*): Self = this.set("marker", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: MarkerProperty | js.Array[MarkerProperty]): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMarkerEndVarargs(value: MarkerEndProperty*): Self = this.set("markerEnd", js.Array(value :_*))
    
    @scala.inline
    def setMarkerEnd(value: MarkerEndProperty | js.Array[MarkerEndProperty]): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerMidVarargs(value: MarkerMidProperty*): Self = this.set("markerMid", js.Array(value :_*))
    
    @scala.inline
    def setMarkerMid(value: MarkerMidProperty | js.Array[MarkerMidProperty]): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStartVarargs(value: MarkerStartProperty*): Self = this.set("markerStart", js.Array(value :_*))
    
    @scala.inline
    def setMarkerStart(value: MarkerStartProperty | js.Array[MarkerStartProperty]): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", js.undefined)
    
    @scala.inline
    def setShapeRenderingVarargs(value: ShapeRenderingProperty*): Self = this.set("shapeRendering", js.Array(value :_*))
    
    @scala.inline
    def setShapeRendering(value: ShapeRenderingProperty | js.Array[ShapeRenderingProperty]): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
    
    @scala.inline
    def setStopColorVarargs(value: StopColorProperty*): Self = this.set("stopColor", js.Array(value :_*))
    
    @scala.inline
    def setStopColor(value: StopColorProperty | js.Array[StopColorProperty]): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", js.undefined)
    
    @scala.inline
    def setStopOpacityVarargs(value: GlobalsNumber*): Self = this.set("stopOpacity", js.Array(value :_*))
    
    @scala.inline
    def setStopOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", js.undefined)
    
    @scala.inline
    def setStrokeVarargs(value: StrokeProperty*): Self = this.set("stroke", js.Array(value :_*))
    
    @scala.inline
    def setStroke(value: StrokeProperty | js.Array[StrokeProperty]): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeDasharrayVarargs(value: (StrokeDasharrayProperty[Double | String])*): Self = this.set("strokeDasharray", js.Array(value :_*))
    
    @scala.inline
    def setStrokeDasharray(
      value: (StrokeDasharrayProperty[Double | String]) | (js.Array[StrokeDasharrayProperty[Double | String]])
    ): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDashoffsetVarargs(value: (StrokeDashoffsetProperty[Double | String])*): Self = this.set("strokeDashoffset", js.Array(value :_*))
    
    @scala.inline
    def setStrokeDashoffset(
      value: (StrokeDashoffsetProperty[Double | String]) | (js.Array[StrokeDashoffsetProperty[Double | String]])
    ): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecapVarargs(value: StrokeLinecapProperty*): Self = this.set("strokeLinecap", js.Array(value :_*))
    
    @scala.inline
    def setStrokeLinecap(value: StrokeLinecapProperty | js.Array[StrokeLinecapProperty]): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoinVarargs(value: StrokeLinejoinProperty*): Self = this.set("strokeLinejoin", js.Array(value :_*))
    
    @scala.inline
    def setStrokeLinejoin(value: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimitVarargs(value: GlobalsNumber*): Self = this.set("strokeMiterlimit", js.Array(value :_*))
    
    @scala.inline
    def setStrokeMiterlimit(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacityVarargs(value: GlobalsNumber*): Self = this.set("strokeOpacity", js.Array(value :_*))
    
    @scala.inline
    def setStrokeOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeWidthVarargs(value: (StrokeWidthProperty[Double | String])*): Self = this.set("strokeWidth", js.Array(value :_*))
    
    @scala.inline
    def setStrokeWidth(value: (StrokeWidthProperty[Double | String]) | (js.Array[StrokeWidthProperty[Double | String]])): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setTextAnchorVarargs(value: TextAnchorProperty*): Self = this.set("textAnchor", js.Array(value :_*))
    
    @scala.inline
    def setTextAnchor(value: TextAnchorProperty | js.Array[TextAnchorProperty]): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    
    @scala.inline
    def setVectorEffectVarargs(value: VectorEffectProperty*): Self = this.set("vectorEffect", js.Array(value :_*))
    
    @scala.inline
    def setVectorEffect(value: VectorEffectProperty | js.Array[VectorEffectProperty]): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", js.undefined)
  }
}
