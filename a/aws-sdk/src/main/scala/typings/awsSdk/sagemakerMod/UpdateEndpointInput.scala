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
  def apply(EndpointConfigName: EndpointConfigName, EndpointName: EndpointName): UpdateEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointInput]
  }
  @scala.inline
  implicit class UpdateEndpointInputOps[Self <: UpdateEndpointInput] (val x: Self) extends AnyVal {
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
    def setEndpointConfigName(value: EndpointConfigName): Self = this.set("EndpointConfigName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointName(value: EndpointName): Self = this.set("EndpointName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludeRetainedVariantPropertiesVarargs(value: VariantProperty*): Self = this.set("ExcludeRetainedVariantProperties", js.Array(value :_*))
    @scala.inline
    def setExcludeRetainedVariantProperties(value: VariantPropertyList): Self = this.set("ExcludeRetainedVariantProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeRetainedVariantProperties: Self = this.set("ExcludeRetainedVariantProperties", js.undefined)
    @scala.inline
    def setRetainAllVariantProperties(value: Boolean): Self = this.set("RetainAllVariantProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainAllVariantProperties: Self = this.set("RetainAllVariantProperties", js.undefined)
  }
  
}

