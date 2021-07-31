package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#core/graph-manipulation
  * http://js.cytoscape.org/#extensions
  * These functions are intended for use in extensions.
  */
@js.native
trait CoreGraphManipulationExt extends StObject {
  
  /**
    * Remove scratchpad data. You should remove scratchpad data only at your own namespaces.
    * http://js.cytoscape.org/#cy.removeScratch
    *
    * @param namespace A namespace string.
    */
  def removeScratch(namespace: String): this.type = js.native
  
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
  def scratch(namespace: String): Scratchpad = js.native
  def scratch(namespace: String, value: js.Any): this.type = js.native
}
