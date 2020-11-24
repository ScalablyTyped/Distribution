package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetShallow extends js.Object {
  
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
  implicit class AssetShallowOps[Self <: AssetShallow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: string): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setPackagingGroupId(value: string): Self = this.set("PackagingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackagingGroupId: Self = this.set("PackagingGroupId", js.undefined)
    
    @scala.inline
    def setResourceId(value: string): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setSourceArn(value: string): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceArn: Self = this.set("SourceArn", js.undefined)
    
    @scala.inline
    def setSourceRoleArn(value: string): Self = this.set("SourceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRoleArn: Self = this.set("SourceRoleArn", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
