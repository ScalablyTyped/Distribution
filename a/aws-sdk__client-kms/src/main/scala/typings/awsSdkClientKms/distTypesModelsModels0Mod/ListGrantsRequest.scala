package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGrantsRequest extends StObject {
  
  /**
    * <p>Returns only the grant with the specified grant ID. The grant ID uniquely identifies the
    *       grant. </p>
    */
  var GrantId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Returns only grants where the specified principal is the grantee principal for the
    *       grant.</p>
    */
  var GranteePrincipal: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Returns only grants for the specified KMS key. This parameter is required.</p>
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
  
  /**
    * <p>Use this parameter to specify the maximum number of items to return. When this
    *     value is present, KMS does not return more than the specified number of items, but it might
    *     return fewer.</p>
    *          <p>This value is optional. If you include a value, it must be between 1
    *     and 100, inclusive. If you do not include a value, it defaults to 50.</p>
    */
  var Limit: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Use this parameter in a subsequent request after you receive a response with
    *     truncated results. Set it to the value of <code>NextMarker</code> from the truncated response
    *     you just received.</p>
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object ListGrantsRequest {
  
  inline def apply(): ListGrantsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGrantsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGrantsRequest] (val x: Self) extends AnyVal {
    
    inline def setGrantId(value: String): Self = StObject.set(x, "GrantId", value.asInstanceOf[js.Any])
    
    inline def setGrantIdUndefined: Self = StObject.set(x, "GrantId", js.undefined)
    
    inline def setGranteePrincipal(value: String): Self = StObject.set(x, "GranteePrincipal", value.asInstanceOf[js.Any])
    
    inline def setGranteePrincipalUndefined: Self = StObject.set(x, "GranteePrincipal", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
