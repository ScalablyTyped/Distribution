package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreInteractionOptions extends StObject {
  
  /**
    * Defines which directions are used in calculating distances. Defaults to 'x' for 'index' mode and 'xy' in dataset and 'nearest' modes.
    */
  var axis: InteractionAxis
  
  /**
    * if true, the invisible points that are outside of the chart area will also be included when evaluating interactions.
    * @default false
    */
  var includeInvisible: Boolean
  
  /**
    * if true, the hover mode only applies when the mouse position intersects an item on the chart.
    * @default true
    */
  var intersect: Boolean
  
  /**
    * Sets which elements appear in the tooltip. See Interaction Modes for details.
    * @default 'nearest'
    */
  var mode: InteractionMode
}
object CoreInteractionOptions {
  
  inline def apply(axis: InteractionAxis, includeInvisible: Boolean, intersect: Boolean, mode: InteractionMode): CoreInteractionOptions = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], includeInvisible = includeInvisible.asInstanceOf[js.Any], intersect = intersect.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreInteractionOptions]
  }
  
  extension [Self <: CoreInteractionOptions](x: Self) {
    
    inline def setAxis(value: InteractionAxis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setIncludeInvisible(value: Boolean): Self = StObject.set(x, "includeInvisible", value.asInstanceOf[js.Any])
    
    inline def setIntersect(value: Boolean): Self = StObject.set(x, "intersect", value.asInstanceOf[js.Any])
    
    inline def setMode(value: InteractionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
