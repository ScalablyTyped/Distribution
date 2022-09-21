package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionStyle extends StObject {
  
  /**
    * Add classes to elements.
    * http://js.cytoscape.org/#eles.addClass
    * @param classes A space-separated list of class names to add to the elements.
    */
  def addClass(classes: ClassNames): this.type = js.native
  
  /**
    * Replace the current list of classes on the elements with the specified list.
    * @param classes A space-separated list of class names that replaces the current class list.
    * http://js.cytoscape.org/#eles.classes
    * Note: can be used to clear all classes (no arguments).
    */
  def classes(): this.type = js.native
  def classes(classes: ClassNames): this.type = js.native
  
  /**
    * Get a name-value pair object containing visual style properties and their values for the element.
    */
  def css(): StringDictionary[Any] = js.native
  /**
    * Get a particular style property value.
    * @param name The name of the visual style property to get.
    */
  def css(name: String): Any = js.native
  /**
    * Set a particular style property value.
    * @param name The name of the visual style property to set.
    * @param value The value to which the property is set.
    */
  def css(name: String, value: Any): this.type = js.native
  /**
    * Set several particular style property values.
    * @param obj An object of style property name-value pairs to set.
    */
  def css(obj: js.Object): this.type = js.native
  
  /**
    * Add classes to the elements, and then remove the classes after a specified duration.
    * @param classes A space-separated list of class names to flash on the elements.
    * @param duration [optional] The duration in milliseconds that the classes should be added on the elements. After the duration, the classes are removed.
    * http://js.cytoscape.org/#eles.flashClass
    */
  def flashClass(classes: ClassNames): this.type = js.native
  def flashClass(classes: ClassNames, duration: Double): this.type = js.native
  
  /**
    * Remove classes from elements.
    * @param classes A space-separated list of class names to remove from the elements.
    * http://js.cytoscape.org/#eles.removeClass
    */
  def removeClass(classes: ClassNames): this.type = js.native
  
  /**
    * Remove all or specific style overrides.
    * @param names A space-separated list of property names to remove overrides
    */
  def removeStyle(): this.type = js.native
  def removeStyle(names: String): this.type = js.native
  
  /**
    * Get a name-value pair object containing visual style properties and their values for the element.
    */
  def style(): StringDictionary[Any] = js.native
  /**
    * Get a particular style property value.
    * @param name The name of the visual style property to get.
    */
  def style(name: String): Any = js.native
  /**
    * Set a particular style property value.
    * @param name The name of the visual style property to set.
    * @param value The value to which the property is set.
    */
  def style(name: String, value: Any): this.type = js.native
  /**
    * Set several particular style property values.
    * @param obj An object of style property name-value pairs to set.
    */
  def style(obj: js.Object): this.type = js.native
  
  /**
    * Toggle whether the elements have the specified classes.
    * @param classes A space-separated list of class names to toggle on the elements.
    * @param toggle [optional] Instead of automatically toggling, adds the classes on truthy values or removes them on falsey values.
    * http://js.cytoscape.org/#eles.toggleClass
    */
  def toggleClass(classes: ClassNames): this.type = js.native
  def toggleClass(classes: ClassNames, toggle: Boolean): this.type = js.native
}
