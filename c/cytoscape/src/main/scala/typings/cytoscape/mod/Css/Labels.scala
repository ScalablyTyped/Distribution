package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.bottom
import typings.cytoscape.cytoscapeStrings.center
import typings.cytoscape.cytoscapeStrings.ellipsis
import typings.cytoscape.cytoscapeStrings.left
import typings.cytoscape.cytoscapeStrings.no
import typings.cytoscape.cytoscapeStrings.none
import typings.cytoscape.cytoscapeStrings.rectangle
import typings.cytoscape.cytoscapeStrings.right
import typings.cytoscape.cytoscapeStrings.roundrectangle
import typings.cytoscape.cytoscapeStrings.top
import typings.cytoscape.cytoscapeStrings.wrap
import typings.cytoscape.cytoscapeStrings.yes
import typings.cytoscape.mod.EdgeSingular
import typings.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Labels
  * Label text:
  *
  * http://js.cytoscape.org/#style/labels
  */
trait Labels[SingularType /* <: NodeSingular | EdgeSingular */] extends js.Object {
  /**
    * Basic font styling:
    */
  /**
    * The colour of the element’s label.
    */
  var color: PropertyValue[SingularType, Colour]
  /**
    * A comma-separated list of font names to use on the label text.
    */
  var `font-family`: PropertyValue[SingularType, String]
  /**
    * The size of the label text.
    * https://developer.mozilla.org/en-US/docs/Web/CSS/font-family
    */
  var `font-size`: PropertyValue[SingularType, Double | String]
  /**
    * A CSS font style to be applied to the label text.
    * https://developer.mozilla.org/en-US/docs/Web/CSS/font-style
    */
  var `font-style`: PropertyValue[SingularType, FontStyle]
  /**
    * A CSS font weight to be applied to the label text.
    */
  var `font-weight`: PropertyValue[SingularType, FontWeight]
  /**
    * The text to display for an element’s label.
    */
  var label: PropertyValue[SingularType, String]
  /**
    * Interactivity:
    */
  /**
    * If zooming makes the effective font size of the label smaller than this,
    * then no label is shown.Note that because of performance optimisations,
    * the label may be shown at font sizes slightly smaller than this value.
    *
    * This effect is more pronounced at larger screen pixel ratios.However,
    * it is guaranteed that the label will be shown at sizes equal to or greater than the value specified.
    */
  var `min-zoomed-font-size`: PropertyValue[SingularType, Double]
  /**
    * The text to display for an edge’s source label.
    */
  var `source-label`: PropertyValue[SingularType, String]
  /**
    * (For the source label of an edge.)
    */
  var `source-text-margin-x`: PropertyValue[SingularType, Double]
  /**
    * (For the source label of an edge.)
    */
  var `source-text-margin-y`: PropertyValue[SingularType, Double]
  /**
    * Edge label alignment:
    */
  /**
    * For the source label of an edge, how far from the source node the label should be placed.
    */
  var `source-text-offset`: PropertyValue[SingularType, Double]
  /**
    * (For the source label of an edge.)
    */
  var `source-text-rotation`: PropertyValue[SingularType, Double]
  /**
    * The text to display for an edge’s target label.
    */
  var `target-label`: PropertyValue[SingularType, String]
  /**
    * (For the target label of an edge.)
    */
  var `target-text-margin-x`: PropertyValue[SingularType, Double]
  /**
    * (For the target label of an edge.)
    */
  var `target-text-margin-y`: PropertyValue[SingularType, Double]
  /**
    * For the target label of an edge, how far from the target node the label should be placed.
    */
  var `target-text-offset`: PropertyValue[SingularType, Double]
  /**
    * (For the target label of an edge.)
    */
  var `target-text-rotation`: PropertyValue[SingularType, Double]
  /**
    * A colour to apply on the text background.
    */
  var `text-background-color`: PropertyValue[SingularType, Colour]
  /**
    * The opacity of the label background; the background is disabled for 0 (default value).
    */
  var `text-background-opacity`: PropertyValue[SingularType, Double]
  /**
    * Background:
    */
  /**
    * The padding provides visual spacing between the text and the edge of the background.
    */
  var `text-background-padding`: PropertyValue[SingularType, String]
  /**
    * The shape to use for the label background.
    */
  var `text-background-shape`: PropertyValue[SingularType, rectangle | roundrectangle]
  /**
    * The colour of the border around the label.
    */
  var `text-border-color`: PropertyValue[SingularType, Colour]
  /**
    * Border:
    */
  /**
    * The width of the border around the label; the border is disabled for 0 (default value).
    */
  var `text-border-opacity`: PropertyValue[SingularType, Double]
  /**
    * The style of the border around the label.
    */
  var `text-border-style`: PropertyValue[SingularType, LineStyle]
  /**
    * The width of the border around the label.
    */
  var `text-border-width`: PropertyValue[SingularType, Double]
  /**
    * Whether events should occur on an element if the label receives an event.
    * You may want a style applied to the text onactive so you know the text is activatable.
    */
  var `text-events`: PropertyValue[SingularType, yes | no]
  /**
    * Node label alignment:
    */
  /**
    * The vertical alignment of a node’s label.
    */
  var `text-halign`: PropertyValue[SingularType, left | center | right]
  /**
    * Margins:
    */
  /**
    * A margin that shifts the label along the x- axis.
    */
  var `text-margin-x`: PropertyValue[SingularType, Double]
  /**
    * A margin that shifts the label along the y- axis.
    */
  var `text-margin-y`: PropertyValue[SingularType, Double]
  /**
    * The maximum width for wrapped text,
    * applied when "text-wrap" is set to wrap.
    * For only manual newlines (i.e.\n), set a very large
    * value like 1000px such that only your newline characters would apply.
    */
  var `text-max-width`: PropertyValue[SingularType, String]
  /**
    * The opacity of the label text, including its outline.
    */
  var `text-opacity`: PropertyValue[SingularType, Double]
  /**
    * Outline:
    */
  /**
    * The colour of the outline around the element’s label text.
    */
  var `text-outline-color`: PropertyValue[SingularType, Colour]
  /**
    * The opacity of the outline on label text.
    */
  var `text-outline-opacity`: PropertyValue[SingularType, Double]
  /**
    * The size of the outline on label text.
    */
  var `text-outline-width`: PropertyValue[SingularType, Double | String]
  /**
    * Rotating text:
    */
  /**
    * A rotation angle that is applied to the label.
    *  * For edges, the special value autorotate can be used to align the label to the edge.
    *  * For nodes, the label is rotated along its anchor point on the node, so a label margin may help for some usecases.
    *  * The special value none can be used to denote 0deg.
    *  * Rotations works best with left- to - right text.
    */
  var `text-rotation`: PropertyValue[SingularType, Double]
  /**
    * Shadow:
    */
  /**
    * The shadow blur distance.
    */
  var `text-shadow-blur`: PropertyValue[SingularType, Double]
  /**
    * The colour of the shadow.
    */
  var `text-shadow-color`: PropertyValue[SingularType, Colour]
  /**
    * The x offset relative to the text where the shadow will be displayed, can be negative.
    * If you set blur to 0, add an offset to view your shadow.
    */
  var `text-shadow-offset-x`: PropertyValue[SingularType, Double]
  /**
    * The y offset relative to the text where the shadow will be displayed, can be negative.
    * If you set blur to 0, add an offset to view your shadow.
    */
  var `text-shadow-offset-y`: PropertyValue[SingularType, Double]
  /**
    * The opacity of the shadow on the text; the shadow is disabled for 0 (default value).
    */
  var `text-shadow-opacity`: PropertyValue[SingularType, Double]
  /**
    * A transformation to apply to the label text.
    */
  var `text-transform`: PropertyValue[SingularType, TextTranformation]
  /**
    * The vertical alignment of a node’s label.
    */
  var `text-valign`: PropertyValue[SingularType, top | center | bottom]
  /**
    * Wrapping text:
    */
  /**
    * A wrapping style to apply to the label text; may be
    *  * "none" for no wrapping (including manual newlines ) or
    *  * "wrap" for manual and/ or autowrapping.
    */
  var `text-wrap`: PropertyValue[SingularType, none | wrap | ellipsis]
}

