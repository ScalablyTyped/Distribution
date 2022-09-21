package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentificationHints extends StObject {
  
  /**
    * AWS Instance ID identification hint.
    */
  var awsInstanceID: js.UndefOr[EC2InstanceID] = js.undefined
  
  /**
    * FQDN address identification hint.
    */
  var fqdn: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * Hostname identification hint.
    */
  var hostname: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * vCenter VM path identification hint.
    */
  var vmPath: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * vmWare UUID identification hint.
    */
  var vmWareUuid: js.UndefOr[BoundedString] = js.undefined
}
object IdentificationHints {
  
  inline def apply(): IdentificationHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentificationHints]
  }
  
  extension [Self <: IdentificationHints](x: Self) {
    
    inline def setAwsInstanceID(value: EC2InstanceID): Self = StObject.set(x, "awsInstanceID", value.asInstanceOf[js.Any])
    
    inline def setAwsInstanceIDUndefined: Self = StObject.set(x, "awsInstanceID", js.undefined)
    
    inline def setFqdn(value: BoundedString): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
    
    inline def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
    
    inline def setHostname(value: BoundedString): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setVmPath(value: BoundedString): Self = StObject.set(x, "vmPath", value.asInstanceOf[js.Any])
    
    inline def setVmPathUndefined: Self = StObject.set(x, "vmPath", js.undefined)
    
    inline def setVmWareUuid(value: BoundedString): Self = StObject.set(x, "vmWareUuid", value.asInstanceOf[js.Any])
    
    inline def setVmWareUuidUndefined: Self = StObject.set(x, "vmWareUuid", js.undefined)
  }
}
