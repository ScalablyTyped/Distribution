package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicateKeyResponse extends StObject {
  
  /**
    * <p>Displays details about the new replica key, including its Amazon Resource Name (<a href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) and
    *       <a href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a>. It also includes the ARN and Amazon Web Services Region of its primary key and other
    *       replica keys.</p>
    */
  var ReplicaKeyMetadata: js.UndefOr[KeyMetadata] = js.undefined
  
  /**
    * <p>The key policy of the new replica key. The value is a key policy document in JSON
    *       format.</p>
    */
  var ReplicaPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The tags on the new replica key. The value is a list of tag key and tag value
    *       pairs.</p>
    */
  var ReplicaTags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object ReplicateKeyResponse {
  
  inline def apply(): ReplicateKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicateKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicateKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicaKeyMetadata(value: KeyMetadata): Self = StObject.set(x, "ReplicaKeyMetadata", value.asInstanceOf[js.Any])
    
    inline def setReplicaKeyMetadataUndefined: Self = StObject.set(x, "ReplicaKeyMetadata", js.undefined)
    
    inline def setReplicaPolicy(value: String): Self = StObject.set(x, "ReplicaPolicy", value.asInstanceOf[js.Any])
    
    inline def setReplicaPolicyUndefined: Self = StObject.set(x, "ReplicaPolicy", js.undefined)
    
    inline def setReplicaTags(value: js.Array[Tag]): Self = StObject.set(x, "ReplicaTags", value.asInstanceOf[js.Any])
    
    inline def setReplicaTagsUndefined: Self = StObject.set(x, "ReplicaTags", js.undefined)
    
    inline def setReplicaTagsVarargs(value: Tag*): Self = StObject.set(x, "ReplicaTags", js.Array(value*))
  }
}
