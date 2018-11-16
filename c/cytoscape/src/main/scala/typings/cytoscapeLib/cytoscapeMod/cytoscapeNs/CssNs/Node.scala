package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * http://js.cytoscape.org/#style/node-body
         */
/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial) */ 
trait Node extends PaddingNode {
  /**
               * Blackens the node’s body for values from 0 to 1;
               * whitens the node’s body for values from 0 to -1.
               */
  var `background-blacken`: js.UndefOr[scala.Double] = js.undefined
  /**
               * The colour of the node’s body.
               */
  var `background-color`: js.UndefOr[Colour] = js.undefined
  /**
               * The opacity level of the node’s background colour.
               */
  var `background-opacity`: js.UndefOr[scala.Double] = js.undefined
  var backgroundColor: js.UndefOr[Colour] = js.undefined
  /**
               * The colour of the node’s border.
               */
  var `border-color`: js.UndefOr[Colour] = js.undefined
  /**
               * The opacity of the node’s border.
               * A value between [0 1].
               */
  var `border-opacity`: js.UndefOr[scala.Double] = js.undefined
  /**
               * The style of the node’s border.
               */
  var `border-style`: js.UndefOr[LineStyle] = js.undefined
  /**
               * The size of the node’s border.
               */
  var `border-width`: js.UndefOr[scala.Double] = js.undefined
  /**
               * The height of the node’s body.
               * This property can take on the special value label
               * so the height is automatically based on the node’s label.
               */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
               * The shape of the node’s body.
               */
  var shape: js.UndefOr[NodeShape] = js.undefined
  var `shape-polygon-points`: js.UndefOr[ShapePolygonPoints] = js.undefined
  var `text-opacity`: js.UndefOr[scala.Double] = js.undefined
  /**
               * The width of the node’s body.
               * This property can take on the special value label
               * so the width is automatically based on the node’s label.
               */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

