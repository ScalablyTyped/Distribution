package typings.awsSdkClientXrayNode.typesSamplingRuleUpdateMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingRuleUpdate extends js.Object {
  /**
    * <p>Matches attributes derived from the request.</p>
    */
  var Attributes: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * <p>The percentage of matching requests to instrument, after the reservoir is exhausted.</p>
    */
  var FixedRate: js.UndefOr[Double] = js.undefined
  /**
    * <p>Matches the HTTP method of a request.</p>
    */
  var HTTPMethod: js.UndefOr[String] = js.undefined
  /**
    * <p>Matches the hostname from a request URL.</p>
    */
  var Host: js.UndefOr[String] = js.undefined
  /**
    * <p>The priority of the sampling rule.</p>
    */
  var Priority: js.UndefOr[Double] = js.undefined
  /**
    * <p>A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.</p>
    */
  var ReservoirSize: js.UndefOr[Double] = js.undefined
  /**
    * <p>Matches the ARN of the AWS resource on which the service runs.</p>
    */
  var ResourceARN: js.UndefOr[String] = js.undefined
  /**
    * <p>The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
    */
  var RuleARN: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the sampling rule. Specify a rule by either name or ARN, but not both.</p>
    */
  var RuleName: js.UndefOr[String] = js.undefined
  /**
    * <p>Matches the <code>name</code> that the service uses to identify itself in segments.</p>
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  /**
    * <p>Matches the <code>origin</code> that the service uses to identify its type in segments.</p>
    */
  var ServiceType: js.UndefOr[String] = js.undefined
  /**
    * <p>Matches the path from a request URL.</p>
    */
  var URLPath: js.UndefOr[String] = js.undefined
}

object SamplingRuleUpdate {
  @scala.inline
  def apply(
    Attributes: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = null,
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
  ): SamplingRuleUpdate = {
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
    __obj.asInstanceOf[SamplingRuleUpdate]
  }
}

