package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseBlueprintsResult extends StObject {
  
  /**
    * An object describing the result of your get relational database blueprints request.
    */
  var blueprints: js.UndefOr[RelationalDatabaseBlueprintList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseBlueprints request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetRelationalDatabaseBlueprintsResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseBlueprintsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseBlueprintsResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseBlueprintsResultMutableBuilder[Self <: GetRelationalDatabaseBlueprintsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlueprints(value: RelationalDatabaseBlueprintList): Self = StObject.set(x, "blueprints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueprintsUndefined: Self = StObject.set(x, "blueprints", js.undefined)
    
    @scala.inline
    def setBlueprintsVarargs(value: RelationalDatabaseBlueprint*): Self = StObject.set(x, "blueprints", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
