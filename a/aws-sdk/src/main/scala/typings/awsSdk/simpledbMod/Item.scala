package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  /**
    * 
    */
  var AlternateNameEncoding: js.UndefOr[String] = js.native
  /**
    * A list of attributes.
    */
  var Attributes: AttributeList = js.native
  /**
    * The name of the item.
    */
  var Name: String = js.native
}

object Item {
  @scala.inline
  def apply(Attributes: AttributeList, Name: String): Item = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: Attribute*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: AttributeList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlternateNameEncoding(value: String): Self = this.set("AlternateNameEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateNameEncoding: Self = this.set("AlternateNameEncoding", js.undefined)
  }
  
}

