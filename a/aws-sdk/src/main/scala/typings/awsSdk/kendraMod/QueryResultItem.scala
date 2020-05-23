package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResultItem extends js.Object {
  /**
    * One or more additional attribues associated with the query result.
    */
  var AdditionalAttributes: js.UndefOr[AdditionalResultAttributeList] = js.native
  /**
    * An array of document attributes for the document that the query result maps to. For example, the document author (Author) or the source URI (SourceUri) of the document.
    */
  var DocumentAttributes: js.UndefOr[DocumentAttributeList] = js.native
  /**
    * An extract of the text in the document. Contains information about highlighting the relevant terms in the excerpt.
    */
  var DocumentExcerpt: js.UndefOr[TextWithHighlights] = js.native
  /**
    * The unique identifier for the document.
    */
  var DocumentId: js.UndefOr[typings.awsSdk.kendraMod.DocumentId] = js.native
  /**
    * The title of the document. Contains the text of the title and information for highlighting the relevant terms in the title.
    */
  var DocumentTitle: js.UndefOr[TextWithHighlights] = js.native
  /**
    * The URI of the original location of the document.
    */
  var DocumentURI: js.UndefOr[Url] = js.native
  /**
    * The unique identifier for the query result.
    */
  var Id: js.UndefOr[ResultId] = js.native
  /**
    * The type of document. 
    */
  var Type: js.UndefOr[QueryResultType] = js.native
}

object QueryResultItem {
  @scala.inline
  def apply(
    AdditionalAttributes: AdditionalResultAttributeList = null,
    DocumentAttributes: DocumentAttributeList = null,
    DocumentExcerpt: TextWithHighlights = null,
    DocumentId: DocumentId = null,
    DocumentTitle: TextWithHighlights = null,
    DocumentURI: Url = null,
    Id: ResultId = null,
    Type: QueryResultType = null
  ): QueryResultItem = {
    val __obj = js.Dynamic.literal()
    if (AdditionalAttributes != null) __obj.updateDynamic("AdditionalAttributes")(AdditionalAttributes.asInstanceOf[js.Any])
    if (DocumentAttributes != null) __obj.updateDynamic("DocumentAttributes")(DocumentAttributes.asInstanceOf[js.Any])
    if (DocumentExcerpt != null) __obj.updateDynamic("DocumentExcerpt")(DocumentExcerpt.asInstanceOf[js.Any])
    if (DocumentId != null) __obj.updateDynamic("DocumentId")(DocumentId.asInstanceOf[js.Any])
    if (DocumentTitle != null) __obj.updateDynamic("DocumentTitle")(DocumentTitle.asInstanceOf[js.Any])
    if (DocumentURI != null) __obj.updateDynamic("DocumentURI")(DocumentURI.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultItem]
  }
}

