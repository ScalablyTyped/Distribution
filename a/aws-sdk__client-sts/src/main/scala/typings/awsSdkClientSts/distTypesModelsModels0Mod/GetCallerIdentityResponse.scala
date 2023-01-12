package typings.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCallerIdentityResponse extends StObject {
  
  /**
    * <p>The Amazon Web Services account ID number of the account that owns or contains the calling
    *          entity.</p>
    */
  var Account: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon Web Services ARN associated with the calling entity.</p>
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The unique identifier of the calling entity. The exact value depends on the type of
    *          entity that is making the call. The values returned are those listed in the <b>aws:userid</b> column in the <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_variables.html#principaltable">Principal
    *             table</a> found on the <b>Policy Variables</b> reference
    *          page in the <i>IAM User Guide</i>.</p>
    */
  var UserId: js.UndefOr[String] = js.undefined
}
object GetCallerIdentityResponse {
  
  inline def apply(): GetCallerIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCallerIdentityResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCallerIdentityResponse] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
