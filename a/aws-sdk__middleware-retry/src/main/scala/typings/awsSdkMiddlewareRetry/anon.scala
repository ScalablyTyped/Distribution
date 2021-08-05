package typings.awsSdkMiddlewareRetry

import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Output[Ouput /* <: MetadataBearer */] extends StObject {
    
    var output: Ouput
    
    var response: js.Any
  }
  object Output {
    
    inline def apply[Ouput /* <: MetadataBearer */](output: Ouput, response: js.Any): Output[Ouput] = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output[Ouput]]
    }
    
    extension [Self <: Output[?], Ouput /* <: MetadataBearer */](x: Self & Output[Ouput]) {
      
      inline def setOutput(value: Ouput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
