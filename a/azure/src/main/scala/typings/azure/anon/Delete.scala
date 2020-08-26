package typings.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delete extends js.Object {
  var Delete: Boolean = js.native
  var Read: Boolean = js.native
  var RetentionPolicy: Days = js.native
  var Version: Double = js.native
  var Write: Boolean = js.native
}

object Delete {
  @scala.inline
  def apply(Delete: Boolean, Read: Boolean, RetentionPolicy: Days, Version: Double, Write: Boolean): Delete = {
    val __obj = js.Dynamic.literal(Delete = Delete.asInstanceOf[js.Any], Read = Read.asInstanceOf[js.Any], RetentionPolicy = RetentionPolicy.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], Write = Write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  @scala.inline
  implicit class DeleteOps[Self <: Delete] (val x: Self) extends AnyVal {
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
    def setDelete(value: Boolean): Self = this.set("Delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: Boolean): Self = this.set("Read", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetentionPolicy(value: Days): Self = this.set("RetentionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrite(value: Boolean): Self = this.set("Write", value.asInstanceOf[js.Any])
  }
  
}

