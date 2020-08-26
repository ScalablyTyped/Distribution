package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBClusterMessage extends js.Object {
  /**
    * The cluster identifier for the cluster to be deleted. This parameter isn't case sensitive. Constraints:   Must match an existing DBClusterIdentifier.  
    */
  var DBClusterIdentifier: String = js.native
  /**
    *  The cluster snapshot identifier of the new cluster snapshot created when SkipFinalSnapshot is set to false.    Specifying this parameter and also setting the SkipFinalShapshot parameter to true results in an error.   Constraints:   Must be from 1 to 255 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var FinalDBSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    *  Determines whether a final cluster snapshot is created before the cluster is deleted. If true is specified, no cluster snapshot is created. If false is specified, a cluster snapshot is created before the DB cluster is deleted.   If SkipFinalSnapshot is false, you must specify a FinalDBSnapshotIdentifier parameter.  Default: false 
    */
  var SkipFinalSnapshot: js.UndefOr[Boolean] = js.native
}

object DeleteDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String): DeleteDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBClusterMessage]
  }
  @scala.inline
  implicit class DeleteDBClusterMessageOps[Self <: DeleteDBClusterMessage] (val x: Self) extends AnyVal {
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
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalDBSnapshotIdentifier(value: String): Self = this.set("FinalDBSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalDBSnapshotIdentifier: Self = this.set("FinalDBSnapshotIdentifier", js.undefined)
    @scala.inline
    def setSkipFinalSnapshot(value: Boolean): Self = this.set("SkipFinalSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipFinalSnapshot: Self = this.set("SkipFinalSnapshot", js.undefined)
  }
  
}

