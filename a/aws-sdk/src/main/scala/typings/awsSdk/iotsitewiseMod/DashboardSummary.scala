package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardSummary extends StObject {
  
  /**
    * The date the dashboard was created, in Unix epoch time.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The dashboard's description.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the dashboard.
    */
  var id: ID
  
  /**
    * The date the dashboard was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the dashboard
    */
  var name: Name
}
object DashboardSummary {
  
  inline def apply(id: ID, name: Name): DashboardSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardSummary]
  }
  
  extension [Self <: DashboardSummary](x: Self) {
    
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
