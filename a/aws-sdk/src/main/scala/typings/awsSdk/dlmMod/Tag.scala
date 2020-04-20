package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The tag key.
    */
  var Key: String = js.native
  /**
    * The tag value.
    */
  var Value: String = js.native
}

object Tag {
  @scala.inline
  def apply(Key: String, Value: String): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

