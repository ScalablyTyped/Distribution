package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceableAttribute extends js.Object {
  /**
    * The name of the replaceable attribute.
    */
  var Name: String = js.native
  /**
    * A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair. The default setting is false.
    */
  var Replace: js.UndefOr[Boolean] = js.native
  /**
    * The value of the replaceable attribute.
    */
  var Value: String = js.native
}

object ReplaceableAttribute {
  @scala.inline
  def apply(Name: String, Value: String): ReplaceableAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceableAttribute]
  }
  @scala.inline
  implicit class ReplaceableAttributeOps[Self <: ReplaceableAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("Replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("Replace", js.undefined)
  }
  
}

