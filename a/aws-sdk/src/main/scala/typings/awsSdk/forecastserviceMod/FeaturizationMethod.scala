package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeaturizationMethod extends js.Object {
  /**
    * The name of the method. The "filling" method is the only supported method.
    */
  var FeaturizationMethodName: typings.awsSdk.forecastserviceMod.FeaturizationMethodName = js.native
  /**
    * The method parameters (key-value pairs). Specify these parameters to override the default values. The following list shows the parameters and their valid values. Bold signifies the default value.    aggregation: sum, avg, first, min, max     frontfill: none     middlefill: zero, nan (not a number)    backfill: zero, nan   
    */
  var FeaturizationMethodParameters: js.UndefOr[typings.awsSdk.forecastserviceMod.FeaturizationMethodParameters] = js.native
}

object FeaturizationMethod {
  @scala.inline
  def apply(
    FeaturizationMethodName: FeaturizationMethodName,
    FeaturizationMethodParameters: FeaturizationMethodParameters = null
  ): FeaturizationMethod = {
    val __obj = js.Dynamic.literal(FeaturizationMethodName = FeaturizationMethodName.asInstanceOf[js.Any])
    if (FeaturizationMethodParameters != null) __obj.updateDynamic("FeaturizationMethodParameters")(FeaturizationMethodParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturizationMethod]
  }
}

