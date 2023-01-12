package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomOptionsLevel extends StObject {
  
  /** The zoom level to set. */
  var level: Double
}
object ZoomOptionsLevel {
  
  inline def apply(level: Double): ZoomOptionsLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptionsLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZoomOptionsLevel] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
