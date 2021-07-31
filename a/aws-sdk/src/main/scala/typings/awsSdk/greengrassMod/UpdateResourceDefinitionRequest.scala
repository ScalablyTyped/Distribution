package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceDefinitionRequest extends StObject {
  
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: string
}
object UpdateResourceDefinitionRequest {
  
  @scala.inline
  def apply(ResourceDefinitionId: string): UpdateResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceDefinitionRequest]
  }
  
  @scala.inline
  implicit class UpdateResourceDefinitionRequestMutableBuilder[Self <: UpdateResourceDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setResourceDefinitionId(value: string): Self = StObject.set(x, "ResourceDefinitionId", value.asInstanceOf[js.Any])
  }
}
