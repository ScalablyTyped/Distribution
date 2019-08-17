package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreAttributeDefinitionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.B
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.N
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.S
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AttributeDefinition extends js.Object {
  /**
    * <p>A name for the attribute.</p>
    */
  var AttributeName: String
  /**
    * <p>The data type for the attribute, where:</p> <ul> <li> <p> <code>S</code> - the attribute is of type String</p> </li> <li> <p> <code>N</code> - the attribute is of type Number</p> </li> <li> <p> <code>B</code> - the attribute is of type Binary</p> </li> </ul>
    */
  var AttributeType: S | N | B | String
}

object _AttributeDefinition {
  @scala.inline
  def apply(AttributeName: String, AttributeType: S | N | B | String): _AttributeDefinition = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName, AttributeType = AttributeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_AttributeDefinition]
  }
}

