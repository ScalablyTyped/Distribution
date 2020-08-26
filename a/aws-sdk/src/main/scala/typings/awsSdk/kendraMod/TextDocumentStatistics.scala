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
  @scala.inline
  implicit class TextDocumentStatisticsOps[Self <: TextDocumentStatistics] (val x: Self) extends AnyVal {
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
    def setIndexedTextBytes(value: IndexedTextBytes): Self = this.set("IndexedTextBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexedTextDocumentsCount(value: IndexedTextDocumentsCount): Self = this.set("IndexedTextDocumentsCount", value.asInstanceOf[js.Any])
  }
  
}

