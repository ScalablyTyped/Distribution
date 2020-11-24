package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBSecurityGroupMessage extends js.Object {
  
  /**
    *  A list of DBSecurityGroup instances. 
    */
  var DBSecurityGroups: js.UndefOr[typings.awsSdk.rdsMod.DBSecurityGroups] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object DBSecurityGroupMessage {
  
  @scala.inline
  def apply(): DBSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSecurityGroupMessage]
  }
  
  @scala.inline
  implicit class DBSecurityGroupMessageOps[Self <: DBSecurityGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setDBSecurityGroupsVarargs(value: DBSecurityGroup*): Self = this.set("DBSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setDBSecurityGroups(value: DBSecurityGroups): Self = this.set("DBSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSecurityGroups: Self = this.set("DBSecurityGroups", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
