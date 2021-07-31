package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceDefinitionVersionRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: string
  
  /**
    * A list of resources.
    */
  var Resources: js.UndefOr[listOfResource] = js.undefined
}
object CreateResourceDefinitionVersionRequest {
  
  @scala.inline
  def apply(ResourceDefinitionId: string): CreateResourceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit class CreateResourceDefinitionVersionRequestMutableBuilder[Self <: CreateResourceDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    @scala.inline
    def setResourceDefinitionId(value: string): Self = StObject.set(x, "ResourceDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: listOfResource): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "Resources", js.Array(value :_*))
  }
}
