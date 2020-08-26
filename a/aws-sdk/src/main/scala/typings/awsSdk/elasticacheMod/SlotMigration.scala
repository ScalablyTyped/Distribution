package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotMigration extends js.Object {
  /**
    * The percentage of the slot migration that is complete.
    */
  var ProgressPercentage: js.UndefOr[Double] = js.native
}

object SlotMigration {
  @scala.inline
  def apply(): SlotMigration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotMigration]
  }
  @scala.inline
  implicit class SlotMigrationOps[Self <: SlotMigration] (val x: Self) extends AnyVal {
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
    def setProgressPercentage(value: Double): Self = this.set("ProgressPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressPercentage: Self = this.set("ProgressPercentage", js.undefined)
  }
  
}

