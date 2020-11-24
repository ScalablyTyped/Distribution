package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentAttributeValueCountPair extends js.Object {
  
  /**
    * The number of documents in the response that have the attribute value for the key.
    */
  var Count: js.UndefOr[Integer] = js.native
  
  /**
    * The value of the attribute. For example, "HR."
    */
  var DocumentAttributeValue: js.UndefOr[typings.awsSdk.kendraMod.DocumentAttributeValue] = js.native
}
object DocumentAttributeValueCountPair {
  
  @scala.inline
  def apply(): DocumentAttributeValueCountPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAttributeValueCountPair]
  }
  
  @scala.inline
  implicit class DocumentAttributeValueCountPairOps[Self <: DocumentAttributeValueCountPair] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    
    @scala.inline
    def setDocumentAttributeValue(value: DocumentAttributeValue): Self = this.set("DocumentAttributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentAttributeValue: Self = this.set("DocumentAttributeValue", js.undefined)
  }
}
