package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementAnimateOptionPos
  extends StObject
     with ElementAnimateOptionsBase {
  
  /** A position to which the elements will be animated. */
  var position: js.UndefOr[Position] = js.undefined
}
object ElementAnimateOptionPos {
  
  inline def apply(): ElementAnimateOptionPos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementAnimateOptionPos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementAnimateOptionPos] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
