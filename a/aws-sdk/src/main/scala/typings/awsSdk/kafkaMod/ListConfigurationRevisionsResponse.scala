package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationRevisionsResponse extends js.Object {
  /**
    * 
    Paginated results marker.
    
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * 
    List of ConfigurationRevision objects.
    
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

