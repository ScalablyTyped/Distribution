package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionAtRestOptionsStatus extends js.Object {
  /**
    *  Specifies the Encryption At Rest options for the specified Elasticsearch domain.
    */
  var Options: EncryptionAtRestOptions = js.native
  /**
    *  Specifies the status of the Encryption At Rest options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}

object EncryptionAtRestOptionsStatus {
  @scala.inline
  def apply(Options: EncryptionAtRestOptions, Status: OptionStatus): EncryptionAtRestOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAtRestOptionsStatus]
  }
  @scala.inline
  implicit class EncryptionAtRestOptionsStatusOps[Self <: EncryptionAtRestOptionsStatus] (val x: Self) extends AnyVal {
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
    def setOptions(value: EncryptionAtRestOptions): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: OptionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
  }
  
}

