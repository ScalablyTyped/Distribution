package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedObject extends js.Object {
  /**
    * The S3SignedObject.
    */
  var s3: js.UndefOr[S3SignedObject] = js.native
}

object SignedObject {
  @scala.inline
  def apply(): SignedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignedObject]
  }
  @scala.inline
  implicit class SignedObjectOps[Self <: SignedObject] (val x: Self) extends AnyVal {
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
    def setS3(value: S3SignedObject): Self = this.set("s3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3: Self = this.set("s3", js.undefined)
  }
  
}

