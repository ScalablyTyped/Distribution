package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

