package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.NumberDictionary
import typings.babylonjs.GPURenderPipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait NodeState extends StObject {
  
  def count(): js.Tuple2[Double, Double]
  
  var pipeline: GPURenderPipeline
  
  var values: NumberDictionary[NodeState]
}
object NodeState {
  
  inline def apply(
    count: () => js.Tuple2[Double, Double],
    pipeline: GPURenderPipeline,
    values: NumberDictionary[NodeState]
  ): NodeState = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), pipeline = pipeline.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeState]
  }
  
  extension [Self <: NodeState](x: Self) {
    
    inline def setCount(value: () => js.Tuple2[Double, Double]): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    inline def setPipeline(value: GPURenderPipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setValues(value: NumberDictionary[NodeState]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
