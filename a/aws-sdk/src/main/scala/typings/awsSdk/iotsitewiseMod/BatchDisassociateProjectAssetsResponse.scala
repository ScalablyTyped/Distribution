package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDisassociateProjectAssetsResponse extends StObject {
  
  /**
    * A list of associated error information, if any.
    */
  var errors: js.UndefOr[BatchDisassociateProjectAssetsErrors] = js.native
}
object BatchDisassociateProjectAssetsResponse {
  
  @scala.inline
  def apply(): BatchDisassociateProjectAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateProjectAssetsResponse]
  }
  
  @scala.inline
  implicit class BatchDisassociateProjectAssetsResponseMutableBuilder[Self <: BatchDisassociateProjectAssetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: BatchDisassociateProjectAssetsErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: AssetErrorDetails*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
