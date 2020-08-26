package typings.azureArmResource.subscriptionModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TenantIdDescription extends js.Object {
  /**
    * The fully qualified ID of the tenant. For example,
    * /tenants/00000000-0000-0000-0000-000000000000.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The tenant ID. For example, 00000000-0000-0000-0000-000000000000.
    */
  val tenantId: js.UndefOr[String] = js.native
}

object TenantIdDescription {
  @scala.inline
  def apply(): TenantIdDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenantIdDescription]
  }
  @scala.inline
  implicit class TenantIdDescriptionOps[Self <: TenantIdDescription] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
  }
  
}

