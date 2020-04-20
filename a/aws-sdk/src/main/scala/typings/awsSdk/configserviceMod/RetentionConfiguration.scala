package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionConfiguration extends js.Object {
  /**
    * The name of the retention configuration object.
    */
  var Name: RetentionConfigurationName = js.native
  /**
    * Number of days AWS Config stores your historical information.  Currently, only applicable to the configuration item history. 
    */
  var RetentionPeriodInDays: typings.awsSdk.configserviceMod.RetentionPeriodInDays = js.native
}

object RetentionConfiguration {
  @scala.inline
  def apply(Name: RetentionConfigurationName, RetentionPeriodInDays: RetentionPeriodInDays): RetentionConfiguration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RetentionPeriodInDays = RetentionPeriodInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionConfiguration]
  }
}

