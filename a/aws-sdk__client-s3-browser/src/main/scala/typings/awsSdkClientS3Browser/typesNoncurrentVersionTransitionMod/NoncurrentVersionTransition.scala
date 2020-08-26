package typings.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.GLACIER
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoncurrentVersionTransition extends js.Object {
  /**
    * <p>Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html">How Amazon S3 Calculates When an Object Became Noncurrent</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  var NoncurrentDays: js.UndefOr[Double] = js.native
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[GLACIER | STANDARD_IA | ONEZONE_IA | String] = js.native
}

object NoncurrentVersionTransition {
  @scala.inline
  def apply(): NoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoncurrentVersionTransition]
  }
  @scala.inline
  implicit class NoncurrentVersionTransitionOps[Self <: NoncurrentVersionTransition] (val x: Self) extends AnyVal {
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
    def setNoncurrentDays(value: Double): Self = this.set("NoncurrentDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoncurrentDays: Self = this.set("NoncurrentDays", js.undefined)
    @scala.inline
    def setStorageClass(value: GLACIER | STANDARD_IA | ONEZONE_IA | String): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
  }
  
}

