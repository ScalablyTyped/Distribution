package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseLayoutOptions extends js.Object {
  var name: java.lang.String
  // on layoutready event
  var ready: js.UndefOr[LayoutHandler] = js.undefined
  // on layoutstop event
  var stop: js.UndefOr[LayoutHandler] = js.undefined
}

