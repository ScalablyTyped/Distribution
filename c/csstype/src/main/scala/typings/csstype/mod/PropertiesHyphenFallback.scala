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
- typings.csstype.mod.SvgPropertiesHyphenFallback because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `baseline-shift`, `vector-effect`, `stroke-dashoffset`, `marker-end`, `marker-mid`, fill, `alignment-baseline`, `lighting-color`, `stop-color`, `flood-color`, `color-rendering`, `stroke-width`, `shape-rendering`, `fill-rule`, `stroke-dasharray`, `glyph-orientation-vertical`, `stroke-linejoin`, `stop-opacity`, `stroke-miterlimit`, `color-interpolation`, `stroke-opacity`, `stroke-linecap`, `flood-opacity`, `marker-start`, `text-anchor`, stroke, `clip-rule`, `fill-opacity`, `dominant-baseline`, marker */ @js.native
trait PropertiesHyphenFallback[TLength, TTime]
  extends StandardLonghandPropertiesHyphenFallback[TLength, TTime]
     with StandardShorthandPropertiesHyphenFallback[TLength, TTime]
     with VendorLonghandPropertiesHyphenFallback[TLength, TTime]
     with VendorShorthandPropertiesHyphenFallback[TLength, TTime]
     with ObsoletePropertiesHyphenFallback[TLength, TTime] {
  var `alignment-baseline`: js.UndefOr[AlignmentBaseline | js.Array[js.UndefOr[AlignmentBaseline]]] = js.native
  var `baseline-shift`: js.UndefOr[BaselineShift[TLength] | js.Array[js.UndefOr[BaselineShift[TLength]]]] = js.native
  var `clip-rule`: js.UndefOr[ClipRule | js.Array[js.UndefOr[ClipRule]]] = js.native
  var `color-interpolation`: js.UndefOr[ColorInterpolation | js.Array[js.UndefOr[ColorInterpolation]]] = js.native
  var `color-rendering`: js.UndefOr[ColorRendering | js.Array[js.UndefOr[ColorRendering]]] = js.native
  var `dominant-baseline`: js.UndefOr[DominantBaseline | js.Array[js.UndefOr[DominantBaseline]]] = js.native
  var fill: js.UndefOr[Fill | js.Array[js.UndefOr[Fill]]] = js.native
  var `fill-opacity`: js.UndefOr[FillOpacity | js.Array[js.UndefOr[FillOpacity]]] = js.native
  var `fill-rule`: js.UndefOr[FillRule | js.Array[js.UndefOr[FillRule]]] = js.native
  var `flood-color`: js.UndefOr[FloodColor | js.Array[js.UndefOr[FloodColor]]] = js.native
  var `flood-opacity`: js.UndefOr[FloodOpacity | js.Array[js.UndefOr[FloodOpacity]]] = js.native
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVertical | js.Array[js.UndefOr[GlyphOrientationVertical]]] = js.native
  var `lighting-color`: js.UndefOr[LightingColor | js.Array[js.UndefOr[LightingColor]]] = js.native
  var marker: js.UndefOr[Marker | js.Array[js.UndefOr[Marker]]] = js.native
  var `marker-end`: js.UndefOr[MarkerEnd | js.Array[js.UndefOr[MarkerEnd]]] = js.native
  var `marker-mid`: js.UndefOr[MarkerMid | js.Array[js.UndefOr[MarkerMid]]] = js.native
  var `marker-start`: js.UndefOr[MarkerStart | js.Array[js.UndefOr[MarkerStart]]] = js.native
  var `shape-rendering`: js.UndefOr[ShapeRendering | js.Array[js.UndefOr[ShapeRendering]]] = js.native
  var `stop-color`: js.UndefOr[StopColor | js.Array[js.UndefOr[StopColor]]] = js.native
  var `stop-opacity`: js.UndefOr[StopOpacity | js.Array[js.UndefOr[StopOpacity]]] = js.native
  var stroke: js.UndefOr[Stroke | js.Array[js.UndefOr[Stroke]]] = js.native
  var `stroke-dasharray`: js.UndefOr[StrokeDasharray[TLength] | js.Array[js.UndefOr[StrokeDasharray[TLength]]]] = js.native
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffset[TLength] | js.Array[js.UndefOr[StrokeDashoffset[TLength]]]] = js.native
  var `stroke-linecap`: js.UndefOr[StrokeLinecap | js.Array[js.UndefOr[StrokeLinecap]]] = js.native
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoin | js.Array[js.UndefOr[StrokeLinejoin]]] = js.native
  var `stroke-miterlimit`: js.UndefOr[StrokeMiterlimit | js.Array[js.UndefOr[StrokeMiterlimit]]] = js.native
  var `stroke-opacity`: js.UndefOr[StrokeOpacity | js.Array[js.UndefOr[StrokeOpacity]]] = js.native
  var `stroke-width`: js.UndefOr[StrokeWidth[TLength] | js.Array[js.UndefOr[StrokeWidth[TLength]]]] = js.native
  var `text-anchor`: js.UndefOr[TextAnchor | js.Array[js.UndefOr[TextAnchor]]] = js.native
  var `vector-effect`: js.UndefOr[VectorEffect | js.Array[js.UndefOr[VectorEffect]]] = js.native
}

