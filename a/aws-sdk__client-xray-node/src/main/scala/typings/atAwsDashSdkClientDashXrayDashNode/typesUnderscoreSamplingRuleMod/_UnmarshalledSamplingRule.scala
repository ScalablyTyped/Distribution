package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingRuleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSamplingRule extends _SamplingRule {
  /**
    * <p>Matches attributes derived from the request.</p>
    */
  @JSName("Attributes")
  var Attributes__UnmarshalledSamplingRule: js.UndefOr[StringDictionary[String]] = js.undefined
}

object _UnmarshalledSamplingRule {
  @scala.inline
  def apply(
    FixedRate: Double,
    HTTPMethod: String,
    Host: String,
    Priority: Double,
    ReservoirSize: Double,
    ResourceARN: String,
    ServiceName: String,
    ServiceType: String,
    URLPath: String,
    Version: Double,
    Attributes: StringDictionary[String] = null,
    RuleARN: String = null,
    RuleName: String = null
  ): _UnmarshalledSamplingRule = {
    val __obj = js.Dynamic.literal(FixedRate = FixedRate.asInstanceOf[js.Any], HTTPMethod = HTTPMethod.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], ReservoirSize = ReservoirSize.asInstanceOf[js.Any], ResourceARN = ResourceARN.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ServiceType = ServiceType.asInstanceOf[js.Any], URLPath = URLPath.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (RuleARN != null) __obj.updateDynamic("RuleARN")(RuleARN.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSamplingRule]
  }
}

