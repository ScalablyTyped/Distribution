package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFilterRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the filter to be deleted.
    */
  var arn: FilterArn
}
object DeleteFilterRequest {
  
  inline def apply(arn: FilterArn): DeleteFilterRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilterRequest]
  }
  
  extension [Self <: DeleteFilterRequest](x: Self) {
    
    inline def setArn(value: FilterArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
