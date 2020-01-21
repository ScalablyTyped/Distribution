package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    BacktrackIdentifier: String = null,
    BacktrackRequestCreationTime: TStamp = null,
    BacktrackTo: TStamp = null,
    BacktrackedFrom: TStamp = null,
    DBClusterIdentifier: String = null,
    Status: String = null
  ): DBClusterBacktrack = {
    val __obj = js.Dynamic.literal()
    if (BacktrackIdentifier != null) __obj.updateDynamic("BacktrackIdentifier")(BacktrackIdentifier.asInstanceOf[js.Any])
    if (BacktrackRequestCreationTime != null) __obj.updateDynamic("BacktrackRequestCreationTime")(BacktrackRequestCreationTime.asInstanceOf[js.Any])
    if (BacktrackTo != null) __obj.updateDynamic("BacktrackTo")(BacktrackTo.asInstanceOf[js.Any])
    if (BacktrackedFrom != null) __obj.updateDynamic("BacktrackedFrom")(BacktrackedFrom.asInstanceOf[js.Any])
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterBacktrack]
  }
}

