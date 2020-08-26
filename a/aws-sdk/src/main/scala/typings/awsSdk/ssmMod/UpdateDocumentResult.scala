package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDocumentResult extends js.Object {
  /**
    * A description of the document that was updated.
    */
  var DocumentDescription: js.UndefOr[typings.awsSdk.ssmMod.DocumentDescription] = js.native
}

object UpdateDocumentResult {
  @scala.inline
  def apply(): UpdateDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDocumentResult]
  }
  @scala.inline
  implicit class UpdateDocumentResultOps[Self <: UpdateDocumentResult] (val x: Self) extends AnyVal {
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

