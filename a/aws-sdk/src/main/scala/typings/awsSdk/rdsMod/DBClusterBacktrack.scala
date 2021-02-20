package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterBacktrack extends StObject {
  
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
  implicit class DBClusterBacktrackMutableBuilder[Self <: DBClusterBacktrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacktrackIdentifier(value: String): Self = StObject.set(x, "BacktrackIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacktrackIdentifierUndefined: Self = StObject.set(x, "BacktrackIdentifier", js.undefined)
    
    @scala.inline
    def setBacktrackRequestCreationTime(value: TStamp): Self = StObject.set(x, "BacktrackRequestCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacktrackRequestCreationTimeUndefined: Self = StObject.set(x, "BacktrackRequestCreationTime", js.undefined)
    
    @scala.inline
    def setBacktrackTo(value: TStamp): Self = StObject.set(x, "BacktrackTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacktrackToUndefined: Self = StObject.set(x, "BacktrackTo", js.undefined)
    
    @scala.inline
    def setBacktrackedFrom(value: TStamp): Self = StObject.set(x, "BacktrackedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacktrackedFromUndefined: Self = StObject.set(x, "BacktrackedFrom", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
