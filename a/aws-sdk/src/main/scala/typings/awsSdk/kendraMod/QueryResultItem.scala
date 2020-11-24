package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResultItem extends js.Object {
  
  /**
    * One or more additional attributes associated with the query result.
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
    * Indicates the confidence that Amazon Kendra has that a result matches the query that you provided. Each result is placed into a bin that indicates the confidence, VERY_HIGH, HIGH, MEDIUM and LOW. You can use the score to determine if a response meets the confidence needed for your application. The field is only set to LOW when the Type field is set to DOCUMENT and Amazon Kendra is not confident that the result matches the query.
    */
  var ScoreAttributes: js.UndefOr[typings.awsSdk.kendraMod.ScoreAttributes] = js.native
  
  /**
    * The type of document. 
    */
  var Type: js.UndefOr[QueryResultType] = js.native
}
object QueryResultItem {
  
  @scala.inline
  def apply(): QueryResultItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResultItem]
  }
  
  @scala.inline
  implicit class QueryResultItemOps[Self <: QueryResultItem] (val x: Self) extends AnyVal {
    
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
    def setAdditionalAttributesVarargs(value: AdditionalResultAttribute*): Self = this.set("AdditionalAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalAttributes(value: AdditionalResultAttributeList): Self = this.set("AdditionalAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalAttributes: Self = this.set("AdditionalAttributes", js.undefined)
    
    @scala.inline
    def setDocumentAttributesVarargs(value: DocumentAttribute*): Self = this.set("DocumentAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDocumentAttributes(value: DocumentAttributeList): Self = this.set("DocumentAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentAttributes: Self = this.set("DocumentAttributes", js.undefined)
    
    @scala.inline
    def setDocumentExcerpt(value: TextWithHighlights): Self = this.set("DocumentExcerpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentExcerpt: Self = this.set("DocumentExcerpt", js.undefined)
    
    @scala.inline
    def setDocumentId(value: DocumentId): Self = this.set("DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentId: Self = this.set("DocumentId", js.undefined)
    
    @scala.inline
    def setDocumentTitle(value: TextWithHighlights): Self = this.set("DocumentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentTitle: Self = this.set("DocumentTitle", js.undefined)
    
    @scala.inline
    def setDocumentURI(value: Url): Self = this.set("DocumentURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentURI: Self = this.set("DocumentURI", js.undefined)
    
    @scala.inline
    def setId(value: ResultId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setScoreAttributes(value: ScoreAttributes): Self = this.set("ScoreAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoreAttributes: Self = this.set("ScoreAttributes", js.undefined)
    
    @scala.inline
    def setType(value: QueryResultType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
