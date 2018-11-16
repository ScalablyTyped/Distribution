package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PresetLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  // whether to fit to viewport
  var fit: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("name")
  var name_PresetLayoutOptions: cytoscapeLib.cytoscapeLibStrings.preset
  // padding on fit
  var padding: js.UndefOr[scala.Double] = js.undefined
  // the pan level to set (prob want fit = false if set)
  var pan: js.UndefOr[scala.Double] = js.undefined
  // map of (node id) => (position obj); or function(node){ return somPos; }
  var positions: js.UndefOr[NodePositionMap | NodePositionFunction] = js.undefined
  // the zoom level to set (prob want fit = false if set)
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

