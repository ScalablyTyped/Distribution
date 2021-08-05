package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionStatusRequest extends StObject {
  
  /**
    * The ID of the instance.
    */
  var Target: SessionTarget
}
object GetConnectionStatusRequest {
  
  inline def apply(Target: SessionTarget): GetConnectionStatusRequest = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionStatusRequest]
  }
  
  extension [Self <: GetConnectionStatusRequest](x: Self) {
    
    inline def setTarget(value: SessionTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
