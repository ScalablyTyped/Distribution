package typings.awsSdkClientS3Browser.typesCopyPartResultMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyPartResult extends js.Object {
  /**
    * <p>Entity tag of the object.</p>
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * <p>Date and time at which the object was uploaded.</p>
    */
  var LastModified: js.UndefOr[Date | String | Double] = js.native
}

object CopyPartResult {
  @scala.inline
  def apply(): CopyPartResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyPartResult]
  }
  @scala.inline
  implicit class CopyPartResultOps[Self <: CopyPartResult] (val x: Self) extends AnyVal {
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setLastModified(value: Date | String | Double): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
  }
  
}

