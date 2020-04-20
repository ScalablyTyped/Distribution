package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceAttribute extends js.Object {
  /**
    * Type of resource.
    */
  var Type: ResourceAttributeType = js.native
  /**
    * Value of the resource type.
    */
  var Value: ResourceAttributeValue = js.native
}

object ResourceAttribute {
  @scala.inline
  def apply(Type: ResourceAttributeType, Value: ResourceAttributeValue): ResourceAttribute = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAttribute]
  }
}

