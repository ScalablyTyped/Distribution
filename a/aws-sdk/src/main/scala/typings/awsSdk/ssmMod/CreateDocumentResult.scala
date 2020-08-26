package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDocumentResult extends js.Object {
  /**
    * Information about the Systems Manager document.
    */
  var DocumentDescription: js.UndefOr[typings.awsSdk.ssmMod.DocumentDescription] = js.native
}

object CreateDocumentResult {
  @scala.inline
  def apply(): CreateDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDocumentResult]
  }
  @scala.inline
  implicit class CreateDocumentResultOps[Self <: CreateDocumentResult] (val x: Self) extends AnyVal {
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
    def setDocumentDescription(value: DocumentDescription): Self = this.set("DocumentDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentDescription: Self = this.set("DocumentDescription", js.undefined)
  }
  
}

