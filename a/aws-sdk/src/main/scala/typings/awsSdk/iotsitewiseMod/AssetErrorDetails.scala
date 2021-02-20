package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetErrorDetails extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: ID = js.native
  
  /**
    * The error code.
    */
  var code: AssetErrorCode = js.native
  
  /**
    * The error message.
    */
  var message: AssetErrorMessage = js.native
}
object AssetErrorDetails {
  
  @scala.inline
  def apply(assetId: ID, code: AssetErrorCode, message: AssetErrorMessage): AssetErrorDetails = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetErrorDetails]
  }
  
  @scala.inline
  implicit class AssetErrorDetailsMutableBuilder[Self <: AssetErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: AssetErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: AssetErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
