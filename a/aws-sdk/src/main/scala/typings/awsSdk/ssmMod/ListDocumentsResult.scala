package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDocumentsResult extends js.Object {
  /**
    * The names of the Systems Manager documents.
    */
  var DocumentIdentifiers: js.UndefOr[DocumentIdentifierList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object ListDocumentsResult {
  @scala.inline
  def apply(): ListDocumentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentsResult]
  }
  @scala.inline
  implicit class ListDocumentsResultOps[Self <: ListDocumentsResult] (val x: Self) extends AnyVal {
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
    def setDocumentIdentifiersVarargs(value: DocumentIdentifier*): Self = this.set("DocumentIdentifiers", js.Array(value :_*))
    @scala.inline
    def setDocumentIdentifiers(value: DocumentIdentifierList): Self = this.set("DocumentIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentIdentifiers: Self = this.set("DocumentIdentifiers", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

