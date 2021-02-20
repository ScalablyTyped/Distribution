package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEnvironmentRequest extends StObject {
  
  /**
    * The ID of the environment to delete.
    */
  var environmentId: EnvironmentId = js.native
}
object DeleteEnvironmentRequest {
  
  @scala.inline
  def apply(environmentId: EnvironmentId): DeleteEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEnvironmentRequest]
  }
  
  @scala.inline
  implicit class DeleteEnvironmentRequestMutableBuilder[Self <: DeleteEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
