package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cytoscape", "use")
@js.native
object use extends js.Object {
  /**
    * Register imported extension into cytoscape
    * @param module Entry point for the extension, got by module = require('cy-ext')
    * or by import module from 'cy-ext'
    * http://js.cytoscape.org/#extensions
    */
  def apply(module: Ext): Unit = js.native
}

