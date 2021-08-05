package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEgressOnlyInternetGatewayResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var ReturnCode: js.UndefOr[Boolean] = js.undefined
}
object DeleteEgressOnlyInternetGatewayResult {
  
  inline def apply(): DeleteEgressOnlyInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEgressOnlyInternetGatewayResult]
  }
  
  extension [Self <: DeleteEgressOnlyInternetGatewayResult](x: Self) {
    
    inline def setReturnCode(value: Boolean): Self = StObject.set(x, "ReturnCode", value.asInstanceOf[js.Any])
    
    inline def setReturnCodeUndefined: Self = StObject.set(x, "ReturnCode", js.undefined)
  }
}
