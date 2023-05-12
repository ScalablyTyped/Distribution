package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAliasRequest extends StObject {
  
  /**
    * <p>Specifies the alias name. This value must begin with <code>alias/</code> followed by a
    *       name, such as <code>alias/ExampleAlias</code>. </p>
    *          <important>
    *             <p>Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.</p>
    *          </important>
    *          <p>The <code>AliasName</code> value must be string of 1-256 characters. It can contain only
    *       alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). The alias name
    *       cannot begin with <code>alias/aws/</code>. The <code>alias/aws/</code> prefix is reserved for
    *         <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web Services managed
    *         keys</a>.</p>
    */
  var AliasName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Associates the alias with the specified <a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#customer-cmk">customer managed key</a>. The KMS key must
    *       be in the same Amazon Web Services Region. </p>
    *          <p>A valid key ID is required. If you supply a null or empty string value, this operation
    *       returns an error.</p>
    *          <p>For help finding the key ID and ARN, see <a href="https://docs.aws.amazon.com/kms/latest/developerguide/viewing-keys.html#find-cmk-id-arn">Finding the Key ID and
    *         ARN</a> in the <i>
    *                <i>Key Management Service Developer Guide</i>
    *             </i>.</p>
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
    */
  var TargetKeyId: js.UndefOr[String] = js.undefined
}
object CreateAliasRequest {
  
  inline def apply(): CreateAliasRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setAliasName(value: String): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    inline def setTargetKeyId(value: String): Self = StObject.set(x, "TargetKeyId", value.asInstanceOf[js.Any])
    
    inline def setTargetKeyIdUndefined: Self = StObject.set(x, "TargetKeyId", js.undefined)
  }
}
