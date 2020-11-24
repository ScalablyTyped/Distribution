package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterBacktrackMessage extends js.Object {
  
  /**
    * Contains a list of backtracks for the user.
    */
  var DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList] = js.native
  
  /**
    * A pagination token that can be used in a later DescribeDBClusterBacktracks request.
    */
  var Marker: js.UndefOr[String] = js.native
}
object DBClusterBacktrackMessage {
  
  @scala.inline
  def apply(): DBClusterBacktrackMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterBacktrackMessage]
  }
  
  @scala.inline
  implicit class DBClusterBacktrackMessageOps[Self <: DBClusterBacktrackMessage] (val x: Self) extends AnyVal {
    
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
    def setDBClusterBacktracksVarargs(value: DBClusterBacktrack*): Self = this.set("DBClusterBacktracks", js.Array(value :_*))
    
    @scala.inline
    def setDBClusterBacktracks(value: DBClusterBacktrackList): Self = this.set("DBClusterBacktracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterBacktracks: Self = this.set("DBClusterBacktracks", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
