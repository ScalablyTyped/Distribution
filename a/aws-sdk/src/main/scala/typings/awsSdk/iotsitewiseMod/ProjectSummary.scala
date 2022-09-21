package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectSummary extends StObject {
  
  /**
    * The date the project was created, in Unix epoch time.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The project's description.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the project.
    */
  var id: ID
  
  /**
    * The date the project was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the project.
    */
  var name: Name
}
object ProjectSummary {
  
  inline def apply(id: ID, name: Name): ProjectSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSummary]
  }
  
  extension [Self <: ProjectSummary](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDate(value: js.Date): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateUndefined: Self = StObject.set(x, "lastUpdateDate", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
