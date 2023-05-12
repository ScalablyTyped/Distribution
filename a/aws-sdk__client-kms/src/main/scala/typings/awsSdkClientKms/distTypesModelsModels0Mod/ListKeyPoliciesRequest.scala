package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeyPoliciesRequest extends StObject {
  
  /**
    * <p>Gets the names of key policies for the specified KMS key.</p>
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
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Use this parameter to specify the maximum number of items to return. When this
    *     value is present, KMS does not return more than the specified number of items, but it might
    *     return fewer.</p>
    *          <p>This value is optional. If you include a value, it must be between
    *     1 and 1000, inclusive. If you do not include a value, it defaults to 100.</p>
    *          <p>Only one policy can be attached to a key.</p>
    */
  var Limit: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Use this parameter in a subsequent request after you receive a response with
    *     truncated results. Set it to the value of <code>NextMarker</code> from the truncated response
    *     you just received.</p>
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object ListKeyPoliciesRequest {
  
  inline def apply(): ListKeyPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyPoliciesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListKeyPoliciesRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
