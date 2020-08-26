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
  def apply(): StorageTypeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageTypeLimit]
  }
  @scala.inline
  implicit class StorageTypeLimitOps[Self <: StorageTypeLimit] (val x: Self) extends AnyVal {
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
    def setLimitName(value: LimitName): Self = this.set("LimitName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitName: Self = this.set("LimitName", js.undefined)
    @scala.inline
    def setLimitValuesVarargs(value: LimitValue*): Self = this.set("LimitValues", js.Array(value :_*))
    @scala.inline
    def setLimitValues(value: LimitValueList): Self = this.set("LimitValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitValues: Self = this.set("LimitValues", js.undefined)
  }
  
}

