package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrestoParameters extends js.Object {
  /**
    * Catalog.
    */
  var Catalog: typings.awsSdk.quicksightMod.Catalog = js.native
  /**
    * Host.
    */
  var Host: typings.awsSdk.quicksightMod.Host = js.native
  /**
    * Port.
    */
  var Port: typings.awsSdk.quicksightMod.Port = js.native
}

object PrestoParameters {
  @scala.inline
  def apply(Catalog: Catalog, Host: Host, Port: Port): PrestoParameters = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrestoParameters]
  }
  @scala.inline
  implicit class PrestoParametersOps[Self <: PrestoParameters] (val x: Self) extends AnyVal {
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
    def setCatalog(value: Catalog): Self = this.set("Catalog", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: Host): Self = this.set("Host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Port): Self = this.set("Port", value.asInstanceOf[js.Any])
  }
  
}

