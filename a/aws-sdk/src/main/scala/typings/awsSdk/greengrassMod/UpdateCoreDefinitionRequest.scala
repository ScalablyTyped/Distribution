package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCoreDefinitionRequest extends StObject {
  
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string
  
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.undefined
}
object UpdateCoreDefinitionRequest {
  
  @scala.inline
  def apply(CoreDefinitionId: string): UpdateCoreDefinitionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCoreDefinitionRequest]
  }
  
  @scala.inline
  implicit class UpdateCoreDefinitionRequestMutableBuilder[Self <: UpdateCoreDefinitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoreDefinitionId(value: string): Self = StObject.set(x, "CoreDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
