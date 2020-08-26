package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phase1IntegrityAlgorithmsRequestListValue extends js.Object {
  /**
    * The value for the integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.native
}

object Phase1IntegrityAlgorithmsRequestListValue {
  @scala.inline
  def apply(): Phase1IntegrityAlgorithmsRequestListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase1IntegrityAlgorithmsRequestListValue]
  }
  @scala.inline
  implicit class Phase1IntegrityAlgorithmsRequestListValueOps[Self <: Phase1IntegrityAlgorithmsRequestListValue] (val x: Self) extends AnyVal {
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

