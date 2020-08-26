package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftDatabase extends js.Object {
  var ClusterIdentifier: RedshiftClusterIdentifier = js.native
  var DatabaseName: RedshiftDatabaseName = js.native
}

object RedshiftDatabase {
  @scala.inline
  def apply(ClusterIdentifier: RedshiftClusterIdentifier, DatabaseName: RedshiftDatabaseName): RedshiftDatabase = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDatabase]
  }
  @scala.inline
  implicit class RedshiftDatabaseOps[Self <: RedshiftDatabase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterIdentifier(value: RedshiftClusterIdentifier): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseName(value: RedshiftDatabaseName): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
  }
  
}

