package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftParameters extends js.Object {
  /**
    * Cluster ID. This field can be blank if the Host and Port are provided.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.quicksightMod.ClusterId] = js.native
  /**
    * Database.
    */
  var Database: typings.awsSdk.quicksightMod.Database = js.native
  /**
    * Host. This field can be blank if ClusterId is provided.
    */
  var Host: js.UndefOr[typings.awsSdk.quicksightMod.Host] = js.native
  /**
    * Port. This field can be blank if the ClusterId is provided.
    */
  var Port: js.UndefOr[OptionalPort] = js.native
}

object RedshiftParameters {
  @scala.inline
  def apply(
    Database: Database,
    ClusterId: ClusterId = null,
    Host: Host = null,
    Port: Int | scala.Double = null
  ): RedshiftParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any])
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId.asInstanceOf[js.Any])
    if (Host != null) __obj.updateDynamic("Host")(Host.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftParameters]
  }
}

