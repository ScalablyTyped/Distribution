package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeInterface extends StObject {
  
  /**
    * The node interface's inputs.
    */
  var Inputs: InputPortList
  
  /**
    * The node interface's outputs.
    */
  var Outputs: OutputPortList
}
object NodeInterface {
  
  inline def apply(Inputs: InputPortList, Outputs: OutputPortList): NodeInterface = {
    val __obj = js.Dynamic.literal(Inputs = Inputs.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInterface]
  }
  
  extension [Self <: NodeInterface](x: Self) {
    
    inline def setInputs(value: InputPortList): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeInputPort*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setOutputs(value: OutputPortList): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: NodeOutputPort*): Self = StObject.set(x, "Outputs", js.Array(value*))
  }
}
