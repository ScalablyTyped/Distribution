package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssetModelRequest extends StObject {
  
  /**
    * A description for the asset model.
    */
  var assetModelDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be children of any other assets created from this asset model. For more information, see Asset hierarchies in the AWS IoT SiteWise User Guide. You can specify up to 10 hierarchies per asset model. For more information, see Quotas in the AWS IoT SiteWise User Guide.
    */
  var assetModelHierarchies: js.UndefOr[AssetModelHierarchyDefinitions] = js.undefined
  
  /**
    * A unique, friendly name for the asset model.
    */
  var assetModelName: Name
  
  /**
    * The property definitions of the asset model. For more information, see Asset properties in the AWS IoT SiteWise User Guide. You can specify up to 200 properties per asset model. For more information, see Quotas in the AWS IoT SiteWise User Guide.
    */
  var assetModelProperties: js.UndefOr[AssetModelPropertyDefinitions] = js.undefined
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A list of key-value pairs that contain metadata for the asset model. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAssetModelRequest {
  
  @scala.inline
  def apply(assetModelName: Name): CreateAssetModelRequest = {
    val __obj = js.Dynamic.literal(assetModelName = assetModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetModelRequest]
  }
  
  @scala.inline
  implicit class CreateAssetModelRequestMutableBuilder[Self <: CreateAssetModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetModelDescription(value: Description): Self = StObject.set(x, "assetModelDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelDescriptionUndefined: Self = StObject.set(x, "assetModelDescription", js.undefined)
    
    @scala.inline
    def setAssetModelHierarchies(value: AssetModelHierarchyDefinitions): Self = StObject.set(x, "assetModelHierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelHierarchiesUndefined: Self = StObject.set(x, "assetModelHierarchies", js.undefined)
    
    @scala.inline
    def setAssetModelHierarchiesVarargs(value: AssetModelHierarchyDefinition*): Self = StObject.set(x, "assetModelHierarchies", js.Array(value :_*))
    
    @scala.inline
    def setAssetModelName(value: Name): Self = StObject.set(x, "assetModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelProperties(value: AssetModelPropertyDefinitions): Self = StObject.set(x, "assetModelProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetModelPropertiesUndefined: Self = StObject.set(x, "assetModelProperties", js.undefined)
    
    @scala.inline
    def setAssetModelPropertiesVarargs(value: AssetModelPropertyDefinition*): Self = StObject.set(x, "assetModelProperties", js.Array(value :_*))
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
