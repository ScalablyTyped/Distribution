package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApplicationRequest extends StObject {
  
  /**
    * The name or ID of the application that will be updated.
    */
  var application: ApplicationSpecifier = js.native
  
  /**
    * The new description of the application.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The new name of the application. The name must be unique in the region in which you are updating the application.
    */
  var name: js.UndefOr[Name] = js.native
}
object UpdateApplicationRequest {
  
  @scala.inline
  def apply(application: ApplicationSpecifier): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  @scala.inline
  implicit class UpdateApplicationRequestMutableBuilder[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: ApplicationSpecifier): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
