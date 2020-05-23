package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointInput extends js.Object {
  /**
    * The name of the new endpoint configuration.
    */
  var EndpointConfigName: typings.awsSdk.sagemakerMod.EndpointConfigName = js.native
  /**
    * The name of the endpoint whose configuration you want to update.
    */
  var EndpointName: typings.awsSdk.sagemakerMod.EndpointName = js.native
  /**
    * When you are updating endpoint resources with UpdateEndpointInput$RetainAllVariantProperties, whose value is set to true, ExcludeRetainedVariantProperties specifies the list of type VariantProperty to override with the values provided by EndpointConfig. If you don't specify a value for ExcludeAllVariantProperties, no variant properties are overridden. 
    */
  var ExcludeRetainedVariantProperties: js.UndefOr[VariantPropertyList] = js.native
  /**
    * When updating endpoint resources, enables or disables the retention of variant properties, such as the instance count or the variant weight. To retain the variant properties of an endpoint when updating it, set RetainAllVariantProperties to true. To use the variant properties specified in a new EndpointConfig call when updating an endpoint, set RetainAllVariantProperties to false.
    */
  var RetainAllVariantProperties: js.UndefOr[Boolean] = js.native
}

object UpdateEndpointInput {
  @scala.inline
  def apply(
    EndpointConfigName: EndpointConfigName,
    EndpointName: EndpointName,
    ExcludeRetainedVariantProperties: VariantPropertyList = null,
    RetainAllVariantProperties: js.UndefOr[Boolean] = js.undefined
  ): UpdateEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
    if (ExcludeRetainedVariantProperties != null) __obj.updateDynamic("ExcludeRetainedVariantProperties")(ExcludeRetainedVariantProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(RetainAllVariantProperties)) __obj.updateDynamic("RetainAllVariantProperties")(RetainAllVariantProperties.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointInput]
  }
}

