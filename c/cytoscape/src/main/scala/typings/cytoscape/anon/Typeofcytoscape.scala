package typings.cytoscape.anon

import typings.cytoscape.mod.Core
import typings.cytoscape.mod.CytoscapeOptions
import typings.cytoscape.mod.Ext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcytoscape extends StObject {
  
  def apply(): Core = js.native
  def apply(options: CytoscapeOptions): Core = js.native
  def apply(`type`: String, name: String): Any = js.native
  def apply(`type`: String, name: String, registrant: Any): Unit = js.native
  
  /**
    * Style in Cytoscape.js follows CSS conventions as closely as possible.
    * In most cases, a property has the same name and behaviour as its corresponding CSS namesake.
    * However, the properties in CSS are not sufficient to specify the style of some parts of the graph.
    * In that case, additional properties are introduced that are unique to Cytoscape.js.
    *
    * For simplicity and ease of use, specificity rules are completely ignored in stylesheets.
    * For a given style property for a given element, the last matching selector wins.
    *
    * http://js.cytoscape.org/#style
    */
  val Css: Any = js.native
  
  /**
    * Register imported extension into cytoscape
    * @param module Entry point for the extension, got by module = require('cy-ext')
    * or by import module from 'cy-ext'
    * http://js.cytoscape.org/#extensions
    */
  def use(module: Ext): Unit = js.native
  
  /**
    * Surpress Cytoscape internal warnings globally with a flag.
    * @param condition If true, all Cytoscape warnings are surpressed.
    * https://js.cytoscape.org/#core/initialisation
    */
  def warnings(condition: Boolean): Unit = js.native
}
