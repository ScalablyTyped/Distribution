package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeInvisible extends StObject {
  
  var includeInvisible: Boolean
  
  var intersect: Boolean
  
  var mode: String
}
object IncludeInvisible {
  
  inline def apply(includeInvisible: Boolean, intersect: Boolean, mode: String): IncludeInvisible = {
    val __obj = js.Dynamic.literal(includeInvisible = includeInvisible.asInstanceOf[js.Any], intersect = intersect.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeInvisible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludeInvisible] (val x: Self) extends AnyVal {
    
    inline def setIncludeInvisible(value: Boolean): Self = StObject.set(x, "includeInvisible", value.asInstanceOf[js.Any])
    
    inline def setIntersect(value: Boolean): Self = StObject.set(x, "intersect", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
