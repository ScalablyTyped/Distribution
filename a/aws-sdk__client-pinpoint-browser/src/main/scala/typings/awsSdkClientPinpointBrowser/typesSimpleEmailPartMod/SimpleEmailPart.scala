package typings.awsSdkClientPinpointBrowser.typesSimpleEmailPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleEmailPart extends js.Object {
  /**
    * The character set of the content.
    */
  var Charset: js.UndefOr[String] = js.native
  /**
    * The textual data of the content.
    */
  var Data: js.UndefOr[String] = js.native
}

object SimpleEmailPart {
  @scala.inline
  def apply(): SimpleEmailPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleEmailPart]
  }
  @scala.inline
  implicit class SimpleEmailPartOps[Self <: SimpleEmailPart] (val x: Self) extends AnyVal {
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
    def setCharset(value: String): Self = this.set("Charset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharset: Self = this.set("Charset", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
  }
  
}

