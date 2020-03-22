package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.`no-repeat`
import typings.cytoscape.cytoscapeStrings.`repeat-x`
import typings.cytoscape.cytoscapeStrings.`repeat-y`
import typings.cytoscape.cytoscapeStrings.bottom
import typings.cytoscape.cytoscapeStrings.center
import typings.cytoscape.cytoscapeStrings.clipped
import typings.cytoscape.cytoscapeStrings.contain
import typings.cytoscape.cytoscapeStrings.cover
import typings.cytoscape.cytoscapeStrings.displayed
import typings.cytoscape.cytoscapeStrings.ellipsis
import typings.cytoscape.cytoscapeStrings.left
import typings.cytoscape.cytoscapeStrings.no
import typings.cytoscape.cytoscapeStrings.none
import typings.cytoscape.cytoscapeStrings.rectangle
import typings.cytoscape.cytoscapeStrings.repeat
import typings.cytoscape.cytoscapeStrings.right
import typings.cytoscape.cytoscapeStrings.roundrectangle
import typings.cytoscape.cytoscapeStrings.top
import typings.cytoscape.cytoscapeStrings.visible
import typings.cytoscape.cytoscapeStrings.wrap
import typings.cytoscape.cytoscapeStrings.yes
import typings.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#style/node-body
  */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Overlay> */
