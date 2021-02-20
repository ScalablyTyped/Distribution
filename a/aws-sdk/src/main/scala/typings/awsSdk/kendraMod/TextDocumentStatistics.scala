package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentStatistics extends StObject {
  
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
  implicit class TextDocumentStatisticsMutableBuilder[Self <: TextDocumentStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexedTextBytes(value: IndexedTextBytes): Self = StObject.set(x, "IndexedTextBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedTextDocumentsCount(value: IndexedTextDocumentsCount): Self = StObject.set(x, "IndexedTextDocumentsCount", value.asInstanceOf[js.Any])
  }
}
