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
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgPropertiesHyphenFallback because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `baseline-shift`, `vector-effect`, `stroke-dashoffset`, `marker-end`, `marker-mid`, fill, `alignment-baseline`, `lighting-color`, `stop-color`, `flood-color`, `color-rendering`, `stroke-width`, `shape-rendering`, `fill-rule`, `stroke-dasharray`, `glyph-orientation-vertical`, `stroke-linejoin`, `stop-opacity`, `stroke-miterlimit`, `color-interpolation`, `stroke-opacity`, `stroke-linecap`, `flood-opacity`, `marker-start`, `text-anchor`, stroke, `clip-rule`, `fill-opacity`, `dominant-baseline`, marker */ trait PropertiesHyphenFallback[TLength, TTime]
  extends StObject
     with StandardPropertiesHyphenFallback[TLength, TTime]
     with VendorPropertiesHyphenFallback[TLength, TTime]
     with ObsoletePropertiesHyphenFallback[TLength, TTime] {
  
  var `alignment-baseline`: js.UndefOr[AlignmentBaseline | js.Array[NonNullable[js.UndefOr[AlignmentBaseline]]]] = js.undefined
  
  var `baseline-shift`: js.UndefOr[
    BaselineShift[TLength] | js.Array[NonNullable[js.UndefOr[BaselineShift[TLength]]]]
  ] = js.undefined
  
  var `clip-rule`: js.UndefOr[ClipRule | js.Array[NonNullable[js.UndefOr[ClipRule]]]] = js.undefined
  
  var `color-interpolation`: js.UndefOr[ColorInterpolation | js.Array[NonNullable[js.UndefOr[ColorInterpolation]]]] = js.undefined
  
  var `color-rendering`: js.UndefOr[ColorRendering | js.Array[NonNullable[js.UndefOr[ColorRendering]]]] = js.undefined
  
  var `dominant-baseline`: js.UndefOr[DominantBaseline | js.Array[NonNullable[js.UndefOr[DominantBaseline]]]] = js.undefined
  
  var fill: js.UndefOr[Fill | js.Array[NonNullable[js.UndefOr[Fill]]]] = js.undefined
  
  var `fill-opacity`: js.UndefOr[FillOpacity | js.Array[NonNullable[js.UndefOr[FillOpacity]]]] = js.undefined
  
  var `fill-rule`: js.UndefOr[FillRule | js.Array[NonNullable[js.UndefOr[FillRule]]]] = js.undefined
  
  var `flood-color`: js.UndefOr[FloodColor | js.Array[NonNullable[js.UndefOr[FloodColor]]]] = js.undefined
  
  var `flood-opacity`: js.UndefOr[FloodOpacity | js.Array[NonNullable[js.UndefOr[FloodOpacity]]]] = js.undefined
  
  var `glyph-orientation-vertical`: js.UndefOr[
    GlyphOrientationVertical | js.Array[NonNullable[js.UndefOr[GlyphOrientationVertical]]]
  ] = js.undefined
  
  var `lighting-color`: js.UndefOr[LightingColor | js.Array[NonNullable[js.UndefOr[LightingColor]]]] = js.undefined
  
  var marker: js.UndefOr[Marker | js.Array[NonNullable[js.UndefOr[Marker]]]] = js.undefined
  
  var `marker-end`: js.UndefOr[MarkerEnd | js.Array[NonNullable[js.UndefOr[MarkerEnd]]]] = js.undefined
  
  var `marker-mid`: js.UndefOr[MarkerMid | js.Array[NonNullable[js.UndefOr[MarkerMid]]]] = js.undefined
  
  var `marker-start`: js.UndefOr[MarkerStart | js.Array[NonNullable[js.UndefOr[MarkerStart]]]] = js.undefined
  
  var `shape-rendering`: js.UndefOr[ShapeRendering | js.Array[NonNullable[js.UndefOr[ShapeRendering]]]] = js.undefined
  
  var `stop-color`: js.UndefOr[StopColor | js.Array[NonNullable[js.UndefOr[StopColor]]]] = js.undefined
  
  var `stop-opacity`: js.UndefOr[StopOpacity | js.Array[NonNullable[js.UndefOr[StopOpacity]]]] = js.undefined
  
  var stroke: js.UndefOr[Stroke | js.Array[NonNullable[js.UndefOr[Stroke]]]] = js.undefined
  
  var `stroke-dasharray`: js.UndefOr[
    StrokeDasharray[TLength] | js.Array[NonNullable[js.UndefOr[StrokeDasharray[TLength]]]]
  ] = js.undefined
  
  var `stroke-dashoffset`: js.UndefOr[
    StrokeDashoffset[TLength] | js.Array[NonNullable[js.UndefOr[StrokeDashoffset[TLength]]]]
  ] = js.undefined
  
  var `stroke-linecap`: js.UndefOr[StrokeLinecap | js.Array[NonNullable[js.UndefOr[StrokeLinecap]]]] = js.undefined
  
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoin | js.Array[NonNullable[js.UndefOr[StrokeLinejoin]]]] = js.undefined
  
  var `stroke-miterlimit`: js.UndefOr[StrokeMiterlimit | js.Array[NonNullable[js.UndefOr[StrokeMiterlimit]]]] = js.undefined
  
  var `stroke-opacity`: js.UndefOr[StrokeOpacity | js.Array[NonNullable[js.UndefOr[StrokeOpacity]]]] = js.undefined
  
  var `stroke-width`: js.UndefOr[StrokeWidth[TLength] | js.Array[NonNullable[js.UndefOr[StrokeWidth[TLength]]]]] = js.undefined
  
  var `text-anchor`: js.UndefOr[TextAnchor | js.Array[NonNullable[js.UndefOr[TextAnchor]]]] = js.undefined
  
  var `vector-effect`: js.UndefOr[VectorEffect | js.Array[NonNullable[js.UndefOr[VectorEffect]]]] = js.undefined
}
object PropertiesHyphenFallback {
  
