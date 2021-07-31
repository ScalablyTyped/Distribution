package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersResult extends StObject {
  
  /**
    * Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
    */
  var ClusterListEntries: js.UndefOr[ClusterListEntryList] = js.undefined
  
  /**
    * HTTP requests are stateless. If you use the automatically generated NextToken value in your next ClusterListEntry call, your list of returned clusters will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListClustersResult {
  
  @scala.inline
  def apply(): ListClustersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResult]
  }
  
  @scala.inline
  implicit class ListClustersResultMutableBuilder[Self <: ListClustersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterListEntries(value: ClusterListEntryList): Self = StObject.set(x, "ClusterListEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterListEntriesUndefined: Self = StObject.set(x, "ClusterListEntries", js.undefined)
    
    @scala.inline
    def setClusterListEntriesVarargs(value: ClusterListEntry*): Self = StObject.set(x, "ClusterListEntries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
