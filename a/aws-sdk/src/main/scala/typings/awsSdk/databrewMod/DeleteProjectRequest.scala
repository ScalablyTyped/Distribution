package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProjectRequest extends StObject {
  
  /**
    * The name of the project to be deleted.
    */
  var Name: ProjectName
}
object DeleteProjectRequest {
  
  @scala.inline
  def apply(Name: ProjectName): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectRequest]
  }
  
  @scala.inline
  implicit class DeleteProjectRequestMutableBuilder[Self <: DeleteProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
