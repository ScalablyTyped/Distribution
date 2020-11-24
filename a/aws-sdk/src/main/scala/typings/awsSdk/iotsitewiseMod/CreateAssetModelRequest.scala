package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAssetModelRequest extends js.Object {
  
  /**
    * A description for the asset model.
    */
  var assetModelDescription: js.UndefOr[Description] = js.native
  
  /**
    * The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be children of any other assets created from this asset model. For more information, see Asset hierarchies in the AWS IoT SiteWise User Guide. You can specify up to 10 hierarchies per asset model. For more information, see Quotas in the AWS IoT SiteWise User Guide.
    */
  var assetModelHierarchies: js.UndefOr[AssetModelHierarchyDefinitions] = js.native
  
  /**
    * A unique, friendly name for the asset model.
    */
  var assetModelName: Name = js.native
  
  /**
    * The property definitions of the asset model. For more information, see Asset properties in the AWS IoT SiteWise User Guide. You can specify up to 200 properties per asset model. For more information, see Quotas in the AWS IoT SiteWise User Guide.
    */
  var assetModelProperties: js.UndefOr[AssetModelPropertyDefinitions] = js.native
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * A list of key-value pairs that contain metadata for the asset model. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateAssetModelRequest {
  
  @scala.inline
  def apply(assetModelName: Name): CreateAssetModelRequest = {
    val __obj = js.Dynamic.literal(assetModelName = assetModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetModelRequest]
  }
  
  @scala.inline
  implicit class CreateAssetModelRequestOps[Self <: CreateAssetModelRequest] (val x: Self) extends AnyVal {
    
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
    def setAssetModelName(value: Name): Self = this.set("assetModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelDescription(value: Description): Self = this.set("assetModelDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetModelDescription: Self = this.set("assetModelDescription", js.undefined)
    
    @scala.inline
    def setAssetModelHierarchiesVarargs(value: AssetModelHierarchyDefinition*): Self = this.set("assetModelHierarchies", js.Array(value :_*))
    
    @scala.inline
    def setAssetModelHierarchies(value: AssetModelHierarchyDefinitions): Self = this.set("assetModelHierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetModelHierarchies: Self = this.set("assetModelHierarchies", js.undefined)
    
    @scala.inline
    def setAssetModelPropertiesVarargs(value: AssetModelPropertyDefinition*): Self = this.set("assetModelProperties", js.Array(value :_*))
    
    @scala.inline
    def setAssetModelProperties(value: AssetModelPropertyDefinitions): Self = this.set("assetModelProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetModelProperties: Self = this.set("assetModelProperties", js.undefined)
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
