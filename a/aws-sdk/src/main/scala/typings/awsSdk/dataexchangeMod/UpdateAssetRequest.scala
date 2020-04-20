package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssetRequest extends js.Object {
  /**
    * The unique identifier for an asset.
    */
  var AssetId: string = js.native
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
  /**
    * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When exporting to Amazon S3, the asset name is used as default target S3 object key.
    */
  var Name: AssetName = js.native
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string = js.native
}

object UpdateAssetRequest {
  @scala.inline
  def apply(AssetId: string, DataSetId: string, Name: AssetName, RevisionId: string): UpdateAssetRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetRequest]
  }
}