/* Inlined parent cytoscape.cytoscape.Css.PaddingNode */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Labels<cytoscape.cytoscape.NodeSingular>> */
/* Inlined parent cytoscape.cytoscape.Css.BackgroundImage */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Ghost> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Visibility<cytoscape.cytoscape.NodeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.PieChartBackground> */
trait Node extends js.Object {
  /**
    * Blackens the node’s body for values from 0 to 1;
    * whitens the node’s body for values from 0 to -1.
    */
  var `background-blacken`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  /**
    * How background image clipping is handled;
    * may be node for clipped to node shape or none for no clipping.
    */
  var `background-clip`: js.UndefOr[PropertyValueNode[clipped | none]] = js.undefined
  /**
    * The colour of the node’s body.
    */
  var `background-color`: js.UndefOr[PropertyValueNode[Colour]] = js.undefined
  /**
    * How the background image is fit to the node;
    * may be none for original size,
    * contain to fit inside node,
    * or cover to cover the node.
    */
  var `background-fit`: js.UndefOr[PropertyValueNode[none | contain | cover]] = js.undefined
  /**
    * Specifies the height of the image.
    * A percent value (e.g. 50%) may be used to set the image
    * height relative to the node height.
    * If used in combination with background- fit,
    * then this value overrides the height of the image in calculating
    * the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the height of the image.
    */
  var `background-height`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  /**
    * The URL that points to the image that should be used as the node’s background.
    * PNG, JPG, and SVG are supported formats.
    * You may use a data URI to use embedded images,
    * thereby saving a HTTP request.
    */
  var `background-image`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  /**
    * The opacity of the background image. [0 1]
    */
  var `background-image-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  /**
    * The opacity level of the node’s background colour.
    */
  var `background-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  /**
    * The x position of the background image,
    * measured in percent(e.g. 50%) or pixels (e.g. 10px).
    */
  var `background-position-x`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  /**
    * The y position of the background image,
    * measured in percent(e.g. 50%) or pixels (e.g. 10px).
    */
  var `background-position-y`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  /**
    * Whether to repeat the background image;
    * may be no-repeat, repeat-x, repeat-y, or repeat.
    */
  var `background-repeat`: js.UndefOr[PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat]] = js.undefined
  /**
    * Specifies the width of the image.
    * A percent value (e.g. 50%) may be used to set
    * the image width relative to the node width.
    * If used in combination with background- fit,
    * then this value overrides the width of the image
    * in calculating the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the width of the image.
    */
  var `background-width`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  var backgroundColor: js.UndefOr[PropertyValueNode[Colour]] = js.undefined
  /**
    * The colour of the node’s border.
    */
  var `border-color`: js.UndefOr[PropertyValueNode[Colour]] = js.undefined
  /**
    * The opacity of the node’s border.
    * A value between [0 1].
    */
  var `border-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  /**
    * The style of the node’s border.
    */
  var `border-style`: js.UndefOr[PropertyValueNode[LineStyle]] = js.undefined
  /**
    * The size of the node’s border.
    */
  var `border-width`: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  var color: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.undefined
  /**
    * The CSS content field
    */
  var content: js.UndefOr[PropertyValueNode[String]] = js.undefined
  var display: js.UndefOr[PropertyValue[NodeSingular, none | displayed]] = js.undefined
  var `font-family`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.undefined
  var `font-size`: js.UndefOr[PropertyValue[NodeSingular, Double | String]] = js.undefined
  var `font-style`: js.UndefOr[PropertyValue[NodeSingular, FontStyle]] = js.undefined
  var `font-weight`: js.UndefOr[PropertyValue[NodeSingular, FontWeight]] = js.undefined
  var ghost: js.UndefOr[PropertyValueNode[yes | no]] = js.undefined
  var `ghost-offset-x`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  var `ghost-offset-y`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  var `ghost-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  /**
    * The height of the node’s body.
    * This property can take on the special value label
    * so the height is automatically based on the node’s label.
    */
  var height: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  var label: js.UndefOr[PropertyValue[NodeSingular, String]] = js.undefined
  var `min-zoomed-font-size`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var opacity: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `overlay-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.undefined
  var `overlay-opacity`: js.UndefOr[PropertyValueEdge[Double]] = js.undefined
  var `overlay-padding`: js.UndefOr[PropertyValueEdge[Double | String]] = js.undefined
  var `padding-bottom`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  var `padding-left`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  var `padding-right`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  var `padding-top`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  var `pie-i-background-color`: js.UndefOr[PropertyValueNode[Colour]] = js.undefined
  var `pie-i-background-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  var `pie-i-background-size`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  var `pie-size`: js.UndefOr[PropertyValueNode[String]] = js.undefined
  /**
    * The shape of the node’s body.
    */
  var shape: js.UndefOr[PropertyValueNode[NodeShape]] = js.undefined
  var `shape-polygon-points`: js.UndefOr[PropertyValueNode[ShapePolygonPoints]] = js.undefined
  var `source-label`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.undefined
  var `source-text-margin-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `source-text-margin-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `source-text-offset`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `source-text-rotation`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `target-label`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.undefined
  var `target-text-margin-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `target-text-margin-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `target-text-offset`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `target-text-rotation`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-background-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.undefined
  var `text-background-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-background-padding`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.undefined
  var `text-background-shape`: js.UndefOr[PropertyValue[NodeSingular, rectangle | roundrectangle]] = js.undefined
  var `text-border-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.undefined
  var `text-border-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-border-style`: js.UndefOr[PropertyValue[NodeSingular, LineStyle]] = js.undefined
  var `text-border-width`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-events`: js.UndefOr[PropertyValue[NodeSingular, yes | no]] = js.undefined
  var `text-halign`: js.UndefOr[PropertyValue[NodeSingular, left | center | right]] = js.undefined
  var `text-margin-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-margin-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-max-width`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.undefined
  var `text-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-outline-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.undefined
  var `text-outline-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-outline-width`: js.UndefOr[PropertyValue[NodeSingular, Double | String]] = js.undefined
  var `text-rotation`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-shadow-blur`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-shadow-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.undefined
  var `text-shadow-offset-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-shadow-offset-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-shadow-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
  var `text-transform`: js.UndefOr[PropertyValue[NodeSingular, TextTranformation]] = js.undefined
  var `text-valign`: js.UndefOr[PropertyValue[NodeSingular, top | center | bottom]] = js.undefined
  var `text-wrap`: js.UndefOr[PropertyValue[NodeSingular, none | wrap | ellipsis]] = js.undefined
  var visibility: js.UndefOr[PropertyValue[NodeSingular, none | visible]] = js.undefined
  /**
    * The width of the node’s body.
    * This property can take on the special value label
    * so the width is automatically based on the node’s label.
    */
  var width: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  var `z-index`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    `background-blacken`: PropertyValueNode[Double] = null,
    `background-clip`: PropertyValueNode[clipped | none] = null,
    `background-color`: PropertyValueNode[Colour] = null,
    `background-fit`: PropertyValueNode[none | contain | cover] = null,
    `background-height`: PropertyValueNode[Double | String] = null,
    `background-image`: PropertyValueNode[String] = null,
    `background-image-opacity`: PropertyValueNode[Double] = null,
    `background-opacity`: PropertyValueNode[Double] = null,
    `background-position-x`: PropertyValueNode[Double | String] = null,
    `background-position-y`: PropertyValueNode[Double | String] = null,
    `background-repeat`: PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat] = null,
    `background-width`: PropertyValueNode[Double | String] = null,
    backgroundColor: PropertyValueNode[Colour] = null,
    `border-color`: PropertyValueNode[Colour] = null,
    `border-opacity`: PropertyValueNode[Double] = null,
    `border-style`: PropertyValueNode[LineStyle] = null,
    `border-width`: PropertyValueNode[Double | String] = null,
    color: PropertyValue[NodeSingular, Colour] = null,
    content: PropertyValueNode[String] = null,
    display: PropertyValue[NodeSingular, none | displayed] = null,
    `font-family`: PropertyValue[NodeSingular, String] = null,
    `font-size`: PropertyValue[NodeSingular, Double | String] = null,
    `font-style`: PropertyValue[NodeSingular, FontStyle] = null,
    `font-weight`: PropertyValue[NodeSingular, FontWeight] = null,
    ghost: PropertyValueNode[yes | no] = null,
    `ghost-offset-x`: PropertyValueNode[Double] = null,
    `ghost-offset-y`: PropertyValueNode[Double] = null,
    `ghost-opacity`: PropertyValueNode[Double] = null,
    height: PropertyValueNode[Double | String] = null,
    label: PropertyValue[NodeSingular, String] = null,
    `min-zoomed-font-size`: PropertyValue[NodeSingular, Double] = null,
    opacity: PropertyValue[NodeSingular, Double] = null,
    `overlay-color`: PropertyValueEdge[Colour] = null,
    `overlay-opacity`: PropertyValueEdge[Double] = null,
    `overlay-padding`: PropertyValueEdge[Double | String] = null,
    `padding-bottom`: PropertyValueNode[String] = null,
    `padding-left`: PropertyValueNode[String] = null,
    `padding-right`: PropertyValueNode[String] = null,
    `padding-top`: PropertyValueNode[String] = null,
    `pie-i-background-color`: PropertyValueNode[Colour] = null,
    `pie-i-background-opacity`: PropertyValueNode[Double] = null,
    `pie-i-background-size`: PropertyValueNode[Double] = null,
    `pie-size`: PropertyValueNode[String] = null,
    shape: PropertyValueNode[NodeShape] = null,
    `shape-polygon-points`: PropertyValueNode[ShapePolygonPoints] = null,
    `source-label`: PropertyValue[NodeSingular, String] = null,
    `source-text-margin-x`: PropertyValue[NodeSingular, Double] = null,
    `source-text-margin-y`: PropertyValue[NodeSingular, Double] = null,
    `source-text-offset`: PropertyValue[NodeSingular, Double] = null,
    `source-text-rotation`: PropertyValue[NodeSingular, Double] = null,
    `target-label`: PropertyValue[NodeSingular, String] = null,
    `target-text-margin-x`: PropertyValue[NodeSingular, Double] = null,
    `target-text-margin-y`: PropertyValue[NodeSingular, Double] = null,
    `target-text-offset`: PropertyValue[NodeSingular, Double] = null,
    `target-text-rotation`: PropertyValue[NodeSingular, Double] = null,
    `text-background-color`: PropertyValue[NodeSingular, Colour] = null,
    `text-background-opacity`: PropertyValue[NodeSingular, Double] = null,
    `text-background-padding`: PropertyValue[NodeSingular, String] = null,
    `text-background-shape`: PropertyValue[NodeSingular, rectangle | roundrectangle] = null,
    `text-border-color`: PropertyValue[NodeSingular, Colour] = null,
    `text-border-opacity`: PropertyValue[NodeSingular, Double] = null,
    `text-border-style`: PropertyValue[NodeSingular, LineStyle] = null,
    `text-border-width`: PropertyValue[NodeSingular, Double] = null,
    `text-events`: PropertyValue[NodeSingular, yes | no] = null,
    `text-halign`: PropertyValue[NodeSingular, left | center | right] = null,
    `text-margin-x`: PropertyValue[NodeSingular, Double] = null,
    `text-margin-y`: PropertyValue[NodeSingular, Double] = null,
    `text-max-width`: PropertyValue[NodeSingular, String] = null,
    `text-opacity`: PropertyValue[NodeSingular, Double] = null,
    `text-outline-color`: PropertyValue[NodeSingular, Colour] = null,
    `text-outline-opacity`: PropertyValue[NodeSingular, Double] = null,
    `text-outline-width`: PropertyValue[NodeSingular, Double | String] = null,
    `text-rotation`: PropertyValue[NodeSingular, Double] = null,
    `text-shadow-blur`: PropertyValue[NodeSingular, Double] = null,
    `text-shadow-color`: PropertyValue[NodeSingular, Colour] = null,
    `text-shadow-offset-x`: PropertyValue[NodeSingular, Double] = null,
    `text-shadow-offset-y`: PropertyValue[NodeSingular, Double] = null,
    `text-shadow-opacity`: PropertyValue[NodeSingular, Double] = null,
    `text-transform`: PropertyValue[NodeSingular, TextTranformation] = null,
    `text-valign`: PropertyValue[NodeSingular, top | center | bottom] = null,
    `text-wrap`: PropertyValue[NodeSingular, none | wrap | ellipsis] = null,
    visibility: PropertyValue[NodeSingular, none | visible] = null,
    width: PropertyValueNode[Double | String] = null,
    `z-index`: PropertyValue[NodeSingular, Double] = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    if (`background-blacken` != null) __obj.updateDynamic("background-blacken")(`background-blacken`.asInstanceOf[js.Any])
    if (`background-clip` != null) __obj.updateDynamic("background-clip")(`background-clip`.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`background-fit` != null) __obj.updateDynamic("background-fit")(`background-fit`.asInstanceOf[js.Any])
    if (`background-height` != null) __obj.updateDynamic("background-height")(`background-height`.asInstanceOf[js.Any])
    if (`background-image` != null) __obj.updateDynamic("background-image")(`background-image`.asInstanceOf[js.Any])
    if (`background-image-opacity` != null) __obj.updateDynamic("background-image-opacity")(`background-image-opacity`.asInstanceOf[js.Any])
    if (`background-opacity` != null) __obj.updateDynamic("background-opacity")(`background-opacity`.asInstanceOf[js.Any])
    if (`background-position-x` != null) __obj.updateDynamic("background-position-x")(`background-position-x`.asInstanceOf[js.Any])
    if (`background-position-y` != null) __obj.updateDynamic("background-position-y")(`background-position-y`.asInstanceOf[js.Any])
    if (`background-repeat` != null) __obj.updateDynamic("background-repeat")(`background-repeat`.asInstanceOf[js.Any])
    if (`background-width` != null) __obj.updateDynamic("background-width")(`background-width`.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (`border-color` != null) __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    if (`border-opacity` != null) __obj.updateDynamic("border-opacity")(`border-opacity`.asInstanceOf[js.Any])
    if (`border-style` != null) __obj.updateDynamic("border-style")(`border-style`.asInstanceOf[js.Any])
    if (`border-width` != null) __obj.updateDynamic("border-width")(`border-width`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (`font-style` != null) __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (ghost != null) __obj.updateDynamic("ghost")(ghost.asInstanceOf[js.Any])
    if (`ghost-offset-x` != null) __obj.updateDynamic("ghost-offset-x")(`ghost-offset-x`.asInstanceOf[js.Any])
    if (`ghost-offset-y` != null) __obj.updateDynamic("ghost-offset-y")(`ghost-offset-y`.asInstanceOf[js.Any])
    if (`ghost-opacity` != null) __obj.updateDynamic("ghost-opacity")(`ghost-opacity`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (`min-zoomed-font-size` != null) __obj.updateDynamic("min-zoomed-font-size")(`min-zoomed-font-size`.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (`overlay-color` != null) __obj.updateDynamic("overlay-color")(`overlay-color`.asInstanceOf[js.Any])
    if (`overlay-opacity` != null) __obj.updateDynamic("overlay-opacity")(`overlay-opacity`.asInstanceOf[js.Any])
    if (`overlay-padding` != null) __obj.updateDynamic("overlay-padding")(`overlay-padding`.asInstanceOf[js.Any])
    if (`padding-bottom` != null) __obj.updateDynamic("padding-bottom")(`padding-bottom`.asInstanceOf[js.Any])
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    if (`padding-top` != null) __obj.updateDynamic("padding-top")(`padding-top`.asInstanceOf[js.Any])
    if (`pie-i-background-color` != null) __obj.updateDynamic("pie-i-background-color")(`pie-i-background-color`.asInstanceOf[js.Any])
    if (`pie-i-background-opacity` != null) __obj.updateDynamic("pie-i-background-opacity")(`pie-i-background-opacity`.asInstanceOf[js.Any])
    if (`pie-i-background-size` != null) __obj.updateDynamic("pie-i-background-size")(`pie-i-background-size`.asInstanceOf[js.Any])
    if (`pie-size` != null) __obj.updateDynamic("pie-size")(`pie-size`.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (`shape-polygon-points` != null) __obj.updateDynamic("shape-polygon-points")(`shape-polygon-points`.asInstanceOf[js.Any])
    if (`source-label` != null) __obj.updateDynamic("source-label")(`source-label`.asInstanceOf[js.Any])
    if (`source-text-margin-x` != null) __obj.updateDynamic("source-text-margin-x")(`source-text-margin-x`.asInstanceOf[js.Any])
    if (`source-text-margin-y` != null) __obj.updateDynamic("source-text-margin-y")(`source-text-margin-y`.asInstanceOf[js.Any])
    if (`source-text-offset` != null) __obj.updateDynamic("source-text-offset")(`source-text-offset`.asInstanceOf[js.Any])
    if (`source-text-rotation` != null) __obj.updateDynamic("source-text-rotation")(`source-text-rotation`.asInstanceOf[js.Any])
    if (`target-label` != null) __obj.updateDynamic("target-label")(`target-label`.asInstanceOf[js.Any])
    if (`target-text-margin-x` != null) __obj.updateDynamic("target-text-margin-x")(`target-text-margin-x`.asInstanceOf[js.Any])
    if (`target-text-margin-y` != null) __obj.updateDynamic("target-text-margin-y")(`target-text-margin-y`.asInstanceOf[js.Any])
    if (`target-text-offset` != null) __obj.updateDynamic("target-text-offset")(`target-text-offset`.asInstanceOf[js.Any])
    if (`target-text-rotation` != null) __obj.updateDynamic("target-text-rotation")(`target-text-rotation`.asInstanceOf[js.Any])
    if (`text-background-color` != null) __obj.updateDynamic("text-background-color")(`text-background-color`.asInstanceOf[js.Any])
    if (`text-background-opacity` != null) __obj.updateDynamic("text-background-opacity")(`text-background-opacity`.asInstanceOf[js.Any])
    if (`text-background-padding` != null) __obj.updateDynamic("text-background-padding")(`text-background-padding`.asInstanceOf[js.Any])
    if (`text-background-shape` != null) __obj.updateDynamic("text-background-shape")(`text-background-shape`.asInstanceOf[js.Any])
    if (`text-border-color` != null) __obj.updateDynamic("text-border-color")(`text-border-color`.asInstanceOf[js.Any])
    if (`text-border-opacity` != null) __obj.updateDynamic("text-border-opacity")(`text-border-opacity`.asInstanceOf[js.Any])
    if (`text-border-style` != null) __obj.updateDynamic("text-border-style")(`text-border-style`.asInstanceOf[js.Any])
    if (`text-border-width` != null) __obj.updateDynamic("text-border-width")(`text-border-width`.asInstanceOf[js.Any])
    if (`text-events` != null) __obj.updateDynamic("text-events")(`text-events`.asInstanceOf[js.Any])
    if (`text-halign` != null) __obj.updateDynamic("text-halign")(`text-halign`.asInstanceOf[js.Any])
    if (`text-margin-x` != null) __obj.updateDynamic("text-margin-x")(`text-margin-x`.asInstanceOf[js.Any])
    if (`text-margin-y` != null) __obj.updateDynamic("text-margin-y")(`text-margin-y`.asInstanceOf[js.Any])
    if (`text-max-width` != null) __obj.updateDynamic("text-max-width")(`text-max-width`.asInstanceOf[js.Any])
    if (`text-opacity` != null) __obj.updateDynamic("text-opacity")(`text-opacity`.asInstanceOf[js.Any])
    if (`text-outline-color` != null) __obj.updateDynamic("text-outline-color")(`text-outline-color`.asInstanceOf[js.Any])
    if (`text-outline-opacity` != null) __obj.updateDynamic("text-outline-opacity")(`text-outline-opacity`.asInstanceOf[js.Any])
    if (`text-outline-width` != null) __obj.updateDynamic("text-outline-width")(`text-outline-width`.asInstanceOf[js.Any])
    if (`text-rotation` != null) __obj.updateDynamic("text-rotation")(`text-rotation`.asInstanceOf[js.Any])
    if (`text-shadow-blur` != null) __obj.updateDynamic("text-shadow-blur")(`text-shadow-blur`.asInstanceOf[js.Any])
    if (`text-shadow-color` != null) __obj.updateDynamic("text-shadow-color")(`text-shadow-color`.asInstanceOf[js.Any])
    if (`text-shadow-offset-x` != null) __obj.updateDynamic("text-shadow-offset-x")(`text-shadow-offset-x`.asInstanceOf[js.Any])
    if (`text-shadow-offset-y` != null) __obj.updateDynamic("text-shadow-offset-y")(`text-shadow-offset-y`.asInstanceOf[js.Any])
    if (`text-shadow-opacity` != null) __obj.updateDynamic("text-shadow-opacity")(`text-shadow-opacity`.asInstanceOf[js.Any])
    if (`text-transform` != null) __obj.updateDynamic("text-transform")(`text-transform`.asInstanceOf[js.Any])
    if (`text-valign` != null) __obj.updateDynamic("text-valign")(`text-valign`.asInstanceOf[js.Any])
    if (`text-wrap` != null) __obj.updateDynamic("text-wrap")(`text-wrap`.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (`z-index` != null) __obj.updateDynamic("z-index")(`z-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

