package typings.awsSdkClientXrayNode.typesSamplingRuleUpdateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSamplingRuleUpdate extends SamplingRuleUpdate {
  /**
    * <p>Matches attributes derived from the request.</p>
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledSamplingRuleUpdate: js.UndefOr[StringDictionary[String]] = js.undefined
}

object UnmarshalledSamplingRuleUpdate {
  @scala.inline
  def apply(
    Attributes: StringDictionary[String] = null,
    FixedRate: js.UndefOr[Double] = js.undefined,
    HTTPMethod: String = null,
    Host: String = null,
    Priority: js.UndefOr[Double] = js.undefined,
    ReservoirSize: js.UndefOr[Double] = js.undefined,
    ResourceARN: String = null,
    RuleARN: String = null,
    RuleName: String = null,
    ServiceName: String = null,
    ServiceType: String = null,
    URLPath: String = null
  ): UnmarshalledSamplingRuleUpdate = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(FixedRate)) __obj.updateDynamic("FixedRate")(FixedRate.get.asInstanceOf[js.Any])
    if (HTTPMethod != null) __obj.updateDynamic("HTTPMethod")(HTTPMethod.asInstanceOf[js.Any])
    if (Host != null) __obj.updateDynamic("Host")(Host.asInstanceOf[js.Any])
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReservoirSize)) __obj.updateDynamic("ReservoirSize")(ReservoirSize.get.asInstanceOf[js.Any])
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN.asInstanceOf[js.Any])
    if (RuleARN != null) __obj.updateDynamic("RuleARN")(RuleARN.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    if (ServiceType != null) __obj.updateDynamic("ServiceType")(ServiceType.asInstanceOf[js.Any])
    if (URLPath != null) __obj.updateDynamic("URLPath")(URLPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSamplingRuleUpdate]
  }
}

