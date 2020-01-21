package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationRevisionOutput extends js.Object {
  /**
    * The name of the application that corresponds to the revision.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * Additional information about the revision, including type and location.
    */
  var revision: js.UndefOr[RevisionLocation] = js.native
  /**
    * General information about the revision.
    */
  var revisionInfo: js.UndefOr[GenericRevisionInfo] = js.native
}

object GetApplicationRevisionOutput {
  @scala.inline
  def apply(
    applicationName: ApplicationName = null,
    revision: RevisionLocation = null,
    revisionInfo: GenericRevisionInfo = null
  ): GetApplicationRevisionOutput = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (revisionInfo != null) __obj.updateDynamic("revisionInfo")(revisionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationRevisionOutput]
  }
}

