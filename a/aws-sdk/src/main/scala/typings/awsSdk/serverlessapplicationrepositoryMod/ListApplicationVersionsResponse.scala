package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationVersionsResponse extends StObject {
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * An array of version summaries for the application.
    */
  var Versions: js.UndefOr[listOfVersionSummary] = js.undefined
}
object ListApplicationVersionsResponse {
  
  @scala.inline
  def apply(): ListApplicationVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationVersionsResponse]
  }
  
  @scala.inline
  implicit class ListApplicationVersionsResponseMutableBuilder[Self <: ListApplicationVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVersions(value: listOfVersionSummary): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: VersionSummary*): Self = StObject.set(x, "Versions", js.Array(value :_*))
  }
}
