package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBInstanceMessage extends StObject {
  
  /**
    *  A list of DBInstance instances.
    */
  var DBInstances: js.UndefOr[DBInstanceList] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords .
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBInstanceMessage {
  
  inline def apply(): DBInstanceMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceMessage]
  }
  
  extension [Self <: DBInstanceMessage](x: Self) {
    
    inline def setDBInstances(value: DBInstanceList): Self = StObject.set(x, "DBInstances", value.asInstanceOf[js.Any])
    
    inline def setDBInstancesUndefined: Self = StObject.set(x, "DBInstances", js.undefined)
    
    inline def setDBInstancesVarargs(value: DBInstance*): Self = StObject.set(x, "DBInstances", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
