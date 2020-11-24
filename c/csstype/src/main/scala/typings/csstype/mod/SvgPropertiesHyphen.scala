package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SvgPropertiesHyphen[TLength] extends js.Object {
  
  var `alignment-baseline`: js.UndefOr[AlignmentBaselineProperty] = js.native
  
  var `baseline-shift`: js.UndefOr[BaselineShiftProperty[TLength]] = js.native
  
  var clip: js.UndefOr[ClipProperty] = js.native
  
  var `clip-path`: js.UndefOr[ClipPathProperty] = js.native
  
  var `clip-rule`: js.UndefOr[ClipRuleProperty] = js.native
  
  var color: js.UndefOr[ColorProperty] = js.native
  
  var `color-interpolation`: js.UndefOr[ColorInterpolationProperty] = js.native
  
  var `color-rendering`: js.UndefOr[ColorRenderingProperty] = js.native
  
  var cursor: js.UndefOr[CursorProperty] = js.native
  
  var direction: js.UndefOr[DirectionProperty] = js.native
  
  var display: js.UndefOr[DisplayProperty] = js.native
  
  var `dominant-baseline`: js.UndefOr[DominantBaselineProperty] = js.native
  
  var fill: js.UndefOr[FillProperty] = js.native
  
  var `fill-opacity`: js.UndefOr[GlobalsNumber] = js.native
  
  var `fill-rule`: js.UndefOr[FillRuleProperty] = js.native
  
  var filter: js.UndefOr[FilterProperty] = js.native
  
  var `flood-color`: js.UndefOr[FloodColorProperty] = js.native
  
  var `flood-opacity`: js.UndefOr[GlobalsNumber] = js.native
  
  var font: js.UndefOr[FontProperty] = js.native
  
  var `font-family`: js.UndefOr[FontFamilyProperty] = js.native
  
  var `font-size`: js.UndefOr[FontSizeProperty[TLength]] = js.native
  
  var `font-size-adjust`: js.UndefOr[FontSizeAdjustProperty] = js.native
  
  var `font-stretch`: js.UndefOr[FontStretchProperty] = js.native
  
  var `font-style`: js.UndefOr[FontStyleProperty] = js.native
  
  var `font-variant`: js.UndefOr[FontVariantProperty] = js.native
  
  var `font-weight`: js.UndefOr[FontWeightProperty] = js.native
  
  var `glyph-orientation-vertical`: js.UndefOr[GlyphOrientationVerticalProperty] = js.native
  
  var `image-rendering`: js.UndefOr[ImageRenderingProperty] = js.native
  
  var `letter-spacing`: js.UndefOr[LetterSpacingProperty[TLength]] = js.native
  
  var `lighting-color`: js.UndefOr[LightingColorProperty] = js.native
  
  var `line-height`: js.UndefOr[LineHeightProperty[TLength]] = js.native
  
  var marker: js.UndefOr[MarkerProperty] = js.native
  
  var `marker-end`: js.UndefOr[MarkerEndProperty] = js.native
  
  var `marker-mid`: js.UndefOr[MarkerMidProperty] = js.native
  
  var `marker-start`: js.UndefOr[MarkerStartProperty] = js.native
  
  var mask: js.UndefOr[MaskProperty[TLength]] = js.native
  
  var opacity: js.UndefOr[OpacityProperty] = js.native
  
  var overflow: js.UndefOr[OverflowProperty] = js.native
  
  var `paint-order`: js.UndefOr[PaintOrderProperty] = js.native
  
  var `pointer-events`: js.UndefOr[PointerEventsProperty] = js.native
  
  var `shape-rendering`: js.UndefOr[ShapeRenderingProperty] = js.native
  
  var `stop-color`: js.UndefOr[StopColorProperty] = js.native
  
  var `stop-opacity`: js.UndefOr[GlobalsNumber] = js.native
  
  var stroke: js.UndefOr[StrokeProperty] = js.native
  
  var `stroke-dasharray`: js.UndefOr[StrokeDasharrayProperty[TLength]] = js.native
  
  var `stroke-dashoffset`: js.UndefOr[StrokeDashoffsetProperty[TLength]] = js.native
  
  var `stroke-linecap`: js.UndefOr[StrokeLinecapProperty] = js.native
  
  var `stroke-linejoin`: js.UndefOr[StrokeLinejoinProperty] = js.native
  
  var `stroke-miterlimit`: js.UndefOr[GlobalsNumber] = js.native
  
  var `stroke-opacity`: js.UndefOr[GlobalsNumber] = js.native
  
  var `stroke-width`: js.UndefOr[StrokeWidthProperty[TLength]] = js.native
  
  var `text-anchor`: js.UndefOr[TextAnchorProperty] = js.native
  
  var `text-decoration`: js.UndefOr[TextDecorationProperty[TLength]] = js.native
  
  var `text-rendering`: js.UndefOr[TextRenderingProperty] = js.native
  
  var `unicode-bidi`: js.UndefOr[UnicodeBidiProperty] = js.native
  
  var `vector-effect`: js.UndefOr[VectorEffectProperty] = js.native
  
  var visibility: js.UndefOr[VisibilityProperty] = js.native
  
  var `white-space`: js.UndefOr[WhiteSpaceProperty] = js.native
  
  var `word-spacing`: js.UndefOr[WordSpacingProperty[TLength]] = js.native
  
  var `writing-mode`: js.UndefOr[WritingModeProperty] = js.native
}
object SvgPropertiesHyphen {
  
