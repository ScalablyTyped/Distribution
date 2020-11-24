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
import typings.cytoscape.cytoscapeStrings.hidden
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
import typings.cytoscape.mod.EdgeSingular
import typings.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.Events<cytoscape.cytoscape.NodeSingular>> */
/* Inlined parent std.Partial<cytoscape.cytoscape.Css.TransitionAnimation> */
@js.native
trait Node extends js.Object {
  
  /**
    * Blackens the node’s body for values from 0 to 1;
    * whitens the node’s body for values from 0 to -1.
    */
  var `background-blacken`: js.UndefOr[PropertyValueNode[Double]] = js.native
  
  /**
    * How background image clipping is handled;
    * may be node for clipped to node shape or none for no clipping.
    */
  var `background-clip`: js.UndefOr[PropertyValueNode[clipped | none]] = js.native
  
  /**
    * The colour of the node’s body.
    */
  var `background-color`: js.UndefOr[PropertyValueNode[Colour]] = js.native
  
  /**
    * How the background image is fit to the node;
    * may be none for original size,
    * contain to fit inside node,
    * or cover to cover the node.
    */
  var `background-fit`: js.UndefOr[PropertyValueNode[none | contain | cover]] = js.native
  
  /**
    * Specifies the height of the image.
    * A percent value (e.g. 50%) may be used to set the image
    * height relative to the node height.
    * If used in combination with background- fit,
    * then this value overrides the height of the image in calculating
    * the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the height of the image.
    */
  var `background-height`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  
  /**
    * The URL that points to the image that should be used as the node’s background.
    * PNG, JPG, and SVG are supported formats.
    * You may use a data URI to use embedded images,
    * thereby saving a HTTP request.
    */
  var `background-image`: js.UndefOr[PropertyValueNode[String]] = js.native
  
  /**
    * The opacity of the background image. [0 1]
    */
  var `background-image-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.native
  
  /**
    * The opacity level of the node’s background colour.
    */
  var `background-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.native
  
