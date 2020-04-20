package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupAttribute extends js.Object {
  /**
    * Specifies an attribute on which to filter the events returned.
    */
  var AttributeKey: LookupAttributeKey = js.native
  /**
    * Specifies a value for the specified AttributeKey.
    */
  var AttributeValue: String = js.native
}

object LookupAttribute {
  @scala.inline
  def apply(AttributeKey: LookupAttributeKey, AttributeValue: String): LookupAttribute = {
    val __obj = js.Dynamic.literal(AttributeKey = AttributeKey.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupAttribute]
  }
}

