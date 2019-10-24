package typings.cytoscape.cytoscapeMod.Css

import typings.cytoscape.cytoscapeStrings.`no-repeat`
import typings.cytoscape.cytoscapeStrings.`repeat-x`
import typings.cytoscape.cytoscapeStrings.`repeat-y`
import typings.cytoscape.cytoscapeStrings.clipped
import typings.cytoscape.cytoscapeStrings.contain
import typings.cytoscape.cytoscapeStrings.cover
import typings.cytoscape.cytoscapeStrings.none
import typings.cytoscape.cytoscapeStrings.repeat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#style/node-body
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof cytoscape.cytoscape.Css.Overlay ]:? cytoscape.cytoscape.Css.Overlay[P]}
- Dropped {[ P in keyof cytoscape.cytoscape.Css.Labels<cytoscape.cytoscape.NodeSingular> ]:? cytoscape.cytoscape.Css.Labels<cytoscape.cytoscape.NodeSingular>[P]}
- Dropped {[ P in keyof cytoscape.cytoscape.Css.Ghost ]:? cytoscape.cytoscape.Css.Ghost[P]}
- Dropped {[ P in keyof cytoscape.cytoscape.Css.Visibility<cytoscape.cytoscape.NodeSingular> ]:? cytoscape.cytoscape.Css.Visibility<cytoscape.cytoscape.NodeSingular>[P]}
- Dropped {[ P in keyof cytoscape.cytoscape.Css.PieChartBackground ]:? cytoscape.cytoscape.Css.PieChartBackground[P]} */ trait Node
  extends PaddingNode
     with BackgroundImage {
  /**
    * Blackens the node’s body for values from 0 to 1;
    * whitens the node’s body for values from 0 to -1.
    */
  var `background-blacken`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
  /**
    * The colour of the node’s body.
    */
  var `background-color`: js.UndefOr[PropertyValueNode[Colour]] = js.undefined
  /**
    * The opacity level of the node’s background colour.
    */
  var `background-opacity`: js.UndefOr[PropertyValueNode[Double]] = js.undefined
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
  /**
    * The CSS content field
    */
  var content: js.UndefOr[PropertyValueNode[String]] = js.undefined
  /**
    * The height of the node’s body.
    * This property can take on the special value label
    * so the height is automatically based on the node’s label.
    */
  var height: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
  /**
    * The shape of the node’s body.
    */
  var shape: js.UndefOr[PropertyValueNode[NodeShape]] = js.undefined
  var `shape-polygon-points`: js.UndefOr[PropertyValueNode[ShapePolygonPoints]] = js.undefined
  /**
    * The width of the node’s body.
    * This property can take on the special value label
    * so the width is automatically based on the node’s label.
    */
  var width: js.UndefOr[PropertyValueNode[Double | String]] = js.undefined
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
    content: PropertyValueNode[String] = null,
    height: PropertyValueNode[Double | String] = null,
    `padding-bottom`: PropertyValueNode[String] = null,
    `padding-left`: PropertyValueNode[String] = null,
    `padding-right`: PropertyValueNode[String] = null,
    `padding-top`: PropertyValueNode[String] = null,
    shape: PropertyValueNode[NodeShape] = null,
    `shape-polygon-points`: PropertyValueNode[ShapePolygonPoints] = null,
    width: PropertyValueNode[Double | String] = null
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
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (`padding-bottom` != null) __obj.updateDynamic("padding-bottom")(`padding-bottom`.asInstanceOf[js.Any])
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    if (`padding-top` != null) __obj.updateDynamic("padding-top")(`padding-top`.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (`shape-polygon-points` != null) __obj.updateDynamic("shape-polygon-points")(`shape-polygon-points`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

