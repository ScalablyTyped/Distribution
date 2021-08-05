package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Core extends StObject {
  
  /**
    * The ARN of the certificate associated with the core.
    */
  var CertificateArn: string
  
  /**
    * A descriptive or arbitrary ID for the core. This value must be unique within the core definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: string
  
  /**
    * If true, the core's local shadow is automatically synced with the cloud.
    */
  var SyncShadow: js.UndefOr[boolean] = js.undefined
  
  /**
    * The ARN of the thing which is the core.
    */
  var ThingArn: string
}
object Core {
  
  inline def apply(CertificateArn: string, Id: string, ThingArn: string): Core = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ThingArn = ThingArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Core]
  }
  
  extension [Self <: Core](x: Self) {
    
    inline def setCertificateArn(value: string): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setSyncShadow(value: boolean): Self = StObject.set(x, "SyncShadow", value.asInstanceOf[js.Any])
    
    inline def setSyncShadowUndefined: Self = StObject.set(x, "SyncShadow", js.undefined)
    
    inline def setThingArn(value: string): Self = StObject.set(x, "ThingArn", value.asInstanceOf[js.Any])
  }
}
