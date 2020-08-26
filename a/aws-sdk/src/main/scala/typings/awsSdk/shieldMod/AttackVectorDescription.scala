package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttackVectorDescription extends js.Object {
  /**
    * The attack type. Valid values:   UDP_TRAFFIC   UDP_FRAGMENT   GENERIC_UDP_REFLECTION   DNS_REFLECTION   NTP_REFLECTION   CHARGEN_REFLECTION   SSDP_REFLECTION   PORT_MAPPER   RIP_REFLECTION   SNMP_REFLECTION   MSSQL_REFLECTION   NET_BIOS_REFLECTION   SYN_FLOOD   ACK_FLOOD   REQUEST_FLOOD   HTTP_REFLECTION   UDS_REFLECTION   MEMCACHED_REFLECTION  
    */
  var VectorType: String = js.native
}

object AttackVectorDescription {
  @scala.inline
  def apply(VectorType: String): AttackVectorDescription = {
    val __obj = js.Dynamic.literal(VectorType = VectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackVectorDescription]
  }
  @scala.inline
  implicit class AttackVectorDescriptionOps[Self <: AttackVectorDescription] (val x: Self) extends AnyVal {
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
    def setVectorType(value: String): Self = this.set("VectorType", value.asInstanceOf[js.Any])
  }
  
}

