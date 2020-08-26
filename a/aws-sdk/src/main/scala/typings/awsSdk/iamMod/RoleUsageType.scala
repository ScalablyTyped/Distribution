package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleUsageType extends js.Object {
  /**
    * The name of the Region where the service-linked role is being used.
    */
  var Region: js.UndefOr[RegionNameType] = js.native
  /**
    * The name of the resource that is using the service-linked role.
    */
  var Resources: js.UndefOr[ArnListType] = js.native
}

object RoleUsageType {
  @scala.inline
  def apply(): RoleUsageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleUsageType]
  }
  @scala.inline
  implicit class RoleUsageTypeOps[Self <: RoleUsageType] (val x: Self) extends AnyVal {
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
    def setRegion(value: RegionNameType): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: arnType*): Self = this.set("Resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: ArnListType): Self = this.set("Resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
  }
  
}

