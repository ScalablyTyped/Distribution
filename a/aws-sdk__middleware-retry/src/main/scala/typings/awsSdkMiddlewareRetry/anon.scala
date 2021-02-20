package typings.awsSdkMiddlewareRetry

import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Output[Ouput /* <: MetadataBearer */] extends StObject {
    
    var output: Ouput = js.native
    
    var response: js.Any = js.native
  }
  object Output {
    
    @scala.inline
    def apply[Ouput /* <: MetadataBearer */](output: Ouput, response: js.Any): Output[Ouput] = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output[Ouput]]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output[_], Ouput /* <: MetadataBearer */] (val x: Self with Output[Ouput]) extends AnyVal {
      
      @scala.inline
      def setOutput(value: Ouput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
