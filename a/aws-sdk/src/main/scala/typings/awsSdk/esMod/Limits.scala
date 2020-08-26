package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limits extends js.Object {
  /**
    *  List of additional limits that are specific to a given InstanceType and for each of it's  InstanceRole  . 
    */
  var AdditionalLimits: js.UndefOr[AdditionalLimitList] = js.native
  var InstanceLimits: js.UndefOr[typings.awsSdk.esMod.InstanceLimits] = js.native
  /**
    * StorageType represents the list of storage related types and attributes that are available for given InstanceType. 
    */
  var StorageTypes: js.UndefOr[StorageTypeList] = js.native
}

object Limits {
  @scala.inline
  def apply(): Limits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Limits]
  }
  @scala.inline
  implicit class LimitsOps[Self <: Limits] (val x: Self) extends AnyVal {
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
    def setAdditionalLimitsVarargs(value: AdditionalLimit*): Self = this.set("AdditionalLimits", js.Array(value :_*))
    @scala.inline
    def setAdditionalLimits(value: AdditionalLimitList): Self = this.set("AdditionalLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalLimits: Self = this.set("AdditionalLimits", js.undefined)
    @scala.inline
    def setInstanceLimits(value: InstanceLimits): Self = this.set("InstanceLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceLimits: Self = this.set("InstanceLimits", js.undefined)
    @scala.inline
    def setStorageTypesVarargs(value: StorageType*): Self = this.set("StorageTypes", js.Array(value :_*))
    @scala.inline
    def setStorageTypes(value: StorageTypeList): Self = this.set("StorageTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageTypes: Self = this.set("StorageTypes", js.undefined)
  }
  
}

