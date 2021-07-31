package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseParametersResult extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseParameters request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * An object describing the result of your get relational database parameters request.
    */
  var parameters: js.UndefOr[RelationalDatabaseParameterList] = js.undefined
}
object GetRelationalDatabaseParametersResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseParametersResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseParametersResultMutableBuilder[Self <: GetRelationalDatabaseParametersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setParameters(value: RelationalDatabaseParameterList): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: RelationalDatabaseParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
  }
}
