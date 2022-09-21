package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReadinessCheckRequest extends StObject {
  
  /**
    * Name of a readiness check.
    */
  var ReadinessCheckName: string
  
  /**
    * The name of the resource set to be checked.
    */
  var ResourceSetName: string
}
object UpdateReadinessCheckRequest {
  
  inline def apply(ReadinessCheckName: string, ResourceSetName: string): UpdateReadinessCheckRequest = {
    val __obj = js.Dynamic.literal(ReadinessCheckName = ReadinessCheckName.asInstanceOf[js.Any], ResourceSetName = ResourceSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReadinessCheckRequest]
  }
  
  extension [Self <: UpdateReadinessCheckRequest](x: Self) {
    
    inline def setReadinessCheckName(value: string): Self = StObject.set(x, "ReadinessCheckName", value.asInstanceOf[js.Any])
    
    inline def setResourceSetName(value: string): Self = StObject.set(x, "ResourceSetName", value.asInstanceOf[js.Any])
  }
}
