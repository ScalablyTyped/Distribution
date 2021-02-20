package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBParameterGroupsMessage extends StObject {
  
  /**
    *  A list of DBParameterGroup instances. 
    */
  var DBParameterGroups: js.UndefOr[DBParameterGroupList] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object DBParameterGroupsMessage {
  
  @scala.inline
  def apply(): DBParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBParameterGroupsMessage]
  }
  
  @scala.inline
  implicit class DBParameterGroupsMessageMutableBuilder[Self <: DBParameterGroupsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBParameterGroups(value: DBParameterGroupList): Self = StObject.set(x, "DBParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBParameterGroupsUndefined: Self = StObject.set(x, "DBParameterGroups", js.undefined)
    
    @scala.inline
    def setDBParameterGroupsVarargs(value: DBParameterGroup*): Self = StObject.set(x, "DBParameterGroups", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
