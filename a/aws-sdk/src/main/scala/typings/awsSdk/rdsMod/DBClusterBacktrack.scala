package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterBacktrack extends js.Object {
  
  /**
    * Contains the backtrack identifier.
    */
  var BacktrackIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The timestamp of the time at which the backtrack was requested.
    */
  var BacktrackRequestCreationTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The timestamp of the time to which the DB cluster was backtracked.
    */
  var BacktrackTo: js.UndefOr[TStamp] = js.native
  
  /**
    * The timestamp of the time from which the DB cluster was backtracked.
    */
  var BacktrackedFrom: js.UndefOr[TStamp] = js.native
  
  /**
    * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The status of the backtrack. This property returns one of the following values:    applying - The backtrack is currently being applied to or rolled back from the DB cluster.    completed - The backtrack has successfully been applied to or rolled back from the DB cluster.    failed - An error occurred while the backtrack was applied to or rolled back from the DB cluster.    pending - The backtrack is currently pending application to or rollback from the DB cluster.  
    */
  var Status: js.UndefOr[String] = js.native
}
object DBClusterBacktrack {
  
  @scala.inline
  def apply(): DBClusterBacktrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterBacktrack]
  }
  
  @scala.inline
  implicit class DBClusterBacktrackOps[Self <: DBClusterBacktrack] (val x: Self) extends AnyVal {
    
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
    def setBacktrackIdentifier(value: String): Self = this.set("BacktrackIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBacktrackIdentifier: Self = this.set("BacktrackIdentifier", js.undefined)
    
    @scala.inline
    def setBacktrackRequestCreationTime(value: TStamp): Self = this.set("BacktrackRequestCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBacktrackRequestCreationTime: Self = this.set("BacktrackRequestCreationTime", js.undefined)
    
    @scala.inline
    def setBacktrackTo(value: TStamp): Self = this.set("BacktrackTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBacktrackTo: Self = this.set("BacktrackTo", js.undefined)
    
    @scala.inline
    def setBacktrackedFrom(value: TStamp): Self = this.set("BacktrackedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBacktrackedFrom: Self = this.set("BacktrackedFrom", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterIdentifier: Self = this.set("DBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
