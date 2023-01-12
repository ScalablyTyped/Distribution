package typings.cytoscape.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxDegree extends StObject {
  
  def maxDegree(): Double
}
object MaxDegree {
  
  inline def apply(maxDegree: () => Double): MaxDegree = {
    val __obj = js.Dynamic.literal(maxDegree = js.Any.fromFunction0(maxDegree))
    __obj.asInstanceOf[MaxDegree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxDegree] (val x: Self) extends AnyVal {
    
    inline def setMaxDegree(value: () => Double): Self = StObject.set(x, "maxDegree", js.Any.fromFunction0(value))
  }
}
