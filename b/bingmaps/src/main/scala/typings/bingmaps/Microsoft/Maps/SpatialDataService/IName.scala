package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IName extends StObject {
  
  /** The culture of the region. */
  var Culture: String
  
  /** The name of boundary. Example: "United States" */
  var EntityName: String
  
  /** An ID identifying the data provider that supplied the data. */
  var SourceID: String
}
object IName {
  
  inline def apply(Culture: String, EntityName: String, SourceID: String): IName = {
    val __obj = js.Dynamic.literal(Culture = Culture.asInstanceOf[js.Any], EntityName = EntityName.asInstanceOf[js.Any], SourceID = SourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IName]
  }
  
  extension [Self <: IName](x: Self) {
    
    inline def setCulture(value: String): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    inline def setEntityName(value: String): Self = StObject.set(x, "EntityName", value.asInstanceOf[js.Any])
    
    inline def setSourceID(value: String): Self = StObject.set(x, "SourceID", value.asInstanceOf[js.Any])
  }
}
