package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementAnimateOptionRen
  extends StObject
     with ElementAnimateOptionsBase {
  
  /** A rendered position to which the elements will be animated. */
  var renderedPosition: js.UndefOr[Position] = js.undefined
}
object ElementAnimateOptionRen {
  
  inline def apply(): ElementAnimateOptionRen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementAnimateOptionRen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementAnimateOptionRen] (val x: Self) extends AnyVal {
    
    inline def setRenderedPosition(value: Position): Self = StObject.set(x, "renderedPosition", value.asInstanceOf[js.Any])
    
    inline def setRenderedPositionUndefined: Self = StObject.set(x, "renderedPosition", js.undefined)
  }
}
