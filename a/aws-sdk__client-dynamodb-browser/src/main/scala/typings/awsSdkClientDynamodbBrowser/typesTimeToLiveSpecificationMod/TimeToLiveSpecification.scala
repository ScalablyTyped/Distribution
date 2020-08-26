package typings.awsSdkClientDynamodbBrowser.typesTimeToLiveSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeToLiveSpecification extends js.Object {
  /**
    * <p>The name of the Time to Live attribute used to store the expiration time for items in the table.</p>
    */
  var AttributeName: String = js.native
  /**
    * <p>Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.</p>
    */
  var Enabled: Boolean = js.native
}

object TimeToLiveSpecification {
  @scala.inline
  def apply(AttributeName: String, Enabled: Boolean): TimeToLiveSpecification = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeToLiveSpecification]
  }
  @scala.inline
  implicit class TimeToLiveSpecificationOps[Self <: TimeToLiveSpecification] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: String): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
  }
  
}