object Labels {
  @scala.inline
  def apply[SingularType](
    color: PropertyValue[SingularType, Colour],
    `font-family`: PropertyValue[SingularType, String],
    `font-size`: PropertyValue[SingularType, Double | String],
    `font-style`: PropertyValue[SingularType, FontStyle],
    `font-weight`: PropertyValue[SingularType, FontWeight],
    label: PropertyValue[SingularType, String],
    `min-zoomed-font-size`: PropertyValue[SingularType, Double],
    `source-label`: PropertyValue[SingularType, String],
    `source-text-margin-x`: PropertyValue[SingularType, Double],
    `source-text-margin-y`: PropertyValue[SingularType, Double],
    `source-text-offset`: PropertyValue[SingularType, Double],
    `source-text-rotation`: PropertyValue[SingularType, Double],
    `target-label`: PropertyValue[SingularType, String],
    `target-text-margin-x`: PropertyValue[SingularType, Double],
    `target-text-margin-y`: PropertyValue[SingularType, Double],
    `target-text-offset`: PropertyValue[SingularType, Double],
    `target-text-rotation`: PropertyValue[SingularType, Double],
    `text-background-color`: PropertyValue[SingularType, Colour],
    `text-background-opacity`: PropertyValue[SingularType, Double],
    `text-background-padding`: PropertyValue[SingularType, String],
    `text-background-shape`: PropertyValue[SingularType, rectangle | roundrectangle],
    `text-border-color`: PropertyValue[SingularType, Colour],
    `text-border-opacity`: PropertyValue[SingularType, Double],
    `text-border-style`: PropertyValue[SingularType, LineStyle],
    `text-border-width`: PropertyValue[SingularType, Double],
    `text-events`: PropertyValue[SingularType, yes | no],
    `text-halign`: PropertyValue[SingularType, left | center | right],
    `text-margin-x`: PropertyValue[SingularType, Double],
    `text-margin-y`: PropertyValue[SingularType, Double],
    `text-max-width`: PropertyValue[SingularType, String],
    `text-opacity`: PropertyValue[SingularType, Double],
    `text-outline-color`: PropertyValue[SingularType, Colour],
    `text-outline-opacity`: PropertyValue[SingularType, Double],
    `text-outline-width`: PropertyValue[SingularType, Double | String],
    `text-rotation`: PropertyValue[SingularType, Double],
    `text-shadow-blur`: PropertyValue[SingularType, Double],
    `text-shadow-color`: PropertyValue[SingularType, Colour],
    `text-shadow-offset-x`: PropertyValue[SingularType, Double],
    `text-shadow-offset-y`: PropertyValue[SingularType, Double],
    `text-shadow-opacity`: PropertyValue[SingularType, Double],
    `text-transform`: PropertyValue[SingularType, TextTranformation],
    `text-valign`: PropertyValue[SingularType, top | center | bottom],
    `text-wrap`: PropertyValue[SingularType, none | wrap | ellipsis]
  ): Labels[SingularType] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    __obj.updateDynamic("min-zoomed-font-size")(`min-zoomed-font-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-label")(`source-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-text-margin-x")(`source-text-margin-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-text-margin-y")(`source-text-margin-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-text-offset")(`source-text-offset`.asInstanceOf[js.Any])
    __obj.updateDynamic("source-text-rotation")(`source-text-rotation`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-label")(`target-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-text-margin-x")(`target-text-margin-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-text-margin-y")(`target-text-margin-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-text-offset")(`target-text-offset`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-text-rotation")(`target-text-rotation`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-background-color")(`text-background-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-background-opacity")(`text-background-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-background-padding")(`text-background-padding`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-background-shape")(`text-background-shape`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-border-color")(`text-border-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-border-opacity")(`text-border-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-border-style")(`text-border-style`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-border-width")(`text-border-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-events")(`text-events`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-halign")(`text-halign`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-margin-x")(`text-margin-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-margin-y")(`text-margin-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-max-width")(`text-max-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-opacity")(`text-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-outline-color")(`text-outline-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-outline-opacity")(`text-outline-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-outline-width")(`text-outline-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-rotation")(`text-rotation`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-shadow-blur")(`text-shadow-blur`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-shadow-color")(`text-shadow-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-shadow-offset-x")(`text-shadow-offset-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-shadow-offset-y")(`text-shadow-offset-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-shadow-opacity")(`text-shadow-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-transform")(`text-transform`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-valign")(`text-valign`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-wrap")(`text-wrap`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels[SingularType]]
  }
}

