package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoncurrentVersionTransition extends js.Object {
  /**
    * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates How Long an Object Has Been Noncurrent in the Amazon Simple Storage Service Developer Guide.
    */
  var NoncurrentDays: js.UndefOr[Days] = js.native
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[TransitionStorageClass] = js.native
}

object NoncurrentVersionTransition {
  @scala.inline
  def apply(NoncurrentDays: js.UndefOr[Days] = js.undefined, StorageClass: TransitionStorageClass = null): NoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NoncurrentDays)) __obj.updateDynamic("NoncurrentDays")(NoncurrentDays.get.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoncurrentVersionTransition]
  }
}

