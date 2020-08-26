package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The key name that can be used to look up or retrieve the associated value. For example, Department or Cost Center are common choices.
    */
  var Key: tagKeyType = js.native
  /**
    * The value associated with this tag. For example, tags with a key name of Department could have values such as Human Resources, Accounting, and Support. Tags with a key name of Cost Center might have values that consist of the number associated with the different cost centers in your company. Typically, many resources have tags with the same key name but with different values.  AWS always interprets the tag Value as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code. 
    */
  var Value: tagValueType = js.native
}

object Tag {
  @scala.inline
  def apply(Key: tagKeyType, Value: tagValueType): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
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
    def setKey(value: tagKeyType): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: tagValueType): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

