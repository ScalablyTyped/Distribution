package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootInstanceRequest extends StObject {
  
  /**
    * The name of the instance to reboot.
    */
  var instanceName: ResourceName
}
object RebootInstanceRequest {
  
  inline def apply(instanceName: ResourceName): RebootInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootInstanceRequest]
  }
  
  extension [Self <: RebootInstanceRequest](x: Self) {
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
