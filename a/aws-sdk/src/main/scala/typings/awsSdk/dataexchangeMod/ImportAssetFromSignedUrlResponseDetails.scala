package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportAssetFromSignedUrlResponseDetails extends js.Object {
  /**
    * The name for the asset associated with this import response.
    */
  var AssetName: typings.awsSdk.dataexchangeMod.AssetName = js.native
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id = js.native
  /**
    * The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
    */
  var Md5Hash: js.UndefOr[stringMin24Max24PatternAZaZ094AZaZ092AZaZ093] = js.native
  /**
    * The unique identifier for the revision associated with this import response.
    */
  var RevisionId: Id = js.native
  /**
    * The signed URL.
    */
  var SignedUrl: js.UndefOr[string] = js.native
  /**
    * The time and date at which the signed URL expires, in ISO 8601 format.
    */
  var SignedUrlExpiresAt: js.UndefOr[Timestamp] = js.native
}

object ImportAssetFromSignedUrlResponseDetails {
  @scala.inline
  def apply(
    AssetName: AssetName,
    DataSetId: Id,
    RevisionId: Id,
    Md5Hash: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = null,
    SignedUrl: string = null,
    SignedUrlExpiresAt: Timestamp = null
  ): ImportAssetFromSignedUrlResponseDetails = {
    val __obj = js.Dynamic.literal(AssetName = AssetName.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    if (Md5Hash != null) __obj.updateDynamic("Md5Hash")(Md5Hash.asInstanceOf[js.Any])
    if (SignedUrl != null) __obj.updateDynamic("SignedUrl")(SignedUrl.asInstanceOf[js.Any])
    if (SignedUrlExpiresAt != null) __obj.updateDynamic("SignedUrlExpiresAt")(SignedUrlExpiresAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetFromSignedUrlResponseDetails]
  }
}

