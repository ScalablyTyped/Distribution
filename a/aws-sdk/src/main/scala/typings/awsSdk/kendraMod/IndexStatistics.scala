package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexStatistics extends js.Object {
  
  /**
    * The number of question and answer topics in the index.
    */
  var FaqStatistics: typings.awsSdk.kendraMod.FaqStatistics = js.native
  
  /**
    * The number of text documents indexed.
    */
  var TextDocumentStatistics: typings.awsSdk.kendraMod.TextDocumentStatistics = js.native
}
object IndexStatistics {
  
  @scala.inline
  def apply(FaqStatistics: FaqStatistics, TextDocumentStatistics: TextDocumentStatistics): IndexStatistics = {
    val __obj = js.Dynamic.literal(FaqStatistics = FaqStatistics.asInstanceOf[js.Any], TextDocumentStatistics = TextDocumentStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexStatistics]
  }
  
  @scala.inline
  implicit class IndexStatisticsOps[Self <: IndexStatistics] (val x: Self) extends AnyVal {
    
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
    def setFaqStatistics(value: FaqStatistics): Self = this.set("FaqStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDocumentStatistics(value: TextDocumentStatistics): Self = this.set("TextDocumentStatistics", value.asInstanceOf[js.Any])
  }
}
