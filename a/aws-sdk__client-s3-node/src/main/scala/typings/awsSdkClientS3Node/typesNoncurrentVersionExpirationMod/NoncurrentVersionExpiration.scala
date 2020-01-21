package typings.awsSdkClientS3Node.typesNoncurrentVersionExpirationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoncurrentVersionExpiration extends js.Object {
  /**
    * <p>Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html">How Amazon S3 Calculates When an Object Became Noncurrent</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  var NoncurrentDays: js.UndefOr[Double] = js.undefined
}

object NoncurrentVersionExpiration {
  @scala.inline
  def apply(NoncurrentDays: Int | Double = null): NoncurrentVersionExpiration = {
    val __obj = js.Dynamic.literal()
    if (NoncurrentDays != null) __obj.updateDynamic("NoncurrentDays")(NoncurrentDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoncurrentVersionExpiration]
  }
}