  /**
    * The x position of the background image,
    * measured in percent(e.g. 50%) or pixels (e.g. 10px).
    */
  var `background-position-x`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  
  /**
    * The y position of the background image,
    * measured in percent(e.g. 50%) or pixels (e.g. 10px).
    */
  var `background-position-y`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  
  /**
    * Whether to repeat the background image;
    * may be no-repeat, repeat-x, repeat-y, or repeat.
    */
  var `background-repeat`: js.UndefOr[PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat]] = js.native
  
  /**
    * Specifies the width of the image.
    * A percent value (e.g. 50%) may be used to set
    * the image width relative to the node width.
    * If used in combination with background- fit,
    * then this value overrides the width of the image
    * in calculating the fitting — thereby overriding the aspect ratio.
    * The auto value is used by default, which uses the width of the image.
    */
  var `background-width`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  
  var backgroundColor: js.UndefOr[PropertyValueNode[Colour]] = js.native
  
  /**
    * The colour of the node’s border.
    */
  var `border-color`: js.UndefOr[PropertyValueNode[Colour]] = js.native
  
  /**
    * The opacity of the node’s border.
    * A value between [0 1].
    */
  var `border-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.native
  
  /**
    * The style of the node’s border.
    */
  var `border-style`: js.UndefOr[PropertyValueNode[LineStyle]] = js.native
  
  /**
    * The size of the node’s border.
    */
  var `border-width`: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  
  var color: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.native
  
  /**
    * The CSS content field
    */
  var content: js.UndefOr[PropertyValueNode[String]] = js.native
  
  var display: js.UndefOr[PropertyValue[NodeSingular, none | displayed]] = js.native
  
  var events: js.UndefOr[PropertyValue[NodeSingular, yes | no]] = js.native
  
  var `font-family`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  
  var `font-size`: js.UndefOr[PropertyValue[NodeSingular, Double | String]] = js.native
  
  var `font-style`: js.UndefOr[PropertyValue[NodeSingular, FontStyle]] = js.native
  
  var `font-weight`: js.UndefOr[PropertyValue[NodeSingular, FontWeight]] = js.native
  
  var ghost: js.UndefOr[PropertyValueNode[yes | no]] = js.native
  
  var `ghost-offset-x`: js.UndefOr[PropertyValueNode[Double]] = js.native
  
  var `ghost-offset-y`: js.UndefOr[PropertyValueNode[Double]] = js.native
  
  var `ghost-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.native
  
  /**
    * The height of the node’s body.
    * This property can take on the special value label
    * so the height is automatically based on the node’s label.
    */
  var height: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  
  var label: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  
  var `min-zoomed-font-size`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var opacity: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `overlay-color`: js.UndefOr[PropertyValueEdge[Colour]] = js.native
  
  var `overlay-opacity`: js.UndefOr[PropertyValueEdge[Double]] = js.native
  
  var `overlay-padding`: js.UndefOr[PropertyValueEdge[Double | String]] = js.native
  
  var `padding-bottom`: js.UndefOr[PropertyValueNode[String]] = js.native
  
  var `padding-left`: js.UndefOr[PropertyValueNode[String]] = js.native
  
  var `padding-right`: js.UndefOr[PropertyValueNode[String]] = js.native
  
  var `padding-top`: js.UndefOr[PropertyValueNode[String]] = js.native
  
  var `pie-i-background-color`: js.UndefOr[PropertyValueNode[Colour]] = js.native
  
  var `pie-i-background-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.native
  
  var `pie-i-background-size`: js.UndefOr[PropertyValueNode[Double]] = js.native
  
  var `pie-size`: js.UndefOr[PropertyValueNode[String]] = js.native
  
  /**
    * The shape of the node’s body.
    */
  var shape: js.UndefOr[PropertyValueNode[NodeShape]] = js.native
  
  var `shape-polygon-points`: js.UndefOr[PropertyValueNode[ShapePolygonPoints]] = js.native
  
  var `source-label`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  
  var `source-text-margin-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `source-text-margin-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `source-text-offset`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `source-text-rotation`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `target-label`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  
  var `target-text-margin-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `target-text-margin-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `target-text-offset`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `target-text-rotation`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-background-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.native
  
  var `text-background-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-background-padding`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  
  var `text-background-shape`: js.UndefOr[PropertyValue[NodeSingular, rectangle | roundrectangle]] = js.native
  
  var `text-border-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.native
  
  var `text-border-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-border-style`: js.UndefOr[PropertyValue[NodeSingular, LineStyle]] = js.native
  
  var `text-border-width`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-events`: js.UndefOr[PropertyValue[NodeSingular, yes | no]] = js.native
  
  var `text-halign`: js.UndefOr[PropertyValue[NodeSingular, left | center | right]] = js.native
  
  var `text-margin-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-margin-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-max-width`: js.UndefOr[PropertyValue[NodeSingular, String]] = js.native
  
  var `text-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-outline-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.native
  
  var `text-outline-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-outline-width`: js.UndefOr[PropertyValue[NodeSingular, Double | String]] = js.native
  
  var `text-rotation`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-shadow-blur`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-shadow-color`: js.UndefOr[PropertyValue[NodeSingular, Colour]] = js.native
  
  var `text-shadow-offset-x`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-shadow-offset-y`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-shadow-opacity`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
  
  var `text-transform`: js.UndefOr[PropertyValue[NodeSingular, TextTranformation]] = js.native
  
  var `text-valign`: js.UndefOr[PropertyValue[NodeSingular, top | center | bottom]] = js.native
  
  var `text-wrap`: js.UndefOr[PropertyValue[NodeSingular, none | wrap | ellipsis]] = js.native
  
  var `transition-delay`: js.UndefOr[Double] = js.native
  
  var `transition-duration`: js.UndefOr[Double] = js.native
  
  var `transition-property`: js.UndefOr[String] = js.native
  
  var `transition-timing-function`: js.UndefOr[TransitionTimingFunction] = js.native
  
  var visibility: js.UndefOr[PropertyValue[NodeSingular, hidden | visible]] = js.native
  
  /**
    * The width of the node’s body.
    * This property can take on the special value label
    * so the width is automatically based on the node’s label.
    */
  var width: js.UndefOr[PropertyValueNode[Double | String]] = js.native
  
  var `z-index`: js.UndefOr[PropertyValue[NodeSingular, Double]] = js.native
}
object Node {
  
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
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
    def `setBackground-blackenFunction1`(value: NodeSingular => Double): Self = this.set("background-blacken", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-blacken`(value: PropertyValueNode[Double]): Self = this.set("background-blacken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-blacken`: Self = this.set("background-blacken", js.undefined)
    
    @scala.inline
    def `setBackground-clipFunction1`(value: NodeSingular => clipped | none): Self = this.set("background-clip", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-clip`(value: PropertyValueNode[clipped | none]): Self = this.set("background-clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-clip`: Self = this.set("background-clip", js.undefined)
    
    @scala.inline
    def `setBackground-colorFunction1`(value: NodeSingular => Colour): Self = this.set("background-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-color`(value: PropertyValueNode[Colour]): Self = this.set("background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-color`: Self = this.set("background-color", js.undefined)
    
    @scala.inline
    def `setBackground-fitFunction1`(value: NodeSingular => none | contain | cover): Self = this.set("background-fit", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-fit`(value: PropertyValueNode[none | contain | cover]): Self = this.set("background-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-fit`: Self = this.set("background-fit", js.undefined)
    
    @scala.inline
    def `setBackground-heightFunction1`(value: NodeSingular => Double | String): Self = this.set("background-height", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-height`(value: PropertyValueNode[Double | String]): Self = this.set("background-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-height`: Self = this.set("background-height", js.undefined)
    
    @scala.inline
    def `setBackground-imageFunction1`(value: NodeSingular => String): Self = this.set("background-image", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-image`(value: PropertyValueNode[String]): Self = this.set("background-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-image`: Self = this.set("background-image", js.undefined)
    
    @scala.inline
    def `setBackground-image-opacityFunction1`(value: NodeSingular => Double): Self = this.set("background-image-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-image-opacity`(value: PropertyValueNode[Double]): Self = this.set("background-image-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-image-opacity`: Self = this.set("background-image-opacity", js.undefined)
    
    @scala.inline
    def `setBackground-opacityFunction1`(value: NodeSingular => Double): Self = this.set("background-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-opacity`(value: PropertyValueNode[Double]): Self = this.set("background-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-opacity`: Self = this.set("background-opacity", js.undefined)
    
    @scala.inline
    def `setBackground-position-xFunction1`(value: NodeSingular => Double | String): Self = this.set("background-position-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-position-x`(value: PropertyValueNode[Double | String]): Self = this.set("background-position-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-position-x`: Self = this.set("background-position-x", js.undefined)
    
    @scala.inline
    def `setBackground-position-yFunction1`(value: NodeSingular => Double | String): Self = this.set("background-position-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-position-y`(value: PropertyValueNode[Double | String]): Self = this.set("background-position-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-position-y`: Self = this.set("background-position-y", js.undefined)
    
    @scala.inline
    def `setBackground-repeatFunction1`(value: NodeSingular => `no-repeat` | `repeat-x` | `repeat-y` | repeat): Self = this.set("background-repeat", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-repeat`(value: PropertyValueNode[`no-repeat` | `repeat-x` | `repeat-y` | repeat]): Self = this.set("background-repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-repeat`: Self = this.set("background-repeat", js.undefined)
    
    @scala.inline
    def `setBackground-widthFunction1`(value: NodeSingular => Double | String): Self = this.set("background-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBackground-width`(value: PropertyValueNode[Double | String]): Self = this.set("background-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBackground-width`: Self = this.set("background-width", js.undefined)
    
    @scala.inline
    def setBackgroundColorFunction1(value: NodeSingular => Colour): Self = this.set("backgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBackgroundColor(value: PropertyValueNode[Colour]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def `setBorder-colorFunction1`(value: NodeSingular => Colour): Self = this.set("border-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBorder-color`(value: PropertyValueNode[Colour]): Self = this.set("border-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBorder-color`: Self = this.set("border-color", js.undefined)
    
    @scala.inline
    def `setBorder-opacityFunction1`(value: NodeSingular => Double): Self = this.set("border-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBorder-opacity`(value: PropertyValueNode[Double]): Self = this.set("border-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBorder-opacity`: Self = this.set("border-opacity", js.undefined)
    
    @scala.inline
    def `setBorder-styleFunction1`(value: NodeSingular => LineStyle): Self = this.set("border-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBorder-style`(value: PropertyValueNode[LineStyle]): Self = this.set("border-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBorder-style`: Self = this.set("border-style", js.undefined)
    
    @scala.inline
    def `setBorder-widthFunction1`(value: NodeSingular => Double | String): Self = this.set("border-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setBorder-width`(value: PropertyValueNode[Double | String]): Self = this.set("border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBorder-width`: Self = this.set("border-width", js.undefined)
    
    @scala.inline
    def setColorFunction1(value: NodeSingular => Colour): Self = this.set("color", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColor(value: PropertyValue[NodeSingular, Colour]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContentFunction1(value: NodeSingular => String): Self = this.set("content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContent(value: PropertyValueNode[String]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDisplayFunction1(value: NodeSingular => none | displayed): Self = this.set("display", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplay(value: PropertyValue[NodeSingular, none | displayed]): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setEventsFunction1(value: NodeSingular => yes | no): Self = this.set("events", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvents(value: PropertyValue[NodeSingular, yes | no]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def `setFont-familyFunction1`(value: NodeSingular => String): Self = this.set("font-family", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-family`(value: PropertyValue[NodeSingular, String]): Self = this.set("font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    
    @scala.inline
    def `setFont-sizeFunction1`(value: NodeSingular => Double | String): Self = this.set("font-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-size`(value: PropertyValue[NodeSingular, Double | String]): Self = this.set("font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-size`: Self = this.set("font-size", js.undefined)
    
    @scala.inline
    def `setFont-styleFunction1`(value: NodeSingular => FontStyle): Self = this.set("font-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-style`(value: PropertyValue[NodeSingular, FontStyle]): Self = this.set("font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    
    @scala.inline
    def `setFont-weightFunction1`(value: NodeSingular => FontWeight): Self = this.set("font-weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setFont-weight`(value: PropertyValue[NodeSingular, FontWeight]): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    
    @scala.inline
    def setGhostFunction1(value: NodeSingular => yes | no): Self = this.set("ghost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGhost(value: PropertyValueNode[yes | no]): Self = this.set("ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGhost: Self = this.set("ghost", js.undefined)
    
    @scala.inline
    def `setGhost-offset-xFunction1`(value: NodeSingular => Double): Self = this.set("ghost-offset-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setGhost-offset-x`(value: PropertyValueNode[Double]): Self = this.set("ghost-offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGhost-offset-x`: Self = this.set("ghost-offset-x", js.undefined)
    
    @scala.inline
    def `setGhost-offset-yFunction1`(value: NodeSingular => Double): Self = this.set("ghost-offset-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setGhost-offset-y`(value: PropertyValueNode[Double]): Self = this.set("ghost-offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGhost-offset-y`: Self = this.set("ghost-offset-y", js.undefined)
    
    @scala.inline
    def `setGhost-opacityFunction1`(value: NodeSingular => Double): Self = this.set("ghost-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setGhost-opacity`(value: PropertyValueNode[Double]): Self = this.set("ghost-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteGhost-opacity`: Self = this.set("ghost-opacity", js.undefined)
    
    @scala.inline
    def setHeightFunction1(value: NodeSingular => Double | String): Self = this.set("height", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: PropertyValueNode[Double | String]): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLabelFunction1(value: NodeSingular => String): Self = this.set("label", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabel(value: PropertyValue[NodeSingular, String]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def `setMin-zoomed-font-sizeFunction1`(value: NodeSingular => Double): Self = this.set("min-zoomed-font-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setMin-zoomed-font-size`(value: PropertyValue[NodeSingular, Double]): Self = this.set("min-zoomed-font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMin-zoomed-font-size`: Self = this.set("min-zoomed-font-size", js.undefined)
    
    @scala.inline
    def setOpacityFunction1(value: NodeSingular => Double): Self = this.set("opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpacity(value: PropertyValue[NodeSingular, Double]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def `setOverlay-colorFunction1`(value: EdgeSingular => Colour): Self = this.set("overlay-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-color`(value: PropertyValueEdge[Colour]): Self = this.set("overlay-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOverlay-color`: Self = this.set("overlay-color", js.undefined)
    
    @scala.inline
    def `setOverlay-opacityFunction1`(value: EdgeSingular => Double): Self = this.set("overlay-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-opacity`(value: PropertyValueEdge[Double]): Self = this.set("overlay-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOverlay-opacity`: Self = this.set("overlay-opacity", js.undefined)
    
    @scala.inline
    def `setOverlay-paddingFunction1`(value: EdgeSingular => Double | String): Self = this.set("overlay-padding", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setOverlay-padding`(value: PropertyValueEdge[Double | String]): Self = this.set("overlay-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOverlay-padding`: Self = this.set("overlay-padding", js.undefined)
    
    @scala.inline
    def `setPadding-bottomFunction1`(value: NodeSingular => String): Self = this.set("padding-bottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-bottom`(value: PropertyValueNode[String]): Self = this.set("padding-bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePadding-bottom`: Self = this.set("padding-bottom", js.undefined)
    
    @scala.inline
    def `setPadding-leftFunction1`(value: NodeSingular => String): Self = this.set("padding-left", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-left`(value: PropertyValueNode[String]): Self = this.set("padding-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePadding-left`: Self = this.set("padding-left", js.undefined)
    
    @scala.inline
    def `setPadding-rightFunction1`(value: NodeSingular => String): Self = this.set("padding-right", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-right`(value: PropertyValueNode[String]): Self = this.set("padding-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePadding-right`: Self = this.set("padding-right", js.undefined)
    
    @scala.inline
    def `setPadding-topFunction1`(value: NodeSingular => String): Self = this.set("padding-top", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPadding-top`(value: PropertyValueNode[String]): Self = this.set("padding-top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePadding-top`: Self = this.set("padding-top", js.undefined)
    
    @scala.inline
    def `setPie-i-background-colorFunction1`(value: NodeSingular => Colour): Self = this.set("pie-i-background-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-i-background-color`(value: PropertyValueNode[Colour]): Self = this.set("pie-i-background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePie-i-background-color`: Self = this.set("pie-i-background-color", js.undefined)
    
    @scala.inline
    def `setPie-i-background-opacityFunction1`(value: NodeSingular => Double): Self = this.set("pie-i-background-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-i-background-opacity`(value: PropertyValueNode[Double]): Self = this.set("pie-i-background-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePie-i-background-opacity`: Self = this.set("pie-i-background-opacity", js.undefined)
    
    @scala.inline
    def `setPie-i-background-sizeFunction1`(value: NodeSingular => Double): Self = this.set("pie-i-background-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-i-background-size`(value: PropertyValueNode[Double]): Self = this.set("pie-i-background-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePie-i-background-size`: Self = this.set("pie-i-background-size", js.undefined)
    
    @scala.inline
    def `setPie-sizeFunction1`(value: NodeSingular => String): Self = this.set("pie-size", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setPie-size`(value: PropertyValueNode[String]): Self = this.set("pie-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePie-size`: Self = this.set("pie-size", js.undefined)
    
    @scala.inline
    def setShapeFunction1(value: NodeSingular => NodeShape): Self = this.set("shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShape(value: PropertyValueNode[NodeShape]): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def `setShape-polygon-pointsFunction1`(value: NodeSingular => ShapePolygonPoints): Self = this.set("shape-polygon-points", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setShape-polygon-points`(value: PropertyValueNode[ShapePolygonPoints]): Self = this.set("shape-polygon-points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteShape-polygon-points`: Self = this.set("shape-polygon-points", js.undefined)
    
    @scala.inline
    def `setSource-labelFunction1`(value: NodeSingular => String): Self = this.set("source-label", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-label`(value: PropertyValue[NodeSingular, String]): Self = this.set("source-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSource-label`: Self = this.set("source-label", js.undefined)
    
    @scala.inline
    def `setSource-text-margin-xFunction1`(value: NodeSingular => Double): Self = this.set("source-text-margin-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-margin-x`(value: PropertyValue[NodeSingular, Double]): Self = this.set("source-text-margin-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSource-text-margin-x`: Self = this.set("source-text-margin-x", js.undefined)
    
    @scala.inline
    def `setSource-text-margin-yFunction1`(value: NodeSingular => Double): Self = this.set("source-text-margin-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-margin-y`(value: PropertyValue[NodeSingular, Double]): Self = this.set("source-text-margin-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSource-text-margin-y`: Self = this.set("source-text-margin-y", js.undefined)
    
    @scala.inline
    def `setSource-text-offsetFunction1`(value: NodeSingular => Double): Self = this.set("source-text-offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-offset`(value: PropertyValue[NodeSingular, Double]): Self = this.set("source-text-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSource-text-offset`: Self = this.set("source-text-offset", js.undefined)
    
    @scala.inline
    def `setSource-text-rotationFunction1`(value: NodeSingular => Double): Self = this.set("source-text-rotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setSource-text-rotation`(value: PropertyValue[NodeSingular, Double]): Self = this.set("source-text-rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSource-text-rotation`: Self = this.set("source-text-rotation", js.undefined)
    
    @scala.inline
    def `setTarget-labelFunction1`(value: NodeSingular => String): Self = this.set("target-label", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-label`(value: PropertyValue[NodeSingular, String]): Self = this.set("target-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTarget-label`: Self = this.set("target-label", js.undefined)
    
    @scala.inline
    def `setTarget-text-margin-xFunction1`(value: NodeSingular => Double): Self = this.set("target-text-margin-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-margin-x`(value: PropertyValue[NodeSingular, Double]): Self = this.set("target-text-margin-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTarget-text-margin-x`: Self = this.set("target-text-margin-x", js.undefined)
    
    @scala.inline
    def `setTarget-text-margin-yFunction1`(value: NodeSingular => Double): Self = this.set("target-text-margin-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-margin-y`(value: PropertyValue[NodeSingular, Double]): Self = this.set("target-text-margin-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTarget-text-margin-y`: Self = this.set("target-text-margin-y", js.undefined)
    
    @scala.inline
    def `setTarget-text-offsetFunction1`(value: NodeSingular => Double): Self = this.set("target-text-offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-offset`(value: PropertyValue[NodeSingular, Double]): Self = this.set("target-text-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTarget-text-offset`: Self = this.set("target-text-offset", js.undefined)
    
    @scala.inline
    def `setTarget-text-rotationFunction1`(value: NodeSingular => Double): Self = this.set("target-text-rotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setTarget-text-rotation`(value: PropertyValue[NodeSingular, Double]): Self = this.set("target-text-rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTarget-text-rotation`: Self = this.set("target-text-rotation", js.undefined)
    
    @scala.inline
    def `setText-background-colorFunction1`(value: NodeSingular => Colour): Self = this.set("text-background-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-color`(value: PropertyValue[NodeSingular, Colour]): Self = this.set("text-background-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-background-color`: Self = this.set("text-background-color", js.undefined)
    
    @scala.inline
    def `setText-background-opacityFunction1`(value: NodeSingular => Double): Self = this.set("text-background-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-opacity`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-background-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-background-opacity`: Self = this.set("text-background-opacity", js.undefined)
    
    @scala.inline
    def `setText-background-paddingFunction1`(value: NodeSingular => String): Self = this.set("text-background-padding", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-padding`(value: PropertyValue[NodeSingular, String]): Self = this.set("text-background-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-background-padding`: Self = this.set("text-background-padding", js.undefined)
    
    @scala.inline
    def `setText-background-shapeFunction1`(value: NodeSingular => rectangle | roundrectangle): Self = this.set("text-background-shape", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-background-shape`(value: PropertyValue[NodeSingular, rectangle | roundrectangle]): Self = this.set("text-background-shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-background-shape`: Self = this.set("text-background-shape", js.undefined)
    
    @scala.inline
    def `setText-border-colorFunction1`(value: NodeSingular => Colour): Self = this.set("text-border-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-color`(value: PropertyValue[NodeSingular, Colour]): Self = this.set("text-border-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-border-color`: Self = this.set("text-border-color", js.undefined)
    
    @scala.inline
    def `setText-border-opacityFunction1`(value: NodeSingular => Double): Self = this.set("text-border-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-opacity`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-border-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-border-opacity`: Self = this.set("text-border-opacity", js.undefined)
    
    @scala.inline
    def `setText-border-styleFunction1`(value: NodeSingular => LineStyle): Self = this.set("text-border-style", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-style`(value: PropertyValue[NodeSingular, LineStyle]): Self = this.set("text-border-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-border-style`: Self = this.set("text-border-style", js.undefined)
    
    @scala.inline
    def `setText-border-widthFunction1`(value: NodeSingular => Double): Self = this.set("text-border-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-border-width`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-border-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-border-width`: Self = this.set("text-border-width", js.undefined)
    
    @scala.inline
    def `setText-eventsFunction1`(value: NodeSingular => yes | no): Self = this.set("text-events", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-events`(value: PropertyValue[NodeSingular, yes | no]): Self = this.set("text-events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-events`: Self = this.set("text-events", js.undefined)
    
    @scala.inline
    def `setText-halignFunction1`(value: NodeSingular => left | center | right): Self = this.set("text-halign", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-halign`(value: PropertyValue[NodeSingular, left | center | right]): Self = this.set("text-halign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-halign`: Self = this.set("text-halign", js.undefined)
    
    @scala.inline
    def `setText-margin-xFunction1`(value: NodeSingular => Double): Self = this.set("text-margin-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-margin-x`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-margin-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-margin-x`: Self = this.set("text-margin-x", js.undefined)
    
    @scala.inline
    def `setText-margin-yFunction1`(value: NodeSingular => Double): Self = this.set("text-margin-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-margin-y`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-margin-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-margin-y`: Self = this.set("text-margin-y", js.undefined)
    
    @scala.inline
    def `setText-max-widthFunction1`(value: NodeSingular => String): Self = this.set("text-max-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-max-width`(value: PropertyValue[NodeSingular, String]): Self = this.set("text-max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-max-width`: Self = this.set("text-max-width", js.undefined)
    
    @scala.inline
    def `setText-opacityFunction1`(value: NodeSingular => Double): Self = this.set("text-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-opacity`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-opacity`: Self = this.set("text-opacity", js.undefined)
    
    @scala.inline
    def `setText-outline-colorFunction1`(value: NodeSingular => Colour): Self = this.set("text-outline-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-outline-color`(value: PropertyValue[NodeSingular, Colour]): Self = this.set("text-outline-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-outline-color`: Self = this.set("text-outline-color", js.undefined)
    
    @scala.inline
    def `setText-outline-opacityFunction1`(value: NodeSingular => Double): Self = this.set("text-outline-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-outline-opacity`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-outline-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-outline-opacity`: Self = this.set("text-outline-opacity", js.undefined)
    
    @scala.inline
    def `setText-outline-widthFunction1`(value: NodeSingular => Double | String): Self = this.set("text-outline-width", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-outline-width`(value: PropertyValue[NodeSingular, Double | String]): Self = this.set("text-outline-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-outline-width`: Self = this.set("text-outline-width", js.undefined)
    
    @scala.inline
    def `setText-rotationFunction1`(value: NodeSingular => Double): Self = this.set("text-rotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-rotation`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-rotation`: Self = this.set("text-rotation", js.undefined)
    
    @scala.inline
    def `setText-shadow-blurFunction1`(value: NodeSingular => Double): Self = this.set("text-shadow-blur", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-blur`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-shadow-blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-shadow-blur`: Self = this.set("text-shadow-blur", js.undefined)
    
    @scala.inline
    def `setText-shadow-colorFunction1`(value: NodeSingular => Colour): Self = this.set("text-shadow-color", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-color`(value: PropertyValue[NodeSingular, Colour]): Self = this.set("text-shadow-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-shadow-color`: Self = this.set("text-shadow-color", js.undefined)
    
    @scala.inline
    def `setText-shadow-offset-xFunction1`(value: NodeSingular => Double): Self = this.set("text-shadow-offset-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-offset-x`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-shadow-offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-shadow-offset-x`: Self = this.set("text-shadow-offset-x", js.undefined)
    
    @scala.inline
    def `setText-shadow-offset-yFunction1`(value: NodeSingular => Double): Self = this.set("text-shadow-offset-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-offset-y`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-shadow-offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-shadow-offset-y`: Self = this.set("text-shadow-offset-y", js.undefined)
    
    @scala.inline
    def `setText-shadow-opacityFunction1`(value: NodeSingular => Double): Self = this.set("text-shadow-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-shadow-opacity`(value: PropertyValue[NodeSingular, Double]): Self = this.set("text-shadow-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-shadow-opacity`: Self = this.set("text-shadow-opacity", js.undefined)
    
    @scala.inline
    def `setText-transformFunction1`(value: NodeSingular => TextTranformation): Self = this.set("text-transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-transform`(value: PropertyValue[NodeSingular, TextTranformation]): Self = this.set("text-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-transform`: Self = this.set("text-transform", js.undefined)
    
    @scala.inline
    def `setText-valignFunction1`(value: NodeSingular => top | center | bottom): Self = this.set("text-valign", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-valign`(value: PropertyValue[NodeSingular, top | center | bottom]): Self = this.set("text-valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-valign`: Self = this.set("text-valign", js.undefined)
    
    @scala.inline
    def `setText-wrapFunction1`(value: NodeSingular => none | wrap | ellipsis): Self = this.set("text-wrap", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setText-wrap`(value: PropertyValue[NodeSingular, none | wrap | ellipsis]): Self = this.set("text-wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-wrap`: Self = this.set("text-wrap", js.undefined)
    
    @scala.inline
    def `setTransition-delay`(value: Double): Self = this.set("transition-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTransition-delay`: Self = this.set("transition-delay", js.undefined)
    
    @scala.inline
    def `setTransition-duration`(value: Double): Self = this.set("transition-duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTransition-duration`: Self = this.set("transition-duration", js.undefined)
    
    @scala.inline
    def `setTransition-property`(value: String): Self = this.set("transition-property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTransition-property`: Self = this.set("transition-property", js.undefined)
    
    @scala.inline
    def `setTransition-timing-function`(value: TransitionTimingFunction): Self = this.set("transition-timing-function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTransition-timing-function`: Self = this.set("transition-timing-function", js.undefined)
    
    @scala.inline
    def setVisibilityFunction1(value: NodeSingular => hidden | visible): Self = this.set("visibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisibility(value: PropertyValue[NodeSingular, hidden | visible]): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    
    @scala.inline
    def setWidthFunction1(value: NodeSingular => Double | String): Self = this.set("width", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidth(value: PropertyValueNode[Double | String]): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def `setZ-indexFunction1`(value: NodeSingular => Double): Self = this.set("z-index", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setZ-index`(value: PropertyValue[NodeSingular, Double]): Self = this.set("z-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteZ-index`: Self = this.set("z-index", js.undefined)
  }
}
