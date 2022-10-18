package typings.babylonjs.anon

import typings.babylonjs.mathsMathMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentIndex extends StObject {
  
  var agentIndex: Double
  
  var destination: Vector3
}
object AgentIndex {
  
  inline def apply(agentIndex: Double, destination: Vector3): AgentIndex = {
    val __obj = js.Dynamic.literal(agentIndex = agentIndex.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentIndex]
  }
  
  extension [Self <: AgentIndex](x: Self) {
    
    inline def setAgentIndex(value: Double): Self = StObject.set(x, "agentIndex", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: Vector3): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
