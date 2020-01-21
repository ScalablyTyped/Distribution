package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBClusterMessage extends js.Object {
  /**
    * The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case-sensitive. Constraints:   Must match an existing DBClusterIdentifier.  
    */
  var DBClusterIdentifier: String = js.native
  /**
    *  The DB cluster snapshot identifier of the new DB cluster snapshot created when SkipFinalSnapshot is disabled.    Specifying this parameter and also skipping the creation of a final DB cluster snapshot with the SkipFinalShapshot parameter results in an error.  Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens  
    */
  var FinalDBSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether to skip the creation of a final DB cluster snapshot before the DB cluster is deleted. If skip is specified, no DB cluster snapshot is created. If skip isn't specified, a DB cluster snapshot is created before the DB cluster is deleted. By default, skip isn't specified, and the DB cluster snapshot is created. By default, this parameter is disabled.  You must specify a FinalDBSnapshotIdentifier parameter if SkipFinalSnapshot is disabled. 
    */
  var SkipFinalSnapshot: js.UndefOr[Boolean] = js.native
}

object DeleteDBClusterMessage {
  @scala.inline
  def apply(
    DBClusterIdentifier: String,
    FinalDBSnapshotIdentifier: String = null,
    SkipFinalSnapshot: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    if (FinalDBSnapshotIdentifier != null) __obj.updateDynamic("FinalDBSnapshotIdentifier")(FinalDBSnapshotIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(SkipFinalSnapshot)) __obj.updateDynamic("SkipFinalSnapshot")(SkipFinalSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBClusterMessage]
  }
}

