package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBSubnetGroupMessage extends StObject {
  
  /**
    *  A list of DBSubnetGroup instances.
    */
  var DBSubnetGroups: js.UndefOr[typings.awsSdk.neptuneMod.DBSubnetGroups] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBSubnetGroupMessage {
  
  inline def apply(): DBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSubnetGroupMessage]
  }
  
  extension [Self <: DBSubnetGroupMessage](x: Self) {
    
    inline def setDBSubnetGroups(value: DBSubnetGroups): Self = StObject.set(x, "DBSubnetGroups", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupsUndefined: Self = StObject.set(x, "DBSubnetGroups", js.undefined)
    
    inline def setDBSubnetGroupsVarargs(value: DBSubnetGroup*): Self = StObject.set(x, "DBSubnetGroups", js.Array(value :_*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
