package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Tag extends js.Object {
  /**
    * <p>The key of the tag.Tag keys are case sensitive. Each DynamoDB table can only have up to one tag with the same key. If you try to add an existing tag (same key), the existing tag value will be updated to the new value. </p>
    */
  var Key: String
  /**
    * <p>The value of the tag. Tag values are case-sensitive and can be null.</p>
    */
  var Value: String
}

object _Tag {
  @scala.inline
  def apply(Key: String, Value: String): _Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Tag]
  }
}

