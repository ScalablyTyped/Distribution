package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAliasRequest extends StObject {
  
  /**
    * <p>Identifies the alias that is changing its KMS key. This value must begin with
    *         <code>alias/</code> followed by the alias name, such as <code>alias/ExampleAlias</code>. You
    *       cannot use <code>UpdateAlias</code> to change the alias name.</p>
    *          <important>
    *             <p>Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.</p>
    *          </important>
    */
  var AliasName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Identifies the <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed key</a> to associate with the alias. You don't have permission to
    *       associate an alias with an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web Services managed key</a>.</p>
    *          <p>The KMS key must be in the same Amazon Web Services account and Region as the alias. Also, the new
    *       target KMS key must be the same type as the current target KMS key (both symmetric or both
    *       asymmetric or both HMAC) and they must have the same key usage. </p>
    *          <p>Specify the key ID or key ARN of the KMS key.</p>
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
    *          <p>To verify that the alias is mapped to the correct KMS key, use <a>ListAliases</a>.</p>
    */
  var TargetKeyId: js.UndefOr[String] = js.undefined
}
object UpdateAliasRequest {
  
  inline def apply(): UpdateAliasRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setAliasName(value: String): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    inline def setTargetKeyId(value: String): Self = StObject.set(x, "TargetKeyId", value.asInstanceOf[js.Any])
    
    inline def setTargetKeyIdUndefined: Self = StObject.set(x, "TargetKeyId", js.undefined)
  }
}
