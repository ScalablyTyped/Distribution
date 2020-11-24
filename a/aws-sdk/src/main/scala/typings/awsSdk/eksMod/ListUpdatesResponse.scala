package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUpdatesResponse extends js.Object {
  
  /**
    * The nextToken value to include in a future ListUpdates request. When the results of a ListUpdates request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of all the updates for the specified cluster and Region.
    */
  var updateIds: js.UndefOr[StringList] = js.native
}
object ListUpdatesResponse {
  
  @scala.inline
  def apply(): ListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUpdatesResponse]
  }
  
  @scala.inline
  implicit class ListUpdatesResponseOps[Self <: ListUpdatesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setUpdateIdsVarargs(value: String*): Self = this.set("updateIds", js.Array(value :_*))
    
    @scala.inline
    def setUpdateIds(value: StringList): Self = this.set("updateIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateIds: Self = this.set("updateIds", js.undefined)
  }
}
