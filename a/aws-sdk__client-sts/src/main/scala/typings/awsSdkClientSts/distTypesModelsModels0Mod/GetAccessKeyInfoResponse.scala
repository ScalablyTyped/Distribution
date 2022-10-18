package typings.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessKeyInfoResponse extends StObject {
  
  /**
    * <p>The number used to identify the Amazon Web Services account.</p>
    */
  var Account: js.UndefOr[String] = js.undefined
}
object GetAccessKeyInfoResponse {
  
  inline def apply(): GetAccessKeyInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessKeyInfoResponse]
  }
  
  extension [Self <: GetAccessKeyInfoResponse](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
  }
}
