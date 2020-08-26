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
  def apply(Database: Database): RedshiftParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftParameters]
  }
  @scala.inline
  implicit class RedshiftParametersOps[Self <: RedshiftParameters] (val x: Self) extends AnyVal {
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
    def setDatabase(value: Database): Self = this.set("Database", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterId: Self = this.set("ClusterId", js.undefined)
    @scala.inline
    def setHost(value: Host): Self = this.set("Host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("Host", js.undefined)
    @scala.inline
    def setPort(value: OptionalPort): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
  }
  
}

