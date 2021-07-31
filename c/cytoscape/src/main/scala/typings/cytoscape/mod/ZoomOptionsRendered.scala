package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomOptionsRendered extends StObject {
  
  /** The rendered position about which to zoom. */
  var renderedPosition: Position
}
object ZoomOptionsRendered {
  
  @scala.inline
  def apply(renderedPosition: Position): ZoomOptionsRendered = {
    val __obj = js.Dynamic.literal(renderedPosition = renderedPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptionsRendered]
  }
  
  @scala.inline
  implicit class ZoomOptionsRenderedMutableBuilder[Self <: ZoomOptionsRendered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderedPosition(value: Position): Self = StObject.set(x, "renderedPosition", value.asInstanceOf[js.Any])
  }
}
