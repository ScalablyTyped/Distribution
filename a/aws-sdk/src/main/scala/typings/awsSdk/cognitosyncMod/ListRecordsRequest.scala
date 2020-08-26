package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRecordsRequest extends js.Object {
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: typings.awsSdk.cognitosyncMod.DatasetName = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: typings.awsSdk.cognitosyncMod.IdentityId = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId = js.native
  /**
    * The last server sync count for this record.
    */
  var LastSyncCount: js.UndefOr[Long] = js.native
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[IntegerString] = js.native
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A token containing a session ID, identity ID, and expiration.
    */
  var SyncSessionToken: js.UndefOr[typings.awsSdk.cognitosyncMod.SyncSessionToken] = js.native
}

object ListRecordsRequest {
  @scala.inline
  def apply(DatasetName: DatasetName, IdentityId: IdentityId, IdentityPoolId: IdentityPoolId): ListRecordsRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecordsRequest]
  }
  @scala.inline
  implicit class ListRecordsRequestOps[Self <: ListRecordsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatasetName(value: DatasetName): Self = this.set("DatasetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastSyncCount(value: Long): Self = this.set("LastSyncCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSyncCount: Self = this.set("LastSyncCount", js.undefined)
    @scala.inline
    def setMaxResults(value: IntegerString): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSyncSessionToken(value: SyncSessionToken): Self = this.set("SyncSessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncSessionToken: Self = this.set("SyncSessionToken", js.undefined)
  }
  
}

