package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAttribute extends js.Object {
  /**
    * The identifier for the attribute.
    */
  var Key: DocumentAttributeKey = js.native
  /**
    * The value of the attribute.
    */
  var Value: DocumentAttributeValue = js.native
}

object DocumentAttribute {
  @scala.inline
  def apply(Key: DocumentAttributeKey, Value: DocumentAttributeValue): DocumentAttribute = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAttribute]
  }
  @scala.inline
  implicit class DocumentAttributeOps[Self <: DocumentAttribute] (val x: Self) extends AnyVal {
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
    def setKey(value: DocumentAttributeKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: DocumentAttributeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

