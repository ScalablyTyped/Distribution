package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterDbRevision extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A string representing the current cluster version.
    */
  var CurrentDatabaseRevision: js.UndefOr[String] = js.native
  /**
    * The date on which the database revision was released.
    */
  var DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.native
  /**
    * A list of RevisionTarget objects, where each object describes the database revision that a cluster can be updated to.
    */
  var RevisionTargets: js.UndefOr[RevisionTargetsList] = js.native
}

object ClusterDbRevision {
  @scala.inline
  def apply(): ClusterDbRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterDbRevision]
  }
  @scala.inline
  implicit class ClusterDbRevisionOps[Self <: ClusterDbRevision] (val x: Self) extends AnyVal {
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    @scala.inline
    def setCurrentDatabaseRevision(value: String): Self = this.set("CurrentDatabaseRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentDatabaseRevision: Self = this.set("CurrentDatabaseRevision", js.undefined)
    @scala.inline
    def setDatabaseRevisionReleaseDate(value: TStamp): Self = this.set("DatabaseRevisionReleaseDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseRevisionReleaseDate: Self = this.set("DatabaseRevisionReleaseDate", js.undefined)
    @scala.inline
    def setRevisionTargetsVarargs(value: RevisionTarget*): Self = this.set("RevisionTargets", js.Array(value :_*))
    @scala.inline
    def setRevisionTargets(value: RevisionTargetsList): Self = this.set("RevisionTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionTargets: Self = this.set("RevisionTargets", js.undefined)
  }
  
}