  inline def apply[TLength, TTime](): PropertiesHyphenFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesHyphenFallback[TLength, TTime]]
  }
  
  extension [Self <: PropertiesHyphenFallback[?, ?], TLength, TTime](x: Self & (PropertiesHyphenFallback[TLength, TTime])) {
    
    inline def `setAlignment-baseline`(value: AlignmentBaseline | js.Array[NonNullable[js.UndefOr[AlignmentBaseline]]]): Self = StObject.set(x, "alignment-baseline", value.asInstanceOf[js.Any])
    
    inline def `setAlignment-baselineUndefined`: Self = StObject.set(x, "alignment-baseline", js.undefined)
    
    inline def `setAlignment-baselineVarargs`(value: NonNullable[js.UndefOr[AlignmentBaseline]]*): Self = StObject.set(x, "alignment-baseline", js.Array(value*))
    
    inline def `setBaseline-shift`(value: BaselineShift[TLength] | js.Array[NonNullable[js.UndefOr[BaselineShift[TLength]]]]): Self = StObject.set(x, "baseline-shift", value.asInstanceOf[js.Any])
    
    inline def `setBaseline-shiftUndefined`: Self = StObject.set(x, "baseline-shift", js.undefined)
    
    inline def `setBaseline-shiftVarargs`(value: NonNullable[js.UndefOr[BaselineShift[TLength]]]*): Self = StObject.set(x, "baseline-shift", js.Array(value*))
    
    inline def `setClip-rule`(value: ClipRule | js.Array[NonNullable[js.UndefOr[ClipRule]]]): Self = StObject.set(x, "clip-rule", value.asInstanceOf[js.Any])
    
    inline def `setClip-ruleUndefined`: Self = StObject.set(x, "clip-rule", js.undefined)
    
    inline def `setClip-ruleVarargs`(value: NonNullable[js.UndefOr[ClipRule]]*): Self = StObject.set(x, "clip-rule", js.Array(value*))
    
    inline def `setColor-interpolation`(value: ColorInterpolation | js.Array[NonNullable[js.UndefOr[ColorInterpolation]]]): Self = StObject.set(x, "color-interpolation", value.asInstanceOf[js.Any])
    
    inline def `setColor-interpolationUndefined`: Self = StObject.set(x, "color-interpolation", js.undefined)
    
    inline def `setColor-interpolationVarargs`(value: NonNullable[js.UndefOr[ColorInterpolation]]*): Self = StObject.set(x, "color-interpolation", js.Array(value*))
    
    inline def `setColor-rendering`(value: ColorRendering | js.Array[NonNullable[js.UndefOr[ColorRendering]]]): Self = StObject.set(x, "color-rendering", value.asInstanceOf[js.Any])
    
    inline def `setColor-renderingUndefined`: Self = StObject.set(x, "color-rendering", js.undefined)
    
    inline def `setColor-renderingVarargs`(value: NonNullable[js.UndefOr[ColorRendering]]*): Self = StObject.set(x, "color-rendering", js.Array(value*))
    
    inline def `setDominant-baseline`(value: DominantBaseline | js.Array[NonNullable[js.UndefOr[DominantBaseline]]]): Self = StObject.set(x, "dominant-baseline", value.asInstanceOf[js.Any])
    
    inline def `setDominant-baselineUndefined`: Self = StObject.set(x, "dominant-baseline", js.undefined)
    
    inline def `setDominant-baselineVarargs`(value: NonNullable[js.UndefOr[DominantBaseline]]*): Self = StObject.set(x, "dominant-baseline", js.Array(value*))
    
    inline def setFill(value: Fill | js.Array[NonNullable[js.UndefOr[Fill]]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacity`(value: FillOpacity | js.Array[NonNullable[js.UndefOr[FillOpacity]]]): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    inline def `setFill-opacityVarargs`(value: NonNullable[js.UndefOr[FillOpacity]]*): Self = StObject.set(x, "fill-opacity", js.Array(value*))
    
    inline def `setFill-rule`(value: FillRule | js.Array[NonNullable[js.UndefOr[FillRule]]]): Self = StObject.set(x, "fill-rule", value.asInstanceOf[js.Any])
    
    inline def `setFill-ruleUndefined`: Self = StObject.set(x, "fill-rule", js.undefined)
    
    inline def `setFill-ruleVarargs`(value: NonNullable[js.UndefOr[FillRule]]*): Self = StObject.set(x, "fill-rule", js.Array(value*))
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFillVarargs(value: NonNullable[js.UndefOr[Fill]]*): Self = StObject.set(x, "fill", js.Array(value*))
    
    inline def `setFlood-color`(value: FloodColor | js.Array[NonNullable[js.UndefOr[FloodColor]]]): Self = StObject.set(x, "flood-color", value.asInstanceOf[js.Any])
    
    inline def `setFlood-colorUndefined`: Self = StObject.set(x, "flood-color", js.undefined)
    
    inline def `setFlood-colorVarargs`(value: NonNullable[js.UndefOr[FloodColor]]*): Self = StObject.set(x, "flood-color", js.Array(value*))
    
    inline def `setFlood-opacity`(value: FloodOpacity | js.Array[NonNullable[js.UndefOr[FloodOpacity]]]): Self = StObject.set(x, "flood-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFlood-opacityUndefined`: Self = StObject.set(x, "flood-opacity", js.undefined)
    
    inline def `setFlood-opacityVarargs`(value: NonNullable[js.UndefOr[FloodOpacity]]*): Self = StObject.set(x, "flood-opacity", js.Array(value*))
    
    inline def `setGlyph-orientation-vertical`(value: GlyphOrientationVertical | js.Array[NonNullable[js.UndefOr[GlyphOrientationVertical]]]): Self = StObject.set(x, "glyph-orientation-vertical", value.asInstanceOf[js.Any])
    
    inline def `setGlyph-orientation-verticalUndefined`: Self = StObject.set(x, "glyph-orientation-vertical", js.undefined)
    
    inline def `setGlyph-orientation-verticalVarargs`(value: NonNullable[js.UndefOr[GlyphOrientationVertical]]*): Self = StObject.set(x, "glyph-orientation-vertical", js.Array(value*))
    
    inline def `setLighting-color`(value: LightingColor | js.Array[NonNullable[js.UndefOr[LightingColor]]]): Self = StObject.set(x, "lighting-color", value.asInstanceOf[js.Any])
    
    inline def `setLighting-colorUndefined`: Self = StObject.set(x, "lighting-color", js.undefined)
    
    inline def `setLighting-colorVarargs`(value: NonNullable[js.UndefOr[LightingColor]]*): Self = StObject.set(x, "lighting-color", js.Array(value*))
    
    inline def setMarker(value: Marker | js.Array[NonNullable[js.UndefOr[Marker]]]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def `setMarker-end`(value: MarkerEnd | js.Array[NonNullable[js.UndefOr[MarkerEnd]]]): Self = StObject.set(x, "marker-end", value.asInstanceOf[js.Any])
    
    inline def `setMarker-endUndefined`: Self = StObject.set(x, "marker-end", js.undefined)
    
    inline def `setMarker-endVarargs`(value: NonNullable[js.UndefOr[MarkerEnd]]*): Self = StObject.set(x, "marker-end", js.Array(value*))
    
    inline def `setMarker-mid`(value: MarkerMid | js.Array[NonNullable[js.UndefOr[MarkerMid]]]): Self = StObject.set(x, "marker-mid", value.asInstanceOf[js.Any])
    
    inline def `setMarker-midUndefined`: Self = StObject.set(x, "marker-mid", js.undefined)
    
    inline def `setMarker-midVarargs`(value: NonNullable[js.UndefOr[MarkerMid]]*): Self = StObject.set(x, "marker-mid", js.Array(value*))
    
    inline def `setMarker-start`(value: MarkerStart | js.Array[NonNullable[js.UndefOr[MarkerStart]]]): Self = StObject.set(x, "marker-start", value.asInstanceOf[js.Any])
    
    inline def `setMarker-startUndefined`: Self = StObject.set(x, "marker-start", js.undefined)
    
    inline def `setMarker-startVarargs`(value: NonNullable[js.UndefOr[MarkerStart]]*): Self = StObject.set(x, "marker-start", js.Array(value*))
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMarkerVarargs(value: NonNullable[js.UndefOr[Marker]]*): Self = StObject.set(x, "marker", js.Array(value*))
    
    inline def `setShape-rendering`(value: ShapeRendering | js.Array[NonNullable[js.UndefOr[ShapeRendering]]]): Self = StObject.set(x, "shape-rendering", value.asInstanceOf[js.Any])
    
    inline def `setShape-renderingUndefined`: Self = StObject.set(x, "shape-rendering", js.undefined)
    
    inline def `setShape-renderingVarargs`(value: NonNullable[js.UndefOr[ShapeRendering]]*): Self = StObject.set(x, "shape-rendering", js.Array(value*))
    
    inline def `setStop-color`(value: StopColor | js.Array[NonNullable[js.UndefOr[StopColor]]]): Self = StObject.set(x, "stop-color", value.asInstanceOf[js.Any])
    
    inline def `setStop-colorUndefined`: Self = StObject.set(x, "stop-color", js.undefined)
    
    inline def `setStop-colorVarargs`(value: NonNullable[js.UndefOr[StopColor]]*): Self = StObject.set(x, "stop-color", js.Array(value*))
    
    inline def `setStop-opacity`(value: StopOpacity | js.Array[NonNullable[js.UndefOr[StopOpacity]]]): Self = StObject.set(x, "stop-opacity", value.asInstanceOf[js.Any])
    
    inline def `setStop-opacityUndefined`: Self = StObject.set(x, "stop-opacity", js.undefined)
    
    inline def `setStop-opacityVarargs`(value: NonNullable[js.UndefOr[StopOpacity]]*): Self = StObject.set(x, "stop-opacity", js.Array(value*))
    
    inline def setStroke(value: Stroke | js.Array[NonNullable[js.UndefOr[Stroke]]]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dasharray`(value: StrokeDasharray[TLength] | js.Array[NonNullable[js.UndefOr[StrokeDasharray[TLength]]]]): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
    
    inline def `setStroke-dasharrayVarargs`(value: NonNullable[js.UndefOr[StrokeDasharray[TLength]]]*): Self = StObject.set(x, "stroke-dasharray", js.Array(value*))
    
    inline def `setStroke-dashoffset`(value: StrokeDashoffset[TLength] | js.Array[NonNullable[js.UndefOr[StrokeDashoffset[TLength]]]]): Self = StObject.set(x, "stroke-dashoffset", value.asInstanceOf[js.Any])
    
    inline def `setStroke-dashoffsetUndefined`: Self = StObject.set(x, "stroke-dashoffset", js.undefined)
    
    inline def `setStroke-dashoffsetVarargs`(value: NonNullable[js.UndefOr[StrokeDashoffset[TLength]]]*): Self = StObject.set(x, "stroke-dashoffset", js.Array(value*))
    
    inline def `setStroke-linecap`(value: StrokeLinecap | js.Array[NonNullable[js.UndefOr[StrokeLinecap]]]): Self = StObject.set(x, "stroke-linecap", value.asInstanceOf[js.Any])
    
    inline def `setStroke-linecapUndefined`: Self = StObject.set(x, "stroke-linecap", js.undefined)
    
    inline def `setStroke-linecapVarargs`(value: NonNullable[js.UndefOr[StrokeLinecap]]*): Self = StObject.set(x, "stroke-linecap", js.Array(value*))
    
    inline def `setStroke-linejoin`(value: StrokeLinejoin | js.Array[NonNullable[js.UndefOr[StrokeLinejoin]]]): Self = StObject.set(x, "stroke-linejoin", value.asInstanceOf[js.Any])
    
    inline def `setStroke-linejoinUndefined`: Self = StObject.set(x, "stroke-linejoin", js.undefined)
    
    inline def `setStroke-linejoinVarargs`(value: NonNullable[js.UndefOr[StrokeLinejoin]]*): Self = StObject.set(x, "stroke-linejoin", js.Array(value*))
    
    inline def `setStroke-miterlimit`(value: StrokeMiterlimit | js.Array[NonNullable[js.UndefOr[StrokeMiterlimit]]]): Self = StObject.set(x, "stroke-miterlimit", value.asInstanceOf[js.Any])
    
    inline def `setStroke-miterlimitUndefined`: Self = StObject.set(x, "stroke-miterlimit", js.undefined)
    
    inline def `setStroke-miterlimitVarargs`(value: NonNullable[js.UndefOr[StrokeMiterlimit]]*): Self = StObject.set(x, "stroke-miterlimit", js.Array(value*))
    
    inline def `setStroke-opacity`(value: StrokeOpacity | js.Array[NonNullable[js.UndefOr[StrokeOpacity]]]): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
    
    inline def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
    
    inline def `setStroke-opacityVarargs`(value: NonNullable[js.UndefOr[StrokeOpacity]]*): Self = StObject.set(x, "stroke-opacity", js.Array(value*))
    
    inline def `setStroke-width`(value: StrokeWidth[TLength] | js.Array[NonNullable[js.UndefOr[StrokeWidth[TLength]]]]): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
    
    inline def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    
    inline def `setStroke-widthVarargs`(value: NonNullable[js.UndefOr[StrokeWidth[TLength]]]*): Self = StObject.set(x, "stroke-width", js.Array(value*))
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeVarargs(value: NonNullable[js.UndefOr[Stroke]]*): Self = StObject.set(x, "stroke", js.Array(value*))
    
    inline def `setText-anchor`(value: TextAnchor | js.Array[NonNullable[js.UndefOr[TextAnchor]]]): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
    
    inline def `setText-anchorVarargs`(value: NonNullable[js.UndefOr[TextAnchor]]*): Self = StObject.set(x, "text-anchor", js.Array(value*))
    
    inline def `setVector-effect`(value: VectorEffect | js.Array[NonNullable[js.UndefOr[VectorEffect]]]): Self = StObject.set(x, "vector-effect", value.asInstanceOf[js.Any])
    
    inline def `setVector-effectUndefined`: Self = StObject.set(x, "vector-effect", js.undefined)
    
    inline def `setVector-effectVarargs`(value: NonNullable[js.UndefOr[VectorEffect]]*): Self = StObject.set(x, "vector-effect", js.Array(value*))
  }
}
