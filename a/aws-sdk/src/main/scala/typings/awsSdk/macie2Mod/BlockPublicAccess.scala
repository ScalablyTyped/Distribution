package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockPublicAccess extends StObject {
  
  /**
    * Specifies whether Amazon S3 blocks public access control lists (ACLs) for the bucket and objects in the bucket.
    */
  var blockPublicAcls: js.UndefOr[boolean] = js.native
  
  /**
    * Specifies whether Amazon S3 blocks public bucket policies for the bucket.
    */
  var blockPublicPolicy: js.UndefOr[boolean] = js.native
  
  /**
    * Specifies whether Amazon S3 ignores public ACLs for the bucket and objects in the bucket.
    */
  var ignorePublicAcls: js.UndefOr[boolean] = js.native
  
  /**
    * Specifies whether Amazon S3 restricts public bucket policies for the bucket.
    */
  var restrictPublicBuckets: js.UndefOr[boolean] = js.native
}
object BlockPublicAccess {
  
  @scala.inline
  def apply(): BlockPublicAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockPublicAccess]
  }
  
  @scala.inline
  implicit class BlockPublicAccessMutableBuilder[Self <: BlockPublicAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockPublicAcls(value: boolean): Self = StObject.set(x, "blockPublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicAclsUndefined: Self = StObject.set(x, "blockPublicAcls", js.undefined)
    
    @scala.inline
    def setBlockPublicPolicy(value: boolean): Self = StObject.set(x, "blockPublicPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockPublicPolicyUndefined: Self = StObject.set(x, "blockPublicPolicy", js.undefined)
    
    @scala.inline
    def setIgnorePublicAcls(value: boolean): Self = StObject.set(x, "ignorePublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePublicAclsUndefined: Self = StObject.set(x, "ignorePublicAcls", js.undefined)
    
    @scala.inline
    def setRestrictPublicBuckets(value: boolean): Self = StObject.set(x, "restrictPublicBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictPublicBucketsUndefined: Self = StObject.set(x, "restrictPublicBuckets", js.undefined)
  }
}
