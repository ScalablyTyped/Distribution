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
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgPropertiesHyphen because var conflicts: clip, `clip-path`, color, cursor, direction, display, filter, font, `font-family`, `font-size`, `font-size-adjust`, `font-stretch`, `font-style`, `font-variant`, `font-weight`, `image-rendering`, `letter-spacing`, `line-height`, mask, opacity, overflow, `paint-order`, `pointer-events`, `text-decoration`, `text-rendering`, `unicode-bidi`, visibility, `white-space`, `word-spacing`, `writing-mode`. Inlined `alignment-baseline`, `baseline-shift`, `clip-rule`, `color-interpolation`, `color-rendering`, `dominant-baseline`, fill, `fill-opacity`, `fill-rule`, `flood-color`, `flood-opacity`, `glyph-orientation-vertical`, `lighting-color`, marker, `marker-end`, `marker-mid`, `marker-start`, `shape-rendering`, `stop-color`, `stop-opacity`, stroke, `stroke-dasharray`, `stroke-dashoffset`, `stroke-linecap`, `stroke-linejoin`, `stroke-miterlimit`, `stroke-opacity`, `stroke-width`, `text-anchor`, `vector-effect` */ @js.native
trait PropertiesHyphen[TLength, TTime]
  extends StandardLonghandPropertiesHyphen[TLength, TTime]
     with StandardShorthandPropertiesHyphen[TLength, TTime]
     with VendorLonghandPropertiesHyphen[TLength, TTime]
     with VendorShorthandPropertiesHyphen[TLength, TTime]
     with ObsoletePropertiesHyphen[TLength, TTime] {
  var `alignment-baseline`: js.UndefOr[AlignmentBaseline] = js.native
  var `baseline-shift`: js.UndefOr[BaselineShift[TLength]] = js.native
  var `clip-rule`: js.UndefOr[ClipRule] = js.native
  var `color-interpolation`: js.UndefOr[ColorInterpolation] = js.native
  var `color-rendering`: js.UndefOr[ColorRendering] = js.native
  var `dominant-baseline`: js.UndefOr[DominantBaseline] = js.native
  var fill: js.UndefOr[Fill] = js.native
  var `fill-opacity`: js.UndefOr[FillOpacity] = js.native
  var `fill-rule`: js.UndefOr[FillRule] = js.native
  var `flood-color`: js.UndefOr[FloodColor] = js.native
  var `flood-opacity`: js.UndefOr[FloodOpacity] = js.native
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVertical] = js.native
  var `lighting-color`: js.UndefOr[LightingColor] = js.native
  var marker: js.UndefOr[Marker] = js.native
  var `marker-end`: js.UndefOr[MarkerEnd] = js.native
  var `marker-mid`: js.UndefOr[MarkerMid] = js.native
  var `marker-start`: js.UndefOr[MarkerStart] = js.native
  var `shape-rendering`: js.UndefOr[ShapeRendering] = js.native
  var `stop-color`: js.UndefOr[StopColor] = js.native
  var `stop-opacity`: js.UndefOr[StopOpacity] = js.native
  var stroke: js.UndefOr[Stroke] = js.native
  var `stroke-dasharray`: js.UndefOr[StrokeDasharray[TLength]] = js.native
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffset[TLength]] = js.native
  var `stroke-linecap`: js.UndefOr[StrokeLinecap] = js.native
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoin] = js.native
  var `stroke-miterlimit`: js.UndefOr[StrokeMiterlimit] = js.native
  var `stroke-opacity`: js.UndefOr[StrokeOpacity] = js.native
  var `stroke-width`: js.UndefOr[StrokeWidth[TLength]] = js.native
  var `text-anchor`: js.UndefOr[TextAnchor] = js.native
  var `vector-effect`: js.UndefOr[VectorEffect] = js.native
}

