package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssetResponse extends js.Object {
  /**
    * The ARN for the asset.
    */
  var Arn: js.UndefOr[typings.awsSdk.dataexchangeMod.Arn] = js.native
  /**
    * Information about the asset, including its size.
    */
  var AssetDetails: js.UndefOr[typings.awsSdk.dataexchangeMod.AssetDetails] = js.native
  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  var AssetType: js.UndefOr[typings.awsSdk.dataexchangeMod.AssetType] = js.native
  /**
    * The date and time that the asset was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The unique identifier for the data set associated with this asset.
    */
  var DataSetId: js.UndefOr[Id] = js.native
  /**
    * The unique identifier for the asset.
    */
  var Id: js.UndefOr[typings.awsSdk.dataexchangeMod.Id] = js.native
  /**
    * The name of the asset When importing from Amazon S3, the S3 object key is used as the asset name. When exporting to Amazon S3, the asset name is used as default target S3 object key.
    */
  var Name: js.UndefOr[AssetName] = js.native
  /**
    * The unique identifier for the revision associated with this asset.
    */
  var RevisionId: js.UndefOr[Id] = js.native
  /**
    * The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is returned when an asset owner is viewing the entitled copy of its owned asset.
    */
  var SourceId: js.UndefOr[Id] = js.native
  /**
    * The date and time that the asset was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object UpdateAssetResponse {
  @scala.inline
  def apply(): UpdateAssetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAssetResponse]
  }
  @scala.inline
  implicit class UpdateAssetResponseOps[Self <: UpdateAssetResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setAssetDetails(value: AssetDetails): Self = this.set("AssetDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetDetails: Self = this.set("AssetDetails", js.undefined)
    @scala.inline
    def setAssetType(value: AssetType): Self = this.set("AssetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetType: Self = this.set("AssetType", js.undefined)
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setDataSetId(value: Id): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSetId: Self = this.set("DataSetId", js.undefined)
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: AssetName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRevisionId(value: Id): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
    @scala.inline
    def setSourceId(value: Id): Self = this.set("SourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceId: Self = this.set("SourceId", js.undefined)
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
  
}

