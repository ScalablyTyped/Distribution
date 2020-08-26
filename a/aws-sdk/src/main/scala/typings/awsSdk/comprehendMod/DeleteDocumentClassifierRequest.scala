package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDocumentClassifierRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier. 
    */
  var DocumentClassifierArn: typings.awsSdk.comprehendMod.DocumentClassifierArn = js.native
}

object DeleteDocumentClassifierRequest {
  @scala.inline
  def apply(DocumentClassifierArn: DocumentClassifierArn): DeleteDocumentClassifierRequest = {
    val __obj = js.Dynamic.literal(DocumentClassifierArn = DocumentClassifierArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentClassifierRequest]
  }
  @scala.inline
  implicit class DeleteDocumentClassifierRequestOps[Self <: DeleteDocumentClassifierRequest] (val x: Self) extends AnyVal {
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
    def setDocumentClassifierArn(value: DocumentClassifierArn): Self = this.set("DocumentClassifierArn", value.asInstanceOf[js.Any])
  }
  
}

