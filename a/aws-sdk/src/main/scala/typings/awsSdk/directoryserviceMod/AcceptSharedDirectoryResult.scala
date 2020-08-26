package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptSharedDirectoryResult extends js.Object {
  /**
    * The shared directory in the directory consumer account.
    */
  var SharedDirectory: js.UndefOr[typings.awsSdk.directoryserviceMod.SharedDirectory] = js.native
}

object AcceptSharedDirectoryResult {
  @scala.inline
  def apply(): AcceptSharedDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptSharedDirectoryResult]
  }
  @scala.inline
  implicit class AcceptSharedDirectoryResultOps[Self <: AcceptSharedDirectoryResult] (val x: Self) extends AnyVal {
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
    def setSharedDirectory(value: SharedDirectory): Self = this.set("SharedDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedDirectory: Self = this.set("SharedDirectory", js.undefined)
  }
  
}

