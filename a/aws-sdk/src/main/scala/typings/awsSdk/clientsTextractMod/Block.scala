package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  /**
    * The type of text item that's recognized. In operations for text detection, the following types are returned:    PAGE - Contains a list of the LINE Block objects that are detected on a document page.    WORD - A word detected on a document page. A word is one or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of tab-delimited, contiguous words that are detected on a document page.   In text analysis operations, the following types are returned:    PAGE - Contains a list of child Block objects that are detected on a document page.    KEY_VALUE_SET - Stores the KEY and VALUE Block objects for linked text that's detected on a document page. Use the EntityType field to determine if a KEY_VALUE_SET object is a KEY Block object or a VALUE Block object.     WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of tab-delimited, contiguous words that are detected on a document page.    TABLE - A table that's detected on a document page. A table is grid-based information with two or more rows or columns, with a cell span of one row and one column each.     TABLE_TITLE - The title of a table. A title is typically a line of text above or below a table, or embedded as the first row of a table.     TABLE_FOOTER - The footer associated with a table. A footer is typically a line or lines of text below a table or embedded as the last row of a table.     CELL - A cell within a detected table. The cell is the parent of the block that contains the text in the cell.    MERGED_CELL - A cell in a table whose content spans more than one row or column. The Relationships array for this cell contain data from individual cells.    SELECTION_ELEMENT - A selection element such as an option button (radio button) or a check box that's detected on a document page. Use the value of SelectionStatus to determine the status of the selection element.    SIGNATURE - The location and confidene score of a signature detected on a document page. Can be returned as part of a Key-Value pair or a detected cell.    QUERY - A question asked during the call of AnalyzeDocument. Contains an alias and an ID that attaches it to its answer.    QUERY_RESULT - A response to a question asked during the call of analyze document. Comes with an alias and ID for ease of locating in a response. Also contains location and confidence score.  
    */
  var BlockType: js.UndefOr[typings.awsSdk.clientsTextractMod.BlockType] = js.undefined
  
  /**
    * The column in which a table cell appears. The first column position is 1. ColumnIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var ColumnIndex: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The number of columns that a table cell spans. ColumnSpan isn't returned by DetectDocumentText and GetDocumentTextDetection. 
    */
  var ColumnSpan: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The confidence score that Amazon Textract has in the accuracy of the recognized text and the accuracy of the geometry points around the recognized text.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The type of entity.  The following entity types can be returned by FORMS analysis:    KEY - An identifier for a field on the document.    VALUE - The field text.   The following entity types can be returned by TABLES analysis:    COLUMN_HEADER - Identifies a cell that is a header of a column.     TABLE_TITLE - Identifies a cell that is a title within the table.     TABLE_SECTION_TITLE - Identifies a cell that is a title of a section within a table. A section title is a cell that typically spans an entire row above a section.     TABLE_FOOTER - Identifies a cell that is a footer of a table.     TABLE_SUMMARY - Identifies a summary cell of a table. A summary cell can be a row of a table or an additional, smaller table that contains summary information for another table.     STRUCTURED_TABLE  - Identifies a table with column headers where the content of each row corresponds to the headers.     SEMI_STRUCTURED_TABLE - Identifies a non-structured table.     EntityTypes isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var EntityTypes: js.UndefOr[typings.awsSdk.clientsTextractMod.EntityTypes] = js.undefined
  
  /**
    * The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that surrounds the text, and a finer-grain polygon for more accurate spatial information. 
    */
  var Geometry: js.UndefOr[typings.awsSdk.clientsTextractMod.Geometry] = js.undefined
  
  /**
    * The identifier for the recognized text. The identifier is only unique for a single operation. 
    */
  var Id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The page on which a block was detected. Page is returned by synchronous and asynchronous operations. Page values greater than 1 are only returned for multipage documents that are in PDF or TIFF format. A scanned image (JPEG/PNG) provided to an asynchronous operation, even if it contains multiple document pages, is considered a single-page document. This means that for scanned images the value of Page is always 1. Synchronous operations will also return a Page value of 1 because every input document is considered to be a single-page document.
    */
  var Page: js.UndefOr[UInteger] = js.undefined
  
  /**
    * 
    */
  var Query: js.UndefOr[typings.awsSdk.clientsTextractMod.Query] = js.undefined
  
  /**
    * A list of relationship objects that describe how blocks are related to each other. For example, a LINE block object contains a CHILD relationship type with the WORD blocks that make up the line of text. There aren't Relationship objects in the list for relationships that don't exist, such as when the current block has no child blocks.
    */
  var Relationships: js.UndefOr[RelationshipList] = js.undefined
  
  /**
    * The row in which a table cell is located. The first row position is 1. RowIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var RowIndex: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The number of rows that a table cell spans. RowSpan isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var RowSpan: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The selection status of a selection element, such as an option button or check box. 
    */
  var SelectionStatus: js.UndefOr[typings.awsSdk.clientsTextractMod.SelectionStatus] = js.undefined
  
  /**
    * The word or line of text that's recognized by Amazon Textract. 
    */
  var Text: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of text that Amazon Textract has detected. Can check for handwritten text and printed text.
    */
  var TextType: js.UndefOr[typings.awsSdk.clientsTextractMod.TextType] = js.undefined
}
object Block {
  
  inline def apply(): Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    inline def setBlockType(value: BlockType): Self = StObject.set(x, "BlockType", value.asInstanceOf[js.Any])
    
    inline def setBlockTypeUndefined: Self = StObject.set(x, "BlockType", js.undefined)
    
    inline def setColumnIndex(value: UInteger): Self = StObject.set(x, "ColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "ColumnIndex", js.undefined)
    
    inline def setColumnSpan(value: UInteger): Self = StObject.set(x, "ColumnSpan", value.asInstanceOf[js.Any])
    
    inline def setColumnSpanUndefined: Self = StObject.set(x, "ColumnSpan", js.undefined)
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setEntityTypes(value: EntityTypes): Self = StObject.set(x, "EntityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "EntityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: EntityType*): Self = StObject.set(x, "EntityTypes", js.Array(value*))
    
    inline def setGeometry(value: Geometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "Geometry", js.undefined)
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setPage(value: UInteger): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
    
    inline def setQuery(value: Query): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "Query", js.undefined)
    
    inline def setRelationships(value: RelationshipList): Self = StObject.set(x, "Relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "Relationships", js.undefined)
    
    inline def setRelationshipsVarargs(value: Relationship*): Self = StObject.set(x, "Relationships", js.Array(value*))
    
    inline def setRowIndex(value: UInteger): Self = StObject.set(x, "RowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "RowIndex", js.undefined)
    
    inline def setRowSpan(value: UInteger): Self = StObject.set(x, "RowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "RowSpan", js.undefined)
    
    inline def setSelectionStatus(value: SelectionStatus): Self = StObject.set(x, "SelectionStatus", value.asInstanceOf[js.Any])
    
    inline def setSelectionStatusUndefined: Self = StObject.set(x, "SelectionStatus", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextType(value: TextType): Self = StObject.set(x, "TextType", value.asInstanceOf[js.Any])
    
    inline def setTextTypeUndefined: Self = StObject.set(x, "TextType", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
