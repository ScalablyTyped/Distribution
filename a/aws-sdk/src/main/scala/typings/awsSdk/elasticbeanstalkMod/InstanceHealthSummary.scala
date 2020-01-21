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
    Degraded: Int | Double = null,
    Info: Int | Double = null,
    NoData: Int | Double = null,
    Ok: Int | Double = null,
    Pending: Int | Double = null,
    Severe: Int | Double = null,
    Unknown: Int | Double = null,
    Warning: Int | Double = null
  ): InstanceHealthSummary = {
    val __obj = js.Dynamic.literal()
    if (Degraded != null) __obj.updateDynamic("Degraded")(Degraded.asInstanceOf[js.Any])
    if (Info != null) __obj.updateDynamic("Info")(Info.asInstanceOf[js.Any])
    if (NoData != null) __obj.updateDynamic("NoData")(NoData.asInstanceOf[js.Any])
    if (Ok != null) __obj.updateDynamic("Ok")(Ok.asInstanceOf[js.Any])
    if (Pending != null) __obj.updateDynamic("Pending")(Pending.asInstanceOf[js.Any])
    if (Severe != null) __obj.updateDynamic("Severe")(Severe.asInstanceOf[js.Any])
    if (Unknown != null) __obj.updateDynamic("Unknown")(Unknown.asInstanceOf[js.Any])
    if (Warning != null) __obj.updateDynamic("Warning")(Warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceHealthSummary]
  }
}

