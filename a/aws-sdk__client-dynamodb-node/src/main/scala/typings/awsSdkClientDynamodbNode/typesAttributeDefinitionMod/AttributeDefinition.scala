package typings.awsSdkClientDynamodbNode.typesAttributeDefinitionMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.B
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.N
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.S
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeDefinition extends js.Object {
  /**
    * <p>A name for the attribute.</p>
    */
  var AttributeName: String = js.native
  /**
    * <p>The data type for the attribute, where:</p> <ul> <li> <p> <code>S</code> - the attribute is of type String</p> </li> <li> <p> <code>N</code> - the attribute is of type Number</p> </li> <li> <p> <code>B</code> - the attribute is of type Binary</p> </li> </ul>
    */
  var AttributeType: S | N | B | String = js.native
}

object AttributeDefinition {
  @scala.inline
  def apply(AttributeName: String, AttributeType: S | N | B | String): AttributeDefinition = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDefinition]
  }
  @scala.inline
  implicit class AttributeDefinitionOps[Self <: AttributeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributeName(value: String): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeType(value: S | N | B | String): Self = this.set("AttributeType", value.asInstanceOf[js.Any])
  }
  
}

