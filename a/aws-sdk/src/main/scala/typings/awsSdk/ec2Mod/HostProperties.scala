package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostProperties extends js.Object {
  
  /**
    * The number of cores on the Dedicated Host.
    */
  var Cores: js.UndefOr[Integer] = js.native
  
  /**
    * The instance family supported by the Dedicated Host. For example, m5.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  
  /**
    * The instance type supported by the Dedicated Host. For example, m5.large. If the host supports multiple instance types, no instanceType is returned.
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    * The number of sockets on the Dedicated Host.
    */
  var Sockets: js.UndefOr[Integer] = js.native
  
  /**
    * The total number of vCPUs on the Dedicated Host.
    */
  var TotalVCpus: js.UndefOr[Integer] = js.native
}
object HostProperties {
  
  @scala.inline
  def apply(): HostProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostProperties]
  }
  
  @scala.inline
  implicit class HostPropertiesOps[Self <: HostProperties] (val x: Self) extends AnyVal {
    
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
    def setCores(value: Integer): Self = this.set("Cores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCores: Self = this.set("Cores", js.undefined)
    
    @scala.inline
    def setInstanceFamily(value: String): Self = this.set("InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFamily: Self = this.set("InstanceFamily", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setSockets(value: Integer): Self = this.set("Sockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSockets: Self = this.set("Sockets", js.undefined)
    
    @scala.inline
    def setTotalVCpus(value: Integer): Self = this.set("TotalVCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalVCpus: Self = this.set("TotalVCpus", js.undefined)
  }
}
