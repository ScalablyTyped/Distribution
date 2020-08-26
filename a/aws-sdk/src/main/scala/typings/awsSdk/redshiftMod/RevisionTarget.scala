package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionTarget extends js.Object {
  /**
    * A unique string that identifies the version to update the cluster to. You can use this value in ModifyClusterDbRevision.
    */
  var DatabaseRevision: js.UndefOr[String] = js.native
  /**
    * The date on which the database revision was released.
    */
  var DatabaseRevisionReleaseDate: js.UndefOr[TStamp] = js.native
  /**
    * A string that describes the changes and features that will be applied to the cluster when it is updated to the corresponding ClusterDbRevision.
    */
  var Description: js.UndefOr[String] = js.native
}

object RevisionTarget {
  @scala.inline
  def apply(): RevisionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionTarget]
  }
  @scala.inline
  implicit class RevisionTargetOps[Self <: RevisionTarget] (val x: Self) extends AnyVal {
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
    def setDatabaseRevision(value: String): Self = this.set("DatabaseRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseRevision: Self = this.set("DatabaseRevision", js.undefined)
    @scala.inline
    def setDatabaseRevisionReleaseDate(value: TStamp): Self = this.set("DatabaseRevisionReleaseDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseRevisionReleaseDate: Self = this.set("DatabaseRevisionReleaseDate", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

