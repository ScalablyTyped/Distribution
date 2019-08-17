package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreNoncurrentVersionExpirationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _NoncurrentVersionExpiration extends js.Object {
  /**
    * <p>Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html">How Amazon S3 Calculates When an Object Became Noncurrent</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  var NoncurrentDays: js.UndefOr[Double] = js.undefined
}

object _NoncurrentVersionExpiration {
  @scala.inline
  def apply(NoncurrentDays: Int | Double = null): _NoncurrentVersionExpiration = {
    val __obj = js.Dynamic.literal()
    if (NoncurrentDays != null) __obj.updateDynamic("NoncurrentDays")(NoncurrentDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[_NoncurrentVersionExpiration]
  }
}

