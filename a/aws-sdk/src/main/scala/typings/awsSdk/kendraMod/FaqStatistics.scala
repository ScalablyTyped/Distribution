package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaqStatistics extends StObject {
  
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
  
  @scala.inline
  implicit class FaqStatisticsMutableBuilder[Self <: FaqStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexedQuestionAnswersCount(value: IndexedQuestionAnswersCount): Self = StObject.set(x, "IndexedQuestionAnswersCount", value.asInstanceOf[js.Any])
  }
}
