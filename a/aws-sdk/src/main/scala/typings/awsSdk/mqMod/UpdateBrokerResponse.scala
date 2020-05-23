package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBrokerResponse extends js.Object {
  /**
    * The new value of automatic upgrades to new minor version for brokers.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.native
  /**
    * Required. The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.native
  /**
    * The ID of the updated configuration.
    */
  var Configuration: js.UndefOr[ConfigurationId] = js.native
  /**
    * The version of the broker engine to upgrade to. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[string] = js.native
  /**
    * The host instance type of the broker to upgrade to. For a list of supported instance types, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
    */
  var HostInstanceType: js.UndefOr[string] = js.native
  /**
    * The list of information about logs to be enabled for the specified broker.
    */
  var Logs: js.UndefOr[typings.awsSdk.mqMod.Logs] = js.native
  /**
    * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.native
}

object UpdateBrokerResponse {
  @scala.inline
  def apply(
    AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.undefined,
    BrokerId: string = null,
    Configuration: ConfigurationId = null,
    EngineVersion: string = null,
    HostInstanceType: string = null,
    Logs: Logs = null,
    SecurityGroups: listOfString = null
  ): UpdateBrokerResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade.get.asInstanceOf[js.Any])
    if (BrokerId != null) __obj.updateDynamic("BrokerId")(BrokerId.asInstanceOf[js.Any])
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (HostInstanceType != null) __obj.updateDynamic("HostInstanceType")(HostInstanceType.asInstanceOf[js.Any])
    if (Logs != null) __obj.updateDynamic("Logs")(Logs.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBrokerResponse]
  }
}

