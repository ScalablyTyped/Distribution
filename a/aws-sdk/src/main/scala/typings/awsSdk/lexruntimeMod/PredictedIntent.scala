package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredictedIntent extends js.Object {
  
  /**
    * The name of the intent that Amazon Lex suggests satisfies the user's intent.
    */
  var intentName: js.UndefOr[IntentName] = js.native
  
  /**
    * Indicates how confident Amazon Lex is that an intent satisfies the user's intent.
    */
  var nluIntentConfidence: js.UndefOr[IntentConfidence] = js.native
  
  /**
    * The slot and slot values associated with the predicted intent.
    */
  var slots: js.UndefOr[StringMap] = js.native
}
object PredictedIntent {
  
  @scala.inline
  def apply(): PredictedIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictedIntent]
  }
  
  @scala.inline
  implicit class PredictedIntentOps[Self <: PredictedIntent] (val x: Self) extends AnyVal {
    
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
    def setIntentName(value: IntentName): Self = this.set("intentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntentName: Self = this.set("intentName", js.undefined)
    
    @scala.inline
    def setNluIntentConfidence(value: IntentConfidence): Self = this.set("nluIntentConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNluIntentConfidence: Self = this.set("nluIntentConfidence", js.undefined)
    
    @scala.inline
    def setSlots(value: StringMap): Self = this.set("slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlots: Self = this.set("slots", js.undefined)
  }
}
