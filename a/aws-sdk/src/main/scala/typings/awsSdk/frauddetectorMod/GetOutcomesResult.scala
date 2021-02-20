package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOutcomesResult extends StObject {
  
  /**
    * The next page token for subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The outcomes. 
    */
  var outcomes: js.UndefOr[OutcomeList] = js.native
}
object GetOutcomesResult {
  
  @scala.inline
  def apply(): GetOutcomesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutcomesResult]
  }
  
  @scala.inline
  implicit class GetOutcomesResultMutableBuilder[Self <: GetOutcomesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setOutcomes(value: OutcomeList): Self = StObject.set(x, "outcomes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomesUndefined: Self = StObject.set(x, "outcomes", js.undefined)
    
    @scala.inline
    def setOutcomesVarargs(value: Outcome*): Self = StObject.set(x, "outcomes", js.Array(value :_*))
  }
}
