package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProjectResponse extends StObject {
  
  /**
    * The date and time that the project was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  
  /**
    * The name of the project that you updated.
    */
  var Name: ProjectName = js.native
}
object UpdateProjectResponse {
  
  @scala.inline
  def apply(Name: ProjectName): UpdateProjectResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectResponse]
  }
  
  @scala.inline
  implicit class UpdateProjectResponseMutableBuilder[Self <: UpdateProjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
