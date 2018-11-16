package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

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
  var `font-family`: java.lang.String
  /**
               * The size of the label text.
               * https://developer.mozilla.org/en-US/docs/Web/CSS/font-family
               */
  var `font-size`: scala.Double
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
  var label: java.lang.String
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
  var `min-zoomed-font-size`: scala.Double
  /**
               * The text to display for an edge’s source label.
               */
  var `source-label`: java.lang.String
  /**
               * (For the source label of an edge.)
               */
  var `source-text-margin-x`: scala.Double
  /**
               * (For the source label of an edge.)
               */
  var `source-text-margin-y`: scala.Double
  /**
               * Edge label alignment:
               */
  
  /**
               * For the source label of an edge, how far from the source node the label should be placed.
               */
  var `source-text-offset`: scala.Double
  /**
               * (For the source label of an edge.)
               */
  var `source-text-rotation`: scala.Double
  /**
               * The text to display for an edge’s target label.
               */
  var `target-label`: java.lang.String
  /**
               * (For the target label of an edge.)
               */
  var `target-text-margin-x`: scala.Double
  /**
               * (For the target label of an edge.)
               */
  var `target-text-margin-y`: scala.Double
  /**
               * For the target label of an edge, how far from the target node the label should be placed.
               */
  var `target-text-offset`: scala.Double
  /**
               * (For the target label of an edge.)
               */
  var `target-text-rotation`: scala.Double
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
  var `text-background-opacity`: scala.Double
  /**
               * The shape to use for the label background.
               */
  var `text-background-shape`: cytoscapeLib.cytoscapeLibStrings.ractangle | cytoscapeLib.cytoscapeLibStrings.roundrectangle
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
  var `text-border-opacity`: scala.Double
  /**
               * The style of the border around the label.
               */
  var `text-border-style`: LineStyle
  /**
               * The width of the border around the label.
               */
  var `text-border-width`: scala.Double
  /**
               * Whether events should occur on an element if the label receives an event.
               * You may want a style applied to the text onactive so you know the text is activatable.
               */
  var `text-events`: cytoscapeLib.cytoscapeLibStrings.yes | cytoscapeLib.cytoscapeLibStrings.no
  /**
               * Node label alignment:
               */
  
  /**
               * The vertical alignment of a node’s label.
               */
  var `text-halign`: cytoscapeLib.cytoscapeLibStrings.left | cytoscapeLib.cytoscapeLibStrings.center | cytoscapeLib.cytoscapeLibStrings.right
  /**
               * Margins:
               */
  
  /**
               * A margin that shifts the label along the x- axis.
               */
  var `text-margin-x`: scala.Double
  /**
               * A margin that shifts the label along the y- axis.
               */
  var `text-margin-y`: scala.Double
  /**
               * The maximum width for wrapped text,
               * applied when "text-wrap" is set to wrap.
               * For only manual newlines (i.e.\n), set a very large
               * value like 1000px such that only your newline characters would apply.
               */
  var `text-max-width`: java.lang.String
  /**
               * The opacity of the label text, including its outline.
               */
  var `text-opacity`: scala.Double
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
  var `text-outline-opacity`: scala.Double
  /**
               * The size of the outline on label text.
               */
  var `text-outline-width`: scala.Double
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
  var `text-rotation`: scala.Double
  /**
               * Shadow:
               */
  /**
               * The shadow blur distance.
               */
  var `text-shadow-blur`: scala.Double
  /**
               * The colour of the shadow.
               */
  var `text-shadow-color`: Colour
  /**
               * The x offset relative to the text where the shadow will be displayed, can be negative.
               * If you set blur to 0, add an offset to view your shadow.
               */
  var `text-shadow-offset-x`: scala.Double
  /**
               * The y offset relative to the text where the shadow will be displayed, can be negative.
               * If you set blur to 0, add an offset to view your shadow.
               */
  var `text-shadow-offset-y`: scala.Double
  /**
               * The opacity of the shadow on the text; the shadow is disabled for 0 (default value).
               */
  var `text-shadow-opacity`: scala.Double
  /**
               * A transformation to apply to the label text.
               */
  var `text-transform`: TextTranformation
  /**
               * The vertical alignment of a node’s label.
               */
  var `text-valign`: cytoscapeLib.cytoscapeLibStrings.top | cytoscapeLib.cytoscapeLibStrings.center | cytoscapeLib.cytoscapeLibStrings.bottom
  /**
               * Wrapping text:
               */
  
  /**
               * A wrapping style to apply to the label text; may be
               *  * "none" for no wrapping (including manual newlines ) or
               *  * "wrap" for manual and/ or autowrapping.
               */
  var `text-wrap`: cytoscapeLib.cytoscapeLibStrings.none | cytoscapeLib.cytoscapeLibStrings.wrap
}

