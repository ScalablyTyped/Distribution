package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBEngineVersionMessage extends js.Object {
  
  /**
    * Detailed information about one or more engine versions.
    */
  var DBEngineVersions: js.UndefOr[DBEngineVersionList] = js.native
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
}
object DBEngineVersionMessage {
  
  @scala.inline
  def apply(): DBEngineVersionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBEngineVersionMessage]
  }
  
  @scala.inline
  implicit class DBEngineVersionMessageOps[Self <: DBEngineVersionMessage] (val x: Self) extends AnyVal {
    
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
    def setDBEngineVersionsVarargs(value: DBEngineVersion*): Self = this.set("DBEngineVersions", js.Array(value :_*))
    
    @scala.inline
    def setDBEngineVersions(value: DBEngineVersionList): Self = this.set("DBEngineVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBEngineVersions: Self = this.set("DBEngineVersions", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
