package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  /**
    * An Amazon S3 storage location.
    */
  var S3: js.UndefOr[S3Storage] = js.native
}

object Storage {
  @scala.inline
  def apply(): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
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
    def setS3(value: S3Storage): Self = this.set("S3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3: Self = this.set("S3", js.undefined)
  }
  
}

