package typings.azureDashArmDashResource.libSubscriptionModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TenantIdDescription extends js.Object {
  /**
    * The fully qualified ID of the tenant. For example,
    * /tenants/00000000-0000-0000-0000-000000000000.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The tenant ID. For example, 00000000-0000-0000-0000-000000000000.
    */
  val tenantId: js.UndefOr[String] = js.undefined
}

object TenantIdDescription {
  @scala.inline
  def apply(id: String = null, tenantId: String = null): TenantIdDescription = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId)
    __obj.asInstanceOf[TenantIdDescription]
  }
}

