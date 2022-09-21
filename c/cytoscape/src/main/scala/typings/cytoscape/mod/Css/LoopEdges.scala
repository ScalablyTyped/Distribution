package typings.cytoscape.mod.Css

import typings.cytoscape.mod.EdgeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Loop edges
  * For loops (i.e. same source and target)
  *
  * https://js.cytoscape.org/#style/loop-edges
  */
trait LoopEdges extends StObject {
  
  /**
    * Determines the angle that loops extend from the node in cases when the source and
    * target node of an edge is the same. The angle is specified from the 12 o’clock
    * position and it progresses clockwise for increasing positive values.
    * The default is `-45deg` (extending to the upper left).
    */
  var `loop-direction`: PropertyValueEdge[String]
  
  /**
    * Determines the angle between the leaving and returning edges in loops. Positive
    * values result in clockwise looping and negative values result in counter-clockwise
    * looping. Default is `-90deg`.
    */
  var `loop-sweep`: PropertyValueEdge[String]
}
object LoopEdges {
  
  inline def apply(`loop-direction`: PropertyValueEdge[String], `loop-sweep`: PropertyValueEdge[String]): LoopEdges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loop-direction")(`loop-direction`.asInstanceOf[js.Any])
    __obj.updateDynamic("loop-sweep")(`loop-sweep`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoopEdges]
  }
  
  extension [Self <: LoopEdges](x: Self) {
    
    inline def `setLoop-direction`(value: PropertyValueEdge[String]): Self = StObject.set(x, "loop-direction", value.asInstanceOf[js.Any])
    
    inline def `setLoop-directionFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "loop-direction", js.Any.fromFunction1(value))
    
    inline def `setLoop-sweep`(value: PropertyValueEdge[String]): Self = StObject.set(x, "loop-sweep", value.asInstanceOf[js.Any])
    
    inline def `setLoop-sweepFunction1`(value: EdgeSingular => String): Self = StObject.set(x, "loop-sweep", js.Any.fromFunction1(value))
  }
}
