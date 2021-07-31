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
  
  @scala.inline
  def apply(): DeleteEgressOnlyInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEgressOnlyInternetGatewayResult]
  }
  
  @scala.inline
  implicit class DeleteEgressOnlyInternetGatewayResultMutableBuilder[Self <: DeleteEgressOnlyInternetGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnCode(value: Boolean): Self = StObject.set(x, "ReturnCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnCodeUndefined: Self = StObject.set(x, "ReturnCode", js.undefined)
  }
}
