package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetShallow extends StObject {
  
  /**
    * The ARN of the Asset.
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * The time the Asset was initially submitted for Ingest.
    */
  var CreatedAt: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the Asset.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: js.UndefOr[string] = js.native
  
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[string] = js.native
  
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: js.UndefOr[string] = js.native
  
  /**
    * The IAM role ARN used to access the source S3 bucket.
    */
  var SourceRoleArn: js.UndefOr[string] = js.native
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.native
}
object AssetShallow {
  
  @scala.inline
  def apply(): AssetShallow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetShallow]
  }
  
  @scala.inline
  implicit class AssetShallowMutableBuilder[Self <: AssetShallow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: string): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setPackagingGroupId(value: string): Self = StObject.set(x, "PackagingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingGroupIdUndefined: Self = StObject.set(x, "PackagingGroupId", js.undefined)
    
    @scala.inline
    def setResourceId(value: string): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setSourceArn(value: string): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    @scala.inline
    def setSourceRoleArn(value: string): Self = StObject.set(x, "SourceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRoleArnUndefined: Self = StObject.set(x, "SourceRoleArn", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
