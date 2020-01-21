package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageTypeLimit extends js.Object {
  /**
    *  Name of storage limits that are applicable for given storage type. If  StorageType  is ebs, following storage options are applicable  MinimumVolumeSize Minimum amount of volume size that is applicable for given storage type.It can be empty if it is not applicable. MaximumVolumeSize Maximum amount of volume size that is applicable for given storage type.It can be empty if it is not applicable. MaximumIops Maximum amount of Iops that is applicable for given storage type.It can be empty if it is not applicable. MinimumIops Minimum amount of Iops that is applicable for given storage type.It can be empty if it is not applicable.  
    */
  var LimitName: js.UndefOr[typings.awsSdk.esMod.LimitName] = js.native
  /**
    *  Values for the  StorageTypeLimit$LimitName  . 
    */
  var LimitValues: js.UndefOr[LimitValueList] = js.native
}

object StorageTypeLimit {
  @scala.inline
  def apply(LimitName: LimitName = null, LimitValues: LimitValueList = null): StorageTypeLimit = {
    val __obj = js.Dynamic.literal()
    if (LimitName != null) __obj.updateDynamic("LimitName")(LimitName.asInstanceOf[js.Any])
    if (LimitValues != null) __obj.updateDynamic("LimitValues")(LimitValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageTypeLimit]
  }
}

