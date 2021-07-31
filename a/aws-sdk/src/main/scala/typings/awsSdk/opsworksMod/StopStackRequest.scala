package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopStackRequest extends StObject {
  
  /**
    * The stack ID.
    */
  var StackId: String
}
object StopStackRequest {
  
  @scala.inline
  def apply(StackId: String): StopStackRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStackRequest]
  }
  
  @scala.inline
  implicit class StopStackRequestMutableBuilder[Self <: StopStackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
