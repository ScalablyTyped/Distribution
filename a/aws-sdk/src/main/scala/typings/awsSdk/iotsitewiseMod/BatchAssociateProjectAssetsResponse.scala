package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateProjectAssetsResponse extends StObject {
  
  /**
    * A list of associated error information, if any.
    */
  var errors: js.UndefOr[BatchAssociateProjectAssetsErrors] = js.undefined
}
object BatchAssociateProjectAssetsResponse {
  
  inline def apply(): BatchAssociateProjectAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateProjectAssetsResponse]
  }
  
  extension [Self <: BatchAssociateProjectAssetsResponse](x: Self) {
    
    inline def setErrors(value: BatchAssociateProjectAssetsErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: AssetErrorDetails*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
