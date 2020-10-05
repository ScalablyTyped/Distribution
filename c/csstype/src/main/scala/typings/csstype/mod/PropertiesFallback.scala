package typings.csstype.mod

import typings.csstype.mod.Property.AlignmentBaseline
import typings.csstype.mod.Property.BaselineShift
import typings.csstype.mod.Property.ClipRule
import typings.csstype.mod.Property.ColorInterpolation
import typings.csstype.mod.Property.ColorRendering
import typings.csstype.mod.Property.DominantBaseline
import typings.csstype.mod.Property.Fill
import typings.csstype.mod.Property.FillOpacity
import typings.csstype.mod.Property.FillRule
import typings.csstype.mod.Property.FloodColor
import typings.csstype.mod.Property.FloodOpacity
import typings.csstype.mod.Property.GlyphOrientationVertical
import typings.csstype.mod.Property.LightingColor
import typings.csstype.mod.Property.Marker
import typings.csstype.mod.Property.MarkerEnd
import typings.csstype.mod.Property.MarkerMid
import typings.csstype.mod.Property.MarkerStart
import typings.csstype.mod.Property.ShapeRendering
import typings.csstype.mod.Property.StopColor
import typings.csstype.mod.Property.StopOpacity
import typings.csstype.mod.Property.Stroke
import typings.csstype.mod.Property.StrokeDasharray
import typings.csstype.mod.Property.StrokeDashoffset
import typings.csstype.mod.Property.StrokeLinecap
import typings.csstype.mod.Property.StrokeLinejoin
import typings.csstype.mod.Property.StrokeMiterlimit
import typings.csstype.mod.Property.StrokeOpacity
import typings.csstype.mod.Property.StrokeWidth
import typings.csstype.mod.Property.TextAnchor
import typings.csstype.mod.Property.VectorEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgPropertiesFallback because var conflicts: clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined floodOpacity, fillOpacity, shapeRendering, vectorEffect, strokeMiterlimit, fill, clipRule, lightingColor, baselineShift, strokeLinecap, alignmentBaseline, textAnchor, strokeOpacity, glyphOrientationVertical, strokeWidth, strokeLinejoin, strokeDashoffset, dominantBaseline, colorInterpolation, markerEnd, stopOpacity, stroke, fillRule, stopColor, colorRendering, markerMid, floodColor, marker, strokeDasharray, markerStart */ @js.native
trait PropertiesFallback[TLength, TTime]
  extends StandardLonghandPropertiesFallback[TLength, TTime]
     with StandardShorthandPropertiesFallback[TLength, TTime]
     with VendorLonghandPropertiesFallback[TLength, TTime]
     with VendorShorthandPropertiesFallback[TLength, TTime]
     with ObsoletePropertiesFallback[TLength, TTime] {
  var alignmentBaseline: js.UndefOr[AlignmentBaseline | js.Array[js.UndefOr[AlignmentBaseline]]] = js.native
  var baselineShift: js.UndefOr[BaselineShift[TLength] | js.Array[js.UndefOr[BaselineShift[TLength]]]] = js.native
  var clipRule: js.UndefOr[ClipRule | js.Array[js.UndefOr[ClipRule]]] = js.native
  var colorInterpolation: js.UndefOr[ColorInterpolation | js.Array[js.UndefOr[ColorInterpolation]]] = js.native
  var colorRendering: js.UndefOr[ColorRendering | js.Array[js.UndefOr[ColorRendering]]] = js.native
  var dominantBaseline: js.UndefOr[DominantBaseline | js.Array[js.UndefOr[DominantBaseline]]] = js.native
  var fill: js.UndefOr[Fill | js.Array[js.UndefOr[Fill]]] = js.native
  var fillOpacity: js.UndefOr[FillOpacity | js.Array[js.UndefOr[FillOpacity]]] = js.native
  var fillRule: js.UndefOr[FillRule | js.Array[js.UndefOr[FillRule]]] = js.native
  var floodColor: js.UndefOr[FloodColor | js.Array[js.UndefOr[FloodColor]]] = js.native
  var floodOpacity: js.UndefOr[FloodOpacity | js.Array[js.UndefOr[FloodOpacity]]] = js.native
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVertical | js.Array[js.UndefOr[GlyphOrientationVertical]]] = js.native
  var lightingColor: js.UndefOr[LightingColor | js.Array[js.UndefOr[LightingColor]]] = js.native
  var marker: js.UndefOr[Marker | js.Array[js.UndefOr[Marker]]] = js.native
  var markerEnd: js.UndefOr[MarkerEnd | js.Array[js.UndefOr[MarkerEnd]]] = js.native
  var markerMid: js.UndefOr[MarkerMid | js.Array[js.UndefOr[MarkerMid]]] = js.native
  var markerStart: js.UndefOr[MarkerStart | js.Array[js.UndefOr[MarkerStart]]] = js.native
  var shapeRendering: js.UndefOr[ShapeRendering | js.Array[js.UndefOr[ShapeRendering]]] = js.native
  var stopColor: js.UndefOr[StopColor | js.Array[js.UndefOr[StopColor]]] = js.native
  var stopOpacity: js.UndefOr[StopOpacity | js.Array[js.UndefOr[StopOpacity]]] = js.native
  var stroke: js.UndefOr[Stroke | js.Array[js.UndefOr[Stroke]]] = js.native
  var strokeDasharray: js.UndefOr[StrokeDasharray[TLength] | js.Array[js.UndefOr[StrokeDasharray[TLength]]]] = js.native
  var strokeDashoffset: js.UndefOr[StrokeDashoffset[TLength] | js.Array[js.UndefOr[StrokeDashoffset[TLength]]]] = js.native
  var strokeLinecap: js.UndefOr[StrokeLinecap | js.Array[js.UndefOr[StrokeLinecap]]] = js.native
  var strokeLinejoin: js.UndefOr[StrokeLinejoin | js.Array[js.UndefOr[StrokeLinejoin]]] = js.native
  var strokeMiterlimit: js.UndefOr[StrokeMiterlimit | js.Array[js.UndefOr[StrokeMiterlimit]]] = js.native
  var strokeOpacity: js.UndefOr[StrokeOpacity | js.Array[js.UndefOr[StrokeOpacity]]] = js.native
  var strokeWidth: js.UndefOr[StrokeWidth[TLength] | js.Array[js.UndefOr[StrokeWidth[TLength]]]] = js.native
  var textAnchor: js.UndefOr[TextAnchor | js.Array[js.UndefOr[TextAnchor]]] = js.native
  var vectorEffect: js.UndefOr[VectorEffect | js.Array[js.UndefOr[VectorEffect]]] = js.native
}

