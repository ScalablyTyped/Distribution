package typings.cassandraDriver.mod

import typings.cassandraDriver.anon.Enabled
import typings.cassandraDriver.typesMod.types.Uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DseClientOptions extends ClientOptions {
  var applicationName: js.UndefOr[String] = js.native
  var applicationVersion: js.UndefOr[String] = js.native
  var graphOptions: js.UndefOr[GraphOptions] = js.native
  var id: js.UndefOr[Uuid] = js.native
  var monitorReporting: js.UndefOr[Enabled] = js.native
}

object DseClientOptions {
  @scala.inline
  def apply(): DseClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DseClientOptions]
  }
  @scala.inline
  implicit class DseClientOptionsOps[Self <: DseClientOptions] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    @scala.inline
    def setApplicationVersion(value: String): Self = this.set("applicationVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationVersion: Self = this.set("applicationVersion", js.undefined)
    @scala.inline
    def setGraphOptions(value: GraphOptions): Self = this.set("graphOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphOptions: Self = this.set("graphOptions", js.undefined)
    @scala.inline
    def setId(value: Uuid): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMonitorReporting(value: Enabled): Self = this.set("monitorReporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitorReporting: Self = this.set("monitorReporting", js.undefined)
  }
  
}

