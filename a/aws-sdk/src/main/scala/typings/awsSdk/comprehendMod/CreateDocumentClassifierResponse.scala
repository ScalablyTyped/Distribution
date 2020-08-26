package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDocumentClassifierResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier.
    */
  var DocumentClassifierArn: js.UndefOr[typings.awsSdk.comprehendMod.DocumentClassifierArn] = js.native
}

object CreateDocumentClassifierResponse {
  @scala.inline
  def apply(): CreateDocumentClassifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDocumentClassifierResponse]
  }
  @scala.inline
  implicit class CreateDocumentClassifierResponseOps[Self <: CreateDocumentClassifierResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteDocumentClassifierArn: Self = this.set("DocumentClassifierArn", js.undefined)
  }
  
}

