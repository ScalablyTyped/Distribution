package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phase1IntegrityAlgorithmsListValue extends js.Object {
  /**
    * The value for the integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.native
}

object Phase1IntegrityAlgorithmsListValue {
  @scala.inline
  def apply(): Phase1IntegrityAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase1IntegrityAlgorithmsListValue]
  }
  @scala.inline
  implicit class Phase1IntegrityAlgorithmsListValueOps[Self <: Phase1IntegrityAlgorithmsListValue] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

