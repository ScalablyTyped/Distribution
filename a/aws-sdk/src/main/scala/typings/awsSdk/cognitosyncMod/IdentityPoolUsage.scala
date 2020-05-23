package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolUsage extends js.Object {
  /**
    * Data storage information for the identity pool.
    */
  var DataStorage: js.UndefOr[Long] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityPoolId] = js.native
  /**
    * Date on which the identity pool was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  /**
    * Number of sync sessions for the identity pool.
    */
  var SyncSessionsCount: js.UndefOr[Long] = js.native
}

object IdentityPoolUsage {
  @scala.inline
  def apply(
    DataStorage: js.UndefOr[Long] = js.undefined,
    IdentityPoolId: IdentityPoolId = null,
    LastModifiedDate: Date = null,
    SyncSessionsCount: js.UndefOr[Long] = js.undefined
  ): IdentityPoolUsage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DataStorage)) __obj.updateDynamic("DataStorage")(DataStorage.get.asInstanceOf[js.Any])
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (!js.isUndefined(SyncSessionsCount)) __obj.updateDynamic("SyncSessionsCount")(SyncSessionsCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolUsage]
  }
}

