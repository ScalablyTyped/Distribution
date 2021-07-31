package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentRequest extends StObject {
  
  /**
    * Any new or replacement description for the environment.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.undefined
  
  /**
    * The ID of the environment to change settings.
    */
  var environmentId: EnvironmentId
  
  /**
    * A replacement name for the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.undefined
}
object UpdateEnvironmentRequest {
  
  @scala.inline
  def apply(environmentId: EnvironmentId): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
  
  @scala.inline
  implicit class UpdateEnvironmentRequestMutableBuilder[Self <: UpdateEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: EnvironmentDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: EnvironmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
