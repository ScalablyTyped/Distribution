package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTestGridProjectRequest extends StObject {
  
  /**
    * Human-readable description of the project.
    */
  var description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * Human-readable name of the Selenium testing project.
    */
  var name: ResourceName
}
object CreateTestGridProjectRequest {
  
  @scala.inline
  def apply(name: ResourceName): CreateTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTestGridProjectRequest]
  }
  
  @scala.inline
  implicit class CreateTestGridProjectRequestMutableBuilder[Self <: CreateTestGridProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ResourceDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
