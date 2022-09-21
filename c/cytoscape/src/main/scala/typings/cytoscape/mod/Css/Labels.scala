package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.anywhere
import typings.cytoscape.cytoscapeStrings.auto
import typings.cytoscape.cytoscapeStrings.autorotate
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
import typings.cytoscape.cytoscapeStrings.whitespace
import typings.cytoscape.cytoscapeStrings.wrap
import typings.cytoscape.cytoscapeStrings.yes
import typings.cytoscape.mod.EdgeSingular
import typings.cytoscape.mod.NodeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Labels
  * Label text:
  *
  * http://js.cytoscape.org/#style/labels
  */
trait Labels[SingularType /* <: NodeSingular | EdgeSingular */] extends StObject {
  
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
    * The line height of multiline text, as a relative, unitless value. It specifies the
    * vertical spacing between each line. With value `1` (default), the lines are stacked
    * directly on top of one another with no additional whitespace between them.
    * With value `2`, for example, there is whitespace between each line equal to the visible
    * height of a line of text.
    */
  var `line-height`: PropertyValue[SingularType, Double]
  
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
  var `source-text-rotation`: PropertyValue[SingularType, Double | autorotate | none]
  
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
  var `target-text-rotation`: PropertyValue[SingularType, Double | autorotate | none]
  
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
    * Whether events should occur on an element if the label receives an event; may be `yes` or `no`.
    * You may want a style applied to the text on active so you know the text is activatable.
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
    * The justification of multiline (wrapped) labels; may be
    * `left`, `center`, `right`, or `auto` (default). The auto value makes it so that a
    * node’s label is justified along the node — e.g. a label on the right side
    * of a node is left justified.
    */
  var `text-justification`: PropertyValue[SingularType, auto | left | center | right]
  
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
    * The characters that may be used for possible wrapping locations when
    * a line overflows `text-max-width`; may be `whitespace` (default) or `anywhere`.
    * Note that anywhere is suited to CJK, where the characters are in a grid
    * and no whitespace exists. Using anywhere with text in the Latin alphabet,
    * for example, will split words at arbitrary locations.
    */
  var `text-overflow-wrap`: PropertyValue[SingularType, whitespace | anywhere]
  
  /**
    * Rotating text:
    */
  /**
    * A rotation angle that is applied to the label.
    *  * Rotations are clockwise.
    *  * For edges, the special value `autorotate` can be used to align the label to the edge.
    *  * For nodes, the label is rotated along its anchor point on the node, so a label margin may help for some usecases.
    *  * The special value `none` can be used to denote 0deg.
    *  * Rotations works best with left-to-right text.
    */
  var `text-rotation`: PropertyValue[SingularType, Double | autorotate | none]
  
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
    *  * "ellipsis" to truncate the string and append
    */
  var `text-wrap`: PropertyValue[SingularType, none | wrap | ellipsis]
}
object Labels {
  
