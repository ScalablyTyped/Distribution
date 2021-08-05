package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.floydWarshall
  */
trait SearchFloydWarshallOptions extends StObject {
  
  var directed: js.UndefOr[Boolean] = js.undefined
  
  def weight(edge: EdgeCollection): Double
  @JSName("weight")
  var weight_Original: WeightFn
}
object SearchFloydWarshallOptions {
  
  inline def apply(weight: /* edge */ EdgeCollection => Double): SearchFloydWarshallOptions = {
    val __obj = js.Dynamic.literal(weight = js.Any.fromFunction1(weight))
    __obj.asInstanceOf[SearchFloydWarshallOptions]
  }
  
  extension [Self <: SearchFloydWarshallOptions](x: Self) {
    
    inline def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    inline def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
    
    inline def setWeight(value: /* edge */ EdgeCollection => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
  }
}
