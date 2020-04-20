package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsIotAnalyticsParameters extends js.Object {
  /**
    * Dataset name.
    */
  var DataSetName: typings.awsSdk.quicksightMod.DataSetName = js.native
}

object AwsIotAnalyticsParameters {
  @scala.inline
  def apply(DataSetName: DataSetName): AwsIotAnalyticsParameters = {
    val __obj = js.Dynamic.literal(DataSetName = DataSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsIotAnalyticsParameters]
  }
}

