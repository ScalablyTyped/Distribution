package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneStackResult extends js.Object {
  /**
    * The cloned stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}

object CloneStackResult {
  @scala.inline
  def apply(): CloneStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloneStackResult]
  }
  @scala.inline
  implicit class CloneStackResultOps[Self <: CloneStackResult] (val x: Self) extends AnyVal {
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
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
  
}

