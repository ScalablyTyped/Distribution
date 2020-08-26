package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceableItem extends js.Object {
  /**
    * The list of attributes for a replaceable item.
    */
  var Attributes: ReplaceableAttributeList = js.native
  /**
    * The name of the replaceable item.
    */
  var Name: String = js.native
}

object ReplaceableItem {
  @scala.inline
  def apply(Attributes: ReplaceableAttributeList, Name: String): ReplaceableItem = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceableItem]
  }
  @scala.inline
  implicit class ReplaceableItemOps[Self <: ReplaceableItem] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: ReplaceableAttribute*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: ReplaceableAttributeList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

