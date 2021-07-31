package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBEngineVersionMessage extends StObject {
  
  /**
    *  A list of DBEngineVersion elements.
    */
  var DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBEngineVersionMessage {
  
  @scala.inline
  def apply(): DBEngineVersionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBEngineVersionMessage]
  }
  
  @scala.inline
  implicit class DBEngineVersionMessageMutableBuilder[Self <: DBEngineVersionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBEngineVersions(value: DBEngineVersionList): Self = StObject.set(x, "DBEngineVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBEngineVersionsUndefined: Self = StObject.set(x, "DBEngineVersions", js.undefined)
    
    @scala.inline
    def setDBEngineVersionsVarargs(value: DBEngineVersion*): Self = StObject.set(x, "DBEngineVersions", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
