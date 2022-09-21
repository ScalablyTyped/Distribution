package typings.awsSdk.cloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelResourceRequestInput extends StObject {
  
  /**
    * The RequestToken of the ProgressEvent object returned by the resource operation request.
    */
  var RequestToken: typings.awsSdk.cloudcontrolMod.RequestToken
}
object CancelResourceRequestInput {
  
  inline def apply(RequestToken: RequestToken): CancelResourceRequestInput = {
    val __obj = js.Dynamic.literal(RequestToken = RequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelResourceRequestInput]
  }
  
  extension [Self <: CancelResourceRequestInput](x: Self) {
    
    inline def setRequestToken(value: RequestToken): Self = StObject.set(x, "RequestToken", value.asInstanceOf[js.Any])
  }
}
