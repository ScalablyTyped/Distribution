package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeDefinition extends js.Object {
  /**
    * A name for the attribute.
    */
  var AttributeName: KeySchemaAttributeName = js.native
  /**
    * The data type for the attribute, where:    S - the attribute is of type String    N - the attribute is of type Number    B - the attribute is of type Binary  
    */
  var AttributeType: ScalarAttributeType = js.native
}

object AttributeDefinition {
  @scala.inline
  def apply(AttributeName: KeySchemaAttributeName, AttributeType: ScalarAttributeType): AttributeDefinition = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDefinition]
  }
}

