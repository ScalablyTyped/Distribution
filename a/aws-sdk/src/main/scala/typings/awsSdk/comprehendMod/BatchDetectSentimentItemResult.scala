package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetectSentimentItemResult extends js.Object {
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  
  /**
    * The sentiment detected in the document.
    */
  var Sentiment: js.UndefOr[SentimentType] = js.native
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
    */
  var SentimentScore: js.UndefOr[typings.awsSdk.comprehendMod.SentimentScore] = js.native
}
object BatchDetectSentimentItemResult {
  
  @scala.inline
  def apply(): BatchDetectSentimentItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectSentimentItemResult]
  }
  
  @scala.inline
  implicit class BatchDetectSentimentItemResultOps[Self <: BatchDetectSentimentItemResult] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Integer): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("Index", js.undefined)
    
    @scala.inline
    def setSentiment(value: SentimentType): Self = this.set("Sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentiment: Self = this.set("Sentiment", js.undefined)
    
    @scala.inline
    def setSentimentScore(value: SentimentScore): Self = this.set("SentimentScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentimentScore: Self = this.set("SentimentScore", js.undefined)
  }
}
