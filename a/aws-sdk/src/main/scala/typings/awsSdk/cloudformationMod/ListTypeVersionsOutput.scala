package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTypeVersionsOutput extends StObject {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * A list of TypeVersionSummary structures that contain information about the specified type's versions.
    */
  var TypeVersionSummaries: js.UndefOr[typings.awsSdk.cloudformationMod.TypeVersionSummaries] = js.native
}
object ListTypeVersionsOutput {
  
  @scala.inline
  def apply(): ListTypeVersionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypeVersionsOutput]
  }
  
  @scala.inline
  implicit class ListTypeVersionsOutputMutableBuilder[Self <: ListTypeVersionsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTypeVersionSummaries(value: TypeVersionSummaries): Self = StObject.set(x, "TypeVersionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVersionSummariesUndefined: Self = StObject.set(x, "TypeVersionSummaries", js.undefined)
    
    @scala.inline
    def setTypeVersionSummariesVarargs(value: TypeVersionSummary*): Self = StObject.set(x, "TypeVersionSummaries", js.Array(value :_*))
  }
}
