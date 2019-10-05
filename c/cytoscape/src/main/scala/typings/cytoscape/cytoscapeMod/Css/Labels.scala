package typings.cytoscape.cytoscapeMod.Css

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Labels
  * Label text:
  *
  * http://js.cytoscape.org/#style/labels
  */
trait Labels extends js.Object {
  /**
    * Basic font styling:
    */
  /**
    * The colour of the element’s label.
    */
  var color: Colour
  /**
    * A comma-separated list of font names to use on the label text.
    */
  var `font-family`: String
  /**
    * The size of the label text.
    * https://developer.mozilla.org/en-US/docs/Web/CSS/font-family
    */
  var `font-size`: Double
  /**
    * A CSS font style to be applied to the label text.
    * https://developer.mozilla.org/en-US/docs/Web/CSS/font-style
    */
  var `font-style`: FontStyle
  /**
    * A CSS font weight to be applied to the label text.
    */
  var `font-weight`: FontWeight
  /**
    * The text to display for an element’s label.
    */
  var label: String
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
  var `min-zoomed-font-size`: Double
  /**
    * The text to display for an edge’s source label.
    */
  var `source-label`: String
  /**
    * (For the source label of an edge.)
    */
  var `source-text-margin-x`: Double
  /**
    * (For the source label of an edge.)
    */
  var `source-text-margin-y`: Double
  /**
    * Edge label alignment:
    */
  /**
    * For the source label of an edge, how far from the source node the label should be placed.
    */
  var `source-text-offset`: Double
  /**
    * (For the source label of an edge.)
    */
  var `source-text-rotation`: Double
  /**
    * The text to display for an edge’s target label.
    */
  var `target-label`: String
  /**
    * (For the target label of an edge.)
    */
  var `target-text-margin-x`: Double
  /**
    * (For the target label of an edge.)
    */
  var `target-text-margin-y`: Double
  /**
    * For the target label of an edge, how far from the target node the label should be placed.
    */
  var `target-text-offset`: Double
  /**
    * (For the target label of an edge.)
    */
  var `target-text-rotation`: Double
  /**
    * Background:
    */
  /**
    * A colour to apply on the text background.
    */
  var `text-background-color`: Colour
  /**
    * The opacity of the label background; the background is disabled for 0 (default value).
    */
  var `text-background-opacity`: Double
  /**
    * The shape to use for the label background.
    */
  var `text-background-shape`: rectangle | roundrectangle
  /**
    * The colour of the border around the label.
    */
  var `text-border-color`: Colour
  /**
    * Border:
    */
  /**
    * The width of the border around the label; the border is disabled for 0 (default value).
    */
  var `text-border-opacity`: Double
  /**
    * The style of the border around the label.
    */
  var `text-border-style`: LineStyle
  /**
    * The width of the border around the label.
    */
  var `text-border-width`: Double
  /**
    * Whether events should occur on an element if the label receives an event.
    * You may want a style applied to the text onactive so you know the text is activatable.
    */
  var `text-events`: yes | no
  /**
    * Node label alignment:
    */
  /**
    * The vertical alignment of a node’s label.
    */
  var `text-halign`: left | center | right
  /**
    * Margins:
    */
  /**
    * A margin that shifts the label along the x- axis.
    */
  var `text-margin-x`: Double
  /**
    * A margin that shifts the label along the y- axis.
    */
  var `text-margin-y`: Double
  /**
    * The maximum width for wrapped text,
    * applied when "text-wrap" is set to wrap.
    * For only manual newlines (i.e.\n), set a very large
    * value like 1000px such that only your newline characters would apply.
    */
  var `text-max-width`: String
  /**
    * The opacity of the label text, including its outline.
    */
  var `text-opacity`: Double
  /**
    * Outline:
    */
  /**
    * The colour of the outline around the element’s label text.
    */
  var `text-outline-color`: Colour
  /**
    * The opacity of the outline on label text.
    */
  var `text-outline-opacity`: Double
  /**
    * The size of the outline on label text.
    */
  var `text-outline-width`: Double
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
  var `text-rotation`: Double
  /**
    * Shadow:
    */
  /**
    * The shadow blur distance.
    */
  var `text-shadow-blur`: Double
  /**
    * The colour of the shadow.
    */
  var `text-shadow-color`: Colour
  /**
    * The x offset relative to the text where the shadow will be displayed, can be negative.
    * If you set blur to 0, add an offset to view your shadow.
    */
  var `text-shadow-offset-x`: Double
  /**
    * The y offset relative to the text where the shadow will be displayed, can be negative.
    * If you set blur to 0, add an offset to view your shadow.
    */
  var `text-shadow-offset-y`: Double
  /**
    * The opacity of the shadow on the text; the shadow is disabled for 0 (default value).
    */
  var `text-shadow-opacity`: Double
  /**
    * A transformation to apply to the label text.
    */
  var `text-transform`: TextTranformation
  /**
    * The vertical alignment of a node’s label.
    */
  var `text-valign`: top | center | bottom
  /**
    * Wrapping text:
    */
  /**
    * A wrapping style to apply to the label text; may be
    *  * "none" for no wrapping (including manual newlines ) or
    *  * "wrap" for manual and/ or autowrapping.
    */
  var `text-wrap`: none | wrap | ellipsis
}