  inline def apply[SingularType /* <: NodeSingular | EdgeSingular */](
    color: PropertyValue[SingularType, Colour],
    `font-family`: PropertyValue[SingularType, String],
    `font-size`: PropertyValue[SingularType, Double | String],
    `font-style`: PropertyValue[SingularType, FontStyle],
    `font-weight`: PropertyValue[SingularType, FontWeight],
    label: PropertyValue[SingularType, String],
    `line-height`: PropertyValue[SingularType, Double],
    `min-zoomed-font-size`: PropertyValue[SingularType, Double],
    `source-label`: PropertyValue[SingularType, String],
    `source-text-margin-x`: PropertyValue[SingularType, Double],
    `source-text-margin-y`: PropertyValue[SingularType, Double],
    `source-text-offset`: PropertyValue[SingularType, Double],
    `source-text-rotation`: PropertyValue[SingularType, Double | autorotate | none],
    `target-label`: PropertyValue[SingularType, String],
    `target-text-margin-x`: PropertyValue[SingularType, Double],
    `target-text-margin-y`: PropertyValue[SingularType, Double],
    `target-text-offset`: PropertyValue[SingularType, Double],
    `target-text-rotation`: PropertyValue[SingularType, Double | autorotate | none],
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
    `text-justification`: PropertyValue[SingularType, auto | left | center | right],
    `text-margin-x`: PropertyValue[SingularType, Double],
    `text-margin-y`: PropertyValue[SingularType, Double],
    `text-max-width`: PropertyValue[SingularType, String],
    `text-opacity`: PropertyValue[SingularType, Double],
    `text-outline-color`: PropertyValue[SingularType, Colour],
    `text-outline-opacity`: PropertyValue[SingularType, Double],
    `text-outline-width`: PropertyValue[SingularType, Double | String],
    `text-overflow-wrap`: PropertyValue[SingularType, whitespace | anywhere],
    `text-rotation`: PropertyValue[SingularType, Double | autorotate | none],
    `text-transform`: PropertyValue[SingularType, TextTranformation],
    `text-valign`: PropertyValue[SingularType, top | center | bottom],
    `text-wrap`: PropertyValue[SingularType, none | wrap | ellipsis]
  ): Labels[SingularType] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-style")(`font-style`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-height")(`line-height`.asInstanceOf[js.Any])
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
    __obj.updateDynamic("text-justification")(`text-justification`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-margin-x")(`text-margin-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-margin-y")(`text-margin-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-max-width")(`text-max-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-opacity")(`text-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-outline-color")(`text-outline-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-outline-opacity")(`text-outline-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-outline-width")(`text-outline-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-overflow-wrap")(`text-overflow-wrap`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-rotation")(`text-rotation`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-transform")(`text-transform`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-valign")(`text-valign`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-wrap")(`text-wrap`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels[SingularType]]
  }
  
  extension [Self <: Labels[?], SingularType /* <: NodeSingular | EdgeSingular */](x: Self & Labels[SingularType]) {
    
    inline def setColor(value: PropertyValue[SingularType, Colour]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorFunction1(value: SingularType => Colour): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
    
    inline def `setFont-family`(value: PropertyValue[SingularType, String]): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    inline def `setFont-familyFunction1`(value: SingularType => String): Self = StObject.set(x, "font-family", js.Any.fromFunction1(value))
    
    inline def `setFont-size`(value: PropertyValue[SingularType, Double | String]): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    inline def `setFont-sizeFunction1`(value: SingularType => Double | String): Self = StObject.set(x, "font-size", js.Any.fromFunction1(value))
    
    inline def `setFont-style`(value: PropertyValue[SingularType, FontStyle]): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    inline def `setFont-styleFunction1`(value: SingularType => FontStyle): Self = StObject.set(x, "font-style", js.Any.fromFunction1(value))
    
    inline def `setFont-weight`(value: PropertyValue[SingularType, FontWeight]): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    inline def `setFont-weightFunction1`(value: SingularType => FontWeight): Self = StObject.set(x, "font-weight", js.Any.fromFunction1(value))
    
    inline def setLabel(value: PropertyValue[SingularType, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: SingularType => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def `setLine-height`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "line-height", value.asInstanceOf[js.Any])
    
    inline def `setLine-heightFunction1`(value: SingularType => Double): Self = StObject.set(x, "line-height", js.Any.fromFunction1(value))
    
    inline def `setMin-zoomed-font-size`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "min-zoomed-font-size", value.asInstanceOf[js.Any])
    
    inline def `setMin-zoomed-font-sizeFunction1`(value: SingularType => Double): Self = StObject.set(x, "min-zoomed-font-size", js.Any.fromFunction1(value))
    
    inline def `setSource-label`(value: PropertyValue[SingularType, String]): Self = StObject.set(x, "source-label", value.asInstanceOf[js.Any])
    
    inline def `setSource-labelFunction1`(value: SingularType => String): Self = StObject.set(x, "source-label", js.Any.fromFunction1(value))
    
    inline def `setSource-text-margin-x`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "source-text-margin-x", value.asInstanceOf[js.Any])
    
    inline def `setSource-text-margin-xFunction1`(value: SingularType => Double): Self = StObject.set(x, "source-text-margin-x", js.Any.fromFunction1(value))
    
    inline def `setSource-text-margin-y`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "source-text-margin-y", value.asInstanceOf[js.Any])
    
    inline def `setSource-text-margin-yFunction1`(value: SingularType => Double): Self = StObject.set(x, "source-text-margin-y", js.Any.fromFunction1(value))
    
    inline def `setSource-text-offset`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "source-text-offset", value.asInstanceOf[js.Any])
    
    inline def `setSource-text-offsetFunction1`(value: SingularType => Double): Self = StObject.set(x, "source-text-offset", js.Any.fromFunction1(value))
    
    inline def `setSource-text-rotation`(value: PropertyValue[SingularType, Double | autorotate | none]): Self = StObject.set(x, "source-text-rotation", value.asInstanceOf[js.Any])
    
    inline def `setSource-text-rotationFunction1`(value: SingularType => Double | autorotate | none): Self = StObject.set(x, "source-text-rotation", js.Any.fromFunction1(value))
    
    inline def `setTarget-label`(value: PropertyValue[SingularType, String]): Self = StObject.set(x, "target-label", value.asInstanceOf[js.Any])
    
    inline def `setTarget-labelFunction1`(value: SingularType => String): Self = StObject.set(x, "target-label", js.Any.fromFunction1(value))
    
    inline def `setTarget-text-margin-x`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "target-text-margin-x", value.asInstanceOf[js.Any])
    
    inline def `setTarget-text-margin-xFunction1`(value: SingularType => Double): Self = StObject.set(x, "target-text-margin-x", js.Any.fromFunction1(value))
    
    inline def `setTarget-text-margin-y`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "target-text-margin-y", value.asInstanceOf[js.Any])
    
    inline def `setTarget-text-margin-yFunction1`(value: SingularType => Double): Self = StObject.set(x, "target-text-margin-y", js.Any.fromFunction1(value))
    
    inline def `setTarget-text-offset`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "target-text-offset", value.asInstanceOf[js.Any])
    
    inline def `setTarget-text-offsetFunction1`(value: SingularType => Double): Self = StObject.set(x, "target-text-offset", js.Any.fromFunction1(value))
    
    inline def `setTarget-text-rotation`(value: PropertyValue[SingularType, Double | autorotate | none]): Self = StObject.set(x, "target-text-rotation", value.asInstanceOf[js.Any])
    
    inline def `setTarget-text-rotationFunction1`(value: SingularType => Double | autorotate | none): Self = StObject.set(x, "target-text-rotation", js.Any.fromFunction1(value))
    
    inline def `setText-background-color`(value: PropertyValue[SingularType, Colour]): Self = StObject.set(x, "text-background-color", value.asInstanceOf[js.Any])
    
    inline def `setText-background-colorFunction1`(value: SingularType => Colour): Self = StObject.set(x, "text-background-color", js.Any.fromFunction1(value))
    
    inline def `setText-background-opacity`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "text-background-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-background-opacityFunction1`(value: SingularType => Double): Self = StObject.set(x, "text-background-opacity", js.Any.fromFunction1(value))
    
    inline def `setText-background-padding`(value: PropertyValue[SingularType, String]): Self = StObject.set(x, "text-background-padding", value.asInstanceOf[js.Any])
    
    inline def `setText-background-paddingFunction1`(value: SingularType => String): Self = StObject.set(x, "text-background-padding", js.Any.fromFunction1(value))
    
    inline def `setText-background-shape`(value: PropertyValue[SingularType, rectangle | roundrectangle]): Self = StObject.set(x, "text-background-shape", value.asInstanceOf[js.Any])
    
    inline def `setText-background-shapeFunction1`(value: SingularType => rectangle | roundrectangle): Self = StObject.set(x, "text-background-shape", js.Any.fromFunction1(value))
    
    inline def `setText-border-color`(value: PropertyValue[SingularType, Colour]): Self = StObject.set(x, "text-border-color", value.asInstanceOf[js.Any])
    
    inline def `setText-border-colorFunction1`(value: SingularType => Colour): Self = StObject.set(x, "text-border-color", js.Any.fromFunction1(value))
    
    inline def `setText-border-opacity`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "text-border-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-border-opacityFunction1`(value: SingularType => Double): Self = StObject.set(x, "text-border-opacity", js.Any.fromFunction1(value))
    
    inline def `setText-border-style`(value: PropertyValue[SingularType, LineStyle]): Self = StObject.set(x, "text-border-style", value.asInstanceOf[js.Any])
    
    inline def `setText-border-styleFunction1`(value: SingularType => LineStyle): Self = StObject.set(x, "text-border-style", js.Any.fromFunction1(value))
    
    inline def `setText-border-width`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "text-border-width", value.asInstanceOf[js.Any])
    
    inline def `setText-border-widthFunction1`(value: SingularType => Double): Self = StObject.set(x, "text-border-width", js.Any.fromFunction1(value))
    
    inline def `setText-events`(value: PropertyValue[SingularType, yes | no]): Self = StObject.set(x, "text-events", value.asInstanceOf[js.Any])
    
    inline def `setText-eventsFunction1`(value: SingularType => yes | no): Self = StObject.set(x, "text-events", js.Any.fromFunction1(value))
    
    inline def `setText-halign`(value: PropertyValue[SingularType, left | center | right]): Self = StObject.set(x, "text-halign", value.asInstanceOf[js.Any])
    
    inline def `setText-halignFunction1`(value: SingularType => left | center | right): Self = StObject.set(x, "text-halign", js.Any.fromFunction1(value))
    
    inline def `setText-justification`(value: PropertyValue[SingularType, auto | left | center | right]): Self = StObject.set(x, "text-justification", value.asInstanceOf[js.Any])
    
    inline def `setText-justificationFunction1`(value: SingularType => auto | left | center | right): Self = StObject.set(x, "text-justification", js.Any.fromFunction1(value))
    
    inline def `setText-margin-x`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "text-margin-x", value.asInstanceOf[js.Any])
    
    inline def `setText-margin-xFunction1`(value: SingularType => Double): Self = StObject.set(x, "text-margin-x", js.Any.fromFunction1(value))
    
    inline def `setText-margin-y`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "text-margin-y", value.asInstanceOf[js.Any])
    
    inline def `setText-margin-yFunction1`(value: SingularType => Double): Self = StObject.set(x, "text-margin-y", js.Any.fromFunction1(value))
    
    inline def `setText-max-width`(value: PropertyValue[SingularType, String]): Self = StObject.set(x, "text-max-width", value.asInstanceOf[js.Any])
    
    inline def `setText-max-widthFunction1`(value: SingularType => String): Self = StObject.set(x, "text-max-width", js.Any.fromFunction1(value))
    
    inline def `setText-opacity`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "text-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-opacityFunction1`(value: SingularType => Double): Self = StObject.set(x, "text-opacity", js.Any.fromFunction1(value))
    
    inline def `setText-outline-color`(value: PropertyValue[SingularType, Colour]): Self = StObject.set(x, "text-outline-color", value.asInstanceOf[js.Any])
    
    inline def `setText-outline-colorFunction1`(value: SingularType => Colour): Self = StObject.set(x, "text-outline-color", js.Any.fromFunction1(value))
    
    inline def `setText-outline-opacity`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "text-outline-opacity", value.asInstanceOf[js.Any])
    
    inline def `setText-outline-opacityFunction1`(value: SingularType => Double): Self = StObject.set(x, "text-outline-opacity", js.Any.fromFunction1(value))
    
    inline def `setText-outline-width`(value: PropertyValue[SingularType, Double | String]): Self = StObject.set(x, "text-outline-width", value.asInstanceOf[js.Any])
    
    inline def `setText-outline-widthFunction1`(value: SingularType => Double | String): Self = StObject.set(x, "text-outline-width", js.Any.fromFunction1(value))
    
    inline def `setText-overflow-wrap`(value: PropertyValue[SingularType, whitespace | anywhere]): Self = StObject.set(x, "text-overflow-wrap", value.asInstanceOf[js.Any])
    
    inline def `setText-overflow-wrapFunction1`(value: SingularType => whitespace | anywhere): Self = StObject.set(x, "text-overflow-wrap", js.Any.fromFunction1(value))
    
    inline def `setText-rotation`(value: PropertyValue[SingularType, Double | autorotate | none]): Self = StObject.set(x, "text-rotation", value.asInstanceOf[js.Any])
    
    inline def `setText-rotationFunction1`(value: SingularType => Double | autorotate | none): Self = StObject.set(x, "text-rotation", js.Any.fromFunction1(value))
    
    inline def `setText-transform`(value: PropertyValue[SingularType, TextTranformation]): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
    
    inline def `setText-transformFunction1`(value: SingularType => TextTranformation): Self = StObject.set(x, "text-transform", js.Any.fromFunction1(value))
    
    inline def `setText-valign`(value: PropertyValue[SingularType, top | center | bottom]): Self = StObject.set(x, "text-valign", value.asInstanceOf[js.Any])
    
    inline def `setText-valignFunction1`(value: SingularType => top | center | bottom): Self = StObject.set(x, "text-valign", js.Any.fromFunction1(value))
    
    inline def `setText-wrap`(value: PropertyValue[SingularType, none | wrap | ellipsis]): Self = StObject.set(x, "text-wrap", value.asInstanceOf[js.Any])
    
    inline def `setText-wrapFunction1`(value: SingularType => none | wrap | ellipsis): Self = StObject.set(x, "text-wrap", js.Any.fromFunction1(value))
  }
}
