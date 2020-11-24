package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgProperties because var conflicts: clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ @js.native
trait Properties[TLength]
  extends StandardLonghandProperties[TLength]
     with StandardShorthandProperties[TLength]
     with VendorLonghandProperties[TLength]
     with VendorShorthandProperties[TLength]
     with ObsoleteProperties[TLength] {
  
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty] = js.native
  
  var baselineShift: js.UndefOr[BaselineShiftProperty[TLength]] = js.native
  
  var clipRule: js.UndefOr[ClipRuleProperty] = js.native
  
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty] = js.native
  
  var colorRendering: js.UndefOr[ColorRenderingProperty] = js.native
  
  var dominantBaseline: js.UndefOr[DominantBaselineProperty] = js.native
  
  var fill: js.UndefOr[FillProperty] = js.native
  
  var fillOpacity: js.UndefOr[GlobalsNumber] = js.native
  
  var fillRule: js.UndefOr[FillRuleProperty] = js.native
  
  var floodColor: js.UndefOr[FloodColorProperty] = js.native
  
  var floodOpacity: js.UndefOr[GlobalsNumber] = js.native
  
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty] = js.native
  
  var lightingColor: js.UndefOr[LightingColorProperty] = js.native
  
  var marker: js.UndefOr[MarkerProperty] = js.native
  
  var markerEnd: js.UndefOr[MarkerEndProperty] = js.native
  
  var markerMid: js.UndefOr[MarkerMidProperty] = js.native
  
  var markerStart: js.UndefOr[MarkerStartProperty] = js.native
  
  var shapeRendering: js.UndefOr[ShapeRenderingProperty] = js.native
  
  var stopColor: js.UndefOr[StopColorProperty] = js.native
  
  var stopOpacity: js.UndefOr[GlobalsNumber] = js.native
  
  var stroke: js.UndefOr[StrokeProperty] = js.native
  
  var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[TLength]] = js.native
  
  var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[TLength]] = js.native
  
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty] = js.native
  
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty] = js.native
  
  var strokeMiterlimit: js.UndefOr[GlobalsNumber] = js.native
  
  var strokeOpacity: js.UndefOr[GlobalsNumber] = js.native
  
  var strokeWidth: js.UndefOr[StrokeWidthProperty[TLength]] = js.native
  
  var textAnchor: js.UndefOr[TextAnchorProperty] = js.native
  
  var vectorEffect: js.UndefOr[VectorEffectProperty] = js.native
}
object Properties {
  
  @scala.inline
  def apply[TLength](): Properties[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Properties[TLength]]
  }
  
  @scala.inline
  implicit class PropertiesOps[Self <: Properties[_], TLength] (val x: Self with Properties[TLength]) extends AnyVal {
    
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
    def setAlignmentBaseline(value: AlignmentBaselineProperty): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    
    @scala.inline
    def setBaselineShift(value: BaselineShiftProperty[TLength]): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", js.undefined)
    
    @scala.inline
    def setClipRule(value: ClipRuleProperty): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    
    @scala.inline
    def setColorInterpolation(value: ColorInterpolationProperty): Self = this.set("colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInterpolation: Self = this.set("colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorRendering(value: ColorRenderingProperty): Self = this.set("colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRendering: Self = this.set("colorRendering", js.undefined)
    
    @scala.inline
    def setDominantBaseline(value: DominantBaselineProperty): Self = this.set("dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantBaseline: Self = this.set("dominantBaseline", js.undefined)
    
    @scala.inline
    def setFill(value: FillProperty): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: GlobalsNumber): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: FillRuleProperty): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    
    @scala.inline
    def setFloodColor(value: FloodColorProperty): Self = this.set("floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodColor: Self = this.set("floodColor", js.undefined)
    
    @scala.inline
    def setFloodOpacity(value: GlobalsNumber): Self = this.set("floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodOpacity: Self = this.set("floodOpacity", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVertical(value: GlyphOrientationVerticalProperty): Self = this.set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphOrientationVertical: Self = this.set("glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setLightingColor(value: LightingColorProperty): Self = this.set("lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightingColor: Self = this.set("lightingColor", js.undefined)
    
    @scala.inline
    def setMarker(value: MarkerProperty): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMarkerEnd(value: MarkerEndProperty): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerMid(value: MarkerMidProperty): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: MarkerStartProperty): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", js.undefined)
    
    @scala.inline
    def setShapeRendering(value: ShapeRenderingProperty): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
    
    @scala.inline
    def setStopColor(value: StopColorProperty): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", js.undefined)
    
    @scala.inline
    def setStopOpacity(value: GlobalsNumber): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", js.undefined)
    
    @scala.inline
    def setStroke(value: StrokeProperty): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStrokeDasharray(value: StrokeDasharrayProperty[TLength]): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDashoffset(value: StrokeDashoffsetProperty[TLength]): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: StrokeLinecapProperty): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: StrokeLinejoinProperty): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimit(value: GlobalsNumber): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: GlobalsNumber): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: StrokeWidthProperty[TLength]): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: TextAnchorProperty): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    
    @scala.inline
    def setVectorEffect(value: VectorEffectProperty): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", js.undefined)
  }
}
