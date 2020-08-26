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
  def apply(): DirectoryLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryLimits]
  }
  @scala.inline
  implicit class DirectoryLimitsOps[Self <: DirectoryLimits] (val x: Self) extends AnyVal {
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
    def setCloudOnlyDirectoriesCurrentCount(value: Limit): Self = this.set("CloudOnlyDirectoriesCurrentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudOnlyDirectoriesCurrentCount: Self = this.set("CloudOnlyDirectoriesCurrentCount", js.undefined)
    @scala.inline
    def setCloudOnlyDirectoriesLimit(value: Limit): Self = this.set("CloudOnlyDirectoriesLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudOnlyDirectoriesLimit: Self = this.set("CloudOnlyDirectoriesLimit", js.undefined)
    @scala.inline
    def setCloudOnlyDirectoriesLimitReached(value: CloudOnlyDirectoriesLimitReached): Self = this.set("CloudOnlyDirectoriesLimitReached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudOnlyDirectoriesLimitReached: Self = this.set("CloudOnlyDirectoriesLimitReached", js.undefined)
    @scala.inline
    def setCloudOnlyMicrosoftADCurrentCount(value: Limit): Self = this.set("CloudOnlyMicrosoftADCurrentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudOnlyMicrosoftADCurrentCount: Self = this.set("CloudOnlyMicrosoftADCurrentCount", js.undefined)
    @scala.inline
    def setCloudOnlyMicrosoftADLimit(value: Limit): Self = this.set("CloudOnlyMicrosoftADLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudOnlyMicrosoftADLimit: Self = this.set("CloudOnlyMicrosoftADLimit", js.undefined)
    @scala.inline
    def setCloudOnlyMicrosoftADLimitReached(value: CloudOnlyDirectoriesLimitReached): Self = this.set("CloudOnlyMicrosoftADLimitReached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudOnlyMicrosoftADLimitReached: Self = this.set("CloudOnlyMicrosoftADLimitReached", js.undefined)
    @scala.inline
    def setConnectedDirectoriesCurrentCount(value: Limit): Self = this.set("ConnectedDirectoriesCurrentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectedDirectoriesCurrentCount: Self = this.set("ConnectedDirectoriesCurrentCount", js.undefined)
    @scala.inline
    def setConnectedDirectoriesLimit(value: Limit): Self = this.set("ConnectedDirectoriesLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectedDirectoriesLimit: Self = this.set("ConnectedDirectoriesLimit", js.undefined)
    @scala.inline
    def setConnectedDirectoriesLimitReached(value: ConnectedDirectoriesLimitReached): Self = this.set("ConnectedDirectoriesLimitReached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectedDirectoriesLimitReached: Self = this.set("ConnectedDirectoriesLimitReached", js.undefined)
  }
  
}

