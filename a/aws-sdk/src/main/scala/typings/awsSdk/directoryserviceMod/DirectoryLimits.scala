package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryLimits extends js.Object {
  /**
    * The current number of cloud directories in the Region.
    */
  var CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit] = js.native
  /**
    * The maximum number of cloud directories allowed in the Region.
    */
  var CloudOnlyDirectoriesLimit: js.UndefOr[Limit] = js.native
  /**
    * Indicates if the cloud directory limit has been reached.
    */
  var CloudOnlyDirectoriesLimitReached: js.UndefOr[typings.awsSdk.directoryserviceMod.CloudOnlyDirectoriesLimitReached] = js.native
  /**
    * The current number of AWS Managed Microsoft AD directories in the region.
    */
  var CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit] = js.native
  /**
    * The maximum number of AWS Managed Microsoft AD directories allowed in the region.
    */
  var CloudOnlyMicrosoftADLimit: js.UndefOr[Limit] = js.native
  /**
    * Indicates if the AWS Managed Microsoft AD directory limit has been reached.
    */
  var CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.native
  /**
    * The current number of connected directories in the Region.
    */
  var ConnectedDirectoriesCurrentCount: js.UndefOr[Limit] = js.native
  /**
    * The maximum number of connected directories allowed in the Region.
    */
  var ConnectedDirectoriesLimit: js.UndefOr[Limit] = js.native
  /**
    * Indicates if the connected directory limit has been reached.
    */
  var ConnectedDirectoriesLimitReached: js.UndefOr[typings.awsSdk.directoryserviceMod.ConnectedDirectoriesLimitReached] = js.native
}

object DirectoryLimits {
  @scala.inline
  def apply(
    CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined,
    CloudOnlyDirectoriesLimit: js.UndefOr[Limit] = js.undefined,
    CloudOnlyDirectoriesLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined,
    CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit] = js.undefined,
    CloudOnlyMicrosoftADLimit: js.UndefOr[Limit] = js.undefined,
    CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined,
    ConnectedDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined,
    ConnectedDirectoriesLimit: js.UndefOr[Limit] = js.undefined,
    ConnectedDirectoriesLimitReached: js.UndefOr[ConnectedDirectoriesLimitReached] = js.undefined
  ): DirectoryLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CloudOnlyDirectoriesCurrentCount)) __obj.updateDynamic("CloudOnlyDirectoriesCurrentCount")(CloudOnlyDirectoriesCurrentCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudOnlyDirectoriesLimit)) __obj.updateDynamic("CloudOnlyDirectoriesLimit")(CloudOnlyDirectoriesLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudOnlyDirectoriesLimitReached)) __obj.updateDynamic("CloudOnlyDirectoriesLimitReached")(CloudOnlyDirectoriesLimitReached.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudOnlyMicrosoftADCurrentCount)) __obj.updateDynamic("CloudOnlyMicrosoftADCurrentCount")(CloudOnlyMicrosoftADCurrentCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudOnlyMicrosoftADLimit)) __obj.updateDynamic("CloudOnlyMicrosoftADLimit")(CloudOnlyMicrosoftADLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudOnlyMicrosoftADLimitReached)) __obj.updateDynamic("CloudOnlyMicrosoftADLimitReached")(CloudOnlyMicrosoftADLimitReached.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ConnectedDirectoriesCurrentCount)) __obj.updateDynamic("ConnectedDirectoriesCurrentCount")(ConnectedDirectoriesCurrentCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ConnectedDirectoriesLimit)) __obj.updateDynamic("ConnectedDirectoriesLimit")(ConnectedDirectoriesLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ConnectedDirectoriesLimitReached)) __obj.updateDynamic("ConnectedDirectoriesLimitReached")(ConnectedDirectoriesLimitReached.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryLimits]
  }
}

