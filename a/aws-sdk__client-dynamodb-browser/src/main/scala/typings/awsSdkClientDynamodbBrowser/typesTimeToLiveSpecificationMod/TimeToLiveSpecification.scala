package typings.awsSdkClientDynamodbBrowser.typesTimeToLiveSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeToLiveSpecification extends js.Object {
  /**
    * <p>The name of the Time to Live attribute used to store the expiration time for items in the table.</p>
    */
  var AttributeName: String
  /**
    * <p>Indicates whether Time To Live is to be enabled (true) or disabled (false) on the table.</p>
    */
  var Enabled: Boolean
}

object TimeToLiveSpecification {
  @scala.inline
  def apply(AttributeName: String, Enabled: Boolean): TimeToLiveSpecification = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimeToLiveSpecification]
  }
}

