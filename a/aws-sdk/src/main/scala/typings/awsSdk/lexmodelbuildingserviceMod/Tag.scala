package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The key for the tag. Keys are not case-sensitive and must be unique.
    */
  var key: TagKey = js.native
  /**
    * The value associated with a key. The value may be an empty string but it can't be null.
    */
  var value: TagValue = js.native
}

object Tag {
  @scala.inline
  def apply(key: TagKey, value: TagValue): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tag]
  }
}

