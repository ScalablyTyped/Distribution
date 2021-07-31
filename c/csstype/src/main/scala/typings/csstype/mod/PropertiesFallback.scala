package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgPropertiesFallback because var conflicts: clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ trait PropertiesFallback[TLength]
  extends StObject
     with StandardPropertiesFallback[TLength]
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
  def apply[TLength](): PropertiesFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesFallback[TLength]]
  }
  
  @scala.inline
  implicit class PropertiesFallbackMutableBuilder[Self <: PropertiesFallback[?], TLength] (val x: Self & PropertiesFallback[TLength]) extends AnyVal {
    
    @scala.inline
    def setAlignmentBaseline(value: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
    
    @scala.inline
    def setAlignmentBaselineVarargs(value: AlignmentBaselineProperty*): Self = StObject.set(x, "alignmentBaseline", js.Array(value :_*))
    
    @scala.inline
    def setBaselineShift(value: BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
    
    @scala.inline
    def setBaselineShiftVarargs(value: BaselineShiftProperty[TLength]*): Self = StObject.set(x, "baselineShift", js.Array(value :_*))
    
    @scala.inline
    def setClipRule(value: ClipRuleProperty | js.Array[ClipRuleProperty]): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
    
    @scala.inline
    def setClipRuleVarargs(value: ClipRuleProperty*): Self = StObject.set(x, "clipRule", js.Array(value :_*))
    
    @scala.inline
    def setColorInterpolation(value: ColorInterpolationProperty | js.Array[ColorInterpolationProperty]): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorInterpolationVarargs(value: ColorInterpolationProperty*): Self = StObject.set(x, "colorInterpolation", js.Array(value :_*))
    
    @scala.inline
    def setColorRendering(value: ColorRenderingProperty | js.Array[ColorRenderingProperty]): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
    
    @scala.inline
    def setColorRenderingVarargs(value: ColorRenderingProperty*): Self = StObject.set(x, "colorRendering", js.Array(value :_*))
    
    @scala.inline
    def setDominantBaseline(value: DominantBaselineProperty | js.Array[DominantBaselineProperty]): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
    
    @scala.inline
    def setDominantBaselineVarargs(value: DominantBaselineProperty*): Self = StObject.set(x, "dominantBaseline", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: FillProperty | js.Array[FillProperty]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillOpacityVarargs(value: GlobalsNumber*): Self = StObject.set(x, "fillOpacity", js.Array(value :_*))
    
    @scala.inline
    def setFillRule(value: FillRuleProperty | js.Array[FillRuleProperty]): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    @scala.inline
    def setFillRuleVarargs(value: FillRuleProperty*): Self = StObject.set(x, "fillRule", js.Array(value :_*))
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFillVarargs(value: FillProperty*): Self = StObject.set(x, "fill", js.Array(value :_*))
    
    @scala.inline
    def setFloodColor(value: FloodColorProperty | js.Array[FloodColorProperty]): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
    
    @scala.inline
    def setFloodColorVarargs(value: FloodColorProperty*): Self = StObject.set(x, "floodColor", js.Array(value :_*))
    
    @scala.inline
    def setFloodOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
    
    @scala.inline
    def setFloodOpacityVarargs(value: GlobalsNumber*): Self = StObject.set(x, "floodOpacity", js.Array(value :_*))
    
    @scala.inline
    def setGlyphOrientationVertical(value: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVerticalVarargs(value: GlyphOrientationVerticalProperty*): Self = StObject.set(x, "glyphOrientationVertical", js.Array(value :_*))
    
    @scala.inline
    def setLightingColor(value: LightingColorProperty | js.Array[LightingColorProperty]): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
    
    @scala.inline
    def setLightingColorVarargs(value: LightingColorProperty*): Self = StObject.set(x, "lightingColor", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: MarkerProperty | js.Array[MarkerProperty]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEnd(value: MarkerEndProperty | js.Array[MarkerEndProperty]): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerEndVarargs(value: MarkerEndProperty*): Self = StObject.set(x, "markerEnd", js.Array(value :_*))
    
    @scala.inline
    def setMarkerMid(value: MarkerMidProperty | js.Array[MarkerMidProperty]): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
    
    @scala.inline
    def setMarkerMidVarargs(value: MarkerMidProperty*): Self = StObject.set(x, "markerMid", js.Array(value :_*))
    
    @scala.inline
    def setMarkerStart(value: MarkerStartProperty | js.Array[MarkerStartProperty]): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
    
    @scala.inline
    def setMarkerStartVarargs(value: MarkerStartProperty*): Self = StObject.set(x, "markerStart", js.Array(value :_*))
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMarkerVarargs(value: MarkerProperty*): Self = StObject.set(x, "marker", js.Array(value :_*))
    
    @scala.inline
    def setShapeRendering(value: ShapeRenderingProperty | js.Array[ShapeRenderingProperty]): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
    @scala.inline
    def setShapeRenderingVarargs(value: ShapeRenderingProperty*): Self = StObject.set(x, "shapeRendering", js.Array(value :_*))
    
    @scala.inline
    def setStopColor(value: StopColorProperty | js.Array[StopColorProperty]): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
    
    @scala.inline
    def setStopColorVarargs(value: StopColorProperty*): Self = StObject.set(x, "stopColor", js.Array(value :_*))
    
    @scala.inline
    def setStopOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
    
    @scala.inline
    def setStopOpacityVarargs(value: GlobalsNumber*): Self = StObject.set(x, "stopOpacity", js.Array(value :_*))
    
    @scala.inline
    def setStroke(value: StrokeProperty | js.Array[StrokeProperty]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharray(value: StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDasharrayVarargs(value: StrokeDasharrayProperty[TLength]*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
    
    @scala.inline
    def setStrokeDashoffset(value: StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeDashoffsetVarargs(value: StrokeDashoffsetProperty[TLength]*): Self = StObject.set(x, "strokeDashoffset", js.Array(value :_*))
    
    @scala.inline
    def setStrokeLinecap(value: StrokeLinecapProperty | js.Array[StrokeLinecapProperty]): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinecapVarargs(value: StrokeLinecapProperty*): Self = StObject.set(x, "strokeLinecap", js.Array(value :_*))
    
    @scala.inline
    def setStrokeLinejoin(value: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeLinejoinVarargs(value: StrokeLinejoinProperty*): Self = StObject.set(x, "strokeLinejoin", js.Array(value :_*))
    
    @scala.inline
    def setStrokeMiterlimit(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimitVarargs(value: GlobalsNumber*): Self = StObject.set(x, "strokeMiterlimit", js.Array(value :_*))
    
    @scala.inline
    def setStrokeOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeOpacityVarargs(value: GlobalsNumber*): Self = StObject.set(x, "strokeOpacity", js.Array(value :_*))
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeVarargs(value: StrokeProperty*): Self = StObject.set(x, "stroke", js.Array(value :_*))
    
    @scala.inline
    def setStrokeWidth(value: StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setStrokeWidthVarargs(value: StrokeWidthProperty[TLength]*): Self = StObject.set(x, "strokeWidth", js.Array(value :_*))
    
    @scala.inline
    def setTextAnchor(value: TextAnchorProperty | js.Array[TextAnchorProperty]): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    @scala.inline
    def setTextAnchorVarargs(value: TextAnchorProperty*): Self = StObject.set(x, "textAnchor", js.Array(value :_*))
    
    @scala.inline
    def setVectorEffect(value: VectorEffectProperty | js.Array[VectorEffectProperty]): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
    
    @scala.inline
    def setVectorEffectVarargs(value: VectorEffectProperty*): Self = StObject.set(x, "vectorEffect", js.Array(value :_*))
  }
}
