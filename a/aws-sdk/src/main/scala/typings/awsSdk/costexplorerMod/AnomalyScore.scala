package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnomalyScore extends js.Object {
  
  /**
    *  The last observed score. 
    */
  var CurrentScore: GenericDouble = js.native
  
  /**
    *  The maximum score observed during the AnomalyDateInterval. 
    */
  var MaxScore: GenericDouble = js.native
}
object AnomalyScore {
  
  @scala.inline
  def apply(CurrentScore: GenericDouble, MaxScore: GenericDouble): AnomalyScore = {
    val __obj = js.Dynamic.literal(CurrentScore = CurrentScore.asInstanceOf[js.Any], MaxScore = MaxScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyScore]
  }
  
  @scala.inline
  implicit class AnomalyScoreOps[Self <: AnomalyScore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentScore(value: GenericDouble): Self = this.set("CurrentScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScore(value: GenericDouble): Self = this.set("MaxScore", value.asInstanceOf[js.Any])
  }
}
