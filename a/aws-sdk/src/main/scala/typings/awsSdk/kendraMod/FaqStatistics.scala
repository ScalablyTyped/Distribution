package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaqStatistics extends js.Object {
  /**
    * The total number of FAQ questions and answers contained in the index.
    */
  var IndexedQuestionAnswersCount: typings.awsSdk.kendraMod.IndexedQuestionAnswersCount = js.native
}

object FaqStatistics {
  @scala.inline
  def apply(IndexedQuestionAnswersCount: IndexedQuestionAnswersCount): FaqStatistics = {
    val __obj = js.Dynamic.literal(IndexedQuestionAnswersCount = IndexedQuestionAnswersCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FaqStatistics]
  }
}

