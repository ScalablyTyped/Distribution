package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDataConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: Arn = js.native
  /**
    * An array of supplementary features. The only supported feature is a holiday calendar.
    */
  var SupplementaryFeatures: js.UndefOr[typings.awsSdk.forecastserviceMod.SupplementaryFeatures] = js.native
}

object InputDataConfig {
  @scala.inline
  def apply(DatasetGroupArn: Arn, SupplementaryFeatures: SupplementaryFeatures = null): InputDataConfig = {
    val __obj = js.Dynamic.literal(DatasetGroupArn = DatasetGroupArn.asInstanceOf[js.Any])
    if (SupplementaryFeatures != null) __obj.updateDynamic("SupplementaryFeatures")(SupplementaryFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDataConfig]
  }
}

