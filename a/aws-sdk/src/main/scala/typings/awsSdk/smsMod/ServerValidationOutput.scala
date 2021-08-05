package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerValidationOutput extends StObject {
  
  var server: js.UndefOr[Server] = js.undefined
}
object ServerValidationOutput {
  
  inline def apply(): ServerValidationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerValidationOutput]
  }
  
  extension [Self <: ServerValidationOutput](x: Self) {
    
    inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
