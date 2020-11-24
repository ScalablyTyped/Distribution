package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScoreAttributes extends js.Object {
  
  /**
    * A relative ranking for how well the response matches the query.
    */
  var ScoreConfidence: js.UndefOr[typings.awsSdk.kendraMod.ScoreConfidence] = js.native
}
object ScoreAttributes {
  
  @scala.inline
  def apply(): ScoreAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoreAttributes]
  }
  
  @scala.inline
  implicit class ScoreAttributesOps[Self <: ScoreAttributes] (val x: Self) extends AnyVal {
    
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
    def setScoreConfidence(value: ScoreConfidence): Self = this.set("ScoreConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoreConfidence: Self = this.set("ScoreConfidence", js.undefined)
  }
}
