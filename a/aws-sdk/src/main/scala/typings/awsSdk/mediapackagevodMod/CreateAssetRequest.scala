package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssetRequest extends StObject {
  
  /**
    * The unique identifier for the Asset.
    */
  var Id: string
  
  /**
    * The ID of the PackagingGroup for the Asset.
    */
  var PackagingGroupId: string
  
  /**
    * The resource ID to include in SPEKE key requests.
    */
  var ResourceId: js.UndefOr[string] = js.undefined
  
  /**
    * ARN of the source object in S3.
    */
  var SourceArn: string
  
  /**
    * The IAM role ARN used to access the source S3 bucket.
    */
  var SourceRoleArn: string
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.undefined
}
object CreateAssetRequest {
  
  @scala.inline
  def apply(Id: string, PackagingGroupId: string, SourceArn: string, SourceRoleArn: string): CreateAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PackagingGroupId = PackagingGroupId.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any], SourceRoleArn = SourceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetRequest]
  }
  
  @scala.inline
  implicit class CreateAssetRequestMutableBuilder[Self <: CreateAssetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingGroupId(value: string): Self = StObject.set(x, "PackagingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: string): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setSourceArn(value: string): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRoleArn(value: string): Self = StObject.set(x, "SourceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
