package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResultItem extends StObject {
  
  /**
    * One or more additional attributes associated with the query result.
    */
  var AdditionalAttributes: js.UndefOr[AdditionalResultAttributeList] = js.undefined
  
  /**
    * An array of document attributes for the document that the query result maps to. For example, the document author (Author) or the source URI (SourceUri) of the document.
    */
  var DocumentAttributes: js.UndefOr[DocumentAttributeList] = js.undefined
  
  /**
    * An extract of the text in the document. Contains information about highlighting the relevant terms in the excerpt.
    */
  var DocumentExcerpt: js.UndefOr[TextWithHighlights] = js.undefined
  
  /**
    * The unique identifier for the document.
    */
  var DocumentId: js.UndefOr[typings.awsSdk.kendraMod.DocumentId] = js.undefined
  
  /**
    * The title of the document. Contains the text of the title and information for highlighting the relevant terms in the title.
    */
  var DocumentTitle: js.UndefOr[TextWithHighlights] = js.undefined
  
  /**
    * The URI of the original location of the document.
    */
  var DocumentURI: js.UndefOr[Url] = js.undefined
  
  /**
    * The unique identifier for the query result.
    */
  var Id: js.UndefOr[ResultId] = js.undefined
  
  /**
    * Indicates the confidence that Amazon Kendra has that a result matches the query that you provided. Each result is placed into a bin that indicates the confidence, VERY_HIGH, HIGH, MEDIUM and LOW. You can use the score to determine if a response meets the confidence needed for your application. The field is only set to LOW when the Type field is set to DOCUMENT and Amazon Kendra is not confident that the result matches the query.
    */
  var ScoreAttributes: js.UndefOr[typings.awsSdk.kendraMod.ScoreAttributes] = js.undefined
  
  /**
    * The type of document. 
    */
  var Type: js.UndefOr[QueryResultType] = js.undefined
}
object QueryResultItem {
  
  inline def apply(): QueryResultItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResultItem]
  }
  
  extension [Self <: QueryResultItem](x: Self) {
    
    inline def setAdditionalAttributes(value: AdditionalResultAttributeList): Self = StObject.set(x, "AdditionalAttributes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAttributesUndefined: Self = StObject.set(x, "AdditionalAttributes", js.undefined)
    
    inline def setAdditionalAttributesVarargs(value: AdditionalResultAttribute*): Self = StObject.set(x, "AdditionalAttributes", js.Array(value :_*))
    
    inline def setDocumentAttributes(value: DocumentAttributeList): Self = StObject.set(x, "DocumentAttributes", value.asInstanceOf[js.Any])
    
    inline def setDocumentAttributesUndefined: Self = StObject.set(x, "DocumentAttributes", js.undefined)
    
    inline def setDocumentAttributesVarargs(value: DocumentAttribute*): Self = StObject.set(x, "DocumentAttributes", js.Array(value :_*))
    
    inline def setDocumentExcerpt(value: TextWithHighlights): Self = StObject.set(x, "DocumentExcerpt", value.asInstanceOf[js.Any])
    
    inline def setDocumentExcerptUndefined: Self = StObject.set(x, "DocumentExcerpt", js.undefined)
    
    inline def setDocumentId(value: DocumentId): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "DocumentId", js.undefined)
    
    inline def setDocumentTitle(value: TextWithHighlights): Self = StObject.set(x, "DocumentTitle", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleUndefined: Self = StObject.set(x, "DocumentTitle", js.undefined)
    
    inline def setDocumentURI(value: Url): Self = StObject.set(x, "DocumentURI", value.asInstanceOf[js.Any])
    
    inline def setDocumentURIUndefined: Self = StObject.set(x, "DocumentURI", js.undefined)
    
    inline def setId(value: ResultId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setScoreAttributes(value: ScoreAttributes): Self = StObject.set(x, "ScoreAttributes", value.asInstanceOf[js.Any])
    
    inline def setScoreAttributesUndefined: Self = StObject.set(x, "ScoreAttributes", js.undefined)
    
    inline def setType(value: QueryResultType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
