package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceHealthSummary extends js.Object {
  /**
    *  Red. The health agent is reporting a high number of request failures or other issues for an instance or environment.
    */
  var Degraded: js.UndefOr[NullableInteger] = js.native
  /**
    *  Green. An operation is in progress on an instance.
    */
  var Info: js.UndefOr[NullableInteger] = js.native
  /**
    *  Grey. AWS Elastic Beanstalk and the health agent are reporting no data on an instance.
    */
  var NoData: js.UndefOr[NullableInteger] = js.native
  /**
    *  Green. An instance is passing health checks and the health agent is not reporting any problems.
    */
  var Ok: js.UndefOr[NullableInteger] = js.native
  /**
    *  Grey. An operation is in progress on an instance within the command timeout.
    */
  var Pending: js.UndefOr[NullableInteger] = js.native
  /**
    *  Red. The health agent is reporting a very high number of request failures or other issues for an instance or environment.
    */
  var Severe: js.UndefOr[NullableInteger] = js.native
  /**
    *  Grey. AWS Elastic Beanstalk and the health agent are reporting an insufficient amount of data on an instance.
    */
  var Unknown: js.UndefOr[NullableInteger] = js.native
  /**
    *  Yellow. The health agent is reporting a moderate number of request failures or other issues for an instance or environment.
    */
  var Warning: js.UndefOr[NullableInteger] = js.native
}

object InstanceHealthSummary {
  @scala.inline
  def apply(
    Degraded: js.UndefOr[NullableInteger] = js.undefined,
    Info: js.UndefOr[NullableInteger] = js.undefined,
    NoData: js.UndefOr[NullableInteger] = js.undefined,
    Ok: js.UndefOr[NullableInteger] = js.undefined,
    Pending: js.UndefOr[NullableInteger] = js.undefined,
    Severe: js.UndefOr[NullableInteger] = js.undefined,
    Unknown: js.UndefOr[NullableInteger] = js.undefined,
    Warning: js.UndefOr[NullableInteger] = js.undefined
  ): InstanceHealthSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Degraded)) __obj.updateDynamic("Degraded")(Degraded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Info)) __obj.updateDynamic("Info")(Info.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NoData)) __obj.updateDynamic("NoData")(NoData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Ok)) __obj.updateDynamic("Ok")(Ok.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Pending)) __obj.updateDynamic("Pending")(Pending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Severe)) __obj.updateDynamic("Severe")(Severe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Unknown)) __obj.updateDynamic("Unknown")(Unknown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Warning)) __obj.updateDynamic("Warning")(Warning.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceHealthSummary]
  }
}

