package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends StObject {
  
  /**
    * Add a rule to the stylesheet.
    */
  def append(style: String): this.type = js.native
  def append(style: js.Array[Stylesheet]): this.type = js.native
  def append(style: Stylesheet): this.type = js.native
  
  /**
    * Remove all styles, including default styles.
    */
  def clear(): this.type = js.native
  
  /**
    * Set the style from JSON data.
    * @example
    * style.fromJson([
    *   {
    *     selector: 'node',
    *     style: {
    *       'background-color': 'red'
    *     }
    *   }
    * ]);
    */
  def fromJson(json: Any): this.type = js.native
  
  /**
    * Set the style from a string.
    * @example
    * style.fromString('node { background-color: blue; }');
    */
  def fromString(style: String): this.type = js.native
  
  /**
    * Resets to the default stylesheet.
    */
  def resetToDefault(): this.type = js.native
  
  /**
    * Sets the selector context for defining styles.
    * @example
    * style.selector('foo').style('color', 'black');
    */
  def selector(s: String): this.type = js.native
  
  def style(css: Edge): this.type = js.native
  /**
    * Sets a style for the current selected selector.
    * @example
    * style.selector('foo').style({color: 'black'});
    */
  def style(css: Node): this.type = js.native
  /**
    * Sets a style for the current selected selector.
    * @example
    * style.selector('foo').style('color', 'black');
    */
  def style(key: String, value: String): this.type = js.native
  
  /**
    * Makes the changes active.
    */
  def update(): Unit = js.native
}
