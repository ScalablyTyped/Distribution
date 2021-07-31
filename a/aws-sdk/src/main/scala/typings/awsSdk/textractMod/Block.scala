package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  /**
    * The type of text item that's recognized. In operations for text detection, the following types are returned:    PAGE - Contains a list of the LINE Block objects that are detected on a document page.    WORD - A word detected on a document page. A word is one or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of tab-delimited, contiguous words that are detected on a document page.   In text analysis operations, the following types are returned:    PAGE - Contains a list of child Block objects that are detected on a document page.    KEY_VALUE_SET - Stores the KEY and VALUE Block objects for linked text that's detected on a document page. Use the EntityType field to determine if a KEY_VALUE_SET object is a KEY Block object or a VALUE Block object.     WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of tab-delimited, contiguous words that are detected on a document page.    TABLE - A table that's detected on a document page. A table is grid-based information with two or more rows or columns, with a cell span of one row and one column each.     CELL - A cell within a detected table. The cell is the parent of the block that contains the text in the cell.    SELECTION_ELEMENT - A selection element such as an option button (radio button) or a check box that's detected on a document page. Use the value of SelectionStatus to determine the status of the selection element.  
    */
  var BlockType: js.UndefOr[typings.awsSdk.textractMod.BlockType] = js.undefined
  
  /**
    * The column in which a table cell appears. The first column position is 1. ColumnIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var ColumnIndex: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The number of columns that a table cell spans. Currently this value is always 1, even if the number of columns spanned is greater than 1. ColumnSpan isn't returned by DetectDocumentText and GetDocumentTextDetection. 
    */
  var ColumnSpan: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The confidence score that Amazon Textract has in the accuracy of the recognized text and the accuracy of the geometry points around the recognized text.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The type of entity. The following can be returned:    KEY - An identifier for a field on the document.    VALUE - The field text.    EntityTypes isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var EntityTypes: js.UndefOr[typings.awsSdk.textractMod.EntityTypes] = js.undefined
  
  /**
    * The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that surrounds the text, and a finer-grain polygon for more accurate spatial information. 
    */
  var Geometry: js.UndefOr[typings.awsSdk.textractMod.Geometry] = js.undefined
  
  /**
    * The identifier for the recognized text. The identifier is only unique for a single operation. 
    */
  var Id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The page on which a block was detected. Page is returned by asynchronous operations. Page values greater than 1 are only returned for multipage documents that are in PDF format. A scanned image (JPEG/PNG), even if it contains multiple document pages, is considered to be a single-page document. The value of Page is always 1. Synchronous operations don't return Page because every input document is considered to be a single-page document.
    */
  var Page: js.UndefOr[UInteger] = js.undefined
  
  /**
    * A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD block that's part of the line of text. There aren't Relationship objects in the list for relationships that don't exist, such as when the current block has no child blocks. The list size can be the following:   0 - The block has no child blocks.   1 - The block has child blocks.  
    */
  var Relationships: js.UndefOr[RelationshipList] = js.undefined
  
  /**
    * The row in which a table cell is located. The first row position is 1. RowIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var RowIndex: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The number of rows that a table cell spans. Currently this value is always 1, even if the number of rows spanned is greater than 1. RowSpan isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var RowSpan: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The selection status of a selection element, such as an option button or check box. 
    */
  var SelectionStatus: js.UndefOr[typings.awsSdk.textractMod.SelectionStatus] = js.undefined
  
  /**
    * The word or line of text that's recognized by Amazon Textract. 
    */
  var Text: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of text that Amazon Textract has detected. Can check for handwritten text and printed text.
    */
  var TextType: js.UndefOr[typings.awsSdk.textractMod.TextType] = js.undefined
}
object Block {
  
  @scala.inline
  def apply(): Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockType(value: BlockType): Self = StObject.set(x, "BlockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockTypeUndefined: Self = StObject.set(x, "BlockType", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: UInteger): Self = StObject.set(x, "ColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "ColumnIndex", js.undefined)
    
    @scala.inline
    def setColumnSpan(value: UInteger): Self = StObject.set(x, "ColumnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSpanUndefined: Self = StObject.set(x, "ColumnSpan", js.undefined)
    
    @scala.inline
    def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setEntityTypes(value: EntityTypes): Self = StObject.set(x, "EntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "EntityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: EntityType*): Self = StObject.set(x, "EntityTypes", js.Array(value :_*))
    
    @scala.inline
    def setGeometry(value: Geometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "Geometry", js.undefined)
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setPage(value: UInteger): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
    
    @scala.inline
    def setRelationships(value: RelationshipList): Self = StObject.set(x, "Relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "Relationships", js.undefined)
    
    @scala.inline
    def setRelationshipsVarargs(value: Relationship*): Self = StObject.set(x, "Relationships", js.Array(value :_*))
    
    @scala.inline
    def setRowIndex(value: UInteger): Self = StObject.set(x, "RowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "RowIndex", js.undefined)
    
    @scala.inline
    def setRowSpan(value: UInteger): Self = StObject.set(x, "RowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "RowSpan", js.undefined)
    
    @scala.inline
    def setSelectionStatus(value: SelectionStatus): Self = StObject.set(x, "SelectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStatusUndefined: Self = StObject.set(x, "SelectionStatus", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextType(value: TextType): Self = StObject.set(x, "TextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTypeUndefined: Self = StObject.set(x, "TextType", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