  @scala.inline
  def apply[TLength](): SvgPropertiesHyphen[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgPropertiesHyphen[TLength]]
  }
  
  @scala.inline
  implicit class SvgPropertiesHyphenOps[Self <: SvgPropertiesHyphen[_], TLength] (val x: Self with SvgPropertiesHyphen[TLength]) extends AnyVal {
    
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
    def `setAlignment-baseline`(value: AlignmentBaselineProperty): Self = this.set("alignment-baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAlignment-baseline`: Self = this.set("alignment-baseline", js.undefined)
    
    @scala.inline
    def `setBaseline-shift`(value: BaselineShiftProperty[TLength]): Self = this.set("baseline-shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBaseline-shift`: Self = this.set("baseline-shift", js.undefined)
    
    @scala.inline
    def setClip(value: ClipProperty): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def `setClip-path`(value: ClipPathProperty): Self = this.set("clip-path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteClip-path`: Self = this.set("clip-path", js.undefined)
    
    @scala.inline
    def `setClip-rule`(value: ClipRuleProperty): Self = this.set("clip-rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteClip-rule`: Self = this.set("clip-rule", js.undefined)
    
    @scala.inline
    def setColor(value: ColorProperty): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def `setColor-interpolation`(value: ColorInterpolationProperty): Self = this.set("color-interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteColor-interpolation`: Self = this.set("color-interpolation", js.undefined)
    
    @scala.inline
    def `setColor-rendering`(value: ColorRenderingProperty): Self = this.set("color-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteColor-rendering`: Self = this.set("color-rendering", js.undefined)
    
    @scala.inline
    def setCursor(value: CursorProperty): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDirection(value: DirectionProperty): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: DisplayProperty): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def `setDominant-baseline`(value: DominantBaselineProperty): Self = this.set("dominant-baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDominant-baseline`: Self = this.set("dominant-baseline", js.undefined)
    
    @scala.inline
    def setFill(value: FillProperty): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def `setFill-opacity`(value: GlobalsNumber): Self = this.set("fill-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-opacity`: Self = this.set("fill-opacity", js.undefined)
    
    @scala.inline
    def `setFill-rule`(value: FillRuleProperty): Self = this.set("fill-rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFill-rule`: Self = this.set("fill-rule", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterProperty): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def `setFlood-color`(value: FloodColorProperty): Self = this.set("flood-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFlood-color`: Self = this.set("flood-color", js.undefined)
    
    @scala.inline
    def `setFlood-opacity`(value: GlobalsNumber): Self = this.set("flood-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFlood-opacity`: Self = this.set("flood-opacity", js.undefined)
    
    @scala.inline
    def setFont(value: FontProperty): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def `setFont-family`(value: FontFamilyProperty): Self = this.set("font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    
    @scala.inline
    def `setFont-size`(value: FontSizeProperty[TLength]): Self = this.set("font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-size`: Self = this.set("font-size", js.undefined)
    
    @scala.inline
    def `setFont-size-adjust`(value: FontSizeAdjustProperty): Self = this.set("font-size-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-size-adjust`: Self = this.set("font-size-adjust", js.undefined)
    
    @scala.inline
    def `setFont-stretch`(value: FontStretchProperty): Self = this.set("font-stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-stretch`: Self = this.set("font-stretch", js.undefined)
    
    @scala.inline
    def `setFont-style`(value: FontStyleProperty): Self = this.set("font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    
    @scala.inline
    def `setFont-variant`(value: FontVariantProperty): Self = this.set("font-variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-variant`: Self = this.set("font-variant", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: FontWeightProperty): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    
    @scala.inline
    def `setGlyph-orientation-vertical`(value: GlyphOrientationVerticalProperty): Self = this.set("glyph-orientation-vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGlyph-orientation-vertical`: Self = this.set("glyph-orientation-vertical", js.undefined)
    
    @scala.inline
    def `setImage-rendering`(value: ImageRenderingProperty): Self = this.set("image-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteImage-rendering`: Self = this.set("image-rendering", js.undefined)
    
    @scala.inline
    def `setLetter-spacing`(value: LetterSpacingProperty[TLength]): Self = this.set("letter-spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLetter-spacing`: Self = this.set("letter-spacing", js.undefined)
    
    @scala.inline
    def `setLighting-color`(value: LightingColorProperty): Self = this.set("lighting-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLighting-color`: Self = this.set("lighting-color", js.undefined)
    
    @scala.inline
    def `setLine-height`(value: LineHeightProperty[TLength]): Self = this.set("line-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLine-height`: Self = this.set("line-height", js.undefined)
    
    @scala.inline
    def setMarker(value: MarkerProperty): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def `setMarker-end`(value: MarkerEndProperty): Self = this.set("marker-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMarker-end`: Self = this.set("marker-end", js.undefined)
    
    @scala.inline
    def `setMarker-mid`(value: MarkerMidProperty): Self = this.set("marker-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMarker-mid`: Self = this.set("marker-mid", js.undefined)
    
    @scala.inline
    def `setMarker-start`(value: MarkerStartProperty): Self = this.set("marker-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMarker-start`: Self = this.set("marker-start", js.undefined)
    
    @scala.inline
    def setMask(value: MaskProperty[TLength]): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setOpacity(value: OpacityProperty): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOverflow(value: OverflowProperty): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def `setPaint-order`(value: PaintOrderProperty): Self = this.set("paint-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePaint-order`: Self = this.set("paint-order", js.undefined)
    
    @scala.inline
    def `setPointer-events`(value: PointerEventsProperty): Self = this.set("pointer-events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePointer-events`: Self = this.set("pointer-events", js.undefined)
    
    @scala.inline
    def `setShape-rendering`(value: ShapeRenderingProperty): Self = this.set("shape-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteShape-rendering`: Self = this.set("shape-rendering", js.undefined)
    
    @scala.inline
    def `setStop-color`(value: StopColorProperty): Self = this.set("stop-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStop-color`: Self = this.set("stop-color", js.undefined)
    
    @scala.inline
    def `setStop-opacity`(value: GlobalsNumber): Self = this.set("stop-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStop-opacity`: Self = this.set("stop-opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: StrokeProperty): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def `setStroke-dasharray`(value: StrokeDasharrayProperty[TLength]): Self = this.set("stroke-dasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-dasharray`: Self = this.set("stroke-dasharray", js.undefined)
    
    @scala.inline
    def `setStroke-dashoffset`(value: StrokeDashoffsetProperty[TLength]): Self = this.set("stroke-dashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-dashoffset`: Self = this.set("stroke-dashoffset", js.undefined)
    
    @scala.inline
    def `setStroke-linecap`(value: StrokeLinecapProperty): Self = this.set("stroke-linecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-linecap`: Self = this.set("stroke-linecap", js.undefined)
    
    @scala.inline
    def `setStroke-linejoin`(value: StrokeLinejoinProperty): Self = this.set("stroke-linejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-linejoin`: Self = this.set("stroke-linejoin", js.undefined)
    
    @scala.inline
    def `setStroke-miterlimit`(value: GlobalsNumber): Self = this.set("stroke-miterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-miterlimit`: Self = this.set("stroke-miterlimit", js.undefined)
    
    @scala.inline
    def `setStroke-opacity`(value: GlobalsNumber): Self = this.set("stroke-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-opacity`: Self = this.set("stroke-opacity", js.undefined)
    
    @scala.inline
    def `setStroke-width`(value: StrokeWidthProperty[TLength]): Self = this.set("stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStroke-width`: Self = this.set("stroke-width", js.undefined)
    
    @scala.inline
    def `setText-anchor`(value: TextAnchorProperty): Self = this.set("text-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-anchor`: Self = this.set("text-anchor", js.undefined)
    
    @scala.inline
    def `setText-decoration`(value: TextDecorationProperty[TLength]): Self = this.set("text-decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-decoration`: Self = this.set("text-decoration", js.undefined)
    
    @scala.inline
    def `setText-rendering`(value: TextRenderingProperty): Self = this.set("text-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-rendering`: Self = this.set("text-rendering", js.undefined)
    
    @scala.inline
    def `setUnicode-bidi`(value: UnicodeBidiProperty): Self = this.set("unicode-bidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUnicode-bidi`: Self = this.set("unicode-bidi", js.undefined)
    
    @scala.inline
    def `setVector-effect`(value: VectorEffectProperty): Self = this.set("vector-effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteVector-effect`: Self = this.set("vector-effect", js.undefined)
    
    @scala.inline
    def setVisibility(value: VisibilityProperty): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def `setWhite-space`(value: WhiteSpaceProperty): Self = this.set("white-space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteWhite-space`: Self = this.set("white-space", js.undefined)
    
    @scala.inline
    def `setWord-spacing`(value: WordSpacingProperty[TLength]): Self = this.set("word-spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteWord-spacing`: Self = this.set("word-spacing", js.undefined)
    
    @scala.inline
    def `setWriting-mode`(value: WritingModeProperty): Self = this.set("writing-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteWriting-mode`: Self = this.set("writing-mode", js.undefined)
  }
}
