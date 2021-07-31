package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDiscoveredResourcesResult extends StObject {
  
  /**
    * Returned list of discovered resources associated with the given MigrationTask.
    */
  var DiscoveredResourceList: js.UndefOr[typings.awsSdk.migrationhubMod.DiscoveredResourceList] = js.undefined
  
  /**
    * If there are more discovered resources than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListDiscoveredResourcesResult {
  
  @scala.inline
  def apply(): ListDiscoveredResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoveredResourcesResult]
  }
  
  @scala.inline
  implicit class ListDiscoveredResourcesResultMutableBuilder[Self <: ListDiscoveredResourcesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscoveredResourceList(value: DiscoveredResourceList): Self = StObject.set(x, "DiscoveredResourceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoveredResourceListUndefined: Self = StObject.set(x, "DiscoveredResourceList", js.undefined)
    
    @scala.inline
    def setDiscoveredResourceListVarargs(value: DiscoveredResource*): Self = StObject.set(x, "DiscoveredResourceList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
