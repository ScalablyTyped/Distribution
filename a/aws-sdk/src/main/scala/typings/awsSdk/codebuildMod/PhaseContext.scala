package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhaseContext extends StObject {
  
  /**
    * An explanation of the build phase's context. This might include a command ID and an exit code.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * The status code for the context of the build phase.
    */
  var statusCode: js.UndefOr[String] = js.undefined
}
object PhaseContext {
  
  inline def apply(): PhaseContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhaseContext]
  }
  
  extension [Self <: PhaseContext](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
