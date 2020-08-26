package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDocument extends js.Object {
  /**
    * The object key name to use when a 4XX class error occurs.
    */
  var Key: ObjectKey = js.native
}

object ErrorDocument {
  @scala.inline
  def apply(Key: ObjectKey): ErrorDocument = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDocument]
  }
  @scala.inline
  implicit class ErrorDocumentOps[Self <: ErrorDocument] (val x: Self) extends AnyVal {
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
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
  }
  
}

