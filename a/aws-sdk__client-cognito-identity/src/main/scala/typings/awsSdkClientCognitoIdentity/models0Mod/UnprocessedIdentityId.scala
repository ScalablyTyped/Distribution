package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedIdentityId extends StObject {
  
  /**
    * <p>The error code indicating the type of error that occurred.</p>
    */
  var ErrorCode: js.UndefOr[typings.awsSdkClientCognitoIdentity.models0Mod.ErrorCode | String] = js.undefined
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
}
object UnprocessedIdentityId {
  
  inline def apply(): UnprocessedIdentityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedIdentityId]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "UnprocessedIdentityId")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: UnprocessedIdentityId): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: UnprocessedIdentityId](x: Self) {
    
    inline def setErrorCode(value: ErrorCode | String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
  }
}