object PropertiesHyphenFallback {
  @scala.inline
  def apply[TLength, TTime](): PropertiesHyphenFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesHyphenFallback[TLength, TTime]]
  }
  @scala.inline
  implicit class PropertiesHyphenFallbackOps[Self <: PropertiesHyphenFallback[_, _], TLength, TTime] (val x: Self with (PropertiesHyphenFallback[TLength, TTime])) extends AnyVal {
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
    def `setAlignment-baselineVarargs`(value: js.UndefOr[AlignmentBaseline]*): Self = this.set("alignment-baseline", js.Array(value :_*))
    @scala.inline
    def `setAlignment-baseline`(value: AlignmentBaseline | js.Array[js.UndefOr[AlignmentBaseline]]): Self = this.set("alignment-baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAlignment-baseline`: Self = this.set("alignment-baseline", js.undefined)
    @scala.inline
    def `setBaseline-shiftVarargs`(value: js.UndefOr[BaselineShift[TLength]]*): Self = this.set("baseline-shift", js.Array(value :_*))
    @scala.inline
    def `setBaseline-shift`(value: BaselineShift[TLength] | js.Array[js.UndefOr[BaselineShift[TLength]]]): Self = this.set("baseline-shift", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBaseline-shift`: Self = this.set("baseline-shift", js.undefined)
    @scala.inline
    def `setClip-ruleVarargs`(value: js.UndefOr[ClipRule]*): Self = this.set("clip-rule", js.Array(value :_*))
    @scala.inline
    def `setClip-rule`(value: ClipRule | js.Array[js.UndefOr[ClipRule]]): Self = this.set("clip-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteClip-rule`: Self = this.set("clip-rule", js.undefined)
    @scala.inline
    def `setColor-interpolationVarargs`(value: js.UndefOr[ColorInterpolation]*): Self = this.set("color-interpolation", js.Array(value :_*))
    @scala.inline
    def `setColor-interpolation`(value: ColorInterpolation | js.Array[js.UndefOr[ColorInterpolation]]): Self = this.set("color-interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-interpolation`: Self = this.set("color-interpolation", js.undefined)
    @scala.inline
    def `setColor-renderingVarargs`(value: js.UndefOr[ColorRendering]*): Self = this.set("color-rendering", js.Array(value :_*))
    @scala.inline
    def `setColor-rendering`(value: ColorRendering | js.Array[js.UndefOr[ColorRendering]]): Self = this.set("color-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-rendering`: Self = this.set("color-rendering", js.undefined)
    @scala.inline
    def `setDominant-baselineVarargs`(value: js.UndefOr[DominantBaseline]*): Self = this.set("dominant-baseline", js.Array(value :_*))
    @scala.inline
    def `setDominant-baseline`(value: DominantBaseline | js.Array[js.UndefOr[DominantBaseline]]): Self = this.set("dominant-baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDominant-baseline`: Self = this.set("dominant-baseline", js.undefined)
    @scala.inline
    def setFillVarargs(value: js.UndefOr[Fill]*): Self = this.set("fill", js.Array(value :_*))
    @scala.inline
    def setFill(value: Fill | js.Array[js.UndefOr[Fill]]): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def `setFill-opacityVarargs`(value: js.UndefOr[FillOpacity]*): Self = this.set("fill-opacity", js.Array(value :_*))
    @scala.inline
    def `setFill-opacity`(value: FillOpacity | js.Array[js.UndefOr[FillOpacity]]): Self = this.set("fill-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-opacity`: Self = this.set("fill-opacity", js.undefined)
    @scala.inline
    def `setFill-ruleVarargs`(value: js.UndefOr[FillRule]*): Self = this.set("fill-rule", js.Array(value :_*))
    @scala.inline
    def `setFill-rule`(value: FillRule | js.Array[js.UndefOr[FillRule]]): Self = this.set("fill-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-rule`: Self = this.set("fill-rule", js.undefined)
    @scala.inline
    def `setFlood-colorVarargs`(value: js.UndefOr[FloodColor]*): Self = this.set("flood-color", js.Array(value :_*))
    @scala.inline
    def `setFlood-color`(value: FloodColor | js.Array[js.UndefOr[FloodColor]]): Self = this.set("flood-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlood-color`: Self = this.set("flood-color", js.undefined)
    @scala.inline
    def `setFlood-opacityVarargs`(value: js.UndefOr[FloodOpacity]*): Self = this.set("flood-opacity", js.Array(value :_*))
    @scala.inline
    def `setFlood-opacity`(value: FloodOpacity | js.Array[js.UndefOr[FloodOpacity]]): Self = this.set("flood-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlood-opacity`: Self = this.set("flood-opacity", js.undefined)
    @scala.inline
    def `setGlyph-orientation-verticalVarargs`(value: js.UndefOr[GlyphOrientationVertical]*): Self = this.set("glyph-orientation-vertical", js.Array(value :_*))
    @scala.inline
    def `setGlyph-orientation-vertical`(value: GlyphOrientationVertical | js.Array[js.UndefOr[GlyphOrientationVertical]]): Self = this.set("glyph-orientation-vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGlyph-orientation-vertical`: Self = this.set("glyph-orientation-vertical", js.undefined)
    @scala.inline
    def `setLighting-colorVarargs`(value: js.UndefOr[LightingColor]*): Self = this.set("lighting-color", js.Array(value :_*))
    @scala.inline
    def `setLighting-color`(value: LightingColor | js.Array[js.UndefOr[LightingColor]]): Self = this.set("lighting-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLighting-color`: Self = this.set("lighting-color", js.undefined)
    @scala.inline
    def setMarkerVarargs(value: js.UndefOr[Marker]*): Self = this.set("marker", js.Array(value :_*))
    @scala.inline
    def setMarker(value: Marker | js.Array[js.UndefOr[Marker]]): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def `setMarker-endVarargs`(value: js.UndefOr[MarkerEnd]*): Self = this.set("marker-end", js.Array(value :_*))
    @scala.inline
    def `setMarker-end`(value: MarkerEnd | js.Array[js.UndefOr[MarkerEnd]]): Self = this.set("marker-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-end`: Self = this.set("marker-end", js.undefined)
    @scala.inline
    def `setMarker-midVarargs`(value: js.UndefOr[MarkerMid]*): Self = this.set("marker-mid", js.Array(value :_*))
    @scala.inline
    def `setMarker-mid`(value: MarkerMid | js.Array[js.UndefOr[MarkerMid]]): Self = this.set("marker-mid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-mid`: Self = this.set("marker-mid", js.undefined)
    @scala.inline
    def `setMarker-startVarargs`(value: js.UndefOr[MarkerStart]*): Self = this.set("marker-start", js.Array(value :_*))
    @scala.inline
    def `setMarker-start`(value: MarkerStart | js.Array[js.UndefOr[MarkerStart]]): Self = this.set("marker-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-start`: Self = this.set("marker-start", js.undefined)
    @scala.inline
    def `setShape-renderingVarargs`(value: js.UndefOr[ShapeRendering]*): Self = this.set("shape-rendering", js.Array(value :_*))
    @scala.inline
    def `setShape-rendering`(value: ShapeRendering | js.Array[js.UndefOr[ShapeRendering]]): Self = this.set("shape-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShape-rendering`: Self = this.set("shape-rendering", js.undefined)
    @scala.inline
    def `setStop-colorVarargs`(value: js.UndefOr[StopColor]*): Self = this.set("stop-color", js.Array(value :_*))
    @scala.inline
    def `setStop-color`(value: StopColor | js.Array[js.UndefOr[StopColor]]): Self = this.set("stop-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStop-color`: Self = this.set("stop-color", js.undefined)
    @scala.inline
    def `setStop-opacityVarargs`(value: js.UndefOr[StopOpacity]*): Self = this.set("stop-opacity", js.Array(value :_*))
    @scala.inline
    def `setStop-opacity`(value: StopOpacity | js.Array[js.UndefOr[StopOpacity]]): Self = this.set("stop-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStop-opacity`: Self = this.set("stop-opacity", js.undefined)
    @scala.inline
    def setStrokeVarargs(value: js.UndefOr[Stroke]*): Self = this.set("stroke", js.Array(value :_*))
    @scala.inline
    def setStroke(value: Stroke | js.Array[js.UndefOr[Stroke]]): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def `setStroke-dasharrayVarargs`(value: js.UndefOr[StrokeDasharray[TLength]]*): Self = this.set("stroke-dasharray", js.Array(value :_*))
    @scala.inline
    def `setStroke-dasharray`(value: StrokeDasharray[TLength] | js.Array[js.UndefOr[StrokeDasharray[TLength]]]): Self = this.set("stroke-dasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-dasharray`: Self = this.set("stroke-dasharray", js.undefined)
    @scala.inline
    def `setStroke-dashoffsetVarargs`(value: js.UndefOr[StrokeDashoffset[TLength]]*): Self = this.set("stroke-dashoffset", js.Array(value :_*))
    @scala.inline
    def `setStroke-dashoffset`(value: StrokeDashoffset[TLength] | js.Array[js.UndefOr[StrokeDashoffset[TLength]]]): Self = this.set("stroke-dashoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-dashoffset`: Self = this.set("stroke-dashoffset", js.undefined)
    @scala.inline
    def `setStroke-linecapVarargs`(value: js.UndefOr[StrokeLinecap]*): Self = this.set("stroke-linecap", js.Array(value :_*))
    @scala.inline
    def `setStroke-linecap`(value: StrokeLinecap | js.Array[js.UndefOr[StrokeLinecap]]): Self = this.set("stroke-linecap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-linecap`: Self = this.set("stroke-linecap", js.undefined)
    @scala.inline
    def `setStroke-linejoinVarargs`(value: js.UndefOr[StrokeLinejoin]*): Self = this.set("stroke-linejoin", js.Array(value :_*))
    @scala.inline
    def `setStroke-linejoin`(value: StrokeLinejoin | js.Array[js.UndefOr[StrokeLinejoin]]): Self = this.set("stroke-linejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-linejoin`: Self = this.set("stroke-linejoin", js.undefined)
    @scala.inline
    def `setStroke-miterlimitVarargs`(value: js.UndefOr[StrokeMiterlimit]*): Self = this.set("stroke-miterlimit", js.Array(value :_*))
    @scala.inline
    def `setStroke-miterlimit`(value: StrokeMiterlimit | js.Array[js.UndefOr[StrokeMiterlimit]]): Self = this.set("stroke-miterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-miterlimit`: Self = this.set("stroke-miterlimit", js.undefined)
    @scala.inline
    def `setStroke-opacityVarargs`(value: js.UndefOr[StrokeOpacity]*): Self = this.set("stroke-opacity", js.Array(value :_*))
    @scala.inline
    def `setStroke-opacity`(value: StrokeOpacity | js.Array[js.UndefOr[StrokeOpacity]]): Self = this.set("stroke-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-opacity`: Self = this.set("stroke-opacity", js.undefined)
    @scala.inline
    def `setStroke-widthVarargs`(value: js.UndefOr[StrokeWidth[TLength]]*): Self = this.set("stroke-width", js.Array(value :_*))
    @scala.inline
    def `setStroke-width`(value: StrokeWidth[TLength] | js.Array[js.UndefOr[StrokeWidth[TLength]]]): Self = this.set("stroke-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-width`: Self = this.set("stroke-width", js.undefined)
    @scala.inline
    def `setText-anchorVarargs`(value: js.UndefOr[TextAnchor]*): Self = this.set("text-anchor", js.Array(value :_*))
    @scala.inline
    def `setText-anchor`(value: TextAnchor | js.Array[js.UndefOr[TextAnchor]]): Self = this.set("text-anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-anchor`: Self = this.set("text-anchor", js.undefined)
    @scala.inline
    def `setVector-effectVarargs`(value: js.UndefOr[VectorEffect]*): Self = this.set("vector-effect", js.Array(value :_*))
    @scala.inline
    def `setVector-effect`(value: VectorEffect | js.Array[js.UndefOr[VectorEffect]]): Self = this.set("vector-effect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVector-effect`: Self = this.set("vector-effect", js.undefined)
  }
  
}

