package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortProbeDetail extends StObject {
  
  /**
    * The local IP information of the connection.
    */
  var LocalIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.LocalIpDetails] = js.undefined
  
  /**
    * The local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typings.awsSdk.guarddutyMod.LocalPortDetails] = js.undefined
  
  /**
    * The remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemoteIpDetails] = js.undefined
}
object PortProbeDetail {
  
  @scala.inline
  def apply(): PortProbeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortProbeDetail]
  }
  
  @scala.inline
  implicit class PortProbeDetailMutableBuilder[Self <: PortProbeDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalIpDetails(value: LocalIpDetails): Self = StObject.set(x, "LocalIpDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIpDetailsUndefined: Self = StObject.set(x, "LocalIpDetails", js.undefined)
    
    @scala.inline
    def setLocalPortDetails(value: LocalPortDetails): Self = StObject.set(x, "LocalPortDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPortDetailsUndefined: Self = StObject.set(x, "LocalPortDetails", js.undefined)
    
    @scala.inline
    def setRemoteIpDetails(value: RemoteIpDetails): Self = StObject.set(x, "RemoteIpDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIpDetailsUndefined: Self = StObject.set(x, "RemoteIpDetails", js.undefined)
  }
}
