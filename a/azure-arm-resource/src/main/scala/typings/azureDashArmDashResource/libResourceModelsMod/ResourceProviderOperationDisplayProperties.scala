package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceProviderOperationDisplayProperties extends js.Object {
  /**
    * Operation description.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Resource provider operation.
    */
  var operation: js.UndefOr[String] = js.undefined
  /**
    * Operation provider.
    */
  var provider: js.UndefOr[String] = js.undefined
  /**
    * Operation description.
    */
  var publisher: js.UndefOr[String] = js.undefined
  /**
    * Operation resource.
    */
  var resource: js.UndefOr[String] = js.undefined
}

object ResourceProviderOperationDisplayProperties {
  @scala.inline
  def apply(
    description: String = null,
    operation: String = null,
    provider: String = null,
    publisher: String = null,
    resource: String = null
  ): ResourceProviderOperationDisplayProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[ResourceProviderOperationDisplayProperties]
  }
}

