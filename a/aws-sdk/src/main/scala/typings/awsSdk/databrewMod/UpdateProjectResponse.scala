package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectResponse extends StObject {
  
  /**
    * The date and time that the project was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.undefined
  
  /**
    * The name of the project that you updated.
    */
  var Name: ProjectName
}
object UpdateProjectResponse {
  
  inline def apply(Name: ProjectName): UpdateProjectResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectResponse]
  }
  
  extension [Self <: UpdateProjectResponse](x: Self) {
    
    inline def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
