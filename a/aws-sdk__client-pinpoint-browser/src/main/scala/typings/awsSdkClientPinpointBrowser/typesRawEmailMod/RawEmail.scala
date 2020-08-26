package typings.awsSdkClientPinpointBrowser.typesRawEmailMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawEmail extends js.Object {
  /**
    * The raw data of the email.
    */
  var Data: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.native
}

object RawEmail {
  @scala.inline
  def apply(): RawEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawEmail]
  }
  @scala.inline
  implicit class RawEmailOps[Self <: RawEmail] (val x: Self) extends AnyVal {
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
    def setData(value: ArrayBuffer | ArrayBufferView | String): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
  }
  
}

