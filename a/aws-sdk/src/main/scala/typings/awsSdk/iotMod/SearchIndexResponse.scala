package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchIndexResponse extends js.Object {
  
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The thing groups that match the search query.
    */
  var thingGroups: js.UndefOr[ThingGroupDocumentList] = js.native
  
  /**
    * The things that match the search query.
    */
  var things: js.UndefOr[ThingDocumentList] = js.native
}
object SearchIndexResponse {
  
  @scala.inline
  def apply(): SearchIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchIndexResponse]
  }
  
  @scala.inline
  implicit class SearchIndexResponseOps[Self <: SearchIndexResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setThingGroupsVarargs(value: ThingGroupDocument*): Self = this.set("thingGroups", js.Array(value :_*))
    
    @scala.inline
    def setThingGroups(value: ThingGroupDocumentList): Self = this.set("thingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingGroups: Self = this.set("thingGroups", js.undefined)
    
    @scala.inline
    def setThingsVarargs(value: ThingDocument*): Self = this.set("things", js.Array(value :_*))
    
    @scala.inline
    def setThings(value: ThingDocumentList): Self = this.set("things", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThings: Self = this.set("things", js.undefined)
  }
}
