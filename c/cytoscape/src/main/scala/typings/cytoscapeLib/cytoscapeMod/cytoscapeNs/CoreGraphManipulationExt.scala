package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#core/graph-manipulation
     * http://js.cytoscape.org/#extensions
     * These functions are intended for use in extensions.
     */
@js.native
trait CoreGraphManipulationExt extends js.Object {
  /**
           * Remove scratchpad data. You should remove scratchpad data only at your own namespaces.
           * http://js.cytoscape.org/#cy.removeScratch
           *
           * @param namespace A namespace string.
           */
  def removeScratch(namespace: java.lang.String): this.type = js.native
  /**
           * Set the scratchpad at a particular namespace,
           * where temporary or non-JSON data can be stored.
           * App-level scratchpad data should use namespaces prefixed with underscore, like '_foo'.
           *
           * If no parameter provided, the entire scratchpad will be returned.
           * If only namespace provided, the scratchpad with the namespace will be returned.
           *
           * @param namespace A namespace string.
           * @param value The value to set at the specified namespace.
           */
  def scratch(): Scratchpad = js.native
  /**
           * Set the scratchpad at a particular namespace,
           * where temporary or non-JSON data can be stored.
           * App-level scratchpad data should use namespaces prefixed with underscore, like '_foo'.
           *
           * If no parameter provided, the entire scratchpad will be returned.
           * If only namespace provided, the scratchpad with the namespace will be returned.
           *
           * @param namespace A namespace string.
           * @param value The value to set at the specified namespace.
           */
  def scratch(namespace: java.lang.String): Scratchpad = js.native
  def scratch(namespace: java.lang.String, value: js.Any): this.type = js.native
}

