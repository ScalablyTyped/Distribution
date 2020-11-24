package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConfigurationRevisionsResponse extends js.Object {
  
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: js.UndefOr[string] = js.native
  
  /**
    * The maximum number of configuration revisions that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[integer] = js.native
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * The list of all revisions for the specified configuration.
    */
  var Revisions: js.UndefOr[listOfConfigurationRevision] = js.native
}
object ListConfigurationRevisionsResponse {
  
  @scala.inline
  def apply(): ListConfigurationRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationRevisionsResponse]
  }
  
  @scala.inline
  implicit class ListConfigurationRevisionsResponseOps[Self <: ListConfigurationRevisionsResponse] (val x: Self) extends AnyVal {
    
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
    def setConfigurationId(value: string): Self = this.set("ConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationId: Self = this.set("ConfigurationId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRevisionsVarargs(value: ConfigurationRevision*): Self = this.set("Revisions", js.Array(value :_*))
    
    @scala.inline
    def setRevisions(value: listOfConfigurationRevision): Self = this.set("Revisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisions: Self = this.set("Revisions", js.undefined)
  }
}
