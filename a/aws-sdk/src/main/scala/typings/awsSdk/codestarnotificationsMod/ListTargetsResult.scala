package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTargetsResult extends StObject {
  
  /**
    * An enumeration token that can be used in a request to return the next batch of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.NextToken] = js.native
  
  /**
    * The list of notification rule targets. 
    */
  var Targets: js.UndefOr[TargetsBatch] = js.native
}
object ListTargetsResult {
  
  @scala.inline
  def apply(): ListTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsResult]
  }
  
  @scala.inline
  implicit class ListTargetsResultMutableBuilder[Self <: ListTargetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTargets(value: TargetsBatch): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: TargetSummary*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
