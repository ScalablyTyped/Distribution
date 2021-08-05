package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBEngineVersionMessage extends StObject {
  
  /**
    * Detailed information about one or more engine versions.
    */
  var DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBEngineVersionMessage {
  
  inline def apply(): DBEngineVersionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBEngineVersionMessage]
  }
  
  extension [Self <: DBEngineVersionMessage](x: Self) {
    
    inline def setDBEngineVersions(value: DBEngineVersionList): Self = StObject.set(x, "DBEngineVersions", value.asInstanceOf[js.Any])
    
    inline def setDBEngineVersionsUndefined: Self = StObject.set(x, "DBEngineVersions", js.undefined)
    
    inline def setDBEngineVersionsVarargs(value: DBEngineVersion*): Self = StObject.set(x, "DBEngineVersions", js.Array(value :_*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
