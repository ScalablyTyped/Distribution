package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostProperties extends StObject {
  
  /**
    * The number of cores on the Dedicated Host.
    */
  var Cores: js.UndefOr[Integer] = js.undefined
  
  /**
    * The instance family supported by the Dedicated Host. For example, m5.
    */
  var InstanceFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type supported by the Dedicated Host. For example, m5.large. If the host supports multiple instance types, no instanceType is returned.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of sockets on the Dedicated Host.
    */
  var Sockets: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of vCPUs on the Dedicated Host.
    */
  var TotalVCpus: js.UndefOr[Integer] = js.undefined
}
object HostProperties {
  
  @scala.inline
  def apply(): HostProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostProperties]
  }
  
  @scala.inline
  implicit class HostPropertiesMutableBuilder[Self <: HostProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCores(value: Integer): Self = StObject.set(x, "Cores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoresUndefined: Self = StObject.set(x, "Cores", js.undefined)
    
    @scala.inline
    def setInstanceFamily(value: String): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setSockets(value: Integer): Self = StObject.set(x, "Sockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketsUndefined: Self = StObject.set(x, "Sockets", js.undefined)
    
    @scala.inline
    def setTotalVCpus(value: Integer): Self = StObject.set(x, "TotalVCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalVCpusUndefined: Self = StObject.set(x, "TotalVCpus", js.undefined)
  }
}
