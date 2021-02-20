package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotCopyGrant extends StObject {
  
  /**
    * The unique identifier of the customer master key (CMK) in AWS KMS to which Amazon Redshift is granted permission.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The name of the snapshot copy grant.
    */
  var SnapshotCopyGrantName: js.UndefOr[String] = js.native
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object SnapshotCopyGrant {
  
  @scala.inline
  def apply(): SnapshotCopyGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotCopyGrant]
  }
  
  @scala.inline
  implicit class SnapshotCopyGrantMutableBuilder[Self <: SnapshotCopyGrant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setSnapshotCopyGrantName(value: String): Self = StObject.set(x, "SnapshotCopyGrantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCopyGrantNameUndefined: Self = StObject.set(x, "SnapshotCopyGrantName", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
