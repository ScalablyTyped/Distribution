package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackedActionLastAccessed extends js.Object {
  /**
    * The name of the tracked action to which access was attempted. Tracked actions are actions that report activity to IAM.
    */
  var ActionName: js.UndefOr[stringType] = js.native
  var LastAccessedEntity: js.UndefOr[arnType] = js.native
  /**
    * The Region from which the authenticated entity (user or role) last attempted to access the tracked action. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAccessedRegion: js.UndefOr[stringType] = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated entity most recently attempted to access the tracked service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAccessedTime: js.UndefOr[dateType] = js.native
}

object TrackedActionLastAccessed {
  @scala.inline
  def apply(
    ActionName: stringType = null,
    LastAccessedEntity: arnType = null,
    LastAccessedRegion: stringType = null,
    LastAccessedTime: dateType = null
  ): TrackedActionLastAccessed = {
    val __obj = js.Dynamic.literal()
    if (ActionName != null) __obj.updateDynamic("ActionName")(ActionName.asInstanceOf[js.Any])
    if (LastAccessedEntity != null) __obj.updateDynamic("LastAccessedEntity")(LastAccessedEntity.asInstanceOf[js.Any])
    if (LastAccessedRegion != null) __obj.updateDynamic("LastAccessedRegion")(LastAccessedRegion.asInstanceOf[js.Any])
    if (LastAccessedTime != null) __obj.updateDynamic("LastAccessedTime")(LastAccessedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackedActionLastAccessed]
  }
}

