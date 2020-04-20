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
}