object Labels {
  @scala.inline
  def apply(
    color: Colour,
    `font-family`: String,
    `font-size`: Double,
    `font-style`: FontStyle,
    `font-weight`: FontWeight,
    label: String,
    `min-zoomed-font-size`: Double,
    `source-label`: String,
    `source-text-margin-x`: Double,
    `source-text-margin-y`: Double,
    `source-text-offset`: Double,
    `source-text-rotation`: Double,
    `target-label`: String,
    `target-text-margin-x`: Double,
    `target-text-margin-y`: Double,
    `target-text-offset`: Double,
    `target-text-rotation`: Double,
    `text-background-color`: Colour,
    `text-background-opacity`: Double,
    `text-background-shape`: rectangle | roundrectangle,
    `text-border-color`: Colour,
    `text-border-opacity`: Double,
    `text-border-style`: LineStyle,
    `text-border-width`: Double,
    `text-events`: yes | no,
    `text-halign`: left | center | right,
    `text-margin-x`: Double,
    `text-margin-y`: Double,
    `text-max-width`: String,
    `text-opacity`: Double,
    `text-outline-color`: Colour,
    `text-outline-opacity`: Double,
    `text-outline-width`: Double,
    `text-rotation`: Double,
    `text-shadow-blur`: Double,
    `text-shadow-color`: Colour,
    `text-shadow-offset-x`: Double,
    `text-shadow-offset-y`: Double,
    `text-shadow-opacity`: Double,
    `text-transform`: TextTranformation,
    `text-valign`: top | center | bottom,
    `text-wrap`: none | wrap | ellipsis
  ): Labels = {
    val __obj = js.Dynamic.literal(color = color, label = label)
    __obj.updateDynamic("font-family")(`font-family`)
    __obj.updateDynamic("font-size")(`font-size`)
    __obj.updateDynamic("font-style")(`font-style`)
    __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    __obj.updateDynamic("min-zoomed-font-size")(`min-zoomed-font-size`)
    __obj.updateDynamic("source-label")(`source-label`)
    __obj.updateDynamic("source-text-margin-x")(`source-text-margin-x`)
    __obj.updateDynamic("source-text-margin-y")(`source-text-margin-y`)
    __obj.updateDynamic("source-text-offset")(`source-text-offset`)
    __obj.updateDynamic("source-text-rotation")(`source-text-rotation`)
    __obj.updateDynamic("target-label")(`target-label`)
    __obj.updateDynamic("target-text-margin-x")(`target-text-margin-x`)
    __obj.updateDynamic("target-text-margin-y")(`target-text-margin-y`)
    __obj.updateDynamic("target-text-offset")(`target-text-offset`)
    __obj.updateDynamic("target-text-rotation")(`target-text-rotation`)
    __obj.updateDynamic("text-background-color")(`text-background-color`)
    __obj.updateDynamic("text-background-opacity")(`text-background-opacity`)
    __obj.updateDynamic("text-background-shape")(`text-background-shape`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-border-color")(`text-border-color`)
    __obj.updateDynamic("text-border-opacity")(`text-border-opacity`)
    __obj.updateDynamic("text-border-style")(`text-border-style`)
    __obj.updateDynamic("text-border-width")(`text-border-width`)
    __obj.updateDynamic("text-events")(`text-events`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-halign")(`text-halign`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-margin-x")(`text-margin-x`)
    __obj.updateDynamic("text-margin-y")(`text-margin-y`)
    __obj.updateDynamic("text-max-width")(`text-max-width`)
    __obj.updateDynamic("text-opacity")(`text-opacity`)
    __obj.updateDynamic("text-outline-color")(`text-outline-color`)
    __obj.updateDynamic("text-outline-opacity")(`text-outline-opacity`)
    __obj.updateDynamic("text-outline-width")(`text-outline-width`)
    __obj.updateDynamic("text-rotation")(`text-rotation`)
    __obj.updateDynamic("text-shadow-blur")(`text-shadow-blur`)
    __obj.updateDynamic("text-shadow-color")(`text-shadow-color`)
    __obj.updateDynamic("text-shadow-offset-x")(`text-shadow-offset-x`)
    __obj.updateDynamic("text-shadow-offset-y")(`text-shadow-offset-y`)
    __obj.updateDynamic("text-shadow-opacity")(`text-shadow-opacity`)
    __obj.updateDynamic("text-transform")(`text-transform`)
    __obj.updateDynamic("text-valign")(`text-valign`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-wrap")(`text-wrap`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
}

