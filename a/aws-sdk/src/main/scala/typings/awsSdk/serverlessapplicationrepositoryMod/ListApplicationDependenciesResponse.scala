package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationDependenciesResponse extends StObject {
  
  /**
    * An array of application summaries nested in the application.
    */
  var Dependencies: js.UndefOr[listOfApplicationDependencySummary] = js.native
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListApplicationDependenciesResponse {
  
  @scala.inline
  def apply(): ListApplicationDependenciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationDependenciesResponse]
  }
  
  @scala.inline
  implicit class ListApplicationDependenciesResponseMutableBuilder[Self <: ListApplicationDependenciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependencies(value: listOfApplicationDependencySummary): Self = StObject.set(x, "Dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "Dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: ApplicationDependencySummary*): Self = StObject.set(x, "Dependencies", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
