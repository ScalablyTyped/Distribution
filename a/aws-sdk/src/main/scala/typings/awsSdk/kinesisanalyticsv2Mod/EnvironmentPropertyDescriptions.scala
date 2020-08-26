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
  def apply(): EnvironmentPropertyDescriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentPropertyDescriptions]
  }
  @scala.inline
  implicit class EnvironmentPropertyDescriptionsOps[Self <: EnvironmentPropertyDescriptions] (val x: Self) extends AnyVal {
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
    def setPropertyGroupDescriptionsVarargs(value: PropertyGroup*): Self = this.set("PropertyGroupDescriptions", js.Array(value :_*))
    @scala.inline
    def setPropertyGroupDescriptions(value: PropertyGroups): Self = this.set("PropertyGroupDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyGroupDescriptions: Self = this.set("PropertyGroupDescriptions", js.undefined)
  }
  
}

