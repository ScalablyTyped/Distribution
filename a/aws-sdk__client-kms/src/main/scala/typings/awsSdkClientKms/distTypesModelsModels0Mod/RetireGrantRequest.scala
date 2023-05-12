package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetireGrantRequest extends StObject {
  
  /**
    * <p>Identifies the grant to retire. To get the grant ID, use <a>CreateGrant</a>,
    *         <a>ListGrants</a>, or <a>ListRetirableGrants</a>.</p>
    *          <ul>
    *             <li>
    *                <p>Grant ID Example -
    *           0123456789012345678901234567890123456789012345678901234567890123</p>
    *             </li>
    *          </ul>
    */
  var GrantId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Identifies the grant to be retired. You can use a grant token to identify a new grant even
    *       before it has achieved eventual consistency.</p>
    *          <p>Only the <a>CreateGrant</a> operation returns a grant token. For details, see
    *         <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#grant_token">Grant token</a>
    *       and <a href="https://docs.aws.amazon.com/kms/latest/developerguide/grants.html#terms-eventual-consistency">Eventual consistency</a> in the <i>Key Management Service Developer Guide</i>.</p>
    */
  var GrantToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The key ARN KMS key associated with the grant. To find the key ARN, use the <a>ListKeys</a> operation.</p>
    *          <p>For example: <code>arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *          </p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
}
object RetireGrantRequest {
  
  inline def apply(): RetireGrantRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetireGrantRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetireGrantRequest] (val x: Self) extends AnyVal {
    
    inline def setGrantId(value: String): Self = StObject.set(x, "GrantId", value.asInstanceOf[js.Any])
    
    inline def setGrantIdUndefined: Self = StObject.set(x, "GrantId", js.undefined)
    
    inline def setGrantToken(value: String): Self = StObject.set(x, "GrantToken", value.asInstanceOf[js.Any])
    
    inline def setGrantTokenUndefined: Self = StObject.set(x, "GrantToken", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
