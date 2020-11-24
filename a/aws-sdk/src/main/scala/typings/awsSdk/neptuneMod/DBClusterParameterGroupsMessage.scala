package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterParameterGroupsMessage extends js.Object {
  
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
  implicit class DBClusterParameterGroupsMessageOps[Self <: DBClusterParameterGroupsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDBClusterParameterGroupsVarargs(value: DBClusterParameterGroup*): Self = this.set("DBClusterParameterGroups", js.Array(value :_*))
    
    @scala.inline
    def setDBClusterParameterGroups(value: DBClusterParameterGroupList): Self = this.set("DBClusterParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterParameterGroups: Self = this.set("DBClusterParameterGroups", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
