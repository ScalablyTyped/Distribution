package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportAssetFromSignedUrlRequestDetails extends js.Object {
  /**
    * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name.
    */
  var AssetName: typings.awsSdk.dataexchangeMod.AssetName = js.native
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id = js.native
  /**
    * The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
    */
  var Md5Hash: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = js.native
  /**
    * The unique identifier for the revision associated with this import request.
    */
  var RevisionId: Id = js.native
}

object ImportAssetFromSignedUrlRequestDetails {
  @scala.inline
  def apply(
    AssetName: AssetName,
    DataSetId: Id,
    Md5Hash: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093,
    RevisionId: Id
  ): ImportAssetFromSignedUrlRequestDetails = {
    val __obj = js.Dynamic.literal(AssetName = AssetName.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Md5Hash = Md5Hash.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImportAssetFromSignedUrlRequestDetails]
  }
}

