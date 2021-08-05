package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateProjectAssetsResponse extends StObject {
  
  /**
    * A list of associated error information, if any.
    */
  var errors: js.UndefOr[BatchDisassociateProjectAssetsErrors] = js.undefined
}
object BatchDisassociateProjectAssetsResponse {
  
  inline def apply(): BatchDisassociateProjectAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateProjectAssetsResponse]
  }
  
  extension [Self <: BatchDisassociateProjectAssetsResponse](x: Self) {
    
    inline def setErrors(value: BatchDisassociateProjectAssetsErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: AssetErrorDetails*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
