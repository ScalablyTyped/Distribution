package typings.awsSdk.cloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceRequestStatusInput extends StObject {
  
  /**
    * A unique token used to track the progress of the resource operation request. Request tokens are included in the ProgressEvent type returned by a resource operation request.
    */
  var RequestToken: typings.awsSdk.cloudcontrolMod.RequestToken
}
object GetResourceRequestStatusInput {
  
  inline def apply(RequestToken: RequestToken): GetResourceRequestStatusInput = {
    val __obj = js.Dynamic.literal(RequestToken = RequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceRequestStatusInput]
  }
  
  extension [Self <: GetResourceRequestStatusInput](x: Self) {
    
    inline def setRequestToken(value: RequestToken): Self = StObject.set(x, "RequestToken", value.asInstanceOf[js.Any])
  }
}
