package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreTimeToLiveSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TimeToLiveSpecification extends js.Object {
  /**
    * <p>The name of the Time to Live attribute used to store the expiration time for items in the table.</p>
    */
  var AttributeName: String
  /**
    * <p>Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.</p>
    */
  var Enabled: Boolean
}

object _TimeToLiveSpecification {
  @scala.inline
  def apply(AttributeName: String, Enabled: Boolean): _TimeToLiveSpecification = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TimeToLiveSpecification]
  }
}

