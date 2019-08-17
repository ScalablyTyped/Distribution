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
    val __obj = js.Dynamic.literal(FixedRate = FixedRate, HTTPMethod = HTTPMethod, Host = Host, Priority = Priority, ReservoirSize = ReservoirSize, ResourceARN = ResourceARN, ServiceName = ServiceName, ServiceType = ServiceType, URLPath = URLPath, Version = Version)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (RuleARN != null) __obj.updateDynamic("RuleARN")(RuleARN)
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName)
    __obj.asInstanceOf[_UnmarshalledSamplingRule]
  }
}

