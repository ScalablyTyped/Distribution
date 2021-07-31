package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartStackRequest extends StObject {
  
  /**
    * The stack ID.
    */
  var StackId: String
}
object StartStackRequest {
  
  @scala.inline
  def apply(StackId: String): StartStackRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartStackRequest]
  }
  
  @scala.inline
  implicit class StartStackRequestMutableBuilder[Self <: StartStackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
