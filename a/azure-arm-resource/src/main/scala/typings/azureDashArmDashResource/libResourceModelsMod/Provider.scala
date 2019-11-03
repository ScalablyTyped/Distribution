package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  /**
    * The provider ID.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The namespace of the resource provider.
    */
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * The registration state of the provider.
    */
  val registrationState: js.UndefOr[String] = js.undefined
  /**
    * The collection of provider resource types.
    */
  val resourceTypes: js.UndefOr[js.Array[ProviderResourceType]] = js.undefined
}

object Provider {
  @scala.inline
  def apply(
    id: String = null,
    namespace: String = null,
    registrationState: String = null,
    resourceTypes: js.Array[ProviderResourceType] = null
  ): Provider = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (registrationState != null) __obj.updateDynamic("registrationState")(registrationState)
    if (resourceTypes != null) __obj.updateDynamic("resourceTypes")(resourceTypes)
    __obj.asInstanceOf[Provider]
  }
}

