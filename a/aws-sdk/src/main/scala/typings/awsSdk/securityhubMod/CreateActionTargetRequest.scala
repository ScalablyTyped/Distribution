package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateActionTargetRequest extends StObject {
  
  /**
    * The description for the custom action target.
    */
  var Description: NonEmptyString = js.native
  
  /**
    * The ID for the custom action target.
    */
  var Id: NonEmptyString = js.native
  
  /**
    * The name of the custom action target.
    */
  var Name: NonEmptyString = js.native
}
object CreateActionTargetRequest {
  
  @scala.inline
  def apply(Description: NonEmptyString, Id: NonEmptyString, Name: NonEmptyString): CreateActionTargetRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActionTargetRequest]
  }
  
  @scala.inline
  implicit class CreateActionTargetRequestMutableBuilder[Self <: CreateActionTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
