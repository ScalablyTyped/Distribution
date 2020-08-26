package typings.code.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings_ extends js.Object {
  /**
    * Ignore object prototypes when doing a deep comparison?
    * Defaults to false.
    */
  var comparePrototypes: js.UndefOr[Boolean] = js.native
  /**
    * Truncate long assertion error messages for readability?
    * Defaults to true.
    */
  var truncateMessages: js.UndefOr[Boolean] = js.native
}

object Settings_ {
  @scala.inline
  def apply(): Settings_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings_]
  }
  @scala.inline
  implicit class Settings_Ops[Self <: Settings_] (val x: Self) extends AnyVal {
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
    def setComparePrototypes(value: Boolean): Self = this.set("comparePrototypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparePrototypes: Self = this.set("comparePrototypes", js.undefined)
    @scala.inline
    def setTruncateMessages(value: Boolean): Self = this.set("truncateMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncateMessages: Self = this.set("truncateMessages", js.undefined)
  }
  
}

