package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBInstanceMessage extends js.Object {
  /**
    * The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive. Constraints:   Must match the name of an existing DB instance.  
    */
  var DBInstanceIdentifier: String = js.native
  /**
    * A value that indicates whether to remove automated backups immediately after the DB instance is deleted. This parameter isn't case-sensitive. The default is to remove automated backups immediately after the DB instance is deleted.
    */
  var DeleteAutomatedBackups: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The DBSnapshotIdentifier of the new DBSnapshot created when the SkipFinalSnapshot parameter is disabled.   Specifying this parameter and also specifying to skip final DB snapshot creation in SkipFinalShapshot results in an error.  Constraints:   Must be 1 to 255 letters or numbers.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Can't be specified when deleting a Read Replica.  
    */
  var FinalDBSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether to skip the creation of a final DB snapshot before the DB instance is deleted. If skip is specified, no DB snapshot is created. If skip isn't specified, a DB snapshot is created before the DB instance is deleted. By default, skip isn't specified, and the DB snapshot is created. Note that when a DB instance is in a failure state and has a status of 'failed', 'incompatible-restore', or 'incompatible-network', it can only be deleted when skip is specified. Specify skip when deleting a Read Replica.  The FinalDBSnapshotIdentifier parameter must be specified if skip isn't specified. 
    */
  var SkipFinalSnapshot: js.UndefOr[Boolean] = js.native
}

object DeleteDBInstanceMessage {
  @scala.inline
  def apply(
    DBInstanceIdentifier: String,
    DeleteAutomatedBackups: js.UndefOr[scala.Boolean] = js.undefined,
    FinalDBSnapshotIdentifier: String = null,
    SkipFinalSnapshot: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteAutomatedBackups)) __obj.updateDynamic("DeleteAutomatedBackups")(DeleteAutomatedBackups.asInstanceOf[js.Any])
    if (FinalDBSnapshotIdentifier != null) __obj.updateDynamic("FinalDBSnapshotIdentifier")(FinalDBSnapshotIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(SkipFinalSnapshot)) __obj.updateDynamic("SkipFinalSnapshot")(SkipFinalSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBInstanceMessage]
  }
}

