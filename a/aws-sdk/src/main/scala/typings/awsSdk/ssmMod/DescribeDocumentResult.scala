package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDocumentResult extends js.Object {
  
  /**
    * Information about the Systems Manager document.
    */
  var Document: js.UndefOr[DocumentDescription] = js.native
}
object DescribeDocumentResult {
  
  @scala.inline
  def apply(): DescribeDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentResult]
  }
  
  @scala.inline
  implicit class DescribeDocumentResultOps[Self <: DescribeDocumentResult] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: DocumentDescription): Self = this.set("Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("Document", js.undefined)
  }
}
