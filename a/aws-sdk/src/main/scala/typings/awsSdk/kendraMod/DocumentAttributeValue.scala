package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentAttributeValue extends js.Object {
  
  /**
    * A date expressed as an ISO 8601 string.
    */
  var DateValue: js.UndefOr[Timestamp] = js.native
  
  /**
    * A long integer value.
    */
  var LongValue: js.UndefOr[Long] = js.native
  
  /**
    * A list of strings. 
    */
  var StringListValue: js.UndefOr[DocumentAttributeStringListValue] = js.native
  
  /**
    * A string, such as "department".
    */
  var StringValue: js.UndefOr[DocumentAttributeStringValue] = js.native
}
object DocumentAttributeValue {
  
  @scala.inline
  def apply(): DocumentAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAttributeValue]
  }
  
  @scala.inline
  implicit class DocumentAttributeValueOps[Self <: DocumentAttributeValue] (val x: Self) extends AnyVal {
    
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
    def setDateValue(value: Timestamp): Self = this.set("DateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateValue: Self = this.set("DateValue", js.undefined)
    
    @scala.inline
    def setLongValue(value: Long): Self = this.set("LongValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongValue: Self = this.set("LongValue", js.undefined)
    
    @scala.inline
    def setStringListValueVarargs(value: String*): Self = this.set("StringListValue", js.Array(value :_*))
    
    @scala.inline
    def setStringListValue(value: DocumentAttributeStringListValue): Self = this.set("StringListValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringListValue: Self = this.set("StringListValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: DocumentAttributeStringValue): Self = this.set("StringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("StringValue", js.undefined)
  }
}
