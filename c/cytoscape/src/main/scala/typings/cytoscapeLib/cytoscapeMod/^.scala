package typings
package cytoscapeLib.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cytoscape", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): cytoscapeLib.cytoscapeMod.cytoscapeNs.Core = js.native
  def apply(extensionName: java.lang.String, foo: java.lang.String, bar: js.Any): cytoscapeLib.cytoscapeMod.cytoscapeNs.Core = js.native
  def apply(options: cytoscapeLib.cytoscapeMod.cytoscapeNs.CytoscapeOptions): cytoscapeLib.cytoscapeMod.cytoscapeNs.Core = js.native
  /**
    * Register imported extension into cytoscape
    * @param module Entry point for the extension, got by module = require('cy-ext')
    * or by import module from 'cy-ext'
    * http://js.cytoscape.org/#extensions
    */
  def use(module: cytoscapeLib.cytoscapeMod.cytoscapeNs.Ext): scala.Unit = js.native
}

