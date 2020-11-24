package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectSentimentResponse extends js.Object {
  
  /**
    * The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
    */
  var Sentiment: js.UndefOr[SentimentType] = js.native
  
  /**
    * An object that lists the sentiments, and their corresponding confidence levels.
    */
  var SentimentScore: js.UndefOr[typings.awsSdk.comprehendMod.SentimentScore] = js.native
}
object DetectSentimentResponse {
  
  @scala.inline
  def apply(): DetectSentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectSentimentResponse]
  }
  
  @scala.inline
  implicit class DetectSentimentResponseOps[Self <: DetectSentimentResponse] (val x: Self) extends AnyVal {
    
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
    def setSentiment(value: SentimentType): Self = this.set("Sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentiment: Self = this.set("Sentiment", js.undefined)
    
    @scala.inline
    def setSentimentScore(value: SentimentScore): Self = this.set("SentimentScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentimentScore: Self = this.set("SentimentScore", js.undefined)
  }
}
