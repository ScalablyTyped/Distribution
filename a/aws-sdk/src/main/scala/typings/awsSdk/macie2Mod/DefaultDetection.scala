package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultDetection extends js.Object {
  /**
    * The total number of occurrences of the type of data that was detected.
    */
  var count: js.UndefOr[long] = js.native
  /**
    * The type of data that was detected. For example, AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
    */
  var `type`: js.UndefOr[string] = js.native
}

object DefaultDetection {
  @scala.inline
  def apply(): DefaultDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultDetection]
  }
  @scala.inline
  implicit class DefaultDetectionOps[Self <: DefaultDetection] (val x: Self) extends AnyVal {
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
    def setCount(value: long): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

