package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerValidationOutput extends StObject {
  
  var server: js.UndefOr[Server] = js.native
}
object ServerValidationOutput {
  
  @scala.inline
  def apply(): ServerValidationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerValidationOutput]
  }
  
  @scala.inline
  implicit class ServerValidationOutputMutableBuilder[Self <: ServerValidationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
