package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#collection/style
     */
@js.native
trait SingularStyle extends js.Object {
  /**
           * Get the effective opacity of the element
           *  (i.e. on-screen opacity),
           * which takes into consideration parent node opacity.
           * http://js.cytoscape.org/#ele.effectiveOpacity
           */
  def effectiveOpacity(): scala.Double = js.native
  /**
           * Get whether an element has a particular class.
           * @param className The name of the class to test for.
           * http://js.cytoscape.org/#ele.hasClass
           */
  def hasClass(className: ClassName): scala.Boolean = js.native
  /**
           * Get whether the element is hidden.
           * http://js.cytoscape.org/#ele.visible
           */
  def hidden(): scala.Boolean = js.native
  /**
           * Get the numeric value of a style property in
           * preferred units that can be used for calculations.
           * @param name The name of the style property to get.
           * http://js.cytoscape.org/#ele.numericStyle
           */
  def numericStyle(name: java.lang.String): js.Any = js.native
  /**
           * Get the units that ele.numericStyle() is expressed in, for a particular property.
           * @param name The name of the style property to get.
           * http://js.cytoscape.org/#ele.numericStyleUnits
           */
  def numericStyleUnits(name: java.lang.String): js.Any = js.native
  def renderedCss(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def renderedCss(name: java.lang.String): js.Any = js.native
  /**
           * Get a name-value pair object containing rendered visual
           * style properties and their values for the element.
           * @param name The name of the visual style property to get.
           */
  def renderedStyle(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def renderedStyle(name: java.lang.String): js.Any = js.native
  /**
           * Get whether the element's effective opacity is completely transparent,
           * which takes into consideration parent node opacity.
           * http://js.cytoscape.org/#ele.transparent
           */
  def transparent(): scala.Double = js.native
  /**
           * Get whether the element is visible.
           * http://js.cytoscape.org/#ele.visible
           */
  def visible(): scala.Boolean = js.native
}

