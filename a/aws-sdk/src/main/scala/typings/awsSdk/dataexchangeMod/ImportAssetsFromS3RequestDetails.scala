package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportAssetsFromS3RequestDetails extends js.Object {
  /**
    * Is a list of S3 bucket and object key pairs.
    */
  var AssetSources: ListOfAssetSourceEntry = js.native
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id = js.native
  /**
    * The unique identifier for the revision associated with this import request.
    */
  var RevisionId: Id = js.native
}

object ImportAssetsFromS3RequestDetails {
  @scala.inline
  def apply(AssetSources: ListOfAssetSourceEntry, DataSetId: Id, RevisionId: Id): ImportAssetsFromS3RequestDetails = {
    val __obj = js.Dynamic.literal(AssetSources = AssetSources.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImportAssetsFromS3RequestDetails]
  }
}

