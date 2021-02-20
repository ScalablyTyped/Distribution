package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterParameterGroupsMessage extends StObject {
  
  /**
    * A list of DB cluster parameter groups.
    */
  var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList] = js.native
  
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterParameterGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}
object DBClusterParameterGroupsMessage {
  
  @scala.inline
  def apply(): DBClusterParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterParameterGroupsMessage]
  }
  
  @scala.inline
  implicit class DBClusterParameterGroupsMessageMutableBuilder[Self <: DBClusterParameterGroupsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterParameterGroups(value: DBClusterParameterGroupList): Self = StObject.set(x, "DBClusterParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterParameterGroupsUndefined: Self = StObject.set(x, "DBClusterParameterGroups", js.undefined)
    
    @scala.inline
    def setDBClusterParameterGroupsVarargs(value: DBClusterParameterGroup*): Self = StObject.set(x, "DBClusterParameterGroups", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
