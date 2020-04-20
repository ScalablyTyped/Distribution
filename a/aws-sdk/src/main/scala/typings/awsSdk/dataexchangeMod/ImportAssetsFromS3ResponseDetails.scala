package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportAssetsFromS3ResponseDetails extends js.Object {
  /**
    * Is a list of Amazon S3 bucket and object key pairs.
    */
  var AssetSources: ListOfAssetSourceEntry = js.native
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id = js.native
  /**
    * The unique identifier for the revision associated with this import response.
    */
  var RevisionId: Id = js.native
}

object ImportAssetsFromS3ResponseDetails {
  @scala.inline
  def apply(AssetSources: ListOfAssetSourceEntry, DataSetId: Id, RevisionId: Id): ImportAssetsFromS3ResponseDetails = {
    val __obj = js.Dynamic.literal(AssetSources = AssetSources.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetsFromS3ResponseDetails]
  }
}

