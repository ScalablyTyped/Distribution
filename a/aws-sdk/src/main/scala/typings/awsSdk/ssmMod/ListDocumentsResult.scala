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
  def apply(DocumentIdentifiers: DocumentIdentifierList = null, NextToken: NextToken = null): ListDocumentsResult = {
    val __obj = js.Dynamic.literal()
    if (DocumentIdentifiers != null) __obj.updateDynamic("DocumentIdentifiers")(DocumentIdentifiers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDocumentsResult]
  }
}

