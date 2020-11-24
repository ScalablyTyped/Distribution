package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTaskDefinitionFamiliesResponse extends js.Object {
  
  /**
    * The list of task definition family names that match the ListTaskDefinitionFamilies request.
    */
  var families: js.UndefOr[StringList] = js.native
  
  /**
    * The nextToken value to include in a future ListTaskDefinitionFamilies request. When the results of a ListTaskDefinitionFamilies request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListTaskDefinitionFamiliesResponse {
  
  @scala.inline
  def apply(): ListTaskDefinitionFamiliesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskDefinitionFamiliesResponse]
  }
  
  @scala.inline
  implicit class ListTaskDefinitionFamiliesResponseOps[Self <: ListTaskDefinitionFamiliesResponse] (val x: Self) extends AnyVal {
    
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
    def setFamiliesVarargs(value: String*): Self = this.set("families", js.Array(value :_*))
    
    @scala.inline
    def setFamilies(value: StringList): Self = this.set("families", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamilies: Self = this.set("families", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
