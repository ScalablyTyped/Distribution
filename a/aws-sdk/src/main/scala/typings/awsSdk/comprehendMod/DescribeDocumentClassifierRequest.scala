package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentClassifierRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier. The operation returns this identifier in its response.
    */
  var DocumentClassifierArn: typings.awsSdk.comprehendMod.DocumentClassifierArn = js.native
}

object DescribeDocumentClassifierRequest {
  @scala.inline
  def apply(DocumentClassifierArn: DocumentClassifierArn): DescribeDocumentClassifierRequest = {
    val __obj = js.Dynamic.literal(DocumentClassifierArn = DocumentClassifierArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentClassifierRequest]
  }
  @scala.inline
  implicit class DescribeDocumentClassifierRequestOps[Self <: DescribeDocumentClassifierRequest] (val x: Self) extends AnyVal {
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

