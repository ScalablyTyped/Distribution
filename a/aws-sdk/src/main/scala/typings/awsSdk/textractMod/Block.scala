package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  /**
    * The type of text item that's recognized. In operations for text detection, the following types are returned:    PAGE - Contains a list of the LINE Block objects that are detected on a document page.    WORD - A word detected on a document page. A word is one or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of tab-delimited, contiguous words that are detected on a document page.   In text analysis operations, the following types are returned:    PAGE - Contains a list of child Block objects that are detected on a document page.    KEY_VALUE_SET - Stores the KEY and VALUE Block objects for linked text that's detected on a document page. Use the EntityType field to determine if a KEY_VALUE_SET object is a KEY Block object or a VALUE Block object.     WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of tab-delimited, contiguous words that are detected on a document page.    TABLE - A table that's detected on a document page. A table is grid-based information with two or more rows or columns, with a cell span of one row and one column each.     CELL - A cell within a detected table. The cell is the parent of the block that contains the text in the cell.    SELECTION_ELEMENT - A selection element such as an option button (radio button) or a check box that's detected on a document page. Use the value of SelectionStatus to determine the status of the selection element.  
    */
  var BlockType: js.UndefOr[typings.awsSdk.textractMod.BlockType] = js.native
  /**
    * The column in which a table cell appears. The first column position is 1. ColumnIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var ColumnIndex: js.UndefOr[UInteger] = js.native
  /**
    * The number of columns that a table cell spans. Currently this value is always 1, even if the number of columns spanned is greater than 1. ColumnSpan isn't returned by DetectDocumentText and GetDocumentTextDetection. 
    */
  var ColumnSpan: js.UndefOr[UInteger] = js.native
  /**
    * The confidence score that Amazon Textract has in the accuracy of the recognized text and the accuracy of the geometry points around the recognized text.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * The type of entity. The following can be returned:    KEY - An identifier for a field on the document.    VALUE - The field text.    EntityTypes isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var EntityTypes: js.UndefOr[typings.awsSdk.textractMod.EntityTypes] = js.native
  /**
    * The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that surrounds the text, and a finer-grain polygon for more accurate spatial information. 
    */
  var Geometry: js.UndefOr[typings.awsSdk.textractMod.Geometry] = js.native
  /**
    * The identifier for the recognized text. The identifier is only unique for a single operation. 
    */
  var Id: js.UndefOr[NonEmptyString] = js.native
  /**
    * The page on which a block was detected. Page is returned by asynchronous operations. Page values greater than 1 are only returned for multipage documents that are in PDF format. A scanned image (JPEG/PNG), even if it contains multiple document pages, is considered to be a single-page document. The value of Page is always 1. Synchronous operations don't return Page because every input document is considered to be a single-page document.
    */
  var Page: js.UndefOr[UInteger] = js.native
  /**
    * A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD block that's part of the line of text. There aren't Relationship objects in the list for relationships that don't exist, such as when the current block has no child blocks. The list size can be the following:   0 - The block has no child blocks.   1 - The block has child blocks.  
    */
  var Relationships: js.UndefOr[RelationshipList] = js.native
  /**
    * The row in which a table cell is located. The first row position is 1. RowIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var RowIndex: js.UndefOr[UInteger] = js.native
  /**
    * The number of rows that a table cell spans. Currently this value is always 1, even if the number of rows spanned is greater than 1. RowSpan isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var RowSpan: js.UndefOr[UInteger] = js.native
  /**
    * The selection status of a selection element, such as an option button or check box. 
    */
  var SelectionStatus: js.UndefOr[typings.awsSdk.textractMod.SelectionStatus] = js.native
  /**
    * The word or line of text that's recognized by Amazon Textract. 
    */
  var Text: js.UndefOr[String] = js.native
}

object Block {
  @scala.inline
  def apply(): Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
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
    def setBlockType(value: BlockType): Self = this.set("BlockType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockType: Self = this.set("BlockType", js.undefined)
    @scala.inline
    def setColumnIndex(value: UInteger): Self = this.set("ColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("ColumnIndex", js.undefined)
    @scala.inline
    def setColumnSpan(value: UInteger): Self = this.set("ColumnSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSpan: Self = this.set("ColumnSpan", js.undefined)
    @scala.inline
    def setConfidence(value: Percent): Self = this.set("Confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("Confidence", js.undefined)
    @scala.inline
    def setEntityTypesVarargs(value: EntityType*): Self = this.set("EntityTypes", js.Array(value :_*))
    @scala.inline
    def setEntityTypes(value: EntityTypes): Self = this.set("EntityTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityTypes: Self = this.set("EntityTypes", js.undefined)
    @scala.inline
    def setGeometry(value: Geometry): Self = this.set("Geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("Geometry", js.undefined)
    @scala.inline
    def setId(value: NonEmptyString): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setPage(value: UInteger): Self = this.set("Page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("Page", js.undefined)
    @scala.inline
    def setRelationshipsVarargs(value: Relationship*): Self = this.set("Relationships", js.Array(value :_*))
    @scala.inline
    def setRelationships(value: RelationshipList): Self = this.set("Relationships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationships: Self = this.set("Relationships", js.undefined)
    @scala.inline
    def setRowIndex(value: UInteger): Self = this.set("RowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("RowIndex", js.undefined)
    @scala.inline
    def setRowSpan(value: UInteger): Self = this.set("RowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("RowSpan", js.undefined)
    @scala.inline
    def setSelectionStatus(value: SelectionStatus): Self = this.set("SelectionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionStatus: Self = this.set("SelectionStatus", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
  }
  
}

