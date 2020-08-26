package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ObjectOwner extends js.Object {
  /**
    * 
    */
  var DisplayName: js.UndefOr[NonEmptyMaxLength1024String] = js.native
  /**
    * 
    */
  var ID: js.UndefOr[NonEmptyMaxLength1024String] = js.native
}

object S3ObjectOwner {
  @scala.inline
  def apply(): S3ObjectOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ObjectOwner]
  }
  @scala.inline
  implicit class S3ObjectOwnerOps[Self <: S3ObjectOwner] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: NonEmptyMaxLength1024String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setID(value: NonEmptyMaxLength1024String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteID: Self = this.set("ID", js.undefined)
  }
  
}

