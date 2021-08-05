package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHITRequest extends StObject {
  
  /**
    * The ID of the HIT to be retrieved.
    */
  var HITId: EntityId
}
object GetHITRequest {
  
  inline def apply(HITId: EntityId): GetHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHITRequest]
  }
  
  extension [Self <: GetHITRequest](x: Self) {
    
    inline def setHITId(value: EntityId): Self = StObject.set(x, "HITId", value.asInstanceOf[js.Any])
  }
}
