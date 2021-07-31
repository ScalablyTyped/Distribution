package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedBandwidth extends StObject {
  
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var ProvisionTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Provisioned: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var RequestTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Requested: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object ProvisionedBandwidth {
  
  @scala.inline
  def apply(): ProvisionedBandwidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedBandwidth]
  }
  
  @scala.inline
  implicit class ProvisionedBandwidthMutableBuilder[Self <: ProvisionedBandwidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvisionTime(value: DateTime): Self = StObject.set(x, "ProvisionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionTimeUndefined: Self = StObject.set(x, "ProvisionTime", js.undefined)
    
    @scala.inline
    def setProvisioned(value: String): Self = StObject.set(x, "Provisioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedUndefined: Self = StObject.set(x, "Provisioned", js.undefined)
    
    @scala.inline
    def setRequestTime(value: DateTime): Self = StObject.set(x, "RequestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeUndefined: Self = StObject.set(x, "RequestTime", js.undefined)
    
    @scala.inline
    def setRequested(value: String): Self = StObject.set(x, "Requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedUndefined: Self = StObject.set(x, "Requested", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
