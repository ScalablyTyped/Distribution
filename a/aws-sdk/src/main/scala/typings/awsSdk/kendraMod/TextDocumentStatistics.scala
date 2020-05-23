package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentStatistics extends js.Object {
  /**
    * The total size, in bytes, of the indexed documents.
    */
  var IndexedTextBytes: typings.awsSdk.kendraMod.IndexedTextBytes = js.native
  /**
    * The number of text documents indexed.
    */
  var IndexedTextDocumentsCount: typings.awsSdk.kendraMod.IndexedTextDocumentsCount = js.native
}

object TextDocumentStatistics {
  @scala.inline
  def apply(IndexedTextBytes: IndexedTextBytes, IndexedTextDocumentsCount: IndexedTextDocumentsCount): TextDocumentStatistics = {
    val __obj = js.Dynamic.literal(IndexedTextBytes = IndexedTextBytes.asInstanceOf[js.Any], IndexedTextDocumentsCount = IndexedTextDocumentsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentStatistics]
  }
}

