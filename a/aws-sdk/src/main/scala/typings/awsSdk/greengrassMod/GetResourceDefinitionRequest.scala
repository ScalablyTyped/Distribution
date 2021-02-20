package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceDefinitionRequest extends StObject {
  
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: string = js.native
}
object GetResourceDefinitionRequest {
  
  @scala.inline
  def apply(ResourceDefinitionId: string): GetResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceDefinitionRequest]
  }
  
  @scala.inline
  implicit class GetResourceDefinitionRequestMutableBuilder[Self <: GetResourceDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceDefinitionId(value: string): Self = StObject.set(x, "ResourceDefinitionId", value.asInstanceOf[js.Any])
  }
}
