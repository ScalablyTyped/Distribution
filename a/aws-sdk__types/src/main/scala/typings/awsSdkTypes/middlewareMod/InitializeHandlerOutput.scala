package typings.awsSdkTypes.middlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializeHandlerOutput[Output /* <: js.Object */]
  extends StObject
     with DeserializeHandlerOutput[Output] {
  
  @JSName("output")
  var output_InitializeHandlerOutput: Output
}
object InitializeHandlerOutput {
  
  inline def apply[Output /* <: js.Object */](output: Output, response: js.Any): InitializeHandlerOutput[Output] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeHandlerOutput[Output]]
  }
  
  extension [Self <: InitializeHandlerOutput[?], Output /* <: js.Object */](x: Self & InitializeHandlerOutput[Output]) {
    
    inline def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
