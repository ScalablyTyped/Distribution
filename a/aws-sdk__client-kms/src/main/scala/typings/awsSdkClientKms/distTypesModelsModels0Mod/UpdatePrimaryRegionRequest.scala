package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePrimaryRegionRequest extends StObject {
  
  /**
    * <p>Identifies the current primary key. When the operation completes, this KMS key will be a
    *       replica key.</p>
    *          <p>Specify the key ID or key ARN of a multi-Region primary key.</p>
    *          <p>For example:</p>
    *          <ul>
    *             <li>
    *                <p>Key ID: <code>mrk-1234abcd12ab34cd56ef1234567890ab</code>
    *                </p>
    *             </li>
    *             <li>
    *                <p>Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/mrk-1234abcd12ab34cd56ef1234567890ab</code>
    *                </p>
    *             </li>
    *          </ul>
    *          <p>To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon Web Services Region of the new primary key. Enter the Region ID, such as
    *         <code>us-east-1</code> or <code>ap-southeast-2</code>. There must be an existing replica key
    *       in this Region. </p>
    *          <p>When the operation completes, the multi-Region key in this Region will be the primary
    *       key.</p>
    */
  var PrimaryRegion: js.UndefOr[String] = js.undefined
}
object UpdatePrimaryRegionRequest {
  
  inline def apply(): UpdatePrimaryRegionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePrimaryRegionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePrimaryRegionRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setPrimaryRegion(value: String): Self = StObject.set(x, "PrimaryRegion", value.asInstanceOf[js.Any])
    
    inline def setPrimaryRegionUndefined: Self = StObject.set(x, "PrimaryRegion", js.undefined)
  }
}
