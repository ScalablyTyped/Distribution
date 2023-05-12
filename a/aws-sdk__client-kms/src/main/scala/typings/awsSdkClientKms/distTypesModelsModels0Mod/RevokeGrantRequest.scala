package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeGrantRequest extends StObject {
  
  /**
    * <p>Identifies the grant to revoke. To get the grant ID, use <a>CreateGrant</a>,
    *         <a>ListGrants</a>, or <a>ListRetirableGrants</a>.</p>
    */
  var GrantId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A unique identifier for the KMS key associated with the grant. To get the key ID and key
    *       ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
    *          <p>Specify the key ID or key ARN of the KMS key. To specify a KMS key in a
    * different Amazon Web Services account, you must use the key ARN.</p>
    *          <p>For example:</p>
    *          <ul>
    *             <li>
    *                <p>Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
}
object RevokeGrantRequest {
  
  inline def apply(): RevokeGrantRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeGrantRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevokeGrantRequest] (val x: Self) extends AnyVal {
    
    inline def setGrantId(value: String): Self = StObject.set(x, "GrantId", value.asInstanceOf[js.Any])
    
    inline def setGrantIdUndefined: Self = StObject.set(x, "GrantId", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
