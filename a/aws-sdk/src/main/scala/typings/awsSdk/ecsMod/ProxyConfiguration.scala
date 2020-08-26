package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConfiguration extends js.Object {
  /**
    * The name of the container that will serve as the App Mesh proxy.
    */
  var containerName: String = js.native
  /**
    * The set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified as key-value pairs.    IgnoredUID - (Required) The user ID (UID) of the proxy container as defined by the user parameter in a container definition. This is used to ensure the proxy ignores its own traffic. If IgnoredGID is specified, this field can be empty.    IgnoredGID - (Required) The group ID (GID) of the proxy container as defined by the user parameter in a container definition. This is used to ensure the proxy ignores its own traffic. If IgnoredUID is specified, this field can be empty.    AppPorts - (Required) The list of ports that the application uses. Network traffic to these ports is forwarded to the ProxyIngressPort and ProxyEgressPort.    ProxyIngressPort - (Required) Specifies the port that incoming traffic to the AppPorts is directed to.    ProxyEgressPort - (Required) Specifies the port that outgoing traffic from the AppPorts is directed to.    EgressIgnoredPorts - (Required) The egress traffic going to the specified ports is ignored and not redirected to the ProxyEgressPort. It can be an empty list.    EgressIgnoredIPs - (Required) The egress traffic going to the specified IP addresses is ignored and not redirected to the ProxyEgressPort. It can be an empty list.  
    */
  var properties: js.UndefOr[ProxyConfigurationProperties] = js.native
  /**
    * The proxy type. The only supported value is APPMESH.
    */
  var `type`: js.UndefOr[ProxyConfigurationType] = js.native
}

object ProxyConfiguration {
  @scala.inline
  def apply(containerName: String): ProxyConfiguration = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfiguration]
  }
  @scala.inline
  implicit class ProxyConfigurationOps[Self <: ProxyConfiguration] (val x: Self) extends AnyVal {
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
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertiesVarargs(value: KeyValuePair*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: ProxyConfigurationProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setType(value: ProxyConfigurationType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

