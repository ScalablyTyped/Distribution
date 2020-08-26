package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawString extends js.Object {
  /**
    * The YAML-formatted or JSON-formatted revision string. It includes information about which Lambda function to update and optional Lambda functions that validate deployment lifecycle events.
    */
  var content: js.UndefOr[RawStringContent] = js.native
  /**
    * The SHA256 hash value of the revision content.
    */
  var sha256: js.UndefOr[RawStringSha256] = js.native
}

object RawString {
  @scala.inline
  def apply(): RawString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawString]
  }
  @scala.inline
  implicit class RawStringOps[Self <: RawString] (val x: Self) extends AnyVal {
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
    def setContent(value: RawStringContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setSha256(value: RawStringSha256): Self = this.set("sha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
  }
  
}

