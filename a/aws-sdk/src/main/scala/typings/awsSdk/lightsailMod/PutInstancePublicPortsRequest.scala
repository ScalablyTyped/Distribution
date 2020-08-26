package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInstancePublicPortsRequest extends js.Object {
  /**
    * The name of the instance for which to open ports.
    */
  var instanceName: ResourceName = js.native
  /**
    * An array of objects to describe the ports to open for the specified instance.
    */
  var portInfos: PortInfoList = js.native
}

object PutInstancePublicPortsRequest {
  @scala.inline
  def apply(instanceName: ResourceName, portInfos: PortInfoList): PutInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], portInfos = portInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInstancePublicPortsRequest]
  }
  @scala.inline
  implicit class PutInstancePublicPortsRequestOps[Self <: PutInstancePublicPortsRequest] (val x: Self) extends AnyVal {
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
    def setInstanceName(value: ResourceName): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortInfosVarargs(value: PortInfo*): Self = this.set("portInfos", js.Array(value :_*))
    @scala.inline
    def setPortInfos(value: PortInfoList): Self = this.set("portInfos", value.asInstanceOf[js.Any])
  }
  
}

