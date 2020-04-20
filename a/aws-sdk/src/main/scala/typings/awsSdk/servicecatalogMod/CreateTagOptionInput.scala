package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTagOptionInput extends js.Object {
  /**
    * The TagOption key.
    */
  var Key: TagOptionKey = js.native
  /**
    * The TagOption value.
    */
  var Value: TagOptionValue = js.native
}

object CreateTagOptionInput {
  @scala.inline
  def apply(Key: TagOptionKey, Value: TagOptionValue): CreateTagOptionInput = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagOptionInput]
  }
}

