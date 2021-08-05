package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/position--dimensions
  */
trait SingularPosition extends StObject {
  
  /**
    * Gets whether the element is active (e.g. on user tap, grab, etc).
    * http://js.cytoscape.org/#ele.active
    */
  def active(): Boolean
  
  /**
    * Get the height of the element.
    */
  def height(): Double
  
  /**
    * Get the outer height of the element (includes height, padding, & border).
    */
  def outerHeight(): Double
  
  /**
    * Get the outer width of the element (includes width, padding, & border).
    */
  def outerWidth(): Double
  
  /**
    * Get the height of the element in rendered dimensions.
    */
  def renderedHeight(): Double
  
  /**
    * Get the outer height of the element (includes height, padding, & border) in rendered dimensions.
    */
  def renderedOuterHeight(): Double
  
  /**
    * Get the outer width of the element (includes width, padding, & border) in rendered dimensions.
    */
  def renderedOuterWidth(): Double
  
  /**
    * Get the width of the element in rendered dimensions.
    */
  def renderedWidth(): Double
  
  /**
    * Get the width of the element.
    */
  def width(): Double
}
object SingularPosition {
  
  inline def apply(
    active: () => Boolean,
    height: () => Double,
    outerHeight: () => Double,
    outerWidth: () => Double,
    renderedHeight: () => Double,
    renderedOuterHeight: () => Double,
    renderedOuterWidth: () => Double,
    renderedWidth: () => Double,
    width: () => Double
  ): SingularPosition = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), height = js.Any.fromFunction0(height), outerHeight = js.Any.fromFunction0(outerHeight), outerWidth = js.Any.fromFunction0(outerWidth), renderedHeight = js.Any.fromFunction0(renderedHeight), renderedOuterHeight = js.Any.fromFunction0(renderedOuterHeight), renderedOuterWidth = js.Any.fromFunction0(renderedOuterWidth), renderedWidth = js.Any.fromFunction0(renderedWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[SingularPosition]
  }
  
  extension [Self <: SingularPosition](x: Self) {
    
    inline def setActive(value: () => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction0(value))
    
    inline def setHeight(value: () => Double): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
    
    inline def setOuterHeight(value: () => Double): Self = StObject.set(x, "outerHeight", js.Any.fromFunction0(value))
    
    inline def setOuterWidth(value: () => Double): Self = StObject.set(x, "outerWidth", js.Any.fromFunction0(value))
    
    inline def setRenderedHeight(value: () => Double): Self = StObject.set(x, "renderedHeight", js.Any.fromFunction0(value))
    
    inline def setRenderedOuterHeight(value: () => Double): Self = StObject.set(x, "renderedOuterHeight", js.Any.fromFunction0(value))
    
    inline def setRenderedOuterWidth(value: () => Double): Self = StObject.set(x, "renderedOuterWidth", js.Any.fromFunction0(value))
    
    inline def setRenderedWidth(value: () => Double): Self = StObject.set(x, "renderedWidth", js.Any.fromFunction0(value))
    
    inline def setWidth(value: () => Double): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
  }
}
