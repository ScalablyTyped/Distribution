package typings.cytoscape.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Degree extends StObject {
  
  def degree(): Double
}
object Degree {
  
  inline def apply(degree: () => Double): Degree = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction0(degree))
    __obj.asInstanceOf[Degree]
  }
  
  extension [Self <: Degree](x: Self) {
    
    inline def setDegree(value: () => Double): Self = StObject.set(x, "degree", js.Any.fromFunction0(value))
  }
}
