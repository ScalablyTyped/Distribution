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
  @scala.inline
  implicit class CreateTagOptionInputOps[Self <: CreateTagOptionInput] (val x: Self) extends AnyVal {
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
    def setKey(value: TagOptionKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: TagOptionValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

