package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableApplicationLayerAutomaticResponseRequest extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the protected resource.
    */
  var ResourceArn: typings.awsSdk.shieldMod.ResourceArn
}
object DisableApplicationLayerAutomaticResponseRequest {
  
  inline def apply(ResourceArn: ResourceArn): DisableApplicationLayerAutomaticResponseRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableApplicationLayerAutomaticResponseRequest]
  }
  
  extension [Self <: DisableApplicationLayerAutomaticResponseRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
