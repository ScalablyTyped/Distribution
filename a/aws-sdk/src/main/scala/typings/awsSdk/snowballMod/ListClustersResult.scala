package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListClustersResult extends js.Object {
  
  /**
    * Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
    */
  var ClusterListEntries: js.UndefOr[ClusterListEntryList] = js.native
  
  /**
    * HTTP requests are stateless. If you use the automatically generated NextToken value in your next ClusterListEntry call, your list of returned clusters will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListClustersResult {
  
  @scala.inline
  def apply(): ListClustersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResult]
  }
  
  @scala.inline
  implicit class ListClustersResultOps[Self <: ListClustersResult] (val x: Self) extends AnyVal {
    
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
    def setClusterListEntriesVarargs(value: ClusterListEntry*): Self = this.set("ClusterListEntries", js.Array(value :_*))
    
    @scala.inline
    def setClusterListEntries(value: ClusterListEntryList): Self = this.set("ClusterListEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterListEntries: Self = this.set("ClusterListEntries", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
