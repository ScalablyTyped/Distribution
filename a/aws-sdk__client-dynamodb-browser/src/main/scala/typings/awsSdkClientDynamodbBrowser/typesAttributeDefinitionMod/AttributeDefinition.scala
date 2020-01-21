package typings.awsSdkClientDynamodbBrowser.typesAttributeDefinitionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.B
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.N
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.S
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeDefinition extends js.Object {
  /**
    * <p>A name for the attribute.</p>
    */
  var AttributeName: String
  /**
    * <p>The data type for the attribute, where:</p> <ul> <li> <p> <code>S</code> - the attribute is of type String</p> </li> <li> <p> <code>N</code> - the attribute is of type Number</p> </li> <li> <p> <code>B</code> - the attribute is of type Binary</p> </li> </ul>
    */
  var AttributeType: S | N | B | String
}

object AttributeDefinition {
  @scala.inline
  def apply(AttributeName: String, AttributeType: S | N | B | String): AttributeDefinition = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttributeDefinition]
  }
}

