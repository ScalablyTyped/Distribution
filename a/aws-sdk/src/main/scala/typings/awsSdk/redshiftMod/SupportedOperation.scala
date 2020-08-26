package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedOperation extends js.Object {
  /**
    * A list of the supported operations.
    */
  var OperationName: js.UndefOr[String] = js.native
}

object SupportedOperation {
  @scala.inline
  def apply(): SupportedOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedOperation]
  }
  @scala.inline
  implicit class SupportedOperationOps[Self <: SupportedOperation] (val x: Self) extends AnyVal {
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
    def setOperationName(value: String): Self = this.set("OperationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("OperationName", js.undefined)
  }
  
}

