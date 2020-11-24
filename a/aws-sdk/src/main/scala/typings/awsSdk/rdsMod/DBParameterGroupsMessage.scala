package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBParameterGroupsMessage extends js.Object {
  
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
  implicit class DBParameterGroupsMessageOps[Self <: DBParameterGroupsMessage] (val x: Self) extends AnyVal {
    
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
    def setDBParameterGroupsVarargs(value: DBParameterGroup*): Self = this.set("DBParameterGroups", js.Array(value :_*))
    
    @scala.inline
    def setDBParameterGroups(value: DBParameterGroupList): Self = this.set("DBParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBParameterGroups: Self = this.set("DBParameterGroups", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
