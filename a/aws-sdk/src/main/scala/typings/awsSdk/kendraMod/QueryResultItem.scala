package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResultItem extends StObject {
  
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
  implicit class QueryResultItemMutableBuilder[Self <: QueryResultItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalAttributes(value: AdditionalResultAttributeList): Self = StObject.set(x, "AdditionalAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalAttributesUndefined: Self = StObject.set(x, "AdditionalAttributes", js.undefined)
    
    @scala.inline
    def setAdditionalAttributesVarargs(value: AdditionalResultAttribute*): Self = StObject.set(x, "AdditionalAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDocumentAttributes(value: DocumentAttributeList): Self = StObject.set(x, "DocumentAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentAttributesUndefined: Self = StObject.set(x, "DocumentAttributes", js.undefined)
    
    @scala.inline
    def setDocumentAttributesVarargs(value: DocumentAttribute*): Self = StObject.set(x, "DocumentAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDocumentExcerpt(value: TextWithHighlights): Self = StObject.set(x, "DocumentExcerpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentExcerptUndefined: Self = StObject.set(x, "DocumentExcerpt", js.undefined)
    
    @scala.inline
    def setDocumentId(value: DocumentId): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "DocumentId", js.undefined)
    
    @scala.inline
    def setDocumentTitle(value: TextWithHighlights): Self = StObject.set(x, "DocumentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleUndefined: Self = StObject.set(x, "DocumentTitle", js.undefined)
    
    @scala.inline
    def setDocumentURI(value: Url): Self = StObject.set(x, "DocumentURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentURIUndefined: Self = StObject.set(x, "DocumentURI", js.undefined)
    
    @scala.inline
    def setId(value: ResultId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setScoreAttributes(value: ScoreAttributes): Self = StObject.set(x, "ScoreAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreAttributesUndefined: Self = StObject.set(x, "ScoreAttributes", js.undefined)
    
    @scala.inline
    def setType(value: QueryResultType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
