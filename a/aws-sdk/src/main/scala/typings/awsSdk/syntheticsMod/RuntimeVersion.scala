package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeVersion extends js.Object {
  /**
    * If this runtime version is deprecated, this value is the date of deprecation.
    */
  var DeprecationDate: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the runtime version, created by Amazon.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The date that the runtime version was released.
    */
  var ReleaseDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the runtime version. Currently, the only valid value is syn-1.0.  Specifies the runtime version to use for the canary. Currently, the only valid value is syn-1.0.
    */
  var VersionName: js.UndefOr[String] = js.native
}

object RuntimeVersion {
  @scala.inline
  def apply(
    DeprecationDate: Timestamp = null,
    Description: String = null,
    ReleaseDate: Timestamp = null,
    VersionName: String = null
  ): RuntimeVersion = {
    val __obj = js.Dynamic.literal()
    if (DeprecationDate != null) __obj.updateDynamic("DeprecationDate")(DeprecationDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ReleaseDate != null) __obj.updateDynamic("ReleaseDate")(ReleaseDate.asInstanceOf[js.Any])
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeVersion]
  }
}

