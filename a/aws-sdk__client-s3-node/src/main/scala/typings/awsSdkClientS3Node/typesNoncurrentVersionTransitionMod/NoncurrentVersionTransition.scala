package typings.awsSdkClientS3Node.typesNoncurrentVersionTransitionMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GLACIER
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoncurrentVersionTransition extends js.Object {
  /**
    * <p>Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html">How Amazon S3 Calculates When an Object Became Noncurrent</a> in the Amazon Simple Storage Service Developer Guide.</p>
    */
  var NoncurrentDays: js.UndefOr[Double] = js.undefined
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[GLACIER | STANDARD_IA | ONEZONE_IA | String] = js.undefined
}

object NoncurrentVersionTransition {
  @scala.inline
  def apply(
    NoncurrentDays: Int | Double = null,
    StorageClass: GLACIER | STANDARD_IA | ONEZONE_IA | String = null
  ): NoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal()
    if (NoncurrentDays != null) __obj.updateDynamic("NoncurrentDays")(NoncurrentDays.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoncurrentVersionTransition]
  }
}

