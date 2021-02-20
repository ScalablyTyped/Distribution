package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScoreAttributes extends StObject {
  
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
  implicit class ScoreAttributesMutableBuilder[Self <: ScoreAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScoreConfidence(value: ScoreConfidence): Self = StObject.set(x, "ScoreConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreConfidenceUndefined: Self = StObject.set(x, "ScoreConfidence", js.undefined)
  }
}
