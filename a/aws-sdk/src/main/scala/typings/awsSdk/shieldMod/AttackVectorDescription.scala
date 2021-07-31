package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackVectorDescription extends StObject {
  
  /**
    * The attack type. Valid values:   UDP_TRAFFIC   UDP_FRAGMENT   GENERIC_UDP_REFLECTION   DNS_REFLECTION   NTP_REFLECTION   CHARGEN_REFLECTION   SSDP_REFLECTION   PORT_MAPPER   RIP_REFLECTION   SNMP_REFLECTION   MSSQL_REFLECTION   NET_BIOS_REFLECTION   SYN_FLOOD   ACK_FLOOD   REQUEST_FLOOD   HTTP_REFLECTION   UDS_REFLECTION   MEMCACHED_REFLECTION  
    */
  var VectorType: String
}
object AttackVectorDescription {
  
  @scala.inline
  def apply(VectorType: String): AttackVectorDescription = {
    val __obj = js.Dynamic.literal(VectorType = VectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackVectorDescription]
  }
  
  @scala.inline
  implicit class AttackVectorDescriptionMutableBuilder[Self <: AttackVectorDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVectorType(value: String): Self = StObject.set(x, "VectorType", value.asInstanceOf[js.Any])
  }
}
