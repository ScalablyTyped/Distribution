package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#layouts/random
     */

trait RandomLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  // constrain layout bounds
  var boundingBox: js.UndefOr[BoundingBox12 | BoundingBoxWH]
  // whether to fit to viewport
  var fit: scala.Boolean
  @JSName("name")
  var name_RandomLayoutOptions: cytoscapeLib.cytoscapeLibStrings.random
  // fit padding
  var padding: js.UndefOr[scala.Double] = js.undefined
}

