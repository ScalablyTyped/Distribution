package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseBlueprintsResult extends js.Object {
  
  /**
    * An object describing the result of your get relational database blueprints request.
    */
  var blueprints: js.UndefOr[RelationalDatabaseBlueprintList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseBlueprints request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetRelationalDatabaseBlueprintsResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseBlueprintsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseBlueprintsResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseBlueprintsResultOps[Self <: GetRelationalDatabaseBlueprintsResult] (val x: Self) extends AnyVal {
    
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
    def setBlueprintsVarargs(value: RelationalDatabaseBlueprint*): Self = this.set("blueprints", js.Array(value :_*))
    
    @scala.inline
    def setBlueprints(value: RelationalDatabaseBlueprintList): Self = this.set("blueprints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlueprints: Self = this.set("blueprints", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
