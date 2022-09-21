package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerElement extends StObject {
  
  /**
    * Applies the layer element settings and updates element appearance.
    */
  def applySettings(settings: Any): Unit = js.native
  
  /**
    * Gets the value of an attribute.
    */
  def attribute(name: String): Any = js.native
  /**
    * Sets the value of an attribute.
    */
  def attribute(name: String, value: Any): Unit = js.native
  
  /**
    * Gets the layer element coordinates.
    */
  def coordinates(): Any = js.native
  
  /**
    * The parent layer of the layer element.
    */
  var layer: js.UndefOr[Any] = js.native
  
  /**
    * Gets the selection state of the layer element.
    */
  def selected(): Boolean = js.native
  /**
    * Sets the selection state of the layer element.
    */
  def selected(state: Boolean): Unit = js.native
}
