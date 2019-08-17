package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingRuleUpdateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSamplingRuleUpdate extends _SamplingRuleUpdate {
  /**
    * <p>Matches attributes derived from the request.</p>
    */
  @JSName("Attributes")
  var Attributes__UnmarshalledSamplingRuleUpdate: js.UndefOr[StringDictionary[String]] = js.undefined
}

object _UnmarshalledSamplingRuleUpdate {
  @scala.inline
  def apply(
    Attributes: StringDictionary[String] = null,
    FixedRate: Int | Double = null,
    HTTPMethod: String = null,
    Host: String = null,
    Priority: Int | Double = null,
    ReservoirSize: Int | Double = null,
    ResourceARN: String = null,
    RuleARN: String = null,
    RuleName: String = null,
    ServiceName: String = null,
    ServiceType: String = null,
    URLPath: String = null
  ): _UnmarshalledSamplingRuleUpdate = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (FixedRate != null) __obj.updateDynamic("FixedRate")(FixedRate.asInstanceOf[js.Any])
    if (HTTPMethod != null) __obj.updateDynamic("HTTPMethod")(HTTPMethod)
    if (Host != null) __obj.updateDynamic("Host")(Host)
    if (Priority != null) __obj.updateDynamic("Priority")(Priority.asInstanceOf[js.Any])
    if (ReservoirSize != null) __obj.updateDynamic("ReservoirSize")(ReservoirSize.asInstanceOf[js.Any])
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    if (RuleARN != null) __obj.updateDynamic("RuleARN")(RuleARN)
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    if (ServiceType != null) __obj.updateDynamic("ServiceType")(ServiceType)
    if (URLPath != null) __obj.updateDynamic("URLPath")(URLPath)
    __obj.asInstanceOf[_UnmarshalledSamplingRuleUpdate]
  }
}

