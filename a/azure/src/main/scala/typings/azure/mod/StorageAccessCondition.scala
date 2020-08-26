package typings.azure.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageAccessCondition extends js.Object {
  var `If-Match`: String = js.native
  var `If-Modified-Since`: Date = js.native
  var `If-None-Match`: String = js.native
  var `If-Unmodified-Since`: Date = js.native
}

object StorageAccessCondition {
  @scala.inline
  def apply(
    `If-Match`: String,
    `If-Modified-Since`: Date,
    `If-None-Match`: String,
    `If-Unmodified-Since`: Date
  ): StorageAccessCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("If-Match")(`If-Match`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-Modified-Since")(`If-Modified-Since`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-None-Match")(`If-None-Match`.asInstanceOf[js.Any])
    __obj.updateDynamic("If-Unmodified-Since")(`If-Unmodified-Since`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAccessCondition]
  }
  @scala.inline
  implicit class StorageAccessConditionOps[Self <: StorageAccessCondition] (val x: Self) extends AnyVal {
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
    def `setIf-Match`(value: String): Self = this.set("If-Match", value.asInstanceOf[js.Any])
    @scala.inline
    def `setIf-Modified-Since`(value: Date): Self = this.set("If-Modified-Since", value.asInstanceOf[js.Any])
    @scala.inline
    def `setIf-None-Match`(value: String): Self = this.set("If-None-Match", value.asInstanceOf[js.Any])
    @scala.inline
    def `setIf-Unmodified-Since`(value: Date): Self = this.set("If-Unmodified-Since", value.asInstanceOf[js.Any])
  }
  
}

