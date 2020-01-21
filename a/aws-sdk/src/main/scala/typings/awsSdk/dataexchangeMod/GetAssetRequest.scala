package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssetRequest extends js.Object {
  /**
    * The unique identifier for an asset.
    */
  var AssetId: string = js.native
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string = js.native
}

object GetAssetRequest {
  @scala.inline
  def apply(AssetId: string, DataSetId: string, RevisionId: string): GetAssetRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAssetRequest]
  }
}

