package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBSnapshotMessage extends js.Object {
  
  /**
    *  A list of DBSnapshot instances. 
    */
  var DBSnapshots: js.UndefOr[DBSnapshotList] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object DBSnapshotMessage {
  
  @scala.inline
  def apply(): DBSnapshotMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSnapshotMessage]
  }
  
  @scala.inline
  implicit class DBSnapshotMessageOps[Self <: DBSnapshotMessage] (val x: Self) extends AnyVal {
    
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
    def setDBSnapshotsVarargs(value: DBSnapshot*): Self = this.set("DBSnapshots", js.Array(value :_*))
    
    @scala.inline
    def setDBSnapshots(value: DBSnapshotList): Self = this.set("DBSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSnapshots: Self = this.set("DBSnapshots", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
