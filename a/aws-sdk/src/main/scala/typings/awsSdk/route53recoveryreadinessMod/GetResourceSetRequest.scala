package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceSetRequest extends StObject {
  
  /**
    * Name of a resource set.
    */
  var ResourceSetName: string
}
object GetResourceSetRequest {
  
  inline def apply(ResourceSetName: string): GetResourceSetRequest = {
    val __obj = js.Dynamic.literal(ResourceSetName = ResourceSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceSetRequest]
  }
  
  extension [Self <: GetResourceSetRequest](x: Self) {
    
    inline def setResourceSetName(value: string): Self = StObject.set(x, "ResourceSetName", value.asInstanceOf[js.Any])
  }
}
