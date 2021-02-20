package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCoreDefinitionRequest extends StObject {
  
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string = js.native
}
object DeleteCoreDefinitionRequest {
  
  @scala.inline
  def apply(CoreDefinitionId: string): DeleteCoreDefinitionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCoreDefinitionRequest]
  }
  
  @scala.inline
  implicit class DeleteCoreDefinitionRequestMutableBuilder[Self <: DeleteCoreDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoreDefinitionId(value: string): Self = StObject.set(x, "CoreDefinitionId", value.asInstanceOf[js.Any])
  }
}
