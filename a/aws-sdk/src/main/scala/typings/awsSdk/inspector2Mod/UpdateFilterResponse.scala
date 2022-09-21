package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFilterResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the successfully updated filter.
    */
  var arn: FilterArn
}
object UpdateFilterResponse {
  
  inline def apply(arn: FilterArn): UpdateFilterResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilterResponse]
  }
  
  extension [Self <: UpdateFilterResponse](x: Self) {
    
    inline def setArn(value: FilterArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
