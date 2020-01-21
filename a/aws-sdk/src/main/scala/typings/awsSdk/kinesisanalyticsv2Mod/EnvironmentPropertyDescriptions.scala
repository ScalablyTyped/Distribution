package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentPropertyDescriptions extends js.Object {
  /**
    * Describes the execution property groups.
    */
  var PropertyGroupDescriptions: js.UndefOr[PropertyGroups] = js.native
}

object EnvironmentPropertyDescriptions {
  @scala.inline
  def apply(PropertyGroupDescriptions: PropertyGroups = null): EnvironmentPropertyDescriptions = {
    val __obj = js.Dynamic.literal()
    if (PropertyGroupDescriptions != null) __obj.updateDynamic("PropertyGroupDescriptions")(PropertyGroupDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentPropertyDescriptions]
  }
}

