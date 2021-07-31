package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssetResponse extends StObject {
  
  /**
    * The ARN for the asset.
    */
  var Arn: js.UndefOr[typings.awsSdk.dataexchangeMod.Arn] = js.undefined
  
  /**
    * Information about the asset, including its size.
    */
  var AssetDetails: js.UndefOr[typings.awsSdk.dataexchangeMod.AssetDetails] = js.undefined
  
  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  var AssetType: js.UndefOr[typings.awsSdk.dataexchangeMod.AssetType] = js.undefined
  
  /**
    * The date and time that the asset was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The unique identifier for the data set associated with this asset.
    */
  var DataSetId: js.UndefOr[Id] = js.undefined
  
  /**
    * The unique identifier for the asset.
    */
  var Id: js.UndefOr[typings.awsSdk.dataexchangeMod.Id] = js.undefined
  
  /**
    * The name of the asset When importing from Amazon S3, the S3 object key is used as the asset name. When exporting to Amazon S3, the asset name is used as default target S3 object key.
    */
  var Name: js.UndefOr[AssetName] = js.undefined
  
  /**
    * The unique identifier for the revision associated with this asset.
    */
  var RevisionId: js.UndefOr[Id] = js.undefined
  
  /**
    * The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is returned when an asset owner is viewing the entitled copy of its owned asset.
    */
  var SourceId: js.UndefOr[Id] = js.undefined
  
  /**
    * The date and time that the asset was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.undefined
}
object GetAssetResponse {
  
  @scala.inline
  def apply(): GetAssetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssetResponse]
  }
  
  @scala.inline
  implicit class GetAssetResponseMutableBuilder[Self <: GetAssetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAssetDetails(value: AssetDetails): Self = StObject.set(x, "AssetDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetDetailsUndefined: Self = StObject.set(x, "AssetDetails", js.undefined)
    
    @scala.inline
    def setAssetType(value: AssetType): Self = StObject.set(x, "AssetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTypeUndefined: Self = StObject.set(x, "AssetType", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetIdUndefined: Self = StObject.set(x, "DataSetId", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: AssetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    @scala.inline
    def setSourceId(value: Id): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
