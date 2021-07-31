package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIdentitiesResponse extends StObject {
  
  /**
    * <p>An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and
    *          IdentityId.</p>
    */
  var UnprocessedIdentityIds: js.UndefOr[js.Array[UnprocessedIdentityId]] = js.undefined
}
object DeleteIdentitiesResponse {
  
  @scala.inline
  def apply(): DeleteIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIdentitiesResponse]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DeleteIdentitiesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: DeleteIdentitiesResponse): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class DeleteIdentitiesResponseMutableBuilder[Self <: DeleteIdentitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnprocessedIdentityIds(value: js.Array[UnprocessedIdentityId]): Self = StObject.set(x, "UnprocessedIdentityIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedIdentityIdsUndefined: Self = StObject.set(x, "UnprocessedIdentityIds", js.undefined)
    
    @scala.inline
    def setUnprocessedIdentityIdsVarargs(value: UnprocessedIdentityId*): Self = StObject.set(x, "UnprocessedIdentityIds", js.Array(value :_*))
  }
}
