package typings.awsSdkClientS3Browser.typesTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * <p>Name of the tag.</p>
    */
  var Key: String
  /**
    * <p>Value of the tag.</p>
    */
  var Value: String
}

object Tag {
  @scala.inline
  def apply(Key: String, Value: String): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tag]
  }
}