object PropertiesHyphen {
  @scala.inline
  def apply[TLength, TTime](): PropertiesHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesHyphen[TLength, TTime]]
  }
  @scala.inline
  implicit class PropertiesHyphenOps[Self <: PropertiesHyphen[_, _], TLength, TTime] (val x: Self with (PropertiesHyphen[TLength, TTime])) extends AnyVal {
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
    def `setAlignment-baseline`(value: AlignmentBaseline): Self = this.set("alignment-baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAlignment-baseline`: Self = this.set("alignment-baseline", js.undefined)
    @scala.inline
    def `setBaseline-shift`(value: BaselineShift[TLength]): Self = this.set("baseline-shift", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBaseline-shift`: Self = this.set("baseline-shift", js.undefined)
    @scala.inline
    def `setClip-rule`(value: ClipRule): Self = this.set("clip-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteClip-rule`: Self = this.set("clip-rule", js.undefined)
    @scala.inline
    def `setColor-interpolation`(value: ColorInterpolation): Self = this.set("color-interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-interpolation`: Self = this.set("color-interpolation", js.undefined)
    @scala.inline
    def `setColor-rendering`(value: ColorRendering): Self = this.set("color-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-rendering`: Self = this.set("color-rendering", js.undefined)
    @scala.inline
    def `setDominant-baseline`(value: DominantBaseline): Self = this.set("dominant-baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDominant-baseline`: Self = this.set("dominant-baseline", js.undefined)
    @scala.inline
    def setFill(value: Fill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def `setFill-opacity`(value: FillOpacity): Self = this.set("fill-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-opacity`: Self = this.set("fill-opacity", js.undefined)
    @scala.inline
    def `setFill-rule`(value: FillRule): Self = this.set("fill-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-rule`: Self = this.set("fill-rule", js.undefined)
    @scala.inline
    def `setFlood-color`(value: FloodColor): Self = this.set("flood-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlood-color`: Self = this.set("flood-color", js.undefined)
    @scala.inline
    def `setFlood-opacity`(value: FloodOpacity): Self = this.set("flood-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlood-opacity`: Self = this.set("flood-opacity", js.undefined)
    @scala.inline
    def `setGlyph-orientation-vertical`(value: GlyphOrientationVertical): Self = this.set("glyph-orientation-vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGlyph-orientation-vertical`: Self = this.set("glyph-orientation-vertical", js.undefined)
    @scala.inline
    def `setLighting-color`(value: LightingColor): Self = this.set("lighting-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLighting-color`: Self = this.set("lighting-color", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def `setMarker-end`(value: MarkerEnd): Self = this.set("marker-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-end`: Self = this.set("marker-end", js.undefined)
    @scala.inline
    def `setMarker-mid`(value: MarkerMid): Self = this.set("marker-mid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-mid`: Self = this.set("marker-mid", js.undefined)
    @scala.inline
    def `setMarker-start`(value: MarkerStart): Self = this.set("marker-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-start`: Self = this.set("marker-start", js.undefined)
    @scala.inline
    def `setShape-rendering`(value: ShapeRendering): Self = this.set("shape-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShape-rendering`: Self = this.set("shape-rendering", js.undefined)
    @scala.inline
    def `setStop-color`(value: StopColor): Self = this.set("stop-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStop-color`: Self = this.set("stop-color", js.undefined)
    @scala.inline
    def `setStop-opacity`(value: StopOpacity): Self = this.set("stop-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStop-opacity`: Self = this.set("stop-opacity", js.undefined)
    @scala.inline
    def setStroke(value: Stroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def `setStroke-dasharray`(value: StrokeDasharray[TLength]): Self = this.set("stroke-dasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-dasharray`: Self = this.set("stroke-dasharray", js.undefined)
    @scala.inline
    def `setStroke-dashoffset`(value: StrokeDashoffset[TLength]): Self = this.set("stroke-dashoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-dashoffset`: Self = this.set("stroke-dashoffset", js.undefined)
    @scala.inline
    def `setStroke-linecap`(value: StrokeLinecap): Self = this.set("stroke-linecap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-linecap`: Self = this.set("stroke-linecap", js.undefined)
    @scala.inline
    def `setStroke-linejoin`(value: StrokeLinejoin): Self = this.set("stroke-linejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-linejoin`: Self = this.set("stroke-linejoin", js.undefined)
    @scala.inline
    def `setStroke-miterlimit`(value: StrokeMiterlimit): Self = this.set("stroke-miterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-miterlimit`: Self = this.set("stroke-miterlimit", js.undefined)
    @scala.inline
    def `setStroke-opacity`(value: StrokeOpacity): Self = this.set("stroke-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-opacity`: Self = this.set("stroke-opacity", js.undefined)
    @scala.inline
    def `setStroke-width`(value: StrokeWidth[TLength]): Self = this.set("stroke-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-width`: Self = this.set("stroke-width", js.undefined)
    @scala.inline
    def `setText-anchor`(value: TextAnchor): Self = this.set("text-anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-anchor`: Self = this.set("text-anchor", js.undefined)
    @scala.inline
    def `setVector-effect`(value: VectorEffect): Self = this.set("vector-effect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVector-effect`: Self = this.set("vector-effect", js.undefined)
  }
  
}