object PropertiesFallback {
  @scala.inline
  def apply[TLength, TTime](): PropertiesFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesFallback[TLength, TTime]]
  }
  @scala.inline
  implicit class PropertiesFallbackOps[Self <: PropertiesFallback[_, _], TLength, TTime] (val x: Self with (PropertiesFallback[TLength, TTime])) extends AnyVal {
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
    def setAlignmentBaselineVarargs(value: js.UndefOr[AlignmentBaseline]*): Self = this.set("alignmentBaseline", js.Array(value :_*))
    @scala.inline
    def setAlignmentBaseline(value: AlignmentBaseline | js.Array[js.UndefOr[AlignmentBaseline]]): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    @scala.inline
    def setBaselineShiftVarargs(value: js.UndefOr[BaselineShift[TLength]]*): Self = this.set("baselineShift", js.Array(value :_*))
    @scala.inline
    def setBaselineShift(value: BaselineShift[TLength] | js.Array[js.UndefOr[BaselineShift[TLength]]]): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", js.undefined)
    @scala.inline
    def setClipRuleVarargs(value: js.UndefOr[ClipRule]*): Self = this.set("clipRule", js.Array(value :_*))
    @scala.inline
    def setClipRule(value: ClipRule | js.Array[js.UndefOr[ClipRule]]): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    @scala.inline
    def setColorInterpolationVarargs(value: js.UndefOr[ColorInterpolation]*): Self = this.set("colorInterpolation", js.Array(value :_*))
    @scala.inline
    def setColorInterpolation(value: ColorInterpolation | js.Array[js.UndefOr[ColorInterpolation]]): Self = this.set("colorInterpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorInterpolation: Self = this.set("colorInterpolation", js.undefined)
    @scala.inline
    def setColorRenderingVarargs(value: js.UndefOr[ColorRendering]*): Self = this.set("colorRendering", js.Array(value :_*))
    @scala.inline
    def setColorRendering(value: ColorRendering | js.Array[js.UndefOr[ColorRendering]]): Self = this.set("colorRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorRendering: Self = this.set("colorRendering", js.undefined)
    @scala.inline
    def setDominantBaselineVarargs(value: js.UndefOr[DominantBaseline]*): Self = this.set("dominantBaseline", js.Array(value :_*))
    @scala.inline
    def setDominantBaseline(value: DominantBaseline | js.Array[js.UndefOr[DominantBaseline]]): Self = this.set("dominantBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDominantBaseline: Self = this.set("dominantBaseline", js.undefined)
    @scala.inline
    def setFillVarargs(value: js.UndefOr[Fill]*): Self = this.set("fill", js.Array(value :_*))
    @scala.inline
    def setFill(value: Fill | js.Array[js.UndefOr[Fill]]): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillOpacityVarargs(value: js.UndefOr[FillOpacity]*): Self = this.set("fillOpacity", js.Array(value :_*))
    @scala.inline
    def setFillOpacity(value: FillOpacity | js.Array[js.UndefOr[FillOpacity]]): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setFillRuleVarargs(value: js.UndefOr[FillRule]*): Self = this.set("fillRule", js.Array(value :_*))
    @scala.inline
    def setFillRule(value: FillRule | js.Array[js.UndefOr[FillRule]]): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    @scala.inline
    def setFloodColorVarargs(value: js.UndefOr[FloodColor]*): Self = this.set("floodColor", js.Array(value :_*))
    @scala.inline
    def setFloodColor(value: FloodColor | js.Array[js.UndefOr[FloodColor]]): Self = this.set("floodColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodColor: Self = this.set("floodColor", js.undefined)
    @scala.inline
    def setFloodOpacityVarargs(value: js.UndefOr[FloodOpacity]*): Self = this.set("floodOpacity", js.Array(value :_*))
    @scala.inline
    def setFloodOpacity(value: FloodOpacity | js.Array[js.UndefOr[FloodOpacity]]): Self = this.set("floodOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodOpacity: Self = this.set("floodOpacity", js.undefined)
    @scala.inline
    def setGlyphOrientationVerticalVarargs(value: js.UndefOr[GlyphOrientationVertical]*): Self = this.set("glyphOrientationVertical", js.Array(value :_*))
    @scala.inline
    def setGlyphOrientationVertical(value: GlyphOrientationVertical | js.Array[js.UndefOr[GlyphOrientationVertical]]): Self = this.set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphOrientationVertical: Self = this.set("glyphOrientationVertical", js.undefined)
    @scala.inline
    def setLightingColorVarargs(value: js.UndefOr[LightingColor]*): Self = this.set("lightingColor", js.Array(value :_*))
    @scala.inline
    def setLightingColor(value: LightingColor | js.Array[js.UndefOr[LightingColor]]): Self = this.set("lightingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightingColor: Self = this.set("lightingColor", js.undefined)
    @scala.inline
    def setMarkerVarargs(value: js.UndefOr[Marker]*): Self = this.set("marker", js.Array(value :_*))
    @scala.inline
    def setMarker(value: Marker | js.Array[js.UndefOr[Marker]]): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setMarkerEndVarargs(value: js.UndefOr[MarkerEnd]*): Self = this.set("markerEnd", js.Array(value :_*))
    @scala.inline
    def setMarkerEnd(value: MarkerEnd | js.Array[js.UndefOr[MarkerEnd]]): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", js.undefined)
    @scala.inline
    def setMarkerMidVarargs(value: js.UndefOr[MarkerMid]*): Self = this.set("markerMid", js.Array(value :_*))
    @scala.inline
    def setMarkerMid(value: MarkerMid | js.Array[js.UndefOr[MarkerMid]]): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", js.undefined)
    @scala.inline
    def setMarkerStartVarargs(value: js.UndefOr[MarkerStart]*): Self = this.set("markerStart", js.Array(value :_*))
    @scala.inline
    def setMarkerStart(value: MarkerStart | js.Array[js.UndefOr[MarkerStart]]): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", js.undefined)
    @scala.inline
    def setShapeRenderingVarargs(value: js.UndefOr[ShapeRendering]*): Self = this.set("shapeRendering", js.Array(value :_*))
    @scala.inline
    def setShapeRendering(value: ShapeRendering | js.Array[js.UndefOr[ShapeRendering]]): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
    @scala.inline
    def setStopColorVarargs(value: js.UndefOr[StopColor]*): Self = this.set("stopColor", js.Array(value :_*))
    @scala.inline
    def setStopColor(value: StopColor | js.Array[js.UndefOr[StopColor]]): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", js.undefined)
    @scala.inline
    def setStopOpacityVarargs(value: js.UndefOr[StopOpacity]*): Self = this.set("stopOpacity", js.Array(value :_*))
    @scala.inline
    def setStopOpacity(value: StopOpacity | js.Array[js.UndefOr[StopOpacity]]): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", js.undefined)
    @scala.inline
    def setStrokeVarargs(value: js.UndefOr[Stroke]*): Self = this.set("stroke", js.Array(value :_*))
    @scala.inline
    def setStroke(value: Stroke | js.Array[js.UndefOr[Stroke]]): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeDasharrayVarargs(value: js.UndefOr[StrokeDasharray[TLength]]*): Self = this.set("strokeDasharray", js.Array(value :_*))
    @scala.inline
    def setStrokeDasharray(value: StrokeDasharray[TLength] | js.Array[js.UndefOr[StrokeDasharray[TLength]]]): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    @scala.inline
    def setStrokeDashoffsetVarargs(value: js.UndefOr[StrokeDashoffset[TLength]]*): Self = this.set("strokeDashoffset", js.Array(value :_*))
    @scala.inline
    def setStrokeDashoffset(value: StrokeDashoffset[TLength] | js.Array[js.UndefOr[StrokeDashoffset[TLength]]]): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    @scala.inline
    def setStrokeLinecapVarargs(value: js.UndefOr[StrokeLinecap]*): Self = this.set("strokeLinecap", js.Array(value :_*))
    @scala.inline
    def setStrokeLinecap(value: StrokeLinecap | js.Array[js.UndefOr[StrokeLinecap]]): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeLinejoinVarargs(value: js.UndefOr[StrokeLinejoin]*): Self = this.set("strokeLinejoin", js.Array(value :_*))
    @scala.inline
    def setStrokeLinejoin(value: StrokeLinejoin | js.Array[js.UndefOr[StrokeLinejoin]]): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    @scala.inline
    def setStrokeMiterlimitVarargs(value: js.UndefOr[StrokeMiterlimit]*): Self = this.set("strokeMiterlimit", js.Array(value :_*))
    @scala.inline
    def setStrokeMiterlimit(value: StrokeMiterlimit | js.Array[js.UndefOr[StrokeMiterlimit]]): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    @scala.inline
    def setStrokeOpacityVarargs(value: js.UndefOr[StrokeOpacity]*): Self = this.set("strokeOpacity", js.Array(value :_*))
    @scala.inline
    def setStrokeOpacity(value: StrokeOpacity | js.Array[js.UndefOr[StrokeOpacity]]): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWidthVarargs(value: js.UndefOr[StrokeWidth[TLength]]*): Self = this.set("strokeWidth", js.Array(value :_*))
    @scala.inline
    def setStrokeWidth(value: StrokeWidth[TLength] | js.Array[js.UndefOr[StrokeWidth[TLength]]]): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTextAnchorVarargs(value: js.UndefOr[TextAnchor]*): Self = this.set("textAnchor", js.Array(value :_*))
    @scala.inline
    def setTextAnchor(value: TextAnchor | js.Array[js.UndefOr[TextAnchor]]): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    @scala.inline
    def setVectorEffectVarargs(value: js.UndefOr[VectorEffect]*): Self = this.set("vectorEffect", js.Array(value :_*))
    @scala.inline
    def setVectorEffect(value: VectorEffect | js.Array[js.UndefOr[VectorEffect]]): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", js.undefined)
  }
  
}

